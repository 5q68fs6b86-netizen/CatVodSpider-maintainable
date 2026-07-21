package com.github.catvod.spider.support.p044FM.p077d;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.d.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1778g implements Comparable<C1778g> {

    /* JADX INFO: renamed from: a */
    @SerializedName("items")
    private List<C1778g> f3965a;

    /* JADX INFO: renamed from: b */
    @SerializedName("next_marker")
    private String f3966b;

    /* JADX INFO: renamed from: c */
    @SerializedName("file_id")
    private final String f3967c;

    /* JADX INFO: renamed from: d */
    @SerializedName("share_id")
    private String f3968d;

    /* JADX INFO: renamed from: e */
    @SerializedName("name")
    private String f3969e;

    /* JADX INFO: renamed from: f */
    @SerializedName("type")
    private String f3970f;

    /* JADX INFO: renamed from: g */
    @SerializedName("file_extension")
    private String f3971g;

    /* JADX INFO: renamed from: h */
    @SerializedName("category")
    private String f3972h;

    /* JADX INFO: renamed from: i */
    @SerializedName("size")
    private double f3973i;

    /* JADX INFO: renamed from: j */
    @SerializedName("parent")
    private String f3974j;

    public C1778g(String str) {
        this.f3967c = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m4249a() {
        return TextUtils.isEmpty(this.f3972h) ? "" : this.f3972h;
    }

    /* JADX INFO: renamed from: b */
    public final String m4250b() {
        String strM3588a;
        String[] strArr = new String[3];
        strArr[0] = m4256h();
        strArr[1] = m4254f();
        if (this.f3973i == 0.0d) {
            strM3588a = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(C1885z.m4568g(this.f3973i));
            strM3588a = C1434P.m3588a(new byte[]{92}, new byte[]{1, -101, 95, 33, 103, 81, 54, -59}, sb);
        }
        strArr[2] = strM3588a;
        return TextUtils.join(" ", Arrays.asList(strArr)).trim();
    }

    /* JADX INFO: renamed from: c */
    public final String m4251c() {
        return TextUtils.isEmpty(this.f3971g) ? "" : this.f3971g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1778g c1778g) {
        return m4257i().compareTo(c1778g.m4257i());
    }

    /* JADX INFO: renamed from: d */
    public final String m4252d() {
        return TextUtils.isEmpty(this.f3967c) ? "" : this.f3967c;
    }

    /* JADX INFO: renamed from: e */
    public final List<C1778g> m4253e() {
        List<C1778g> list = this.f3965a;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: f */
    public final String m4254f() {
        return TextUtils.isEmpty(this.f3969e) ? "" : this.f3969e;
    }

    /* JADX INFO: renamed from: g */
    public final String m4255g() {
        return TextUtils.isEmpty(this.f3966b) ? "" : this.f3966b;
    }

    /* JADX INFO: renamed from: h */
    public final String m4256h() {
        if (TextUtils.isEmpty(this.f3974j)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f3974j);
        return C1434P.m3588a(new byte[]{-96}, new byte[]{-3, 72, 121, 87, 29, 91, -108, 84}, sb);
    }

    /* JADX INFO: renamed from: i */
    public final String m4257i() {
        String str;
        String[] strArr = new String[2];
        strArr[0] = m4256h();
        String strM4254f = m4254f();
        Pattern pattern = C1885z.f4347a;
        String str2 = "";
        try {
            Matcher matcher = Pattern.compile(".*(1080|720|2160|4k|4K).*").matcher(strM4254f);
            if (matcher.find()) {
                str = matcher.group(1) + " " + strM4254f;
            } else {
                str = strM4254f;
            }
            Matcher matcher2 = Pattern.compile("^([0-9]+)").matcher(strM4254f);
            if (matcher2.find()) {
                str = matcher2.group(1) + " " + str;
            }
            str2 = str.replaceAll("\\D+", "") + " " + str.replaceAll("\\d+", "");
        } catch (Exception unused) {
        }
        strArr[1] = str2;
        return TextUtils.join(" ", Arrays.asList(strArr)).trim();
    }

    /* JADX INFO: renamed from: j */
    public final String m4258j() {
        return TextUtils.isEmpty(this.f3970f) ? "" : this.f3970f;
    }

    /* JADX INFO: renamed from: k */
    public final C1778g m4259k(String str) {
        this.f3974j = str;
        return this;
    }
}
