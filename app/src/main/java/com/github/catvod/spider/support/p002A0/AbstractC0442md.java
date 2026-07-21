package com.github.catvod.spider.support.p002A0;

import java.util.List;
import okhttp3.HttpUrl;
import rxhttp.wrapper.cookie.ICookieJar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.md */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0442md {
    /* JADX INFO: renamed from: a */
    public static List m1422a(ICookieJar iCookieJar, HttpUrl httpUrl) {
        return iCookieJar.loadCookie(httpUrl);
    }

    /* JADX INFO: renamed from: b */
    public static void m1423b(ICookieJar iCookieJar, HttpUrl httpUrl, List list) {
        iCookieJar.saveCookie(httpUrl, list);
    }
}
