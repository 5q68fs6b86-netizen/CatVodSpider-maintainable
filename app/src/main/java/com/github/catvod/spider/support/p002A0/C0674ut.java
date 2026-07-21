package com.github.catvod.spider.support.p002A0;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ut */
/* JADX INFO: loaded from: classes.dex */
public final class C0674ut implements Cloneable {

    /* JADX INFO: renamed from: a */
    public EnumC0255ff f1580a;

    /* JADX INFO: renamed from: b */
    public Charset f1581b;

    /* JADX INFO: renamed from: c */
    public boolean f1582c;

    /* JADX INFO: renamed from: d */
    public int f1583d;

    /* JADX INFO: renamed from: e */
    public int f1584e;

    /* JADX INFO: renamed from: f */
    public int f1585f;

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C0674ut clone() {
        try {
            C0674ut c0674ut = (C0674ut) super.clone();
            String strName = this.f1581b.name();
            c0674ut.getClass();
            c0674ut.f1581b = Charset.forName(strName);
            c0674ut.f1580a = (EnumC0255ff) Enum.valueOf(EnumC0255ff.class, this.f1580a.name());
            return c0674ut;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
