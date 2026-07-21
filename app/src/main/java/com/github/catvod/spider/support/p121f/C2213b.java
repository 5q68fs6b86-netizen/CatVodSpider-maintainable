package com.github.catvod.spider.support.p121f;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2213b {

    /* JADX INFO: renamed from: a */
    @SerializedName("result")
    private JsonElement f5453a;

    /* JADX INFO: renamed from: b */
    @SerializedName("wbi_img")
    private JsonElement f5454b;

    /* JADX INFO: renamed from: c */
    @SerializedName("list")
    private JsonElement f5455c;

    /* JADX INFO: renamed from: d */
    @SerializedName("isLogin")
    private Boolean f5456d;

    /* JADX INFO: renamed from: e */
    @SerializedName("vipStatus")
    private Integer f5457e;

    /* JADX INFO: renamed from: f */
    @SerializedName("qrcode_key")
    private String f5458f;

    /* JADX INFO: renamed from: g */
    @SerializedName("url")
    private String f5459g;

    /* JADX INFO: renamed from: h */
    @SerializedName("aid")
    private String f5460h;

    /* JADX INFO: renamed from: i */
    @SerializedName("cid")
    private String f5461i;

    /* JADX INFO: renamed from: j */
    @SerializedName("title")
    private String f5462j;

    /* JADX INFO: renamed from: k */
    @SerializedName("tname")
    private String f5463k;

    /* JADX INFO: renamed from: l */
    @SerializedName("uname")
    private String f5464l;

    /* JADX INFO: renamed from: m */
    @SerializedName("mid")
    private String f5465m;

    /* JADX INFO: renamed from: n */
    @SerializedName("pic")
    private String f5466n;

    /* JADX INFO: renamed from: o */
    @SerializedName("duration")
    private Long f5467o;

    /* JADX INFO: renamed from: p */
    @SerializedName("desc")
    private String f5468p;

    /* JADX INFO: renamed from: q */
    @SerializedName("accept_description")
    private List<String> f5469q;

    /* JADX INFO: renamed from: r */
    @SerializedName("accept_quality")
    private List<Integer> f5470r;

    /* JADX INFO: renamed from: s */
    @SerializedName("pages")
    private List<C2215d> f5471s;

    /* JADX INFO: renamed from: t */
    @SerializedName("dash")
    private C2212a f5472t;

    /* JADX INFO: renamed from: a */
    public final List<String> m5947a() {
        List<String> list = this.f5469q;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: b */
    public final List<Integer> m5948b() {
        List<Integer> list = this.f5470r;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: c */
    public final String m5949c() {
        return TextUtils.isEmpty(this.f5460h) ? "" : this.f5460h;
    }

    /* JADX INFO: renamed from: d */
    public final String m5950d() {
        return TextUtils.isEmpty(this.f5461i) ? "" : this.f5461i;
    }

    /* JADX INFO: renamed from: e */
    public final C2212a m5951e() {
        C2212a c2212a = this.f5472t;
        return c2212a == null ? new C2212a() : c2212a;
    }

    /* JADX INFO: renamed from: f */
    public final String m5952f() {
        return TextUtils.isEmpty(this.f5468p) ? "" : this.f5468p;
    }

    /* JADX INFO: renamed from: g */
    public final Long m5953g() {
        Long l = this.f5467o;
        return Long.valueOf(l == null ? 0L : l.longValue());
    }

    /* JADX INFO: renamed from: h */
    public final JsonElement m5954h() {
        return this.f5455c;
    }

    /* JADX INFO: renamed from: i */
    public final String m5955i() {
        return TextUtils.isEmpty(this.f5465m) ? "" : this.f5465m;
    }

    /* JADX INFO: renamed from: j */
    public final List<C2215d> m5956j() {
        List<C2215d> list = this.f5471s;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: k */
    public final String m5957k() {
        return TextUtils.isEmpty(this.f5466n) ? "" : this.f5466n;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5958k() {
        Boolean bool = this.f5456d;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final String m5959l() {
        return TextUtils.isEmpty(this.f5458f) ? "" : this.f5458f;
    }

    /* JADX INFO: renamed from: m */
    public final JsonElement m5960m() {
        return this.f5453a;
    }

    /* JADX INFO: renamed from: n */
    public final String m5961n() {
        return TextUtils.isEmpty(this.f5462j) ? "" : this.f5462j;
    }

    /* JADX INFO: renamed from: o */
    public final String m5962o() {
        return TextUtils.isEmpty(this.f5463k) ? "" : this.f5463k;
    }

    /* JADX INFO: renamed from: p */
    public final String m5963p() {
        String str = this.f5464l;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: q */
    public final String m5964q() {
        return TextUtils.isEmpty(this.f5459g) ? "" : this.f5459g;
    }

    /* JADX INFO: renamed from: r */
    public final JsonElement m5965r() {
        return this.f5454b;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5966s() {
        Integer num = this.f5457e;
        return (num == null || num.intValue() == 0) ? false : true;
    }
}
