package com.github.catvod.spider.support.p003AB.p009o;

import android.content.SharedPreferences;
import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0897G {
    /* JADX INFO: renamed from: a */
    private static SharedPreferences m2160a() {
        return Init.context().getSharedPreferences(Init.context().getPackageName() + "_preferences", 0);
    }

    /* JADX INFO: renamed from: b */
    public static String m2161b(String str) {
        return m2160a().getString(str, "");
    }

    /* JADX INFO: renamed from: c */
    public static void m2162c(String str, Object obj) {
        SharedPreferences.Editor editorPutLong;
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            editorPutLong = m2160a().edit().putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            editorPutLong = m2160a().edit().putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editorPutLong = m2160a().edit().putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editorPutLong = m2160a().edit().putInt(str, ((Integer) obj).intValue());
        } else if (!(obj instanceof Long)) {
            return;
        } else {
            editorPutLong = m2160a().edit().putLong(str, ((Long) obj).longValue());
        }
        editorPutLong.apply();
    }
}
