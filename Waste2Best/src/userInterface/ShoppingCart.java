/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.models.Product.Seed;
import business.models.Product.SeedCatalog;
import business.models.User.User;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tinyteddybear
 */
public class ShoppingCart extends javax.swing.JPanel {

    /**
     * Creates new form ShoppingCart
     */
    private JPanel rightJPanel;
    private SeedCatalog seedList;
    public ShoppingCart(JPanel rightJPanel, SeedCatalog seedList) {
        initComponents();
        this.seedList=seedList;
        this.rightJPanel=rightJPanel;
        populateTable();
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
        tableCart = new javax.swing.JTable();

        tableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ));
        jScrollPane1.setViewportView(tableCart);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tableCart.getModel();
        dtm.setRowCount(0);
        
        for (Seed s: seedList.getSeedList())
        {
            Object row[] = new Object[5];
            row[0] = s;
            row[1] = s.getName();
            row[2] = s.getQuantity();
            row[3] = s.getPrice();
            row[4] = s.gettPrice();
            
            dtm.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCart;
    // End of variables declaration//GEN-END:variables
}