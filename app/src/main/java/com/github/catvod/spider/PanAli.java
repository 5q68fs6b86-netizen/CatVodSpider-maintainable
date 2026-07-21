package com.github.catvod.spider;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p116a.C2137a;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.support.p117b.C2175i;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p119d.C2198b;
import com.github.catvod.spider.support.p119d.C2203g;
import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.support.p128m.C2256I;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class PanAli extends Pan {

    /* JADX INFO: renamed from: i */
    private C2175i f238i;

    /* JADX INFO: renamed from: b */
    private void m611b(C2203g c2203g, List<Vod> list, String str, boolean z) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("drive_id", C2175i.m5662d().m5669g().m5868a().m5884a());
        jsonObject.addProperty("limit", 100);
        jsonObject.addProperty("parent_file_id", c2203g.m5887c());
        jsonObject.addProperty("order_by", "name_enhanced");
        jsonObject.addProperty("order_direction", "ASC");
        jsonObject.addProperty("category", "video");
        if (str.length() > 0) {
            jsonObject.addProperty("marker", str);
        }
        HashMap map = new HashMap();
        map.put("Authorization", C2175i.m5662d().m5669g().m5869b().m5900a());
        String strM6076a = C2238b.m6066f("https://openapi.alipan.com/adrive/v1.0/openFile/list", jsonObject.toString(), map).m6076a();
        if (strM6076a.contains("AccessTokenExpired") || strM6076a.contains("AccessTokenInvalid") || strM6076a.contains("TokenVerifyFailed")) {
            C2175i.m5662d().m5679s();
            m611b(c2203g, list, str, z);
            return;
        }
        C2203g c2203g2 = (C2203g) new Gson().fromJson(strM6076a, C2203g.class);
        for (C2203g c2203g3 : c2203g2.m5889e()) {
            Vod c2194e = new Vod();
            c2194e.m5848j(C2256I.m6118n("", c2203g3.m5887c(), ""));
            c2194e.m5849k(c2203g3.m5886b());
            c2194e.m5850l("folder".equals(c2203g3.m5896k()) ? "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_f.png" : "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_v.png");
            c2194e.m5853o(c2203g3.m5894i());
            c2194e.m5854p(c2203g3.m5896k());
            if (!z || "file".equals(c2203g3.m5896k())) {
                list.add(c2194e);
            }
        }
        if (c2203g2.m5892g().length() > 0) {
            m611b(c2203g, list, c2203g2.m5892g(), z);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m612c(String str, String str2, C2203g c2203g, List<Vod> list, String str3, boolean z) {
        String string;
        C2203g c2203gM5674l = this.f238i.m5674l(str, c2203g, str3);
        for (C2203g c2203g2 : c2203gM5674l.m5889e()) {
            Vod c2194e = new Vod();
            c2194e.m5848j(C2256I.m6118n(str, c2203g2.m5887c(), str2));
            c2194e.m5849k(c2203g2.m5886b());
            c2194e.m5850l("folder".equals(c2203g2.m5896k()) ? "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_f.png" : "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_v.png");
            StringBuilder sb = new StringBuilder();
            sb.append(c2203g2.m5897l().split("T")[0]);
            if ("folder".equals(c2203g2.m5896k())) {
                string = "";
            } else {
                StringBuilder sbM5396a = C2137a.m5396a("|");
                sbM5396a.append(c2203g2.m5894i());
                string = sbM5396a.toString();
            }
            sb.append(string);
            c2194e.m5853o(sb.toString());
            c2194e.m5854p(c2203g2.m5896k());
            if (!z || "file".equals(c2203g2.m5896k())) {
                list.add(c2194e);
            }
        }
        if (c2203gM5674l.m5892g().length() > 0) {
            m612c(str, str2, c2203g, list, c2203gM5674l.m5892g(), z);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("shareId");
                String strOptString2 = jSONObjectOptJSONObject.optString("folder");
                String strOptString3 = jSONObjectOptJSONObject.optString("sharePwd");
                if (TextUtils.isEmpty(strOptString)) {
                    m611b(new C2203g(strOptString2), arrayList, "", false);
                } else {
                    this.f238i.m5683v(strOptString, strOptString3);
                    m612c(strOptString, strOptString3, new C2203g(strOptString2), arrayList, "", false);
                }
            }
            C2192c c2192c = new C2192c();
            c2192c.m5817i(1, 1, 0, 0);
            c2192c.m5829w(arrayList);
            return c2192c.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        JSONObject jSONObjectOptJSONObject = new JSONArray(list.get(0)).optJSONObject(0);
        String strOptString = jSONObjectOptJSONObject.optString("shareId");
        String strOptString2 = jSONObjectOptJSONObject.optString("folder");
        String strOptString3 = jSONObjectOptJSONObject.optString("sharePwd");
        Vod c2194e = new Vod();
        c2194e.m5848j(list.get(0));
        c2194e.m5849k("");
        c2194e.m5850l("https://inews.gtimg.com/newsapp_bt/0/13263837859/1000");
        c2194e.m5851m(TextUtils.join("$$$", Config.getAliOptions()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Vod> arrayList3 = new ArrayList();
        if (TextUtils.isEmpty(strOptString)) {
            m611b(new C2203g(this.f238i.m5676o(strOptString2)), arrayList3, "", true);
        } else {
            m612c(strOptString, strOptString3, new C2203g(this.f238i.m5684w(strOptString, strOptString2)), arrayList3, "", true);
        }
        for (Vod c2194e2 : arrayList3) {
            arrayList2.add(c2194e2.m5839b() + "$" + new JSONArray(c2194e2.m5838a()).optJSONObject(0).optString("folder") + Marker.ANY_NON_NULL_MARKER + strOptString);
        }
        for (int i = 0; i < Config.getAliOptions().size(); i++) {
            arrayList.add(TextUtils.join("#", arrayList2));
        }
        c2194e.m5852n(TextUtils.join("$$$", arrayList));
        return Result.string(c2194e);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray("[{\"name\":\"我的阿里云盘\",\"folders\":[{\"shareId\":\"\",\"folder\":\"root\"}]}]");
            C2198b c2198bM5669g = this.f238i.m5669g();
            if (c2198bM5669g == null || TextUtils.isEmpty(c2198bM5669g.m5870c().m5919b())) {
                arrayList.add(new Class("0", "还未登录阿里账号,请前往【配置中心】登录", "1"));
            } else {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    arrayList.add(new Class(jSONObjectOptJSONObject.optString("folders"), jSONObjectOptJSONObject.optString("name"), "1"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.string(arrayList, new ArrayList());
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            this.f238i = C2175i.m5662d();
        } catch (Exception unused) {
        }
    }
}
