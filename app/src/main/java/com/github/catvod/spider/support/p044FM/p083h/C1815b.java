package com.github.catvod.spider.support.p044FM.p083h;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p075c.C1768j;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p083h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1815b {

    /* JADX INFO: renamed from: a */
    @SerializedName("name")
    private String f4141a;

    /* JADX INFO: renamed from: b */
    @SerializedName("list")
    private List<C1816c> f4142b;

    /* JADX INFO: renamed from: a */
    public static List<C1815b> m4402a(String str) {
        return (List) new Gson().fromJson(str, new C1814a().getType());
    }

    /* JADX INFO: renamed from: b */
    public final List<C1816c> m4403b() {
        List<C1816c> list = this.f4142b;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: c */
    public final String m4404c() {
        return TextUtils.isEmpty(this.f4141a) ? "" : this.f4141a;
    }

    /* JADX INFO: renamed from: d */
    public final List<C1768j> m4405d() {
        ArrayList arrayList = new ArrayList();
        Iterator<C1816c> it = m4403b().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m4408c());
        }
        return arrayList;
    }
}
