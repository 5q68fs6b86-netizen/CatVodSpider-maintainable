package com.github.catvod.spider.support.p003AB.p009o;

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
import com.github.catvod.spider.support.AB.J.a;
import com.github.catvod.spider.support.AB.d.d;
import com.github.catvod.spider.support.AB.g.b;
import com.github.catvod.spider.support.AB.g.h;
import com.github.catvod.spider.support.p003AB.p005b.C0853t;
import com.github.catvod.spider.support.p003AB.p005b.C0859z;
import com.github.catvod.spider.support.p003AB.p005b.DialogInterfaceOnClickListenerC0819C;
import com.github.catvod.spider.support.p003AB.p005b.DialogInterfaceOnClickListenerC0847n;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0835b;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0841h;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0844k;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0915Z {

    /* JADX INFO: renamed from: a */
    private AlertDialog f2156a;

    /* JADX INFO: renamed from: b */
    private ScheduledExecutorService f2157b;

    C0915Z() {
    }

    /* JADX INFO: renamed from: A */
    private void m2184A() {
        ScheduledExecutorService scheduledExecutorService = this.f2157b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f2157b.shutdown();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2185a(C0915Z c0915z, Map map, String str) {
        c0915z.getClass();
        map.put("push", "");
        map.put("flag", c0915z.m2200p(str));
        map.put("button", "1");
        map.put("input", "");
        Init.execute(new RunnableC0913X(c0915z, map, 1));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2186b(C0915Z c0915z, Map map) {
        c0915z.m2184A();
        map.put("button", "0");
        map.put("input", "1");
        c0915z.m2205u(map);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2187c(C0915Z c0915z, EditText editText, EditText editText2) {
        c0915z.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(editText.getText().toString());
        sb.append("|");
        sb.append(editText2.getText().toString());
        c0915z.m2203s("cloud", C0853t.m2057b(new byte[]{-17, -127}, new byte[]{-109, -40, -36, 29, -81, 17, -102, 8}, sb));
    }

    /* JADX INFO: renamed from: e */
    public static void m2189e(C0915Z c0915z) {
        c0915z.getClass();
        try {
            AlertDialog alertDialog = c0915z.f2156a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2190f(C0915Z c0915z, Map map) {
        c0915z.m2184A();
        map.put("push", "1");
        map.put("flag", c0915z.m2200p(""));
        map.put("button", "1");
        c0915z.m2205u(map);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2193i(C0915Z c0915z, EditText editText, EditText editText2) {
        c0915z.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(editText.getText().toString());
        sb.append("|");
        sb.append(editText2.getText().toString());
        c0915z.m2203s("cloud123", C0853t.m2057b(new byte[]{-4, -125}, new byte[]{-128, -38, 11, 15, -58, -52, -16, -113}, sb));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2195k(C0915Z c0915z, EditText editText) {
        c0915z.getClass();
        c0915z.m2203s("ucMachineCode", editText.getText().toString());
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m2196l(C0915Z c0915z, String str, EditText editText) {
        c0915z.getClass();
        c0915z.m2203s(str, editText.getText().toString());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m2197m(C0915Z c0915z, Map map, String str) {
        c0915z.getClass();
        map.put("push", "");
        map.put("flag", c0915z.m2200p(str));
        map.put("button", "1");
        Init.execute(new RunnableC0912W(c0915z, map, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m2198n(Map<String, String> map) {
        C0915Z c0915z;
        String str;
        String string;
        String string2;
        String str2;
        try {
            if (!"ali".equals(map.get("site"))) {
                if ("quark".equals(map.get("site"))) {
                    String strM2131k = C0869c.m2131k("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + new JSONObject(map.get("url")).optString("token"));
                    SpiderDebug.log(strM2131k);
                    JSONObject jSONObject = new JSONObject(strM2131k);
                    if (!"ok".equals(jSONObject.optString("message"))) {
                        return;
                    }
                    String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                    HashMap map2 = new HashMap();
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0");
                    map2.put("Accept", "application/json, text/plain, */*");
                    map2.put("Referer", "https://pan.quark.cn/");
                    string2 = "";
                    for (String str3 : C0869c.m2125e("https://pan.quark.cn/account/info?st=" + strOptString + "&lw=scan", map2).headers("set-cookie")) {
                        if (str3.contains("__pus=")) {
                            string2 = string2 + str3.split(";")[0] + ";";
                        }
                    }
                    str2 = map.get("site");
                } else {
                    String str4 = ";";
                    if ("uc".equals(map.get("site"))) {
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
                        JSONObject jSONObject2 = new JSONObject(C0869c.m2128h("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?__dt=18884&__t=" + str5, map4, map3).m2134a());
                        if (!"ok".equals(jSONObject2.optString("message"))) {
                            return;
                        }
                        string2 = "";
                        for (String str6 : C0869c.m2125e("https://drive.uc.cn/account/info?st=" + jSONObject2.optJSONObject("data").optJSONObject("members").optString("service_ticket"), map3).headers("set-cookie")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(string2);
                            String str7 = str4;
                            sb.append(str6.split(str7)[0]);
                            sb.append(str7);
                            string2 = sb.toString();
                            str4 = str7;
                        }
                        str2 = map.get("site");
                    } else {
                        c0915z = this;
                        if (!"bili".equals(map.get("site"))) {
                            if (!"uc_tv".equals(map.get("site")) && !"cloud".equals(map.get("site")) && "baidu".equals(map.get("site")) && C0859z.m2112s()) {
                                m2209z();
                                return;
                            }
                            return;
                        }
                        HashMap map5 = new HashMap();
                        map5.put("Accept", "application/json, text/plain, */*");
                        map5.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                        String strO = h.b(C0869c.m2132l("https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + new JSONObject(map.get("url")).optString("token") + "&source=main_mini", map5)).a().o();
                        if (TextUtils.isEmpty(strO)) {
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        for (String str8 : Uri.parse(strO).getQuery().split("&")) {
                            sb2.append(str8);
                            sb2.append(str4);
                        }
                        str = map.get("site");
                        string = sb2.toString();
                    }
                }
                m2203s(str2, string2);
                return;
            }
            d dVarC = d.g(C0869c.m2129i("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", m2202r(new JSONObject(map.get("url")).optJSONObject("token")))).b().c();
            if (!dVarC.f()) {
                return;
            }
            str = map.get("site");
            string = dVarC.e();
            c0915z = this;
            c0915z.m2203s(str, string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o */
    public static C0915Z m2199o() {
        return C0899I.f2117a;
    }

    /* JADX INFO: renamed from: p */
    private String m2200p(String str) {
        if ("ali".equals(str)) {
            return "请使用阿里网盘APP扫码";
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
    private JSONObject m2201q(String str) {
        String strK;
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = "token";
            if ("ali".equals(str)) {
                strK = C0869c.m2131k("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3");
                d dVarC = d.g(strK).b().c();
                SpiderDebug.log(dVarC.toString());
                jSONObject.put("url", dVarC.a());
                jSONObject.put("token", new JSONObject(dVarC.d()));
                str2 = "json";
            } else if ("quark".equals(str)) {
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch");
                strK = new JSONObject(C0869c.m2132l("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2", map)).optJSONObject("data").optJSONObject("members").optString("token");
                jSONObject.put("url", "https://su.quark.cn/4_eMHBJ?token=" + strK + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
            } else {
                if (!"uc".equals(str)) {
                    if ("bili".equals(str)) {
                        HashMap map2 = new HashMap();
                        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                        b bVarA = h.b(C0869c.m2132l("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini", map2)).a();
                        jSONObject.put("url", bVarA.o());
                        strK = bVarA.k();
                    } else if (!"uc_tv".equals(str) && !"cloud".equals(str) && "baidu".equals(str)) {
                        C0859z.m2108k();
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
                String strOptString = new JSONObject(C0869c.m2128h("https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?__dt=641254&__t=" + str3, map4, map3).m2134a()).optJSONObject("data").optJSONObject("members").optString("token");
                jSONObject.put("url", "https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=" + strOptString + "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
                strK = strOptString;
            }
            jSONObject.put(str2, strK);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: r */
    private Map<String, String> m2202r(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    /* JADX INFO: renamed from: s */
    private String m2203s(String str, String str2) {
        try {
            if (!"ali".equals(str) && !"quark".equals(str) && !"uc".equals(str) && !"bili".equals(str)) {
                if ("cloud123".equals(str)) {
                    str2.split("\\|");
                    m2209z();
                    return "";
                }
                if ("ucMachineCode".equals(str)) {
                    if (str2.startsWith("http")) {
                        for (String str3 : new URL(str2).getQuery().split("&")) {
                            if (str3.startsWith("ut=")) {
                                str3.substring(3);
                                break;
                            }
                        }
                    }
                } else if ("cloud".equals(str)) {
                    str2.split("\\|");
                    m2209z();
                    return "";
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            m2209z();
            throw th;
        }
        m2209z();
        return "推送成功,请在设备上查看";
    }

    /* JADX INFO: renamed from: t */
    private void m2204t(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = a.a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        int iA = a.a(200);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iA, iA);
        layoutParams2.gravity = 17;
        ImageView imageView = new ImageView(Init.context());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(C0859z.m2105e().m2116j());
        layoutParams2.setMargins(a.a(16), a.a(16), a.a(16), a.a(16));
        linearLayout.addView(imageView, layoutParams2);
        Init.execute(new RunnableC0914Y(this, map, 0));
        this.f2156a = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m2205u(final Map<String, String> map) {
        final EditText editText;
        DialogInterface.OnClickListener dialogInterfaceOnClickListenerC0847n;
        String str;
        String str2;
        try {
            final String str3 = map.get("site");
            if ("cloud123".equals(str3)) {
                m2206v(map);
                return;
            }
            if ("cloud189".equals(str3)) {
                m2207w(map);
                return;
            }
            if ("baidu".equals(str3)) {
                m2204t(map);
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
            int i = 0;
            if (z) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = a.a(20);
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
                imageView.setImageBitmap(C0899I.m2172b(strOptString, 240));
                linearLayout.addView(imageView, layoutParams2);
                Init.execute(new RunnableC0912W(this, map, i));
            }
            final EditText editText2 = null;
            if (z2) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.setMargins(a.a(16), a.a(16), a.a(16), a.a(16));
                editText = new EditText(Init.context());
                if ("ali".equals(str3)) {
                    str2 = "阿里网盘32位Token";
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
            } else {
                editText = null;
            }
            AlertDialog.Builder view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
            if ("uc_tv".equals(str3) || "cloud".equals(str3)) {
                this.f2156a = view.show();
                return;
            }
            if (z) {
                if (z3) {
                    dialogInterfaceOnClickListenerC0847n = new DialogInterface.OnClickListener(this, map, str3) { // from class: com.github.catvod.spider.support.AB.o.V

                        /* JADX INFO: renamed from: a */
                        public final C0915Z f2144a;

                        /* JADX INFO: renamed from: b */
                        public final Map f2145b;

                        /* JADX INFO: renamed from: c */
                        public final String f2146c;

                        {
                            this.f2144a = this;
                            this.f2145b = map;
                            this.f2146c = str3;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C0915Z.m2197m(this.f2144a, this.f2145b, this.f2146c);
                        }
                    };
                    str = "扫码授权";
                } else {
                    dialogInterfaceOnClickListenerC0847n = new DialogInterfaceOnClickListenerC0847n(this, map, 1);
                    str = "远程输入";
                }
                view = view.setPositiveButton(str, dialogInterfaceOnClickListenerC0847n).setNegativeButton("手动输入", new DialogInterfaceOnClickListenerC0906P(this, map, i));
            }
            if (z2) {
                view = view.setNeutralButton("扫码授权", new DialogInterfaceOnClickListenerC0903M(this, map, str3, i)).setNegativeButton("确定", new DialogInterface.OnClickListener(this, editText, str3, editText2) { // from class: com.github.catvod.spider.support.AB.o.S

                    /* JADX INFO: renamed from: a */
                    public final C0915Z f2136a;

                    /* JADX INFO: renamed from: b */
                    public final EditText f2137b;

                    /* JADX INFO: renamed from: c */
                    public final String f2138c;

                    /* JADX INFO: renamed from: d */
                    public final EditText f2139d;

                    {
                        this.f2136a = this;
                        this.f2137b = editText;
                        this.f2138c = str3;
                        this.f2139d = editText2;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C0915Z c0915z = this.f2136a;
                        EditText editText3 = this.f2137b;
                        String str5 = this.f2138c;
                        EditText editText4 = this.f2139d;
                        c0915z.getClass();
                        if (!TextUtils.isEmpty(editText3.getText().toString())) {
                            Init.execute(new RunnableC0931l(c0915z, str5, editText3, 1));
                        }
                        if (TextUtils.isEmpty(editText4.getText().toString())) {
                            return;
                        }
                        Init.execute(new RunnableC0841h(c0915z, editText4, 5));
                    }
                });
            }
            this.f2156a = view.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: v */
    private void m2206v(final Map<String, String> map) {
        EditText editText = new EditText(Init.context());
        EditText editText2 = new EditText(Init.context());
        String str = map.get("model");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = a.a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        if (TextUtils.isEmpty(str)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(a.a(16), a.a(16), a.a(16), a.a(16));
            editText.setHint("请输入123云盘账号");
            linearLayout.addView(editText, layoutParams2);
            editText2.setHint("请输入123云盘密码");
            linearLayout.addView(editText2, layoutParams2);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0899I.m2172b("", 240));
            linearLayout.addView(imageView, layoutParams3);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
        this.f2156a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new DialogInterfaceOnClickListenerC0906P(this, map, i)).setNegativeButton("登录", new DialogInterfaceOnClickListenerC0903M(this, editText, editText2, i)) : view.setNeutralButton("手动输入", new DialogInterface.OnClickListener(this, map) { // from class: com.github.catvod.spider.support.AB.o.T

            /* JADX INFO: renamed from: a */
            public final C0915Z f2140a;

            /* JADX INFO: renamed from: b */
            public final Map f2141b;

            {
                this.f2140a = this;
                this.f2141b = map;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C0915Z c0915z = this.f2140a;
                Map map2 = this.f2141b;
                c0915z.getClass();
                map2.put("model", "");
                map2.put("flag", "请输入123云盘账号密码");
                Init.execute(new RunnableC0914Y(c0915z, map2, 1));
            }
        })).show();
    }

    /* JADX INFO: renamed from: w */
    private void m2207w(final Map<String, String> map) {
        final EditText editText = new EditText(Init.context());
        final EditText editText2 = new EditText(Init.context());
        String str = map.get("model");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = a.a(20);
        layoutParams.gravity = 1;
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView, layoutParams);
        if (TextUtils.isEmpty(str)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(a.a(16), a.a(16), a.a(16), a.a(16));
            editText.setHint("请输入天翼云盘账号");
            linearLayout.addView(editText, layoutParams2);
            editText2.setHint("请输入天翼云盘密码");
            linearLayout.addView(editText2, layoutParams2);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0899I.m2172b("", 240));
            linearLayout.addView(imageView, layoutParams3);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout);
        this.f2156a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new DialogInterface.OnClickListener(this, map) { // from class: com.github.catvod.spider.support.AB.o.U

            /* JADX INFO: renamed from: a */
            public final C0915Z f2142a;

            /* JADX INFO: renamed from: b */
            public final Map f2143b;

            {
                this.f2142a = this;
                this.f2143b = map;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C0915Z c0915z = this.f2142a;
                Map map2 = this.f2143b;
                c0915z.getClass();
                map2.put("model", "1");
                map2.put("flag", "请使用微信或者浏览器扫码下方二维码远程输入");
                Init.execute(new RunnableC0844k(c0915z, map2, 3));
            }
        }).setNegativeButton("登录", new DialogInterface.OnClickListener(this, editText, editText2) { // from class: com.github.catvod.spider.support.AB.o.Q

            /* JADX INFO: renamed from: a */
            public final C0915Z f2133a;

            /* JADX INFO: renamed from: b */
            public final EditText f2134b;

            /* JADX INFO: renamed from: c */
            public final EditText f2135c;

            {
                this.f2133a = this;
                this.f2134b = editText;
                this.f2135c = editText2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C0915Z c0915z = this.f2133a;
                EditText editText3 = this.f2134b;
                EditText editText4 = this.f2135c;
                c0915z.getClass();
                Init.execute(new Runnable(c0915z, editText3, editText4) { // from class: com.github.catvod.spider.support.AB.o.N

                    /* JADX INFO: renamed from: a */
                    public final C0915Z f2124a;

                    /* JADX INFO: renamed from: b */
                    public final EditText f2125b;

                    /* JADX INFO: renamed from: c */
                    public final EditText f2126c;

                    {
                        this.f2124a = c0915z;
                        this.f2125b = editText3;
                        this.f2126c = editText4;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0915Z.m2187c(this.f2124a, this.f2125b, this.f2126c);
                    }
                });
            }
        }) : view.setNeutralButton("手动输入", new DialogInterfaceOnClickListenerC0819C(this, map, i))).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m2208y(Map<String, String> map) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f2157b = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC0913X(this, map, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: z */
    private void m2209z() {
        m2184A();
        Init.run(new RunnableC0835b(this, 6));
    }

    /* JADX INFO: renamed from: x */
    public final void m2210x(Map<String, String> map) {
        try {
            map.put("url", m2201q(map.get("site")).toString());
            Init.run(new RunnableC0841h(this, map, 4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
