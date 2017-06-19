/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import lapr.project.controller.DefineOrganizerController;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.EventRegistry;
import lapr.project.model.Organizer;
import lapr.project.model.OrganizersList;
import lapr.project.model.User;
import lapr.project.model.UserRegistry;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class DefineOrganizer extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private EventCenter eventCenter;
    private UserRegistry listUsers;
    private OrganizersList listOrganizers;
    private EventRegistry listEvents;
    private DefaultListModel<User> modelUsersList = new DefaultListModel<>();
    private DefaultListModel<Organizer> modelOrganizersList = new DefaultListModel<>();
    private DefineOrganizerController controller;
    private Event event;

    /**
     * Creates new form DefineOrganizer
     * @param eventCenter
     */
    public DefineOrganizer(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
        controller = new DefineOrganizerController(this.eventCenter);
        initComponents();

        listOrganizers = new OrganizersList();
        organizerJList.setModel(modelOrganizersList);

        listUsers = controller.getUsersList();
        userJList.setModel(modelUsersList);
        for (int i = 0; i < listUsers.size(); i++) {
            modelUsersList.addElement(listUsers.getUser(i));
        }

        listEvents = controller.getEventsList();
        for (int i = 0; i < listEvents.size(); i++) {
            eventComboBox.addItem(listEvents.getEvent(i));
        }

        setVisible(true);
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
        cancelBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        eventComboBox = new javax.swing.JComboBox<Event>();
        removeUserBtn = new javax.swing.JButton();
        addUserBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizerJList = new javax.swing.JList<Organizer>();
        jScrollPane2 = new javax.swing.JScrollPane();
        userJList = new javax.swing.JList<User>();
        jLabel4 = new javax.swing.JLabel();
        userIDTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Define Organizer");

        jLabel1.setText("Event:");

        cancelBtn.setText("Cancel");

        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        eventComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventComboBoxActionPerformed(evt);
            }
        });

        removeUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close-2-icon.png"))); // NOI18N

        addUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-icon.png"))); // NOI18N
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Organizers:");

        jLabel2.setText("Users List:");

        jScrollPane1.setViewportView(organizerJList);

        jScrollPane2.setViewportView(userJList);

        jLabel4.setText("Add Organizer By ID:");

        userIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magnifier-icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(eventComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userIDTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eventComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(addUserBtn)
                        .addGap(18, 18, 18)
                        .addComponent(removeUserBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(okBtn))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        try {
            if (listEvents.size() == 0) {
                JOptionPane.showMessageDialog(null, "There are no events!");
            } else {
                User u = modelUsersList.getElementAt(userJList.getSelectedIndex());

                if (!checkOrganizer(u.getUserName(), u.getEmail())) {
                    Organizer o = new Organizer(u);
                    modelOrganizersList.addElement(o);
                } else {
                    JOptionPane.showMessageDialog(null, "This user is already in organizers list");
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No user selected");
        }

    }//GEN-LAST:event_addUserBtnActionPerformed

    private boolean checkOrganizer(String username, String email) {
        for (int i = 0; i < modelOrganizersList.size(); i++) {
            if (username.equals(modelOrganizersList.getElementAt(i).getUsername()) || email.equals(modelOrganizersList.getElementAt(i).getEmail())) {
                return true;
            }
        }
        return false;
    }

    public void addOrganizers() {
        event = (Event) eventComboBox.getSelectedItem();
        for (int i = 0; i < modelOrganizersList.size(); i++) {
            event.getOrganizerList().addOrganizer(modelOrganizersList.getElementAt(i));
        }
    }
    
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        addOrganizers();
        JOptionPane.showMessageDialog(null, "Organizers defined with success!");
        dispose();
    }//GEN-LAST:event_okBtnActionPerformed

    private void userIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDTextFieldActionPerformed
        String userID = userIDTextField.getText();
        if (listEvents.size() == 0) {
            JOptionPane.showMessageDialog(null, "There are no events!");
        } else {
            if (!validateOrganizer(userID)) {
                int cont = 0;

                for (int i = 0; i < listUsers.size(); i++) {
                    User u = listUsers.getUser(i);

                    if (u.getUserName().equals(userID) || u.getEmail().equals(userID)) {
                        Organizer o = new Organizer(u);
                        listOrganizers.addOrganizer(o);
                        modelOrganizersList.addElement(o);
                        cont++;
                    }
                }               
                if (cont == 0) {
                    JOptionPane.showMessageDialog(null, "Given user doesn't exist");
                }
                cont = 0;
            } else {
                JOptionPane.showMessageDialog(null, "That user is already a Organizer of that event");
            }
        }
        userIDTextField.setText("");
    }//GEN-LAST:event_userIDTextFieldActionPerformed

    private void eventComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventComboBoxActionPerformed

        event = (Event) eventComboBox.getSelectedItem();

        if (eventComboBox.getSelectedItem().toString().equals(event.toString())) {
            JOptionPane.showMessageDialog(null, "Already Selected");
        } else {
            modelOrganizersList.removeAllElements();
            updateOrganizerModel();
        }
    }//GEN-LAST:event_eventComboBoxActionPerformed

    private void updateOrganizerModel() {
        listOrganizers = event.getOrganizerList();
        for (int i = 0; i < listUsers.size(); i++) {
            if (i < listOrganizers.size()) {
                modelOrganizersList.addElement(listOrganizers.getOrganizer(i));
            }
            modelUsersList.addElement(listUsers.getUser(i));
        }
    }
    
    public boolean validateOrganizer(String id) {
        for (int i = 0; i < modelOrganizersList.size(); i++) {
            String[] split = modelOrganizersList.getElementAt(i).toString().split("; ");
            split[0] = split[0].split(":")[1];
            split[1] = split[1].split(":")[1];
            split[2] = split[2].split(":")[1];
            if (split[1].equals(id) || split[2].equals(id)) {
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<Event> eventComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton okBtn;
    private javax.swing.JList<Organizer> organizerJList;
    private javax.swing.JButton removeUserBtn;
    private javax.swing.JTextField userIDTextField;
    private javax.swing.JList<User> userJList;
    // End of variables declaration//GEN-END:variables
}
