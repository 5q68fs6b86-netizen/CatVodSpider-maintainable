package com.github.catvod.spider;

import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p003AB.p009o.C0901K;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2268k;
import com.github.catvod.spider.support.p128m.C2269l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes.dex */
public class Danmu extends Spider {
    public static Object[] AppDanmu(Map<String, String> map) {
        SpiderDebug.log("开始获取弹幕");
        Object[] objArr = {200, "application/xml", new ByteArrayInputStream("".getBytes())};
        String str = map.get("vodName");
        if (TextUtils.isEmpty(str)) {
            return objArr;
        }
        String realName = getRealName(str);
        int iM499d = m499d(map.get("vodIndex"));
        boolean z = false;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a) && "彩色".equals(new JSONObject(strM6164a).optString("danmuColor"))) {
            z = true;
        }
        String strM2180b = C0901K.m2180b(realName, iM499d);
        if (TextUtils.isEmpty(strM2180b)) {
            strM2180b = getDanmuFromOK360(realName, iM499d);
        }
        if (TextUtils.isEmpty(strM2180b)) {
            strM2180b = getDanmuFrom1314(realName, iM499d);
        }
        if (TextUtils.isEmpty(strM2180b)) {
            C2256I.m6113i("弹幕加载失败");
            return objArr;
        }
        String danmuUrl2 = formatDanmuUrl2(strM2180b);
        String strUpdateDanmuColors = z ? updateDanmuColors(danmuUrl2) : updateDanmuWhite(danmuUrl2);
        if (!TextUtils.isEmpty(strUpdateDanmuColors)) {
            C2256I.m6113i("弹幕加载成功");
        }
        C2269l.m6176a("searchvodname", "");
        objArr[2] = new ByteArrayInputStream(strUpdateDanmuColors.getBytes());
        return objArr;
    }

    public static Object[] Danmaku(Map<String, String> map) throws JSONException {
        Log.d("MapContent", "Map = " + map.toString());
        Object[] objArr = new Object[3];
        objArr[0] = 200;
        objArr[1] = "application/json";
        String cachedSearchKeyword = getCachedSearchKeyword(map.get("name"));
        int iM499d = m499d(map.get("episode"));
        String strM6073l = C2238b.m6073l("http://127.0.0.1:1314/danmu/search?keywords=" + cachedSearchKeyword, null);
        if (strM6073l == null) {
            strM6073l = "{}";
        }
        JSONObject jSONObject = new JSONObject(strM6073l);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(itKeys.next());
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                String string = jSONObject2.getString("vod_name");
                String string2 = jSONObject2.getString("platform");
                int i2 = Integer.parseInt(jSONObject2.getString("count"));
                String str = string + "  •  " + string2 + "  第" + iM499d + "集  (共" + i2 + "集)";
                String str2 = "http://127.0.0.1:9978/proxy?do=danmu&site=js&url=vodurl://" + string + "@" + iM499d + "@" + i2 + "@" + string2;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", str);
                jSONObject3.put("url", str2);
                jSONObject3.put("source", string2);
                jSONArray.put(jSONObject3);
            }
        }
        objArr[2] = new ByteArrayInputStream(filterDanmuResult(jSONArray, map).toString().getBytes());
        return objArr;
    }

    public static Object[] Danmu(Map<String, String> map) throws JSONException {
        boolean z = false;
        Object[] objArr = {200, "application/xml", new ByteArrayInputStream("".getBytes())};
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a) && "彩色".equals(new JSONObject(strM6164a).optString("danmuColor"))) {
            z = true;
        }
        String str = map.get("site");
        String strDecode = map.get("url");
        if (!TextUtils.isEmpty(strDecode) && !strDecode.startsWith("http")) {
            strDecode = URLDecoder.decode(strDecode);
        }
        String strUpdateDanmuColors = "";
        if ("js".equals(str)) {
            String danmuUrl2 = formatDanmuUrl2(strDecode);
            strUpdateDanmuColors = z ? updateDanmuColors(danmuUrl2) : updateDanmuWhite(danmuUrl2);
            if (TextUtils.isEmpty(strUpdateDanmuColors)) {
                C2256I.m6113i("弹幕加载失败");
            } else {
                C2256I.m6113i("弹幕加载成功");
            }
        } else if ("wangpan".equals(str)) {
            String str2 = getRealName(C2269l.m6177b("danmuvodname")).split(" ")[0];
            int iM499d = m499d(C2269l.m6177b("danmuvodindex"));
            String strM2180b = C0901K.m2180b(str2, iM499d);
            if (TextUtils.isEmpty(strM2180b)) {
                strM2180b = getDanmuFromPanOK360(str2, iM499d);
            }
            if (TextUtils.isEmpty(strM2180b)) {
                strM2180b = getDanmuFromPanOK360Space(str2, iM499d);
            }
            if (TextUtils.isEmpty(strM2180b)) {
                strM2180b = getDanmuFrom1314(str2, iM499d);
            }
            if (TextUtils.isEmpty(strM2180b)) {
                strM2180b = getDanmuFrom1314Space(str2, iM499d);
            }
            if (TextUtils.isEmpty(strM2180b)) {
                strUpdateDanmuColors = "";
                C2256I.m6113i("弹幕加载失败");
            } else {
                String danmuUrl3 = formatDanmuUrl2(strM2180b);
                strUpdateDanmuColors = z ? updateDanmuColors(danmuUrl3) : updateDanmuWhite(danmuUrl3);
                if (!TextUtils.isEmpty(strUpdateDanmuColors)) {
                    C2256I.m6113i("弹幕加载成功");
                }
            }
        }
        C2269l.m6176a("searchvodname", "");
        objArr[2] = new ByteArrayInputStream(strUpdateDanmuColors.getBytes());
        return objArr;
    }

    public static Object[] DiyDanmu(Map<String, String> map) {
        SpiderDebug.log("开始获取弹幕");
        Object[] objArr = {200, "application/xml", new ByteArrayInputStream("".getBytes())};
        JSONObject jSONObject = new JSONObject(C2238b.m6073l("http://127.0.0.1:9978/media", new HashMap()));
        String realName = getRealName(jSONObject.optString("title"));
        String strOptString = jSONObject.optString("artist");
        String str = !TextUtils.isEmpty(strOptString) ? strOptString : realName;
        if (TextUtils.isEmpty(realName)) {
            return objArr;
        }
        int iM499d = m499d(str);
        boolean z = false;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a) && "彩色".equals(new JSONObject(strM6164a).optString("danmuColor"))) {
            z = true;
        }
        String strM2180b = C0901K.m2180b(realName, iM499d);
        if (TextUtils.isEmpty(strM2180b)) {
            strM2180b = getDanmuFromOK360(realName, iM499d);
        }
        if (TextUtils.isEmpty(strM2180b)) {
            strM2180b = getDanmuFrom1314(realName, iM499d);
        }
        if (TextUtils.isEmpty(strM2180b)) {
            C2256I.m6113i("弹幕加载失败");
            return objArr;
        }
        String danmuUrl2 = formatDanmuUrl2(strM2180b);
        String strUpdateDanmuColors = z ? updateDanmuColors(danmuUrl2) : updateDanmuWhite(danmuUrl2);
        if (!TextUtils.isEmpty(strUpdateDanmuColors)) {
            C2256I.m6113i("弹幕加载成功");
        }
        C2269l.m6176a("searchvodname", "");
        objArr[2] = new ByteArrayInputStream(strUpdateDanmuColors.getBytes());
        return objArr;
    }

    /* JADX INFO: renamed from: a */
    private static String m497a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            documentNewDocument.setXmlStandalone(true);
            Element elementCreateElement = documentNewDocument.createElement("i");
            documentNewDocument.appendChild(elementCreateElement);
            Element elementCreateElement2 = documentNewDocument.createElement("chatserver");
            elementCreateElement2.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement2);
            Element elementCreateElement3 = documentNewDocument.createElement("chatid");
            elementCreateElement3.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement3);
            Element elementCreateElement4 = documentNewDocument.createElement("mission");
            elementCreateElement4.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement4);
            Element elementCreateElement5 = documentNewDocument.createElement("maxlimit");
            elementCreateElement5.setTextContent("1500");
            elementCreateElement.appendChild(elementCreateElement5);
            Element elementCreateElement6 = documentNewDocument.createElement("state");
            elementCreateElement6.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement6);
            Element elementCreateElement7 = documentNewDocument.createElement("real_name");
            elementCreateElement7.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement7);
            Element elementCreateElement8 = documentNewDocument.createElement("source");
            elementCreateElement8.setTextContent("k-v");
            elementCreateElement.appendChild(elementCreateElement8);
            Element elementCreateElement9 = documentNewDocument.createElement("d");
            elementCreateElement9.setAttribute("p", "30,1,25,16711680");
            elementCreateElement9.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement9);
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("danmuku");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
                String strOptString = jSONArrayOptJSONArray2.optString(4);
                if (!strOptString.contains("请遵守弹幕礼仪") && !strOptString.contains("官方弹幕库") && !strOptString.contains("未传入链接调用") && !strOptString.contains("弹幕列队") && !strOptString.contains("火花剧场") && !strOptString.contains("云烟小助手") && !strOptString.contains("微信公众号")) {
                    jSONArrayOptJSONArray2.optString(2);
                    String str2 = String.format("%s,1,25,%s", jSONArrayOptJSONArray2.optString(0), generateCombinedRGB());
                    Element elementCreateElement10 = documentNewDocument.createElement("d");
                    elementCreateElement10.setAttribute("p", str2);
                    elementCreateElement10.setTextContent(strOptString);
                    elementCreateElement.appendChild(elementCreateElement10);
                }
            }
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("encoding", "UTF-8");
            transformerNewTransformer.setOutputProperty("indent", "yes");
            DOMSource dOMSource = new DOMSource(documentNewDocument);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            transformerNewTransformer.transform(dOMSource, new StreamResult(byteArrayOutputStream));
            return byteArrayOutputStream.toString();
        } catch (Exception e) {
            SpiderDebug.log("生成弹幕出错:" + e);
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m498b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            documentNewDocument.setXmlStandalone(true);
            Element elementCreateElement = documentNewDocument.createElement("i");
            documentNewDocument.appendChild(elementCreateElement);
            Element elementCreateElement2 = documentNewDocument.createElement("chatserver");
            elementCreateElement2.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement2);
            Element elementCreateElement3 = documentNewDocument.createElement("chatid");
            elementCreateElement3.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement3);
            Element elementCreateElement4 = documentNewDocument.createElement("mission");
            elementCreateElement4.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement4);
            Element elementCreateElement5 = documentNewDocument.createElement("maxlimit");
            elementCreateElement5.setTextContent("1500");
            elementCreateElement.appendChild(elementCreateElement5);
            Element elementCreateElement6 = documentNewDocument.createElement("state");
            elementCreateElement6.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement6);
            Element elementCreateElement7 = documentNewDocument.createElement("real_name");
            elementCreateElement7.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement7);
            Element elementCreateElement8 = documentNewDocument.createElement("source");
            elementCreateElement8.setTextContent("k-v");
            elementCreateElement.appendChild(elementCreateElement8);
            Element elementCreateElement9 = documentNewDocument.createElement("d");
            elementCreateElement9.setAttribute("p", "30,1,25,16711680");
            elementCreateElement9.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement9);
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("danmuku");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
                String strOptString = jSONArrayOptJSONArray2.optString(4);
                if (!strOptString.contains("请遵守弹幕礼仪") && !strOptString.contains("官方弹幕库") && !strOptString.contains("未传入链接调用") && !strOptString.contains("弹幕列队") && !strOptString.contains("火花剧场") && !strOptString.contains("云烟小助手") && !strOptString.contains("微信公众号")) {
                    jSONArrayOptJSONArray2.optString(2);
                    String str2 = String.format("%s,1,25,%s", jSONArrayOptJSONArray2.optString(0), generateCombinedWhite());
                    Element elementCreateElement10 = documentNewDocument.createElement("d");
                    elementCreateElement10.setAttribute("p", str2);
                    elementCreateElement10.setTextContent(strOptString);
                    elementCreateElement.appendChild(elementCreateElement10);
                }
            }
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("encoding", "UTF-8");
            transformerNewTransformer.setOutputProperty("indent", "yes");
            DOMSource dOMSource = new DOMSource(documentNewDocument);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            transformerNewTransformer.transform(dOMSource, new StreamResult(byteArrayOutputStream));
            return byteArrayOutputStream.toString();
        } catch (Exception e) {
            SpiderDebug.log("生成弹幕出错:" + e);
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m499d(String str) {
        if (str != null && !str.isEmpty()) {
            String strReplaceAll = str.replaceAll("\\[.*?\\]", "");
            Matcher matcher = Pattern.compile("第(\\d+)[集期话]").matcher(strReplaceAll);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            if (strReplaceAll.contains("S") && strReplaceAll.contains("E")) {
                Matcher matcher2 = Pattern.compile("S\\d+E(\\d{2,3})").matcher(strReplaceAll);
                if (matcher2.find()) {
                    return Integer.parseInt(matcher2.group(1));
                }
            } else {
                Matcher matcher3 = Pattern.compile("·E(\\d+)·").matcher(strReplaceAll);
                if (matcher3.find()) {
                    return Integer.parseInt(matcher3.group(1));
                }
                Matcher matcher4 = Pattern.compile("(\\d{4})[-._]?(\\d{2})[-._]?(\\d{2})").matcher(strReplaceAll);
                if (matcher4.find()) {
                    return Integer.parseInt(matcher4.group(1) + matcher4.group(2) + matcher4.group(3));
                }
                Matcher matcher5 = Pattern.compile("(\\d+)([a-zA-Z]*|(?:\\s+.*)?)").matcher(strReplaceAll.split("\\.")[0]);
                if (matcher5.find()) {
                    return Integer.parseInt(matcher5.group(1));
                }
            }
        }
        return 1;
    }

    public static JSONArray filterDanmuResult(JSONArray jSONArray, Map<String, String> map) {
        int iIndexOf;
        if (jSONArray == null || jSONArray.length() == 0 || map == null) {
            return jSONArray;
        }
        String strM6177b = C2269l.m6177b("searchvodname");
        if (strM6177b == null || strM6177b.length() <= 0) {
            strM6177b = map.get("name");
        }
        if (strM6177b == null || strM6177b.length() == 0) {
            return jSONArray;
        }
        try {
            String strM6177b2 = C2269l.m6177b("danmakucache");
            if (strM6177b2 == null || strM6177b2.length() == 0) {
                strM6177b2 = "{}";
            }
            String strOptString = new JSONObject(strM6177b2).optString(strM6177b);
            boolean z = false;
            if (strOptString == null || strOptString.length() == 0) {
                z = true;
                strOptString = strM6177b;
            }
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString2 = jSONObject.optString("name");
                boolean zContains = false;
                if (z && strOptString2 != null && (iIndexOf = strOptString2.indexOf("  •")) != -1) {
                    zContains = strOptString2.substring(0, iIndexOf).equals(strOptString);
                } else if (strOptString2 != null) {
                    zContains = strOptString2.contains(strOptString);
                }
                if (zContains) {
                    jSONArray2.put(jSONObject);
                } else {
                    jSONArray3.put(jSONObject);
                }
            }
            jSONArray = mergeArrays(jSONArray2, jSONArray3);
            return jSONArray;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONArray;
        }
    }

    public static String formatDanmuUrl(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        HashMap map = new HashMap();
        String strM6073l = C2238b.m6073l("https://danmu.huaqi.pro/?url=" + str, map);
        if (strM6073l != null && strM6073l.length() > 0 && strM6073l.startsWith("{") && strM6073l.contains("\"code\":23")) {
            return strM6073l;
        }
        String strM6073l2 = C2238b.m6073l("https://dmku.hls.one/?ac=dm&url=" + str, map);
        if (strM6073l2 != null && strM6073l2.length() > 0 && strM6073l2.startsWith("{") && strM6073l2.contains("\"code\":23")) {
            return strM6073l2;
        }
        String strM6073l3 = C2238b.m6073l("https://danmu.zxz.ee/?type=json&id=" + str, map);
        if (strM6073l3 != null && strM6073l3.length() > 0 && strM6073l3.startsWith("{") && strM6073l3.contains("\"code\":23")) {
            return strM6073l3;
        }
        String strM6073l4 = C2238b.m6073l("https://dm.ruyijx.com?ac=dm&url=" + str, map);
        return (strM6073l4 == null || strM6073l4.length() <= 0 || !strM6073l4.startsWith("{") || !strM6073l4.contains("\"code\":23")) ? "" : strM6073l4;
    }

    public static String formatDanmuUrl2(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.startsWith("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")) {
            return str;
        }
        if (str.startsWith("http")) {
            return C2238b.m6073l("http://127.0.0.1:1314/danmu/get?url=" + str + "&format=xml", new HashMap());
        }
        if (str.startsWith("vodid://")) {
            String[] strArrSplit = str.substring("vodid://".length()).split("@");
            return C2238b.m6073l("http://127.0.0.1:1314/danmu/get?url=" + strArrSplit[0] + "&platform=" + strArrSplit[1] + "&format=xml", new HashMap());
        }
        if (!str.startsWith("vodurl://")) {
            return "";
        }
        String[] strArrSplit2 = str.substring("vodurl://".length()).split("@");
        String str2 = strArrSplit2[0];
        String str3 = strArrSplit2[1];
        String str4 = strArrSplit2[2];
        String str5 = strArrSplit2[3];
        processDanmuRequest(str2, str5);
        return C2238b.m6073l("http://127.0.0.1:1314/danmu/auto?name=" + str2 + "&episode=" + str3 + "&total=" + str4 + "&platform=" + str5 + "&format=xml", new HashMap());
    }

    public static String generateCombinedRGB() {
        String[] strArr = {"16711680", "16776960", "65280", "255", "16711935", "8388736", "16753920", "65535", "16777215", "16761087", "16777087", "8978431", "6527999", "16744447", "16756735", "8454143", "16724787", "16777215", "16752723", "16776951", "10000639", "5729279", "16645625", "16185078", "12334518", "13882321", "16777215", "16209488", "16772810", "16766758", "16777014", "16772362", "16773119", "14410239", "11835903", "16777215"};
        return strArr[new Random().nextInt(strArr.length)];
    }

    public static String generateCombinedWhite() {
        String[] strArr = {"16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16711680", "16776960", "255", "65280", "8388736"};
        return strArr[new Random().nextInt(strArr.length)];
    }

    public static String getCachedSearchKeyword(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        try {
            String strM6177b = C2269l.m6177b("searchvodname");
            if (strM6177b != null && strM6177b.length() > 0) {
                return strM6177b;
            }
            String strM6177b2 = C2269l.m6177b("danmakucache");
            if (strM6177b2 == null || strM6177b2.length() == 0) {
                strM6177b2 = "{}";
            }
            String strOptString = new JSONObject(strM6177b2).optString(str);
            if (strOptString == null || strOptString.length() == 0) {
                return str;
            }
            int iIndexOf = strOptString.indexOf("  •");
            return iIndexOf != -1 ? strOptString.substring(0, iIndexOf) : strOptString;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String getDanmuFrom1314(String str, int i) {
        try {
            String strM6072k = C2238b.m6072k("http://127.0.0.1:1314/danmu/auto?name=" + URLEncoder.encode(str, "UTF-8") + "&episode=" + i + "&format=xml");
            if (TextUtils.isEmpty(strM6072k)) {
                return "";
            }
            return (strM6072k.indexOf("<d") < 0 || strM6072k.indexOf("</d>") < 0) ? "" : strM6072k;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getDanmuFrom1314Space(String str, int i) throws JSONException {
        try {
            String strM6072k = C2238b.m6072k("http://127.0.0.1:1314/danmu/auto?name=" + URLEncoder.encode(getOriginalVideoName(str), "UTF-8") + "&episode=" + i + "&format=xml");
            if (TextUtils.isEmpty(strM6072k)) {
                return "";
            }
            return (strM6072k.indexOf("<d") < 0 || strM6072k.indexOf("</d>") < 0) ? "" : strM6072k;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getDanmuFromLogVar(String str, int i) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int i2;
        JSONObject jSONObjectOptJSONObject;
        try {
            String strM6072k = C2238b.m6072k(String.format("https://pizazz.us.ci/1314/search/episodes?anime=%s", str));
            if (TextUtils.isEmpty(strM6072k) || (jSONArrayOptJSONArray = new JSONObject(strM6072k).optJSONArray("animes")) == null || jSONArrayOptJSONArray.length() == 0 || (jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONObject(0).optJSONArray("episodes")) == null || jSONArrayOptJSONArray2.length() == 0 || (i2 = i - 1) < 0 || i2 >= jSONArrayOptJSONArray2.length() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i2)) == null) {
                return "";
            }
            String strOptString = jSONObjectOptJSONObject.optString("episodeId");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            return "vodid://" + strOptString;
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static String getDanmuFromOK360(String str, int i) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3;
        int iIndexOf4;
        try {
            String strM6072k = C2238b.m6072k("http://127.0.0.1:9978/media");
            if (TextUtils.isEmpty(strM6072k) || !strM6072k.startsWith("{")) {
                return "";
            }
            long jOptLong = new JSONObject(strM6072k).optLong("duration");
            if (jOptLong == 0) {
                return "";
            }
            long j = (jOptLong / 1000) / 60;
            String str2 = j < 30 ? "动漫" : j < 70 ? "电视剧" : "电影";
            String strM6072k2 = C2238b.m6072k(String.format("https://api.so.360kan.com/index?force_v=1&kw=%s&from=&pageno=1&v_ap=1&tab=all", URLEncoder.encode(str, "UTF-8")));
            if (TextUtils.isEmpty(strM6072k2) || (jSONObjectOptJSONObject = new JSONObject(strM6072k2).optJSONObject("data")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("longData")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("rows")) == null || jSONArrayOptJSONArray.length() == 0) {
                return "";
            }
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i2);
                if (str2.equals(jSONObjectOptJSONObject4.optString("cat_name"))) {
                    String strOptString = "";
                    if (str2.equals("电影")) {
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("playlinks");
                        if (jSONObjectOptJSONObject5 != null) {
                            String strOptString2 = jSONObjectOptJSONObject5.optString("qq");
                            if (TextUtils.isEmpty(strOptString2)) {
                                String strOptString3 = jSONObjectOptJSONObject5.optString("qiyi");
                                if (TextUtils.isEmpty(strOptString3)) {
                                    String strOptString4 = jSONObjectOptJSONObject5.optString("youku");
                                    if (TextUtils.isEmpty(strOptString4)) {
                                        String strOptString5 = jSONObjectOptJSONObject5.optString("imgo");
                                        if (!TextUtils.isEmpty(strOptString5)) {
                                            strOptString = strOptString5;
                                        }
                                    } else {
                                        strOptString = strOptString4;
                                    }
                                } else {
                                    strOptString = strOptString3;
                                }
                            } else {
                                strOptString = strOptString2;
                            }
                        }
                    } else {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("seriesPlaylinks");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                            return "";
                        }
                        int i3 = (i <= 0 ? 0 : i) - 1;
                        if (i3 < 0 || i3 >= jSONArrayOptJSONArray2.length() || (jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3)) == null) {
                            return "";
                        }
                        strOptString = jSONObjectOptJSONObject3.optString("url");
                    }
                    if (TextUtils.isEmpty(strOptString)) {
                        return "";
                    }
                    if (strOptString.contains("v.qq.com") && strOptString.contains(".html") && (iIndexOf4 = strOptString.indexOf(".html")) != -1) {
                        strOptString = strOptString.substring(0, ".html".length() + iIndexOf4);
                    } else if (strOptString.contains("www.iqiyi.com") && strOptString.contains(".html") && (iIndexOf3 = strOptString.indexOf(".html")) != -1) {
                        strOptString = strOptString.substring(0, ".html".length() + iIndexOf3);
                    } else if (strOptString.contains("www.mgtv.com") && strOptString.contains(".html") && (iIndexOf2 = strOptString.indexOf(".html")) != -1) {
                        strOptString = strOptString.substring(0, ".html".length() + iIndexOf2);
                    } else if (strOptString.contains("v.youku.com") && (iIndexOf = strOptString.indexOf("vid=")) != -1) {
                        int i4 = iIndexOf + 4;
                        int iIndexOf5 = strOptString.indexOf("&", i4);
                        if (iIndexOf5 == -1) {
                            iIndexOf5 = strOptString.length();
                        }
                        String strSubstring = strOptString.substring(i4, iIndexOf5);
                        if (!TextUtils.isEmpty(strSubstring)) {
                            strOptString = "https://v.youku.com/v_show/id_" + strSubstring + ".html";
                        }
                    }
                    return strOptString;
                }
            }
            return "";
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static String getDanmuFromPanOK360(String str, int i) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3;
        int iIndexOf4;
        try {
            String strM6072k = C2238b.m6072k("http://127.0.0.1:9978/media");
            if (TextUtils.isEmpty(strM6072k) || !strM6072k.startsWith("{")) {
                return "";
            }
            long jOptLong = new JSONObject(strM6072k).optLong("duration");
            if (jOptLong == 0) {
                return "";
            }
            long j = (jOptLong / 1000) / 60;
            String str2 = j < 30 ? "动漫" : j < 70 ? "电视剧" : "电影";
            String strM6072k2 = C2238b.m6072k(String.format("https://api.so.360kan.com/index?force_v=1&kw=%s&from=&pageno=1&v_ap=1&tab=all", URLEncoder.encode(str, "UTF-8")));
            if (TextUtils.isEmpty(strM6072k2) || (jSONObjectOptJSONObject = new JSONObject(strM6072k2).optJSONObject("data")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("longData")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("rows")) == null || jSONArrayOptJSONArray.length() == 0) {
                return "";
            }
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i2);
                String strOptString = jSONObjectOptJSONObject4.optString("titleTxt");
                if ((TextUtils.isEmpty(strOptString) || strOptString.contains(str)) && str2.equals(jSONObjectOptJSONObject4.optString("cat_name"))) {
                    String strOptString2 = "";
                    if (str2.equals("电影")) {
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("playlinks");
                        if (jSONObjectOptJSONObject5 != null) {
                            String strOptString3 = jSONObjectOptJSONObject5.optString("qq");
                            if (TextUtils.isEmpty(strOptString3)) {
                                String strOptString4 = jSONObjectOptJSONObject5.optString("qiyi");
                                if (TextUtils.isEmpty(strOptString4)) {
                                    String strOptString5 = jSONObjectOptJSONObject5.optString("youku");
                                    if (TextUtils.isEmpty(strOptString5)) {
                                        String strOptString6 = jSONObjectOptJSONObject5.optString("imgo");
                                        if (!TextUtils.isEmpty(strOptString6)) {
                                            strOptString2 = strOptString6;
                                        }
                                    } else {
                                        strOptString2 = strOptString5;
                                    }
                                } else {
                                    strOptString2 = strOptString4;
                                }
                            } else {
                                strOptString2 = strOptString3;
                            }
                        }
                    } else {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("seriesPlaylinks");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                            return "";
                        }
                        int i3 = (i <= 0 ? 0 : i) - 1;
                        if (i3 < 0 || i3 >= jSONArrayOptJSONArray2.length() || (jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3)) == null) {
                            return "";
                        }
                        strOptString2 = jSONObjectOptJSONObject3.optString("url");
                    }
                    if (TextUtils.isEmpty(strOptString2)) {
                        return "";
                    }
                    if (strOptString2.startsWith("https://v.qq.com/") && strOptString2.contains(".html") && (iIndexOf4 = strOptString2.indexOf(".html")) != -1) {
                        strOptString2 = strOptString2.substring(0, ".html".length() + iIndexOf4);
                    } else if (strOptString2.startsWith("https://www.iqiyi.com/") && strOptString2.contains(".html") && (iIndexOf3 = strOptString2.indexOf(".html")) != -1) {
                        strOptString2 = strOptString2.substring(0, ".html".length() + iIndexOf3);
                    } else if (strOptString2.startsWith("http://www.mgtv.com/") && strOptString2.contains(".html") && (iIndexOf2 = strOptString2.indexOf(".html")) != -1) {
                        strOptString2 = strOptString2.substring(0, ".html".length() + iIndexOf2);
                    } else if (strOptString2.startsWith("https://v.youku.com") && (iIndexOf = strOptString2.indexOf("vid=")) != -1) {
                        int i4 = iIndexOf + 4;
                        int iIndexOf5 = strOptString2.indexOf("&", i4);
                        if (iIndexOf5 == -1) {
                            iIndexOf5 = strOptString2.length();
                        }
                        String strSubstring = strOptString2.substring(i4, iIndexOf5);
                        if (!TextUtils.isEmpty(strSubstring)) {
                            strOptString2 = "https://v.youku.com/v_show/id_" + strSubstring + ".html";
                        }
                    }
                    return strOptString2;
                }
            }
            return "";
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static String getDanmuFromPanOK360Space(String str, int i) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3;
        int iIndexOf4;
        try {
            String strM6072k = C2238b.m6072k("http://127.0.0.1:9978/media");
            if (TextUtils.isEmpty(strM6072k) || !strM6072k.startsWith("{")) {
                return "";
            }
            long jOptLong = new JSONObject(strM6072k).optLong("duration");
            if (jOptLong == 0) {
                return "";
            }
            long j = (jOptLong / 1000) / 60;
            String str2 = j < 30 ? "动漫" : j < 70 ? "电视剧" : "电影";
            String originalVideoName = getOriginalVideoName(str);
            String strM6072k2 = C2238b.m6072k(String.format("https://api.so.360kan.com/index?force_v=1&kw=%s&from=&pageno=1&v_ap=1&tab=all", URLEncoder.encode(originalVideoName, "UTF-8")));
            if (TextUtils.isEmpty(strM6072k2) || (jSONObjectOptJSONObject = new JSONObject(strM6072k2).optJSONObject("data")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("longData")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("rows")) == null || jSONArrayOptJSONArray.length() == 0) {
                return "";
            }
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i2);
                String strOptString = jSONObjectOptJSONObject4.optString("titleTxt");
                if ((TextUtils.isEmpty(strOptString) || strOptString.contains(originalVideoName)) && str2.equals(jSONObjectOptJSONObject4.optString("cat_name"))) {
                    String strOptString2 = "";
                    if (str2.equals("电影")) {
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("playlinks");
                        if (jSONObjectOptJSONObject5 != null) {
                            String strOptString3 = jSONObjectOptJSONObject5.optString("qq");
                            if (TextUtils.isEmpty(strOptString3)) {
                                String strOptString4 = jSONObjectOptJSONObject5.optString("qiyi");
                                if (TextUtils.isEmpty(strOptString4)) {
                                    String strOptString5 = jSONObjectOptJSONObject5.optString("youku");
                                    if (TextUtils.isEmpty(strOptString5)) {
                                        String strOptString6 = jSONObjectOptJSONObject5.optString("imgo");
                                        if (!TextUtils.isEmpty(strOptString6)) {
                                            strOptString2 = strOptString6;
                                        }
                                    } else {
                                        strOptString2 = strOptString5;
                                    }
                                } else {
                                    strOptString2 = strOptString4;
                                }
                            } else {
                                strOptString2 = strOptString3;
                            }
                        }
                    } else {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("seriesPlaylinks");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                            return "";
                        }
                        int i3 = (i <= 0 ? 0 : i) - 1;
                        if (i3 < 0 || i3 >= jSONArrayOptJSONArray2.length() || (jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3)) == null) {
                            return "";
                        }
                        strOptString2 = jSONObjectOptJSONObject3.optString("url");
                    }
                    if (TextUtils.isEmpty(strOptString2)) {
                        return "";
                    }
                    if (strOptString2.startsWith("https://v.qq.com/") && strOptString2.contains(".html") && (iIndexOf4 = strOptString2.indexOf(".html")) != -1) {
                        strOptString2 = strOptString2.substring(0, ".html".length() + iIndexOf4);
                    } else if (strOptString2.startsWith("https://www.iqiyi.com/") && strOptString2.contains(".html") && (iIndexOf3 = strOptString2.indexOf(".html")) != -1) {
                        strOptString2 = strOptString2.substring(0, ".html".length() + iIndexOf3);
                    } else if (strOptString2.startsWith("http://www.mgtv.com/") && strOptString2.contains(".html") && (iIndexOf2 = strOptString2.indexOf(".html")) != -1) {
                        strOptString2 = strOptString2.substring(0, ".html".length() + iIndexOf2);
                    } else if (strOptString2.startsWith("https://v.youku.com") && (iIndexOf = strOptString2.indexOf("vid=")) != -1) {
                        int i4 = iIndexOf + 4;
                        int iIndexOf5 = strOptString2.indexOf("&", i4);
                        if (iIndexOf5 == -1) {
                            iIndexOf5 = strOptString2.length();
                        }
                        String strSubstring = strOptString2.substring(i4, iIndexOf5);
                        if (!TextUtils.isEmpty(strSubstring)) {
                            strOptString2 = "https://v.youku.com/v_show/id_" + strSubstring + ".html";
                        }
                    }
                    return strOptString2;
                }
            }
            return "";
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    private static String getOriginalVideoName(String str) throws JSONException {
        String strM6177b = C2269l.m6177b("danmuvodname");
        if (TextUtils.isEmpty(strM6177b)) {
            return strM6177b;
        }
        String strM6177b2 = C2269l.m6177b("searchvodname");
        if (!TextUtils.isEmpty(strM6177b2) && !"获取视频名称失败".equals(strM6177b2)) {
            String strM6177b3 = C2269l.m6177b("danmucache");
            if (TextUtils.isEmpty(strM6177b3)) {
                strM6177b3 = "{}";
            }
            JSONObject jSONObject = new JSONObject(strM6177b3);
            if (!jSONObject.has(strM6177b)) {
                jSONObject.put(strM6177b, strM6177b2);
            }
            if (jSONObject.length() > 20) {
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                JSONObject jSONObject2 = new JSONObject();
                for (int size = arrayList.size() - 20; size < arrayList.size(); size++) {
                    String str2 = (String) arrayList.get(size);
                    jSONObject2.put(str2, jSONObject.getString(str2));
                }
                jSONObject = jSONObject2;
            }
            C2269l.m6176a("danmucache", jSONObject.toString());
            C2269l.m6176a("searchvodname", "");
        }
        String strM6177b4 = C2269l.m6177b("danmucache");
        if (TextUtils.isEmpty(strM6177b4)) {
            return strM6177b;
        }
        String strOptString = new JSONObject(strM6177b4).optString(strM6177b);
        return !TextUtils.isEmpty(strOptString) ? strOptString : strM6177b;
    }

    public static String getRealName(String str) {
        return Pattern.compile("[（(【<][臻真]彩[）)】>]").matcher(str).replaceAll("").trim();
    }

    public static JSONArray mergeArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        JSONArray jSONArray3 = new JSONArray();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objOpt = jSONArray.opt(i);
                if (objOpt != null) {
                    jSONArray3.put(objOpt);
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                Object objOpt2 = jSONArray2.opt(i2);
                if (objOpt2 != null) {
                    jSONArray3.put(objOpt2);
                }
            }
        }
        return jSONArray3;
    }

    public static void processDanmuRequest(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        try {
            String str3 = str + "  •  " + str2;
            String strM6073l = C2238b.m6073l("http://127.0.0.1:9978/media", new HashMap());
            if (strM6073l == null || strM6073l.length() == 0) {
                strM6073l = "{}";
            }
            String strOptString = new JSONObject(strM6073l).optString("title");
            if (strOptString == null || strOptString.length() == 0) {
                return;
            }
            String strM6177b = C2269l.m6177b("danmakucache");
            if (strM6177b == null || strM6177b.length() == 0) {
                strM6177b = "{}";
            }
            JSONObject jSONObject = new JSONObject(strM6177b);
            jSONObject.put(strOptString, str3);
            if (jSONObject.length() > 20) {
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                JSONObject jSONObject2 = new JSONObject();
                for (int size = arrayList.size() - 20; size < arrayList.size(); size++) {
                    String str4 = (String) arrayList.get(size);
                    jSONObject2.put(str4, jSONObject.getString(str4));
                }
                jSONObject = jSONObject2;
            }
            C2269l.m6176a("danmakucache", jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String removeLeadingZeroFromEpisode(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        Matcher matcher = Pattern.compile("(第|EP|ep|Ep)(0*)(\\d+)(期|集|话)([上下中]+)?[^.]*").matcher(str);
        if (!matcher.find()) {
            return str;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        String strGroup3 = matcher.group(3);
        String strGroup4 = matcher.group(4);
        if (strGroup2.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strGroup);
        sb.append(strGroup3);
        sb.append(strGroup4);
        String strGroup5 = matcher.group(5);
        if (strGroup5 != null) {
            sb.append(strGroup5);
        }
        return sb.toString();
    }

    public static String updateDanmuColors(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf("<d p=\"", i);
            if (iIndexOf < 0) {
                sb.append(str.substring(i));
                return sb.toString();
            }
            int iIndexOf2 = str.indexOf("\">", iIndexOf);
            if (iIndexOf2 <= 0) {
                sb.append(str.substring(i));
                return sb.toString();
            }
            sb.append(str.substring(i, iIndexOf));
            String[] strArrSplit = str.substring(iIndexOf + 6, iIndexOf2).split(",");
            if (strArrSplit.length < 4) {
                sb.append("<d p=\"");
                sb.append(strArrSplit);
                sb.append("\">");
                i = iIndexOf2 + 2;
            } else {
                strArrSplit[3] = generateCombinedRGB();
                sb.append("<d p=\"");
                sb.append(strArrSplit[0]);
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    sb.append(",");
                    sb.append(strArrSplit[i2]);
                }
                sb.append("\">");
                i = iIndexOf2 + 2;
            }
        }
    }

    public static String updateDanmuWhite(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf("<d p=\"", i);
            if (iIndexOf < 0) {
                sb.append(str.substring(i));
                return sb.toString();
            }
            int iIndexOf2 = str.indexOf("\">", iIndexOf);
            if (iIndexOf2 <= 0) {
                sb.append(str.substring(i));
                return sb.toString();
            }
            sb.append(str.substring(i, iIndexOf));
            String[] strArrSplit = str.substring(iIndexOf + 6, iIndexOf2).split(",");
            if (strArrSplit.length < 4) {
                sb.append("<d p=\"");
                sb.append(strArrSplit);
                sb.append("\">");
                i = iIndexOf2 + 2;
            } else {
                strArrSplit[3] = generateCombinedWhite();
                sb.append("<d p=\"");
                sb.append(strArrSplit[0]);
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    sb.append(",");
                    sb.append(strArrSplit[i2]);
                }
                sb.append("\">");
                i = iIndexOf2 + 2;
            }
        }
    }
}
