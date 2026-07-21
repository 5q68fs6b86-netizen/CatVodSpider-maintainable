package com.github.catvod.spider.support.p001A;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2270m;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0100m {

    /* JADX INFO: renamed from: b */
    private JSONObject f383b;

    /* JADX INFO: renamed from: c */
    private ScheduledExecutorService f384c;

    /* JADX INFO: renamed from: f */
    private AlertDialog f385f;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.A.m$1, reason: invalid class name */
    final class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static volatile C0100m f386a = new C0100m();
    }

    C0100m() {
    }

    /* JADX INFO: renamed from: G */
    private void m851G(String str, String str2, String str3) {
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
                    str3 = this.f383b.optString("refresh_token");
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
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: S */
    private void m852S() {
        ScheduledExecutorService scheduledExecutorService = this.f384c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new Runnable(this) { // from class: com.github.catvod.spider.support.A.s

            /* JADX INFO: renamed from: b */
            public final Object f394b;

            {
                this.f394b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((C0100m) this.f394b).m858s();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m853b(C0100m c0100m, JSONObject jSONObject) {
        c0100m.getClass();
        String str = System.currentTimeMillis() + "";
        String strOptString = jSONObject.optString("client_id");
        String strOptString2 = jSONObject.optString("token");
        String strOptString3 = jSONObject.optString("device_id");
        String strM6109a = C2256I.m6109a(strOptString3 + str);
        String str2 = "https://open-api-drive.uc.cn/oauth/code?req_id=" + strM6109a + "&access_token=&app_ver=1.6.8&device_id=" + strOptString3 + "&device_brand=vivo&platform=tv&device_name=V2238A&device_model=V2238A&build_device=V2238A&build_product=V2238A&device_gpu=Adreno%20(TM)%20640&activity_rect=%7B%7D&channel=UCTVOFFICIALWEB&client_id=" + strOptString + "&scope=netdisk&query_token=" + strOptString2;
        String strM815b = C0082a.m815b(String.format("GET&/oauth/code&%s&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d", str));
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
        map.put("x-pan-tm", str);
        map.put("host", "open-api-drive.uc.cn");
        map.put("x-pan-token", strM815b);
        map.put("x-pan-client-id", strOptString);
        try {
            JSONObject jSONObject2 = new JSONObject(C2238b.m6073l(str2, map));
            if (jSONObject2.optInt("status") == 0) {
                C2256I.m6113i("UC TV授权成功");
                c0100m.m851G(strM6109a, strOptString3, jSONObject2.optString("code"));
                c0100m.m852S();
            }
        } catch (Exception e) {
            SpiderDebug.log("e1: " + e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m855g(C0100m c0100m) {
        c0100m.m858s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.view.View$OnClickListener, com.github.catvod.spider.support.A.m$2] */
    /* JADX INFO: renamed from: j */
    public static void m856j(final C0100m c0100m, final JSONObject jSONObject) {
        try {
            LinearLayout linearLayout = new LinearLayout(Init.context());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(-1);
            int iM6110c = C2256I.m6110c(20);
            linearLayout.setPadding(iM6110c, 0, iM6110c, 0);
            TextView textView = new TextView(Init.context());
            textView.setText("请使用UC浏览器APP扫码");
            textView.setGravity(17);
            textView.setTextColor(-16777216);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C2256I.m6110c(20);
            layoutParams.bottomMargin = C2256I.m6110c(0);
            linearLayout.addView(textView, layoutParams);
            int iM6110c2 = C2256I.m6110c(200);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (!TextUtils.isEmpty(jSONObject.optString("url"))) {
                imageView.setImageBitmap(C2270m.m6179a(jSONObject.optString("url")));
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM6110c2, iM6110c2);
            layoutParams2.gravity = 17;
            int iM6110c3 = C2256I.m6110c(0);
            layoutParams2.topMargin = iM6110c3;
            layoutParams2.bottomMargin = iM6110c3;
            linearLayout.addView(imageView, layoutParams2);
            AlertDialog.Builder cancelable = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout).setOnCancelListener(new DialogInterface.OnCancelListener(c0100m) { // from class: com.github.catvod.spider.support.A.o

                /* JADX INFO: renamed from: a */
                public final C0100m f387a;

                {
                    this.f387a = c0100m;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C0100m.m855g(this.f387a);
                }
            }).setCancelable(true);
            if (Init.context().getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                c0100m.f385f = cancelable.show();
            } else {
                cancelable.setNeutralButton("APP授权", (DialogInterface.OnClickListener) null);
                c0100m.f385f = cancelable.show();
                Button button = c0100m.f385f.getButton(-3);
                if (button != 0) {
                    Object r1 = new View.OnClickListener(c0100m, jSONObject) { // from class: com.github.catvod.spider.support.A.m.2
                        private Dialog dialog;
                        final C0100m this$0;
                        final JSONObject val$jsonObject;

                        {
                            this.this$0 = c0100m;
                            this.val$jsonObject = jSONObject;
                        }

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            Dialog dialog = this.dialog;
                            if (dialog != null && dialog.isShowing()) {
                                dialog.dismiss();
                            }
                            String strOptString = this.val$jsonObject.optString("url");
                            if (TextUtils.isEmpty(strOptString)) {
                                SpiderDebug.log("URL为空");
                                return;
                            }
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strOptString));
                            intent.setComponent(new ComponentName("com.UCMobile", "com.UCMobile.main.UCMobile"));
                            Init.getActivity().startActivity(intent);
                        }

                        public void setDialog(Dialog dialog) {
                            this.dialog = dialog;
                        }
                    };
                    r1.setDialog(c0100m.f385f);
                    button.setOnClickListener(r1);
                }
            }
            Init.execute(new Runnable(c0100m, jSONObject) { // from class: com.github.catvod.spider.support.A.r

                /* JADX INFO: renamed from: a */
                public final C0100m f392a;

                /* JADX INFO: renamed from: b */
                public final JSONObject f393b;

                {
                    this.f392a = c0100m;
                    this.f393b = jSONObject;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0100m.m857m(this.f392a, this.f393b);
                }
            });
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m857m(final C0100m c0100m, final JSONObject jSONObject) {
        c0100m.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        c0100m.f384c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new Runnable(c0100m, jSONObject) { // from class: com.github.catvod.spider.support.A.p

            /* JADX INFO: renamed from: b */
            public final Object f388b;

            /* JADX INFO: renamed from: c */
            public final Object f389c;

            {
                this.f388b = c0100m;
                this.f389c = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0100m.m853b((C0100m) this.f388b, (JSONObject) this.f389c);
            }
        }, 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m858s() {
        try {
            AlertDialog alertDialog = this.f385f;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            ScheduledExecutorService scheduledExecutorService = this.f384c;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: t */
    public static C0100m m859t() {
        return AnonymousClass1.f386a;
    }

    /* JADX INFO: renamed from: D */
    public final void m860D() {
        try {
            Init.checkPermission();
            String str = System.currentTimeMillis() + "";
            String strM6109a = C2256I.m6109a(str);
            String str2 = String.format("https://open-api-drive.uc.cn/oauth/authorize?req_id=%s&access_token=&app_ver=1.6.8&device_id=%s&device_brand=vivo&platform=tv&device_name=V2238A&device_model=V2238A&build_device=V2238A&build_product=V2238A&device_gpu=Adreno(TM)640&activity_rect=7D&channel=UCTVOFFICIALWEB&auth_type=code&client_id=%s7&scope=netdisk&qrcode=1&qr_width=460&qr_height=460", C2256I.m6109a(strM6109a + str), strM6109a, "5acf882d27b74502b7040b0c65519aa7");
            String strM815b = C0082a.m815b(String.format("GET&/oauth/authorize&%s&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d", str));
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("x-pan-tm", str);
            map.put("x-pan-token", strM815b);
            map.put("content-type", "text/plain;charset=UTF-8");
            map.put("x-pan-client-id", "5acf882d27b74502b7040b0c65519aa7");
            String string = new JSONObject(C2238b.m6073l(str2, map)).getString("query_token");
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", "https://su.uc.cn/9_iCI3h?uc_param_str=&token=" + string + "&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
            jSONObject.put("token", string);
            jSONObject.put("device_id", strM6109a);
            jSONObject.put("client_id", "5acf882d27b74502b7040b0c65519aa7");
            try {
                Init.run(new Runnable(this, jSONObject) { // from class: com.github.catvod.spider.support.A.q

                    /* JADX INFO: renamed from: b */
                    public final C0100m f390b;

                    /* JADX INFO: renamed from: c */
                    public final JSONObject f391c;

                    {
                        this.f390b = this;
                        this.f391c = jSONObject;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0100m.m856j(this.f390b, this.f391c);
                    }
                });
            } catch (Exception e) {
                e = e;
                SpiderDebug.log("getQRCode e: " + e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m861Q() {
        try {
            JSONObject jSONObject = this.f383b;
            if (jSONObject != null && jSONObject.optInt("status") == 0) {
                return true;
            }
            String strM4564c = C1885z.m4564c("uc_token.txt");
            if (TextUtils.isEmpty(strM4564c)) {
                throw new Exception("empty tvuc");
            }
            JSONObject jSONObject2 = new JSONObject(strM4564c);
            this.f383b = jSONObject2;
            if ((jSONObject2.optLong("start_time") + this.f383b.optLong("expires_in")) - (System.currentTimeMillis() / 1000) > 7200) {
                return true;
            }
            try {
                String str = System.currentTimeMillis() + "";
                String strOptString = this.f383b.optString("device_id");
                m851G(C2256I.m6109a(strOptString + str), strOptString, "");
                return true;
            } catch (Exception e) {
                return true;
            }
        } catch (Exception e2) {
            SpiderDebug.log("setTvObject e:" + e2);
            return false;
        }
    }
}
