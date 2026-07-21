package com.github.catvod.spider.support.p118c;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p118c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2190a {

    /* JADX INFO: renamed from: a */
    @SerializedName("type_id")
    private String f5270a;

    /* JADX INFO: renamed from: b */
    @SerializedName("type_name")
    private String f5271b;

    /* JADX INFO: renamed from: c */
    @SerializedName("type_flag")
    private String f5272c;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p118c.a$a */
    class a extends TypeToken<List<C2190a>> {
        a() {
        }
    }

    public C2190a(String str, String str2) {
        this.f5270a = str;
        this.f5271b = str2;
        this.f5272c = null;
    }

    public C2190a(String str, String str2, String str3) {
        this.f5270a = str;
        this.f5271b = str2;
        this.f5272c = str3;
    }

    /* JADX INFO: renamed from: a */
    public static List<C2190a> m5789a(String str) {
        return (List) new Gson().fromJson(str, new a().getType());
    }

    /* JADX INFO: renamed from: a */
    public final String m5790a() {
        return this.f5270a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2190a) {
            return this.f5270a.equals(((C2190a) obj).f5270a);
        }
        return false;
    }
}
