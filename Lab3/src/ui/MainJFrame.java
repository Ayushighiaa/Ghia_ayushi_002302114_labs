/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.Account;
import model.AccountDirectarory;
import ui.AccountManager.AccountMngWorkAreaJPanel;

/**
 *
 * @author ayushighia
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private AccountDirectarory accountdirectarory;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        this.accountdirectarory= new AccountDirectarory();
        generateDemoData();
      
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topjPanel1 = new javax.swing.JPanel();
        btnAccountMngActionPerformed = new javax.swing.JButton();
        userProcessComtainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnAccountMngActionPerformed.setText("Open Account Manager Work Area");
        btnAccountMngActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountMngActionPerformedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topjPanel1Layout = new javax.swing.GroupLayout(topjPanel1);
        topjPanel1.setLayout(topjPanel1Layout);
        topjPanel1Layout.setHorizontalGroup(
            topjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topjPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnAccountMngActionPerformed)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        topjPanel1Layout.setVerticalGroup(
            topjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topjPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnAccountMngActionPerformed)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(topjPanel1);

        userProcessComtainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessComtainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountMngActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountMngActionPerformedActionPerformed
        // TODO add your handling code here:
        AccountMngWorkAreaJPanel panel= new AccountMngWorkAreaJPanel(userProcessComtainer, accountdirectarory);
        userProcessComtainer.add("AccountMngWorkAreaJPanel", panel);
        
        CardLayout layout = (CardLayout) userProcessComtainer.getLayout();
        layout.next(userProcessComtainer);
        
    }//GEN-LAST:event_btnAccountMngActionPerformedActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountMngActionPerformed;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel topjPanel1;
    private javax.swing.JPanel userProcessComtainer;
    // End of variables declaration//GEN-END:variables

    private void generateDemoData() {
        
     Account newAccount = accountdirectarory.addAccount();
     newAccount.setAccountNumber("444444444");
     newAccount.setRoutingNumber("237464833");
     newAccount.setBankName("Bank Of America");
     newAccount.setBalance(200);
    
     
     Account anotherNewAccount= accountdirectarory.addAccount();
     anotherNewAccount.setAccountNumber("555555555");
     anotherNewAccount.setRoutingNumber("0984673847");
     anotherNewAccount.setBankName("Santander Bank");
     anotherNewAccount.setBalance(1200);
    }

    private void generateDemoDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

         
