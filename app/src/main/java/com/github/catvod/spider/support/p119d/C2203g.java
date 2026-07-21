package com.github.catvod.spider.support.p119d;

import android.text.TextUtils;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2174h;
import com.github.catvod.spider.support.p117b.C2177k;
import com.github.catvod.spider.support.p128m.C2256I;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.d.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2203g implements Comparable<C2203g> {

    /* JADX INFO: renamed from: a */
    @SerializedName("items")
    private List<C2203g> f5356a;

    /* JADX INFO: renamed from: b */
    @SerializedName("next_marker")
    private String f5357b;

    /* JADX INFO: renamed from: c */
    @SerializedName("file_id")
    private String f5358c;

    /* JADX INFO: renamed from: d */
    @SerializedName("share_id")
    private String f5359d;

    /* JADX INFO: renamed from: e */
    @SerializedName("name")
    private String f5360e;

    /* JADX INFO: renamed from: f */
    @SerializedName("type")
    private String f5361f;

    /* JADX INFO: renamed from: g */
    @SerializedName("file_extension")
    private String f5362g;

    /* JADX INFO: renamed from: h */
    @SerializedName("category")
    private String f5363h;

    /* JADX INFO: renamed from: i */
    @SerializedName("size")
    private double f5364i;

    /* JADX INFO: renamed from: j */
    @SerializedName("drive_id")
    private String f5365j;

    /* JADX INFO: renamed from: k */
    @SerializedName("updated_at")
    private String f5366k;

    /* JADX INFO: renamed from: l */
    @SerializedName("parent")
    private String f5367l;

    public C2203g(String str) {
        this.f5358c = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m5885a() {
        return TextUtils.isEmpty(this.f5363h) ? "" : this.f5363h;
    }

    /* JADX INFO: renamed from: b */
    public final String m5886b() {
        return TextUtils.join(" ", Arrays.asList(m5893h(), m5891ff(), m5894i())).trim();
    }

    /* JADX INFO: renamed from: c */
    public final String m5887c() {
        return TextUtils.isEmpty(this.f5358c) ? "" : this.f5358c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C2203g c2203g) {
        return m5895j().compareTo(c2203g.m5895j());
    }

    /* JADX INFO: renamed from: d */
    public final Double m5888d() {
        return Double.valueOf(this.f5364i);
    }

    /* JADX INFO: renamed from: e */
    public final List<C2203g> m5889e() {
        List<C2203g> list = this.f5356a;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: f */
    public final String m5890f() {
        return TextUtils.isEmpty(this.f5360e) ? "" : this.f5360e;
    }

    /* JADX INFO: renamed from: ff */
    public final String m5891ff() {
        if (TextUtils.isEmpty(this.f5360e)) {
            return "";
        }
        String str = this.f5360e;
        return str.contains("_") ? str.replace("_", "·") : str;
    }

    /* JADX INFO: renamed from: g */
    public final String m5892g() {
        return TextUtils.isEmpty(this.f5357b) ? "" : this.f5357b;
    }

    /* JADX INFO: renamed from: h */
    public final String m5893h() {
        return TextUtils.isEmpty(this.f5367l) ? "" : C2174h.m5657b(C2137a.m5396a("["), this.f5367l, "]");
    }

    /* JADX INFO: renamed from: i */
    public final String m5894i() {
        if (this.f5364i == 0.0d) {
            return "";
        }
        StringBuilder sbM5396a = C2137a.m5396a("[");
        sbM5396a.append(C2256I.m6111e(this.f5364i));
        sbM5396a.append("]");
        return sbM5396a.toString();
    }

    /* JADX INFO: renamed from: j */
    public final String m5895j() {
        String str;
        String[] strArr = new String[2];
        strArr[0] = m5893h();
        String strM5891ff = m5891ff();
        List<String> list = C2256I.f5633a;
        String str2 = "";
        try {
            Matcher matcher = Pattern.compile(".*(1080|720|2160|4k|4K).*").matcher(strM5891ff);
            if (matcher.find()) {
                str = matcher.group(1) + " " + strM5891ff;
            } else {
                str = strM5891ff;
            }
            Matcher matcher2 = Pattern.compile("^([0-9]+)").matcher(strM5891ff);
            if (matcher2.find()) {
                str = matcher2.group(1) + " " + str;
            }
            str2 = str.replaceAll("\\D+", "") + " " + str.replaceAll("\\d+", "");
        } catch (Exception unused) {
        }
        strArr[1] = str2;
        return TextUtils.join(" ", Arrays.asList(strArr)).trim();
    }

    /* JADX INFO: renamed from: k */
    public final String m5896k() {
        return TextUtils.isEmpty(this.f5361f) ? "" : this.f5361f;
    }

    /* JADX INFO: renamed from: l */
    public final String m5897l() {
        return this.f5366k;
    }

    /* JADX INFO: renamed from: m */
    public final C2203g m5898m(String str) {
        this.f5367l = str;
        return this;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("Item{items=");
        sbM5396a.append(this.f5356a);
        sbM5396a.append(", nextMarker='");
        C2177k.m5717c(sbM5396a, this.f5357b, '\'', ", fileId='");
        C2177k.m5717c(sbM5396a, this.f5358c, '\'', ", shareId='");
        C2177k.m5717c(sbM5396a, this.f5359d, '\'', ", name='");
        C2177k.m5717c(sbM5396a, this.f5360e, '\'', ", type='");
        C2177k.m5717c(sbM5396a, this.f5361f, '\'', ", fileExtension='");
        C2177k.m5717c(sbM5396a, this.f5362g, '\'', ", category='");
        C2177k.m5717c(sbM5396a, this.f5363h, '\'', ", size=");
        sbM5396a.append(this.f5364i);
        sbM5396a.append(", parent='");
        sbM5396a.append(this.f5367l);
        sbM5396a.append('\'');
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
