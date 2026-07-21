package com.github.catvod.spider.support.p119d;

import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p119d.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2200d {

    /* JADX INFO: renamed from: a */
    @SerializedName("data")
    private C2200d f5344a;

    /* JADX INFO: renamed from: b */
    @SerializedName("content")
    private C2200d f5345b;

    /* JADX INFO: renamed from: c */
    @SerializedName("t")
    private String f5346c;

    /* JADX INFO: renamed from: d */
    @SerializedName("ck")
    private String f5347d;

    /* JADX INFO: renamed from: e */
    @SerializedName("codeContent")
    private String f5348e;

    /* JADX INFO: renamed from: f */
    @SerializedName("qrCodeStatus")
    private String f5349f;

    /* JADX INFO: renamed from: g */
    @SerializedName("bizExt")
    private String f5350g;

    /* JADX INFO: renamed from: g */
    public static C2200d m5876g(String str) {
        try {
            C2200d c2200d = (C2200d) new Gson().fromJson(str, C2200d.class);
            return c2200d == null ? new C2200d() : c2200d;
        } catch (Exception unused) {
            return new C2200d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m5877a() {
        String str = this.f5348e;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: b */
    public final C2200d m5878b() {
        C2200d c2200d = this.f5345b;
        return c2200d == null ? new C2200d() : c2200d;
    }

    /* JADX INFO: renamed from: c */
    public final C2200d m5879c() {
        C2200d c2200d = this.f5344a;
        return c2200d == null ? new C2200d() : c2200d;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, String> m5880d() {
        HashMap map = new HashMap();
        String str = this.f5346c;
        if (str == null) {
            str = "";
        }
        map.put("t", str);
        String str2 = this.f5347d;
        if (str2 == null) {
            str2 = "";
        }
        map.put("ck", str2);
        map.put("appName", "aliyun_drive");
        map.put("appEntrance", "web");
        map.put("isMobile", "false");
        map.put("lang", "zh_CN");
        map.put("returnUrl", "");
        map.put("fromSite", "52");
        map.put("bizParams", "");
        map.put("navlanguage", "zh-CN");
        map.put("navPlatform", "MacIntel");
        return map;
    }

    /* JADX INFO: renamed from: e */
    public final String m5881e() {
        String str = this.f5350g;
        if (str == null) {
            str = "";
        }
        return ((C2197a) new Gson().fromJson(new String(Base64.decode(str, 0)), C2197a.class)).m5866a().m5867b();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5882f() {
        String str = this.f5349f;
        if (str == null) {
            str = "";
        }
        if (str.equals("CONFIRMED")) {
            String str2 = this.f5350g;
            if ((str2 != null ? str2 : "").length() > 0) {
                return true;
            }
        }
        return false;
    }
}
