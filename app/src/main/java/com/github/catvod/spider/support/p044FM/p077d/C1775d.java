package com.github.catvod.spider.support.p044FM.p077d;

import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.d.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1775d {

    /* JADX INFO: renamed from: a */
    @SerializedName("data")
    private C1775d f3953a;

    /* JADX INFO: renamed from: b */
    @SerializedName("content")
    private C1775d f3954b;

    /* JADX INFO: renamed from: c */
    @SerializedName("t")
    private String f3955c;

    /* JADX INFO: renamed from: d */
    @SerializedName("ck")
    private String f3956d;

    /* JADX INFO: renamed from: e */
    @SerializedName("codeContent")
    private String f3957e;

    /* JADX INFO: renamed from: f */
    @SerializedName("qrCodeStatus")
    private String f3958f;

    /* JADX INFO: renamed from: g */
    @SerializedName("bizExt")
    private String f3959g;

    /* JADX INFO: renamed from: g */
    public static C1775d m4240g(String str) {
        try {
            C1775d c1775d = (C1775d) new Gson().fromJson(str, C1775d.class);
            return c1775d == null ? new C1775d() : c1775d;
        } catch (Exception unused) {
            return new C1775d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m4241a() {
        String str = this.f3957e;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: b */
    public final C1775d m4242b() {
        C1775d c1775d = this.f3954b;
        return c1775d == null ? new C1775d() : c1775d;
    }

    /* JADX INFO: renamed from: c */
    public final C1775d m4243c() {
        C1775d c1775d = this.f3953a;
        return c1775d == null ? new C1775d() : c1775d;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, String> m4244d() {
        HashMap map = new HashMap();
        String str = this.f3955c;
        if (str == null) {
            str = "";
        }
        map.put("t", str);
        String str2 = this.f3956d;
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
    public final String m4245e() {
        String str = this.f3959g;
        if (str == null) {
            str = "";
        }
        return ((C1772a) new Gson().fromJson(new String(Base64.decode(str, 0)), C1772a.class)).m4230a().m4231b();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4246f() {
        String str = this.f3958f;
        if (str == null) {
            str = "";
        }
        if (str.equals("CONFIRMED")) {
            String str2 = this.f3959g;
            if ((str2 != null ? str2 : "").length() > 0) {
                return true;
            }
        }
        return false;
    }
}
