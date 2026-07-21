package com.github.catvod.spider.support.p002A0;

import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.jp */
/* JADX INFO: loaded from: classes.dex */
public final class C0373jp {

    /* JADX INFO: renamed from: a */
    public final int f1080a;

    /* JADX INFO: renamed from: b */
    public final int f1081b;

    /* JADX INFO: renamed from: c */
    public final int f1082c;

    public C0373jp(int i, int i2, int i3) {
        this.f1080a = i;
        this.f1081b = i2;
        this.f1082c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0373jp.class != obj.getClass()) {
            return false;
        }
        C0373jp c0373jp = (C0373jp) obj;
        return this.f1080a == c0373jp.f1080a && this.f1081b == c0373jp.f1081b && this.f1082c == c0373jp.f1082c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1080a), Integer.valueOf(this.f1081b), Integer.valueOf(this.f1082c));
    }

    public final String toString() {
        return this.f1081b + "," + this.f1082c + ":" + this.f1080a;
    }
}
