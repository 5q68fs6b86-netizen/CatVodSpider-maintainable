package com.github.catvod.spider.support.p044FM.p082g;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p082g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1804b {

    /* JADX INFO: renamed from: a */
    @SerializedName("result")
    private JsonElement f4092a;

    /* JADX INFO: renamed from: b */
    @SerializedName("list")
    private JsonElement f4093b;

    /* JADX INFO: renamed from: c */
    @SerializedName("isLogin")
    private Boolean f4094c;

    /* JADX INFO: renamed from: d */
    @SerializedName("vipStatus")
    private Integer f4095d;

    /* JADX INFO: renamed from: e */
    @SerializedName("qrcode_key")
    private String f4096e;

    /* JADX INFO: renamed from: f */
    @SerializedName("url")
    private String f4097f;

    /* JADX INFO: renamed from: g */
    @SerializedName("aid")
    private String f4098g;

    /* JADX INFO: renamed from: h */
    @SerializedName("cid")
    private String f4099h;

    /* JADX INFO: renamed from: i */
    @SerializedName("title")
    private String f4100i;

    /* JADX INFO: renamed from: j */
    @SerializedName("tname")
    private String f4101j;

    /* JADX INFO: renamed from: k */
    @SerializedName("pic")
    private String f4102k;

    /* JADX INFO: renamed from: l */
    @SerializedName("duration")
    private Long f4103l;

    /* JADX INFO: renamed from: m */
    @SerializedName("desc")
    private String f4104m;

    /* JADX INFO: renamed from: n */
    @SerializedName("accept_description")
    private List<String> f4105n;

    /* JADX INFO: renamed from: o */
    @SerializedName("accept_quality")
    private List<Integer> f4106o;

    /* JADX INFO: renamed from: p */
    @SerializedName("pages")
    private List<C1807e> f4107p;

    /* JADX INFO: renamed from: q */
    @SerializedName("dash")
    private C1803a f4108q;

    /* JADX INFO: renamed from: r */
    @SerializedName("owner")
    private C1806d f4109r;

    /* JADX INFO: renamed from: s */
    @SerializedName("wbi_img")
    private C1813k f4110s;

    /* JADX INFO: renamed from: a */
    public final List<String> m4358a() {
        List<String> list = this.f4105n;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: b */
    public final List<Integer> m4359b() {
        List<Integer> list = this.f4106o;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: c */
    public final String m4360c() {
        return TextUtils.isEmpty(this.f4099h) ? "" : this.f4099h;
    }

    /* JADX INFO: renamed from: d */
    public final C1803a m4361d() {
        C1803a c1803a = this.f4108q;
        return c1803a == null ? new C1803a() : c1803a;
    }

    /* JADX INFO: renamed from: e */
    public final String m4362e() {
        return TextUtils.isEmpty(this.f4104m) ? "" : this.f4104m;
    }

    /* JADX INFO: renamed from: f */
    public final Long m4363f() {
        Long l = this.f4103l;
        return Long.valueOf(l == null ? 0L : l.longValue());
    }

    /* JADX INFO: renamed from: g */
    public final JsonElement m4364g() {
        return this.f4093b;
    }

    /* JADX INFO: renamed from: h */
    public final C1806d m4365h() {
        C1806d c1806d = this.f4109r;
        return c1806d == null ? new C1806d() : c1806d;
    }

    /* JADX INFO: renamed from: i */
    public final List<C1807e> m4366i() {
        List<C1807e> list = this.f4107p;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: j */
    public final String m4367j() {
        return TextUtils.isEmpty(this.f4102k) ? "" : this.f4102k;
    }

    /* JADX INFO: renamed from: k */
    public final String m4368k() {
        return TextUtils.isEmpty(this.f4096e) ? "" : this.f4096e;
    }

    /* JADX INFO: renamed from: l */
    public final JsonElement m4369l() {
        return this.f4092a;
    }

    /* JADX INFO: renamed from: m */
    public final String m4370m() {
        return TextUtils.isEmpty(this.f4100i) ? "" : this.f4100i;
    }

    /* JADX INFO: renamed from: n */
    public final String m4371n() {
        return TextUtils.isEmpty(this.f4101j) ? "" : this.f4101j;
    }

    /* JADX INFO: renamed from: o */
    public final String m4372o() {
        return TextUtils.isEmpty(this.f4097f) ? "" : this.f4097f;
    }

    /* JADX INFO: renamed from: p */
    public final C1813k m4373p() {
        C1813k c1813k = this.f4110s;
        return c1813k == null ? new C1813k() : c1813k;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4374q() {
        Boolean bool = this.f4094c;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4375r() {
        Integer num = this.f4095d;
        return (num == null || num.intValue() == 0) ? false : true;
    }
}
