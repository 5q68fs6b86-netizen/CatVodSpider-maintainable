package com.github.catvod.spider.support.p044FM.p090o;

import android.os.Environment;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1860a {
    /* JADX INFO: renamed from: a */
    public static String m4489a(String str, String str2, String str3) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(str3.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static File m4490b(File file) {
        try {
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            C1286l.m3216a("chmod 777 " + file);
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return file;
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m4491c(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance(str);
            if (bArr3 != null) {
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            } else {
                cipher.init(2, secretKeySpec);
            }
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m4492d(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        return new String(m4491c(bArr, bArr2, bArr3, str));
    }

    /* JADX INFO: renamed from: e */
    public static String m4493e(String str, String str2, String str3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(StandardCharsets.UTF_8));
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDoFinal) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = '0' + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m4494f(String str) {
        int i = 0;
        if (str == null || str.length() % 2 != 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length() / 2];
        while (i < str.length()) {
            int i2 = i + 2;
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
            i = i2;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public static String m4495g(String str) {
        if (str.startsWith("0x")) {
            str = str.substring(2);
        }
        return new String(new BigInteger(str, 16).toByteArray());
    }

    /* JADX INFO: renamed from: h */
    public static File m4496h(String str) {
        File file = new File(str.replace("file:/", ""));
        File file2 = new File(str.replace("file:/", Environment.getExternalStorageDirectory().getAbsolutePath()));
        if (file2.exists()) {
            return file2;
        }
        return file.exists() ? file : new File(str);
    }

    /* JADX INFO: renamed from: i */
    public static String m4497i(File file) {
        try {
            return m4499j(new FileInputStream(file));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m4498j(File file) {
        try {
            return m4500k(new FileInputStream(file));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m4499j(InputStream inputStream) {
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            inputStream.close();
            return new JSONObject(new String(bArr, StandardCharsets.UTF_8)).getString("cookie");
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m4500k(InputStream inputStream) {
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            inputStream.close();
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m4501k(String str) {
        try {
            return m4499j(new FileInputStream(m4496h(str)));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static File m4502l(String str) {
        if (!str.startsWith(".")) {
            str = "." + str;
        }
        File file = new File(Environment.getExternalStorageDirectory() + File.separator + "TVBox");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    /* JADX INFO: renamed from: m */
    public static File m4503m(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            m4490b(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
        return file;
    }
}
