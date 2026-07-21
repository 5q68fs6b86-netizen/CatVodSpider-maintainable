package com.github.catvod.spider.support.p117b;

import android.annotation.SuppressLint;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.Gf */
/* JADX INFO: loaded from: classes.dex */
public final class C2149Gf {

    /* JADX INFO: renamed from: a */
    public static final Pattern f5098a = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)|http((?!http).)*?video/tos*");

    /* JADX INFO: renamed from: b */
    public static final Pattern f5099b = Pattern.compile("(magnet|thunder|ed2k):.*");

    /* JADX INFO: renamed from: c */
    public static final List<String> f5100c = Arrays.asList("mp4", "mkv", "mov", "wav", "wma", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg", "rmvb");

    /* JADX INFO: renamed from: d */
    public static final List<String> f5101d = Arrays.asList("srt", "ass", "ssa", "vtt");

    /* JADX INFO: renamed from: e */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f5102e = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    /* JADX INFO: renamed from: f */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f5103f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss+00:00");

    /* JADX INFO: renamed from: g */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f5104g = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    /* JADX INFO: renamed from: h */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f5105h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    /* JADX INFO: renamed from: i */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f5106i = new SimpleDateFormat("HH:mm MM/dd/yyyy");

    /* JADX INFO: renamed from: j */
    public static final ArrayList f5107j = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static JSONObject m5533b(String str) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5534b(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static String m5535c(String str, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m5536d(Long l) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(13, l.intValue());
        return f5102e.format(calendar.getTime());
    }

    /* JADX INFO: renamed from: h */
    public static String m5537h(String str) {
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
                str2 = m5543s(matcher2.group(1)) + " " + str2;
            }
            return str2.replaceAll("\\D+", "") + " " + str2.replaceAll("\\d+", "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m5538i(String str) {
        if (str.contains(".")) {
            str = str.substring(str.lastIndexOf(".") + 1);
        }
        return str.toLowerCase();
    }

    /* JADX INFO: renamed from: l */
    public static String m5539l(double d) {
        if (d <= 0.0d) {
            return "";
        }
        int iLog10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(d / Math.pow(1024.0d, iLog10)) + " " + new String[]{"bytes", "KB", "MB", "GB", "TB"}[iLog10];
    }

    /* JADX INFO: renamed from: m */
    public static boolean m5540m(String str) {
        try {
            if (m5534b((CharSequence) str)) {
                return false;
            }
            return m5538i(str).contains("iso");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m5541n(String str) {
        return f5100c.contains(m5538i(str).toLowerCase());
    }

    /* JADX INFO: renamed from: o */
    public static boolean m5542o(String str) {
        return f5101d.contains(m5538i(str).toLowerCase());
    }

    /* JADX INFO: renamed from: s */
    private static String m5543s(String str) {
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

    /* JADX INFO: renamed from: u */
    public static String m5544u(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }
}
