package com.github.catvod.spider.support.p044FM.p077d;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p077d.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1780i {

    /* JADX INFO: renamed from: a */
    @SerializedName("live_transcoding_task_list")
    private List<C1781j> f3978a;

    /* JADX INFO: renamed from: b */
    @SerializedName("live_transcoding_subtitle_task_list")
    private List<C1781j> f3979b;

    /* JADX INFO: renamed from: a */
    public final List<C1781j> m4263a() {
        List<C1781j> list = this.f3979b;
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: b */
    public final List<C1781j> m4264b() {
        List<C1781j> list = this.f3978a;
        return list == null ? Collections.emptyList() : list;
    }
}
