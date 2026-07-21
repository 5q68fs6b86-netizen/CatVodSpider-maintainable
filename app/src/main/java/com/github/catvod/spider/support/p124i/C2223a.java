package com.github.catvod.spider.support.p124i;

import android.text.TextUtils;
import com.github.catvod.spider.support.p001A.C0099l;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2177k;
import com.github.catvod.spider.support.p128m.C2256I;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p124i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2223a implements Comparable<C2223a> {

    /* JADX INFO: renamed from: a */
    @SerializedName("fid")
    private String f5545a;

    /* JADX INFO: renamed from: b */
    @SerializedName("file_name")
    private String f5546b;

    /* JADX INFO: renamed from: c */
    @SerializedName("pdir_fid")
    private String f5547c;

    /* JADX INFO: renamed from: d */
    @SerializedName("category")
    private int f5548d;

    /* JADX INFO: renamed from: e */
    @SerializedName("file_type")
    private int f5549e;

    /* JADX INFO: renamed from: f */
    @SerializedName("size")
    private double f5550f;

    /* JADX INFO: renamed from: g */
    @SerializedName("format_type")
    private String f5551g;

    /* JADX INFO: renamed from: h */
    @SerializedName("dir")
    private boolean f5552h;

    /* JADX INFO: renamed from: i */
    @SerializedName("file")
    private boolean f5553i;

    /* JADX INFO: renamed from: j */
    @SerializedName("updated_at")
    private String f5554j;

    /* JADX INFO: renamed from: k */
    @SerializedName("share_fid_token")
    private String f5555k;

    /* JADX INFO: renamed from: l */
    private String f5556l;

    /* JADX INFO: renamed from: a */
    public final int m6027a() {
        return this.f5548d;
    }

    /* JADX INFO: renamed from: b */
    public final String m6028b() {
        return this.f5545a;
    }

    /* JADX INFO: renamed from: c */
    public final String m6029c() {
        StringBuilder sb = new StringBuilder();
        String strReplaceAll = m6036i().replaceAll("\\{[^{}]*\\}|\\[[^\\[\\]]*\\]|\\([^()]*\\)|（[^（）]*）", "");
        if (!TextUtils.isEmpty(strReplaceAll)) {
            sb.append("[");
            sb.append(strReplaceAll);
            sb.append("]");
        }
        if (TextUtils.isEmpty(m6036i())) {
            sb.append(C0099l.format(this.f5546b, ""));
        } else {
            sb.append(C0099l.format(this.f5546b, m6032e()));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: cc */
    public final String m6030cc() {
        return this.f5546b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C2223a c2223a) {
        return m6029c().compareTo(c2223a.m6029c());
    }

    /* JADX INFO: renamed from: d */
    public final String m6031d() {
        return TextUtils.isEmpty(this.f5555k) ? "" : this.f5555k;
    }

    /* JADX INFO: renamed from: e */
    public final String m6032e() {
        if (this.f5550f == 0.0d) {
            return "";
        }
        StringBuilder sbM5396a = C2137a.m5396a("[");
        sbM5396a.append(C2256I.m6111e(this.f5550f));
        sbM5396a.append("]");
        return sbM5396a.toString();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6033f() {
        return this.f5552h;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6034g() {
        return this.f5553i;
    }

    /* JADX INFO: renamed from: h */
    public final void m6035h(String str) {
        this.f5556l = str;
    }

    /* JADX INFO: renamed from: i */
    public final String m6036i() {
        return TextUtils.isEmpty(this.f5556l) ? "" : this.f5556l;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("Item{fid='");
        C2177k.m5717c(sbM5396a, this.f5545a, '\'', ", fileName='");
        C2177k.m5717c(sbM5396a, this.f5546b, '\'', ", pfid='");
        C2177k.m5717c(sbM5396a, this.f5547c, '\'', ", category=");
        sbM5396a.append(this.f5548d);
        sbM5396a.append(", fileType=");
        sbM5396a.append(this.f5549e);
        sbM5396a.append(", size=");
        sbM5396a.append(this.f5550f);
        sbM5396a.append(", formatType='");
        C2177k.m5717c(sbM5396a, this.f5551g, '\'', ", isDir=");
        sbM5396a.append(this.f5552h);
        sbM5396a.append(", isFile=");
        sbM5396a.append(this.f5553i);
        sbM5396a.append(", updatedAt=");
        sbM5396a.append(this.f5554j);
        sbM5396a.append('}');
        return sbM5396a.toString();
    }
}
