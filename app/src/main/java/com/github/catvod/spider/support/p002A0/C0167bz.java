package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.bz */
/* JADX INFO: loaded from: classes.dex */
public final class C0167bz extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f698a;

    public /* synthetic */ C0167bz(int i) {
        this.f698a = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        switch (this.f698a) {
            case 0:
                if (c0577rd.m1607ak() != 9) {
                    return Double.valueOf(c0577rd.m1598ab());
                }
                c0577rd.m1603ag();
                return null;
            case 1:
                if (c0577rd.m1607ak() != 9) {
                    return Float.valueOf((float) c0577rd.m1598ab());
                }
                c0577rd.m1603ag();
                return null;
            default:
                c0577rd.m1614ar();
                return null;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        switch (this.f698a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    C0493oa.m1470x(dDoubleValue);
                    aagVar.m878ab(dDoubleValue);
                } else {
                    aagVar.m892w();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    C0493oa.m1470x(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    aagVar.m880ad(numberValueOf);
                } else {
                    aagVar.m892w();
                }
                break;
            default:
                aagVar.m892w();
                break;
        }
    }

    public String toString() {
        switch (this.f698a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
