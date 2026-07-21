package com.github.catvod.spider.support.p012C0.p035j;

import android.util.TypedValue;
import com.github.catvod.spider.Init;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p035j.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1247o {

    /* JADX INFO: renamed from: a */
    public static final int f2943a = 0;

    static {
        Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "mp3", "aac", "flac", "m4a", "ape", "ogg");
        Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|http((?!http).)*?video/tos*");
    }

    /* JADX INFO: renamed from: a */
    public static int m3111a(int i) {
        return (int) TypedValue.applyDimension(1, i, Init.context().getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: b */
    public static String m3112b(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }

    /* JADX INFO: renamed from: c */
    public static String m3113c(double d) {
        if (d <= 0.0d) {
            return "";
        }
        if (d > 1.099511627776E12d) {
            return String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.099511627776E12d), "TB");
        }
        if (d > 1.073741824E9d) {
            return String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.073741824E9d), "GB");
        }
        return d > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1024.0d), "KB");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3114d(String str) {
        return str.equals("srt") || str.equals("ass") || str.equals("ssa");
    }

    /* JADX INFO: renamed from: e */
    public static String m3115e(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }
}
