package com.github.catvod.spider;
import com.github.catvod.spider.support.p116a.C2137a;

import com.github.catvod.spider.support.p118c.C2192c;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p090o.C1869j;
import com.github.catvod.spider.support.p117b.C2187w;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p124i.C2223a;
import com.github.catvod.spider.support.p128m.C2256I;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class PanQuark extends Pan {

    /* JADX INFO: renamed from: h */
    private C2187w f240h;

    /* JADX INFO: renamed from: i */
    public ProgressDialog f241i;

    /* JADX INFO: renamed from: j */
    public boolean f242j;

    /* JADX INFO: renamed from: b */
    private void m613b(String str, String str2, List<Vod> list, boolean z, boolean z2) {
        ArrayList<C2223a> arrayList = new ArrayList();
        if (z) {
            this.f240h.m5779r(str2, arrayList);
        } else {
            this.f240h.m5782u(str);
            this.f240h.m5784w(str, str2, 1, arrayList);
        }
        for (C2223a c2223a : arrayList) {
            Vod c2194e = new Vod();
            c2194e.m5848j(C2256I.m6119o(str, c2223a.m6028b(), str2, c2223a.m6031d()));
            c2194e.m5849k(Pan.m610a(c2223a.m6029c()));
            c2194e.m5850l(c2223a.m6033f() ? "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_f.png" : "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_v.png");
            c2194e.m5851m(c2223a.m6032e());
            if (c2194e.m5839b().contains(".apk")) {
                c2194e.m5856r(c2194e.m5838a());
            }
            c2194e.m5854p(c2223a.m6033f() ? "folder" : "file");
            if (!z2 || c2223a.m6034g()) {
                list.add(c2194e);
            }
        }
    }

    public String action(String str) {
        try {
            if (isBusy()) {
                return "";
            }
            setBusy(true);
            Init.run(new Runnable() { // from class: com.github.catvod.spider.PanQuark.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PanQuark panQuark = PanQuark.this;
                        ProgressDialog progressDialog = new ProgressDialog(Init.getActivity());
                        panQuark.f241i = progressDialog;
                        progressDialog.setProgressStyle(1);
                        PanQuark.this.f241i.setMax(100);
                        PanQuark.this.f241i.setCancelable(false);
                        if (PanQuark.this.isBusy()) {
                            PanQuark.this.f241i.show();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            JSONObject jSONObjectOptJSONObject = new JSONArray(str).optJSONObject(0);
            Response responseExecute = new OkHttpClient().newCall(new Request.Builder().url(this.f240h.m5781ss(new String[]{jSONObjectOptJSONObject.optString("folder"), jSONObjectOptJSONObject.optString("shareId"), jSONObjectOptJSONObject.optString("fileToken")}, "我的夸克原画")).build()).execute();
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "quark_" + System.currentTimeMillis() + ".apk");
            InputStream inputStreamByteStream = responseExecute.body().byteStream();
            double d = Double.parseDouble(responseExecute.header("Content-Length", "1"));
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamByteStream);
            byte[] bArr = new byte[4096];
            long j = 0;
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                j += (long) i;
                fileOutputStream.write(bArr, 0, i);
                double d2 = j;
                Double.isNaN(d2);
                final int i2 = (int) ((d2 / d) * 100.0d);
                Init.run(new Runnable() { // from class: com.github.catvod.spider.PanQuark.4
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (PanQuark.this.f241i != null) {
                                PanQuark.this.f241i.setProgress(i2);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
            bufferedInputStream.close();
            fileOutputStream.close();
            if (file.getName().endsWith(".apk")) {
                C1286l.m3221f(file);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(file) { // from class: com.github.catvod.spider.PanQuark.1
                    private final File file;

                    {
                        this.file = file;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            File file2 = this.file;
                            if (file2 == null || !file2.exists() || file2.delete()) {
                                return;
                            }
                            C1869j.m4522b("Delete file failed");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, 10000L);
            }
            Init.run(new Runnable() { // from class: com.github.catvod.spider.PanQuark.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PanQuark.this.setBusy(false);
                        if (PanQuark.this.f241i != null) {
                            PanQuark.this.f241i.dismiss();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            return "";
        } catch (Exception e) {
            Init.run(new Runnable() { // from class: com.github.catvod.spider.PanQuark.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PanQuark.this.setBusy(false);
                        if (PanQuark.this.f241i != null) {
                            PanQuark.this.f241i.dismiss();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("shareId");
                String strOptString2 = jSONObjectOptJSONObject.optString("folder");
                jSONObjectOptJSONObject.optString("sharePwd");
                m613b(strOptString, strOptString2, arrayList, TextUtils.isEmpty(strOptString), false);
            }
            C2192c c2192c = new C2192c();
            c2192c.m5817i(1, 1, 0, 0);
            c2192c.m5829w(arrayList);
            return c2192c.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        JSONObject jSONObjectOptJSONObject = new JSONArray(list.get(0)).optJSONObject(0);
        String strOptString = jSONObjectOptJSONObject.optString("shareId");
        jSONObjectOptJSONObject.optString("folder");
        jSONObjectOptJSONObject.optString("sharePwd");
        String strOptString2 = jSONObjectOptJSONObject.optString("parentId");
        Vod c2194e = new Vod();
        c2194e.m5848j(list.get(0));
        c2194e.m5849k("");
        c2194e.m5850l("https://img.youxiguancha.com/29/imgfile/20230817/17092205srh1.png");
        c2194e.m5851m(TextUtils.join("$$$", Config.getMyQuarkOptions()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Vod> arrayList3 = new ArrayList();
        m613b(strOptString, strOptString2, arrayList3, TextUtils.isEmpty(strOptString), true);
        for (Vod c2194e2 : arrayList3) {
            JSONObject jSONObjectOptJSONObject2 = new JSONArray(c2194e2.m5838a()).optJSONObject(0);
            arrayList2.add(c2194e2.m5839b() + "$" + jSONObjectOptJSONObject2.optString("folder") + Marker.ANY_NON_NULL_MARKER + strOptString + Marker.ANY_NON_NULL_MARKER + jSONObjectOptJSONObject2.optString("fileToken"));
        }
        for (int i = 0; i < Config.getMyQuarkOptions().size(); i++) {
            arrayList.add(TextUtils.join("#", arrayList2));
        }
        c2194e.m5852n(TextUtils.join("$$$", arrayList));
        return C2137a.processVodData(Result.string(c2194e));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray("[{\"name\":\"我的夸克网盘\",\"folders\":[{\"shareId\":\"\",\"folder\":\"0\"}]},{\"name\":\"软件商店\",\"folders\":[{\"shareId\":\"969cc97687d3\",\"folder\":\"0\"}]}]");
            C2187w c2187w = this.f240h;
            if (c2187w == null || TextUtils.isEmpty(c2187w.m5773j())) {
                arrayList.add(new Class("0", "还未登录夸克账号,请前往【配置中心】登录", "1"));
            } else {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    arrayList.add(new Class(jSONObjectOptJSONObject.optString("folders"), jSONObjectOptJSONObject.optString("name"), "1"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.string(arrayList, new ArrayList());
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            this.f240h = C2187w.m5760e();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isBusy() {
        return this.f242j;
    }

    public void setBusy(boolean z) {
        this.f242j = z;
    }
}
