package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Field;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.fc */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC0252fc {

    /* JADX INFO: renamed from: b */
    public static final C0789z f815b = new C0789z();

    /* JADX INFO: renamed from: c */
    public static String m1212c(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m1213d(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo1214a(Field field);
}
