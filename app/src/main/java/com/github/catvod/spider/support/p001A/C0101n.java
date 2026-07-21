package com.github.catvod.spider.support.p001A;

import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p001A.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0101n {
    /* JADX INFO: renamed from: b */
    public static void m862b(String str) {
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

    /* JADX INFO: renamed from: e */
    public static File m863e(File file) {
        try {
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            m862b("chmod 777 " + file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    /* JADX INFO: renamed from: o */
    public static File m864o(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            m863e(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
        }
        return file;
    }

    /* JADX INFO: renamed from: u */
    public static void m865u(String str, String str2) {
        File file = new File(Environment.getExternalStorageDirectory(), "TVBox");
        if (!file.exists()) {
            file.mkdirs();
        }
        m864o(new File(file, str), str2);
    }
}
