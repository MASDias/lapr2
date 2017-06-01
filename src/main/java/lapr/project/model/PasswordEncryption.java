package lapr.project.model;

/**
 *
 * @author
 */
public class PasswordEncryption {

    private static final int[] shift = {125, 10, 20, 896, 45, 11, 637, 200, 193, 469};

    public String Encryption(String password, int encryptKey) {
        String encrytion = "";
        char ch;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            ch += shift[encryptKey];
            encrytion += ch;
        }
        return encrytion;
    }

    public String Decryption(String encrypted, int decryptKey) {
        String decryption = "";
        char ch;
        for (int i = 0; i < encrypted.length(); i++) {
            ch = encrypted.charAt(i);
            ch -= shift[decryptKey];
            decryption += ch;
        }
        return decryption;
    }
}
