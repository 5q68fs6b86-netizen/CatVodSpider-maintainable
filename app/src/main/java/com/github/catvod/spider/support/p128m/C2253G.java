package com.github.catvod.spider.support.p128m;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.AmuBiliV2;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0078B;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0079C;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0080D;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0081X;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0088b;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0090c;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0091d;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0092e;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0093f;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0094g;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0095h;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0096i;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0097j;
import com.github.catvod.spider.support.p001A.DialogInterfaceOnClickListenerC0098k;
import com.github.catvod.spider.support.p117b.C2144B;
import com.github.catvod.spider.support.p117b.C2145G;
import com.github.catvod.spider.support.p117b.C2156X;
import com.github.catvod.spider.support.p117b.C2175i;
import com.github.catvod.spider.support.p117b.C2176j;
import com.github.catvod.spider.support.p117b.C2178l;
import com.github.catvod.spider.support.p117b.C2179m;
import com.github.catvod.spider.support.p117b.C2187w;
import com.github.catvod.spider.support.p117b.RunnableC2170d;
import com.github.catvod.spider.support.p117b.RunnableC2184r;
import com.github.catvod.spider.support.p119d.C2200d;
import com.github.catvod.spider.support.p121f.C2213b;
import com.github.catvod.spider.support.p121f.C2216e;
import com.github.catvod.spider.support.p126k.C2238b;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2253G {
    public static AlertDialog currentDialog;
    static int lastFocusPosition;
    static int lastFocusViewId;
    static ListView listView;
    static boolean needRestoreFocus;
    public static int restoreRetryCount;

    /* JADX INFO: renamed from: a */
    private AlertDialog f5623a;

    /* JADX INFO: renamed from: b */
    private String f5624b;

    /* JADX INFO: renamed from: c */
    private ScheduledExecutorService f5625c;

    /* JADX INFO: renamed from: d */
    private boolean f5626d;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string = ((TextView) view).getText().toString();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            intent.addFlags(268435456);
            Init.context().startActivity(intent);
            Application applicationContext = Init.context();
            ((ClipboardManager) applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("URL", string));
            Toast.makeText(applicationContext, "链接已复制并打开", 0).show();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$8, reason: invalid class name */
    /* synthetic */ class AnonymousClass8 implements View.OnClickListener {
        AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2253G.this.dismissAlertDialog();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$ArrowAdapter */
    class ArrowAdapter extends ArrayAdapter {
        public final ArrayList<String> items;

        ArrowAdapter(Context context, int i, ArrayList arrayList) {
            super(context, i, arrayList);
            this.items = arrayList;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            TextView textView;
            RelativeLayout relativeLayout = view == null ? new RelativeLayout(viewGroup.getContext()) : (RelativeLayout) view;
            relativeLayout.setFocusable(false);
            relativeLayout.setDescendantFocusability(262144);
            if (relativeLayout.getChildCount() == 0) {
                textView = new TextView(viewGroup.getContext());
                textView.setId(R.id.text1);
                textView.setTypeface(Typeface.create("monospace", 0));
                textView.setGravity(17);
                textView.setTextSize(16.0f);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(15);
                textView.setLayoutParams(layoutParams);
                TextView textView2 = new TextView(viewGroup.getContext());
                textView2.setId(1);
                textView2.setText("▲");
                textView2.setTextSize(18.0f);
                textView2.setFocusable(true);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(11);
                layoutParams2.addRule(15);
                layoutParams2.rightMargin = (int) (50.0f * viewGroup.getContext().getResources().getDisplayMetrics().density);
                textView2.setLayoutParams(layoutParams2);
                TextView textView3 = new TextView(viewGroup.getContext());
                textView3.setId(2);
                textView3.setText("▼");
                textView3.setTextSize(18.0f);
                textView3.setFocusable(true);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(11);
                layoutParams3.addRule(15);
                layoutParams3.rightMargin = (int) (15.0f * viewGroup.getContext().getResources().getDisplayMetrics().density);
                textView3.setLayoutParams(layoutParams3);
                relativeLayout.addView(textView);
                relativeLayout.addView(textView2);
                relativeLayout.addView(textView3);
                relativeLayout.setLayoutParams(new AbsListView.LayoutParams(-1, (int) (40.0f * relativeLayout.getContext().getResources().getDisplayMetrics().density)));
            } else {
                textView = (TextView) relativeLayout.findViewById(R.id.text1);
            }
            textView.setText(this.items.get(i));
            TextView textView4 = (TextView) relativeLayout.findViewById(1);
            final boolean z = true;
            textView4.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.ArrowAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int size = ArrowAdapter.this.items.size();
                    int i2 = i;
                    if (z) {
                        if (i2 > 0) {
                            String str = ArrowAdapter.this.items.get(i2 - 1);
                            ArrowAdapter.this.items.set(i2 - 1, ArrowAdapter.this.items.get(i2));
                            ArrowAdapter.this.items.set(i2, str);
                            C2253G.lastFocusPosition = i2 - 1;
                            C2253G.lastFocusViewId = 1;
                            C2253G.needRestoreFocus = true;
                            C2253G.restoreRetryCount = 0;
                            ArrowAdapter.this.notifyDataSetChanged();
                            ListView listView = C2253G.listView;
                            if (listView != null) {
                                listView.post(new FocusRestorer());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i2 < size - 1) {
                        String str2 = ArrowAdapter.this.items.get(i2 + 1);
                        ArrowAdapter.this.items.set(i2 + 1, ArrowAdapter.this.items.get(i2));
                        ArrowAdapter.this.items.set(i2, str2);
                        C2253G.lastFocusPosition = i2 + 1;
                        C2253G.lastFocusViewId = 2;
                        C2253G.needRestoreFocus = true;
                        C2253G.restoreRetryCount = 0;
                        ArrowAdapter.this.notifyDataSetChanged();
                        ListView listView2 = C2253G.listView;
                        if (listView2 != null) {
                            listView2.post(new FocusRestorer());
                        }
                    }
                }
            });
            textView4.setOnFocusChangeListener(new View.OnFocusChangeListener(textView4) { // from class: com.github.catvod.spider.support.p128m.G.ArrowAdapter.2
                private int originalColor;
                final /* synthetic */ TextView val$textView;

                {
                    this.val$textView = textView4;
                    this.originalColor = textView4.getCurrentTextColor();
                }

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view2, boolean z2) {
                    TextView textView5 = this.val$textView;
                    if (z2) {
                        textView5.setTextColor(-16776961);
                    } else {
                        textView5.setTextColor(this.originalColor);
                    }
                }
            });
            final int i2 = 1;
            textView4.setOnKeyListener(new View.OnKeyListener() { // from class: com.github.catvod.spider.support.p128m.G.ArrowAdapter.3
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view2, int i3, KeyEvent keyEvent) {
                    View viewFindViewById;
                    View viewFindViewById2;
                    Button button;
                    View childAt;
                    View viewFindViewById3;
                    int i4;
                    int firstVisiblePosition;
                    View childAt2;
                    View viewFindViewById4;
                    if (keyEvent.getAction() != 0) {
                        return false;
                    }
                    if (i3 == 19) {
                        ListView listView = C2253G.listView;
                        if (listView == null || (i4 = i) <= 0 || (firstVisiblePosition = (i4 - 1) - listView.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= listView.getChildCount() || (childAt2 = listView.getChildAt(firstVisiblePosition)) == null || (viewFindViewById4 = ((ViewGroup) childAt2).findViewById(i2)) == null) {
                            return true;
                        }
                        viewFindViewById4.requestFocus();
                        return true;
                    }
                    if (i3 != 20) {
                        if (i3 == 21) {
                            if (i2 != 2 || (viewFindViewById2 = ((ViewGroup) view2.getParent()).findViewById(1)) == null) {
                                return true;
                            }
                            viewFindViewById2.requestFocus();
                            return true;
                        }
                        if (i3 != 22) {
                            return false;
                        }
                        if (i2 != 1 || (viewFindViewById = ((ViewGroup) view2.getParent()).findViewById(2)) == null) {
                            return true;
                        }
                        viewFindViewById.requestFocus();
                        return true;
                    }
                    ListView listView2 = C2253G.listView;
                    if (listView2 == null) {
                        return false;
                    }
                    int i5 = i + 1;
                    if (i5 >= ArrowAdapter.this.items.size()) {
                        AlertDialog alertDialog = C2253G.currentDialog;
                        if (alertDialog == null || (button = alertDialog.getButton(-1)) == null) {
                            return false;
                        }
                        button.requestFocus();
                        return true;
                    }
                    int firstVisiblePosition2 = i5 - listView2.getFirstVisiblePosition();
                    if (firstVisiblePosition2 < 0 || firstVisiblePosition2 >= listView2.getChildCount() || (childAt = listView2.getChildAt(firstVisiblePosition2)) == null || (viewFindViewById3 = ((ViewGroup) childAt).findViewById(i2)) == null) {
                        return true;
                    }
                    viewFindViewById3.requestFocus();
                    return true;
                }
            });
            TextView textView5 = (TextView) relativeLayout.findViewById(2);
            final boolean z2 = false;
            textView5.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.ArrowAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int size = ArrowAdapter.this.items.size();
                    int i3 = i;
                    if (z2) {
                        if (i3 > 0) {
                            String str = ArrowAdapter.this.items.get(i3 - 1);
                            ArrowAdapter.this.items.set(i3 - 1, ArrowAdapter.this.items.get(i3));
                            ArrowAdapter.this.items.set(i3, str);
                            C2253G.lastFocusPosition = i3 - 1;
                            C2253G.lastFocusViewId = 1;
                            C2253G.needRestoreFocus = true;
                            C2253G.restoreRetryCount = 0;
                            ArrowAdapter.this.notifyDataSetChanged();
                            ListView listView = C2253G.listView;
                            if (listView != null) {
                                listView.post(new FocusRestorer());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i3 < size - 1) {
                        String str2 = ArrowAdapter.this.items.get(i3 + 1);
                        ArrowAdapter.this.items.set(i3 + 1, ArrowAdapter.this.items.get(i3));
                        ArrowAdapter.this.items.set(i3, str2);
                        C2253G.lastFocusPosition = i3 + 1;
                        C2253G.lastFocusViewId = 2;
                        C2253G.needRestoreFocus = true;
                        C2253G.restoreRetryCount = 0;
                        ArrowAdapter.this.notifyDataSetChanged();
                        ListView listView2 = C2253G.listView;
                        if (listView2 != null) {
                            listView2.post(new FocusRestorer());
                        }
                    }
                }
            });
            textView5.setOnFocusChangeListener(new View.OnFocusChangeListener(textView5) { // from class: com.github.catvod.spider.support.p128m.G.ArrowAdapter.2
                private int originalColor;
                final /* synthetic */ TextView val$textView;

                {
                    this.val$textView = textView5;
                    this.originalColor = textView5.getCurrentTextColor();
                }

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view2, boolean z3) {
                    TextView textView6 = this.val$textView;
                    if (z3) {
                        textView6.setTextColor(-16776961);
                    } else {
                        textView6.setTextColor(this.originalColor);
                    }
                }
            });
            final int i3 = 2;
            textView5.setOnKeyListener(new View.OnKeyListener() { // from class: com.github.catvod.spider.support.p128m.G.ArrowAdapter.3
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view2, int i4, KeyEvent keyEvent) {
                    View viewFindViewById;
                    View viewFindViewById2;
                    Button button;
                    View childAt;
                    View viewFindViewById3;
                    int i5;
                    int firstVisiblePosition;
                    View childAt2;
                    View viewFindViewById4;
                    if (keyEvent.getAction() != 0) {
                        return false;
                    }
                    if (i4 == 19) {
                        ListView listView = C2253G.listView;
                        if (listView == null || (i5 = i) <= 0 || (firstVisiblePosition = (i5 - 1) - listView.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= listView.getChildCount() || (childAt2 = listView.getChildAt(firstVisiblePosition)) == null || (viewFindViewById4 = ((ViewGroup) childAt2).findViewById(i3)) == null) {
                            return true;
                        }
                        viewFindViewById4.requestFocus();
                        return true;
                    }
                    if (i4 != 20) {
                        if (i4 == 21) {
                            if (i3 != 2 || (viewFindViewById2 = ((ViewGroup) view2.getParent()).findViewById(1)) == null) {
                                return true;
                            }
                            viewFindViewById2.requestFocus();
                            return true;
                        }
                        if (i4 != 22) {
                            return false;
                        }
                        if (i3 != 1 || (viewFindViewById = ((ViewGroup) view2.getParent()).findViewById(2)) == null) {
                            return true;
                        }
                        viewFindViewById.requestFocus();
                        return true;
                    }
                    ListView listView2 = C2253G.listView;
                    if (listView2 == null) {
                        return false;
                    }
                    int i6 = i + 1;
                    if (i6 >= ArrowAdapter.this.items.size()) {
                        AlertDialog alertDialog = C2253G.currentDialog;
                        if (alertDialog == null || (button = alertDialog.getButton(-1)) == null) {
                            return false;
                        }
                        button.requestFocus();
                        return true;
                    }
                    int firstVisiblePosition2 = i6 - listView2.getFirstVisiblePosition();
                    if (firstVisiblePosition2 < 0 || firstVisiblePosition2 >= listView2.getChildCount() || (childAt = listView2.getChildAt(firstVisiblePosition2)) == null || (viewFindViewById3 = ((ViewGroup) childAt).findViewById(i3)) == null) {
                        return true;
                    }
                    viewFindViewById3.requestFocus();
                    return true;
                }
            });
            return relativeLayout;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$ArrowConfirm */
    class ArrowConfirm implements DialogInterface.OnClickListener {
        final /* synthetic */ ArrayList val$items;

        ArrowConfirm(ArrayList arrayList) {
            this.val$items = arrayList;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i != -1) {
                return;
            }
            try {
                File fileM6169c = C2268k.m6169c("/config.json");
                JSONObject jSONObject = new JSONObject();
                if (fileM6169c.exists()) {
                    String strM6164a = C2268k.m6164a(fileM6169c);
                    if (!strM6164a.isEmpty() && strM6164a.length() > 0) {
                        jSONObject = new JSONObject(strM6164a);
                    }
                }
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                for (String str : this.val$items) {
                    if (!z) {
                        sb.append(",");
                    }
                    z = false;
                    sb.append(str);
                }
                jSONObject.put("panOrder", sb.toString());
                C2268k.m6168c(fileM6169c, jSONObject.toString());
                C2256I.m6113i("排序已保存");
            } catch (Exception e) {
                C2256I.m6113i("排序设置失败: " + e);
                Log.e("Config", "保存排序配置失败", e);
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$BackupTip */
    class BackupTip implements DialogInterface.OnClickListener {
        final /* synthetic */ Context val$context;

        BackupTip(Context context) {
            this.val$context = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Context context = this.val$context;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            int iM6110c = C2256I.m6110c(24);
            int iM6110c2 = C2256I.m6110c(20);
            linearLayout.setPadding(iM6110c, iM6110c2, iM6110c, iM6110c2);
            TextView textView = new TextView(context);
            textView.setText("提示");
            textView.setGravity(17);
            textView.setTextColor(-15066598);
            textView.setTextSize(24.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = C2256I.m6110c(16);
            linearLayout.addView(textView, layoutParams);
            View view = new View(context);
            view.setBackgroundColor(-1512723);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(2));
            layoutParams2.bottomMargin = C2256I.m6110c(12);
            linearLayout.addView(view, layoutParams2);
            TextView textView2 = new TextView(context);
            textView2.setText("🖥️ 电视端恢复数据步骤：\n\n1. 保持手机和电视在同一局域网内\n2. 打开电视端软件\n3. 点击\"推送\"\n4. 用手机浏览器扫描二维码\n5. 上传压缩包");
            textView2.setGravity(0);
            textView2.setTextColor(-10525848);
            textView2.setTextSize(14.0f);
            textView2.setLineSpacing(1.5f, 1.5f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.bottomMargin = C2256I.m6110c(16);
            linearLayout.addView(textView2, layoutParams3);
            TextView textView3 = new TextView(context);
            textView3.setText("✓ 我知道了");
            textView3.setGravity(17);
            textView3.setTextColor(-15043608);
            textView3.setTextSize(16.0f);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = C2256I.m6110c(24);
            layoutParams4.gravity = 1;
            linearLayout.addView(textView3, layoutParams4);
            final AlertDialog alertDialogShow = new AlertDialog.Builder(this.val$context).setView(linearLayout).setCancelable(true).show();
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.BackupTip.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    alertDialogShow.dismiss();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$CloudDialogClickListener */
    public class CloudDialogClickListener implements DialogInterface.OnClickListener {
        private final String cloudType;
        private final Context context;
        private final boolean enable;

        CloudDialogClickListener(Context context, boolean z, String str) {
            this.context = context;
            this.enable = z;
            this.cloudType = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C2253G.updateCloudConfig(this.enable, this.context, this.cloudType);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$DeleteBackup */
    class DeleteBackup implements DialogInterface.OnClickListener {
        private final Context context;

        public DeleteBackup(Context context) {
            this.context = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            File file = new File("/sdcard/TVBoxBackup.zip");
            if (!file.exists()) {
                Toast.makeText(this.context, "备份文件不存在", 0).show();
            } else if (file.delete()) {
                Toast.makeText(this.context, "备份已删除", 0).show();
            } else {
                Toast.makeText(this.context, "删除备份失败", 0).show();
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$FocusRestorer */
    class FocusRestorer implements Runnable {
        FocusRestorer() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView;
            View childAt;
            View viewFindViewById;
            if (C2253G.needRestoreFocus && (listView = C2253G.listView) != null) {
                int i = C2253G.lastFocusPosition;
                listView.setSelection(i);
                int firstVisiblePosition = i - listView.getFirstVisiblePosition();
                if (firstVisiblePosition >= 0 && firstVisiblePosition < listView.getChildCount() && (childAt = listView.getChildAt(firstVisiblePosition)) != null && (viewFindViewById = ((ViewGroup) childAt).findViewById(C2253G.lastFocusViewId)) != null && viewFindViewById.requestFocus()) {
                    C2253G.needRestoreFocus = false;
                    C2253G.restoreRetryCount = 0;
                    return;
                }
                int i2 = C2253G.restoreRetryCount;
                if (i2 >= 3) {
                    C2253G.needRestoreFocus = false;
                    C2253G.restoreRetryCount = 0;
                } else {
                    C2253G.restoreRetryCount = i2 + 1;
                    listView.post(new FocusRestorer());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$HomePageOption */
    public class HomePageOption implements DialogInterface.OnMultiChoiceClickListener {
        private boolean[] selectedOptions;

        public HomePageOption(int i) {
            this.selectedOptions = new boolean[i];
        }

        public boolean[] getSelectedOptions() {
            return this.selectedOptions;
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.selectedOptions[i] = z;
        }

        public void setInitialSelection(boolean[] zArr) {
            int i = 0;
            while (true) {
                boolean[] zArr2 = this.selectedOptions;
                if (i >= zArr2.length) {
                    return;
                }
                zArr2[i] = zArr[i];
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$LocalBackup */
    class LocalBackup implements DialogInterface.OnClickListener {
        final /* synthetic */ Context val$context;

        LocalBackup(Context context) {
            this.val$context = context;
        }

        public static void zipFolder(File file, File file2) throws IOException {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
            byte[] bArr = new byte[1024];
            try {
                LinkedList linkedList = new LinkedList();
                Collections.addAll(linkedList, file.listFiles());
                while (!linkedList.isEmpty()) {
                    File file3 = (File) linkedList.remove(0);
                    String str = "TVBox/" + file3.getAbsolutePath().substring(file.getAbsolutePath().length() + 1);
                    if (file3.isDirectory()) {
                        zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
                        zipOutputStream.closeEntry();
                        File[] fileArrListFiles = file3.listFiles();
                        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                            Collections.addAll(linkedList, fileArrListFiles);
                        }
                    } else {
                        zipOutputStream.putNextEntry(new ZipEntry(str));
                        FileInputStream fileInputStream = new FileInputStream(file3);
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                zipOutputStream.write(bArr, 0, i);
                            }
                        }
                        fileInputStream.close();
                        zipOutputStream.closeEntry();
                    }
                }
                zipOutputStream.close();
            } finally {
                zipOutputStream.close();
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                File file = new File("/sdcard/TVBox");
                if (!file.exists()) {
                    Toast.makeText(this.val$context, "TVBox文件夹不存在", 0).show();
                    return;
                }
                File file2 = new File("/sdcard/TVBoxBackup.zip");
                zipFolder(file, file2);
                Toast.makeText(this.val$context, "备份成功: " + file2.getName(), 1).show();
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(this.val$context, e.getMessage(), 0).show();
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$Option */
    public static class Option implements DialogInterface.OnClickListener {
        private int selectedOption = 0;

        public int getSelectedOption() {
            return this.selectedOption;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.selectedOption = i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$UpdateListener */
    class UpdateListener implements DialogInterface.OnClickListener {
        private final boolean enable;

        public UpdateListener(boolean z) {
            this.enable = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.enable) {
                Config.enableUpdateCheck();
            } else {
                Config.disableUpdateCheck();
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static volatile C2253G f5628a = new C2253G();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$b */
    class b implements Runnable {
        final /* synthetic */ TextView val$goView;
        final /* synthetic */ TextView val$javaView;

        b(TextView textView, TextView textView2) {
            this.val$goView = textView;
            this.val$javaView = textView2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String str = C2238b.m6073l("http://127.0.0.1:1314/api/ping", null).contains("ok") ? "🐢 Go: 🟢 在线" : "🐢 Go: ⚫ 离线";
                TextView textView = this.val$goView;
                textView.post(new c(textView, str));
            } catch (Exception e) {
                TextView textView2 = this.val$goView;
                textView2.post(new c(textView2, "🐢 Go: 🔴 错误"));
            }
            try {
                String str2 = C2238b.m6073l("http://127.0.0.1:9978/proxy?do=ck", null).contains("ok") ? "☕ Java: 🟢 在线" : "☕ Java: ⚫ 离线";
                TextView textView3 = this.val$javaView;
                textView3.post(new c(textView3, str2));
            } catch (Exception e2) {
                TextView textView4 = this.val$javaView;
                textView4.post(new c(textView4, "☕ Java: 🔴 错误"));
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$c */
    class c implements Runnable {
        final /* synthetic */ TextView val$targetView;
        final /* synthetic */ String val$text;

        c(TextView textView, String str) {
            this.val$targetView = textView;
            this.val$text = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$targetView.setText(this.val$text);
        }
    }

    /* JADX INFO: renamed from: 123Quality, reason: not valid java name */
    private void m6799123Quality(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("123云盘画质");
        String[] strArr = {"123原画", "123无限"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("123Quality");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0080D()).create().show();
    }

    /* JADX INFO: renamed from: 123panfxck, reason: not valid java name */
    private void m6800123panfxck(final Map<String, String> map) {
        final EditText editText = new EditText(Init.context());
        editText.setHintTextColor(-3355444);
        editText.setHint("请输入123云盘社区Cookie");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setPadding(0, 0, 0, 0);
        String str = map.get("model");
        if (TextUtils.isEmpty(str)) {
            TextView textView = new TextView(Init.context());
            textView.setText("请输入123云盘社区Cookie");
            textView.setGravity(17);
            textView.setTextColor(-16777216);
            textView.setTextSize(15.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C2256I.m6110c(20);
            layoutParams.bottomMargin = C2256I.m6110c(10);
            linearLayout.addView(textView, layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            int iM6110c = C2256I.m6110c(16);
            layoutParams2.setMargins(iM6110c, 0, iM6110c, 0);
            linearLayout.addView(editText, layoutParams2);
            TextView textView2 = new TextView(Init.context());
            textView2.setText("请访问123云盘社区获取Cookie");
            textView2.setGravity(17);
            textView2.setTextColor(-16777216);
            textView2.setTextSize(15.0f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            int iM6110c2 = C2256I.m6110c(10);
            textView2.setPadding(iM6110c2, iM6110c2, iM6110c2, iM6110c2);
            linearLayout.addView(textView2, layoutParams3);
            TextView textView3 = new TextView(Init.context());
            textView3.setText("https://123panfx.com");
            textView3.setGravity(17);
            textView3.setTextColor(-16776961);
            textView3.setTextSize(15.0f);
            textView3.setClickable(true);
            textView3.setOnClickListener(new AnonymousClass1());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 17;
            int iM6110c3 = C2256I.m6110c(10);
            textView3.setPadding(iM6110c3, C2256I.m6110c(10), iM6110c3, iM6110c3);
            linearLayout.addView(textView3, layoutParams4);
            ImageView imageView = new ImageView(Init.context());
            Bitmap bitmapM6179a = C2270m.m6179a("https://123panfx.com");
            if (bitmapM6179a != null) {
                imageView.setImageBitmap(bitmapM6179a);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(C2256I.m6110c(200), C2256I.m6110c(200));
                layoutParams5.topMargin = C2256I.m6110c(10);
                layoutParams5.gravity = 17;
                linearLayout.addView(imageView, layoutParams5);
            }
        } else {
            TextView textView4 = new TextView(Init.context());
            textView4.setText("请使用浏览器或者微信扫描二维码");
            textView4.setGravity(17);
            textView4.setTextColor(-16777216);
            textView4.setTextSize(14.0f);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams6.topMargin = C2256I.m6110c(20);
            layoutParams6.bottomMargin = C2256I.m6110c(10);
            linearLayout.addView(textView4, layoutParams6);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(C2256I.m6110c(200), C2256I.m6110c(200));
            layoutParams7.gravity = 17;
            ImageView imageView2 = new ImageView(Init.context());
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView2.setImageBitmap(C2270m.m6179a(this.f5624b));
            linearLayout.addView(imageView2, layoutParams7);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout);
        view.setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                File file = new File(new File(Environment.getExternalStorageDirectory(), "TVBox"), "diy_cookie.txt");
                try {
                    String strTrim = editText.getText().toString().trim();
                    if (strTrim.isEmpty()) {
                        Toast.makeText(Init.context(), "输入为空，未设置Cookie", 0).show();
                        return;
                    }
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (file.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb.append(line);
                            }
                        }
                        bufferedReader.close();
                        inputStreamReader.close();
                        fileInputStream.close();
                        jSONObject = new JSONObject(sb.toString());
                    }
                    jSONObject.put("123panfx_cookie", strTrim);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                    outputStreamWriter.write(jSONObject.toString());
                    outputStreamWriter.close();
                    fileOutputStream.close();
                    Toast.makeText(Init.context(), "123云盘社区Cookie已设置", 0).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        if (TextUtils.isEmpty(str)) {
            view.setNeutralButton("远程输入", new DialogInterfaceOnClickListenerC2248C(this, map));
        } else {
            view.setNeutralButton("手动输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.DD
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2253G c2253g = this.f5616a;
                    Map map2 = map;
                    c2253g.getClass();
                    map2.put("model", "");
                    map2.put("flag", "");
                    Init.execute(new RunnableC2276s(c2253g, map2, 1));
                }
            });
        }
        this.f5623a = view.show();
    }

    /* JADX INFO: renamed from: 189tip, reason: not valid java name */
    private void m6801189tip(Map<String, String> map) {
        Application applicationContext = Init.context();
        LinearLayout linearLayout = new LinearLayout(applicationContext);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iM6110c = C2256I.m6110c(24);
        int iM6110c2 = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c2, iM6110c, iM6110c2);
        TextView textView = new TextView(applicationContext);
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-15066598);
        textView.setTextSize(24.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(16);
        linearLayout.addView(textView, layoutParams);
        View view = new View(applicationContext);
        view.setBackgroundColor(-1512723);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(2));
        layoutParams2.bottomMargin = C2256I.m6110c(12);
        linearLayout.addView(view, layoutParams2);
        TextView textView2 = new TextView(applicationContext);
        textView2.setText("1. 请确认您输入的账号和密码准确无误\n\n2. 建议尝试在账号后添加@189.cn后缀进行登录\n\n3. 请点击下方链接或者扫描二维码，通过浏览器访问天翼云官网完成登录，并在账号安全设置中关闭设备锁功能");
        textView2.setGravity(0);
        textView2.setTextColor(-10525848);
        textView2.setTextSize(14.0f);
        textView2.setLineSpacing(1.5f, 1.5f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = C2256I.m6110c(16);
        linearLayout.addView(textView2, layoutParams3);
        TextView textView3 = new TextView(applicationContext);
        textView3.setText("https://e.dlife.cn/user/index.do");
        textView3.setGravity(17);
        textView3.setTextColor(-16776961);
        textView3.setTextSize(12.0f);
        textView3.setClickable(true);
        textView3.setOnClickListener(new AnonymousClass1());
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(applicationContext);
        Bitmap bitmapM6179a = C2270m.m6179a("https://e.dlife.cn/user/index.do");
        if (bitmapM6179a != null) {
            imageView.setImageBitmap(bitmapM6179a);
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C2256I.m6110c(120), C2256I.m6110c(120));
        layoutParams4.topMargin = C2256I.m6110c(16);
        layoutParams4.bottomMargin = C2256I.m6110c(16);
        linearLayout.addView(imageView, layoutParams4);
        TextView textView4 = new TextView(applicationContext);
        textView4.setText("✓ 我知道了");
        textView4.setGravity(17);
        textView4.setTextColor(-15043608);
        textView4.setTextSize(16.0f);
        textView4.setOnClickListener(new AnonymousClass8());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = C2256I.m6110c(24);
        layoutParams5.gravity = 1;
        linearLayout.addView(textView4, layoutParams5);
        Init.execute(new RunnableC2274q(this, map, 0));
        this.f5623a = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    C2253G() {
        String hostAddress;
        this.f5624b = "";
        Init.checkPermission();
        this.f5626d = C2256I.m6112f();
        StringBuilder sb = new StringBuilder();
        String url = Proxy.getUrl();
        int ipAddress = ((WifiManager) Init.context().getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    String displayName = networkInterfaceNextElement.getDisplayName();
                    if (displayName.equals("eth0") || displayName.equals("wlan0")) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress inetAddressNextElement = inetAddresses.nextElement();
                            if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                                hostAddress = inetAddressNextElement.getHostAddress();
                            }
                        }
                    }
                }
            } catch (SocketException e) {
                e.printStackTrace();
            }
            hostAddress = "127.0.0.1";
        } else {
            hostAddress = String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
        }
        sb.append(url.replace("127.0.0.1", hostAddress));
        sb.append("?do=push&operate=web");
        this.f5624b = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m6080A(Map<String, String> map) {
        ScheduledExecutorService scheduledExecutorService = this.f5625c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f5625c = null;
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f5625c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC2184r(this, map, 3), 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: B */
    private void m6081B() {
        Init.run(new RunnableC2170d(this, 3));
    }

    /* JADX INFO: renamed from: C */
    private void m6082C() {
        ScheduledExecutorService scheduledExecutorService = this.f5625c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f5625c.shutdown();
        }
    }

    private void PanOrder(Map<String, String> map) {
        ArrayList<String> labelsFromPanOrder = getLabelsFromPanOrder(C2268k.m6164a(C2268k.m6169c("/config.json")));
        if (labelsFromPanOrder == null || labelsFromPanOrder.size() <= 0) {
            labelsFromPanOrder = new ArrayList<>();
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("云盘排序").setAdapter(new ArrowAdapter(Init.getConfigActivity(), R.layout.simple_list_item_1, labelsFromPanOrder), null).setPositiveButton("确定", new ArrowConfirm(labelsFromPanOrder)).create();
        alertDialogCreate.getWindow().setSoftInputMode(8);
        alertDialogCreate.show();
        currentDialog = alertDialogCreate;
        ListView listView2 = alertDialogCreate.getListView();
        listView = listView2;
        if (listView2 != null) {
            listView2.setItemsCanFocus(true);
            listView2.setSelection(0);
            lastFocusPosition = 0;
            lastFocusViewId = 1;
            needRestoreFocus = true;
            restoreRetryCount = 0;
            listView2.post(new FocusRestorer());
        }
    }

    public static void Refresh189() throws Exception {
        File file = new File("/sdcard/TVBox/cloud189.txt");
        if (!file.exists()) {
            SpiderDebug.log("cloud189.txt 文件不存在");
            return;
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                sb.append(line);
            }
        }
        bufferedReader.close();
        fileReader.close();
        JSONObject jSONObject = new JSONObject(sb.toString());
        SpiderDebug.log(C2178l.m5718c().m5728b(jSONObject.getString("userName"), jSONObject.getString("passWord")) ? "189云盘登录成功" : "189云盘登录失败");
    }

    private EditText addInputWithHint(LinearLayout linearLayout, String str) {
        String str2;
        TextView textView = new TextView(Init.context());
        if ("ali".equals(str)) {
            str2 = "请输入阿里云盘Token";
        } else if ("quark".equals(str)) {
            str2 = "请输入夸克网盘Cookie";
        } else if ("uc".equals(str)) {
            str2 = "请输入UC网盘Cookie";
        } else if ("bili".equals(str)) {
            str2 = "请输入哔哩哔哩Cookie";
        } else {
            str2 = "请输入" + str + "授权信息";
        }
        textView.setText(str2);
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(15.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C2256I.m6110c(20);
        layoutParams.bottomMargin = C2256I.m6110c(10);
        linearLayout.addView(textView, layoutParams);
        EditText editText = new EditText(Init.context());
        editText.setHintTextColor(-3355444);
        editText.setHint(str2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(C2256I.m6110c(16), 0, C2256I.m6110c(16), 0);
        layoutParams2.bottomMargin = C2256I.m6110c(10);
        layoutParams2.gravity = 17;
        linearLayout.addView(editText, layoutParams2);
        return editText;
    }

    private void aliQuality(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("阿里云盘画质");
        String[] strArr = {"阿里原画", "阿里普画", "阿里原画|阿里普画", "阿里普画|阿里原画"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("aliQuality");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0088b()).create().show();
    }

    private void aliThread(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("阿里云盘线程");
        String[] strArr = {"4", "8", "16", "32", "64", "128", "256"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("aliThread");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0092e()).create().show();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6084b(C2253G c2253g, Map map) {
        c2253g.m6082C();
        Init.execute(new RunnableC2275r(c2253g, map, 0));
    }

    private void backup(Map<String, String> map) {
        Activity configActivity = Init.getConfigActivity();
        AlertDialog alertDialogCreate = new AlertDialog.Builder(configActivity).setTitle("数据备份").setMessage("请选择操作").setCancelable(true).setPositiveButton("备份", new LocalBackup(configActivity)).setNegativeButton("删除备份", new DeleteBackup(Init.getConfigActivity())).setNeutralButton("帮助", new BackupTip(Init.getConfigActivity())).create();
        alertDialogCreate.setCanceledOnTouchOutside(true);
        alertDialogCreate.show();
    }

    private void baiduQuality(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("百度网盘画质");
        String[] strArr = {"百度原画", "百度无限"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("baiduQuality");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0078B()).create().show();
    }

    private void baiduThread(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("百度网盘线程");
        String[] strArr = {"4", "6", "8", "10", "12", "14", "16"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("baiduThread");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0079C()).create().show();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6085c(C2253G c2253g, EditText editText, EditText editText2) {
        c2253g.getClass();
        c2253g.m6102u("cloud189", editText.getText().toString() + "|" + editText2.getText().toString() + "|Y");
    }

    private void cloudSwitch(Map<String, String> map) {
        Activity configActivity = Init.getConfigActivity();
        String str = map.get("site");
        new AlertDialog.Builder(configActivity).setTitle(str).setMessage("请选择操作").setPositiveButton("开启", new CloudDialogClickListener(configActivity, true, str)).setNegativeButton("关闭", new CloudDialogClickListener(configActivity, false, str)).create().show();
    }

    /* JADX INFO: renamed from: d */
    public static void m6086d(C2253G c2253g, Map map) {
        Runnable runnableC2276s;
        String str;
        String strOptString;
        String str2;
        JSONObject jSONObject;
        c2253g.getClass();
        String str3 = (String) map.get("site");
        int i = 2;
        try {
            try {
                if ("quark".equals(str3)) {
                    str2 = "com.ucpro.MainActivity";
                    Activity configActivity = Init.getConfigActivity();
                    Intent intent = new Intent();
                    intent.setClassName("com.quark.browser", "com.ucpro.MainActivity");
                    str = configActivity.getPackageManager().resolveActivity(intent, 65536) == null ? "com.quark.clouddrive" : "com.quark.browser";
                    jSONObject = new JSONObject((String) map.get("url"));
                } else if ("uc".equals(str3)) {
                    str = "com.UCMobile";
                    str2 = "com.UCMobile.main.UCMobile";
                    jSONObject = new JSONObject((String) map.get("url"));
                } else if ("xunlei".equals(str3)) {
                    str = "com.xunlei.downloadprovider";
                    str2 = "com.xunlei.downloadprovider.launch.LaunchActivity2";
                    jSONObject = new JSONObject((String) map.get("url"));
                } else {
                    if (!"guangya".equals(str3)) {
                        if ("bili".equals(str3)) {
                            str = "tv.danmaku.bili";
                            str2 = "tv.danmaku.bili.ui.intent.IntentHandlerActivity";
                            jSONObject = new JSONObject((String) map.get("url"));
                        } else {
                            str = "";
                            strOptString = str;
                            str2 = strOptString;
                        }
                        Activity configActivity2 = Init.getConfigActivity();
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setClassName(str, str2);
                        intent2.setData(Uri.parse(strOptString));
                        configActivity2.startActivity(intent2);
                        runnableC2276s = new RunnableC2274q(c2253g, map, i);
                        Init.execute(runnableC2276s);
                    }
                    str = "com.guangshanyun.pan";
                    str2 = "com.guangshanyun.pan.launch.LaunchActivity$Default";
                    jSONObject = new JSONObject((String) map.get("url"));
                }
                strOptString = jSONObject.optString("url");
                Activity configActivity3 = Init.getConfigActivity();
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setClassName(str, str2);
                intent3.setData(Uri.parse(strOptString));
                configActivity3.startActivity(intent3);
                runnableC2276s = new RunnableC2274q(c2253g, map, i);
            } catch (Exception e) {
                e.printStackTrace();
                map.put("push", "");
                map.put("flag", c2253g.m6100r(str3));
                map.put("button", "1");
                Init.execute(new RunnableC2275r(c2253g, map, 2));
                runnableC2276s = new RunnableC2276s(c2253g, map, i);
            }
            Init.execute(runnableC2276s);
        } catch (Throwable th) {
            Init.execute(new RunnableC2273p(c2253g, map, 1));
            throw th;
        }
    }

    private void danmuColor(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("弹幕颜色");
        String[] strArr = {"默认", "彩色"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("danmuColor");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0096i()).create().show();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m6087e(C2253G c2253g, Map map, String str) {
        c2253g.getClass();
        map.put("push", "");
        map.put("flag", c2253g.m6100r(str));
        map.put("button", "1");
        map.put("input", "");
        Init.execute(new RunnableC2275r(c2253g, map, 1));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m6088f(C2253G c2253g, EditText editText) {
        c2253g.getClass();
        c2253g.m6102u("ucMachineCode", editText.getText().toString());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6089g(C2253G c2253g, String str, EditText editText) {
        c2253g.getClass();
        c2253g.m6102u(str, editText.getText().toString());
    }

    private ArrayList<String> getLabelsFromPanOrder(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null && !str.isEmpty()) {
            try {
                String strOptString = new JSONObject(str).optString("panOrder", "");
                if (strOptString.isEmpty()) {
                    return arrayList;
                }
                for (String str2 : strOptString.split(",")) {
                    String strTrim = str2.trim();
                    if (!strTrim.isEmpty()) {
                        arrayList.add(strTrim);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add("百度");
            arrayList.add("夸克");
            arrayList.add("UC");
            arrayList.add("天翼");
            arrayList.add("123");
            arrayList.add("阿里");
            arrayList.add("移动");
        }
        return arrayList;
    }

    private boolean handleSpecialSite(String str, Map map) {
        if ("cloud123".equals(str)) {
            m6105x(map);
            return true;
        }
        if ("cloud189".equals(str)) {
            m6106y(map);
            return true;
        }
        if ("189tip".equals(str)) {
            m6801189tip(map);
            return true;
        }
        if ("123panfxck".equals(str)) {
            m6800123panfxck(map);
            return true;
        }
        if ("quarktip".equals(str)) {
            quarktip(map);
            return true;
        }
        if ("uctip".equals(str)) {
            uctip(map);
            return true;
        }
        if ("newaliyun".equals(str)) {
            newaliyun(map);
            return true;
        }
        if ("newquark".equals(str)) {
            newquark(map);
            return true;
        }
        if ("newuc".equals(str)) {
            newuc(map);
            return true;
        }
        if ("newbaidu".equals(str)) {
            newbaidu(map);
            return true;
        }
        if ("newxunlei".equals(str)) {
            newxunlei(map);
            return true;
        }
        if ("newguangya".equals(str)) {
            newguangya(map);
            return true;
        }
        if ("new189".equals(str)) {
            new189(map);
            return true;
        }
        if ("new123".equals(str)) {
            new123(map);
            return true;
        }
        if ("newbili".equals(str)) {
            newbili(map);
            return true;
        }
        if ("baidu".equals(str)) {
            m6103v(map);
            return true;
        }
        if ("homePage".equals(str)) {
            homePage(map);
            return true;
        }
        if ("danmuColor".equals(str)) {
            danmuColor(map);
            return true;
        }
        if ("panOrder".equals(str)) {
            PanOrder(map);
            return true;
        }
        if ("pansou".equals(str)) {
            pansou(map);
            return true;
        }
        if ("proxyMode".equals(str)) {
            proxyMode(map);
            return true;
        }
        if ("backup".equals(str)) {
            backup(map);
            return true;
        }
        if ("update".equals(str)) {
            update(map);
            return true;
        }
        if ("aliThread".equals(str)) {
            aliThread(map);
            return true;
        }
        if ("quarkThread".equals(str)) {
            quarkThread(map);
            return true;
        }
        if ("ucThread".equals(str)) {
            ucThread(map);
            return true;
        }
        if ("baiduThread".equals(str)) {
            baiduThread(map);
            return true;
        }
        if ("xunleiThread".equals(str)) {
            xunleiThread(map);
            return true;
        }
        if ("aliQuality".equals(str)) {
            aliQuality(map);
            return true;
        }
        if ("quarkQuality".equals(str)) {
            quarkQuality(map);
            return true;
        }
        if ("ucQuality".equals(str)) {
            ucQuality(map);
            return true;
        }
        if ("baiduQuality".equals(str)) {
            baiduQuality(map);
            return true;
        }
        if (!"123Quality".equals(str)) {
            return false;
        }
        m6799123Quality(map);
        return true;
    }

    private void homePage(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("主页分类");
        String[] strArr = {"猜你喜欢", "热门电影", "热播剧集", "热门动漫", "热播综艺", "电影筛选", "电视筛选", "电影榜单", "电视剧榜单"};
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        boolean[] zArr = new boolean[9];
        for (int i = 0; i < 9; i++) {
            zArr[i] = true;
        }
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("homePage");
                if (!TextUtils.isEmpty(strOptString)) {
                    List listAsList = Arrays.asList(strOptString.split(","));
                    for (int i2 = 0; i2 < strArr.length; i2++) {
                        if (listAsList.contains(strArr[i2])) {
                            zArr[i2] = true;
                        } else {
                            zArr[i2] = false;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        HomePageOption homePageOption = new HomePageOption(9);
        homePageOption.setInitialSelection(zArr);
        title.setMultiChoiceItems(strArr, zArr, homePageOption).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0095h(homePageOption)).create().show();
    }

    /* JADX INFO: renamed from: i */
    public static void m6091i(C2253G c2253g) {
        c2253g.getClass();
        try {
            AlertDialog alertDialog = c2253g.f5623a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            ScheduledExecutorService scheduledExecutorService = c2253g.f5625c;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isCloudSite(String str) {
        return "阿里云盘".equals(str) || "夸克网盘".equals(str) || "UC网盘".equals(str) || "天翼云盘".equals(str) || "123云盘".equals(str) || "百度网盘".equals(str) || "迅雷云盘".equals(str) || "光鸭云盘".equals(str) || "移动云盘".equals(str);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m6092j(C2253G c2253g, Map map) {
        c2253g.m6082C();
        map.put("push", "1");
        map.put("flag", c2253g.m6100r(""));
        map.put("button", "1");
        c2253g.m6104w(map);
    }

    /* JADX INFO: renamed from: k */
    public static void m6093k(C2253G c2253g, Map map) {
        String str;
        String string;
        String string2;
        c2253g.getClass();
        try {
            if ("ali".equals(map.get("site"))) {
                JSONObject jSONObjectOptJSONObject = new JSONObject((String) map.get("url")).optJSONObject("token");
                HashMap map2 = new HashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map2.put(next, jSONObjectOptJSONObject.optString(next));
                }
                C2200d c2200dM5879c = C2200d.m5876g(C2238b.m6070i(map2)).m5878b().m5879c();
                if (!c2200dM5879c.m5882f()) {
                    return;
                }
                C2256I.m6113i("阿里云盘授权成功");
                str = (String) map.get("site");
                string = c2200dM5879c.m5881e();
            } else {
                if (!"quark".equals(map.get("site"))) {
                    String str2 = ";";
                    if ("uc".equals(map.get("site"))) {
                        HashMap map3 = new HashMap();
                        map3.put("Accept", "application/json, text/plain, */*");
                        map3.put("Content-Type", "application/x-www-form-urlencoded");
                        map3.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                        map3.put("Referer", "https://broccoli.uc.cn/");
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        string2 = "";
                        sb.append(string2);
                        String string3 = sb.toString();
                        HashMap map4 = new HashMap();
                        map4.put("client_id", "381");
                        map4.put("v", "1.2");
                        map4.put("request_id", string3);
                        map4.put("token", new JSONObject((String) map.get("url")).optString("token"));
                        JSONObject jSONObject = new JSONObject(C2238b.m6067g("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?__dt=18884&__t=" + string3, map4, map3).m6076a());
                        if (!"ok".equals(jSONObject.optString("message"))) {
                            return;
                        }
                        for (String str3 : C2238b.m6064d("https://drive.uc.cn/account/info?st=" + jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket"), map3).headers("set-cookie")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(string2);
                            String str4 = str2;
                            sb2.append(str3.split(str4)[0]);
                            sb2.append(str4);
                            string2 = sb2.toString();
                            str2 = str4;
                        }
                        str = (String) map.get("site");
                    } else {
                        Object obj = map.get("site");
                        if ("xunlei".equals(obj)) {
                            String strOptString = new JSONObject((String) map.get("url")).optString("token");
                            HashMap map5 = new HashMap();
                            map5.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.31.0.9726 netWorkType/5G appid/40 deviceName/Xiaomi_M2004j7ac deviceModel/M2004J7AC OSVersion/12 protocolVersion/301 platformVersion/10 sdkVersion/512000 Oauth2Client/0.9 (Linux 4_14_186-perf-gddfs8vbb238b) (JAVA 0)");
                            map5.put("Content-Type", "application/json; charset=utf-8");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("client_id", "Xp6vsxz_7IYVw2BB");
                            jSONObject2.put("device_code", strOptString);
                            jSONObject2.put("grant_type", "urn:ietf:params:oauth:grant-type:device_code");
                            JSONObject jSONObject3 = new JSONObject(C2238b.m6066f("https://xluser-ssl.xunlei.com/v1/auth/token", jSONObject2.toString(), map5).m6076a());
                            if (!jSONObject3.has("access_token")) {
                                return;
                            }
                            string = jSONObject3.toString();
                            str = (String) obj;
                        } else {
                            Object obj2 = map.get("site");
                            if ("guangya".equals(obj2)) {
                                String strOptString2 = new JSONObject((String) map.get("url")).optString("token");
                                HashMap map6 = new HashMap();
                                map6.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36 Edg/147.0.0.0");
                                map6.put("Content-Type", "application/json; charset=utf-8");
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("client_id", "aMe-8VSlkrbQXpUR");
                                jSONObject4.put("device_code", strOptString2);
                                jSONObject4.put("grant_type", "urn:ietf:params:oauth:grant-type:device_code");
                                JSONObject jSONObject5 = new JSONObject(C2238b.m6066f("https://account.guangyapan.com/v1/auth/token", jSONObject4.toString(), map6).m6076a());
                                if (!jSONObject5.has("access_token")) {
                                    return;
                                }
                                string = jSONObject5.toString();
                                str = (String) obj2;
                            } else {
                                if (!"bili".equals(map.get("site"))) {
                                    if ("cloud".equals(map.get("site"))) {
                                        if (!C2178l.m5726u()) {
                                            return;
                                        } else {
                                            C2256I.m6113i("天翼云盘授权成功");
                                        }
                                    } else if (!"baidu".equals(map.get("site")) || !C2176j.m5696t()) {
                                        return;
                                    } else {
                                        C2256I.m6113i("百度网盘授权成功");
                                    }
                                    c2253g.m6081B();
                                    return;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("Accept", "application/json, text/plain, */*");
                                map7.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                                String strM5964q = C2216e.m5981b(C2238b.m6073l("https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + new JSONObject((String) map.get("url")).optString("token") + "&source=main_mini", map7)).m5982a().m5964q();
                                if (TextUtils.isEmpty(strM5964q)) {
                                    return;
                                }
                                StringBuilder sb3 = new StringBuilder();
                                for (String str5 : Uri.parse(strM5964q).getQuery().split("&")) {
                                    sb3.append(str5);
                                    sb3.append(str2);
                                }
                                str = (String) map.get("site");
                                string = sb3.toString();
                            }
                        }
                    }
                    c2253g.m6102u(str, string2);
                }
                String strM6073l = C2238b.m6073l("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + new JSONObject((String) map.get("url")).optString("token"), null);
                SpiderDebug.log(strM6073l);
                JSONObject jSONObject6 = new JSONObject(strM6073l);
                if (!"ok".equals(jSONObject6.optString("message"))) {
                    return;
                }
                String strOptString3 = jSONObject6.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                HashMap map8 = new HashMap();
                map8.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0");
                map8.put("Accept", "application/json, text/plain, */*");
                map8.put("Referer", "https://pan.quark.cn/");
                String str6 = "";
                for (String str7 : C2238b.m6064d("https://pan.quark.cn/account/info?st=" + strOptString3 + "&lw=scan", map8).headers("set-cookie")) {
                    if (str7.contains("__pus=")) {
                        str6 = str6 + str7.split(";")[0] + ";";
                    }
                }
                str = (String) map.get("site");
                string = str6;
            }
            string2 = string;
            c2253g.m6102u(str, string2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m6095m(C2253G c2253g, EditText editText, EditText editText2) {
        c2253g.getClass();
        c2253g.m6102u("cloud123", editText.getText().toString() + "|" + editText2.getText().toString() + "|Y");
    }

    private void new123(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 123个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C2256I.m6110c(400), -2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C2256I.m6110c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.62
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C2253G.this.dismissAlertDialog();
                C2253G.this.callShow123RegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(45));
        int iM6110c2 = C2256I.m6110c(40);
        layoutParams3.leftMargin = iM6110c2;
        layoutParams3.rightMargin = iM6110c2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.f5623a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.63
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String strM5751j = C2179m.m5742a().m5751j();
                    if (TextUtils.isEmpty(strM5751j)) {
                        final String str = "获取失败：账号未登录或Token已失效";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.63.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str);
                            }
                        });
                        return;
                    }
                    HashMap map2 = new HashMap();
                    map2.put("Authorization", strM5751j);
                    map2.put("Platform", "open_platform");
                    map2.put("Accept", "application/json");
                    JSONObject jSONObject = new JSONObject(C2238b.m6073l("https://open-api.123pan.com/api/v1/user/info", map2));
                    if (jSONObject.optInt("code") != 0) {
                        final String str2 = "获取失败：账号未登录或Token已失效";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.63.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str2);
                            }
                        });
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        final String str3 = "获取失败：返回数据为空";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.63.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str3);
                            }
                        });
                        return;
                    }
                    String strOptString = jSONObjectOptJSONObject.optString("nickname");
                    long jOptLong = jSONObjectOptJSONObject.optLong("spaceUsed");
                    long jOptLong2 = jSONObjectOptJSONObject.optLong("spacePermanent");
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("vip");
                    String strM6111e = jOptLong == 0 ? "0 B" : C2256I.m6111e(jOptLong);
                    String strM6111e2 = jOptLong2 == 0 ? "0 B" : C2256I.m6111e(jOptLong2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("👤 用户：");
                    sb.append(strOptString);
                    sb.append("\n\n");
                    sb.append("🏷️ 会员类型：");
                    sb.append(zOptBoolean ? "VIP会员" : "普通用户");
                    sb.append("\n\n");
                    sb.append("💾 存储空间：");
                    sb.append(strM6111e);
                    sb.append(" / ");
                    sb.append(strM6111e2);
                    sb.append("\n\n");
                    sb.append(zOptBoolean ? "✅ 会员有效" : "⚠️ 未开通会员");
                    final String string = sb.toString();
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.63.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(string);
                        }
                    });
                } catch (Throwable th) {
                    th.printStackTrace();
                    TextView textView3 = textView2;
                    final String str4 = "获取失败：" + th.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.63.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str4);
                        }
                    });
                }
            }
        }).start();
    }

    private void new189(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 天翼个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C2256I.m6110c(400), -2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C2256I.m6110c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.52
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C2253G.this.dismissAlertDialog();
                C2253G.this.callShow189RegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(45));
        int iM6110c2 = C2256I.m6110c(40);
        layoutParams3.leftMargin = iM6110c2;
        layoutParams3.rightMargin = iM6110c2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.f5623a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.53
            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                while (true) {
                    try {
                        String strM5734k = C2178l.m5718c().m5734k();
                        if (TextUtils.isEmpty(strM5734k)) {
                            final String str = "获取失败：账号未登录或Cookie已失效";
                            textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.53.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    textView2.setText(str);
                                }
                            });
                            return;
                        }
                        HashMap map2 = new HashMap();
                        map2.put("Referer", "https://cloud.189.cn/");
                        map2.put("accept", "application/json;charset=UTF-8");
                        map2.put("Cookie", strM5734k);
                        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                        String strM6073l = C2238b.m6073l("https://cloud.189.cn/api/portal/getUserSizeInfo.action", map2);
                        JSONObject jSONObject = new JSONObject(strM6073l);
                        String strOptString = jSONObject.optString("errorCode");
                        if (TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject2 = new JSONObject(strM6073l);
                            if (jSONObject2.optInt("res_code") != 0) {
                                TextView textView3 = textView2;
                                final String str2 = "获取信息失败：" + jSONObject2.optString("res_message");
                                textView3.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.53.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        textView2.setText(str2);
                                    }
                                });
                                return;
                            }
                            String strOptString2 = jSONObject2.optString("account");
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("cloudCapacityInfo");
                            long jOptLong = 0;
                            long jOptLong2 = 0;
                            if (jSONObjectOptJSONObject != null) {
                                jOptLong = jSONObjectOptJSONObject.optLong("usedSize", 0L);
                                jOptLong2 = jSONObjectOptJSONObject.optLong("totalSize", 0L);
                            }
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("familyCapacityInfo");
                            String strM6111e = C2256I.m6111e(jOptLong);
                            if (TextUtils.isEmpty(strM6111e)) {
                                strM6111e = "0 B";
                            }
                            String strM6111e2 = C2256I.m6111e(jOptLong2);
                            if (TextUtils.isEmpty(strM6111e2)) {
                                strM6111e2 = "0 B";
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("👤 账号：");
                            sb.append(strOptString2);
                            sb.append("\n\n");
                            sb.append("☁️ 个人云空间：");
                            sb.append(strM6111e);
                            sb.append(" / ");
                            sb.append(strM6111e2);
                            if (jSONObjectOptJSONObject2 != null) {
                                sb.append("\n\n");
                                sb.append("🏠 家庭云空间：");
                                String strM6111e3 = C2256I.m6111e(jSONObjectOptJSONObject2.optLong("usedSize", 0L));
                                if (TextUtils.isEmpty(strM6111e3)) {
                                    strM6111e3 = "0 B";
                                }
                                sb.append(strM6111e3);
                                sb.append(" / ");
                                String strM6111e4 = C2256I.m6111e(jSONObjectOptJSONObject2.optLong("totalSize", 0L));
                                if (TextUtils.isEmpty(strM6111e4)) {
                                    strM6111e4 = "0 B";
                                }
                                sb.append(strM6111e4);
                            }
                            sb.append("\n");
                            final String string = sb.toString();
                            textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.53.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    textView2.setText(string);
                                }
                            });
                            return;
                        }
                        if (!"InvalidSessionKey".equals(strOptString)) {
                            TextView textView4 = textView2;
                            final String str3 = "获取信息失败：" + jSONObject.optString("errorMsg");
                            textView4.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.53.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    textView2.setText(str3);
                                }
                            });
                            return;
                        }
                        if (i >= 1) {
                            final String str4 = "获取失败：账号未登录或Cookie已失效";
                            textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.53.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    textView2.setText(str4);
                                }
                            });
                            return;
                        } else {
                            i++;
                            C2253G.Refresh189();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        TextView textView5 = textView2;
                        final String str5 = "获取失败：" + e.getMessage();
                        textView5.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.53.2
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str5);
                            }
                        });
                        return;
                    }
                }
            }
        }).start();
    }

    private void newaliyun(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 阿里个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C2256I.m6110c(400), -2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C2256I.m6110c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C2253G.this.dismissAlertDialog();
                C2253G.this.callShowAliyunRegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(45));
        int iM6110c2 = C2256I.m6110c(40);
        layoutParams3.leftMargin = iM6110c2;
        layoutParams3.rightMargin = iM6110c2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.f5623a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.13

            /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.G$13$1, reason: invalid class name */
            class AnonymousClass1 implements Runnable {
                final /* synthetic */ String val$text;

                AnonymousClass1(String str) {
                    this.val$text = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    textView2.setText(this.val$text);
                }
            }

            private boolean tryFetchUserInfo() {
                String str;
                try {
                    HashMap map2 = new HashMap();
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) aDrive/6.1.0 Chrome/112.0.5615.165 Electron/24.1.3.7 Safari/537.36");
                    map2.put("Referer", "https://www.aliyundrive.com/");
                    map2.put("authorization", C2175i.m5662d().m5669g().m5870c().m5918a());
                    map2.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
                    JSONObject jSONObject = new JSONObject(C2238b.m6066f("https://user.aliyundrive.com/v2/user/get", "{}", map2).m6076a());
                    String strOptString = jSONObject.optString("nick_name");
                    String strOptString2 = jSONObject.optString("vip_identity");
                    JSONObject jSONObject2 = new JSONObject(C2238b.m6066f("https://api.aliyundrive.com/v2/databox/get_personal_info", "{}", map2).m6076a());
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("personal_rights_info");
                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("personal_space_info");
                    if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject2 == null) {
                        return false;
                    }
                    jSONObjectOptJSONObject.optString("name");
                    long jOptLong = jSONObjectOptJSONObject2.optLong("used_size");
                    long jOptLong2 = jSONObjectOptJSONObject2.optLong("total_size");
                    String strM6111e = jOptLong != 0 ? C2256I.m6111e(jOptLong) : "0 B";
                    String strM6111e2 = jOptLong2 != 0 ? C2256I.m6111e(jOptLong2) : "0 B";
                    StringBuilder sb = new StringBuilder();
                    sb.append("👤 用户：");
                    sb.append(strOptString);
                    sb.append("\n\n");
                    sb.append("👑️ 会员类型：");
                    if (strOptString2.equals("vip")) {
                        str = "VIP会员";
                    } else {
                        str = strOptString2.equals("svip") ? "超级会员" : "普通用户";
                    }
                    sb.append(str);
                    sb.append("\n\n");
                    sb.append("💾 存储空间：");
                    sb.append(strM6111e);
                    sb.append(" / ");
                    sb.append(strM6111e2);
                    sb.append("\n");
                    textView2.post(new AnonymousClass1(sb.toString()));
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (tryFetchUserInfo()) {
                        return;
                    }
                    if (C2175i.m5662d().m5680t()) {
                        tryFetchUserInfo();
                    } else {
                        textView2.post(new AnonymousClass1("获取失败：账号未登录或Token已失效"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView3 = textView2;
                    final String str = "获取失败：" + e.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.13.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str);
                        }
                    });
                }
            }
        }).start();
    }

    private void newbaidu(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 百度个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C2256I.m6110c(400), -2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C2256I.m6110c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.42
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C2253G.this.dismissAlertDialog();
                C2253G.this.callShowBaiduRegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(45));
        int iM6110c2 = C2256I.m6110c(40);
        layoutParams3.leftMargin = iM6110c2;
        layoutParams3.rightMargin = iM6110c2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.f5623a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.43
            @Override // java.lang.Runnable
            public void run() {
                String strM6111e;
                String strM6111e2;
                try {
                    String strM5701j = C2176j.m5689f().m5701j();
                    HashMap map2 = new HashMap();
                    map2.put("Referer", "https://pan.baidu.com");
                    map2.put("Cookie", strM5701j);
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                    JSONObject jSONObject = new JSONObject(C2238b.m6073l("https://mbd.baidu.com/userx/v1/info/get?appname=baiduboxapp&fields=[\"bg_image\",\"member\",\"uid\",\"avatar\",\"avatar_member\",\"username\",\"displayname\"]", map2));
                    if (jSONObject.optInt("errno") != 0) {
                        final String str = "获取失败：账号未登录或Cookie已失效";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.43.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str);
                            }
                        });
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data").optJSONObject("fields");
                    if (jSONObjectOptJSONObject == null) {
                        final String str2 = "获取失败：数据格式异常";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.43.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str2);
                            }
                        });
                        return;
                    }
                    String strOptString = jSONObjectOptJSONObject.optString("username");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("member");
                    int iOptInt = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optInt("is_vip") : 0;
                    HashMap map3 = new HashMap();
                    map3.put("Referer", "https://pan.baidu.com");
                    map3.put("Cookie", strM5701j);
                    map3.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                    JSONObject jSONObject2 = new JSONObject(C2238b.m6073l("https://pan.baidu.com/api/quota?checkfree=1&checkexpire=1", map3));
                    if (jSONObject2.optInt("errno") != 0) {
                        strM6111e = "容量信息获取失败";
                        strM6111e2 = "N/A";
                    } else {
                        long jOptLong = jSONObject2.optLong("used");
                        long jOptLong2 = jSONObject2.optLong("total");
                        strM6111e = jOptLong == 0 ? "0 B" : C2256I.m6111e(jOptLong);
                        strM6111e2 = jOptLong2 == 0 ? "0 B" : C2256I.m6111e(jOptLong2);
                    }
                    final String str3 = "👤 用户：" + strOptString + "\n\n👑️ 会员类型：" + (iOptInt == 1 ? "VIP会员" : "普通用户") + "\n\n💾 存储空间：" + strM6111e + " / " + strM6111e2 + "\n";
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.43.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str3);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView3 = textView2;
                    final String str4 = "获取失败：" + e.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.43.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str4);
                        }
                    });
                }
            }
        }).start();
    }

    private void newbili(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 哔哩哔哩个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C2256I.m6110c(400), -2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView2, layoutParams2);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.f5623a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.73
            @Override // java.lang.Runnable
            public void run() {
                String str;
                try {
                    String strM6164a = C2268k.m6164a(C2268k.m6166b("/bili_cookie.txt"));
                    if (TextUtils.isEmpty(strM6164a)) {
                        final String str2 = "获取失败：Cookie为空，请先登录";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.73.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str2);
                            }
                        });
                        return;
                    }
                    String strOptString = new JSONObject(strM6164a).optString("cookie");
                    if (TextUtils.isEmpty(strOptString)) {
                        final String str3 = "获取失败：Cookie字段为空";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.73.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str3);
                            }
                        });
                        return;
                    }
                    HashMap map2 = new HashMap();
                    map2.put("Referer", "https://www.bilibili.com/");
                    map2.put("Cookie", strOptString);
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                    JSONObject jSONObject = new JSONObject(C2238b.m6073l("https://api.bilibili.com/x/web-interface/nav", map2));
                    if (jSONObject.optInt("code") != 0) {
                        TextView textView3 = textView2;
                        final String str4 = "获取信息失败：" + jSONObject.optString("message");
                        textView3.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.73.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str4);
                            }
                        });
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        final String str5 = "获取失败：数据为空";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.73.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str5);
                            }
                        });
                        return;
                    }
                    if (!jSONObjectOptJSONObject.optBoolean("isLogin")) {
                        final String str6 = "获取失败：未登录状态";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.73.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str6);
                            }
                        });
                        return;
                    }
                    String strOptString2 = jSONObjectOptJSONObject.optString("uname");
                    long jOptLong = jSONObjectOptJSONObject.optLong("mid");
                    int iOptInt = jSONObjectOptJSONObject.optInt("money");
                    jSONObjectOptJSONObject.optInt("moral");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("level_info");
                    int iOptInt2 = 0;
                    int iOptInt3 = 0;
                    int iOptInt4 = 0;
                    if (jSONObjectOptJSONObject2 != null) {
                        iOptInt2 = jSONObjectOptJSONObject2.optInt("current_level");
                        iOptInt3 = jSONObjectOptJSONObject2.optInt("current_exp");
                        iOptInt4 = jSONObjectOptJSONObject2.optInt("next_exp");
                    }
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("vip");
                    int iOptInt5 = 0;
                    int iOptInt6 = 0;
                    long jOptLong2 = 0;
                    if (jSONObjectOptJSONObject3 != null) {
                        iOptInt5 = jSONObjectOptJSONObject3.optInt("status");
                        iOptInt6 = jSONObjectOptJSONObject3.optInt("type");
                        jOptLong2 = jSONObjectOptJSONObject3.optLong("due_date");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("👤 用户名：");
                    sb.append(strOptString2);
                    sb.append("\n\n");
                    sb.append("🎭 UID：");
                    sb.append(jOptLong);
                    sb.append("\n\n");
                    sb.append("💎 等级：");
                    sb.append(iOptInt2);
                    sb.append("\n\n");
                    sb.append("📊 经验：");
                    sb.append(iOptInt3);
                    sb.append(" / ");
                    sb.append(iOptInt4);
                    sb.append("\n\n");
                    sb.append("💰 硬币：");
                    sb.append(iOptInt);
                    sb.append("\n\n");
                    if (iOptInt5 > 0) {
                        sb.append("👑 大会员：");
                        if (iOptInt6 == 2) {
                            str = "年度大会员";
                        } else {
                            str = iOptInt6 == 1 ? "月度大会员" : "已开通";
                        }
                        sb.append(str);
                        sb.append("\n\n");
                        sb.append("⏰ 到期时间：");
                        sb.append(jOptLong2);
                    } else {
                        sb.append("👑 大会员：未开通");
                    }
                    final String string = sb.toString();
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.73.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(string);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView4 = textView2;
                    final String str7 = "获取失败：" + e.getMessage();
                    textView4.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.73.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str7);
                        }
                    });
                }
            }
        }).start();
    }

    private void newguangya(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 光鸭个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C2256I.m6110c(400), -2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C2256I.m6110c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.92
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C2253G.this.dismissAlertDialog();
                C2253G.this.callShowGuangyaRegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(45));
        int iM6110c2 = C2256I.m6110c(40);
        layoutParams3.leftMargin = iM6110c2;
        layoutParams3.rightMargin = iM6110c2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.f5623a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.93
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C2145G c2145gM5459r = C2145G.m5459r();
                    Thread.sleep(1500L);
                    String strM5468j = c2145gM5459r.m5468j();
                    if (TextUtils.isEmpty(strM5468j)) {
                        final String str = "未登录光鸭账号，请先登录";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.93.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str);
                            }
                        });
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(strM5468j);
                    String str2 = jSONObject.optString("token_type") + " " + jSONObject.optString("access_token");
                    HashMap map2 = new HashMap();
                    map2.put("Authorization", str2);
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36 Edg/147.0.0.0");
                    JSONObject jSONObject2 = new JSONObject(C2238b.m6073l("https://account.guangyapan.com/v1/user/me", map2));
                    if (!TextUtils.isEmpty(jSONObject2.optString("error"))) {
                        final String str3 = "获取失败：token已失效或账号异常";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.93.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str3);
                            }
                        });
                        return;
                    }
                    String strOptString = jSONObject2.optString("sub");
                    String strOptString2 = jSONObject2.optString("name");
                    String strOptString3 = jSONObject2.optString("phone_number");
                    String strOptString4 = jSONObject2.optString("created_at");
                    String strOptString5 = jSONObject2.optString("password_updated_at");
                    if (strOptString4 != null) {
                        strOptString4 = strOptString4.replace("T", " ").replaceAll("\\..*Z", "");
                    }
                    if (strOptString5 != null) {
                        strOptString5 = strOptString5.replace("T", " ").replaceAll("\\..*Z", "");
                    }
                    final String str4 = "👤 用户：" + strOptString2 + "\n\n🆔 ID：" + strOptString + "\n\n📱 手机：" + strOptString3 + "\n\n📅 注册时间：" + strOptString4 + "\n\n🔑 密码更新：" + strOptString5;
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.93.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str4);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView3 = textView2;
                    final String str5 = "获取失败：" + e.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.93.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str5);
                        }
                    });
                }
            }
        }).start();
    }

    private void newquark(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 夸克个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C2256I.m6110c(400), -2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册（送1T空间）");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C2256I.m6110c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C2253G.this.dismissAlertDialog();
                C2253G.this.callShowQuarkRegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(45));
        int iM6110c2 = C2256I.m6110c(40);
        layoutParams3.leftMargin = iM6110c2;
        layoutParams3.rightMargin = iM6110c2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.f5623a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.23
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String strNickname = C2187w.m5760e().nickname();
                    String strM5773j = C2187w.m5760e().m5773j();
                    HashMap map2 = new HashMap();
                    map2.put("Referer", "https://pan.quark.cn");
                    map2.put("Cookie", strM5773j);
                    map2.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch");
                    JSONObject jSONObjectOptJSONObject = new JSONObject(C2238b.m6073l("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&fetch_subscribe=true&_ch=home&fetch_identity=true", map2)).optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        final String str = "获取失败：账号未登录或Cookie已失效";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.23.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str);
                            }
                        });
                        return;
                    }
                    String strOptString = jSONObjectOptJSONObject.optString("member_type");
                    long jOptLong = jSONObjectOptJSONObject.optLong("use_capacity");
                    long jOptLong2 = jSONObjectOptJSONObject.optLong("total_capacity");
                    long jOptLong3 = jSONObjectOptJSONObject.optLong("super_vip_exp_at");
                    String strM6111e = jOptLong == 0 ? "0 B" : C2256I.m6111e(jOptLong);
                    String strM6111e2 = jOptLong2 == 0 ? "0 B" : C2256I.m6111e(jOptLong2);
                    final String str2 = "👤 用户：" + strNickname + "\n\n👑 会员：" + strOptString + "\n\n⏳ 到期时间：" + (jOptLong3 == 0 ? "已过期" : new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.CHINA).format(new Date(jOptLong3))) + "\n\n💾 已用空间：" + strM6111e + " / " + strM6111e2;
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.23.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str2);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView3 = textView2;
                    final String str3 = "获取失败：" + e.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.23.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str3);
                        }
                    });
                }
            }
        }).start();
    }

    private void newuc(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 UC个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C2256I.m6110c(400), -2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册（送1T空间）");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C2256I.m6110c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.32
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C2253G.this.dismissAlertDialog();
                C2253G.this.callShowUCRegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(45));
        int iM6110c2 = C2256I.m6110c(40);
        layoutParams3.leftMargin = iM6110c2;
        layoutParams3.rightMargin = iM6110c2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.f5623a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.33
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String strNickname = C2144B.m5419c().nickname();
                    String strM5439j = C2144B.m5419c().m5439j();
                    HashMap map2 = new HashMap();
                    map2.put("Referer", "https://drive.uc.cn");
                    map2.put("Cookie", strM5439j);
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
                    JSONObject jSONObjectOptJSONObject = new JSONObject(C2238b.m6073l("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home", map2)).optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        final String str = "获取失败：账号未登录或Cookie已失效";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.33.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str);
                            }
                        });
                        return;
                    }
                    String strOptString = jSONObjectOptJSONObject.optString("member_type");
                    long jOptLong = jSONObjectOptJSONObject.optLong("use_capacity");
                    long jOptLong2 = jSONObjectOptJSONObject.optLong("total_capacity");
                    long jOptLong3 = jSONObjectOptJSONObject.optLong("super_vip_exp_at");
                    String strM6111e = jOptLong == 0 ? "0 B" : C2256I.m6111e(jOptLong);
                    String strM6111e2 = jOptLong2 == 0 ? "0 B" : C2256I.m6111e(jOptLong2);
                    String str2 = jOptLong3 == 0 ? "已过期" : new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.CHINA).format(new Date(jOptLong3));
                    StringBuilder sb = new StringBuilder();
                    sb.append("👤 用户：");
                    sb.append(strNickname);
                    sb.append("\n\n");
                    sb.append("👑 会员：");
                    sb.append(strOptString);
                    sb.append("\n\n");
                    sb.append("⏳ 到期时间：");
                    sb.append(str2);
                    sb.append("\n\n");
                    sb.append("💾 已用空间：");
                    sb.append(strM6111e);
                    sb.append(" / ");
                    sb.append(strM6111e2);
                    sb.append("\n\n");
                    String strM6164a = C2268k.m6164a(C2268k.m6166b("/uc_token.txt"));
                    sb.append((strM6164a == null || strM6164a.length() == 0) ? "🖥️ UC TV Token：未登录" : "🖥️ UC TV Token：已登录");
                    final String string = sb.toString();
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.33.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(string);
                        }
                    });
                } catch (Throwable th) {
                    th.printStackTrace();
                    TextView textView3 = textView2;
                    final String str3 = "获取失败：" + th.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.33.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str3);
                        }
                    });
                }
            }
        }).start();
    }

    private void newxunlei(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 迅雷个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C2256I.m6110c(400), -2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C2256I.m6110c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.82
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C2253G.this.dismissAlertDialog();
                C2253G.this.callShowXunleiRegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(45));
        int iM6110c2 = C2256I.m6110c(40);
        layoutParams3.leftMargin = iM6110c2;
        layoutParams3.rightMargin = iM6110c2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.f5623a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.83
            @Override // java.lang.Runnable
            public void run() {
                String str;
                JSONObject jSONObjectOptJSONObject;
                StringBuilder sb;
                String str2;
                try {
                    C2156X c2156xM5559m = C2156X.m5559m();
                    Thread.sleep(1500L);
                    String strM5571j = c2156xM5559m.m5571j();
                    if (TextUtils.isEmpty(strM5571j)) {
                        final String str3 = "未登录迅雷账号，请先登录";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.83.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str3);
                            }
                        });
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(strM5571j);
                    String str4 = jSONObject.optString("token_type") + " " + jSONObject.optString("access_token");
                    HashMap map2 = new HashMap();
                    map2.put("Authorization", str4);
                    map2.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.31.0.9726 netWorkType/5G appid/40 deviceName/Xiaomi_M2004j7ac deviceModel/M2004J7AC OSVersion/12 protocolVersion/301 platformVersion/10 sdkVersion/512000 Oauth2Client/0.9 (Linux 4_14_186-perf-gddfs8vbb238b) (JAVA 0)");
                    JSONObject jSONObject2 = new JSONObject(C2238b.m6073l("https://xluser-ssl.xunlei.com/v1/user/me", map2));
                    if (!TextUtils.isEmpty(jSONObject2.optString("error"))) {
                        final String str5 = "获取失败：token已失效或账号异常";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.83.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str5);
                            }
                        });
                        return;
                    }
                    String strOptString = jSONObject2.optString("name");
                    String strOptString2 = jSONObject2.optString("email");
                    String strOptString3 = jSONObject2.optString("phone_number");
                    String strOptString4 = jSONObject2.optString("sub");
                    String strOptString5 = jSONObject2.optString("gender");
                    if ("male".equals(strOptString5)) {
                        str = "👨 男";
                    } else {
                        str = "female".equals(strOptString5) ? "👩 女" : "❓ 未知";
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("vip_info");
                    String string = "普通用户";
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0 && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
                        int iOptInt = jSONObjectOptJSONObject.optInt("is_vip");
                        int iOptInt2 = jSONObjectOptJSONObject.optInt("level");
                        if (iOptInt == 1) {
                            sb = new StringBuilder();
                            str2 = "💎 VIP会员 Lv.";
                        } else {
                            sb = new StringBuilder();
                            str2 = "⭐ 普通用户 Lv.";
                        }
                        sb.append(str2);
                        sb.append(iOptInt2);
                        string = sb.toString();
                    }
                    final String str6 = "👤 用户：" + strOptString + "\n\n🆔 ID：" + strOptString4 + "\n\n👤 性别：" + str + "\n\n📧 邮箱：" + strOptString2 + "\n\n📱 手机：" + strOptString3 + "\n\n👑 会员：" + string;
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.83.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str6);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView3 = textView2;
                    final String str7 = "获取失败：" + e.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.support.p128m.G.83.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str7);
                        }
                    });
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m6097o(C2253G c2253g, Map map) {
        c2253g.m6082C();
        map.put("button", "0");
        map.put("input", "1");
        c2253g.m6104w(map);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m6098p(C2253G c2253g, Map map, String str) {
        c2253g.getClass();
        map.put("push", "");
        map.put("flag", c2253g.m6100r(str));
        map.put("button", "1");
        Init.execute(new RunnableC2274q(c2253g, map, 1));
    }

    private void pansou(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("盘搜域名");
        String[] strArr = {"https://so.252035.xyz", "http://luosz.top:2000", "https://pan.199333.xyz", "http://sou.ooil.cn"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("pansouUrl");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0097j()).create().show();
    }

    private void proxyMode(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iM6110c = C2256I.m6110c(20);
        int iM6110c2 = C2256I.m6110c(12);
        linearLayout.setPadding(iM6110c, iM6110c2, iM6110c, iM6110c2);
        TextView textView = new TextView(Init.context());
        textView.setText("🌐 多线程状态");
        textView.setGravity(17);
        textView.setTextColor(-125269880);
        textView.setTextSize(22.0f);
        textView.setTypeface(Typeface.defaultFromStyle(0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C2256I.m6110c(8);
        linearLayout.addView(textView, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(Init.context());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        TextView textView2 = new TextView(Init.context());
        textView2.setText("🐢 Go: 检测中...");
        textView2.setGravity(17);
        textView2.setTextColor(-125269880);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(Typeface.defaultFromStyle(0));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.rightMargin = C2256I.m6110c(20);
        linearLayout2.addView(textView2, layoutParams2);
        View view = new View(Init.context());
        view.setBackgroundColor(-3355444);
        linearLayout2.addView(view, new LinearLayout.LayoutParams(1, C2256I.m6110c(32)));
        TextView textView3 = new TextView(Init.context());
        textView3.setText("☕ Java: 检测中...");
        textView3.setGravity(17);
        textView3.setTextColor(-125269880);
        textView3.setTextSize(14.0f);
        textView3.setTypeface(Typeface.defaultFromStyle(0));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = C2256I.m6110c(20);
        linearLayout2.addView(textView3, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.bottomMargin = C2256I.m6110c(16);
        linearLayout.addView(linearLayout2, layoutParams4);
        String[] strArr = {"🐢 Go多线程（高性能）", "☕ Java多线程（稳定）"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("proxyMode");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].contains(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("选择代理引擎").setView(linearLayout).setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0098k()).create();
        alertDialogCreate.show();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        new Thread(new b(textView2, textView3)).start();
    }

    /* JADX INFO: renamed from: q */
    public static C2253G m6099q() {
        return a.f5628a;
    }

    private void quarkQuality(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("夸克网盘画质");
        String[] strArr = {"夸克原画", "夸克普画", "夸克无限", "夸克原画|夸克普画", "夸克普画|夸克原画"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("quarkQuality");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0090c()).create().show();
    }

    private void quarkThread(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("夸克网盘线程");
        String[] strArr = {"4", "8", "16", "32", "64", "128", "256"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("quarkThread");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0093f()).create().show();
    }

    private void quarktip(Map<String, String> map) {
        Application applicationContext = Init.context();
        LinearLayout linearLayout = new LinearLayout(applicationContext);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iM6110c = C2256I.m6110c(24);
        int iM6110c2 = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c2, iM6110c, iM6110c2);
        TextView textView = new TextView(applicationContext);
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-15066598);
        textView.setTextSize(24.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(16);
        linearLayout.addView(textView, layoutParams);
        View view = new View(applicationContext);
        view.setBackgroundColor(-1512723);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(2));
        layoutParams2.bottomMargin = C2256I.m6110c(12);
        linearLayout.addView(view, layoutParams2);
        TextView textView2 = new TextView(applicationContext);
        textView2.setText("✦ 夸克原画\n4K画质，超级会员不限速，非会员建议观看10G以内视频\n\n✦ 夸克普画\n转码画质，超级会员4K，非会员标清\n\n✦ 夸克无限\n4K画质，不转存，超级会员不限速，非会员建议观看30G以内视频");
        textView2.setGravity(0);
        textView2.setTextColor(-10525848);
        textView2.setTextSize(14.0f);
        textView2.setLineSpacing(1.5f, 1.5f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = C2256I.m6110c(16);
        linearLayout.addView(textView2, layoutParams3);
        TextView textView3 = new TextView(applicationContext);
        textView3.setText("⚠ 夸克网盘会自动创建临时缓存文件夹 Quarktemp，文件夹内的文件会定时清空，请不要存放任何文件！");
        textView3.setGravity(17);
        textView3.setTextColor(-3857889);
        textView3.setTextSize(13.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-202522);
        gradientDrawable.setCornerRadius(8.0f);
        textView3.setBackground(gradientDrawable);
        int iM6110c3 = C2256I.m6110c(12);
        textView3.setPadding(iM6110c3, iM6110c3, iM6110c3, iM6110c3);
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-1, -2));
        TextView textView4 = new TextView(applicationContext);
        textView4.setText("✓ 我知道了");
        textView4.setGravity(17);
        textView4.setTextColor(-15043608);
        textView4.setTextSize(16.0f);
        textView4.setOnClickListener(new AnonymousClass8());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = C2256I.m6110c(24);
        layoutParams4.gravity = 1;
        linearLayout.addView(textView4, layoutParams4);
        Init.execute(new RunnableC2274q(this, map, 0));
        this.f5623a = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    /* JADX INFO: renamed from: r */
    private String m6100r(String str) {
        if ("ali".equals(str)) {
            return "请使用阿里云盘APP扫码";
        }
        if ("quark".equals(str)) {
            return "请使用夸克浏览器扫码";
        }
        if ("uc".equals(str)) {
            return "请使用UC浏览器扫码";
        }
        if ("xunlei".equals(str)) {
            return "请使用迅雷APP扫码";
        }
        if ("guangya".equals(str)) {
            return "请使用光鸭云盘APP扫码";
        }
        if ("bili".equals(str)) {
            return "请使用哔哩哔哩APP扫码";
        }
        return "cloud189".equals(str) ? "请使用天翼云盘APP扫码" : "请使用浏览器或者微信扫描二维码";
    }

    public static void restartApp() {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new HH$1(Init.context()), 500L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: s */
    private JSONObject m6101s(String str) {
        String strM5959l;
        try {
            JSONObject jSONObject = new JSONObject();
            if ("ali".equals(str)) {
                String strM6073l = C2238b.m6073l("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null);
                C2200d c2200dM5879c = C2200d.m5876g(strM6073l).m5878b().m5879c();
                SpiderDebug.log(c2200dM5879c.toString());
                jSONObject.put("url", c2200dM5879c.m5877a());
                jSONObject.put("token", new JSONObject(c2200dM5879c.m5880d()));
                jSONObject.put("json", strM6073l);
            } else {
                if ("quark".equals(str)) {
                    HashMap map = new HashMap();
                    map.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch");
                    strM5959l = new JSONObject(C2238b.m6073l("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2", map)).optJSONObject("data").optJSONObject("members").optString("token");
                    jSONObject.put("url", "https://su.quark.cn/4_eMHBJ?token=" + strM5959l + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
                } else if ("uc".equals(str)) {
                    HashMap map2 = new HashMap();
                    map2.put("Accept", "application/json, text/plain, */*");
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                    map2.put("Referer", "https://broccoli.uc.cn/");
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    strM5959l = new JSONObject(C2238b.m6073l("https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?pr=UCBrowser&fr=pc&sys=win32&client_id=529&v=1.2&request_id=" + sb.toString(), map2)).optJSONObject("data").optJSONObject("members").optString("token");
                    jSONObject.put("url", "https://su.uc.cn/4_fzMj2?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=" + strM5959l + "&client_id=529&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
                } else if ("xunlei".equals(str)) {
                    HashMap map3 = new HashMap();
                    map3.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.31.0.9726 netWorkType/5G appid/40 deviceName/Xiaomi_M2004j7ac deviceModel/M2004J7AC OSVersion/12 protocolVersion/301 platformVersion/10 sdkVersion/512000 Oauth2Client/0.9 (Linux 4_14_186-perf-gddfs8vbb238b) (JAVA 0)");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("client_id", "XW-G4v1H72tgfJym");
                    jSONObject2.put("scope", "");
                    JSONObject jSONObject3 = new JSONObject(C2238b.m6066f("https://xluser-ssl.xunlei.com/v1/auth/device/code", jSONObject2.toString(), map3).m6076a());
                    jSONObject.put("url", jSONObject3.optString("verification_uri_complete"));
                    strM5959l = jSONObject3.optString("device_code");
                } else if ("guangya".equals(str)) {
                    HashMap map4 = new HashMap();
                    map4.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36 Edg/147.0.0.0");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("client_id", "aMe-8VSlkrbQXpUR");
                    jSONObject4.put("scope", "user");
                    JSONObject jSONObject5 = new JSONObject(C2238b.m6066f("https://account.guangyapan.com/v1/auth/device/code", jSONObject4.toString(), map4).m6076a());
                    jSONObject.put("url", jSONObject5.optString("verification_uri_complete"));
                    strM5959l = jSONObject5.optString("device_code");
                } else if ("bili".equals(str)) {
                    HashMap map5 = new HashMap();
                    map5.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                    C2213b c2213bM5982a = C2216e.m5981b(C2238b.m6073l("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini", map5)).m5982a();
                    jSONObject.put("url", c2213bM5982a.m5964q());
                    strM5959l = c2213bM5982a.m5959l();
                } else if ("cloud".equals(str)) {
                    if (C2178l.m5722k()) {
                        jSONObject.put("url", C2178l.m5718c().m5733j());
                    }
                } else if ("baidu".equals(str)) {
                    C2176j.m5694o();
                }
                jSONObject.put("token", strM5959l);
            }
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    private void show123RegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册123云盘 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapM6179a = C2270m.m6179a("https://www.123pan.com");
        if (bitmapM6179a != null) {
            imageView.setImageBitmap(bitmapM6179a);
        }
        int iM6110c2 = C2256I.m6110c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM6110c2, iM6110c2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void show189RegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册天翼云盘 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapM6179a = C2270m.m6179a("https://h5.cloud.189.cn");
        if (bitmapM6179a != null) {
            imageView.setImageBitmap(bitmapM6179a);
        }
        int iM6110c2 = C2256I.m6110c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM6110c2, iM6110c2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void showAliyunRegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册阿里云盘 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapM6179a = C2270m.m6179a("https://www.alipan.com");
        if (bitmapM6179a != null) {
            imageView.setImageBitmap(bitmapM6179a);
        }
        int iM6110c2 = C2256I.m6110c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM6110c2, iM6110c2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0141 A[Catch: Exception -> 0x0165, TryCatch #0 {Exception -> 0x0165, blocks: (B:4:0x0009, B:6:0x001f, B:8:0x0038, B:11:0x0087, B:13:0x008f, B:15:0x0093, B:16:0x0097, B:18:0x00a8, B:20:0x00b0, B:28:0x00e6, B:30:0x00fd, B:34:0x0111, B:36:0x0119, B:38:0x0121, B:40:0x0129, B:41:0x0134, B:29:0x00f1, B:22:0x00b8, B:24:0x00c8, B:26:0x00d7, B:44:0x0156, B:43:0x0141, B:5:0x000c), top: B:48:0x0007 }] */
    private void showAuthDialog(final Map map, final String str, String str2, boolean z, boolean z2, boolean z3) {
        try {
            String strOptString = z3 ? this.f5624b : new JSONObject((String) map.get("url")).optString("url");
            LinearLayout linearLayout = new LinearLayout(Init.context());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(-1);
            if (z) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = C2256I.m6110c(20);
                TextView textView = new TextView(Init.context());
                textView.setText(str2);
                textView.setGravity(17);
                textView.setTextColor(-16777216);
                linearLayout.addView(textView, layoutParams);
                ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                ImageView imageView = new ImageView(Init.context());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setImageBitmap(C2270m.m6179a(strOptString));
                linearLayout.addView(imageView, layoutParams2);
                Init.execute(new RunnableC2273p(this, map, 0));
            }
            final EditText editTextAddInputWithHint = null;
            if (z2) {
                if ("cloud".equals(str)) {
                    m6106y(map);
                    return;
                }
                editTextAddInputWithHint = addInputWithHint(linearLayout, str);
            }
            AlertDialog.Builder view = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout);
            if (z) {
                if (!"xunlei".equals(str) && !"guangya".equals(str)) {
                    AlertDialog.Builder positiveButton = z3 ? view.setPositiveButton("扫码授权", new DialogInterfaceOnClickListenerC2272o(this, map, str, 0)) : view.setPositiveButton("远程输入", new DialogInterfaceOnClickListenerC2281x(this, map, 0));
                    if ((Init.context().getPackageManager().hasSystemFeature("android.hardware.type.television") ? false : true) && !"ali".equals(str) && !"cloud123".equals(str) && !"cloud".equals(str)) {
                        positiveButton = positiveButton.setNeutralButton("APP授权", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.A
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C2253G.m6084b(this.f5606a, map);
                            }
                        });
                    }
                    view = positiveButton.setNegativeButton("手动输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.B
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C2253G.m6097o(this.f5608a, map);
                        }
                    });
                    if (z2) {
                        final EditText editText = null;
                        view = view.setNeutralButton("扫码授权", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.F
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C2253G.m6087e(this.f5620a, map, str);
                            }
                        }).setNegativeButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.z
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                final C2253G c2253g = this.f5703a;
                                final EditText editText2 = editTextAddInputWithHint;
                                final String str3 = str;
                                EditText editText3 = editText;
                                c2253g.getClass();
                                if (editText2 != null && !TextUtils.isEmpty(editText2.getText().toString())) {
                                    Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.p128m.w
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C2253G.m6089g(c2253g, str3, editText2);
                                        }
                                    });
                                }
                                if (editText3 == null || TextUtils.isEmpty(editText3.getText().toString())) {
                                    return;
                                }
                                Init.execute(new RunnableC2184r(c2253g, editText3, 4));
                            }
                        });
                    }
                } else {
                    if (Init.context().getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                        AlertDialog alertDialogShow = view.show();
                        this.f5623a = alertDialogShow;
                        alertDialogShow.setOnCancelListener(new DialogInterfaceOnCancelListenerC2255H0(this));
                        return;
                    }
                    view = view.setNeutralButton("APP授权", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.A
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C2253G.m6084b(this.f5606a, map);
                        }
                    });
                }
            } else if (z2) {
                final EditText editText2 = null;
                view = view.setNeutralButton("扫码授权", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.F
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C2253G.m6087e(this.f5620a, map, str);
                    }
                }).setNegativeButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.z
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final C2253G c2253g = this.f5703a;
                        final EditText editText3 = editTextAddInputWithHint;
                        final String str3 = str;
                        EditText editText4 = editText2;
                        c2253g.getClass();
                        if (editText3 != null && !TextUtils.isEmpty(editText3.getText().toString())) {
                            Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.p128m.w
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2253G.m6089g(c2253g, str3, editText3);
                                }
                            });
                        }
                        if (editText4 == null || TextUtils.isEmpty(editText4.getText().toString())) {
                            return;
                        }
                        Init.execute(new RunnableC2184r(c2253g, editText4, 4));
                    }
                });
            }
            AlertDialog alertDialogShow2 = view.show();
            this.f5623a = alertDialogShow2;
            alertDialogShow2.setOnCancelListener(new DialogInterfaceOnCancelListenerC2255H0(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showBaiduRegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册百度网盘 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapM6179a = C2270m.m6179a("https://pan.baidu.com");
        if (bitmapM6179a != null) {
            imageView.setImageBitmap(bitmapM6179a);
        }
        int iM6110c2 = C2256I.m6110c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM6110c2, iM6110c2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void showGuangyaRegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册光鸭云盘 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapM6179a = C2270m.m6179a("https://app.guangyapan.com/pan");
        if (bitmapM6179a != null) {
            imageView.setImageBitmap(bitmapM6179a);
        }
        int iM6110c2 = C2256I.m6110c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM6110c2, iM6110c2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void showQuarkRegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册夸克网盘 ✨\n✨ 新用户注册赠送1T空间 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapM6179a = C2270m.m6179a("https://pan.quark.cn/s/24f565ff8b77");
        if (bitmapM6179a != null) {
            imageView.setImageBitmap(bitmapM6179a);
        }
        int iM6110c2 = C2256I.m6110c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM6110c2, iM6110c2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void showUCRegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册UC网盘 ✨\n✨ 新用户注册赠送1T空间 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapM6179a = C2270m.m6179a("https://drive.uc.cn/s/81ab6c3095e24");
        if (bitmapM6179a != null) {
            imageView.setImageBitmap(bitmapM6179a);
        }
        int iM6110c2 = C2256I.m6110c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM6110c2, iM6110c2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void showXunleiRegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册迅雷云盘 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapM6179a = C2270m.m6179a("https://pan.xunlei.com");
        if (bitmapM6179a != null) {
            imageView.setImageBitmap(bitmapM6179a);
        }
        int iM6110c2 = C2256I.m6110c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM6110c2, iM6110c2);
        layoutParams2.topMargin = C2256I.m6110c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    /* JADX INFO: renamed from: u */
    private String m6102u(String str, String str2) {
        String str3;
        String str4;
        try {
            if ("ali".equals(str)) {
                C2175i.m5662d().m5681t(str2);
            } else if ("quark".equals(str)) {
                if (C2187w.m5760e().m5783v(str2)) {
                    C2256I.m6113i("夸克网盘授权成功");
                }
            } else if ("uc".equals(str)) {
                if (C2144B.m5419c().m5448t(str2)) {
                    C2256I.m6113i("UC网盘授权成功");
                }
            } else if ("xunlei".equals(str)) {
                if (C2156X.m5559m().m5579t(str2)) {
                    C2256I.m6113i("迅雷云盘授权成功");
                }
            } else if ("guangya".equals(str)) {
                if (C2145G.m5459r().m5473t(str2)) {
                    C2256I.m6113i("光鸭云盘授权成功");
                }
            } else if ("bili".equals(str)) {
                if (AmuBiliV2.refreshUser(str2)) {
                    C2256I.m6113i("哔哩哔哩授权成功");
                }
            } else if ("123panfxck".equals(str)) {
                C2175i.m5662d().m5685x(str2);
            } else {
                if ("cloud123".equals(str)) {
                    String[] strArrSplit = str2.split("\\|");
                    if (C2179m.m5742a().m5752j(strArrSplit[0], strArrSplit[1])) {
                        str4 = "123云盘登录成功";
                    } else {
                        str4 = "123云盘登录失败:" + C2179m.m5742a().m5749f();
                    }
                    if (strArrSplit.length == 3) {
                        C2256I.m6113i(str4);
                    }
                    m6081B();
                    return str4;
                }
                if ("cloud189".equals(str)) {
                    String[] strArrSplit2 = str2.split("\\|");
                    if (C2178l.m5718c().m5728b(strArrSplit2[0], strArrSplit2[1])) {
                        str3 = "天翼云盘登录成功";
                    } else {
                        str3 = "天翼云盘登录失败:" + C2178l.m5718c().m5732i();
                    }
                    if (strArrSplit2.length == 3) {
                        C2256I.m6113i(str3);
                    }
                    m6081B();
                    return str3;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            m6081B();
            throw th;
        }
        m6081B();
        return "推送成功,请在设备上查看";
    }

    private void ucQuality(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("UC网盘画质");
        String[] strArr = {"UC原画", "UC普画", "UC无限", "UC原画|UC普画", "UC普画|UC原画"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("ucQuality");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0091d()).create().show();
    }

    private void ucThread(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("UC网盘线程");
        String[] strArr = {"自动", "4", "8", "16", "32", "64", "128", "256"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("ucThread");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0094g()).create().show();
    }

    private void uctip(Map<String, String> map) {
        Application applicationContext = Init.context();
        LinearLayout linearLayout = new LinearLayout(applicationContext);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iM6110c = C2256I.m6110c(24);
        int iM6110c2 = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c2, iM6110c, iM6110c2);
        TextView textView = new TextView(applicationContext);
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-15066598);
        textView.setTextSize(24.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(16);
        linearLayout.addView(textView, layoutParams);
        View view = new View(applicationContext);
        view.setBackgroundColor(-1512723);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C2256I.m6110c(2));
        layoutParams2.bottomMargin = C2256I.m6110c(12);
        linearLayout.addView(view, layoutParams2);
        TextView textView2 = new TextView(applicationContext);
        textView2.setText("✦ UC原画\n4K画质，超级会员不限速，非会员建议观看5G以内的视频\n\n✦ UC普画\n转码画质，超级会员4K，非会员标清\n\n✦ UC普画(设置UC TV)\n转码4K画质，不限速\n\n✦ UC无限\n4K画质，不转存，不限速");
        textView2.setGravity(0);
        textView2.setTextColor(-10525848);
        textView2.setTextSize(14.0f);
        textView2.setLineSpacing(1.5f, 1.5f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = C2256I.m6110c(16);
        linearLayout.addView(textView2, layoutParams3);
        TextView textView3 = new TextView(applicationContext);
        textView3.setText("⚠ UC网盘会自动创建临时缓存文件夹 UCtemp，文件夹内的文件会定时清空，请不要存放任何文件！");
        textView3.setGravity(17);
        textView3.setTextColor(-3857889);
        textView3.setTextSize(13.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-202522);
        gradientDrawable.setCornerRadius(8.0f);
        textView3.setBackground(gradientDrawable);
        int iM6110c3 = C2256I.m6110c(12);
        textView3.setPadding(iM6110c3, iM6110c3, iM6110c3, iM6110c3);
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-1, -2));
        TextView textView4 = new TextView(applicationContext);
        textView4.setText("✓ 我知道了");
        textView4.setGravity(17);
        textView4.setTextColor(-15043608);
        textView4.setTextSize(16.0f);
        textView4.setOnClickListener(new AnonymousClass8());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = C2256I.m6110c(24);
        layoutParams4.gravity = 1;
        linearLayout.addView(textView4, layoutParams4);
        Init.execute(new RunnableC2274q(this, map, 0));
        this.f5623a = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void update(Map<String, String> map) {
        new AlertDialog.Builder(Init.getConfigActivity()).setTitle("检查更新").setMessage("请选择操作").setPositiveButton("开启", new UpdateListener(true)).setNegativeButton("关闭", new UpdateListener(false)).create().show();
    }

    public static void updateCloudConfig(boolean z, Context context, String str) {
        String str2 = null;
        try {
            File fileM6169c = C2268k.m6169c("/config.json");
            JsonObject jsonObject = new JsonObject();
            if (fileM6169c.exists() && fileM6169c.length() > 0) {
                String strM6164a = C2268k.m6164a(fileM6169c);
                if (strM6164a.length() > 0) {
                    jsonObject = new JsonParser().parse(strM6164a).getAsJsonObject();
                }
            }
            String asString = jsonObject.has("panBlock") ? jsonObject.get("panBlock").getAsString() : "";
            if (z) {
                if (asString.contains(str)) {
                    jsonObject.addProperty("panBlock", asString.replace("," + str, "").replace(str + ",", "").replace(str, ""));
                    C2268k.m6168c(fileM6169c, jsonObject.toString());
                    str2 = str + "已开启";
                } else {
                    str2 = str + "已是开启状态";
                }
            } else if (!asString.contains(str)) {
                jsonObject.addProperty("panBlock", asString.isEmpty() ? str : asString + "," + str);
                C2268k.m6168c(fileM6169c, jsonObject.toString());
                str2 = str + "已关闭";
            }
            if (str2 == null) {
                str2 = str + "已是关闭状态";
            }
            Toast.makeText(context, str2, 0).show();
        } catch (Exception e) {
            e.printStackTrace();
            C2256I.m6113i("操作失败");
        }
    }

    /* JADX INFO: renamed from: v */
    private void m6103v(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iM6110c = C2256I.m6110c(20);
        linearLayout.setPadding(iM6110c, iM6110c, iM6110c, iM6110c);
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C2256I.m6110c(16);
        linearLayout.addView(textView, layoutParams);
        int iM6110c2 = C2256I.m6110c(200);
        ImageView imageView = new ImageView(Init.context());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(C2176j.m5689f().m5706n());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM6110c2, iM6110c2);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        Init.execute(new RunnableC2274q(this, map, 0));
        this.f5623a = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m6104w(Map<String, String> map) {
        try {
            String str = map.get("site");
            if (handleSpecialSite(str, map)) {
                return;
            }
            if (isCloudSite(str)) {
                cloudSwitch(map);
            } else {
                showAuthDialog(map, str, map.get("flag"), !"0".equals(map.get("button")), !TextUtils.isEmpty(map.get("input")), !TextUtils.isEmpty(map.get("push")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: x */
    private void m6105x(final Map<String, String> map) {
        final EditText editText = new EditText(Init.context());
        editText.setHintTextColor(-3355444);
        editText.setHint("请输入123云盘账号");
        final EditText editText2 = new EditText(Init.context());
        editText2.setHintTextColor(-3355444);
        editText2.setHint("请输入123云盘密码");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setPadding(0, 0, 0, 0);
        String str = map.get("model");
        String str2 = map.get("flag");
        if (TextUtils.isEmpty(str)) {
            TextView textView = new TextView(Init.context());
            if (TextUtils.isEmpty(str2)) {
                str2 = "请输入123云盘账号密码";
            }
            textView.setText(str2);
            textView.setGravity(17);
            textView.setTextColor(-16777216);
            textView.setTextSize(15.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C2256I.m6110c(20);
            layoutParams.bottomMargin = C2256I.m6110c(10);
            linearLayout.addView(textView, layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            int iM6110c = C2256I.m6110c(16);
            layoutParams2.setMargins(iM6110c, 0, iM6110c, 0);
            layoutParams2.bottomMargin = C2256I.m6110c(10);
            linearLayout.addView(editText, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            int iM6110c2 = C2256I.m6110c(16);
            layoutParams3.setMargins(iM6110c2, 0, iM6110c2, 0);
            linearLayout.addView(editText2, layoutParams3);
        } else {
            TextView textView2 = new TextView(Init.context());
            textView2.setText("请使用浏览器或者微信扫描二维码");
            textView2.setGravity(17);
            textView2.setTextColor(-16777216);
            textView2.setTextSize(14.0f);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = C2256I.m6110c(20);
            layoutParams4.bottomMargin = C2256I.m6110c(10);
            linearLayout.addView(textView2, layoutParams4);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(C2256I.m6110c(200), C2256I.m6110c(200));
            layoutParams5.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C2270m.m6179a(this.f5624b));
            linearLayout.addView(imageView, layoutParams5);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout);
        this.f5623a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new DialogInterfaceOnClickListenerC2248C(this, map)).setNegativeButton("登录", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final C2253G c2253g = this.f5700a;
                final EditText editText3 = editText;
                final EditText editText4 = editText2;
                c2253g.getClass();
                Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.p128m.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2253G.m6095m(c2253g, editText3, editText4);
                    }
                });
            }
        }) : view.setNeutralButton("手动输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.D
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C2253G c2253g = this.f5614a;
                Map map2 = map;
                c2253g.getClass();
                map2.put("model", "");
                map2.put("flag", "请输入123云盘账号密码");
                Init.execute(new RunnableC2276s(c2253g, map2, 1));
            }
        })).show();
    }

    private void xunleiThread(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("迅雷云盘线程");
        String[] strArr = {"4", "6", "8", "10", "12", "14", "16"};
        int i = 0;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        if (!TextUtils.isEmpty(strM6164a)) {
            try {
                String strOptString = new JSONObject(strM6164a).optString("xunleiThread");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0081X()).create().show();
    }

    /* JADX INFO: renamed from: y */
    private void m6106y(final Map<String, String> map) {
        EditText editText = new EditText(Init.context());
        editText.setHintTextColor(-3355444);
        editText.setHint("请输入天翼云盘账号");
        EditText editText2 = new EditText(Init.context());
        editText2.setHintTextColor(-3355444);
        editText2.setHint("请输入天翼云盘密码");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setPadding(0, 0, 0, 0);
        String str = map.get("model");
        String str2 = map.get("flag");
        if (TextUtils.isEmpty(str)) {
            TextView textView = new TextView(Init.context());
            if (TextUtils.isEmpty(str2)) {
                str2 = "请输入天翼云盘账号密码";
            }
            textView.setText(str2);
            textView.setGravity(17);
            textView.setTextColor(-16777216);
            textView.setTextSize(15.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C2256I.m6110c(20);
            layoutParams.bottomMargin = C2256I.m6110c(10);
            linearLayout.addView(textView, layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            int iM6110c = C2256I.m6110c(16);
            layoutParams2.setMargins(iM6110c, 0, iM6110c, 0);
            layoutParams2.bottomMargin = C2256I.m6110c(10);
            linearLayout.addView(editText, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            int iM6110c2 = C2256I.m6110c(16);
            layoutParams3.setMargins(iM6110c2, 0, iM6110c2, 0);
            linearLayout.addView(editText2, layoutParams3);
        } else {
            TextView textView2 = new TextView(Init.context());
            textView2.setText("请使用浏览器或者微信扫描二维码");
            textView2.setGravity(17);
            textView2.setTextColor(-16777216);
            textView2.setTextSize(14.0f);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = C2256I.m6110c(20);
            layoutParams4.bottomMargin = C2256I.m6110c(10);
            linearLayout.addView(textView2, layoutParams4);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(C2256I.m6110c(200), C2256I.m6110c(200));
            layoutParams5.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C2270m.m6179a(this.f5624b));
            linearLayout.addView(imageView, layoutParams5);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout);
        this.f5623a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.E
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C2253G c2253g = this.f5618a;
                Map map2 = map;
                c2253g.getClass();
                map2.put("model", "1");
                map2.put("flag", "请使用浏览器或者微信扫描二维码");
                Init.execute(new RunnableC2277t(c2253g, map2, 0));
            }
        }).setPositiveButton("登录", new DialogInterfaceOnClickListenerC2272o(this, editText, editText2, i)).setNegativeButton("扫码授权", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                HashMap map2 = new HashMap();
                map2.put("site", "cloud");
                map2.put("push", "");
                map2.put("flag", "请使用天翼云盘APP扫码");
                map2.put("button", "1");
                Init.execute(new RunnableC2274q(C2253G.this, map2, 1));
                dialogInterface.dismiss();
            }
        }) : view.setNeutralButton("手动输入", new DialogInterfaceOnClickListenerC2281x(this, map, i)).setNegativeButton("扫码授权", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p128m.G.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                HashMap map2 = new HashMap();
                map2.put("site", "cloud");
                map2.put("push", "");
                map2.put("flag", "请使用天翼云盘APP扫码");
                map2.put("button", "1");
                Init.execute(new RunnableC2274q(C2253G.this, map2, 1));
                dialogInterface.dismiss();
            }
        })).show();
    }

    void callShow123RegisterDialog() {
        show123RegisterDialog();
    }

    void callShow189RegisterDialog() {
        show189RegisterDialog();
    }

    void callShowAliyunRegisterDialog() {
        showAliyunRegisterDialog();
    }

    void callShowBaiduRegisterDialog() {
        showBaiduRegisterDialog();
    }

    void callShowGuangyaRegisterDialog() {
        showGuangyaRegisterDialog();
    }

    void callShowQuarkRegisterDialog() {
        showQuarkRegisterDialog();
    }

    void callShowUCRegisterDialog() {
        showUCRegisterDialog();
    }

    void callShowXunleiRegisterDialog() {
        showXunleiRegisterDialog();
    }

    void dismissAlertDialog() {
        AlertDialog alertDialog = this.f5623a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: t */
    public final Object[] m6107t(Map<String, String> map) {
        try {
            return "push".equals(map.get("operate")) ? new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream(m6102u(map.get("site"), map.get("token")).getBytes("UTF-8"))} : new Object[]{200, "text/html; charset=utf-8", new ByteArrayInputStream("<!DOCTYPE html> <html lang=\"zh-cmn-Hans\"> <head> <meta charset=\"UTF-8\"> <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=0,viewport-fit-cover\"> <title></title> <style> body { display: flex; flex-direction: column; align-items: center; justify-content: center; min-height: 100vh; margin: 0; font-family: Arial, sans-serif } .container { width: 90%; max-width: 500px; display: flex; flex-direction: column; align-items: center } .title { font-size: 1.2em; margin-bottom: 30px; text-align: center } .title span { color: red; font-weight: bold } .input-wrapper { width: 100%; margin-bottom: 15px } .input-wrapper textarea { width: 100%; height: 100px; box-sizing: border-box; padding: 10px; font-size: 1em; resize: none } .select-container { width: 100%; margin-bottom: 15px } .select-container select { width: 100%; height: 42px; box-sizing: border-box; padding: 0 10px; font-size: 1em; text-align: center; text-align-last: center } .button { width: 100%; height: 42px; box-sizing: border-box; font-size: 1em; margin-bottom: 10px; cursor: pointer } .button.push { background-color: #4CAF50; color: white; border: none } .button.clear { background-color: #f44336; color: white; border: none } .account-wrapper { width: 100%; margin-bottom: 15px; display: none } .account-wrapper input { width: 100%; height: 42px; margin-bottom: 10px; padding: 0 10px; box-sizing: border-box; font-size: 1em } </style> </head> <body> <div class=\"container\"> <div class=\"title\"><span></span></div> <div class=\"select-container\"><select id=\"push_type\"> <option value=\"\">请选择需要操作的云盘</option> <option value=\"uc\">UC Cookie</option> <option value=\"quark\">夸克Cookie</option> <option value=\"ali\">阿里Token</option> <option value=\"bili\">哔哩Cookie</option> <option value=\"cloud189\">天翼云盘登录</option> <option value=\"cloud123\">123云盘登录</option> <option value=\"123panfxck\">123云盘社区Cookie</option> </select></div><!--原有textarea容器--> <div class=\"input-wrapper\"><textarea id=\"token\" placeholder=\"请输入需要推送的Cookie或Token\"></textarea></div> <!--新增账号密码容器--> <div class=\"account-wrapper\"><input type=\"text\" id=\"account\" placeholder=\"云盘账号\"><input type=\"text\" id=\"password\" placeholder=\"云盘密码\"></div><button class=\"button push\" onclick=\"push()\">推送</button><button class=\"button clear\" onclick=\"clearInput()\">清除</button> </div> <script> document.addEventListener('DOMContentLoaded', function() { const tokenWrapper = document.querySelector('.input-wrapper'); const accountWrapper = document.querySelector('.account-wrapper'); tokenWrapper.style.display = 'none'; accountWrapper.style.display = 'none'; document.getElementById('push_type').addEventListener('change', function() { const is123 = this.value === 'cloud123' || this.value === 'cloud189' ; const hasValue = this.value !== ''; tokenWrapper.style.display = hasValue && !is123 ? 'block' : 'none'; accountWrapper.style.display = is123 ? 'block' : 'none' }) }); function push() { const pushType = document.getElementById('push_type').value; let apiUrl = '/proxy?do=push&site=' + pushType + '&operate=push'; let token = ''; if (pushType === 'cloud123' || pushType === 'cloud189' ) { const account = encodeURIComponent(document.getElementById('account').value); const password = encodeURIComponent(document.getElementById('password').value); token = account + '|' + password; } else { token = encodeURIComponent(document.getElementById('token').value); } apiUrl += '&token=' + token; const xhr = new XMLHttpRequest(); xhr.open('GET', apiUrl, true); xhr.onreadystatechange = function() { if (xhr.readyState === XMLHttpRequest.DONE) { alert(xhr.status === 200 ? xhr.responseText : '请求失败') } }; xhr.send() } function clearInput() { document.getElementById('token').value = ''; document.getElementById('account').value = ''; document.getElementById('password').value = '' } </script> </body> </html>".getBytes("UTF-8"))};
        } catch (Exception unused) {
            return new Object[]{200, "text/html; charset=utf-8", new ByteArrayInputStream("ok".getBytes())};
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m6108z(Map<String, String> map) {
        try {
            map.put("url", m6101s(map.get("site")).toString());
            Init.run(new RunnableC2276s(this, map, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
