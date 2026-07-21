package com.github.catvod.spider.support.p044FM.p082g;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p056L.C1414F;
import com.github.catvod.spider.support.p044FM.p075c.C1768j;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.g.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1809g {

    /* JADX INFO: renamed from: a */
    @SerializedName("bvid")
    private String f4127a;

    /* JADX INFO: renamed from: b */
    @SerializedName("aid")
    private String f4128b;

    /* JADX INFO: renamed from: c */
    @SerializedName("title")
    private String f4129c;

    /* JADX INFO: renamed from: d */
    @SerializedName("pic")
    private String f4130d;

    /* JADX INFO: renamed from: e */
    @SerializedName("duration")
    private String f4131e;

    /* JADX INFO: renamed from: f */
    @SerializedName("length")
    private String f4132f;

    /* JADX INFO: renamed from: a */
    public static List<C1809g> m4391a(JsonElement jsonElement) {
        return (List) new Gson().fromJson(jsonElement, new C1808f().getType());
    }

    /* JADX INFO: renamed from: b */
    public final String m4392b() {
        return TextUtils.isEmpty(this.f4130d) ? "" : this.f4130d;
    }

    /* JADX INFO: renamed from: c */
    public final C1768j m4393c() {
        String strM4392b;
        StringBuilder sb;
        String str;
        C1768j c1768j = new C1768j();
        StringBuilder sb2 = new StringBuilder();
        String string = "";
        sb2.append(TextUtils.isEmpty(this.f4127a) ? "" : this.f4127a);
        sb2.append("@");
        sb2.append(TextUtils.isEmpty(this.f4128b) ? "" : this.f4128b);
        c1768j.m4221g(sb2.toString());
        c1768j.m4222h(C1414F.m3544d(TextUtils.isEmpty(this.f4129c) ? "" : this.f4129c).m3484v0());
        if (m4392b().startsWith("//")) {
            strM4392b = "https:" + m4392b();
        } else {
            strM4392b = m4392b();
        }
        c1768j.m4223i(strM4392b);
        if (!TextUtils.isEmpty(this.f4131e)) {
            if (this.f4131e.contains(":")) {
                sb = new StringBuilder();
                sb.append(this.f4131e.split(":")[0]);
                str = "分鐘";
            } else if (Integer.parseInt(this.f4131e) < 60) {
                sb = new StringBuilder();
                sb.append(this.f4131e);
                str = "秒";
            } else {
                sb = new StringBuilder();
                sb.append(Integer.parseInt(this.f4131e) / 60);
                str = "分鐘";
            }
            sb.append(str);
            string = sb.toString();
        } else if (!TextUtils.isEmpty(this.f4132f)) {
            string = this.f4132f;
        }
        c1768j.m4226l(string);
        return c1768j;
    }
}
