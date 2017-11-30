/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import lapr.project.controller.DefineEventManagerController;
import lapr.project.model.EventCenter;
import lapr.project.model.EventManager;
import lapr.project.model.EventManagerList;
import lapr.project.model.EventRegistry;
import lapr.project.model.User;
import lapr.project.model.UserRegistry;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class DefineEventManager extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private EventCenter eventCenter;
    private DefineEventManagerController controller;
    private DefaultListModel<User> modelUsersList = new DefaultListModel<>();
    private DefaultListModel<EventManager> modelEventManagersList = new DefaultListModel<>();
    private UserRegistry listUsers;
    private EventManagerList listEventManagers;
    private EventRegistry listEvents;

    /**
     * Creates new form DefineEventManager
     *
     * @param eventCenter
     */
    public DefineEventManager(EventCenter eventCenter) {
        this.eventCenter = eventCenter;
        controller = new DefineEventManagerController(this.eventCenter);

        initComponents();

        listEventManagers = controller.getEventManagerList();
        eventManagerJList.setModel(modelEventManagersList);
        for (int i = 0; i < listEventManagers.size(); i++) {
            modelEventManagersList.addElement(listEventManagers.getEventManager(i));
        }
        
        listUsers = controller.getUsersList();
        userJList.setModel(modelUsersList);
        for (int i = 0; i < listUsers.size(); i++) {
            User u = listUsers.getUser(i);
            modelUsersList.addElement(u);
            validateUsersList();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        userJList = new javax.swing.JList<User>();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventManagerJList = new javax.swing.JList<EventManager>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addUserBtn = new javax.swing.JButton();
        removeUserBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        eventManagerTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Define Event Manager");
        setResizable(false);

        jScrollPane2.setViewportView(userJList);

        jScrollPane1.setViewportView(eventManagerJList);

        jLabel2.setText("Users List:");

        jLabel3.setText("Event Manager:");

        addUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-icon.png"))); // NOI18N
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        removeUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close-2-icon.png"))); // NOI18N
        removeUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserBtnActionPerformed(evt);
            }
        });

        okBtn.setText("Save");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Define Event Manager By ID:");

        eventManagerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventManagerTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Magnifier-icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventManagerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 177, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addUserBtn)
                        .addGap(18, 18, 18)
                        .addComponent(removeUserBtn)
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(eventManagerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelBtn)
                    .addComponent(okBtn))
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void validateUsersList() {
        for (int i = 0; i < modelEventManagersList.size(); i++) {
            for (int j = 0; j < modelUsersList.size(); j++) {

                if (modelEventManagersList.getElementAt(i).getUsername().equals(modelUsersList.getElementAt(j).getUserName())) {
                    modelUsersList.remove(j);
                }
            }
        }
    }
    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        try {
            User u = modelUsersList.getElementAt(userJList.getSelectedIndex());
            EventManager em = new EventManager(u);
            listEventManagers.addEventManager(em);
            modelEventManagersList.addElement(em);
            modelUsersList.removeElement(u);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No user selected");
        }

    }//GEN-LAST:event_addUserBtnActionPerformed

    private void removeUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserBtnActionPerformed
        try {
            EventManager em = modelEventManagersList.getElementAt(eventManagerJList.getSelectedIndex());
            for (int i = 0; i < listUsers.size(); i++) {
                User u = listUsers.getUser(i);
                if (u.getUserName().equals(em.getEventManager().getUserName())) {
                    modelUsersList.addElement(u);
                }
            }
            modelEventManagersList.removeElement(em);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No event manager selected");
        }    }//GEN-LAST:event_removeUserBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        for (int i = 0; i < listEventManagers.size(); i++) {
            listEventManagers.addEventManager(modelEventManagersList.elementAt(i));
        }
        JOptionPane.showMessageDialog(null, "Event Managers defined with success!");
        dispose();

    }//GEN-LAST:event_okBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        modelEventManagersList.removeAllElements();
        revalidate();
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void eventManagerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventManagerTextFieldActionPerformed

        String userID = eventManagerTextField.getText();
        if (!validateEventManager(userID)) {
            int cont = 0;
            for (int i = 0; i < listUsers.size(); i++) {
                User u = listUsers.getUser(i);
                if (u.getUserName().equals(userID) || u.getEmail().equals(userID)) {
                    EventManager e = new EventManager(u);
                    listEventManagers.addEventManager(e);
                    modelEventManagersList.addElement(e);
                    modelUsersList.removeElement(u);
                    cont++;
                }
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "Given user doesn't exist");
            }
            cont = 0;
        } else {
            JOptionPane.showMessageDialog(null, "That user is already a Event Manager");
        }

        eventManagerTextField.setText("");
    }//GEN-LAST:event_eventManagerTextFieldActionPerformed

    /**
     *
     * @param id
     * @return
     */
    public boolean validateEventManager(String id) {
        for (int i = 0; i < listEventManagers.size(); i++) {
            String[] split = listEventManagers.getEventManager(i).toString().split("; ");
            split[0] = split[0].split(":")[1];
            split[1] = split[1].split(":")[1];
            split[2] = split[2].split(":")[1];
            if (split[1].equals(id) || split[2].equals(id)) {
                return true;
            }
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
//    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JList<EventManager> eventManagerJList;
    private javax.swing.JTextField eventManagerTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton okBtn;
    private javax.swing.JButton removeUserBtn;
    private javax.swing.JList<User> userJList;
    // End of variables declaration//GEN-END:variables
}
