package com.github.catvod.spider.support.p044FM.p090o;

import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p087l.RunnableC1836g;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1869j {

    /* JADX INFO: renamed from: a */
    private Toast f4308a;

    /* JADX INFO: renamed from: a */
    public static void m4521a(String str) {
        C1869j c1869j = C1868i.f4306a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast toast = c1869j.f4308a;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(Init.context(), str, 1);
        c1869j.f4308a = toastMakeText;
        toastMakeText.show();
    }

    /* JADX INFO: renamed from: b */
    public static void m4522b(String str) {
        Init.run(new RunnableC1836g(str, 4));
    }
}
