/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole;

import enterprise.Enterprise;
import organizations.Organization;
import business.models.Product.ProductDirectory;
import business.models.workRequest.WorkRequest;
import javax.swing.table.DefaultTableModel;
import business.models.Product.*;
import javax.swing.JPanel;

/**
 *
 * @author tinyteddybear
 */

public class ProductDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductDirectoryJPanel
     */
    private int pFlag;
    private Enterprise enterprise;
    private JPanel rightPanel;
    public ProductDirectoryJPanel(Enterprise enterprise,JPanel rightPanel) {
        initComponents();
        this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ProductDirectoryTable = new javax.swing.JTable();
        productComboBox = new javax.swing.JComboBox<>();

        ProductDirectoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(ProductDirectoryTable);

        productComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seed", "Tumbler", "Crop" }));
        productComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productComboBoxActionPerformed
        // TODO add your handling code here:
            
    String value = productComboBox.getSelectedItem().toString();
    
    if (value.equals("Crop"))
            {
                pFlag = 1;
                populatetable(pFlag);
            }
    else if (value.equals("Tumbler"))
            {
                pFlag = 2;
            }
    else if(value.equals("Seed"))
            {
                pFlag = 3;
            }
    }//GEN-LAST:event_productComboBoxActionPerformed



public void populatetable(int n)
{
    DefaultTableModel model = (DefaultTableModel)ProductDirectoryTable.getModel();
        
        model.setRowCount(0);
        
        for(Product p : enterprise.getProductDirectory().getProducts()){
            
            Object[] row = new Object[6];
            
            if (n==1)
            {
                if (p instanceof CropProduce)
                {
                    row[0] = p;
                    row[1] = p.getName();
                    row[2] = p.getProductId();
                    row[3] = p.getQuantity();
                    row[4] = p.getPrice();
                    row[5] = p.gettPrice();

                    model.addRow(row);
                }
            }
            
            


        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductDirectoryTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> productComboBox;
    // End of variables declaration//GEN-END:variables
}
