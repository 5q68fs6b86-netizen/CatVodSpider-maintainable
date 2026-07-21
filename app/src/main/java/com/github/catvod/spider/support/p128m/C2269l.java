package com.github.catvod.spider.support.p128m;

import android.content.SharedPreferences;
import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2269l {
    /* JADX INFO: renamed from: a */
    private static SharedPreferences m6175a() {
        return Init.context().getSharedPreferences(Init.context().getPackageName() + "_preferences", 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m6176a(String str, String str2) {
        SharedPreferences.Editor editorEdit = m6175a().edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: b */
    public static String m6177b(String str) {
        return m6175a().getString(str, "");
    }

    /* JADX INFO: renamed from: c */
    public static void m6178c(String str, Object obj) {
        SharedPreferences.Editor editorPutLong;
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            editorPutLong = m6175a().edit().putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            editorPutLong = m6175a().edit().putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editorPutLong = m6175a().edit().putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editorPutLong = m6175a().edit().putInt(str, ((Integer) obj).intValue());
        } else if (!(obj instanceof Long)) {
            return;
        } else {
            editorPutLong = m6175a().edit().putLong(str, ((Long) obj).longValue());
        }
        editorPutLong.apply();
    }
}
