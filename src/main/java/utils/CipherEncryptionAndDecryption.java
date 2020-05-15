package utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CipherEncryptionAndDecryption {
    public static String encrypt(String strClearText, String strKey) {
        try {
            SecretKeySpec sKeySpec = new SecretKeySpec(strKey.getBytes(StandardCharsets.UTF_8), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, sKeySpec);
            byte[] encrypted = cipher.doFinal(strClearText.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

}
