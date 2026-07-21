package com.github.catvod.spider.support.p127l;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p127l.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2245e implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C2245e f5605a = new C2245e();

    private /* synthetic */ C2245e() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }
}
