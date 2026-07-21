package com.github.catvod.spider.support.p002A0;

import com.github.catvod.crawler.SpiderDebug;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ko */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0399ko {
    /* JADX INFO: renamed from: a */
    public static byte[] m1346a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1347b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: c */
    public static void m1348c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m1354i(nullPointerException, AbstractC0399ko.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: d */
    public static void m1349d(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m1354i(nullPointerException, AbstractC0399ko.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: e */
    public static void m1350e(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m1354i(nullPointerException, AbstractC0399ko.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: f */
    public static void m1351f(String str, Object obj) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC0399ko.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            m1354i(nullPointerException, AbstractC0399ko.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m1352g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: h */
    public static String m1353h(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m1354i(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: j */
    public static void m1355j(String str) {
        C0649tv c0649tv = new C0649tv("lateinit property " + str + " has not been initialized");
        m1354i(c0649tv, AbstractC0399ko.class.getName());
        throw c0649tv;
    }
}
