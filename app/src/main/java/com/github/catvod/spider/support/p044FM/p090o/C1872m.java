package com.github.catvod.spider.support.p044FM.p090o;

import android.util.TypedValue;
import com.github.catvod.spider.Init;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1872m {
    /* JADX INFO: renamed from: a */
    public static int m4531a(int i) {
        return (int) TypedValue.applyDimension(1, i, Init.context().getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m4532b(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }
}
