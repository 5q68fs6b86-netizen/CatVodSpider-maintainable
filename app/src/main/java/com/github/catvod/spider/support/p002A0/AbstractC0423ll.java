package com.github.catvod.spider.support.p002A0;

import java.util.Map;
import okhttp3.Headers;
import rxhttp.wrapper.param.IHeaders;
import rxhttp.wrapper.param.Param;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ll */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0423ll {
    /* JADX INFO: renamed from: a */
    public static Param m1386a(IHeaders iHeaders, Map map) {
        for (Object __en : map.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            iHeaders.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        return (Param) iHeaders;
    }

    /* JADX INFO: renamed from: b */
    public static Param m1387b(IHeaders iHeaders, Headers headers) {
        iHeaders.getHeadersBuilder().addAll(headers);
        return (Param) iHeaders;
    }

    /* JADX INFO: renamed from: c */
    public static Param m1388c(IHeaders iHeaders, String str) {
        iHeaders.getHeadersBuilder().add(str);
        return (Param) iHeaders;
    }

    /* JADX INFO: renamed from: d */
    public static Param m1389d(IHeaders iHeaders, String str, String str2) {
        iHeaders.getHeadersBuilder().add(str, str2);
        return (Param) iHeaders;
    }

    /* JADX INFO: renamed from: e */
    public static Param m1390e(IHeaders iHeaders, String str, String str2) {
        iHeaders.getHeadersBuilder().addUnsafeNonAscii(str, str2);
        return (Param) iHeaders;
    }

    /* JADX INFO: renamed from: f */
    public static String m1391f(IHeaders iHeaders, String str) {
        return iHeaders.getHeadersBuilder().get(str);
    }

    /* JADX INFO: renamed from: g */
    public static Param m1392g(IHeaders iHeaders, String str) {
        iHeaders.getHeadersBuilder().removeAll(str);
        return (Param) iHeaders;
    }

    /* JADX INFO: renamed from: h */
    public static Param m1393h(IHeaders iHeaders, Map map) {
        for (Object __en : map.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            iHeaders.setHeader((String) entry.getKey(), (String) entry.getValue());
        }
        return (Param) iHeaders;
    }

    /* JADX INFO: renamed from: i */
    public static Param m1394i(IHeaders iHeaders, String str, String str2) {
        iHeaders.getHeadersBuilder().set(str, str2);
        return (Param) iHeaders;
    }

    /* JADX INFO: renamed from: j */
    public static Param m1395j(IHeaders iHeaders, String str, String str2) {
        Headers.Builder headersBuilder = iHeaders.getHeadersBuilder();
        headersBuilder.removeAll(str);
        headersBuilder.addUnsafeNonAscii(str, str2);
        return (Param) iHeaders;
    }

    /* JADX INFO: renamed from: k */
    public static Param m1396k(IHeaders iHeaders, long j) {
        return iHeaders.setRangeHeader(j, -1L);
    }

    /* JADX INFO: renamed from: l */
    public static Param m1397l(IHeaders iHeaders, long j, long j2) {
        if (j2 < j) {
            j2 = -1;
        }
        String str = "bytes=" + j + "-";
        if (j2 >= 0) {
            str = str + j2;
        }
        return iHeaders.addHeader("RANGE", str);
    }
}
