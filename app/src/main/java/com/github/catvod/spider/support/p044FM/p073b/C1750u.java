package com.github.catvod.spider.support.p044FM.p073b;

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
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.github.catvod.spider.support.p044FM.p075c.C1765g;
import com.github.catvod.spider.support.p044FM.p075c.C1766h;
import com.github.catvod.spider.support.p044FM.p075c.C1768j;
import com.github.catvod.spider.support.p044FM.p077d.C1773b;
import com.github.catvod.spider.support.p044FM.p077d.C1774c;
import com.github.catvod.spider.support.p044FM.p077d.C1775d;
import com.github.catvod.spider.support.p044FM.p077d.C1776e;
import com.github.catvod.spider.support.p044FM.p077d.C1777f;
import com.github.catvod.spider.support.p044FM.p077d.C1778g;
import com.github.catvod.spider.support.p044FM.p077d.C1779h;
import com.github.catvod.spider.support.p044FM.p077d.C1780i;
import com.github.catvod.spider.support.p044FM.p077d.C1781j;
import com.github.catvod.spider.support.p044FM.p077d.C1782k;
import com.github.catvod.spider.support.p044FM.p077d.C1784m;
import com.github.catvod.spider.support.p044FM.p077d.C1785n;
import com.github.catvod.spider.support.p044FM.p077d.C1786o;
import com.github.catvod.spider.support.p044FM.p082g.C1804b;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p088m.C1842e;
import com.github.catvod.spider.support.p044FM.p090o.C1860a;
import com.github.catvod.spider.support.p044FM.p090o.C1869j;
import com.github.catvod.spider.support.p044FM.p090o.C1871l;
import com.github.catvod.spider.support.p044FM.p090o.C1872m;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
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

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1750u {

    /* JADX INFO: renamed from: a */
    private final Map<String, Map<String, String>> f3845a;

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f3846b;

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f3847c;

    /* JADX INFO: renamed from: d */
    private final List<String> f3848d;

    /* JADX INFO: renamed from: e */
    private final ReentrantLock f3849e;

    /* JADX INFO: renamed from: f */
    private final C1773b f3850f;

    /* JADX INFO: renamed from: g */
    private ScheduledExecutorService f3851g;

    /* JADX INFO: renamed from: h */
    private String f3852h;

    /* JADX INFO: renamed from: i */
    private AlertDialog f3853i;

    /* JADX INFO: renamed from: j */
    private C1785n f3854j;

    C1750u() {
        Init.checkPermission();
        this.f3849e = new ReentrantLock();
        this.f3848d = new ArrayList();
        this.f3847c = new HashMap();
        this.f3845a = new HashMap();
        this.f3846b = new HashMap();
        C1773b c1773b = (C1773b) new Gson().fromJson(C1860a.m4498j(m4134q()), C1773b.class);
        this.f3850f = c1773b == null ? new C1773b() : c1773b;
    }

    /* JADX INFO: renamed from: A */
    private static boolean m4100A(String str) {
        String value = new UrlQuerySanitizer(str).getValue("x-oss-expires");
        return !TextUtils.isEmpty(value) && Long.parseLong(value) - (System.currentTimeMillis() / 1000) <= 60;
    }

    /* JADX INFO: renamed from: B */
    private void m4101B(String str, C1778g c1778g, List<C1778g> list, List<C1778g> list2) {
        m4102C(str, c1778g, list, list2, "");
    }

    /* JADX INFO: renamed from: C */
    private void m4102C(String str, C1778g c1778g, List<C1778g> list, List<C1778g> list2, String str2) {
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("limit", 200);
        jsonObject.addProperty("share_id", str);
        jsonObject.addProperty("parent_file_id", c1778g.m4252d());
        jsonObject.addProperty("order_by", "name");
        jsonObject.addProperty("order_direction", "ASC");
        if (str2.length() > 0) {
            jsonObject.addProperty("marker", str2);
        }
        C1778g c1778g2 = (C1778g) new Gson().fromJson(m4122m("adrive/v3/file/list", jsonObject.toString(), true), C1778g.class);
        for (C1778g c1778g3 : c1778g2.m4253e()) {
            if (c1778g3.m4258j().equals("folder")) {
                arrayList.add(c1778g3);
            } else if (c1778g3.m4249a().equals("video") || c1778g3.m4249a().equals("audio")) {
                c1778g3.m4259k(c1778g.m4254f());
                list.add(c1778g3);
            } else if (C1885z.m4573l(c1778g3.m4251c())) {
                list2.add(c1778g3);
            }
        }
        if (c1778g2.m4255g().length() > 0) {
            m4102C(str, c1778g, list, list2, c1778g2.m4255g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m4101B(str, (C1778g) it.next(), list, list2);
        }
    }

    /* JADX INFO: renamed from: D */
    private String m4103D(String str, String str2, boolean z) {
        boolean zM4121l;
        if (!str.startsWith("https")) {
            str = C1747r.m4094b(new byte[]{-71, -47, -81, 101, 124, -63, 6, 21, -66, -43, -66, 123, 33, -102, 69, 83, -88, -48, -75, 113, 125, -110, 95, 95, -1, -58, -76, 120, 32, -102, 77, 72, -72, -45, -66, 58, 121, -54, 7, 10, -2}, new byte[]{-47, -91, -37, 21, 15, -5, 41, 58}, new StringBuilder(), str);
        }
        HashMap<String, String> mapM4136s = m4136s();
        mapM4136s.put("authorization", this.f3850f.m4233b().m4261b());
        C1842e c1842eM4472g = C1840c.m4472g(str, str2, mapM4136s);
        StringBuilder sb = new StringBuilder();
        sb.append(c1842eM4472g.m4482b());
        C1748s.m4098b(new byte[]{-91}, new byte[]{-119, 82, -1, 78, 95, 92, 17, -103}, sb, str);
        sb.append(",");
        sb.append(c1842eM4472g.m4481a());
        SpiderDebug.log(sb.toString());
        if (z && (c1842eM4472g.m4482b() == 400 || c1842eM4472g.m4482b() == 401)) {
            if (this.f3850f.m4233b().m4262c().isEmpty()) {
                SpiderDebug.log("OAuth Request...");
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("authorize", 1);
                jsonObject.addProperty("scope", "user:base,file:all:read,file:all:write");
                String strM4239a = ((C1774c) new Gson().fromJson(m4122m("https://open.aliyundrive.com/oauth/users/authorize?client_id=76917ccccd4441c39457a04f6084fb2f&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=", jsonObject.toString(), true), C1774c.class)).m4239a();
                SpiderDebug.log("OAuth Redirect...");
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("code", strM4239a);
                jsonObject2.addProperty("grant_type", "authorization_code");
                zM4121l = m4121l("code", jsonObject2);
            } else {
                SpiderDebug.log("refreshOpenToken...");
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("grant_type", "refresh_token");
                jsonObject3.addProperty("refresh_token", this.f3850f.m4233b().m4262c());
                zM4121l = m4121l("token", jsonObject3);
            }
            if (zM4121l) {
                return m4103D(str, str2, false);
            }
        }
        return c1842eM4472g.m4481a();
    }

    /* JADX INFO: renamed from: F */
    private String m4104F(String str, JsonObject jsonObject) {
        if (!str.startsWith("https")) {
            str = C1747r.m4094b(new byte[]{60, -6, -69, -102, 70, -88, 56, 40, 53, -2, -90, -60, 84, -2, 126, 126, 33, -32, -85, -104, 92, -28, 114, 41, 55, -31, -94, -59}, new byte[]{84, -114, -49, -22, 53, -110, 23, 7}, new StringBuilder(), str);
        }
        C1842e c1842eM4472g = C1840c.m4472g(str, jsonObject.toString(), m4136s());
        StringBuilder sb = new StringBuilder();
        sb.append(c1842eM4472g.m4482b());
        C1748s.m4098b(new byte[]{-62}, new byte[]{-18, 90, 61, 101, 40, 60, 70, -20}, sb, str);
        sb.append(",");
        sb.append(c1842eM4472g.m4481a());
        SpiderDebug.log(sb.toString());
        return c1842eM4472g.m4481a();
    }

    /* JADX INFO: renamed from: I */
    private boolean m4105I() {
        int i = 0;
        try {
            try {
                SpiderDebug.log("refreshAccessToken...");
                JsonObject jsonObject = new JsonObject();
                String strM4283d = this.f3850f.m4234c().m4283d();
                if (strM4283d.isEmpty()) {
                    strM4283d = this.f3852h;
                }
                if (strM4283d != null && strM4283d.startsWith("http")) {
                    strM4283d = C1840c.m4479n(strM4283d, null).trim();
                }
                jsonObject.addProperty("refresh_token", strM4283d);
                jsonObject.addProperty("grant_type", "refresh_token");
                String strM4104F = m4104F("https://auth.aliyundrive.com/v2/account/token", jsonObject);
                C1773b c1773b = this.f3850f;
                C1786o c1786o = (C1786o) new Gson().fromJson(strM4104F, C1786o.class);
                if (c1786o == null) {
                    c1786o = new C1786o();
                }
                c1773b.m4238g(c1786o);
                if (this.f3850f.m4234c().m4281b().isEmpty()) {
                    throw new Exception(strM4104F);
                }
                while (this.f3850f.m4234c().m4281b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            } catch (Exception e) {
                if (e instanceof TimeoutException) {
                    m4109O();
                    while (this.f3850f.m4234c().m4281b().isEmpty()) {
                        SystemClock.sleep(250L);
                    }
                    return false;
                }
                this.f3850f.m4234c().m4280a();
                e.printStackTrace();
                m4109O();
                Init.run(new RunnableC1732c(this, i));
                while (this.f3850f.m4234c().m4281b().isEmpty()) {
                    SystemClock.sleep(250L);
                }
                return true;
            }
        } catch (Throwable th) {
            while (this.f3850f.m4234c().m4281b().isEmpty()) {
                SystemClock.sleep(250L);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    private void m4106J(String str) {
        C1785n c1785n = this.f3854j;
        if (c1785n == null || !c1785n.m4273a(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("share_pwd", "");
            C1785n c1785n2 = (C1785n) new Gson().fromJson(m4104F("v2/share_link/get_share_token", jsonObject), C1785n.class);
            c1785n2.m4278f(str);
            c1785n2.m4279g();
            this.f3854j = c1785n2;
            if (c1785n2.m4277e().isEmpty()) {
                C1869j.m4522b("来晚啦，该分享已失效！");
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private void m4107M(String str) {
        this.f3850f.m4234c().m4285f(str);
        SpiderDebug.log("Token:" + str);
        C1869j.m4522b("Token:" + str);
        m4105I();
        m4109O();
    }

    /* JADX INFO: renamed from: N */
    private void m4108N(C1775d c1775d) {
        try {
            int iM4531a = C1872m.m4531a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM4531a, iM4531a);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C1317a.m3301b(c1775d.m4241a(), iM4531a));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.support.FM.b.k
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C1750u.m4112c(this.f3833a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.support.FM.b.m
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C1750u.m4116g(this.f3835a);
                }
            }).show();
            this.f3853i = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            C1869j.m4522b("请使用阿里云盘 App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: O */
    private void m4109O() {
        ScheduledExecutorService scheduledExecutorService = this.f3851g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC1743n(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public static void m4110a(C1750u c1750u, String str) {
        c1750u.getClass();
        if (str.startsWith("http")) {
            str = C1840c.m4479n(str, null);
        }
        c1750u.m4107M(str);
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: b */
    public static void m4111b(C1750u c1750u) {
        c1750u.getClass();
        for (String str : new ArrayList(c1750u.f3848d)) {
            SpiderDebug.log("Delete..." + str);
            if (((C1784m) new Gson().fromJson(c1750u.m4122m("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}", c1750u.f3850f.m4232a().m4248a(), str, str), true), C1784m.class)).m4271b().m4272c() == 404) {
                c1750u.f3848d.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4112c(C1750u c1750u) {
        c1750u.m4109O();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4113d(C1750u c1750u, Map map) {
        c1750u.getClass();
        C1775d c1775dM4243c = C1775d.m4240g(C1840c.m4474i("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", map)).m4242b().m4243c();
        if (c1775dM4243c.m4246f()) {
            c1750u.m4107M(c1775dM4243c.m4245e());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m4115f(C1750u c1750u) {
        c1750u.m4124o();
        Init.execute(new RunnableC1744o(c1750u, 1));
    }

    /* JADX INFO: renamed from: g */
    public static void m4116g(C1750u c1750u) {
        c1750u.m4109O();
    }

    /* JADX INFO: renamed from: h */
    public static void m4117h(C1750u c1750u, EditText editText) {
        c1750u.getClass();
        String string = editText.getText().toString();
        c1750u.m4124o();
        Init.execute(new RunnableC1737h(c1750u, string, 0));
    }

    /* JADX INFO: renamed from: i */
    public static void m4118i(final C1750u c1750u, C1775d c1775d) {
        c1750u.getClass();
        final Map<String, String> mapM4244d = c1775d.m4244d();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        c1750u.f3851g = scheduledExecutorServiceNewScheduledThreadPool;
        final int i = 0;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.github.catvod.spider.support.FM.b.i
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        C1750u.m4113d((C1750u) c1750u, (Map) mapM4244d);
                        break;
                    default:
                        Bili.a((Bili) c1750u, (C1804b) mapM4244d);
                        break;
                }
            }
        }, 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: j */
    public static void m4119j(C1750u c1750u, String str, C1775d c1775d) {
        Runnable runnableC1735f;
        c1750u.getClass();
        int i = 0;
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setClassName("com.alicloud.databox", "com.taobao.login4android.scan.QrScanActivity");
                intent.putExtra("key_scanParam", str);
                Init.getActivity().startActivity(intent);
                runnableC1735f = new RunnableC1736g(c1750u, c1775d, i);
            } catch (Exception unused) {
                c1750u.m4108N(c1775d);
                runnableC1735f = new RunnableC1735f(c1750u, c1775d, i);
            }
            Init.execute(runnableC1735f);
        } catch (Throwable th) {
            Init.execute(new RunnableC1734e(c1750u, c1775d, i));
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m4120k(C1750u c1750u) {
        try {
            Toast.makeText(Init.context(), "还未登录阿里云盘账号,请前往【配置中心】登录", 1).show();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m4121l(String str, JsonObject jsonObject) {
        boolean z;
        String strM4094b = C1747r.m4094b(new byte[]{61, -54, 111, -52, 46, -83, 56, -73, 52, -50, 114, -110, 37, -1, 120, -2, 48, -112, 111, -45, 45, -72, 118, -12, 60, -51, 111, -109, 60, -5, 126, -57, 58, -50, 126, -46, 114}, new byte[]{85, -66, 27, -68, 93, -105, 23, -104}, new StringBuilder(), str);
        C1842e c1842eM4472g = C1840c.m4472g(strM4094b, jsonObject.toString(), m4136s());
        StringBuilder sb = new StringBuilder();
        sb.append(c1842eM4472g.m4482b());
        C1748s.m4098b(new byte[]{97}, new byte[]{77, -6, -17, -120, -54, -65, -54, -120}, sb, strM4094b);
        sb.append(",");
        sb.append(c1842eM4472g.m4481a());
        SpiderDebug.log(sb.toString());
        if (c1842eM4472g.m4481a().contains("Too Many Requests")) {
            C1869j.m4522b("洗洗睡吧，梦里啥都有！");
            this.f3850f.m4233b().m4260a();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        C1773b c1773b = this.f3850f;
        C1779h c1779h = (C1779h) new Gson().fromJson(c1842eM4472g.m4481a(), C1779h.class);
        if (c1779h == null) {
            c1779h = new C1779h();
        }
        c1773b.m4237f(c1779h);
        return true;
    }

    /* JADX INFO: renamed from: m */
    private String m4122m(String str, String str2, boolean z) {
        HashMap<String, String> mapM4126t;
        if (!str.startsWith("https")) {
            str = C1747r.m4094b(new byte[]{93, 81, -94, -69, 51, 88, 43, -85, 84, 85, -65, -27, 33, 14, 109, -3, 64, 75, -78, -71, 41, 20, 97, -86, 86, 74, -69, -28}, new byte[]{53, 37, -42, -53, 64, 98, 4, -124}, new StringBuilder(), str);
        }
        if (str.contains("file/list")) {
            mapM4126t = m4136s();
            mapM4126t.put("x-share-token", this.f3854j.m4277e());
            mapM4126t.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        } else {
            mapM4126t = m4126t();
        }
        C1842e c1842eM4472g = C1840c.m4472g(str, str2, mapM4126t);
        StringBuilder sb = new StringBuilder();
        sb.append(c1842eM4472g.m4482b());
        C1748s.m4098b(new byte[]{-71}, new byte[]{-107, -75, 47, -94, 66, -87, 118, 28}, sb, str);
        sb.append(",");
        sb.append(c1842eM4472g.m4481a());
        SpiderDebug.log(sb.toString());
        if (z && c1842eM4472g.m4482b() == 401 && m4105I()) {
            return m4122m(str, str2, false);
        }
        return (z && c1842eM4472g.m4482b() == 429) ? m4122m(str, str2, false) : c1842eM4472g.m4481a();
    }

    /* JADX INFO: renamed from: n */
    private String m4123n(String str, String str2) {
        if (this.f3850f.m4232a().m4248a().isEmpty()) {
            SpiderDebug.log("Get Drive Id...");
            String strM4122m = m4122m("https://user.aliyundrive.com/v2/user/get", "{}", true);
            C1773b c1773b = this.f3850f;
            C1777f c1777f = (C1777f) new Gson().fromJson(strM4122m, C1777f.class);
            if (c1777f == null) {
                c1777f = new C1777f();
            }
            c1773b.m4236e(c1777f);
        }
        SpiderDebug.log("Copy..." + str2);
        return ((C1784m) new Gson().fromJson(m4122m("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", str2, str, this.f3850f.m4232a().m4248a()), true), C1784m.class)).m4271b().m4270a().m4269a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m4124o() {
        try {
            AlertDialog alertDialog = this.f3853i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static C1750u m4125p() {
        return C1749t.f3844a;
    }

    /* JADX INFO: renamed from: t */
    private HashMap<String, String> m4126t() {
        HashMap<String, String> mapM4136s = m4136s();
        mapM4136s.put("x-share-token", this.f3854j.m4277e());
        mapM4136s.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        if (this.f3850f.m4234c().m4284e()) {
            mapM4136s.put("authorization", this.f3850f.m4234c().m4282c());
        }
        return mapM4136s;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: u */
    private String m4127u(String str, String str2, String str3) {
        List<String> listM4128v = m4128v(m4139y(str, str2), str, str2, false);
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) listM4128v;
            if (i >= arrayList.size()) {
                break;
            }
            map.put((String) arrayList.get(i), (String) arrayList.get(i + 1));
            i += 2;
        }
        String str4 = (String) map.get(str3);
        String[] strArrSplit = C1840c.m4479n(str4, m4136s()).split("\n");
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(str4.substring(0, str4.lastIndexOf("/")));
        String strM3588a = C1434P.m3588a(new byte[]{1}, new byte[]{46, 4, -83, -121, 83, -31, -118, 92}, sb);
        int length = strArrSplit.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str5 = strArrSplit[i2];
            if (str5.contains("x-oss-expires")) {
                map2.put(String.valueOf(i3), strM3588a + str5);
                String strValueOf = String.valueOf(i3);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                str5 = String.format(C1434P.m3588a(new byte[]{-110, -30, 102, -52, -109, 116, 26, 81, -39, -1, 121, -108, -49, 110, 26, 19, -56, -23, 47, -110, -109, 108, 22, 74, -120, -11, 47, -126, -102, 121, 1, 18, -28, -30, 52, -44, -127, 62, 21, 30, -63, -29, 64, -107, -49, 61, 0, 81, -39, -29, 100, -127, -98, 121, 7, 18, -28, -30, 52, -44, -127, 62, 30, 18, -55, -17, 104, -72, -106, 37, 86, 4}, new byte[]{-83, -122, 9, -15, -14, 24, 115, 119}, sb2), "m3u8", str, str2, str3, strValueOf);
                i3++;
            }
            arrayList2.add(str5);
            i2++;
            strM3588a = strM3588a;
        }
        this.f3845a.put(str2, map2);
        return TextUtils.join("\n", arrayList2);
    }

    /* JADX INFO: renamed from: v */
    private List<String> m4128v(C1780i c1780i, String str, String str2, boolean z) {
        String strM4267c;
        List<C1781j> listM4264b = c1780i.m4264b();
        ArrayList arrayList = new ArrayList();
        for (int size = listM4264b.size() - 1; size >= 0; size--) {
            arrayList.add(listM4264b.get(size).m4266b());
            if (z) {
                String strM4266b = listM4264b.get(size).m4266b();
                StringBuilder sb = new StringBuilder();
                sb.append(Proxy.getUrl());
                strM4267c = String.format(C1434P.m3588a(new byte[]{42, -118, 44, -23, 118, 69, -98, 12, 97, -105, 51, -79, 42, 95, -98, 78, 112, -127, 101, -73, 118, 93, -110, 23, 48, -99, 101, -89, 127, 72, -123, 79, 92, -118, 126, -15, 100, 15, -111, 67, 121, -117, 10, -80, 42, 12, -124, 12, 97, -117, 46, -92, 123, 72, -125, 79, 92, -118, 126, -15, 100}, new byte[]{21, -18, 67, -44, 23, 41, -9, 42}, sb), "preview", str, str2, strM4266b);
            } else {
                strM4267c = listM4264b.get(size).m4267c();
            }
            arrayList.add(strM4267c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final String m4129E(String[] strArr, String str) {
        if (!str.split("#")[0].equals("阿里普画")) {
            if (!str.split("#")[0].contains("阿里原画")) {
                return "";
            }
            C1765g c1765g = new C1765g();
            String str2 = strArr[0];
            String str3 = strArr[1];
            StringBuilder sb = new StringBuilder();
            sb.append(Proxy.getUrl());
            c1765g.m4207x(String.format(C1434P.m3588a(new byte[]{-16, 103, 62, -69, -44, -77, -11, -46, -69, 122, 33, -29, -120, -87, -11, -112, -86, 108, 119, -27, -44, -85, -7, -55, -22, 112, 119, -11, -35, -66, -18, -111, -122, 103, 108, -93, -58, -7, -6, -99, -93, 102, 24, -30, -120, -6, -17}, new byte[]{-49, 3, 81, -122, -75, -33, -100, -12}, sb), "open", str2, str3));
            c1765g.m4201j();
            c1765g.m4206w(m4138x(strArr));
            c1765g.m4198f(m4136s());
            return c1765g.toString();
        }
        C1780i c1780iM4139y = m4139y(strArr[0], strArr[1]);
        List<String> listM4128v = m4128v(c1780iM4139y, strArr[0], strArr[1], true);
        List<C1766h> listM4138x = m4138x(strArr);
        ArrayList arrayList = new ArrayList();
        Iterator<C1781j> it = c1780iM4139y.m4263a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m4265a());
        }
        ((ArrayList) listM4138x).addAll(arrayList);
        C1765g c1765g2 = new C1765g();
        c1765g2.m4208y(listM4128v);
        c1765g2.m4200h();
        c1765g2.m4206w(listM4138x);
        c1765g2.m4198f(m4136s());
        return c1765g2.toString();
    }

    /* JADX INFO: renamed from: G */
    public final Object[] m4130G(Map<String, String> map) {
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(C1885z.m4579r(C1840c.m4470e(m4135r(map.get("shareId"), map.get("fileId")), m4126t()).body().bytes()))};
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX INFO: renamed from: H */
    public final Object[] m4131H(Map<String, String> map) {
        String strM4137w;
        AlertDialog alertDialog = this.f3853i;
        if (alertDialog != null && alertDialog.isShowing()) {
            return null;
        }
        String str = map.get("templateId");
        String str2 = map.get("shareId");
        String str3 = map.get("mediaId");
        String str4 = map.get("fileId");
        String str5 = map.get("cate");
        if ("preview".equals(str5)) {
            return new Object[]{200, "application/vnd.apple.mpegurl", new ByteArrayInputStream(m4127u(str2, str4, str).getBytes())};
        }
        if ("open".equals(str5)) {
            strM4137w = m4135r(str2, str4);
        } else if ("share".equals(str5)) {
            strM4137w = m4137w(str2, str4);
        } else if ("m3u8".equals(str5)) {
            this.f3849e.lock();
            String str6 = (String) ((Map) this.f3845a.get(str4)).get(str3);
            if (m4100A(str6)) {
                m4127u(str2, str4, str);
                str6 = (String) ((Map) this.f3845a.get(str4)).get(str3);
            }
            strM4137w = str6;
            this.f3849e.unlock();
        } else {
            strM4137w = "";
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent");
        for (String str7 : map.keySet()) {
            if (listAsList.contains(str7)) {
                treeMap.put(str7, map.get(str7));
            }
        }
        return C1871l.m4530g(strM4137w, treeMap);
    }

    /* JADX INFO: renamed from: K */
    public final void m4132K() {
        Init.checkPermission();
        m4105I();
    }

    /* JADX INFO: renamed from: L */
    public final void m4133L(String str) {
        this.f3852h = str;
    }

    /* JADX INFO: renamed from: q */
    public final File m4134q() {
        return C1860a.m4502l("aliyun");
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: r */
    public final String m4135r(String str, String str2) {
        String str3;
        Runnable runnableC1733d;
        int i = 0;
        try {
            try {
                if (this.f3847c.containsKey(str2) && this.f3847c.get(str2) != null && !m4100A((String) this.f3847c.get(str2))) {
                    str3 = (String) this.f3847c.get(str2);
                    runnableC1733d = new RunnableC1743n(this, i);
                    Init.execute(runnableC1733d);
                    return str3;
                }
                m4106J(str);
                SpiderDebug.log("getDownloadUrl..." + str2);
                this.f3848d.add(0, m4123n(str, str2));
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("file_id", (String) this.f3848d.get(0));
                jsonObject.addProperty("drive_id", this.f3850f.m4232a().m4248a());
                jsonObject.addProperty("expire_sec", Integer.valueOf(DescriptorProtos.Edition.EDITION_LEGACY_VALUE));
                String strM4247a = ((C1776e) new Gson().fromJson(m4103D("openFile/getDownloadUrl", jsonObject.toString(), true), C1776e.class)).m4247a();
                this.f3847c.put(str2, strM4247a);
                Init.execute(new RunnableC1730a(this, i));
                return strM4247a;
            } catch (Exception e) {
                e.printStackTrace();
                str3 = "";
                runnableC1733d = new RunnableC1733d(this, i);
            }
        } catch (Throwable th) {
            Init.execute(new RunnableC1744o(this, i));
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public final HashMap<String, String> m4136s() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Referer", "https://www.aliyundrive.com/");
        return map;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: w */
    public final String m4137w(String str, String str2) {
        JsonElement string;
        try {
            if (this.f3846b.containsKey(str2) && this.f3846b.get(str2) != null && !m4100A((String) this.f3846b.get(str2))) {
                return (String) this.f3846b.get(str2);
            }
            m4106J(str);
            SpiderDebug.log("getShareDownloadUrl..." + str2);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("file_id", str2);
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("expire_sec", 600);
            String strM4122m = m4122m("v2/file/get_share_link_download_url", jsonObject.toString(), false);
            try {
                string = JsonParser.parseString(strM4122m);
            } catch (Throwable unused) {
                string = new JsonParser().parse(strM4122m);
            }
            String asString = string.getAsJsonObject().get("download_url").getAsString();
            this.f3846b.put(str2, asString);
            return asString;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: x */
    public final List<C1766h> m4138x(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.contains("@@@")) {
                String[] strArrSplit = str.split("@@@");
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = Proxy.getUrl() + "?do=ali&type=sub&shareId=" + strArr[0] + "&fileId=" + strArrSplit[2];
                C1766h c1766h = new C1766h();
                c1766h.m4212c(str2);
                C1766h c1766hM4210a = c1766h.m4210a(str3);
                c1766hM4210a.m4213d(str4);
                arrayList.add(c1766hM4210a);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: y */
    public final C1780i m4139y(String str, String str2) {
        C1780i c1780i;
        Runnable runnableC1745p;
        int i = 0;
        try {
            try {
                m4106J(str);
                SpiderDebug.log("getVideoPreviewPlayInfo..." + str2);
                this.f3848d.add(0, m4123n(str, str2));
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("file_id", (String) this.f3848d.get(0));
                jsonObject.addProperty("drive_id", this.f3850f.m4232a().m4248a());
                jsonObject.addProperty("category", "live_transcoding");
                jsonObject.addProperty("url_expire_sec", Integer.valueOf(DescriptorProtos.Edition.EDITION_LEGACY_VALUE));
                c1780i = ((C1782k) new Gson().fromJson(m4103D("openFile/getVideoPreviewPlayInfo", jsonObject.toString(), true), C1782k.class)).m4268a();
                runnableC1745p = new RunnableC1746q(this, i);
            } catch (Exception e) {
                e.printStackTrace();
                c1780i = new C1780i();
                runnableC1745p = new RunnableC1745p(this, i);
            }
            Init.execute(runnableC1745p);
            return c1780i;
        } catch (Throwable th) {
            Init.execute(new RunnableC1731b(this, i));
            throw th;
        }
    }

    /* JADX INFO: renamed from: z */
    public final C1768j m4140z(String str, String str2, String str3) {
        String strM4252d;
        m4106J(str2);
        JsonObject jsonObject = new JsonObject();
        int i = 8;
        jsonObject.addProperty("share_id", str2);
        C1785n c1785n = (C1785n) new Gson().fromJson(m4104F("adrive/v3/share_link/get_share_by_anonymous", jsonObject), C1785n.class);
        ArrayList<C1778g> arrayList = new ArrayList();
        ArrayList<C1778g> arrayList2 = new ArrayList();
        char c = 0;
        if (!TextUtils.isEmpty(str3)) {
            strM4252d = str3;
        } else if (c1785n.m4275c().isEmpty()) {
            strM4252d = "";
        } else {
            C1778g c1778g = c1785n.m4275c().get(0);
            strM4252d = c1778g.m4258j().equals("folder") ? c1778g.m4252d() : "root";
        }
        m4102C(str2, new C1778g(strM4252d), arrayList, arrayList2, "");
        Collections.sort(arrayList);
        byte[] bArr = {79, 8, -19, -26, -7, 111, 22, 111};
        int i2 = 1;
        List listAsList = Arrays.asList("阿里原画", "阿里普画");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C1778g c1778g2 : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append(c1778g2.m4250b());
            byte[] bArr2 = new byte[i2];
            bArr2[c] = -127;
            byte[] bArr3 = new byte[i];
            // fill-array-data instruction
            bArr3[0] = -91;
            bArr3[1] = 27;
            bArr3[2] = 60;
            bArr3[3] = 4;
            bArr3[4] = -61;
            bArr3[5] = -11;
            bArr3[6] = 38;
            bArr3[7] = -59;
            C1748s.m4098b(bArr2, bArr3, sb, str2);
            byte[] bArr4 = new byte[i2];
            bArr4[c] = -35;
            byte[] bArr5 = new byte[i];
            // fill-array-data instruction
            bArr5[0] = -10;
            bArr5[1] = -73;
            bArr5[2] = 48;
            bArr5[3] = -89;
            bArr5[4] = -82;
            bArr5[5] = 115;
            bArr5[6] = -94;
            bArr5[7] = 15;
            sb.append(C1711a.m3992b(bArr4, bArr5));
            sb.append(c1778g2.m4252d());
            String strM4254f = c1778g2.m4254f();
            ArrayList<C1778g> arrayList5 = new ArrayList();
            String lowerCase = C1885z.m4577p(strM4254f).toLowerCase();
            for (C1778g c1778g3 : arrayList2) {
                String lowerCase2 = C1885z.m4577p(c1778g3.m4254f()).toLowerCase();
                if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                    arrayList5.add(c1778g3);
                }
            }
            if (arrayList5.isEmpty()) {
                arrayList5.addAll(arrayList2);
            }
            StringBuilder sb2 = new StringBuilder();
            for (C1778g c1778g4 : arrayList5) {
                byte[] bArr6 = new byte[i2];
                bArr6[0] = 98;
                sb2.append(C1711a.m3992b(bArr6, new byte[]{73, -53, -121, 39, -105, 68, 30, -46}));
                sb2.append(C1885z.m4577p(c1778g4.m4254f()));
                sb2.append("@@@");
                sb2.append(c1778g4.m4251c());
                sb2.append("@@@");
                sb2.append(c1778g4.m4252d());
                i2 = 1;
            }
            sb.append(sb2.toString());
            arrayList3.add(sb.toString());
            i2 = 1;
            i = 8;
            c = 0;
        }
        for (int i3 = 0; i3 < listAsList.size(); i3++) {
            arrayList4.add(TextUtils.join("#", arrayList3));
        }
        C1768j c1768j = new C1768j();
        c1768j.m4221g(str);
        c1768j.m4219e(str);
        c1768j.m4223i(c1785n.m4274b());
        c1768j.m4222h(c1785n.m4276d());
        c1768j.m4225k(TextUtils.join("$$$", arrayList4));
        c1768j.m4224j(TextUtils.join("$$$", listAsList));
        c1768j.m4216b("阿里云盘");
        return c1768j;
    }
}
