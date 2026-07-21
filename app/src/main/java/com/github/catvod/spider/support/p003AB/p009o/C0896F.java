package com.github.catvod.spider.support.p003AB.p009o;

import android.os.Environment;
import com.github.catvod.spider.support.p003AB.p005b.C0853t;
import com.github.catvod.spider.support.p003AB.p005b.C0854u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0896F {
    /* JADX INFO: renamed from: a */
    public static File m2153a(File file) {
        try {
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            C0902L.m2182a("chmod 777 " + file);
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return file;
        }
    }

    /* JADX INFO: renamed from: b */
    public static File m2154b(String str) {
        File file = new File(str.replace("file:/", ""));
        File file2 = new File(str.replace("file:/", Environment.getExternalStorageDirectory().getAbsolutePath()));
        if (file2.exists()) {
            return file2;
        }
        return file.exists() ? file : new File(str);
    }

    /* JADX INFO: renamed from: c */
    public static String m2155c(File file) {
        try {
            return m2156d(new FileInputStream(file));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m2156d(InputStream inputStream) {
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

    /* JADX INFO: renamed from: e */
    public static String m2157e(String str) {
        try {
            return m2156d(new FileInputStream(m2154b(str)));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static File m2158f(String str) {
        if (!str.startsWith(".")) {
            str = C0854u.m2059b(new byte[]{50}, new byte[]{28, -36, 23, -38, 91, -85, -55, -54}, new StringBuilder(), str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separator);
        File file = new File(C0853t.m2057b(new byte[]{90, 108}, new byte[]{14, 58, -57, -33, 56, 78, -95, 48}, sb));
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    /* JADX INFO: renamed from: g */
    public static File m2159g(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            m2153a(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
        return file;
    }
}
