package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1748s {
    /* JADX INFO: renamed from: a */
    public static Matcher m4097a(byte[] bArr, byte[] bArr2, String str) {
        return Pattern.compile(C1711a.m3992b(bArr, bArr2)).matcher(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m4098b(byte[] bArr, byte[] bArr2, StringBuilder sb, String str) {
        sb.append(C1711a.m3992b(bArr, bArr2));
        sb.append(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m4099c(byte[] bArr, byte[] bArr2, JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        jSONObject2.put(str, jSONObject.getString(C1711a.m3992b(bArr, bArr2)));
    }
}
