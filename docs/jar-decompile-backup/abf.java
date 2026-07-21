package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class abf {

    /* JADX INFO: renamed from: a */
    public int f501a = -1;

    /* JADX INFO: renamed from: b */
    public C0371jn f502b;

    /* JADX INFO: renamed from: c */
    public abf[] f503c;

    /* JADX INFO: renamed from: d */
    public boolean f504d;

    /* JADX INFO: renamed from: e */
    public int f505e;

    /* JADX INFO: renamed from: f */
    public C0287gk f506f;

    /* JADX INFO: renamed from: g */
    public boolean f507g;

    /* JADX INFO: renamed from: h */
    public abc[] f508h;

    public abf(C0371jn c0371jn) {
        new ArrayList(7);
        new C0370jm(C0369jl.f1051a);
        this.f504d = false;
        this.f502b = c0371jn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abf) {
            return this.f502b.equals(((abf) obj).f502b);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0534po.m1518e(AbstractC0534po.m1523j(7, this.f502b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f501a);
        sb.append(":");
        sb.append(this.f502b);
        if (this.f504d) {
            sb.append("=>");
            abc[] abcVarArr = this.f508h;
            if (abcVarArr != null) {
                sb.append(Arrays.toString(abcVarArr));
            } else {
                sb.append(this.f505e);
            }
        }
        return sb.toString();
    }
}
