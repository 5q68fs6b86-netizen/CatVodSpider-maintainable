package com.github.catvod.spider.support.p003AB.p005b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.UrlQuerySanitizer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p003AB.J.a;
import com.github.catvod.spider.support.p003AB.d.b;
import com.github.catvod.spider.support.p003AB.d.c;
import com.github.catvod.spider.support.p003AB.d.d;
import com.github.catvod.spider.support.p003AB.d.e;
import com.github.catvod.spider.support.p003AB.d.f;
import com.github.catvod.spider.support.p003AB.d.g;
import com.github.catvod.spider.support.p003AB.d.h;
import com.github.catvod.spider.support.p003AB.d.i;
import com.github.catvod.spider.support.p003AB.d.j;
import com.github.catvod.spider.support.p003AB.d.k;
import com.github.catvod.spider.support.p003AB.d.m;
import com.github.catvod.spider.support.p003AB.d.n;
import com.github.catvod.spider.support.p003AB.d.o;
import com.github.catvod.spider.support.p003AB.p004a.C0816a;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import com.github.catvod.spider.support.p003AB.p007m.C0871e;
import com.github.catvod.spider.support.p003AB.p009o.C0895E;
import com.github.catvod.spider.support.p003AB.p009o.C0896F;
import com.github.catvod.spider.support.p003AB.p009o.C0898H;
import com.github.catvod.spider.support.p003AB.p009o.C0899I;
import com.github.catvod.spider.support.p003AB.p009o.C0921c0;
import com.github.catvod.spider.support.p003AB.p009o.C0936q;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.protobuf.DescriptorProtos;
import java.io.ByteArrayInputStream;
import java.io.File;
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
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p005b.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0857x {

    /* JADX INFO: renamed from: a */
    private final Map<String, Map<String, String>> f2011a;

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f2012b;

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f2013c;

    /* JADX INFO: renamed from: d */
    private final List<String> f2014d;

    /* JADX INFO: renamed from: e */
    private final ReentrantLock f2015e;

    /* JADX INFO: renamed from: f */
    private final b f2016f;

    /* JADX INFO: renamed from: g */
    private ScheduledExecutorService f2017g;

    /* JADX INFO: renamed from: h */
    private String f2018h;

    /* JADX INFO: renamed from: i */
    private AlertDialog f2019i;

    /* JADX INFO: renamed from: j */
    private n f2020j;

    C0857x() {
        Init.checkPermission();
        this.f2015e = new ReentrantLock();
        this.f2014d = new ArrayList();
        this.f2013c = new HashMap();
        this.f2011a = new HashMap();
        this.f2012b = new HashMap();
        b bVar = (b) C0852s.m2054a(C0896F.m2155c(m2095q()), b.class);
        this.f2016f = bVar == null ? new b() : bVar;
    }

    /* JADX INFO: renamed from: A */
    private static boolean m2061A(String str) {
        String value = new UrlQuerySanitizer(str).getValue("x-oss-expires");
        return !TextUtils.isEmpty(value) && Long.parseLong(value) - (System.currentTimeMillis() / 1000) <= 60;
    }

    /* JADX INFO: renamed from: B */
    private void m2062B(String str, g gVar, List<g> list, List<g> list2) {
        m2063C(str, gVar, list, list2, "");
    }

    /* JADX INFO: renamed from: C */
    private void m2063C(String str, g gVar, List<g> list, List<g> list2, String str2) {
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("limit", 200);
        jsonObject.addProperty("share_id", str);
        jsonObject.addProperty("parent_file_id", gVar.d());
        jsonObject.addProperty("order_by", "name");
        jsonObject.addProperty("order_direction", "ASC");
        if (str2.length() > 0) {
            jsonObject.addProperty("marker", str2);
        }
        g gVar2 = (g) C0852s.m2054a(m2083m("adrive/v3/file/list", jsonObject.toString(), true), g.class);
        for (g gVar3 : gVar2.e()) {
            if (gVar3.j().equals("folder")) {
                arrayList.add(gVar3);
            } else if (gVar3.a().equals("video") || gVar3.a().equals("audio")) {
                gVar3.k(gVar.f());
                list.add(gVar3);
            } else if (C0921c0.m2231n(gVar3.c())) {
                list2.add(gVar3);
            }
        }
        if (gVar2.g().length() > 0) {
            m2063C(str, gVar, list, list2, gVar2.g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2062B(str, (g) it.next(), list, list2);
        }
    }

    /* JADX INFO: renamed from: D */
    private String m2064D(String str, String str2, boolean z) {
        boolean zM2082l;
        if (!str.startsWith("https")) {
            str = C0854u.m2059b(new byte[]{47, 98, 73, -9, -54, 97, -18, -101, 40, 102, 88, -23, -105, 58, -83, -35, 62, 99, 83, -29, -53, 50, -73, -47, 105, 117, 82, -22, -106, 58, -91, -58, 46, 96, 88, -88, -49, 106, -17, -124, 104}, new byte[]{71, 22, 61, -121, -71, 91, -63, -76}, new StringBuilder(), str);
        }
        HashMap<String, String> mapM2097s = m2097s();
        mapM2097s.put("authorization", this.f2016f.b().b());
        C0871e c0871eM2127g = C0869c.m2127g(str, str2, mapM2097s);
        StringBuilder sb = new StringBuilder();
        sb.append(c0871eM2127g.m2135b());
        C0855v.m2060a(new byte[]{-59}, new byte[]{-23, 8, 45, -114, -81, 35, -106, 6}, sb, str);
        sb.append(",");
        sb.append(c0871eM2127g.m2134a());
        SpiderDebug.log(sb.toString());
        if (z && (c0871eM2127g.m2135b() == 400 || c0871eM2127g.m2135b() == 401)) {
            if (this.f2016f.b().c().isEmpty()) {
                SpiderDebug.log("OAuth Request...");
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("authorize", 1);
                jsonObject.addProperty("scope", "user:base,file:all:read,file:all:write");
                String strA = ((c) C0852s.m2054a(m2083m("https://open.aliyundrive.com/oauth/users/authorize?client_id=76917ccccd4441c39457a04f6084fb2f&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=", jsonObject.toString(), true), c.class)).a();
                SpiderDebug.log("OAuth Redirect...");
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("code", strA);
                jsonObject2.addProperty("grant_type", "authorization_code");
                zM2082l = m2082l("code", jsonObject2);
            } else {
                SpiderDebug.log("refreshOpenToken...");
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("grant_type", "refresh_token");
                jsonObject3.addProperty("refresh_token", this.f2016f.b().c());
                zM2082l = m2082l("token", jsonObject3);
            }
            if (zM2082l) {
                return m2064D(str, str2, false);
            }
        }
        return c0871eM2127g.m2134a();
    }

    /* JADX INFO: renamed from: F */
    private String m2065F(String str, JsonObject jsonObject) {
        if (!str.startsWith("https")) {
            str = C0854u.m2059b(new byte[]{-77, -61, 27, 35, -49, -106, -32, 117, -70, -57, 6, 125, -35, -64, -90, 35, -82, -39, 11, 33, -43, -38, -86, 116, -72, -40, 2, 124}, new byte[]{-37, -73, 111, 83, -68, -84, -49, 90}, new StringBuilder(), str);
        }
        C0871e c0871eM2127g = C0869c.m2127g(str, jsonObject.toString(), m2097s());
        StringBuilder sb = new StringBuilder();
        sb.append(c0871eM2127g.m2135b());
        C0855v.m2060a(new byte[]{-49}, new byte[]{-29, -39, 0, 26, -100, 17, -82, 1}, sb, str);
        sb.append(",");
        sb.append(c0871eM2127g.m2134a());
        SpiderDebug.log(sb.toString());
        return c0871eM2127g.m2134a();
    }

    /* JADX INFO: renamed from: I */
    private boolean m2066I() {
        try {
            try {
                SpiderDebug.log("refreshAccessToken...");
                JsonObject jsonObject = new JsonObject();
                String strD = this.f2016f.c().d();
                if (strD.isEmpty()) {
                    strD = this.f2018h;
                }
                if (strD != null && strD.startsWith("http")) {
                    strD = C0869c.m2132l(strD, null).trim();
                }
                jsonObject.addProperty("refresh_token", strD);
                jsonObject.addProperty("grant_type", "refresh_token");
                String strM2065F = m2065F("https://auth.aliyundrive.com/v2/account/token", jsonObject);
                b bVar = this.f2016f;
                o oVar = (o) new Gson().fromJson(strM2065F, o.class);
                if (oVar == null) {
                    oVar = new o();
                }
                bVar.g(oVar);
                if (this.f2016f.c().b().isEmpty()) {
                    throw new Exception(strM2065F);
                }
                while (this.f2016f.c().b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            } catch (Exception e) {
                int i = 0;
                if (e instanceof TimeoutException) {
                    m2070O();
                    while (this.f2016f.c().b().isEmpty()) {
                        SystemClock.sleep(250L);
                    }
                    return false;
                }
                this.f2016f.c().a();
                e.printStackTrace();
                m2070O();
                Init.run(new RunnableC0838e(this, i));
                while (this.f2016f.c().b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            }
        } catch (Throwable th) {
            while (this.f2016f.c().b().isEmpty()) {
                SystemClock.sleep(250L);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    private void m2067J(String str) {
        n nVar = this.f2020j;
        if (nVar == null || !nVar.a(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("share_pwd", "");
            n nVar2 = (n) C0852s.m2054a(m2065F("v2/share_link/get_share_token", jsonObject), n.class);
            nVar2.f(str);
            nVar2.g();
            this.f2020j = nVar2;
            if (nVar2.e().isEmpty()) {
                C0895E.m2152b("来晚啦，该分享已失效！");
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private void m2068M(String str) {
        this.f2016f.c().f(str);
        SpiderDebug.log("Token:" + str);
        C0895E.m2152b("Token:" + str);
        m2066I();
        m2070O();
    }

    /* JADX INFO: renamed from: N */
    private void m2069N(d dVar) {
        try {
            int iA = a.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0899I.m2172b(dVar.a(), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: com.github.catvod.spider.support.p003AB.p005b.m

                /* JADX INFO: renamed from: a */
                public final C0857x f2000a;

                {
                    this.f2000a = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C0857x.m2073c(this.f2000a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.github.catvod.spider.support.p003AB.p005b.p

                /* JADX INFO: renamed from: a */
                public final C0857x f2005a;

                {
                    this.f2005a = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C0857x.m2077g(this.f2005a);
                }
            }).show();
            this.f2019i = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            C0895E.m2152b("请使用阿里云盘 App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: O */
    private void m2070O() {
        ScheduledExecutorService scheduledExecutorService = this.f2017g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0850q(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public static void m2071a(C0857x c0857x, String str) {
        c0857x.getClass();
        if (str.startsWith("http")) {
            str = C0869c.m2132l(str, null);
        }
        c0857x.m2068M(str);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: b */
    public static void m2072b(C0857x c0857x) {
        c0857x.getClass();
        for (String str : new ArrayList(c0857x.f2014d)) {
            SpiderDebug.log("Delete..." + str);
            if (((m) C0852s.m2054a(c0857x.m2083m("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}", c0857x.f2016f.a().a(), str, str), true), m.class)).b().c() == 404) {
                c0857x.f2014d.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2073c(C0857x c0857x) {
        c0857x.m2070O();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2074d(C0857x c0857x, Map map) {
        c0857x.getClass();
        d dVarC = d.g(C0869c.m2129i("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", map)).b().c();
        if (dVarC.f()) {
            c0857x.m2068M(dVarC.e());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2076f(C0857x c0857x) {
        c0857x.m2085o();
        Init.execute(new RunnableC0851r(c0857x, 1));
    }

    /* JADX INFO: renamed from: g */
    public static void m2077g(C0857x c0857x) {
        c0857x.m2070O();
    }

    /* JADX INFO: renamed from: h */
    public static void m2078h(C0857x c0857x, EditText editText) {
        c0857x.getClass();
        String string = editText.getText().toString();
        c0857x.m2085o();
        Init.execute(new RunnableC0844k(c0857x, string, 0));
    }

    /* JADX INFO: renamed from: i */
    public static void m2079i(C0857x c0857x, d dVar) {
        c0857x.getClass();
        Map mapD = dVar.d();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        c0857x.f2017g = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC0843j(c0857x, mapD, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: j */
    public static void m2080j(C0857x c0857x, String str, d dVar) {
        Runnable runnableC0841h;
        c0857x.getClass();
        int i = 0;
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setClassName("com.alicloud.databox", "com.taobao.login4android.scan.QrScanActivity");
                intent.putExtra("key_scanParam", str);
                Init.getActivity().startActivity(intent);
                runnableC0841h = new RunnableC0842i(c0857x, dVar, i);
            } catch (Exception unused) {
                c0857x.m2069N(dVar);
                runnableC0841h = new RunnableC0841h(c0857x, dVar, i);
            }
            Init.execute(runnableC0841h);
        } catch (Throwable th) {
            Init.execute(new RunnableC0840g(c0857x, dVar, i));
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2081k(final C0857x c0857x) {
        c0857x.getClass();
        try {
            int iA = a.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            c0857x.f2019i = new AlertDialog.Builder(Init.getActivity()).setTitle("请输入Token【支持32位和Http】").setView(frameLayout).setNeutralButton("云盘App授权", new DialogInterface.OnClickListener(c0857x) { // from class: com.github.catvod.spider.support.p003AB.p005b.o

                /* JADX INFO: renamed from: a */
                public final C0857x f2004a;

                {
                    this.f2004a = c0857x;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C0857x.m2076f(this.f2004a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0847n(c0857x, editText, 0)).show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m2082l(String str, JsonObject jsonObject) {
        boolean z;
        String strM2059b = C0854u.m2059b(new byte[]{52, -87, 83, 89, 83, -64, 69, 103, 61, -83, 78, 7, 88, -110, 5, 46, 57, -13, 83, 70, 80, -43, 11, 36, 53, -82, 83, 6, 65, -106, 3, 23, 51, -83, 66, 71, 15}, new byte[]{92, -35, 39, 41, 32, -6, 106, 72}, new StringBuilder(), str);
        C0871e c0871eM2127g = C0869c.m2127g(strM2059b, jsonObject.toString(), m2097s());
        StringBuilder sb = new StringBuilder();
        sb.append(c0871eM2127g.m2135b());
        C0855v.m2060a(new byte[]{-32}, new byte[]{-52, -6, 94, -42, -47, 19, 55, 25}, sb, strM2059b);
        sb.append(",");
        sb.append(c0871eM2127g.m2134a());
        SpiderDebug.log(sb.toString());
        if (c0871eM2127g.m2134a().contains("Too Many Requests")) {
            C0895E.m2152b("洗洗睡吧，梦里啥都有！");
            this.f2016f.b().a();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        b bVar = this.f2016f;
        h hVar = (h) C0852s.m2054a(c0871eM2127g.m2134a(), h.class);
        if (hVar == null) {
            hVar = new h();
        }
        bVar.f(hVar);
        return true;
    }

    /* JADX INFO: renamed from: m */
    private String m2083m(String str, String str2, boolean z) {
        HashMap<String, String> mapM2087t;
        if (!str.startsWith("https")) {
            str = C0854u.m2059b(new byte[]{34, 118, 70, 47, 13, -115, 28, -111, 43, 114, 91, 113, 31, -37, 90, -57, 63, 108, 86, 45, 23, -63, 86, -112, 41, 109, 95, 112}, new byte[]{74, 2, 50, 95, 126, -73, 51, -66}, new StringBuilder(), str);
        }
        if (str.contains("file/list")) {
            mapM2087t = m2097s();
            mapM2087t.put("x-share-token", this.f2020j.e());
            mapM2087t.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        } else {
            mapM2087t = m2087t();
        }
        C0871e c0871eM2127g = C0869c.m2127g(str, str2, mapM2087t);
        StringBuilder sb = new StringBuilder();
        sb.append(c0871eM2127g.m2135b());
        C0855v.m2060a(new byte[]{48}, new byte[]{28, 95, 14, -114, 82, 109, 69, -72}, sb, str);
        sb.append(",");
        sb.append(c0871eM2127g.m2134a());
        SpiderDebug.log(sb.toString());
        if (z && c0871eM2127g.m2135b() == 401 && m2066I()) {
            return m2083m(str, str2, false);
        }
        return (z && c0871eM2127g.m2135b() == 429) ? m2083m(str, str2, false) : c0871eM2127g.m2134a();
    }

    /* JADX INFO: renamed from: n */
    private String m2084n(String str, String str2) {
        if (this.f2016f.a().a().isEmpty()) {
            SpiderDebug.log("Get Drive Id...");
            String strM2083m = m2083m("https://user.aliyundrive.com/v2/user/get", "{}", true);
            b bVar = this.f2016f;
            f fVar = (f) C0852s.m2054a(strM2083m, f.class);
            if (fVar == null) {
                fVar = new f();
            }
            bVar.e(fVar);
        }
        SpiderDebug.log("Copy..." + str2);
        return ((m) C0852s.m2054a(m2083m("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", str2, str, this.f2016f.a().a()), true), m.class)).b().a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m2085o() {
        try {
            AlertDialog alertDialog = this.f2019i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static C0857x m2086p() {
        return C0856w.f2010a;
    }

    /* JADX INFO: renamed from: t */
    private HashMap<String, String> m2087t() {
        HashMap<String, String> mapM2097s = m2097s();
        mapM2097s.put("x-share-token", this.f2020j.e());
        mapM2097s.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        if (this.f2016f.c().e()) {
            mapM2097s.put("authorization", this.f2016f.c().c());
        }
        return mapM2097s;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: u */
    private String m2088u(String str, String str2, String str3) {
        List<String> listM2089v = m2089v(m2100y(str, str2), str, str2, false);
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) listM2089v;
            if (i >= arrayList.size()) {
                break;
            }
            map.put((String) arrayList.get(i), (String) arrayList.get(i + 1));
            i += 2;
        }
        String str4 = (String) map.get(str3);
        String[] strArrSplit = C0869c.m2132l(str4, m2097s()).split("\n");
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(str4.substring(0, str4.lastIndexOf("/")));
        String strM2057b = C0853t.m2057b(new byte[]{-45}, new byte[]{-4, -79, 33, -94, -32, -25, -121, -117}, sb);
        int i2 = 0;
        for (String str5 : strArrSplit) {
            if (str5.contains("x-oss-expires")) {
                map2.put(String.valueOf(i2), strM2057b + str5);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                str5 = String.format(C0853t.m2057b(new byte[]{63, 18, -34, 34, 69, 35, 48, -88, 116, 15, -63, 122, 25, 57, 48, -22, 101, 25, -105, 124, 69, 59, 60, -77, 37, 5, -105, 108, 76, 46, 43, -21, 73, 18, -116, 58, 87, 105, 63, -25, 108, 19, -8, 123, 25, 106, 42, -88, 116, 19, -36, 111, 72, 46, 45, -21, 73, 18, -116, 58, 87, 105, 52, -21, 100, 31, -48, 86, 64, 114, 124, -3}, new byte[]{0, 118, -79, 31, 36, 79, 89, -114}, sb2), "m3u8", str, str2, str3, String.valueOf(i2));
                i2++;
            }
            arrayList2.add(str5);
        }
        this.f2011a.put(str2, map2);
        return TextUtils.join("\n", arrayList2);
    }

    /* JADX INFO: renamed from: v */
    private List<String> m2089v(i iVar, String str, String str2, boolean z) {
        String strC;
        List listB = iVar.b();
        ArrayList arrayList = new ArrayList();
        for (int size = listB.size() - 1; size >= 0; size--) {
            arrayList.add(((j) listB.get(size)).b());
            j jVar = (j) listB.get(size);
            if (z) {
                String strB = jVar.b();
                StringBuilder sb = new StringBuilder();
                sb.append(Proxy.getUrl());
                strC = String.format(C0853t.m2057b(new byte[]{119, -70, -111, -93, 93, 90, -56, -60, 60, -89, -114, -5, 1, 64, -56, -122, 45, -79, -40, -3, 93, 66, -60, -33, 109, -83, -40, -19, 84, 87, -45, -121, 1, -70, -61, -69, 79, 16, -57, -117, 36, -69, -73, -6, 1, 19, -46, -60, 60, -69, -109, -18, 80, 87, -43, -121, 1, -70, -61, -69, 79}, new byte[]{72, -34, -2, -98, 60, 54, -95, -30}, sb), "preview", str, str2, strB);
            } else {
                strC = jVar.c();
            }
            arrayList.add(strC);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final String m2090E(String[] strArr, String str) {
        com.github.catvod.spider.support.p003AB.c.g gVar;
        List<com.github.catvod.spider.support.p003AB.c.h> listM2099x;
        if (str.split("#")[0].equals("阿里普画")) {
            i iVarM2100y = m2100y(strArr[0], strArr[1]);
            List<String> listM2089v = m2089v(iVarM2100y, strArr[0], strArr[1], true);
            listM2099x = m2099x(strArr);
            ArrayList arrayList = new ArrayList();
            Iterator it = iVarM2100y.a().iterator();
            while (it.hasNext()) {
                arrayList.add(((j) it.next()).a());
            }
            ((ArrayList) listM2099x).addAll(arrayList);
            gVar = new com.github.catvod.spider.support.p003AB.c.g();
            gVar.z(listM2089v);
            gVar.h();
        } else {
            if (!str.split("#")[0].contains("阿里原画")) {
                return "";
            }
            gVar = new com.github.catvod.spider.support.p003AB.c.g();
            String str2 = strArr[0];
            String str3 = strArr[1];
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            gVar.y(String.format(C0853t.m2057b(new byte[]{-7, 87, -14, 39, -15, -53, 107, -55, -78, 74, -19, 127, -83, -47, 107, -117, -93, 92, -69, 121, -15, -45, 103, -46, -29, 64, -69, 105, -8, -58, 112, -118, -113, 87, -96, 63, -29, -127, 100, -122, -86, 86, -44, 126, -83, -126, 113}, new byte[]{-58, 51, -99, 26, -112, -89, 2, -17}, sb), "open", str2, str3));
            gVar.j();
            listM2099x = m2099x(strArr);
        }
        gVar.x(listM2099x);
        gVar.f(m2097s());
        return gVar.toString();
    }

    /* JADX INFO: renamed from: G */
    public final Object[] m2091G(Map<String, String> map) {
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(C0921c0.m2237t(C0869c.m2125e(m2096r(map.get("shareId"), map.get("fileId")), m2087t()).body().bytes()))};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX INFO: renamed from: H */
    public final Object[] m2092H(Map<String, String> map) {
        String strM2098w;
        String str;
        AlertDialog alertDialog = this.f2019i;
        if (alertDialog != null && alertDialog.isShowing()) {
            return null;
        }
        String str2 = map.get("templateId");
        String str3 = map.get("shareId");
        String str4 = map.get("mediaId");
        String str5 = map.get("fileId");
        String str6 = map.get("cate");
        if ("preview".equals(str6)) {
            return new Object[]{200, "application/vnd.apple.mpegurl", new ByteArrayInputStream(m2088u(str3, str5, str2).getBytes())};
        }
        if ("open".equals(str6)) {
            strM2098w = m2096r(str3, str5);
        } else if ("share".equals(str6)) {
            strM2098w = m2098w(str3, str5);
        } else if ("m3u8".equals(str6)) {
            this.f2015e.lock();
            String str7 = (String) ((Map) this.f2011a.get(str5)).get(str4);
            if (m2061A(str7)) {
                m2088u(str3, str5, str2);
                str = (String) ((Map) this.f2011a.get(str5)).get(str4);
            } else {
                str = str7;
            }
            this.f2015e.unlock();
            strM2098w = str;
        } else {
            strM2098w = "";
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent");
        for (String str8 : map.keySet()) {
            if (listAsList.contains(str8)) {
                treeMap.put(str8, map.get(str8));
            }
        }
        return C0898H.m2170h(strM2098w, treeMap);
    }

    /* JADX INFO: renamed from: K */
    public final void m2093K() {
        Init.checkPermission();
        m2066I();
    }

    /* JADX INFO: renamed from: L */
    public final void m2094L(String str) {
        this.f2018h = str;
    }

    /* JADX INFO: renamed from: q */
    public final File m2095q() {
        return C0896F.m2158f("aliyun");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: r */
    public final String m2096r(String str, String str2) {
        Runnable runnableC0850q;
        String str3;
        final int i = 0;
        try {
            try {
                if (this.f2013c.containsKey(str2) && this.f2013c.get(str2) != null && !m2061A((String) this.f2013c.get(str2))) {
                    str3 = (String) this.f2013c.get(str2);
                    runnableC0850q = new RunnableC0850q(this, i);
                    Init.execute(runnableC0850q);
                    return str3;
                }
                m2067J(str);
                SpiderDebug.log("getDownloadUrl..." + str2);
                this.f2014d.add(0, m2084n(str, str2));
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("file_id", (String) this.f2014d.get(0));
                jsonObject.addProperty("drive_id", this.f2016f.a().a());
                jsonObject.addProperty("expire_sec", Integer.valueOf(DescriptorProtos.Edition.EDITION_LEGACY_VALUE));
                String strA = ((e) new Gson().fromJson(m2064D("openFile/getDownloadUrl", jsonObject.toString(), true), e.class)).a();
                this.f2013c.put(str2, strA);
                Init.execute(new RunnableC0839f(this, i));
                return strA;
            } catch (Exception e) {
                e.printStackTrace();
                runnableC0850q = new Runnable(this, i) { // from class: com.github.catvod.spider.support.p003AB.p005b.c

                    /* JADX INFO: renamed from: a */
                    public final int f1973a;

                    /* JADX INFO: renamed from: b */
                    public final Object f1974b;

                    {
                        this.f1973a = i;
                        this.f1974b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = this.f1973a;
                        if (i2 == 0) {
                            C0857x.m2072b((C0857x) this.f1974b);
                            return;
                        }
                        if (i2 == 1) {
                            b bVar = (b) this.f1974b;
                            bVar.getClass();
                            C0896F.m2159g(C0856w.f2010a.m2095q(), bVar.toString());
                        } else {
                            Object obj = this.f1974b;
                            if (i2 != 2) {
                                Toast.makeText(((C0936q) obj).f2206a, "弹幕加载成功", 0).show();
                            } else {
                                MainActivity.c((MainActivity) obj);
                            }
                        }
                    }
                };
                str3 = "";
            }
        } catch (Throwable th) {
            Init.execute(new RunnableC0851r(this, i));
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public final HashMap<String, String> m2097s() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Referer", "https://www.aliyundrive.com/");
        return map;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: w */
    public final String m2098w(String str, String str2) {
        JsonElement string;
        try {
            if (this.f2012b.containsKey(str2) && this.f2012b.get(str2) != null && !m2061A((String) this.f2012b.get(str2))) {
                return (String) this.f2012b.get(str2);
            }
            m2067J(str);
            SpiderDebug.log("getShareDownloadUrl..." + str2);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("file_id", str2);
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("expire_sec", 600);
            String strM2083m = m2083m("v2/file/get_share_link_download_url", jsonObject.toString(), false);
            try {
                string = JsonParser.parseString(strM2083m);
            } catch (Throwable unused) {
                string = new JsonParser().parse(strM2083m);
            }
            String asString = string.getAsJsonObject().get("download_url").getAsString();
            this.f2012b.put(str2, asString);
            return asString;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: x */
    public final List<com.github.catvod.spider.support.p003AB.c.h> m2099x(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                com.github.catvod.spider.support.p003AB.c.h hVar = new com.github.catvod.spider.support.p003AB.c.h();
                hVar.c(str2);
                com.github.catvod.spider.support.p003AB.c.h hVarA = hVar.a(str3);
                hVarA.d(str4);
                arrayList.add(hVarA);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: y */
    public final i m2100y(String str, String str2) {
        i iVar;
        Runnable runnableC0835b;
        int i = 0;
        try {
            try {
                m2067J(str);
                SpiderDebug.log("getVideoPreviewPlayInfo..." + str2);
                this.f2014d.add(0, m2084n(str, str2));
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("file_id", (String) this.f2014d.get(0));
                jsonObject.addProperty("drive_id", this.f2016f.a().a());
                jsonObject.addProperty("category", "live_transcoding");
                jsonObject.addProperty("url_expire_sec", Integer.valueOf(DescriptorProtos.Edition.EDITION_LEGACY_VALUE));
                iVar = ((k) new Gson().fromJson(m2064D("openFile/getVideoPreviewPlayInfo", jsonObject.toString(), true), k.class)).a();
                runnableC0835b = new RunnableC0837d(this, i);
            } catch (Exception e) {
                e.printStackTrace();
                iVar = new i();
                runnableC0835b = new RunnableC0835b(this, i);
            }
            Init.execute(runnableC0835b);
            return iVar;
        } catch (Throwable th) {
            Init.execute(new RunnableC0834a(this, i));
            throw th;
        }
    }

    /* JADX INFO: renamed from: z */
    public final com.github.catvod.spider.support.p003AB.c.j m2101z(String str, String str2, String str3) {
        String strD;
        m2067J(str2);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("share_id", str2);
        n nVar = (n) C0852s.m2054a(m2065F("adrive/v3/share_link/get_share_by_anonymous", jsonObject), n.class);
        ArrayList<g> arrayList = new ArrayList();
        ArrayList<g> arrayList2 = new ArrayList();
        if (!TextUtils.isEmpty(str3)) {
            strD = str3;
        } else if (nVar.c().isEmpty()) {
            strD = "";
        } else {
            g gVar = (g) nVar.c().get(0);
            strD = gVar.j().equals("folder") ? gVar.d() : "root";
        }
        m2063C(str2, new g(strD), arrayList, arrayList2, "");
        Collections.sort(arrayList);
        List listAsList = Arrays.asList("阿里原画", "阿里普画");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (g gVar2 : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append(gVar2.b());
            int i = 1;
            C0855v.m2060a(new byte[]{25}, new byte[]{61, 2, 1, 82, -26, 120, -30, 57}, sb, str2);
            sb.append(C0816a.m1965a(new byte[]{-85}, new byte[]{-128, -29, 17, -84, -119, 84, 98, 12}));
            sb.append(gVar2.d());
            String strF = gVar2.f();
            ArrayList<g> arrayList5 = new ArrayList();
            String lowerCase = C0921c0.m2235r(strF).toLowerCase();
            for (g gVar3 : arrayList2) {
                String lowerCase2 = C0921c0.m2235r(gVar3.f()).toLowerCase();
                if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                    arrayList5.add(gVar3);
                }
            }
            if (arrayList5.isEmpty()) {
                arrayList5.addAll(arrayList2);
            }
            StringBuilder sb2 = new StringBuilder();
            for (g gVar4 : arrayList5) {
                byte[] bArr = new byte[i];
                bArr[0] = -52;
                sb2.append(C0816a.m1965a(bArr, new byte[]{-25, 34, 20, -55, 0, 47, -53, 8}));
                sb2.append(C0921c0.m2235r(gVar4.f()));
                sb2.append("@@@");
                sb2.append(gVar4.c());
                sb2.append("@@@");
                sb2.append(gVar4.d());
                i = 1;
            }
            sb.append(sb2.toString());
            arrayList3.add(sb.toString());
        }
        for (int i2 = 0; i2 < listAsList.size(); i2++) {
            arrayList4.add(TextUtils.join("#", arrayList3));
        }
        com.github.catvod.spider.support.p003AB.c.j jVar = new com.github.catvod.spider.support.p003AB.c.j();
        jVar.g(str);
        jVar.e(str);
        jVar.i(nVar.b());
        jVar.h(nVar.d());
        jVar.k(TextUtils.join("$$$", arrayList4));
        jVar.j(TextUtils.join("$$$", listAsList));
        jVar.b("阿里云盘");
        return jVar;
    }
}
