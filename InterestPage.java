
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 * INTEREST PAGE:
 * The purpose of this program is to apply interest to the lowest bank account balance since the last time interest was applied.
 * This program will apply interest to any bank account, after a correct account number has been entered by the 
 * administrator. 
 *
 * @author Chamera and Kash
 */
public class InterestPage extends javax.swing.JFrame {

    /**
     * Creates new constructor for InterestPage
     */
    public InterestPage() {
        initComponents();
        mainMenuBtn.setVisible(false);
        signOutBtn.setVisible(false);
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
        accountInfoLbl = new javax.swing.JLabel();
        btn_applyInt = new javax.swing.JButton();
        txtf_accountNum = new javax.swing.JTextField();
        lbl_accounttNum = new javax.swing.JLabel();
        mainMenuBtn = new javax.swing.JButton();
        signOutBtn = new javax.swing.JButton();
        lbl_ckbank = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 26, 53));

        accountInfoLbl.setForeground(new java.awt.Color(255, 255, 255));
        accountInfoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_applyInt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_applyInt.setForeground(new java.awt.Color(0, 26, 53));
        btn_applyInt.setText("Apply Interest");
        btn_applyInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_applyIntActionPerformed(evt);
            }
        });

        txtf_accountNum.setBackground(new java.awt.Color(255, 255, 255));

        lbl_accounttNum.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl_accounttNum.setForeground(new java.awt.Color(255, 255, 255));
        lbl_accounttNum.setText("Account Number");

        mainMenuBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mainMenuBtn.setForeground(new java.awt.Color(0, 26, 53));
        mainMenuBtn.setText("Main Menu");
        mainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuBtnActionPerformed(evt);
            }
        });

        signOutBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        signOutBtn.setForeground(new java.awt.Color(0, 26, 53));
        signOutBtn.setText("Sign Out");
        signOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtnActionPerformed(evt);
            }
        });

        lbl_ckbank.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lbl_ckbank.setForeground(new java.awt.Color(51, 61, 174));
        lbl_ckbank.setText("Ck BANK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btn_applyInt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_ckbank))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(mainMenuBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signOutBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(lbl_accounttNum)
                                .addGap(32, 32, 32)
                                .addComponent(txtf_accountNum, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(accountInfoLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_ckbank)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_accounttNum)
                    .addComponent(txtf_accountNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_applyInt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(accountInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMenuBtn)
                    .addComponent(signOutBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * This method checks whether the account given by the administrator exists, and
 * then calls out to the ATM class to apply the interest on the given chequing 
 * or savings account.
 * @param evt 
 */
    private void btn_applyIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_applyIntActionPerformed
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Century Gothic", Font.PLAIN, 12))); 
        if(ATM.accountExist(Integer.parseInt(txtf_accountNum.getText()))==false)
            {
             JOptionPane.showMessageDialog(this, "Account does not exist.");  
              txtf_accountNum.setText("");   
            } 
        else
        {
        ATM.interestApply(Integer.parseInt(txtf_accountNum.getText()));
        accountInfoLbl.setText(ATM.searching(Integer.parseInt(txtf_accountNum.getText())));
        }
mainMenuBtn.setVisible(true);
        signOutBtn.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btn_applyIntActionPerformed
/**
 * This method allows the user to proceed to the UserChoices for users.
 * @param evt 
 */
    private void mainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuBtnActionPerformed
        this.setVisible(false);
        AdminChoices adminChoices = new AdminChoices();
        adminChoices.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuBtnActionPerformed
                                               
/**
 * This method allows the user to proceed to the FrontPage for users.
 * @param evt 
 */
    private void signOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtnActionPerformed
        this.setVisible(false);
        FrontPage frontPage = new FrontPage();
        frontPage.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_signOutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InterestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterestPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterestPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountInfoLbl;
    private javax.swing.JButton btn_applyInt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_accounttNum;
    private javax.swing.JLabel lbl_ckbank;
    private javax.swing.JButton mainMenuBtn;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JTextField txtf_accountNum;
    // End of variables declaration//GEN-END:variables
}