package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class add extends aaf {

    /* JADX INFO: renamed from: d */
    public static final add f601d = new add(1, 0, 1);

    @Override // com.github.catvod.spider.support.p002A0.aaf
    public final boolean equals(Object obj) {
        if (obj instanceof add) {
            if (!isEmpty() || !((add) obj).isEmpty()) {
                add addVar = (add) obj;
                if (this.f428a == addVar.f428a) {
                    if (this.f429b == addVar.f429b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.github.catvod.spider.support.p002A0.aaf
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f428a * 31) + this.f429b;
    }

    @Override // com.github.catvod.spider.support.p002A0.aaf
    public final boolean isEmpty() {
        return this.f428a > this.f429b;
    }

    @Override // com.github.catvod.spider.support.p002A0.aaf
    public final String toString() {
        return this.f428a + ".." + this.f429b;
    }
}
