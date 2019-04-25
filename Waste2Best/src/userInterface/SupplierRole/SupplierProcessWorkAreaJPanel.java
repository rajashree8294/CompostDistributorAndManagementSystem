/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole;

import business.models.Product.Compost;
import java.awt.Component;
import business.models.Product.CropProduce;
import business.models.Product.Seed;
import business.models.User.User;
import business.models.workRequest.CompostGeneratedWorkRequest;
import business.models.workRequest.FoodProductWorkRequest;
import business.models.workRequest.PurchaseCompostWorkRequest;
import business.models.workRequest.SellCropProduceWorkRequest;
import business.models.workRequest.TumblerWorkRequest;
import business.models.workRequest.WorkRequest;
import enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import organizations.Organization;
import organizations.SupplierOrganization;
import userInterface.DistributorRole.DistributorWorkAreaJPanel;


/**
 *
 * @author tinyteddybear
 */
public class SupplierProcessWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierProcessWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private SellCropProduceWorkRequest sCrequest;
    private CompostGeneratedWorkRequest cGrequest;
    private PurchaseCompostWorkRequest pCRequest;
    private User userAccount;
    private Enterprise enterprise;
    private int flag;
    private FoodProductWorkRequest foRequest;
    private TumblerWorkRequest tRequest;
    
    
    public SupplierProcessWorkAreaJPanel(JPanel userProcessContainer, User userAccount ,Enterprise enterprise, SellCropProduceWorkRequest request) {
        initComponents();
        processLabel.setText("Adding Crop Produce to Directory");
        this.userProcessContainer = userProcessContainer;
        sCrequest = request;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        flag=1;
    }
    
        public SupplierProcessWorkAreaJPanel(JPanel userProcessContainer, User userAccount ,Enterprise enterprise, CompostGeneratedWorkRequest request) {
        initComponents();
         processLabel.setText("Adding Compost to Directory");
        this.userProcessContainer = userProcessContainer;
        cGrequest = request;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        flag =2;
        }
        
          public SupplierProcessWorkAreaJPanel(JPanel userProcessContainer, User userAccount ,Enterprise enterprise,  FoodProductWorkRequest request) {
        initComponents();
         processLabel.setText("Sending Food to Customer");
        this.userProcessContainer = userProcessContainer;
        this.foRequest = request;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        flag = 3;
    }
         public SupplierProcessWorkAreaJPanel(JPanel userProcessContainer, User userAccount ,Enterprise enterprise,  TumblerWorkRequest request) {
        initComponents();
         processLabel.setText("Sending Tumbler to Customer");
        this.userProcessContainer = userProcessContainer;
        this.tRequest = request;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        flag = 4;
    }
                  public SupplierProcessWorkAreaJPanel(JPanel userProcessContainer, User userAccount ,Enterprise enterprise, PurchaseCompostWorkRequest request) {
        initComponents();
         processLabel.setText("Sending Tumbler to Customer");
        this.userProcessContainer = userProcessContainer;
        pCRequest = request;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        flag = 5;
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
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        processLabel = new javax.swing.JLabel();

        messageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageJTextFieldActionPerformed(evt);
            }
        });

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setText("Submit ");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Message:");

        processLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backJButton)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(586, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitJButton)
                                .addGap(63, 63, 63))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(processLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(processLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(backJButton))
                .addContainerGap(428, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void messageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageJTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SupplierWorkAreaJPanel dwjp = (SupplierWorkAreaJPanel) component;
        dwjp.populateTable();
        

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(flag==1){
        processLabel.setText("Adding Crop Produce to Directory");
        String message = messageJTextField.getText();
        sCrequest.setMessage(message);
        sCrequest.setReceiver(userAccount);
        sCrequest.setStatus("Completed");

        CropProduce crop = (CropProduce) enterprise.getProductDirectory().createProduct("crop");
        crop.setProductId(String.valueOf(enterprise.getProductDirectory().getProducts().size()));
        crop.setName(sCrequest.getCropName());
        crop.setExpenses( sCrequest.getExpenses());
        crop.setCompostRequired(sCrequest.getCompostRequired());
        crop.setQuantity(sCrequest.getCropQuantity());
        crop.setPrice(sCrequest.getPrice());
        crop.setProductType("crop");        

        JOptionPane.showMessageDialog(null, "Crop Produce Added Successfully");
        }
        
        if (flag==2){
            processLabel.setText("Adding Compost to Directory");
            
            String message = messageJTextField.getText();
            cGrequest.setMessage(message);
            cGrequest.setReceiver(userAccount);
            cGrequest.setStatus("Completed");
            
         Compost compost = (Compost) enterprise.getProductDirectory().createProduct("compost");
        compost.setProductId(String.valueOf(enterprise.getProductDirectory().getProducts().size()));
        compost.setName(cGrequest.getCompostUserName());
        compost.setQuantity(cGrequest.getCompostQuantity());
     //   compost.setPrice(sCrequest.getPrice());
        compost.setProductType("compost");
        }
        
        if (flag==3){
            processLabel.setText("Sending Food to Customer");
            String message = messageJTextField.getText();
            foRequest.setMessage(message);
            foRequest.setReceiver(userAccount);
            foRequest.setStatus("Completed");
        }
        if (flag==4){
            processLabel.setText("Sending Tumbler to Customer");
            String message = messageJTextField.getText();
            enterprise.getProductDirectory().getProducts().stream().forEach(product -> {
                if(product.getProductId().equalsIgnoreCase(tRequest.getProductId())){
                    product.setQuantity(product.getQuantity() - tRequest.getQuantity());
                }
            });
            tRequest.setMessage(message);
            tRequest.setReceiver(userAccount);
            tRequest.setStatus("Completed");
        }
        if (flag==5){
              processLabel.setText("Sending Compost to Farmer");
            String message = messageJTextField.getText();
            enterprise.getProductDirectory().getProducts().stream().forEach(product -> {
                if(product.getProductId().equalsIgnoreCase(pCRequest.getProductId())){
                    product.setQuantity(product.getQuantity() - pCRequest.getQuantity());
                }
            });
            pCRequest.setMessage(message);
            pCRequest.setReceiver(userAccount);
            pCRequest.setStatus("Completed");
        }
        
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JLabel processLabel;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
