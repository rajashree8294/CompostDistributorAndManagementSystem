/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole;

import business.models.User.User;
import business.models.workRequest.CompostGeneratedWorkRequest;
import business.models.workRequest.FoodProductWorkRequest;
import business.models.workRequest.LabTestWorkRequest;
import business.models.workRequest.PurchaseCompostWorkRequest;
import business.models.workRequest.SeedWorkRequest;
import business.models.workRequest.SellCropProduceWorkRequest;
import business.models.workRequest.TumblerWorkRequest;
import business.models.workRequest.WorkRequest;
import enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import organizations.LabOrganization;
import organizations.Organization;


import organizations.SupplierOrganization;

/**
 *
 * @author Aditya
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {
   
    private final JPanel userProcessContainer;
    private final SupplierOrganization organization;
    private final Enterprise enterprise;
    private final User userAccount;
    private static Boolean compostFlag = false;
    /**
     * Creates new form SupplierWorkAreaJPanel
     */
    public SupplierWorkAreaJPanel(JPanel userProcessContainer, User account, SupplierOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
        valueLabel.setText(enterprise.getName());
        populateTable();
        
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[2] = request.getStatus();
            
            model.addRow(row);
        }
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
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        seedBtn = new javax.swing.JButton();
        processJButton1 = new javax.swing.JButton();
        reqCompostButton = new javax.swing.JButton();
        tumblerBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Supplier Dashboard");
        add(jLabel1);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel);

        valueLabel.setText("<value>");
        add(valueLabel);

        processJButton.setBackground(new java.awt.Color(153, 204, 255));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton);

        assignJButton.setBackground(new java.awt.Color(153, 204, 255));
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);

        seedBtn.setBackground(new java.awt.Color(153, 204, 255));
        seedBtn.setText("Add Seed");
        seedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seedBtnActionPerformed(evt);
            }
        });
        add(seedBtn);

        processJButton1.setBackground(new java.awt.Color(153, 204, 255));
        processJButton1.setText("Products");
        processJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButton1ActionPerformed(evt);
            }
        });
        add(processJButton1);

        reqCompostButton.setBackground(new java.awt.Color(153, 204, 255));
        reqCompostButton.setText("Request Compost Test");
        reqCompostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqCompostButtonActionPerformed(evt);
            }
        });
        add(reqCompostButton);

        tumblerBtn.setBackground(new java.awt.Color(153, 204, 255));
        tumblerBtn.setText("Add Tumbler");
        tumblerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tumblerBtnActionPerformed(evt);
            }
        });
        add(tumblerBtn);
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().contains("Completed")){
         JOptionPane.showMessageDialog(null, "Process the request"); 
    }else
        if((request.getStatus().equals("Completed")||request.getStatus().equals("In Lab Testing")||request.getStatus().equals("In Progress by Supplier"))){
          JOptionPane.showMessageDialog(null, "Request  is already in Process or Completed");  
        }else{
        
        request.setReceiver(userAccount);
        request.setStatus("In Progress by Supplier");
        }
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("In Progress by Supplier")||request.getStatus().contains("Completed Rating is")){
            
        
        if (workRequestJTable.getValueAt(selectedRow, 0) instanceof SellCropProduceWorkRequest ){
        SellCropProduceWorkRequest sellCropProduceWorkRequest = (SellCropProduceWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        sellCropProduceWorkRequest.setStatus("Completed");

        SupplierProcessWorkAreaJPanel processWorkRequestJPanel = new SupplierProcessWorkAreaJPanel(userProcessContainer,userAccount,enterprise, sellCropProduceWorkRequest);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
               
            }
        
           if (workRequestJTable.getValueAt(selectedRow, 0) instanceof PurchaseCompostWorkRequest ){
        PurchaseCompostWorkRequest purchaseCompostWorkRequest = (PurchaseCompostWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        purchaseCompostWorkRequest.setStatus("Completed");

        SupplierProcessWorkAreaJPanel processWorkRequestJPanel = new SupplierProcessWorkAreaJPanel(userProcessContainer,userAccount,enterprise, purchaseCompostWorkRequest);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
               
            }
            
        if (workRequestJTable.getValueAt(selectedRow, 0) instanceof CompostGeneratedWorkRequest ){
            if(request.getStatus().contains("Completed Rating is")){
        CompostGeneratedWorkRequest compostGeneratedWorkRequest = (CompostGeneratedWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        compostGeneratedWorkRequest.setStatus("Completed");

        SupplierProcessWorkAreaJPanel processWorkRequestJPanel = new SupplierProcessWorkAreaJPanel(userProcessContainer,userAccount,enterprise, compostGeneratedWorkRequest);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
            }else
            {
             JOptionPane.showMessageDialog(null, "Carry Lab Testing first");    
            }
            }
        
            if (workRequestJTable.getValueAt(selectedRow, 0) instanceof FoodProductWorkRequest ){
        FoodProductWorkRequest foodProductWorkRequest = (FoodProductWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        foodProductWorkRequest.setStatus("Completed");

        SupplierProcessWorkAreaJPanel supplierProcessWorkAreaJPanel = new SupplierProcessWorkAreaJPanel(userProcessContainer,userAccount,enterprise, foodProductWorkRequest);
        userProcessContainer.add("processWorkRequestJPanel", supplierProcessWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
               
            }
            
             if (workRequestJTable.getValueAt(selectedRow, 0) instanceof TumblerWorkRequest ){
        TumblerWorkRequest tumblerWorkRequest = (TumblerWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        tumblerWorkRequest.setStatus("Completed");

        SupplierProcessWorkAreaJPanel supplierProcessWorkAreaJPanel = new SupplierProcessWorkAreaJPanel(userProcessContainer,userAccount,enterprise, tumblerWorkRequest);
        userProcessContainer.add("processWorkRequestJPanel", supplierProcessWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
               
            }
             if (workRequestJTable.getValueAt(selectedRow, 0) instanceof SeedWorkRequest ){
        SeedWorkRequest seedWorkRequest = (SeedWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        seedWorkRequest.setStatus("Completed");

        SupplierProcessWorkAreaJPanel supplierProcessWorkAreaJPanel = new SupplierProcessWorkAreaJPanel(userProcessContainer,userAccount,enterprise, seedWorkRequest);
        userProcessContainer.add("processWorkRequestJPanel", supplierProcessWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
               
            }
        
        
        
        
        }else if (request.getStatus().equals("Sent to Supplier")){
            JOptionPane.showMessageDialog(null, "Assign to Yourself"); 
        }else{
            JOptionPane.showMessageDialog(null, "Request  is already in Process or Completed"); 
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void seedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seedBtnActionPerformed
        // TODO add your handling code here:
        NewSeedJPanel newSeedJPanel = new NewSeedJPanel(enterprise, userProcessContainer);
        userProcessContainer.add("NewSeedJPanel", newSeedJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_seedBtnActionPerformed

    private void tumblerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tumblerBtnActionPerformed
        NewTumblerJPanel newTumblerJPanel = new NewTumblerJPanel(enterprise, userProcessContainer);
        userProcessContainer.add("NewTumblerJPanel", newTumblerJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_tumblerBtnActionPerformed

    private void reqCompostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqCompostButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = workRequestJTable.getSelectedRow();
         
        if (selectedRow < 0){
            return;
        }
         WorkRequest req =(WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (workRequestJTable.getValueAt(selectedRow, 0) instanceof CompostGeneratedWorkRequest ){
            if(!req.getStatus().equals("In Progress by Supplier")){
                JOptionPane.showMessageDialog(null, "Request  already in Lab Testing or completed"); 
            }else{
      CompostGeneratedWorkRequest compostGeneratedWorkRequest = (CompostGeneratedWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
      compostGeneratedWorkRequest.setStatus("Sent to Lab");
      populateTable();

      LabTestWorkRequest request = new LabTestWorkRequest();
       
        
        request.setSender(userAccount);
      //  request.setStatus("Sent to Lab");
        request.setCompostUserName(compostGeneratedWorkRequest.getCompostUserName());
        
         Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof LabOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(compostGeneratedWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(compostGeneratedWorkRequest);
        }
               
            }   }else{
            JOptionPane.showMessageDialog(null, "Please select only compost requests for testing");
        }
    }//GEN-LAST:event_reqCompostButtonActionPerformed

    private void processJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButton1ActionPerformed
        // TODO add your handling code here:
         ProductDirectoryJPanel newTumblerJPanel = new ProductDirectoryJPanel(enterprise, userProcessContainer);
        userProcessContainer.add("NewTumblerJPanel", newTumblerJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
                                              
        
    }//GEN-LAST:event_processJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton processJButton1;
    private javax.swing.JButton reqCompostButton;
    private javax.swing.JButton seedBtn;
    private javax.swing.JButton tumblerBtn;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
