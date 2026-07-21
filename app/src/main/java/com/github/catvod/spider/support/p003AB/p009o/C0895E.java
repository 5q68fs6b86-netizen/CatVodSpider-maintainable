package com.github.catvod.spider.support.p003AB.p009o;

import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0831O;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0895E {

    /* JADX INFO: renamed from: a */
    private Toast f2114a;

    /* JADX INFO: renamed from: a */
    public static void m2151a(String str) {
        C0895E c0895e = C0894D.f2113a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast toast = c0895e.f2114a;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(Init.context(), str, 1);
        c0895e.f2114a = toastMakeText;
        toastMakeText.show();
    }

    /* JADX INFO: renamed from: b */
    public static void m2152b(String str) {
        Init.run(new RunnableC0831O(str, 4));
    }
}
