/*
 * @author 
 * Licença: GPL v3 - http://www.gnu.org/licenses/gpl-3.0.html
 * Data: 07/01/2016 
 * Autores:
 *  Adalto dos Reis Junior https://github.com/adrj
 *  Luciano Biancardi Fiorino 
 */

package br.edu.ifes.li.cti.main;

import java.io.IOException;
import java.util.Scanner;

public class FixMSLicensingKey {
    
    public String cmdLine;
    public String resultado;
   
    public boolean passo0(String computer){
        cmdLine = "copy "+ System.getenv("TEMP")+"\\rdp.exe \\\\"+ computer +"\\c$\\windows\\temp\\rdp.exe /y";//copia rdp.exe para o cliente
        resultado = executaComandos("cmd /C "+ cmdLine); 
        return true;
    }
    
    public boolean passo1(String computer){
        resultado = "";
       
        cmdLine= System.getenv("TEMP")+"\\psexec.exe \\\\"+ computer +" cmd /C reg delete HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\MSLicensing /f";//excluir a chave de registro
        resultado = executaComandos("cmd /C " + cmdLine);
        return true;
    }
    public boolean passo2(String computer, String userAdm, String passAdm, String serverTs, String userTs, String passTS){
        
        cmdLine= System.getenv("TEMP")+"\\psexec.exe \\\\"+ computer +" -u "+ userAdm +" -p "+ passAdm +
                " C:\\windows\\temp\\rdp.exe /v:"+ serverTs +" /u:"+ userTs +" /p:"+ passTS +" /disconnect:10";//executar a conexão remota
        resultado = executaComandos("cmd /C "+ cmdLine);
        return true;
    }
    
    public boolean passo3(String computer){
        
        cmdLine=System.getenv("TEMP")+"\\psexec.exe -D \\\\"+ computer +" cmd /C del c:\\windows\\temp\\rdp.exe /f ";//excluir o arquivo copiado
        resultado = executaComandos("cmd /C "+ cmdLine);
        return true;
    }
    
    public boolean passo4(String computer){
        cmdLine = System.getenv("TEMP")+"\\psexec.exe -i \\\\"+ computer +" cmd /C taskkill /F /IM mstsc.exe";//excluir a chave de registro
        resultado = executaComandos("cmd /C "+ cmdLine);
        return true;
    }
    
     /***********************************************/
    public String executaComandos(String cmd){
        String result= new String();
        try {
                Process process = Runtime.getRuntime().exec(cmd);
                Scanner leitor = new Scanner(process.getInputStream());
                while (leitor.hasNextLine()) {
                    result=leitor.nextLine();
                }
        } catch (IOException e) {
                e.printStackTrace();
        }
        return result;
    }
    
}
