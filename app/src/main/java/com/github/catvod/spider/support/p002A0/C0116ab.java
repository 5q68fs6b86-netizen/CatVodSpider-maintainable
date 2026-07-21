package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0116ab {

    /* JADX INFO: renamed from: a */
    public final Object[] f465a;

    /* JADX INFO: renamed from: b */
    public final int f466b;

    public C0116ab(Object... objArr) {
        this.f465a = objArr;
        this.f466b = Arrays.hashCode(objArr) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0116ab.class == obj.getClass()) {
            return Arrays.deepEquals(this.f465a, ((C0116ab) obj).f465a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f466b;
    }
}
