/**
 * USER PAGE:
 * The purpose of this program to check whether the account number entered matches the pin number entered by the user.
 * If there is a match, then the user can move on, however if no match is made then the user is displayed with a message 
 * that states that the two inputs do not match, or are not in the system. 
 *author Chamera and Kash
 */
public class UserPage extends javax.swing.JFrame {

    /**
     * Creates new constructor for UserPage
     */
    public UserPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_ckbank = new javax.swing.JLabel();
        enterUserLbl = new javax.swing.JLabel();
        userAcntNum = new javax.swing.JTextField();
        accountNumLbl = new javax.swing.JLabel();
        pinLbl = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        userAcntPaswrd = new javax.swing.JPasswordField();
        accountInfoLbl = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 26, 53));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 26, 53));

        lbl_ckbank.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lbl_ckbank.setForeground(new java.awt.Color(51, 61, 174));
        lbl_ckbank.setText("Ck BANK");

        enterUserLbl.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        enterUserLbl.setForeground(new java.awt.Color(255, 255, 255));
        enterUserLbl.setText("Please enter your username and password:");

        userAcntNum.setBackground(new java.awt.Color(255, 255, 255));
        userAcntNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAcntNumActionPerformed(evt);
            }
        });

        accountNumLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        accountNumLbl.setForeground(new java.awt.Color(255, 255, 255));
        accountNumLbl.setText("Account Number:");

        pinLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pinLbl.setForeground(new java.awt.Color(255, 255, 255));
        pinLbl.setText("Pin:");

        okBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        okBtn.setForeground(new java.awt.Color(0, 26, 53));
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        userAcntPaswrd.setBackground(new java.awt.Color(255, 255, 255));

        accountInfoLbl.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        accountInfoLbl.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(okBtn)
                        .addGap(174, 174, 174))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(pinLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userAcntPaswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(accountNumLbl)
                                .addGap(37, 37, 37)
                                .addComponent(userAcntNum, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(107, 107, 107))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(enterUserLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_ckbank)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(accountInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lbl_ckbank)
                .addGap(48, 48, 48)
                .addComponent(enterUserLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNumLbl)
                    .addComponent(userAcntNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinLbl)
                    .addComponent(userAcntPaswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(okBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    
    private void userAcntNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAcntNumActionPerformed
               // TODO add your handling code here:
                // TODO add your handling code here:
           
    }//GEN-LAST:event_userAcntNumActionPerformed
    
   
    /**
     * This method checks to see whether the account number and pin entered are correct. If it is
     * the methods proceeds onto the next page. Otherwise it makes sure that the user is aware
     * that either the pin or account number entered was wrong.
     * 
     * @param evt Holds data of the action performed by the user on the control.           
     */
     
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        if(ATM.userPassword(Integer.parseInt(userAcntNum.getText()), Integer.parseInt(userAcntPaswrd.getText())))
        {
           this.setVisible(false);
        UserChoices choicePage = new UserChoices();
        choicePage.setVisible(true);  
        }
        else
        {
            userAcntNum.setText("");
            userAcntPaswrd.setText("");
            accountInfoLbl.setText("Incorrect account number or pin. Please try again.");
        }// TODO add your handling code here:
    }//GEN-LAST:event_okBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountInfoLbl;
    private javax.swing.JLabel accountNumLbl;
    private javax.swing.JLabel enterUserLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_ckbank;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel pinLbl;
    private javax.swing.JTextField userAcntNum;
    private javax.swing.JPasswordField userAcntPaswrd;
    // End of variables declaration//GEN-END:variables
}
