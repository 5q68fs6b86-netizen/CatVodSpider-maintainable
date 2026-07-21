package com.github.catvod.spider.support.p044FM.p073b;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.github.catvod.spider.support.p044FM.p075c.C1765g;
import com.github.catvod.spider.support.p044FM.p075c.C1768j;
import com.github.catvod.spider.support.p044FM.p085j.C1820a;
import com.github.catvod.spider.support.p044FM.p085j.C1822c;
import com.github.catvod.spider.support.p044FM.p085j.C1824e;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p088m.C1842e;
import com.github.catvod.spider.support.p044FM.p090o.C1860a;
import com.github.catvod.spider.support.p044FM.p090o.C1867h;
import com.github.catvod.spider.support.p044FM.p090o.C1869j;
import com.github.catvod.spider.support.p044FM.p090o.C1871l;
import com.github.catvod.spider.support.p044FM.p090o.C1872m;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1722J {

    /* JADX INFO: renamed from: h */
    private static final String f3775h = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch";

    /* JADX INFO: renamed from: i */
    private static Map<String, C1824e> f3776i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f3777j = 0;

    /* JADX INFO: renamed from: a */
    private String f3778a;

    /* JADX INFO: renamed from: b */
    private ScheduledExecutorService f3779b;

    /* JADX INFO: renamed from: c */
    private String f3780c;

    /* JADX INFO: renamed from: d */
    private C1824e f3781d;

    /* JADX INFO: renamed from: e */
    private AlertDialog f3782e;

    /* JADX INFO: renamed from: f */
    private final Map<String, String> f3783f;

    /* JADX INFO: renamed from: g */
    private C1867h f3784g;

    C1722J() {
        Init.checkPermission();
        new ArrayList();
        HashMap map = new HashMap();
        this.f3783f = map;
        map.put("4k", "4K");
        map.put("2k", "2K");
        map.put("super", "超清");
        map.put("high", "高清");
        map.put("low", "流畅");
        map.put("normal", "一般");
        f3776i = new HashMap();
        SpiderDebug.log("QuarkYun Init");
    }

    /* JADX INFO: renamed from: A */
    private JSONObject m4016A(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        try {
            if (jSONObject.getInt("code") == 32003) {
                C1869j.m4522b("夸克容量已经用完, 请手动删除");
                return null;
            }
            f3776i = new HashMap();
            if (TextUtils.isEmpty(m4046I(str))) {
                return null;
            }
            m4022J(str);
            String strM4429f = "";
            for (C1820a c1820a : this.f3781d.m4441c()) {
                String strM4425b = c1820a.m4425b();
                if (strM4425b == str2 || (strM4425b != null && strM4425b.equals(str2))) {
                    strM4429f = c1820a.m4429f();
                    break;
                }
            }
            map.put("stoken", this.f3781d.m4440b().m4437a());
            map.put("fid_token_list", Collections.singletonList(strM4429f));
            return new JSONObject(m4020F("https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis(), map));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    private boolean m4017B() {
        try {
            JSONObject jSONObject = new JSONObject(C1840c.m4479n("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true", m4040t()));
            if (!"200".equals(jSONObject.optString("status"))) {
                throw new Exception();
            }
            this.f3780c = jSONObject.optJSONObject("data").optString("member_type");
            if (TextUtils.isEmpty(C1885z.m4576o(".quark"))) {
                m4043z();
                C1885z.m4580s(".quark", this.f3778a);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m4018C(String str) {
        try {
            JSONObject jSONObject = new JSONObject(C1840c.m4478m("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + str));
            if ("ok".equals(jSONObject.optString("message"))) {
                String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0");
                map.put("Accept", "application/json, text/plain, */*");
                map.put("Referer", "https://pan.quark.cn/");
                List listHeaders = C1840c.m4470e(C1711a.m3992b(new byte[]{103, -23, 0, 76, -6, 123, 36, -89, 127, -4, 26, 18, -8, 52, 106, -6, 100, -77, 23, 82, -90, 32, 104, -21, 96, -24, 26, 72, -90, 40, 101, -18, 96, -94, 7, 72, -76}, new byte[]{15, -99, 116, 60, -119, 65, 11, -120}) + strOptString + "&lw=scan", map).headers("set-cookie");
                String str2 = "";
                Iterator it = listHeaders.iterator();
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(";")[0] + ";";
                }
                m4047K(str2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: D */
    private void m4019D(String str, C1820a c1820a, List<C1820a> list) {
        if (this.f3781d.m4440b() == null) {
            return;
        }
        String strM4425b = c1820a.m4425b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            C1748s.m4098b(new byte[]{-84, 106, 84, -51, -6, -58, -93, -119, -96, 108, 73, -53, -20, -47, -4, -59, -22, 111, 85, -36, -5, -105, -94, -59, -86, 49, 17, -110, -22, -112, -29, -45, -96, 122, 82, -44, -1, -103, -93, -43, -84, 127, 82, -40, -90, -113, -28, -57, -74, 123, 80, -36, -18, -103, -93, -62, -95, 106, 65, -44, -27, -61, -4, -44, -7, 107, 67, -51, -5, -109, -86, -64, -74, 35, 80, -34, -81, -119, -17, -7, -76, 127, 82, -36, -28, -93, -1, -46, -74, 35, 6, -51, -2, -104, -45, -49, -96, 35}, new byte[]{-60, 30, 32, -67, -119, -4, -116, -90}, sb, str);
            sb.append("&stoken=");
            sb.append(URLEncoder.encode(this.f3781d.m4440b().m4437a()));
            C1748s.m4098b(new byte[]{122, 68, 79, -42, -46, 88, -59, -68, 56, 9}, new byte[]{92, 52, 43, -65, -96, 7, -93, -43}, sb, strM4425b);
            sb.append("&force=0&_page=");
            sb.append(i);
            sb.append("&_size=");
            sb.append(100);
            String strM4038q = m4038q(C1434P.m3588a(new byte[]{44, 37, -12, -121, -69, -87, -35, 126, 99, 22, -30, -73, -67, -92, -112, 125, 48, 27, -12, -117, -27, -69, -119, 116, 111, 37, -23, -119, -92, -72, -38, 121, 121, 25}, new byte[]{10, 122, -121, -24, -55, -35, -32, 24}, sb));
            for (C1820a c1820a2 : ((C1822c) new Gson().fromJson(strM4038q, C1822c.class)).m4436a().m4435a()) {
                if (c1820a2.m4431h()) {
                    arrayList.add(c1820a2);
                } else if ((c1820a2.m4432i() && c1820a2.m4424a() == 1) || (c1820a2.m4432i() && C1885z.m4570i().contains(c1820a2.m4427d()))) {
                    if (!this.f3781d.m4440b().m4438b().equals(c1820a.m4426c())) {
                        c1820a2.m4434k(c1820a.m4426c());
                    }
                    arrayList2.add(c1820a2);
                }
            }
            list.addAll(arrayList2);
            arrayList2 = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(strM4038q).getJSONObject("metadata");
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
            m4019D(str, (C1820a) it.next(), list);
        }
    }

    /* JADX INFO: renamed from: F */
    private String m4020F(String str, Map<String, Object> map) {
        C1842e c1842eM4472g = C1840c.m4472g(str, new JSONObject(map).toString(), m4040t());
        List<String> list = c1842eM4472g.m4483c().get("set-cookie");
        if (!(list == null) && list.size() > 0) {
            String str2 = this.f3778a;
            String str3 = "";
            try {
                String str4 = list.get(0).split(";")[0];
                String str5 = str4.split("=")[0];
                String str6 = str4.split(C1711a.m3992b(new byte[]{56}, new byte[]{5, 57, -48, -15, -45, -23, 67, 7}))[1];
                String string = "";
                for (String str7 : str2.split(";")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str7.indexOf(str5) > 0 ? str4 : str7 + ";");
                    string = sb.toString();
                }
                str3 = string.contains(str5) ? string : string + str4;
            } catch (Exception unused) {
            }
            this.f3778a = str3;
        }
        return c1842eM4472g.m4481a();
    }

    /* JADX INFO: renamed from: H */
    private String m4021H(String str, String str2, String str3, String str4, String str5) {
        try {
            if (TextUtils.isEmpty(this.f3780c)) {
                this.f3780c = "NORMAL";
            }
            HashMap<String, Integer> mapM4042x = m4042x();
            int iIntValue = mapM4042x.get("threads").intValue();
            int iIntValue2 = mapM4042x.get("chunksize").intValue();
            SpiderDebug.log("proxyVideo membership name: " + this.f3780c + " threads: " + iIntValue + " chunksize: " + iIntValue2);
            return String.format(Proxy.getUrl() + "?do=ali&type=video&site=quark&cate=%s&shareId=%s&fileId=%s&tokenId=%s&thread=%d&chunksize=%d&url=%s", str, str2, str3, str4, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str5);
        } catch (Exception e) {
            SpiderDebug.log("proxyVideoUrl ex:" + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: J */
    private void m4022J(String str) {
        ArrayList arrayList = new ArrayList();
        C1820a c1820a = new C1820a();
        c1820a.m4433j("");
        m4019D(str, c1820a, arrayList);
        this.f3781d.m4442d(arrayList);
    }

    /* JADX INFO: renamed from: M */
    private void m4023M() {
        ScheduledExecutorService scheduledExecutorService = this.f3779b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC1732c(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public static void m4024a(final C1722J c1722j, JSONObject jSONObject) {
        c1722j.getClass();
        try {
            int iM4531a = C1872m.m4531a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM4531a, iM4531a);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            final int i = 0;
            imageView.setImageBitmap(C1317a.m3301b(jSONObject.optString("url"), iM4531a));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.support.p044FM.p073b.D
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    switch (i) {
                        case 0:
                            C1722J.m4029f((C1722J) c1722j);
                            break;
                        default:
                            Bili.c((Bili) c1722j);
                            break;
                    }
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.support.p044FM.p073b.G
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i) {
                        case 0:
                            C1722J.m4025b((C1722J) c1722j);
                            break;
                        default:
                            Bili.f((Bili) c1722j);
                            break;
                    }
                }
            }).show();
            c1722j.f3782e = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new RunnableC1735f(c1722j, jSONObject, 1));
            C1869j.m4522b("请使用夸克 App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4025b(C1722J c1722j) {
        c1722j.m4023M();
    }

    /* JADX INFO: renamed from: d */
    public static void m4027d(C1722J c1722j) {
        c1722j.m4036o();
        Init.execute(new RunnableC1733d(c1722j, 2));
    }

    /* JADX INFO: renamed from: e */
    public static void m4028e(C1722J c1722j, EditText editText) {
        c1722j.getClass();
        String string = editText.getText().toString();
        c1722j.m4036o();
        Init.execute(new RunnableC1720H(c1722j, string, 0));
    }

    /* JADX INFO: renamed from: f */
    public static void m4029f(C1722J c1722j) {
        c1722j.m4023M();
    }

    /* JADX INFO: renamed from: g */
    public static void m4030g(C1722J c1722j, JSONObject jSONObject) {
        c1722j.getClass();
        String strOptString = jSONObject.optString("token");
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        c1722j.f3779b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC1734e(c1722j, strOptString, 2), 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: i */
    private boolean m4032i(List list) {
        Exception e;
        String strOptString = "";
        for (int i = 0; i < 3; i++) {
            try {
                HashMap map = new HashMap();
                map.put("filelist", list);
                map.put("exclude_fids", new ArrayList());
                map.put("action_type", 2);
                try {
                    String strM4020F = m4020F("https://drive-pc.quark.cn/1/clouddrive/file/delete?pr=ucpro&fr=pc&uc_param_str=", map);
                    SpiderDebug.log("deleteResult:" + strM4020F);
                    strOptString = new JSONObject(strM4020F).optJSONObject("data").optString("task_id");
                    if (!TextUtils.isEmpty(strOptString)) {
                        break;
                    }
                } catch (Exception e2) { Exception /*e=e2*/
                    C1751v.m4143c(new byte[]{-52, 2, 98, -1, 37, 38, 36}, new byte[]{-88, 103, 14, -102, 81, 67, 30, -78}, new StringBuilder(), e);
                    return true;
                }
            } catch (Exception e3) { Exception /*e=e3*/
                C1751v.m4143c(new byte[]{-52, 2, 98, -1, 37, 38, 36}, new byte[]{-88, 103, 14, -102, 81, 67, 30, -78}, new StringBuilder(), e);
                return true;
            }
        }
        return !TextUtils.isEmpty(strOptString) || m4032i(list);
    }

    /* JADX INFO: renamed from: l */
    private String m4033l(String str, String str2, String str3, Boolean bool) {
        try {
            List<C1820a> listM4441c = this.f3781d.m4441c();
            String strM4429f = "";
            if (listM4441c == null || listM4441c.size() == 0) {
                m4046I(str);
                m4022J(str);
                listM4441c = this.f3781d.m4441c();
            }
            if (listM4441c != null && listM4441c.size() > 0) {
                for (C1820a c1820a : listM4441c) {
                    if (C1747r.m4096d(c1820a.m4425b(), str2)) {
                        strM4429f = c1820a.m4429f();
                        break;
                    }
                }
            }
            if (strM4429f.isEmpty()) {
                return "";
            }
            String strM4039r = m4039r();
            String str4 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("pdir_fid", "0");
            map.put("pwd_id", str);
            map.put("scene", "link");
            byte b = -45;
            map.put("stoken", this.f3781d.m4440b().m4437a());
            map.put("to_pdir_fid", strM4039r);
            map.put("fid_list", Collections.singletonList(str2));
            map.put("fid_token_list", Collections.singletonList(strM4429f));
            JSONObject jSONObject = new JSONObject(m4020F(str4, map));
            if (jSONObject.getInt("code") == 41017) {
                return str2;
            }
            if (jSONObject.getInt("status") != 200 || jSONObject.getInt("code") != 0) {
                jSONObject = m4016A(jSONObject, str, str2, map);
                if (jSONObject == null) {
                    return "";
                }
                if (jSONObject.getInt("code") == 41017) {
                    return str2;
                }
                jSONObject.getInt("status");
            }
            String strOptString = jSONObject.optJSONObject("data").optString("task_id");
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (i < 5) {
                StringBuilder sb = new StringBuilder();
                sb.append(C1711a.m3992b(new byte[]{-62, 62, 52, -124, 10, 86, -114, -23, -50, 56, 41, -126, 28, 65, -47, -91, -124, 59, 53, -107, 11, 7, -113, -91, -60, 101, 113, -37, 26, 0, -50, -77, -50, 46, 50, -99, 15, 9, -114, -78, -53, 57, 43, -53, 9, 30, -100, -77, -55, 58, 50, -101, 95, 10, b, -5, -38, 41, 102, -127, 26, 51, -47, -89, -40, 43, 45, -85, 10, 24, b, -5, -116, 62, 33, -121, 18, 51, -56, -94, -105}, new byte[]{-86, 74, 64, -12, 121, 108, -95, -58}));
                sb.append(strOptString);
                sb.append(C1711a.m3992b(new byte[]{-13, -17, -49, -3, -12, -114, -116, -28, -69, -7, -49, -15, -69}, new byte[]{-43, -99, -86, -119, -122, -9, b, -115}));
                i++;
                sb.append(i);
                sb.append("&__t=");
                sb.append(System.currentTimeMillis());
                jSONArray = new JSONObject(m4038q(sb.toString())).optJSONObject("data").optJSONObject(C1711a.m3992b(new byte[]{-52, -94, 2, 24, 68, 1, -9}, new byte[]{-65, -61, 116, 125, 27, 96, -124, 47})).optJSONArray("save_as_top_fids");
                if (jSONArray.length() > 0) {
                    break;
                }
                TimeUnit.SECONDS.sleep(1L);
                b = -45;
            }
            return (bool.booleanValue() && jSONArray.length() == 0) ? m4033l(str, str2, str3, Boolean.FALSE) : jSONArray.optString(0);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX INFO: renamed from: m */
    private boolean m4034m() {
        ArrayList arrayList = new ArrayList();
        int i = 8;
        try {
            String strM4039r = m4039r();
            byte b = 2;
            int i2 = 3;
            int i3 = 4;
            byte b2 = 5;
            char c = 6;
            char c2 = 7;
            if (strM4039r.equals("0")) {
                return false;
            }
            long jM4053w = m4053w();
            int i4 = 1;
            while (true) {
                byte[] bArr = new byte[176];
                bArr[0] = 36;
                bArr[1] = 91;
                bArr[b] = -50;
                bArr[i2] = -6;
                bArr[i3] = 76;
                bArr[b2] = 110;
                bArr[c] = 105;
                bArr[c2] = -14;
                bArr[i] = 40;
                bArr[9] = 93;
                bArr[10] = -45;
                bArr[11] = -4;
                bArr[12] = 90;
                bArr[13] = 121;
                bArr[14] = 54;
                bArr[15] = -66;
                bArr[16] = 98;
                bArr[17] = 94;
                bArr[18] = -49;
                bArr[19] = -21;
                bArr[20] = 77;
                bArr[21] = 63;
                bArr[22] = 104;
                bArr[23] = -66;
                bArr[24] = 34;
                bArr[25] = 0;
                bArr[26] = -117;
                bArr[27] = -91;
                bArr[28] = 92;
                bArr[29] = 56;
                bArr[30] = 41;
                bArr[31] = -88;
                bArr[32] = 40;
                bArr[33] = 75;
                bArr[34] = -56;
                bArr[35] = -29;
                bArr[36] = 73;
                bArr[37] = 49;
                bArr[38] = 105;
                bArr[39] = -69;
                bArr[40] = 37;
                bArr[41] = 67;
                bArr[42] = -33;
                bArr[43] = -91;
                bArr[44] = 76;
                bArr[45] = 59;
                bArr[46] = 52;
                bArr[47] = -87;
                bArr[48] = 115;
                bArr[49] = 95;
                bArr[50] = -56;
                bArr[51] = -73;
                bArr[52] = 74;
                bArr[53] = 55;
                bArr[54] = 54;
                bArr[55] = -81;
                bArr[56] = 35;
                bArr[57] = 9;
                bArr[58] = -36;
                bArr[59] = -8;
                bArr[60] = b;
                bArr[61] = 36;
                bArr[62] = 37;
                bArr[63] = -5;
                bArr[64] = 57;
                bArr[65] = 76;
                bArr[66] = -27;
                bArr[67] = -6;
                bArr[68] = 94;
                bArr[69] = 38;
                bArr[70] = 39;
                bArr[71] = -80;
                bArr[72] = 19;
                bArr[73] = 92;
                bArr[74] = -50;
                bArr[75] = -8;
                bArr[76] = b;
                bArr[77] = 114;
                bArr[78] = 54;
                bArr[79] = -71;
                bArr[80] = 37;
                bArr[81] = 93;
                bArr[82] = -27;
                bArr[83] = -20;
                bArr[84] = 86;
                bArr[85] = 48;
                bArr[86] = 123;
                bArr[87] = -8;
                bArr[88] = 63;
                bArr[89] = 9;
                bArr[90] = -27;
                bArr[91] = -6;
                bArr[92] = 94;
                bArr[93] = 51;
                bArr[94] = 35;
                bArr[95] = -32;
                bArr[96] = 105;
                bArr[97] = 92;
                bArr[98] = -100;
                bArr[99] = -43;
                bArr[100] = 76;
                bArr[101] = 61;
                bArr[102] = 60;
                bArr[103] = -72;
                bArr[104] = 113;
                bArr[105] = 10;
                bArr[106] = -55;
                bArr[107] = -84;
                bArr[108] = 96;
                bArr[109] = 50;
                bArr[110] = 35;
                bArr[111] = -87;
                bArr[112] = 47;
                bArr[113] = 71;
                bArr[114] = -27;
                bArr[115] = -2;
                bArr[116] = 80;
                bArr[117] = 32;
                bArr[118] = 39;
                bArr[119] = -79;
                bArr[120] = 113;
                bArr[121] = 30;
                bArr[122] = -100;
                bArr[123] = -43;
                bArr[124] = 89;
                bArr[125] = 49;
                bArr[126] = 50;
                bArr[127] = -66;
                bArr[128] = 36;
                bArr[129] = 112;
                bArr[130] = -55;
                bArr[131] = -1;
                bArr[132] = 93;
                bArr[133] = 11;
                bArr[134] = 34;
                bArr[135] = -76;
                bArr[136] = 62;
                bArr[137] = 92;
                bArr[138] = -121;
                bArr[139] = -70;
                bArr[140] = 25;
                bArr[141] = 11;
                bArr[142] = 53;
                bArr[143] = -78;
                bArr[144] = 62;
                bArr[145] = 91;
                bArr[146] = -121;
                bArr[147] = -20;
                bArr[148] = 86;
                bArr[149] = 56;
                bArr[150] = 35;
                bArr[151] = -126;
                bArr[152] = 56;
                bArr[153] = 86;
                bArr[154] = -54;
                bArr[155] = -17;
                bArr[156] = b2;
                bArr[157] = 53;
                bArr[158] = 53;
                bArr[159] = -66;
                bArr[160] = 96;
                bArr[161] = 90;
                bArr[162] = -54;
                bArr[163] = -18;
                bArr[164] = 94;
                bArr[165] = 32;
                bArr[166] = 35;
                bArr[167] = -71;
                bArr[168] = 19;
                bArr[169] = 78;
                bArr[170] = -50;
                bArr[171] = -80;
                bArr[172] = 91;
                bArr[173] = 49;
                bArr[174] = 53;
                bArr[175] = -66;
                byte[] bArr2 = new byte[i];
                bArr2[0] = 76;
                bArr2[1] = 47;
                bArr2[b] = -70;
                bArr2[i2] = -118;
                bArr2[i3] = 63;
                bArr2[b2] = 84;
                bArr2[6] = 70;
                bArr2[7] = -35;
                String strM3992b = C1711a.m3992b(bArr, bArr2);
                Object[] objArr = new Object[i2];
                objArr[0] = strM4039r;
                objArr[1] = Integer.valueOf(i4);
                objArr[b] = 50;
                JSONObject jSONObject = new JSONObject(m4038q(String.format(strM3992b, objArr)));
                byte[] bArr3 = new byte[i3];
                bArr3[0] = 31;
                bArr3[1] = 97;
                bArr3[b] = 51;
                bArr3[i2] = 78;
                byte[] bArr4 = new byte[i];
                bArr4[0] = 123;
                bArr4[1] = 0;
                bArr4[b] = 71;
                bArr4[i2] = 47;
                bArr4[i3] = 81;
                bArr4[b2] = -108;
                bArr4[6] = 0;
                bArr4[7] = -81;
                JSONObject jSONObject2 = jSONObject.getJSONObject(C1711a.m3992b(bArr3, bArr4));
                byte[] bArr5 = new byte[i3];
                bArr5[0] = -55;
                bArr5[1] = -11;
                bArr5[b] = 37;
                bArr5[i2] = -1;
                byte[] bArr6 = new byte[i];
                bArr6[0] = -91;
                bArr6[1] = -100;
                bArr6[b] = 86;
                bArr6[i2] = -117;
                bArr6[i3] = 107;
                bArr6[5] = 42;
                bArr6[6] = 124;
                bArr6[7] = i;
                JSONArray jSONArray = jSONObject2.getJSONArray(C1711a.m3992b(bArr5, bArr6));
                int i5 = 0;
                int i6 = i;
                while (i5 < jSONArray.length()) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i5);
                    String str = this.f3780c;
                    byte[] bArr7 = new byte[6];
                    bArr7[0] = 80;
                    bArr7[1] = 63;
                    bArr7[b] = 82;
                    bArr7[3] = -118;
                    bArr7[4] = 56;
                    bArr7[5] = 122;
                    if (str.equals(C1711a.m3992b(bArr7, new byte[]{30, 112, 0, -57, 121, 54, 32, 123})) || jSONObject3.getLong("created_at") < jM4053w) {
                        String str2 = "fid";
                        arrayList.add(jSONObject3.getString(str2));
                    }
                    i5++;
                    i6 = 8;
                    b = 2;
                }
                byte[] bArr8 = new byte[i6];
                bArr8[0] = -37;
                bArr8[1] = -127;
                bArr8[2] = 78;
                bArr8[3] = -6;
                bArr8[4] = -4;
                bArr8[5] = 73;
                bArr8[6] = 26;
                bArr8[7] = 20;
                JSONObject jSONObject4 = jSONObject.getJSONObject(C1711a.m3992b(bArr8, new byte[]{-74, -28, 58, -101, -104, 40, 110, 117}));
                if (jSONObject4.getInt("_size") != jSONObject4.getInt("_count") || jSONObject4.getInt("_count") == 0) {
                    break;
                }
                i4++;
                i = 8;
                b = 2;
                i2 = 3;
                i3 = 4;
                b2 = 5;
                c = 6;
                c2 = 7;
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
            for (int i7 = 0; i7 < iCeil; i7++) {
                int i8 = i7 * 50;
                m4032i(new ArrayList(arrayList.subList(i8, Math.min(i8 + 50, size))));
            }
            return true;
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{10, -70, -118, 51, 100, 116, -118, 18, 10, -74, -108, 118, 124, 120, -39, 22, 78, -70, -108, 36, 42}, new byte[]{110, -33, -26, 86, 16, 17, -86, 98}, new StringBuilder(), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m4035n() {
        m4034m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m4036o() {
        try {
            AlertDialog alertDialog = this.f3782e;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static C1722J m4037p() {
        return C1721I.f3774a;
    }

    /* JADX INFO: renamed from: q */
    private String m4038q(String str) {
        return C1840c.m4479n(str, m4040t());
    }

    /* JADX INFO: renamed from: r */
    private String m4039r() {
        try {
            JSONArray jSONArray = new JSONObject(m4038q("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc")).getJSONObject("data").getJSONArray("list");
            String string = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                if (jSONObject.getBoolean("dir") && jSONObject.getString("file_name").equals("tvtemp")) {
                    string = jSONObject.getString("fid");
                    break;
                }
            }
            if (!string.equals("")) {
                return string;
            }
            HashMap map = new HashMap();
            map.put("pdir_fid", "0");
            map.put("file_name", "tvtemp");
            map.put("dir_path", "");
            map.put("dir_init_lock", Boolean.FALSE);
            return new JSONObject(m4020F("https://drive-pc.quark.cn/1/clouddrive/file?pr=ucpro&fr=pc&uc_param_str=", map)).getJSONObject("data").getString("fid");
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{77, 108, 29, -94, 6, 82, -92, -40, 78, 96, 27, -63, 12, 90, -25, -88}, new byte[]{42, 9, 105, -31, 105, 34, -35, -120}, new StringBuilder(), e);
            return "0";
        }
    }

    /* JADX INFO: renamed from: t */
    private Map<String, String> m4040t() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.f3778a)) {
            map.put("Cookie", this.f3778a);
        }
        map.put("Referer", "https://pan.quark.cn/");
        map.put("User-Agent", f3775h);
        return map;
    }

    /* JADX INFO: renamed from: u */
    private Map<String, String> m4041u() {
        String strM4094b;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(null)) {
            strM4094b = this.f3778a;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3778a);
            strM4094b = C1747r.m4094b(new byte[]{57}, new byte[]{2, -93, 117, -49, -93, -123, -52, -116}, sb, null);
        }
        map.put("Cookie", strM4094b);
        map.put("Referer", "https://pan.quark.cn/");
        map.put("User-Agent", f3775h);
        return map;
    }

    /* JADX INFO: renamed from: x */
    private HashMap<String, Integer> m4042x() {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            if (TextUtils.isEmpty(this.f3780c)) {
                this.f3780c = "NORMAL";
            }
            if (this.f3780c.equals("EXP_SVIP") || this.f3780c.equals("SUPER_VIP")) {
                map.put("threads", 16);
                map.put("chunksize", 0);
            } else {
                map.put("threads", 64);
                map.put("chunksize", 0);
            }
            String strM4497i = C1860a.m4497i(C1860a.m4502l("/.thread"));
            if (!strM4497i.isEmpty()) {
                JSONObject jSONObject = new JSONObject(strM4497i);
                map.put("threads", Integer.valueOf(jSONObject.optInt("threads", 16)));
                map.put("chunksize", Integer.valueOf(jSONObject.optInt("chunksize", 512) * 1024));
            }
        } catch (Exception unused) {
            map.put("threads", 16);
            map.put("chunksize", 0);
        }
        return map;
    }

    /* JADX INFO: renamed from: z */
    private void m4043z() {
        int iIndexOf = this.f3778a.indexOf("__pus");
        if (iIndexOf != -1) {
            int iIndexOf2 = this.f3778a.indexOf(";", iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = this.f3778a.length();
            }
            this.f3778a = this.f3778a.substring(iIndexOf, iIndexOf2).trim();
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m4044E(String[] strArr, String str) {
        if (TextUtils.isEmpty(this.f3778a)) {
            m4049j();
        }
        if (!str.split("#")[0].contains("原画")) {
            List<String> listM4052v = m4052v(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
            C1765g c1765g = new C1765g();
            c1765g.m4208y(listM4052v);
            c1765g.m4201j();
            c1765g.m4198f(m4041u());
            return c1765g.toString();
        }
        if (C1871l.m4525b(1).booleanValue()) {
            HashMap<String, Integer> mapM4042x = m4042x();
            String strM4526c = C1871l.m4526c(m4051s(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : ""), mapM4042x.get("threads").intValue(), mapM4042x.get("chunksize").intValue());
            if (strArr.length <= 4) {
                C1765g c1765g2 = new C1765g();
                c1765g2.m4207x(strM4526c);
                c1765g2.m4201j();
                c1765g2.m4198f(m4041u());
                return c1765g2.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            sb.append("?do=appdanmu&vodName=");
            sb.append(strArr[3]);
            sb.append("&vodIndex=");
            sb.append(strArr[4]);
            String strM3588a = C1434P.m3588a(new byte[]{42, -116, -26, 38, -49, 94, 7, 65}, new byte[]{12, -6, -119, 66, -102, 44, 107, 124}, sb);
            C1765g c1765g3 = new C1765g();
            c1765g3.m4207x(strM4526c);
            c1765g3.m4195a(strM3588a);
            c1765g3.m4201j();
            c1765g3.m4198f(m4041u());
            return c1765g3.toString();
        }
        if (TextUtils.isEmpty(C1871l.m4529f())) {
            String strM4021H = m4021H("down", strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", URLEncoder.encode(m4051s(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "")));
            SpiderDebug.log("playerContent: " + strM4021H);
            C1765g c1765g4 = new C1765g();
            c1765g4.m4207x(strM4021H);
            c1765g4.m4201j();
            c1765g4.m4198f(m4040t());
            return c1765g4.toString();
        }
        String strM4051s = m4051s(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
        if (strArr.length <= 4) {
            C1765g c1765g5 = new C1765g();
            c1765g5.m4207x(C1871l.m4527d(strM4051s));
            c1765g5.m4201j();
            c1765g5.m4198f(m4041u());
            return c1765g5.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Proxy.getUrl());
        sb2.append("?do=appdanmu&vodName=");
        sb2.append(strArr[3]);
        sb2.append("&vodIndex=");
        sb2.append(strArr[4]);
        String strM3588a2 = C1434P.m3588a(new byte[]{125, -4, 56, 62, 112, -33, -68, 80}, new byte[]{91, -118, 87, 90, 37, -83, -48, 109}, sb2);
        C1765g c1765g6 = new C1765g();
        c1765g6.m4207x(C1871l.m4527d(strM4051s));
        c1765g6.m4195a(strM3588a2);
        c1765g6.m4201j();
        c1765g6.m4198f(m4041u());
        return c1765g6.toString();
    }

    /* JADX INFO: renamed from: G */
    public final Object[] m4045G(Map<String, String> map) {
        try {
            map.get("shareId");
            map.get("fileId");
            String str = map.get("cate");
            map.get(C1711a.m3992b(new byte[]{38, 1, -14, -14, -53, -35, -74}, new byte[]{82, 110, -103, -105, -91, -108, -46, -116}));
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
            C1867h c1867h = this.f3784g;
            if (c1867h != null) {
                c1867h.m4519c();
            }
            SpiderDebug.log("proxyVideo numThreads: " + i2 + " chunksize: " + (i / 1024));
            C1867h c1867h2 = new C1867h(str2, treeMap, i2, i);
            this.f3784g = c1867h2;
            return c1867h2.m4520f();
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{-104, -59, -98, 113, 41, 100, 69, 106}, new byte[]{-3, -73, -20, 75, 19, 94, 110, 65}, new StringBuilder(), e);
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p044FM.p085j.e>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p044FM.p085j.e>] */
    /* JADX INFO: renamed from: I */
    public final String m4046I(String str) {
        C1824e c1824e = (C1824e) f3776i.get(str);
        this.f3781d = c1824e;
        if (c1824e != null && c1824e.m4439a(str)) {
            SpiderDebug.log("shareToken:" + this.f3781d.toString());
        }
        C1824e c1824e2 = this.f3781d;
        if (c1824e2 != null && c1824e2.m4439a(str)) {
            return this.f3781d.m4440b().m4437a();
        }
        String str2 = "https://drive-pc.quark.cn/1/clouddrive/share/sharepage/token?__t=" + System.currentTimeMillis();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pwd_id", str);
        jsonObject.addProperty("passcode", "");
        String strM4481a = C1840c.m4472g(str2, jsonObject.toString(), m4040t()).m4481a();
        StringBuilder sb = new StringBuilder();
        C1748s.m4098b(new byte[]{86, -31, -39, 87, 116, -91, 85, -30, 97, -26, -35, 86, 119, -42, 79, -26, 117, -15, -20, 74, 116, -32, 73, -36}, new byte[]{7, -108, -72, 37, 31, -123, 39, -121}, sb, str);
        sb.append("]...");
        sb.append(strM4481a);
        SpiderDebug.log(sb.toString());
        try {
            this.f3781d = (C1824e) new Gson().fromJson(strM4481a, C1824e.class);
            SpiderDebug.log("Stoken: " + this.f3781d.m4440b().m4437a());
            C1824e c1824e3 = this.f3781d;
            c1824e3.m4443e(str);
            c1824e3.m4444f();
            f3776i.put(str, this.f3781d);
            return this.f3781d.m4440b() == null ? "" : this.f3781d.m4440b().m4437a();
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{-52, -94, 7, 34, -66, 104, -78, -10, -42, -90, 19, 53, -113, 116, -79, -64, -48, -25, 48, 37, -70, 105, -79, -97}, new byte[]{-66, -57, 97, 80, -37, 27, -38, -91}, new StringBuilder(), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m4047K(String str) {
        SpiderDebug.log("cookie:" + str);
        this.f3778a = str;
        m4017B();
        m4023M();
    }

    /* JADX INFO: renamed from: L */
    public final void m4048L() {
        try {
            Toast.makeText(Init.context(), "还未登录夸克账号,请前往【配置中心】登录", 1).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log("showInput2 ex: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4049j() {
        int i = 1;
        try {
            try {
                this.f3778a = TextUtils.isEmpty(this.f3778a) ? C1885z.m4576o("quark_cookie.txt") : this.f3778a;
                SpiderDebug.log("cookie is: " + this.f3778a);
                if (TextUtils.isEmpty(this.f3778a)) {
                    throw new Exception("empty cookie");
                }
                if (!m4017B()) {
                    throw new Exception("invalid cookie");
                }
                while (this.f3778a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                m4050k();
                SystemClock.sleep(400L);
                SpiderDebug.log("checkCookie: " + e.getMessage());
                m4023M();
                Init.run(new RunnableC1731b(this, i));
                while (this.f3778a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            }
        } catch (Throwable th) {
            while (this.f3778a.isEmpty()) {
                SystemClock.sleep(300L);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4050k() {
        this.f3778a = "";
        C1885z.m4580s(".quark", this.f3778a);
    }

    /* JADX INFO: renamed from: s */
    public final String m4051s(String str, String str2, String str3) {
        try {
            m4046I(str);
            if (!TextUtils.isEmpty(str)) {
                m4034m();
            }
            String strM4033l = m4033l(str, str2, str3, Boolean.TRUE);
            if (TextUtils.isEmpty(strM4033l)) {
                return "";
            }
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(strM4033l);
            map.put("fids", arrayList);
            JSONObject jSONObject = new JSONObject(m4020F("https://drive-pc.quark.cn/1/clouddrive/file/download?pr=ucpro&fr=pc", map));
            if (jSONObject.getInt("status") == 200 && jSONObject.getInt("code") == 0) {
                return jSONObject.optJSONArray("data").optJSONObject(0).optString("download_url");
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: v */
    public final List<String> m4052v(String str, String str2, String str3, Boolean bool) {
        try {
            m4046I(str);
            String strM4033l = m4033l(str, str2, str3, Boolean.TRUE);
            char c = 3;
            int i = 8;
            HashMap map = new HashMap();
            map.put("fid", strM4033l);
            map.put("resolutions", C1711a.m3992b(new byte[]{-62, -48, -86, -46, 9, 6, -113, 94, -61, -56, -12, -41, 1, 13, -53, 30, -33, -54, -88, -38, 26, 70, -111, 89, -128, -117, -77}, new byte[]{-84, -65, -40, -65, 104, 106, -93, 50}));
            map.put("supports", "fmp4,m3u8");
            JSONObject jSONObject = new JSONObject(m4020F("https://drive-pc.quark.cn/1/clouddrive/file/v2/play?pr=ucpro&fr=pc&uc_param_str=", map));
            if (jSONObject.optString("message").contains("file not found")) {
                return new ArrayList();
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_list");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                byte[] bArr = new byte[10];
                bArr[0] = 109;
                bArr[1] = -121;
                bArr[2] = 23;
                bArr[c] = 84;
                bArr[4] = 76;
                bArr[5] = 115;
                bArr[6] = -126;
                bArr[7] = -42;
                bArr[i] = 96;
                bArr[9] = -127;
                byte[] bArr2 = new byte[i];
                bArr2[0] = 12;
                bArr2[1] = -28;
                bArr2[2] = 116;
                bArr2[c] = 49;
                bArr2[4] = 63;
                bArr2[5] = 0;
                bArr2[6] = -29;
                bArr2[7] = -76;
                if (jSONObjectOptJSONObject.optBoolean(C1711a.m3992b(bArr, bArr2))) {
                    Object r13 = this.f3783f;
                    byte[] bArr3 = new byte[10];
                    bArr3[0] = -106;
                    bArr3[1] = -104;
                    bArr3[2] = 118;
                    bArr3[c] = 117;
                    bArr3[4] = 115;
                    bArr3[5] = 14;
                    bArr3[6] = 30;
                    bArr3[7] = 122;
                    bArr3[8] = -117;
                    bArr3[9] = -109;
                    arrayList.add((String) r13.get(jSONObjectOptJSONObject.optString(C1711a.m3992b(bArr3, new byte[]{-28, -3, 5, 26, 31, 123, 106, 19}))));
                    arrayList.add(jSONObjectOptJSONObject.optJSONObject("video_info").optString("url"));
                }
                i2++;
                c = 3;
                i = 8;
            }
            List<String> listM4052v = arrayList;
            if (bool.booleanValue() && arrayList.size() == 0) {
                listM4052v = arrayList;
                listM4052v = m4052v(str, strM4033l, str3, Boolean.FALSE);
            }
            return listM4052v;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        } finally {
            if (!TextUtils.isEmpty(str)) {
                m4035n();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final long m4053w() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: y */
    public final C1768j m4054y(String str, String str2, String str3) {
        if (TextUtils.isEmpty(m4046I(str))) {
            return C1885z.m4563c();
        }
        ArrayList arrayList = new ArrayList();
        C1820a c1820a = new C1820a();
        c1820a.m4433j(str2);
        m4019D(str, c1820a, arrayList);
        if (arrayList.size() < 1) {
            return C1885z.m4563c();
        }
        this.f3781d.m4442d(arrayList);
        List listAsList = Arrays.asList("夸克原画");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strM3588a = "";
            if (!it.hasNext()) {
                break;
            }
            C1820a c1820a2 = (C1820a) it.next();
            if (!TextUtils.isEmpty(c1820a2.m4428e())) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(c1820a2.m4428e().trim());
                strM3588a = C1434P.m3588a(new byte[]{-117}, new byte[]{-42, 108, 49, -65, 28, -73, 11, -35}, sb);
            }
            StringBuilder sbM3589b = C1434P.m3589b(strM3588a);
            sbM3589b.append(c1820a2.m4426c());
            sbM3589b.append(c1820a2.m4430g());
            C1748s.m4098b(new byte[]{-11}, new byte[]{-47, -69, 50, -101, 68, -36, -54, -65}, sbM3589b, str);
            sbM3589b.append(Marker.ANY_NON_NULL_MARKER);
            sbM3589b.append(c1820a2.m4425b());
            sbM3589b.append(Marker.ANY_NON_NULL_MARKER);
            sbM3589b.append(c1820a2.m4429f());
            String string = sbM3589b.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                StringBuilder sbM3589b2 = C1434P.m3589b(string);
                C1748s.m4098b(new byte[]{-106}, new byte[]{-67, -35, 1, -93, -101, -11, 38, 20}, sbM3589b2, str3);
                sbM3589b2.append(Marker.ANY_NON_NULL_MARKER);
                sbM3589b2.append(c1820a2.m4426c());
                string = sbM3589b2.toString();
            }
            arrayList2.add(string);
        }
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C1768j c1768j = new C1768j();
        c1768j.m4221g(str);
        c1768j.m4219e(str);
        c1768j.m4223i("");
        c1768j.m4222h(this.f3781d.m4440b() == null ? "获取视频名称失败" : this.f3781d.m4440b().m4438b());
        c1768j.m4225k(TextUtils.join("$$$", arrayList3));
        c1768j.m4224j(TextUtils.join("$$$", listAsList));
        c1768j.m4216b("夸克网盘");
        return c1768j;
    }
}
