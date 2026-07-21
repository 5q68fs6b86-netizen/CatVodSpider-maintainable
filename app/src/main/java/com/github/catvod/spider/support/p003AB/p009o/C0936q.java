package com.github.catvod.spider.support.p003AB.p009o;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0831O;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0837d;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0838e;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0839f;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0840g;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import com.github.catvod.spider.support.p128m.C2269l;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0936q {
    public static int currentPlatformType;

    /* JADX INFO: renamed from: a */
    private final Activity f2206a;

    /* JADX INFO: renamed from: d */
    private ArrayAdapter<String> f2209d;

    /* JADX INFO: renamed from: f */
    private AlertDialog f2211f;

    /* JADX INFO: renamed from: g */
    private ListView f2212g;

    /* JADX INFO: renamed from: h */
    private TextView f2213h;

    /* JADX INFO: renamed from: b */
    private List<String> f2207b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<String> f2208c = new ArrayList();

    /* JADX INFO: renamed from: e */
    private int f2210e = 0;

    /* JADX INFO: renamed from: i */
    private List<Button> f2214i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private final String[] f2215j = {"腾讯", "爱奇艺", "优酷", "芒果", "哔哩", "人人", "韩剧", "西瓜", "乐视", "埋堆堆"};

    /* JADX INFO: renamed from: k */
    private final ExecutorService f2216k = Executors.newSingleThreadExecutor();

    public C0936q(Activity activity) {
        this.f2206a = activity;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2249a(C0936q c0936q) {
        c0936q.getClass();
        c0936q.m2269t(true, true);
        c0936q.m2270v();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2251c(final C0936q c0936q, final String str, int i) {
        String str2;
        c0936q.getClass();
        if (i < 0 || i >= c0936q.f2207b.size()) {
            return;
        }
        final String str3 = (String) c0936q.f2207b.get(i);
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        Iterator it = c0936q.f2208c.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            str2 = (String) it.next();
            if (str2 != null && str2.startsWith(str3)) {
                break;
            }
        }
        if (str2 != null) {
            str3 = str2;
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        final String[] strArrSplit = str3.split("\\|");
        boolean z = str3.contains("http");
        if (str3.contains("vodid")) {
            z = true;
        }
        if (!z) {
            new Thread(new Runnable(c0936q, strArrSplit, str3) { // from class: com.github.catvod.spider.support.p003AB.p009o.o

                /* JADX INFO: renamed from: a */
                public final C0936q f2202a;

                /* JADX INFO: renamed from: b */
                public final String[] f2203b;

                /* JADX INFO: renamed from: c */
                public final String f2204c;

                {
                    this.f2202a = c0936q;
                    this.f2203b = strArrSplit;
                    this.f2204c = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    List<String> listJuhe;
                    C0936q c0936q2 = this.f2202a;
                    String[] strArr = this.f2203b;
                    String str4 = this.f2204c;
                    c0936q2.getClass();
                    String str5 = strArr[0];
                    if ("腾讯".equals(str5) || "优酷".equals(str5) || "芒果".equals(str5) || "爱奇艺".equals(str5) || "哔哩".equals(str5) || "人人".equals(str5) || "韩剧".equals(str5) || "西瓜".equals(str5) || "乐视".equals(str5) || "埋堆堆".equals(str5)) {
                        try {
                            listJuhe = C0901K.juhe(str4);
                        } catch (Exception e) {
                            e.printStackTrace();
                            Init.run(new RunnableC0839f(c0936q2, 4));
                            return;
                        }
                    } else {
                        listJuhe = Collections.emptyList();
                    }
                    if (listJuhe == null || listJuhe.isEmpty()) {
                        Init.run(new RunnableC0838e(c0936q2, 3));
                    } else {
                        Init.run(new RunnableC0840g(c0936q2, listJuhe, 2));
                    }
                }
            }).start();
            return;
        }
        SpiderDebug.log("选中:" + strArrSplit[1]);
        new Thread(new Runnable(c0936q, str, strArrSplit) { // from class: com.github.catvod.spider.support.p003AB.p009o.n

            /* JADX INFO: renamed from: a */
            public final C0936q f2199a;

            /* JADX INFO: renamed from: b */
            public final String f2200b;

            /* JADX INFO: renamed from: c */
            public final String[] f2201c;

            {
                this.f2199a = c0936q;
                this.f2200b = str;
                this.f2201c = strArrSplit;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0936q.m2262n(this.f2199a, this.f2200b, this.f2201c);
            }
        }).start();
        c0936q.f2211f.dismiss();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2252d(C0936q c0936q, List list, Runnable runnable) {
        String str;
        int i = currentPlatformType;
        if (i == 1) {
            str = "爱奇艺";
        } else if (i == 2) {
            str = "优酷";
        } else if (i == 3) {
            str = "芒果";
        } else if (i == 4) {
            str = "哔哩";
        } else if (i == 5) {
            str = "人人";
        } else if (i == 6) {
            str = "韩剧";
        } else if (i == 7) {
            str = "西瓜";
        } else if (i != 8) {
            str = i != 9 ? "腾讯" : "埋堆堆";
        } else {
            str = "乐视";
        }
        if (list != null && !list.isEmpty()) {
            boolean z = false;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 != null && str2.contains(str)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return;
            }
        }
        c0936q.f2207b.clear();
        if (list != null && !list.isEmpty()) {
            c0936q.f2207b.addAll(list);
        }
        c0936q.f2209d.notifyDataSetChanged();
        c0936q.m2270v();
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2253e(C0936q c0936q, EditText editText) {
        c0936q.getClass();
        String strTrim = editText.getText().toString().trim();
        if (!TextUtils.isEmpty(strTrim)) {
            C2269l.m6176a("searchvodname", strTrim);
        }
        int i = 0;
        if (TextUtils.isEmpty(strTrim)) {
            Toast.makeText(c0936q.f2206a, "请输入关键词", 0).show();
            return;
        }
        c0936q.m2268s(editText);
        c0936q.m2269t(true, true);
        c0936q.m2265q(strTrim, c0936q.f2210e, new RunnableC0930k(c0936q, i));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2254f(C0936q c0936q) {
        c0936q.getClass();
        c0936q.m2269t(true, true);
        c0936q.m2270v();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2256h(C0936q c0936q) {
        c0936q.getClass();
        c0936q.m2269t(true, true);
        c0936q.m2270v();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<android.widget.Button>] */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2257i(C0936q c0936q, int i, Button button, int i2, EditText editText, HorizontalScrollView horizontalScrollView) {
        if (c0936q.f2210e == i) {
            return;
        }
        c0936q.f2210e = i;
        for (Button button2 : c0936q.f2214i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            gradientDrawable.setCornerRadius(c0936q.m2266r(12));
            button2.setBackground(gradientDrawable);
            button2.setTextColor(-12303292);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-4464901);
        gradientDrawable2.setCornerRadius(c0936q.m2266r(12));
        button.setBackground(gradientDrawable2);
        button.setTextColor(-12303292);
        String strTrim = editText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            Toast.makeText(c0936q.f2206a, "请输入关键词", 0).show();
            return;
        }
        c0936q.m2268s(editText);
        c0936q.m2269t(true, true);
        c0936q.m2265q(strTrim, c0936q.f2210e, new RunnableC0837d(c0936q, 7));
        horizontalScrollView.smoothScrollTo(Math.max(button.getLeft() - ((horizontalScrollView.getWidth() - button.getWidth()) / 2), 0), 0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m2260l(C0936q c0936q, List list) {
        c0936q.f2207b.clear();
        c0936q.f2207b.addAll(list);
        c0936q.f2209d.notifyDataSetChanged();
        ListView listView = c0936q.f2212g;
        if (listView != null) {
            listView.setSelection(0);
        }
        c0936q.m2270v();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m2261m(C0936q c0936q) {
        Window window = c0936q.f2211f.getWindow();
        if (window != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            c0936q.f2206a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = c0936q.f2206a.getResources().getConfiguration().orientation == 2 ? (int) (((double) i) * 0.5d) : (int) (((double) i) * 0.97d);
            int iM2266r = c0936q.m2266r(309);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.y = 50;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(i2, iM2266r);
            window.setWindowAnimations(R.style.Theme.NoTitleBar);
            window.setDimAmount(0.5f);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m2262n(C0936q c0936q, String str, String[] strArr) {
        c0936q.getClass();
        int i = 1;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("searchKey", str);
            jSONObject.put("details", new JSONArray((Collection) c0936q.f2207b));
            C0897G.m2162c("danmukey", jSONObject.toString());
            C0869c.m2131k(String.format("%s/action?do=refresh&type=danmaku&path=%s", Proxy.getOriginUrl(), URLEncoder.encode(String.format("http://127.0.0.1:9978/proxy?do=danmu&site=js&url=%s", strArr.length > 1 ? strArr[1] : ""), "UTF-8")));
            String strM6177b = C2269l.m6177b("searchvodname");
            if (TextUtils.isEmpty(strM6177b)) {
                return;
            }
            String strM6177b2 = C2269l.m6177b("danmucache");
            if (TextUtils.isEmpty(strM6177b2)) {
                strM6177b2 = "{}";
            }
            JSONObject jSONObject2 = new JSONObject(strM6177b2);
            jSONObject2.put(str, strM6177b);
            if (jSONObject2.length() > 20) {
                Iterator<String> itKeys = jSONObject2.keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                JSONObject jSONObject3 = new JSONObject();
                for (int size = arrayList.size() - 20; size < arrayList.size(); size++) {
                    String str2 = (String) arrayList.get(size);
                    jSONObject3.put(str2, jSONObject2.getString(str2));
                }
                jSONObject2 = jSONObject3;
            }
            C2269l.m6176a("danmucache", jSONObject2.toString());
            C2269l.m6176a("searchvodname", "");
        } catch (Exception e) {
            e.printStackTrace();
            Init.run(new RunnableC0930k(c0936q, i));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m2263o(C0936q c0936q, int i, String str, Runnable runnable) {
        currentPlatformType = i;
        new Thread(new RunnableC0922cc(c0936q, i, str, runnable)).start();
    }

    /* JADX INFO: renamed from: q */
    private void m2265q(final String str, final int i, final Runnable runnable) {
        this.f2216k.submit(new Runnable(this, i, str, runnable) { // from class: com.github.catvod.spider.support.p003AB.p009o.m

            /* JADX INFO: renamed from: a */
            public final C0936q f2195a;

            /* JADX INFO: renamed from: b */
            public final int f2196b;

            /* JADX INFO: renamed from: c */
            public final String f2197c;

            /* JADX INFO: renamed from: d */
            public final Runnable f2198d;

            {
                this.f2195a = this;
                this.f2196b = i;
                this.f2197c = str;
                this.f2198d = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0936q.m2263o(this.f2195a, this.f2196b, this.f2197c, this.f2198d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public int m2266r(int i) {
        return Math.round(i * this.f2206a.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: s */
    private void m2268s(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f2206a.getSystemService("input_method");
        if (inputMethodManager == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<android.widget.Button>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<android.widget.Button>] */
    /* JADX INFO: renamed from: t */
    private void m2269t(boolean... zArr) {
        for (int i = 0; i < this.f2214i.size(); i++) {
            if (i < zArr.length) {
                ((Button) this.f2214i.get(i)).setEnabled(zArr[i]);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: v */
    private void m2270v() {
        Object r0 = this.f2207b;
        if (r0 != 0 && !r0.isEmpty()) {
            this.f2212g.setVisibility(0);
            this.f2213h.setVisibility(8);
        } else {
            this.f2212g.setVisibility(8);
            this.f2213h.setVisibility(0);
            this.f2213h.setText("未搜索到影视信息...");
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: u */
    public final void m2271u(final String str) {
        char c;
        int iM2266r = m2266r(12);
        int color = Color.parseColor("#000000");
        LinearLayout linearLayout = new LinearLayout(this.f2206a);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(iM2266r, iM2266r, iM2266r, iM2266r);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadii(new float[]{m2266r(12), m2266r(12), m2266r(12), m2266r(12), 0.0f, 0.0f, 0.0f, 0.0f});
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(this.f2206a);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(this.f2206a);
        int i = 0;
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.addView(linearLayout3);
        final EditText editText = new EditText(this.f2206a);
        editText.setHint("请输入关键词");
        editText.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        editText.setSingleLine(true);
        editText.setImeOptions(3);
        if (!TextUtils.isEmpty(str)) {
            editText.setText(str);
            editText.setSelection(str.length());
        }
        editText.setTextColor(color);
        Button button = new Button(this.f2206a);
        button.setText("弹幕搜索");
        button.setTextColor(-12303292);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-4464901);
        gradientDrawable2.setCornerRadius(m2266r(12));
        button.setBackground(gradientDrawable2);
        int iM2266r2 = m2266r(4);
        button.setPadding(iM2266r2, iM2266r2, iM2266r2, iM2266r2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, m2266r(-2));
        layoutParams.leftMargin = m2266r(8);
        button.setLayoutParams(layoutParams);
        linearLayout3.addView(editText);
        linearLayout3.addView(button);
        button.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.github.catvod.spider.support.p003AB.p009o.q.2

            /* JADX INFO: renamed from: a */
            final C0936q f2218a;

            {
                this.f2218a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                TextView textView = (TextView) view;
                if (z) {
                    textView.setTextColor(-1);
                } else {
                    textView.setTextColor(-12303292);
                }
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(this.f2218a.m2266r(12));
                gradientDrawable3.setColor(z ? -14575885 : -4464901);
                view.setBackground(gradientDrawable3);
            }
        });
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.f2206a);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        int iM2266r3 = m2266r(40);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iM2266r3);
        int iM2266r4 = m2266r(5);
        layoutParams2.topMargin = iM2266r4;
        layoutParams2.bottomMargin = iM2266r4;
        horizontalScrollView.setLayoutParams(layoutParams2);
        linearLayout2.addView(horizontalScrollView);
        LinearLayout linearLayout4 = new LinearLayout(this.f2206a);
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(iM2266r3, iM2266r3));
        horizontalScrollView.addView(linearLayout4);
        int iM2266r5 = m2266r(-12303292);
        int iM2266r6 = m2266r(8);
        int i2 = 0;
        while (true) {
            String[] strArr = this.f2215j;
            if (i2 >= strArr.length) {
                break;
            }
            String str2 = strArr[i2];
            final Button button2 = new Button(this.f2206a);
            button2.setText(str2);
            button2.setBackgroundColor(i);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            if (i2 == 0) {
                gradientDrawable3.setColor(-4464901);
                c = 20;
            } else {
                c = 20;
                gradientDrawable3.setColor(i);
            }
            gradientDrawable3.setCornerRadius(m2266r(12));
            button2.setBackground(gradientDrawable3);
            button2.setTextColor(-12303292);
            button2.setAllCaps(true);
            button2.setPadding(iM2266r5, iM2266r6, iM2266r5, iM2266r6);
            button2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            LinearLayout linearLayout5 = linearLayout4;
            final HorizontalScrollView horizontalScrollView2 = horizontalScrollView;
            final int i3 = i2;
            final int i4 = color;
            button2.setOnClickListener(new View.OnClickListener(this, i3, button2, i4, editText, horizontalScrollView2) { // from class: com.github.catvod.spider.support.p003AB.p009o.g

                /* JADX INFO: renamed from: a */
                public final C0936q f2178a;

                /* JADX INFO: renamed from: b */
                public final int f2179b;

                /* JADX INFO: renamed from: c */
                public final Button f2180c;

                /* JADX INFO: renamed from: d */
                public final int f2181d;

                /* JADX INFO: renamed from: e */
                public final EditText f2182e;

                /* JADX INFO: renamed from: f */
                public final HorizontalScrollView f2183f;

                {
                    this.f2178a = this;
                    this.f2179b = i3;
                    this.f2180c = button2;
                    this.f2181d = i4;
                    this.f2182e = editText;
                    this.f2183f = horizontalScrollView2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0936q.m2257i(this.f2178a, this.f2179b, this.f2180c, this.f2181d, this.f2182e, this.f2183f);
                }
            });
            button2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.github.catvod.spider.support.p003AB.p009o.q.1

                /* JADX INFO: renamed from: a */
                final C0936q f2217a;

                {
                    this.f2217a = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    TextView textView = (TextView) view;
                    if (z) {
                        textView.setTextColor(-1);
                    } else {
                        textView.setTextColor(-12303292);
                    }
                    GradientDrawable gradientDrawable4 = new GradientDrawable();
                    gradientDrawable4.setCornerRadius(this.f2217a.m2266r(12));
                    gradientDrawable4.setColor(z ? -14575885 : 0);
                    view.setBackground(gradientDrawable4);
                }
            });
            linearLayout5.addView(button2);
            this.f2214i.add(button2);
            i2++;
            linearLayout4 = linearLayout5;
            button = button;
            iM2266r5 = iM2266r5;
            horizontalScrollView = horizontalScrollView2;
            iM2266r6 = iM2266r6;
            color = color;
            i = 0;
        }
        final Button button3 = button;
        m2266r(-1);
        TextView textView = new TextView(this.f2206a);
        this.f2213h = textView;
        textView.setText("未搜索到影视信息...");
        this.f2213h.setTextColor(-7829368);
        this.f2213h.setGravity(17);
        this.f2213h.setLayoutParams(new LinearLayout.LayoutParams(-1, 800));
        this.f2213h.setVisibility(8);
        linearLayout2.addView(this.f2213h);
        ListView listView = new ListView(this.f2206a);
        this.f2212g = listView;
        listView.setLayoutParams(new LinearLayout.LayoutParams(-1, 800));
        this.f2212g.setDivider(null);
        this.f2212g.setDividerHeight(0);
        this.f2212g.setVisibility(8);
        linearLayout2.addView(this.f2212g);
        C0935p c0935p = new C0935p(this, this.f2206a, this.f2207b);
        this.f2209d = c0935p;
        this.f2212g.setAdapter((ListAdapter) c0935p);
        this.f2211f = new AlertDialog.Builder(this.f2206a).setView(linearLayout).create();
        Window window = this.f2211f.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setShape(0);
            gradientDrawable4.setColor(0);
            gradientDrawable4.setCornerRadius(m2266r(0));
            window.setBackgroundDrawable(gradientDrawable4);
        }
        button3.setOnClickListener(new View.OnClickListener(this, editText) { // from class: com.github.catvod.spider.support.p003AB.p009o.h

            /* JADX INFO: renamed from: a */
            public final C0936q f2184a;

            /* JADX INFO: renamed from: b */
            public final EditText f2185b;

            {
                this.f2184a = this;
                this.f2185b = editText;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0936q.m2253e(this.f2184a, this.f2185b);
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener(button3) { // from class: com.github.catvod.spider.support.p003AB.p009o.j

            /* JADX INFO: renamed from: a */
            public final Button f2188a;

            {
                this.f2188a = button3;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i5, KeyEvent keyEvent) {
                Button button4 = this.f2188a;
                if (i5 != 3) {
                    return false;
                }
                button4.performClick();
                return true;
            }
        });
        this.f2212g.setOnItemClickListener(new AdapterView.OnItemClickListener(this, str) { // from class: com.github.catvod.spider.support.p003AB.p009o.i

            /* JADX INFO: renamed from: a */
            public final C0936q f2186a;

            /* JADX INFO: renamed from: b */
            public final String f2187b;

            {
                this.f2186a = this;
                this.f2187b = str;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i5, long j) {
                C0936q.m2251c(this.f2186a, this.f2187b, i5);
            }
        });
        this.f2211f.show();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m2269t(true, true);
        m2265q(str, this.f2210e, new RunnableC0831O(this, 3));
    }
}
