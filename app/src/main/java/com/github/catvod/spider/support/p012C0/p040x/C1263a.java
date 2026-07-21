package com.github.catvod.spider.support.p012C0.p040x;

import com.github.catvod.spider.support.C0.A.c;
import com.github.catvod.spider.support.C0.E.f;
import com.github.catvod.spider.support.C0.u0.a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.x.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1263a {
    /* JADX INFO: renamed from: a */
    public static void m3145a(Throwable th, Throwable th2) {
        f.e(th, "<this>");
        f.e(th2, "exception");
        if (th != th2) {
            c.a.a(th, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static HttpUrl m3146b(String str, List list) {
        HttpUrl httpUrl = HttpUrl.get(str);
        if (list == null || list.size() == 0) {
            return httpUrl;
        }
        HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.c()) {
                builderNewBuilder.addEncodedQueryParameter(aVar.a(), aVar.b().toString());
            } else {
                builderNewBuilder.addQueryParameter(aVar.a(), aVar.b().toString());
            }
        }
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: c */
    public static String m3147c(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: d */
    public static String m3148d(String str) {
        return m3147c(str).trim();
    }
}
