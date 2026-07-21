package com.github.catvod.spider.support.p044FM.p045A;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p056L.C1414F;
import com.github.catvod.spider.support.p044FM.p090o.C1863d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p045A.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1286l {
    /* JADX INFO: renamed from: a */
    public static void m3216a(String str) {
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

    /* JADX INFO: renamed from: b */
    public static void m3217b(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec("nohup " + str + " 2>&1 &");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!line.toLowerCase().contains("info") && !line.toLowerCase().contains("warn") && !line.toLowerCase().contains("error")) {
                    SpiderDebug.log(line);
                }
            }
            int iWaitFor = processExec.waitFor();
            if (iWaitFor != 0) {
                SpiderDebug.log(String.format("Shell command failed with exit code '%s'", Integer.valueOf(iWaitFor)));
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m3218c(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: renamed from: d */
    public static String m3219d(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: e */
    public static String m3220e(String str) {
        return m3219d(str).trim();
    }

    /* JADX INFO: renamed from: f */
    public static void m3221f(File file) {
        Uri uriM4506a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.addFlags(1);
        if (Build.VERSION.SDK_INT < 24) {
            uriM4506a = Uri.fromFile(file);
        } else {
            uriM4506a = C1863d.m4506a(Init.context(), Init.context().getPackageName() + ".provider", file);
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(file.getName());
        if (TextUtils.isEmpty(strGuessContentTypeFromName)) {
            strGuessContentTypeFromName = "*/*";
        }
        intent.setDataAndType(uriM4506a, strGuessContentTypeFromName);
        Init.context().startActivity(intent);
    }

    /* JADX INFO: renamed from: g */
    public static C1388h m3222g(String str) {
        return C1414F.m3544d(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m3223h(File file, File file2) {
        try {
            ZipFile zipFile = new ZipFile(file.getAbsolutePath());
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    File file3 = new File(file2, zipEntryNextElement.getName());
                    if (zipEntryNextElement.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i != -1) {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                zipFile.close();
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (Throwable unused2) {
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m3224i(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    /* JADX INFO: renamed from: j */
    public static int m3225j(int i, Object obj) {
        return m3224i(i, obj != null ? obj.hashCode() : 0);
    }
}
