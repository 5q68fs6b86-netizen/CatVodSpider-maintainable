package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.qn */
/* JADX INFO: loaded from: classes.dex */
public static final class C0560qn extends EnumC0252fc {
    public C0560qn() {
        super("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0252fc
    /* JADX INFO: renamed from: a */
    public final String mo1214a(Field field) {
        return EnumC0252fc.m1213d(EnumC0252fc.m1212c(field.getName(), ' '));
    }
}
