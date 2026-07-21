package com.github.catvod.spider.support.p003AB.p009o;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.Init;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0940u {
    /* JADX INFO: renamed from: a */
    public static void m2276a(File file) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.addFlags(1);
        Uri uriM2274a = C0939t.m2274a(Init.context(), Init.context().getPackageName() + ".provider", file);
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(file.getName());
        if (TextUtils.isEmpty(strGuessContentTypeFromName)) {
            strGuessContentTypeFromName = "*/*";
        }
        intent.setDataAndType(uriM2274a, strGuessContentTypeFromName);
        Init.context().startActivity(intent);
    }

    /* JADX INFO: renamed from: b */
    public static void m2277b(File file, File file2) {
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
}
