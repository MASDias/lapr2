/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.text.ParseException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import lapr.project.controller.DecideApplicationController;
import lapr.project.model.Application;
import lapr.project.model.ApplicationList;
import lapr.project.model.Assignment;
import lapr.project.model.Enterprise;
import lapr.project.model.Review;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.EventEmployee;
import lapr.project.model.EventRegistry;
import lapr.project.model.User;
import lapr.project.model.UserRegistry;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class DecideApplicationUI extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private EventEmployee eventEmployee;
    private ApplicationList applicationList;
    private DecideApplicationController controller;
    private DefaultListModel<Application> modelApplicationList = new DefaultListModel<>();
    private String logedUser;
    private UserRegistry listUsers;
    private EventRegistry listEvents;
    private Assignment assignment;
    private Event ev;

    /**
     * Creates new form DecideApplicationUI
     *
     * @param logedUser
     * @param eventCenter
     * @throws java.text.ParseException
     */
    public DecideApplicationUI(String logedUser, EventCenter eventCenter) throws ParseException {
        initComponents();
        try {
            this.logedUser = logedUser;
            this.controller = new DecideApplicationController(eventCenter);

            applicationJList.setModel(modelApplicationList);
            listUsers = controller.getUsersList();
            listEvents = controller.getEventsList();
            for (int i = 0; i < listEvents.size(); i++) {
                ev = listEvents.getEvent(i);
                for (int j = 0; j < ev.getEventEmployeeList().size(); j++) {
                    if (ev.getEventEmployeeList().getEmployee(j).getUsername().equals(logedUser)) {
                        eventEmployee = ev.getEventEmployeeList().getEmployee(j);
                    }
                }
            }
            applicationList = new ApplicationList();

            for (int i = 0; i < listEvents.size(); i++) {
                Event event = listEvents.getEvent(i);
                for (int j = 0; j < event.getApplicationsList().size(); j++) {
                    Application a = event.getApplicationsList().getApplication(j);
                    for (int k = 0; k < a.getReviewList().size(); k++) {
                        Review review = a.getReviewList().get(k);
                        if (!a.isEvaluated()) {
                            if (review.getAssignment().getEventEmployee().getUsername().equals(eventEmployee.getUsername())) {
                                applicationList.addApplication(a);
                            }
                        }
                    }
                }
            }

            initLists();
            this.setVisible(true);
        } catch (NullPointerException expt) {
            JOptionPane.showMessageDialog(null, "You don't have any applications to review");
            this.dispose();
        }

    }

    private void initLists() {
        for (int j = 0; j < applicationList.size(); j++) {
            modelApplicationList.addElement(applicationList.getApplication(j));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        enterpriseNameTextField = new javax.swing.JTextField();
        invitationTextField = new javax.swing.JTextField();
        knowledgeCombobox = new javax.swing.JComboBox<String>();
        applicationEvalCombobox = new javax.swing.JComboBox<String>();
        inviteReviewCombobox = new javax.swing.JComboBox<String>();
        overallReviewCombobox = new javax.swing.JComboBox<String>();
        evaluateBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        applicationJList = new javax.swing.JList<Application>();
        jLabel5 = new javax.swing.JLabel();
        chooseApplicationBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        eventNameTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        justificationTextArea = new javax.swing.JTextArea();
        justifiedTextTextArea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Decide Application");
        setResizable(false);

        jLabel1.setText("Knowledge about the event topic:");

        jLabel2.setText("Application adequacy for the event:");

        jLabel3.setText("Invitations quantity adequacy for the application:");

        jLabel4.setText("Overall recomendation:");

        jLabel6.setText("Enterprise Name:");

        jLabel7.setText("Number of invites requested:");

        jLabel8.setText("Description:");

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descriptionTextArea);

        enterpriseNameTextField.setEditable(false);

        invitationTextField.setEditable(false);

        knowledgeCombobox.setMaximumRowCount(6);
        knowledgeCombobox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "0", "1", "2", "3", "4", "5" }));

        applicationEvalCombobox.setMaximumRowCount(6);
        applicationEvalCombobox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "0", "1", "2", "3", "4", "5" }));

        inviteReviewCombobox.setMaximumRowCount(6);
        inviteReviewCombobox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "0", "1", "2", "3", "4", "5" }));

        overallReviewCombobox.setMaximumRowCount(6);
        overallReviewCombobox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "0", "1", "2", "3", "4", "5" }));

        evaluateBtn.setText("Evaluate");
        evaluateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluateBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(applicationJList);

        jLabel5.setText("List of Applications");

        chooseApplicationBtn.setText("Choose application");
        chooseApplicationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseApplicationBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Event:");

        eventNameTextField.setEditable(false);

        justificationTextArea.setColumns(20);
        justificationTextArea.setRows(5);
        jScrollPane3.setViewportView(justificationTextArea);

        justifiedTextTextArea.setText("Justification:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chooseApplicationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eventNameTextField)
                                    .addComponent(enterpriseNameTextField)
                                    .addComponent(invitationTextField)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(overallReviewCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inviteReviewCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(applicationEvalCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(knowledgeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(justifiedTextTextArea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(evaluateBtn)
                                        .addGap(67, 67, 67)
                                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chooseApplicationBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invitationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(eventNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(knowledgeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(applicationEvalCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inviteReviewCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(overallReviewCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(justifiedTextTextArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(evaluateBtn)
                    .addComponent(exitBtn))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void evaluateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluateBtnActionPerformed
        try{
        int knowledge = Integer.parseInt(knowledgeCombobox.getSelectedItem().toString());
        int applicationEval = Integer.parseInt(applicationEvalCombobox.getSelectedItem().toString());
        int inviteEval = Integer.parseInt(inviteReviewCombobox.getSelectedItem().toString());
        int overall = Integer.parseInt(overallReviewCombobox.getSelectedItem().toString());
        String justification = justificationTextArea.getText();

        Application a = modelApplicationList.getElementAt(applicationJList.getSelectedIndex());
        for (int i = 0; i < listEvents.size(); i++) {
            Event e = listEvents.getEvent(i);
            for (int j = 0; j < e.getApplicationsList().size(); j++) {
                Application b = e.getApplicationsList().getApplication(j);
                if (b.equals(a)) {
                    for (int k = 0; k < b.getReviewList().size(); k++) {
                        Review review = b.getReviewList().get(k);
                        if (review.getAssignment().getEventEmployee().getUsername().equals(logedUser)) {
                            review.setTextDescription(justification);
                            review.updateMeanValue(knowledge, applicationEval, inviteEval, overall);
                            b.setEvaluated(true);
                        }
                    }

                }
            }
        }

        modelApplicationList.remove(applicationJList.getSelectedIndex());
        JOptionPane.showMessageDialog(null, "Application successfully reviewed!");
        justificationTextArea.setText("");
        clearFields();
        resetEvals();
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "No application selected!");
        }
    }//GEN-LAST:event_evaluateBtnActionPerformed
    private void clearFields() {
        eventNameTextField.setText("");
        invitationTextField.setText("");
        descriptionTextArea.setText("");
        enterpriseNameTextField.setText("");
    }

    private void resetEvals() {
        knowledgeCombobox.setSelectedIndex(0);
        inviteReviewCombobox.setSelectedIndex(0);
        applicationEvalCombobox.setSelectedIndex(0);
        overallReviewCombobox.setSelectedIndex(0);
    }
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void chooseApplicationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseApplicationBtnActionPerformed
        try{
        enterpriseNameTextField.setText(applicationJList.getSelectedValue().getEnterprise().getName());
        descriptionTextArea.setText(applicationJList.getSelectedValue().getDescription());
        invitationTextField.setText(String.valueOf(applicationJList.getSelectedValue().getInvites()));
        eventNameTextField.setText(ev.getTitle());
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No application selected!");
        }
    }//GEN-LAST:event_chooseApplicationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> applicationEvalCombobox;
    private javax.swing.JList<Application> applicationJList;
    private javax.swing.JButton chooseApplicationBtn;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JButton evaluateBtn;
    private javax.swing.JTextField eventNameTextField;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField invitationTextField;
    private javax.swing.JComboBox<String> inviteReviewCombobox;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea justificationTextArea;
    private javax.swing.JLabel justifiedTextTextArea;
    private javax.swing.JComboBox<String> knowledgeCombobox;
    private javax.swing.JComboBox<String> overallReviewCombobox;
    // End of variables declaration//GEN-END:variables
}