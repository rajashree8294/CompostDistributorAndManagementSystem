/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.FarmerRole;

import business.Ecosystem;
import business.models.User.User;
import business.models.workRequest.SellCropProduceWorkRequest;
import enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import organizations.FarmerOrganization;
import userInterface.ContactUsJPanel;

/**
 *
 * @author Aditya
 */
public class FarmerWorkAreaJPanel extends javax.swing.JPanel {
  
    private final JPanel rightPanel;
    private final FarmerOrganization organization;
    private final Enterprise enterprise;
    private final User userAccount;
    private JPanel rightJPanel;
    
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public FarmerWorkAreaJPanel(JPanel userProcessContainer, User account, FarmerOrganization organization, Enterprise enterprise, Ecosystem system) {
        initComponents();
        
        this.rightPanel = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateRequestTable();
    }
    
       public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        userAccount.getWorkQueue().getWorkRequestList().stream().map((request) -> {
            Object[] row = new Object[4];
            row[0] = ((SellCropProduceWorkRequest)request).getCropName();
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            //String result = ((SellCropProduceWorkRequest) request).getTestResult();
            ////row[3] = result == null ? "Waiting" : result;
            return row;
        }).forEach(row -> model.addRow(row));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sellCropProduceBttn = new javax.swing.JButton();
        orderBttn = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        purchaseCompostButton = new javax.swing.JButton();
        sellCropProduceBttn1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Farmer Dashboard");

        sellCropProduceBttn.setText("Sell Crop Produce");
        sellCropProduceBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellCropProduceBttnActionPerformed(evt);
            }
        });

        orderBttn.setText("Purchase Seed");
        orderBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBttnActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Crop", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        purchaseCompostButton.setText("Purchase Compost");
        purchaseCompostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseCompostButtonActionPerformed(evt);
            }
        });

        sellCropProduceBttn1.setText("Report");
        sellCropProduceBttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellCropProduceBttn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(purchaseCompostButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(orderBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sellCropProduceBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sellCropProduceBttn1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseCompostButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellCropProduceBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellCropProduceBttn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sellCropProduceBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellCropProduceBttnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        rightPanel.add("RequestSellProductPanel", new RequestSellProductPanel(rightPanel, userAccount, enterprise));
        layout.next(rightPanel);
    }//GEN-LAST:event_sellCropProduceBttnActionPerformed

    private void orderBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBttnActionPerformed
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        rightPanel.add("RequestSellProductPanel", new SeedPurchaseJPanel(rightPanel, userAccount,organization, enterprise));
        layout.next(rightPanel);
    }//GEN-LAST:event_orderBttnActionPerformed

    private void purchaseCompostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseCompostButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        rightPanel.add("CompostPurchaseJPanel", new CompostPurchaseJPanel(rightPanel, userAccount,organization, enterprise));
        layout.next(rightPanel);
    }//GEN-LAST:event_purchaseCompostButtonActionPerformed

    private void sellCropProduceBttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellCropProduceBttn1ActionPerformed
        ContactUsJPanel contactUsJPanel = new ContactUsJPanel(rightPanel);
        rightPanel.add("ContactUsJPanel", contactUsJPanel);
        CardLayout cardLayout = (CardLayout) rightPanel.getLayout();
        cardLayout.next(rightPanel);
    }//GEN-LAST:event_sellCropProduceBttn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderBttn;
    private javax.swing.JButton purchaseCompostButton;
    private javax.swing.JButton sellCropProduceBttn;
    private javax.swing.JButton sellCropProduceBttn1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
