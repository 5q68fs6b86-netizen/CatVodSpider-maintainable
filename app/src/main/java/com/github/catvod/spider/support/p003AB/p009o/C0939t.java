package com.github.catvod.spider.support.p003AB.p009o;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import com.github.catvod.spider.support.AB.e0.a;
import com.github.catvod.spider.support.p003AB.p005b.C0854u;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0939t extends ContentProvider {

    /* JADX INFO: renamed from: a */
    private static final String f2221a = "android.support.FILE_PROVIDER_PATHS";

    /* JADX INFO: renamed from: b */
    private static final String f2222b = "cache-path";

    /* JADX INFO: renamed from: c */
    private static final String f2223c = "external-path";

    /* JADX INFO: renamed from: d */
    private static final String f2224d = "name";

    /* JADX INFO: renamed from: e */
    private static final String f2225e = "path";

    /* JADX INFO: renamed from: f */
    private static final HashMap<String, InterfaceC0937r> f2226f = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static Uri m2274a(Context context, String str, File file) {
        InterfaceC0937r interfaceC0937rM2275b;
        HashMap<String, InterfaceC0937r> map = f2226f;
        synchronized (map) {
            interfaceC0937rM2275b = map.get(str);
            if (interfaceC0937rM2275b == null) {
                try {
                    interfaceC0937rM2275b = m2275b(context, str);
                    map.put(str, interfaceC0937rM2275b);
                } catch (a e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return interfaceC0937rM2275b.mo2272a(file);
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC0937r m2275b(Context context, String str) throws XmlPullParserException, IOException {
        C0938s c0938s = new C0938s(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(C0854u.m2059b(new byte[]{28, -100, -55, -73, 68, -88, -67, -96, 127, -107, -43, -75, 68, -26, -9, -79, 43, -110, -111, -65, 65, -78, -5, -12, 57, -100, -50, -5, 80, -76, -11, -94, 54, -105, -39, -87, 0, -79, -13, -96, 55, -45, -35, -82, 84, -82, -11, -90, 54, -121, -59, -5}, new byte[]{95, -13, -68, -37, 32, -58, -102, -44}, new StringBuilder(), str));
        }
        Bundle bundle = providerInfoResolveContentProvider.metaData;
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), f2221a);
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c0938s;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, f2224d);
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, f2225e);
                if (f2222b.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (f2223c.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                }
                if (externalStorageDirectory != null) {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    c0938s.m2273b(attributeValue, externalStorageDirectory);
                }
            }
        }
    }
}
