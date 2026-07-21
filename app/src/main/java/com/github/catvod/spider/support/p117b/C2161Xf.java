package com.github.catvod.spider.support.p117b;

import android.annotation.SuppressLint;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.Xf */
/* JADX INFO: loaded from: classes.dex */
public final class C2161Xf {

    /* JADX INFO: renamed from: a */
    public static final Pattern f5172a = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)|http((?!http).)*?video/tos*");

    /* JADX INFO: renamed from: b */
    public static final Pattern f5173b = Pattern.compile("(magnet|thunder|ed2k):.*");

    /* JADX INFO: renamed from: c */
    public static final List<String> f5174c = Arrays.asList("mp4", "mkv", "mov", "wav", "wma", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg", "rmvb");

    /* JADX INFO: renamed from: d */
    public static final List<String> f5175d = Arrays.asList("srt", "ass", "ssa", "vtt");

    /* JADX INFO: renamed from: e */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f5176e = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    /* JADX INFO: renamed from: f */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f5177f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss+00:00");

    /* JADX INFO: renamed from: g */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f5178g = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    /* JADX INFO: renamed from: h */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f5179h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    /* JADX INFO: renamed from: i */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f5180i = new SimpleDateFormat("HH:mm MM/dd/yyyy");

    /* JADX INFO: renamed from: j */
    public static final ArrayList f5181j = new ArrayList();

    /* JADX INFO: renamed from: h */
    public static String m5645h(String str) {
        String str2;
        try {
            Matcher matcher = Pattern.compile(".*(1080|720|2160|4k|4K).*").matcher(str);
            if (matcher.find()) {
                str2 = matcher.group(1) + " " + str;
            } else {
                str2 = str;
            }
            Matcher matcher2 = Pattern.compile("^([0-9]+)").matcher(str);
            if (matcher2.find()) {
                str2 = m5650r(matcher2.group(1)) + " " + str2;
            }
            return str2.replaceAll("\\D+", "") + " " + str2.replaceAll("\\d+", "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m5646i(String str) {
        if (str.contains(".")) {
            str = str.substring(str.lastIndexOf(".") + 1);
        }
        return str.toLowerCase();
    }

    /* JADX INFO: renamed from: l */
    public static String m5647l(double d) {
        if (d <= 0.0d) {
            return "";
        }
        int iLog10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(d / Math.pow(1024.0d, iLog10)) + " " + new String[]{"bytes", "KB", "MB", "GB", "TB"}[iLog10];
    }

    /* JADX INFO: renamed from: m */
    public static boolean m5648m(String str) {
        return f5174c.contains(m5646i(str).toLowerCase());
    }

    /* JADX INFO: renamed from: n */
    public static boolean m5649n(String str) {
        return f5175d.contains(m5646i(str).toLowerCase());
    }

    /* JADX INFO: renamed from: r */
    private static String m5650r(String str) {
        if (str == null) {
            return String.format("%6s", "").replace(' ', '0');
        }
        if (str.isEmpty()) {
        }
        if (str.length() >= 6) {
            return str;
        }
        return String.format("%6s", str).replace(' ', '0');
    }

    /* JADX INFO: renamed from: s */
    public static String m5651s(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }
}
