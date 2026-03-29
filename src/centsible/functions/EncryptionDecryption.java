package centsible.functions;

import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author lukea
 */
public class EncryptionDecryption {
    final String ALGORITHM = "AES";
    final String KEY = "1Hbfh667adfDEJ78";   
    
    public String encrypt(String value) {
        String b64value = "";
        try {
            Key key = generateKey();
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedByteValue = cipher.doFinal(value.getBytes("utf-8"));
            b64value = Base64.getEncoder().encodeToString(encryptedByteValue);
        } catch (Exception e) {
            System.out.println("Error in Encrypt: " + e);
        }
        return b64value;
    }
    
    public String decrypt(String value) {
        String decryptedValue = "";
        try {
            Key key = generateKey();
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decryptedValue64 = Base64.getDecoder().decode(value);
            byte[] decryptedByteValue = cipher.doFinal(decryptedValue64);
            decryptedValue = new String(decryptedByteValue, "utf-8");
        } catch (Exception e) {
            System.out.println("Error in Decrypt: " + e);
        }
        return decryptedValue;
    }
    
    public Key generateKey() throws Exception {
        Key key = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
        return key;
    }
}
