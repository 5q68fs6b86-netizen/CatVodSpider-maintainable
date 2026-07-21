package com.github.catvod.spider.support.p012C0.p027d;

import android.text.TextUtils;
import com.github.catvod.spider.support.p012C0.p023b.C1030n;
import com.github.catvod.spider.support.p012C0.p035j.C1247o;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1065e {

    /* JADX INFO: renamed from: a */
    @SerializedName("items")
    private List<C1065e> f2609a;

    /* JADX INFO: renamed from: b */
    @SerializedName("next_marker")
    private String f2610b;

    /* JADX INFO: renamed from: c */
    @SerializedName("file_id")
    private String f2611c;

    /* JADX INFO: renamed from: d */
    @SerializedName("share_id")
    private String f2612d;

    /* JADX INFO: renamed from: e */
    @SerializedName("name")
    private String f2613e;

    /* JADX INFO: renamed from: f */
    @SerializedName("type")
    private String f2614f;

    /* JADX INFO: renamed from: g */
    @SerializedName("file_extension")
    private String f2615g;

    /* JADX INFO: renamed from: h */
    @SerializedName("category")
    private String f2616h;

    /* JADX INFO: renamed from: i */
    @SerializedName("size")
    private double f2617i;

    /* JADX INFO: renamed from: j */
    @SerializedName("parent")
    private String f2618j;

    public C1065e(String str) {
        this.f2611c = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m2775a() {
        return TextUtils.isEmpty(this.f2616h) ? "" : this.f2616h;
    }

    /* JADX INFO: renamed from: b */
    public final String m2776b() {
        String string = "";
        String strM2554b = TextUtils.isEmpty(this.f2618j) ? "" : C1030n.m2554b(C1064d.m2774b("["), this.f2618j, "]");
        String strM2780f = m2780f();
        if (this.f2617i != 0.0d) {
            StringBuilder sbM2774b = C1064d.m2774b("[");
            sbM2774b.append(C1247o.m3113c(this.f2617i));
            sbM2774b.append("]");
            string = sbM2774b.toString();
        }
        return TextUtils.join(" ", Arrays.asList(strM2554b, strM2780f, string)).trim();
    }

    /* JADX INFO: renamed from: c */
    public final String m2777c() {
        return TextUtils.isEmpty(this.f2615g) ? "" : this.f2615g;
    }

    /* JADX INFO: renamed from: d */
    public final String m2778d() {
        return TextUtils.isEmpty(this.f2611c) ? "" : this.f2611c;
    }

    /* JADX INFO: renamed from: e */
    public final List<C1065e> m2779e() {
        List<C1065e> list = this.f2609a;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: f */
    public final String m2780f() {
        return TextUtils.isEmpty(this.f2613e) ? "" : this.f2613e;
    }

    /* JADX INFO: renamed from: g */
    public final String m2781g() {
        return TextUtils.isEmpty(this.f2610b) ? "" : this.f2610b;
    }

    /* JADX INFO: renamed from: h */
    public final String m2782h() {
        return TextUtils.isEmpty(this.f2614f) ? "" : this.f2614f;
    }

    /* JADX INFO: renamed from: i */
    public final C1065e m2783i(String str) {
        this.f2618j = str;
        return this;
    }
}
