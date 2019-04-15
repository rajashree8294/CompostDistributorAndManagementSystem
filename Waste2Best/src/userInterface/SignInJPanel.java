/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;


import business.models.Role.Role;
import business.models.User.Customer;
import business.models.User.CustomerCatalog;
import business.models.User.Farmer;
import business.models.User.FarmerCatalog;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tinyteddybear
 */
public class SignInJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Market
     */
    private CustomerCatalog customerList;
    private FarmerCatalog farmerList;
    private JPanel rightJPanel;
    public SignInJPanel(JPanel rightJPanel, CustomerCatalog cList, FarmerCatalog fList) {
        initComponents();
        this.customerList=cList;
        this.farmerList = fList;
        this.rightJPanel = rightJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textPwd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dropType = new javax.swing.JComboBox<>();
        buttonSubmit = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textLocation = new javax.swing.JTextField();
        lblErrorPwd = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel2.setText("Name");

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        jLabel3.setText("E-Mail");

        textMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textMailFocusLost(evt);
            }
        });

        jLabel4.setText("Password");

        textPwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textPwdFocusLost(evt);
            }
        });

        jLabel5.setText("Type");

        dropType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Farmer" }));

        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        lblError.setText("  ");
        lblError.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblErrorFocusLost(evt);
            }
        });

        jButton1.setText("<< Back   ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Location");

        lblErrorPwd.setText("  ");
        lblErrorPwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblErrorPwdFocusLost(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textLocation, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPwd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dropType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblError)
                                    .addComponent(lblErrorPwd)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(buttonSubmit))))))
                .addContainerGap(416, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblError))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorPwd))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGap(18, 18, 18)
                .addComponent(buttonSubmit)
                .addGap(82, 82, 82)
                .addComponent(jButton2)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        // TODO add your handling code here:
        if(textName.getText().equals("") || textMail.getText().equals("") || textPwd.getText().equals("") || textPwd.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"One or more fields are empty");
        } 
        else if(lblError.getText().equals("") && lblErrorPwd.getText().equals(""))
        {


            String name="";
            String mail="";
            String userName="";
            String location="";
            String type="Customer";
            String password="sdsdg";

            try
            {
                name = textName.getText();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please input a valid Name");
                return;
            }

            try
            {
                mail = textPwd.getText();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please input a valid Location");
                return;
            }

            try
            {
                userName = textName.getText();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please input a valid UserName");
                return;
            }
            
            try
            {
                location = textLocation.getText();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please input a valid Location");
                return;
            }
            
            if (type.equals("Customer"))
            {

                customerList.createCustomerAccount(name, userName, password, location);
                
                JOptionPane.showMessageDialog(null, "Customer created successfully");
            }
            else
            {

                Farmer f = farmerList.addFarmer();
                f.setName(name);
                f.setLocation(location);
                f.setPassword(password);
                
                JOptionPane.showMessageDialog(null, "Farmer created successfully");
            }
        
        }
        else if (!lblError.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please input a valid E-Mail");
        }
        else if (!lblErrorPwd.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please input a valid Password");
        }
        
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void lblErrorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblErrorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_lblErrorFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        rightJPanel.remove(this);
        layout.previous(rightJPanel);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textMailFocusLost
        // TODO add your handling code here:
        //String regex = "^[A-Za-z0-9]+@[A-Za-z]+.[A-Za-z]+.+[A-Za-z]$";
        String regex = "^[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textMail.getText());

        if(matcher.matches()){
           lblError.setText("");
        }
        else{
           lblError.setText("Enter Email with @ and .");
        }
        
    }//GEN-LAST:event_textMailFocusLost

    private void lblErrorPwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblErrorPwdFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblErrorPwdFocusLost

    private void textPwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPwdFocusLost
        // TODO add your handling code here:
        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9#!@$]{8,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textPwd.getText());
        if(matcher.matches())
            lblErrorPwd.setText("");
        else
            lblErrorPwd.setText("Password should at least 8 characters long & contain at least One Uppercase, One digit and # symbol");
    }//GEN-LAST:event_textPwdFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tempcust viewVitalsJPanel = new tempcust(rightJPanel, customerList);
        //splitPane.setRightComponent(viewJPanel);
        rightJPanel.add("ViewVitals",viewVitalsJPanel);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JComboBox<String> dropType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblErrorPwd;
    private javax.swing.JTextField textLocation;
    private javax.swing.JTextField textMail;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPwd;
    // End of variables declaration//GEN-END:variables
}