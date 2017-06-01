package lapr.project.model;

import static junit.framework.Assert.assertEquals;
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
        String result = "du?????x";
        assertEquals(encrypt, result);
    }

    @Test
    public void ensureDecryptionPassword() {
        PasswordEncryption testDecryption = new PasswordEncryption();
        int key = 2;
        String encrypted = "du?????x";
        String decrypt = testDecryption.Decryption(encrypted, key);
        String result = "Password";
        assertEquals(decrypt, result);
    }
}
