package lapr.project.ui;

import java.util.ArrayList;
import javax.accessibility.AccessibleRelation;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.EventEmployeeList;
import lapr.project.model.PasswordEncryption;
import lapr.project.model.User;
import lapr.project.model.UserRegistry;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class LoginUI extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private boolean loginStatus;
    private boolean userStatus = false;
    private boolean organizerStatus = false;
    private boolean eventEmployeeStatus = false;
    private boolean eventManagerStatus = false;
    private EventCenter eventCenter;
    private JLabel label;
    private MainWindow mainWindow;

    private User user;

    /**
     * Creates new form LoginUI
     *
     * @param loginStatus
     * @param eventCenter
     * @param label
     * @param userStatus
     * @param organizerStatus
     * @param eventEmployeeStatus
     * @param eventManagerStatus
     * @param logedUser
     */
    public LoginUI(boolean loginStatus, EventCenter eventCenter, JLabel label, boolean userStatus, boolean organizerStatus, boolean eventEmployeeStatus, boolean eventManagerStatus, MainWindow mainWindow) {
        this.loginStatus = loginStatus;
        this.eventCenter = eventCenter;
        this.label = label;
        this.userStatus = userStatus;
        this.organizerStatus = organizerStatus;
        this.eventEmployeeStatus = eventEmployeeStatus;
        this.eventManagerStatus = eventManagerStatus;
        this.userStatus = userStatus;
        this.organizerStatus = organizerStatus;
        this.eventEmployeeStatus = eventEmployeeStatus;
        this.eventManagerStatus = eventManagerStatus;
        this.mainWindow = mainWindow;
        initComponents();
        this.setVisible(true);
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
        idTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        loginImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jLabel1.setText("Username / Email:");

        jLabel2.setText("Password:");

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ok-icon (1).png"))); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        loginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(loginImage, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTextField)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(loginButton))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(loginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        loginConfirmation();

    }//GEN-LAST:event_loginButtonActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
     loginConfirmation();       
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginConfirmation() {
        mainWindow.setLoginStatus(false);
        mainWindow.setUserStatus(false);
        mainWindow.setOrganizerStatus(false);
        mainWindow.setEventEmployeeStatus(false);
        mainWindow.setEventManagerStatus(false);
        mainWindow.updateLogin();
        UserRegistry userRegistry = eventCenter.getUserRegistry();
        String loginName = idTextField.getText();
        String passwordInfo = new String(passwordField.getPassword());
        PasswordEncryption encrypt = new PasswordEncryption();
        passwordInfo = encrypt.Encryption(passwordInfo);
        for (int i = 0; i < userRegistry.size(); i++) {
            System.out.println(i);
            if (userRegistry.getUser(i).getEmail().equals(loginName) || userRegistry.getUser(i).getUserName().equals(loginName)) {
                if (passwordInfo.equals(userRegistry.getUser(i).getPassword())) {
                    userStatus = true;
                    loginStatus = true;
                    this.user = userRegistry.getUser(i);
                    label.setText(user.getUserName());
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password!");
                }
                if (loginStatus) {
                    this.organizerStatus = checkForOrganizerStatus(user);
                    this.eventEmployeeStatus = checkForEventEmployeeStatus(user);
                    this.eventManagerStatus = checkForEventManagerStatus(user);
                    break;
                }
            }
        }
        if (validateLoginStatus()) {
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "The user does not exist or invalid login info");
        }
        System.out.println("User:" + userStatus);
        System.out.println("Organizer:" + organizerStatus);
        System.out.println("Event Employee:" + eventEmployeeStatus);
        System.out.println("EventManager:" + eventManagerStatus);
        System.out.println("Login Status:" + loginStatus);

    }

    private boolean validateLoginStatus() {
        if (isLoginStatus()) {
            mainWindow.setLoginStatus(isLoginStatus());
            mainWindow.setUserStatus(isUserStatus());
            mainWindow.setOrganizerStatus(isOrganizerStatus());
            mainWindow.setEventEmployeeStatus(isEventEmployeeStatus());
            mainWindow.setEventManagerStatus(isEventManagerStatus());
            mainWindow.updateLogin();
            JOptionPane.showMessageDialog(null, "Success");
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return
     */
    public boolean isLoginStatus() {
        return loginStatus;
    }

    /**
     *
     * @return
     */
    public boolean isUserStatus() {
        return userStatus;
    }

    /**
     *
     * @return
     */
    public boolean isEventEmployeeStatus() {
        return eventEmployeeStatus;
    }

    /**
     *
     * @return
     */
    public boolean isEventManagerStatus() {
        return eventManagerStatus;
    }

    /**
     *
     * @return
     */
    public boolean isOrganizerStatus() {
        return organizerStatus;
    }

    /**
     *
     * @return
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }

    private boolean checkForEventManagerStatus(User user) {
        for (int i = 0; i < eventCenter.getEventManagerList().size(); i++) {
            if (eventCenter.getEventManagerList().getEventManager(i).getEmail().equals(user.getEmail()) || eventCenter.getEventManagerList().getEventManager(i).getUsername().equals(user.getUserName())) {
                return true;
            }
        }
        return false;
    }

    private boolean checkForEventEmployeeStatus(User user) {
        ArrayList<Event> events = eventCenter.getEventRegistry().getEventList();
        for (Event event : events) {
            EventEmployeeList employeeList = event.getEventEmployeeList();
            for (int j = 0; j < employeeList.size(); j++) {
                if (employeeList.getEmployee(j).getEmail().equals(user.getEmail()) || employeeList.getEmployee(j).getUsername().equals(user.getUserName())) {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean checkForOrganizerStatus(User user) {
        ArrayList<Event> events = eventCenter.getEventRegistry().getEventList();
        for (Event event : events) {
            for (int i = 0; i < event.getOrganizerList().size(); i++) {
                if (event.getOrganizerList().getOrganizer(i).getEmail().equals(user.getEmail()) || event.getOrganizerList().getOrganizer(i).getUsername().equals(user.getUserName())) {
                    return true;
                }
            }
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginImage;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
