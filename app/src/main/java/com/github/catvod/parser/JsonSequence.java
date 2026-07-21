package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0405ku;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JsonSequence {
    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, String str) {
        try {
            if (linkedHashMap.size() > 0) {
                for (String str2 : linkedHashMap.keySet()) {
                    try {
                        HashMap<String, String> reqHeader = JsonBasic.getReqHeader(linkedHashMap.get(str2));
                        String str3 = reqHeader.get("url");
                        reqHeader.remove("url");
                        SpiderDebug.log(str3 + str);
                        JSONObject jSONObjectM1363g = AbstractC0405ku.m1363g(str, AbstractC0771yi.m1889k(str3 + str, reqHeader));
                        if (jSONObjectM1363g != null) {
                            jSONObjectM1363g.put("jxFrom", str2);
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
