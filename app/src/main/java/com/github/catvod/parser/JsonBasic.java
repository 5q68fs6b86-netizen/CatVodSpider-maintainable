package com.github.catvod.parser;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0405ku;
import com.github.catvod.spider.support.p002A0.AbstractC0710wb;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JsonBasic {
    public static HashMap<String, String> getReqHeader(String str) {
        HashMap<String, String> mapM1762f = AbstractC0710wb.m1762f("url", str);
        if (str.contains("cat_ext")) {
            try {
                int iIndexOf = str.indexOf("cat_ext=");
                int iIndexOf2 = str.indexOf("&", iIndexOf);
                String str2 = new String(Base64.decode(str.substring(iIndexOf + 8, iIndexOf2), 10));
                String str3 = str.substring(0, iIndexOf) + str.substring(iIndexOf2 + 1);
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("header")) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        mapM1762f.put(next, jSONObjectOptJSONObject.optString(next, ""));
                    }
                }
                mapM1762f.put("url", str3);
            } catch (Throwable unused) {
            }
        }
        return mapM1762f;
    }

    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, String str) {
        try {
            SpiderDebug.log("Load Json Parse Basic...");
            if (linkedHashMap.size() > 0) {
                for (String str2 : linkedHashMap.keySet()) {
                    HashMap<String, String> reqHeader = getReqHeader(linkedHashMap.get(str2));
                    try {
                        String str3 = reqHeader.get("url");
                        reqHeader.remove("url");
                        SpiderDebug.log(str3 + str);
                        JSONObject jSONObjectM1363g = AbstractC0405ku.m1363g(str, AbstractC0771yi.m1889k(str3 + str, reqHeader));
                        if (jSONObjectM1363g != null) {
                            jSONObjectM1363g.put("jxFrom", str2);
                            SpiderDebug.log(jSONObjectM1363g.toString());
                            return jSONObjectM1363g;
                        }
                    } catch (Throwable th) {
                        SpiderDebug.log(th);
                    }
                }
            }
        } catch (Throwable th2) {
            SpiderDebug.log(th2);
        }
        return new JSONObject();
    }
}
