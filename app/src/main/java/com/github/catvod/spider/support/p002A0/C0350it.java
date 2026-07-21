package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.it */
/* JADX INFO: loaded from: classes.dex */
public final class C0350it implements InterfaceC0654u {

    /* JADX INFO: renamed from: a */
    public final int f1023a;

    /* JADX INFO: renamed from: b */
    public final String[] f1024b;

    public C0350it(int i, String[] strArr) {
        this.f1023a = i;
        this.f1024b = strArr;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: e */
    public final void mo1195e(StringBuilder sb, Calendar calendar) {
        sb.append((CharSequence) this.f1024b[calendar.get(this.f1023a)]);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: f */
    public final int mo1196f() {
        String[] strArr = this.f1024b;
        int length = strArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int length2 = strArr[length].length();
            if (length2 > i) {
                i = length2;
            }
        }
    }
}
