package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author
 */
public class PasswordEncryption implements Serializable {

    private static final long serialVersionUID = 1;

    /**
     *
     * @param password
     * @param encryptKey
     * @return
     */
    public String Encryption(String password) {
        String encrytion = "";
        int encryptKey = password.length() + 10;
        char character;
        for (int i = 0; i < password.length(); i++) {
            character = password.charAt(i);
            character += encryptKey;
            encrytion += character;
        }
        return encrytion;
    }

    /**
     *
     * @param encrypted
     * @param decryptKey
     * @return
     */
    public String Decryption(String encrypted) {
        String decryption = "";
        int decryptKey = encrypted.length() + 10;
        char character;
        for (int i = 0; i < encrypted.length(); i++) {
            character = encrypted.charAt(i);
            character -= decryptKey;
            decryption += character;
        }
        return decryption;
    }
}
