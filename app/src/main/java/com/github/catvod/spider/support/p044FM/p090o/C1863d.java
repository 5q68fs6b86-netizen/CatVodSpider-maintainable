package com.github.catvod.spider.support.p044FM.p090o;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.github.catvod.spider.support.p044FM.p073b.C1747r;
import com.github.catvod.spider.support.p044FM.p080e0.C1799a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1863d extends ContentProvider {

    /* JADX INFO: renamed from: a */
    private static final String f4280a = "android.support.FILE_PROVIDER_PATHS";

    /* JADX INFO: renamed from: b */
    private static final String f4281b = "cache-path";

    /* JADX INFO: renamed from: c */
    private static final String f4282c = "external-path";

    /* JADX INFO: renamed from: d */
    private static final String f4283d = "name";

    /* JADX INFO: renamed from: e */
    private static final String f4284e = "path";

    /* JADX INFO: renamed from: f */
    private static final HashMap<String, InterfaceC1861b> f4285f;

    static {
        C1711a.m3992b(new byte[]{-117, -87, -113, -70, 18, 55, 104, 66, -114, -83, -103}, new byte[]{-17, -64, -4, -54, 126, 86, 17, 12});
        C1711a.m3992b(new byte[]{-68, 108, 63, 15, -49, -87, -105, 104, -68, 102, 55, 17, -38}, new byte[]{-29, 8, 86, 124, -65, -59, -10, 17});
        C1711a.m3992b(new byte[]{-37, 27, 115, 40, 119}, new byte[]{-124, 104, 26, 82, 18, 32, 32, 54});
        f4285f = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static Uri m4506a(Context context, String str, File file) {
        InterfaceC1861b interfaceC1861bM4507b;
        HashMap<String, InterfaceC1861b> map = f4285f;
        synchronized (map) {
            interfaceC1861bM4507b = map.get(str);
            if (interfaceC1861bM4507b == null) {
                try {
                    interfaceC1861bM4507b = m4507b(context, str);
                    map.put(str, interfaceC1861bM4507b);
                } catch (C1799a e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return interfaceC1861bM4507b.mo4504a(file);
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC1861b m4507b(Context context, String str) throws XmlPullParserException, IOException {
        C1862c c1862c = new C1862c(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(C1747r.m4094b(new byte[]{70, -103, 105, -67, -28, -99, 71, -2, 37, -112, 117, -65, -28, -45, 13, -17, 113, -105, 49, -75, -31, -121, 1, -86, 99, -103, 110, -15, -16, -127, 15, -4, 108, -110, 121, -93, -96, -124, 9, -2, 109, -42, 125, -92, -12, -101, 15, -8, 108, -126, 101, -15}, new byte[]{5, -10, 28, -47, -128, -13, 96, -118}, new StringBuilder(), str));
        }
        Bundle bundle = providerInfoResolveContentProvider.metaData;
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), f4280a);
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c1862c;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, f4283d);
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, f4284e);
                if (f4281b.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (f4282c.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                }
                if (externalStorageDirectory != null) {
                    String[] strArr = {attributeValue2};
                    for (int i = 0; i < 1; i++) {
                        String str2 = strArr[i];
                        if (str2 != null) {
                            externalStorageDirectory = new File(externalStorageDirectory, str2);
                        }
                    }
                    c1862c.m4505b(attributeValue, externalStorageDirectory);
                }
            }
        }
    }
}
