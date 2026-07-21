package com.github.catvod.spider.support.p012C0.p035j;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.support.C0.j.a;
import com.github.catvod.spider.support.C0.j.b;
import com.github.catvod.spider.support.C0.j.c;
import com.github.catvod.spider.support.C0.j.d;
import com.github.catvod.spider.support.C0.j.e;
import com.github.catvod.spider.support.C0.j.f;
import com.github.catvod.spider.support.C0.j.g;
import com.github.catvod.spider.support.C0.j.h;
import com.github.catvod.spider.support.C0.j.i;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.j.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1243k {

    /* JADX INFO: renamed from: a */
    private static CookieManager f2924a = null;

    /* JADX INFO: renamed from: b */
    private static View f2925b = null;

    /* JADX INFO: renamed from: c */
    private static WebView f2926c = null;

    /* JADX INFO: renamed from: d */
    private static EditText f2927d = null;

    /* JADX INFO: renamed from: e */
    private static Activity f2928e = null;

    /* JADX INFO: renamed from: f */
    private static AlertDialog f2929f = null;

    /* JADX INFO: renamed from: g */
    private static Button f2930g = null;

    /* JADX INFO: renamed from: h */
    private static Button f2931h = null;

    /* JADX INFO: renamed from: i */
    public static String f2932i = "";

    /* JADX INFO: renamed from: j */
    private static int f2933j;

    /* JADX INFO: renamed from: k */
    private static long f2934k;

    /* JADX INFO: renamed from: l */
    private static long f2935l;

    /* JADX INFO: renamed from: m */
    private static boolean f2936m;

    /* JADX INFO: renamed from: n */
    private static boolean f2937n;

    /* JADX INFO: renamed from: o */
    private static FrameLayout f2938o;

    /* JADX INFO: renamed from: A */
    public static void m3071A(String str, String str2, String str3, InterfaceC1242j interfaceC1242j) {
        a bVar;
        try {
            Activity activity = Init.getActivity();
            f2928e = activity;
            if (activity.getWindowManager().getDefaultDisplay().getWidth() - f2928e.getWindowManager().getDefaultDisplay().getHeight() < 0) {
                f2937n = true;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(f2928e);
            if (f2932i.indexOf("验证码") >= 0) {
                builder.setTitle(str);
                builder.setView((LinearLayout) m3096y(f2928e, str2, str3));
                builder.setNegativeButton((CharSequence) "取消", (DialogInterface.OnClickListener) d.a);
                builder.setPositiveButton((CharSequence) "确定", (DialogInterface.OnClickListener) new c(str2, interfaceC1242j));
                bVar = new a(interfaceC1242j);
            } else {
                builder.setView((FrameLayout) m3096y(f2928e, str2, str3));
                bVar = new b(str2, interfaceC1242j);
            }
            builder.setOnCancelListener(bVar);
            AlertDialog alertDialogCreate = builder.create();
            f2929f = alertDialogCreate;
            alertDialogCreate.setOnDismissListener(e.a);
            f2929f.show();
            f2929f.setCanceledOnTouchOutside(false);
            f2929f.setCancelable(false);
            if (f2932i.indexOf("验证码") < 0) {
                f2929f.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                m3097z();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3073b(String str, InterfaceC1242j interfaceC1242j, DialogInterface dialogInterface) {
        String str2;
        f2924a.removeSessionCookie();
        f2924a.removeAllCookie();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().sync();
        } else {
            f2924a.flush();
        }
        String userAgentString = f2926c.getSettings().getUserAgentString();
        String cookie = f2924a.getCookie(str);
        if (cookie == null || cookie.length() <= 1) {
            str2 = "";
        } else {
            String strReplaceAll = (cookie + ";").replaceAll("mac_history_mxpro=[^;]+?;", "");
            if (strReplaceAll.endsWith(";")) {
                strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() - 1);
            }
            str2 = userAgentString + "#" + strReplaceAll + "$$$";
        }
        if (interfaceC1242j != null) {
            EditText editText = f2927d;
            interfaceC1242j.vertifyCode(str2 + ((editText == null || editText.length() <= 1) ? "1" : f2927d.getText().toString()));
        }
        m3095x();
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3074c(InterfaceC1242j interfaceC1242j, DialogInterface dialogInterface) {
        if (interfaceC1242j != null) {
            interfaceC1242j.vertifyCode("0");
        }
        m3095x();
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3075d(String str, InterfaceC1242j interfaceC1242j, DialogInterface dialogInterface) {
        String str2;
        f2924a.removeSessionCookie();
        f2924a.removeAllCookie();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().sync();
        } else {
            f2924a.flush();
        }
        String userAgentString = f2926c.getSettings().getUserAgentString();
        String cookie = f2924a.getCookie(str);
        if (cookie == null || cookie.length() <= 1) {
            str2 = "";
        } else {
            String strReplaceAll = (cookie + ";").replaceAll("mac_history_mxpro=[^;]+?;", "");
            if (strReplaceAll.endsWith(";")) {
                strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() - 1);
            }
            str2 = userAgentString + "#" + strReplaceAll + "$$$";
        }
        if (interfaceC1242j != null) {
            EditText editText = f2927d;
            interfaceC1242j.vertifyCode(str2 + ((editText == null || editText.length() <= 1) ? "1" : f2927d.getText().toString()));
        }
        m3095x();
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ int m3081j() {
        int i = f2933j;
        f2933j = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: x */
    private static void m3095x() {
        WebView webView = f2926c;
        if (webView != null) {
            webView.stopLoading();
            f2926c.clearHistory();
            f2926c.clearCache(true);
            f2926c.loadUrl("about:blank");
            f2926c.onPause();
            f2926c.removeAllViews();
            f2926c.destroy();
            f2926c.destroyDrawingCache();
        }
    }

    /* JADX INFO: renamed from: y */
    public static Object m3096y(Context context, String str, String str2) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        f2938o = new FrameLayout(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        if (f2932i.indexOf("验证码") >= 0) {
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setGravity(17);
        } else {
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setBackgroundColor(0);
            f2938o.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            f2938o.setBackgroundColor(0);
            f2938o.setVisibility(8);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout2.setDescendantFocusability(262144);
        }
        WebView webView = new WebView(context);
        f2926c = webView;
        webView.setWebChromeClient(new f());
        f2926c.setWebViewClient(new g());
        f2926c.setScrollBarStyle(0);
        f2926c.setFocusable(true);
        f2926c.setFocusableInTouchMode(true);
        f2926c.setEnabled(true);
        WebSettings settings = f2926c.getSettings();
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setBlockNetworkImage(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setTextZoom(66);
        f2926c.loadUrl(str);
        if (XBPQ.f285K.length() > 1) {
            settings.setUserAgentString(XBPQ.f285K);
        }
        CookieSyncManager.createInstance(context);
        CookieManager cookieManager = CookieManager.getInstance();
        f2924a = cookieManager;
        cookieManager.setAcceptCookie(true);
        f2924a.removeAllCookie();
        f2924a.removeSessionCookie();
        if (str2.length() > 0) {
            for (String str3 : str2.split(";")) {
                f2924a.setCookie(str, str3);
            }
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.getInstance().sync();
            } else {
                f2924a.flush();
            }
        }
        EditText editText = new EditText(context);
        f2927d = editText;
        editText.setHint(f2932i);
        f2927d.setHintTextColor(-12303292);
        f2927d.setTextColor(-16777216);
        f2927d.setFocusable(true);
        f2927d.setFocusableInTouchMode(true);
        if (f2932i.indexOf("验证码") >= 0) {
            linearLayout.addView(f2926c);
            linearLayout.addView(f2927d);
            f2927d.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            f2926c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            return linearLayout;
        }
        linearLayout.setVisibility(8);
        Display defaultDisplay = f2928e.getWindowManager().getDefaultDisplay();
        WebView webView2 = f2926c;
        double width = defaultDisplay.getWidth();
        Double.isNaN(width);
        int i = (int) (width * 0.75d);
        double height = defaultDisplay.getHeight();
        Double.isNaN(height);
        webView2.setLayoutParams(new FrameLayout.LayoutParams(i, (int) (height * 0.9d)));
        Button button = new Button(context, null, 0);
        f2930g = button;
        button.setPadding(20, 20, 0, 0);
        f2930g.setEnabled(true);
        f2930g.setFocusable(true);
        f2930g.setFocusableInTouchMode(true);
        f2930g.setText("■");
        f2930g.setTextColor(-3355444);
        f2930g.setShadowLayer(5.0f, 5.0f, 5.0f, -7829368);
        f2930g.setLayoutParams(new FrameLayout.LayoutParams(C1247o.m3111a(30), C1247o.m3111a(30)));
        f2930g.setOnClickListener(new h());
        Button button2 = new Button(context, null, 0);
        f2931h = button2;
        button2.setPadding(30, 20, 0, 0);
        f2931h.setEnabled(true);
        f2931h.setFocusable(true);
        f2931h.setFocusableInTouchMode(true);
        f2931h.setText("☒");
        f2931h.setTextColor(-3355444);
        f2931h.setShadowLayer(4.0f, 4.0f, 4.0f, -7829368);
        f2931h.setLayoutParams(new FrameLayout.LayoutParams(C1247o.m3111a(30), C1247o.m3111a(30)));
        f2931h.setOnClickListener(new i());
        linearLayout2.addView(f2931h);
        linearLayout2.addView(f2930g);
        frameLayout.addView(f2927d);
        frameLayout.addView(f2938o);
        frameLayout.addView(f2926c);
        frameLayout.addView(linearLayout2);
        f2926c.requestFocus();
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(f2926c, 2);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static void m3097z() {
        Display defaultDisplay = f2928e.getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = f2929f.getWindow().getAttributes();
        double width = defaultDisplay.getWidth();
        Double.isNaN(width);
        Double.isNaN(width);
        attributes.width = (int) (width * 0.75d);
        double height = defaultDisplay.getHeight();
        Double.isNaN(height);
        Double.isNaN(height);
        attributes.height = (int) (height * 0.9d);
        f2929f.getWindow().setAttributes(attributes);
    }
}
