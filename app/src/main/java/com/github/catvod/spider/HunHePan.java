package com.github.catvod.spider;

import com.github.catvod.spider.support.p128m.C2268k;

import com.github.catvod.spider.support.p126k.C2238b;

import android.content.Context;
import com.github.catvod.net.OkHttp;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class HunHePan extends Pan {
    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            map.put("Accept", "application/json, text/plain, */*");
            map.put("Content-Type", "application/json; charset=UTF-8");
            map.put("Referer", "https://hunhepan.com/");
            JSONArray jSONArray = new JSONObject(C2238b.m6066f("https://hunhepan.com/v1/search", "{\"q\":\"" + str + "\",\"exact\":false,\"page\":" + str2 + ",\"size\":15,\"type\":\"\",\"time\":\"\",\"from\":\"web\",\"user_id\":0,\"filter\":true}", map).m6076a()).getJSONObject("data").getJSONArray("list");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("disk_type");
                String strReplace = jSONObject.getString("disk_name").replace("<em>", "").replace("</em>", "");
                String str3 = string.equals("ALY") ? "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/8Yr6/1200X800/aliyun.jpg/webp" : "";
                if (string.equals("QUARK")) {
                    str3 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp";
                }
                if (string.equals("UC")) {
                    str3 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp";
                }
                if (string.equals("BDY")) {
                    str3 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/dyXZ/1200X800/baidu.jpg/webp";
                }
                if (string.equals("XUNLEI")) {
                    str3 = "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260623/4oPO/1200X800/xunlei.jpg/webp";
                }
                if (string.equals("GYP")) {
                    str3 = "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260625/kqrL/1200X800/guangya.jpg/webp";
                }
                jSONArray2.put(new JSONObject().put("vod_id", jSONObject.getString("link")).put("vod_name", strReplace).put("vod_remarks", jSONObject.getString("update_time")).put("vod_pic", str3));
            }
            return new JSONObject().put("list", jSONArray2).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"list\":[]}";
        }
    }

    public String searchContent(String str, boolean z) {
        
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
