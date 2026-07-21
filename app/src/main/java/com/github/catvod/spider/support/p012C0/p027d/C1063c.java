package com.github.catvod.spider.support.p012C0.p027d;

import android.util.Base64;
import com.github.catvod.spider.support.C0.d.a;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1063c {

    /* JADX INFO: renamed from: a */
    @SerializedName("data")
    private C1063c f2602a;

    /* JADX INFO: renamed from: b */
    @SerializedName("content")
    private C1063c f2603b;

    /* JADX INFO: renamed from: c */
    @SerializedName("t")
    private String f2604c;

    /* JADX INFO: renamed from: d */
    @SerializedName("ck")
    private String f2605d;

    /* JADX INFO: renamed from: e */
    @SerializedName("codeContent")
    private String f2606e;

    /* JADX INFO: renamed from: f */
    @SerializedName("qrCodeStatus")
    private String f2607f;

    /* JADX INFO: renamed from: g */
    @SerializedName("bizExt")
    private String f2608g;

    /* JADX INFO: renamed from: g */
    public static C1063c m2766g(String str) {
        try {
            C1063c c1063c = (C1063c) new Gson().fromJson(str, C1063c.class);
            return c1063c == null ? new C1063c() : c1063c;
        } catch (Exception e) {
            return new C1063c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m2767a() {
        String str = this.f2606e;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: b */
    public final C1063c m2768b() {
        C1063c c1063c = this.f2603b;
        return c1063c == null ? new C1063c() : c1063c;
    }

    /* JADX INFO: renamed from: c */
    public final C1063c m2769c() {
        C1063c c1063c = this.f2602a;
        return c1063c == null ? new C1063c() : c1063c;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, String> m2770d() {
        HashMap map = new HashMap();
        String str = this.f2604c;
        if (str == null) {
            str = "";
        }
        map.put("t", str);
        String str2 = this.f2605d;
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
    public final String m2771e() {
        String str = this.f2608g;
        if (str == null) {
            str = "";
        }
        return ((a) new Gson().fromJson(new String(Base64.decode(str, 0)), a.class)).a().b();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2772f() {
        String str = this.f2607f;
        if (str == null) {
            str = "";
        }
        if (str.equals("CONFIRMED")) {
            String str2 = this.f2608g;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                return true;
            }
        }
        return false;
    }
}
