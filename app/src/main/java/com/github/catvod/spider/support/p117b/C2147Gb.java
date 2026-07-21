package com.github.catvod.spider.support.p117b;

import java.util.Random;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.Gb */
/* JADX INFO: loaded from: classes.dex */
public final class C2147Gb {

    /* JADX INFO: renamed from: a */
    private static final Random f5096a = new Random();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static String m5531a(int i, char[] cArr, Random random) {
        char cNextInt;
        if (cArr != 0 && cArr.length == 0) {
            throw new IllegalArgumentException("The chars array must not be empty");
        }
        if (i == 0) {
            i = cArr != 0 ? cArr.length : 1114111;
        } else if (i <= 0) {
            throw new IllegalArgumentException("Parameter end (" + i + ") must be greater than start (0)");
        }
        int i2 = 32;
        StringBuilder sb = new StringBuilder(32);
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return sb.toString();
            }
            if (cArr == 0) {
                cNextInt = random.nextInt(i);
                int type = Character.getType(cNextInt);
                if (type == 0 || type == 18 || type == 19) {
                }
            } else {
                cNextInt = cArr[random.nextInt(i)];
            }
            int iCharCount = Character.charCount(cNextInt);
            if (i3 != 0 || iCharCount <= 1) {
                sb.appendCodePoint(cNextInt);
                i2 = iCharCount == 2 ? i2 - 2 : i3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m5532b(String str) {
        Random random = f5096a;
        char[] charArray = str.toCharArray();
        return charArray == null ? m5531a(0, null, random) : m5531a(charArray.length, charArray, random);
    }
}
