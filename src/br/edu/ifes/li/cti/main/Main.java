/*
 * @author 
 * Licença: GPL v3 - http://www.gnu.org/licenses/gpl-3.0.html
 * Data: 07/01/2016 
 * Autores:
 *  Adalto dos Reis Junior https://github.com/adrj
 *  Luciano Biancardi Fiorino 
 */

package br.edu.ifes.li.cti.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.UIManager;

public class Main extends javax.swing.JDialog {

    /**
     * Creates new form Main
     */
    public Main(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try{  
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  
            }catch(Exception e) {  
                e.printStackTrace();  
            }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSobre = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        btnFecharSobre = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtComputer = new javax.swing.JTextField();
        txtUserAdm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        txtPassAdm = new javax.swing.JPasswordField();
        txtUserTs = new javax.swing.JTextField();
        txtPassTs = new javax.swing.JPasswordField();
        btnExecutar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtServerTS = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menFile = new javax.swing.JMenu();
        menSair = new javax.swing.JMenuItem();
        menHelp = new javax.swing.JMenu();
        menAbout = new javax.swing.JMenuItem();

        jSobre.setTitle("Sobre - Fix MS Licensing Key");
        jSobre.setAlwaysOnTop(true);
        jSobre.setMinimumSize(new java.awt.Dimension(314, 242));
        jSobre.setUndecorated(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Fix MSLicensingKey");

        btnFecharSobre.setText("Fechar");
        btnFecharSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharSobreActionPerformed(evt);
            }
        });

        jLabel9.setText("Desenvolvido por: ");

        jLabel10.setText("Versão: 1.5");

        jLabel11.setText("Coord. de Tecnologia da Informação Ifes - campus Linhares");

        jLabel12.setText("Contatos: suporte.li@ifes.edu.br | +55 27 3264-5700");

        jLabel13.setText("Licença: GPL v3 - http://www.gnu.org/licenses/gpl-3.0.html");

        javax.swing.GroupLayout jSobreLayout = new javax.swing.GroupLayout(jSobre.getContentPane());
        jSobre.getContentPane().setLayout(jSobreLayout);
        jSobreLayout.setHorizontalGroup(
            jSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSobreLayout.createSequentialGroup()
                .addGroup(jSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSobreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jSobreLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addGroup(jSobreLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(jSobreLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(jSobreLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnFecharSobre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSobreLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(51, 51, 51))
        );
        jSobreLayout.setVerticalGroup(
            jSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSobreLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(btnFecharSobre)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fix MS Licensing Key -  1.5");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.lightGray);
        setMaximumSize(new java.awt.Dimension(514, 454));
        setResizable(false);
        setSize(new java.awt.Dimension(514, 454));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Fix MS Licensing Key");

        txtComputer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtComputer.setText("FQDN");
        txtComputer.setToolTipText("");
        txtComputer.setNextFocusableComponent(txtUserAdm);
        txtComputer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtComputerFocusGained(evt);
            }
        });

        txtUserAdm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserAdm.setText("MAQ\\USER_LOCAL");
        txtUserAdm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserAdmFocusGained(evt);
            }
        });

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setRows(5);
        txtLog.setFocusCycleRoot(true);
        jScrollPane1.setViewportView(txtLog);

        txtPassAdm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUserTs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserTs.setText("USER_TS@DOMAIN");
        txtUserTs.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserTsFocusGained(evt);
            }
        });

        txtPassTs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnExecutar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Computador:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Usuário Adm:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Usuário TS:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Senha TS:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Senha Adm:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Desenvolvido por: CTI - Ifes campus Linhares +55 27 3264-5711 | suporte.li@ifes.edu.br");

        txtServerTS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtServerTS.setText("SRV - FQDN");
        txtServerTS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtServerTSFocusGained(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Servidor TS:");

        menFile.setText("Arquivo");

        menSair.setText("Sair");
        menSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairActionPerformed(evt);
            }
        });
        menFile.add(menSair);

        jMenuBar1.add(menFile);

        menHelp.setText("Ajuda");

        menAbout.setText("Sobre");
        menAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAboutActionPerformed(evt);
            }
        });
        menHelp.add(menAbout);

        jMenuBar1.add(menHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUserTs, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUserAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtServerTS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPassAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPassTs, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(154, 154, 154)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComputer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserTs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassTs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtServerTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
        );

        txtComputer.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleDescription("Atualizador da MS Licensing Key");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        txtLog.setText("");
        if(!txtComputer.getText().isEmpty() &&
           !txtUserAdm.getText().isEmpty() && !txtPassAdm.getText().isEmpty() && 
           !txtUserTs.getText().isEmpty() && !txtPassTs.getText().isEmpty() && 
           !txtServerTS.getText().isEmpty() ){
            
            new Thread(new Runnable() {
            public void run() {
                   fixKey();
            }
        }).start();
            
        }else{
            txtLog.setText("Preencha todos os campos!");
        }
    }//GEN-LAST:event_btnExecutarActionPerformed

    private void txtUserAdmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserAdmFocusGained
        txtUserAdm.setText(txtComputer.getText()+"\\");
    }//GEN-LAST:event_txtUserAdmFocusGained

    private void txtComputerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtComputerFocusGained
        txtComputer.selectAll();
    }//GEN-LAST:event_txtComputerFocusGained

    private void txtUserTsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserTsFocusGained
        txtUserTs.selectAll();
    }//GEN-LAST:event_txtUserTsFocusGained

    private void menSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menSairActionPerformed

    private void menAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAboutActionPerformed
        jSobre.setModal(true);
        jSobre.setLocationRelativeTo(this);
        jSobre.setVisible(true);
    }//GEN-LAST:event_menAboutActionPerformed

    private void btnFecharSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharSobreActionPerformed
        jSobre.setVisible(false);
    }//GEN-LAST:event_btnFecharSobreActionPerformed

    private void txtServerTSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtServerTSFocusGained
        txtServerTS.selectAll();
    }//GEN-LAST:event_txtServerTSFocusGained
    
    
    private void validaDados(){
        if(!util.validaTxt(txtUserAdm.getText(),'\\')){
           updateLog("O usuário ADM Local foi informado incorretamente.");
           throw new IllegalArgumentException("UsuárioADMLocal incorreto tente novamente...");
       }
           
        if(txtUserAdm.getText().substring(0,util.posChar(txtUserAdm.getText(),'\\')).equals(txtComputer.getText())){
            if(!util.credencialLocal(txtUserAdm.getText().substring(1+ txtComputer.getText().length()), 
                    txtPassAdm.getText(), txtComputer.getText())){
                updateLog("Erro ao validar as crêdencias de administrador local");
                updateLog("* verifique usuário/senha do administrador local");
                updateLog("* verifique se a estação está ligada");
                throw new IllegalArgumentException("UsuárioADMLocal/Senha incorretos tente novamente...");
             }
        }else{
                updateLog("Erro ao validar as crêdencias de administrador local");
                updateLog("* Não foi possível validar esse usuário para o computador especificado");
                updateLog("* verifique se a estação está ligada");
                updateLog("* verifique se o \"dominio\\user\" estão de acordo com a estação especificada");
                throw new IllegalArgumentException("UsuárioADMLocal/Senha incorretos tente novamente...");
        }
       if(!util.validaTxt(txtUserTs.getText(),'@')){
            updateLog("O usuário TS foi informado incorretamente.");
            throw new IllegalArgumentException("UsuárioADMLocal incorreto tente novamente...");
       }
       
       if(!util.validHost(txtServerTS.getText())){
           updateLog("Erro servidor TS não encontrado");
           updateLog("* verifique o nome do servidor TS");
           throw new IllegalArgumentException("Erro ao contactar servidor TS..");
       }
       
       if(!util.credencialUserTS(txtUserTs.getText().split("@")[1], 
               txtUserTs.getText(), txtPassTs.getText())){
           updateLog("Erro ao validar as crêdencias de usuário de conexão TS");
           updateLog("* verifique usuário/senha do usuário TS");
           throw new IllegalArgumentException("UsuárioTS/Senha incorretors tente novamente...");
       }
    }
    
    @SuppressWarnings("empty-statement")
    private void fixKey(){
        
       validaDados();
       
       getFileExeRDP((System.getenv("TEMP")));
       getFileExePsExec((System.getenv("TEMP")));

       updateLog("Processo em andamento aguarde...");
       fixMS.passo0(txtComputer.getText());  //copia executaveis
       updateLog("Excluindo chave de registro...");
       fixMS.passo1(txtComputer.getText()); 
       updateLog("Criando nova chave de registro...");
       fixMS.passo2(txtComputer.getText(), txtUserAdm.getText(), txtPassAdm.getText(), txtServerTS.getText(), txtUserTs.getText(), txtPassTs.getText());
       updateLog("Finalizando procedimento...");
       fixMS.passo3(txtComputer.getText()); 
       updateLog("Atualização realizada com SUCESSO.");
       fixMS.passo4(txtComputer.getText());
    }
    
    private void updateLog(String txt){
        txtLog.setText(txtLog.getText() + txt + " \n"); 
    }
    
    private void getFileExeRDP(String destino){
        InputStream inputStreamRDP = null;
	OutputStream outputStream = null;
	try {
		inputStreamRDP = this.getClass().getResourceAsStream("/br/edu/ifes/li/cti/main/resource/rdp.exe");
		outputStream = 
                    new FileOutputStream(new File(destino + "\\rdp.exe"));
		int read = 0;
		byte[] bytes = new byte[1024];
		while ((read = inputStreamRDP.read(bytes)) != -1) {
			outputStream.write(bytes, 0, read);
		}
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (inputStreamRDP != null) {
			try {
				inputStreamRDP.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (outputStream != null) {
			try {
				// outputStream.flush();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}        
    }
    /************************************************/
     private void getFileExePsExec(String destino){
        InputStream inputStreamRDP = null;
	OutputStream outputStream = null;
	try {
		inputStreamRDP = this.getClass().getResourceAsStream("/br/edu/ifes/li/cti/main/resource/PsExec.exe");
		outputStream = 
                    new FileOutputStream(new File(destino + "\\psexec.exe"));
		int read = 0;
		byte[] bytes = new byte[1024];
		while ((read = inputStreamRDP.read(bytes)) != -1) {
			outputStream.write(bytes, 0, read);
		}
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (inputStreamRDP != null) {
			try {
				inputStreamRDP.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (outputStream != null) {
			try {
				// outputStream.flush();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}         
    }
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main dialog = new Main(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecutar;
    private javax.swing.JButton btnFecharSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JDialog jSobre;
    private javax.swing.JMenuItem menAbout;
    private javax.swing.JMenu menFile;
    private javax.swing.JMenu menHelp;
    private javax.swing.JMenuItem menSair;
    private javax.swing.JTextField txtComputer;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JPasswordField txtPassAdm;
    private javax.swing.JPasswordField txtPassTs;
    private javax.swing.JTextField txtServerTS;
    private javax.swing.JTextField txtUserAdm;
    private javax.swing.JTextField txtUserTs;
    // End of variables declaration//GEN-END:variables
    private FixMSLicensingKey fixMS = new FixMSLicensingKey();
    private Util util = new Util();
}
