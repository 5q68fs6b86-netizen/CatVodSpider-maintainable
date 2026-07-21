package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.il */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0342il {
    /* JADX INFO: renamed from: a */
    public double mo1317a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: b */
    public int mo1318b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: c */
    public final C0359jb m1319c() {
        if (this instanceof C0359jb) {
            return (C0359jb) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* JADX INFO: renamed from: d */
    public long mo1320d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: e */
    public String mo1321e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            aag aagVar = new aag(stringWriter);
            aagVar.f441k = 1;
            ado.f643z.getClass();
            C0685vd.m1746d(aagVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
