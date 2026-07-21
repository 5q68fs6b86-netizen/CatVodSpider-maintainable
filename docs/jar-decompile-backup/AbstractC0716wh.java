package com.github.catvod.spider.support.p002A0;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.wh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0716wh {

    /* JADX INFO: renamed from: a */
    public static final List f1725a = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");

    /* JADX INFO: renamed from: b */
    public static final List f1726b = Arrays.asList("srt", "ass", "ssa", "vtt");

    /* JADX INFO: renamed from: c */
    public static final String[] f1727c = {"href", "src", "class", "title", "alt"};

    /* JADX INFO: renamed from: d */
    public static String m1784d(String str) {
        if (str.isEmpty()) {
            return str;
        }
        String[] strArr = {"/", "-", "$", "(", ")", Marker.ANY_MARKER, Marker.ANY_NON_NULL_MARKER, ".", "[", "]", "?", "^", "{", "}", "|"};
        String strReplace = str;
        for (int i = 0; i < 15; i++) {
            String str2 = strArr[i];
            if (strReplace.contains(str2)) {
                strReplace = strReplace.replace(str2, "\\" + str2);
            }
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: e */
    public static String m1785e(String str, String str2, HashMap map) {
        try {
            adc adcVar = new adc(0);
            AbstractC0771yi.m1885g(AbstractC0771yi.m1884f(), str, map, adcVar);
            return new String(((Response) adcVar.getResult()).body().bytes(), str2).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m1786f(String str, LinkedHashMap linkedHashMap, HashMap map) {
        try {
            adc adcVar = new adc(1);
            AbstractC0771yi.m1887i(AbstractC0771yi.m1884f(), str, linkedHashMap, map, adcVar);
            return new String(((Response) adcVar.getResult()).body().bytes(), "utf-8").replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m1787g(String str, String str2) {
        try {
            if (str2.startsWith("//")) {
                return Uri.parse(str).getScheme() + ":" + str2;
            }
            if (str2.startsWith("/") && str2.contains("=http")) {
                Uri uri = Uri.parse(str);
                return uri.getScheme() + "://" + uri.getHost() + str2;
            }
            if (str2.startsWith("mac://")) {
                return str2.replace("mac://", Uri.parse(str).getScheme() + "://");
            }
            if (str2.contains("://")) {
                return str2;
            }
            Uri uri2 = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(uri2.getScheme());
            sb.append("://");
            sb.append(uri2.getHost());
            sb.append(!str2.startsWith("/") ? "/".concat(str2) : str2);
            return sb.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m1788h(C0226ed c0226ed, String str, String str2) {
        int i;
        String strM1790j;
        String strM1790j2;
        String[] strArrSplit = str.split(str2);
        ArrayList arrayList = new ArrayList();
        int length = strArrSplit.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String strTrim = strArrSplit[i2].trim();
            if ((strTrim.startsWith("'") && strTrim.endsWith("'")) || (strTrim.startsWith("\"") && strTrim.endsWith("\""))) {
                arrayList.add(strTrim.substring(1, strTrim.length() - 1).replace("\\n", "\n"));
            } else {
                String[] strArrSplit2 = strTrim.split("&&");
                C0226ed c0226edM1791k = strArrSplit2.length == 1 ? c0226ed : m1791k(strArrSplit2[0], c0226ed);
                for (int i3 = 1; i3 < strArrSplit2.length - 1; i3++) {
                    c0226edM1791k = m1791k(strArrSplit2[i3], c0226edM1791k);
                }
                String str3 = strArrSplit2[strArrSplit2.length - 1];
                if (!Marker.ANY_MARKER.equals(str3)) {
                    String[] strArrSplit3 = str3.split("\\|\\|");
                    if (strArrSplit3.length <= 1) {
                        strM1790j = m1790j(c0226edM1791k, str3);
                        break;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= strArrSplit3.length) {
                            strM1790j = m1790j(c0226edM1791k, str3);
                            break;
                        }
                        try {
                            strM1790j2 = m1790j(c0226edM1791k, strArrSplit3[i4]);
                        } catch (Exception e) {
                            e.printStackTrace();
                            strM1790j2 = null;
                        }
                        if (!TextUtils.isEmpty(strM1790j2)) {
                            strM1790j = strM1790j2;
                            break;
                        }
                        i4++;
                    }
                } else {
                    strM1790j = "null";
                }
                arrayList.add(strM1790j);
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() <= 0) {
            return "";
        }
        if (arrayList.size() <= 1) {
            return (String) arrayList.get(0);
        }
        sb.append((String) arrayList.get(0));
        for (i = 1; i < arrayList.size(); i++) {
            sb.append("");
            sb.append((String) arrayList.get(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m1789i(C0226ed c0226ed, String str) {
        if (str.length() == 0 || Marker.ANY_MARKER.equals(str)) {
            return "";
        }
        if (!str.contains(".js:") && !str.contains("＋")) {
            return m1788h(c0226ed, str, "\\+");
        }
        return m1788h(c0226ed, str, "＋");
    }

    /* JADX INFO: renamed from: j */
    public static String m1790j(C0226ed c0226ed, String str) {
        String strMo1228au;
        String strMo1228au2;
        try {
            String[] strArrSplit = str.split("\\.js:");
            if (strArrSplit.length > 1) {
                str = strArrSplit[0];
            }
            String[] strArrSplit2 = str.split("!");
            if (strArrSplit2.length <= 1) {
                if (str.equals("Text")) {
                    strMo1228au = c0226ed.m1169ak();
                } else if ("B64Dec".equals(str)) {
                    strMo1228au = new String(Base64.decode(c0226ed.m1169ak(), 0));
                } else if ("Html".equals(str)) {
                    strMo1228au = c0226ed.m1163ae();
                } else {
                    strMo1228au = str.contains("Attr") ? c0226ed.mo1228au(str.replace("Attr", "")) : c0226ed.mo1228au(str);
                }
                return !"Html".equals(str) ? strMo1228au.replaceAll("\n", " ") : strMo1228au;
            }
            if (strArrSplit2[0].equals("Text")) {
                strMo1228au2 = c0226ed.m1169ak();
            } else if ("B64Dec".equals(strArrSplit2[0])) {
                strMo1228au2 = new String(Base64.decode(c0226ed.m1169ak(), 0));
            } else if ("Html".equals(strArrSplit2[0])) {
                strMo1228au2 = c0226ed.m1163ae();
            } else {
                strMo1228au2 = strArrSplit2[0].contains("Attr") ? c0226ed.mo1228au(strArrSplit2[0].replace("Attr", "")) : c0226ed.mo1228au(strArrSplit2[0]);
            }
            if (!"Html".equals(str)) {
                strMo1228au2 = strMo1228au2.replaceAll("\n", " ");
            }
            for (int i = 1; i < strArrSplit2.length; i++) {
                strMo1228au2 = strMo1228au2.replace(strArrSplit2[i], "");
            }
            return strMo1228au2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static C0226ed m1791k(String str, C0226ed c0226ed) {
        C0226ed c0226edM1791k;
        if (str.startsWith("Text") || str.startsWith("Attr")) {
            return c0226ed;
        }
        for (String str2 : f1727c) {
            if (str2.equals(str)) {
                return c0226ed;
            }
        }
        String[] strArrSplit = str.split("--");
        if (strArrSplit.length > 1) {
            C0226ed c0226edM1791k2 = m1791k(strArrSplit[0], c0226ed);
            String strMo1192an = c0226edM1791k2.mo1192an();
            for (int i = 1; i < strArrSplit.length; i++) {
                strMo1192an = strMo1192an.replace(m1791k(strArrSplit[i], c0226edM1791k2).mo1192an(), "");
                c0226edM1791k2 = AbstractC0502oj.m1487a(strMo1192an);
            }
            return c0226edM1791k2;
        }
        String[] strArrSplit2 = str.split("\\|\\|");
        if (strArrSplit2.length > 1) {
            for (String str3 : strArrSplit2) {
                try {
                    c0226edM1791k = m1791k(str3, c0226ed);
                } catch (Exception e) {
                    e.printStackTrace();
                    c0226edM1791k = null;
                }
                if (c0226edM1791k != null) {
                    return c0226edM1791k;
                }
            }
        }
        String[] strArrSplit3 = str.split(",");
        if (strArrSplit3.length > 1) {
            int i2 = Integer.parseInt(strArrSplit3[1]);
            C0589rp c0589rpM1166ah = c0226ed.m1166ah(strArrSplit3[0]);
            return i2 < 0 ? (C0226ed) c0589rpM1166ah.get(c0589rpM1166ah.size() + i2) : (C0226ed) c0226ed.m1166ah(strArrSplit3[0]).get(i2);
        }
        C0589rp c0589rpM1166ah2 = c0226ed.m1166ah(str);
        if (c0589rpM1166ah2.isEmpty()) {
            return null;
        }
        return (C0226ed) c0589rpM1166ah2.get(0);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m1792l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("magnet:") || lowerCase.startsWith("ed2k:") || lowerCase.startsWith("thunder:")) {
            return true;
        }
        return (lowerCase.startsWith("http") && lowerCase.split(";")[0].endsWith(".torrent")) || lowerCase.startsWith("ftp://") || lowerCase.startsWith("tvbox-xg:") || lowerCase.startsWith("xg://") || lowerCase.startsWith("xgplay://");
    }

    /* JADX INFO: renamed from: m */
    public static String m1793m(String str) {
        String[] strArr = {"[排序", "[替换", "[不包含"};
        for (int i = 0; i < 3; i++) {
            String str2 = strArr[i];
            if (str.contains(str2)) {
                str = str.substring(0, str.indexOf(str2));
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: n */
    public static String m1794n(String str, String str2) {
        if (!str.isEmpty()) {
            for (String str3 : ((String) m1797q(str2, "[替换:", "]").get(0)).split("\\|\\|")) {
                if (str3.contains("=>")) {
                    str = str3.split("=>").length < 2 ? str.replace(str3.split("=>")[0], "") : str.replace(str3.split("=>")[0], str3.split("=>")[1]);
                }
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static C0589rp m1795o(C0226ed c0226ed, String str) {
        int i;
        int size;
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length <= 1) {
            return c0226ed.m1166ah(str);
        }
        String[] strArrSplit2 = strArrSplit[1].split(":", -1);
        if (TextUtils.isEmpty(strArrSplit2[0])) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(strArrSplit2[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                i = 0;
            }
        }
        if (TextUtils.isEmpty(strArrSplit2[1])) {
            size = 0;
        } else {
            try {
                size = Integer.parseInt(strArrSplit2[1]);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                size = 0;
            }
        }
        C0589rp c0589rpM1166ah = c0226ed.m1166ah(strArrSplit[0]);
        if (size > c0589rpM1166ah.size()) {
            size = c0589rpM1166ah.size();
        }
        if (size <= 0) {
            size += c0589rpM1166ah.size();
        }
        C0589rp c0589rp = new C0589rp();
        while (i < size) {
            c0589rp.add((C0226ed) c0589rpM1166ah.get(i));
            i++;
        }
        return c0589rp;
    }

    /* JADX INFO: renamed from: p */
    public static String m1796p(String str) {
        String strTrim;
        String str2;
        try {
            String str3 = str.split("/share")[0];
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
            String strReplace = AbstractC0771yi.m1889k(str, map).replace("var purl", "var main");
            String str4 = null;
            if (strReplace.indexOf("main") != -1) {
                Matcher matcher = Pattern.compile("var main = ['\"](.*?)['\"]").matcher(strReplace);
                if (matcher.find()) {
                    strTrim = matcher.group(1).trim();
                    if (strTrim.indexOf("http") != -1) {
                        str4 = strTrim;
                    } else {
                        str2 = str3 + strTrim;
                        str4 = str2;
                    }
                }
            } else {
                Matcher matcher2 = Pattern.compile("url:.*?['\"](.*?)['\"]").matcher(strReplace);
                if (matcher2.find()) {
                    strTrim = matcher2.group(1).trim();
                    if (strTrim.indexOf("http") != -1) {
                        str4 = strTrim;
                    } else {
                        str2 = str3 + strTrim;
                        str4 = str2;
                    }
                }
            }
            return str4 != null ? str4 : str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: q */
    public static ArrayList m1797q(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (str2.isEmpty() && str3.isEmpty()) {
            arrayList.add(str);
            return arrayList;
        }
        try {
            Matcher matcher = Pattern.compile(m1784d(str2.replaceAll("＆＆", "&")) + "(.*?)" + m1784d(str3.replaceAll("＆＆", "&"))).matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1).trim());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (arrayList.isEmpty()) {
            arrayList.add("");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static String m1798r(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArrSplit = str.split("\\\\u");
        for (int i = 1; i < strArrSplit.length; i++) {
            stringBuffer.append((char) Integer.parseInt(strArrSplit[i], 16));
        }
        return stringBuffer.toString();
    }
}
