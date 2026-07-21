package com.github.catvod.spider.support.p117b;

import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p001A.C0101n;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.B */
/* JADX INFO: loaded from: classes.dex */
public final class C2144B {

    /* JADX INFO: renamed from: d */
    private static HashMap f5026d = new HashMap();

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f5027e = 0;

    /* JADX INFO: renamed from: e */
    private static String f5028e = "";

    /* JADX INFO: renamed from: t */
    public static boolean f5029t;

    /* JADX INFO: renamed from: a */
    private C2225c f5030a;

    /* JADX INFO: renamed from: b */
    private C2226d f5031b;

    /* JADX INFO: renamed from: b */
    private JSONObject f5032b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f5033c = new ArrayList();
    private String fid;

    /* JADX INFO: renamed from: s */
    private ConcurrentHashMap<String, b> f5034s;

    /* JADX INFO: renamed from: t */
    private ConcurrentHashMap<String, c> f5035t;
    private Map tokenMap;

    /* JADX INFO: renamed from: u */
    private String f5036u;

    /* JADX INFO: renamed from: u */
    private ConcurrentHashMap<String, c> f5037u;
    private String url;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.B$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static volatile C2144B f5038a = new C2144B();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.B$b */
    class b {

        /* JADX INFO: renamed from: a */
        String f5039a = null;

        /* JADX INFO: renamed from: b */
        long f5040b = 0;

        /* JADX INFO: renamed from: c */
        boolean f5041c = false;

        b() {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.B$c */
    class c {

        /* JADX INFO: renamed from: a */
        public List<String> f5042a;

        /* JADX INFO: renamed from: b */
        public long f5043b;
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.B$d */
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
                C2144B.this.deleteUCTempAsync();
            } catch (Exception e) {
                Log.e("UCCleanup", e.getMessage());
            }
        }
    }

    C2144B() {
    }

    /* JADX INFO: renamed from: G */
    private void m5418G(String str, String str2, String str3) {
        String str4;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("req_id", str);
            jSONObject.put("app_ver", "1.6.8");
            jSONObject.put("device_id", str2);
            jSONObject.put("device_brand", "vivo");
            jSONObject.put("platform", "tv");
            jSONObject.put("device_name", "V2238A");
            jSONObject.put("device_model", "V2238A");
            jSONObject.put("build_device", "V2238A");
            jSONObject.put("build_product", "V2238A");
            jSONObject.put("device_gpu", "Adreno (TM) 640");
            jSONObject.put("activity_rect", "{}");
            jSONObject.put("channel", "UCTVOFFICIALWEB");
            if (TextUtils.isEmpty(str3)) {
                str4 = "refresh_token";
                try {
                    str3 = this.f5032b.optString("refresh_token");
                } catch (Exception e) {
                    e = e;
                    SpiderDebug.log("getRefreshTokenByTV e:" + e);
                    return;
                }
            } else {
                str4 = "code";
            }
            jSONObject.put(str4, str3);
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("Content-Type", "application/json; charset=utf-8");
            JSONObject jSONObject2 = new JSONObject(C2238b.m6066f("http://api.extscreen.com/ucdrive/token", jSONObject.toString(), map).m6076a());
            if (jSONObject2.optInt("code") == 200) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                jSONObjectOptJSONObject.put("start_time", System.currentTimeMillis() / 1000);
                jSONObjectOptJSONObject.put("device_id", str2);
                C0101n.m865u("uc_token.txt", jSONObjectOptJSONObject.toString());
            }
        } catch (Exception e2) { Exception /*e=e2*/
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2144B m5419c() {
        return a.f5038a;
    }

    /* JADX INFO: renamed from: d */
    private String m5420d(String str, Map<String, String> map) {
        try {
            Response responseM6064d = C2238b.m6064d(str, map);
            List listHeaders = responseM6064d.headers("set-cookie");
            if (listHeaders.size() > 0) {
                C2226d c2226dM5442l = m5442l();
                String strM6120q = C2256I.m6120q(c2226dM5442l.m6052a(), (String) listHeaders.get(0));
                c2226dM5442l.m6056f(strM6120q);
                this.f5036u = strM6120q;
            }
            return responseM6064d.body().string();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private void deleteUCTemp() {
        try {
            String str = this.fid;
            if (str == null || str.isEmpty()) {
                return;
            }
            C2238b.m6066f("https://pc-api.uc.cn/1/clouddrive/file/delete?pr=UCBrowser&fr=pc", "{\"action_type\":2,\"filelist\":[\"" + str + "\"],\"exclude_fids\":[]}", m5421e());
        } catch (Exception e) {
            Log.e("UCTempDelete", "delete error: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    private Map<String, String> m5421e() {
        HashMap mapM5756b = C2186v.m5756b("Referer", "https://drive.uc.cn");
        String strM6052a = this.f5036u;
        if (TextUtils.isEmpty(strM6052a)) {
            strM6052a = m5442l().m6052a();
        }
        mapM5756b.put("Cookie", strM6052a);
        mapM5756b.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/2.5.20 Chrome/100.0.4896.160 Electron/18.3.5.4-b478491100 Safari/537.36 Channel/pckk_other_ch");
        return mapM5756b;
    }

    /* JADX INFO: renamed from: f */
    private Map<String, String> m5422f() {
        String str;
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/2.5.20 Chrome/100.0.4896.160 Electron/18.3.5.4-b478491100 Safari/537.36 Channel/pckk_other_ch");
        map.put("Accept-Encoding", "identity");
        String str2 = this.url;
        if (str2 == null || str2.isEmpty()) {
            str = "https://drive.uc.cn";
        } else {
            str = str2 + "\\";
        }
        map.put("Referer", str);
        return map;
    }

    /* JADX INFO: renamed from: h */
    private String m5423h() {
        String strM6164a = C2268k.m6164a(m5437i());
        if (TextUtils.isEmpty(strM6164a)) {
            strM6164a = C2238b.m6073l("https://pc-api.uc.cn/1/clouddrive/file", m5421e());
            if (TextUtils.isEmpty(strM6164a)) {
                return "";
            }
            C2268k.m6168c(m5437i(), strM6164a);
        }
        return strM6164a;
    }

    /* JADX INFO: renamed from: j */
    private String m5424j(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        m5447s(str);
        String strM5432a = m5432a(str, str2, str3, true);
        if (!TextUtils.isEmpty(strM5432a)) {
            this.f5033c.add(0, strM5432a);
        }
        return strM5432a;
    }

    /* JADX INFO: renamed from: m */
    private String m5425m() {
        try {
            Map<String, String> mapM5421e = m5421e();
            ((HashMap) mapM5421e).put("Cookie", m5442l().m6052a());
            JSONArray jSONArray = new JSONObject(m5420d("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&pdir_fid=0&_page=1&_size=200&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc", mapM5421e)).getJSONObject("data").getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("UCtemp".equals(jSONObject.getString("file_name"))) {
                    return jSONObject.getString("fid");
                }
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("pdir_fid", "0");
            jsonObject.addProperty("file_name", "UCtemp");
            jsonObject.addProperty("dir_path", "");
            jsonObject.addProperty("dir_init_lock", Boolean.FALSE);
            String string = jsonObject.toString();
            Map<String, String> mapM5421e2 = m5421e();
            ((HashMap) mapM5421e2).put("Cookie", m5442l().m6052a());
            String strOptString = new JSONObject(C2238b.m6066f("https://pc-api.uc.cn/1/clouddrive/file?pr=UCBrowser&fr=pc", string, mapM5421e2).m6076a()).optJSONObject("data").optString("fid");
            return !TextUtils.isEmpty(strOptString) ? strOptString : "0";
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("UC_temp_folder_error", "UC_temp_folder_error");
            return "0";
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m5426n(String str) {
        String str2;
        try {
            Map<String, String> mapM5421e = m5421e();
            ((HashMap) mapM5421e).put("Range", "bytes=0-1");
            Response responseM6064d = C2238b.m6064d(str, mapM5421e);
            if (responseM6064d.body() != null) {
                responseM6064d.body().close();
            }
            int iCode = responseM6064d.code();
            if (iCode < 200 || iCode >= 300 || (str2 = responseM6064d.headers().get("Content-Range")) == null) {
                return true;
            }
            Matcher matcher = Pattern.compile(".*/(\\d+)").matcher(str2);
            return !matcher.find() || Long.parseLong(matcher.group(1)) == 15340287;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o */
    private void m5427o(String str, int i, List<C2223a> list) {
        Map<String, String> mapM5421e = m5421e();
        ((HashMap) mapM5421e).put("Cookie", m5442l().m6052a());
        C2224b c2224bM6037c = C2224b.m6037c(m5420d("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&uc_param_str=&pdir_fid=" + str + "&_page=" + i + "&_size=100&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc", mapM5421e));
        if (c2224bM6037c.m6038a() == null) {
            return;
        }
        list.addAll(c2224bM6037c.m6038a().m6040a());
        if (c2224bM6037c.m6039b().m6041a()) {
            m5427o(str, i + 1, list);
        }
    }

    /* JADX INFO: renamed from: r */
    private String m5428r(String str) {
        try {
            return new JSONObject(C2268k.m6164a(a.f5038a.m5438j())).optString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: r */
    private String m5429r(String str, Map<String, Object> map) {
        return C2238b.m6066f(str, new JSONObject(map).toString(), m5421e()).m6076a();
    }

    /* JADX INFO: renamed from: rr */
    private String m5430rr(String str, Map<String, Object> map) {
        return C2238b.m6066f(str, new JSONObject(map).toString(), m5422f()).m6076a();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m5431Q() {
        try {
            JSONObject jSONObject = this.f5032b;
            if (jSONObject != null && jSONObject.optInt("status") == 0) {
                return true;
            }
            String strM4564c = C1885z.m4564c("uc_token.txt");
            if (TextUtils.isEmpty(strM4564c)) {
                throw new Exception("empty tvuc");
            }
            JSONObject jSONObject2 = new JSONObject(strM4564c);
            this.f5032b = jSONObject2;
            if ((jSONObject2.optLong("start_time") + this.f5032b.optLong("expires_in")) - (System.currentTimeMillis() / 1000) > 7200) {
                return true;
            }
            try {
                String str = System.currentTimeMillis() + "";
                String strOptString = this.f5032b.optString("device_id");
                m5418G(C2256I.m6109a(strOptString + str), strOptString, "");
            } catch (Exception unused) {
            }
            return true;
        } catch (Exception e) {
            SpiderDebug.log("setTvObject e:" + e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m5432a(String str, String str2, String str3, boolean z) {
        try {
            if (TextUtils.isEmpty(f5028e)) {
                f5028e = m5425m();
            }
            HashMap map = new HashMap();
            String str4 = "https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=UCBrowser&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis();
            map.put("pdir_fid", "0");
            map.put("pwd_id", str);
            map.put("scene", "link");
            map.put("stoken", this.f5030a.m6044c().m6049a());
            map.put("to_pdir_fid", f5028e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            map.put("fid_list", arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str3);
            map.put("fid_token_list", arrayList2);
            JSONObject jSONObject = new JSONObject(m5429r(str4, map));
            if (jSONObject.optInt("status") > 200) {
                String strOptString = jSONObject.optString("message");
                if (!strOptString.contains("转存文件token校验异常") || !z) {
                    C2256I.m6113i(strOptString);
                    return "";
                }
                String strM5436g = m5436g(str, str2);
                if (!TextUtils.isEmpty(strM5436g)) {
                    return m5432a(str, str2, strM5436g, false);
                }
                C2256I.m6113i(strOptString);
                return "";
            }
            String strOptString2 = jSONObject.optJSONObject("data").optString("task_id");
            for (int i = 1; i < 6; i++) {
                JSONObject jSONObject2 = new JSONObject(m5420d("https://pc-api.uc.cn/1/clouddrive/task?pr=UCBrowser&fr=pc&uc_param_str=&task_id=" + strOptString2 + "&retry_index=" + i + "&__t=" + System.currentTimeMillis(), m5421e()));
                if (jSONObject2.optInt("status") > 200) {
                    String strOptString3 = jSONObject2.optString("message");
                    if (strOptString3.contains("capacity limit")) {
                        strOptString3 = "云盘容量不足,转存失败,请清理云盘后再试试";
                    }
                    C2256I.m6113i(strOptString3);
                    return "";
                }
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONObject("data").optJSONObject("save_as").optJSONArray("save_as_top_fids");
                if (jSONArrayOptJSONArray.length() > 0) {
                    String strOptString4 = jSONArrayOptJSONArray.optString(0);
                    this.fid = strOptString4;
                    return strOptString4;
                }
                TimeUnit.SECONDS.sleep(1L);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5433b(String str, boolean z) {
        return true;
    }

    public void deleteUCTempAsync() {
        deleteUCTemp();
    }

    /* JADX INFO: renamed from: f */
    public final String m5434f(String str, String str2, String str3) {
        try {
            String strM5424j = m5424j(str, str2, str3);
            if (TextUtils.isEmpty(strM5424j)) {
                return "";
            }
            if (this.f5034s == null) {
                this.f5034s = new ConcurrentHashMap<>();
            }
            b bVar = this.f5034s.get(strM5424j);
            if (bVar != null && System.currentTimeMillis() - bVar.f5040b < 60000) {
                String str4 = bVar.f5039a;
                if (!TextUtils.isEmpty(str4)) {
                    f5029t = bVar.f5041c;
                    return str4;
                }
            }
            String strM5423h = m5423h();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(strM5424j);
            map.put("fids", arrayList);
            JSONObject jSONObject = new JSONObject(m5429r("https://pc-api.uc.cn/1/clouddrive/file/download?pr=UCBrowser&fr=pc&sys=win32&ve=1.8.6&ut=" + strM5423h, map));
            if (jSONObject.optString("message").contains("file not found")) {
                return "";
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONArray("data").optJSONObject(0);
            String strOptString = jSONObjectOptJSONObject.optString("download_url");
            boolean zContains = jSONObjectOptJSONObject.optString("format_type").toLowerCase().contains("iso");
            f5029t = zContains;
            if (strOptString != null && !strOptString.isEmpty()) {
                b bVar2 = new b();
                bVar2.f5039a = strOptString;
                bVar2.f5040b = System.currentTimeMillis();
                bVar2.f5041c = zContains;
                this.f5034s.put(strM5424j, bVar2);
                if (m5426n(strOptString)) {
                    C2256I.m6113i("UC网盘客户端机器码[" + strM5423h + "]无效,请退出重试");
                    C2268k.m6168c(m5437i(), "");
                }
            }
            return strOptString;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ff */
    public final String m5435ff(String str, String str2, String str3) {
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
            JSONArray jSONArrayOptJSONArray = new JSONObject(m5430rr("https://pc-api.uc.cn/1/clouddrive/file/download?pr=UCBrowser&fr=pc", map)).optJSONArray("data");
            if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                return "";
            }
            String strOptString = jSONObjectOptJSONObject.optString("download_url");
            this.url = strOptString;
            f5029t = jSONObjectOptJSONObject.optString("format_type").toLowerCase().contains("iso");
            return strOptString;
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m5436g(String str, String str2) {
        List<C2223a> arrayList = (List) f5026d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            m5451v(str, "", arrayList, "");
        }
        for (C2223a c2223a : arrayList) {
            if (str2.equals(c2223a.m6028b())) {
                return c2223a.m6031d();
            }
        }
        if (!f5026d.containsKey(str)) {
            f5026d.put(str, arrayList);
        }
        return "";
    }

    /* JADX INFO: renamed from: i */
    public final File m5437i() {
        return C2268k.m6166b("/uc_machine_code.txt");
    }

    /* JADX INFO: renamed from: j */
    public final File m5438j() {
        return C2268k.m6166b("/uc_cookie.txt");
    }

    /* JADX INFO: renamed from: j */
    public final String m5439j() {
        return m5428r("cookie");
    }

    /* JADX INFO: renamed from: k */
    public final List<String> m5440k(String str, String str2, String str3) {
        List<String> list;
        try {
            String strM5424j = m5424j(str, str2, str3);
            if (this.f5035t == null) {
                this.f5035t = new ConcurrentHashMap<>();
            }
            c cVar = this.f5035t.get(strM5424j);
            if (cVar != null && System.currentTimeMillis() - cVar.f5043b < 60000 && (list = cVar.f5042a) != null && !list.isEmpty()) {
                return list;
            }
            HashMap map = new HashMap();
            map.put("fid", strM5424j);
            map.put("resolutions", "normal,low,high,super,2k,4k");
            map.put("supports", "fmp4,m3u8");
            JSONObject jSONObject = new JSONObject(m5429r("https://pc-api.uc.cn/1/clouddrive/file/v2/play?pr=UCBrowser&fr=pc&uc_param_str=", map));
            if (jSONObject.optString("message").contains("file not found")) {
                ArrayList arrayList = new ArrayList();
                c cVar2 = new c();
                cVar2.f5042a = arrayList;
                cVar2.f5043b = System.currentTimeMillis();
                this.f5035t.put(strM5424j, cVar2);
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
            cVar3.f5042a = arrayList2;
            cVar3.f5043b = System.currentTimeMillis();
            this.f5035t.put(strM5424j, cVar3);
            return arrayList2;
        } catch (Exception e) {
            e.printStackTrace();
            ArrayList arrayList3 = new ArrayList();
            c cVar4 = new c();
            cVar4.f5042a = arrayList3;
            cVar4.f5043b = System.currentTimeMillis();
            this.f5035t.put(str2, cVar4);
            return arrayList3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:358)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v25 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    /* JADX INFO: renamed from: kk */
    public final java.util.List<java.lang.String> m5441kk(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.support.p117b.C2144B.m5441kk(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX INFO: renamed from: l */
    public final C2226d m5442l() {
        String strM6164a = C2268k.m6164a(C2268k.m6166b("/uc_cookie.txt"));
        return strM6164a.startsWith("{") ? C2226d.m6051e(strM6164a) : new C2226d(strM6164a);
    }

    /* JADX INFO: renamed from: m */
    public final C2194e m5443m(String str, String str2) {
        m5447s(str);
        ArrayList<C2223a> arrayList = new ArrayList();
        m5451v(str, str2, arrayList, "");
        Collections.sort(arrayList);
        List<String> uCOptions = Config.getUCOptions();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C2223a c2223a : arrayList) {
            arrayList2.add(c2223a.m6029c() + "$" + (c2223a.m6029c() + "__" + c2223a.m6028b()) + Marker.ANY_NON_NULL_MARKER + str + Marker.ANY_NON_NULL_MARKER + c2223a.m6031d());
        }
        if (arrayList2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            String strM6045d = this.f5030a.m6045d();
            if (TextUtils.isEmpty(strM6045d)) {
                strM6045d = "分享文件夹为空";
            }
            sb.append(strM6045d);
            sb.append("$0+");
            sb.append(str);
            sb.append("+0");
            arrayList2.add(sb.toString());
        }
        for (int i = 0; i < uCOptions.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C2194e c2194e = new C2194e();
        c2194e.m5848j(str);
        c2194e.m5846h(str + "/" + str2);
        c2194e.m5850l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp");
        c2194e.m5849k(this.f5030a.m6044c() == null ? "获取视频名称失败" : this.f5030a.m6044c().m6050b());
        c2194e.m5852n(TextUtils.join("$$$", arrayList3));
        c2194e.m5851m(TextUtils.join("$$$", uCOptions));
        return c2194e;
    }

    public final String nickname() {
        return m5428r("nickname");
    }

    /* JADX INFO: renamed from: p */
    public final void m5444p(String str, List<C2223a> list) {
        m5427o(str, 1, list);
    }

    /* JADX INFO: renamed from: q */
    public final String m5445q(String[] strArr, String str) {
        if (!m5442l().m6055d()) {
            C2256I.m6113i("还未登录UC账号,请前往【配置中心】登录");
            return C2192c.m5794l("还未登录UC账号,请前往【配置中心】登录");
        }
        m5420d("https://pc-api.uc.cn/1/clouddrive/config?pr=UCBrowser&fr=pc&uc_param_str=", m5421e());
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
            String strM5435ff = m5435ff(str3, str2, str4);
            C2192c c2192c = new C2192c();
            c2192c.m5827u(strM5435ff);
            if (f5029t) {
                c2192c.m5816hh();
            } else {
                c2192c.m5815h();
            }
            c2192c.m5811e(m5422f());
            c2192c.m5806a(str6);
            return c2192c.toString();
        }
        String strM3159a = C1273a.m3159a("uc", str3, str2, str4);
        List<String> listM5441kk = m5431Q() ? m5441kk(str3, str2, str4) : m5440k(str3, str2, str4);
        new Thread(new d()).start();
        if (!str5.contains("原画")) {
            C2192c c2192c2 = new C2192c();
            c2192c2.m5828v(listM5441kk);
            c2192c2.m5815h();
            c2192c2.m5811e(m5421e());
            c2192c2.m5806a(str6);
            return c2192c2.toString();
        }
        C2192c c2192c3 = new C2192c();
        c2192c3.m5827u(strM3159a);
        if (f5029t) {
            c2192c3.m5816hh();
        } else {
            c2192c3.m5815h();
        }
        c2192c3.m5811e(m5421e());
        c2192c3.m5806a(str6);
        return c2192c3.toString();
    }

    /* JADX INFO: renamed from: qq */
    public final String m5446qq(String[] strArr, String str) throws JSONException, UnsupportedEncodingException {
        m5420d("https://pc-api.uc.cn/1/clouddrive/config?pr=UCBrowser&fr=pc&uc_param_str=", m5421e());
        String strM3159a = C1273a.m3159a("uc", strArr.length > 1 ? strArr[1] : "", strArr[0], strArr.length > 2 ? strArr[2] : "");
        Map<String, String> mapM5421e = m5421e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Referer", mapM5421e.get("Referer"));
        jSONObject.put("Cookie", mapM5421e.get("Cookie"));
        jSONObject.put("User-Agent", mapM5421e.get("User-Agent"));
        String str2 = strM3159a + "&header=" + URLEncoder.encode(jSONObject.toString(), "UTF-8");
        new Thread(new d()).start();
        return str2;
    }

    /* JADX INFO: renamed from: s */
    public final void m5447s(String str) {
        try {
            C2225c c2225c = this.f5030a;
            if (c2225c == null || !c2225c.m6042a(str)) {
                String str2 = "https://pc-api.uc.cn/1/clouddrive/share/sharepage/token?__t=" + System.currentTimeMillis();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("pwd_id", str);
                jsonObject.addProperty("passcode", "");
                String strM6076a = C2238b.m6066f(str2, jsonObject.toString(), m5421e()).m6076a();
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
                map.put(str, strOptString);
                C2225c c2225c2 = (C2225c) new Gson().fromJson(strM6076a, C2225c.class);
                c2225c2.m6047f(str);
                c2225c2.m6048g();
                this.f5030a = c2225c2;
                if (c2225c2.m6044c() == null) {
                    this.f5030a.m6046e(new JSONObject(strM6076a).optString("message"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5448t(String str) {
        try {
            if (str.startsWith("http")) {
                str = C2238b.m6073l(str, null).trim();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Map<String, String> mapM5421e = m5421e();
            HashMap map = (HashMap) mapM5421e;
            map.put("Cookie", str);
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            JSONObject jSONObject = new JSONObject(m5420d("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc", mapM5421e));
            if (!"200".equals(jSONObject.optString("status"))) {
                throw new Exception();
            }
            C2226d c2226d = new C2226d(str);
            c2226d.m6057g(jSONObject.optJSONObject("data").optString("member_type"));
            JSONObject jSONObject2 = new JSONObject(m5420d("https://drive.uc.cn/account/info?fr=pc&platform=pc", mapM5421e));
            StringBuilder sb = new StringBuilder();
            sb.append("->");
            sb.append(!jSONObject2.optBoolean("success"));
            SpiderDebug.log(sb.toString());
            c2226d.m6058h(!jSONObject2.optBoolean("success") ? "用户名获取失败" : jSONObject2.optJSONObject("data").optString("nickname"));
            Init.run(new RunnableC2182p(c2226d, C2268k.m6166b("/uc_cookie.txt"), 1));
            return c2226d.m6055d();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m5449u(String str, String str2, int i, List<C2223a> list) {
        int i2;
        if (this.f5030a.m6043b(str)) {
            String strM5420d = m5420d("https://pc-api.uc.cn/1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=" + str + "&stoken=" + URLEncoder.encode(this.f5030a.m6044c().m6049a()) + "&pdir_fid=" + str2 + "&force=0&_page=" + i + "&_size=100&_fetch_banner=0&_fetch_share=0&_fetch_total=1&_sort=file_type:asc,file_name:asc", m5421e());
            list.addAll(((C2224b) new Gson().fromJson(strM5420d, C2224b.class)).m6038a().m6040a());
            try {
                JSONObject jSONObject = new JSONObject(strM5420d).getJSONObject("metadata");
                int i3 = jSONObject.getInt("_total");
                int i4 = jSONObject.getInt("_count");
                if (i3 <= 100 || (i2 = i * 100) >= i3 || i4 != i2) {
                    return;
                }
                m5449u(str, str2, i + 1, list);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5450v(String str, String str2, List<C2223a> list) {
        int iM6027a;
        ArrayList<C2223a> arrayList = new ArrayList();
        m5449u(str, str2, 1, arrayList);
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
            m5450v(str, ((C2223a) it.next()).m6028b(), list);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5451v(String str, String str2, List<C2223a> list, String str3) {
        int iM6027a;
        ArrayList<C2223a> arrayList = new ArrayList();
        m5449u(str, str2, 1, arrayList);
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
            m5451v(str, c2223a2.m6028b(), list, c2223a2.m6029c());
        }
    }
}
}

