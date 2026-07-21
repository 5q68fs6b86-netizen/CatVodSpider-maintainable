package com.github.catvod.spider.support.p044FM.p090o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p073b.C1753x;
import com.github.catvod.spider.support.p044FM.p073b.RunnableC1720H;
import com.github.catvod.spider.support.p044FM.p073b.RunnableC1736g;
import com.github.catvod.spider.support.p044FM.p073b.RunnableC1739j;
import com.github.catvod.spider.support.p044FM.p073b.RunnableC1746q;
import com.github.catvod.spider.support.p044FM.p077d.C1775d;
import com.github.catvod.spider.support.p044FM.p082g.C1804b;
import com.github.catvod.spider.support.p044FM.p082g.C1810h;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p090o.C1884y;
import com.github.catvod.spider.support.p044FM.p090o.RunnableC1883x;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p090o.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1884y {

    /* JADX INFO: renamed from: a */
    private AlertDialog f4345a;

    /* JADX INFO: renamed from: b */
    private ScheduledExecutorService f4346b;

    C1884y() {
    }

    /* JADX INFO: renamed from: A */
    private void m4533A() {
        ScheduledExecutorService scheduledExecutorService = this.f4346b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f4346b.shutdown();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4534a(C1884y c1884y, Map map, String str) {
        c1884y.getClass();
        map.put("push", "");
        map.put("flag", c1884y.m4549p(str));
        map.put("button", "1");
        map.put("input", "");
        Init.execute(new RunnableC1882w(c1884y, map, 1));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m4535b(C1884y c1884y, Map map) {
        c1884y.m4533A();
        map.put("button", "0");
        map.put("input", "1");
        c1884y.m4554u(map);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4536c(C1884y c1884y, EditText editText, EditText editText2) {
        c1884y.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(editText.getText().toString());
        sb.append("|");
        sb.append(editText2.getText().toString());
        c1884y.m4552s("cloud", C1434P.m3588a(new byte[]{-65, 114}, new byte[]{-61, 43, 94, 103, 81, 6, -22, 122}, sb));
    }

    /* JADX INFO: renamed from: e */
    public static void m4538e(C1884y c1884y) {
        c1884y.getClass();
        try {
            AlertDialog alertDialog = c1884y.f4345a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4539f(C1884y c1884y, Map map) {
        c1884y.m4533A();
        map.put("push", "1");
        map.put("flag", c1884y.m4549p(""));
        map.put("button", "1");
        c1884y.m4554u(map);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m4542i(C1884y c1884y, EditText editText, EditText editText2) {
        c1884y.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(editText.getText().toString());
        sb.append("|");
        sb.append(editText2.getText().toString());
        c1884y.m4552s("cloud123", C1434P.m3588a(new byte[]{-50, 98}, new byte[]{-78, 59, -104, 102, -31, 91, -118, -50}, sb));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m4544k(C1884y c1884y, EditText editText) {
        c1884y.getClass();
        c1884y.m4552s("ucMachineCode", editText.getText().toString());
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m4545l(C1884y c1884y, String str, EditText editText) {
        c1884y.getClass();
        c1884y.m4552s(str, editText.getText().toString());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m4546m(C1884y c1884y, Map map, String str) {
        c1884y.getClass();
        map.put("push", "");
        map.put("flag", c1884y.m4549p(str));
        map.put("button", "1");
        Init.execute(new RunnableC1881v(c1884y, map, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m4547n(Map<String, String> map) {
        String str;
        String string;
        String str2;
        String str3;
        try {
            if (!"ali".equals(map.get("site"))) {
                if ("quark".equals(map.get("site"))) {
                    String strM4478m = C1840c.m4478m("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + new JSONObject(map.get("url")).optString("token"));
                    SpiderDebug.log(strM4478m);
                    JSONObject jSONObject = new JSONObject(strM4478m);
                    if (!"ok".equals(jSONObject.optString("message"))) {
                        return;
                    }
                    String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                    HashMap map2 = new HashMap();
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0");
                    map2.put("Accept", "application/json, text/plain, */*");
                    map2.put("Referer", "https://pan.quark.cn/");
                    str2 = "";
                    for (String str4 : C1840c.m4470e("https://pan.quark.cn/account/info?st=" + strOptString + "&lw=scan", map2).headers("set-cookie")) {
                        if (str4.contains("__pus=")) {
                            str2 = str2 + str4.split(";")[0] + ";";
                        }
                    }
                    str3 = map.get("site");
                } else if ("uc".equals(map.get("site"))) {
                    HashMap map3 = new HashMap();
                    map3.put("Accept", "application/json, text/plain, */*");
                    map3.put("Content-Type", "application/x-www-form-urlencoded");
                    map3.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                    map3.put("Referer", "https://broccoli.uc.cn/");
                    String str5 = System.currentTimeMillis() + "";
                    HashMap map4 = new HashMap();
                    map4.put("client_id", "381");
                    map4.put("v", "1.2");
                    map4.put("request_id", str5);
                    map4.put("token", new JSONObject(map.get("url")).optString("token"));
                    JSONObject jSONObject2 = new JSONObject(C1840c.m4473h("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?__dt=18884&__t=" + str5, map4, map3).m4481a());
                    if (!"ok".equals(jSONObject2.optString("message"))) {
                        return;
                    }
                    str2 = "";
                    Iterator it = C1840c.m4470e("https://drive.uc.cn/account/info?st=" + jSONObject2.optJSONObject("data").optJSONObject("members").optString("service_ticket"), map3).headers("set-cookie").iterator();
                    while (it.hasNext()) {
                        str2 = str2 + ((String) it.next()).split(";")[0] + ";";
                    }
                    str3 = map.get("site");
                } else {
                    if (!"bili".equals(map.get("site"))) {
                        if (!"uc_tv".equals(map.get("site")) && !"cloud".equals(map.get("site")) && "baidu".equals(map.get("site")) && C1753x.m4154s()) {
                            m4558z();
                            return;
                        }
                        return;
                    }
                    HashMap map5 = new HashMap();
                    map5.put("Accept", "application/json, text/plain, */*");
                    map5.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                    String strM4372o = C1810h.m4394b(C1840c.m4479n("https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + new JSONObject(map.get("url")).optString("token") + "&source=main_mini", map5)).m4395a().m4372o();
                    if (TextUtils.isEmpty(strM4372o)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (String str6 : Uri.parse(strM4372o).getQuery().split("&")) {
                        sb.append(str6);
                        sb.append(";");
                    }
                    str = map.get("site");
                    string = sb.toString();
                }
                m4552s(str3, str2);
                return;
            }
            C1775d c1775dM4243c = C1775d.m4240g(C1840c.m4474i("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", m4551r(new JSONObject(map.get("url")).optJSONObject("token")))).m4242b().m4243c();
            if (!c1775dM4243c.m4246f()) {
                return;
            }
            str = map.get("site");
            string = c1775dM4243c.m4245e();
            m4552s(str, string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o */
    public static C1884y m4548o() {
        return C1868i.f4307b;
    }

    /* JADX INFO: renamed from: p */
    private String m4549p(String str) {
        if ("ali".equals(str)) {
            return "请使用阿里云盘APP扫码";
        }
        if ("quark".equals(str)) {
            return "请使用夸克浏览器扫码";
        }
        if ("uc".equals(str)) {
            return "请使用UC浏览器扫码";
        }
        if ("bili".equals(str)) {
            return "请使用哔哩哔哩APP扫码";
        }
        return "cloud".equals(str) ? "请使用天翼云盘APP扫码" : "请使用浏览器或者微信扫描二维码\n(扫码设备和当前设备要在同一局域网内)";
    }

    /* JADX INFO: renamed from: q */
    private JSONObject m4550q(String str) {
        String str2;
        String strM4368k;
        try {
            JSONObject jSONObject = new JSONObject();
            if ("ali".equals(str)) {
                strM4368k = C1840c.m4478m("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3");
                C1775d c1775dM4243c = C1775d.m4240g(strM4368k).m4242b().m4243c();
                SpiderDebug.log(c1775dM4243c.toString());
                jSONObject.put("url", c1775dM4243c.m4241a());
                jSONObject.put("token", new JSONObject(c1775dM4243c.m4244d()));
                str2 = "json";
            } else if ("quark".equals(str)) {
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch");
                strM4368k = new JSONObject(C1840c.m4479n("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2", map)).optJSONObject("data").optJSONObject("members").optString("token");
                jSONObject.put("url", "https://su.quark.cn/4_eMHBJ?token=" + strM4368k + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
                str2 = "token";
            } else {
                if (!"uc".equals(str)) {
                    if ("bili".equals(str)) {
                        HashMap map2 = new HashMap();
                        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                        C1804b c1804bM4395a = C1810h.m4394b(C1840c.m4479n("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini", map2)).m4395a();
                        jSONObject.put("url", c1804bM4395a.m4372o());
                        str2 = "token";
                        strM4368k = c1804bM4395a.m4368k();
                    } else if (!"uc_tv".equals(str) && !"cloud".equals(str) && "baidu".equals(str)) {
                        C1753x.m4150k();
                    }
                    return jSONObject;
                }
                HashMap map3 = new HashMap();
                map3.put("Accept", "application/json, text/plain, */*");
                map3.put("Content-Type", "application/x-www-form-urlencoded");
                map3.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                map3.put("Referer", "https://broccoli.uc.cn/");
                String str3 = System.currentTimeMillis() + "";
                HashMap map4 = new HashMap();
                map4.put("client_id", "381");
                map4.put("v", "1.2");
                map4.put("request_id", str3);
                strM4368k = new JSONObject(C1840c.m4473h("https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?__dt=641254&__t=" + str3, map4, map3).m4481a()).optJSONObject("data").optJSONObject("members").optString("token");
                jSONObject.put("url", "https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=" + strM4368k + "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
                str2 = "token";
            }
            jSONObject.put(str2, strM4368k);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: r */
    private Map<String, String> m4551r(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    /* JADX INFO: renamed from: s */
    private String m4552s(String str, String str2) {
        try {
            if (!"ali".equals(str) && !"quark".equals(str) && !"uc".equals(str) && !"bili".equals(str)) {
                if ("cloud123".equals(str)) {
                    str2.split("\\|");
                    m4558z();
                    return "";
                }
                if ("ucMachineCode".equals(str)) {
                    if (str2.startsWith("http")) {
                        for (String str3 : new URL(str2).getQuery().split("&")) {
                            if (str3.startsWith("ut=")) {
                                str3.substring("ut=".length());
                                break;
                            }
                        }
                    }
                } else if ("cloud".equals(str)) {
                    str2.split("\\|");
                    m4558z();
                    return "";
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            m4558z();
            throw th;
        }
        m4558z();
        return "推送成功,请在设备上查看";
    }

    /* JADX INFO: renamed from: t */
    private void m4553t(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C1872m.m4531a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        int iM4531a = C1872m.m4531a(200);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iM4531a, iM4531a);
        layoutParams2.gravity = 17;
        ImageView imageView = new ImageView(Init.context());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(C1753x.m4147e().m4158j());
        layoutParams2.setMargins(C1872m.m4531a(16), C1872m.m4531a(16), C1872m.m4531a(16), C1872m.m4531a(16));
        linearLayout.addView(imageView, layoutParams2);
        Init.execute(new RunnableC1883x(this, map, 0));
        this.f4345a = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x0198 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x019a A[Catch: Exception -> 0x01df, TryCatch #0 {Exception -> 0x01df, blocks: (B:3:0x0004, B:5:0x0016, B:7:0x001a, B:9:0x0022, B:11:0x0026, B:13:0x002e, B:15:0x0032, B:19:0x004b, B:23:0x005c, B:27:0x006d, B:31:0x0091, B:33:0x00a7, B:35:0x00f6, B:45:0x013f, B:47:0x0163, B:50:0x0177, B:52:0x018c, B:57:0x019a, B:59:0x01aa, B:58:0x01a2, B:61:0x01bb, B:62:0x01d1, B:63:0x01d8, B:38:0x0125, B:41:0x0131, B:30:0x007e), top: B:68:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01a2 A[Catch: Exception -> 0x01df, TryCatch #0 {Exception -> 0x01df, blocks: (B:3:0x0004, B:5:0x0016, B:7:0x001a, B:9:0x0022, B:11:0x0026, B:13:0x002e, B:15:0x0032, B:19:0x004b, B:23:0x005c, B:27:0x006d, B:31:0x0091, B:33:0x00a7, B:35:0x00f6, B:45:0x013f, B:47:0x0163, B:50:0x0177, B:52:0x018c, B:57:0x019a, B:59:0x01aa, B:58:0x01a2, B:61:0x01bb, B:62:0x01d1, B:63:0x01d8, B:38:0x0125, B:41:0x0131, B:30:0x007e), top: B:68:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01bb A[Catch: Exception -> 0x01df, TryCatch #0 {Exception -> 0x01df, blocks: (B:3:0x0004, B:5:0x0016, B:7:0x001a, B:9:0x0022, B:11:0x0026, B:13:0x002e, B:15:0x0032, B:19:0x004b, B:23:0x005c, B:27:0x006d, B:31:0x0091, B:33:0x00a7, B:35:0x00f6, B:45:0x013f, B:47:0x0163, B:50:0x0177, B:52:0x018c, B:57:0x019a, B:59:0x01aa, B:58:0x01a2, B:61:0x01bb, B:62:0x01d1, B:63:0x01d8, B:38:0x0125, B:41:0x0131, B:30:0x007e), top: B:68:0x0004 }] */
    /* JADX INFO: renamed from: u */
    public void m4554u(final Map<String, String> map) {
        final EditText editText;
        final EditText editText2;
        AlertDialog.Builder view;
        String str;
        DialogInterface.OnClickListener onClickListener;
        String str2;
        try {
            int i = 0;
            final String str3 = map.get("site");
            if ("cloud123".equals(str3)) {
                m4555v(map);
                return;
            }
            if ("cloud189".equals(str3)) {
                m4556w(map);
                return;
            }
            if ("baidu".equals(str3)) {
                m4553t(map);
                return;
            }
            String str4 = map.get("flag");
            boolean z = !"0".equals(map.get("button"));
            boolean z2 = !TextUtils.isEmpty(map.get("input"));
            boolean z3 = !TextUtils.isEmpty(map.get("push"));
            TextUtils.isEmpty(map.get("cloud123"));
            String strOptString = z3 ? "" : new JSONObject(map.get("url")).optString("url");
            LinearLayout linearLayout = new LinearLayout(Init.context());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            if (z) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = C1872m.m4531a(20);
                layoutParams.gravity = 1;
                TextView textView = new TextView(Init.context());
                textView.setText(str4);
                textView.setGravity(17);
                textView.setTextColor(-16777216);
                linearLayout.addView(textView, layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                ImageView imageView = new ImageView(Init.context());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setImageBitmap(C1317a.m3301b(strOptString, 240));
                linearLayout.addView(imageView, layoutParams2);
                Init.execute(new RunnableC1881v(this, map, i));
            }
            if (z2) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.setMargins(C1872m.m4531a(16), C1872m.m4531a(16), C1872m.m4531a(16), C1872m.m4531a(16));
                editText = new EditText(Init.context());
                if ("ali".equals(str3)) {
                    str2 = "阿里云盘32位Token";
                } else if ("quark".equals(str3)) {
                    str2 = "夸克网盘Cookie";
                } else {
                    str2 = "uc".equals(str3) ? "UC网盘Cookie" : "哔哩哔哩Cookie";
                }
                editText.setHint("请将已有" + str2 + "粘贴到此处...");
                linearLayout.addView(editText, layoutParams3);
                if ("uc".equals(str3)) {
                    editText2 = new EditText(Init.context());
                    editText2.setHint("请将已有UC网盘机器码粘贴到此处...");
                    linearLayout.addView(editText2, layoutParams3);
                }
                view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
                if (!"uc_tv".equals(str3) && !"cloud".equals(str3)) {
                    if (z) {
                        if (z3) {
                            str = "扫码授权";
                            onClickListener = new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p090o.u
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    C1884y.m4546m(this.f4333a, map, str3);
                                }
                            };
                        } else {
                            str = "远程输入";
                            final int i2 = 1;
                            onClickListener = new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p073b.E
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    switch (i2) {
                                        case 0:
                                            C1722J.m4028e((C1722J) this, (EditText) map);
                                            break;
                                        default:
                                            C1884y.m4539f((C1884y) this, (Map) map);
                                            break;
                                    }
                                }
                            };
                        }
                        view = view.setPositiveButton(str, onClickListener).setNegativeButton("手动输入", new DialogInterfaceOnClickListenerC1875p(this, map, i));
                    }
                    if (z2) {
                        view = view.setNeutralButton("扫码授权", new DialogInterfaceOnClickListenerC1873n(this, map, str3, i)).setNegativeButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p090o.r
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                C1884y c1884y = this.f4325a;
                                EditText editText3 = editText;
                                String str5 = str3;
                                EditText editText4 = editText2;
                                c1884y.getClass();
                                if (!TextUtils.isEmpty(editText3.getText().toString())) {
                                    Init.execute(new RunnableC1739j(c1884y, str5, editText3, 1));
                                }
                                if (TextUtils.isEmpty(editText4.getText().toString())) {
                                    return;
                                }
                                Init.execute(new RunnableC1736g(c1884y, editText4, 3));
                            }
                        });
                    }
                    this.f4345a = view.show();
                    return;
                }
                this.f4345a = view.show();
            }
            editText = null;
            editText2 = null;
            view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
            if (!"uc_tv".equals(str3)) {
                if (z) {
                    if (z3) {
                        str = "扫码授权";
                        onClickListener = new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p090o.u
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                C1884y.m4546m(this.f4333a, map, str3);
                            }
                        };
                    } else {
                        str = "远程输入";
                        final int i3 = 1;
                        onClickListener = new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p073b.E
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                switch (i3) {
                                    case 0:
                                        C1722J.m4028e((C1722J) this, (EditText) map);
                                        break;
                                    default:
                                        C1884y.m4539f((C1884y) this, (Map) map);
                                        break;
                                }
                            }
                        };
                    }
                    view = view.setPositiveButton(str, onClickListener).setNegativeButton("手动输入", new DialogInterfaceOnClickListenerC1875p(this, map, i));
                }
                if (z2) {
                    view = view.setNeutralButton("扫码授权", new DialogInterfaceOnClickListenerC1873n(this, map, str3, i)).setNegativeButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p090o.r
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C1884y c1884y = this.f4325a;
                            EditText editText3 = editText;
                            String str5 = str3;
                            EditText editText4 = editText2;
                            c1884y.getClass();
                            if (!TextUtils.isEmpty(editText3.getText().toString())) {
                                Init.execute(new RunnableC1739j(c1884y, str5, editText3, 1));
                            }
                            if (TextUtils.isEmpty(editText4.getText().toString())) {
                                return;
                            }
                            Init.execute(new RunnableC1736g(c1884y, editText4, 3));
                        }
                    });
                }
                this.f4345a = view.show();
                return;
            }
            this.f4345a = view.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: v */
    private void m4555v(final Map<String, String> map) {
        EditText editText = new EditText(Init.context());
        EditText editText2 = new EditText(Init.context());
        String str = map.get("model");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        final int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C1872m.m4531a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        if (TextUtils.isEmpty(str)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(C1872m.m4531a(16), C1872m.m4531a(16), C1872m.m4531a(16), C1872m.m4531a(16));
            editText.setHint("请输入123云盘账号");
            linearLayout.addView(editText, layoutParams2);
            editText2.setHint("请输入123云盘密码");
            linearLayout.addView(editText2, layoutParams2);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C1317a.m3301b("", 240));
            linearLayout.addView(imageView, layoutParams3);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
        this.f4345a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new DialogInterfaceOnClickListenerC1875p(this, map, i)).setNegativeButton("登录", new DialogInterfaceOnClickListenerC1873n(this, editText, editText2, i)) : view.setNeutralButton("手动输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p073b.L
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                switch (i) {
                    case 0:
                        C1729Q.m4064c((C1729Q) this, (EditText) map);
                        break;
                    default:
                        C1884y c1884y = (C1884y) this;
                        Map map2 = (Map) map;
                        c1884y.getClass();
                        map2.put("model", "");
                        map2.put("flag", "请输入123云盘账号密码");
                        Init.execute(new RunnableC1883x(c1884y, map2, 1));
                        break;
                }
            }
        })).show();
    }

    /* JADX INFO: renamed from: w */
    private void m4556w(final Map<String, String> map) {
        final EditText editText = new EditText(Init.context());
        final EditText editText2 = new EditText(Init.context());
        String str = map.get("model");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C1872m.m4531a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        if (TextUtils.isEmpty(str)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(C1872m.m4531a(16), C1872m.m4531a(16), C1872m.m4531a(16), C1872m.m4531a(16));
            editText.setHint("请输入天翼云盘账号");
            linearLayout.addView(editText, layoutParams2);
            editText2.setHint("请输入天翼云盘密码");
            linearLayout.addView(editText2, layoutParams2);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C1317a.m3301b("", 240));
            linearLayout.addView(imageView, layoutParams3);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
        this.f4345a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p090o.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1884y c1884y = this.f4331a;
                Map map2 = map;
                c1884y.getClass();
                map2.put("model", "1");
                map2.put("flag", "请使用微信或者浏览器扫码下方二维码远程输入");
                Init.execute(new RunnableC1720H(c1884y, map2, 3));
            }
        }).setNegativeButton("登录", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p090o.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final C1884y c1884y = this.f4322a;
                final EditText editText3 = editText;
                final EditText editText4 = editText2;
                c1884y.getClass();
                Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.p044FM.p090o.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1884y.m4536c(c1884y, editText3, editText4);
                    }
                });
            }
        }) : view.setNeutralButton("手动输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p090o.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1884y c1884y = this.f4329a;
                Map map2 = map;
                c1884y.getClass();
                map2.put("model", "");
                map2.put("flag", "请输入天翼云盘账号密码");
                Init.execute(new RunnableC1881v(c1884y, map2, 2));
            }
        })).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m4557y(Map<String, String> map) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f4346b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC1882w(this, map, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: z */
    private void m4558z() {
        m4533A();
        Init.run(new RunnableC1746q(this, 3));
    }

    /* JADX INFO: renamed from: x */
    public final void m4559x(Map<String, String> map) {
        try {
            map.put("url", m4550q(map.get("site")).toString());
            Init.run(new RunnableC1736g(this, map, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
