package com.github.catvod.spider.support.p003AB.p009o;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0916a {
    /* JADX INFO: renamed from: a */
    public static String m2211a(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr;
        int i = 0;
        if (str == null || str.length() % 2 != 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[str.length() / 2];
            while (i < str.length()) {
                int i2 = i + 2;
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
                i = i2;
            }
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = str3.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArr), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: b */
    public static String m2212b(String str, String str2, String str3) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(str3.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m2213c(String str, byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDoFinal) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m2214d(byte[] bArr, byte[] bArr2, String str) {
        byte[] bArrDoFinal;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(2, secretKeySpec);
            bArrDoFinal = cipher.doFinal(bArr);
        } catch (Exception e) {
            SpiderDebug.log(e);
            bArrDoFinal = null;
        }
        return new String(bArrDoFinal);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m2215e(String str, String str2, String str3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(StandardCharsets.UTF_8));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(str.getBytes());
        } catch (Exception unused) {
            return "".getBytes();
        }
    }
}
