package lapr.project.model;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class User implements Serializable{
private static final long serialVersionUID = 1;
    private static final String AT = "@";
    private int key;
    private String name;
    private String email;
    private String userName;
    private String password;
    private boolean userStatus = false;
    private PasswordEncryption encryption;

    /**
     *
     * @param name
     * @param email
     * @param userName
     * @param password
     */
    public User(String name, String email, String userName, String password) {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.key = (int) (0 + Math.random() * 9);
        this.password = password;
        this.userStatus = true;
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
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    private boolean validateName() {
        Pattern p = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(this.name);
        boolean b = m.find();
        if (!b) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public boolean validateData() {
        if (validateName()) {
            if (validateEmail()) {
                if (validateUsername()) {
                    if (validatePassword()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean validateEmail() {
        if (this.email.split(AT).length == 2) {
            return true;
        }
        return false;
    }

    private boolean validateUsername() {
        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(this.userName);
        boolean b = m.find();
        if (!b) {
            return true;
        }
        return false;
    }

    private boolean validatePassword() {
        Pattern letter = Pattern.compile("[a-zA-z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[.,!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher letters = letter.matcher(this.password);
        Matcher number = digit.matcher(this.password);
        Matcher specialChar = special.matcher(this.password);
        if (letters.find()) {
            if (number.find()) {
                if (specialChar.find()) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }

    /**
     *
     * @return
     */
    public int getKey() {
        return key;
    }

    /**
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Name:" + name + "; Username:" + userName + "; Email:" + email;
    }
}
