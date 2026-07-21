package com.github.catvod.spider.support.p003AB.p005b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.AB.c.g;
import com.github.catvod.spider.support.AB.c.h;
import com.github.catvod.spider.support.AB.c.j;
import com.github.catvod.spider.support.AB.j.a;
import com.github.catvod.spider.support.AB.j.c;
import com.github.catvod.spider.support.AB.j.e;
import com.github.catvod.spider.support.p003AB.p004a.C0816a;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import com.github.catvod.spider.support.p003AB.p007m.C0871e;
import com.github.catvod.spider.support.p003AB.p009o.C0893C;
import com.github.catvod.spider.support.p003AB.p009o.C0895E;
import com.github.catvod.spider.support.p003AB.p009o.C0896F;
import com.github.catvod.spider.support.p003AB.p009o.C0897G;
import com.github.catvod.spider.support.p003AB.p009o.C0898H;
import com.github.catvod.spider.support.p003AB.p009o.C0899I;
import com.github.catvod.spider.support.p003AB.p009o.C0921c0;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0826J {

    /* JADX INFO: renamed from: i */
    private static final String f1939i = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch";

    /* JADX INFO: renamed from: j */
    private static Map<String, e> f1940j;

    /* JADX INFO: renamed from: k */
    public static final int f1941k = 0;

    /* JADX INFO: renamed from: a */
    private ScheduledExecutorService f1942a;

    /* JADX INFO: renamed from: b */
    private String f1943b;

    /* JADX INFO: renamed from: c */
    private String f1944c;

    /* JADX INFO: renamed from: d */
    private e f1945d;

    /* JADX INFO: renamed from: e */
    private String f1946e;

    /* JADX INFO: renamed from: f */
    private AlertDialog f1947f;

    /* JADX INFO: renamed from: g */
    private final Map<String, String> f1948g;

    /* JADX INFO: renamed from: h */
    private C0893C f1949h;

    C0826J() {
        Init.checkPermission();
        this.f1946e = C0869c.m2122b("https://drive-pc.quark.cn/1/clouddrive/file", m1992t()).m2134a();
        new ArrayList();
        HashMap map = new HashMap();
        this.f1948g = map;
        map.put("4k", "4K");
        map.put("2k", "2K");
        map.put("super", "超清");
        map.put("high", "高清");
        map.put("low", "流畅");
        map.put("normal", "一般");
        f1940j = new HashMap();
        SpiderDebug.log("QuarkYun Init");
    }

    /* JADX INFO: renamed from: C */
    private JSONObject m1968C(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        String strF;
        try {
            if (jSONObject.getInt("code") == 32003) {
                C0895E.m2152b("夸克容量已经用完, 请手动删除");
                return null;
            }
            f1940j = new HashMap();
            if (!TextUtils.isEmpty(m2000K(str))) {
                m1973L(str);
                for (a aVar : this.f1945d.c()) {
                    String strB = aVar.b();
                    if (strB == str2 || (strB != null && strB.equals(str2))) {
                        strF = aVar.f();
                        map.put("stoken", this.f1945d.b().a());
                        map.put("fid_token_list", Collections.singletonList(strF));
                        return new JSONObject(m1971G("https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis(), map));
                    }
                }
                strF = "";
                map.put("stoken", this.f1945d.b().a());
                map.put("fid_token_list", Collections.singletonList(strF));
                return new JSONObject(m1971G("https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis(), map));
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m1969D(String str) {
        try {
            JSONObject jSONObject = new JSONObject(C0869c.m2131k("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + str));
            if ("ok".equals(jSONObject.optString("message"))) {
                String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0");
                map.put("Accept", "application/json, text/plain, */*");
                map.put("Referer", "https://pan.quark.cn/");
                Iterator it = C0869c.m2125e("https://pan.quark.cn/account/info?st=" + strOptString + "&lw=scan", map).headers("set-cookie").iterator();
                String str2 = "";
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(";")[0] + ";";
                }
                m2001M(str2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E */
    private void m1970E(String str, a aVar, List<a> list, List<a> list2) {
        if (this.f1945d.b() == null) {
            return;
        }
        String strB = aVar.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            C0855v.m2060a(new byte[]{23, 121, 49, 54, 125, -95, -41, 84, 27, 127, 44, 48, 107, -74, -120, 24, 81, 124, 48, 39, 124, -16, -42, 24, 17, 34, 116, 105, 109, -9, -105, 14, 27, 105, 55, 47, 120, -2, -41, 8, 23, 108, 55, 35, 33, -24, -112, 26, 13, 104, 53, 39, 105, -2, -41, 31, 26, 121, 36, 47, 98, -92, -120, 9, 66, 120, 38, 54, 124, -12, -34, 29, 13, 48, 53, 37, 40, -18, -101, 36, 15, 108, 55, 39, 99, -60, -117, 15, 13, 48, 99, 54, 121, -1, -89, 18, 27, 48}, new byte[]{127, 13, 69, 70, 14, -101, -8, 123}, sb, str);
            sb.append("&stoken=");
            sb.append(URLEncoder.encode(this.f1945d.b().a()));
            C0855v.m2060a(new byte[]{-81, 6, -108, -18, -72, 69, -20, 22, -19, 75}, new byte[]{-119, 118, -16, -121, -54, 26, -118, 127}, sb, strB);
            sb.append("&force=0&_page=");
            sb.append(i);
            sb.append("&_size=");
            sb.append(100);
            String strM1989p = m1989p(C0853t.m2057b(new byte[]{54, 50, -23, -101, 69, -122, 105, -96, 121, 1, -1, -85, 67, -117, 36, -93, 42, 12, -23, -105, 27, -108, 61, -86, 117, 50, -12, -107, 90, -105, 110, -89, 99, 14}, new byte[]{16, 109, -102, -12, 55, -14, 84, -58}, sb));
            for (a aVar2 : ((c) C0852s.m2054a(strM1989p, c.class)).a().a()) {
                if (aVar2.h()) {
                    arrayList.add(aVar2);
                } else if ((aVar2.i() && aVar2.a() == 1) || (aVar2.i() && C0921c0.m2229l().contains(aVar2.d()))) {
                    if (!this.f1945d.b().b().equals(aVar.c())) {
                        aVar2.k(aVar.c());
                    }
                    arrayList2.add(aVar2);
                } else if (C0921c0.m2231n(C0921c0.m2223f(aVar2.c()))) {
                    list2.add(aVar2);
                }
            }
            list.addAll(arrayList2);
            arrayList2 = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(strM1989p).getJSONObject("metadata");
                int i2 = jSONObject.getInt("_total");
                int i3 = jSONObject.getInt("_count");
                if (i2 <= 100 || i * 100 == i2 || i3 != 100) {
                    break;
                } else {
                    i++;
                }
            } catch (Exception unused) {
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1970E(str, (a) it.next(), list, list2);
        }
    }

    /* JADX INFO: renamed from: G */
    private String m1971G(String str, Map<String, Object> map) {
        String str2 = "";
        C0871e c0871eM2127g = C0869c.m2127g(str, new JSONObject(map).toString(), m1992t());
        List<String> list = c0871eM2127g.m2136c().get("set-cookie");
        if (!(list == null) && list.size() > 0) {
            String strM2007x = m2007x();
            try {
                String str3 = list.get(0).split(";")[0];
                String str4 = str3.split("=")[0];
                String str5 = str3.split("=")[1];
                String[] strArrSplit = strM2007x.split(";");
                String string = "";
                for (String str6 : strArrSplit) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str6.indexOf(str4) > 0 ? str3 : str6 + ";");
                    string = sb.toString();
                }
                str2 = string.contains(str4) ? string : string + str3;
            } catch (Exception unused) {
            }
            this.f1943b = str2;
        }
        return c0871eM2127g.m2134a();
    }

    /* JADX INFO: renamed from: J */
    private String m1972J(String str, String str2, String str3, String str4, String str5) {
        try {
            if (TextUtils.isEmpty(m2005u())) {
                this.f1944c = "NORMAL";
            }
            HashMap<String, Integer> mapM1994z = m1994z();
            int iIntValue = mapM1994z.get("threads").intValue();
            int iIntValue2 = mapM1994z.get("chunksize").intValue();
            SpiderDebug.log("proxyVideo membership name: " + this.f1944c + " threads: " + iIntValue + " chunksize: " + iIntValue2);
            return String.format(Proxy.getUrl() + "?do=ali&type=video&site=quark&cate=%s&shareId=%s&fileId=%s&tokenId=%s&thread=%d&chunksize=%d&url=%s", str, str2, str3, str4, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str5);
        } catch (Exception e) {
            SpiderDebug.log("proxyVideoUrl ex:" + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: L */
    private void m1973L(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a aVar = new a();
        aVar.j("");
        m1970E(str, aVar, arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.addAll(arrayList2);
        this.f1945d.d(arrayList3);
    }

    /* JADX INFO: renamed from: O */
    private void m1974O() {
        ScheduledExecutorService scheduledExecutorService = this.f1942a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0834a(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public static void m1975a(C0826J c0826j, JSONObject jSONObject) {
        c0826j.getClass();
        try {
            int iA = com.github.catvod.spider.support.AB.J.a.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0899I.m2172b(jSONObject.optString("url"), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterfaceOnCancelListenerC0818B(c0826j, 0)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0821E(c0826j, 0)).show();
            c0826j.f1947f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new RunnableC0842i(c0826j, jSONObject, 1));
            C0895E.m2152b("请使用夸克 App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1976b(C0826J c0826j) {
        c0826j.m1974O();
    }

    /* JADX INFO: renamed from: d */
    public static void m1978d(C0826J c0826j) {
        c0826j.m1987n();
        Init.execute(new RunnableC0839f(c0826j, 1));
    }

    /* JADX INFO: renamed from: e */
    public static void m1979e(C0826J c0826j, EditText editText) {
        c0826j.getClass();
        String string = editText.getText().toString();
        c0826j.m1987n();
        Init.execute(new RunnableC0822F(c0826j, string, 0));
    }

    /* JADX INFO: renamed from: f */
    public static void m1980f(C0826J c0826j) {
        c0826j.m1974O();
    }

    /* JADX INFO: renamed from: g */
    public static void m1981g(C0826J c0826j, JSONObject jSONObject) {
        c0826j.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        c0826j.f1942a = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC0841h(c0826j, jSONObject.optString("token"), 1), 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: i */
    private boolean m1983i(List list) {
        String strOptString = "";
        for (int i = 0; i < 3; i++) {
            try {
                HashMap map = new HashMap();
                map.put("filelist", list);
                map.put("exclude_fids", new ArrayList());
                map.put("action_type", 2);
                String strM1971G = m1971G("https://drive-pc.quark.cn/1/clouddrive/file/delete?pr=ucpro&fr=pc&uc_param_str=", map);
                SpiderDebug.log("deleteResult:" + strM1971G);
                strOptString = new JSONObject(strM1971G).optJSONObject("data").optString("task_id");
                if (!TextUtils.isEmpty(strOptString)) {
                    break;
                }
            } catch (Exception e) {
                SpiderDebug.log("delete:" + e);
                return true;
            }
        }
        return !TextUtils.isEmpty(strOptString) || m1983i(list);
    }

    /* JADX INFO: renamed from: k */
    private com.github.catvod.spider.support.AB.c.e<String> m1984k(String str, String str2, String str3, Boolean bool) {
        String strF;
        try {
            List listC = this.f1945d.c();
            if (listC == null || listC.isEmpty()) {
                m2000K(str);
                m1973L(str);
                listC = this.f1945d.c();
            }
            if (listC != null && !listC.isEmpty()) {
                Iterator it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        strF = "";
                        break;
                    }
                    a aVar = (a) it.next();
                    if (C0817A.m1966a(aVar.b(), str2)) {
                        strF = aVar.f();
                        break;
                    }
                }
            } else {
                strF = "";
                break;
            }
            if (strF.isEmpty()) {
                return com.github.catvod.spider.support.AB.c.e.a("fileToken empty");
            }
            String strM1990q = m1990q();
            String str4 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("pdir_fid", "0");
            map.put("pwd_id", str);
            map.put("scene", "link");
            map.put("stoken", this.f1945d.b().a());
            map.put("to_pdir_fid", strM1990q);
            map.put("fid_list", Collections.singletonList(str2));
            map.put("fid_token_list", Collections.singletonList(strF));
            JSONObject jSONObject = new JSONObject(m1971G(str4, map));
            if (jSONObject.getInt("code") == 41017) {
                return com.github.catvod.spider.support.AB.c.e.h(str2);
            }
            if (jSONObject.getInt("status") == 200 && jSONObject.getInt("code") == 0) {
                String strOptString = jSONObject.optJSONObject("data").optString("task_id");
                JSONArray jSONArray = new JSONArray();
                int i = 0;
                while (i < 5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("https://drive-pc.quark.cn/1/clouddrive/task?pr=ucpro&fr=pc&uc_param_str=&task_id=");
                    sb.append(strOptString);
                    sb.append("&retry_index=");
                    i++;
                    sb.append(i);
                    sb.append("&__t=");
                    sb.append(System.currentTimeMillis());
                    String strM1989p = m1989p(sb.toString());
                    if (new JSONObject(strM1989p).optInt("code") == 32003) {
                        return com.github.catvod.spider.support.AB.c.e.a("容量已满, 建议购买会员");
                    }
                    jSONArray = new JSONObject(strM1989p).optJSONObject("data").optJSONObject("save_as").optJSONArray("save_as_top_fids");
                    if (jSONArray.length() > 0) {
                        break;
                    }
                    TimeUnit.SECONDS.sleep(1L);
                }
                return (bool.booleanValue() && jSONArray.length() == 0) ? m1984k(str, str2, str3, Boolean.FALSE) : com.github.catvod.spider.support.AB.c.e.h(jSONArray.optString(0));
            }
            JSONObject jSONObjectM1968C = m1968C(jSONObject, str, str2, map);
            if (jSONObjectM1968C == null) {
                return com.github.catvod.spider.support.AB.c.e.a("obj null");
            }
            return jSONObjectM1968C.getInt("code") == 41017 ? com.github.catvod.spider.support.AB.c.e.h(str2) : com.github.catvod.spider.support.AB.c.e.a(jSONObjectM1968C.getString("message"));
        } catch (Exception e) {
            return com.github.catvod.spider.support.AB.c.e.a(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m1985l() {
        ArrayList arrayList = new ArrayList();
        try {
            String strM1990q = m1990q();
            if (strM1990q.equals("0")) {
                return false;
            }
            long jM2228k = C0921c0.m2228k();
            int i = 1;
            while (true) {
                JSONObject jSONObject = new JSONObject(m1989p(String.format("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=%s&_page=%s&_size=%s&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", strM1990q, Integer.valueOf(i), 50)));
                JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("list");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (m2005u().equals("NORMAL") || jSONObject2.getLong("created_at") < jM2228k) {
                        arrayList.add(jSONObject2.getString("fid"));
                    }
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("metadata");
                if (jSONObject3.getInt("_size") != jSONObject3.getInt("_count") || jSONObject3.getInt("_count") == 0) {
                    break;
                }
                i++;
            }
            if (arrayList.size() == 0) {
                return true;
            }
            int size = arrayList.size();
            double d = size;
            double d2 = 50;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            int iCeil = (int) Math.ceil(d / d2);
            for (int i3 = 0; i3 < iCeil; i3++) {
                int i4 = i3 * 50;
                m1983i(new ArrayList(arrayList.subList(i4, Math.min(i4 + 50, size))));
            }
            return true;
        } catch (Exception e) {
            SpiderDebug.log("delete pdir list err:" + e);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m1986m() {
        m1985l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m1987n() {
        try {
            AlertDialog alertDialog = this.f1947f;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static C0826J m1988o() {
        return C0825I.f1938a;
    }

    /* JADX INFO: renamed from: p */
    private String m1989p(String str) {
        return C0869c.m2132l(str, m1992t());
    }

    /* JADX INFO: renamed from: q */
    private String m1990q() {
        String string;
        try {
            JSONArray jSONArray = new JSONObject(m1989p("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc")).getJSONObject("data").getJSONArray("list");
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    string = "";
                    break;
                }
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                if (jSONObject.getBoolean("dir") && jSONObject.getString("file_name").equals("tvtemp")) {
                    string = jSONObject.getString("fid");
                    break;
                }
                i++;
            }
            if (!string.equals("")) {
                return string;
            }
            HashMap map = new HashMap();
            map.put("pdir_fid", "0");
            map.put("file_name", "tvtemp");
            map.put("dir_path", "");
            map.put("dir_init_lock", Boolean.FALSE);
            return new JSONObject(m1971G("https://drive-pc.quark.cn/1/clouddrive/file?pr=ucpro&fr=pc&uc_param_str=", map)).getJSONObject("data").getString("fid");
        } catch (Exception e) {
            SpiderDebug.log("getCopyPdir ex: " + e);
            return "0";
        }
    }

    /* JADX INFO: renamed from: s */
    private String m1991s(String str) {
        StringBuilder sb = new StringBuilder();
        C0855v.m2060a(new byte[]{31, 121, 45, -52, -22, 58, -116, 21, 19, 127, 48, -54, -4, 45, -45, 89, 89, 124, 44, -35, -21, 107, -115, 89, 25, 34, 104, -109, -6, 108, -52, 79, 19, 105, 43, -43, -17, 101, -116, 92, 30, 97, 60, -109, -16, 110, -59, 85, 72, 125, 43, -127, -20, 99, -45, 72, 24, 43, 63, -50, -92, 112, -64, 28, 2, 110, 6, -52, -8, 114, -62, 87, 40, 126, 45, -50, -92, 38, -59, 83, 19, 48}, new byte[]{119, 13, 89, -68, -103, 0, -93, 58}, sb, str);
        return new JSONObject(C0869c.m2132l(C0853t.m2057b(new byte[]{88, 95, -99, 91, -12, -71, -13, 56, 24, 117, -105, 82, -33, -86, -6, 19, 22, 61, -53, 24, -18, -65, -2, 3, 33, 112, -119, 81, -26, -77, -9, 2, 33, 116, -102, 89, -13, -25, -86}, new byte[]{126, 0, -5, 62, -128, -38, -101, 103}, sb), m1992t())).optJSONObject("data").optString("file_name");
    }

    /* JADX INFO: renamed from: t */
    private Map<String, String> m1992t() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(m2007x())) {
            map.put("Cookie", m2007x());
        }
        map.put("Referer", "https://pan.quark.cn/");
        map.put("User-Agent", f1939i);
        return map;
    }

    /* JADX INFO: renamed from: v */
    private Map<String, String> m1993v() {
        HashMap map = new HashMap();
        map.put("Cookie", m2007x() + ";" + this.f1943b);
        map.put("Referer", "https://pan.quark.cn/");
        map.put("User-Agent", f1939i);
        return map;
    }

    /* JADX INFO: renamed from: z */
    private HashMap<String, Integer> m1994z() {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            if (TextUtils.isEmpty(m2005u())) {
                this.f1944c = "NORMAL";
            }
            if (this.f1944c.equals("EXP_SVIP")) {
                map.put("threads", 12);
            } else {
                this.f1944c.equals("SUPER_VIP");
                map.put("threads", 12);
            }
            map.put("chunksize", 409600);
            if (this.f1944c.equals("NORMAL")) {
                return map;
            }
            String strM2155c = C0896F.m2155c(C0896F.m2158f("/.thread"));
            if (!strM2155c.isEmpty()) {
                JSONObject jSONObject = new JSONObject(strM2155c);
                map.put("threads", Integer.valueOf(jSONObject.optInt("threads", 12)));
                map.put("chunksize", Integer.valueOf(jSONObject.optInt("chunksize", 400) * 1024));
            }
        } catch (Exception unused) {
            map.put("threads", 12);
            map.put("chunksize", 409600);
        }
        return map;
    }

    /* JADX INFO: renamed from: A */
    public final String m1995A(String str) {
        try {
            String str2 = "https://drive-social-api.quark.cn/1/clouddrive/chat/conv/msg/batch_send?pr=ucpro&fr=pc&sys=win32&ve=3.15.0&ut=" + this.f1946e + "&guid=";
            String strM1991s = m1991s(str);
            if (TextUtils.isEmpty(strM1991s)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject("{\"conversations\":[{\"conversation_id\":\"300000003429402383\",\"conversation_type\":3,\"file_list\":[{\"client_extra\":{\"device_model\":\"TVBOX\",\"group_id\":\"da9d11ff-5a5b-4b02-83cc-17f6a56d99cf\",\"local_msg_id\":\"8cd8f7b2-6f60-4f2b-99b5-1e7fbead3928\"},\"content\":\"" + strM1991s + "\",\"fid\":\"" + str + "\"}],\"merge_file\":0}],\"return_msg_as_list\":1}");
            Map<String, String> mapM1992t = m1992t();
            ((HashMap) mapM1992t).put("Content-Type", "application/json");
            String strOptString = new JSONObject(C0869c.m2127g(str2, jSONObject.toString(), mapM1992t).m2134a()).optJSONObject("data").optJSONArray("conversations").optJSONObject(0).optJSONArray("file_list").optJSONObject(0).optJSONObject("send_result").optString("store_msg_id");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            return new JSONObject(C0869c.m2127g("https://drive-social-api.quark.cn/1/clouddrive/chat/conv/file/acquire_dl_token?pr=ucpro&fr=pc&sys=win32&ve=3.15.0&ut=" + this.f1946e + "&guid=", new JSONObject("{\"conversation_id\":\"300000003429402383\",\"conversation_type\":3,\"msg_id\":\"" + strOptString + "\"}").toString(), mapM1992t).m2134a()).optJSONObject("data").optString("token");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: B */
    public final j m1996B(String str, String str2, String str3) {
        if (TextUtils.isEmpty(m2000K(str))) {
            return C0921c0.m2222e();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<a> arrayList2 = new ArrayList();
        a aVar = new a();
        aVar.j(str2);
        m1970E(str, aVar, arrayList, arrayList2);
        int i = 1;
        if (arrayList.size() < 1) {
            return C0921c0.m2222e();
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.addAll(arrayList2);
        this.f1945d.d(arrayList3);
        List listAsList = Arrays.asList("夸克原画", "夸克普画");
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strM2057b = "";
            if (!it.hasNext()) {
                break;
            }
            a aVar2 = (a) it.next();
            if (!TextUtils.isEmpty(aVar2.e())) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[i];
                bArr[0] = -120;
                sb.append(C0816a.m1965a(bArr, new byte[]{-45, -94, 27, -29, 102, 114, 110, 90}));
                sb.append(aVar2.e().trim());
                byte[] bArr2 = new byte[i];
                bArr2[0] = -124;
                strM2057b = C0853t.m2057b(bArr2, new byte[]{-39, 3, -68, 97, -111, -51, 6, -13}, sb);
            }
            StringBuilder sbM1967a = C0824H.m1967a(strM2057b);
            sbM1967a.append(aVar2.c());
            sbM1967a.append(aVar2.g());
            byte[] bArr3 = new byte[i];
            byte b = 105;
            bArr3[0] = 105;
            C0855v.m2060a(bArr3, new byte[]{77, -71, 100, -125, -60, -67, -123, -79}, sbM1967a, str);
            byte[] bArr4 = new byte[i];
            bArr4[0] = -49;
            sbM1967a.append(C0816a.m1965a(bArr4, new byte[]{-28, 60, 23, 65, 17, 99, 85, 60}));
            sbM1967a.append(aVar2.b());
            byte[] bArr5 = new byte[i];
            bArr5[0] = 48;
            sbM1967a.append(C0816a.m1965a(bArr5, new byte[]{27, -52, 101, -77, 11, 31, 36, 72}));
            sbM1967a.append(aVar2.f());
            String string = sbM1967a.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                StringBuilder sbM1967a2 = C0824H.m1967a(string);
                byte[] bArr6 = new byte[i];
                bArr6[0] = -113;
                C0855v.m2060a(bArr6, new byte[]{-92, 105, -19, -128, -63, 8, -107, 25}, sbM1967a2, str3);
                byte[] bArr7 = new byte[i];
                bArr7[0] = 63;
                sbM1967a2.append(C0816a.m1965a(bArr7, new byte[]{20, 84, -103, -80, -114, -11, -33, 42}));
                sbM1967a2.append(aVar2.c());
                string = sbM1967a2.toString();
            }
            StringBuilder sbM1967a3 = C0824H.m1967a(string);
            byte[] bArr8 = new byte[i];
            bArr8[0] = -81;
            sbM1967a3.append(C0816a.m1965a(bArr8, new byte[]{-124, -115, -112, -114, 9, -2, -88, 0}));
            String strC = aVar2.c();
            ArrayList<a> arrayList6 = new ArrayList();
            String lowerCase = C0921c0.m2235r(strC).toLowerCase();
            for (a aVar3 : arrayList2) {
                String lowerCase2 = C0921c0.m2235r(aVar3.c()).toLowerCase();
                if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                    arrayList6.add(aVar3);
                }
            }
            if (arrayList6.isEmpty()) {
                arrayList6.addAll(arrayList2);
            }
            StringBuilder sb2 = new StringBuilder();
            for (a aVar4 : arrayList6) {
                byte[] bArr9 = new byte[i];
                bArr9[0] = b;
                sb2.append(C0816a.m1965a(bArr9, new byte[]{66, 103, 43, 68, -77, 72, 6, 70}));
                sb2.append(C0921c0.m2235r(aVar4.c()));
                sb2.append("@@@");
                sb2.append(C0921c0.m2223f(aVar4.c()));
                sb2.append("@@@");
                sb2.append(aVar4.b());
                sb2.append("@@@");
                sb2.append(aVar4.f());
                i = 1;
                b = 105;
            }
            sbM1967a3.append(sb2.toString());
            arrayList4.add(sbM1967a3.toString());
            i = 1;
        }
        for (int i2 = 0; i2 < listAsList.size(); i2++) {
            arrayList5.add(TextUtils.join("#", arrayList4));
        }
        j jVar = new j();
        jVar.g(str);
        jVar.e(str);
        jVar.i("");
        jVar.h(this.f1945d.b() == null ? "获取视频名称失败" : this.f1945d.b().b());
        jVar.k(TextUtils.join("$$$", arrayList5));
        jVar.j(TextUtils.join("$$$", listAsList));
        jVar.b("夸克网盘");
        return jVar;
    }

    /* JADX INFO: renamed from: F */
    public final String m1997F(String[] strArr, String str) {
        com.github.catvod.spider.support.AB.c.e eVarM2006w;
        m2003j();
        if (str.split("#")[0].contains("原画")) {
            eVarM2006w = m2004r(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
            if (eVarM2006w.b() == 0) {
                String str2 = (String) eVarM2006w.c();
                if (C0898H.m2164b(5).booleanValue()) {
                    HashMap<String, Integer> mapM1994z = m1994z();
                    int iIntValue = mapM1994z.get("threads").intValue();
                    mapM1994z.get("chunksize").intValue();
                    String strM2166d = C0898H.m2166d(str2, iIntValue, 0);
                    if (strArr.length <= 4) {
                        g gVar = new g();
                        gVar.y(strM2166d);
                        gVar.x(m2008y(strArr));
                        gVar.j();
                        gVar.f(m1993v());
                        return gVar.toString();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(Proxy.getUrl());
                    sb.append("?do=danmu&vodName=");
                    sb.append(strArr[3]);
                    sb.append("&vodIndex=");
                    sb.append(strArr[4]);
                    String strM2057b = C0853t.m2057b(new byte[]{-56, 117, -49, -7, 38, 103, -56, 80}, new byte[]{-18, 3, -96, -99, 115, 21, -92, 109}, sb);
                    g gVar2 = new g();
                    gVar2.y(strM2166d);
                    gVar2.a(strM2057b);
                    gVar2.x(m2008y(strArr));
                    gVar2.j();
                    gVar2.f(m1993v());
                    return gVar2.toString();
                }
                if (TextUtils.isEmpty(C0898H.m2169g())) {
                    String strM1972J = m1972J("down", strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", URLEncoder.encode(str2));
                    g gVar3 = new g();
                    gVar3.y(strM1972J);
                    gVar3.x(m2008y(strArr));
                    gVar3.j();
                    gVar3.f(m1992t());
                    return gVar3.toString();
                }
                if (strArr.length <= 4) {
                    g gVar4 = new g();
                    gVar4.y(C0898H.m2167e(str2));
                    gVar4.j();
                    gVar4.f(m1993v());
                    return gVar4.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                sb2.append("?do=danmu&vodName=");
                sb2.append(strArr[3]);
                sb2.append("&vodIndex=");
                sb2.append(strArr[4]);
                String strM2057b2 = C0853t.m2057b(new byte[]{-30, 61, 55, 70, 75, 86, 27, 125}, new byte[]{-60, 75, 88, 34, 30, 36, 119, 64}, sb2);
                g gVar5 = new g();
                gVar5.y(C0898H.m2167e(str2));
                gVar5.a(strM2057b2);
                gVar5.x(m2008y(strArr));
                gVar5.j();
                gVar5.f(m1993v());
                return gVar5.toString();
            }
        } else {
            eVarM2006w = m2006w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
            if (eVarM2006w.b() == 0) {
                List list = (List) eVarM2006w.c();
                g gVar6 = new g();
                gVar6.z(list);
                gVar6.x(m2008y(strArr));
                gVar6.j();
                gVar6.f(m1993v());
                return gVar6.toString();
            }
        }
        return g.n(eVarM2006w.d());
    }

    /* JADX INFO: renamed from: H */
    public final Object[] m1998H(Map<String, String> map) {
        com.github.catvod.spider.support.AB.c.e<String> eVarM2004r = m2004r(map.get("shareId"), map.get("fileId"), map.get("fileToken"));
        if (eVarM2004r.b() != 0) {
            return null;
        }
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(C0921c0.m2237t(C0869c.m2125e((String) eVarM2004r.c(), m1992t()).body().bytes()))};
    }

    /* JADX INFO: renamed from: I */
    public final Object[] m1999I(Map<String, String> map) {
        try {
            map.get("shareId");
            map.get("fileId");
            String str = map.get("cate");
            map.get("tokenId");
            String str2 = map.get("url");
            SpiderDebug.log("params: " + map + "\n");
            SpiderDebug.log("url: " + str2 + "\n");
            String str3 = map.get("chunksize");
            String str4 = map.get("thread");
            int i = str3 != null ? Integer.parseInt(str3) * 1024 : 65536;
            int i2 = str4 != null ? Integer.parseInt(str4) : 10;
            if (!"down".equals(str)) {
                str2 = "";
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent", "cookie", "range");
            for (String str5 : map.keySet()) {
                if (listAsList.contains(str5)) {
                    treeMap.put(str5, map.get(str5));
                }
            }
            C0893C c0893c = this.f1949h;
            if (c0893c != null) {
                c0893c.m2149c();
            }
            SpiderDebug.log("proxyVideo numThreads: " + i2 + " chunksize: " + (i / 1024));
            C0893C c0893c2 = new C0893C(str2, treeMap, i2, i);
            this.f1949h = c0893c2;
            return c0893c2.m2150f();
        } catch (Exception e) {
            SpiderDebug.log("err:::++" + e);
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.AB.j.e>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.AB.j.e>] */
    /* JADX INFO: renamed from: K */
    public final String m2000K(String str) {
        e eVar = (e) f1940j.get(str);
        this.f1945d = eVar;
        if (eVar != null && eVar.a(str)) {
            SpiderDebug.log("shareToken:" + this.f1945d.toString());
        }
        e eVar2 = this.f1945d;
        if (eVar2 != null && eVar2.a(str)) {
            return this.f1945d.b().a();
        }
        String str2 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/token?__t=" + System.currentTimeMillis();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pwd_id", str);
        jsonObject.addProperty("passcode", "");
        String strM2134a = C0869c.m2127g(str2, jsonObject.toString(), m1992t()).m2134a();
        StringBuilder sb = new StringBuilder();
        C0855v.m2060a(new byte[]{-51, 92, -48, 22, -120, 63, -94, 42, -6, 91, -44, 23, -117, 76, -72, 46, -18, 76, -27, 11, -120, 122, -66, 20}, new byte[]{-100, 41, -79, 100, -29, 31, -48, 79}, sb, str);
        sb.append("]...");
        sb.append(strM2134a);
        SpiderDebug.log(sb.toString());
        try {
            this.f1945d = (e) new Gson().fromJson(strM2134a, e.class);
            SpiderDebug.log("Stoken: " + this.f1945d.b().a());
            e eVar3 = this.f1945d;
            eVar3.e(str);
            eVar3.f();
            f1940j.put(str, this.f1945d);
            return this.f1945d.b() == null ? "" : this.f1945d.b().a();
        } catch (Exception e) {
            SpiderDebug.log("refreshShareToken Quark:" + e);
            return "";
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m2001M(String str) {
        SpiderDebug.log("cookie:" + str);
        SpiderDebug.log("setQuarkCookie cookie: " + str);
        try {
            if (!TextUtils.isEmpty(str)) {
                Map<String, String> mapM1992t = m1992t();
                ((HashMap) mapM1992t).put("Cookie", str);
                JSONObject jSONObject = new JSONObject(C0869c.m2132l("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true", mapM1992t));
                SpiderDebug.log("setQuarkCookie cookie info: " + jSONObject);
                if ("200".equals(jSONObject.optString("status"))) {
                    C0897G.m2162c(".quarkMemberType", jSONObject.optJSONObject("data").optString("member_type"));
                    C0897G.m2162c(".quark", str);
                }
            }
        } catch (Exception e) {
            SpiderDebug.log("setQuarkCookie err: " + e.getMessage());
        }
        m1974O();
    }

    /* JADX INFO: renamed from: N */
    public final void m2002N() {
        try {
            int iA = com.github.catvod.spider.support.AB.J.a.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            this.f1947f = new AlertDialog.Builder(Init.getActivity()).setTitle("请输入夸克Cookie【支持字符串和Http】").setView(frameLayout).setNeutralButton("点我，使用夸克APP扫码", new DialogInterface.OnClickListener(this) { // from class: com.github.catvod.spider.support.AB.b.D

                /* JADX INFO: renamed from: a */
                public final C0826J f1929a;

                {
                    this.f1929a = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C0826J.m1978d(this.f1929a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0819C(this, editText, 0)).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log("showInput2 ex: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2003j() {
        try {
            try {
                if (TextUtils.isEmpty(m2007x())) {
                    throw new Exception("empty cookie");
                }
                while (TextUtils.isEmpty(m2007x())) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                SystemClock.sleep(400L);
                SpiderDebug.log("checkCookie: " + e.getMessage());
                m1974O();
                Init.run(new RunnableC0835b(this, 1));
                while (TextUtils.isEmpty(m2007x())) {
                    SystemClock.sleep(300L);
                }
            }
        } catch (Throwable th) {
            while (TextUtils.isEmpty(m2007x())) {
                SystemClock.sleep(300L);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public final com.github.catvod.spider.support.AB.c.e<String> m2004r(String str, String str2, String str3) {
        try {
            m2000K(str);
            if (!TextUtils.isEmpty(str)) {
                m1985l();
            }
            com.github.catvod.spider.support.AB.c.e<String> eVarM1984k = m1984k(str, str2, str3, Boolean.TRUE);
            if (eVarM1984k.b() != 0) {
                return eVarM1984k;
            }
            String str4 = (String) eVarM1984k.c();
            if (TextUtils.isEmpty(str4)) {
                return com.github.catvod.spider.support.AB.c.e.a("fileId 转存失败");
            }
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str4);
            map.put("fids", arrayList);
            String strM1995A = m1995A(str4);
            if (!TextUtils.isEmpty(strM1995A)) {
                map.put("token", strM1995A);
            }
            JSONObject jSONObject = new JSONObject(m1971G("https://drive-pc.quark.cn/1/clouddrive/file/download?pr=ucpro&fr=pc", map));
            if (jSONObject.getInt("status") == 200 && jSONObject.getInt("code") == 0) {
                return com.github.catvod.spider.support.AB.c.e.h(jSONObject.optJSONArray("data").optJSONObject(0).optString("download_url"));
            }
            return com.github.catvod.spider.support.AB.c.e.a(jSONObject.getString("message"));
        } catch (Exception e) {
            return com.github.catvod.spider.support.AB.c.e.a(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: u */
    public final String m2005u() {
        return C0897G.m2161b(".quarkMemberType");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: w */
    public final com.github.catvod.spider.support.AB.c.e<List<String>> m2006w(String str, String str2, String str3, Boolean bool) {
        try {
            m2000K(str);
            com.github.catvod.spider.support.AB.c.e<String> eVarM1984k = m1984k(str, str2, str3, Boolean.TRUE);
            if (eVarM1984k.b() != 0) {
                return com.github.catvod.spider.support.AB.c.e.a((String) eVarM1984k.c());
            }
            String str4 = (String) eVarM1984k.c();
            HashMap map = new HashMap();
            map.put("fid", str4);
            map.put("resolutions", "normal,low,high,super,2k,4k");
            map.put("supports", "fmp4,m3u8");
            JSONObject jSONObject = new JSONObject(m1971G("https://drive-pc.quark.cn/1/clouddrive/file/v2/play?pr=ucpro&fr=pc&uc_param_str=", map));
            if (jSONObject.optString("message").contains("file not found")) {
                return com.github.catvod.spider.support.AB.c.e.h(new ArrayList());
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_list");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject.optBoolean("accessable")) {
                    arrayList.add((String) this.f1948g.get(jSONObjectOptJSONObject.optString("resolution")));
                    arrayList.add(jSONObjectOptJSONObject.optJSONObject("video_info").optString("url"));
                }
            }
            return (bool.booleanValue() && arrayList.size() == 0) ? m2006w(str, str4, str3, Boolean.FALSE) : com.github.catvod.spider.support.AB.c.e.h(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
            return com.github.catvod.spider.support.AB.c.e.h(new ArrayList());
        } finally {
            if (!TextUtils.isEmpty(str)) {
                m1986m();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m2007x() {
        String strM2161b = C0897G.m2161b(".quark");
        return TextUtils.isEmpty(strM2161b) ? C0921c0.m2234q(".quark") : strM2161b;
    }

    /* JADX INFO: renamed from: y */
    public final List<h> m2008y(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            SpiderDebug.log(str);
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=zimu&type=quark&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2] + "&fileToken=" + strArrSplit[3];
                h hVar = new h();
                hVar.c(str2);
                h hVarA = hVar.a(str3);
                hVarA.d(str4);
                arrayList.add(hVarA);
            }
        }
        return arrayList;
    }
}
