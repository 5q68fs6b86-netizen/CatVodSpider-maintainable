package com.github.catvod.spider.support.p002A0;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.he */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0308he {

    /* JADX INFO: renamed from: a */
    public static final boolean f886a;

    /* JADX INFO: renamed from: b */
    public static final C0268fs f887b;

    /* JADX INFO: renamed from: c */
    public static final C0268fs f888c;

    /* JADX INFO: renamed from: d */
    public static final C0296gt f889d;

    /* JADX INFO: renamed from: e */
    public static final C0783yu f890e;

    /* JADX INFO: renamed from: f */
    public static final C0136av f891f;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f886a = z;
        if (z) {
            f887b = new C0268fs(Date.class, 0);
            f888c = new C0268fs(Timestamp.class, 1);
            f889d = C0396kl.f1098a;
            f890e = C0479nn.f1288a;
            f891f = C0766yd.f1827a;
            return;
        }
        f887b = null;
        f888c = null;
        f889d = null;
        f890e = null;
        f891f = null;
    }
}
