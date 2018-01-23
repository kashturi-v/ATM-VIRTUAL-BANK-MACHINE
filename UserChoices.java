/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kash
 */
public class UserChoices extends javax.swing.JFrame {

    /**
     * Creates new constructor from UserChoices
     */
    public UserChoices() {
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
        btn_signOut = new javax.swing.JButton();
        btn_despositFunds = new javax.swing.JButton();
        btn_transfer = new javax.swing.JButton();
        btn_withdrawl = new javax.swing.JButton();
        ckBankLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 26, 53));

        btn_signOut.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_signOut.setForeground(new java.awt.Color(0, 26, 53));
        btn_signOut.setText("Sign Out");
        btn_signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signOutActionPerformed(evt);
            }
        });

        btn_despositFunds.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_despositFunds.setForeground(new java.awt.Color(0, 26, 53));
        btn_despositFunds.setText("Depositing Funds");
        btn_despositFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_despositFundsActionPerformed(evt);
            }
        });

        btn_transfer.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_transfer.setForeground(new java.awt.Color(0, 26, 53));
        btn_transfer.setText("Transferring Funds");
        btn_transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transferActionPerformed(evt);
            }
        });

        btn_withdrawl.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_withdrawl.setForeground(new java.awt.Color(0, 26, 53));
        btn_withdrawl.setText("Withdrawl");
        btn_withdrawl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_withdrawlActionPerformed(evt);
            }
        });

        ckBankLbl.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        ckBankLbl.setForeground(new java.awt.Color(51, 61, 174));
        ckBankLbl.setText("Ck BANK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ckBankLbl)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_withdrawl, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_despositFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_signOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(115, 115, 115))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ckBankLbl)
                .addGap(26, 26, 26)
                .addComponent(btn_transfer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_despositFunds)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_withdrawl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_signOut)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * This method allows the user to proceed to the TransferPage for users.
 * @param evt 
 */
    private void btn_transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferActionPerformed
        this.setVisible(false);
        TransferPageUser transPage = new TransferPageUser();
        transPage.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_btn_transferActionPerformed
/**
 * This method allows the user to proceed to the DepositePage for users.
 * @param evt 
 */
    private void btn_despositFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_despositFundsActionPerformed
         this.setVisible(false);
        DepositePage depositPage = new DepositePage();
        depositPage.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_despositFundsActionPerformed
/**
 * This method allows the user to proceed to the FrontPage for users.
 * @param evt 
 */
    private void btn_signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signOutActionPerformed
        this.setVisible(false);
        FrontPage frontPage = new FrontPage();
        frontPage.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_btn_signOutActionPerformed
/**
 * This method allows the user to proceed to the Withdraw for users.
 * @param evt 
 */
    private void btn_withdrawlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_withdrawlActionPerformed
         this.setVisible(false);
        Withdrawl withdrawlPage = new Withdrawl();
        withdrawlPage.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_withdrawlActionPerformed

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
            java.util.logging.Logger.getLogger(UserChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserChoices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_despositFunds;
    private javax.swing.JButton btn_signOut;
    private javax.swing.JButton btn_transfer;
    private javax.swing.JButton btn_withdrawl;
    private javax.swing.JLabel ckBankLbl;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
