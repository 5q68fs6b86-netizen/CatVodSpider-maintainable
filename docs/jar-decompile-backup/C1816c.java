package com.github.catvod.spider.support.p044FM.p083h;

import android.text.TextUtils;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p075c.C1767i;
import com.github.catvod.spider.support.p044FM.p075c.C1768j;
import com.github.catvod.spider.support.p126k.C2238b;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p083h.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1816c {

    /* JADX INFO: renamed from: a */
    @SerializedName("name")
    private String f4143a;

    /* JADX INFO: renamed from: b */
    @SerializedName("url")
    private final String f4144b;

    /* JADX INFO: renamed from: c */
    @SerializedName("icon")
    private String f4145c;

    /* JADX INFO: renamed from: d */
    @SerializedName("copy")
    private String f4146d;

    /* JADX INFO: renamed from: e */
    @SerializedName("version")
    private String f4147e;

    public C1816c(String str) {
        this.f4144b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m4406a() {
        return TextUtils.isEmpty(this.f4146d) ? "" : this.f4146d;
    }

    /* JADX INFO: renamed from: b */
    public final String m4407b() {
        return TextUtils.isEmpty(this.f4144b) ? "" : this.f4144b;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX INFO: renamed from: c */
    public final C1768j m4408c() {
        String strGroup;
        String str;
        String strM6073l;
        Matcher matcher;
        String str2 = TextUtils.isEmpty(this.f4143a) ? "" : this.f4143a;
        String str3 = TextUtils.isEmpty(this.f4145c) ? "" : this.f4145c;
        if (!TextUtils.isEmpty(this.f4147e)) {
            String strM6073l2 = this.f4147e;
            if (strM6073l2.equals("version")) {
                strM6073l2 = C2238b.m6073l("https://oss-v1.wangmeipo.cn/236/version.txt", new HashMap());
                if (TextUtils.isEmpty(strM6073l2)) {
                    str = Init.f203v;
                }
                if (!TextUtils.isEmpty(this.f4147e) && this.f4147e.equals("Fongmi")) {
                    strM6073l = C2238b.m6073l("https://wget.la/https://raw.githubusercontent.com/FongMi/Release/fongmi/apk/mobile.json", new HashMap());
                    if (!TextUtils.isEmpty(strM6073l)) {
                        matcher = Pattern.compile("\"name\"\\s*:\\s*\"([^\"]+)\"").matcher(strM6073l);
                        if (matcher.find()) {
                            strGroup = matcher.group(1);
                        }
                    }
                }
                return new C1768j("", str2, str3, strGroup, C1767i.m4214a(1.0f), m4407b());
            }
            strGroup = strM6073l2;
            if (!TextUtils.isEmpty(this.f4147e)) {
                strM6073l = C2238b.m6073l("https://wget.la/https://raw.githubusercontent.com/FongMi/Release/fongmi/apk/mobile.json", new HashMap());
                if (!TextUtils.isEmpty(strM6073l)) {
                    matcher = Pattern.compile("\"name\"\\s*:\\s*\"([^\"]+)\"").matcher(strM6073l);
                    if (matcher.find()) {
                        strGroup = matcher.group(1);
                    }
                }
            }
            return new C1768j("", str2, str3, strGroup, C1767i.m4214a(1.0f), m4407b());
        }
        str = Init.f203v;
        strGroup = str;
        if (!TextUtils.isEmpty(this.f4147e)) {
            strM6073l = C2238b.m6073l("https://wget.la/https://raw.githubusercontent.com/FongMi/Release/fongmi/apk/mobile.json", new HashMap());
            if (!TextUtils.isEmpty(strM6073l)) {
                matcher = Pattern.compile("\"name\"\\s*:\\s*\"([^\"]+)\"").matcher(strM6073l);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                }
            }
        }
        return new C1768j("", str2, str3, strGroup, C1767i.m4214a(1.0f), m4407b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1816c) {
            return m4407b().equals(((C1816c) obj).m4407b());
        }
        return false;
    }
}
