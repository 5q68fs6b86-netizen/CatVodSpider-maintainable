package com.github.catvod.utils;

import android.util.Base64;

import java.nio.charset.StandardCharsets;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/** AES/CBC helpers 对应 jar 中 C0082a.m822bo / m809an。 */
public final class AesCbc {

    private AesCbc() {}

    /** 加密 → Base64 NO_WRAP（flag 2） */
    public static String encryptBase64(String plain, String key, String iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE,
                new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES"),
                new IvParameterSpec(iv.getBytes(StandardCharsets.UTF_8)));
        return Base64.encodeToString(cipher.doFinal(plain.getBytes(StandardCharsets.UTF_8)), Base64.NO_WRAP);
    }

    /** Base64 解密 */
    public static String decryptBase64(String cipherText, String key, String iv) {
        try {
            String s = cipherText.replace("\\", "");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE,
                    new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES"),
                    new IvParameterSpec(iv.getBytes(StandardCharsets.UTF_8)));
            return new String(cipher.doFinal(Base64.decode(s, Base64.DEFAULT)), StandardCharsets.UTF_8);
        } catch (Exception e) {
            return cipherText;
        }
    }

    public static String b64encode(String s) {
        if (s == null) return null;
        return Base64.encodeToString(s.getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP);
    }

    public static String b64decode(String s) {
        if (s == null) return null;
        try {
            return new String(Base64.decode(s, Base64.NO_WRAP), StandardCharsets.UTF_8);
        } catch (Exception e) {
            return null;
        }
    }
}
