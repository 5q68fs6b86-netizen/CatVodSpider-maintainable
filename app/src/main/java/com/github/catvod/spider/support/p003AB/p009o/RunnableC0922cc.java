package com.github.catvod.spider.support.p003AB.p009o;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.cc */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0922cc implements Runnable {

    /* JADX INFO: renamed from: a */
    private C0936q f2165a;

    /* JADX INFO: renamed from: b */
    private int f2166b;

    /* JADX INFO: renamed from: c */
    private String f2167c;

    /* JADX INFO: renamed from: d */
    private Runnable f2168d;

    public RunnableC0922cc(C0936q c0936q, int i, String str, Runnable runnable) {
        this.f2165a = c0936q;
        this.f2166b = i;
        this.f2167c = str;
        this.f2168d = runnable;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public void run() {
        List<String> listMaiduidui;
        C0936q c0936q = this.f2165a;
        int i = this.f2166b;
        String str = this.f2167c;
        Runnable runnable = this.f2168d;
        c0936q.getClass();
        int i2 = 0;
        switch (i) {
            case 1:
                listMaiduidui = C0901K.iqiyi(str);
                break;
            case 2:
                listMaiduidui = C0901K.youku(str);
                break;
            case 3:
                listMaiduidui = C0901K.mango(str);
                break;
            case 4:
                listMaiduidui = C0901K.bilibili(str);
                break;
            case 5:
                listMaiduidui = C0901K.renren(str);
                break;
            case 6:
                listMaiduidui = C0901K.hanjutv(str);
                break;
            case 7:
                listMaiduidui = C0901K.xigua(str);
                break;
            case 8:
                listMaiduidui = C0901K.leshi(str);
                break;
            case 9:
                listMaiduidui = C0901K.maiduidui(str);
                break;
            default:
                listMaiduidui = C0901K.tencent(str);
                break;
        }
        c0936q.f2208c.clear();
        if (listMaiduidui != null && !listMaiduidui.isEmpty()) {
            c0936q.f2208c.addAll(listMaiduidui);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : c0936q.f2208c) {
            if (!TextUtils.isEmpty(str2)) {
                String[] strArrSplit = str2.split("\\|");
                if (strArrSplit.length >= 2) {
                    str2 = strArrSplit[0] + "|" + strArrSplit[1];
                }
                arrayList.add(str2);
            }
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0931l(c0936q, arrayList, runnable, i2));
    }
}
