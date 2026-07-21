package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
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
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PushAgent extends Spider {

    /* JADX INFO: renamed from: a */
    public static String f261a = "false";

    /* JADX INFO: renamed from: b */
    public static String f262b = "";

    /* JADX INFO: renamed from: c */
    public static String f263c = "";

    /* JADX INFO: renamed from: d */
    public static String f264d = ".m3u8#.mp4#.flv#video/tos#.mp3#.m4a#.wma";

    /* JADX INFO: renamed from: e */
    public static String f265e = "=http#.html#?http";

    /* JADX INFO: renamed from: com.github.catvod.spider.PushAgent$1 */
    class C00571 extends AbstractC0763ya {
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

    public static Object[] loadPic(Map<String, String> map) {
        try {
            String str = map.get("site");
            String str2 = map.get("pic");
            HashMap map2 = new HashMap();
            map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            map2.put("referer", str);
            C00571 c00571 = new C00571();
            AbstractC0771yi.m1885g(AbstractC0771yi.m1884f(), str2, map2, c00571);
            if (((Response) c00571.getResult()).code() != 200) {
                return null;
            }
            String str3 = ((Response) c00571.getResult()).headers().get("Content-Type");
            if (str3 == null) {
                str3 = "application/octet-stream";
            }
            return new Object[]{200, str3, ((Response) c00571.getResult()).body().byteStream()};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String repl(String str) {
        String[] strArr = {"#ignoreImg=true#", "#ignoreVideo=true#", "#ignoreMusic=true#", "#isVideo=true#", "#isMusic=true#", "#ignoreM3U8#", "#isM3u8#", "video://"};
        if (!str.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                str = str.replace(strArr[i], "");
            }
        }
        return str.replaceAll("；；", ";");
    }

    public static Object[] vod(Map<String, String> map) {
        if (map.get("type").equals("picproxy")) {
            return loadPic(map);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0539  */
    /* JADX WARN: Multi-variable type inference failed */
    public String detailContent(List<String> list) {
        String strGroup;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        String str7 = "立即播放$tvbox-xg:";
        try {
            String strTrim = list.get(0).trim();
            if (strTrim.startsWith("{") && strTrim.endsWith("}") && strTrim.contains("\"url")) {
                return hikerpush(list);
            }
            String str8 = "div";
            try {
                if (strTrim.startsWith("magnet:") || strTrim.startsWith("ed2k:")) {
                    if (strTrim.startsWith("ed2k:")) {
                        Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(strTrim));
                        if (matcher.find()) {
                            strGroup = matcher.group(1);
                        } else {
                            strGroup = "";
                        }
                    } else {
                        Matcher matcher2 = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(strTrim));
                        if (matcher2.find()) {
                            strGroup = matcher2.group(2);
                        } else {
                            strGroup = "";
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", strTrim);
                    if (strGroup.equals("")) {
                        strGroup = strTrim;
                    }
                    jSONObject2.put("vod_name", strGroup);
                    jSONObject2.put("vod_pic", "https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
                    jSONObject2.put("type_name", "磁力链接");
                    jSONObject2.put("vod_content", strTrim);
                    jSONObject2.put("vod_play_from", "magnet");
                    jSONObject2.put("vod_play_url", "立即播放$".concat(strTrim));
                    jSONArray.put(jSONObject2);
                    jSONObject.put("list", jSONArray);
                    return jSONObject.toString();
                }
                if ((strTrim.startsWith("ftp://") || strTrim.startsWith("tvbox-xg")) && strTrim.contains("gbl.114s")) {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("vod_id", strTrim);
                    jSONObject4.put("vod_name", "荐片推送");
                    jSONObject4.put("vod_pic", "https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
                    jSONObject4.put("type_name", "荐片链接推送");
                    jSONObject4.put("vod_play_from", "JianPian");
                    jSONObject4.put("vod_play_url", strTrim.startsWith("tvbox-xg") ? "立即播放$".concat(strTrim) : "立即播放$tvbox-xg:".concat(strTrim));
                    jSONArray2.put(jSONObject4);
                    jSONObject3.put("list", jSONArray2);
                    return jSONObject3.toString();
                }
                if (strTrim.contains("|") || strTrim.contains("#") || strTrim.contains("$") || (AbstractC0405ku.m1361e(strTrim.split("\\|")[0]) && !strTrim.startsWith("ed2k"))) {
                    JSONObject jSONObject5 = new JSONObject();
                    JSONArray jSONArray3 = new JSONArray();
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("vod_id", strTrim);
                    jSONObject6.put("vod_name", "推送");
                    jSONObject6.put("vod_pic", "https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
                    jSONObject6.put("type_name", "直连与嗅探推送");
                    jSONObject6.put("vod_play_from", "player");
                    String strRepl = repl(strTrim);
                    if (!strRepl.contains("$")) {
                        strRepl = "立即播放$|".concat(strRepl);
                    }
                    jSONObject6.put("vod_play_url", strRepl);
                    jSONArray3.put(jSONObject6);
                    jSONObject5.put("list", jSONArray3);
                    return jSONObject5.toString();
                }
                if (strTrim.contains(":52020")) {
                    return hikernetpush(list);
                }
                String str9 = "$";
                String str10 = "vod_remarks";
                String str11 = "vod_area";
                String str12 = "vod_year";
                if (AbstractC0405ku.m1362f(strTrim) && !strTrim.contains("qq.com") && !strTrim.contains("mgtv.com")) {
                    JSONObject jSONObject7 = new JSONObject();
                    JSONArray jSONArray4 = new JSONArray();
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("vod_id", strTrim);
                    jSONObject8.put("vod_name", strTrim);
                    jSONObject8.put("vod_pic", "https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
                    jSONObject8.put("type_name", "官源");
                    jSONObject8.put("vod_year", "");
                    jSONObject8.put("vod_area", "");
                    jSONObject8.put("vod_remarks", "");
                    jSONObject8.put("vod_actor", "");
                    jSONObject8.put("vod_director", "");
                    jSONObject8.put("vod_content", "");
                    jSONObject8.put("vod_play_from", "jx");
                    jSONObject8.put("vod_play_url", "立即播放$".concat(strTrim));
                    jSONArray4.put(jSONObject8);
                    jSONObject7.put("list", jSONArray4);
                    return jSONObject7.toString();
                }
                try {
                    try {
                        if (AbstractC0405ku.m1362f(strTrim)) {
                            try {
                                if (strTrim.contains("qq.com")) {
                                    ArrayList arrayList = new ArrayList();
                                    JSONObject jSONObject9 = new JSONObject();
                                    JSONArray jSONArray5 = new JSONArray();
                                    JSONObject jSONObject10 = new JSONObject();
                                    HashMap map = new HashMap();
                                    map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");
                                    C0235em c0235emM1487a = AbstractC0502oj.m1487a(AbstractC0771yi.m1889k(strTrim, map));
                                    String strM1645f = c0235emM1487a.m1166ah("head > title").m1645f();
                                    C0589rp c0589rpM1166ah = c0235emM1487a.m1166ah("div.episode-list-rect__item");
                                    if (c0589rpM1166ah.isEmpty()) {
                                        str = "";
                                        str2 = "vod_area";
                                        str3 = "vod_year";
                                        try {
                                            jSONObject10.put("vod_play_url", "立即播放$".concat(strTrim));
                                        } catch (Exception e) {
                                            e = e;
                                            str10 = str;
                                            str7 = str10;
                                            SpiderDebug.log(e);
                                            return str7;
                                        }
                                    } else {
                                        int i = 0;
                                        while (i < c0589rpM1166ah.size()) {
                                            try {
                                                C0226ed c0226ed = (C0226ed) c0589rpM1166ah.get(i);
                                                C0589rp c0589rp = c0589rpM1166ah;
                                                String str13 = str8;
                                                String str14 = str11;
                                                String str15 = str6;
                                                String strM1640a = c0226ed.m1166ah(str13).m1640a("data-vid");
                                                String str16 = "https://v.qq.com/x/cover/" + c0226ed.m1166ah(str13).m1640a("data-cid") + "/" + strM1640a;
                                                String strM1645f2 = c0226ed.m1166ah("div span").m1645f();
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(strM1645f2);
                                                String str17 = str9;
                                                sb.append(str17);
                                                sb.append(str16);
                                                arrayList.add(sb.toString());
                                                i++;
                                                str9 = str17;
                                                c0589rpM1166ah = c0589rp;
                                                str11 = str14;
                                                str6 = str15;
                                                str12 = str12;
                                                str8 = str13;
                                            } catch (Exception e2) {
                                                e = e2;
                                                String str18 = str6;
                                                str7 = str18;
                                                SpiderDebug.log(e);
                                                return str7;
                                            }
                                        }
                                        str = str6;
                                        str2 = str11;
                                        str3 = str12;
                                        jSONObject10.put("vod_play_url", TextUtils.join("#", arrayList));
                                    }
                                    jSONObject10.put("vod_id", strTrim);
                                    jSONObject10.put("vod_name", strM1645f);
                                    jSONObject10.put("vod_pic", "https://img2.baidu.com/it/u=2655029475,2190949369&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=593");
                                    jSONObject10.put("type_name", "腾讯视频");
                                    String str19 = str;
                                    jSONObject10.put(str3, str19);
                                    jSONObject10.put(str2, str19);
                                    jSONObject10.put("vod_remarks", str19);
                                    jSONObject10.put("vod_actor", str19);
                                    jSONObject10.put("vod_director", str19);
                                    jSONObject10.put("vod_content", strTrim);
                                    jSONObject10.put("vod_play_from", "jx");
                                    jSONArray5.put(jSONObject10);
                                    jSONObject9.put("list", jSONArray5);
                                    return jSONObject9.toString();
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str10 = "";
                            }
                        }
                        if (!AbstractC0405ku.m1362f(strTrim) || !strTrim.contains("mgtv.com")) {
                            JSONObject jSONObject11 = new JSONObject();
                            JSONArray jSONArray6 = new JSONArray();
                            JSONObject jSONObject12 = new JSONObject();
                            jSONObject12.put("vod_id", strTrim);
                            jSONObject12.put("vod_name", strTrim);
                            jSONObject12.put("vod_pic", "https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
                            jSONObject12.put("type_name", "通用链接");
                            jSONObject12.put("vod_play_from", "嗅探$$$视频$$$解析");
                            jSONObject12.put("vod_play_url", "立即嗅探$" + strTrim + "$$$立即播放$" + strTrim + "$$$立即解析$" + strTrim);
                            jSONArray6.put(jSONObject12);
                            jSONObject11.put("list", jSONArray6);
                            return jSONObject11.toString();
                        }
                        ArrayList arrayList2 = new ArrayList();
                        JSONObject jSONObject13 = new JSONObject();
                        JSONArray jSONArray7 = new JSONArray();
                        JSONObject jSONObject14 = new JSONObject();
                        Matcher matcher3 = Pattern.compile("https://\\S+mgtv.com/b/(\\d+)/(\\d+).html.*").matcher(strTrim);
                        if (matcher3.find()) {
                            String str20 = "https://pcweb.api.mgtv.com/episode/list?video_id=" + matcher3.group(2);
                            HashMap map2 = new HashMap();
                            map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");
                            JSONObject jSONObject15 = new JSONObject(AbstractC0771yi.m1889k(str20, map2));
                            String string = jSONObject15.getJSONObject("data").getJSONObject("info").getString("title");
                            JSONArray jSONArray8 = new JSONArray(jSONObject15.getJSONObject("data").getString("list"));
                            if (jSONArray8.length() > 0) {
                                int i2 = 0;
                                while (i2 < jSONArray8.length()) {
                                    JSONObject jSONObject16 = jSONArray8.getJSONObject(i2);
                                    if (jSONObject16.getString("isIntact").equals("1")) {
                                        arrayList2.add(jSONObject16.getString("t4") + str9 + ("https://www.mgtv.com/b/" + matcher3.group(1) + "/" + jSONObject16.getString("video_id") + ".html"));
                                    }
                                    i2++;
                                    string = string;
                                    jSONArray8 = jSONArray8;
                                }
                                str5 = string;
                                jSONObject14.put("vod_play_url", TextUtils.join("#", arrayList2));
                            } else {
                                str5 = string;
                                jSONObject14.put("vod_play_url", "立即播放$".concat(strTrim));
                            }
                            str4 = str5;
                        } else {
                            str4 = "";
                        }
                        jSONObject14.put("vod_id", strTrim);
                        jSONObject14.put("vod_name", str4);
                        jSONObject14.put("vod_pic", "https://img2.baidu.com/it/u=2562822927,704100654&fm=253&fmt=auto&app=138&f=JPEG?w=600&h=380");
                        jSONObject14.put("type_name", "芒果视频");
                        jSONObject14.put("vod_year", "");
                        jSONObject14.put("vod_area", "");
                        jSONObject14.put("vod_remarks", "");
                        jSONObject14.put("vod_actor", "");
                        jSONObject14.put("vod_director", "");
                        jSONObject14.put("vod_content", strTrim);
                        jSONObject14.put("vod_play_from", "jx");
                        jSONArray7.put(jSONObject14);
                        jSONObject13.put("list", jSONArray7);
                        return jSONObject13.toString();
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Exception e7) {
            e = e7;
            str7 = "";
        }
    }

    public String hikernetpush(List<String> list) {
        try {
            String strTrim = list.get(0).trim();
            if (strTrim.startsWith("{") && strTrim.endsWith("}") && strTrim.contains("\"url")) {
                JSONObject jSONObject = new JSONObject(strTrim);
                if (jSONObject.has("url")) {
                    strTrim = repl(jSONObject.getString("url"));
                } else if (jSONObject.has("urls")) {
                    strTrim = repl(strTrim);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("vod_id", list.get(0));
            jSONObject3.put("vod_name", strTrim.contains("/redirectPlayUrl") ? "海阔投屏直链" : "海阔网页投屏");
            jSONObject3.put("vod_pic", "");
            jSONObject3.put("type_name", "海阔视界投屏解析");
            jSONObject3.put("vod_content", "使用说明，投屏新链接后请按播放界面的重播按钮刷新视频。");
            jSONObject3.put("vod_play_from", "海阔投屏");
            jSONObject3.put("vod_play_url", strTrim);
            jSONArray.put(jSONObject3);
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String hikerpush(List<String> list) {
        String str;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        String str2 = "subtitle";
        String str3 = "headers";
        try {
            String strTrim = list.get(0).trim();
            JSONObject jSONObject3 = new JSONObject(strTrim);
            String strRepl = jSONObject3.has("url") ? repl(jSONObject3.getString("url")) : jSONObject3.has("urls") ? repl(strTrim) : "";
            if (strRepl.contains(":52020") && !strRepl.contains("/redirectPlayUrl")) {
                return hikernetpush(list);
            }
            String string = (jSONObject3.has("name") || jSONObject3.has("title")) ? jSONObject3.has("name") ? jSONObject3.getString("name") : jSONObject3.getString("title") : "";
            String string2 = jSONObject3.has("pic") ? jSONObject3.getString("pic") : "";
            String string3 = jSONObject3.has("actor") ? jSONObject3.getString("actor") : "";
            String string4 = jSONObject3.has("director") ? jSONObject3.getString("director") : "海阔视界";
            String strOptString = jSONObject3.has("content") ? jSONObject3.optString("content") : "";
            String str4 = "&";
            if (jSONObject3.has("headers")) {
                f262b = jSONObject3.optString("headers").replaceAll("＆＆", "&").replaceAll("；；", ";");
            }
            if (jSONObject3.has("manual")) {
                f261a = !jSONObject3.optString("manual").isEmpty() ? jSONObject3.optString("manual") : f261a;
            }
            if (jSONObject3.has("format")) {
                f264d = !jSONObject3.optString("format").isEmpty() ? jSONObject3.optString("format") : f264d;
            }
            if (jSONObject3.has("filters")) {
                f265e = !jSONObject3.optString("filters").isEmpty() ? jSONObject3.optString("filters") : f265e;
            }
            if (string2.contains("@Referer=")) {
                String[] strArrSplit = string2.split("@Referer=");
                string2 = (strArrSplit.length <= 1 || !strArrSplit[1].startsWith("http")) ? strArrSplit[0] : Proxy.getUrl() + "?do=push&type=picproxy&site=" + strArrSplit[1] + "&pic=" + strArrSplit[0];
            }
            String string5 = jSONObject3.has("from") ? jSONObject3.getString("from") : "";
            if (jSONObject3.has("subtitle")) {
                f263c = jSONObject3.getString("subtitle");
            }
            String str5 = string5;
            String str6 = string2;
            if (strRepl.startsWith("{") && strRepl.endsWith("}")) {
                JSONObject jSONObject4 = new JSONObject(strRepl);
                if (jSONObject4.has("urls")) {
                    JSONArray jSONArray2 = jSONObject4.getJSONArray("urls");
                    strRepl = "";
                    int i = 0;
                    while (i < jSONArray2.length()) {
                        String string6 = jSONArray2.getString(i);
                        if (string6.contains("##")) {
                            String[] strArrSplit2 = string6.split("##");
                            jSONArray = jSONArray2;
                            string6 = (strArrSplit2[0].startsWith("file://") || strArrSplit2[0].startsWith("http://127.0") || strArrSplit2[0].startsWith("http://0.0")) ? strArrSplit2[1] : strArrSplit2[0];
                        } else {
                            jSONArray = jSONArray2;
                        }
                        String strReplace = string6.contains("?") ? string6.replace("#", str4) : string6.replace("#", "?");
                        String str7 = str2;
                        String strReplaceAll = jSONObject4.has("names") ? jSONObject4.getJSONArray("names").getString(i).replaceAll("#", "_").replaceAll("$", "_") : "线路" + (i + 1);
                        if (jSONObject4.has(str3) && (jSONObject2 = jSONObject4.getJSONArray(str3).getJSONObject(i)) != null) {
                            strReplace = strReplace + "|" + jSONObject2.toString();
                        }
                        strRepl = i < 1 ? strReplaceAll + "$|" + strReplace : strRepl + "#" + strReplaceAll + "$|" + strReplace;
                        i++;
                        jSONArray2 = jSONArray;
                        str2 = str7;
                        str4 = str4;
                        str3 = str3;
                    }
                    str = str2;
                } else {
                    if (jSONObject4.has("url")) {
                        String strRepl2 = repl(jSONObject4.getString("url"));
                        if (strRepl2.contains("##")) {
                            String[] strArrSplit3 = strRepl2.split("##");
                            strRepl2 = (strArrSplit3[0].startsWith("file://") || strArrSplit3[0].startsWith("http://127.0") || strArrSplit3[0].startsWith("http://0.0")) ? strArrSplit3[1] : strArrSplit3[0];
                        }
                        String strReplace2 = strRepl2.contains("?") ? strRepl2.replace("#", "&") : strRepl2.replace("#", "?");
                        if (jSONObject4.has("headers") && (jSONObject = jSONObject4.getJSONObject("headers")) != null) {
                            strReplace2 = strReplace2 + "|" + jSONObject.toString();
                        }
                        strRepl = "|" + strReplace2;
                    }
                    str = "subtitle";
                }
                if (jSONObject4.has(str)) {
                    f263c = jSONObject4.getString(str);
                }
            } else {
                strTrim = strTrim;
                if (!strRepl.contains(";{") && !strRepl.startsWith("{") && !strRepl.endsWith("}") && strRepl.contains("##")) {
                    String[] strArrSplit4 = strRepl.split("##");
                    String str8 = (strArrSplit4[0].startsWith("file://") || strArrSplit4[0].startsWith("http://127.0") || strArrSplit4[0].startsWith("http://0.0")) ? strArrSplit4[1] : strArrSplit4[0];
                    strRepl = str8.contains("?") ? str8.replace("#", "&") : str8.replace("#", "?");
                } else if (strRepl.contains(";{")) {
                    String[] strArrSplit5 = strRepl.split(";\\{")[1].split("\\}")[0].split("&&");
                    String str9 = strRepl.split(";\\{")[0];
                    if (str9.contains("##")) {
                        String[] strArrSplit6 = str9.split("##");
                        str9 = (strArrSplit6[0].startsWith("file://") || strArrSplit6[0].startsWith("http://127.0") || strArrSplit6[0].startsWith("http://0.0")) ? strArrSplit6[1] : strArrSplit6[0];
                    }
                    String strReplace3 = str9.contains("?") ? str9.replace("#", "&") : str9.replace("#", "?");
                    String str10 = "";
                    for (int i2 = 0; i2 < strArrSplit5.length; i2++) {
                        String str11 = strArrSplit5[i2].split("@")[0] + "=" + URLEncoder.encode(strArrSplit5[i2].split("@")[1]);
                        str10 = i2 < 1 ? str11 : str10 + "&" + str11;
                    }
                    strRepl = "|" + strReplace3 + "|" + str10;
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("vod_id", strTrim);
            jSONObject6.put("vod_actor", string3);
            jSONObject6.put("vod_director", string4);
            jSONObject6.put("vod_name", string);
            jSONObject6.put("vod_content", strOptString);
            jSONObject6.put("vod_pic", str6);
            jSONObject6.put("type_name", "海阔视界推送");
            jSONObject6.put("vod_play_from", str5.isEmpty() ? "海阔视界" : str5);
            jSONObject6.put("vod_play_url", strRepl);
            jSONArray3.put(jSONObject6);
            jSONObject5.put("list", jSONArray3);
            return jSONObject5.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
    }

    public boolean isVideoFormat(String str) {
        String strReplaceAll = f264d.replaceAll("＆＆", "&");
        String strReplaceAll2 = f265e.replaceAll("＆＆", "&");
        String[] strArrSplit = strReplaceAll.toLowerCase().split("#");
        String[] strArrSplit2 = strReplaceAll2.toLowerCase().split("#");
        String lowerCase = str.toLowerCase();
        if ((lowerCase.contains("=http") || lowerCase.contains(".html")) && !checkstring(lowerCase)) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (lowerCase.contains(str2)) {
                for (String str3 : strArrSplit2) {
                    if (lowerCase.contains(str3) && !checkstring(lowerCase)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean manualVideoCheck() {
        String str = f261a;
        return str.equals("1") || str.equals("是") || str.equalsIgnoreCase("true");
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        String str4 = str2;
        try {
            String str5 = "url";
            if (str4.startsWith("ftp://") && str4.contains("gbl.114s")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("parse", 0);
                jSONObject.put("playUrl", "");
                jSONObject.put("url", "tvbox-xg:".concat(str4));
                return jSONObject.toString();
            }
            if (str.equals("jx") || str.equals("解析")) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("parse", 1);
                jSONObject2.put("jx", "1");
                jSONObject2.put("url", str4);
                return jSONObject2.toString();
            }
            if (str.equals("嗅探")) {
                String strM1796p = ((str4.contains("vip.ffzy") || str4.contains("vip.lz") || str4.contains("hd.lz") || str4.contains("suonizy")) && str4.contains("/share/") && !str4.contains("/redirectPlayUrl")) ? AbstractC0716wh.m1796p(str2) : str4;
                JSONObject jSONObject3 = new JSONObject();
                if (strM1796p.contains("/redirectPlayUrl") || strM1796p.contains("index.m3u8")) {
                    jSONObject3.put("parse", 0);
                } else {
                    jSONObject3.put("parse", 1);
                }
                jSONObject3.put("playUrl", "");
                jSONObject3.put("url", strM1796p);
                return jSONObject3.toString();
            }
            if (str.equals("海阔投屏")) {
                JSONObject jSONObject4 = new JSONObject();
                if (str4.contains("/redirectPlayUrl")) {
                    HashMap map = new HashMap();
                    AbstractC0771yi.m1892n(str4, null, map);
                    jSONObject4.put("url", AbstractC0771yi.m1886h(map));
                } else {
                    JSONObject jSONObject5 = new JSONObject(AbstractC0771yi.m1889k(str4.concat("/playUrl?enhance=true"), null));
                    if (jSONObject5.has("headers")) {
                        jSONObject4.put("header", jSONObject5.getJSONObject("headers").toString());
                    }
                    if (jSONObject5.has("subtitle") && jSONObject5.getString("subtitle").startsWith("http")) {
                        jSONObject4.put("subt", jSONObject5.getString("subtitle").split(";\\{")[0]);
                    }
                    jSONObject4.put("url", jSONObject5.getString("url"));
                }
                jSONObject4.put("parse", 0);
                jSONObject4.put("playUrl", "");
                return jSONObject4.toString();
            }
            if (str.equals("magnet") || str.equals("JianPian") || str.equals("视频")) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("parse", 0);
                jSONObject6.put("playUrl", "");
                jSONObject6.put("url", str4);
                return jSONObject6.toString();
            }
            JSONObject jSONObject7 = new JSONObject();
            if (!str2.trim().startsWith("|")) {
                str4 = "|" + str2.trim();
            }
            String[] strArrSplit = str4.trim().split("\\|");
            String strM1796p2 = strArrSplit[1].split(";\\{")[0];
            if (strArrSplit[1].contains(";{") && strArrSplit[1].contains("@") && strArrSplit.length == 2) {
                JSONObject jSONObject8 = new JSONObject();
                String[] strArrSplit2 = strArrSplit[1].split(";\\{")[1].split("\\}")[0].split("&&");
                int i = 0;
                while (i < strArrSplit2.length) {
                    jSONObject8.put(strArrSplit2[i].split("@")[0], strArrSplit2[i].split("@")[1]);
                    i++;
                    str5 = str5;
                }
                str3 = str5;
                jSONObject7.put("header", jSONObject8.toString());
            } else {
                str3 = "url";
                if (strArrSplit.length == 3) {
                    JSONObject jSONObject9 = new JSONObject();
                    if (strArrSplit[2].startsWith("{") && strArrSplit[2].endsWith("}")) {
                        jSONObject7.put("header", new JSONObject(strArrSplit[2]).toString());
                    } else {
                        String str6 = strArrSplit[2];
                        String[] strArrSplit3 = str6.split("&");
                        if (strArrSplit3.length > 0) {
                            int length = strArrSplit3.length;
                            int i2 = 0;
                            while (i2 < length) {
                                String[] strArr = strArrSplit3;
                                String[] strArrSplit4 = strArrSplit3[i2].split("=");
                                int i3 = length;
                                if (strArrSplit4.length == 2) {
                                    jSONObject9.put(strArrSplit4[0], URLDecoder.decode(strArrSplit4[1], "UTF-8"));
                                }
                                i2++;
                                strArrSplit3 = strArr;
                                length = i3;
                            }
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            jSONObject7.put("header", jSONObject9.toString());
                        }
                    }
                } else if (f262b.startsWith("{") && f262b.endsWith("}")) {
                    jSONObject7.put("header", new JSONObject(f262b).toString());
                }
            }
            if ((strM1796p2.contains("vip.ffzy") || strM1796p2.contains("vip.lz") || strM1796p2.contains("hd.lz") || strM1796p2.contains("suonizy")) && strM1796p2.contains("/share/")) {
                strM1796p2 = AbstractC0716wh.m1796p(strM1796p2);
            }
            if (strM1796p2.startsWith("ftp://") && strM1796p2.contains("gbl.114s")) {
                strM1796p2 = "tvbox-xg:" + strM1796p2;
            }
            if (AbstractC0405ku.m1361e(strM1796p2) || (strM1796p2.contains("pds.uc.cn") && strM1796p2.contains("oss-traffic"))) {
                if (!TextUtils.isEmpty(f263c) && f263c.startsWith("http")) {
                    jSONObject7.put("subt", f263c.split(";\\{")[0]);
                }
                jSONObject7.put("parse", 0);
            } else if (!AbstractC0405ku.m1362f(strM1796p2) || strM1796p2.contains("=http")) {
                jSONObject7.put("parse", 1);
            } else {
                jSONObject7.put("parse", 1);
                jSONObject7.put("jx", "1");
            }
            jSONObject7.put("playUrl", "");
            jSONObject7.put(str3, strM1796p2);
            return jSONObject7.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            String strTrim = str.trim();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vod_id", strTrim);
            jSONObject.put("vod_name", strTrim);
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
