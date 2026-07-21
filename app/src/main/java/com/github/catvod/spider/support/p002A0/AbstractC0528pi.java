package com.github.catvod.spider.support.p002A0;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.pi */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0528pi extends AbstractList implements List, InterfaceC0254fe {
    /* JADX INFO: renamed from: i */
    public abstract int mo997i();

    /* JADX INFO: renamed from: j */
    public abstract Object mo998j(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo998j(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo997i();
    }
}
