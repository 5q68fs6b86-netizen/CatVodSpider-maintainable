package com.github.catvod.spider.support.p002A0;

import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ui */
/* JADX INFO: loaded from: classes.dex */
public final class C0663ui extends AbstractC0346ip {

    /* JADX INFO: renamed from: f */
    public final int f1569f;

    public C0663ui(C0792zc c0792zc, C0619ss c0619ss, int i) {
        super(c0792zc, c0619ss, null);
        this.f1569f = i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        int i = this.f1569f;
        if (i >= 0) {
            C0619ss c0619ss = (C0619ss) this.f1019c;
            if (i < c0619ss.f1513a) {
                String strM1698f = c0619ss.m1698f(C0145bd.m1022d(i, i));
                StringBuilder sb = new StringBuilder();
                for (char c : strM1698f.toCharArray()) {
                    if (c == '\t') {
                        sb.append("\\t");
                    } else if (c == '\n') {
                        sb.append("\\n");
                    } else if (c == '\r') {
                        sb.append("\\r");
                    } else {
                        sb.append(c);
                    }
                }
                string = sb.toString();
            } else {
                string = "";
            }
        } else {
            string = "";
        }
        Locale.getDefault();
        return C0663ui.class.getSimpleName() + "('" + string + "')";
    }
}
