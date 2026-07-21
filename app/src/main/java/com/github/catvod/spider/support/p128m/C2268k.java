package com.github.catvod.spider.support.p128m;

import android.os.Environment;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p117b.C2174h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2268k {
    /* JADX INFO: renamed from: a */
    public static String m6164a(File file) {
        String str = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                str = new String(bArr, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static File m6165b(File file) {
        try {
            if (file.getParentFile() != null) {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
            }
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            m6167b("chmod 777 " + file);
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return file;
        }
    }

    /* JADX INFO: renamed from: b */
    public static File m6166b(String str) {
        if (!str.startsWith(".")) {
            str = C2139c.m5408a(".", str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        File file = new File(C2174h.m5657b(sb, File.separator, "TVBox"));
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }

    /* JADX INFO: renamed from: b */
    public static void m6167b(String str) {
        try {
            int iWaitFor = Runtime.getRuntime().exec(str).waitFor();
            if (iWaitFor == 0) {
                return;
            }
            throw new RuntimeException("Shell command failed with exit code " + iWaitFor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public static File m6168c(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            try {
                Runtime.getRuntime().exec("chmod 777 " + file).waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return file;
    }

    /* JADX INFO: renamed from: c */
    public static File m6169c(String str) {
        if (!str.startsWith(".")) {
            str = C2139c.m5408a(".", str);
        }
        return new File(Init.context().getFilesDir(), str);
    }

    /* JADX INFO: renamed from: c */
    private static void m6170c(File file, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public static File m6171d() {
        File file = new File(Init.context().getFilesDir(), "TV");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: d */
    public static File m6172d(String str) {
        if (!str.startsWith(".")) {
            str = C2139c.m5408a(".", str);
        }
        return new File(m6171d(), str);
    }

    /* JADX INFO: renamed from: i */
    public static void m6173i(File file, String str) {
        m6174j(file, str.getBytes());
    }

    /* JADX INFO: renamed from: j */
    public static void m6174j(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m6165b(file));
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
