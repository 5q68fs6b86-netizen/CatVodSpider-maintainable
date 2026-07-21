package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.spider.support.p003AB.p004a.C0816a;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0852s {
    /* JADX INFO: renamed from: a */
    public static Object m2054a(String str, Class cls) {
        return new Gson().fromJson(str, cls);
    }

    /* JADX INFO: renamed from: b */
    public static void m2055b(byte[] bArr, byte[] bArr2, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        jSONObject2.put(str, jSONObject.optString(C0816a.m1965a(bArr, bArr2)));
    }
}
