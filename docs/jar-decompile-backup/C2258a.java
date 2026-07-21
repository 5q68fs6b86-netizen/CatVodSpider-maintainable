package com.github.catvod.spider.support.p128m;

import android.os.Build;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p116a.C2137a;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2258a {
    /* JADX INFO: renamed from: a */
    public static String m6125a(String str, String str2, String str3) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(str3.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m6126b(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)), "UTF-8");
        } catch (Exception e) {
            StringBuilder sbM5396a = C2137a.m5396a("");
            sbM5396a.append(e.toString());
            SpiderDebug.log(sbM5396a.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m6127c(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes("UTF-8"));
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            String str4 = new String(cipher.doFinal(m6135k(str)), "UTF-8");
            SpiderDebug.log("->" + str4);
            return str4;
        } catch (Exception e) {
            StringBuilder sbM5396a = C2137a.m5396a("");
            sbM5396a.append(e.toString());
            SpiderDebug.log(sbM5396a.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m6128d(String str, byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m6129e(String str, byte[] bArr, byte[] bArr2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDoFinal) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception e) {
            PrintStream printStream = System.out;
            StringBuilder sbM5396a = C2137a.m5396a("dec err::");
            sbM5396a.append(e.toString());
            printStream.println(sbM5396a.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m6130f(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes());
        Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(Base64.decode(str, 0)));
    }

    /* JADX INFO: renamed from: g */
    public static String m6131g(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes());
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m6132h(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m6133i(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(1, new SecretKeySpec(str2.getBytes(), "AES"));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m6134j(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] bArrM6135k = m6135k(str);
            byte[] bArr4 = new byte[bArrM6135k.length + bArr3.length];
            System.arraycopy(bArrM6135k, 0, bArr4, 0, bArrM6135k.length);
            System.arraycopy(bArr3, 0, bArr4, bArrM6135k.length, bArr3.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            int i = Build.VERSION.SDK_INT;
            GCMParameterSpec gCMParameterSpec = i >= 19 ? new GCMParameterSpec(128, bArr2) : null;
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            if (i >= 19) {
                cipher.init(2, secretKeySpec, gCMParameterSpec);
            }
            return new String(cipher.doFinal(bArr4), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m6135k(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("invalid hex string");
        }
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StringBuilder sbM5396a = C2137a.m5396a("");
            int i3 = i + 1;
            sbM5396a.append(charArray[i]);
            sbM5396a.append(charArray[i3]);
            bArr[i2] = new Integer(Integer.parseInt(sbM5396a.toString(), 16) & 255).byteValue();
            i = i3 + 1;
            i2++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: l */
    public static byte[] m6136l(String str, String str2, String str3) {
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
