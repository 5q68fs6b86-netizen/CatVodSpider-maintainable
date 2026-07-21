package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.lg */
/* JADX INFO: loaded from: classes.dex */
public final class C0418lg extends EnumC0252fc {
    public C0418lg() {
        super("UPPER_CASE_WITH_UNDERSCORES", 3);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0252fc
    /* JADX INFO: renamed from: a */
    public final String mo1214a(Field field) {
        return EnumC0252fc.m1212c(field.getName(), '_').toUpperCase(Locale.ENGLISH);
    }
}
