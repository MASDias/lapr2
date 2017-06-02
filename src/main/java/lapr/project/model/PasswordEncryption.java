package lapr.project.model;

/**
 *
 * @author
 */
public class PasswordEncryption {

    private static final int[] KEY = {125, 10, 20, 896, 45, 11, 637, 200, 193, 469};

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
