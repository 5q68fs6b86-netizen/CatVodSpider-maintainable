package com.github.catvod.spider.support.p012C0.p023b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.C0.d.b;
import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p025c.C1038d;
import com.github.catvod.spider.support.p012C0.p025c.C1039e;
import com.github.catvod.spider.support.p012C0.p025c.C1041g;
import com.github.catvod.spider.support.p012C0.p027d.C1063c;
import com.github.catvod.spider.support.p012C0.p027d.C1065e;
import com.github.catvod.spider.support.p012C0.p027d.C1066f;
import com.github.catvod.spider.support.p012C0.p027d.C1067g;
import com.github.catvod.spider.support.p012C0.p032h.C1234b;
import com.github.catvod.spider.support.p012C0.p032h.C1236d;
import com.github.catvod.spider.support.p012C0.p035j.C1244l;
import com.github.catvod.spider.support.p012C0.p035j.C1247o;
import com.google.gson.Gson;
import com.google.net.cronet.okhttptransport.CronetInterceptor;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.b.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1032p {

    /* JADX INFO: renamed from: l */
    public static JSONObject f2501l;

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f2502a;

    /* JADX INFO: renamed from: c */
    private AlertDialog f2504c;

    /* JADX INFO: renamed from: d */
    private String f2505d;

    /* JADX INFO: renamed from: e */
    private String f2506e;

    /* JADX INFO: renamed from: f */
    private String f2507f;

    /* JADX INFO: renamed from: g */
    private C1066f f2508g;

    /* JADX INFO: renamed from: h */
    private C1067g f2509h;

    /* JADX INFO: renamed from: i */
    private String f2510i = "2K";

    /* JADX INFO: renamed from: j */
    private boolean f2511j = false;

    /* JADX INFO: renamed from: k */
    private String f2512k = "";

    /* JADX INFO: renamed from: b */
    private final List<String> f2503b = new ArrayList();

    C1032p() {
        String strM3102e;
        String strM3102e2;
        try {
            strM3102e = C1244l.m3102e(new FileInputStream(m2589s()));
        } catch (Exception e) {
            strM3102e = "";
        }
        this.f2508g = C1066f.m2784d(strM3102e);
        try {
            strM3102e2 = C1244l.m3102e(new FileInputStream(m2592x()));
        } catch (Exception e2) {
            strM3102e2 = "";
        }
        this.f2509h = C1067g.m2789f(strM3102e2);
        HashMap map = new HashMap();
        this.f2502a = map;
        map.put(">2K<", "QHD");
        map.put(">超清<", "FHD");
    }

    /* JADX INFO: renamed from: A */
    private void m2555A(C1065e c1065e, List<C1065e> list, List<C1065e> list2) throws JSONException {
        m2556B(c1065e, list, list2, "");
    }

    /* JADX INFO: renamed from: B */
    private void m2556B(C1065e c1065e, List<C1065e> list, List<C1065e> list2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        jSONObject.put("limit", 200);
        jSONObject.put("share_id", this.f2507f);
        jSONObject.put("parent_file_id", c1065e.m2778d());
        jSONObject.put("order_by", "name");
        jSONObject.put("order_direction", "ASC");
        if (str.length() > 0) {
            jSONObject.put("marker", str);
        }
        C1065e c1065e2 = (C1065e) new Gson().fromJson(m2576l("adrive/v3/file/list", jSONObject.toString(), true), C1065e.class);
        for (C1065e c1065e3 : c1065e2.m2779e()) {
            if (c1065e3.m2782h().equals("folder")) {
                arrayList.add(c1065e3);
            } else if (c1065e3.m2775a().equals("video") || c1065e3.m2775a().equals("audio")) {
                c1065e3.m2783i(c1065e.m2780f());
                list.add(c1065e3);
            } else if (C1247o.m3114d(c1065e3.m2777c())) {
                list2.add(c1065e3);
            }
        }
        if (c1065e2.m2781g().length() > 0) {
            m2556B(c1065e, list, list2, c1065e2.m2781g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2555A((C1065e) it.next(), list, list2);
        }
    }

    /* JADX INFO: renamed from: C */
    private String m2557C(String str, String str2, boolean z) {
        boolean zM2575k;
        if (!str.startsWith("https")) {
            str = C1030n.m2553a("https://open.aliyundrive.com/adrive/v1.0/", str);
        }
        HashMap<String, String> mapM2588q = m2588q();
        mapM2588q.put("authorization", this.f2508g.m2786b());
        C1236d c1236dM3050f = C1234b.m3050f(str, str2, mapM2588q);
        SpiderDebug.log(c1236dM3050f.m3057b() + "," + str + "," + c1236dM3050f.m3056a());
        if (z && (c1236dM3050f.m3057b() == 400 || c1236dM3050f.m3057b() == 401)) {
            try {
                if (this.f2508g.m2787c().isEmpty()) {
                    zM2575k = m2559E();
                } else {
                    SpiderDebug.log("refreshOpenToken...");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("grant_type", "refresh_token");
                    jSONObject.put("refresh_token", this.f2508g.m2787c());
                    zM2575k = m2575k("https://api-cf.nn.ci/alist/ali_open/token", jSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
                C1066f c1066f = this.f2508g;
                c1066f.m2785a();
                c1066f.m2788e();
                zM2575k = false;
            }
            if (zM2575k) {
                return m2557C(str, str2, false);
            }
        }
        return c1236dM3050f.m3056a();
    }

    /* JADX INFO: renamed from: D */
    private boolean m2558D(String str) {
        try {
            SpiderDebug.log("OAuth Redirect...");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", str);
            jSONObject.put("grant_type", "authorization_code");
            return m2575k("https://api-cf.nn.ci/alist/ali_open/code", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            C1066f c1066f = this.f2508g;
            c1066f.m2785a();
            c1066f.m2788e();
            return false;
        }
    }

    /* JADX INFO: renamed from: E */
    private boolean m2559E() {
        try {
            SpiderDebug.log("OAuth Request...");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("authorize", 1);
            jSONObject.put("scope", "user:base,file:all:read,file:all:write");
            return m2558D(((b) new Gson().fromJson(m2576l("https://open.aliyundrive.com/oauth/users/authorize?client_id=76917ccccd4441c39457a04f6084fb2f&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=", jSONObject.toString(), true), b.class)).a());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: G */
    private String m2560G(String str, JSONObject jSONObject) {
        if (!str.startsWith("https")) {
            str = C1030n.m2553a("https://api.aliyundrive.com/", str);
        }
        C1236d c1236dM3050f = C1234b.m3050f(str, jSONObject.toString(), m2588q());
        SpiderDebug.log(c1236dM3050f.m3057b() + "," + str + "," + c1236dM3050f.m3056a());
        return c1236dM3050f.m3056a();
    }

    /* JADX INFO: renamed from: I */
    private boolean m2561I() {
        try {
            SpiderDebug.log("refreshAccessToken...");
            JSONObject jSONObject = new JSONObject();
            String strTrim = this.f2505d;
            if (strTrim.isEmpty()) {
                strTrim = this.f2509h.m2794e();
            }
            if (strTrim.startsWith("http")) {
                strTrim = C1234b.m3052h(strTrim, null, null).trim();
            }
            jSONObject.put("refresh_token", strTrim);
            jSONObject.put("grant_type", "refresh_token");
            String strM2560G = m2560G("https://auth.aliyundrive.com/v2/account/token", jSONObject);
            C1067g c1067gM2789f = C1067g.m2789f(strM2560G);
            c1067gM2789f.m2795g();
            this.f2509h = c1067gM2789f;
            if (c1067gM2789f.m2791b().isEmpty()) {
                throw new Exception(strM2560G);
            }
            this.f2505d = strTrim;
            return true;
        } catch (Exception e) {
            if (this.f2505d.length() > 0 && this.f2509h.m2794e().length() > 0 && !this.f2505d.equals(this.f2509h.m2794e())) {
                this.f2505d = "";
                if (m2561I()) {
                    return true;
                }
            }
            if (this.f2512k.length() < 1) {
                if (this.f2511j) {
                    Init.show("配置的token无效！");
                }
                String string = Init.d.getString("ali_tk", "");
                this.f2505d = string;
                if (string.length() > 0) {
                    this.f2512k = "sp";
                    if (m2561I()) {
                        if (this.f2511j) {
                            Init.show("使用缓存token成功！");
                        }
                        return true;
                    }
                }
            }
            if ("成功".equals(this.f2512k)) {
                Init.show("扫码的token未起作用，请重试！");
            }
            if ("".equals(this.f2512k) || "sp".equals(this.f2512k)) {
                if ("sp".equals(this.f2512k)) {
                    Init.show("缓存token失效!");
                }
                if ("".equals(this.f2512k)) {
                    this.f2512k = "sp";
                }
                C1067g c1067g = this.f2509h;
                c1067g.m2790a();
                c1067g.m2795g();
                this.f2505d = "";
                m2564N();
                int i = C1247o.f2943a;
                if (Init.context().getPackageManager().hasSystemFeature("android.hardware.camera.any") && Init.context().getPackageManager().hasSystemFeature("android.hardware.telephony") && Init.context().getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                    Init.run(new Runnable(this) { // from class: com.github.catvod.spider.support.C0.b.a

                        /* JADX INFO: renamed from: c */
                        public final C1032p f2479c;

                        {
                            this.f2479c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1032p.m2572h(this.f2479c);
                        }
                    });
                } else {
                    m2563M();
                }
                if ("成功".equals(this.f2512k) && m2561I()) {
                    if (this.f2511j) {
                        Init.show("Token有效！");
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: L */
    private void m2562L(String str) {
        if (str.length() > 0) {
            SharedPreferences.Editor editorEdit = Init.d.edit();
            editorEdit.putString("ali_tk", str);
            editorEdit.apply();
            this.f2505d = str;
            this.f2509h.m2796h(str);
        }
        m2564N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m2563M() {
        final C1063c c1063cM2769c = C1063c.m2766g(C1234b.m3052h("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null, null)).m2768b().m2769c();
        Init.run(new Runnable(this, c1063cM2769c) { // from class: com.github.catvod.spider.support.C0.b.b

            /* JADX INFO: renamed from: c */
            public final C1032p f2480c;

            /* JADX INFO: renamed from: d */
            public final C1063c f2481d;

            {
                this.f2480c = this;
                this.f2481d = c1063cM2769c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1032p.m2566b(this.f2480c, this.f2481d);
            }
        });
        while (this.f2505d.length() < 1 && "sp".equals(this.f2512k)) {
            SystemClock.sleep(500L);
        }
    }

    /* JADX INFO: renamed from: N */
    private void m2564N() {
        Init.run(new Runnable(this) { // from class: com.github.catvod.spider.support.C0.b.m

            /* JADX INFO: renamed from: c */
            public final C1032p f2499c;

            {
                this.f2499c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2499c.m2578n();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m2566b(final C1032p c1032p, final C1063c c1063c) {
        c1032p.getClass();
        try {
            LinearLayout linearLayout = new LinearLayout(Init.context());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setGravity(17);
            TextView textView = new TextView(Init.context());
            textView.setText("阿里云盘APP扫码登录");
            textView.setLayoutParams(new LinearLayout.LayoutParams(C1247o.m3111a(240), C1247o.m3111a(25)));
            textView.setBackgroundColor(-1);
            textView.setGravity(17);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C1247o.m3111a(240), C1247o.m3111a(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0966a.m2369c(c1063c.m2767a()));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            linearLayout.addView(frameLayout);
            linearLayout.addView(textView);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout).setOnCancelListener(new DialogInterface.OnCancelListener(c1032p, c1063c) { // from class: com.github.catvod.spider.support.C0.b.e

                /* JADX INFO: renamed from: a */
                public final C1032p f2486a;

                /* JADX INFO: renamed from: b */
                public final C1063c f2487b;

                {
                    this.f2486a = c1032p;
                    this.f2487b = c1063c;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C1032p c1032p2 = this.f2486a;
                    C1063c c1063c2 = this.f2487b;
                    c1032p2.getClass();
                    Init.execute(new Runnable(c1032p2, c1063c2) { // from class: com.github.catvod.spider.support.C0.b.c

                        /* JADX INFO: renamed from: c */
                        public final C1032p f2482c;

                        /* JADX INFO: renamed from: d */
                        public final C1063c f2483d;

                        {
                            this.f2482c = c1032p2;
                            this.f2483d = c1063c2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1032p.m2571g(this.f2482c, this.f2483d);
                        }
                    });
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener(c1032p) { // from class: com.github.catvod.spider.support.C0.b.h

                /* JADX INFO: renamed from: a */
                public final C1032p f2491a;

                {
                    this.f2491a = c1032p;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C1032p.m2573i(this.f2491a);
                }
            }).show();
            c1032p.f2504c = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2567c(final C1032p c1032p, EditText editText) {
        c1032p.getClass();
        final String string = editText.getText().toString();
        c1032p.m2578n();
        Init.execute(new Runnable(c1032p, string) { // from class: com.github.catvod.spider.support.C0.b.d

            /* JADX INFO: renamed from: c */
            public final C1032p f2484c;

            /* JADX INFO: renamed from: d */
            public final String f2485d;

            {
                this.f2484c = c1032p;
                this.f2485d = string;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1032p.m2569e(this.f2484c, this.f2485d);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: d */
    public static void m2568d(C1032p c1032p) {
        boolean z;
        c1032p.getClass();
        for (String str : new ArrayList(c1032p.f2503b)) {
            try {
                SpiderDebug.log("Delete..." + str);
                z = c1032p.m2576l("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}", c1032p.f2509h.m2793d(), str, str), true).length() == 211;
            } catch (Exception e) {
                z = false;
            }
            if (z) {
                c1032p.f2503b.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2569e(C1032p c1032p, String str) {
        c1032p.getClass();
        if (str.startsWith("http")) {
            str = C1234b.m3052h(str, null, null);
        } else if (str.length() != 32) {
            if (!str.contains(":")) {
                return;
            }
            str = "http://" + str + "/proxy?do=ali&type=token";
            str = C1234b.m3052h(str, null, null);
        }
        c1032p.m2562L(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m2571g(C1032p c1032p, C1063c c1063c) {
        String str;
        c1032p.getClass();
        C1063c c1063cM2769c = C1063c.m2766g(C1234b.m3049e(c1063c.m2770d())).m2768b().m2769c();
        if (c1063cM2769c == null || !c1063cM2769c.m2772f()) {
            c1032p.m2562L("");
            str = "失败";
        } else {
            String strM2771e = c1063cM2769c.m2771e();
            c1032p.m2562L(strM2771e);
            Init.show(Init.d.getString("ali_tk", "").equals(strM2771e) ? "token缓存成功！" : "token缓存失败！");
            str = "成功";
        }
        c1032p.f2512k = str;
    }

    /* JADX INFO: renamed from: h */
    public static void m2572h(final C1032p c1032p) {
        c1032p.getClass();
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(C1247o.m3111a(16), C1247o.m3111a(16), C1247o.m3111a(16), C1247o.m3111a(16));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            final EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            c1032p.f2504c = new AlertDialog.Builder(Init.getActivity()).setTitle("请输入Token").setView(frameLayout).setNeutralButton("扫码", new DialogInterface.OnClickListener(c1032p) { // from class: com.github.catvod.spider.support.C0.b.f

                /* JADX INFO: renamed from: a */
                public final C1032p f2488a;

                {
                    this.f2488a = c1032p;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C1032p.m2574j(this.f2488a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(c1032p, editText) { // from class: com.github.catvod.spider.support.C0.b.g

                /* JADX INFO: renamed from: a */
                public final C1032p f2489a;

                /* JADX INFO: renamed from: b */
                public final EditText f2490b;

                {
                    this.f2489a = c1032p;
                    this.f2490b = editText;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C1032p.m2567c(this.f2489a, this.f2490b);
                }
            }).show();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2573i(C1032p c1032p) {
        c1032p.m2564N();
    }

    /* JADX INFO: renamed from: j */
    public static void m2574j(C1032p c1032p) {
        c1032p.m2578n();
        Init.execute(new RunnableC1025i(c1032p, 1));
    }

    /* JADX INFO: renamed from: k */
    private boolean m2575k(String str, JSONObject jSONObject) {
        boolean z;
        C1236d c1236dM3050f = C1234b.m3050f(str, jSONObject.toString(), m2588q());
        SpiderDebug.log(c1236dM3050f.m3057b() + "," + str + "," + c1236dM3050f.m3056a());
        if (c1236dM3050f.m3056a().contains("Too Many Requests")) {
            Init.show("洗洗睡吧，Too Many Requests。");
            C1066f c1066f = this.f2508g;
            c1066f.m2785a();
            c1066f.m2788e();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        C1066f c1066fM2784d = C1066f.m2784d(c1236dM3050f.m3056a());
        c1066fM2784d.m2788e();
        this.f2508g = c1066fM2784d;
        return true;
    }

    /* JADX INFO: renamed from: l */
    private String m2576l(String str, String str2, boolean z) {
        if (!str.startsWith("https")) {
            str = C1030n.m2553a("https://api.aliyundrive.com/", str);
        }
        C1236d c1236dM3050f = C1234b.m3050f(str, str2, m2580r());
        SpiderDebug.log(c1236dM3050f.m3057b() + "," + str + "," + c1236dM3050f.m3056a());
        if (z && ((c1236dM3050f.m3057b() == 400 || c1236dM3050f.m3057b() == 401) && m2561I())) {
            return m2576l(str, str2, false);
        }
        return (z && c1236dM3050f.m3057b() == 429) ? m2576l(str, str2, false) : c1236dM3050f.m3056a();
    }

    /* JADX INFO: renamed from: m */
    private String m2577m(String str) {
        SpiderDebug.log("Copy..." + str);
        String strM2576l = m2576l("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", str, this.f2507f, this.f2509h.m2793d()), true);
        return strM2576l.contains("ForbiddenNoPermission.File") ? m2577m(str) : new JSONObject(strM2576l).getJSONArray("responses").getJSONObject(0).getJSONObject("body").getString("file_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m2578n() {
        try {
            AlertDialog alertDialog = this.f2504c;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static C1032p m2579o() {
        return C1031o.f2500a;
    }

    /* JADX INFO: renamed from: r */
    private HashMap<String, String> m2580r() {
        HashMap<String, String> mapM2588q = m2588q();
        mapM2588q.put("authorization", this.f2509h.m2792c());
        mapM2588q.put("x-share-token", this.f2506e);
        mapM2588q.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        return mapM2588q;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: t */
    private String m2581t(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has("live_transcoding_task_list")) {
            return "";
        }
        JSONArray jSONArray = jSONObject.getJSONArray("live_transcoding_task_list");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2.getString("template_id").equals(this.f2502a.get(str))) {
                return jSONObject2.getString("url");
            }
        }
        return str.equals(">2K<") ? m2581t(jSONObject, ">超清<") : jSONArray.getJSONObject(0).getString("url");
    }

    /* JADX INFO: renamed from: u */
    private List<C1039e> m2582u(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("live_transcoding_subtitle_task_list")) {
            return Collections.emptyList();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("live_transcoding_subtitle_task_list");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("language");
            String string2 = jSONObject2.getString("url");
            C1039e c1039e = new C1039e();
            c1039e.m2617d(string2);
            c1039e.m2616c(string);
            c1039e.m2615b(string);
            arrayList.add(c1039e.m2614a("vtt"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public final String m2583F(String[] strArr, String str) {
        try {
            JSONObject jSONObjectM2593y = m2593y(strArr[0]);
            String strM2581t = m2581t(jSONObjectM2593y, str);
            List<C1039e> listM2590v = m2590v(strArr);
            ((ArrayList) listM2590v).addAll(m2582u(jSONObjectM2593y));
            C1038d c1038d = new C1038d();
            c1038d.m2612i(strM2581t);
            c1038d.m2611h(listM2590v);
            c1038d.m2607a(m2588q());
            return c1038d.toString();
        } catch (Exception e) {
            e.printStackTrace();
            C1038d c1038d2 = new C1038d();
            c1038d2.m2612i("");
            return c1038d2.toString();
        }
    }

    /* JADX INFO: renamed from: H */
    public final Object[] m2584H(Map<String, String> map) throws UnsupportedEncodingException {
        byte[] bArrBytes = C1234b.m3046b(m2587p(map.get("file_id")), m2580r()).body().bytes();
        int i = C1247o.f2943a;
        Charset charsetForName = Charset.forName("GBK");
        if (Arrays.equals(bArrBytes, new String(bArrBytes, charsetForName).getBytes(charsetForName))) {
            bArrBytes = new String(bArrBytes, Charset.forName("GBK")).getBytes("UTF-8");
        }
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(bArrBytes)};
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: J */
    public final void m2585J(String str) {
        String strReplace;
        if (!str.isEmpty()) {
            if (str.contains("原画") || str.contains(">原画<")) {
                this.f2510i = "原画";
            } else if (str.contains("超清") || str.contains(">超清<")) {
                this.f2510i = "超清";
            }
            if (str.contains("调试模式")) {
                this.f2511j = true;
            }
            strReplace = str.replace("超清", "").replace("原画", "").replace(">2K<", "").replace("><", "").replace("普画", "").replace("调试模式", "");
            if (strReplace.startsWith("http")) {
            }
            if (strReplace == null) {
                strReplace = "";
            }
            this.f2505d = strReplace;
        }
        strReplace = "https://cat.colamint.club/ali-tokent";
        strReplace = C1234b.m3052h(strReplace, null, null).replaceAll("[^A-Za-z0-9]", "");
        if (strReplace == null) {
            strReplace = "";
        }
        this.f2505d = strReplace;
    }

    /* JADX INFO: renamed from: K */
    public final void m2586K(String str) {
        if (!m2589s().exists()) {
            C1066f c1066f = this.f2508g;
            c1066f.m2785a();
            c1066f.m2788e();
        }
        if (!m2592x().exists()) {
            C1067g c1067g = this.f2509h;
            c1067g.m2790a();
            c1067g.m2795g();
        }
        this.f2507f = str;
        try {
            SpiderDebug.log("refreshShareToken...");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("share_id", this.f2507f);
            jSONObject.put("share_pwd", "");
            this.f2506e = new JSONObject(m2560G("v2/share_link/get_share_token", jSONObject)).getString("share_token");
        } catch (Exception e) {
            e.printStackTrace();
            Init.show("来晚啦，该分享已失效！");
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: p */
    public final String m2587p(String str) {
        String string;
        RunnableC1028l runnableC1028l;
        final int i = 0;
        try {
            try {
                SpiderDebug.log("getDownloadUrl..." + str);
                this.f2503b.add(0, m2577m(str));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_id", this.f2503b.get(0));
                jSONObject.put("drive_id", this.f2509h.m2793d());
                string = new JSONObject(m2557C("openFile/getDownloadUrl", jSONObject.toString(), true)).getString("url");
                runnableC1028l = new RunnableC1028l(this);
            } catch (Exception e) {
                e.printStackTrace();
                string = "";
                runnableC1028l = new RunnableC1028l(this);
            }
            Init.execute(runnableC1028l);
            return string;
        } catch (Throwable th) {
            Init.execute(new Runnable(this, i) { // from class: com.github.catvod.spider.support.C0.b.j

                /* JADX INFO: renamed from: c */
                public final int f2494c;

                /* JADX INFO: renamed from: d */
                public final Object f2495d;

                {
                    this.f2494c = i;
                    this.f2495d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f2494c) {
                        case 0:
                            C1032p.m2568d((C1032p) this.f2495d);
                            break;
                        default:
                            CronetInterceptor.a((CronetInterceptor) this.f2495d);
                            break;
                    }
                }
            });
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final HashMap<String, String> m2588q() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        map.put("Referer", "https://www.aliyundrive.com/");
        return map;
    }

    /* JADX INFO: renamed from: s */
    public final File m2589s() {
        return new File(Init.context().getCacheDir(), "aliyundrive_oauth");
    }

    /* JADX INFO: renamed from: v */
    public final List<C1039e> m2590v(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=ali&type=sub&file_id=" + strArrSplit[2];
                C1039e c1039e = new C1039e();
                c1039e.m2616c(str2);
                C1039e c1039eM2614a = c1039e.m2614a(str3);
                c1039eM2614a.m2617d(str4);
                arrayList.add(c1039eM2614a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public final Object[] m2591w() {
        return new Object[]{200, "text/plain", new ByteArrayInputStream(this.f2509h.m2794e().getBytes())};
    }

    /* JADX INFO: renamed from: x */
    public final File m2592x() {
        return new File(Init.context().getCacheDir(), "aliyundrive_user");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: y */
    public final JSONObject m2593y(String str) {
        JSONObject jSONObject;
        final int i = 0;
        try {
            try {
                SpiderDebug.log("getVideoPreviewPlayInfo..." + str);
                this.f2503b.add(0, m2577m(str));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("file_id", this.f2503b.get(0));
                jSONObject2.put("drive_id", this.f2509h.m2793d());
                jSONObject2.put("category", "live_transcoding");
                jSONObject2.put("url_expire_sec", "14400");
                jSONObject = new JSONObject(m2557C("openFile/getVideoPreviewPlayInfo", jSONObject2.toString(), true)).getJSONObject("video_preview_play_info");
                Init.execute(new RunnableC1028l(this));
            } catch (Exception e) {
                e.printStackTrace();
                jSONObject = new JSONObject();
                Init.execute(new Runnable(this, i) { // from class: com.github.catvod.spider.support.C0.b.k

                    /* JADX INFO: renamed from: c */
                    public final int f2496c;

                    /* JADX INFO: renamed from: d */
                    public final Object f2497d;

                    {
                        this.f2496c = i;
                        this.f2497d = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.f2496c) {
                            case 0:
                                C1032p.m2568d((C1032p) this.f2497d);
                                break;
                            default:
                                Toast.makeText(Init.context(), (String) this.f2497d, 1).show();
                                break;
                        }
                    }
                });
            }
            return jSONObject;
        } catch (Throwable th) {
            Init.execute(new RunnableC1025i(this, i));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0266  */
    /* JADX WARN: Code duplicated, block: B:80:0x026f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0278  */
    /* JADX WARN: Code duplicated, block: B:86:0x0281  */
    /* JADX WARN: Code duplicated, block: B:89:0x028a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0293  */
    /* JADX INFO: renamed from: z */
    public final C1041g m2594z(String str, String str2) throws JSONException {
        StringBuilder sb;
        String str3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("share_id", this.f2507f);
        JSONObject jSONObject2 = new JSONObject(m2560G("adrive/v3/share_link/get_share_by_anonymous", jSONObject));
        ArrayList<C1065e> arrayList = new ArrayList();
        ArrayList<C1065e> arrayList2 = new ArrayList();
        JSONArray jSONArray = jSONObject2.getJSONArray("file_infos");
        if (TextUtils.isEmpty(str2)) {
            if (jSONArray.length() == 0) {
                str2 = "";
            } else {
                JSONObject jSONObject3 = jSONArray.getJSONObject(0);
                if (jSONObject3.getString("type").equals("folder")) {
                    str2 = jSONObject3.getString("file_id");
                } else if (jSONObject3.getString("type").equals("file") && jSONObject3.getString("category").equals("video")) {
                    str2 = "root";
                } else {
                    str2 = "";
                }
            }
        }
        m2556B(new C1065e(str2), arrayList, arrayList2, "");
        List listAsList = "超清".equals(this.f2510i) ? Arrays.asList(">超清<", ">原画<", ">2K<") : "原画".equals(this.f2510i) ? Arrays.asList(">原画<", ">2K<", ">超清<") : Arrays.asList(">2K<", ">原画<", ">超清<");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C1065e c1065e : arrayList) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c1065e.m2776b());
            sb2.append("$");
            sb2.append(c1065e.m2778d());
            String strM2780f = c1065e.m2780f();
            ArrayList<C1065e> arrayList5 = new ArrayList();
            String lowerCase = C1247o.m3115e(strM2780f).toLowerCase();
            for (C1065e c1065e2 : arrayList2) {
                String lowerCase2 = C1247o.m3115e(c1065e2.m2780f()).toLowerCase();
                if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                    arrayList5.add(c1065e2);
                }
            }
            if (arrayList5.isEmpty()) {
                arrayList5.addAll(arrayList2);
            }
            StringBuilder sb3 = new StringBuilder();
            for (C1065e c1065e3 : arrayList5) {
                sb3.append(Marker.ANY_NON_NULL_MARKER);
                sb3.append(C1247o.m3115e(c1065e3.m2780f()));
                sb3.append("@@@");
                sb3.append(c1065e3.m2777c());
                sb3.append("@@@");
                sb3.append(c1065e3.m2778d());
            }
            sb2.append(sb3.toString());
            arrayList3.add(sb2.toString());
        }
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList4.add(TextUtils.join("#", arrayList3));
        }
        C1041g c1041g = new C1041g();
        c1041g.m2623f(str);
        String strM2794e = this.f2509h.m2794e();
        JSONObject jSONObject4 = f2501l;
        String strOptString = jSONObject4 != null ? jSONObject4.optString("desc") : "";
        JSONObject jSONObject5 = f2501l;
        String strOptString2 = jSONObject5 != null ? jSONObject5.optString("category") : "";
        JSONObject jSONObject6 = f2501l;
        String strOptString3 = jSONObject6 != null ? jSONObject6.optString("area") : "";
        JSONObject jSONObject7 = f2501l;
        String strOptString4 = jSONObject7 != null ? jSONObject7.optString("year") : "";
        JSONObject jSONObject8 = f2501l;
        String strOptString5 = jSONObject8 != null ? jSONObject8.optString("remark") : "";
        JSONObject jSONObject9 = f2501l;
        String strOptString6 = jSONObject9 != null ? jSONObject9.optString("director") : "";
        JSONObject jSONObject10 = f2501l;
        String strOptString7 = jSONObject10 != null ? jSONObject10.optString("actor") : "";
        if (!this.f2511j || strM2794e.length() <= 0 || !Init.d.getString("ali_tk", "").equals(strM2794e)) {
            if (this.f2511j && strM2794e.length() > 0) {
                sb = new StringBuilder();
                str3 = "正在使用配置中的token：";
            } else if (strOptString.length() > 0) {
                c1041g.m2621d(strOptString);
            } else {
                c1041g.m2621d(str);
            }
            if (strOptString6.length() > 0) {
                c1041g.m2622e(strOptString6);
            }
            if (strOptString7.length() > 0) {
                c1041g.m2619b(strOptString7);
            }
            if (strOptString2.length() > 0) {
                c1041g.m2618a(strOptString2);
            }
            if (strOptString3.length() > 0) {
                c1041g.m2620c(strOptString3);
            }
            if (strOptString4.length() > 0) {
                c1041g.m2629l(strOptString4);
            }
            if (strOptString5.length() > 0) {
                c1041g.m2628k(strOptString5);
            }
            c1041g.m2625h(jSONObject2.getString("avatar"));
            c1041g.m2624g(jSONObject2.getString("share_name"));
            c1041g.m2627j(TextUtils.join("$$$", arrayList4));
            c1041g.m2626i(TextUtils.join("$$$", listAsList));
            c1041g.m2618a("阿里云盘");
            return c1041g;
        }
        sb = new StringBuilder();
        str3 = "正在使用扫码存储token：";
        sb.append(str3);
        sb.append(strM2794e);
        sb.append("，播放");
        sb.append(jSONObject2.getString("share_name"));
        sb.append("，链接：");
        sb.append(str);
        str = sb.toString();
        c1041g.m2621d(str);
        if (strOptString6.length() > 0) {
            c1041g.m2622e(strOptString6);
        }
        if (strOptString7.length() > 0) {
            c1041g.m2619b(strOptString7);
        }
        if (strOptString2.length() > 0) {
            c1041g.m2618a(strOptString2);
        }
        if (strOptString3.length() > 0) {
            c1041g.m2620c(strOptString3);
        }
        if (strOptString4.length() > 0) {
            c1041g.m2629l(strOptString4);
        }
        if (strOptString5.length() > 0) {
            c1041g.m2628k(strOptString5);
        }
        c1041g.m2625h(jSONObject2.getString("avatar"));
        c1041g.m2624g(jSONObject2.getString("share_name"));
        c1041g.m2627j(TextUtils.join("$$$", arrayList4));
        c1041g.m2626i(TextUtils.join("$$$", listAsList));
        c1041g.m2618a("阿里云盘");
        return c1041g;
    }
}
