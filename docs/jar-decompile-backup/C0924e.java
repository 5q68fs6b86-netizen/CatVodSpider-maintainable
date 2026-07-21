package com.github.catvod.spider.support.p003AB.p009o;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0837d;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0839f;
import com.github.catvod.spider.support.p128m.C2256I;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0924e {

    /* JADX INFO: renamed from: a */
    protected Activity f2170a;

    /* JADX INFO: renamed from: b */
    protected boolean f2171b = false;

    /* JADX INFO: renamed from: c */
    protected ViewTreeObserver.OnGlobalLayoutListener f2172c;

    /* JADX INFO: renamed from: d */
    protected View f2173d;

    /* JADX INFO: renamed from: e */
    private ImageView f2174e;

    /* JADX INFO: renamed from: f */
    private ViewGroup f2175f;

    /* JADX INFO: renamed from: g */
    private String f2176g;

    public C0924e(Activity activity) {
        try {
            this.f2170a = activity;
            String strM2246g = m2246g(activity);
            this.f2176g = strM2246g;
            if (strM2246g.contains("ok")) {
                if (this.f2176g.contains("mobile")) {
                    View viewM2245f = m2245f(activity, "danmuSetting");
                    if (viewM2245f != null) {
                        this.f2175f = (ViewGroup) viewM2245f.getParent();
                    } else {
                        View viewM2245f2 = m2245f(activity, "danmaku");
                        if (viewM2245f2 != null) {
                            this.f2175f = (ViewGroup) viewM2245f2.getParent();
                        } else {
                            this.f2174e = (ImageView) m2245f(activity, "icon_lock");
                        }
                    }
                } else {
                    View viewM2245f3 = m2245f(activity, "danmu");
                    if (viewM2245f3 != null) {
                        this.f2175f = (ViewGroup) viewM2245f3.getParent();
                    } else {
                        this.f2174e = (ImageView) m2245f(activity, "icon_lock");
                    }
                }
            } else if (this.f2176g.contains("tvbox")) {
                if (this.f2176g.contains("mobile")) {
                    View viewM2245f4 = m2245f(activity, "danmu");
                    if (viewM2245f4 != null) {
                        this.f2175f = (ViewGroup) viewM2245f4.getParent();
                    } else {
                        this.f2174e = (ImageView) m2245f(activity, "icon_lock");
                    }
                } else {
                    this.f2175f = (ViewGroup) ((TextView) m2245f(activity, "play_next")).getParent();
                }
            }
            View view = this.f2174e;
            if (view == null) {
                view = this.f2175f;
            }
            this.f2173d = view;
        } catch (Exception e) {
            SpiderDebug.log("ButtonMonitor 初始化失败: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2241a(C0924e c0924e) {
        View view;
        View view2 = c0924e.f2174e;
        if (view2 == null) {
            view2 = c0924e.f2175f;
        }
        if (view2 != null && view2.getVisibility() == 0) {
            View view3 = c0924e.f2174e;
            if (view3 == null) {
                view3 = c0924e.f2175f;
            }
            view3.post(new RunnableC0839f(c0924e, 3));
            if (c0924e.f2171b) {
                try {
                    if (c0924e.f2172c != null && (view = c0924e.f2173d) != null) {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(c0924e.f2172c);
                        c0924e.f2172c = null;
                    }
                    c0924e.f2173d = null;
                    c0924e.f2171b = false;
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX INFO: renamed from: b */
    public static void m2242b(C0924e c0924e) {
        String string;
        c0924e.getClass();
        C0936q c0936q = new C0936q(Init.getActivity());
        if (c0924e.m2248h()) {
            string = "";
        } else {
            Activity activity = c0924e.f2170a;
            if (c0924e.f2176g.equals("tvbox_mobile")) {
                TextView textView = (TextView) c0924e.m2245f(activity, "vodName");
                if (textView != null) {
                    string = textView.getText().toString();
                } else {
                    string = "";
                }
            } else {
                TextView textView2 = (TextView) c0924e.m2245f(activity, "name");
                if (textView2 == null) {
                    textView2 = (TextView) c0924e.m2245f(c0924e.f2170a, "tvName");
                }
                if (textView2 != null) {
                    string = textView2.getText().toString();
                } else {
                    string = "";
                }
            }
        }
        c0936q.m2271u(string);
        C2256I.m6113i("弹幕搜索中…");
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, android.widget.TextView] */
    /* JADX INFO: renamed from: c */
    public static void m2243c(final C0924e c0924e) {
        Pair pair;
        ImageView imageView = c0924e.f2174e;
        View view = null;
        ImageView imageView2 = null;
        if (imageView != null) {
            ViewGroup viewGroup = (ViewGroup) imageView.getParent();
            if (viewGroup != null && viewGroup.findViewWithTag("aw_danmu_search_button") == null) {
                ImageView imageView3 = c0924e.f2174e;
                if (!c0924e.m2248h()) {
                    imageView2 = new ImageView(c0924e.f2170a);
                    try {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        int i = (int) ((8 * c0924e.f2170a.getResources().getDisplayMetrics().density) + 0.5f);
                        layoutParams.setMargins(i, 0, 0, 0);
                        imageView2.setLayoutParams(layoutParams);
                        imageView2.setPadding(imageView3.getPaddingLeft(), imageView3.getPaddingTop(), imageView3.getPaddingRight(), imageView3.getPaddingBottom());
                        imageView2.setFocusable(imageView3.isFocusable());
                        imageView2.setFocusableInTouchMode(imageView3.isFocusableInTouchMode());
                        imageView2.setClickable(imageView3.isClickable());
                        Drawable background = imageView3.getBackground();
                        if (background != null) {
                            imageView2.setBackground(background.getConstantState().newDrawable());
                        }
                        imageView2.setScaleType(imageView3.getScaleType());
                        imageView2.setImageDrawable(m2244d(c0924e.f2170a, imageView3.getHeight() - (i * 2)));
                        imageView2.setOnClickListener(new View.OnClickListener(c0924e) { // from class: com.github.catvod.spider.support.p003AB.p009o.b

                            /* JADX INFO: renamed from: a */
                            public final C0924e f2159a;

                            {
                                this.f2159a = c0924e;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                C0924e c0924e2 = this.f2159a;
                                c0924e2.getClass();
                                Init.run(new RunnableC0837d(c0924e2, 6));
                            }
                        });
                        imageView2.setTag("aw_danmu_search_button");
                    } catch (Exception unused) {
                    }
                }
                if (imageView2 != null) {
                    viewGroup.addView(imageView2);
                    return;
                }
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = c0924e.f2175f;
        if (viewGroup2 == null || viewGroup2.findViewWithTag("aw_danmu_search_button") != null) {
            return;
        }
        ViewGroup viewGroup3 = c0924e.f2175f;
        if (viewGroup3 == null) {
            pair = null;
        } else {
            int childCount = viewGroup3.getChildCount();
            Pair pair2 = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup3.getChildAt(i2);
                if ((childAt instanceof TextView) && ((TextView) childAt).getText().toString().contains("弹幕")) {
                    pair2 = new Pair(childAt, Integer.valueOf(i2 + 1));
                    break;
                }
            }
            pair = pair2 != null ? pair2 : new Pair(viewGroup3.getChildAt(0), Integer.valueOf(childCount));
        }
        Object r4 = (View) pair.first;
        if (!c0924e.m2248h()) {
            String str = c0924e.f2176g;
            if (str.contains("tvbox") || !str.contains("mobile") || isTVVersionApk(c0924e.f2170a)) {
                TextView textView = new TextView(c0924e.f2170a);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) r4.getLayoutParams();
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                layoutParams3.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                textView.setLayoutParams(layoutParams3);
                textView.setPadding(r4.getPaddingLeft(), r4.getPaddingTop(), r4.getPaddingRight(), r4.getPaddingBottom());
                textView.setFocusable(r4.isFocusable());
                textView.setFocusableInTouchMode(r4.isFocusableInTouchMode());
                textView.setClickable(r4.isClickable());
                if (r4 instanceof TextView) {
                    textView.setTextColor(((TextView) r4).getTextColors());
                    textView.setTextSize(2, r4.getTextSize() / r4.getResources().getDisplayMetrics().scaledDensity);
                }
                Drawable background2 = r4.getBackground();
                if (background2 != null) {
                    textView.setBackground(background2.getConstantState().newDrawable());
                }
                textView.setOnClickListener(new View.OnClickListener(c0924e) { // from class: com.github.catvod.spider.support.p003AB.p009o.c

                    /* JADX INFO: renamed from: a */
                    public final C0924e f2161a;

                    {
                        this.f2161a = c0924e;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C0924e c0924e2 = this.f2161a;
                        c0924e2.getClass();
                        Init.run(new RunnableC0837d(c0924e2, 6));
                    }
                });
                textView.setText("弹幕搜索");
                textView.setTag("aw_danmu_search_button");
                view = textView;
            } else {
                ImageView imageView4 = new ImageView(c0924e.f2170a);
                imageView4.setLayoutParams(r4.getLayoutParams());
                imageView4.setPadding(r4.getPaddingLeft(), r4.getPaddingTop(), r4.getPaddingRight(), r4.getPaddingBottom());
                imageView4.setFocusable(r4.isFocusable());
                imageView4.setFocusableInTouchMode(r4.isFocusableInTouchMode());
                imageView4.setClickable(r4.isClickable());
                Drawable background3 = r4.getBackground();
                if (background3 != null) {
                    imageView4.setBackground(background3.getConstantState().newDrawable());
                }
                if (r4 instanceof ImageView) {
                    imageView4.setScaleType(((ImageView) r4).getScaleType());
                }
                imageView4.setImageDrawable(m2244d(c0924e.f2170a, (int) ((c0924e.f2170a.getResources().getDisplayMetrics().density * 20.0f) + 0.5f)));
                imageView4.setOnClickListener(new View.OnClickListener(c0924e) { // from class: com.github.catvod.spider.support.p003AB.p009o.c

                    /* JADX INFO: renamed from: a */
                    public final C0924e f2161a;

                    {
                        this.f2161a = c0924e;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C0924e c0924e2 = this.f2161a;
                        c0924e2.getClass();
                        Init.run(new RunnableC0837d(c0924e2, 6));
                    }
                });
                imageView4.setTag("aw_danmu_search_button");
                view = imageView4;
            }
        }
        if (view != null) {
            c0924e.f2175f.addView(view, ((Integer) pair.second).intValue());
        }
    }

    public static int compareVersion(String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        for (int i = 0; i < Math.min(strArrSplit.length, strArrSplit2.length); i++) {
            int i2 = Integer.parseInt(strArrSplit[i]);
            int i3 = Integer.parseInt(strArrSplit2[i]);
            if (i2 != i3) {
                return i2 - i3;
            }
        }
        int length = strArrSplit.length - strArrSplit2.length;
        if (length != 0) {
            return length;
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static BitmapDrawable m2244d(Context context, int i) {
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 24.0f) + 0.5f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        float f = i2 / 24.0f;
        Path path = new Path();
        float f2 = f * 14.0f;
        path.moveTo(15.5f * f, f2);
        path.rLineTo((-0.79f) * f, 0.0f);
        path.rLineTo((-0.28f) * f, (-0.27f) * f);
        float f3 = f * 15.41f;
        float f4 = f * 12.59f;
        float f5 = f * 16.0f;
        float f6 = f * 11.11f;
        float f7 = f * 9.5f;
        path.cubicTo(f3, f4, f5, f6, f5, f7);
        float f8 = f * 5.91f;
        float f9 = f * 13.09f;
        float f10 = f * 3.0f;
        path.cubicTo(f5, f8, f9, f10, f7, f10);
        path.cubicTo(f8, f10, f10, f8, f10, f7);
        path.cubicTo(f10, f9, f8, f5, f7, f5);
        path.cubicTo(f6, f5, f4, f3, f * 13.73f, f * 14.43f);
        path.rLineTo(0.27f * f, 0.28f * f);
        path.rLineTo(0.0f, 0.79f * f);
        float f11 = f * 5.0f;
        path.rLineTo(f11, 4.99f * f);
        path.lineTo(20.49f * f, 19.0f * f);
        path.rLineTo((-4.99f) * f, (-5.0f) * f);
        path.close();
        path.moveTo(f7, f2);
        float f12 = f * 7.01f;
        float f13 = f * 11.99f;
        path.cubicTo(f12, f2, f11, f13, f11, f7);
        path.cubicTo(f11, f12, f12, f11, f7, f11);
        path.cubicTo(f13, f11, f2, f12, f2, f7);
        path.cubicTo(f2, f13, f13, f2, f7, f2);
        path.close();
        path.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path, paint);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    /* JADX INFO: renamed from: f */
    private View m2245f(Activity activity, String str) {
        if (activity == null) {
            return null;
        }
        return activity.findViewById(activity.getResources().getIdentifier(str, "id", activity.getPackageName()));
    }

    /* JADX INFO: renamed from: g */
    private String m2246g(Activity activity) {
        String str;
        String packageName = activity.getPackageName();
        String lowerCase = activity.getClass().getSimpleName().toLowerCase();
        String string = activity.getApplicationInfo().loadLabel(activity.getPackageManager()).toString();
        if ((packageName.contains("com.fongmi.android.tv") || packageName.contains("com.layaboxhmhz.gamehmhz.okys")) && lowerCase.equals("videoactivity")) {
            if (string.equals("影视")) {
                String appVersion = getAppVersion(activity);
                str = (appVersion == null || appVersion.isEmpty() || compareVersion(appVersion, "5.4.0") < 0) ? "danmuSetting" : "danmaku";
            }
            if (m2245f(activity, str) != null) {
                return "ok_mobile";
            }
            if (m2245f(activity, "actionLayout") != null) {
                return "ok_tv";
            }
            return null;
        }
        if ((packageName.contains("com.huawei.himovceie") || packageName.contains("com.github")) && lowerCase.equals("detailactivity")) {
            return "tvbox_tv";
        }
        if (packageName.contains(".ysc") && lowerCase.equals("playactivity")) {
            return "tvbox_mobile";
        }
        return null;
    }

    public static String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isTVVersionApk(Activity activity) {
        try {
            return activity.getApplicationInfo().banner != 0;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    protected final void m2247e() {
        View view;
        ImageView imageView = this.f2174e;
        if (imageView != null) {
            ViewGroup viewGroup = (ViewGroup) imageView.getParent();
            if (viewGroup != null && viewGroup.findViewWithTag("aw_danmu_search_button") != null) {
                return;
            }
            this.f2172c = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: com.github.catvod.spider.support.p003AB.p009o.d

                /* JADX INFO: renamed from: a */
                public final C0924e f2169a;

                {
                    this.f2169a = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C0924e.m2241a(this.f2169a);
                }
            };
            view = this.f2174e;
        } else {
            ViewGroup viewGroup2 = this.f2175f;
            if (viewGroup2 == null || viewGroup2.findViewWithTag("aw_danmu_search_button") != null) {
                return;
            }
            this.f2172c = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: com.github.catvod.spider.support.p003AB.p009o.d

                /* JADX INFO: renamed from: a */
                public final C0924e f2169a;

                {
                    this.f2169a = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C0924e.m2241a(this.f2169a);
                }
            };
            view = this.f2175f;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f2172c);
    }

    /* JADX INFO: renamed from: h */
    protected final boolean m2248h() {
        Activity activity = this.f2170a;
        return activity == null || activity.isFinishing() || this.f2170a.isDestroyed();
    }
}
