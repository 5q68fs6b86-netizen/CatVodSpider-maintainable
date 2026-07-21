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
import com.github.catvod.spider.support.p044FM.p082g.C1804b;
import com.github.catvod.spider.support.p044FM.p086k.C1825a;
import com.github.catvod.spider.support.p044FM.p086k.C1827c;
import com.github.catvod.spider.support.p044FM.p086k.C1829e;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p088m.C1842e;
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

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C1729Q {

    /* JADX INFO: renamed from: h */
    private static final String f3797h = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.5 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch";

    /* JADX INFO: renamed from: i */
    private static Map<String, C1829e> f3798i;

    /* JADX INFO: renamed from: a */
    private String f3799a;

    /* JADX INFO: renamed from: b */
    private ScheduledExecutorService f3800b;

    /* JADX INFO: renamed from: c */
    private String f3801c;

    /* JADX INFO: renamed from: d */
    private C1829e f3802d;

    /* JADX INFO: renamed from: e */
    private AlertDialog f3803e;

    /* JADX INFO: renamed from: f */
    private final Map<String, String> f3804f;

    /* JADX INFO: renamed from: g */
    String f3805g;

    C1729Q() {
        Init.checkPermission();
        new ArrayList();
        HashMap map = new HashMap();
        this.f3804f = map;
        map.put("4k", "4K");
        map.put("2k", "2K");
        map.put("super", "超清");
        map.put("high", "高清");
        map.put("low", "流畅");
        map.put("normal", "一般");
        f3798i = new HashMap();
        m4082z();
        SpiderDebug.log("UcYun Init");
    }

    /* JADX INFO: renamed from: B */
    private JSONObject m4055B(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        try {
            if (jSONObject.getInt("code") == 32003) {
                C1869j.m4522b("夸克容量已经用完, 请手动删除");
                return null;
            }
            f3798i = new HashMap();
            if (TextUtils.isEmpty(m4086H(str))) {
                return null;
            }
            m4059I(str);
            String strM4450f = "";
            for (C1825a c1825a : this.f3802d.m4462c()) {
                String strM4446b = c1825a.m4446b();
                if (strM4446b == str2 || (strM4446b != null && strM4446b.equals(str2))) {
                    strM4450f = c1825a.m4450f();
                    break;
                }
            }
            map.put("stoken", this.f3802d.m4461b().m4458a());
            map.put("fid_token_list", Collections.singletonList(strM4450f));
            return new JSONObject(m4058F("https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis(), map));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    private boolean m4056C() {
        try {
            JSONObject jSONObject = new JSONObject(C1840c.m4479n("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home", m4079u()));
            if (!"200".equals(jSONObject.optString("status"))) {
                throw new Exception();
            }
            jSONObject.optJSONObject("data").optString("member_type");
            if (TextUtils.isEmpty(C1885z.m4576o(".uc"))) {
                C1885z.m4580s(".uc", this.f3799a);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: D */
    private void m4057D(String str, C1825a c1825a, List<C1825a> list) {
        if (this.f3802d.m4461b() == null) {
            return;
        }
        String strM4446b = c1825a.m4446b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            C1748s.m4098b(new byte[]{113, -56, -123, -9, -77, -105, 111, -35, 105, -33, -36, -26, -80, -60, 110, -121, 122, -110, -110, -23, -17, -100, 111, -111, 117, -45, -124, -29, -92, -33, 41, -124, 124, -109, -126, -17, -95, -33, 37, -35, 106, -44, -112, -11, -91, -35, 33, -107, 124, -109, -107, -30, -76, -52, 41, -98, 38, -52, -125, -70, -107, -18, 2, -128, 118, -53, -126, -30, -78, -117, 38, -128, 36, -52, -110, -95, -80, -38, 36, -83, 112, -40, -52}, new byte[]{25, -68, -15, -121, -64, -83, 64, -14}, sb, str);
            sb.append("&stoken=");
            sb.append(URLEncoder.encode(this.f3802d.m4461b().m4458a()));
            C1748s.m4098b(new byte[]{-66, -71, -106, 21, -2, 57, -19, 24, -4, -12}, new byte[]{-104, -55, -14, 124, -116, 102, -117, 113}, sb, strM4446b);
            sb.append("&force=0&_page=");
            sb.append(i);
            sb.append("&_size=");
            sb.append(100);
            String strM4077r = m4077r(C1434P.m3588a(new byte[]{18, 34, 119, -47, -88, 22, 75, -39, 86, 28, 127, -38, -71, 7, 30, -74, 18, 34, 119, -47, -88, 22, 75, -39, 71, 21, 112, -58, -71, 72, 19, -96, 107, 27, 116, -64, -65, 29, 124, -14, 91, 9, 112, -40, -31, 68, 5, -39, 71, 18, 99, -64, -31, 19, 74, -22, 81, 34, 101, -51, -84, 16, 25, -25, 71, 30, 61, -46, -75, 25, 70, -39, 90, 28, 124, -47, -26, 20, 80, -27}, new byte[]{52, 125, 17, -76, -36, 117, 35, -122}, sb));
            for (C1825a c1825a2 : ((C1827c) new Gson().fromJson(strM4077r, C1827c.class)).m4457a().m4456a()) {
                if (c1825a2.m4452h()) {
                    arrayList.add(c1825a2);
                } else if ((c1825a2.m4453i() && c1825a2.m4445a() == 1) || (c1825a2.m4453i() && C1885z.m4570i().contains(c1825a2.m4448d()))) {
                    if (!this.f3802d.m4461b().m4459b().equals(c1825a.m4447c())) {
                        c1825a2.m4455k(c1825a.m4447c());
                    }
                    arrayList2.add(c1825a2);
                }
            }
            if (!arrayList2.isEmpty()) {
                list.addAll(arrayList2);
                arrayList2 = new ArrayList();
            }
            try {
                JSONObject jSONObject = new JSONObject(strM4077r).getJSONObject("metadata");
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
            m4057D(str, (C1825a) it.next(), list);
        }
    }

    /* JADX INFO: renamed from: F */
    private String m4058F(String str, Map<String, Object> map) {
        C1842e c1842eM4472g = C1840c.m4472g(str, new JSONObject(map).toString(), m4079u());
        List<String> list = c1842eM4472g.m4483c().get("set-cookie");
        this.f3801c = this.f3799a;
        if (!(list == null) && list.size() > 0) {
            String str2 = this.f3801c;
            String str3 = "";
            try {
                String str4 = list.get(0).split(";")[0];
                String str5 = str4.split("=")[0];
                String str6 = str4.split("=")[1];
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
            this.f3801c = str3;
        }
        SpiderDebug.log("playCookie1: " + this.f3801c);
        return c1842eM4472g.m4481a();
    }

    /* JADX INFO: renamed from: I */
    private void m4059I(String str) {
        ArrayList arrayList = new ArrayList();
        C1825a c1825a = new C1825a();
        c1825a.m4454j("");
        m4057D(str, c1825a, arrayList);
        this.f3802d.m4463d(arrayList);
    }

    /* JADX INFO: renamed from: J */
    private void m4060J(String str) {
        this.f3799a = str;
        C1885z.m4580s(".uc", this.f3799a);
        m4056C();
        m4061L();
    }

    /* JADX INFO: renamed from: L */
    private void m4061L() {
        ScheduledExecutorService scheduledExecutorService = this.f3800b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC1733d(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public static void m4062a(C1729Q c1729q) {
        c1729q.m4061L();
    }

    /* JADX INFO: renamed from: b */
    public static void m4063b(final C1729Q c1729q, final JSONObject jSONObject) {
        c1729q.getClass();
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
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.support.p044FM.p073b.K
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C1729Q.m4068g(this.f3785a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.support.p044FM.p073b.M
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C1729Q.m4062a(this.f3789a);
                }
            }).show();
            c1729q.f3803e = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.p044FM.p073b.O
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            C1729Q.m4071j((C1729Q) c1729q, (JSONObject) jSONObject);
                            break;
                        default:
                            Bili.d((Bili) c1729q, (C1804b) jSONObject);
                            break;
                    }
                }
            });
            C1869j.m4522b("请使用UC App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4064c(C1729Q c1729q, EditText editText) {
        c1729q.getClass();
        String string = editText.getText().toString();
        c1729q.m4075p();
        Init.execute(new RunnableC1726N(c1729q, string, 0));
    }

    /* JADX INFO: renamed from: d */
    public static void m4065d(C1729Q c1729q, String str) {
        c1729q.getClass();
        if (str.startsWith("http")) {
            str = C1840c.m4479n(str, null);
        }
        c1729q.m4060J(str);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4067f(C1729Q c1729q, String str) {
        c1729q.getClass();
        HashMap map = new HashMap();
        map.put("client_id", "381");
        map.put("v", "1.2");
        map.put("request_id", c1729q.f3805g);
        map.put("token", str);
        try {
            JSONObject jSONObject = new JSONObject(C1840c.m4473h("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?__dt=97123&_t=" + c1729q.f3805g, map, c1729q.m4079u()).m4481a());
            if ("ok".equals(jSONObject.optString("message"))) {
                String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                HashMap map2 = new HashMap();
                map2.put("Accept", "application/json, text/plain, */*");
                map2.put("Referer", "https://drive.uc.cn/");
                String str2 = "";
                Iterator it = C1840c.m4470e("https://drive.uc.cn/account/info?st=" + strOptString, map2).headers("set-cookie").iterator();
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(";")[0] + ";";
                }
                c1729q.m4060J(str2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m4068g(C1729Q c1729q) {
        c1729q.m4061L();
    }

    /* JADX INFO: renamed from: i */
    public static void m4070i(C1729Q c1729q) {
        c1729q.m4075p();
        Init.execute(new RunnableC1731b(c1729q, 2));
    }

    /* JADX INFO: renamed from: j */
    public static void m4071j(C1729Q c1729q, JSONObject jSONObject) {
        c1729q.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        c1729q.f3800b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC1720H(c1729q, jSONObject.optString("token"), 1), 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: k */
    private boolean m4072k(List list) {
        Exception e;
        String strOptString = "";
        for (int i = 0; i < 3; i++) {
            try {
                HashMap map = new HashMap();
                map.put("filelist", list);
                map.put("exclude_fids", new ArrayList());
                map.put("action_type", 2);
                try {
                    String strM4058F = m4058F("https://pc-api.uc.cn/1/clouddrive/file/delete?pr=UCBrowser&fr=pc", map);
                    SpiderDebug.log("deleteResult:" + strM4058F);
                    strOptString = new JSONObject(strM4058F).optJSONObject("data").optString("task_id");
                    if (!TextUtils.isEmpty(strOptString)) {
                        break;
                    }
                } catch (Exception e2) {
                    e = e2;
                    C1751v.m4143c(new byte[]{-3, -121, 118, 8, -8, -33, 36}, new byte[]{-103, -30, 26, 109, -116, -70, 30, -90}, new StringBuilder(), e);
                    return true;
                }
            } catch (Exception e3) {
                e = e3;
                C1751v.m4143c(new byte[]{-3, -121, 118, 8, -8, -33, 36}, new byte[]{-103, -30, 26, 109, -116, -70, 30, -90}, new StringBuilder(), e);
                return true;
            }
        }
        return !TextUtils.isEmpty(strOptString) || m4072k(list);
    }

    /* JADX INFO: renamed from: n */
    private String m4073n(String str, String str2, String str3, Boolean bool) {
        String strM4450f;
        try {
            List<C1825a> listM4462c = this.f3802d.m4462c();
            if (listM4462c == null || listM4462c.size() == 0) {
                m4086H(str);
                m4059I(str);
                listM4462c = this.f3802d.m4462c();
            }
            if (listM4462c != null && listM4462c.size() > 0) {
                Iterator<C1825a> it = listM4462c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        strM4450f = "";
                        break;
                    }
                    C1825a next = it.next();
                    if (C1747r.m4096d(next.m4446b(), str2)) {
                        strM4450f = next.m4450f();
                        break;
                    }
                }
            } else {
                strM4450f = "";
                break;
            }
            if (strM4450f.isEmpty()) {
                return "";
            }
            String strM4078s = m4078s();
            byte b = 1;
            HashMap map = new HashMap();
            map.put("scene", "link");
            map.put("pdir_fid", "0");
            map.put("pwd_id", str);
            map.put(C1711a.m3992b(new byte[]{115, 108, -57, -56, 119, -107}, new byte[]{0, 24, -88, -93, 18, -5, 116, 40}), this.f3802d.m4461b().m4458a());
            byte b2 = -62;
            map.put("to_pdir_fid", strM4078s);
            map.put("fid_list", Collections.singletonList(str2));
            map.put("fid_token_list", Collections.singletonList(strM4450f));
            JSONObject jSONObject = new JSONObject(m4058F("https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=UCBrowser&fr=pc&sys=win32&ve=1.5.2", map));
            if (jSONObject.getInt("code") == 41017) {
                return str2;
            }
            if (jSONObject.getInt("status") != 200 || jSONObject.getInt("code") != 0) {
                jSONObject = m4055B(jSONObject, str, str2, map);
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
            int i2 = 5;
            while (i < i2) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[76];
                bArr[0] = 81;
                bArr[b] = -67;
                bArr[2] = -16;
                bArr[3] = -14;
                bArr[4] = b2;
                bArr[5] = 36;
                bArr[6] = -50;
                bArr[7] = 114;
                bArr[8] = 73;
                bArr[9] = -86;
                bArr[10] = -87;
                bArr[11] = -29;
                bArr[12] = -63;
                bArr[13] = 119;
                bArr[14] = -49;
                bArr[15] = 40;
                bArr[16] = 90;
                bArr[17] = -25;
                bArr[18] = -25;
                bArr[19] = -20;
                bArr[20] = -98;
                bArr[21] = 47;
                bArr[22] = -50;
                bArr[23] = 62;
                bArr[24] = 85;
                bArr[25] = -90;
                bArr[26] = -15;
                bArr[27] = -26;
                bArr[28] = -43;
                bArr[29] = 108;
                bArr[30] = -120;
                bArr[31] = 43;
                bArr[32] = 92;
                bArr[33] = -26;
                bArr[34] = -16;
                bArr[35] = -29;
                bArr[36] = b2;
                bArr[37] = 117;
                bArr[38] = -34;
                bArr[39] = 45;
                bArr[40] = 75;
                bArr[41] = -12;
                bArr[42] = -47;
                bArr[43] = -63;
                bArr[44] = -13;
                bArr[45] = 108;
                bArr[46] = -114;
                bArr[47] = 42;
                bArr[48] = 74;
                bArr[49] = -84;
                bArr[50] = -10;
                bArr[51] = -92;
                bArr[52] = -41;
                bArr[53] = 108;
                bArr[54] = -36;
                bArr[55] = 45;
                bArr[56] = 90;
                bArr[57] = -17;
                bArr[58] = -9;
                bArr[59] = -5;
                bArr[60] = b2;
                bArr[61] = 35;
                bArr[62] = -106;
                bArr[63] = 52;
                bArr[64] = 87;
                bArr[65] = -6;
                bArr[66] = -74;
                bArr[67] = -92;
                bArr[68] = -59;
                bArr[69] = 127;
                bArr[70] = -110;
                bArr[71] = 54;
                bArr[72] = 102;
                bArr[73] = -96;
                bArr[74] = -32;
                bArr[75] = -65;
                byte[] bArr2 = new byte[8];
                bArr2[0] = 57;
                bArr2[b] = -55;
                bArr2[2] = -124;
                bArr2[3] = -126;
                bArr2[4] = -79;
                bArr2[5] = 30;
                bArr2[6] = -31;
                bArr2[7] = 93;
                sb.append(C1711a.m3992b(bArr, bArr2));
                sb.append(strOptString);
                byte[] bArr3 = new byte[13];
                bArr3[0] = 14;
                bArr3[b] = 40;
                bArr3[2] = -34;
                bArr3[3] = 121;
                bArr3[4] = -69;
                bArr3[5] = -3;
                bArr3[6] = 123;
                bArr3[7] = 86;
                bArr3[8] = 70;
                bArr3[9] = 62;
                bArr3[10] = -34;
                bArr3[11] = 117;
                bArr3[12] = -12;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 40;
                bArr4[b] = 90;
                bArr4[2] = -69;
                bArr4[3] = 13;
                bArr4[4] = -55;
                bArr4[5] = -124;
                bArr4[6] = 36;
                bArr4[7] = 63;
                sb.append(C1711a.m3992b(bArr3, bArr4));
                sb.append(i);
                sb.append((int) b);
                byte[] bArr5 = new byte[5];
                bArr5[0] = 39;
                bArr5[b] = 36;
                bArr5[2] = 56;
                bArr5[3] = -46;
                bArr5[4] = 98;
                byte[] bArr6 = new byte[8];
                bArr6[0] = b;
                bArr6[b] = 123;
                bArr6[2] = 103;
                bArr6[3] = -90;
                bArr6[4] = 95;
                bArr6[5] = 9;
                bArr6[6] = -67;
                bArr6[7] = -7;
                sb.append(C1711a.m3992b(bArr5, bArr6));
                sb.append(System.currentTimeMillis());
                JSONObject jSONObject2 = new JSONObject(m4077r(sb.toString()));
                byte[] bArr7 = new byte[4];
                bArr7[0] = 3;
                bArr7[b] = -2;
                bArr7[2] = 70;
                bArr7[3] = 112;
                byte[] bArr8 = new byte[8];
                bArr8[0] = 103;
                bArr8[b] = -97;
                bArr8[2] = 50;
                bArr8[3] = 17;
                bArr8[4] = 82;
                bArr8[5] = -33;
                bArr8[6] = -43;
                bArr8[7] = 51;
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C1711a.m3992b(bArr7, bArr8));
                byte[] bArr9 = new byte[7];
                bArr9[0] = -93;
                bArr9[b] = -121;
                bArr9[2] = 7;
                bArr9[3] = -30;
                bArr9[4] = -8;
                bArr9[5] = 94;
                bArr9[6] = 19;
                byte[] bArr10 = new byte[8];
                bArr10[0] = -48;
                bArr10[b] = -26;
                bArr10[2] = 113;
                bArr10[3] = -121;
                bArr10[4] = -89;
                bArr10[5] = 63;
                bArr10[6] = 96;
                bArr10[7] = 35;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C1711a.m3992b(bArr9, bArr10));
                byte[] bArr11 = new byte[16];
                bArr11[0] = -88;
                bArr11[b] = -86;
                bArr11[2] = 81;
                bArr11[3] = 71;
                bArr11[4] = 62;
                bArr11[5] = -42;
                bArr11[6] = 117;
                bArr11[7] = 80;
                bArr11[8] = -81;
                bArr11[9] = -92;
                bArr11[10] = 87;
                bArr11[11] = 125;
                bArr11[12] = 7;
                bArr11[13] = -34;
                bArr11[14] = 98;
                bArr11[15] = 124;
                byte[] bArr12 = new byte[8];
                bArr12[0] = -37;
                bArr12[b] = -53;
                bArr12[2] = 39;
                bArr12[3] = 34;
                bArr12[4] = 97;
                bArr12[5] = -73;
                bArr12[6] = 6;
                bArr12[7] = 15;
                jSONArray = jSONObjectOptJSONObject2.optJSONArray(C1711a.m3992b(bArr11, bArr12));
                if (jSONArray.length() > 0) {
                    break;
                }
                TimeUnit.SECONDS.sleep(1L);
                i++;
                i2 = 5;
                b = 1;
                b2 = -62;
            }
            return (bool.booleanValue() && jSONArray.length() == 0) ? m4073n(str, str2, str3, Boolean.FALSE) : jSONArray.optString(0);
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{-9, 37, -67, -90, -109, -32, -104, 33, -25}, new byte[]{-126, 70, -99, -59, -4, -112, -31, 1}, new StringBuilder(), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: o */
    private void m4074o(String str) {
        List listSingletonList = Collections.singletonList(str);
        ArrayList arrayList = new ArrayList();
        try {
            String strM4078s = m4078s();
            byte b = -19;
            int i = 4;
            char c = 5;
            byte b2 = -98;
            char c2 = 6;
            if (strM4078s.equals("0")) {
                return;
            }
            m4092y();
            int i2 = 1;
            while (true) {
                byte[] bArr = new byte[161];
                bArr[0] = -16;
                bArr[1] = 111;
                bArr[2] = -1;
                bArr[3] = 19;
                bArr[i] = 99;
                bArr[c] = 20;
                bArr[c2] = 80;
                bArr[7] = -57;
                bArr[8] = -24;
                bArr[9] = 120;
                bArr[10] = -90;
                bArr[11] = 2;
                bArr[12] = 96;
                bArr[13] = 71;
                bArr[14] = 81;
                bArr[15] = -99;
                bArr[16] = -5;
                bArr[17] = 53;
                bArr[18] = -24;
                bArr[19] = 13;
                bArr[20] = 63;
                bArr[21] = 31;
                bArr[22] = 80;
                bArr[23] = -117;
                bArr[24] = -12;
                bArr[25] = 116;
                bArr[26] = -2;
                bArr[27] = 7;
                bArr[28] = 116;
                bArr[29] = 92;
                bArr[30] = 22;
                bArr[31] = b2;
                bArr[32] = -3;
                bArr[33] = 52;
                bArr[34] = b;
                bArr[35] = 10;
                bArr[36] = 124;
                bArr[37] = 75;
                bArr[38] = 80;
                bArr[39] = -101;
                bArr[40] = -9;
                bArr[41] = 105;
                bArr[42] = -1;
                bArr[43] = 92;
                bArr[44] = 96;
                bArr[45] = 92;
                bArr[46] = 66;
                bArr[47] = -67;
                bArr[48] = -37;
                bArr[49] = 89;
                bArr[50] = -7;
                bArr[51] = 12;
                bArr[52] = 103;
                bArr[53] = 93;
                bArr[54] = 26;
                bArr[55] = -102;
                bArr[56] = -66;
                bArr[57] = 125;
                bArr[58] = -7;
                bArr[59] = 94;
                bArr[60] = 96;
                bArr[61] = 77;
                bArr[62] = 89;
                bArr[63] = -104;
                bArr[64] = -4;
                bArr[65] = 114;
                bArr[66] = -7;
                bArr[67] = 60;
                bArr[68] = 118;
                bArr[69] = 71;
                bArr[70] = 27;
                bArr[71] = -43;
                bArr[72] = -67;
                bArr[73] = 104;
                bArr[74] = -83;
                bArr[75] = 60;
                bArr[76] = 96;
                bArr[77] = 79;
                bArr[78] = 24;
                bArr[79] = -115;
                bArr[80] = -91;
                bArr[81] = 62;
                bArr[82] = -8;
                bArr[83] = 69;
                bArr[84] = 79;
                bArr[85] = 93;
                bArr[86] = 22;
                bArr[87] = -110;
                bArr[88] = -3;
                bArr[89] = 38;
                bArr[90] = -82;
                bArr[91] = 16;
                bArr[92] = 54;
                bArr[93] = 113;
                bArr[94] = 25;
                bArr[95] = -115;
                bArr[96] = -20;
                bArr[97] = 120;
                bArr[98] = -29;
                bArr[99] = 60;
                bArr[100] = 100;
                bArr[101] = 65;
                bArr[102] = 11;
                bArr[103] = -119;
                bArr[104] = -12;
                bArr[105] = 38;
                bArr[106] = -70;
                bArr[107] = 69;
                bArr[108] = 79;
                bArr[109] = 72;
                bArr[110] = 26;
                bArr[111] = -100;
                bArr[112] = -5;
                bArr[113] = 115;
                bArr[114] = -44;
                bArr[115] = 16;
                bArr[116] = 101;
                bArr[117] = 76;
                bArr[118] = 32;
                bArr[119] = -116;
                bArr[120] = -15;
                bArr[121] = 105;
                bArr[122] = -8;
                bArr[123] = 94;
                bArr[124] = 32;
                bArr[125] = 8;
                bArr[126] = 32;
                bArr[127] = -101;
                bArr[128] = -9;
                bArr[129] = 105;
                bArr[130] = -1;
                bArr[131] = 94;
                bArr[132] = 118;
                bArr[133] = 71;
                bArr[134] = 19;
                bArr[135] = -115;
                bArr[136] = -57;
                bArr[137] = 111;
                bArr[138] = -14;
                bArr[139] = 19;
                bArr[140] = 117;
                bArr[141] = 20;
                bArr[142] = 30;
                bArr[143] = -101;
                bArr[144] = -5;
                bArr[145] = 55;
                bArr[146] = -2;
                bArr[147] = 19;
                bArr[148] = 116;
                bArr[149] = 79;
                bArr[150] = 11;
                bArr[151] = -115;
                bArr[152] = -4;
                bArr[153] = 68;
                bArr[154] = -22;
                bArr[155] = 23;
                bArr[156] = 42;
                bArr[157] = 74;
                bArr[158] = 26;
                bArr[159] = -101;
                bArr[160] = -5;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -104;
                bArr2[1] = 27;
                bArr2[2] = -117;
                bArr2[3] = 99;
                bArr2[i] = 16;
                bArr2[c] = 46;
                bArr2[c2] = 127;
                bArr2[7] = -24;
                JSONObject jSONObject = new JSONObject(m4077r(String.format(C1711a.m3992b(bArr, bArr2), strM4078s, Integer.valueOf(i2), 100)));
                byte[] bArr3 = new byte[i];
                bArr3[0] = b2;
                bArr3[1] = 125;
                bArr3[2] = 101;
                bArr3[3] = -16;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -6;
                bArr4[1] = 28;
                bArr4[2] = 17;
                bArr4[3] = -111;
                bArr4[i] = 38;
                bArr4[c] = -31;
                bArr4[c2] = -4;
                bArr4[7] = 34;
                JSONObject jSONObject2 = jSONObject.getJSONObject(C1711a.m3992b(bArr3, bArr4));
                byte[] bArr5 = new byte[i];
                bArr5[0] = -76;
                bArr5[1] = -86;
                bArr5[2] = -98;
                bArr5[3] = -75;
                byte[] bArr6 = new byte[8];
                bArr6[0] = -40;
                bArr6[1] = -61;
                bArr6[2] = -19;
                bArr6[3] = -63;
                bArr6[i] = -62;
                bArr6[c] = -80;
                bArr6[6] = -23;
                bArr6[7] = 80;
                JSONArray jSONArray = jSONObject2.getJSONArray(C1711a.m3992b(bArr5, bArr6));
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList.add(jSONArray.getJSONObject(i3).getString("fid"));
                }
                b2 = -98;
                JSONObject jSONObject3 = jSONObject.getJSONObject("metadata");
                if (jSONObject3.getInt("_size") != jSONObject3.getInt("_count") || jSONObject3.getInt("_count") == 0) {
                    break;
                }
                i2++;
                b = -19;
                i = 4;
                c = 5;
                c2 = 6;
            }
            if (arrayList.size() == 0) {
                return;
            }
            String str2 = (String) listSingletonList.get(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (C1747r.m4096d(str2, (String) it.next())) {
                    it.remove();
                }
            }
            int size = arrayList.size();
            double d = size;
            double d2 = 50;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            int iCeil = (int) Math.ceil(d / d2);
            for (int i4 = 0; i4 < iCeil; i4++) {
                int i5 = i4 * 50;
                m4072k(new ArrayList(arrayList.subList(i5, Math.min(i5 + 50, size))));
            }
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{-60, 86, -27, 119, 59, 1, 17, -67, -60, 90, -5, 50, 35, 13, 66, -71, -128, 86, -5, 96, 117}, new byte[]{-96, 51, -119, 18, 79, 100, 49, -51}, new StringBuilder(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m4075p() {
        try {
            AlertDialog alertDialog = this.f3803e;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static C1729Q m4076q() {
        return C1728P.f3796a;
    }

    /* JADX INFO: renamed from: r */
    private String m4077r(String str) {
        return C1840c.m4479n(str, m4079u());
    }

    /* JADX INFO: renamed from: s */
    private String m4078s() {
        try {
            JSONArray jSONArray = new JSONObject(m4077r("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc")).getJSONObject("data").getJSONArray("list");
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
            return new JSONObject(m4058F("https://pc-api.uc.cn/1/clouddrive/file?pr=UCBrowser&fr=pc", map)).getJSONObject("data").getString("fid");
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{95, -22, -66, 43, -40, -63, -127, 55, 92, -26, -72, 72, -46, -55, -62, 71}, new byte[]{56, -113, -54, 104, -73, -79, -8, 103}, new StringBuilder(), e);
            return "0";
        }
    }

    /* JADX INFO: renamed from: u */
    private Map<String, String> m4079u() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.f3799a)) {
            map.put("Cookie", this.f3799a);
        }
        map.put("Referer", "https://drive.uc.cn");
        map.put("User-Agent", f3797h);
        return map;
    }

    /* JADX INFO: renamed from: v */
    private Map<String, String> m4080v() {
        String str;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(this.f3801c)) {
            str = this.f3799a;
        } else {
            str = this.f3799a + ";" + this.f3801c;
        }
        map.put("Cookie", str);
        map.put("Referer", "https://drive.uc.cn/");
        map.put("User-Agent", f3797h);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m4081x() {
        try {
            this.f3805g = System.currentTimeMillis() + "";
            String str = "https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?__dt=641254&__t=" + this.f3805g;
            HashMap map = new HashMap();
            map.put("Accept", C1711a.m3992b(new byte[]{93, -48, -29, -14, -101, 26, 4, 12, 85, -49, -3, -79, -104, 10, 10, 22, 16, -128, -25, -5, -118, 13, 74, 8, 80, -63, -6, -16, -34, 89, 79, 87, 22}, new byte[]{60, -96, -109, -98, -14, 121, 101, 120}));
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("User-Agent", f3797h);
            map.put("Referer", "https://broccoli.uc.cn/");
            HashMap map2 = new HashMap();
            map2.put("client_id", "381");
            map2.put("v", "1.2");
            map2.put("request_id", this.f3805g);
            String strOptString = new JSONObject(C1840c.m4473h(str, map2, map).m4481a()).optJSONObject("data").optJSONObject("members").optString(C1711a.m3992b(new byte[]{-58, 1, 35, 28, 19}, new byte[]{-78, 110, 72, 121, 125, 83, 123, 17}));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1711a.m3992b(new byte[]{0, 81, 77}, new byte[]{117, 35, 33, 80, -98, 106, 56, 94}), "https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=" + strOptString + "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
            jSONObject.put("token", strOptString);
            Init.run(new RunnableC1735f(this, jSONObject, 2));
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{-35, -82, 73, -100, 106, 73, -36, 53, -33, -21, 88, -9, 24}, new byte[]{-70, -53, 61, -51, 56, 10, -77, 81}, new StringBuilder(), e);
        }
    }

    /* JADX INFO: renamed from: z */
    private String m4082z() {
        return C1840c.m4467b("https://pc-api.uc.cn/1/clouddrive/file", m4079u()).m4481a();
    }

    /* JADX INFO: renamed from: A */
    public final C1768j m4083A(String str, String str2, String str3) {
        if (TextUtils.isEmpty(m4086H(str))) {
            return C1885z.m4563c();
        }
        ArrayList arrayList = new ArrayList();
        C1825a c1825a = new C1825a();
        c1825a.m4454j(str2);
        m4057D(str, c1825a, arrayList);
        if (arrayList.size() < 1) {
            return C1885z.m4563c();
        }
        this.f3802d.m4463d(arrayList);
        List listAsList = Arrays.asList("UC原画");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strM3588a = "";
            if (!it.hasNext()) {
                break;
            }
            C1825a c1825a2 = (C1825a) it.next();
            if (c1825a2.m4449e() != null && !c1825a2.m4449e().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(c1825a2.m4449e().trim());
                strM3588a = C1434P.m3588a(new byte[]{-73}, new byte[]{-22, -33, -67, 55, -111, 97, 64, -67}, sb);
            }
            StringBuilder sbM3589b = C1434P.m3589b(strM3588a);
            sbM3589b.append(c1825a2.m4447c());
            sbM3589b.append(c1825a2.m4451g());
            C1748s.m4098b(new byte[]{123}, new byte[]{95, 125, 125, 42, 107, -48, 97, 18}, sbM3589b, str);
            sbM3589b.append(Marker.ANY_NON_NULL_MARKER);
            sbM3589b.append(c1825a2.m4446b());
            sbM3589b.append(Marker.ANY_NON_NULL_MARKER);
            sbM3589b.append(c1825a2.m4450f());
            String string = sbM3589b.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                StringBuilder sbM3589b2 = C1434P.m3589b(string);
                C1748s.m4098b(new byte[]{98}, new byte[]{73, 19, -17, -111, 38, 103, -38, -2}, sbM3589b2, str3);
                sbM3589b2.append(Marker.ANY_NON_NULL_MARKER);
                sbM3589b2.append(c1825a2.m4447c());
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
        c1768j.m4222h(this.f3802d.m4461b() == null ? "获取视频名称失败" : this.f3802d.m4461b().m4459b());
        c1768j.m4225k(TextUtils.join("$$$", arrayList3));
        c1768j.m4224j(TextUtils.join("$$$", listAsList));
        c1768j.m4216b("UC网盘");
        return c1768j;
    }

    /* JADX INFO: renamed from: E */
    public final String m4084E(String[] strArr, String str) throws Throwable {
        if (TextUtils.isEmpty(this.f3799a)) {
            m4088l();
        }
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.f3801c)) {
            map.put("Cookie", this.f3801c);
        }
        map.put("Referer", "https://drive.uc.cn");
        map.put("User-Agent", f3797h);
        if (C1871l.m4525b(1).booleanValue()) {
            String strM4526c = C1871l.m4526c(m4090t(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : ""), 60, 100);
            if (strArr.length <= 4) {
                C1765g c1765g = new C1765g();
                c1765g.m4207x(strM4526c);
                c1765g.m4201j();
                c1765g.m4198f(m4080v());
                return c1765g.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            sb.append("?do=appdanmu&vodName=");
            sb.append(strArr[3]);
            sb.append("&vodIndex=");
            sb.append(strArr[4]);
            String strM3588a = C1434P.m3588a(new byte[]{86, 67, 5, -31, 75, 7, -84, 30}, new byte[]{112, 53, 106, -123, 30, 117, -64, 35}, sb);
            C1765g c1765g2 = new C1765g();
            c1765g2.m4207x(strM4526c);
            c1765g2.m4195a(strM3588a);
            c1765g2.m4201j();
            c1765g2.m4198f(m4080v());
            return c1765g2.toString();
        }
        if (!str.split("#")[0].contains("原画")) {
            List<String> listM4091w = m4091w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
            if (strArr.length <= 4) {
                C1765g c1765g3 = new C1765g();
                c1765g3.m4208y(listM4091w);
                c1765g3.m4201j();
                c1765g3.m4198f(map);
                return c1765g3.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Proxy.getUrl());
            sb2.append("?do=appdanmu&vodName=");
            sb2.append(strArr[3]);
            sb2.append("&vodIndex=");
            sb2.append(strArr[4]);
            String strM3588a2 = C1434P.m3588a(new byte[]{-12, 124, 52, 21, 88, 69, -62, 8}, new byte[]{-46, 10, 91, 113, 13, 55, -82, 53}, sb2);
            C1765g c1765g4 = new C1765g();
            c1765g4.m4208y(listM4091w);
            c1765g4.m4195a(strM3588a2);
            c1765g4.m4201j();
            c1765g4.m4198f(map);
            return c1765g4.toString();
        }
        if (!TextUtils.isEmpty(C1871l.m4529f())) {
            String strM4090t = m4090t(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
            if (strArr.length <= 4) {
                C1765g c1765g5 = new C1765g();
                c1765g5.m4207x(C1871l.m4527d(strM4090t));
                c1765g5.m4201j();
                c1765g5.m4198f(m4080v());
                return c1765g5.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Proxy.getUrl());
            sb3.append("?do=appdanmu&vodName=");
            sb3.append(strArr[3]);
            sb3.append("&vodIndex=");
            sb3.append(strArr[4]);
            String strM3588a3 = C1434P.m3588a(new byte[]{-110, -10, 27, -23, -79, 40, 66, 89}, new byte[]{-76, -128, 116, -115, -28, 90, 46, 100}, sb3);
            C1765g c1765g6 = new C1765g();
            c1765g6.m4207x(C1871l.m4527d(strM4090t));
            c1765g6.m4195a(strM3588a3);
            c1765g6.m4201j();
            c1765g6.m4198f(m4080v());
            return c1765g6.toString();
        }
        String strM4090t2 = m4090t(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
        String str2 = strArr[0];
        String str3 = strArr[1];
        String str4 = strArr.length > 2 ? strArr[2] : "";
        String strEncode = URLEncoder.encode(strM4090t2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(Proxy.getUrl());
        String str5 = String.format(C1434P.m3588a(new byte[]{73, -45, 89, -126, 82, 69, -128, -43, 2, -50, 70, -38, 14, 95, -128, -105, 19, -40, 16, -52, 90, 93, -116, -50, 3, -44, 16, -36, 82, 93, -116, -50, 83, -60, 16, -52, 91, 72, -101, -106, 63, -45, 11, -102, 64, 15, -113, -102, 26, -46, 127, -37, 14, 12, -102, -43, 2, -40, 93, -38, 93, 96, -115, -50, 83, -60, 16, -54, 65, 69, -44, -42, 5}, new byte[]{118, -73, 54, -65, 51, 41, -23, -13}, sb4), "down", str2, str3, str4, strEncode);
        if (strArr.length <= 4) {
            C1765g c1765g7 = new C1765g();
            c1765g7.m4207x(str5);
            c1765g7.m4201j();
            c1765g7.m4198f(map);
            return c1765g7.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(Proxy.getUrl());
        sb5.append("?do=appdanmu&vodName=");
        sb5.append(strArr[3]);
        sb5.append("&vodIndex=");
        sb5.append(strArr[4]);
        String strM3588a4 = C1434P.m3588a(new byte[]{21, -39, -114, 14, -59, -103, 30, -123}, new byte[]{51, -81, -31, 106, -112, -21, 114, -72}, sb5);
        C1765g c1765g8 = new C1765g();
        c1765g8.m4207x(str5);
        c1765g8.m4195a(strM3588a4);
        c1765g8.m4201j();
        c1765g8.m4198f(map);
        return c1765g8.toString();
    }

    /* JADX INFO: renamed from: G */
    public final Object[] m4085G(Map<String, String> map) {
        try {
            AlertDialog alertDialog = this.f3803e;
            if (alertDialog != null && alertDialog.isShowing()) {
                return null;
            }
            map.get("templateId");
            map.get("shareId");
            map.get("mediaId");
            map.get("fileId");
            String str = map.get("cate");
            map.get("tokenId");
            String str2 = map.get("url");
            if (!"down".equals(str)) {
                str2 = "";
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent", "cookie");
            for (String str3 : map.keySet()) {
                if (listAsList.contains(str3)) {
                    treeMap.put(str3, map.get(str3));
                }
            }
            return C1871l.m4530g(str2, treeMap);
        } catch (Exception unused) {
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p044FM.p086k.e>] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p044FM.p086k.e>] */
    /* JADX INFO: renamed from: H */
    public final String m4086H(String str) {
        C1829e c1829e = (C1829e) f3798i.get(str);
        this.f3802d = c1829e;
        if (c1829e != null && c1829e.m4460a(str)) {
            SpiderDebug.log("uc shareToken:" + this.f3802d.toString());
        }
        C1829e c1829e2 = this.f3802d;
        if (c1829e2 != null && c1829e2.m4460a(str)) {
            return this.f3802d.m4461b().m4458a();
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pwd_id", str);
        jsonObject.addProperty("passcode", "");
        String strM4481a = C1840c.m4472g("https://pc-api.uc.cn/1/clouddrive/share/sharepage/token?pr=UCBrowser&fr=pc", jsonObject.toString(), m4079u()).m4481a();
        StringBuilder sb = new StringBuilder();
        C1748s.m4098b(new byte[]{55, -37, 16, 110, -30, 109, 10, 119, 17, -16, 99, 116, -26, 121, 29, 70, 13, -13, 85, 114, -36}, new byte[]{98, -104, 48, 28, -121, 11, 120, 18}, sb, str);
        sb.append("]...");
        sb.append(strM4481a);
        SpiderDebug.log(sb.toString());
        try {
            C1829e c1829e3 = (C1829e) new Gson().fromJson(strM4481a, C1829e.class);
            this.f3802d = c1829e3;
            c1829e3.m4464e(str);
            c1829e3.m4465f();
            f3798i.put(str, this.f3802d);
            if (this.f3802d.m4461b() == null) {
                return "";
            }
            SpiderDebug.log("uc stToken:" + this.f3802d.m4461b().m4458a());
            return this.f3802d.m4461b().m4458a();
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{-3, 109, 15, 39, -108, 66, -69, 29, -25, 105, 27, 48, -91, 94, -72, 43, -31, 40, 60, 54, -53}, new byte[]{-113, 8, 105, 85, -15, 49, -45, 78}, new StringBuilder(), e);
            return "";
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m4087K() {
        try {
            Toast.makeText(Init.context(), "还未登录UC账号,请前往【配置中心】登录", 1).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log("showInput2 ex: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4088l() {
        int i = 2;
        try {
            try {
                String strM4576o = TextUtils.isEmpty(this.f3799a) ? C1885z.m4576o("uc_cookie.txt") : this.f3799a;
                this.f3799a = strM4576o;
                if (TextUtils.isEmpty(strM4576o)) {
                    throw new Exception("empty cookie");
                }
                if (!m4056C()) {
                    throw new Exception("invalid cookie");
                }
                while (this.f3799a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                m4089m();
                SystemClock.sleep(400L);
                SpiderDebug.log("checkCookie: " + e.getMessage());
                m4061L();
                Init.run(new RunnableC1730a(this, i));
                while (this.f3799a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            }
        } catch (Throwable th) {
            while (this.f3799a.isEmpty()) {
                SystemClock.sleep(300L);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4089m() {
        this.f3799a = "";
        C1885z.m4580s(".uc", this.f3799a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX INFO: renamed from: t */
    public final String m4090t(String str, String str2, String str3) throws Throwable {
        String str4;
        String strM4073n;
        try {
            String strM4082z = m4082z();
            m4086H(str);
            str4 = str2;
            try {
                strM4073n = m4073n(str, str4, str3, Boolean.TRUE);
                try {
                    if (TextUtils.isEmpty(strM4073n)) {
                        if (!TextUtils.isEmpty(str)) {
                            m4074o(strM4073n);
                        }
                        return "";
                    }
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(strM4073n);
                    map.put("fids", arrayList);
                    JSONObject jSONObject = new JSONObject(m4058F("https://pc-api.uc.cn/1/clouddrive/file/download?pr=UCBrowser&fr=pc&sys=win32&ve=1.8.5&ut=" + strM4082z, map));
                    if (jSONObject.getInt("status") == 200 && jSONObject.getInt("code") == 0) {
                        String strOptString = jSONObject.optJSONArray("data").optJSONObject(0).optString("download_url");
                        if (!TextUtils.isEmpty(str)) {
                            m4074o(strM4073n);
                        }
                        return strOptString;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        m4074o(strM4073n);
                    }
                    return "";
                } catch (Exception unused) {
                    if (!TextUtils.isEmpty(str)) {
                        m4074o(strM4073n);
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    if (!TextUtils.isEmpty(str)) {
                        m4074o(strM4073n);
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                strM4073n = str4;
                if (!TextUtils.isEmpty(str)) {
                    m4074o(strM4073n);
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                strM4073n = str4;
                if (!TextUtils.isEmpty(str)) {
                    m4074o(strM4073n);
                }
                throw th;
            }
        } catch (Exception unused3) {
            str4 = str2;
        } catch (Throwable th3) {
            th = th3;
            str4 = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: w */
    public final List<String> m4091w(String str, String str2, String str3, Boolean bool) throws Throwable {
        String str4;
        Throwable th;
        String str5;
        Exception exc;
        String strM4073n;
        try {
            try {
                m4086H(str);
                str4 = str2;
                try {
                    strM4073n = m4073n(str, str4, str3, Boolean.TRUE);
                    try {
                        char c = 3;
                        char c2 = 6;
                        HashMap map = new HashMap();
                        map.put("fid", strM4073n);
                        map.put("resolutions", "normal,low,high,super,2k,4k");
                        map.put("supports", "fmp4,m3u8");
                        JSONObject jSONObject = new JSONObject(m4058F("https://pc-api.uc.cn/1/clouddrive/file/v2/play?pr=UCBrowser&fr=pc", map));
                        if (jSONObject.optString("message").contains("file not found")) {
                            ArrayList arrayList = new ArrayList();
                            if (!TextUtils.isEmpty(str)) {
                                m4074o(strM4073n);
                            }
                            return arrayList;
                        }
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_list");
                        ArrayList arrayList2 = new ArrayList();
                        int i = 0;
                        while (i < jSONArrayOptJSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                            byte[] bArr = new byte[10];
                            bArr[0] = 125;
                            bArr[1] = -101;
                            bArr[2] = 24;
                            bArr[c] = 22;
                            bArr[4] = 10;
                            bArr[5] = -107;
                            bArr[c2] = -59;
                            bArr[7] = -120;
                            bArr[8] = 112;
                            bArr[9] = -99;
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = 28;
                            bArr2[1] = -8;
                            bArr2[2] = 123;
                            bArr2[c] = 115;
                            bArr2[4] = 121;
                            bArr2[5] = -26;
                            bArr2[6] = -92;
                            bArr2[7] = -22;
                            if (jSONObjectOptJSONObject.optBoolean(C1711a.m3992b(bArr, bArr2))) {
                                Object r13 = this.f3804f;
                                byte[] bArr3 = new byte[10];
                                bArr3[0] = -53;
                                bArr3[1] = 85;
                                bArr3[2] = -51;
                                bArr3[c] = 86;
                                bArr3[4] = 118;
                                bArr3[5] = -112;
                                bArr3[6] = 29;
                                bArr3[7] = 107;
                                bArr3[8] = -42;
                                bArr3[9] = 94;
                                arrayList2.add((String) r13.get(jSONObjectOptJSONObject.optString(C1711a.m3992b(bArr3, new byte[]{-71, 48, -66, 57, 26, -27, 105, 2}))));
                                arrayList2.add(jSONObjectOptJSONObject.optJSONObject("video_info").optString("url"));
                            }
                            i++;
                            c = 3;
                            c2 = 6;
                        }
                        List<String> listM4091w = arrayList2;
                        if (bool.booleanValue() && arrayList2.size() == 0) {
                            listM4091w = arrayList2;
                            listM4091w = m4091w(str, strM4073n, str3, Boolean.FALSE);
                        }
                        listM4091w = arrayList2;
                        if (!TextUtils.isEmpty(str)) {
                            m4074o(strM4073n);
                        }
                        return listM4091w;
                    } catch (Exception e) {
                        exc = e;
                        exc.printStackTrace();
                        ArrayList arrayList3 = new ArrayList();
                        if (!TextUtils.isEmpty(str)) {
                            m4074o(strM4073n);
                        }
                        return arrayList3;
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    strM4073n = str4;
                    exc.printStackTrace();
                    ArrayList arrayList4 = new ArrayList();
                    if (!TextUtils.isEmpty(str)) {
                        m4074o(strM4073n);
                    }
                    return arrayList4;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    str5 = str4;
                    if (!TextUtils.isEmpty(str)) {
                        throw th;
                    }
                    m4074o(str5);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (!TextUtils.isEmpty(str)) {
                    throw th;
                }
                m4074o(str5);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            str4 = str2;
        } catch (Throwable th4) {
            th = th4;
            str4 = str2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final long m4092y() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
