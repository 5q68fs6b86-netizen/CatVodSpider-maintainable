package com.github.catvod.spider;
import com.github.catvod.spider.support.p116a.C2137a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0405ku;
import com.github.catvod.spider.support.p002A0.AbstractC0502oj;
import com.github.catvod.spider.support.p002A0.AbstractC0716wh;
import com.github.catvod.spider.support.p002A0.AbstractC0763ya;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import com.github.catvod.spider.support.p002A0.C0226ed;
import com.github.catvod.spider.support.p002A0.C0235em;
import com.github.catvod.spider.support.p002A0.C0589rp;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class XYQHiker extends Spider {

    /* JADX INFO: renamed from: a */
    public static final String[] f346a = {"ajax/verify_check", "ajax.php?ac=code_check", "/verify/index.html", "?scheckAC=check"};

    /* JADX INFO: renamed from: b */
    public static final String[] f347b = {"href", "src", "class", "title", "alt"};

    /* JADX INFO: renamed from: c */
    public String f348c = "";

    /* JADX INFO: renamed from: d */
    public String f349d = "";

    /* JADX INFO: renamed from: e */
    public final String f350e = "";

    /* JADX INFO: renamed from: f */
    public final String f351f = "";

    /* JADX INFO: renamed from: g */
    public final JSONObject f352g = new JSONObject();

    /* JADX INFO: renamed from: h */
    public final String f353h = "[\\W|\\S|.]*?MacPlayerConfig.player_list[\\W|\\S|.]*?=([\\W|\\S|.]*?),MacPlayerConfig.downer_list";

    /* JADX INFO: renamed from: i */
    public String f354i = null;

    /* JADX INFO: renamed from: j */
    public JSONObject f355j = null;

    /* JADX INFO: renamed from: k */
    public String f356k = null;

    /* JADX INFO: renamed from: l */
    public boolean f357l;

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQHiker$1 */
    class C00691 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQHiker$2 */
    class C00702 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQHiker$3 */
    class C00713 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQHiker$4 */
    class C00724 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    public static boolean checkstring(String str) {
        String[] strArr = {"m3u8.pw/Cache", "from=https://banyung.pw", "getm3u8?url=http"};
        for (int i = 0; i < 3; i++) {
            if (str.contains(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkveriry(String str) {
        String[] strArr = f346a;
        for (int i = 0; i < 4; i++) {
            if (str.contains(strArr[i]) && !str.contains("myui-vodbox-content")) {
                return true;
            }
        }
        return false;
    }

    public static String getText(C0226ed c0226ed, String str) {
        String strM749p;
        if (Marker.ANY_MARKER.equals(str)) {
            return "null";
        }
        String[] strArrSplit = str.split("\\|\\|");
        if (strArrSplit.length > 1) {
            for (String str2 : strArrSplit) {
                try {
                    strM749p = m749p(c0226ed, str2);
                } catch (Exception e) {
                    e.printStackTrace();
                    strM749p = null;
                }
                if (!TextUtils.isEmpty(strM749p)) {
                    return strM749p;
                }
            }
        }
        return m749p(c0226ed, str);
    }

    public static String getTextByRule(C0226ed c0226ed, String str) {
        if (str == null || str.length() == 0 || Marker.ANY_MARKER.equals(str)) {
            return "";
        }
        if (!str.contains(".js:") && !str.contains("＋")) {
            return m748o(c0226ed, str, "\\+");
        }
        return m748o(c0226ed, str, "＋");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0226ed getTrueElement(String str, C0226ed c0226ed) {
        C0226ed trueElement;
        if (str.startsWith("Text") || str.startsWith("Attr")) {
            return c0226ed;
        }
        String[] strArr = f347b;
        for (int i = 0; i < 5; i++) {
            if (strArr[i].equals(str)) {
                return c0226ed;
            }
        }
        String[] strArrSplit = str.split("--");
        if (strArrSplit.length > 1) {
            C0226ed trueElement2 = getTrueElement(strArrSplit[0], c0226ed);
            String strMo1192an = trueElement2.mo1192an();
            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                strMo1192an = strMo1192an.replace(getTrueElement(strArrSplit[i2], trueElement2).mo1192an(), "");
                trueElement2 = AbstractC0502oj.m1487a(strMo1192an);
            }
            return trueElement2;
        }
        String[] strArrSplit2 = str.split("\\|\\|");
        if (strArrSplit2.length > 1) {
            for (String str2 : strArrSplit2) {
                try {
                    trueElement = getTrueElement(str2, c0226ed);
                } catch (Exception e) {
                    e.printStackTrace();
                    trueElement = null;
                }
                if (trueElement != null) {
                    return trueElement;
                }
            }
        }
        String[] strArrSplit3 = str.split(",");
        if (strArrSplit3.length > 1) {
            int i3 = Integer.parseInt(strArrSplit3[1]);
            C0589rp c0589rpM1166ah = c0226ed.m1166ah(strArrSplit3[0]);
            return i3 < 0 ? (C0226ed) c0589rpM1166ah.get(c0589rpM1166ah.size() + i3) : (C0226ed) c0226ed.m1166ah(strArrSplit3[0]).get(i3);
        }
        C0589rp c0589rpM1166ah2 = c0226ed.m1166ah(str);
        if (c0589rpM1166ah2.isEmpty()) {
            return null;
        }
        return (C0226ed) c0589rpM1166ah2.get(0);
    }

    public static String listToString(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        if (list == null || list.size() <= 0) {
            return "";
        }
        if (list.size() <= 1) {
            return list.get(0);
        }
        sb.append(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(str);
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m746m(String str) {
        Matcher matcher = Pattern.compile("(\\\\u(\\w{4}))").matcher(str);
        while (matcher.find()) {
            str = str.replace(matcher.group(1), ((char) Integer.parseInt(matcher.group(2), 16)) + "");
        }
        return str;
    }

    /* JADX INFO: renamed from: n */
    public static String m747n() {
        int i = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
        int i2 = i - 20;
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        String str = "";
        while (i2 >= i) {
            if (i2 == i) {
                str = str + String.valueOf(i2);
            } else {
                str = str + String.valueOf(i2) + "&";
            }
            i2--;
        }
        return str;
    }

    /* JADX INFO: renamed from: o */
    public static String m748o(C0226ed c0226ed, String str, String str2) {
        String[] strArrSplit = str.split(str2);
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            String strTrim = str3.trim();
            if ((strTrim.startsWith("'") && strTrim.endsWith("'")) || (strTrim.startsWith("\"") && strTrim.endsWith("\""))) {
                arrayList.add(strTrim.substring(1, strTrim.length() - 1).replace("\\n", "\n"));
            } else {
                String[] strArrSplit2 = strTrim.split("&&");
                C0226ed trueElement = strArrSplit2.length == 1 ? c0226ed : getTrueElement(strArrSplit2[0], c0226ed);
                for (int i = 1; i < strArrSplit2.length - 1; i++) {
                    trueElement = getTrueElement(strArrSplit2[i], trueElement);
                }
                arrayList.add(getText(trueElement, strArrSplit2[strArrSplit2.length - 1]));
            }
        }
        return listToString(arrayList, "");
    }

    /* JADX INFO: renamed from: p */
    public static String m749p(C0226ed c0226ed, String str) {
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
    /* JADX INFO: renamed from: q */
    public static C0589rp m750q(C0226ed c0226ed, String str) {
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

    public static C0589rp selectElements(C0226ed c0226ed, String str) {
        String[] strArrSplit = str.split("\\|\\|");
        C0589rp c0589rp = new C0589rp();
        for (String str2 : strArrSplit) {
            try {
                c0589rp.addAll(m750q(c0226ed, str2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return c0589rp;
    }

    public static String string2Hex(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length() - 1; i++) {
            String strValueOf = String.valueOf((int) str.charAt(i));
            if (str2.equals("djs")) {
                sb.append(strValueOf);
            } else {
                sb.append(Integer.parseInt(strValueOf) + 1);
            }
        }
        return sb.toString();
    }

    public static String vertype(String str) {
        String[] strArr = f346a;
        for (int i = 0; i < 4; i++) {
            String str2 = strArr[i];
            if (str.contains(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: aa */
    public final String m751aa(String str) {
        return m752ab(str, "");
    }

    /* JADX INFO: renamed from: ab */
    public final String m752ab(String str, String str2) {
        String strOptString = this.f355j.optString(str);
        return (strOptString.isEmpty() || strOptString.equals("空") || strOptString.equals("&&")) ? str2 : strOptString;
    }

    /* JADX INFO: renamed from: ac */
    public final HashMap m753ac(String str) throws JSONException {
        HashMap map;
        String str2;
        HashMap map2;
        HashMap map3 = new HashMap();
        String strTrim = m752ab(m752ab("搜索请求头参数", "").isEmpty() ? "SHeaders" : "搜索请求头参数", "").trim();
        boolean zContains = strTrim.contains("$");
        JSONObject jSONObject = this.f352g;
        String strConcat = this.f351f;
        String str3 = "苹果电脑";
        String str4 = "MAC_UA";
        if (zContains) {
            String[] strArrSplit = strTrim.split("#");
            HashMap map4 = map3;
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                String[] strArrSplit2 = strArrSplit[i].split("\\$");
                String str5 = strArrSplit2[0];
                String string = strArrSplit2[1];
                if (string.equals("PC_UA") || string.equals("电脑")) {
                    string = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
                } else if (string.equals("MOBILE_UA") || string.equals("手机")) {
                    string = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
                } else if (string.equals("IOS_UA") || string.equals("苹果手机")) {
                    string = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
                } else if (string.equals(str4) || string.equals(str3)) {
                    string = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
                }
                if (!(this.f348c.isEmpty() && strConcat.isEmpty()) && str5.equalsIgnoreCase("cookie")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    if (this.f348c.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = ";" + this.f348c;
                    }
                    sb.append(str2);
                    sb.append(!strConcat.isEmpty() ? ";".concat(strConcat) : "");
                    string = sb.toString();
                } else {
                    str4 = str4;
                }
                if (str5.equalsIgnoreCase("user-agent")) {
                    jSONObject.put("user-agent", string);
                }
                if (str5.equalsIgnoreCase("referer") || string.equalsIgnoreCase("WebView")) {
                    map2 = map4;
                    if (!string.equalsIgnoreCase("WebView")) {
                        map2.put(str5, string);
                    }
                } else {
                    map2 = map4;
                    map2.put(str5, string);
                }
                i++;
                strArrSplit = strArr;
                map4 = map2;
                str3 = str3;
                str4 = str4;
            }
            map = map4;
            if ((!this.f348c.isEmpty() || !strConcat.isEmpty()) && ((this.f348c.length() > 1 || strConcat.length() > 1) && !strTrim.contains("Cookie$") && !strTrim.contains("cookie$"))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(!this.f348c.isEmpty() ? strConcat : this.f348c);
                if (!strConcat.isEmpty()) {
                    strConcat = ";".concat(strConcat);
                }
                sb2.append(strConcat);
                map.put("Cookie", sb2.toString());
            }
        } else {
            map = map3;
            if (strTrim.isEmpty()) {
                return m766y(str);
            }
            if (strTrim.equals("PC_UA") || strTrim.equals("电脑")) {
                strTrim = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
            } else if (strTrim.equals("MOBILE_UA") || strTrim.equals("手机")) {
                strTrim = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
            } else if (strTrim.equals("IOS_UA") || strTrim.equals("苹果手机")) {
                strTrim = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
            } else if (strTrim.equals("MAC_UA") || strTrim.equals("苹果电脑")) {
                strTrim = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
            }
            if ((!this.f348c.isEmpty() || !strConcat.isEmpty()) && (this.f348c.length() > 1 || strConcat.length() > 1)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(!this.f348c.isEmpty() ? strConcat : this.f348c);
                if (!strConcat.isEmpty()) {
                    strConcat = ";".concat(strConcat);
                }
                sb3.append(strConcat);
                map.put("Cookie", sb3.toString());
            }
            map.put("User-Agent", strTrim);
            jSONObject.put("user-agent", strTrim);
        }
        return map;
    }

    /* JADX INFO: renamed from: ad */
    public final String m754ad(String str, String str2, String str3) {
        HashMap mapM766y = str3.equals("show") ? m766y(str) : m753ac(str);
        for (int i = 0; i < 3; i++) {
            if (str2.contains("/huadong_") || str2.contains("/renji_")) {
                String strM762u = m762u(AbstractC0716wh.m1787g(str, getTextByRule(AbstractC0502oj.m1487a(str2), "body&&script&&src")), this.f349d, mapM766y);
                String str4 = (String) AbstractC0716wh.m1797q(strM762u, "key=\"", "\"").get(0);
                String str5 = (String) AbstractC0716wh.m1797q(strM762u, "value=\"", "\"").get(0);
                String str6 = (String) AbstractC0716wh.m1797q(strM762u, "c.get(\"/a20be899", "\"").get(0);
                StringBuilder sb = new StringBuilder("/a20be899");
                sb.append(str6);
                sb.append(str4);
                sb.append("&value=");
                sb.append(AbstractC0405ku.m1360d(string2Hex(str5, str2.contains("/renji_") ? "djs" : "hd"), AbstractC0405ku.f1107c));
                String strM1787g = AbstractC0716wh.m1787g(str, sb.toString());
                HashMap map = new HashMap();
                AbstractC0771yi.m1890l(strM1787g, mapM766y, map);
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()).equalsIgnoreCase("set-cookie")) {
                        this.f348c = TextUtils.join(";", (Iterable) entry.getValue());
                        break;
                    }
                }
                str2 = m762u(str, this.f349d, mapM766y);
                if (!str2.contains("验证</title>")) {
                    return str2.replaceAll("\r|\n", "");
                }
            }
            if (!str2.contains("验证</title>")) {
                return str2.replaceAll("\r|\n", "");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ae */
    public final String m755ae(String str, String str2, String str3) {
        StringBuilder sb;
        String str4;
        HashMap mapM766y = str3.equals("show") ? m766y(str) : m753ac(str);
        for (int i = 0; i < 3; i++) {
            if (str2.contains("检测中") && str2.contains("btwaf")) {
                String str5 = (String) AbstractC0716wh.m1797q(str2, "btwaf=", "\"").get(0);
                if (str.contains("?")) {
                    sb = new StringBuilder();
                    sb.append(str);
                    str4 = "&btwaf=";
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    str4 = "?btwaf=";
                }
                sb.append(str4);
                sb.append(str5);
                String string = sb.toString();
                HashMap map = new HashMap();
                String strM1890l = AbstractC0771yi.m1890l(string, mapM766y, map);
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()).equalsIgnoreCase("set-cookie")) {
                        this.f348c = TextUtils.join(";", (Iterable) entry.getValue());
                        break;
                    }
                }
                if (!strM1890l.contains("<title>检测中</title>")) {
                    return strM1890l.replaceAll("\r|\n", "");
                }
                str2 = m762u(str, this.f349d, mapM766y);
            }
            if (!str2.contains("<title>检测中</title>")) {
                return str2.replaceAll("\r|\n", "");
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0269 A[LOOP:0: B:107:0x002a->B:102:0x0269, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x013f A[Catch: Exception -> 0x00ff, TryCatch #1 {Exception -> 0x00ff, blocks: (B:44:0x010b, B:46:0x013f, B:47:0x0166, B:36:0x00e9, B:38:0x00fa, B:43:0x0108, B:42:0x0104), top: B:105:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0166 A[Catch: Exception -> 0x00ff, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ff, blocks: (B:44:0x010b, B:46:0x013f, B:47:0x0166, B:36:0x00e9, B:38:0x00fa, B:43:0x0108, B:42:0x0104), top: B:105:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x016c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0195 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:103:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01c0 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:103:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ca A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:103:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d2 A[Catch: Exception -> 0x018f, TRY_LEAVE, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:103:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ec A[Catch: Exception -> 0x018f, TRY_ENTER, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:103:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ff A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:103:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0204 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:103:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:80:0x020c A[Catch: Exception -> 0x018f, TRY_LEAVE, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:103:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:84:0x021b A[Catch: Exception -> 0x01e8, TryCatch #3 {Exception -> 0x01e8, blocks: (B:67:0x01d9, B:69:0x01e1, B:82:0x0213, B:84:0x021b, B:86:0x0224, B:88:0x022c, B:89:0x0233, B:91:0x023b), top: B:109:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0224 A[Catch: Exception -> 0x01e8, TryCatch #3 {Exception -> 0x01e8, blocks: (B:67:0x01d9, B:69:0x01e1, B:82:0x0213, B:84:0x021b, B:86:0x0224, B:88:0x022c, B:89:0x0233, B:91:0x023b), top: B:109:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x022c A[Catch: Exception -> 0x01e8, TryCatch #3 {Exception -> 0x01e8, blocks: (B:67:0x01d9, B:69:0x01e1, B:82:0x0213, B:84:0x021b, B:86:0x0224, B:88:0x022c, B:89:0x0233, B:91:0x023b), top: B:109:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0242  */
    /* JADX WARN: Code duplicated, block: B:98:0x024e  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x013f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0195, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:98:0x024e, please report this as an issue */
    /* JADX INFO: renamed from: af */
    public final String m756af(LinkedHashMap linkedHashMap, String str, String str2, String str3) {
        int i;
        String str4;
        String str5;
        String strM759r;
        String strM762u;
        String strM763v;
        String str6;
        String strM763v2;
        String strM763v3;
        HashMap mapM766y = str2.equals("show") ? m766y(str) : m753ac(str);
        String str7 = "X-Requested-With";
        mapM766y.put("X-Requested-With", "XMLHttpRequest");
        String str8 = "";
        String str9 = "";
        int i2 = 0;
        while (true) {
            try {
                C00724 c00724 = new C00724();
                try {
                    try {
                        if (str3.contains("/verify")) {
                            OkHttpClient okHttpClientM1884f = AbstractC0771yi.m1884f();
                            StringBuilder sb = new StringBuilder();
                            str4 = str9;
                            try {
                                sb.append(AbstractC0716wh.m1787g(str, "/index.php/verify/index.html"));
                                sb.append("?");
                                i = i2;
                                try {
                                    sb.append(Math.random());
                                    AbstractC0771yi.m1885g(okHttpClientM1884f, sb.toString(), str2.equals("show") ? m766y(str) : m753ac(str), c00724);
                                } catch (Exception e) {
                                    e = e;
                                    str5 = str8;
                                    SpiderDebug.log(e);
                                    if (this.f357l) {
                                        Init.show("ocr验证出错：" + e.toString());
                                    }
                                    i2 = i + 1;
                                    if (i2 >= 4) {
                                        return str4;
                                    }
                                    str8 = str5;
                                    str9 = str4;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i = i2;
                            }
                        } else {
                            i = i2;
                            str4 = str9;
                            if (str3.contains("scheckAC")) {
                                AbstractC0771yi.m1885g(AbstractC0771yi.m1884f(), AbstractC0716wh.m1787g(str, "/include/vdimgck.php") + "?get=" + new Date(), str2.equals("show") ? m766y(str) : m753ac(str), c00724);
                            } else {
                                OkHttpClient okHttpClientM1884f2 = AbstractC0771yi.m1884f();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(AbstractC0716wh.m1787g(str, "/inc/common/code.php?a=" + str2 + "&s="));
                                sb2.append(Math.random());
                                AbstractC0771yi.m1885g(okHttpClientM1884f2, sb2.toString(), str2.equals("show") ? m766y(str) : m753ac(str), c00724);
                            }
                            String strEncodeToString = Base64.encodeToString(((Response) c00724.getResult()).body().bytes(), 2);
                            HashMap map = new HashMap();
                            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
                            map.put("Content-Type", "text/plain; charset=utf-8");
                            strM759r = m759r(this.f356k, strEncodeToString, this.f349d, map);
                            if (str3.contains("/verify")) {
                                strM762u = m763v(AbstractC0716wh.m1787g(str, "/index.php/ajax/verify_check?type=" + str2 + "&verify=" + strM759r), null, this.f349d, mapM766y);
                                str7 = str7;
                                str5 = str8;
                            } else if (str3.contains("scheckAC")) {
                                str7 = str7;
                                try {
                                    mapM766y.remove(str7);
                                    HashMap map2 = new HashMap();
                                    map2.put("validate", strM759r);
                                    str5 = str8;
                                    map2.put("searchword", str5);
                                    strM762u = m763v(AbstractC0716wh.m1787g(str, "/search.php?scheckAC=check&page=&searchtype=&order=&tid=&area=&year=&letter=&yuyan=&state=&money=&ver=&jq="), map2, this.f349d, mapM766y);
                                } catch (Exception e3) {
                                    e = e3;
                                    str5 = str8;
                                    SpiderDebug.log(e);
                                    if (this.f357l) {
                                        Init.show("ocr验证出错：" + e.toString());
                                    }
                                    i2 = i + 1;
                                    if (i2 >= 4) {
                                        return str4;
                                    }
                                    str8 = str5;
                                    str9 = str4;
                                }
                            } else {
                                str7 = str7;
                                str5 = str8;
                                strM762u = m762u(AbstractC0716wh.m1787g(str, "/inc/ajax.php?ac=code_check&type=" + str2 + "&code=" + strM759r), this.f349d, mapM766y);
                            }
                            if (str3.contains("scheckAC")) {
                                if (strM762u.contains("验证码不正确")) {
                                    str6 = str4;
                                } else {
                                    if (linkedHashMap == null) {
                                        strM763v3 = m762u(str, this.f349d, mapM766y);
                                    } else {
                                        strM763v3 = m763v(str, linkedHashMap, this.f349d, mapM766y);
                                    }
                                    str6 = strM763v3;
                                    try {
                                        if (!str6.contains("输入正确的验证码") && !checkveriry(str6)) {
                                            return str6;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        str4 = str6;
                                        SpiderDebug.log(e);
                                        if (this.f357l) {
                                            Init.show("ocr验证出错：" + e.toString());
                                        }
                                    }
                                }
                            } else if (new JSONObject(strM762u).getString("msg").equals("ok")) {
                                mapM766y.remove(str7);
                                if (linkedHashMap == null) {
                                    strM763v = m762u(str, this.f349d, mapM766y);
                                } else {
                                    strM763v = m763v(str, linkedHashMap, this.f349d, mapM766y);
                                }
                                str6 = strM763v;
                                if (str6.contains("不要频繁操作，搜索时间间隔为")) {
                                    TimeUnit.SECONDS.sleep(6L);
                                    if (linkedHashMap == null) {
                                        strM763v2 = m762u(str, this.f349d, mapM766y);
                                    } else {
                                        strM763v2 = m763v(str, linkedHashMap, this.f349d, mapM766y);
                                    }
                                    str6 = strM763v2;
                                }
                                if (!str6.contains("输入验证码") && !checkveriry(str6)) {
                                    return str6;
                                }
                            } else {
                                str6 = str4;
                            }
                            str4 = str6;
                            i2 = i + 1;
                            if (i2 >= 4) {
                                return str4;
                            }
                            str8 = str5;
                            str9 = str4;
                        }
                        if (str3.contains("scheckAC")) {
                            if (strM762u.contains("验证码不正确")) {
                                if (linkedHashMap == null) {
                                    strM763v3 = m762u(str, this.f349d, mapM766y);
                                } else {
                                    strM763v3 = m763v(str, linkedHashMap, this.f349d, mapM766y);
                                }
                                str6 = strM763v3;
                                if (!str6.contains("输入正确的验证码")) {
                                    return str6;
                                }
                            } else {
                                str6 = str4;
                            }
                        } else if (new JSONObject(strM762u).getString("msg").equals("ok")) {
                            mapM766y.remove(str7);
                            if (linkedHashMap == null) {
                                strM763v = m762u(str, this.f349d, mapM766y);
                            } else {
                                strM763v = m763v(str, linkedHashMap, this.f349d, mapM766y);
                            }
                            str6 = strM763v;
                            if (str6.contains("不要频繁操作，搜索时间间隔为")) {
                                TimeUnit.SECONDS.sleep(6L);
                                if (linkedHashMap == null) {
                                    strM763v2 = m762u(str, this.f349d, mapM766y);
                                } else {
                                    strM763v2 = m763v(str, linkedHashMap, this.f349d, mapM766y);
                                }
                                str6 = strM763v2;
                            }
                            if (!str6.contains("输入验证码")) {
                                return str6;
                            }
                        } else {
                            str6 = str4;
                        }
                        str4 = str6;
                    } catch (Exception e5) {
                        e = e5;
                    }
                    String strEncodeToString2 = Base64.encodeToString(((Response) c00724.getResult()).body().bytes(), 2);
                    HashMap map3 = new HashMap();
                    map3.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
                    map3.put("Content-Type", "text/plain; charset=utf-8");
                    strM759r = m759r(this.f356k, strEncodeToString2, this.f349d, map3);
                    if (str3.contains("/verify")) {
                        strM762u = m763v(AbstractC0716wh.m1787g(str, "/index.php/ajax/verify_check?type=" + str2 + "&verify=" + strM759r), null, this.f349d, mapM766y);
                        str7 = str7;
                        str5 = str8;
                    } else if (str3.contains("scheckAC")) {
                        str7 = str7;
                        mapM766y.remove(str7);
                        HashMap map4 = new HashMap();
                        map4.put("validate", strM759r);
                        str5 = str8;
                        map4.put("searchword", str5);
                        strM762u = m763v(AbstractC0716wh.m1787g(str, "/search.php?scheckAC=check&page=&searchtype=&order=&tid=&area=&year=&letter=&yuyan=&state=&money=&ver=&jq="), map4, this.f349d, mapM766y);
                    } else {
                        str7 = str7;
                        str5 = str8;
                        strM762u = m762u(AbstractC0716wh.m1787g(str, "/inc/ajax.php?ac=code_check&type=" + str2 + "&code=" + strM759r), this.f349d, mapM766y);
                    }
                } catch (Exception e6) {
                    e = e6;
                    str7 = str7;
                }
            } catch (Exception e7) {
                e = e7;
                i = i2;
                str4 = str9;
            }
            i2 = i + 1;
            if (i2 >= 4) {
                return str4;
            }
            str8 = str5;
            str9 = str4;
        }
    }

    /* JADX INFO: renamed from: ag */
    public final String m757ag(String str) {
        return str.replaceAll("\\&nbsp;", " ").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "").replaceAll("\\s{2,}", "");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:205:0x0494  */
    /* JADX WARN: Code duplicated, block: B:223:0x0506 A[Catch: Exception -> 0x050c, TryCatch #22 {Exception -> 0x050c, blocks: (B:221:0x04fa, B:223:0x0506, B:227:0x0510), top: B:499:0x04fa }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0510 A[Catch: Exception -> 0x050c, TRY_LEAVE, TryCatch #22 {Exception -> 0x050c, blocks: (B:221:0x04fa, B:223:0x0506, B:227:0x0510), top: B:499:0x04fa }] */
    /* JADX WARN: Code duplicated, block: B:234:0x052c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0538  */
    /* JADX WARN: Code duplicated, block: B:248:0x0558 A[Catch: Exception -> 0x059a, TRY_LEAVE, TryCatch #14 {Exception -> 0x059a, blocks: (B:246:0x0552, B:248:0x0558), top: B:483:0x0552 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x059e  */
    /* JADX WARN: Code duplicated, block: B:277:0x05d9 A[Catch: Exception -> 0x05f2, TryCatch #10 {Exception -> 0x05f2, blocks: (B:280:0x05f5, B:275:0x05d2, B:277:0x05d9, B:449:0x09a6, B:283:0x0615, B:286:0x0633, B:287:0x063b, B:289:0x0641, B:290:0x064b, B:292:0x0655, B:293:0x0659, B:294:0x0669, B:296:0x066e, B:297:0x0677, B:298:0x0683, B:448:0x098f, B:445:0x0970, B:447:0x0977), top: B:475:0x041c }] */
    /* JADX WARN: Code duplicated, block: B:352:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:372:0x07f9 A[Catch: Exception -> 0x0804, TRY_LEAVE, TryCatch #37 {Exception -> 0x0804, blocks: (B:370:0x07f3, B:372:0x07f9), top: B:529:0x07f3 }] */
    /* JADX WARN: Code duplicated, block: B:377:0x080c  */
    /* JADX WARN: Code duplicated, block: B:391:0x084e  */
    /* JADX WARN: Code duplicated, block: B:395:0x0867 A[Catch: Exception -> 0x086f, TryCatch #0 {Exception -> 0x086f, blocks: (B:393:0x0858, B:395:0x0867, B:398:0x0877), top: B:455:0x0858 }] */
    /* JADX WARN: Code duplicated, block: B:398:0x0877 A[Catch: Exception -> 0x086f, TRY_LEAVE, TryCatch #0 {Exception -> 0x086f, blocks: (B:393:0x0858, B:395:0x0867, B:398:0x0877), top: B:455:0x0858 }] */
    /* JADX WARN: Code duplicated, block: B:405:0x08a2 A[Catch: Exception -> 0x08ab, TryCatch #4 {Exception -> 0x08ab, blocks: (B:403:0x0896, B:405:0x08a2, B:408:0x08b1, B:402:0x088a), top: B:463:0x0896 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x08cb A[Catch: Exception -> 0x08d2, TRY_LEAVE, TryCatch #28 {Exception -> 0x08d2, blocks: (B:410:0x08c5, B:412:0x08cb), top: B:511:0x08c5 }] */
    /* JADX WARN: Code duplicated, block: B:419:0x08df A[Catch: Exception -> 0x091e, TRY_LEAVE, TryCatch #13 {Exception -> 0x091e, blocks: (B:417:0x08d9, B:419:0x08df), top: B:481:0x08d9 }] */
    /* JADX WARN: Code duplicated, block: B:431:0x0920  */
    /* JADX WARN: Code duplicated, block: B:447:0x0977 A[Catch: Exception -> 0x05f2, TryCatch #10 {Exception -> 0x05f2, blocks: (B:280:0x05f5, B:275:0x05d2, B:277:0x05d9, B:449:0x09a6, B:283:0x0615, B:286:0x0633, B:287:0x063b, B:289:0x0641, B:290:0x064b, B:292:0x0655, B:293:0x0659, B:294:0x0669, B:296:0x066e, B:297:0x0677, B:298:0x0683, B:448:0x098f, B:445:0x0970, B:447:0x0977), top: B:475:0x041c }] */
    /* JADX WARN: Code duplicated, block: B:465:0x0525 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x04e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x04fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x07f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x05f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x098f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: No SSA var for result arg: (r9 I:??) from 0x0375: PHI (r9 I:??) = (r9v6 java.lang.String) binds: [B:153:0x0378] A[DONT_GENERATE, DONT_INLINE, REMOVE]
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:100)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:353)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:284)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:82)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: ah */
    public final java.lang.String m758ah(java.lang.String r34, java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 2507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQHiker.m758ah(java.lang.String, java.lang.String):java.lang.String");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObjectM760s = m760s(str, str2, z, map);
        return jSONObjectM760s != null ? jSONObjectM760s.toString() : "";
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 29531. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public java.lang.String detailContent(java.util.List<java.lang.String> r53) {
        /*
            Method dump skipped, instruction units count: 2953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQHiker.detailContent(java.util.List):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0254 A[Catch: Exception -> 0x026d, TryCatch #2 {Exception -> 0x026d, blocks: (B:118:0x026f, B:113:0x024d, B:115:0x0254), top: B:128:0x024d }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ce  */
    /* JADX WARN: Instruction removed from duplicated block: B:115:0x0254, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.github.catvod.spider.XYQHiker] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.github.catvod.spider.XYQHiker] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.github.catvod.spider.XYQHiker] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.github.catvod.spider.XYQHiker] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.json.JSONObject] */
    public String homeContent(boolean z) {
        Object r16;
        Object r1;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        Object obj;
        Object r2;
        String strTrim;
        String str = "筛选语言名称";
        String str2 = "筛选年份替换词";
        String str3 = "筛选年份名称";
        String str4 = "筛选地区替换词";
        String str5 = "筛选地区名称";
        String str6 = "筛选类型替换词";
        String str7 = "筛选类型名称";
        String str8 = "筛选子分类替换词";
        String str9 = "筛选子分类名称";
        String str10 = "分类链接";
        String str11 = "分类名称替换词";
        Object r17 = "筛选数据";
        String str12 = "分类名称";
        r17 = "";
        try {
            m764w();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (m752ab("分类名称", "").isEmpty()) {
                str12 = "class_name";
            }
            if (m752ab("分类名称替换词", "").isEmpty()) {
                str11 = "class_value";
            }
            if (m752ab("分类链接", "").isEmpty()) {
                str10 = "class_url";
            }
            if (m752ab("筛选子分类名称", "").isEmpty()) {
                str9 = "fclass_name";
            }
            if (m752ab("筛选子分类替换词", "").isEmpty()) {
                str8 = "fclass_value";
            }
            if (m752ab("筛选类型名称", "").isEmpty()) {
                str7 = "fcatelog_name";
            }
            if (m752ab("筛选类型替换词", "").isEmpty()) {
                str6 = "fcatelog_value";
            }
            if (m752ab("筛选地区名称", "").isEmpty()) {
                str5 = "farea_name";
            }
            if (m752ab("筛选地区替换词", "").isEmpty()) {
                str4 = "farea_value";
            }
            if (m752ab("筛选年份名称", "").isEmpty()) {
                str3 = "fyear_name";
            }
            if (m752ab("筛选年份替换词", "").isEmpty()) {
                str2 = "fyear_value";
            }
            if (m752ab("筛选语言名称", "").isEmpty()) {
                str = "flang_name";
            }
            String str13 = m752ab("筛选语言替换词", "").isEmpty() ? "flang_value" : "筛选语言替换词";
            JSONArray jSONArray2 = jSONArray;
            String str14 = m752ab("筛选排序名称", "").isEmpty() ? "fsort_name" : "筛选排序名称";
            String str15 = str12;
            String str16 = "筛选排序替换词";
            if (m752ab(str16, "").isEmpty()) {
                str16 = "fsort_value";
            }
            String strM752ab = m752ab(str11, "");
            String strM752ab2 = m752ab(str10, "");
            String strM752ab3 = m752ab(str9, "");
            String strM752ab4 = m752ab(str8, "");
            String strM752ab5 = m752ab(str7, "");
            String strM752ab6 = m752ab(str6, "");
            String strM752ab7 = m752ab(str5, "");
            String strM752ab8 = m752ab(str4, "");
            String strM752ab9 = m752ab(str3, m747n());
            String strM752ab10 = m752ab(str2, Marker.ANY_MARKER);
            String strM752ab11 = m752ab(str, "");
            String strM752ab12 = m752ab(str13, "");
            String strM752ab13 = m752ab(str14, "时间&人气&评分");
            String strM752ab14 = m752ab(str16, "time&hits&score");
            String[] strArrSplit = m752ab(str15, "").split("&");
            String[] strArrSplit2 = strM752ab.split("&");
            int i = 0;
            while (i < strArrSplit.length) {
                JSONObject jSONObject3 = new JSONObject();
                String str17 = strM752ab14;
                jSONObject3.put("type_id", strArrSplit2[i].replaceAll("＆＆", "&"));
                jSONObject3.put("type_name", strArrSplit[i]);
                JSONArray jSONArray3 = jSONArray2;
                jSONArray3.put(jSONObject3);
                i++;
                jSONArray2 = jSONArray3;
                strM752ab14 = str17;
                strArrSplit2 = strArrSplit2;
            }
            String str18 = strM752ab14;
            JSONObject jSONObject4 = jSONObject2;
            jSONObject4.put("class", jSONArray2);
            Object r0 = r17;
            try {
                Object r3 = !m752ab(r0, "").isEmpty() ? r0 : "filterdata";
                String strM752ab15 = m752ab(r3, "");
                InetAddress.getLocalHost();
                try {
                    if (strM752ab15.startsWith("clan://")) {
                        obj = "";
                        jSONObject = jSONObject4;
                        r2 = this;
                        jSONObjectOptJSONObject = null;
                        strTrim = AbstractC0771yi.m1889k(strM752ab15, null).trim();
                        r17 = r2;
                        r17 = obj;
                        if (strTrim.startsWith("{")) {
                            r17 = r2;
                            r17 = obj;
                            jSONObjectOptJSONObject = new JSONObject(strTrim);
                            r17 = r2;
                            r17 = obj;
                        }
                        r17 = r2;
                        r17 = obj;
                    } else {
                        try {
                            if (strM752ab15.startsWith("http") || strM752ab15.startsWith("./")) {
                                obj = "";
                                jSONObject = jSONObject4;
                                r2 = this;
                                jSONObjectOptJSONObject = null;
                                strTrim = AbstractC0771yi.m1889k(strM752ab15, null).trim();
                                r17 = r2;
                                r17 = obj;
                                if (strTrim.startsWith("{") && strTrim.endsWith("}")) {
                                    r17 = r2;
                                    r17 = obj;
                                    jSONObjectOptJSONObject = new JSONObject(strTrim);
                                    r17 = r2;
                                    r17 = obj;
                                }
                            } else if (strM752ab15.equalsIgnoreCase("EXT")) {
                                r17 = "";
                                jSONObject = jSONObject4;
                                try {
                                    jSONObjectOptJSONObject = m761t(strM752ab, strM752ab2, strM752ab3, strM752ab4, strM752ab5, strM752ab6, strM752ab7, strM752ab8, strM752ab9, strM752ab10, strM752ab11, strM752ab12, strM752ab13, str18);
                                    r17 = this;
                                } catch (Exception e) {
                                    e = e;
                                    r17 = this;
                                    r17 = r17;
                                    jSONObject4 = jSONObject;
                                    try {
                                        SpiderDebug.log(e);
                                        z2 = r17.f357l;
                                        r17 = r17;
                                        r17 = r17;
                                        if (z2) {
                                            Init.show("homeContent筛选部分出错：" + e.toString());
                                            r17 = r17;
                                            r17 = r17;
                                        }
                                        return jSONObject4.toString();
                                    } catch (Exception e2) {
                                        e = e2;
                                        r1 = r17;
                                        r16 = r17;
                                        SpiderDebug.log(e);
                                        if (r1.f357l) {
                                            Init.show("homeContent全局出错：" + e.toString());
                                        }
                                        return r16;
                                    }
                                }
                            } else {
                                r17 = "";
                                jSONObject = jSONObject4;
                                Object r4 = this;
                                jSONObjectOptJSONObject = r4.f355j.optJSONObject(r3);
                                r17 = r4;
                            }
                            r17 = r2;
                            r17 = obj;
                        } catch (Exception e3) {
                            e = e3;
                            r17 = this;
                            SpiderDebug.log(e);
                            z2 = r17.f357l;
                            r17 = r17;
                            r17 = r17;
                            if (z2) {
                                Init.show("homeContent筛选部分出错：" + e.toString());
                                r17 = r17;
                                r17 = r17;
                            }
                            return jSONObject4.toString();
                        }
                    }
                    if (!z || jSONObjectOptJSONObject == null) {
                        jSONObject4 = jSONObject;
                        r17 = r17;
                        r17 = r17;
                    } else {
                        jSONObject4 = jSONObject;
                        try {
                            jSONObject4.put("filters", jSONObjectOptJSONObject);
                            r17 = r17;
                            r17 = r17;
                        } catch (Exception e4) {
                            e = e4;
                            SpiderDebug.log(e);
                            z2 = r17.f357l;
                            r17 = r17;
                            r17 = r17;
                            if (z2) {
                                Init.show("homeContent筛选部分出错：" + e.toString());
                                r17 = r17;
                                r17 = r17;
                            }
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    r17 = r17;
                    r17 = r17;
                }
            } catch (Exception e6) {
                e = e6;
            }
            return jSONObject4.toString();
        } catch (Exception e7) {
            e = e7;
            r16 = "";
            r1 = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01dc A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01e6 A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:110:0x0213  */
    /* JADX WARN: Code duplicated, block: B:112:0x0217  */
    /* JADX WARN: Code duplicated, block: B:115:0x0224  */
    /* JADX WARN: Code duplicated, block: B:117:0x0228  */
    /* JADX WARN: Code duplicated, block: B:121:0x0239  */
    /* JADX WARN: Code duplicated, block: B:125:0x024a  */
    /* JADX WARN: Code duplicated, block: B:129:0x025d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0271  */
    /* JADX WARN: Code duplicated, block: B:137:0x0281  */
    /* JADX WARN: Code duplicated, block: B:140:0x0290 A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x029d  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a8 A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c0 A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:162:0x02fc A[Catch: Exception -> 0x01a2, TRY_ENTER, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x032b A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0363 A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x036b A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x038a A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0397 A[Catch: Exception -> 0x01a2, LOOP:4: B:173:0x0395->B:174:0x0397, LOOP_END, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x03c9 A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x03d7 A[Catch: Exception -> 0x01a2, TRY_LEAVE, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x03f1 A[Catch: Exception -> 0x01a2, TRY_ENTER, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0405 A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x040d A[Catch: Exception -> 0x01a2, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0425 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0435 A[Catch: Exception -> 0x01a2, TRY_ENTER, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0443 A[Catch: Exception -> 0x01a2, TRY_LEAVE, TryCatch #12 {Exception -> 0x01a2, blocks: (B:94:0x01c2, B:96:0x01cc, B:100:0x01dc, B:102:0x01e6, B:104:0x01f0, B:108:0x01ff, B:113:0x021a, B:118:0x022b, B:122:0x023c, B:126:0x024d, B:130:0x0260, B:134:0x0274, B:138:0x0284, B:140:0x0290, B:145:0x029e, B:147:0x02a8, B:152:0x02b6, B:154:0x02c0, B:159:0x02ce, B:162:0x02fc, B:163:0x0323, B:165:0x032b, B:167:0x0363, B:169:0x036b, B:171:0x0373, B:188:0x0411, B:191:0x0427, B:192:0x042b, B:195:0x0435, B:196:0x043d, B:198:0x0443, B:172:0x038a, B:174:0x0397, B:175:0x03bc, B:176:0x03c9, B:177:0x03d7, B:180:0x03f1, B:182:0x03f9, B:183:0x03fd, B:185:0x0405, B:187:0x040d, B:74:0x0182, B:76:0x0188, B:79:0x018f, B:83:0x0198, B:86:0x01a7, B:93:0x01bf, B:89:0x01b0), top: B:374:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x0455  */
    /* JADX WARN: Code duplicated, block: B:207:0x0462 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x046e A[Catch: Exception -> 0x0452, TryCatch #6 {Exception -> 0x0452, blocks: (B:344:0x07ba, B:200:0x044b, B:205:0x0458, B:208:0x0464, B:209:0x0468, B:211:0x046e, B:212:0x0472, B:213:0x0485, B:215:0x048a, B:216:0x0493, B:217:0x049f, B:338:0x0790, B:340:0x0797, B:343:0x07b7), top: B:362:0x044b }] */
    /* JADX WARN: Code duplicated, block: B:215:0x048a A[Catch: Exception -> 0x0452, LOOP:0: B:213:0x0485->B:215:0x048a, LOOP_END, TryCatch #6 {Exception -> 0x0452, blocks: (B:344:0x07ba, B:200:0x044b, B:205:0x0458, B:208:0x0464, B:209:0x0468, B:211:0x046e, B:212:0x0472, B:213:0x0485, B:215:0x048a, B:216:0x0493, B:217:0x049f, B:338:0x0790, B:340:0x0797, B:343:0x07b7), top: B:362:0x044b }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04b7 A[Catch: Exception -> 0x04d6, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x04cd A[Catch: Exception -> 0x04d6, LOOP:2: B:222:0x04c8->B:224:0x04cd, LOOP_END, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x04e6 A[Catch: Exception -> 0x04d6, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x04f6 A[Catch: Exception -> 0x04d6, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x050b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x0513 A[Catch: Exception -> 0x04d6, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x0520 A[Catch: Exception -> 0x04d6, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x054e A[Catch: Exception -> 0x04d6, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x0556 A[Catch: Exception -> 0x04d6, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x056a  */
    /* JADX WARN: Code duplicated, block: B:250:0x0577 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:254:0x0583  */
    /* JADX WARN: Code duplicated, block: B:257:0x058d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0596 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x0598 A[Catch: Exception -> 0x05a6, TryCatch #11 {Exception -> 0x05a6, blocks: (B:255:0x0585, B:259:0x0598, B:263:0x05af), top: B:372:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x05af A[Catch: Exception -> 0x05a6, TRY_LEAVE, TryCatch #11 {Exception -> 0x05a6, blocks: (B:255:0x0585, B:259:0x0598, B:263:0x05af), top: B:372:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x05d9 A[Catch: Exception -> 0x060b, TryCatch #1 {Exception -> 0x060b, blocks: (B:267:0x05d1, B:269:0x05d9, B:271:0x05e9), top: B:352:0x05d1 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x05e9 A[Catch: Exception -> 0x060b, TRY_LEAVE, TryCatch #1 {Exception -> 0x060b, blocks: (B:267:0x05d1, B:269:0x05d9, B:271:0x05e9), top: B:352:0x05d1 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x05f3 A[Catch: Exception -> 0x0607, TryCatch #10 {Exception -> 0x0607, blocks: (B:283:0x0618, B:273:0x05ed, B:275:0x05f3, B:281:0x0611), top: B:370:0x0618 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x060f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0628  */
    /* JADX WARN: Code duplicated, block: B:292:0x063b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:294:0x0646  */
    /* JADX WARN: Code duplicated, block: B:297:0x0650 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x0665  */
    /* JADX WARN: Code duplicated, block: B:313:0x0698  */
    /* JADX WARN: Code duplicated, block: B:317:0x06ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:320:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:323:0x06be A[Catch: Exception -> 0x04d6, TRY_ENTER, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x06cf A[Catch: Exception -> 0x04d6, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:327:0x0704 A[Catch: Exception -> 0x04d6, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x0722 A[Catch: Exception -> 0x04d6, TryCatch #4 {Exception -> 0x04d6, blocks: (B:219:0x04a5, B:221:0x04b7, B:222:0x04c8, B:224:0x04cd, B:227:0x04db, B:231:0x04f0, B:233:0x04f6, B:236:0x050d, B:238:0x0513, B:241:0x0548, B:243:0x054e, B:245:0x0556, B:248:0x056d, B:251:0x0579, B:252:0x057d, B:290:0x0631, B:293:0x063d, B:295:0x064a, B:315:0x06a2, B:318:0x06ae, B:323:0x06be, B:325:0x06fc, B:327:0x0704, B:328:0x0708, B:330:0x0722, B:331:0x0726, B:324:0x06cf, B:312:0x0694, B:287:0x0622, B:240:0x0520, B:229:0x04e6), top: B:358:0x04a5 }] */
    /* JADX WARN: Code duplicated, block: B:358:0x04a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x0652 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0618 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d7  */
    /* JADX WARN: Instruction removed from duplicated block: B:162:0x02fc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public String homeVideoContent() {
        String str;
        String str2;
        JSONArray jSONArrayOptJSONArray;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        JSONArray jSONArray;
        String str10;
        boolean z;
        boolean z2;
        boolean z3;
        String strReplaceAll;
        String str11;
        String str12;
        boolean z4;
        String str13;
        String strM762u;
        C0235em c0235emM1487a;
        String strM751aa;
        String strM751aa2;
        String str14;
        String[] strArrSplit;
        C0226ed trueElement;
        int i;
        C0589rp c0589rpSelectElements;
        String str15;
        String str16;
        int i2;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        C0226ed c0226ed;
        String str17;
        String strM751aa3;
        C0589rp c0589rpSelectElements2;
        C0589rp c0589rp;
        int i3;
        C0226ed c0226ed2;
        String strM751aa4;
        String strM757ag;
        String str18;
        String str19;
        String str20;
        String strM751aa5;
        String str21;
        String str22;
        String str23;
        String strM1787g;
        String str24;
        String strM751aa6;
        String str25;
        String strM751aa7;
        String strM1794n;
        String strReplaceAll2;
        String str26;
        String textByRule;
        String[] strArrSplit2;
        String[] strArrSplit3;
        C0226ed trueElement2;
        int i4;
        String strTrim;
        String strTrim2;
        LinkedHashMap linkedHashMap;
        String[] strArrSplit4;
        int length;
        int i5;
        String str27 = "$$$";
        String str28 = "'input'";
        String str29 = "首页片单链接加后缀";
        String str30 = "》";
        String str31 = "首页片单链接加前缀";
        String str32 = "《";
        String str33 = "首页片单副标题";
        String str34 = "首页片单链接";
        String str35 = "首页片单标题";
        String str36 = "首页片单是否Jsoup写法";
        String str37 = "首页片单列表数组规则";
        String str38 = "首页列表数组规则";
        String str39 = "首页推荐链接";
        String str40 = "图片是否需要代理";
        String str41 = "是否开启获取首页数据";
        String str42 = "";
        try {
            m764w();
            if (m751aa("是否开启获取首页数据").isEmpty()) {
                str41 = "homeContent";
            }
            if (m751aa("图片是否需要代理").isEmpty()) {
                str40 = "PicNeedProxy";
            }
            if (m751aa("首页推荐链接").isEmpty()) {
                str39 = "rcmed_url";
            }
            if (m751aa("首页列表数组规则").isEmpty()) {
                str38 = "home_arr_rule";
            }
            if (m751aa("首页片单列表数组规则").isEmpty()) {
                str37 = "hmepi_arr_rule";
            }
            if (m751aa("首页片单是否Jsoup写法").isEmpty()) {
                str36 = "home_is_jsoup";
            }
            if (m751aa("首页片单标题").isEmpty()) {
                str35 = "home_title";
            }
            if (m751aa("首页片单链接").isEmpty()) {
                str34 = "home_url";
            }
            String str43 = str34;
            String str44 = m751aa("首页片单图片").isEmpty() ? "home_pic" : "首页片单图片";
            if (m751aa("首页片单副标题").isEmpty()) {
                str33 = "home_subtitle";
            }
            if (m751aa("首页片单链接加前缀").isEmpty()) {
                str31 = "home_prefix";
            }
            if (m751aa("首页片单链接加后缀").isEmpty()) {
                str29 = "home_suffix";
            }
            String str45 = m751aa("分类名称替换词").isEmpty() ? "class_value" : "分类名称替换词";
            String str46 = str33;
            JSONArray jSONArray3 = new JSONArray();
            String str47 = str44;
            JSONObject jSONObject2 = new JSONObject();
            String str48 = str35;
            String str49 = str38;
            String str50 = str29;
            String str51 = str31;
            if (m751aa(str39).isEmpty() || m751aa(str37).isEmpty()) {
                if (m751aa(str41).equals("1") || m751aa(str41).equals("是")) {
                    String[] strArrSplit5 = m752ab(str45, "").split("&");
                    int length2 = strArrSplit5.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length2) {
                            str2 = str42;
                            break;
                        }
                        int i7 = length2;
                        try {
                            String[] strArr = strArrSplit5;
                            str2 = str42;
                            try {
                                JSONObject jSONObjectM760s = m760s(strArrSplit5[i6].replaceAll("＆＆", "&"), "1", false, new HashMap());
                                if (jSONObjectM760s != null && (jSONArrayOptJSONArray = jSONObjectM760s.optJSONArray("list")) != null) {
                                    for (int i8 = 0; i8 < jSONArrayOptJSONArray.length() && i8 < 5; i8++) {
                                        jSONArray3.put(jSONArrayOptJSONArray.getJSONObject(i8));
                                    }
                                }
                                if (jSONArray3.length() >= 20) {
                                    break;
                                }
                                i6++;
                                length2 = i7;
                                strArrSplit5 = strArr;
                                str42 = str2;
                            } catch (Exception e) {
                                e = e;
                                str = str2;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str2 = str42;
                            str = str2;
                        }
                    }
                    jSONObject2.put("list", jSONArray3);
                } else {
                    str2 = "";
                }
                if (!m751aa(str39).isEmpty() && m751aa(str37).isEmpty()) {
                    jSONObject = jSONObject2;
                    str = str2;
                } else if (!m751aa(str41).equals("1") || m751aa(str41).equals("是")) {
                    str3 = "网页编码格式";
                    if (m751aa(str3).isEmpty()) {
                        str3 = "Coding_format";
                    }
                    this.f349d = m752ab(str3, "UTF-8");
                    if (m751aa("分类片单是否Jsoup写法").isEmpty()) {
                        str4 = "cat_is_jsoup";
                    } else {
                        str4 = "分类片单是否Jsoup写法";
                    }
                    if (m751aa("分类片单标题").isEmpty()) {
                        str5 = "cat_title";
                    } else {
                        str5 = "分类片单标题";
                    }
                    String str52 = m751aa("分类片单链接").isEmpty() ? "cat_url" : "分类片单链接";
                    str6 = m751aa("分类片单图片").isEmpty() ? "cat_pic" : "分类片单图片";
                    str7 = m751aa("分类片单副标题").isEmpty() ? "cat_subtitle" : "分类片单副标题";
                    str8 = m751aa("分类片单链接加前缀").isEmpty() ? "cat_prefix" : "分类片单链接加前缀";
                    str9 = m751aa("分类片单链接加后缀").isEmpty() ? "cat_suffix" : "分类片单链接加后缀";
                    jSONArray = jSONArray3;
                    str10 = str52;
                    if (!m752ab(str36, "1").equals("1") || m752ab(str36, "是").equals("是")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!m751aa(str40).equals("1") || m751aa(str40).equals("是")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!m752ab(str4, "1").equals("1") || m752ab(str4, "是").equals("是")) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    strReplaceAll = m751aa(str39).replaceAll("时间戳", String.valueOf(System.currentTimeMillis() / 1000)).replaceAll("时间标", String.valueOf(System.currentTimeMillis()));
                    str11 = ")";
                    if (strReplaceAll.contains("md5(")) {
                        String str53 = (String) AbstractC0716wh.m1797q(strReplaceAll, "md5(", ")").get(0);
                        strReplaceAll = strReplaceAll.replace("md5(" + str53 + ")", AbstractC0405ku.m1360d(str53, AbstractC0405ku.f1107c));
                    }
                    if (strReplaceAll.contains(";post")) {
                        str12 = str7;
                        strTrim = strReplaceAll.split("\\?")[0].replaceAll("？？", "?").trim();
                        z4 = z2;
                        strTrim2 = strReplaceAll.split("\\?")[1].split(";")[0].replaceAll("？？", "?").trim();
                        if (strTrim2.isEmpty()) {
                            str13 = ")";
                            strM762u = m763v(strTrim, null, this.f349d, m766y(strTrim));
                        } else if (strTrim2.startsWith("{") || !strTrim2.endsWith("}")) {
                            linkedHashMap = new LinkedHashMap();
                            strArrSplit4 = strTrim2.split("&");
                            length = strArrSplit4.length;
                            i5 = 0;
                            while (i5 < length) {
                                String str54 = strArrSplit4[i5];
                                String[] strArr2 = strArrSplit4;
                                int iIndexOf = str54.indexOf("=");
                                linkedHashMap.put(str54.substring(0, iIndexOf), str54.substring(iIndexOf + 1));
                                i5++;
                                strArrSplit4 = strArr2;
                                length = length;
                                str11 = str11;
                            }
                            str13 = str11;
                            strM762u = m763v(strTrim, linkedHashMap, this.f349d, m766y(strTrim));
                        } else {
                            strM762u = m759r(strTrim, new JSONObject(strTrim2).toString(), this.f349d, m766y(strTrim));
                            str13 = ")";
                        }
                    } else {
                        str12 = str7;
                        z4 = z2;
                        str13 = ")";
                        strM762u = m762u(strReplaceAll, this.f349d, m766y(strReplaceAll));
                        if (strM762u.contains("检测中") && strM762u.contains("btwaf")) {
                            strM762u = m755ae(strReplaceAll, strM762u, "show");
                        }
                        if (strM762u.contains("/huadong_") || strM762u.contains("/renji_")) {
                            strM762u = m754ad(strReplaceAll, strM762u, "show");
                        }
                    }
                    c0235emM1487a = AbstractC0502oj.m1487a(m746m(strM762u));
                    strM751aa = m751aa(str51);
                    if (strM751aa.isEmpty() && z == z3) {
                        strM751aa = m751aa(str8);
                    }
                    if (strM751aa.contains("&&")) {
                        strM751aa = getTextByRule(c0235emM1487a, strM751aa).replace("PG_URL", strReplaceAll);
                    }
                    if (strM751aa.contains("PG_URL")) {
                        str = str2;
                        try {
                            strM751aa = strM751aa.replace("PG_URL", strReplaceAll).replaceAll("'", str);
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } else {
                        str = str2;
                    }
                    strM751aa2 = m751aa(str50);
                    if (strM751aa2.isEmpty() && z == z3) {
                        strM751aa2 = m751aa(str9);
                    }
                    if (strM751aa2.contains("&&")) {
                        strM751aa2 = getTextByRule(c0235emM1487a, strM751aa2);
                    }
                    str14 = strM751aa2;
                    strArrSplit = m751aa(str49).split("&&");
                    trueElement = getTrueElement(strArrSplit[0], c0235emM1487a);
                    for (i = 1; i < strArrSplit.length - 1; i++) {
                        trueElement = getTrueElement(strArrSplit[i], trueElement);
                    }
                    c0589rpSelectElements = selectElements(trueElement, strArrSplit[strArrSplit.length - 1]);
                    str15 = str;
                    str16 = str15;
                    i2 = 0;
                    while (i2 < c0589rpSelectElements.size()) {
                        try {
                            c0226ed = (C0226ed) c0589rpSelectElements.get(i2);
                            str17 = str15;
                            strM751aa3 = m751aa(str37);
                            if (strM751aa3.contains("&&")) {
                                strArrSplit3 = strM751aa3.split("&&");
                                trueElement2 = getTrueElement(strArrSplit3[0], c0226ed);
                                for (i4 = 1; i4 < strArrSplit3.length - 1; i4++) {
                                    trueElement2 = getTrueElement(strArrSplit3[i4], trueElement2);
                                }
                                c0589rpSelectElements2 = selectElements(trueElement2, strArrSplit3[strArrSplit3.length - 1]);
                            } else {
                                c0589rpSelectElements2 = selectElements(c0226ed, strM751aa3);
                            }
                            c0589rp = c0589rpSelectElements2;
                            i3 = 0;
                            while (i3 < c0589rp.size()) {
                                c0226ed2 = (C0226ed) c0589rp.get(i3);
                                C0589rp c0589rp2 = c0589rp;
                                str48 = str48;
                                strM751aa4 = m751aa(str48);
                                if (strM751aa4.isEmpty() && z == z3) {
                                    strM751aa4 = m751aa(str5);
                                }
                                if (z) {
                                    strM757ag = getTextByRule(c0226ed2, strM751aa4);
                                } else {
                                    strM757ag = m757ag((String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa4.split("&&")[0], strM751aa4.split("&&")[1]).get(0));
                                }
                                str18 = str32;
                                if (strM757ag.contains(str18)) {
                                    str19 = str30;
                                    if (strM757ag.contains(str19)) {
                                        strM757ag = strM757ag.split(str18)[1].split(str19)[0];
                                    }
                                } else {
                                    str19 = str30;
                                }
                                String str55 = strM757ag;
                                str32 = str18;
                                str20 = str47;
                                strM751aa5 = m751aa(str20);
                                if (strM751aa5.isEmpty() && z == z3) {
                                    strM751aa5 = m751aa(str6);
                                }
                                try {
                                    if (strM751aa5.isEmpty()) {
                                        str47 = str20;
                                        str21 = str6;
                                        str22 = str19;
                                        str23 = str13;
                                    } else {
                                        str47 = str20;
                                        try {
                                            if (strM751aa5.startsWith("http")) {
                                                strM1787g = strM751aa5;
                                                str21 = str6;
                                                str22 = str19;
                                                str23 = str13;
                                            } else {
                                                if (z) {
                                                    strM1787g = getTextByRule(c0226ed2, strM751aa5).trim();
                                                    str21 = str6;
                                                    str22 = str19;
                                                } else {
                                                    str21 = str6;
                                                    str22 = str19;
                                                    try {
                                                        strM1787g = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa5.split("&&")[0], strM751aa5.split("&&")[1]).get(0);
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        str23 = str13;
                                                        SpiderDebug.log(e);
                                                        strM1787g = str17;
                                                    }
                                                }
                                                try {
                                                    if (strM1787g.contains("url(")) {
                                                        strArrSplit2 = strM1787g.replaceAll("\\&quot;", str).split("url\\(");
                                                        if (strArrSplit2.length > 1) {
                                                            str23 = str13;
                                                            if (strArrSplit2[1].contains(str23)) {
                                                                strM1787g = strArrSplit2[1].split("\\)")[0].replaceAll("['\"]", str);
                                                            }
                                                        } else {
                                                            str23 = str13;
                                                        }
                                                    } else {
                                                        str23 = str13;
                                                    }
                                                    strM1787g = AbstractC0716wh.m1787g(strReplaceAll, strM1787g);
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    str23 = str13;
                                                    str17 = strM1787g;
                                                    SpiderDebug.log(e);
                                                    strM1787g = str17;
                                                    str24 = str46;
                                                    strM751aa6 = m751aa(str24);
                                                    if (strM751aa6.isEmpty()) {
                                                        str25 = str12;
                                                    } else {
                                                        str25 = str12;
                                                    }
                                                    if (strM751aa6.isEmpty()) {
                                                        str12 = str25;
                                                        str46 = str24;
                                                        str13 = str23;
                                                    } else {
                                                        if (z) {
                                                            try {
                                                                textByRule = getTextByRule(c0226ed2, strM751aa6);
                                                                str12 = str25;
                                                                str46 = str24;
                                                                str13 = str23;
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                str12 = str25;
                                                                str46 = str24;
                                                                str13 = str23;
                                                                SpiderDebug.log(e);
                                                                str16 = str16;
                                                            }
                                                        } else {
                                                            str12 = str25;
                                                            try {
                                                                str46 = str24;
                                                                str13 = str23;
                                                                try {
                                                                    textByRule = m757ag((String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa6.split("&&")[0], strM751aa6.split("&&")[1]).get(0));
                                                                } catch (Exception e7) {
                                                                    e = e7;
                                                                    SpiderDebug.log(e);
                                                                    str16 = str16;
                                                                }
                                                            } catch (Exception e8) {
                                                                e = e8;
                                                                str46 = str24;
                                                                str13 = str23;
                                                                SpiderDebug.log(e);
                                                                str16 = str16;
                                                                strM751aa7 = m751aa(str43);
                                                                if (strM751aa7.isEmpty()) {
                                                                    str10 = str10;
                                                                } else {
                                                                    str10 = str10;
                                                                }
                                                                str43 = str43;
                                                                if (z) {
                                                                    strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                                                                } else {
                                                                    strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                                                                }
                                                                if (strM751aa7.contains("[替换")) {
                                                                    strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                                                                }
                                                                strReplaceAll2 = strM751aa + strM1794n + str14;
                                                                str26 = str28;
                                                                if (strReplaceAll2.contains(str26)) {
                                                                    strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                                                                }
                                                                JSONObject jSONObject3 = new JSONObject();
                                                                StringBuilder sb = new StringBuilder();
                                                                sb.append(str55);
                                                                String str56 = str27;
                                                                sb.append(str56);
                                                                sb.append(strM1787g);
                                                                sb.append(str56);
                                                                sb.append(strReplaceAll2);
                                                                jSONObject3.put("vod_id", sb.toString());
                                                                jSONObject3.put("vod_name", str55);
                                                                jSONObject3.put("vod_pic", strM1787g);
                                                                jSONObject3.put("vod_remarks", str16);
                                                                jSONArray2 = jSONArray;
                                                                jSONArray2.put(jSONObject3);
                                                                i3++;
                                                                str17 = strM1787g;
                                                                jSONArray = jSONArray2;
                                                                str27 = str56;
                                                                strReplaceAll = strReplaceAll;
                                                                c0589rp = c0589rp2;
                                                                str6 = str21;
                                                                str5 = str5;
                                                                str30 = str22;
                                                                z = z;
                                                                str28 = str26;
                                                            }
                                                        }
                                                        str16 = textByRule;
                                                        strM751aa7 = m751aa(str43);
                                                        if (strM751aa7.isEmpty()) {
                                                            str10 = str10;
                                                        } else {
                                                            str10 = str10;
                                                        }
                                                        str43 = str43;
                                                        if (z) {
                                                            strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                                                        } else {
                                                            strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                                                        }
                                                        if (strM751aa7.contains("[替换")) {
                                                            strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                                                        }
                                                        strReplaceAll2 = strM751aa + strM1794n + str14;
                                                        str26 = str28;
                                                        if (strReplaceAll2.contains(str26)) {
                                                            strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                                                        }
                                                        JSONObject jSONObject4 = new JSONObject();
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append(str55);
                                                        String str57 = str27;
                                                        sb2.append(str57);
                                                        sb2.append(strM1787g);
                                                        sb2.append(str57);
                                                        sb2.append(strReplaceAll2);
                                                        jSONObject4.put("vod_id", sb2.toString());
                                                        jSONObject4.put("vod_name", str55);
                                                        jSONObject4.put("vod_pic", strM1787g);
                                                        jSONObject4.put("vod_remarks", str16);
                                                        jSONArray2 = jSONArray;
                                                        jSONArray2.put(jSONObject4);
                                                        i3++;
                                                        str17 = strM1787g;
                                                        jSONArray = jSONArray2;
                                                        str27 = str57;
                                                        strReplaceAll = strReplaceAll;
                                                        c0589rp = c0589rp2;
                                                        str6 = str21;
                                                        str5 = str5;
                                                        str30 = str22;
                                                        z = z;
                                                        str28 = str26;
                                                    }
                                                    str16 = str16;
                                                    strM751aa7 = m751aa(str43);
                                                    if (strM751aa7.isEmpty()) {
                                                        str10 = str10;
                                                    } else {
                                                        str10 = str10;
                                                    }
                                                    str43 = str43;
                                                    if (z) {
                                                        strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                                                    } else {
                                                        strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                                                    }
                                                    if (strM751aa7.contains("[替换")) {
                                                        strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                                                    }
                                                    strReplaceAll2 = strM751aa + strM1794n + str14;
                                                    str26 = str28;
                                                    if (strReplaceAll2.contains(str26)) {
                                                        strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                                                    }
                                                    JSONObject jSONObject5 = new JSONObject();
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append(str55);
                                                    String str58 = str27;
                                                    sb3.append(str58);
                                                    sb3.append(strM1787g);
                                                    sb3.append(str58);
                                                    sb3.append(strReplaceAll2);
                                                    jSONObject5.put("vod_id", sb3.toString());
                                                    jSONObject5.put("vod_name", str55);
                                                    jSONObject5.put("vod_pic", strM1787g);
                                                    jSONObject5.put("vod_remarks", str16);
                                                    jSONArray2 = jSONArray;
                                                    jSONArray2.put(jSONObject5);
                                                    i3++;
                                                    str17 = strM1787g;
                                                    jSONArray = jSONArray2;
                                                    str27 = str58;
                                                    strReplaceAll = strReplaceAll;
                                                    c0589rp = c0589rp2;
                                                    str6 = str21;
                                                    str5 = str5;
                                                    str30 = str22;
                                                    z = z;
                                                    str28 = str26;
                                                }
                                            }
                                            if (z4) {
                                                try {
                                                    strM1787g = m765x(strM1787g, strReplaceAll);
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    str17 = strM1787g;
                                                    SpiderDebug.log(e);
                                                    strM1787g = str17;
                                                }
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            str21 = str6;
                                            str22 = str19;
                                        }
                                        str24 = str46;
                                        strM751aa6 = m751aa(str24);
                                        if (strM751aa6.isEmpty() || z != z3) {
                                            str25 = str12;
                                        } else {
                                            str25 = str12;
                                            strM751aa6 = m751aa(str25);
                                        }
                                        if (strM751aa6.isEmpty()) {
                                            if (z) {
                                                textByRule = getTextByRule(c0226ed2, strM751aa6);
                                                str12 = str25;
                                                str46 = str24;
                                                str13 = str23;
                                            } else {
                                                str12 = str25;
                                                str46 = str24;
                                                str13 = str23;
                                                textByRule = m757ag((String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa6.split("&&")[0], strM751aa6.split("&&")[1]).get(0));
                                            }
                                            str16 = textByRule;
                                            strM751aa7 = m751aa(str43);
                                            if (strM751aa7.isEmpty() || z != z3) {
                                                str10 = str10;
                                            } else {
                                                str10 = str10;
                                                strM751aa7 = m751aa(str10);
                                            }
                                            str43 = str43;
                                            if (z) {
                                                strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                                            } else {
                                                strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                                            }
                                            if (strM751aa7.contains("[替换")) {
                                                strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                                            }
                                            strReplaceAll2 = strM751aa + strM1794n + str14;
                                            str26 = str28;
                                            if (strReplaceAll2.contains(str26)) {
                                                strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                                            }
                                            JSONObject jSONObject6 = new JSONObject();
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(str55);
                                            String str59 = str27;
                                            sb4.append(str59);
                                            sb4.append(strM1787g);
                                            sb4.append(str59);
                                            sb4.append(strReplaceAll2);
                                            jSONObject6.put("vod_id", sb4.toString());
                                            jSONObject6.put("vod_name", str55);
                                            jSONObject6.put("vod_pic", strM1787g);
                                            jSONObject6.put("vod_remarks", str16);
                                            jSONArray2 = jSONArray;
                                            jSONArray2.put(jSONObject6);
                                            i3++;
                                            str17 = strM1787g;
                                            jSONArray = jSONArray2;
                                            str27 = str59;
                                            strReplaceAll = strReplaceAll;
                                            c0589rp = c0589rp2;
                                            str6 = str21;
                                            str5 = str5;
                                            str30 = str22;
                                            z = z;
                                            str28 = str26;
                                        } else {
                                            str12 = str25;
                                            str46 = str24;
                                            str13 = str23;
                                        }
                                        str16 = str16;
                                        strM751aa7 = m751aa(str43);
                                        if (strM751aa7.isEmpty()) {
                                            str10 = str10;
                                        } else {
                                            str10 = str10;
                                        }
                                        str43 = str43;
                                        if (z) {
                                            strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                                        } else {
                                            strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                                        }
                                        if (strM751aa7.contains("[替换")) {
                                            strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                                        }
                                        strReplaceAll2 = strM751aa + strM1794n + str14;
                                        str26 = str28;
                                        if (strReplaceAll2.contains(str26)) {
                                            strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                                        }
                                        JSONObject jSONObject7 = new JSONObject();
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(str55);
                                        String str510 = str27;
                                        sb5.append(str510);
                                        sb5.append(strM1787g);
                                        sb5.append(str510);
                                        sb5.append(strReplaceAll2);
                                        jSONObject7.put("vod_id", sb5.toString());
                                        jSONObject7.put("vod_name", str55);
                                        jSONObject7.put("vod_pic", strM1787g);
                                        jSONObject7.put("vod_remarks", str16);
                                        jSONArray2 = jSONArray;
                                        jSONArray2.put(jSONObject7);
                                        i3++;
                                        str17 = strM1787g;
                                        jSONArray = jSONArray2;
                                        str27 = str510;
                                        strReplaceAll = strReplaceAll;
                                        c0589rp = c0589rp2;
                                        str6 = str21;
                                        str5 = str5;
                                        str30 = str22;
                                        z = z;
                                        str28 = str26;
                                    }
                                    if (strM751aa6.isEmpty()) {
                                        if (z) {
                                            textByRule = getTextByRule(c0226ed2, strM751aa6);
                                            str12 = str25;
                                            str46 = str24;
                                            str13 = str23;
                                        } else {
                                            str12 = str25;
                                            str46 = str24;
                                            str13 = str23;
                                            textByRule = m757ag((String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa6.split("&&")[0], strM751aa6.split("&&")[1]).get(0));
                                        }
                                        str16 = textByRule;
                                        strM751aa7 = m751aa(str43);
                                        if (strM751aa7.isEmpty()) {
                                            str10 = str10;
                                        } else {
                                            str10 = str10;
                                        }
                                        str43 = str43;
                                        if (z) {
                                            strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                                        } else {
                                            strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                                        }
                                        if (strM751aa7.contains("[替换")) {
                                            strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                                        }
                                        strReplaceAll2 = strM751aa + strM1794n + str14;
                                        str26 = str28;
                                        if (strReplaceAll2.contains(str26)) {
                                            strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                                        }
                                        JSONObject jSONObject8 = new JSONObject();
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append(str55);
                                        String str511 = str27;
                                        sb6.append(str511);
                                        sb6.append(strM1787g);
                                        sb6.append(str511);
                                        sb6.append(strReplaceAll2);
                                        jSONObject8.put("vod_id", sb6.toString());
                                        jSONObject8.put("vod_name", str55);
                                        jSONObject8.put("vod_pic", strM1787g);
                                        jSONObject8.put("vod_remarks", str16);
                                        jSONArray2 = jSONArray;
                                        jSONArray2.put(jSONObject8);
                                        i3++;
                                        str17 = strM1787g;
                                        jSONArray = jSONArray2;
                                        str27 = str511;
                                        strReplaceAll = strReplaceAll;
                                        c0589rp = c0589rp2;
                                        str6 = str21;
                                        str5 = str5;
                                        str30 = str22;
                                        z = z;
                                        str28 = str26;
                                    } else {
                                        str12 = str25;
                                        str46 = str24;
                                        str13 = str23;
                                    }
                                    jSONArray2.put(jSONObject8);
                                    i3++;
                                    str17 = strM1787g;
                                    jSONArray = jSONArray2;
                                    str27 = str511;
                                    strReplaceAll = strReplaceAll;
                                    c0589rp = c0589rp2;
                                    str6 = str21;
                                    str5 = str5;
                                    str30 = str22;
                                    z = z;
                                    str28 = str26;
                                } catch (Exception e11) {
                                    e = e11;
                                    SpiderDebug.log(e);
                                    if (this.f357l) {
                                        Init.show("主页历遍列表出错：" + e.toString());
                                    }
                                    jSONObject = jSONObject2;
                                    jSONObject.put("list", jSONArray2);
                                    return jSONObject.toString();
                                }
                                strM1787g = str17;
                                str24 = str46;
                                strM751aa6 = m751aa(str24);
                                if (strM751aa6.isEmpty()) {
                                    str25 = str12;
                                } else {
                                    str25 = str12;
                                }
                                str16 = str16;
                                strM751aa7 = m751aa(str43);
                                if (strM751aa7.isEmpty()) {
                                    str10 = str10;
                                } else {
                                    str10 = str10;
                                }
                                str43 = str43;
                                if (z) {
                                    strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                                } else {
                                    strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                                }
                                if (strM751aa7.contains("[替换")) {
                                    strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                                }
                                strReplaceAll2 = strM751aa + strM1794n + str14;
                                str26 = str28;
                                if (strReplaceAll2.contains(str26)) {
                                    strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                                }
                                JSONObject jSONObject9 = new JSONObject();
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(str55);
                                String str512 = str27;
                                sb7.append(str512);
                                sb7.append(strM1787g);
                                sb7.append(str512);
                                sb7.append(strReplaceAll2);
                                jSONObject9.put("vod_id", sb7.toString());
                                jSONObject9.put("vod_name", str55);
                                jSONObject9.put("vod_pic", strM1787g);
                                jSONObject9.put("vod_remarks", str16);
                                jSONArray2 = jSONArray;
                            }
                            i2++;
                            str15 = str17;
                            str37 = str37;
                            c0589rpSelectElements = c0589rpSelectElements;
                            str6 = str6;
                            str30 = str30;
                            z = z;
                        } catch (Exception e12) {
                            e = e12;
                            jSONArray2 = jSONArray;
                        }
                    }
                    jSONArray2 = jSONArray;
                    jSONObject = jSONObject2;
                    jSONObject.put("list", jSONArray2);
                } else {
                    jSONObject = jSONObject2;
                    str = str2;
                }
                return jSONObject.toString();
            }
            str2 = "";
            if (!m751aa(str39).isEmpty()) {
                if (m751aa(str41).equals("1")) {
                }
                str3 = "网页编码格式";
                if (m751aa(str3).isEmpty()) {
                    str3 = "Coding_format";
                }
                this.f349d = m752ab(str3, "UTF-8");
                if (m751aa("分类片单是否Jsoup写法").isEmpty()) {
                    str4 = "分类片单是否Jsoup写法";
                } else {
                    str4 = "cat_is_jsoup";
                }
                if (m751aa("分类片单标题").isEmpty()) {
                    str5 = "分类片单标题";
                } else {
                    str5 = "cat_title";
                }
                String str513 = m751aa("分类片单链接").isEmpty() ? "cat_url" : "分类片单链接";
                str6 = m751aa("分类片单图片").isEmpty() ? "cat_pic" : "分类片单图片";
                str7 = m751aa("分类片单副标题").isEmpty() ? "cat_subtitle" : "分类片单副标题";
                if (m751aa("分类片单链接加前缀").isEmpty()) {
                }
                if (m751aa("分类片单链接加后缀").isEmpty()) {
                }
                jSONArray = jSONArray3;
                str10 = str513;
                if (m752ab(str36, "1").equals("1")) {
                    z = true;
                } else {
                    z = true;
                }
                if (m751aa(str40).equals("1")) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (m752ab(str4, "1").equals("1")) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                strReplaceAll = m751aa(str39).replaceAll("时间戳", String.valueOf(System.currentTimeMillis() / 1000)).replaceAll("时间标", String.valueOf(System.currentTimeMillis()));
                str11 = ")";
                if (strReplaceAll.contains("md5(")) {
                    String str514 = (String) AbstractC0716wh.m1797q(strReplaceAll, "md5(", ")").get(0);
                    strReplaceAll = strReplaceAll.replace("md5(" + str514 + ")", AbstractC0405ku.m1360d(str514, AbstractC0405ku.f1107c));
                }
                if (strReplaceAll.contains(";post")) {
                    str12 = str7;
                    strTrim = strReplaceAll.split("\\?")[0].replaceAll("？？", "?").trim();
                    z4 = z2;
                    strTrim2 = strReplaceAll.split("\\?")[1].split(";")[0].replaceAll("？？", "?").trim();
                    if (strTrim2.isEmpty()) {
                        str13 = ")";
                        strM762u = m763v(strTrim, null, this.f349d, m766y(strTrim));
                    } else if (strTrim2.startsWith("{")) {
                        linkedHashMap = new LinkedHashMap();
                        strArrSplit4 = strTrim2.split("&");
                        length = strArrSplit4.length;
                        i5 = 0;
                        while (i5 < length) {
                            String str515 = strArrSplit4[i5];
                            String[] strArr3 = strArrSplit4;
                            int iIndexOf2 = str515.indexOf("=");
                            linkedHashMap.put(str515.substring(0, iIndexOf2), str515.substring(iIndexOf2 + 1));
                            i5++;
                            strArrSplit4 = strArr3;
                            length = length;
                            str11 = str11;
                        }
                        str13 = str11;
                        strM762u = m763v(strTrim, linkedHashMap, this.f349d, m766y(strTrim));
                    } else {
                        linkedHashMap = new LinkedHashMap();
                        strArrSplit4 = strTrim2.split("&");
                        length = strArrSplit4.length;
                        i5 = 0;
                        while (i5 < length) {
                            String str516 = strArrSplit4[i5];
                            String[] strArr4 = strArrSplit4;
                            int iIndexOf3 = str516.indexOf("=");
                            linkedHashMap.put(str516.substring(0, iIndexOf3), str516.substring(iIndexOf3 + 1));
                            i5++;
                            strArrSplit4 = strArr4;
                            length = length;
                            str11 = str11;
                        }
                        str13 = str11;
                        strM762u = m763v(strTrim, linkedHashMap, this.f349d, m766y(strTrim));
                    }
                } else {
                    str12 = str7;
                    z4 = z2;
                    str13 = ")";
                    strM762u = m762u(strReplaceAll, this.f349d, m766y(strReplaceAll));
                    if (strM762u.contains("检测中")) {
                        strM762u = m755ae(strReplaceAll, strM762u, "show");
                    }
                    if (strM762u.contains("/huadong_")) {
                        strM762u = m754ad(strReplaceAll, strM762u, "show");
                    } else {
                        strM762u = m754ad(strReplaceAll, strM762u, "show");
                    }
                }
                c0235emM1487a = AbstractC0502oj.m1487a(m746m(strM762u));
                strM751aa = m751aa(str51);
                if (strM751aa.isEmpty()) {
                    strM751aa = m751aa(str8);
                }
                if (strM751aa.contains("&&")) {
                    strM751aa = getTextByRule(c0235emM1487a, strM751aa).replace("PG_URL", strReplaceAll);
                }
                if (strM751aa.contains("PG_URL")) {
                    str = str2;
                    strM751aa = strM751aa.replace("PG_URL", strReplaceAll).replaceAll("'", str);
                } else {
                    str = str2;
                }
                strM751aa2 = m751aa(str50);
                if (strM751aa2.isEmpty()) {
                    strM751aa2 = m751aa(str9);
                }
                if (strM751aa2.contains("&&")) {
                    strM751aa2 = getTextByRule(c0235emM1487a, strM751aa2);
                }
                str14 = strM751aa2;
                strArrSplit = m751aa(str49).split("&&");
                trueElement = getTrueElement(strArrSplit[0], c0235emM1487a);
                while (i < strArrSplit.length - 1) {
                    trueElement = getTrueElement(strArrSplit[i], trueElement);
                }
                c0589rpSelectElements = selectElements(trueElement, strArrSplit[strArrSplit.length - 1]);
                str15 = str;
                str16 = str15;
                i2 = 0;
                while (i2 < c0589rpSelectElements.size()) {
                    c0226ed = (C0226ed) c0589rpSelectElements.get(i2);
                    str17 = str15;
                    strM751aa3 = m751aa(str37);
                    if (strM751aa3.contains("&&")) {
                        strArrSplit3 = strM751aa3.split("&&");
                        trueElement2 = getTrueElement(strArrSplit3[0], c0226ed);
                        while (i4 < strArrSplit3.length - 1) {
                            trueElement2 = getTrueElement(strArrSplit3[i4], trueElement2);
                        }
                        c0589rpSelectElements2 = selectElements(trueElement2, strArrSplit3[strArrSplit3.length - 1]);
                    } else {
                        c0589rpSelectElements2 = selectElements(c0226ed, strM751aa3);
                    }
                    c0589rp = c0589rpSelectElements2;
                    i3 = 0;
                    while (i3 < c0589rp.size()) {
                        c0226ed2 = (C0226ed) c0589rp.get(i3);
                        C0589rp c0589rp3 = c0589rp;
                        str48 = str48;
                        strM751aa4 = m751aa(str48);
                        if (strM751aa4.isEmpty()) {
                            strM751aa4 = m751aa(str5);
                        }
                        if (z) {
                            strM757ag = getTextByRule(c0226ed2, strM751aa4);
                        } else {
                            strM757ag = m757ag((String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa4.split("&&")[0], strM751aa4.split("&&")[1]).get(0));
                        }
                        str18 = str32;
                        if (strM757ag.contains(str18)) {
                            str19 = str30;
                            if (strM757ag.contains(str19)) {
                                strM757ag = strM757ag.split(str18)[1].split(str19)[0];
                            }
                        } else {
                            str19 = str30;
                        }
                        String str517 = strM757ag;
                        str32 = str18;
                        str20 = str47;
                        strM751aa5 = m751aa(str20);
                        if (strM751aa5.isEmpty()) {
                            strM751aa5 = m751aa(str6);
                        }
                        if (strM751aa5.isEmpty()) {
                            str47 = str20;
                            if (strM751aa5.startsWith("http")) {
                                strM1787g = strM751aa5;
                                str21 = str6;
                                str22 = str19;
                                str23 = str13;
                            } else {
                                if (z) {
                                    strM1787g = getTextByRule(c0226ed2, strM751aa5).trim();
                                    str21 = str6;
                                    str22 = str19;
                                } else {
                                    str21 = str6;
                                    str22 = str19;
                                    strM1787g = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa5.split("&&")[0], strM751aa5.split("&&")[1]).get(0);
                                }
                                if (strM1787g.contains("url(")) {
                                    strArrSplit2 = strM1787g.replaceAll("\\&quot;", str).split("url\\(");
                                    if (strArrSplit2.length > 1) {
                                        str23 = str13;
                                        if (strArrSplit2[1].contains(str23)) {
                                            strM1787g = strArrSplit2[1].split("\\)")[0].replaceAll("['\"]", str);
                                        }
                                    } else {
                                        str23 = str13;
                                    }
                                } else {
                                    str23 = str13;
                                }
                                strM1787g = AbstractC0716wh.m1787g(strReplaceAll, strM1787g);
                            }
                            if (z4) {
                                strM1787g = m765x(strM1787g, strReplaceAll);
                            }
                            str24 = str46;
                            strM751aa6 = m751aa(str24);
                            if (strM751aa6.isEmpty()) {
                                str25 = str12;
                            } else {
                                str25 = str12;
                            }
                            if (strM751aa6.isEmpty()) {
                                if (z) {
                                    textByRule = getTextByRule(c0226ed2, strM751aa6);
                                    str12 = str25;
                                    str46 = str24;
                                    str13 = str23;
                                } else {
                                    str12 = str25;
                                    str46 = str24;
                                    str13 = str23;
                                    textByRule = m757ag((String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa6.split("&&")[0], strM751aa6.split("&&")[1]).get(0));
                                }
                                str16 = textByRule;
                                strM751aa7 = m751aa(str43);
                                if (strM751aa7.isEmpty()) {
                                    str10 = str10;
                                } else {
                                    str10 = str10;
                                }
                                str43 = str43;
                                if (z) {
                                    strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                                } else {
                                    strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                                }
                                if (strM751aa7.contains("[替换")) {
                                    strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                                }
                                strReplaceAll2 = strM751aa + strM1794n + str14;
                                str26 = str28;
                                if (strReplaceAll2.contains(str26)) {
                                    strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                                }
                                JSONObject jSONObject10 = new JSONObject();
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(str517);
                                String str518 = str27;
                                sb8.append(str518);
                                sb8.append(strM1787g);
                                sb8.append(str518);
                                sb8.append(strReplaceAll2);
                                jSONObject10.put("vod_id", sb8.toString());
                                jSONObject10.put("vod_name", str517);
                                jSONObject10.put("vod_pic", strM1787g);
                                jSONObject10.put("vod_remarks", str16);
                                jSONArray2 = jSONArray;
                                jSONArray2.put(jSONObject10);
                                i3++;
                                str17 = strM1787g;
                                jSONArray = jSONArray2;
                                str27 = str518;
                                strReplaceAll = strReplaceAll;
                                c0589rp = c0589rp3;
                                str6 = str21;
                                str5 = str5;
                                str30 = str22;
                                z = z;
                                str28 = str26;
                            } else {
                                str12 = str25;
                                str46 = str24;
                                str13 = str23;
                            }
                            str16 = str16;
                            strM751aa7 = m751aa(str43);
                            if (strM751aa7.isEmpty()) {
                                str10 = str10;
                            } else {
                                str10 = str10;
                            }
                            str43 = str43;
                            if (z) {
                                strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                            } else {
                                strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                            }
                            if (strM751aa7.contains("[替换")) {
                                strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                            }
                            strReplaceAll2 = strM751aa + strM1794n + str14;
                            str26 = str28;
                            if (strReplaceAll2.contains(str26)) {
                                strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                            }
                            JSONObject jSONObject11 = new JSONObject();
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(str517);
                            String str519 = str27;
                            sb9.append(str519);
                            sb9.append(strM1787g);
                            sb9.append(str519);
                            sb9.append(strReplaceAll2);
                            jSONObject11.put("vod_id", sb9.toString());
                            jSONObject11.put("vod_name", str517);
                            jSONObject11.put("vod_pic", strM1787g);
                            jSONObject11.put("vod_remarks", str16);
                            jSONArray2 = jSONArray;
                            jSONArray2.put(jSONObject11);
                            i3++;
                            str17 = strM1787g;
                            jSONArray = jSONArray2;
                            str27 = str519;
                            strReplaceAll = strReplaceAll;
                            c0589rp = c0589rp3;
                            str6 = str21;
                            str5 = str5;
                            str30 = str22;
                            z = z;
                            str28 = str26;
                        } else {
                            str47 = str20;
                            str21 = str6;
                            str22 = str19;
                            str23 = str13;
                        }
                        strM1787g = str17;
                        str24 = str46;
                        strM751aa6 = m751aa(str24);
                        if (strM751aa6.isEmpty()) {
                            str25 = str12;
                        } else {
                            str25 = str12;
                        }
                        if (strM751aa6.isEmpty()) {
                            if (z) {
                                textByRule = getTextByRule(c0226ed2, strM751aa6);
                                str12 = str25;
                                str46 = str24;
                                str13 = str23;
                            } else {
                                str12 = str25;
                                str46 = str24;
                                str13 = str23;
                                textByRule = m757ag((String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa6.split("&&")[0], strM751aa6.split("&&")[1]).get(0));
                            }
                            str16 = textByRule;
                            strM751aa7 = m751aa(str43);
                            if (strM751aa7.isEmpty()) {
                                str10 = str10;
                            } else {
                                str10 = str10;
                            }
                            str43 = str43;
                            if (z) {
                                strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                            } else {
                                strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                            }
                            if (strM751aa7.contains("[替换")) {
                                strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                            }
                            strReplaceAll2 = strM751aa + strM1794n + str14;
                            str26 = str28;
                            if (strReplaceAll2.contains(str26)) {
                                strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                            }
                            JSONObject jSONObject12 = new JSONObject();
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(str517);
                            String str5110 = str27;
                            sb10.append(str5110);
                            sb10.append(strM1787g);
                            sb10.append(str5110);
                            sb10.append(strReplaceAll2);
                            jSONObject12.put("vod_id", sb10.toString());
                            jSONObject12.put("vod_name", str517);
                            jSONObject12.put("vod_pic", strM1787g);
                            jSONObject12.put("vod_remarks", str16);
                            jSONArray2 = jSONArray;
                            jSONArray2.put(jSONObject12);
                            i3++;
                            str17 = strM1787g;
                            jSONArray = jSONArray2;
                            str27 = str5110;
                            strReplaceAll = strReplaceAll;
                            c0589rp = c0589rp3;
                            str6 = str21;
                            str5 = str5;
                            str30 = str22;
                            z = z;
                            str28 = str26;
                        } else {
                            str12 = str25;
                            str46 = str24;
                            str13 = str23;
                        }
                        str16 = str16;
                        strM751aa7 = m751aa(str43);
                        if (strM751aa7.isEmpty()) {
                            str10 = str10;
                        } else {
                            str10 = str10;
                        }
                        str43 = str43;
                        if (z) {
                            strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                        } else {
                            strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                        }
                        if (strM751aa7.contains("[替换")) {
                            strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                        }
                        strReplaceAll2 = strM751aa + strM1794n + str14;
                        str26 = str28;
                        if (strReplaceAll2.contains(str26)) {
                            strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                        }
                        JSONObject jSONObject13 = new JSONObject();
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(str517);
                        String str5111 = str27;
                        sb11.append(str5111);
                        sb11.append(strM1787g);
                        sb11.append(str5111);
                        sb11.append(strReplaceAll2);
                        jSONObject13.put("vod_id", sb11.toString());
                        jSONObject13.put("vod_name", str517);
                        jSONObject13.put("vod_pic", strM1787g);
                        jSONObject13.put("vod_remarks", str16);
                        jSONArray2 = jSONArray;
                        jSONArray2.put(jSONObject13);
                        i3++;
                        str17 = strM1787g;
                        jSONArray = jSONArray2;
                        str27 = str5111;
                        strReplaceAll = strReplaceAll;
                        c0589rp = c0589rp3;
                        str6 = str21;
                        str5 = str5;
                        str30 = str22;
                        z = z;
                        str28 = str26;
                    }
                    i2++;
                    str15 = str17;
                    str37 = str37;
                    c0589rpSelectElements = c0589rpSelectElements;
                    str6 = str6;
                    str30 = str30;
                    z = z;
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
                jSONObject.put("list", jSONArray2);
            } else {
                if (m751aa(str41).equals("1")) {
                }
                str3 = "网页编码格式";
                if (m751aa(str3).isEmpty()) {
                    str3 = "Coding_format";
                }
                this.f349d = m752ab(str3, "UTF-8");
                if (m751aa("分类片单是否Jsoup写法").isEmpty()) {
                    str4 = "分类片单是否Jsoup写法";
                } else {
                    str4 = "cat_is_jsoup";
                }
                if (m751aa("分类片单标题").isEmpty()) {
                    str5 = "分类片单标题";
                } else {
                    str5 = "cat_title";
                }
                String str5112 = m751aa("分类片单链接").isEmpty() ? "cat_url" : "分类片单链接";
                str6 = m751aa("分类片单图片").isEmpty() ? "cat_pic" : "分类片单图片";
                str7 = m751aa("分类片单副标题").isEmpty() ? "cat_subtitle" : "分类片单副标题";
                if (m751aa("分类片单链接加前缀").isEmpty()) {
                }
                if (m751aa("分类片单链接加后缀").isEmpty()) {
                }
                jSONArray = jSONArray3;
                str10 = str5112;
                if (m752ab(str36, "1").equals("1")) {
                    z = true;
                } else {
                    z = true;
                }
                if (m751aa(str40).equals("1")) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (m752ab(str4, "1").equals("1")) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                strReplaceAll = m751aa(str39).replaceAll("时间戳", String.valueOf(System.currentTimeMillis() / 1000)).replaceAll("时间标", String.valueOf(System.currentTimeMillis()));
                str11 = ")";
                if (strReplaceAll.contains("md5(")) {
                    String str5113 = (String) AbstractC0716wh.m1797q(strReplaceAll, "md5(", ")").get(0);
                    strReplaceAll = strReplaceAll.replace("md5(" + str5113 + ")", AbstractC0405ku.m1360d(str5113, AbstractC0405ku.f1107c));
                }
                if (strReplaceAll.contains(";post")) {
                    str12 = str7;
                    strTrim = strReplaceAll.split("\\?")[0].replaceAll("？？", "?").trim();
                    z4 = z2;
                    strTrim2 = strReplaceAll.split("\\?")[1].split(";")[0].replaceAll("？？", "?").trim();
                    if (strTrim2.isEmpty()) {
                        str13 = ")";
                        strM762u = m763v(strTrim, null, this.f349d, m766y(strTrim));
                    } else if (strTrim2.startsWith("{")) {
                        linkedHashMap = new LinkedHashMap();
                        strArrSplit4 = strTrim2.split("&");
                        length = strArrSplit4.length;
                        i5 = 0;
                        while (i5 < length) {
                            String str5114 = strArrSplit4[i5];
                            String[] strArr5 = strArrSplit4;
                            int iIndexOf4 = str5114.indexOf("=");
                            linkedHashMap.put(str5114.substring(0, iIndexOf4), str5114.substring(iIndexOf4 + 1));
                            i5++;
                            strArrSplit4 = strArr5;
                            length = length;
                            str11 = str11;
                        }
                        str13 = str11;
                        strM762u = m763v(strTrim, linkedHashMap, this.f349d, m766y(strTrim));
                    } else {
                        linkedHashMap = new LinkedHashMap();
                        strArrSplit4 = strTrim2.split("&");
                        length = strArrSplit4.length;
                        i5 = 0;
                        while (i5 < length) {
                            String str5115 = strArrSplit4[i5];
                            String[] strArr6 = strArrSplit4;
                            int iIndexOf5 = str5115.indexOf("=");
                            linkedHashMap.put(str5115.substring(0, iIndexOf5), str5115.substring(iIndexOf5 + 1));
                            i5++;
                            strArrSplit4 = strArr6;
                            length = length;
                            str11 = str11;
                        }
                        str13 = str11;
                        strM762u = m763v(strTrim, linkedHashMap, this.f349d, m766y(strTrim));
                    }
                } else {
                    str12 = str7;
                    z4 = z2;
                    str13 = ")";
                    strM762u = m762u(strReplaceAll, this.f349d, m766y(strReplaceAll));
                    if (strM762u.contains("检测中")) {
                        strM762u = m755ae(strReplaceAll, strM762u, "show");
                    }
                    if (strM762u.contains("/huadong_")) {
                        strM762u = m754ad(strReplaceAll, strM762u, "show");
                    } else {
                        strM762u = m754ad(strReplaceAll, strM762u, "show");
                    }
                }
                c0235emM1487a = AbstractC0502oj.m1487a(m746m(strM762u));
                strM751aa = m751aa(str51);
                if (strM751aa.isEmpty()) {
                    strM751aa = m751aa(str8);
                }
                if (strM751aa.contains("&&")) {
                    strM751aa = getTextByRule(c0235emM1487a, strM751aa).replace("PG_URL", strReplaceAll);
                }
                if (strM751aa.contains("PG_URL")) {
                    str = str2;
                    strM751aa = strM751aa.replace("PG_URL", strReplaceAll).replaceAll("'", str);
                } else {
                    str = str2;
                }
                strM751aa2 = m751aa(str50);
                if (strM751aa2.isEmpty()) {
                    strM751aa2 = m751aa(str9);
                }
                if (strM751aa2.contains("&&")) {
                    strM751aa2 = getTextByRule(c0235emM1487a, strM751aa2);
                }
                str14 = strM751aa2;
                strArrSplit = m751aa(str49).split("&&");
                trueElement = getTrueElement(strArrSplit[0], c0235emM1487a);
                while (i < strArrSplit.length - 1) {
                    trueElement = getTrueElement(strArrSplit[i], trueElement);
                }
                c0589rpSelectElements = selectElements(trueElement, strArrSplit[strArrSplit.length - 1]);
                str15 = str;
                str16 = str15;
                i2 = 0;
                while (i2 < c0589rpSelectElements.size()) {
                    c0226ed = (C0226ed) c0589rpSelectElements.get(i2);
                    str17 = str15;
                    strM751aa3 = m751aa(str37);
                    if (strM751aa3.contains("&&")) {
                        strArrSplit3 = strM751aa3.split("&&");
                        trueElement2 = getTrueElement(strArrSplit3[0], c0226ed);
                        while (i4 < strArrSplit3.length - 1) {
                            trueElement2 = getTrueElement(strArrSplit3[i4], trueElement2);
                        }
                        c0589rpSelectElements2 = selectElements(trueElement2, strArrSplit3[strArrSplit3.length - 1]);
                    } else {
                        c0589rpSelectElements2 = selectElements(c0226ed, strM751aa3);
                    }
                    c0589rp = c0589rpSelectElements2;
                    i3 = 0;
                    while (i3 < c0589rp.size()) {
                        c0226ed2 = (C0226ed) c0589rp.get(i3);
                        C0589rp c0589rp4 = c0589rp;
                        str48 = str48;
                        strM751aa4 = m751aa(str48);
                        if (strM751aa4.isEmpty()) {
                            strM751aa4 = m751aa(str5);
                        }
                        if (z) {
                            strM757ag = getTextByRule(c0226ed2, strM751aa4);
                        } else {
                            strM757ag = m757ag((String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa4.split("&&")[0], strM751aa4.split("&&")[1]).get(0));
                        }
                        str18 = str32;
                        if (strM757ag.contains(str18)) {
                            str19 = str30;
                            if (strM757ag.contains(str19)) {
                                strM757ag = strM757ag.split(str18)[1].split(str19)[0];
                            }
                        } else {
                            str19 = str30;
                        }
                        String str5116 = strM757ag;
                        str32 = str18;
                        str20 = str47;
                        strM751aa5 = m751aa(str20);
                        if (strM751aa5.isEmpty()) {
                            strM751aa5 = m751aa(str6);
                        }
                        if (strM751aa5.isEmpty()) {
                            str47 = str20;
                            if (strM751aa5.startsWith("http")) {
                                strM1787g = strM751aa5;
                                str21 = str6;
                                str22 = str19;
                                str23 = str13;
                            } else {
                                if (z) {
                                    strM1787g = getTextByRule(c0226ed2, strM751aa5).trim();
                                    str21 = str6;
                                    str22 = str19;
                                } else {
                                    str21 = str6;
                                    str22 = str19;
                                    strM1787g = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa5.split("&&")[0], strM751aa5.split("&&")[1]).get(0);
                                }
                                if (strM1787g.contains("url(")) {
                                    strArrSplit2 = strM1787g.replaceAll("\\&quot;", str).split("url\\(");
                                    if (strArrSplit2.length > 1) {
                                        str23 = str13;
                                        if (strArrSplit2[1].contains(str23)) {
                                            strM1787g = strArrSplit2[1].split("\\)")[0].replaceAll("['\"]", str);
                                        }
                                    } else {
                                        str23 = str13;
                                    }
                                } else {
                                    str23 = str13;
                                }
                                strM1787g = AbstractC0716wh.m1787g(strReplaceAll, strM1787g);
                            }
                            if (z4) {
                                strM1787g = m765x(strM1787g, strReplaceAll);
                            }
                            str24 = str46;
                            strM751aa6 = m751aa(str24);
                            if (strM751aa6.isEmpty()) {
                                str25 = str12;
                            } else {
                                str25 = str12;
                            }
                            if (strM751aa6.isEmpty()) {
                                if (z) {
                                    textByRule = getTextByRule(c0226ed2, strM751aa6);
                                    str12 = str25;
                                    str46 = str24;
                                    str13 = str23;
                                } else {
                                    str12 = str25;
                                    str46 = str24;
                                    str13 = str23;
                                    textByRule = m757ag((String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa6.split("&&")[0], strM751aa6.split("&&")[1]).get(0));
                                }
                                str16 = textByRule;
                                strM751aa7 = m751aa(str43);
                                if (strM751aa7.isEmpty()) {
                                    str10 = str10;
                                } else {
                                    str10 = str10;
                                }
                                str43 = str43;
                                if (z) {
                                    strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                                } else {
                                    strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                                }
                                if (strM751aa7.contains("[替换")) {
                                    strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                                }
                                strReplaceAll2 = strM751aa + strM1794n + str14;
                                str26 = str28;
                                if (strReplaceAll2.contains(str26)) {
                                    strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                                }
                                JSONObject jSONObject14 = new JSONObject();
                                StringBuilder sb12 = new StringBuilder();
                                sb12.append(str5116);
                                String str5117 = str27;
                                sb12.append(str5117);
                                sb12.append(strM1787g);
                                sb12.append(str5117);
                                sb12.append(strReplaceAll2);
                                jSONObject14.put("vod_id", sb12.toString());
                                jSONObject14.put("vod_name", str5116);
                                jSONObject14.put("vod_pic", strM1787g);
                                jSONObject14.put("vod_remarks", str16);
                                jSONArray2 = jSONArray;
                                jSONArray2.put(jSONObject14);
                                i3++;
                                str17 = strM1787g;
                                jSONArray = jSONArray2;
                                str27 = str5117;
                                strReplaceAll = strReplaceAll;
                                c0589rp = c0589rp4;
                                str6 = str21;
                                str5 = str5;
                                str30 = str22;
                                z = z;
                                str28 = str26;
                            } else {
                                str12 = str25;
                                str46 = str24;
                                str13 = str23;
                            }
                            str16 = str16;
                            strM751aa7 = m751aa(str43);
                            if (strM751aa7.isEmpty()) {
                                str10 = str10;
                            } else {
                                str10 = str10;
                            }
                            str43 = str43;
                            if (z) {
                                strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                            } else {
                                strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                            }
                            if (strM751aa7.contains("[替换")) {
                                strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                            }
                            strReplaceAll2 = strM751aa + strM1794n + str14;
                            str26 = str28;
                            if (strReplaceAll2.contains(str26)) {
                                strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                            }
                            JSONObject jSONObject15 = new JSONObject();
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(str5116);
                            String str5118 = str27;
                            sb13.append(str5118);
                            sb13.append(strM1787g);
                            sb13.append(str5118);
                            sb13.append(strReplaceAll2);
                            jSONObject15.put("vod_id", sb13.toString());
                            jSONObject15.put("vod_name", str5116);
                            jSONObject15.put("vod_pic", strM1787g);
                            jSONObject15.put("vod_remarks", str16);
                            jSONArray2 = jSONArray;
                            jSONArray2.put(jSONObject15);
                            i3++;
                            str17 = strM1787g;
                            jSONArray = jSONArray2;
                            str27 = str5118;
                            strReplaceAll = strReplaceAll;
                            c0589rp = c0589rp4;
                            str6 = str21;
                            str5 = str5;
                            str30 = str22;
                            z = z;
                            str28 = str26;
                        } else {
                            str47 = str20;
                            str21 = str6;
                            str22 = str19;
                            str23 = str13;
                        }
                        strM1787g = str17;
                        str24 = str46;
                        strM751aa6 = m751aa(str24);
                        if (strM751aa6.isEmpty()) {
                            str25 = str12;
                        } else {
                            str25 = str12;
                        }
                        if (strM751aa6.isEmpty()) {
                            if (z) {
                                textByRule = getTextByRule(c0226ed2, strM751aa6);
                                str12 = str25;
                                str46 = str24;
                                str13 = str23;
                            } else {
                                str12 = str25;
                                str46 = str24;
                                str13 = str23;
                                textByRule = m757ag((String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa6.split("&&")[0], strM751aa6.split("&&")[1]).get(0));
                            }
                            str16 = textByRule;
                            strM751aa7 = m751aa(str43);
                            if (strM751aa7.isEmpty()) {
                                str10 = str10;
                            } else {
                                str10 = str10;
                            }
                            str43 = str43;
                            if (z) {
                                strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                            } else {
                                strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                            }
                            if (strM751aa7.contains("[替换")) {
                                strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                            }
                            strReplaceAll2 = strM751aa + strM1794n + str14;
                            str26 = str28;
                            if (strReplaceAll2.contains(str26)) {
                                strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                            }
                            JSONObject jSONObject16 = new JSONObject();
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append(str5116);
                            String str5119 = str27;
                            sb14.append(str5119);
                            sb14.append(strM1787g);
                            sb14.append(str5119);
                            sb14.append(strReplaceAll2);
                            jSONObject16.put("vod_id", sb14.toString());
                            jSONObject16.put("vod_name", str5116);
                            jSONObject16.put("vod_pic", strM1787g);
                            jSONObject16.put("vod_remarks", str16);
                            jSONArray2 = jSONArray;
                            jSONArray2.put(jSONObject16);
                            i3++;
                            str17 = strM1787g;
                            jSONArray = jSONArray2;
                            str27 = str5119;
                            strReplaceAll = strReplaceAll;
                            c0589rp = c0589rp4;
                            str6 = str21;
                            str5 = str5;
                            str30 = str22;
                            z = z;
                            str28 = str26;
                        } else {
                            str12 = str25;
                            str46 = str24;
                            str13 = str23;
                        }
                        str16 = str16;
                        strM751aa7 = m751aa(str43);
                        if (strM751aa7.isEmpty()) {
                            str10 = str10;
                        } else {
                            str10 = str10;
                        }
                        str43 = str43;
                        if (z) {
                            strM1794n = getTextByRule(c0226ed2, strM751aa7.split("\\[替换:")[0]);
                        } else {
                            strM1794n = (String) AbstractC0716wh.m1797q(c0226ed2.mo1192an(), strM751aa7.split("\\[替换:")[0].split("&&")[0], strM751aa7.split("\\[替换:")[0].split("&&")[1]).get(0);
                        }
                        if (strM751aa7.contains("[替换")) {
                            strM1794n = AbstractC0716wh.m1794n(strM1794n, strM751aa7);
                        }
                        strReplaceAll2 = strM751aa + strM1794n + str14;
                        str26 = str28;
                        if (strReplaceAll2.contains(str26)) {
                            strReplaceAll2 = strReplaceAll2.replaceAll(str26, strM1794n);
                        }
                        JSONObject jSONObject17 = new JSONObject();
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append(str5116);
                        String str51110 = str27;
                        sb15.append(str51110);
                        sb15.append(strM1787g);
                        sb15.append(str51110);
                        sb15.append(strReplaceAll2);
                        jSONObject17.put("vod_id", sb15.toString());
                        jSONObject17.put("vod_name", str5116);
                        jSONObject17.put("vod_pic", strM1787g);
                        jSONObject17.put("vod_remarks", str16);
                        jSONArray2 = jSONArray;
                        jSONArray2.put(jSONObject17);
                        i3++;
                        str17 = strM1787g;
                        jSONArray = jSONArray2;
                        str27 = str51110;
                        strReplaceAll = strReplaceAll;
                        c0589rp = c0589rp4;
                        str6 = str21;
                        str5 = str5;
                        str30 = str22;
                        z = z;
                        str28 = str26;
                    }
                    i2++;
                    str15 = str17;
                    str37 = str37;
                    c0589rpSelectElements = c0589rpSelectElements;
                    str6 = str6;
                    str30 = str30;
                    z = z;
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
                jSONObject.put("list", jSONArray2);
            }
            return jSONObject.toString();
        } catch (Exception e13) {
            e = e13;
            str = "";
        }
        SpiderDebug.log(e);
        if (this.f357l) {
            Init.show("主页全局出错：" + e.toString());
        }
        return str;
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.f354i = str;
    }

    public boolean isVideoFormat(String str) {
        m764w();
        String str2 = m752ab("手动嗅探视频链接关键词", "").isEmpty() ? "VideoFormat" : "手动嗅探视频链接关键词";
        String str3 = m752ab("手动嗅探视频链接过滤词", "").isEmpty() ? "VideoFilter" : "手动嗅探视频链接过滤词";
        String[] strArrSplit = m752ab(str2, ".m3u8#.mp4#.flv#video/tos#.mp3#.m4a").toLowerCase().split("#");
        String[] strArrSplit2 = m752ab(str3, "=http#.html").toLowerCase().split("#");
        String lowerCase = str.toLowerCase();
        if ((lowerCase.contains("=http") || lowerCase.contains(".html")) && !checkstring(lowerCase)) {
            return false;
        }
        for (String str4 : strArrSplit) {
            if (lowerCase.contains(str4)) {
                for (String str5 : strArrSplit2) {
                    if (lowerCase.contains(str5) && !checkstring(lowerCase)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean manualVideoCheck() {
        m764w();
        String str = m752ab("是否开启手动嗅探", "").isEmpty() ? "ManualSniffer" : "是否开启手动嗅探";
        return m752ab(str, "").equals("1") || m752ab(str, "").equals("是");
    }

    /* JADX WARN: Code duplicated, block: B:243:0x0496 A[Catch: Exception -> 0x0420, TryCatch #19 {Exception -> 0x0420, blocks: (B:213:0x0413, B:215:0x041b, B:223:0x0434, B:225:0x043c, B:228:0x0448, B:240:0x0476, B:241:0x0490, B:243:0x0496, B:245:0x04ae, B:227:0x0444), top: B:575:0x0413 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x04f1 A[Catch: Exception -> 0x04fe, TRY_LEAVE, TryCatch #42 {Exception -> 0x04fe, blocks: (B:247:0x04d1, B:249:0x04f1), top: B:618:0x04d1 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x0507  */
    /* JADX WARN: Code duplicated, block: B:256:0x0511 A[Catch: Exception -> 0x051a, TRY_LEAVE, TryCatch #22 {Exception -> 0x051a, blocks: (B:254:0x0509, B:256:0x0511), top: B:581:0x0509 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x0525  */
    /* JADX WARN: Code duplicated, block: B:273:0x0564  */
    /* JADX WARN: Code duplicated, block: B:276:0x0570 A[Catch: Exception -> 0x057d, TRY_LEAVE, TryCatch #43 {Exception -> 0x057d, blocks: (B:274:0x0568, B:276:0x0570), top: B:620:0x0568 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x0588  */
    /* JADX WARN: Code duplicated, block: B:283:0x0592 A[Catch: Exception -> 0x05a0, TryCatch #16 {Exception -> 0x05a0, blocks: (B:281:0x058a, B:283:0x0592, B:285:0x059b, B:290:0x05ae), top: B:570:0x058a }] */
    /* JADX WARN: Code duplicated, block: B:285:0x059b A[Catch: Exception -> 0x05a0, TryCatch #16 {Exception -> 0x05a0, blocks: (B:281:0x058a, B:283:0x0592, B:285:0x059b, B:290:0x05ae), top: B:570:0x058a }] */
    /* JADX WARN: Code duplicated, block: B:288:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:290:0x05ae A[Catch: Exception -> 0x05a0, TRY_LEAVE, TryCatch #16 {Exception -> 0x05a0, blocks: (B:281:0x058a, B:283:0x0592, B:285:0x059b, B:290:0x05ae), top: B:570:0x058a }] */
    /* JADX WARN: Code duplicated, block: B:292:0x05bf A[LOOP:1: B:241:0x0490->B:292:0x05bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:306:0x05f6 A[Catch: Exception -> 0x05f0, TryCatch #0 {Exception -> 0x05f0, blocks: (B:294:0x05d7, B:296:0x05dd, B:298:0x05e3, B:300:0x05e9, B:309:0x0602, B:311:0x0606, B:316:0x0633, B:318:0x0639, B:306:0x05f6, B:308:0x05fe), top: B:537:0x05d7 }] */
    /* JADX WARN: Code duplicated, block: B:308:0x05fe A[Catch: Exception -> 0x05f0, TryCatch #0 {Exception -> 0x05f0, blocks: (B:294:0x05d7, B:296:0x05dd, B:298:0x05e3, B:300:0x05e9, B:309:0x0602, B:311:0x0606, B:316:0x0633, B:318:0x0639, B:306:0x05f6, B:308:0x05fe), top: B:537:0x05d7 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x0606 A[Catch: Exception -> 0x05f0, TryCatch #0 {Exception -> 0x05f0, blocks: (B:294:0x05d7, B:296:0x05dd, B:298:0x05e3, B:300:0x05e9, B:309:0x0602, B:311:0x0606, B:316:0x0633, B:318:0x0639, B:306:0x05f6, B:308:0x05fe), top: B:537:0x05d7 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x0639 A[Catch: Exception -> 0x05f0, TRY_LEAVE, TryCatch #0 {Exception -> 0x05f0, blocks: (B:294:0x05d7, B:296:0x05dd, B:298:0x05e3, B:300:0x05e9, B:309:0x0602, B:311:0x0606, B:316:0x0633, B:318:0x0639, B:306:0x05f6, B:308:0x05fe), top: B:537:0x05d7 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x0657 A[Catch: Exception -> 0x0655, TRY_LEAVE, TryCatch #38 {Exception -> 0x0655, blocks: (B:320:0x0649, B:324:0x0657), top: B:612:0x0637 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x068a A[Catch: Exception -> 0x03ee, TRY_LEAVE, TryCatch #1 {Exception -> 0x03ee, blocks: (B:195:0x03cf, B:197:0x03dd, B:330:0x0683, B:332:0x068a), top: B:539:0x03cf }] */
    /* JADX WARN: Code duplicated, block: B:334:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:337:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:393:0x0805  */
    /* JADX WARN: Code duplicated, block: B:420:0x0877 A[Catch: Exception -> 0x0890, TRY_LEAVE, TryCatch #32 {Exception -> 0x0890, blocks: (B:418:0x0870, B:420:0x0877), top: B:600:0x0870 }] */
    /* JADX WARN: Code duplicated, block: B:428:0x089e A[Catch: Exception -> 0x08a3, TRY_LEAVE, TryCatch #30 {Exception -> 0x08a3, blocks: (B:426:0x0898, B:428:0x089e), top: B:596:0x0898 }] */
    /* JADX WARN: Code duplicated, block: B:442:0x08c1 A[Catch: Exception -> 0x08da, TRY_LEAVE, TryCatch #23 {Exception -> 0x08da, blocks: (B:453:0x08fe, B:455:0x0908, B:457:0x0914, B:440:0x08ba, B:442:0x08c1), top: B:583:0x08ba }] */
    /* JADX WARN: Code duplicated, block: B:447:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:452:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:455:0x0908 A[Catch: Exception -> 0x08da, TryCatch #23 {Exception -> 0x08da, blocks: (B:453:0x08fe, B:455:0x0908, B:457:0x0914, B:440:0x08ba, B:442:0x08c1), top: B:583:0x08ba }] */
    /* JADX WARN: Code duplicated, block: B:459:0x0929  */
    /* JADX WARN: Code duplicated, block: B:462:0x0931 A[Catch: Exception -> 0x0a72, TryCatch #12 {Exception -> 0x0a72, blocks: (B:450:0x08f6, B:460:0x092b, B:462:0x0931, B:466:0x0943), top: B:562:0x08f6 }] */
    /* JADX WARN: Code duplicated, block: B:464:0x0939  */
    /* JADX WARN: Code duplicated, block: B:475:0x0964 A[Catch: Exception -> 0x0958, TryCatch #36 {Exception -> 0x0958, blocks: (B:469:0x0951, B:475:0x0964, B:478:0x09ad, B:480:0x09c2, B:485:0x09f3), top: B:608:0x0951 }] */
    /* JADX WARN: Code duplicated, block: B:476:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:478:0x09ad A[Catch: Exception -> 0x0958, TryCatch #36 {Exception -> 0x0958, blocks: (B:469:0x0951, B:475:0x0964, B:478:0x09ad, B:480:0x09c2, B:485:0x09f3), top: B:608:0x0951 }] */
    /* JADX WARN: Code duplicated, block: B:479:0x09c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:480:0x09c2 A[Catch: Exception -> 0x0958, TRY_LEAVE, TryCatch #36 {Exception -> 0x0958, blocks: (B:469:0x0951, B:475:0x0964, B:478:0x09ad, B:480:0x09c2, B:485:0x09f3), top: B:608:0x0951 }] */
    /* JADX WARN: Code duplicated, block: B:509:0x0a7f A[Catch: Exception -> 0x0b28, TRY_LEAVE, TryCatch #26 {Exception -> 0x0b28, blocks: (B:507:0x0a77, B:509:0x0a7f), top: B:588:0x0a77 }] */
    /* JADX WARN: Code duplicated, block: B:514:0x0ab0 A[Catch: Exception -> 0x0ad4, LOOP:2: B:512:0x0aad->B:514:0x0ab0, LOOP_END, TryCatch #39 {Exception -> 0x0ad4, blocks: (B:511:0x0a83, B:512:0x0aad, B:514:0x0ab0, B:517:0x0ad7, B:521:0x0b2c), top: B:613:0x0a7d }] */
    /* JADX WARN: Code duplicated, block: B:521:0x0b2c A[Catch: Exception -> 0x0ad4, TRY_LEAVE, TryCatch #39 {Exception -> 0x0ad4, blocks: (B:511:0x0a83, B:512:0x0aad, B:514:0x0ab0, B:517:0x0ad7, B:521:0x0b2c), top: B:613:0x0a7d }] */
    /* JADX WARN: Code duplicated, block: B:525:0x0b4f A[Catch: Exception -> 0x0a68, TryCatch #27 {Exception -> 0x0a68, blocks: (B:498:0x0a45, B:500:0x0a4c, B:527:0x0b6f, B:523:0x0b48, B:525:0x0b4f), top: B:590:0x08f4 }] */
    /* JADX WARN: Code duplicated, block: B:526:0x0b68  */
    /* JADX WARN: Code duplicated, block: B:535:0x0b98  */
    /* JADX WARN: Code duplicated, block: B:562:0x08f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x0898 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x09eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x05c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:332:0x068a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:420:0x0877, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:442:0x08c1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:475:0x0964, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:478:0x09ad, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:480:0x09c2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:514:0x0ab0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:525:0x0b4f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:535:0x0b98, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v16 */
    /* JADX WARN: Type inference failed for: r31v17 */
    /* JADX WARN: Type inference failed for: r31v18 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v20 */
    /* JADX WARN: Type inference failed for: r31v21 */
    /* JADX WARN: Type inference failed for: r31v22 */
    /* JADX WARN: Type inference failed for: r31v23 */
    /* JADX WARN: Type inference failed for: r31v24 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v37 */
    /* JADX WARN: Type inference failed for: r31v38 */
    /* JADX WARN: Type inference failed for: r31v39 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v40 */
    /* JADX WARN: Type inference failed for: r31v41 */
    /* JADX WARN: Type inference failed for: r31v42 */
    /* JADX WARN: Type inference failed for: r31v43 */
    /* JADX WARN: Type inference failed for: r31v44 */
    /* JADX WARN: Type inference failed for: r31v45 */
    /* JADX WARN: Type inference failed for: r31v46 */
    /* JADX WARN: Type inference failed for: r31v47 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.String] */
    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        XYQHiker xYQHiker;
        String str3;
        Exception exc;
        String str4;
        String str5;
        Object obj;
        String str6;
        String str7;
        String str8;
        String str9;
        Object obj2;
        boolean z;
        boolean z2;
        String str10;
        String str11;
        Object obj3;
        String strM1796p;
        String str12;
        String str13;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object Contains;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        String strM1787g;
        boolean z3;
        boolean z4;
        boolean zContains;
        String str14;
        String str15;
        String str16;
        Exception exc2;
        char[] charArray;
        String str17;
        int i;
        Exception exc3;
        Exception exc4;
        String str18;
        JSONObject jSONObject;
        Exception exc5;
        Object r31;
        boolean z5;
        boolean z6;
        Exception exc6;
        String string;
        Object objValueOf;
        Object string2;
        Object string3;
        Object obj12;
        Object obj13;
        C0589rp c0589rpM1166ah;
        int i2;
        boolean zHas;
        boolean zHas2;
        Integer num;
        String strTrim;
        C0589rp c0589rp;
        JSONObject jSONObject2;
        String string4;
        Integer numValueOf;
        int i3;
        String str19;
        String str20 = "请求头参数";
        String str21 = "分析MacPlayer";
        String str22 = "网页编码格式";
        try {
            m764w();
            if (m751aa("网页编码格式").isEmpty()) {
                str22 = "Coding_format";
            }
            if (m751aa("分析MacPlayer").isEmpty()) {
                str21 = "Anal_MacPlayer";
            }
            this.f349d = m752ab(str22, "UTF-8");
            JSONObject jSONObject3 = new JSONObject();
            if (m751aa("请求头参数").isEmpty()) {
                str20 = "Headers";
            }
            String strTrim2 = m752ab(str20, "").trim();
            String str23 = "\\$";
            String str24 = str21;
            try {
                if (strTrim2.contains("$")) {
                    String[] strArrSplit = strTrim2.split("#");
                    int i4 = 0;
                    String str25 = strTrim2;
                    while (true) {
                        str19 = str25;
                        if (i4 >= strArrSplit.length) {
                            break;
                        }
                        String[] strArrSplit2 = strArrSplit[i4].split(str23);
                        String str26 = str23;
                        String str27 = strArrSplit2[0];
                        String str28 = strArrSplit2[1];
                        if (str28.equals("PC_UA") || str28.equals("电脑")) {
                            str28 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
                        } else if (str28.equals("MOBILE_UA") || str28.equals("手机")) {
                            str28 = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
                        } else if (str28.equals("IOS_UA") || str28.equals("苹果手机")) {
                            str28 = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
                        } else if (str28.equals("MAC_UA") || str28.equals("苹果电脑")) {
                            str28 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
                        }
                        if (str27.equalsIgnoreCase("referer") && str28.equalsIgnoreCase("WebView")) {
                            str28 = str2;
                        }
                        if (!this.f348c.isEmpty() && str27.equalsIgnoreCase("cookie")) {
                            str28 = str28 + ";" + this.f348c;
                        }
                        jSONObject3.put(str27, str28);
                        i4++;
                        str25 = str19;
                        str23 = str26;
                    }
                    String str29 = str23;
                    if (str19.toLowerCase().contains("referer")) {
                        str5 = str24;
                        obj = "2";
                    } else {
                        str5 = str24;
                        obj = "2";
                        if (m751aa(str5).equals(obj)) {
                            str2 = str2;
                            jSONObject3.put("Referer", str2);
                        }
                        if (!this.f348c.isEmpty() && this.f348c.length() > 1 && !str19.contains("Cookie$") && !str19.contains("cookie$")) {
                            jSONObject3.put("Cookie", this.f348c);
                        }
                        str3 = str2;
                        str4 = str29;
                        str8 = str19;
                    }
                    if (!this.f348c.isEmpty()) {
                        jSONObject3.put("Cookie", this.f348c);
                    }
                    str3 = str2;
                    str4 = str29;
                    str8 = str19;
                } else {
                    str4 = "\\$";
                    String str30 = strTrim2;
                    str5 = str24;
                    obj = "2";
                    if (str30.isEmpty()) {
                        str7 = "okhttp/3.12.11";
                    } else {
                        str6 = str30;
                        if (str6.equals("PC_UA") || str6.equals("电脑")) {
                            str7 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
                        } else if (str6.equals("MOBILE_UA") || str6.equals("手机")) {
                            str7 = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
                        } else if (str6.equals("IOS_UA") || str6.equals("苹果手机")) {
                            str7 = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
                        } else if (str6.equals("MAC_UA") || str6.equals("苹果电脑")) {
                            str7 = str6;
                            str7 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
                        }
                    }
                    str7 = str6;
                    if (!this.f348c.isEmpty() && this.f348c.length() > 1) {
                        jSONObject3.put("Cookie", this.f348c);
                    }
                    if (m751aa(str5).equals(obj)) {
                        str3 = str2;
                        jSONObject3.put("Referer", str3);
                    } else {
                        str3 = str2;
                    }
                    jSONObject3.put("User-Agent", str7);
                    str8 = str30;
                }
                String str31 = !m751aa("链接是否直接播放").isEmpty() ? "链接是否直接播放" : "force_play";
                String str32 = !m751aa("直接播放链接加前缀").isEmpty() ? "直接播放链接加前缀" : "play_prefix";
                String str33 = !m751aa("直接播放链接加后缀").isEmpty() ? "直接播放链接加后缀" : "play_suffix";
                String str34 = "直接播放直链视频请求头";
                if (m751aa(str34).isEmpty()) {
                    str34 = "play_header";
                }
                JSONObject jSONObject4 = new JSONObject();
                boolean z7 = m751aa(str31).equals("1") || m751aa(str31).equals(obj);
                String str35 = "suonizy";
                Object obj14 = obj;
                String str36 = str5;
                if (!z7) {
                    xYQHiker = this;
                    str35 = "header";
                    str9 = "";
                    try {
                        if (xYQHiker.m751aa(str36).equals("1")) {
                            obj2 = "1";
                        } else {
                            try {
                                obj2 = "1";
                                if (xYQHiker.m751aa(str36).equals(obj14)) {
                                    obj14 = obj14;
                                } else {
                                    if (!xYQHiker.m751aa(str36).equals("是")) {
                                        z = false;
                                    }
                                    if (!z && !z7) {
                                        try {
                                            str10 = str36;
                                            try {
                                                String strM762u = xYQHiker.m762u(str3, xYQHiker.f349d, xYQHiker.m766y(str3));
                                                z2 = z7;
                                                if (strM762u.contains("检测中")) {
                                                    try {
                                                        if (strM762u.contains("btwaf")) {
                                                            strM762u = xYQHiker.m755ae(str3, strM762u, "show");
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        exc6 = e;
                                                        strM1796p = null;
                                                        str13 = null;
                                                        string = null;
                                                        objValueOf = null;
                                                        string2 = null;
                                                        string3 = null;
                                                        obj12 = null;
                                                        obj13 = null;
                                                        SpiderDebug.log(exc6);
                                                        if (xYQHiker.f357l) {
                                                            Init.show("分析var plays部分出错：" + exc6.toString());
                                                        }
                                                        str12 = string;
                                                        obj5 = objValueOf;
                                                        obj6 = string2;
                                                        obj7 = string3;
                                                        obj3 = obj12;
                                                        obj4 = obj13;
                                                        str11 = str35;
                                                        Contains = obj13;
                                                        Object obj15 = obj4;
                                                        Object obj16 = obj5;
                                                        if (z) {
                                                            obj8 = obj6;
                                                            obj9 = obj7;
                                                            obj10 = obj2;
                                                            obj11 = obj3;
                                                            strM1787g = null;
                                                            z3 = false;
                                                            z4 = false;
                                                            zContains = false;
                                                            Contains = 0;
                                                            if (strM1796p != null) {
                                                                if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                    str14 = str10;
                                                                    if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                    }
                                                                    jSONObject4.put("parse", 1);
                                                                    jSONObject4.put("jx", obj10);
                                                                    jSONObject4.put("url", strM1796p);
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                }
                                                                str14 = str10;
                                                                if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                    str15 = r4;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", strM1796p);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                    str17 = str3;
                                                                    for (i = 0; i < charArray.length; i += 2) {
                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                    }
                                                                    int iCeil = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                    String str37 = AbstractC0716wh.m1798r(str17).substring(0, iCeil - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil + 6);
                                                                    jSONObject4.put("parse", 0);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", str37);
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                    exc2 = e;
                                                                    SpiderDebug.log(exc2);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                    }
                                                                } else {
                                                                    str15 = r4;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", strM1796p);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                    str17 = str3;
                                                                    while (i < charArray.length) {
                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                    }
                                                                    int iCeil2 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                    String str38 = AbstractC0716wh.m1798r(str17).substring(0, iCeil2 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil2 + 6);
                                                                    jSONObject4.put("parse", 0);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", str38);
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                    exc2 = e;
                                                                    SpiderDebug.log(exc2);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                    }
                                                                }
                                                            } else {
                                                                str15 = "playUrl";
                                                                str13 = str3;
                                                                str3 = str9;
                                                                str16 = str11;
                                                            }
                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                            jSONObject4.put("parse", 1);
                                                            jSONObject4.put(str15, str3);
                                                            jSONObject4.put("url", str13);
                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                        }
                                                        obj8 = obj6;
                                                        obj9 = obj7;
                                                        obj10 = obj2;
                                                        obj11 = obj3;
                                                        strM1787g = null;
                                                        z3 = false;
                                                        z4 = false;
                                                        zContains = false;
                                                        Contains = 0;
                                                        if (strM1796p != null) {
                                                            try {
                                                                if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                    str14 = str10;
                                                                    if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                    }
                                                                    jSONObject4.put("parse", 1);
                                                                    jSONObject4.put("jx", obj10);
                                                                    jSONObject4.put("url", strM1796p);
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                }
                                                                str14 = str10;
                                                                if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                    str15 = r4;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                    try {
                                                                        try {
                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", strM1796p);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                            str17 = str3;
                                                                            while (i < charArray.length) {
                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                            }
                                                                            int iCeil3 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                            String str39 = AbstractC0716wh.m1798r(str17).substring(0, iCeil3 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil3 + 6);
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", str39);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        } catch (Exception e2) {
                                                                            e = e2;
                                                                        }
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        str13 = str2;
                                                                    }
                                                                    exc2 = e;
                                                                    SpiderDebug.log(exc2);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                    }
                                                                } else {
                                                                    str15 = r4;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", strM1796p);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                    str17 = str3;
                                                                    while (i < charArray.length) {
                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                    }
                                                                    int iCeil4 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                    String str310 = AbstractC0716wh.m1798r(str17).substring(0, iCeil4 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil4 + 6);
                                                                    jSONObject4.put("parse", 0);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", str310);
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                    exc2 = e;
                                                                    SpiderDebug.log(exc2);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                    }
                                                                }
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                str3 = str9;
                                                            }
                                                        } else {
                                                            str15 = "playUrl";
                                                            str13 = str3;
                                                            str3 = str9;
                                                            str16 = str11;
                                                        }
                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                        jSONObject4.put("parse", 1);
                                                        jSONObject4.put(str15, str3);
                                                        jSONObject4.put("url", str13);
                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                        SpiderDebug.log(exc);
                                                        if (xYQHiker.f357l) {
                                                            Init.show("播放类全局区域出错：" + exc.toString());
                                                        }
                                                        return str3;
                                                    }
                                                }
                                                if (strM762u.contains("/huadong_") || strM762u.contains("/renji_")) {
                                                    strM762u = xYQHiker.m754ad(str3, strM762u, "show");
                                                }
                                                if (!strM762u.contains("输入验证码")) {
                                                    C0235em c0235emM1487a = AbstractC0502oj.m1487a(strM762u);
                                                    String str40 = getTextByRule(c0235emM1487a, "head&&title&&Text").split("-")[0];
                                                    c0589rpM1166ah = c0235emM1487a.m1166ah("script");
                                                    i2 = 0;
                                                    while (true) {
                                                        if (i2 < c0589rpM1166ah.size()) {
                                                            strM1796p = null;
                                                            str13 = null;
                                                            string = null;
                                                            zHas = false;
                                                            zHas2 = false;
                                                            objValueOf = null;
                                                            string2 = null;
                                                            string3 = null;
                                                            obj12 = null;
                                                            num = null;
                                                            break;
                                                        }
                                                        strTrim = ((C0226ed) c0589rpM1166ah.get(i2)).m1163ae().trim();
                                                        c0589rp = c0589rpM1166ah;
                                                        if (strTrim.startsWith("var player_")) {
                                                            jSONObject2 = new JSONObject(strTrim.substring(strTrim.indexOf(123), strTrim.lastIndexOf(125) + 1));
                                                            strM1796p = jSONObject2.getString("url");
                                                            string4 = jSONObject2.getString("from");
                                                            string = jSONObject2.getString("link_next");
                                                            zHas = jSONObject2.has("key");
                                                            zHas2 = jSONObject2.has("tm");
                                                            if (jSONObject2.has("id")) {
                                                                objValueOf = Integer.valueOf(jSONObject2.getInt("id"));
                                                            } else {
                                                                objValueOf = null;
                                                            }
                                                            if (jSONObject2.has("vod_pic_thumb")) {
                                                                string2 = jSONObject2.getString("vod_pic_thumb");
                                                            } else {
                                                                string2 = null;
                                                            }
                                                            if (jSONObject2.has("vod_title")) {
                                                                string3 = null;
                                                                obj12 = null;
                                                                if (jSONObject2.has("nid")) {
                                                                    numValueOf = Integer.valueOf(jSONObject2.getInt("nid"));
                                                                } else {
                                                                    numValueOf = null;
                                                                }
                                                                if (jSONObject2.has("encrypt")) {
                                                                    i3 = jSONObject2.getInt("encrypt");
                                                                    if (i3 == 1) {
                                                                        strM1796p = URLDecoder.decode(strM1796p);
                                                                    } else if (i3 == 2) {
                                                                        strM1796p = URLDecoder.decode(new String(Base64.decode(strM1796p, 0)));
                                                                    }
                                                                }
                                                                str13 = string4;
                                                                num = numValueOf;
                                                                break;
                                                            }
                                                            string3 = null;
                                                            obj12 = null;
                                                            if (jSONObject2.has("nid")) {
                                                                numValueOf = Integer.valueOf(jSONObject2.getInt("nid"));
                                                            } else {
                                                                numValueOf = null;
                                                            }
                                                            if (jSONObject2.has("encrypt")) {
                                                                i3 = jSONObject2.getInt("encrypt");
                                                                if (i3 == 1) {
                                                                    strM1796p = URLDecoder.decode(strM1796p);
                                                                } else if (i3 == 2) {
                                                                    strM1796p = URLDecoder.decode(new String(Base64.decode(strM1796p, 0)));
                                                                }
                                                            }
                                                            str13 = string4;
                                                            num = numValueOf;
                                                            break;
                                                        }
                                                        i2++;
                                                        c0589rpM1166ah = c0589rp;
                                                    }
                                                    if (strM1796p.contains("vip.ffzy")) {
                                                        if (strM1796p.contains("/share/")) {
                                                            strM1796p = AbstractC0716wh.m1796p(strM1796p);
                                                        }
                                                    } else if (strM1796p.contains("/share/")) {
                                                        strM1796p = AbstractC0716wh.m1796p(strM1796p);
                                                    }
                                                    if (xYQHiker.f357l) {
                                                        StringBuilder sb = new StringBuilder();
                                                        str35 = "视频链接：";
                                                        sb.append("视频链接：");
                                                        sb.append(strM1796p);
                                                        Init.show(sb.toString());
                                                    }
                                                    if (!zHas2) {
                                                        str12 = string;
                                                        obj5 = objValueOf;
                                                        obj6 = string2;
                                                        obj7 = string3;
                                                        obj4 = num;
                                                        str11 = str35;
                                                        obj3 = obj12;
                                                        Contains = num;
                                                    }
                                                    if (AbstractC0405ku.m1361e(strM1796p)) {
                                                        jSONObject4.put("parse", 0);
                                                        jSONObject4.put("playUrl", str9);
                                                        jSONObject4.put("url", strM1796p);
                                                        jSONObject4.put(str35, jSONObject3.toString());
                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                    }
                                                    jSONObject4.put(str35, jSONObject3.toString());
                                                    jSONObject4.put("parse", 1);
                                                    jSONObject4.put("playUrl", str9);
                                                    jSONObject4.put("url", str3);
                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                }
                                                try {
                                                    if (checkveriry(strM762u)) {
                                                        str13 = null;
                                                        try {
                                                            strM762u = xYQHiker.m756af(null, str3, "show", vertype(strM762u));
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            str35 = str35;
                                                            exc6 = e;
                                                            strM1796p = str13;
                                                            string = strM1796p;
                                                            objValueOf = string;
                                                            string2 = objValueOf;
                                                            string3 = string2;
                                                            obj12 = string3;
                                                            obj13 = obj12;
                                                            SpiderDebug.log(exc6);
                                                            if (xYQHiker.f357l) {
                                                                Init.show("分析var plays部分出错：" + exc6.toString());
                                                            }
                                                            str12 = string;
                                                            obj5 = objValueOf;
                                                            obj6 = string2;
                                                            obj7 = string3;
                                                            obj3 = obj12;
                                                            obj4 = obj13;
                                                            str11 = str35;
                                                            Contains = obj13;
                                                            Object obj17 = obj4;
                                                            Object obj18 = obj5;
                                                            if (z) {
                                                                obj8 = obj6;
                                                                obj9 = obj7;
                                                                obj10 = obj2;
                                                                obj11 = obj3;
                                                                strM1787g = null;
                                                                z3 = false;
                                                                z4 = false;
                                                                zContains = false;
                                                                Contains = 0;
                                                                if (strM1796p != null) {
                                                                    if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                        str14 = str10;
                                                                        if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                        }
                                                                        jSONObject4.put("parse", 1);
                                                                        jSONObject4.put("jx", obj10);
                                                                        jSONObject4.put("url", strM1796p);
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    str14 = str10;
                                                                    if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                        str15 = r4;
                                                                        str3 = str9;
                                                                        str16 = str11;
                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", strM1796p);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        }
                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                        str17 = str3;
                                                                        while (i < charArray.length) {
                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                        }
                                                                        int iCeil5 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                        String str311 = AbstractC0716wh.m1798r(str17).substring(0, iCeil5 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil5 + 6);
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", str311);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                        exc2 = e;
                                                                        SpiderDebug.log(exc2);
                                                                        if (xYQHiker.f357l) {
                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                        }
                                                                    } else {
                                                                        str15 = r4;
                                                                        str3 = str9;
                                                                        str16 = str11;
                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", strM1796p);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        }
                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                        str17 = str3;
                                                                        while (i < charArray.length) {
                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                        }
                                                                        int iCeil6 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                        String str312 = AbstractC0716wh.m1798r(str17).substring(0, iCeil6 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil6 + 6);
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", str312);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                        exc2 = e;
                                                                        SpiderDebug.log(exc2);
                                                                        if (xYQHiker.f357l) {
                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                        }
                                                                    }
                                                                } else {
                                                                    str15 = "playUrl";
                                                                    str13 = str3;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                }
                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                jSONObject4.put("parse", 1);
                                                                jSONObject4.put(str15, str3);
                                                                jSONObject4.put("url", str13);
                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                            }
                                                            obj8 = obj6;
                                                            obj9 = obj7;
                                                            obj10 = obj2;
                                                            obj11 = obj3;
                                                            strM1787g = null;
                                                            z3 = false;
                                                            z4 = false;
                                                            zContains = false;
                                                            Contains = 0;
                                                            if (strM1796p != null) {
                                                                if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                    str14 = str10;
                                                                    if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                    }
                                                                    jSONObject4.put("parse", 1);
                                                                    jSONObject4.put("jx", obj10);
                                                                    jSONObject4.put("url", strM1796p);
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                }
                                                                str14 = str10;
                                                                if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                    str15 = r4;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", strM1796p);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                    str17 = str3;
                                                                    while (i < charArray.length) {
                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                    }
                                                                    int iCeil7 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                    String str313 = AbstractC0716wh.m1798r(str17).substring(0, iCeil7 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil7 + 6);
                                                                    jSONObject4.put("parse", 0);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", str313);
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                    exc2 = e;
                                                                    SpiderDebug.log(exc2);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                    }
                                                                } else {
                                                                    str15 = r4;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", strM1796p);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                    str17 = str3;
                                                                    while (i < charArray.length) {
                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                    }
                                                                    int iCeil8 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                    String str314 = AbstractC0716wh.m1798r(str17).substring(0, iCeil8 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil8 + 6);
                                                                    jSONObject4.put("parse", 0);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", str314);
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                    exc2 = e;
                                                                    SpiderDebug.log(exc2);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                    }
                                                                }
                                                            } else {
                                                                str15 = "playUrl";
                                                                str13 = str3;
                                                                str3 = str9;
                                                                str16 = str11;
                                                            }
                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                            jSONObject4.put("parse", 1);
                                                            jSONObject4.put(str15, str3);
                                                            jSONObject4.put("url", str13);
                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                            SpiderDebug.log(exc);
                                                            if (xYQHiker.f357l) {
                                                                Init.show("播放类全局区域出错：" + exc.toString());
                                                            }
                                                            return str3;
                                                        }
                                                    }
                                                    C0235em c0235emM1487a2 = AbstractC0502oj.m1487a(strM762u);
                                                    String str41 = getTextByRule(c0235emM1487a2, "head&&title&&Text").split("-")[0];
                                                    c0589rpM1166ah = c0235emM1487a2.m1166ah("script");
                                                    i2 = 0;
                                                    while (true) {
                                                        if (i2 < c0589rpM1166ah.size()) {
                                                            strM1796p = null;
                                                            str13 = null;
                                                            string = null;
                                                            zHas = false;
                                                            zHas2 = false;
                                                            objValueOf = null;
                                                            string2 = null;
                                                            string3 = null;
                                                            obj12 = null;
                                                            num = null;
                                                            break;
                                                        }
                                                        strTrim = ((C0226ed) c0589rpM1166ah.get(i2)).m1163ae().trim();
                                                        c0589rp = c0589rpM1166ah;
                                                        if (strTrim.startsWith("var player_")) {
                                                            jSONObject2 = new JSONObject(strTrim.substring(strTrim.indexOf(123), strTrim.lastIndexOf(125) + 1));
                                                            strM1796p = jSONObject2.getString("url");
                                                            string4 = jSONObject2.getString("from");
                                                            try {
                                                                string = jSONObject2.getString("link_next");
                                                                zHas = jSONObject2.has("key");
                                                                zHas2 = jSONObject2.has("tm");
                                                                if (jSONObject2.has("id")) {
                                                                    objValueOf = Integer.valueOf(jSONObject2.getInt("id"));
                                                                } else {
                                                                    objValueOf = null;
                                                                }
                                                                try {
                                                                    if (jSONObject2.has("vod_pic_thumb")) {
                                                                        string2 = jSONObject2.getString("vod_pic_thumb");
                                                                    } else {
                                                                        string2 = null;
                                                                    }
                                                                    try {
                                                                        if (jSONObject2.has("vod_title") && jSONObject2.has("vod_title_name")) {
                                                                            String string5 = jSONObject2.getString("vod_title");
                                                                            try {
                                                                                obj12 = string5;
                                                                                string3 = jSONObject2.getString("vod_title_name");
                                                                            } catch (Exception e6) {
                                                                                str35 = str35;
                                                                                exc6 = e6;
                                                                                str13 = string4;
                                                                                obj12 = string5;
                                                                                strM1796p = null;
                                                                                string = null;
                                                                                string3 = null;
                                                                                obj13 = null;
                                                                                SpiderDebug.log(exc6);
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("分析var plays部分出错：" + exc6.toString());
                                                                                }
                                                                                str12 = string;
                                                                                obj5 = objValueOf;
                                                                                obj6 = string2;
                                                                                obj7 = string3;
                                                                                obj3 = obj12;
                                                                                obj4 = obj13;
                                                                                str11 = str35;
                                                                                Contains = obj13;
                                                                                Object obj19 = obj4;
                                                                                Object obj110 = obj5;
                                                                                if (z) {
                                                                                    obj8 = obj6;
                                                                                    obj9 = obj7;
                                                                                    obj10 = obj2;
                                                                                    obj11 = obj3;
                                                                                    strM1787g = null;
                                                                                    z3 = false;
                                                                                    z4 = false;
                                                                                    zContains = false;
                                                                                    Contains = 0;
                                                                                    if (strM1796p != null) {
                                                                                        if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                            str14 = str10;
                                                                                            if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                            }
                                                                                            jSONObject4.put("parse", 1);
                                                                                            jSONObject4.put("jx", obj10);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        str14 = str10;
                                                                                        if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                            str15 = r4;
                                                                                            str3 = str9;
                                                                                            str16 = str11;
                                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                                jSONObject4.put("parse", 0);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", strM1796p);
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            }
                                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                            str17 = str3;
                                                                                            while (i < charArray.length) {
                                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                            }
                                                                                            int iCeil9 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                            String str315 = AbstractC0716wh.m1798r(str17).substring(0, iCeil9 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil9 + 6);
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", str315);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            exc2 = e;
                                                                                            SpiderDebug.log(exc2);
                                                                                            if (xYQHiker.f357l) {
                                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                            }
                                                                                        } else {
                                                                                            str15 = r4;
                                                                                            str3 = str9;
                                                                                            str16 = str11;
                                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                                jSONObject4.put("parse", 0);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", strM1796p);
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            }
                                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                            str17 = str3;
                                                                                            while (i < charArray.length) {
                                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                            }
                                                                                            int iCeil10 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                            String str316 = AbstractC0716wh.m1798r(str17).substring(0, iCeil10 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil10 + 6);
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", str316);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            exc2 = e;
                                                                                            SpiderDebug.log(exc2);
                                                                                            if (xYQHiker.f357l) {
                                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        str15 = "playUrl";
                                                                                        str13 = str3;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                    }
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    jSONObject4.put("parse", 1);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", str13);
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                                obj8 = obj6;
                                                                                obj9 = obj7;
                                                                                obj10 = obj2;
                                                                                obj11 = obj3;
                                                                                strM1787g = null;
                                                                                z3 = false;
                                                                                z4 = false;
                                                                                zContains = false;
                                                                                Contains = 0;
                                                                                if (strM1796p != null) {
                                                                                    if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                        str14 = str10;
                                                                                        if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                        }
                                                                                        jSONObject4.put("parse", 1);
                                                                                        jSONObject4.put("jx", obj10);
                                                                                        jSONObject4.put("url", strM1796p);
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    }
                                                                                    str14 = str10;
                                                                                    if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                        str15 = r4;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                        str17 = str3;
                                                                                        while (i < charArray.length) {
                                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                        }
                                                                                        int iCeil11 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                        String str317 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11 + 6);
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", str317);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        exc2 = e;
                                                                                        SpiderDebug.log(exc2);
                                                                                        if (xYQHiker.f357l) {
                                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                        }
                                                                                    } else {
                                                                                        str15 = r4;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                        str17 = str3;
                                                                                        while (i < charArray.length) {
                                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                        }
                                                                                        int iCeil12 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                        String str318 = AbstractC0716wh.m1798r(str17).substring(0, iCeil12 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil12 + 6);
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", str318);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        exc2 = e;
                                                                                        SpiderDebug.log(exc2);
                                                                                        if (xYQHiker.f357l) {
                                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str15 = "playUrl";
                                                                                    str13 = str3;
                                                                                    str3 = str9;
                                                                                    str16 = str11;
                                                                                }
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                jSONObject4.put("parse", 1);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", str13);
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                SpiderDebug.log(exc);
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("播放类全局区域出错：" + exc.toString());
                                                                                }
                                                                                return str3;
                                                                            }
                                                                        } else {
                                                                            string3 = null;
                                                                            obj12 = null;
                                                                        }
                                                                        try {
                                                                            if (jSONObject2.has("nid")) {
                                                                                numValueOf = Integer.valueOf(jSONObject2.getInt("nid"));
                                                                            } else {
                                                                                numValueOf = null;
                                                                            }
                                                                            try {
                                                                                if (jSONObject2.has("encrypt")) {
                                                                                    i3 = jSONObject2.getInt("encrypt");
                                                                                    if (i3 == 1) {
                                                                                        strM1796p = URLDecoder.decode(strM1796p);
                                                                                    } else if (i3 == 2) {
                                                                                        strM1796p = URLDecoder.decode(new String(Base64.decode(strM1796p, 0)));
                                                                                    }
                                                                                }
                                                                                str13 = string4;
                                                                                num = numValueOf;
                                                                                break;
                                                                            } catch (Exception e7) {
                                                                                str35 = str35;
                                                                                exc6 = e7;
                                                                                str13 = string4;
                                                                                strM1796p = null;
                                                                                string = null;
                                                                                obj13 = numValueOf;
                                                                                SpiderDebug.log(exc6);
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("分析var plays部分出错：" + exc6.toString());
                                                                                }
                                                                                str12 = string;
                                                                                obj5 = objValueOf;
                                                                                obj6 = string2;
                                                                                obj7 = string3;
                                                                                obj3 = obj12;
                                                                                obj4 = obj13;
                                                                                str11 = str35;
                                                                                Contains = obj13;
                                                                                Object obj111 = obj4;
                                                                                Object obj112 = obj5;
                                                                                if (z) {
                                                                                    obj8 = obj6;
                                                                                    obj9 = obj7;
                                                                                    obj10 = obj2;
                                                                                    obj11 = obj3;
                                                                                    strM1787g = null;
                                                                                    z3 = false;
                                                                                    z4 = false;
                                                                                    zContains = false;
                                                                                    Contains = 0;
                                                                                    if (strM1796p != null) {
                                                                                        if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                            str14 = str10;
                                                                                            if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                            }
                                                                                            jSONObject4.put("parse", 1);
                                                                                            jSONObject4.put("jx", obj10);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        str14 = str10;
                                                                                        if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                            str15 = r4;
                                                                                            str3 = str9;
                                                                                            str16 = str11;
                                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                                jSONObject4.put("parse", 0);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", strM1796p);
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            }
                                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                            str17 = str3;
                                                                                            while (i < charArray.length) {
                                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                            }
                                                                                            int iCeil13 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                            String str319 = AbstractC0716wh.m1798r(str17).substring(0, iCeil13 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil13 + 6);
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", str319);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            exc2 = e;
                                                                                            SpiderDebug.log(exc2);
                                                                                            if (xYQHiker.f357l) {
                                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                            }
                                                                                        } else {
                                                                                            str15 = r4;
                                                                                            str3 = str9;
                                                                                            str16 = str11;
                                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                                jSONObject4.put("parse", 0);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", strM1796p);
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            }
                                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                            str17 = str3;
                                                                                            while (i < charArray.length) {
                                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                            }
                                                                                            int iCeil14 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                            String str3110 = AbstractC0716wh.m1798r(str17).substring(0, iCeil14 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil14 + 6);
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", str3110);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            exc2 = e;
                                                                                            SpiderDebug.log(exc2);
                                                                                            if (xYQHiker.f357l) {
                                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        str15 = "playUrl";
                                                                                        str13 = str3;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                    }
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    jSONObject4.put("parse", 1);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", str13);
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                                obj8 = obj6;
                                                                                obj9 = obj7;
                                                                                obj10 = obj2;
                                                                                obj11 = obj3;
                                                                                strM1787g = null;
                                                                                z3 = false;
                                                                                z4 = false;
                                                                                zContains = false;
                                                                                Contains = 0;
                                                                                if (strM1796p != null) {
                                                                                    if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                        str14 = str10;
                                                                                        if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                        }
                                                                                        jSONObject4.put("parse", 1);
                                                                                        jSONObject4.put("jx", obj10);
                                                                                        jSONObject4.put("url", strM1796p);
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    }
                                                                                    str14 = str10;
                                                                                    if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                        str15 = r4;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                        str17 = str3;
                                                                                        while (i < charArray.length) {
                                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                        }
                                                                                        int iCeil15 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                        String str3111 = AbstractC0716wh.m1798r(str17).substring(0, iCeil15 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil15 + 6);
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", str3111);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        exc2 = e;
                                                                                        SpiderDebug.log(exc2);
                                                                                        if (xYQHiker.f357l) {
                                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                        }
                                                                                    } else {
                                                                                        str15 = r4;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                        str17 = str3;
                                                                                        while (i < charArray.length) {
                                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                        }
                                                                                        int iCeil16 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                        String str3112 = AbstractC0716wh.m1798r(str17).substring(0, iCeil16 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil16 + 6);
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", str3112);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        exc2 = e;
                                                                                        SpiderDebug.log(exc2);
                                                                                        if (xYQHiker.f357l) {
                                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str15 = "playUrl";
                                                                                    str13 = str3;
                                                                                    str3 = str9;
                                                                                    str16 = str11;
                                                                                }
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                jSONObject4.put("parse", 1);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", str13);
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                SpiderDebug.log(exc);
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("播放类全局区域出错：" + exc.toString());
                                                                                }
                                                                                return str3;
                                                                            }
                                                                        } catch (Exception e8) {
                                                                            str35 = str35;
                                                                            exc6 = e8;
                                                                            str13 = string4;
                                                                            strM1796p = null;
                                                                            string = null;
                                                                            obj13 = null;
                                                                            SpiderDebug.log(exc6);
                                                                            if (xYQHiker.f357l) {
                                                                                Init.show("分析var plays部分出错：" + exc6.toString());
                                                                            }
                                                                            str12 = string;
                                                                            obj5 = objValueOf;
                                                                            obj6 = string2;
                                                                            obj7 = string3;
                                                                            obj3 = obj12;
                                                                            obj4 = obj13;
                                                                            str11 = str35;
                                                                            Contains = obj13;
                                                                            Object obj113 = obj4;
                                                                            Object obj114 = obj5;
                                                                            if (z) {
                                                                                obj8 = obj6;
                                                                                obj9 = obj7;
                                                                                obj10 = obj2;
                                                                                obj11 = obj3;
                                                                                strM1787g = null;
                                                                                z3 = false;
                                                                                z4 = false;
                                                                                zContains = false;
                                                                                Contains = 0;
                                                                                if (strM1796p != null) {
                                                                                    if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                        str14 = str10;
                                                                                        if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                        }
                                                                                        jSONObject4.put("parse", 1);
                                                                                        jSONObject4.put("jx", obj10);
                                                                                        jSONObject4.put("url", strM1796p);
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    }
                                                                                    str14 = str10;
                                                                                    if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                        str15 = r4;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                        str17 = str3;
                                                                                        while (i < charArray.length) {
                                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                        }
                                                                                        int iCeil17 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                        String str3113 = AbstractC0716wh.m1798r(str17).substring(0, iCeil17 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil17 + 6);
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", str3113);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        exc2 = e;
                                                                                        SpiderDebug.log(exc2);
                                                                                        if (xYQHiker.f357l) {
                                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                        }
                                                                                    } else {
                                                                                        str15 = r4;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                        str17 = str3;
                                                                                        while (i < charArray.length) {
                                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                        }
                                                                                        int iCeil18 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                        String str3114 = AbstractC0716wh.m1798r(str17).substring(0, iCeil18 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil18 + 6);
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", str3114);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        exc2 = e;
                                                                                        SpiderDebug.log(exc2);
                                                                                        if (xYQHiker.f357l) {
                                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str15 = "playUrl";
                                                                                    str13 = str3;
                                                                                    str3 = str9;
                                                                                    str16 = str11;
                                                                                }
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                jSONObject4.put("parse", 1);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", str13);
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            obj8 = obj6;
                                                                            obj9 = obj7;
                                                                            obj10 = obj2;
                                                                            obj11 = obj3;
                                                                            strM1787g = null;
                                                                            z3 = false;
                                                                            z4 = false;
                                                                            zContains = false;
                                                                            Contains = 0;
                                                                            if (strM1796p != null) {
                                                                                if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                    str14 = str10;
                                                                                    if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                    }
                                                                                    jSONObject4.put("parse", 1);
                                                                                    jSONObject4.put("jx", obj10);
                                                                                    jSONObject4.put("url", strM1796p);
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                                str14 = str10;
                                                                                if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                    str15 = r4;
                                                                                    str3 = str9;
                                                                                    str16 = str11;
                                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", strM1796p);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    }
                                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                    str17 = str3;
                                                                                    while (i < charArray.length) {
                                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                    }
                                                                                    int iCeil19 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                    String str3115 = AbstractC0716wh.m1798r(str17).substring(0, iCeil19 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil19 + 6);
                                                                                    jSONObject4.put("parse", 0);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", str3115);
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    exc2 = e;
                                                                                    SpiderDebug.log(exc2);
                                                                                    if (xYQHiker.f357l) {
                                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                    }
                                                                                } else {
                                                                                    str15 = r4;
                                                                                    str3 = str9;
                                                                                    str16 = str11;
                                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", strM1796p);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    }
                                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                    str17 = str3;
                                                                                    while (i < charArray.length) {
                                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                    }
                                                                                    int iCeil110 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                    String str3116 = AbstractC0716wh.m1798r(str17).substring(0, iCeil110 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil110 + 6);
                                                                                    jSONObject4.put("parse", 0);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", str3116);
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    exc2 = e;
                                                                                    SpiderDebug.log(exc2);
                                                                                    if (xYQHiker.f357l) {
                                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                str15 = "playUrl";
                                                                                str13 = str3;
                                                                                str3 = str9;
                                                                                str16 = str11;
                                                                            }
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            jSONObject4.put("parse", 1);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", str13);
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                            SpiderDebug.log(exc);
                                                                            if (xYQHiker.f357l) {
                                                                                Init.show("播放类全局区域出错：" + exc.toString());
                                                                            }
                                                                            return str3;
                                                                        }
                                                                    } catch (Exception e9) {
                                                                        str35 = str35;
                                                                        exc6 = e9;
                                                                        str13 = string4;
                                                                        strM1796p = null;
                                                                        string = null;
                                                                        string3 = null;
                                                                        obj12 = null;
                                                                        obj13 = null;
                                                                        SpiderDebug.log(exc6);
                                                                        if (xYQHiker.f357l) {
                                                                            Init.show("分析var plays部分出错：" + exc6.toString());
                                                                        }
                                                                        str12 = string;
                                                                        obj5 = objValueOf;
                                                                        obj6 = string2;
                                                                        obj7 = string3;
                                                                        obj3 = obj12;
                                                                        obj4 = obj13;
                                                                        str11 = str35;
                                                                        Contains = obj13;
                                                                        Object obj115 = obj4;
                                                                        Object obj116 = obj5;
                                                                        if (z) {
                                                                            obj8 = obj6;
                                                                            obj9 = obj7;
                                                                            obj10 = obj2;
                                                                            obj11 = obj3;
                                                                            strM1787g = null;
                                                                            z3 = false;
                                                                            z4 = false;
                                                                            zContains = false;
                                                                            Contains = 0;
                                                                            if (strM1796p != null) {
                                                                                if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                    str14 = str10;
                                                                                    if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                    }
                                                                                    jSONObject4.put("parse", 1);
                                                                                    jSONObject4.put("jx", obj10);
                                                                                    jSONObject4.put("url", strM1796p);
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                                str14 = str10;
                                                                                if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                    str15 = r4;
                                                                                    str3 = str9;
                                                                                    str16 = str11;
                                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", strM1796p);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    }
                                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                    str17 = str3;
                                                                                    while (i < charArray.length) {
                                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                    }
                                                                                    int iCeil111 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                    String str3117 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111 + 6);
                                                                                    jSONObject4.put("parse", 0);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", str3117);
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    exc2 = e;
                                                                                    SpiderDebug.log(exc2);
                                                                                    if (xYQHiker.f357l) {
                                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                    }
                                                                                } else {
                                                                                    str15 = r4;
                                                                                    str3 = str9;
                                                                                    str16 = str11;
                                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", strM1796p);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    }
                                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                    str17 = str3;
                                                                                    while (i < charArray.length) {
                                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                    }
                                                                                    int iCeil112 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                    String str3118 = AbstractC0716wh.m1798r(str17).substring(0, iCeil112 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil112 + 6);
                                                                                    jSONObject4.put("parse", 0);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", str3118);
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    exc2 = e;
                                                                                    SpiderDebug.log(exc2);
                                                                                    if (xYQHiker.f357l) {
                                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                str15 = "playUrl";
                                                                                str13 = str3;
                                                                                str3 = str9;
                                                                                str16 = str11;
                                                                            }
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            jSONObject4.put("parse", 1);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", str13);
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        }
                                                                        obj8 = obj6;
                                                                        obj9 = obj7;
                                                                        obj10 = obj2;
                                                                        obj11 = obj3;
                                                                        strM1787g = null;
                                                                        z3 = false;
                                                                        z4 = false;
                                                                        zContains = false;
                                                                        Contains = 0;
                                                                        if (strM1796p != null) {
                                                                            if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                str14 = str10;
                                                                                if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                }
                                                                                jSONObject4.put("parse", 1);
                                                                                jSONObject4.put("jx", obj10);
                                                                                jSONObject4.put("url", strM1796p);
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            str14 = str10;
                                                                            if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                str15 = r4;
                                                                                str3 = str9;
                                                                                str16 = str11;
                                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                                    jSONObject4.put("parse", 0);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", strM1796p);
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                str17 = str3;
                                                                                while (i < charArray.length) {
                                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                }
                                                                                int iCeil113 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                String str3119 = AbstractC0716wh.m1798r(str17).substring(0, iCeil113 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil113 + 6);
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", str3119);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                exc2 = e;
                                                                                SpiderDebug.log(exc2);
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                }
                                                                            } else {
                                                                                str15 = r4;
                                                                                str3 = str9;
                                                                                str16 = str11;
                                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                                    jSONObject4.put("parse", 0);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", strM1796p);
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                str17 = str3;
                                                                                while (i < charArray.length) {
                                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                }
                                                                                int iCeil114 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                String str31110 = AbstractC0716wh.m1798r(str17).substring(0, iCeil114 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil114 + 6);
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", str31110);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                exc2 = e;
                                                                                SpiderDebug.log(exc2);
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str15 = "playUrl";
                                                                            str13 = str3;
                                                                            str3 = str9;
                                                                            str16 = str11;
                                                                        }
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        jSONObject4.put("parse", 1);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", str13);
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                        SpiderDebug.log(exc);
                                                                        if (xYQHiker.f357l) {
                                                                            Init.show("播放类全局区域出错：" + exc.toString());
                                                                        }
                                                                        return str3;
                                                                    }
                                                                } catch (Exception e10) {
                                                                    str35 = str35;
                                                                    exc6 = e10;
                                                                    str13 = string4;
                                                                    strM1796p = null;
                                                                    string = null;
                                                                    string2 = null;
                                                                    string3 = null;
                                                                    obj12 = null;
                                                                    obj13 = null;
                                                                    SpiderDebug.log(exc6);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("分析var plays部分出错：" + exc6.toString());
                                                                    }
                                                                    str12 = string;
                                                                    obj5 = objValueOf;
                                                                    obj6 = string2;
                                                                    obj7 = string3;
                                                                    obj3 = obj12;
                                                                    obj4 = obj13;
                                                                    str11 = str35;
                                                                    Contains = obj13;
                                                                    Object obj117 = obj4;
                                                                    Object obj118 = obj5;
                                                                    if (z) {
                                                                        obj8 = obj6;
                                                                        obj9 = obj7;
                                                                        obj10 = obj2;
                                                                        obj11 = obj3;
                                                                        strM1787g = null;
                                                                        z3 = false;
                                                                        z4 = false;
                                                                        zContains = false;
                                                                        Contains = 0;
                                                                        if (strM1796p != null) {
                                                                            if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                str14 = str10;
                                                                                if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                }
                                                                                jSONObject4.put("parse", 1);
                                                                                jSONObject4.put("jx", obj10);
                                                                                jSONObject4.put("url", strM1796p);
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            str14 = str10;
                                                                            if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                str15 = r4;
                                                                                str3 = str9;
                                                                                str16 = str11;
                                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                                    jSONObject4.put("parse", 0);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", strM1796p);
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                str17 = str3;
                                                                                while (i < charArray.length) {
                                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                }
                                                                                int iCeil115 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                String str31111 = AbstractC0716wh.m1798r(str17).substring(0, iCeil115 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil115 + 6);
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", str31111);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                exc2 = e;
                                                                                SpiderDebug.log(exc2);
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                }
                                                                            } else {
                                                                                str15 = r4;
                                                                                str3 = str9;
                                                                                str16 = str11;
                                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                                    jSONObject4.put("parse", 0);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", strM1796p);
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                str17 = str3;
                                                                                while (i < charArray.length) {
                                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                }
                                                                                int iCeil116 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                String str31112 = AbstractC0716wh.m1798r(str17).substring(0, iCeil116 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil116 + 6);
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", str31112);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                exc2 = e;
                                                                                SpiderDebug.log(exc2);
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str15 = "playUrl";
                                                                            str13 = str3;
                                                                            str3 = str9;
                                                                            str16 = str11;
                                                                        }
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        jSONObject4.put("parse", 1);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", str13);
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    obj8 = obj6;
                                                                    obj9 = obj7;
                                                                    obj10 = obj2;
                                                                    obj11 = obj3;
                                                                    strM1787g = null;
                                                                    z3 = false;
                                                                    z4 = false;
                                                                    zContains = false;
                                                                    Contains = 0;
                                                                    if (strM1796p != null) {
                                                                        if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                            str14 = str10;
                                                                            if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                            }
                                                                            jSONObject4.put("parse", 1);
                                                                            jSONObject4.put("jx", obj10);
                                                                            jSONObject4.put("url", strM1796p);
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        }
                                                                        str14 = str10;
                                                                        if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                            str15 = r4;
                                                                            str3 = str9;
                                                                            str16 = str11;
                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", strM1796p);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                            str17 = str3;
                                                                            while (i < charArray.length) {
                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                            }
                                                                            int iCeil117 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                            String str31113 = AbstractC0716wh.m1798r(str17).substring(0, iCeil117 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil117 + 6);
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", str31113);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                            exc2 = e;
                                                                            SpiderDebug.log(exc2);
                                                                            if (xYQHiker.f357l) {
                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                            }
                                                                        } else {
                                                                            str15 = r4;
                                                                            str3 = str9;
                                                                            str16 = str11;
                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", strM1796p);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                            str17 = str3;
                                                                            while (i < charArray.length) {
                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                            }
                                                                            int iCeil118 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                            String str31114 = AbstractC0716wh.m1798r(str17).substring(0, iCeil118 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil118 + 6);
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", str31114);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                            exc2 = e;
                                                                            SpiderDebug.log(exc2);
                                                                            if (xYQHiker.f357l) {
                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str15 = "playUrl";
                                                                        str13 = str3;
                                                                        str3 = str9;
                                                                        str16 = str11;
                                                                    }
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    jSONObject4.put("parse", 1);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", str13);
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                    SpiderDebug.log(exc);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("播放类全局区域出错：" + exc.toString());
                                                                    }
                                                                    return str3;
                                                                }
                                                            } catch (Exception e11) {
                                                                str35 = str35;
                                                                exc6 = e11;
                                                                str13 = string4;
                                                                strM1796p = null;
                                                                string = null;
                                                                objValueOf = null;
                                                                string2 = null;
                                                                string3 = null;
                                                                obj12 = null;
                                                                obj13 = null;
                                                                SpiderDebug.log(exc6);
                                                                if (xYQHiker.f357l) {
                                                                    Init.show("分析var plays部分出错：" + exc6.toString());
                                                                }
                                                                str12 = string;
                                                                obj5 = objValueOf;
                                                                obj6 = string2;
                                                                obj7 = string3;
                                                                obj3 = obj12;
                                                                obj4 = obj13;
                                                                str11 = str35;
                                                                Contains = obj13;
                                                                Object obj119 = obj4;
                                                                Object obj1110 = obj5;
                                                                if (z) {
                                                                    obj8 = obj6;
                                                                    obj9 = obj7;
                                                                    obj10 = obj2;
                                                                    obj11 = obj3;
                                                                    strM1787g = null;
                                                                    z3 = false;
                                                                    z4 = false;
                                                                    zContains = false;
                                                                    Contains = 0;
                                                                    if (strM1796p != null) {
                                                                        if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                            str14 = str10;
                                                                            if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                            }
                                                                            jSONObject4.put("parse", 1);
                                                                            jSONObject4.put("jx", obj10);
                                                                            jSONObject4.put("url", strM1796p);
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        }
                                                                        str14 = str10;
                                                                        if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                            str15 = r4;
                                                                            str3 = str9;
                                                                            str16 = str11;
                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", strM1796p);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                            str17 = str3;
                                                                            while (i < charArray.length) {
                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                            }
                                                                            int iCeil119 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                            String str31115 = AbstractC0716wh.m1798r(str17).substring(0, iCeil119 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil119 + 6);
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", str31115);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                            exc2 = e;
                                                                            SpiderDebug.log(exc2);
                                                                            if (xYQHiker.f357l) {
                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                            }
                                                                        } else {
                                                                            str15 = r4;
                                                                            str3 = str9;
                                                                            str16 = str11;
                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", strM1796p);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                            str17 = str3;
                                                                            while (i < charArray.length) {
                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                            }
                                                                            int iCeil1110 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                            String str31116 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1110 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1110 + 6);
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", str31116);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                            exc2 = e;
                                                                            SpiderDebug.log(exc2);
                                                                            if (xYQHiker.f357l) {
                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str15 = "playUrl";
                                                                        str13 = str3;
                                                                        str3 = str9;
                                                                        str16 = str11;
                                                                    }
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    jSONObject4.put("parse", 1);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", str13);
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                }
                                                                obj8 = obj6;
                                                                obj9 = obj7;
                                                                obj10 = obj2;
                                                                obj11 = obj3;
                                                                strM1787g = null;
                                                                z3 = false;
                                                                z4 = false;
                                                                zContains = false;
                                                                Contains = 0;
                                                                if (strM1796p != null) {
                                                                    if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                        str14 = str10;
                                                                        if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                        }
                                                                        jSONObject4.put("parse", 1);
                                                                        jSONObject4.put("jx", obj10);
                                                                        jSONObject4.put("url", strM1796p);
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    str14 = str10;
                                                                    if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                        str15 = r4;
                                                                        str3 = str9;
                                                                        str16 = str11;
                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", strM1796p);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        }
                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                        str17 = str3;
                                                                        while (i < charArray.length) {
                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                        }
                                                                        int iCeil1111 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                        String str31117 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1111 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1111 + 6);
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", str31117);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                        exc2 = e;
                                                                        SpiderDebug.log(exc2);
                                                                        if (xYQHiker.f357l) {
                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                        }
                                                                    } else {
                                                                        str15 = r4;
                                                                        str3 = str9;
                                                                        str16 = str11;
                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", strM1796p);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        }
                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                        str17 = str3;
                                                                        while (i < charArray.length) {
                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                        }
                                                                        int iCeil1112 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                        String str31118 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1112 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1112 + 6);
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", str31118);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                        exc2 = e;
                                                                        SpiderDebug.log(exc2);
                                                                        if (xYQHiker.f357l) {
                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                        }
                                                                    }
                                                                } else {
                                                                    str15 = "playUrl";
                                                                    str13 = str3;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                }
                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                jSONObject4.put("parse", 1);
                                                                jSONObject4.put(str15, str3);
                                                                jSONObject4.put("url", str13);
                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                SpiderDebug.log(exc);
                                                                if (xYQHiker.f357l) {
                                                                    Init.show("播放类全局区域出错：" + exc.toString());
                                                                }
                                                                return str3;
                                                            }
                                                        }
                                                        i2++;
                                                        c0589rpM1166ah = c0589rp;
                                                    }
                                                    try {
                                                        if (strM1796p.contains("vip.ffzy") || strM1796p.contains("vip.lz") || strM1796p.contains("hd.lz") || strM1796p.contains("suonizy")) {
                                                            if (strM1796p.contains("/share/")) {
                                                                strM1796p = AbstractC0716wh.m1796p(strM1796p);
                                                            }
                                                        }
                                                        if (xYQHiker.f357l) {
                                                            StringBuilder sb2 = new StringBuilder();
                                                            str35 = "视频链接：";
                                                            sb2.append("视频链接：");
                                                            sb2.append(strM1796p);
                                                            Init.show(sb2.toString());
                                                        }
                                                        if (!zHas2 && !zHas) {
                                                            str12 = string;
                                                            obj5 = objValueOf;
                                                            obj6 = string2;
                                                            obj7 = string3;
                                                            obj4 = num;
                                                            str11 = str35;
                                                            obj3 = obj12;
                                                            Contains = num;
                                                        }
                                                        try {
                                                            if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                jSONObject4.put("parse", 0);
                                                                jSONObject4.put("playUrl", str9);
                                                                jSONObject4.put("url", strM1796p);
                                                                jSONObject4.put(str35, jSONObject3.toString());
                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                            }
                                                            jSONObject4.put(str35, jSONObject3.toString());
                                                            jSONObject4.put("parse", 1);
                                                            jSONObject4.put("playUrl", str9);
                                                            jSONObject4.put("url", str3);
                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            exc6 = e;
                                                            obj13 = num;
                                                            SpiderDebug.log(exc6);
                                                            if (xYQHiker.f357l) {
                                                                Init.show("分析var plays部分出错：" + exc6.toString());
                                                            }
                                                            str12 = string;
                                                            obj5 = objValueOf;
                                                            obj6 = string2;
                                                            obj7 = string3;
                                                            obj3 = obj12;
                                                            obj4 = obj13;
                                                            str11 = str35;
                                                            Contains = obj13;
                                                            Object obj1111 = obj4;
                                                            Object obj1112 = obj5;
                                                            if (z) {
                                                                obj8 = obj6;
                                                                obj9 = obj7;
                                                                obj10 = obj2;
                                                                obj11 = obj3;
                                                                strM1787g = null;
                                                                z3 = false;
                                                                z4 = false;
                                                                zContains = false;
                                                                Contains = 0;
                                                                if (strM1796p != null) {
                                                                    if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                        str14 = str10;
                                                                        if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                        }
                                                                        jSONObject4.put("parse", 1);
                                                                        jSONObject4.put("jx", obj10);
                                                                        jSONObject4.put("url", strM1796p);
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    str14 = str10;
                                                                    if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                        str15 = r4;
                                                                        str3 = str9;
                                                                        str16 = str11;
                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", strM1796p);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        }
                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                        str17 = str3;
                                                                        while (i < charArray.length) {
                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                        }
                                                                        int iCeil1113 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                        String str31119 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1113 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1113 + 6);
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", str31119);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                        exc2 = e;
                                                                        SpiderDebug.log(exc2);
                                                                        if (xYQHiker.f357l) {
                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                        }
                                                                    } else {
                                                                        str15 = r4;
                                                                        str3 = str9;
                                                                        str16 = str11;
                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", strM1796p);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        }
                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                        str17 = str3;
                                                                        while (i < charArray.length) {
                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                        }
                                                                        int iCeil1114 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                        String str311110 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1114 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1114 + 6);
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", str311110);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                        exc2 = e;
                                                                        SpiderDebug.log(exc2);
                                                                        if (xYQHiker.f357l) {
                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                        }
                                                                    }
                                                                } else {
                                                                    str15 = "playUrl";
                                                                    str13 = str3;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                }
                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                jSONObject4.put("parse", 1);
                                                                jSONObject4.put(str15, str3);
                                                                jSONObject4.put("url", str13);
                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                            }
                                                            obj8 = obj6;
                                                            obj9 = obj7;
                                                            obj10 = obj2;
                                                            obj11 = obj3;
                                                            strM1787g = null;
                                                            z3 = false;
                                                            z4 = false;
                                                            zContains = false;
                                                            Contains = 0;
                                                            if (strM1796p != null) {
                                                                if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                    str14 = str10;
                                                                    if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                    }
                                                                    jSONObject4.put("parse", 1);
                                                                    jSONObject4.put("jx", obj10);
                                                                    jSONObject4.put("url", strM1796p);
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                }
                                                                str14 = str10;
                                                                if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                    str15 = r4;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", strM1796p);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                    str17 = str3;
                                                                    while (i < charArray.length) {
                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                    }
                                                                    int iCeil1115 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                    String str311111 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1115 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1115 + 6);
                                                                    jSONObject4.put("parse", 0);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", str311111);
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                    exc2 = e;
                                                                    SpiderDebug.log(exc2);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                    }
                                                                } else {
                                                                    str15 = r4;
                                                                    str3 = str9;
                                                                    str16 = str11;
                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                        jSONObject4.put("parse", 0);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", strM1796p);
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    }
                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                    str17 = str3;
                                                                    while (i < charArray.length) {
                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                    }
                                                                    int iCeil1116 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                    String str311112 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1116 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1116 + 6);
                                                                    jSONObject4.put("parse", 0);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", str311112);
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                    exc2 = e;
                                                                    SpiderDebug.log(exc2);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                    }
                                                                }
                                                            } else {
                                                                str15 = "playUrl";
                                                                str13 = str3;
                                                                str3 = str9;
                                                                str16 = str11;
                                                            }
                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                            jSONObject4.put("parse", 1);
                                                            jSONObject4.put(str15, str3);
                                                            jSONObject4.put("url", str13);
                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                            SpiderDebug.log(exc);
                                                            if (xYQHiker.f357l) {
                                                                Init.show("播放类全局区域出错：" + exc.toString());
                                                            }
                                                            return str3;
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        str35 = str35;
                                                    }
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    str13 = null;
                                                }
                                            } catch (Exception e15) {
                                                e = e15;
                                                z2 = z7;
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            z2 = z7;
                                            str10 = str36;
                                        }
                                        SpiderDebug.log(exc);
                                        if (xYQHiker.f357l) {
                                            Init.show("播放类全局区域出错：" + exc.toString());
                                        }
                                        return str3;
                                    }
                                    obj14 = obj14;
                                    z2 = z7;
                                    str10 = str36;
                                    str11 = str35;
                                    obj3 = null;
                                    strM1796p = null;
                                    str12 = null;
                                    str13 = null;
                                    obj4 = null;
                                    obj5 = null;
                                    obj6 = null;
                                    obj7 = null;
                                    Contains = str8;
                                    Object obj1113 = obj4;
                                    Object obj1114 = obj5;
                                    try {
                                        if (z && !z2) {
                                            try {
                                                obj8 = obj6;
                                                try {
                                                    String string6 = new SimpleDateFormat("yyyyMMdd").format(new Date()).toString();
                                                    StringBuilder sb3 = new StringBuilder();
                                                    obj9 = obj7;
                                                    try {
                                                        sb3.append("/static/js/playerconfig.js?t=");
                                                        sb3.append(string6);
                                                        try {
                                                            Matcher matcher = Pattern.compile(xYQHiker.f353h).matcher(xYQHiker.m762u(AbstractC0716wh.m1787g(str3, sb3.toString()), xYQHiker.f349d, xYQHiker.m766y(str3)));
                                                            if (matcher.find()) {
                                                                try {
                                                                    jSONObject = new JSONObject(matcher.group(1));
                                                                } catch (Exception e17) {
                                                                    exc4 = e17;
                                                                    obj10 = obj2;
                                                                    str18 = null;
                                                                    z3 = false;
                                                                    z4 = false;
                                                                    zContains = false;
                                                                    Contains = 0;
                                                                    obj11 = obj3;
                                                                    try {
                                                                        SpiderDebug.log(exc4);
                                                                        if (xYQHiker.f357l) {
                                                                            Init.show("分析playerconfig区域出错：" + exc4.toString());
                                                                        }
                                                                        strM1787g = str18;
                                                                        if (strM1796p != null) {
                                                                            if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                str14 = str10;
                                                                                if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                }
                                                                                jSONObject4.put("parse", 1);
                                                                                jSONObject4.put("jx", obj10);
                                                                                jSONObject4.put("url", strM1796p);
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            str14 = str10;
                                                                            if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                str15 = r4;
                                                                                str3 = str9;
                                                                                str16 = str11;
                                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                                    jSONObject4.put("parse", 0);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", strM1796p);
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                str17 = str3;
                                                                                while (i < charArray.length) {
                                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                }
                                                                                int iCeil1117 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                String str311113 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1117 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1117 + 6);
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", str311113);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                exc2 = e;
                                                                                SpiderDebug.log(exc2);
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                }
                                                                            } else {
                                                                                str15 = r4;
                                                                                str3 = str9;
                                                                                str16 = str11;
                                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                                    jSONObject4.put("parse", 0);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", strM1796p);
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                str17 = str3;
                                                                                while (i < charArray.length) {
                                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                }
                                                                                int iCeil1118 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                String str311114 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1118 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1118 + 6);
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", str311114);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                exc2 = e;
                                                                                SpiderDebug.log(exc2);
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str15 = "playUrl";
                                                                            str13 = str3;
                                                                            str3 = str9;
                                                                            str16 = str11;
                                                                        }
                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                        jSONObject4.put("parse", 1);
                                                                        jSONObject4.put(str15, str3);
                                                                        jSONObject4.put("url", str13);
                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                    } catch (Exception e18) {
                                                                        exc = e18;
                                                                        str3 = str9;
                                                                    }
                                                                }
                                                            } else {
                                                                jSONObject = null;
                                                            }
                                                            if (jSONObject != null && jSONObject.has(str13)) {
                                                                JSONObject jSONObject5 = jSONObject.getJSONObject(str13);
                                                                obj10 = obj2;
                                                                try {
                                                                    if (jSONObject5.getString("ps").equals(obj10)) {
                                                                        strM1787g = jSONObject5.getString("parse").isEmpty() ? str9 : jSONObject5.getString("parse");
                                                                        try {
                                                                            if (strM1787g.isEmpty()) {
                                                                                obj11 = obj3;
                                                                                z3 = false;
                                                                                z4 = false;
                                                                                zContains = false;
                                                                                Contains = 0;
                                                                            } else {
                                                                                str18 = strM1787g;
                                                                                try {
                                                                                    obj11 = obj3;
                                                                                    try {
                                                                                        Contains = xYQHiker.m762u(AbstractC0716wh.m1787g(str3, "/static/player/parse.js"), xYQHiker.f349d, xYQHiker.m766y(str3)).contains("&next=");
                                                                                        strM1787g = str18;
                                                                                        z3 = false;
                                                                                        z4 = false;
                                                                                        zContains = false;
                                                                                    } catch (Exception e19) {
                                                                                        e = e19;
                                                                                        exc4 = e;
                                                                                        z3 = false;
                                                                                        z4 = false;
                                                                                        zContains = false;
                                                                                        Contains = 0;
                                                                                        SpiderDebug.log(exc4);
                                                                                        if (xYQHiker.f357l) {
                                                                                            Init.show("分析playerconfig区域出错：" + exc4.toString());
                                                                                        }
                                                                                        strM1787g = str18;
                                                                                        if (strM1796p != null) {
                                                                                            if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                                str14 = str10;
                                                                                                if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                                }
                                                                                                jSONObject4.put("parse", 1);
                                                                                                jSONObject4.put("jx", obj10);
                                                                                                jSONObject4.put("url", strM1796p);
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            }
                                                                                            str14 = str10;
                                                                                            if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                                str15 = r4;
                                                                                                str3 = str9;
                                                                                                str16 = str11;
                                                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                                                    jSONObject4.put("parse", 0);
                                                                                                    jSONObject4.put(str15, str3);
                                                                                                    jSONObject4.put("url", strM1796p);
                                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                }
                                                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                                str17 = str3;
                                                                                                while (i < charArray.length) {
                                                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                                }
                                                                                                int iCeil1119 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                                String str311115 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1119 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1119 + 6);
                                                                                                jSONObject4.put("parse", 0);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", str311115);
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                exc2 = e;
                                                                                                SpiderDebug.log(exc2);
                                                                                                if (xYQHiker.f357l) {
                                                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                                }
                                                                                            } else {
                                                                                                str15 = r4;
                                                                                                str3 = str9;
                                                                                                str16 = str11;
                                                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                                                    jSONObject4.put("parse", 0);
                                                                                                    jSONObject4.put(str15, str3);
                                                                                                    jSONObject4.put("url", strM1796p);
                                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                }
                                                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                                str17 = str3;
                                                                                                while (i < charArray.length) {
                                                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                                }
                                                                                                int iCeil11110 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                                String str311116 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11110 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11110 + 6);
                                                                                                jSONObject4.put("parse", 0);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", str311116);
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                exc2 = e;
                                                                                                SpiderDebug.log(exc2);
                                                                                                if (xYQHiker.f357l) {
                                                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            str15 = "playUrl";
                                                                                            str13 = str3;
                                                                                            str3 = str9;
                                                                                            str16 = str11;
                                                                                        }
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        jSONObject4.put("parse", 1);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", str13);
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    }
                                                                                } catch (Exception e20) {
                                                                                    e = e20;
                                                                                    obj11 = obj3;
                                                                                    exc4 = e;
                                                                                    z3 = false;
                                                                                    z4 = false;
                                                                                    zContains = false;
                                                                                    Contains = 0;
                                                                                    SpiderDebug.log(exc4);
                                                                                    if (xYQHiker.f357l) {
                                                                                        Init.show("分析playerconfig区域出错：" + exc4.toString());
                                                                                    }
                                                                                    strM1787g = str18;
                                                                                    if (strM1796p != null) {
                                                                                        if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                            str14 = str10;
                                                                                            if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                            }
                                                                                            jSONObject4.put("parse", 1);
                                                                                            jSONObject4.put("jx", obj10);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        str14 = str10;
                                                                                        if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                            str15 = r4;
                                                                                            str3 = str9;
                                                                                            str16 = str11;
                                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                                jSONObject4.put("parse", 0);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", strM1796p);
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            }
                                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                            str17 = str3;
                                                                                            while (i < charArray.length) {
                                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                            }
                                                                                            int iCeil11111 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                            String str311117 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11111 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11111 + 6);
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", str311117);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            exc2 = e;
                                                                                            SpiderDebug.log(exc2);
                                                                                            if (xYQHiker.f357l) {
                                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                            }
                                                                                        } else {
                                                                                            str15 = r4;
                                                                                            str3 = str9;
                                                                                            str16 = str11;
                                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                                jSONObject4.put("parse", 0);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", strM1796p);
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            }
                                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                            str17 = str3;
                                                                                            while (i < charArray.length) {
                                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                            }
                                                                                            int iCeil11112 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                            String str311118 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11112 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11112 + 6);
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", str311118);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            exc2 = e;
                                                                                            SpiderDebug.log(exc2);
                                                                                            if (xYQHiker.f357l) {
                                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        str15 = "playUrl";
                                                                                        str13 = str3;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                    }
                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                    jSONObject4.put("parse", 1);
                                                                                    jSONObject4.put(str15, str3);
                                                                                    jSONObject4.put("url", str13);
                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                }
                                                                            }
                                                                        } catch (Exception e21) {
                                                                            e = e21;
                                                                            str18 = strM1787g;
                                                                        }
                                                                    } else {
                                                                        obj11 = obj3;
                                                                        try {
                                                                            String strM762u2 = xYQHiker.m762u(AbstractC0716wh.m1787g(str3, "/static/player/" + str13 + ".js"), xYQHiker.f349d, xYQHiker.m766y(str3));
                                                                            boolean zContains2 = strM762u2.contains("&jump=");
                                                                            try {
                                                                                boolean zContains3 = strM762u2.contains("&next=");
                                                                                z3 = zContains2;
                                                                                try {
                                                                                    if (strM762u2.contains("&title=")) {
                                                                                        try {
                                                                                            if (strM762u2.contains("humb=")) {
                                                                                                z4 = true;
                                                                                            } else {
                                                                                                z4 = false;
                                                                                            }
                                                                                        } catch (Exception e22) {
                                                                                            exc5 = e22;
                                                                                            z4 = false;
                                                                                            z5 = zContains3;
                                                                                            zContains = false;
                                                                                            r31 = z5;
                                                                                            try {
                                                                                                SpiderDebug.log(exc5);
                                                                                                Contains = r31;
                                                                                                if (xYQHiker.f357l) {
                                                                                                    Init.show("分析player/fromflag.js文件出错：" + exc5.toString());
                                                                                                    Contains = r31;
                                                                                                }
                                                                                                Contains = z6;
                                                                                                strM1787g = null;
                                                                                                if (strM1787g != null) {
                                                                                                    try {
                                                                                                        if (!strM1787g.isEmpty()) {
                                                                                                            strM1787g = AbstractC0716wh.m1787g(str3, strM1787g);
                                                                                                        }
                                                                                                    } catch (Exception e23) {
                                                                                                        str18 = strM1787g;
                                                                                                        exc4 = e23;
                                                                                                        Contains = Contains;
                                                                                                        SpiderDebug.log(exc4);
                                                                                                        if (xYQHiker.f357l) {
                                                                                                            Init.show("分析playerconfig区域出错：" + exc4.toString());
                                                                                                        }
                                                                                                        strM1787g = str18;
                                                                                                    }
                                                                                                }
                                                                                            } catch (Exception e24) {
                                                                                                exc4 = e24;
                                                                                                str18 = null;
                                                                                                Contains = r31;
                                                                                                SpiderDebug.log(exc4);
                                                                                                if (xYQHiker.f357l) {
                                                                                                    Init.show("分析playerconfig区域出错：" + exc4.toString());
                                                                                                }
                                                                                                strM1787g = str18;
                                                                                                if (strM1796p != null) {
                                                                                                    if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                                        str14 = str10;
                                                                                                        if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                                        }
                                                                                                        jSONObject4.put("parse", 1);
                                                                                                        jSONObject4.put("jx", obj10);
                                                                                                        jSONObject4.put("url", strM1796p);
                                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                    }
                                                                                                    str14 = str10;
                                                                                                    if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                                        str15 = r4;
                                                                                                        str3 = str9;
                                                                                                        str16 = str11;
                                                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                                                            jSONObject4.put("parse", 0);
                                                                                                            jSONObject4.put(str15, str3);
                                                                                                            jSONObject4.put("url", strM1796p);
                                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                        }
                                                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                                        str17 = str3;
                                                                                                        while (i < charArray.length) {
                                                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                                        }
                                                                                                        int iCeil11113 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                                        String str311119 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11113 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11113 + 6);
                                                                                                        jSONObject4.put("parse", 0);
                                                                                                        jSONObject4.put(str15, str3);
                                                                                                        jSONObject4.put("url", str311119);
                                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                        exc2 = e;
                                                                                                        SpiderDebug.log(exc2);
                                                                                                        if (xYQHiker.f357l) {
                                                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                                        }
                                                                                                    } else {
                                                                                                        str15 = r4;
                                                                                                        str3 = str9;
                                                                                                        str16 = str11;
                                                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                                                            jSONObject4.put("parse", 0);
                                                                                                            jSONObject4.put(str15, str3);
                                                                                                            jSONObject4.put("url", strM1796p);
                                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                        }
                                                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                                        str17 = str3;
                                                                                                        while (i < charArray.length) {
                                                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                                        }
                                                                                                        int iCeil11114 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                                        String str3111110 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11114 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11114 + 6);
                                                                                                        jSONObject4.put("parse", 0);
                                                                                                        jSONObject4.put(str15, str3);
                                                                                                        jSONObject4.put("url", str3111110);
                                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                        exc2 = e;
                                                                                                        SpiderDebug.log(exc2);
                                                                                                        if (xYQHiker.f357l) {
                                                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    str15 = "playUrl";
                                                                                                    str13 = str3;
                                                                                                    str3 = str9;
                                                                                                    str16 = str11;
                                                                                                }
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                jSONObject4.put("parse", 1);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", str13);
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            }
                                                                                            if (strM1796p != null) {
                                                                                                if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                                    str14 = str10;
                                                                                                    if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                                    }
                                                                                                    jSONObject4.put("parse", 1);
                                                                                                    jSONObject4.put("jx", obj10);
                                                                                                    jSONObject4.put("url", strM1796p);
                                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                }
                                                                                                str14 = str10;
                                                                                                if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                                    str15 = r4;
                                                                                                    str3 = str9;
                                                                                                    str16 = str11;
                                                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                                                        jSONObject4.put("parse", 0);
                                                                                                        jSONObject4.put(str15, str3);
                                                                                                        jSONObject4.put("url", strM1796p);
                                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                    }
                                                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                                    str17 = str3;
                                                                                                    while (i < charArray.length) {
                                                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                                    }
                                                                                                    int iCeil11115 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                                    String str3111111 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11115 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11115 + 6);
                                                                                                    jSONObject4.put("parse", 0);
                                                                                                    jSONObject4.put(str15, str3);
                                                                                                    jSONObject4.put("url", str3111111);
                                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                    exc2 = e;
                                                                                                    SpiderDebug.log(exc2);
                                                                                                    if (xYQHiker.f357l) {
                                                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                                    }
                                                                                                } else {
                                                                                                    str15 = r4;
                                                                                                    str3 = str9;
                                                                                                    str16 = str11;
                                                                                                    if (!strM1796p.contains("/zxzj_")) {
                                                                                                        jSONObject4.put("parse", 0);
                                                                                                        jSONObject4.put(str15, str3);
                                                                                                        jSONObject4.put("url", strM1796p);
                                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                    }
                                                                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                                    str17 = str3;
                                                                                                    while (i < charArray.length) {
                                                                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                                    }
                                                                                                    int iCeil11116 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                                    String str3111112 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11116 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11116 + 6);
                                                                                                    jSONObject4.put("parse", 0);
                                                                                                    jSONObject4.put(str15, str3);
                                                                                                    jSONObject4.put("url", str3111112);
                                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                    exc2 = e;
                                                                                                    SpiderDebug.log(exc2);
                                                                                                    if (xYQHiker.f357l) {
                                                                                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                str15 = "playUrl";
                                                                                                str13 = str3;
                                                                                                str3 = str9;
                                                                                                str16 = str11;
                                                                                            }
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            jSONObject4.put("parse", 1);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", str13);
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                    } else {
                                                                                        z4 = false;
                                                                                    }
                                                                                    try {
                                                                                        strM762u2.contains("document.title.split");
                                                                                        zContains = strM762u2.contains("&nid=");
                                                                                        try {
                                                                                            try {
                                                                                                if (strM762u2.contains("src=\"http")) {
                                                                                                    Contains = zContains3 ? 1 : 0;
                                                                                                    strM1787g = ((String) AbstractC0716wh.m1797q(strM762u2, "src=\"", "\"").get(0)).split("'")[0];
                                                                                                } else {
                                                                                                    z6 = zContains3 ? 1 : 0;
                                                                                                    if (strM762u2.contains("src=\"'+")) {
                                                                                                        Contains = z6;
                                                                                                        strM1787g = (String) AbstractC0716wh.m1797q(strM762u2, "+'", "'+").get(0);
                                                                                                        Contains = z6;
                                                                                                    } else {
                                                                                                        Contains = z6;
                                                                                                        strM1787g = null;
                                                                                                    }
                                                                                                }
                                                                                            } catch (Exception e25) {
                                                                                                e = e25;
                                                                                                exc5 = e;
                                                                                                r31 = Contains;
                                                                                                SpiderDebug.log(exc5);
                                                                                                Contains = r31;
                                                                                                if (xYQHiker.f357l) {
                                                                                                    Init.show("分析player/fromflag.js文件出错：" + exc5.toString());
                                                                                                    Contains = r31;
                                                                                                }
                                                                                            }
                                                                                        } catch (Exception e26) {
                                                                                            e = e26;
                                                                                            Contains = zContains3 ? 1 : 0;
                                                                                        }
                                                                                    } catch (Exception e27) {
                                                                                        z5 = zContains3 ? 1 : 0;
                                                                                        exc5 = e27;
                                                                                        zContains = false;
                                                                                        r31 = z5;
                                                                                        SpiderDebug.log(exc5);
                                                                                        Contains = r31;
                                                                                        if (xYQHiker.f357l) {
                                                                                            Init.show("分析player/fromflag.js文件出错：" + exc5.toString());
                                                                                            Contains = r31;
                                                                                        }
                                                                                        Contains = z6;
                                                                                        strM1787g = null;
                                                                                        if (strM1787g != null) {
                                                                                            if (!strM1787g.isEmpty()) {
                                                                                                strM1787g = AbstractC0716wh.m1787g(str3, strM1787g);
                                                                                            }
                                                                                        }
                                                                                        if (strM1796p != null) {
                                                                                            if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                                str14 = str10;
                                                                                                if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                                }
                                                                                                jSONObject4.put("parse", 1);
                                                                                                jSONObject4.put("jx", obj10);
                                                                                                jSONObject4.put("url", strM1796p);
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                            }
                                                                                            str14 = str10;
                                                                                            if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                                str15 = r4;
                                                                                                str3 = str9;
                                                                                                str16 = str11;
                                                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                                                    jSONObject4.put("parse", 0);
                                                                                                    jSONObject4.put(str15, str3);
                                                                                                    jSONObject4.put("url", strM1796p);
                                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                }
                                                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                                str17 = str3;
                                                                                                while (i < charArray.length) {
                                                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                                }
                                                                                                int iCeil11117 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                                String str3111113 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11117 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11117 + 6);
                                                                                                jSONObject4.put("parse", 0);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", str3111113);
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                exc2 = e;
                                                                                                SpiderDebug.log(exc2);
                                                                                                if (xYQHiker.f357l) {
                                                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                                }
                                                                                            } else {
                                                                                                str15 = r4;
                                                                                                str3 = str9;
                                                                                                str16 = str11;
                                                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                                                    jSONObject4.put("parse", 0);
                                                                                                    jSONObject4.put(str15, str3);
                                                                                                    jSONObject4.put("url", strM1796p);
                                                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                }
                                                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                                str17 = str3;
                                                                                                while (i < charArray.length) {
                                                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                                }
                                                                                                int iCeil11118 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                                String str3111114 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11118 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11118 + 6);
                                                                                                jSONObject4.put("parse", 0);
                                                                                                jSONObject4.put(str15, str3);
                                                                                                jSONObject4.put("url", str3111114);
                                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                                                exc2 = e;
                                                                                                SpiderDebug.log(exc2);
                                                                                                if (xYQHiker.f357l) {
                                                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            str15 = "playUrl";
                                                                                            str13 = str3;
                                                                                            str3 = str9;
                                                                                            str16 = str11;
                                                                                        }
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        jSONObject4.put("parse", 1);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", str13);
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    }
                                                                                } catch (Exception e28) {
                                                                                    exc5 = e28;
                                                                                }
                                                                            } catch (Exception e29) {
                                                                                z3 = zContains2;
                                                                                exc5 = e29;
                                                                                z4 = false;
                                                                                zContains = false;
                                                                                r31 = 0;
                                                                                SpiderDebug.log(exc5);
                                                                                Contains = r31;
                                                                                if (xYQHiker.f357l) {
                                                                                    Init.show("分析player/fromflag.js文件出错：" + exc5.toString());
                                                                                    Contains = r31;
                                                                                }
                                                                                Contains = z6;
                                                                                strM1787g = null;
                                                                                if (strM1787g != null) {
                                                                                    if (!strM1787g.isEmpty()) {
                                                                                        strM1787g = AbstractC0716wh.m1787g(str3, strM1787g);
                                                                                    }
                                                                                }
                                                                                if (strM1796p != null) {
                                                                                    if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                                        str14 = str10;
                                                                                        if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                                        }
                                                                                        jSONObject4.put("parse", 1);
                                                                                        jSONObject4.put("jx", obj10);
                                                                                        jSONObject4.put("url", strM1796p);
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                    }
                                                                                    str14 = str10;
                                                                                    if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                                        str15 = r4;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                        str17 = str3;
                                                                                        while (i < charArray.length) {
                                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                        }
                                                                                        int iCeil11119 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                        String str3111115 = AbstractC0716wh.m1798r(str17).substring(0, iCeil11119 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil11119 + 6);
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", str3111115);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        exc2 = e;
                                                                                        SpiderDebug.log(exc2);
                                                                                        if (xYQHiker.f357l) {
                                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                        }
                                                                                    } else {
                                                                                        str15 = r4;
                                                                                        str3 = str9;
                                                                                        str16 = str11;
                                                                                        if (!strM1796p.contains("/zxzj_")) {
                                                                                            jSONObject4.put("parse", 0);
                                                                                            jSONObject4.put(str15, str3);
                                                                                            jSONObject4.put("url", strM1796p);
                                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        }
                                                                                        charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                                        str17 = str3;
                                                                                        while (i < charArray.length) {
                                                                                            str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                                        }
                                                                                        int iCeil111110 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                                        String str3111116 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111110 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111110 + 6);
                                                                                        jSONObject4.put("parse", 0);
                                                                                        jSONObject4.put(str15, str3);
                                                                                        jSONObject4.put("url", str3111116);
                                                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                                                        exc2 = e;
                                                                                        SpiderDebug.log(exc2);
                                                                                        if (xYQHiker.f357l) {
                                                                                            Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str15 = "playUrl";
                                                                                    str13 = str3;
                                                                                    str3 = str9;
                                                                                    str16 = str11;
                                                                                }
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                jSONObject4.put("parse", 1);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", str13);
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                        } catch (Exception e30) {
                                                                            exc5 = e30;
                                                                            z3 = false;
                                                                        }
                                                                    }
                                                                    if (strM1787g != null) {
                                                                        if (!strM1787g.isEmpty()) {
                                                                            strM1787g = AbstractC0716wh.m1787g(str3, strM1787g);
                                                                        }
                                                                    }
                                                                } catch (Exception e31) {
                                                                    e = e31;
                                                                    obj11 = obj3;
                                                                    exc4 = e;
                                                                    str18 = null;
                                                                    z3 = false;
                                                                    z4 = false;
                                                                    zContains = false;
                                                                    Contains = 0;
                                                                    SpiderDebug.log(exc4);
                                                                    if (xYQHiker.f357l) {
                                                                        Init.show("分析playerconfig区域出错：" + exc4.toString());
                                                                    }
                                                                    strM1787g = str18;
                                                                    if (strM1796p != null) {
                                                                        if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                            str14 = str10;
                                                                            if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                            }
                                                                            jSONObject4.put("parse", 1);
                                                                            jSONObject4.put("jx", obj10);
                                                                            jSONObject4.put("url", strM1796p);
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                        }
                                                                        str14 = str10;
                                                                        if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                            str15 = r4;
                                                                            str3 = str9;
                                                                            str16 = str11;
                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", strM1796p);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                            str17 = str3;
                                                                            while (i < charArray.length) {
                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                            }
                                                                            int iCeil111111 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                            String str3111117 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111111 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111111 + 6);
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", str3111117);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                            exc2 = e;
                                                                            SpiderDebug.log(exc2);
                                                                            if (xYQHiker.f357l) {
                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                            }
                                                                        } else {
                                                                            str15 = r4;
                                                                            str3 = str9;
                                                                            str16 = str11;
                                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                                jSONObject4.put("parse", 0);
                                                                                jSONObject4.put(str15, str3);
                                                                                jSONObject4.put("url", strM1796p);
                                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                            }
                                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                            str17 = str3;
                                                                            while (i < charArray.length) {
                                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                            }
                                                                            int iCeil111112 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                            String str3111118 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111112 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111112 + 6);
                                                                            jSONObject4.put("parse", 0);
                                                                            jSONObject4.put(str15, str3);
                                                                            jSONObject4.put("url", str3111118);
                                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                                            exc2 = e;
                                                                            SpiderDebug.log(exc2);
                                                                            if (xYQHiker.f357l) {
                                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str15 = "playUrl";
                                                                        str13 = str3;
                                                                        str3 = str9;
                                                                        str16 = str11;
                                                                    }
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    jSONObject4.put("parse", 1);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", str13);
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                }
                                                            }
                                                        } catch (Exception e32) {
                                                            e = e32;
                                                            obj10 = obj2;
                                                        }
                                                    } catch (Exception e33) {
                                                        e = e33;
                                                        obj10 = obj2;
                                                        obj11 = obj3;
                                                        exc4 = e;
                                                        str18 = null;
                                                        z3 = false;
                                                        z4 = false;
                                                        zContains = false;
                                                        Contains = 0;
                                                        SpiderDebug.log(exc4);
                                                        if (xYQHiker.f357l) {
                                                            Init.show("分析playerconfig区域出错：" + exc4.toString());
                                                        }
                                                        strM1787g = str18;
                                                        if (strM1796p != null) {
                                                            if (AbstractC0405ku.m1362f(strM1796p)) {
                                                                str14 = str10;
                                                                if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                                }
                                                                jSONObject4.put("parse", 1);
                                                                jSONObject4.put("jx", obj10);
                                                                jSONObject4.put("url", strM1796p);
                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                            }
                                                            str14 = str10;
                                                            if (AbstractC0405ku.m1361e(strM1796p)) {
                                                                str15 = r4;
                                                                str3 = str9;
                                                                str16 = str11;
                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                    jSONObject4.put("parse", 0);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", strM1796p);
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                }
                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                str17 = str3;
                                                                while (i < charArray.length) {
                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                }
                                                                int iCeil111113 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                String str3111119 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111113 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111113 + 6);
                                                                jSONObject4.put("parse", 0);
                                                                jSONObject4.put(str15, str3);
                                                                jSONObject4.put("url", str3111119);
                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                exc2 = e;
                                                                SpiderDebug.log(exc2);
                                                                if (xYQHiker.f357l) {
                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                }
                                                            } else {
                                                                str15 = r4;
                                                                str3 = str9;
                                                                str16 = str11;
                                                                if (!strM1796p.contains("/zxzj_")) {
                                                                    jSONObject4.put("parse", 0);
                                                                    jSONObject4.put(str15, str3);
                                                                    jSONObject4.put("url", strM1796p);
                                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                                }
                                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                                str17 = str3;
                                                                while (i < charArray.length) {
                                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                                }
                                                                int iCeil111114 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                                String str31111110 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111114 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111114 + 6);
                                                                jSONObject4.put("parse", 0);
                                                                jSONObject4.put(str15, str3);
                                                                jSONObject4.put("url", str31111110);
                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                                exc2 = e;
                                                                SpiderDebug.log(exc2);
                                                                if (xYQHiker.f357l) {
                                                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                                }
                                                            }
                                                        } else {
                                                            str15 = "playUrl";
                                                            str13 = str3;
                                                            str3 = str9;
                                                            str16 = str11;
                                                        }
                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                        jSONObject4.put("parse", 1);
                                                        jSONObject4.put(str15, str3);
                                                        jSONObject4.put("url", str13);
                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                    }
                                                } catch (Exception e34) {
                                                    e = e34;
                                                    obj9 = obj7;
                                                    obj10 = obj2;
                                                    obj11 = obj3;
                                                    exc4 = e;
                                                    str18 = null;
                                                    z3 = false;
                                                    z4 = false;
                                                    zContains = false;
                                                    Contains = 0;
                                                    SpiderDebug.log(exc4);
                                                    if (xYQHiker.f357l) {
                                                        Init.show("分析playerconfig区域出错：" + exc4.toString());
                                                    }
                                                    strM1787g = str18;
                                                    if (strM1796p != null) {
                                                        if (AbstractC0405ku.m1362f(strM1796p)) {
                                                            str14 = str10;
                                                            if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                            }
                                                            jSONObject4.put("parse", 1);
                                                            jSONObject4.put("jx", obj10);
                                                            jSONObject4.put("url", strM1796p);
                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                        }
                                                        str14 = str10;
                                                        if (AbstractC0405ku.m1361e(strM1796p)) {
                                                            str15 = r4;
                                                            str3 = str9;
                                                            str16 = str11;
                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                jSONObject4.put("parse", 0);
                                                                jSONObject4.put(str15, str3);
                                                                jSONObject4.put("url", strM1796p);
                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                            }
                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                            str17 = str3;
                                                            while (i < charArray.length) {
                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                            }
                                                            int iCeil111115 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                            String str31111111 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111115 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111115 + 6);
                                                            jSONObject4.put("parse", 0);
                                                            jSONObject4.put(str15, str3);
                                                            jSONObject4.put("url", str31111111);
                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                            exc2 = e;
                                                            SpiderDebug.log(exc2);
                                                            if (xYQHiker.f357l) {
                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                            }
                                                        } else {
                                                            str15 = r4;
                                                            str3 = str9;
                                                            str16 = str11;
                                                            if (!strM1796p.contains("/zxzj_")) {
                                                                jSONObject4.put("parse", 0);
                                                                jSONObject4.put(str15, str3);
                                                                jSONObject4.put("url", strM1796p);
                                                                jSONObject4.put(str16, jSONObject3.toString());
                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                            }
                                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                            str17 = str3;
                                                            while (i < charArray.length) {
                                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                            }
                                                            int iCeil111116 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                            String str31111112 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111116 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111116 + 6);
                                                            jSONObject4.put("parse", 0);
                                                            jSONObject4.put(str15, str3);
                                                            jSONObject4.put("url", str31111112);
                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                            exc2 = e;
                                                            SpiderDebug.log(exc2);
                                                            if (xYQHiker.f357l) {
                                                                Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                                            }
                                                        }
                                                    } else {
                                                        str15 = "playUrl";
                                                        str13 = str3;
                                                        str3 = str9;
                                                        str16 = str11;
                                                    }
                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                    jSONObject4.put("parse", 1);
                                                    jSONObject4.put(str15, str3);
                                                    jSONObject4.put("url", str13);
                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                }
                                            } catch (Exception e35) {
                                                e = e35;
                                                obj8 = obj6;
                                            }
                                            if (strM1796p != null) {
                                                if (AbstractC0405ku.m1362f(strM1796p)) {
                                                    str14 = str10;
                                                    if (!xYQHiker.m751aa(str14).equals(obj10) || xYQHiker.m751aa(str14).equals("是")) {
                                                        jSONObject4.put("parse", 1);
                                                        jSONObject4.put("jx", obj10);
                                                        jSONObject4.put("url", strM1796p);
                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                    }
                                                } else {
                                                    str14 = str10;
                                                }
                                                if (AbstractC0405ku.m1361e(strM1796p) || strM1796p.contains("/zxzj_")) {
                                                    str15 = r4;
                                                    str3 = str9;
                                                    str16 = str11;
                                                    if (!strM1796p.contains("/zxzj_")) {
                                                        jSONObject4.put("parse", 0);
                                                        jSONObject4.put(str15, str3);
                                                        jSONObject4.put("url", strM1796p);
                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                    }
                                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                    str17 = str3;
                                                    while (i < charArray.length) {
                                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                    }
                                                    int iCeil111117 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                    String str31111113 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111117 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111117 + 6);
                                                    jSONObject4.put("parse", 0);
                                                    jSONObject4.put(str15, str3);
                                                    jSONObject4.put("url", str31111113);
                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                }
                                                if (strM1787g == null || !xYQHiker.m751aa(str14).equals(obj14)) {
                                                    str15 = r4;
                                                    str3 = str9;
                                                    str16 = str11;
                                                } else {
                                                    if (str12 != null) {
                                                        if (z4) {
                                                            strM1796p = strM1796p + "&jump=" + str12 + "&title=" + obj11 + Marker.ANY_NON_NULL_MARKER + obj9 + "&thumb=" + obj8 + "&id=" + obj1114 + "&nid=" + obj1113;
                                                        } else if (z3) {
                                                            strM1796p = strM1796p + "&jump=" + str12;
                                                        } else if (zContains) {
                                                            strM1796p = strM1796p + "&next=" + str12 + "&id=" + obj1114 + "&nid=" + obj1113 + "&from=" + str13;
                                                        } else if (!strM1796p.contains("&next=")) {
                                                            strM1796p = strM1796p + "&next=" + str12;
                                                        }
                                                        str16 = str11;
                                                        jSONObject4.put(str16, jSONObject3.toString());
                                                        jSONObject4.put("parse", 1);
                                                        str15 = r4;
                                                        str3 = str9;
                                                        jSONObject4.put(str15, str3);
                                                        jSONObject4.put("url", strM1787g + strM1796p);
                                                        return C2137a.addDanmaku(jSONObject4.toString());
                                                    }
                                                    try {
                                                        if (str12.isEmpty()) {
                                                            str16 = str11;
                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                            jSONObject4.put("parse", 1);
                                                            str15 = r4;
                                                            str3 = str9;
                                                            jSONObject4.put(str15, str3);
                                                            jSONObject4.put("url", strM1787g + strM1796p);
                                                            return C2137a.addDanmaku(jSONObject4.toString());
                                                        }
                                                        if (z4) {
                                                            strM1796p = strM1796p + "&jump=" + str12 + "&title=" + obj11 + Marker.ANY_NON_NULL_MARKER + obj9 + "&thumb=" + obj8 + "&id=" + obj1114 + "&nid=" + obj1113;
                                                        } else if (z3) {
                                                            strM1796p = strM1796p + "&jump=" + str12;
                                                        } else if (zContains) {
                                                            strM1796p = strM1796p + "&next=" + str12 + "&id=" + obj1114 + "&nid=" + obj1113 + "&from=" + str13;
                                                        } else {
                                                            try {
                                                                if (!strM1796p.contains("&next=") && Contains != 0) {
                                                                    strM1796p = strM1796p + "&next=" + str12;
                                                                }
                                                            } catch (Exception e36) {
                                                                e = e36;
                                                                str15 = r4;
                                                                str3 = str9;
                                                                str16 = str11;
                                                            }
                                                        }
                                                        str16 = str11;
                                                        try {
                                                            jSONObject4.put(str16, jSONObject3.toString());
                                                            jSONObject4.put("parse", 1);
                                                            str15 = r4;
                                                            str3 = str9;
                                                            try {
                                                                jSONObject4.put(str15, str3);
                                                                jSONObject4.put("url", strM1787g + strM1796p);
                                                                return C2137a.addDanmaku(jSONObject4.toString());
                                                            } catch (Exception e37) {
                                                                e = e37;
                                                            }
                                                        } catch (Exception e38) {
                                                            e = e38;
                                                            str15 = r4;
                                                            str3 = str9;
                                                        }
                                                    } catch (Exception e39) {
                                                        str15 = r4;
                                                        exc3 = e39;
                                                        str3 = str9;
                                                        str16 = str11;
                                                    }
                                                    exc3 = e;
                                                    SpiderDebug.log(exc3);
                                                    if (xYQHiker.f357l) {
                                                        Init.show("Mac分析2播放区域出错：" + exc3.toString());
                                                    }
                                                }
                                                str13 = str2;
                                            } else {
                                                str15 = "playUrl";
                                                str13 = str3;
                                                str3 = str9;
                                                str16 = str11;
                                            }
                                            jSONObject4.put(str16, jSONObject3.toString());
                                            jSONObject4.put("parse", 1);
                                            jSONObject4.put(str15, str3);
                                            jSONObject4.put("url", str13);
                                            return C2137a.addDanmaku(jSONObject4.toString());
                                        }
                                        obj8 = obj6;
                                        obj9 = obj7;
                                        if (strM1796p != null) {
                                            if (AbstractC0405ku.m1362f(strM1796p)) {
                                                str14 = str10;
                                                if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                                }
                                                jSONObject4.put("parse", 1);
                                                jSONObject4.put("jx", obj10);
                                                jSONObject4.put("url", strM1796p);
                                                return C2137a.addDanmaku(jSONObject4.toString());
                                            }
                                            str14 = str10;
                                            if (AbstractC0405ku.m1361e(strM1796p)) {
                                                str15 = r4;
                                                str3 = str9;
                                                str16 = str11;
                                                if (!strM1796p.contains("/zxzj_")) {
                                                    jSONObject4.put("parse", 0);
                                                    jSONObject4.put(str15, str3);
                                                    jSONObject4.put("url", strM1796p);
                                                    jSONObject4.put(str16, jSONObject3.toString());
                                                    return C2137a.addDanmaku(jSONObject4.toString());
                                                }
                                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                                str17 = str3;
                                                while (i < charArray.length) {
                                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                                }
                                                int iCeil111118 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                                String str31111114 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111118 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111118 + 6);
                                                jSONObject4.put("parse", 0);
                                                jSONObject4.put(str15, str3);
                                                jSONObject4.put("url", str31111114);
                                                jSONObject4.put(str16, jSONObject3.toString());
                                                return C2137a.addDanmaku(jSONObject4.toString());
                                            }
                                            str15 = r4;
                                            str3 = str9;
                                            str16 = str11;
                                            if (!strM1796p.contains("/zxzj_")) {
                                                jSONObject4.put("parse", 0);
                                                jSONObject4.put(str15, str3);
                                                jSONObject4.put("url", strM1796p);
                                                jSONObject4.put(str16, jSONObject3.toString());
                                                return C2137a.addDanmaku(jSONObject4.toString());
                                            }
                                            charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                            str17 = str3;
                                            while (i < charArray.length) {
                                                str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                            }
                                            int iCeil111119 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                            String str31111115 = AbstractC0716wh.m1798r(str17).substring(0, iCeil111119 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil111119 + 6);
                                            jSONObject4.put("parse", 0);
                                            jSONObject4.put(str15, str3);
                                            jSONObject4.put("url", str31111115);
                                            jSONObject4.put(str16, jSONObject3.toString());
                                            return C2137a.addDanmaku(jSONObject4.toString());
                                        }
                                        str15 = "playUrl";
                                        str13 = str3;
                                        str3 = str9;
                                        str16 = str11;
                                        jSONObject4.put(str16, jSONObject3.toString());
                                        jSONObject4.put("parse", 1);
                                        jSONObject4.put(str15, str3);
                                        jSONObject4.put("url", str13);
                                        return C2137a.addDanmaku(jSONObject4.toString());
                                    } catch (Exception e40) {
                                        e = e40;
                                    }
                                    obj10 = obj2;
                                    obj11 = obj3;
                                    strM1787g = null;
                                    z3 = false;
                                    z4 = false;
                                    zContains = false;
                                    Contains = 0;
                                }
                            } catch (Exception e41) {
                                e = e41;
                                exc = e;
                                str3 = str9;
                            }
                        }
                        obj14 = obj14;
                        z = true;
                        if (!z) {
                            obj14 = obj14;
                            z2 = z7;
                            str10 = str36;
                            str11 = str35;
                            obj3 = null;
                            strM1796p = null;
                            str12 = null;
                            str13 = null;
                            obj4 = null;
                            obj5 = null;
                            obj6 = null;
                            obj7 = null;
                            Contains = str8;
                        } else {
                            obj14 = obj14;
                            z2 = z7;
                            str10 = str36;
                            str11 = str35;
                            obj3 = null;
                            strM1796p = null;
                            str12 = null;
                            str13 = null;
                            obj4 = null;
                            obj5 = null;
                            obj6 = null;
                            obj7 = null;
                            Contains = str8;
                        }
                        Object obj1115 = obj4;
                        Object obj1116 = obj5;
                        if (z) {
                            obj8 = obj6;
                            obj9 = obj7;
                            obj10 = obj2;
                            obj11 = obj3;
                            strM1787g = null;
                            z3 = false;
                            z4 = false;
                            zContains = false;
                            Contains = 0;
                            if (strM1796p != null) {
                                if (AbstractC0405ku.m1362f(strM1796p)) {
                                    str14 = str10;
                                    if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                    }
                                    jSONObject4.put("parse", 1);
                                    jSONObject4.put("jx", obj10);
                                    jSONObject4.put("url", strM1796p);
                                    return C2137a.addDanmaku(jSONObject4.toString());
                                }
                                str14 = str10;
                                if (AbstractC0405ku.m1361e(strM1796p)) {
                                    str15 = r4;
                                    str3 = str9;
                                    str16 = str11;
                                    if (!strM1796p.contains("/zxzj_")) {
                                        jSONObject4.put("parse", 0);
                                        jSONObject4.put(str15, str3);
                                        jSONObject4.put("url", strM1796p);
                                        jSONObject4.put(str16, jSONObject3.toString());
                                        return C2137a.addDanmaku(jSONObject4.toString());
                                    }
                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                    str17 = str3;
                                    while (i < charArray.length) {
                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                    }
                                    int iCeil1111110 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                    String str31111116 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1111110 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1111110 + 6);
                                    jSONObject4.put("parse", 0);
                                    jSONObject4.put(str15, str3);
                                    jSONObject4.put("url", str31111116);
                                    jSONObject4.put(str16, jSONObject3.toString());
                                    return C2137a.addDanmaku(jSONObject4.toString());
                                    exc2 = e;
                                    SpiderDebug.log(exc2);
                                    if (xYQHiker.f357l) {
                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                    }
                                } else {
                                    str15 = r4;
                                    str3 = str9;
                                    str16 = str11;
                                    if (!strM1796p.contains("/zxzj_")) {
                                        jSONObject4.put("parse", 0);
                                        jSONObject4.put(str15, str3);
                                        jSONObject4.put("url", strM1796p);
                                        jSONObject4.put(str16, jSONObject3.toString());
                                        return C2137a.addDanmaku(jSONObject4.toString());
                                    }
                                    charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                    str17 = str3;
                                    while (i < charArray.length) {
                                        str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                    }
                                    int iCeil1111111 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                    String str31111117 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1111111 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1111111 + 6);
                                    jSONObject4.put("parse", 0);
                                    jSONObject4.put(str15, str3);
                                    jSONObject4.put("url", str31111117);
                                    jSONObject4.put(str16, jSONObject3.toString());
                                    return C2137a.addDanmaku(jSONObject4.toString());
                                    exc2 = e;
                                    SpiderDebug.log(exc2);
                                    if (xYQHiker.f357l) {
                                        Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                    }
                                }
                            } else {
                                str15 = "playUrl";
                                str13 = str3;
                                str3 = str9;
                                str16 = str11;
                            }
                            jSONObject4.put(str16, jSONObject3.toString());
                            jSONObject4.put("parse", 1);
                            jSONObject4.put(str15, str3);
                            jSONObject4.put("url", str13);
                            return C2137a.addDanmaku(jSONObject4.toString());
                        }
                        obj8 = obj6;
                        obj9 = obj7;
                        obj10 = obj2;
                        obj11 = obj3;
                        strM1787g = null;
                        z3 = false;
                        z4 = false;
                        zContains = false;
                        Contains = 0;
                        if (strM1796p != null) {
                            if (AbstractC0405ku.m1362f(strM1796p)) {
                                str14 = str10;
                                if (!xYQHiker.m751aa(str14).equals(obj10)) {
                                }
                                jSONObject4.put("parse", 1);
                                jSONObject4.put("jx", obj10);
                                jSONObject4.put("url", strM1796p);
                                return C2137a.addDanmaku(jSONObject4.toString());
                            }
                            str14 = str10;
                            if (AbstractC0405ku.m1361e(strM1796p)) {
                                str15 = r4;
                                str3 = str9;
                                str16 = str11;
                                if (!strM1796p.contains("/zxzj_")) {
                                    jSONObject4.put("parse", 0);
                                    jSONObject4.put(str15, str3);
                                    jSONObject4.put("url", strM1796p);
                                    jSONObject4.put(str16, jSONObject3.toString());
                                    return C2137a.addDanmaku(jSONObject4.toString());
                                }
                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                str17 = str3;
                                while (i < charArray.length) {
                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                }
                                int iCeil1111112 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                String str31111118 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1111112 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1111112 + 6);
                                jSONObject4.put("parse", 0);
                                jSONObject4.put(str15, str3);
                                jSONObject4.put("url", str31111118);
                                jSONObject4.put(str16, jSONObject3.toString());
                                return C2137a.addDanmaku(jSONObject4.toString());
                                exc2 = e;
                                SpiderDebug.log(exc2);
                                if (xYQHiker.f357l) {
                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                }
                            } else {
                                str15 = r4;
                                str3 = str9;
                                str16 = str11;
                                if (!strM1796p.contains("/zxzj_")) {
                                    jSONObject4.put("parse", 0);
                                    jSONObject4.put(str15, str3);
                                    jSONObject4.put("url", strM1796p);
                                    jSONObject4.put(str16, jSONObject3.toString());
                                    return C2137a.addDanmaku(jSONObject4.toString());
                                }
                                charArray = new StringBuffer((String) AbstractC0716wh.m1797q(xYQHiker.m762u(strM1796p, xYQHiker.f349d, xYQHiker.m766y(str2)), "var url = '", "'").get(0)).reverse().toString().toCharArray();
                                str17 = str3;
                                while (i < charArray.length) {
                                    str17 = str17 + "\\u00" + charArray[i] + Character.toString(charArray[i + 1]);
                                }
                                int iCeil1111113 = (int) Math.ceil(((double) (AbstractC0716wh.m1798r(str17).length() - 6)) / 2.0d);
                                String str31111119 = AbstractC0716wh.m1798r(str17).substring(0, iCeil1111113 - 1) + AbstractC0716wh.m1798r(str17).substring(iCeil1111113 + 6);
                                jSONObject4.put("parse", 0);
                                jSONObject4.put(str15, str3);
                                jSONObject4.put("url", str31111119);
                                jSONObject4.put(str16, jSONObject3.toString());
                                return C2137a.addDanmaku(jSONObject4.toString());
                                exc2 = e;
                                SpiderDebug.log(exc2);
                                if (xYQHiker.f357l) {
                                    Init.show("直链视频与zxzj部分出错：" + exc2.toString());
                                }
                            }
                        } else {
                            str15 = "playUrl";
                            str13 = str3;
                            str3 = str9;
                            str16 = str11;
                        }
                        jSONObject4.put(str16, jSONObject3.toString());
                        jSONObject4.put("parse", 1);
                        jSONObject4.put(str15, str3);
                        jSONObject4.put("url", str13);
                        return C2137a.addDanmaku(jSONObject4.toString());
                    } catch (Exception e42) {
                        e = e42;
                        str3 = str9;
                    }
                    SpiderDebug.log(exc);
                    if (xYQHiker.f357l) {
                        Init.show("播放类全局区域出错：" + exc.toString());
                    }
                    return str3;
                }
                try {
                    StringBuilder sb4 = new StringBuilder();
                    str9 = "";
                    try {
                        sb4.append(m752ab(str32, str9));
                        sb4.append(str3);
                        sb4.append(m752ab(str33, str9));
                        String string7 = sb4.toString();
                        if (m751aa(str34).isEmpty()) {
                            jSONObject4.put("header", jSONObject3.toString());
                        } else {
                            JSONObject jSONObjectOptJSONObject = this.f355j.optJSONObject(str34);
                            if (jSONObjectOptJSONObject != null) {
                                try {
                                    jSONObject4.put("header", jSONObjectOptJSONObject.toString());
                                } catch (Exception e43) {
                                    e = e43;
                                    xYQHiker = this;
                                }
                            } else {
                                String[] strArrSplit3 = m751aa(str34).split("#");
                                JSONObject jSONObject6 = new JSONObject();
                                int i5 = 0;
                                for (int length = strArrSplit3.length; i5 < length; length = length) {
                                    String str42 = strArrSplit3[i5];
                                    String[] strArr = strArrSplit3;
                                    String str43 = str4;
                                    String[] strArrSplit4 = str42.split(str43);
                                    str4 = str43;
                                    jSONObject6.put(strArrSplit4[0], " " + strArrSplit4[1]);
                                    i5++;
                                    strArrSplit3 = strArr;
                                }
                                jSONObject4.put("header", jSONObject6.toString());
                            }
                        }
                        if ((string7.contains("vip.ffzy") || string7.contains("vip.lz") || string7.contains("hd.lz") || string7.contains("suonizy")) && string7.contains("/share/")) {
                            string7 = AbstractC0716wh.m1796p(string7.replaceAll("#isVideo=true#", str9));
                        }
                        if (string7.contains("#isVideo=true#") || AbstractC0405ku.m1361e(string7)) {
                            if (string7.contains("#isVideo=true#")) {
                                string7 = string7.replaceAll("#isVideo=true#", str9);
                            }
                            jSONObject4.put("parse", 0);
                            jSONObject4.put("playUrl", str9);
                        } else {
                            if (AbstractC0405ku.m1362f(string7)) {
                                jSONObject4.put("parse", 1);
                                jSONObject4.put("jx", "1");
                                jSONObject4.put("url", string7);
                                return C2137a.addDanmaku(jSONObject4.toString());
                            }
                            jSONObject4.put("parse", 1);
                            jSONObject4.put("playUrl", str9);
                        }
                        jSONObject4.put("url", string7);
                        return C2137a.addDanmaku(jSONObject4.toString());
                    } catch (Exception e44) {
                        e = e44;
                        xYQHiker = this;
                        exc = e;
                        str3 = str9;
                        SpiderDebug.log(exc);
                        if (xYQHiker.f357l) {
                            Init.show("播放类全局区域出错：" + exc.toString());
                        }
                        return str3;
                    }
                } catch (Exception e45) {
                    e = e45;
                    str9 = "";
                }
                str3 = str9;
            } catch (Exception e46) {
                e = e46;
                str3 = "";
                xYQHiker = this;
            }
        } catch (Exception e47) {
            e = e47;
            xYQHiker = this;
            str3 = "";
        }
        exc = e;
        SpiderDebug.log(exc);
        if (xYQHiker.f357l) {
            Init.show("播放类全局区域出错：" + exc.toString());
        }
        return str3;
    }

    /* JADX INFO: renamed from: r */
    public final String m759r(String str, String str2, String str3, HashMap map) {
        try {
            SpiderDebug.log(str);
            C00713 c00713 = new C00713();
            AbstractC0771yi.m1888j(AbstractC0771yi.m1884f(), str, str2, map, c00713);
            return new String(((Response) c00713.getResult()).body().bytes(), str3).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x0586 A[Catch: Exception -> 0x05ac, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x05ac, blocks: (B:222:0x056d, B:228:0x0586), top: B:493:0x056d }] */
    /* JADX WARN: Code duplicated, block: B:244:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:286:0x067f A[Catch: Exception -> 0x0088, TryCatch #27 {Exception -> 0x0088, blocks: (B:3:0x0044, B:7:0x0054, B:11:0x0061, B:13:0x007e, B:17:0x009e, B:21:0x00ab, B:25:0x00ba, B:27:0x00c4, B:30:0x00d0, B:32:0x00d6, B:45:0x0113, B:47:0x0119, B:48:0x0121, B:50:0x0127, B:52:0x013b, B:55:0x015c, B:57:0x016a, B:59:0x0174, B:61:0x017a, B:65:0x0186, B:67:0x018c, B:71:0x0198, B:72:0x01a8, B:76:0x01b1, B:77:0x01dc, B:80:0x0203, B:81:0x022a, B:84:0x0242, B:86:0x0276, B:88:0x027c, B:90:0x0282, B:115:0x033b, B:120:0x0352, B:124:0x0362, B:128:0x0372, B:132:0x037f, B:134:0x0389, B:139:0x0399, B:142:0x03a5, B:147:0x03b3, B:149:0x03bd, B:154:0x03cf, B:158:0x03df, B:162:0x03ef, B:166:0x03ff, B:170:0x0411, B:174:0x0425, B:178:0x0437, B:182:0x0447, B:185:0x0469, B:187:0x0473, B:189:0x0479, B:191:0x0496, B:193:0x04ab, B:205:0x0502, B:289:0x069e, B:284:0x0678, B:286:0x067f, B:478:0x0abd, B:194:0x04b3, B:196:0x04b7, B:197:0x04c6, B:199:0x04ca, B:200:0x04df, B:202:0x04e3, B:291:0x06b5, B:296:0x06d5, B:301:0x06e9, B:306:0x06fd, B:311:0x0711, B:316:0x0725, B:321:0x0739, B:326:0x0753, B:328:0x075d, B:333:0x076d, B:337:0x077f, B:339:0x0786, B:342:0x078e, B:343:0x0796, B:345:0x079c, B:346:0x07a6, B:349:0x07b2, B:350:0x07b6, B:352:0x07bc, B:353:0x07c0, B:354:0x07d0, B:356:0x07d5, B:357:0x07de, B:358:0x07ea, B:475:0x0a9e, B:477:0x0aa5, B:91:0x0297, B:93:0x02a6, B:94:0x02c7, B:96:0x02d7, B:98:0x02dd, B:99:0x02e6, B:100:0x02f2, B:102:0x0306, B:104:0x030e, B:105:0x0312, B:107:0x031a, B:110:0x0326, B:112:0x032c, B:114:0x0332, B:109:0x0322, B:34:0x00e6, B:36:0x00ec, B:38:0x00f2, B:39:0x0101, B:16:0x008c), top: B:543:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:287:0x069a  */
    /* JADX WARN: Code duplicated, block: B:412:0x0912  */
    /* JADX WARN: Code duplicated, block: B:428:0x0954 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:430:0x095f  */
    /* JADX WARN: Code duplicated, block: B:433:0x0969 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:440:0x097f  */
    /* JADX WARN: Code duplicated, block: B:451:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:455:0x09c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:458:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:461:0x09d8 A[Catch: Exception -> 0x080b, TRY_ENTER, TryCatch #21 {Exception -> 0x080b, blocks: (B:360:0x07f0, B:363:0x0802, B:369:0x0813, B:371:0x0845, B:373:0x084d, B:375:0x0855, B:376:0x0867, B:379:0x0875, B:381:0x087e, B:426:0x094a, B:429:0x0956, B:431:0x0963, B:453:0x09bc, B:456:0x09c8, B:461:0x09d8, B:463:0x0a16, B:465:0x0a1e, B:466:0x0a22, B:468:0x0a3c, B:469:0x0a40, B:462:0x09e9, B:450:0x09ae, B:424:0x0938, B:370:0x081e), top: B:531:0x07f0 }] */
    /* JADX WARN: Code duplicated, block: B:462:0x09e9 A[Catch: Exception -> 0x080b, TryCatch #21 {Exception -> 0x080b, blocks: (B:360:0x07f0, B:363:0x0802, B:369:0x0813, B:371:0x0845, B:373:0x084d, B:375:0x0855, B:376:0x0867, B:379:0x0875, B:381:0x087e, B:426:0x094a, B:429:0x0956, B:431:0x0963, B:453:0x09bc, B:456:0x09c8, B:461:0x09d8, B:463:0x0a16, B:465:0x0a1e, B:466:0x0a22, B:468:0x0a3c, B:469:0x0a40, B:462:0x09e9, B:450:0x09ae, B:424:0x0938, B:370:0x081e), top: B:531:0x07f0 }] */
    /* JADX WARN: Code duplicated, block: B:465:0x0a1e A[Catch: Exception -> 0x080b, TryCatch #21 {Exception -> 0x080b, blocks: (B:360:0x07f0, B:363:0x0802, B:369:0x0813, B:371:0x0845, B:373:0x084d, B:375:0x0855, B:376:0x0867, B:379:0x0875, B:381:0x087e, B:426:0x094a, B:429:0x0956, B:431:0x0963, B:453:0x09bc, B:456:0x09c8, B:461:0x09d8, B:463:0x0a16, B:465:0x0a1e, B:466:0x0a22, B:468:0x0a3c, B:469:0x0a40, B:462:0x09e9, B:450:0x09ae, B:424:0x0938, B:370:0x081e), top: B:531:0x07f0 }] */
    /* JADX WARN: Code duplicated, block: B:468:0x0a3c A[Catch: Exception -> 0x080b, TryCatch #21 {Exception -> 0x080b, blocks: (B:360:0x07f0, B:363:0x0802, B:369:0x0813, B:371:0x0845, B:373:0x084d, B:375:0x0855, B:376:0x0867, B:379:0x0875, B:381:0x087e, B:426:0x094a, B:429:0x0956, B:431:0x0963, B:453:0x09bc, B:456:0x09c8, B:461:0x09d8, B:463:0x0a16, B:465:0x0a1e, B:466:0x0a22, B:468:0x0a3c, B:469:0x0a40, B:462:0x09e9, B:450:0x09ae, B:424:0x0938, B:370:0x081e), top: B:531:0x07f0 }] */
    /* JADX WARN: Code duplicated, block: B:481:0x0aeb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:483:0x0aed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:493:0x056d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x096b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x059a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0577 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: No SSA var for result arg: (r9 I:??) from 0x03d9: PHI (r9 I:??) = (r9v11 java.lang.String) binds: [B:157:0x03dc] A[DONT_GENERATE, DONT_INLINE, REMOVE]
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:100)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:353)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:284)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:82)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: s */
    public final org.json.JSONObject m760s(java.lang.String r38, java.lang.String r39, boolean r40, java.util.HashMap r41) {
        /*
            Method dump skipped, instruction units count: 2828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQHiker.m760s(java.lang.String, java.lang.String, boolean, java.util.HashMap):org.json.JSONObject");
    }

    public String searchContent(String str, boolean z) {
        return m758ah(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return m758ah(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e0 A[Catch: Exception -> 0x0275, TRY_LEAVE, TryCatch #6 {Exception -> 0x0275, blocks: (B:111:0x01da, B:113:0x01e0), top: B:269:0x01da }] */
    /* JADX WARN: Code duplicated, block: B:150:0x026d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0286 A[Catch: Exception -> 0x02f5, TRY_LEAVE, TryCatch #5 {Exception -> 0x02f5, blocks: (B:156:0x0280, B:158:0x0286), top: B:267:0x0280 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:194:0x0305 A[Catch: Exception -> 0x036c, TRY_LEAVE, TryCatch #1 {Exception -> 0x036c, blocks: (B:192:0x02ff, B:194:0x0305), top: B:259:0x02ff }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0368  */
    /* JADX WARN: Code duplicated, block: B:245:0x03f1 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #4 {Exception -> 0x0037, blocks: (B:3:0x000c, B:5:0x0025, B:9:0x004f, B:243:0x03ea, B:245:0x03f1), top: B:265:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:247:0x040c  */
    /* JADX WARN: Code duplicated, block: B:259:0x02ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0280 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[Catch: Exception -> 0x00b1, TRY_LEAVE, TryCatch #8 {Exception -> 0x00b1, blocks: (B:28:0x0094, B:30:0x009d, B:32:0x00a5, B:47:0x00e7, B:49:0x00ed, B:51:0x00f5, B:54:0x00fc, B:57:0x0106, B:59:0x010c, B:61:0x0119, B:63:0x0121, B:64:0x012d, B:40:0x00c9), top: B:273:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Instruction removed from duplicated block: B:245:0x03f1, please report this as an issue */
    /* JADX INFO: renamed from: t */
    public final JSONObject m761t(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        CharSequence charSequence;
        String str25;
        Object obj;
        String str26;
        String str27;
        String str28 = str7;
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            String[] strArrSplit = str.split("&");
            ArrayList arrayList = new ArrayList();
            int length = strArrSplit.length;
            int i = 0;
            while (i < length) {
                arrayList.add(strArrSplit[i].replaceAll("＆＆", "&"));
                i++;
                jSONArray = jSONArray;
            }
            JSONArray jSONArray2 = jSONArray;
            String str29 = str4;
            String str30 = str6;
            String str31 = str8;
            String str32 = str10;
            String str33 = str12;
            String str34 = str14;
            int i2 = 0;
            JSONObject jSONObject2 = jSONObject;
            JSONArray jSONArray3 = jSONArray2;
            while (i2 < arrayList.size()) {
                try {
                    arrayList = arrayList;
                    str17 = str33;
                    if (str3.isEmpty()) {
                        str19 = str31;
                        str16 = str32;
                        str20 = "\\|\\|";
                        if (str5.isEmpty()) {
                            str21 = str20;
                        } else {
                            str21 = str20;
                        }
                        if (str7.isEmpty()) {
                            str7 = str7;
                            String str35 = str19;
                            str23 = str29;
                            str22 = str35;
                            if (str9.isEmpty()) {
                                String str36 = str16;
                                charSequence = "||";
                                str30 = str30;
                                str22 = str22;
                                str24 = str36;
                            } else if (str16.isEmpty()) {
                                String str37 = str16;
                                charSequence = "||";
                                str30 = str30;
                                str22 = str22;
                                str24 = str37;
                            } else {
                                String str38 = str16;
                                charSequence = "||";
                                str30 = str30;
                                str22 = str22;
                                str24 = str38;
                            }
                            if (str11.isEmpty()) {
                                str17 = str17;
                                obj = Marker.ANY_MARKER;
                                str24 = str24;
                            } else if (str17.isEmpty()) {
                                str17 = str17;
                                obj = Marker.ANY_MARKER;
                                str24 = str24;
                            } else {
                                str17 = str17;
                                obj = Marker.ANY_MARKER;
                                str24 = str24;
                            }
                            if (str13.isEmpty()) {
                                str34 = str34;
                                i2 = i2;
                            } else if (str34.isEmpty()) {
                                str34 = str34;
                                i2 = i2;
                            } else {
                                str34 = str34;
                                i2 = i2;
                            }
                            arrayList = arrayList;
                            jSONObject2 = jSONObject2;
                            jSONObject2.put((String) arrayList.get(i2), jSONArray3);
                            str16 = str24;
                            str30 = str30;
                            str29 = str23;
                            jSONArray3 = new JSONArray();
                            str18 = str22;
                        } else {
                            if (str19.isEmpty()) {
                                str7 = str7;
                                String str39 = str19;
                                str23 = str29;
                                str22 = str39;
                            } else {
                                str7 = str7;
                                String str310 = str19;
                                str23 = str29;
                                str22 = str310;
                            }
                            if (str9.isEmpty()) {
                                String str311 = str16;
                                charSequence = "||";
                                str30 = str30;
                                str22 = str22;
                                str24 = str311;
                            } else if (str16.isEmpty()) {
                                String str312 = str16;
                                charSequence = "||";
                                str30 = str30;
                                str22 = str22;
                                str24 = str312;
                            } else {
                                String str313 = str16;
                                charSequence = "||";
                                str30 = str30;
                                str22 = str22;
                                str24 = str313;
                            }
                            if (str11.isEmpty()) {
                                str17 = str17;
                                obj = Marker.ANY_MARKER;
                                str24 = str24;
                            } else if (str17.isEmpty()) {
                                str17 = str17;
                                obj = Marker.ANY_MARKER;
                                str24 = str24;
                            } else {
                                str17 = str17;
                                obj = Marker.ANY_MARKER;
                                str24 = str24;
                            }
                            if (str13.isEmpty()) {
                                str34 = str34;
                                i2 = i2;
                            } else if (str34.isEmpty()) {
                                str34 = str34;
                                i2 = i2;
                            } else {
                                str34 = str34;
                                i2 = i2;
                            }
                            arrayList = arrayList;
                            jSONObject2 = jSONObject2;
                            jSONObject2.put((String) arrayList.get(i2), jSONArray3);
                            str16 = str24;
                            str30 = str30;
                            str29 = str23;
                            jSONArray3 = new JSONArray();
                            str18 = str22;
                        }
                    } else {
                        try {
                            if (str29.isEmpty() || !str2.contains("{cateId}")) {
                                str19 = str31;
                                str16 = str32;
                                str20 = "\\|\\|";
                            } else {
                                if (str29.equals(Marker.ANY_MARKER)) {
                                    str29 = str3;
                                }
                                str16 = str32;
                                if (str29.contains("||")) {
                                    try {
                                        if (str3.contains("||")) {
                                            String[] strArrSplit2 = str3.split("\\|\\|");
                                            str19 = str31;
                                            try {
                                                String[] strArrSplit3 = str29.split("\\|\\|");
                                                str20 = "\\|\\|";
                                                if (i2 < strArrSplit3.length && !strArrSplit3[i2].equals("空")) {
                                                    jSONArray3.put(m767z("cateId", "分类", strArrSplit2[i2], strArrSplit3[i2]));
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                str17 = str17;
                                                str16 = str16;
                                                str7 = str7;
                                                str15 = str19;
                                                SpiderDebug.log(e);
                                                if (this.f357l) {
                                                    Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                }
                                                str18 = str15;
                                                int i3 = i2 + 1;
                                                str31 = str18;
                                                i2 = i3;
                                                str34 = str34;
                                                jSONObject2 = jSONObject2;
                                                str32 = str16;
                                                String str40 = str7;
                                                str33 = str17;
                                                str28 = str40;
                                            }
                                        } else {
                                            str19 = str31;
                                            str20 = "\\|\\|";
                                            jSONArray3.put(m767z("cateId", "分类", str3, str29));
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        str19 = str31;
                                    }
                                } else {
                                    str19 = str31;
                                    str20 = "\\|\\|";
                                    jSONArray3.put(m767z("cateId", "分类", str3, str29));
                                }
                            }
                            try {
                                if (str5.isEmpty() || str30.isEmpty() || !str2.contains("{class}")) {
                                    str21 = str20;
                                } else {
                                    if (str30.equals(Marker.ANY_MARKER)) {
                                        str30 = str5;
                                    }
                                    if (str30.contains("||") && str5.contains("||")) {
                                        str21 = str20;
                                        String[] strArrSplit4 = str5.split(str21);
                                        String[] strArrSplit5 = str30.split(str21);
                                        if (i2 < strArrSplit5.length && !strArrSplit5[i2].equals("空")) {
                                            jSONArray3.put(m767z("class", "类型", strArrSplit4[i2], strArrSplit5[i2]));
                                        }
                                    } else {
                                        str21 = str20;
                                        jSONArray3.put(m767z("class", "类型", str5, str30));
                                    }
                                }
                                try {
                                    if (str7.isEmpty()) {
                                        try {
                                            if (str19.isEmpty() || !str2.contains("{area}")) {
                                                str7 = str7;
                                                String str314 = str19;
                                                str23 = str29;
                                                str22 = str314;
                                            } else {
                                                str15 = str19;
                                                try {
                                                    str22 = str15.equals(Marker.ANY_MARKER) ? str7 : str15;
                                                    try {
                                                        if (str22.contains("||")) {
                                                            str7 = str7;
                                                            try {
                                                                if (str7.contains("||")) {
                                                                    String[] strArrSplit6 = str7.split(str21);
                                                                    String[] strArrSplit7 = str22.split(str21);
                                                                    str23 = str29;
                                                                    try {
                                                                        if (i2 < strArrSplit7.length && !strArrSplit7[i2].equals("空")) {
                                                                            jSONArray3.put(m767z("area", "地区", strArrSplit6[i2], strArrSplit7[i2]));
                                                                        }
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        str29 = str23;
                                                                        str15 = str22;
                                                                        i2 = i2;
                                                                        SpiderDebug.log(e);
                                                                        if (this.f357l) {
                                                                            Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                                        }
                                                                        str18 = str15;
                                                                        int i4 = i2 + 1;
                                                                        str31 = str18;
                                                                        i2 = i4;
                                                                        str34 = str34;
                                                                        jSONObject2 = jSONObject2;
                                                                        str32 = str16;
                                                                        String str41 = str7;
                                                                        str33 = str17;
                                                                        str28 = str41;
                                                                    }
                                                                }
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                str15 = str22;
                                                                i2 = i2;
                                                                SpiderDebug.log(e);
                                                                if (this.f357l) {
                                                                    Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                                }
                                                                str18 = str15;
                                                                int i5 = i2 + 1;
                                                                str31 = str18;
                                                                i2 = i5;
                                                                str34 = str34;
                                                                jSONObject2 = jSONObject2;
                                                                str32 = str16;
                                                                String str42 = str7;
                                                                str33 = str17;
                                                                str28 = str42;
                                                            }
                                                        } else {
                                                            str7 = str7;
                                                        }
                                                        str23 = str29;
                                                        jSONArray3.put(m767z("area", "地区", str7, str22));
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        str7 = str7;
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    str17 = str17;
                                                    str16 = str16;
                                                    SpiderDebug.log(e);
                                                    if (this.f357l) {
                                                        Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                    }
                                                    str18 = str15;
                                                    int i6 = i2 + 1;
                                                    str31 = str18;
                                                    i2 = i6;
                                                    str34 = str34;
                                                    jSONObject2 = jSONObject2;
                                                    str32 = str16;
                                                    String str43 = str7;
                                                    str33 = str17;
                                                    str28 = str43;
                                                }
                                            }
                                            try {
                                                if (str9.isEmpty()) {
                                                    try {
                                                        if (str16.isEmpty() || !str2.contains("{year}")) {
                                                            String str315 = str16;
                                                            charSequence = "||";
                                                            str30 = str30;
                                                            str22 = str22;
                                                            str24 = str315;
                                                        } else {
                                                            str16 = str16;
                                                            try {
                                                                str24 = str16.equals(Marker.ANY_MARKER) ? str9 : str16;
                                                                try {
                                                                    if (str24.contains("||")) {
                                                                        charSequence = "||";
                                                                        str25 = str9;
                                                                        try {
                                                                            if (str25.contains(charSequence)) {
                                                                                String[] strArrSplit8 = str25.split(str21);
                                                                                str30 = str30;
                                                                                try {
                                                                                    String[] strArrSplit9 = str24.split(str21);
                                                                                    str22 = str22;
                                                                                    try {
                                                                                        if (i2 < strArrSplit9.length && !strArrSplit9[i2].equals("空")) {
                                                                                            jSONArray3.put(m767z("year", "年份", strArrSplit8[i2], strArrSplit9[i2]));
                                                                                        }
                                                                                    } catch (Exception e7) {
                                                                                        e = e7;
                                                                                        str30 = str30;
                                                                                        str29 = str23;
                                                                                        str15 = str22;
                                                                                        str16 = str24;
                                                                                        SpiderDebug.log(e);
                                                                                        if (this.f357l) {
                                                                                            Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                                                        }
                                                                                        str18 = str15;
                                                                                        int i7 = i2 + 1;
                                                                                        str31 = str18;
                                                                                        i2 = i7;
                                                                                        str34 = str34;
                                                                                        jSONObject2 = jSONObject2;
                                                                                        str32 = str16;
                                                                                        String str44 = str7;
                                                                                        str33 = str17;
                                                                                        str28 = str44;
                                                                                    }
                                                                                } catch (Exception e8) {
                                                                                    e = e8;
                                                                                    str22 = str22;
                                                                                }
                                                                            }
                                                                        } catch (Exception e9) {
                                                                            e = e9;
                                                                            str22 = str22;
                                                                            str29 = str23;
                                                                            str15 = str22;
                                                                            str16 = str24;
                                                                            SpiderDebug.log(e);
                                                                            if (this.f357l) {
                                                                                Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                                            }
                                                                            str18 = str15;
                                                                            int i8 = i2 + 1;
                                                                            str31 = str18;
                                                                            i2 = i8;
                                                                            str34 = str34;
                                                                            jSONObject2 = jSONObject2;
                                                                            str32 = str16;
                                                                            String str45 = str7;
                                                                            str33 = str17;
                                                                            str28 = str45;
                                                                        }
                                                                    } else {
                                                                        charSequence = "||";
                                                                        str25 = str9;
                                                                    }
                                                                    jSONArray3.put(m767z("year", "年份", str25, str24));
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                }
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                str17 = str17;
                                                                str29 = str23;
                                                                str15 = str22;
                                                                SpiderDebug.log(e);
                                                                if (this.f357l) {
                                                                    Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                                }
                                                                str18 = str15;
                                                                int i9 = i2 + 1;
                                                                str31 = str18;
                                                                i2 = i9;
                                                                str34 = str34;
                                                                jSONObject2 = jSONObject2;
                                                                str32 = str16;
                                                                String str46 = str7;
                                                                str33 = str17;
                                                                str28 = str46;
                                                            }
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        str16 = str16;
                                                    }
                                                } else {
                                                    String str316 = str16;
                                                    charSequence = "||";
                                                    str30 = str30;
                                                    str22 = str22;
                                                    str24 = str316;
                                                }
                                                try {
                                                    if (str11.isEmpty()) {
                                                        try {
                                                            if (str17.isEmpty() || !str2.contains("{lang}")) {
                                                                str17 = str17;
                                                                obj = Marker.ANY_MARKER;
                                                                str24 = str24;
                                                            } else {
                                                                str17 = str17;
                                                                try {
                                                                    if (str17.equals(Marker.ANY_MARKER)) {
                                                                        str17 = str11;
                                                                    }
                                                                    if (str17.contains(charSequence)) {
                                                                        obj = Marker.ANY_MARKER;
                                                                        str26 = str11;
                                                                        try {
                                                                            if (str26.contains(charSequence)) {
                                                                                String[] strArrSplit10 = str26.split(str21);
                                                                                String[] strArrSplit11 = str17.split(str21);
                                                                                str24 = str24;
                                                                                try {
                                                                                    if (i2 < strArrSplit11.length && !strArrSplit11[i2].equals("空")) {
                                                                                        jSONArray3.put(m767z("lang", "语言", strArrSplit10[i2], strArrSplit11[i2]));
                                                                                    }
                                                                                } catch (Exception e13) {
                                                                                    e = e13;
                                                                                    str16 = str24;
                                                                                    str30 = str30;
                                                                                    str29 = str23;
                                                                                    str15 = str22;
                                                                                    SpiderDebug.log(e);
                                                                                    if (this.f357l) {
                                                                                        Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                                                    }
                                                                                    str18 = str15;
                                                                                    int i10 = i2 + 1;
                                                                                    str31 = str18;
                                                                                    i2 = i10;
                                                                                    str34 = str34;
                                                                                    jSONObject2 = jSONObject2;
                                                                                    str32 = str16;
                                                                                    String str47 = str7;
                                                                                    str33 = str17;
                                                                                    str28 = str47;
                                                                                }
                                                                            }
                                                                        } catch (Exception e14) {
                                                                            e = e14;
                                                                            str24 = str24;
                                                                            str16 = str24;
                                                                            str30 = str30;
                                                                            str29 = str23;
                                                                            str15 = str22;
                                                                            SpiderDebug.log(e);
                                                                            if (this.f357l) {
                                                                                Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                                            }
                                                                            str18 = str15;
                                                                            int i11 = i2 + 1;
                                                                            str31 = str18;
                                                                            i2 = i11;
                                                                            str34 = str34;
                                                                            jSONObject2 = jSONObject2;
                                                                            str32 = str16;
                                                                            String str48 = str7;
                                                                            str33 = str17;
                                                                            str28 = str48;
                                                                        }
                                                                    } else {
                                                                        obj = Marker.ANY_MARKER;
                                                                        str26 = str11;
                                                                    }
                                                                    jSONArray3.put(m767z("lang", "语言", str26, str17));
                                                                } catch (Exception e15) {
                                                                    e = e15;
                                                                }
                                                            }
                                                        } catch (Exception e16) {
                                                            e = e16;
                                                            str17 = str17;
                                                        }
                                                    } else {
                                                        str17 = str17;
                                                        obj = Marker.ANY_MARKER;
                                                        str24 = str24;
                                                    }
                                                    try {
                                                        if (str13.isEmpty()) {
                                                            try {
                                                                if (str34.isEmpty() || !str2.contains("{by}")) {
                                                                    str34 = str34;
                                                                    i2 = i2;
                                                                } else {
                                                                    str34 = str34;
                                                                    try {
                                                                        if (str34.equals(obj)) {
                                                                            str34 = str13;
                                                                        }
                                                                        if (str34.contains(charSequence)) {
                                                                            i2 = i2;
                                                                            str27 = str13;
                                                                            try {
                                                                                if (str27.contains(charSequence)) {
                                                                                    String[] strArrSplit12 = str27.split(str21);
                                                                                    String[] strArrSplit13 = str34.split(str21);
                                                                                    if (i2 < strArrSplit13.length && !strArrSplit13[i2].equals("空")) {
                                                                                        jSONArray3.put(m767z("by", "排序", strArrSplit12[i2], strArrSplit13[i2]));
                                                                                    }
                                                                                }
                                                                            } catch (Exception e17) {
                                                                                e = e17;
                                                                                str16 = str24;
                                                                                str30 = str30;
                                                                                str29 = str23;
                                                                                str15 = str22;
                                                                                jSONObject2 = jSONObject2;
                                                                                arrayList = arrayList;
                                                                                SpiderDebug.log(e);
                                                                                if (this.f357l) {
                                                                                    Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                                                }
                                                                                str18 = str15;
                                                                            }
                                                                        } else {
                                                                            i2 = i2;
                                                                            str27 = str13;
                                                                        }
                                                                        jSONArray3.put(m767z("by", "排序", str27, str34));
                                                                    } catch (Exception e18) {
                                                                        e = e18;
                                                                        i2 = i2;
                                                                        str16 = str24;
                                                                        str30 = str30;
                                                                        str29 = str23;
                                                                        str15 = str22;
                                                                        jSONObject2 = jSONObject2;
                                                                        arrayList = arrayList;
                                                                        SpiderDebug.log(e);
                                                                        if (this.f357l) {
                                                                            Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                                        }
                                                                        str18 = str15;
                                                                        int i12 = i2 + 1;
                                                                        str31 = str18;
                                                                        i2 = i12;
                                                                        str34 = str34;
                                                                        jSONObject2 = jSONObject2;
                                                                        str32 = str16;
                                                                        String str49 = str7;
                                                                        str33 = str17;
                                                                        str28 = str49;
                                                                    }
                                                                }
                                                            } catch (Exception e19) {
                                                                e = e19;
                                                                str34 = str34;
                                                            }
                                                        } else {
                                                            str34 = str34;
                                                            i2 = i2;
                                                        }
                                                        arrayList = arrayList;
                                                        try {
                                                            jSONObject2 = jSONObject2;
                                                            try {
                                                                jSONObject2.put((String) arrayList.get(i2), jSONArray3);
                                                                str16 = str24;
                                                                str30 = str30;
                                                                str29 = str23;
                                                                jSONArray3 = new JSONArray();
                                                                str18 = str22;
                                                            } catch (Exception e20) {
                                                                e = e20;
                                                                str16 = str24;
                                                                str30 = str30;
                                                                str29 = str23;
                                                                str15 = str22;
                                                                SpiderDebug.log(e);
                                                                if (this.f357l) {
                                                                    Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                                }
                                                                str18 = str15;
                                                            }
                                                        } catch (Exception e21) {
                                                            e = e21;
                                                            jSONObject2 = jSONObject2;
                                                        }
                                                    } catch (Exception e22) {
                                                        e = e22;
                                                        jSONObject2 = jSONObject2;
                                                        arrayList = arrayList;
                                                        str16 = str24;
                                                        str30 = str30;
                                                        str29 = str23;
                                                        str15 = str22;
                                                        SpiderDebug.log(e);
                                                        if (this.f357l) {
                                                            Init.show("creatFilter详细筛选生成出错：" + e.toString());
                                                        }
                                                        str18 = str15;
                                                        int i13 = i2 + 1;
                                                        str31 = str18;
                                                        i2 = i13;
                                                        str34 = str34;
                                                        jSONObject2 = jSONObject2;
                                                        str32 = str16;
                                                        String str410 = str7;
                                                        str33 = str17;
                                                        str28 = str410;
                                                    }
                                                } catch (Exception e23) {
                                                    e = e23;
                                                    str17 = str17;
                                                    str24 = str24;
                                                }
                                            } catch (Exception e24) {
                                                e = e24;
                                                str34 = str34;
                                                str17 = str17;
                                                str16 = str16;
                                                str22 = str22;
                                                jSONObject2 = jSONObject2;
                                                arrayList = arrayList;
                                                i2 = i2;
                                            }
                                        } catch (Exception e25) {
                                            e = e25;
                                            str15 = str19;
                                        }
                                    } else {
                                        str7 = str7;
                                        String str317 = str19;
                                        str23 = str29;
                                        str22 = str317;
                                        if (str9.isEmpty()) {
                                            String str318 = str16;
                                            charSequence = "||";
                                            str30 = str30;
                                            str22 = str22;
                                            str24 = str318;
                                        } else if (str16.isEmpty()) {
                                            String str319 = str16;
                                            charSequence = "||";
                                            str30 = str30;
                                            str22 = str22;
                                            str24 = str319;
                                        } else {
                                            String str3110 = str16;
                                            charSequence = "||";
                                            str30 = str30;
                                            str22 = str22;
                                            str24 = str3110;
                                        }
                                        if (str11.isEmpty()) {
                                            str17 = str17;
                                            obj = Marker.ANY_MARKER;
                                            str24 = str24;
                                        } else if (str17.isEmpty()) {
                                            str17 = str17;
                                            obj = Marker.ANY_MARKER;
                                            str24 = str24;
                                        } else {
                                            str17 = str17;
                                            obj = Marker.ANY_MARKER;
                                            str24 = str24;
                                        }
                                        if (str13.isEmpty()) {
                                            str34 = str34;
                                            i2 = i2;
                                        } else if (str34.isEmpty()) {
                                            str34 = str34;
                                            i2 = i2;
                                        } else {
                                            str34 = str34;
                                            i2 = i2;
                                        }
                                        arrayList = arrayList;
                                        jSONObject2 = jSONObject2;
                                        jSONObject2.put((String) arrayList.get(i2), jSONArray3);
                                        str16 = str24;
                                        str30 = str30;
                                        str29 = str23;
                                        jSONArray3 = new JSONArray();
                                        str18 = str22;
                                    }
                                } catch (Exception e26) {
                                    e = e26;
                                    str34 = str34;
                                    str17 = str17;
                                    str16 = str16;
                                    str7 = str7;
                                    str15 = str19;
                                }
                            } catch (Exception e27) {
                                e = e27;
                                str34 = str34;
                                str17 = str17;
                                str16 = str16;
                                str7 = str7;
                                str15 = str19;
                            }
                        } catch (Exception e28) {
                            e = e28;
                            str19 = str31;
                            str16 = str32;
                        }
                    }
                } catch (Exception e29) {
                    e = e29;
                    str34 = str34;
                    str15 = str31;
                    str16 = str32;
                    jSONObject2 = jSONObject2;
                    i2 = i2;
                    String str50 = str33;
                    str7 = str28;
                    str17 = str50;
                }
                int i14 = i2 + 1;
                str31 = str18;
                i2 = i14;
                str34 = str34;
                jSONObject2 = jSONObject2;
                str32 = str16;
                String str411 = str7;
                str33 = str17;
                str28 = str411;
            }
            return jSONObject2;
        } catch (Exception e30) {
            SpiderDebug.log(e30);
            if (!this.f357l) {
                return null;
            }
            Init.show("creatFilter全局出错：" + e30.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final String m762u(String str, String str2, HashMap map) {
        try {
            SpiderDebug.log(str);
            C00691 c00691 = new C00691();
            if (str.startsWith("clan://")) {
                return AbstractC0771yi.m1889k(str.replace("clan://", Proxy.localProxyUrl().replace("/proxy", "/file/")), null);
            }
            AbstractC0771yi.m1885g(AbstractC0771yi.m1884f(), str, map, c00691);
            return new String(((Response) c00691.getResult()).body().bytes(), str2).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final String m763v(String str, HashMap map, String str2, HashMap map2) {
        try {
            SpiderDebug.log(str);
            C00702 c00702 = new C00702();
            AbstractC0771yi.m1887i(AbstractC0771yi.m1884f(), str, map, map2, c00702);
            return new String(((Response) c00702.getResult()).body().bytes(), str2).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m764w() {
        String str;
        if (this.f355j != null || (str = this.f354i) == null) {
            return;
        }
        try {
            if (str.startsWith("http")) {
                this.f355j = new JSONObject(AbstractC0771yi.m1889k(this.f354i, null));
            } else {
                this.f355j = new JSONObject(this.f354i);
            }
            this.f356k = m752ab("OCR_API", "https://api.nn.ci/ocr/b64/text");
            this.f357l = m752ab("DEBUG", "0").equals("是") || m752ab("DEBUG", "0").equals("1");
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m765x(String str, String str2) {
        JSONObject jSONObject = this.f352g;
        try {
            jSONObject.put("referer", str2);
            return str + "@Headers=" + jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: y */
    public final HashMap m766y(String str) throws JSONException {
        HashMap map;
        String str2;
        String str3;
        HashMap map2;
        HashMap map3 = new HashMap();
        String strTrim = m752ab(m752ab("请求头参数", "").isEmpty() ? "Headers" : "请求头参数", "").trim();
        boolean zContains = strTrim.contains("$");
        JSONObject jSONObject = this.f352g;
        String str4 = "苹果电脑";
        String str5 = "MAC_UA";
        String string = this.f350e;
        if (zContains) {
            String[] strArrSplit = strTrim.split("#");
            HashMap map4 = map3;
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                String[] strArrSplit2 = strArrSplit[i].split("\\$");
                String str6 = strArrSplit2[0];
                String string2 = strArrSplit2[1];
                if (string2.equals("PC_UA") || string2.equals("电脑")) {
                    string2 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
                } else if (string2.equals("MOBILE_UA") || string2.equals("手机")) {
                    string2 = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
                } else if (string2.equals("IOS_UA") || string2.equals("苹果手机")) {
                    string2 = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
                } else if (string2.equals(str5) || string2.equals(str4)) {
                    string2 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
                }
                if (!(this.f348c.isEmpty() && string.isEmpty()) && str6.equalsIgnoreCase("cookie")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string2);
                    if (this.f348c.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = ";" + this.f348c;
                    }
                    sb.append(str2);
                    if (string.isEmpty()) {
                        str3 = "";
                    } else {
                        str3 = ";" + string;
                    }
                    sb.append(str3);
                    string2 = sb.toString();
                } else {
                    str5 = str5;
                }
                if (str6.equalsIgnoreCase("user-agent")) {
                    jSONObject.put("user-agent", string2);
                }
                if (str6.equalsIgnoreCase("referer") || string2.equalsIgnoreCase("WebView")) {
                    map2 = map4;
                    if (!string2.equalsIgnoreCase("WebView")) {
                        map2.put(str6, string2);
                    }
                } else {
                    map2 = map4;
                    map2.put(str6, string2);
                }
                i++;
                map4 = map2;
                strArrSplit = strArr;
                str4 = str4;
                str5 = str5;
            }
            map = map4;
            if ((!this.f348c.isEmpty() || !string.isEmpty()) && ((this.f348c.length() > 1 || string.length() > 1) && !strTrim.contains("Cookie$") && !strTrim.contains("cookie$"))) {
                if (this.f348c.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f348c);
                    if (!string.isEmpty()) {
                        string = ";" + string;
                    }
                    sb2.append(string);
                    string = sb2.toString();
                }
                map.put("Cookie", string);
            }
        } else {
            map = map3;
            if (strTrim.isEmpty()) {
                strTrim = "okhttp/3.12.11";
            } else if (strTrim.equals("PC_UA") || strTrim.equals("电脑")) {
                strTrim = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
            } else if (strTrim.equals("MOBILE_UA") || strTrim.equals("手机")) {
                strTrim = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
            } else if (strTrim.equals("IOS_UA") || strTrim.equals("苹果手机")) {
                strTrim = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
            } else if (strTrim.equals("MAC_UA") || strTrim.equals("苹果电脑")) {
                strTrim = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
            }
            if ((!this.f348c.isEmpty() || !string.isEmpty()) && (this.f348c.length() > 1 || string.length() > 1)) {
                if (this.f348c.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f348c);
                    if (!string.isEmpty()) {
                        string = ";" + string;
                    }
                    sb3.append(string);
                    string = sb3.toString();
                }
                map.put("Cookie", string);
            }
            map.put("User-Agent", strTrim);
            jSONObject.put("user-agent", strTrim);
        }
        return map;
    }

    /* JADX INFO: renamed from: z */
    public final JSONObject m767z(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (!str.equals("by") && !str4.equals("空") && !str3.contains("全部")) {
                jSONObject.put("n", "全部");
                jSONObject.put("v", "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
            } else if (str.equals("by") && !str4.equals("空") && !str3.contains("默认")) {
                jSONObject.put("n", "默认");
                jSONObject.put("v", "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
            }
            if (str4.contains("&") && !str4.equals("空")) {
                String[] strArrSplit = str3.split("&");
                String[] strArrSplit2 = str4.split("&");
                for (int i = 0; i < strArrSplit.length; i++) {
                    jSONObject.put("n", strArrSplit[i]);
                    jSONObject.put("v", strArrSplit2[i].replaceAll("＆＆", "&"));
                    jSONArray.put(jSONObject);
                    jSONObject = new JSONObject();
                }
            } else if (!str4.equals("空")) {
                jSONObject.put("n", str3);
                jSONObject.put("v", str4);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", str);
            jSONObject2.put("name", str2);
            jSONObject2.put("value", jSONArray);
            return jSONObject2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            if (!this.f357l) {
                return null;
            }
            Init.show("筛选getRType部分出错：" + e.toString());
            return null;
        }
    }
}
