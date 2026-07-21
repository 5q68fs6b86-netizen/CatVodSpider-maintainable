package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ky */
/* JADX INFO: loaded from: classes.dex */
public final class C0409ky implements InterfaceC0159br {

    /* JADX INFO: renamed from: a */
    public static final C0409ky f1109a = new C0409ky(0);

    /* JADX INFO: renamed from: b */
    public static final C0409ky f1110b = new C0409ky(1);

    /* JADX INFO: renamed from: d */
    public static final C0409ky f1111d = new C0409ky(2);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1112g;

    public /* synthetic */ C0409ky(int i) {
        this.f1112g = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0159br
    /* JADX INFO: renamed from: c */
    public final void mo1063c(StringBuilder sb, int i) {
        switch (this.f1112g) {
            case 0:
                C0312hi.m1272h(sb, i);
                break;
            case 1:
                C0312hi.m1272h(sb, i % 100);
                break;
            default:
                if (i >= 10) {
                    C0312hi.m1272h(sb, i);
                } else {
                    sb.append((char) (i + 48));
                }
                break;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: e */
    public final void mo1195e(StringBuilder sb, Calendar calendar) {
        switch (this.f1112g) {
            case 0:
                C0312hi.m1272h(sb, calendar.get(2) + 1);
                break;
            case 1:
                mo1063c(sb, calendar.get(1) % 100);
                break;
            default:
                mo1063c(sb, calendar.get(2) + 1);
                break;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: f */
    public final int mo1196f() {
        switch (this.f1112g) {
        }
        return 2;
    }
}
