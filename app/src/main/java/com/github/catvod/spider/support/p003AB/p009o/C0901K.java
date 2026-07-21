package com.github.catvod.spider.support.p003AB.p009o;

import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0901K {

    /* JADX INFO: renamed from: a */
    public static String f2119a = "";

    /* JADX INFO: renamed from: a */
    private static String m2179a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        int iIndexOf = str.indexOf("{");
        int iLastIndexOf = str.lastIndexOf("}");
        if (iIndexOf == -1 || iLastIndexOf == -1 || iIndexOf >= iLastIndexOf) {
            return null;
        }
        return str.substring(iIndexOf, iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: b */
    public static String m2180b(String str, int i) {
        try {
            SpiderDebug.log("getDanmuUrl vodName: " + str);
            SpiderDebug.log("getDanmuUrl vodIndex: " + i);
            String strM2161b = C0897G.m2161b("danmukey");
            SpiderDebug.log("getDanmuUrl danmu: " + strM2161b);
            if (strM2161b.isEmpty()) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(strM2161b);
            if (!str.contains(jSONObject.getString("searchKey"))) {
                return "";
            }
            JSONArray jSONArray = jSONObject.getJSONArray("details");
            return jSONArray.length() == 0 ? "" : jSONArray.getString(i - 1).split("\\|")[1];
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public static List<String> bilibili(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0869c.m2122b("http://127.0.0.1:1314/danmu/search?keywords=" + URLEncoder.encode(str, "UTF-8"), new HashMap()).m2134a()).optJSONArray("bilibili");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vod_name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("vod_id");
                    String strOptString3 = jSONObjectOptJSONObject.optString("count");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String str2 = "哔哩|" + strOptString + "(共" + strOptString3 + "集)|" + strOptString2 + "@bilibili";
                        if (strOptString.equals(str)) {
                            arrayList.add(0, str2);
                        } else {
                            arrayList.add(str2);
                        }
                        i++;
                    }
                }
                i++;
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public static List<String> hanjutv(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0869c.m2122b("http://127.0.0.1:1314/danmu/search?keywords=" + URLEncoder.encode(str, "UTF-8"), new HashMap()).m2134a()).optJSONArray("hanjutv");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vod_name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("vod_id");
                    String strOptString3 = jSONObjectOptJSONObject.optString("count");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String str2 = "韩剧|" + strOptString + "(共" + strOptString3 + "集)|" + strOptString2 + "@hanjutv";
                        if (strOptString.equals(str)) {
                            arrayList.add(0, str2);
                        } else {
                            arrayList.add(str2);
                        }
                        i++;
                    }
                }
                i++;
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public static List<String> iqiyi(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0869c.m2122b("http://127.0.0.1:1314/danmu/search?keywords=" + URLEncoder.encode(str, "UTF-8"), new HashMap()).m2134a()).optJSONArray("iqiyi");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vod_name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("vod_id");
                    String strOptString3 = jSONObjectOptJSONObject.optString("count");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String str2 = "爱奇艺|" + strOptString + "(共" + strOptString3 + "集)|" + strOptString2 + "@iqiyi";
                        if (strOptString.equals(str)) {
                            arrayList.add(0, str2);
                        } else {
                            arrayList.add(str2);
                        }
                        i++;
                    }
                }
                i++;
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public static List<String> juhe(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            String[] strArrSplit = str.split("\\|");
            String str2 = strArrSplit[1];
            String str3 = strArrSplit[2];
            String strReplace = str2.replace("\\s*\\(共\\d+集\\)\\s*", "");
            String[] strArrSplit2 = str3.split("@");
            JSONArray jSONArray = new JSONArray(C0869c.m2122b("http://127.0.0.1:1314/danmu?name=" + URLEncoder.encode(strReplace, "UTF-8") + "&epid=" + strArrSplit2[0] + "&platform=" + strArrSplit2[1], null).m2134a());
            if (jSONArray == null) {
                return arrayList;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("url");
                    String strOptString3 = jSONObjectOptJSONObject.optString("platform");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        arrayList.add(strOptString + "\n|vodid://" + strOptString2 + "@" + strOptString3);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String[] m2181l(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new String[0];
        }
        int length = jSONArray.length();
        int i = (length + 29) / 30;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sb = new StringBuilder();
            int i3 = i2 * 30;
            int iMin = Math.min(i3 + 30, length);
            while (i3 < iMin) {
                sb.append(jSONArray.optString(i3));
                if (i3 < iMin - 1) {
                    sb.append(",");
                }
                i3++;
            }
            strArr[i2] = sb.toString();
        }
        return strArr;
    }

    public static List<String> leshi(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0869c.m2122b("http://127.0.0.1:1314/danmu/search?keywords=" + URLEncoder.encode(str, "UTF-8"), new HashMap()).m2134a()).optJSONArray("leshi");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vod_name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("vod_id");
                    String strOptString3 = jSONObjectOptJSONObject.optString("count");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String str2 = "乐视|" + strOptString + "(共" + strOptString3 + "集)|" + strOptString2 + "@leshi";
                        if (strOptString.equals(str)) {
                            arrayList.add(0, str2);
                        } else {
                            arrayList.add(str2);
                        }
                        i++;
                    }
                }
                i++;
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public static List<String> maiduidui(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0869c.m2122b("http://127.0.0.1:1314/danmu/search?keywords=" + URLEncoder.encode(str, "UTF-8"), new HashMap()).m2134a()).optJSONArray("maiduidui");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vod_name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("vod_id");
                    String strOptString3 = jSONObjectOptJSONObject.optString("count");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String str2 = "埋堆堆|" + strOptString + "(共" + strOptString3 + "集)|" + strOptString2 + "@maiduidui";
                        if (strOptString.equals(str)) {
                            arrayList.add(0, str2);
                        } else {
                            arrayList.add(str2);
                        }
                        i++;
                    }
                }
                i++;
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public static List<String> mango(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0869c.m2122b("http://127.0.0.1:1314/danmu/search?keywords=" + URLEncoder.encode(str, "UTF-8"), new HashMap()).m2134a()).optJSONArray("mango");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vod_name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("vod_id");
                    String strOptString3 = jSONObjectOptJSONObject.optString("count");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String str2 = "芒果|" + strOptString + "(共" + strOptString3 + "集)|" + strOptString2 + "@mango";
                        if (strOptString.equals(str)) {
                            arrayList.add(0, str2);
                        } else {
                            arrayList.add(str2);
                        }
                        i++;
                    }
                }
                i++;
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public static List<String> renren(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0869c.m2122b("http://127.0.0.1:1314/danmu/search?keywords=" + URLEncoder.encode(str, "UTF-8"), new HashMap()).m2134a()).optJSONArray("renren");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vod_name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("vod_id");
                    String strOptString3 = jSONObjectOptJSONObject.optString("count");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String str2 = "人人|" + strOptString + "(共" + strOptString3 + "集)|" + strOptString2 + "@renren";
                        if (strOptString.equals(str)) {
                            arrayList.add(0, str2);
                        } else {
                            arrayList.add(str2);
                        }
                        i++;
                    }
                }
                i++;
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public static List<String> tencent(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0869c.m2122b("http://127.0.0.1:1314/danmu/search?keywords=" + URLEncoder.encode(str, "UTF-8"), new HashMap()).m2134a()).optJSONArray("tencent");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vod_name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("vod_id");
                    String strOptString3 = jSONObjectOptJSONObject.optString("count");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String str2 = "腾讯|" + strOptString + "(共" + strOptString3 + "集)|" + strOptString2 + "@tencent";
                        if (strOptString.equals(str)) {
                            arrayList.add(0, str2);
                        } else {
                            arrayList.add(str2);
                        }
                        i++;
                    }
                }
                i++;
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public static List<String> xigua(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0869c.m2122b("http://127.0.0.1:1314/danmu/search?keywords=" + URLEncoder.encode(str, "UTF-8"), new HashMap()).m2134a()).optJSONArray("xigua");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vod_name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("vod_id");
                    String strOptString3 = jSONObjectOptJSONObject.optString("count");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String str2 = "西瓜|" + strOptString + "(共" + strOptString3 + "集)|" + strOptString2 + "@xigua";
                        if (strOptString.equals(str)) {
                            arrayList.add(0, str2);
                        } else {
                            arrayList.add(str2);
                        }
                        i++;
                    }
                }
                i++;
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public static List<String> youku(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C0869c.m2122b("http://127.0.0.1:1314/danmu/search?keywords=" + URLEncoder.encode(str, "UTF-8"), new HashMap()).m2134a()).optJSONArray("youku");
            if (jSONArrayOptJSONArray == null) {
                return arrayList;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("vod_name");
                    String strOptString2 = jSONObjectOptJSONObject.optString("vod_id");
                    String strOptString3 = jSONObjectOptJSONObject.optString("count");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String str2 = "优酷|" + strOptString + "(共" + strOptString3 + "集)|" + strOptString2 + "@youku";
                        if (strOptString.equals(str)) {
                            arrayList.add(0, str2);
                        } else {
                            arrayList.add(str2);
                        }
                        i++;
                    }
                }
                i++;
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayList;
        }
    }
}
