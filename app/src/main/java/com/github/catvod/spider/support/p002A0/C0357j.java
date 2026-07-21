package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0357j implements InterfaceC0159br {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1028a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0159br f1029b;

    public /* synthetic */ C0357j(InterfaceC0159br interfaceC0159br, int i) {
        this.f1028a = i;
        this.f1029b = interfaceC0159br;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0159br
    /* JADX INFO: renamed from: c */
    public final void mo1063c(StringBuilder sb, int i) {
        switch (this.f1028a) {
            case 0:
                this.f1029b.mo1063c(sb, i);
                break;
            case 1:
                this.f1029b.mo1063c(sb, i);
                break;
            case 2:
                this.f1029b.mo1063c(sb, i);
                break;
            default:
                this.f1029b.mo1063c(sb, i);
                break;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: e */
    public final void mo1195e(StringBuilder sb, Calendar calendar) {
        switch (this.f1028a) {
            case 0:
                int i = calendar.get(7);
                this.f1029b.mo1063c(sb, i != 1 ? i - 1 : 7);
                break;
            case 1:
                int leastMaximum = calendar.get(10);
                if (leastMaximum == 0) {
                    leastMaximum = calendar.getLeastMaximum(10) + 1;
                }
                this.f1029b.mo1063c(sb, leastMaximum);
                break;
            case 2:
                int maximum = calendar.get(11);
                if (maximum == 0) {
                    maximum = calendar.getMaximum(11) + 1;
                }
                this.f1029b.mo1063c(sb, maximum);
                break;
            default:
                this.f1029b.mo1063c(sb, calendar.getWeekYear());
                break;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: f */
    public final int mo1196f() {
        switch (this.f1028a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f1029b.mo1196f();
    }
}
