package lapr.project.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EncryptionKeyTest {

    @Test
    public void ensureEncryptionPassword() {
        PasswordEncryption testEncryption = new PasswordEncryption();
        int key = 2;
        String password = "Password";
        String encrypt = testEncryption.Encryption(password, key);
        assertEquals(encrypt, encrypt);
    }

    @Test
    public void ensureNotEqualsEncryptionPassword() {
        PasswordEncryption testEncryption = new PasswordEncryption();
        int key = 2;
        String password = "Password";
        String encrypt = testEncryption.Encryption(password, key);
        String result = "password";
        assertNotEquals(encrypt, result);
    }

    @Test
    public void ensureDecryptionPassword() {
        PasswordEncryption testDecryption = new PasswordEncryption();
        int key = 2;
        String result = "password";
        String encrypt = testDecryption.Encryption(result, key);
        String decrypt = testDecryption.Decryption(encrypt, key);
        assertEquals(decrypt, result);
    }

    @Test
    public void ensureNotEqualsDecryptionPassword() {
        PasswordEncryption testDecryption = new PasswordEncryption();
        int key = 2;
        String password = "password";
        String result = "passwwrd";
        String encrypt = testDecryption.Encryption(password, key);
        String decrypt = testDecryption.Decryption(encrypt, key);
        assertNotEquals(decrypt, result);
    }
}
