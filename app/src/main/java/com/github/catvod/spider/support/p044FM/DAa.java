package com.github.catvod.spider.support.p044FM;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class DAa {
    private static final String KEY = "sLySDp";
    private static final String hexString = "0123456789ABCDEF";

    /* JADX INFO: renamed from: d */
    public static String m3299d(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i = 0; i < str.length(); i += 2) {
            byteArrayOutputStream.write((hexString.indexOf(str.charAt(i)) << 4) | hexString.indexOf(str.charAt(i + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = KEY.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ KEY.charAt(i2 % length2));
        }
        return new String(byteArray);
    }
}
