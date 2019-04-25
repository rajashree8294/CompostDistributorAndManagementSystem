/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole;

import business.models.Product.CropProduce;
import business.models.Product.Product;
import business.models.User.User;
import business.models.workRequest.FoodProductWorkRequest;
import enterprise.Enterprise;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import organizations.DistributorOrganization;
import organizations.Organization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author lenovo
 */
public class PurchaseProductJPanel extends javax.swing.JPanel {
    private final User userAccount;
    private final JPanel rightPanel;
    private final Enterprise enterprise;
    private final ArrayList<CropProduce> crops = new ArrayList<>();
    private final Logger logger = LoggerFactory.getLogger(PurchaseProductJPanel.class);

    PurchaseProductJPanel(JPanel rightPanel, Enterprise enterprise, User userAccount) {
        this.rightPanel = rightPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        
        initComponents();
        populateTable();
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        errorLbl = new javax.swing.JLabel();
        productCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        quanTxt = new javax.swing.JTextField();
        quantError = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Product Catalog");

        productTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Price / unit", "Available Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTbl);

        jButton1.setText("Send Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Product");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        productCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Quantity");

        quanTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quanTxtFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(quantError, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(0, 424, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(quantError, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        rightPanel.remove(this);
        CardLayout cardLayout = (CardLayout) rightPanel.getLayout();
        cardLayout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(quanTxt.getText().equals("") || productCombo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rightPanel, "Product ID or Quantity is empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(!quantError.getText().isEmpty()){
            JOptionPane.showMessageDialog(rightPanel, "Enter valid quantity", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
           String prodId = String.valueOf(productCombo.getSelectedItem());
           
           Product product1 = enterprise.getProductDirectory().getProducts().stream()
                              .filter(product -> product.getProductId().equalsIgnoreCase(prodId)).findFirst().orElse(null);
           
           if(product1.getQuantity()< Double.parseDouble(quanTxt.getText())){
               JOptionPane.showMessageDialog(rightPanel, "Your quantity is more than available products", "Error", JOptionPane.ERROR_MESSAGE);
           } else {
                FoodProductWorkRequest request = new FoodProductWorkRequest();
                request.setSender(userAccount);
                request.setStatus("Sent");
                request.setRequestDate(new Date());
                request.setQuantity(Double.parseDouble(quanTxt.getText()));
                request.setProductName(product1.getName());
                request.setProductPrice(product1.getPrice());
                request.setProductId(product1.getProductId());
                request.setMessage("Product Request");
                
                Organization org = null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof DistributorOrganization){
                        org = organization;
                        break;
                    }
                }
                if (org!=null){
                    org.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                }
           }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void quanTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quanTxtFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(quanTxt.getText());
        
        if(matcher.matches()){
           quantError.setText("");
        }
        else{
           quantError.setText("Quantity should be Numeric");
        }
    }//GEN-LAST:event_quanTxtFocusLost

    private void populateTable(){
        try{
            enterprise.getProductDirectory().getProducts().stream()
                  .filter(product -> {
                           if(product.getProductType().equalsIgnoreCase("crop")){
                            crops.add((CropProduce)product);
                           }
                        return !crops.isEmpty();                    
                  }).collect(Collectors.toList());
        
        if(crops.isEmpty()){
            JOptionPane.showMessageDialog(rightPanel, "No Products has been added for sale.");
            DefaultTableModel defaultTableModel = (DefaultTableModel) productTbl.getModel();
            defaultTableModel.setRowCount(0);
        } else {
            DefaultTableModel defaultTableModel = (DefaultTableModel) productTbl.getModel();
            defaultTableModel.setRowCount(0);
            
            crops.stream().map(product -> {
                Object[] row = new Object[4];
                row[0] = product;
                row[1] = product.getName();
                row[2] = product.getPrice();
                row[3] = product.getQuantity();
                return row;
            }).forEach((row)->{
                defaultTableModel.addRow(row);
            });
        }
        }catch(NullPointerException e){
            logger.warn("NullPointer exception while populating table in PurchaseProductJPanel");
        }
    }
    
    private void populateComboBox(){
        if(!crops.isEmpty()){
            DefaultComboBoxModel listModel = new DefaultComboBoxModel();
            listModel.addElement("--Select--");
            crops.stream().forEach((product) -> {
                listModel.addElement(product.getProductId());
            });
            productCombo.setModel(listModel);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox productCombo;
    private javax.swing.JTable productTbl;
    private javax.swing.JTextField quanTxt;
    private javax.swing.JLabel quantError;
    // End of variables declaration//GEN-END:variables
}
