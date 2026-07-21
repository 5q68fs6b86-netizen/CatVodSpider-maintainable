package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.im */
/* JADX INFO: loaded from: classes.dex */
public class C0343im extends AbstractC0680uz implements Cloneable {

    /* JADX INFO: renamed from: b */
    public String f1013b;

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0680uz
    /* JADX INFO: renamed from: a */
    public final void mo904a() {
        this.f1013b = null;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0343im clone() {
        try {
            return (C0343im) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f1013b;
    }
}
