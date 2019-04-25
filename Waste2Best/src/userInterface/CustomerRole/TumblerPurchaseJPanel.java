/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole;

import business.models.Product.Tumbler;
import business.models.User.User;
import business.models.workRequest.TumblerWorkRequest;
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
import organizations.CustomerOrganization;
import organizations.DistributorOrganization;
import organizations.Organization;

/**
 *
 * @author lenovo
 */
public class TumblerPurchaseJPanel extends javax.swing.JPanel {
    private final JPanel rightPanel;
    private final User userAccount;
    private final Enterprise enterprise;
    private final CustomerOrganization organization;
     private final ArrayList<Tumbler> tumblers = new ArrayList<>();
    
    TumblerPurchaseJPanel(JPanel rightPanel, User userAccount, CustomerOrganization organization, Enterprise enterprise) {
        initComponents();
        this.rightPanel = rightPanel;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        
        populateTable();
        populateComboBox();
    }
    
     private void populateTable(){
        enterprise.getProductDirectory().getProducts().stream()
                  .filter(product -> {
                        if(product.getProductType().equalsIgnoreCase("tumbler")){
                            tumblers.add((Tumbler)product);
                        }
                        return !tumblers.isEmpty();
                  }).collect(Collectors.toList());
        
        if(tumblers.isEmpty()){
            JOptionPane.showMessageDialog(rightPanel, "No Tumbler has been added for sale.");
            DefaultTableModel defaultTableModel = (DefaultTableModel) tumblerTbl.getModel();
            defaultTableModel.setRowCount(0);
        } else {
            DefaultTableModel defaultTableModel = (DefaultTableModel) tumblerTbl.getModel();
            defaultTableModel.setRowCount(0);
            
            tumblers.stream().map(product -> {
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
    }
     
    private void populateComboBox(){
        if(!tumblers.isEmpty()){
            DefaultComboBoxModel listModel = new DefaultComboBoxModel();
            listModel.addElement("--Select--");
            tumblers.stream().forEach((product) -> {
                listModel.addElement(product.getProductId());
            });
            productCombo.setModel(listModel);
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
        productCombo = new javax.swing.JComboBox();
        quantityLabel = new javax.swing.JLabel();
        tumblerTypeLabel = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tumblerTbl = new javax.swing.JTable();
        quantError = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Purchase Tumbler");

        productCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Small-S", "Medium-M", "Large-L" }));

        quantityLabel.setText("Quantity");

        tumblerTypeLabel.setText("Product ID");

        quantityTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityTxtFocusLost(evt);
            }
        });
        quantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTxtActionPerformed(evt);
            }
        });

        submitButton.setText("Send Request");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Tumbler Catalog");

        tumblerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tumblerTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(backBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tumblerTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(productCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quantError, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(470, 470, 470))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn)
                .addGap(109, 109, 109)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tumblerTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(quantError, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void quantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(quantityTxt.getText().equals("") || productCombo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rightPanel, "Product ID or Quantity is empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(!quantError.getText().isEmpty()){
            JOptionPane.showMessageDialog(rightPanel, "Enter valid quantity", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int selectedRow = tumblerTbl.getSelectedRow();
            Tumbler tumbler = (Tumbler) tumblerTbl.getValueAt(selectedRow, 0);
            
            if(tumbler.getPrice() < Double.parseDouble(quantityTxt.getText())) {
                JOptionPane.showMessageDialog(rightPanel, "Your quantity is more than available tumblers", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String type = String.valueOf(productCombo.getSelectedItem());
                int quantity = Integer.parseInt(quantityTxt.getText());

                TumblerWorkRequest request = new TumblerWorkRequest();
                request.setSender(userAccount);
                request.setStatus("Sent");
                request.setRequestDate(new Date());
                request.setQuantity(quantity);
                request.setType(type);
                request.setMessage("New Tumbler Request");

                Organization org = null;
                for (Organization orgz : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if (orgz instanceof DistributorOrganization){
                        org = orgz;
                        break;
                    }
                }
                if (org!=null){
                    org.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                }
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void quantityTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTxtFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(quantityTxt.getText());
        
        if(matcher.matches()){
           quantError.setText("");
        }
        else{
           quantError.setText("Quantity should be Numeric");
        }
    }//GEN-LAST:event_quantityTxtFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox productCombo;
    private javax.swing.JLabel quantError;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton submitButton;
    private javax.swing.JTable tumblerTbl;
    private javax.swing.JLabel tumblerTypeLabel;
    // End of variables declaration//GEN-END:variables
}
