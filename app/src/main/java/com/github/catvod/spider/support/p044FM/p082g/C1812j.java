package com.github.catvod.spider.support.p044FM.p082g;

import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.g.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1812j {
    /* JADX INFO: renamed from: a */
    public static String m4398a(String str, long j) {
        return str + j;
    }

    /* JADX INFO: renamed from: b */
    public static String m4399b(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: c */
    public static void m4400c(byte[] bArr, byte[] bArr2, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        jSONObject2.put(str, jSONObject.optString(C1711a.m3992b(bArr, bArr2)));
    }
}
