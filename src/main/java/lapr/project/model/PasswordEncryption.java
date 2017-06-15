package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author
 */
public class PasswordEncryption implements Serializable{
private static final long serialVersionUID = 1;
    private static final int[] KEY = {125, 10, 20, 896, 45, 11, 637, 200, 193, 469};
    
    /**
     *
     * @param password
     * @param encryptKey
     * @return
     */
    public String Encryption(String password, int encryptKey) {
        String encrytion = "";
        char character;
        for (int i = 0; i < password.length(); i++) {
            character = password.charAt(i);
            character += KEY[encryptKey];
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
    public String Decryption(String encrypted, int decryptKey) {
        String decryption = "";
        char character;
        for (int i = 0; i < encrypted.length(); i++) {
            character = encrypted.charAt(i);
            character -= KEY[decryptKey];
            decryption += character;
        }
        return decryption;
    }
}
