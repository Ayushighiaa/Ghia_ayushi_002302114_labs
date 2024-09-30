/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AccountManager;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Account;
import model.AccountDirectarory;

/**
 *
 * @author ayushighia
 */
public class CreateAccountJPanel extends javax.swing.JPanel {
    
    JPanel userProcessComtainer;
    AccountDirectarory accountDirectarory;
    

    /**
     * Creates new form CreateAccountJPanel
     */
    public CreateAccountJPanel(JPanel Comtainer, AccountDirectarory directarory) {
        initComponents();
        
        userProcessComtainer= Comtainer;
        accountDirectarory = directarory;
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btbBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblRoutingNumber = new javax.swing.JLabel();
        lblAccountNumber = new javax.swing.JLabel();
        iblBankName = new javax.swing.JLabel();
        lblBlance = new javax.swing.JLabel();
        txtRoutingNumber = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        btbCreate = new javax.swing.JButton();

        btbBack.setText("<<< Back");
        btbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbBackActionPerformed(evt);
            }
        });

        lblTitle.setText("Create Account");

        lblRoutingNumber.setText("Routing Number");

        lblAccountNumber.setText("Account Number ");

        iblBankName.setText("Bank Name");

        lblBlance.setText("Balance");

        btbCreate.setText("Create Account");
        btbCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btbBack)
                        .addGap(119, 119, 119)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAccountNumber)
                            .addComponent(lblBlance, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iblBankName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoutingNumber, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRoutingNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(txtAccountNumber)
                            .addComponent(txtBankName)
                            .addComponent(txtBalance)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btbCreate)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbBack)
                    .addComponent(lblTitle))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNumber)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountNumber)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iblBankName)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBlance)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btbCreate)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbBackActionPerformed
        // TODO add your handling code here:
        userProcessComtainer.remove(this);
        CardLayout layout = (CardLayout) userProcessComtainer.getLayout();
        layout.previous(userProcessComtainer);
        
    }//GEN-LAST:event_btbBackActionPerformed

    private void btbCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCreateActionPerformed
        // TODO add your handling code here:
        int balance;
        
        String routingNumber = txtRoutingNumber.getText();
        String accountNumber = txtAccountNumber.getText();
        String bankName = txtBankName.getText();
        
        if (routingNumber.isBlank() || bankName.isBlank() || accountNumber.isBlank())
        {
            JOptionPane.showMessageDialog(this,"All fields are mandatory.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
         try {
             balance = Integer.parseInt(txtBalance.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please check the balance input.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         Account a = accountDirectarory.addAccount();
         
         a.setRoutingNumber(routingNumber);
         a.setAccountNumber(accountNumber);
         a.setBankName(bankName);
         a.setBalance(balance);
         
         JOptionPane.showMessageDialog(this, "Account Succesfullly Created", "Information", JOptionPane.INFORMATION_MESSAGE);
         
         txtRoutingNumber.setText("");
         txtAccountNumber.setText("");
         txtBankName.setText("");
         txtBalance.setText("");
         
         
        
        
        
        
    }//GEN-LAST:event_btbCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbBack;
    private javax.swing.JButton btbCreate;
    private javax.swing.JLabel iblBankName;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblBlance;
    private javax.swing.JLabel lblRoutingNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables
}
