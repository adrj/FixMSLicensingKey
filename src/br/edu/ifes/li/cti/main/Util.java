/*
 * @author 
 * Licença: GPL v3 - http://www.gnu.org/licenses/gpl-3.0.html
 * Data: 07/01/2016 
 * Autores:
 *  Adalto dos Reis Junior https://github.com/adrj
 *  Luciano Biancardi Fiorino 
 */

package br.edu.ifes.li.cti.main;

import com.sun.jna.platform.win32.Advapi32;
import com.sun.jna.platform.win32.WinBase;
import com.sun.jna.platform.win32.WinNT;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

public class Util {
    
    
    public boolean credencialUserTS(String server, String user, String pass){
        LdapContext ctx = null;  
        try{  
            Hashtable env = new Hashtable();  
            env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");  
            env.put(Context.SECURITY_AUTHENTICATION, "Simple");  
            //it can be <domain\\userid> something that you use for windows login  
            //it can also be  
            env.put(Context.SECURITY_PRINCIPAL, user);  
            env.put(Context.SECURITY_CREDENTIALS, pass);
            //in following property we specify ldap protocol and connection url.              
            //generally the port is 389  
            env.put(Context.PROVIDER_URL,"ldap://"+ server +":389");  
            ctx = new InitialLdapContext(env, null);  
            System.out.println("Connection Successful."); 
            return true;
        }catch(NamingException nex){  
            System.out.println("LDAP Connection: FAILED"); 
            return false;
        }  
    }
    
    public boolean credencialLocal(String user, String pass, String computer){
        
        WinNT.HANDLEByReference phUser = new WinNT.HANDLEByReference(); 
        
        if(!Advapi32.INSTANCE.LogonUser(user, computer, pass, 
                WinBase.LOGON32_LOGON_NETWORK, WinBase.LOGON32_PROVIDER_DEFAULT, phUser)){
            return false;  
        }
        return true;
    }
    
    public Boolean validaTxt(String text, char ch){
       int t = 0;
       boolean isRight = false;
       while(t < text.length()){
            if(ch == text.charAt(t) ){
                isRight = true;
                break;
            }
            t++;
        }
        return isRight;
    }
    
    public int posChar(String text, char ch){
       int t = 0;
       
       while(t < text.length()){
            if(ch == text.charAt(t) ){
                break;
            }
            t++;
        }
        return t;
    }
    
    public  Boolean validHost(String host){
        try { 
            InetAddress address = InetAddress.getByName(host);
        } catch (UnknownHostException ex) {
            return false;
        }
        return true;
    }
    
    
}
