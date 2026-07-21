package com.github.catvod.spider.support.p002A0;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import rxhttp.RxHttpPlugins;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0114a implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        return RxHttpPlugins.Ϳ(str, sSLSession);
    }
}
