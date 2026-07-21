package com.github.catvod.spider.support.p117b;

import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p118c.C2192c;
import com.github.catvod.spider.support.p118c.C2194e;
import com.github.catvod.spider.support.p124i.C2223a;
import com.github.catvod.spider.support.p124i.C2224b;
import com.github.catvod.spider.support.p124i.C2225c;
import com.github.catvod.spider.support.p124i.C2226d;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2268k;
import com.github.catvod.spider.support.p128m.C2269l;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2187w {

    /* JADX INFO: renamed from: e */
    private static String f5250e;

    /* JADX INFO: renamed from: f */
    private static HashMap f5251f = new HashMap();

    /* JADX INFO: renamed from: t */
    private static boolean f5252t;

    /* JADX INFO: renamed from: a */
    private Boolean f5253a;

    /* JADX INFO: renamed from: b */
    private C2225c f5254b;

    /* JADX INFO: renamed from: c */
    private C2226d f5255c;

    /* JADX INFO: renamed from: d */
    private final ArrayList f5256d = new ArrayList();
    private String fid;

    /* JADX INFO: renamed from: q */
    private String f5257q;

    /* JADX INFO: renamed from: s */
    private ConcurrentHashMap<String, b> f5258s;

    /* JADX INFO: renamed from: t */
    private ConcurrentHashMap<String, c> f5259t;
    private Map tokenMap;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.w$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static volatile C2187w f5260a = new C2187w();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.w$b */
    class b {

        /* JADX INFO: renamed from: a */
        String f5261a = null;

        /* JADX INFO: renamed from: b */
        long f5262b = 0;

        /* JADX INFO: renamed from: c */
        boolean f5263c = false;

        b() {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.w$c */
    class c {

        /* JADX INFO: renamed from: a */
        public List<String> f5264a;

        /* JADX INFO: renamed from: b */
        public long f5265b;
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.w$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException unused) {
            }
            try {
                C2187w.this.deleteQuarkTempAsync();
            } catch (Exception e) {
                Log.e("QuarkCleanup", e.getMessage());
            }
        }
    }

    C2187w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public boolean m5759d(String str, boolean z) {
        return true;
    }

    private void deleteQuarkTemp() {
        try {
            String str = this.fid;
            if (str == null || str.isEmpty()) {
                return;
            }
            C2238b.m6066f("https://drive-pc.quark.cn/1/clouddrive/file/delete?pr=ucpro&fr=pc&uc_param_str=", "{\"action_type\":2,\"filelist\":[\"" + str + "\"],\"exclude_fids\":[]}", m5762g());
        } catch (Exception e) {
            Log.e("QuarkTempDelete", "Error deleting file: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public static C2187w m5760e() {
        return a.f5260a;
    }

    /* JADX INFO: renamed from: f */
    private String m5761f(String str, Map<String, String> map) {
        try {
            Response responseM6064d = C2238b.m6064d(str, map);
            List listHeaders = responseM6064d.headers("set-cookie");
            if (listHeaders.size() > 0) {
                C2226d c2226dM5777o = m5777o();
                String strM6120q = C2256I.m6120q(c2226dM5777o.m6052a(), (String) listHeaders.get(0));
                c2226dM5777o.m6056f(strM6120q);
                this.f5257q = strM6120q;
            }
            return responseM6064d.body().string();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    private Map<String, String> m5762g() {
        HashMap mapM5756b = C2186v.m5756b("Referer", "https://pan.quark.cn");
        String strM6052a = this.f5257q;
        if (TextUtils.isEmpty(strM6052a)) {
            strM6052a = m5777o().m6052a();
        }
        mapM5756b.put("Cookie", strM6052a);
        mapM5756b.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch");
        return mapM5756b;
    }

    /* JADX INFO: renamed from: i */
    private String m5763i(String str) {
        return new JSONObject(m5761f(C2185u.m5754a("https://drive-pc.quark.cn/1/clouddrive/file/info?pr=ucpro&fr=pc&uc_param_str=&fid=", str, "&_fetch_full_path=0&need_profile_tags=1"), m5762g())).optJSONObject("data").optString("file_name");
    }

    /* JADX INFO: renamed from: k */
    private String m5764k(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        m5782u(str);
        String strM5769c = m5769c(str, str2, str3, true);
        if (!TextUtils.isEmpty(strM5769c)) {
            this.f5256d.add(0, strM5769c);
        }
        return strM5769c;
    }

    /* JADX INFO: renamed from: m */
    private String m5765m() {
        try {
            Map<String, String> mapM5762g = m5762g();
            ((HashMap) mapM5762g).put("Cookie", m5777o().m6052a());
            JSONArray jSONArray = new JSONObject(m5761f("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc", mapM5762g)).getJSONObject("data").getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("Quarktemp".equals(jSONObject.getString("file_name"))) {
                    return jSONObject.getString("fid");
                }
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("pdir_fid", "0");
            jsonObject.addProperty("file_name", "Quarktemp");
            jsonObject.addProperty("dir_path", "");
            jsonObject.addProperty("dir_init_lock", Boolean.FALSE);
            String string = jsonObject.toString();
            Map<String, String> mapM5762g2 = m5762g();
            ((HashMap) mapM5762g2).put("Cookie", m5777o().m6052a());
            String strOptString = new JSONObject(C2238b.m6066f("https://drive-pc.quark.cn/1/clouddrive/file?pr=ucpro&fr=pc", string, mapM5762g2).m6076a()).optJSONObject("data").optString("fid");
            return !TextUtils.isEmpty(strOptString) ? strOptString : "0";
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("Quark_temp_folder_error", "Quark_temp_folder_error");
            return "0";
        }
    }

    /* JADX INFO: renamed from: q */
    private void m5766q(String str, int i, List<C2223a> list) {
        Map<String, String> mapM5762g = m5762g();
        ((HashMap) mapM5762g).put("Cookie", m5777o().m6052a());
        C2224b c2224bM6037c = C2224b.m6037c(m5761f("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=" + str + "&_page=" + i + "&_size=100&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc", mapM5762g));
        list.addAll(c2224bM6037c.m6038a().m6040a());
        if (c2224bM6037c.m6039b().m6041a()) {
            m5766q(str, i + 1, list);
        }
    }

    /* JADX INFO: renamed from: r */
    private String m5767r(String str) {
        try {
            return new JSONObject(C2268k.m6164a(a.f5260a.m5772i())).optString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: t */
    private String m5768t(String str, Map<String, Object> map) {
        return C2238b.m6066f(str, new JSONObject(map).toString(), m5762g()).m6076a();
    }

    /* JADX INFO: renamed from: c */
    public final String m5769c(String str, String str2, String str3, boolean z) {
        String strSubstring = str;
        if (strSubstring.contains("?pwd=")) {
            int iIndexOf = strSubstring.indexOf("?pwd=");
            strSubstring = iIndexOf > 0 ? strSubstring.substring(0, iIndexOf) : "";
        }
        try {
            if ("0".equals(str2)) {
                throw new RuntimeException();
            }
            if (TextUtils.isEmpty(f5250e)) {
                f5250e = m5765m();
            }
            HashMap map = new HashMap();
            String str4 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis();
            map.put("pdir_fid", "0");
            map.put("pwd_id", strSubstring);
            map.put("scene", "link");
            map.put("stoken", this.f5254b.m6044c().m6049a());
            map.put("to_pdir_fid", f5250e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            map.put("fid_list", arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str3);
            map.put("fid_token_list", arrayList2);
            JSONObject jSONObject = new JSONObject(m5768t(str4, map));
            if (jSONObject.optInt("status") > 200) {
                String strOptString = jSONObject.optString("message");
                if (!strOptString.contains("转存文件token校验异常") || !z) {
                    C2256I.m6113i(strOptString);
                    return "";
                }
                String strM5774j = m5774j(str, str2);
                if (!TextUtils.isEmpty(strM5774j)) {
                    return m5769c(strSubstring, str2, strM5774j, false);
                }
                C2256I.m6113i(strOptString);
                return "";
            }
            String strOptString2 = jSONObject.optJSONObject("data").optString("task_id");
            for (int i = 1; i < 6; i++) {
                JSONObject jSONObject2 = new JSONObject(m5761f("https://drive-pc.quark.cn/1/clouddrive/task?pr=ucpro&fr=pc&uc_param_str=&task_id=" + strOptString2 + "&retry_index=" + i + "&__t=" + System.currentTimeMillis(), m5762g()));
                if (jSONObject2.optInt("status") > 200) {
                    if (jSONObject2.optInt("code") == 41013 && z) {
                        f5250e = "";
                        return m5769c(strSubstring, str2, str3, false);
                    }
                    String str5 = jSONObject2.optString("message") + "[" + jSONObject2.optInt("code") + "]";
                    if (str5.contains("capacity limit")) {
                        str5 = "云盘容量不足,转存失败,请清理云盘后再试试";
                    }
                    C2256I.m6113i(str5);
                    return "";
                }
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONObject("data").optJSONObject("save_as").optJSONArray("save_as_top_fids");
                if (jSONArrayOptJSONArray.length() > 0) {
                    String strOptString3 = jSONArrayOptJSONArray.optString(0);
                    this.fid = strOptString3;
                    return strOptString3;
                }
                TimeUnit.SECONDS.sleep(1L);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteQuarkTempAsync() {
        deleteQuarkTemp();
    }

    /* JADX INFO: renamed from: h */
    public final String m5770h(String str, String str2, String str3) {
        try {
            String strM5764k = m5764k(str, str2, str3);
            if (TextUtils.isEmpty(strM5764k)) {
                return "";
            }
            if (this.f5258s == null) {
                this.f5258s = new ConcurrentHashMap<>();
            }
            b bVar = this.f5258s.get(strM5764k);
            if (bVar != null && System.currentTimeMillis() - bVar.f5262b < 60000) {
                String str4 = bVar.f5261a;
                if (!TextUtils.isEmpty(str4)) {
                    f5252t = bVar.f5263c;
                    return str4;
                }
            }
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(strM5764k);
            map.put("fids", arrayList);
            String strM5776n = m5776n();
            if (!TextUtils.isEmpty(strM5776n)) {
                map.put("token", strM5776n);
            }
            JSONObject jSONObject = new JSONObject(m5768t("https://drive-pc.quark.cn/1/clouddrive/file/download?pr=ucpro&fr=pc", map));
            if (jSONObject.optString("message").contains("file not found")) {
                return "";
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONArray("data").optJSONObject(0);
            String strOptString = jSONObjectOptJSONObject.optString("download_url");
            boolean zContains = jSONObjectOptJSONObject.optString("format_type").toLowerCase().contains("iso");
            f5252t = zContains;
            if (strOptString != null && !strOptString.isEmpty()) {
                b bVar2 = new b();
                bVar2.f5261a = strOptString;
                bVar2.f5262b = System.currentTimeMillis();
                bVar2.f5263c = zContains;
                this.f5258s.put(strM5764k, bVar2);
            }
            return strOptString;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: hh */
    public final String m5771hh(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        String str4;
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            map.put("fids", arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str3);
            map.put("fids_token", arrayList2);
            map.put("pwd_id", str);
            Map map2 = this.tokenMap;
            map.put("stoken", (map2 == null || (str4 = (String) map2.get(str)) == null) ? "" : str4);
            map.put("speedup_session", "");
            String strM5776n = m5776n();
            if (!TextUtils.isEmpty(strM5776n)) {
                map.put("token", strM5776n);
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(m5768t("https://drive-pc.quark.cn/1/clouddrive/file/download?pr=ucpro&fr=pc", map)).optJSONArray("data");
            if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                return "";
            }
            String strOptString = jSONObjectOptJSONObject.optString("download_url");
            f5252t = jSONObjectOptJSONObject.optString("format_type").toLowerCase().contains("iso");
            return strOptString;
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public final File m5772i() {
        return C2268k.m6166b("/quark_cookie.txt");
    }

    /* JADX INFO: renamed from: j */
    public final String m5773j() {
        return m5767r("cookie");
    }

    /* JADX INFO: renamed from: j */
    public final String m5774j(String str, String str2) {
        List<C2223a> arrayList = (List) f5251f.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            m5786x(str, "", arrayList, "");
        }
        for (C2223a c2223a : arrayList) {
            if (str2.equals(c2223a.m6028b())) {
                return c2223a.m6031d();
            }
        }
        if (!f5251f.containsKey(str)) {
            f5251f.put(str, arrayList);
        }
        return "";
    }

    /* JADX INFO: renamed from: l */
    public final List<String> m5775l(String str, String str2, String str3) {
        List<String> list;
        try {
            String strM5764k = m5764k(str, str2, str3);
            if (this.f5259t == null) {
                this.f5259t = new ConcurrentHashMap<>();
            }
            c cVar = this.f5259t.get(strM5764k);
            if (cVar != null && System.currentTimeMillis() - cVar.f5265b < 60000 && (list = cVar.f5264a) != null && !list.isEmpty()) {
                return list;
            }
            HashMap map = new HashMap();
            map.put("fid", strM5764k);
            map.put("resolutions", "normal,low,high,super,2k,4k");
            map.put("supports", "fmp4,m3u8");
            JSONObject jSONObject = new JSONObject(m5768t("https://drive-pc.quark.cn/1/clouddrive/file/v2/play?pr=ucpro&fr=pc&uc_param_str=", map));
            if (jSONObject.optString("message").contains("file not found")) {
                ArrayList arrayList = new ArrayList();
                c cVar2 = new c();
                cVar2.f5264a = arrayList;
                cVar2.f5265b = System.currentTimeMillis();
                this.f5259t.put(strM5764k, cVar2);
                return arrayList;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_list");
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject.optBoolean("accessable")) {
                    arrayList2.add(jSONObjectOptJSONObject.optString("resolution"));
                    arrayList2.add(jSONObjectOptJSONObject.optJSONObject("video_info").optString("url"));
                }
            }
            c cVar3 = new c();
            cVar3.f5264a = arrayList2;
            cVar3.f5265b = System.currentTimeMillis();
            this.f5259t.put(strM5764k, cVar3);
            return arrayList2;
        } catch (Exception e) {
            e.printStackTrace();
            ArrayList arrayList3 = new ArrayList();
            c cVar4 = new c();
            cVar4.f5264a = arrayList3;
            cVar4.f5265b = System.currentTimeMillis();
            this.f5259t.put(str2, cVar4);
            return arrayList3;
        }
    }

    /* JADX INFO: renamed from: n */
    public final String m5776n() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject("{\"conversation_id\":\"" + ("300000" + jCurrentTimeMillis) + "\",\"conversation_type\":3,\"msg_id\":\"" + (jCurrentTimeMillis + "000") + "\"}");
        Map<String, String> mapM5762g = m5762g();
        ((HashMap) mapM5762g).put("Content-Type", "application/json");
        JSONObject jSONObject2 = new JSONObject(C2238b.m6066f("https://drive-social-api.quark.cn/1/clouddrive/chat/conv/file/acquire_dl_token?pr=ucpro&fr=pc&sys=darwin&ve=3.19", jSONObject.toString(), mapM5762g).m6076a());
        return (jSONObject2.optInt("status") == 200 && jSONObject2.optInt("code") == 0) ? jSONObject2.optJSONObject("data").optString("token") : "";
    }

    public final String nickname() {
        return m5767r("nickname");
    }

    /* JADX INFO: renamed from: o */
    public final C2226d m5777o() {
        String strM6164a = C2268k.m6164a(C2268k.m6166b("/quark_cookie.txt"));
        return strM6164a.startsWith("{") ? C2226d.m6051e(strM6164a) : new C2226d(strM6164a);
    }

    /* JADX INFO: renamed from: p */
    public final C2194e m5778p(String str, String str2) {
        m5782u(str);
        ArrayList<C2223a> arrayList = new ArrayList();
        m5786x(str, str2, arrayList, "");
        Collections.sort(arrayList);
        List<String> quarkOptions = Config.getQuarkOptions();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C2223a c2223a : arrayList) {
            arrayList2.add(c2223a.m6029c() + "$" + (c2223a.m6029c() + "__" + c2223a.m6028b()) + Marker.ANY_NON_NULL_MARKER + str + Marker.ANY_NON_NULL_MARKER + c2223a.m6031d());
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(TextUtils.isEmpty(this.f5254b.m6045d()) ? "分享文件夹为空" : this.f5254b.m6045d());
            sb.append("$0+");
            sb.append(str);
            sb.append("+0");
            arrayList2.add(sb.toString());
        }
        for (int i = 0; i < quarkOptions.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C2194e c2194e = new C2194e();
        c2194e.m5848j(str);
        c2194e.m5846h(str + "/" + str2);
        c2194e.m5850l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp");
        c2194e.m5849k(this.f5254b.m6044c() == null ? "获取视频名称失败" : this.f5254b.m6044c().m6050b());
        c2194e.m5852n(TextUtils.join("$$$", arrayList3));
        c2194e.m5851m(TextUtils.join("$$$", quarkOptions));
        return c2194e;
    }

    /* JADX INFO: renamed from: r */
    public final void m5779r(String str, List<C2223a> list) {
        m5766q(str, 1, list);
    }

    /* JADX INFO: renamed from: s */
    public final String m5780s(String[] strArr, String str) {
        if (!m5777o().m6055d()) {
            C2256I.m6113i("还未登录夸克账号,请前往【配置中心】登录");
            return C2192c.m5794l("还未登录夸克账号,请前往【配置中心】登录");
        }
        m5761f("https://drive-pc.quark.cn/1/clouddrive/config?pr=ucpro&fr=pc&uc_param_str=", m5762g());
        String str2 = strArr[0];
        String str3 = strArr.length > 1 ? strArr[1] : "";
        String str4 = strArr.length > 2 ? strArr[2] : "";
        String str5 = str.split("#")[0];
        if (str2.contains("__")) {
            C2269l.m6178c("danmuvodindex", str2.split("__")[0]);
            str2 = str2.split("__")[1];
        }
        String str6 = Proxy.getUrl() + "?do=danmu&site=wangpan";
        if (str5.contains("无限")) {
            String strM3161b = C1273a.m3161b("quark", str3, str2, str4);
            C2192c c2192c = new C2192c();
            c2192c.m5827u(strM3161b);
            if (f5252t) {
                c2192c.m5816hh();
            } else {
                c2192c.m5815h();
            }
            c2192c.m5811e(m5762g());
            c2192c.m5806a(str6);
            return c2192c.toString();
        }
        String strM3159a = C1273a.m3159a("quark", str3, str2, str4);
        List<String> listM5775l = m5775l(str3, str2, str4);
        new Thread(new d()).start();
        if (!str5.contains("原画")) {
            C2192c c2192c2 = new C2192c();
            c2192c2.m5828v(listM5775l);
            c2192c2.m5815h();
            c2192c2.m5811e(m5762g());
            c2192c2.m5806a(str6);
            return c2192c2.toString();
        }
        C2192c c2192c3 = new C2192c();
        c2192c3.m5827u(strM3159a);
        if (f5252t) {
            c2192c3.m5816hh();
        } else {
            c2192c3.m5815h();
        }
        c2192c3.m5811e(m5762g());
        c2192c3.m5806a(str6);
        return c2192c3.toString();
    }

    /* JADX INFO: renamed from: ss */
    public final String m5781ss(String[] strArr, String str) throws JSONException, UnsupportedEncodingException {
        m5761f("https://drive-pc.quark.cn/1/clouddrive/config?pr=ucpro&fr=pc&uc_param_str=", m5762g());
        String strM3159a = C1273a.m3159a("quark", strArr.length > 1 ? strArr[1] : "", strArr[0], strArr.length > 2 ? strArr[2] : "");
        Map<String, String> mapM5762g = m5762g();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Referer", mapM5762g.get("Referer"));
        jSONObject.put("Cookie", mapM5762g.get("Cookie"));
        jSONObject.put("User-Agent", mapM5762g.get("User-Agent"));
        String str2 = strM3159a + "&header=" + URLEncoder.encode(jSONObject.toString(), "UTF-8");
        new Thread(new d()).start();
        return str2;
    }

    /* JADX INFO: renamed from: u */
    public final void m5782u(String str) {
        String str2;
        String strSubstring;
        try {
            C2225c c2225c = this.f5254b;
            if (c2225c == null || !c2225c.m6042a(str)) {
                if (str.contains("?pwd=")) {
                    int iIndexOf = str.indexOf("?pwd=");
                    String strSubstring2 = str.substring(0, iIndexOf);
                    strSubstring = str.substring(iIndexOf + "?pwd=".length());
                    str2 = strSubstring2;
                } else {
                    str2 = str;
                    strSubstring = "";
                }
                String str3 = str2;
                String str4 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/token?__t=" + System.currentTimeMillis();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("pwd_id", str2);
                jsonObject.addProperty("passcode", strSubstring);
                String strM6076a = C2238b.m6066f(str4, jsonObject.toString(), m5762g()).m6076a();
                JSONObject jSONObjectOptJSONObject = new JSONObject(strM6076a).optJSONObject("data");
                String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("stoken") : null;
                if (strOptString == null) {
                    strOptString = "";
                }
                Map map = this.tokenMap;
                if (map == null) {
                    map = new HashMap();
                    this.tokenMap = map;
                }
                map.put(str3, strOptString);
                C2225c c2225c2 = (C2225c) new Gson().fromJson(strM6076a, C2225c.class);
                c2225c2.m6047f(str);
                c2225c2.m6048g();
                this.f5254b = c2225c2;
                if (c2225c2.m6044c() == null) {
                    this.f5254b.m6046e(new JSONObject(strM6076a).optString("message"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5783v(String str) {
        try {
            if (str.startsWith("http")) {
                str = C2238b.m6073l(str, null).trim();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Map<String, String> mapM5762g = m5762g();
            HashMap map = (HashMap) mapM5762g;
            map.put("Cookie", str);
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            JSONObject jSONObject = new JSONObject(m5761f("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true", mapM5762g));
            if (!"200".equals(jSONObject.optString("status"))) {
                throw new Exception();
            }
            C2226d c2226d = new C2226d(str);
            c2226d.m6057g(jSONObject.optJSONObject("data").optString("member_type"));
            JSONObject jSONObject2 = new JSONObject(m5761f("https://pan.quark.cn/account/info?fr=pc&platform=pc", mapM5762g));
            StringBuilder sb = new StringBuilder();
            sb.append("->");
            int i = 1;
            sb.append(!jSONObject2.optBoolean("success"));
            SpiderDebug.log(sb.toString());
            c2226d.m6058h(!jSONObject2.optBoolean("success") ? "获取用户名异常" : jSONObject2.optJSONObject("data").optString("nickname"));
            Init.run(new RunnableC2182p(c2226d, C2268k.m6166b("/quark_cookie.txt"), i));
            return c2226d.m6055d();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5784w(String str, String str2, int i, List<C2223a> list) {
        if (this.f5254b.m6043b(str)) {
            String strSubstring = str;
            if (str.contains("?pwd=")) {
                strSubstring = str.substring(0, str.indexOf("?pwd="));
            }
            String strM5761f = m5761f("https://drive-pc.quark.cn/1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc&uc_param_str=&pwd_id=" + strSubstring + "&stoken=" + URLEncoder.encode(this.f5254b.m6044c().m6049a()) + "&pdir_fid=" + str2 + "&force=0&_page=" + i + "&_size=100&_sort=file_type:asc,file_name:asc", m5762g());
            C2224b c2224bM6037c = C2224b.m6037c(strM5761f);
            list.addAll(c2224bM6037c.m6038a().m6040a());
            boolean zM6041a = c2224bM6037c.m6039b().m6041a();
            boolean z = false;
            try {
                JSONObject jSONObject = new JSONObject(strM5761f).getJSONObject("metadata");
                int i2 = jSONObject.getInt("_total");
                int i3 = jSONObject.getInt("_count");
                if (i2 > 0) {
                    if (i * 100 < i2 && i3 == 100) {
                        z = true;
                    }
                    zM6041a = z;
                }
            } catch (Exception unused) {
            }
            if (zM6041a) {
                m5784w(str, str2, i + 1, list);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5785x(String str, String str2, List<C2223a> list) {
        int iM6027a;
        ArrayList<C2223a> arrayList = new ArrayList();
        m5784w(str, str2, 1, arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (C2223a c2223a : arrayList) {
            if (c2223a.m6033f()) {
                arrayList2.add(c2223a);
            } else if (c2223a.m6034g() && ((iM6027a = c2223a.m6027a()) == 1 || iM6027a == 2 || (iM6027a == 7 && c2223a.m6029c().toLowerCase().endsWith(".iso")))) {
                list.add(c2223a);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            m5785x(str, ((C2223a) it.next()).m6028b(), list);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5786x(String str, String str2, List<C2223a> list, String str3) {
        int iM6027a;
        ArrayList<C2223a> arrayList = new ArrayList();
        m5784w(str, str2, 1, arrayList);
        ArrayList<C2223a> arrayList2 = new ArrayList();
        for (C2223a c2223a : arrayList) {
            if (c2223a.m6033f()) {
                arrayList2.add(c2223a);
            } else if (c2223a.m6034g() && ((iM6027a = c2223a.m6027a()) == 1 || iM6027a == 2 || (iM6027a == 7 && c2223a.m6030cc().toLowerCase().endsWith(".iso")))) {
                c2223a.m6035h(str3);
                list.add(c2223a);
            }
        }
        for (C2223a c2223a2 : arrayList2) {
            m5786x(str, c2223a2.m6028b(), list, c2223a2.m6029c());
        }
    }
}
