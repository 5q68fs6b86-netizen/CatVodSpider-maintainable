package com.github.catvod.spider.support.p012C0.p036k;

import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p036k.e */
/* JADX INFO: loaded from: classes.dex */
final class C1252e implements CookieJar {
    C1252e() {
    }

    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        List<Cookie> list = C1254g.f2956d.get(httpUrl.host());
        return list != null ? list : new ArrayList();
    }

    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        C1254g.f2956d.put(httpUrl.host(), list);
    }
}
