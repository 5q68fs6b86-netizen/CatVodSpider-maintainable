package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.uw */
/* JADX INFO: loaded from: classes.dex */
public final enum C0677uw extends EnumC0252fc {
    public C0677uw() {
        super("LOWER_CASE_WITH_DOTS", 6);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0252fc
    /* JADX INFO: renamed from: a */
    public final String mo1214a(Field field) {
        return EnumC0252fc.m1212c(field.getName(), '.').toLowerCase(Locale.ENGLISH);
    }
}
