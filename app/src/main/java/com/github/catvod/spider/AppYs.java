package com.github.catvod.spider;
import com.github.catvod.spider.support.p116a.C2137a;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0405ku;
import com.github.catvod.spider.support.p002A0.AbstractC0710wb;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class AppYs extends Spider {

    /* JADX INFO: renamed from: a */
    public static HashMap f123a;

    /* JADX INFO: renamed from: b */
    public static final Object f124b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Pattern f125c = Pattern.compile("api\\.php/.*?/vod");

    /* JADX INFO: renamed from: d */
    public static final Pattern f126d = Pattern.compile("api\\.php/.+?\\.vod");

    /* JADX INFO: renamed from: e */
    public static final Pattern f127e = Pattern.compile("/.+\\?.+=");

    /* JADX INFO: renamed from: f */
    public static final Pattern f128f = Pattern.compile(".*(url|v|vid|php\\?id)=");

    /* JADX INFO: renamed from: g */
    public static final Pattern f129g = Pattern.compile("https?://[^/]*");

    /* JADX INFO: renamed from: h */
    public static final Pattern[] f130h = {Pattern.compile("jx\\.+huimaojia\\.+com/player"), Pattern.compile("py\\.+789pan\\.+cn/player/tm\\.php\\?url="), Pattern.compile("ztys\\.+waruanzy\\.+com/player/\\?url="), Pattern.compile("yingshi\\.+waruanzy\\.+com/789pan/\\?url="), Pattern.compile("vip\\.+parwix\\.+com:4433/player/\\?url="), Pattern.compile("api\\.+cxitco\\.+cn"), Pattern.compile("/vip\\.+renrenmi.cc"), Pattern.compile("yanbing\\.+parwix\\.+com:4433/player"), Pattern.compile("json\\.+cantin\\.+cc/apijson\\.php"), Pattern.compile("ffdm\\.+miaoletv\\.+com/\\?url="), Pattern.compile("vip\\.+sylwl\\.+cn/api/\\?key="), Pattern.compile("jx\\.+dikotv\\.+com/\\?url="), Pattern.compile("zly\\.+xjqxz\\.+top/player/\\?url="), Pattern.compile("5znn\\.+xyz/m3u8\\.+php"), Pattern.compile("uid=1735&my="), Pattern.compile("api\\.+xkvideo\\.+design/m3u8\\.+php\\?url="), Pattern.compile("play\\.+szbodankyy\\.+com/xxoocnmb"), Pattern.compile("vip\\.+fj6080\\.+xyz/player/\\?url="), Pattern.compile("a\\.+dxzj88\\.+com/jiexi"), Pattern.compile("host\\.+q-q\\.+wang/api"), Pattern.compile("保佑")};

    /* JADX INFO: renamed from: i */
    public static final Pattern[] f131i = {Pattern.compile("player=new"), Pattern.compile("<div id=\"video\""), Pattern.compile("<div id=\"[^\"]*?player\""), Pattern.compile("//视频链接"), Pattern.compile("HlsJsPlayer\\("), Pattern.compile("<iframe[\\s\\S]*?src=\"[^\"]+?\""), Pattern.compile("<video[\\s\\S]*?src=\"[^\"]+?\"")};

    /* JADX INFO: renamed from: j */
    public String f132j = "";

    /* JADX INFO: renamed from: k */
    public final HashMap f133k = new HashMap();

    /* JADX INFO: renamed from: l */
    public static void m438l(JSONObject jSONObject, String str, ArrayList arrayList) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    m438l((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        m438l(jSONArray.getJSONObject(i), str, arrayList);
                    }
                }
            } catch (JSONException e) {
                SpiderDebug.log(e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m439m(String str, JSONObject jSONObject) throws JSONException {
        String strOptString;
        String str2;
        if (!str.contains("baidu.com")) {
            jSONObject.put("parse", 1);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", str);
            return;
        }
        String str3 = str.split("wd=")[1];
        if (str3.contains("duoduozy.com") || str3.contains("suoyo.cc")) {
            JSONObject jSONObject2 = new JSONObject(AbstractC0771yi.m1889k("https://www.6080kan.cc/app.php?url=".concat(str3), null));
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", jSONObject2.getString("url"));
            jSONObject.put("header", "{\"User-Agent\":\" Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.81 Safari/537.36 SE 2.X MetaSr 1.0\",\"referer\":\" https://player.duoduozy.com\",\"origin\":\" https://dp.duoduozy.com\",\"Host\":\" cache.m3u8.suoyo.cc\"}");
            return;
        }
        if (str3.contains("xfy")) {
            JSONObject jSONObject3 = new JSONObject(AbstractC0771yi.m1889k(str3, null));
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", jSONObject3.getString("url"));
            jSONObject.put("header", "{\"referer\":\" appguapi.lihaoyun.top:11543\",\"User-Agent\":\" Dart/2.14 (dart:io)\"}}");
            return;
        }
        if (str3.contains("api.iopenyun.com:88")) {
            if (!str3.contains("html")) {
                jSONObject.put("parse", 1);
                jSONObject.put("playUrl", "");
                jSONObject.put("url", str3);
                jSONObject.put("ua", "Mozilla/5.0 Windows10");
                jSONObject.put("header", "{\"Referer\":\"https://user.iopenyun.com:520/user/video/\"}");
                return;
            }
            Object string = new JSONObject(AbstractC0771yi.m1889k("https://api.m3u8.tv:5678/home/api?type=ys&uid=233711&key=dgilouvFKNRSWX2467&url=" + str3.split("=")[1], null)).getString("url");
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", string);
            return;
        }
        if (str3.contains("cat.wkfile.com")) {
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", str3);
            jSONObject.put("header", "{\"User-Agent\":\" Lavf/58.12.100\",\"Referer\":\" wkfile.com\"}");
            return;
        }
        if (str3.contains("=") || str3.indexOf(".m3u8") <= 15) {
            String str4 = ".mp4";
            if (str3.indexOf(".mp4") <= 15 && !str3.contains("/obj/tos")) {
                if (!str3.contains("=")) {
                    jSONObject.put("parse", 0);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", str3);
                    return;
                }
                HashMap mapM1762f = AbstractC0710wb.m1762f("User-Agent", "Mozilla/5.0 Android");
                TreeMap treeMap = new TreeMap();
                String strM1892n = AbstractC0771yi.m1892n(str3, mapM1762f, treeMap);
                String strM1886h = AbstractC0771yi.m1886h(treeMap);
                if (strM1886h != null) {
                    String str5 = "";
                    String strM1886h2 = strM1886h;
                    String strM1892n2 = strM1892n;
                    while (true) {
                        str2 = strM1892n2;
                        if (strM1886h2 == null) {
                            strM1886h2 = str5;
                            break;
                        }
                        String str6 = str4;
                        if (strM1886h2.indexOf(str4) > 30) {
                            break;
                        }
                        mapM1762f.put("User-Agent", "Mozilla/5.0 Android");
                        strM1892n2 = AbstractC0771yi.m1892n(strM1886h2, mapM1762f, treeMap);
                        str5 = strM1886h2;
                        strM1886h2 = AbstractC0771yi.m1886h(treeMap);
                        str4 = str6;
                    }
                    if (!strM1886h2.contains("=http") && !strM1886h2.contains("url=")) {
                        if (!str3.contains("www.mgtv.com")) {
                            jSONObject.put("parse", 0);
                            jSONObject.put("playUrl", "");
                            jSONObject.put("url", strM1886h2);
                            return;
                        } else {
                            jSONObject.put("parse", 0);
                            jSONObject.put("playUrl", "");
                            jSONObject.put("url", strM1886h2);
                            jSONObject.put("header", "{\"User-Agent\":\" Mozilla/5.0\", \"Referer\":\" \"}");
                            return;
                        }
                    }
                    if (str2.contains("<html")) {
                        jSONObject.put("parse", 1);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", strM1886h2);
                        return;
                    }
                    Object string2 = new JSONObject(str2).getString("url");
                    jSONObject.put("parse", 0);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", string2);
                    if (strM1886h2.contains("mgtv.com")) {
                        jSONObject.put("header", "{\"User-Agent\":\" Mozilla/5.0\", \"Referer\":\" \"}");
                        return;
                    } else {
                        strM1886h2.contains("bilibili.com");
                        return;
                    }
                }
                if (strM1892n.contains("<html")) {
                    Pattern[] patternArr = f131i;
                    int length = patternArr.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = length;
                        if (patternArr[i].matcher(strM1892n).find()) {
                            jSONObject.put("parse", 1);
                            jSONObject.put("playUrl", "");
                            jSONObject.put("url", str3);
                            return;
                        }
                        i++;
                        length = i2;
                    }
                    if (str3.split("url=")[1].contains("http")) {
                        jSONObject.put("parse", 1);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", "http://1.117.152.239:39000/?url=" + str3.split("url=")[1]);
                        return;
                    }
                    if (str3.split("url=")[1].contains("renrenmi")) {
                        jSONObject.put("parse", 1);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", "http://www.1080kan.cc/jiexi/rrmi.php?url=" + str3.split("url=")[1]);
                        jSONObject.put("header", "{\"Referer\":\"http://www.1080kan.cc/\"}");
                        return;
                    }
                    String str7 = str3.split("url=")[1];
                    jSONObject.put("parse", 1);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", "https://jx.banyung.xyz:7799/player/?url=" + str3.split("url=")[1]);
                    return;
                }
                try {
                    strOptString = new JSONObject(strM1892n).optString("url");
                } catch (Exception e) {
                    e.printStackTrace();
                    strOptString = "";
                }
                if (strOptString.length() > 1) {
                    if (str3.contains("mgtv.com")) {
                        jSONObject.put("parse", 0);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", strOptString);
                        jSONObject.put("header", "{\"User-Agent\":\" Mozilla/5.0\", \"Referer\":\" \"}");
                        return;
                    }
                    if (str3.contains("bilibili.com")) {
                        jSONObject.put("parse", 0);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", strOptString);
                        return;
                    } else {
                        jSONObject.put("parse", 0);
                        jSONObject.put("playUrl", "");
                        jSONObject.put("url", strOptString);
                        return;
                    }
                }
                if (str3.split("url=")[1].contains("http")) {
                    jSONObject.put("parse", 1);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", "http://1.117.152.239:39000/?url=" + str3.split("url=")[1]);
                    return;
                }
                if (str3.split("url=")[1].contains("renrenmi")) {
                    jSONObject.put("parse", 1);
                    jSONObject.put("playUrl", "");
                    jSONObject.put("url", "http://www.1080kan.cc/jiexi/rrmi.php?url=" + str3.split("url=")[1]);
                    jSONObject.put("header", "{\"Referer\":\"http://www.1080kan.cc/\"}");
                    return;
                }
                String str8 = str3.split("url=")[1];
                jSONObject.put("parse", 1);
                jSONObject.put("playUrl", "");
                jSONObject.put("url", "https://jx.banyung.xyz:7799/player/?url=" + str3.split("url=")[1]);
                return;
            }
        }
        if (str3.contains("hsl.ysgc.xyz")) {
            Object string3 = new JSONObject(AbstractC0771yi.m1889k("https://jx.ysgc.xyz/?url=".concat(str3), null)).getString("url");
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", string3);
            jSONObject.put("header", "{\"Referer\":\" https://ysgc.cc\"}");
            return;
        }
        if (str3.contains("1.ruifenglb.com")) {
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", str3);
            jSONObject.put("header", "{\"Referer\":\" https://1.ruifenglb.com\"}");
            return;
        }
        Matcher matcher = Pattern.compile(".*(http.*)").matcher(str3);
        if (matcher.find()) {
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", matcher.group(1));
        } else {
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            jSONObject.put("url", str3);
        }
    }

    /* JADX INFO: renamed from: n */
    public static HashMap m440n(String str) {
        String str2;
        HashMap map = new HashMap();
        if (str.contains("api.php/app") || str.contains("xgapp") || str.contains("freekan")) {
            str2 = "Dart/2.14 (dart:io)";
        } else if (str.contains("zsb") || str.contains("fkxs") || str.contains("xays") || str.contains("xcys") || str.contains("szys") || str.contains("dxys") || str.contains("ytys") || str.contains("qnys")) {
            str2 = "Dart/2.15 (dart:io)";
        } else {
            str2 = str.contains(".vod") ? "okhttp/4.1.0" : "Dalvik/2.1.0";
        }
        map.put("User-Agent", str2);
        return map;
    }

    /* JADX INFO: renamed from: o */
    public static String m441o(String str, String str2, String str3) {
        if (str.contains("xgapp") || str.contains("api.php/app/") || str.contains(".vod")) {
            if (str3.indexOf(".m3u8") > 15 || str3.indexOf(".mp4") > 15 || str3.contains("/obj/tos")) {
                if (!str3.contains("url=")) {
                    return "https://www.baidu.com/s?wd=".concat(str3);
                }
                return "https://www.baidu.com/s?wd=" + str3.split("url=")[1];
            }
            if (!str2.contains("url=") && str3.contains("RongXingVR")) {
                return "https://www.baidu.com/s?wd=https://fast.rongxingvr.cn:8866/api/?key=nShWumGdMIbTwngTbI&url=".concat(str3);
            }
            if (!str2.contains("url=") && str3.contains("LT")) {
                return "https://www.baidu.com/s?wd=https://f7.pyxddc.com/bcjx/4k.php?url=".concat(str3);
            }
            if (!str2.contains("url=") && str3.contains("renrenmi")) {
                return "https://www.baidu.com/s?wd=https://kuba.renrenmi.cc:2266/api/?key=Y6UYLYtjImTCKe98JD&url=".concat(str3);
            }
            if (!str2.contains("url=") && str3.contains(".html")) {
                return "https://www.baidu.com/s?wd=http://1.117.152.239:39000/?url=".concat(str3);
            }
            if (str3.contains("xfy")) {
                return "https://www.baidu.com/s?wd=http://jiexi.yunl.cc/api/?key=xYNESYSvHp1DV2ckKs&url=".concat(str3);
            }
            return "https://www.baidu.com/s?wd=" + str2 + str3;
        }
        if (!f125c.matcher(str).find()) {
            return "https://www.baidu.com/s?wd=" + str3;
        }
        if (str3.indexOf(".m3u8") > 15 || str3.indexOf(".mp4") > 15 || str3.contains("/obj/tos")) {
            if (!str3.contains("url=")) {
                return "https://www.baidu.com/s?wd=".concat(str3);
            }
            return "https://www.baidu.com/s?wd=" + str3.split("url=")[1];
        }
        if (str3.contains("xfy")) {
            if (!str3.contains("url=")) {
                return "https://www.baidu.com/s?wd=https://json.hfyrw.com/mao.go?url=".concat(str3);
            }
            return "https://www.baidu.com/s?wd=http://cache.dmtt.xyz/xfyjx/xfyjx.php?url=" + str3.split("url=")[1];
        }
        if (str3.contains("www.bilibili.com")) {
            return "https://www.baidu.com/s?wd=https://jx.parwix.com:4433/player/?url=" + str3.split("url=")[1];
        }
        if (str.contains("zhenfy") || str.contains("cztv") || str.contains("1.14.63.101") || str.contains("fit:8") || str.contains("diliktv.xyz") || str.contains("ppzhu.vip") || str.contains("api.8d8q.com") || str.contains("haokanju1.cc") || str.contains("cztv")) {
            return "https://www.baidu.com/s?wd=" + str3 + "&app=10000&account=272775028&password=qq272775028";
        }
        if (!str.contains("lxyyy") && !str.contains("j.zjj.life") && !str.contains("lktv") && !str.contains("0818tv") && !str.contains("ruoxinew")) {
            return "https://www.baidu.com/s?wd=".concat(str3);
        }
        return "https://www.baidu.com/s?wd=https://play.tkys.tv/?url=" + str3.split("url=")[1];
    }

    /* JADX INFO: renamed from: p */
    public static String m442p(String str, String str2) {
        if (str.contains(".vod")) {
            if (str.contains("iopenyun.com")) {
                return str + "/list?wd=" + str2 + "&page=";
            }
            return str + "?wd=" + str2 + "&page=";
        }
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str + "search?text=" + str2 + "&pg=";
        }
        if (!f125c.matcher(str).find()) {
            return "";
        }
        if (str.contains("esellauto") || str.contains("1.14.63.101") || str.contains("zjys") || str.contains("dcd") || str.contains("lxue") || str.contains("weetai.cn") || str.contains("haokanju1") || str.contains("fit:8") || str.contains("zjj.life") || str.contains("love9989") || str.contains("8d8q") || str.contains("lk.pxun") || str.contains("hgyx") || str.contains("521x5") || str.contains("lxyyy") || str.contains("0818tv") || str.contains("diyoui") || str.contains("diliktv") || str.contains("ppzhu") || str.contains("aitesucai") || str.contains("zz.ci") || str.contains("chxjon") || str.contains("watchmi") || str.contains("vipbp") || str.contains("bhtv") || str.contains("xfykl")) {
            return str + "?ac=list&wd=" + str2 + "&page=";
        }
        return str + "?ac=list&zm=" + str2 + "&page=";
    }

    /* JADX INFO: renamed from: q */
    public static boolean m443q(String str) {
        return str.equals("伦理") || str.equals("情色") || str.equals("福利");
    }

    /* JADX INFO: renamed from: r */
    public static String m444r(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return TextUtils.join(",", arrayList);
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m445s(String str) {
        synchronized (f124b) {
            try {
                if (f123a == null) {
                    HashMap map = new HashMap();
                    f123a = map;
                    map.put("youku", "优酷M");
                    f123a.put("qq", "腾讯M");
                    f123a.put("iqiyi", "爱奇艺M");
                    f123a.put("qiyi", "奇艺M");
                    f123a.put("letv", "乐视M");
                    f123a.put("sohu", "搜狐M");
                    f123a.put("tudou", "土豆M");
                    f123a.put("pptv", "PPTVM");
                    f123a.put("mgtv", "芒果TVM");
                    f123a.put("wasu", "华数M");
                    f123a.put("bilibili", "哔哩M");
                }
                if (!f123a.containsKey(str)) {
                    return str;
                }
                return (String) f123a.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        int i;
        JSONArray jSONArray;
        try {
            String str5 = this.f132j;
            str3 = "";
            try {
                StringBuilder sb = new StringBuilder();
                String str6 = "vod_id";
                sb.append(m447u(str5));
                sb.append(str);
                if (str5.contains("api.php/app") || str5.contains("xgapp")) {
                    str4 = "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&limit=18&pg=#PN#";
                } else {
                    str4 = str5.contains(".vod") ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&by=排序&limit=18&page=#PN#" : "&page=#PN#&area=筛选area&type=筛选class&start=筛选year";
                }
                sb.append(str4);
                String strReplace = sb.toString().replace("#PN#", str2).replace("筛选class", (map == null || !map.containsKey("class")) ? str3 : map.get("class")).replace("筛选area", (map == null || !map.containsKey("area")) ? str3 : map.get("area")).replace("筛选lang", (map == null || !map.containsKey("lang")) ? str3 : map.get("lang")).replace("筛选year", (map == null || !map.containsKey("year")) ? str3 : map.get("year")).replace("排序", (map == null || !map.containsKey("排序")) ? str3 : map.get("排序"));
                SpiderDebug.log(strReplace);
                JSONObject jSONObject = new JSONObject(AbstractC0771yi.m1889k(strReplace, m440n(strReplace)));
                try {
                    if (jSONObject.has("totalpage") && (jSONObject.get("totalpage") instanceof Integer)) {
                        i = jSONObject.getInt("totalpage");
                    } else if (jSONObject.has("pagecount") && (jSONObject.get("pagecount") instanceof Integer)) {
                        i = jSONObject.getInt("pagecount");
                    } else if (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("total") && (jSONObject.getJSONObject("data").get("total") instanceof Integer) && jSONObject.getJSONObject("data").has("limit") && (jSONObject.getJSONObject("data").get("limit") instanceof Integer)) {
                        int i2 = jSONObject.getJSONObject("data").getInt("limit");
                        int i3 = jSONObject.getJSONObject("data").getInt("total");
                        i = i3 % i2 == 0 ? i3 / i2 : (i3 / i2) + 1;
                    } else {
                        i = Integer.MAX_VALUE;
                    }
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
                JSONArray jSONArray2 = new JSONArray();
                if (jSONObject.has("list") && (jSONObject.get("list") instanceof JSONArray)) {
                    jSONArray = jSONObject.getJSONArray("list");
                } else if (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("list") && (jSONObject.getJSONObject("data").get("list") instanceof JSONArray)) {
                    jSONArray = jSONObject.getJSONObject("data").getJSONArray("list");
                } else {
                    jSONArray = (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONArray)) ? jSONObject.getJSONArray("data") : null;
                }
                if (jSONArray != null) {
                    int i4 = 0;
                    while (i4 < jSONArray.length()) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        String str7 = str6;
                        if (jSONObject2.has(str7)) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(str7, jSONObject2.getString(str7));
                            jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                            jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                            jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                            jSONArray2.put(jSONObject3);
                        } else {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(str7, jSONObject2.getString("nextlink"));
                            jSONObject4.put("vod_name", jSONObject2.getString("title"));
                            jSONObject4.put("vod_pic", jSONObject2.getString("pic"));
                            jSONObject4.put("vod_remarks", jSONObject2.getString("state"));
                            jSONArray2.put(jSONObject4);
                        }
                        i4++;
                        str6 = str7;
                    }
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("page", str2);
                jSONObject5.put("pagecount", i);
                jSONObject5.put("limit", 90);
                jSONObject5.put("total", Integer.MAX_VALUE);
                jSONObject5.put("list", jSONArray2);
                return jSONObject5.toString();
            } catch (Exception e2) { Exception SpiderDebug.log(e2);
                return str3;
            }
        } catch (Exception e3) { Exception /*e=e3*/
            str3 = "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            String str = this.f132j;
            String str2 = m451y(str) + list.get(0);
            SpiderDebug.log(str2);
            JSONObject jSONObject = new JSONObject(AbstractC0771yi.m1889k(str2, m440n(str2)));
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            m446t(str, jSONObject, jSONObject3, list.get(0));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("list", jSONArray);
            String string = jSONObject2.toString();
            C2137a.parseJsonAndSave(string);
            return string;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public String homeContent(boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        JSONArray jSONArray;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        AppYs appYs = this;
        String str14 = "";
        String str15 = "筛选";
        try {
            String strM448v = appYs.m448v(appYs.f132j);
            String str16 = "=";
            String str17 = "\\+";
            String str18 = "\n";
            JSONArray jSONArray2 = null;
            String str19 = "type_id";
            String str20 = "type_name";
            if (strM448v.isEmpty()) {
                String[] strArrSplit = appYs.m449w(strM448v, null).split("\n")[0].split("\\+");
                jSONArray2 = new JSONArray();
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=");
                    if (strArrSplit2.length >= 2) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type_name", strArrSplit2[0].trim());
                        jSONObject.put("type_id", strArrSplit2[1].trim());
                        jSONArray2.put(jSONObject);
                    }
                }
            } else {
                SpiderDebug.log(strM448v);
                JSONObject jSONObject2 = new JSONObject(AbstractC0771yi.m1889k(strM448v, m440n(strM448v)));
                if (jSONObject2.has("list") && (jSONObject2.get("list") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONArray("list");
                } else if (jSONObject2.has("data") && (jSONObject2.get("data") instanceof JSONObject) && jSONObject2.getJSONObject("data").has("list") && (jSONObject2.getJSONObject("data").get("list") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONObject("data").getJSONArray("list");
                } else if (jSONObject2.has("data") && (jSONObject2.get("data") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONArray("data");
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            if (jSONArray2 != null) {
                int i2 = 0;
                while (i2 < jSONArray2.length()) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                    JSONArray jSONArray4 = jSONArray2;
                    String string = jSONObject4.getString(str20);
                    if (m443q(string)) {
                        str2 = str15;
                        str = str14;
                        jSONArray = jSONArray3;
                        strM448v = strM448v;
                        str3 = str16;
                        str4 = str17;
                        str5 = str18;
                        str6 = str19;
                        str7 = str20;
                    } else {
                        String string2 = jSONObject4.getString(str19);
                        JSONArray jSONArray5 = jSONArray3;
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put(str19, string2);
                        jSONObject5.put(str20, string);
                        JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("type_extend");
                        if (z) {
                            String[] strArrSplit3 = appYs.m449w(strM448v, jSONObjectOptJSONObject).split(str18);
                            Object jSONArray6 = new JSONArray();
                            for (Object IsEmpty = strM448v.isEmpty(); IsEmpty < strArrSplit3.length; IsEmpty++) {
                                String strTrim = strArrSplit3[IsEmpty].trim();
                                if (strTrim.isEmpty()) {
                                    str8 = str15;
                                    str10 = str14;
                                    str11 = str16;
                                    str18 = str18;
                                    str12 = str19;
                                    str13 = str20;
                                } else {
                                    String[] strArrSplit4 = strTrim.split(str17);
                                    String strTrim2 = strArrSplit4[0].trim();
                                    if (strTrim2.contains(str15)) {
                                        String strReplace = strTrim2.replace(str15, str14);
                                        if (strReplace.equals("class")) {
                                            strTrim2 = "类型";
                                            str8 = str15;
                                        } else {
                                            str8 = str15;
                                            if (strReplace.equals("area")) {
                                                strTrim2 = "地区";
                                            } else if (strReplace.equals("lang")) {
                                                strTrim2 = "语言";
                                            } else if (strReplace.equals("year")) {
                                                strTrim2 = "年份";
                                            }
                                        }
                                        str9 = strTrim2;
                                        strTrim2 = strReplace;
                                    } else {
                                        str8 = str15;
                                        str9 = strTrim2;
                                    }
                                    Object jSONObject6 = new JSONObject();
                                    jSONObject6.put("key", strTrim2);
                                    jSONObject6.put("name", str9);
                                    JSONArray jSONArray7 = new JSONArray();
                                    int i3 = 1;
                                    while (i3 < strArrSplit4.length) {
                                        JSONObject jSONObject7 = new JSONObject();
                                        String[] strArr = strArrSplit4;
                                        String strTrim3 = strArrSplit4[i3].trim();
                                        String str21 = str19;
                                        int iIndexOf = strTrim3.indexOf(str16);
                                        String str22 = str16;
                                        String str23 = str20;
                                        String str24 = str14;
                                        if (iIndexOf != -1) {
                                            String strSubstring = strTrim3.substring(0, iIndexOf);
                                            if (!m443q(strSubstring)) {
                                                jSONObject7.put("n", strSubstring.trim());
                                                jSONObject7.put("v", strTrim3.substring(iIndexOf + 1).trim());
                                                jSONArray7.put(jSONObject7);
                                            }
                                        } else if (!m443q(strTrim3)) {
                                            jSONObject7.put("n", strTrim3);
                                            jSONObject7.put("v", strTrim3);
                                            jSONArray7.put(jSONObject7);
                                        }
                                        i3++;
                                        str19 = str21;
                                        strArrSplit4 = strArr;
                                        str16 = str22;
                                        str20 = str23;
                                        str14 = str24;
                                    }
                                    str10 = str14;
                                    str11 = str16;
                                    str12 = str19;
                                    str13 = str20;
                                    jSONObject6.put("value", jSONArray7);
                                    jSONArray6.put(jSONObject6);
                                }
                                str18 = str18;
                                str17 = str17;
                                str15 = str8;
                                strArrSplit3 = strArrSplit3;
                                str19 = str12;
                                str16 = str11;
                                str20 = str13;
                                str14 = str10;
                            }
                            str2 = str15;
                            str = str14;
                            str3 = str16;
                            str4 = str17;
                            str5 = str18;
                            str6 = str19;
                            str7 = str20;
                            if (!jSONObject3.has("filters")) {
                                jSONObject3.put("filters", new JSONObject());
                            }
                            jSONObject3.getJSONObject("filters").put(string2, jSONArray6);
                        } else {
                            str2 = str15;
                            str = str14;
                            str3 = str16;
                            str4 = str17;
                            str5 = str18;
                            str6 = str19;
                            str7 = str20;
                        }
                        jSONArray = jSONArray5;
                        jSONArray.put(jSONObject5);
                    }
                    try {
                        i2++;
                        appYs = this;
                        jSONArray3 = jSONArray;
                        jSONArray2 = jSONArray4;
                        strM448v = strM448v;
                        str18 = str5;
                        str17 = str4;
                        str15 = str2;
                        str19 = str6;
                        str16 = str3;
                        str20 = str7;
                        str14 = str;
                    } catch (Exception e) {
                        e = e;
                        SpiderDebug.log(e);
                        return str;
                    }
                }
            }
            str = str14;
            jSONObject3.put("class", jSONArray3);
            return jSONObject3.toString();
        } catch (Exception e2) { Exception /*e=e2*/
            str = str14;
        }
    }

    public String homeVideoContent() {
        boolean z;
        try {
            String str = this.f132j;
            String strConcat = (str.contains("api.php/app") || str.contains("xgapp")) ? str.concat("index_video?token=") : str.contains(".vod") ? str.concat("/vodPhbAll") : "";
            if (strConcat.isEmpty()) {
                strConcat = m447u(str) + "movie&page=1&area=&type=&start=";
                z = true;
            } else {
                z = false;
            }
            SpiderDebug.log(strConcat);
            JSONObject jSONObject = new JSONObject(AbstractC0771yi.m1889k(strConcat, m440n(strConcat)));
            JSONArray jSONArray = new JSONArray();
            if (z) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("data");
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", jSONObject2.getString("nextlink"));
                    jSONObject3.put("vod_name", jSONObject2.getString("title"));
                    jSONObject3.put("vod_pic", jSONObject2.getString("pic"));
                    jSONObject3.put("vod_remarks", jSONObject2.getString("state"));
                    jSONArray.put(jSONObject3);
                }
            } else {
                ArrayList<JSONArray> arrayList = new ArrayList();
                m438l(jSONObject, "vlist", arrayList);
                if (arrayList.isEmpty()) {
                    m438l(jSONObject, "vod_list", arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (JSONArray jSONArray3 : arrayList) {
                    for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                        JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                        String string = jSONObject4.getString("vod_id");
                        if (!arrayList2.contains(string)) {
                            arrayList2.add(string);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("vod_id", string);
                            jSONObject5.put("vod_name", jSONObject4.getString("vod_name"));
                            jSONObject5.put("vod_pic", jSONObject4.getString("vod_pic"));
                            jSONObject5.put("vod_remarks", jSONObject4.getString("vod_remarks"));
                            jSONArray.put(jSONObject5);
                        }
                    }
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("list", jSONArray);
            return jSONObject6.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.f132j = str;
    }

    public boolean isVideoFormat(String str) {
        return AbstractC0405ku.m1361e(str);
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String str3 = this.f132j;
            String strM441o = m441o(str3, m450x(str3, str), str2);
            JSONObject jSONObject = new JSONObject();
            m439m(strM441o, jSONObject);
            return C2137a.addDanmaku(jSONObject.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        JSONArray jSONArray;
        try {
            String strM442p = m442p(this.f132j, URLEncoder.encode(str));
            JSONObject jSONObject = new JSONObject(AbstractC0771yi.m1889k(strM442p, m440n(strM442p)));
            JSONArray jSONArray2 = new JSONArray();
            if (jSONObject.has("list") && (jSONObject.get("list") instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONArray("list");
            } else if (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("list") && (jSONObject.getJSONObject("data").get("list") instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONObject("data").getJSONArray("list");
            } else {
                jSONArray = (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONArray)) ? jSONObject.getJSONArray("data") : null;
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2.has("vod_id")) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("vod_id", jSONObject2.getString("vod_id"));
                        jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                        jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                        jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                        jSONArray2.put(jSONObject3);
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("vod_id", jSONObject2.getString("nextlink"));
                        jSONObject4.put("vod_name", jSONObject2.getString("title"));
                        jSONObject4.put("vod_pic", jSONObject2.getString("pic"));
                        jSONObject4.put("vod_remarks", jSONObject2.getString("state"));
                        jSONArray2.put(jSONObject4);
                    }
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("list", jSONArray2);
            return jSONObject5.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m446t(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2) throws JSONException {
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONArray jSONArray;
        ArrayList arrayList3;
        String str3;
        Pattern[] patternArr;
        Pattern pattern;
        String[] strArr;
        int i;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean zContains = str.contains("api.php/app/");
        String str4 = ",";
        HashMap map = this.f133k;
        CharSequence charSequence = "jpg.hou.lu/jm/za/index.php";
        String str5 = "parse_api";
        ArrayList arrayList6 = arrayList4;
        String str6 = "url";
        ArrayList arrayList7 = arrayList5;
        String str7 = "name";
        if (!zContains) {
            HashMap map2 = map;
            CharSequence charSequence2 = charSequence;
            String str8 = str5;
            String str9 = str6;
            if (str.contains("xgapp")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("data").getJSONObject("vod_info");
                jSONObject2.put("vod_id", jSONObject3.optString("vod_id", str2));
                jSONObject2.put("vod_name", jSONObject3.getString("vod_name"));
                jSONObject2.put("vod_pic", jSONObject3.getString("vod_pic"));
                jSONObject2.put("type_name", jSONObject3.optString("vod_class"));
                jSONObject2.put("vod_year", jSONObject3.optString("vod_year"));
                jSONObject2.put("vod_area", jSONObject3.optString("vod_area"));
                jSONObject2.put("vod_remarks", jSONObject3.optString("vod_remarks"));
                jSONObject2.put("vod_actor", jSONObject3.optString("vod_actor"));
                jSONObject2.put("vod_director", jSONObject3.optString("vod_director"));
                jSONObject2.put("vod_content", jSONObject3.optString("vod_content"));
                JSONArray jSONArray2 = jSONObject3.getJSONArray("vod_url_with_player");
                int i2 = 0;
                while (i2 < jSONArray2.length()) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                    String str10 = str7;
                    String strM445s = m445s(jSONObject4.getString(str10));
                    ArrayList arrayList8 = arrayList7;
                    arrayList8.add(strM445s);
                    String str11 = str9;
                    ArrayList arrayList9 = arrayList6;
                    arrayList9.add(jSONObject4.getString(str11));
                    String str12 = str8;
                    String strOptString = jSONObject4.optString(str12);
                    CharSequence charSequence3 = charSequence2;
                    if (strOptString.contains(charSequence3)) {
                        strOptString = "http://vip.mengx.vip/home/api?type=ys&uid=3249696&key=aefqrtuwxyEFHKNOQY&url=";
                    }
                    HashMap map3 = map2;
                    map3.put(strM445s, strOptString);
                    i2++;
                    str7 = str10;
                    arrayList7 = arrayList8;
                    str9 = str11;
                    str8 = str12;
                    arrayList6 = arrayList9;
                    charSequence2 = charSequence3;
                    map2 = map3;
                }
            } else {
                ArrayList arrayList10 = arrayList6;
                ArrayList arrayList11 = arrayList7;
                HashMap map4 = map2;
                String str13 = str9;
                if (str.contains(".vod")) {
                    JSONObject jSONObject5 = jSONObject.getJSONObject("data");
                    jSONObject2.put("vod_id", jSONObject5.optString("vod_id", str2));
                    jSONObject2.put("vod_name", jSONObject5.getString("vod_name"));
                    jSONObject2.put("vod_pic", jSONObject5.getString("vod_pic"));
                    jSONObject2.put("type_name", jSONObject5.optString("vod_class"));
                    jSONObject2.put("vod_year", jSONObject5.optString("vod_year"));
                    jSONObject2.put("vod_area", jSONObject5.optString("vod_area"));
                    jSONObject2.put("vod_remarks", jSONObject5.optString("vod_remarks"));
                    jSONObject2.put("vod_actor", jSONObject5.optString("vod_actor"));
                    jSONObject2.put("vod_director", jSONObject5.optString("vod_director"));
                    jSONObject2.put("vod_content", jSONObject5.optString("vod_content"));
                    JSONArray jSONArray3 = jSONObject5.getJSONArray("vod_play_list");
                    int i3 = 0;
                    while (i3 < jSONArray3.length()) {
                        JSONObject jSONObject6 = jSONArray3.getJSONObject(i3);
                        String strM445s2 = m445s(jSONObject6.getJSONObject("player_info").getString("show"));
                        ArrayList arrayList12 = arrayList11;
                        arrayList12.add(strM445s2);
                        String str14 = str13;
                        ArrayList arrayList13 = arrayList10;
                        arrayList13.add(jSONObject6.getString(str14));
                        try {
                            ArrayList arrayList14 = new ArrayList();
                            str3 = str4;
                            try {
                                String[] strArrSplit = jSONObject6.getJSONObject("player_info").optString("parse").split(str3);
                                String[] strArrSplit2 = jSONObject6.getJSONObject("player_info").optString("parse2").split(str3);
                                int length = strArrSplit.length;
                                int i4 = 0;
                                while (true) {
                                    patternArr = f130h;
                                    pattern = f127e;
                                    if (i4 >= length) {
                                        break;
                                    }
                                    jSONArray = jSONArray3;
                                    try {
                                        String str15 = strArrSplit[i4];
                                        if (pattern.matcher(str15).find()) {
                                            int length2 = patternArr.length;
                                            i = length;
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 >= length2) {
                                                    arrayList3 = arrayList13;
                                                    arrayList14.add(str15);
                                                    break;
                                                }
                                                arrayList3 = arrayList13;
                                                try {
                                                    if (patternArr[i5].matcher(str15).find()) {
                                                        break;
                                                    }
                                                    i5++;
                                                    arrayList13 = arrayList3;
                                                } catch (Exception e) {
                                                    e = e;
                                                    map4 = map4;
                                                    SpiderDebug.log(e);
                                                    i3++;
                                                    map4 = map4;
                                                    arrayList11 = arrayList12;
                                                    str4 = str3;
                                                    str13 = str14;
                                                    arrayList10 = arrayList3;
                                                    jSONArray3 = jSONArray;
                                                }
                                            }
                                        } else {
                                            i = length;
                                            arrayList3 = arrayList13;
                                        }
                                        i4++;
                                        jSONArray3 = jSONArray;
                                        length = i;
                                        arrayList13 = arrayList3;
                                    } catch (Exception e2) { Exception /*e=e2*/
                                        arrayList3 = arrayList13;
                                        map4 = map4;
                                        SpiderDebug.log(e);
                                        i3++;
                                        map4 = map4;
                                        arrayList11 = arrayList12;
                                        str4 = str3;
                                        str13 = str14;
                                        arrayList10 = arrayList3;
                                        jSONArray3 = jSONArray;
                                    }
                                }
                                jSONArray = jSONArray3;
                                arrayList3 = arrayList13;
                                int length3 = strArrSplit2.length;
                                int i6 = 0;
                                while (i6 < length3) {
                                    String str16 = strArrSplit2[i6];
                                    if (pattern.matcher(str16).find()) {
                                        int length4 = patternArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length4) {
                                                strArr = strArrSplit2;
                                                arrayList14.add(str16);
                                                break;
                                            } else {
                                                strArr = strArrSplit2;
                                                if (patternArr[i7].matcher(str16).find()) {
                                                    break;
                                                }
                                                i7++;
                                                strArrSplit2 = strArr;
                                            }
                                        }
                                    } else {
                                        strArr = strArrSplit2;
                                    }
                                    i6++;
                                    strArrSplit2 = strArr;
                                }
                                if (arrayList14.size() <= 0 || !((String) arrayList14.get(0)).contains("=")) {
                                    map4 = map4;
                                    map4.put(strM445s2, "http://1.117.152.239:39000/?url=");
                                } else {
                                    String string = (String) arrayList14.get(0);
                                    boolean zContains2 = string.contains("http");
                                    Pattern pattern2 = f128f;
                                    try {
                                        if (zContains2) {
                                            Matcher matcher = pattern2.matcher(string);
                                            if (matcher.find()) {
                                                string = matcher.group(0).replace("..", ".").replace("vip.aotian.love", "vip.gaotian.love");
                                            }
                                        } else if (string.contains("//")) {
                                            Matcher matcher2 = pattern2.matcher(string);
                                            if (matcher2.find()) {
                                                string = "http:" + matcher2.group(0).replace("..", ".");
                                            }
                                        } else {
                                            Matcher matcher3 = f129g.matcher(str);
                                            if (matcher3.find()) {
                                                try {
                                                    Matcher matcher4 = pattern2.matcher(str);
                                                    if (matcher4.find()) {
                                                        StringBuilder sb = new StringBuilder();
                                                        try {
                                                            sb.append(matcher3.group(0));
                                                            sb.append(matcher4.group(0).replace("..", "."));
                                                            string = sb.toString();
                                                        } catch (Exception e3) { Exception /*e=e3*/
                                                            map4 = map4;
                                                            SpiderDebug.log(e);
                                                            i3++;
                                                            map4 = map4;
                                                            arrayList11 = arrayList12;
                                                            str4 = str3;
                                                            str13 = str14;
                                                            arrayList10 = arrayList3;
                                                            jSONArray3 = jSONArray;
                                                        }
                                                    }
                                                } catch (Exception e4) { Exception /*e=e4*/
                                                }
                                            }
                                            map4.put(strM445s2, string);
                                        }
                                        map4.put(strM445s2, string);
                                    } catch (Exception e5) { Exception SpiderDebug.log(e5);
                                    }
                                }
                            } catch (Exception e6) { Exception /*e=e6*/
                                jSONArray = jSONArray3;
                            }
                        } catch (Exception e7) { Exception /*e=e7*/
                            jSONArray = jSONArray3;
                            arrayList3 = arrayList13;
                            str3 = str4;
                        }
                        i3++;
                        map4 = map4;
                        arrayList11 = arrayList12;
                        str4 = str3;
                        str13 = str14;
                        arrayList10 = arrayList3;
                        jSONArray3 = jSONArray;
                    }
                    arrayList2 = arrayList10;
                    arrayList = arrayList11;
                } else {
                    if (f125c.matcher(str).find()) {
                        jSONObject2.put("vod_id", jSONObject.optString("vod_id", str2));
                        jSONObject2.put("vod_name", jSONObject.getString("title"));
                        jSONObject2.put("vod_pic", jSONObject.getString("img_url"));
                        jSONObject2.put("type_name", m444r(jSONObject.optJSONArray("type")));
                        jSONObject2.put("vod_year", jSONObject.optString("pubtime"));
                        jSONObject2.put("vod_area", m444r(jSONObject.optJSONArray("area")));
                        jSONObject2.put("vod_remarks", jSONObject.optString("trunk"));
                        jSONObject2.put("vod_actor", m444r(jSONObject.optJSONArray("actor")));
                        jSONObject2.put("vod_director", m444r(jSONObject.optJSONArray("director")));
                        jSONObject2.put("vod_content", jSONObject.optString("intro"));
                        JSONObject jSONObject7 = jSONObject.getJSONObject("videolist");
                        Iterator<String> itKeys = jSONObject7.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONArray jSONArray4 = jSONObject7.getJSONArray(next);
                            ArrayList arrayList15 = new ArrayList();
                            for (int i8 = 0; i8 < jSONArray4.length(); i8++) {
                                JSONObject jSONObject8 = jSONArray4.getJSONObject(i8);
                                arrayList15.add(jSONObject8.getString("title") + "$" + jSONObject8.getString(str13));
                            }
                            arrayList11.add(m445s(next));
                            arrayList10.add(TextUtils.join("#", arrayList15));
                        }
                    }
                    arrayList = arrayList11;
                    arrayList2 = arrayList10;
                }
            }
            jSONObject2.put("vod_play_from", TextUtils.join("$$$", arrayList));
            jSONObject2.put("vod_play_url", TextUtils.join("$$$", arrayList2));
        }
        JSONObject jSONObject9 = jSONObject.getJSONObject("data");
        jSONObject2.put("vod_id", jSONObject9.optString("vod_id", str2));
        jSONObject2.put("vod_name", jSONObject9.getString("vod_name"));
        jSONObject2.put("vod_pic", jSONObject9.getString("vod_pic"));
        jSONObject2.put("type_name", jSONObject9.optString("vod_class"));
        jSONObject2.put("vod_year", jSONObject9.optString("vod_year"));
        jSONObject2.put("vod_area", jSONObject9.optString("vod_area"));
        jSONObject2.put("vod_remarks", jSONObject9.optString("vod_remarks"));
        jSONObject2.put("vod_actor", jSONObject9.optString("vod_actor"));
        jSONObject2.put("vod_director", jSONObject9.optString("vod_director"));
        jSONObject2.put("vod_content", jSONObject9.optString("vod_content"));
        JSONArray jSONArray5 = jSONObject9.getJSONArray("vod_url_with_player");
        int i9 = 0;
        while (i9 < jSONArray5.length()) {
            JSONObject jSONObject10 = jSONArray5.getJSONObject(i9);
            String str17 = str7;
            String strM445s3 = m445s(jSONObject10.getString(str17));
            ArrayList arrayList16 = arrayList7;
            arrayList16.add(strM445s3);
            String str18 = str6;
            ArrayList arrayList17 = arrayList6;
            arrayList17.add(jSONObject10.getString(str18));
            String str19 = str5;
            String strOptString2 = jSONObject10.optString(str19);
            CharSequence charSequence4 = charSequence;
            if (strOptString2.contains(charSequence4)) {
                strOptString2 = "http://vip.mengx.vip/home/api?type=ys&uid=3249696&key=aefqrtuwxyEFHKNOQY&url=";
            }
            HashMap map5 = map;
            map5.put(strM445s3, strOptString2);
            i9++;
            str7 = str17;
            arrayList7 = arrayList16;
            str6 = str18;
            str5 = str19;
            arrayList6 = arrayList17;
            charSequence = charSequence4;
            map = map5;
        }
        arrayList2 = arrayList6;
        arrayList = arrayList7;
        jSONObject2.put("vod_play_from", TextUtils.join("$$$", arrayList));
        jSONObject2.put("vod_play_url", TextUtils.join("$$$", arrayList2));
    }

    /* JADX INFO: renamed from: u */
    public final String m447u(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str.contains("dijiaxia") ? "http://www.dijiaxia.com/api.php/app/video?tid=" : str.concat("video?tid=");
        }
        if (str.contains(".vod")) {
            return str.contains("iopenyun") ? str.concat("/list?type=") : str.concat("?type=");
        }
        return str.concat("?ac=list&class=");
    }

    /* JADX INFO: renamed from: v */
    public final String m448v(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str.concat("nav?token=");
        }
        if (str.contains(".vod")) {
            return str.contains("iopenyun.com") ? str.concat("/list?type") : str.concat("/types");
        }
        return "";
    }

    /* JADX INFO: renamed from: w */
    public final String m449w(String str, JSONObject jSONObject) {
        String str2 = "";
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equals("class") || next.equals("area") || next.equals("lang") || next.equals("year")) {
                    try {
                        str2 = str2 + "筛选" + next + "+全部=+" + jSONObject.getString(next).replace(",", Marker.ANY_NON_NULL_MARKER) + "\n";
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        if (!str.contains(".vod")) {
            return (str.contains("api.php/app") || str.contains("xgapp")) ? str2 : "分类+全部=+电影=movie+连续剧=tvplay+综艺=tvshow+动漫=comic+4K=movie_4k+体育=tiyu\n筛选class+全部=+喜剧+爱情+恐怖+动作+科幻+剧情+战争+警匪+犯罪+动画+奇幻+武侠+冒险+枪战+恐怖+悬疑+惊悚+经典+青春+文艺+微电影+古装+历史+运动+农村+惊悚+惊悚+伦理+情色+福利+三级+儿童+网络电影\n筛选area+全部=+大陆+香港+台湾+美国+英国+法国+日本+韩国+德国+泰国+印度+西班牙+加拿大+其他\n筛选year+全部=+2022+2021+2020+2019+2018+2017+2016+2015+2014+2013+2012+2011+2010+2009+2008+2007+2006+2005+2004+2003+2002+2001+2000";
        }
        return str2 + "\n排序+全部=+最新=time+最热=hits+评分=score";
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX INFO: renamed from: x */
    public final String m450x(String str, String str2) {
        boolean zFind = f126d.matcher(str).find();
        HashMap map = this.f133k;
        if (zFind) {
            if (map.containsKey(str2)) {
                str = (String) map.get(str2);
            } else {
                str = "";
            }
        } else if (str.contains("api.php/app/") || str.contains("xgapp")) {
            if (map.containsKey(str2)) {
                str = (String) map.get(str2);
            } else {
                str = "";
            }
        }
        if (str.contains("svip.jhyun.jx.cn") || str.contains("svip.jhdyw.vip")) {
            if (str2.contains("人人迷")) {
                return "http://www.1080kan.cc/jiexi/rrmi.php?url=";
            }
            if (str2.contains("人人")) {
                return "http://www.1080kan.cc/jiexi/rr.php?url=";
            }
            if (str2.contains("番茄")) {
                return "http://www.1080kan.cc/jiexi/fq.php?url=";
            }
        } else if (!str.contains("jhsj.manduhu.com") && !str.contains("v.jhdyw.vip/nhdz666") && !str.contains("x-n.cc")) {
            return str;
        }
        return "https://jx.parwix.com:4433/player/?url=";
    }

    /* JADX INFO: renamed from: y */
    public final String m451y(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            if (str.contains("dijiaxia")) {
                return "https://www.dijiaxia.com/api.php/app/video_detail?id=";
            }
            return str.contains("1010dy") ? "http://www.1010dy.cc/api.php/app/video_detail?id=" : str.concat("video_detail?id=");
        }
        if (str.contains(".vod")) {
            return str.contains("iopenyun") ? str.concat("/detailID?vod_id=") : str.concat("/detail?vod_id=");
        }
        return "";
    }
