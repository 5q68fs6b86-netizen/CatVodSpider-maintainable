package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.gc */
/* JADX INFO: loaded from: classes.dex */
public final class C0279gc implements InterfaceC0159br {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f854a;

    /* JADX INFO: renamed from: b */
    public final int f855b;

    public /* synthetic */ C0279gc(int i, int i2) {
        this.f854a = i2;
        this.f855b = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0159br
    /* JADX INFO: renamed from: c */
    public final void mo1063c(StringBuilder sb, int i) {
        switch (this.f854a) {
            case 0:
                if (i >= 100) {
                    C0312hi.m1273i(sb, i, 2);
                } else {
                    C0312hi.m1272h(sb, i);
                }
                break;
            default:
                if (i < 10) {
                    sb.append((char) (i + 48));
                } else if (i >= 100) {
                    C0312hi.m1273i(sb, i, 1);
                } else {
                    C0312hi.m1272h(sb, i);
                }
                break;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: e */
    public final void mo1195e(StringBuilder sb, Calendar calendar) {
        switch (this.f854a) {
            case 0:
                mo1063c(sb, calendar.get(this.f855b));
                break;
            default:
                mo1063c(sb, calendar.get(this.f855b));
                break;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: f */
    public final int mo1196f() {
        switch (this.f854a) {
            case 0:
                return 2;
            default:
                return 4;
        }
    }
}
