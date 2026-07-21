package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.mx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0462mx {
    /* JADX INFO: renamed from: a */
    public static void m1441a(int i) {
        add addVar = new add(2, 36, 1);
        if (2 > i || i > addVar.f429b) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new add(2, 36, 1));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m1442b(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
