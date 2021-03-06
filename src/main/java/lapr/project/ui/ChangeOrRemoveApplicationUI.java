/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.awt.Checkbox;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import lapr.project.controller.ChangeOrRemoveApplicationController;
import lapr.project.model.Application;
import lapr.project.model.Enterprise;
import lapr.project.model.EventCenter;
import lapr.project.model.EventRegistry;
import lapr.project.model.Event;
import lapr.project.model.Keyword;
import lapr.project.model.KeywordList;
import lapr.project.model.Product;
import lapr.project.model.ProductList;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class ChangeOrRemoveApplicationUI extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private ChangeOrRemoveApplicationController controller;
    private DefaultListModel<Keyword> modelKeywordList = new DefaultListModel<>();
    private DefaultListModel<Product> modelProductList = new DefaultListModel<>();
    private String logedUser;
    private EventRegistry listEvents;
    private KeywordList listKeywords;
    private ProductList listProducts;

    /**
     * Creates new form ChangeOrRemoveApplicationUI
     *
     * @param eventCenter
     * @param logedUser
     */
    public ChangeOrRemoveApplicationUI(EventCenter eventCenter, String logedUser) {
        controller = new ChangeOrRemoveApplicationController(eventCenter);
        this.logedUser = logedUser;
        initComponents();
        keywordJList.setModel(modelKeywordList);
        productsJList.setModel(modelProductList);

        listEvents = controller.getEventsList();

        fillComboBox();
        disableAll();

        setVisible(true);
    }

    private void fillComboBox() {

        for (int i = 0; i < listEvents.size(); i++) {
            Event e = listEvents.getEvent(i);
            for (int j = 0; j < e.getApplicationsList().size(); j++) {
                Application a = e.getApplicationsList().getApplication(j);
                if (!a.isEvaluated()) {
                    if (a.getUser().equals(logedUser)) {
                        applicationsComboBox.addItem(a);
                    }
                }
            }
        }
    }

    private void disableAll() {
        if (applicationsComboBox.getItemCount() == 0) {
            addKeywordBtn.setEnabled(false);
            addProductBtn.setEnabled(false);
            removeKeywordBtn.setEnabled(false);
            removeProductBtn.setEnabled(false);
            areaTextField.setEnabled(false);
            enterpriseNameTextField.setEnabled(false);
            taxpayerNumberTextField.setEnabled(false);
            contactNumberTextField.setEnabled(false);
            emailTextField.setEnabled(false);
            addressTextField.setEnabled(false);
            keywordTextField.setEnabled(false);
            productsTextField.setEnabled(false);
            invitesTextField.setEnabled(false);
            descriptionTextArea.setEnabled(false);
            removeApplicationCheckBox.setEnabled(false);
            saveChangesBtn.setEnabled(false);
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
        applicationsComboBox = new javax.swing.JComboBox<Application>();
        cancelBtn = new javax.swing.JButton();
        saveChangesBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        enterpriseNameTextField = new javax.swing.JTextField();
        taxpayerNumberTextField = new javax.swing.JTextField();
        contactNumberTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        addKeywordBtn = new javax.swing.JButton();
        keywordTextField = new javax.swing.JTextField();
        removeKeywordBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        keywordJList = new javax.swing.JList<Keyword>();
        areaTextField = new javax.swing.JTextField();
        invitesTextField = new javax.swing.JTextField();
        productsTextField = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        productsJList = new javax.swing.JList<Product>();
        addProductBtn = new javax.swing.JButton();
        removeProductBtn = new javax.swing.JButton();
        removeApplicationCheckBox = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change/Remove Application");
        setResizable(false);

        jLabel1.setText("Submitted Applications:");

        applicationsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationsComboBoxActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        saveChangesBtn.setText("Save Changes");
        saveChangesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Enterprise name:");

        jLabel3.setText("Taxpayer number:");

        jLabel4.setText("Contact number:");

        jLabel5.setText("Email:");

        jLabel6.setText("Address:");

        jLabel7.setText("Description:");

        jLabel8.setText("Keywords:");

        jLabel9.setText("Pretended stand area:");

        jLabel10.setText("Invites:");

        jLabel11.setText("Products:");

        enterpriseNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseNameTextFieldActionPerformed(evt);
            }
        });

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        addKeywordBtn.setText("Add Keyword");
        addKeywordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addKeywordBtnActionPerformed(evt);
            }
        });

        removeKeywordBtn.setText("Remove Keyword");
        removeKeywordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeKeywordBtnActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(keywordJList);

        areaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTextFieldActionPerformed(evt);
            }
        });

        productsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsTextFieldActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(productsJList);

        addProductBtn.setText("Add Product");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });

        removeProductBtn.setText("Remove Product");
        removeProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProductBtnActionPerformed(evt);
            }
        });

        removeApplicationCheckBox.setBackground(new java.awt.Color(255, 204, 204));
        removeApplicationCheckBox.setText("Delete Application");
        removeApplicationCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeApplicationCheckBoxActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete-icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(applicationsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removeProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(addKeywordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(keywordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(removeKeywordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(6, 6, 6))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(invitesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(removeApplicationCheckBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextField)
                            .addComponent(jScrollPane1)
                            .addComponent(addressTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxpayerNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(saveChangesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(applicationsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(taxpayerNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(contactNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keywordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addKeywordBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeKeywordBtn)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invitesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(productsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addProductBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeProductBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeApplicationCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveChangesBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveChangesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesBtnActionPerformed
        try {

            if (removeApplicationCheckBox.isSelected()) {
                Application a = (Application) applicationsComboBox.getSelectedItem();
                for (int i = 0; i < listEvents.size(); i++) {
                    Event e = listEvents.getEvent(i);
                    for (int j = 0; j < e.getApplicationsList().size(); j++) {
                        Application b = e.getApplicationsList().getApplication(j);
                        if (a.equals(b)) {
                            int reply = JOptionPane.showConfirmDialog(null, "Do you really wish to delete the application?", "Delete Application?", JOptionPane.YES_NO_OPTION);
                            if (reply == JOptionPane.YES_OPTION) {
                                e.getApplicationsList().removeApplication(j);
                                JOptionPane.showMessageDialog(null, "Application deleted with success!");
                                dispose();
                            }

                        }
                    }
                }
            } else {
                if (validateTaxpayerNumber() && validateContact() && validateInvites()) {
                    String enterpriseName = enterpriseNameTextField.getText();
                    String email = emailTextField.getText();
                    String address = addressTextField.getText();
                    String description = descriptionTextArea.getText();
                    float area = Float.parseFloat(areaTextField.getText());
                    int invites = Integer.parseInt(invitesTextField.getText());
                    int taxpayerNumber = Integer.parseInt(taxpayerNumberTextField.getText());
                    int contactNumber = Integer.parseInt(contactNumberTextField.getText());

                    Application application = (Application) applicationsComboBox.getSelectedItem();
                    Enterprise enterprise = application.getEnterprise();

                    enterprise.setName(enterpriseName);
                    enterprise.setAddress(address);
                    enterprise.setContact(contactNumber);
                    enterprise.setEmail(email);
                    enterprise.setTaxpayerNumber(taxpayerNumber);
                    application.setDescription(description);
                    application.setInvites(invites);
                    application.setArea(area);

                    KeywordList keywordList = new KeywordList();
                    ProductList productList = new ProductList();
                    for (int i = 0; i < modelKeywordList.size(); i++) {
                        keywordList.addKeyword(modelKeywordList.getElementAt(i));
                    }
                    for (int i = 0; i < modelProductList.size(); i++) {
                        productList.addProduct(modelProductList.getElementAt(i));
                    }

                    application.setKeywordList(keywordList);
                    application.setProductList(productList);

                    JOptionPane.showMessageDialog(null, "Application data changed with success!");
                    dispose();
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "You didn't submit any applications!");
        } catch(NumberFormatException a){
            JOptionPane.showMessageDialog(null, "Incompleted data fields!");
        }
    }//GEN-LAST:event_saveChangesBtnActionPerformed

    private boolean validateInvites() {
        String stringInvites = invitesTextField.getText();
        try {
            int invites = Integer.parseInt(stringInvites);
            if (invites <= 0) {
                JOptionPane.showMessageDialog(null, "Insert a number above zero");
                invitesTextField.setText("");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid format for invites (only numbers)");
            invitesTextField.setText("");
            return false;
        }
        return true;
    }

    private boolean validateContact() {
        String stringContact = contactNumberTextField.getText();
        try {
            int contactNumber = Integer.parseInt(contactNumberTextField.getText());
            if (stringContact.length() == 9) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Insert 9 digits on contact text field");
                contactNumberTextField.setText("");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid format in contact Number(only numbers))");
            contactNumberTextField.setText("");
            return false;
        }
    }

    private boolean validateTaxpayerNumber() {
        String stringTaxpayer = taxpayerNumberTextField.getText();
        try {
            int taxpayerNumber = Integer.parseInt(taxpayerNumberTextField.getText());
            if (stringTaxpayer.length() == 9) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Insert 9 digits on taxpayer number text field");
                taxpayerNumberTextField.setText("");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid format in Taxpayer Number(only numbers))");
            taxpayerNumberTextField.setText("");
            return false;
        }
    }

    private void applicationsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationsComboBoxActionPerformed
        modelKeywordList.removeAllElements();
        modelProductList.removeAllElements();
        Application application = (Application) applicationsComboBox.getSelectedItem();

        for (int i = 0; i < application.getKeywordList().size(); i++) {
            modelKeywordList.addElement(application.getKeywordList().getKeyword(i));
        }
        for (int i = 0; i < application.getProductList().size(); i++) {
            modelProductList.addElement(application.getProductList().getProduct(i));
        }

        enterpriseNameTextField.setText(application.getEnterprise().getName());
        taxpayerNumberTextField.setText(String.valueOf(application.getEnterprise().getTaxpayerNumber()));
        contactNumberTextField.setText(String.valueOf(application.getEnterprise().getContact()));
        emailTextField.setText(application.getEnterprise().getEmail());
        addressTextField.setText(application.getEnterprise().getAddress());
        descriptionTextArea.setText(application.getDescription());
        areaTextField.setText(String.valueOf(application.getArea()));
        invitesTextField.setText(String.valueOf(application.getInvites()));
    }//GEN-LAST:event_applicationsComboBoxActionPerformed

    private void enterpriseNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameTextFieldActionPerformed

    private void addKeywordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addKeywordBtnActionPerformed
        String stringKeyword = keywordTextField.getText();
        if (!stringKeyword.isEmpty()) {
            Keyword keyword = new Keyword(stringKeyword);
            modelKeywordList.addElement(keyword);
            keywordTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please insert a keyword");
        }
    }//GEN-LAST:event_addKeywordBtnActionPerformed

    private void areaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTextFieldActionPerformed

    private void removeProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProductBtnActionPerformed
        try {
            Product p = modelProductList.getElementAt(productsJList.getSelectedIndex());
            modelProductList.removeElement(p);
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "No product selected!");
        }
    }//GEN-LAST:event_removeProductBtnActionPerformed

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        String stringProduct = productsTextField.getText();
        if (!stringProduct.isEmpty()) {
            Product product = new Product(stringProduct);
            modelProductList.addElement(product);
            productsTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please insert a product");
        }
    }//GEN-LAST:event_addProductBtnActionPerformed

    private void removeKeywordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeKeywordBtnActionPerformed
        try {
            Keyword k = modelKeywordList.getElementAt(keywordJList.getSelectedIndex());
            modelKeywordList.removeElement(k);
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "No keyword selected!");
        }
    }//GEN-LAST:event_removeKeywordBtnActionPerformed

    private void productsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productsTextFieldActionPerformed

    private void removeApplicationCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeApplicationCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeApplicationCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addKeywordBtn;
    private javax.swing.JButton addProductBtn;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JComboBox<Application> applicationsComboBox;
    private javax.swing.JTextField areaTextField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField contactNumberTextField;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JTextField invitesTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<Keyword> keywordJList;
    private javax.swing.JTextField keywordTextField;
    private javax.swing.JList<Product> productsJList;
    private javax.swing.JTextField productsTextField;
    private javax.swing.JCheckBox removeApplicationCheckBox;
    private javax.swing.JButton removeKeywordBtn;
    private javax.swing.JButton removeProductBtn;
    private javax.swing.JButton saveChangesBtn;
    private javax.swing.JTextField taxpayerNumberTextField;
    // End of variables declaration//GEN-END:variables
}
