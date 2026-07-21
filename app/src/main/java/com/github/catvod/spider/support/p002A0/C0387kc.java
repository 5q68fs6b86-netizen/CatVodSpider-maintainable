package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.kc */
/* JADX INFO: loaded from: classes.dex */
public final class C0387kc extends EnumC0700vs {
    public C0387kc() {
        super("LONG_OR_DOUBLE", 2);
    }

    /* JADX INFO: renamed from: b */
    public static Double m1345b(String str, C0577rd c0577rd) throws C0657uc {
        try {
            Double dValueOf = Double.valueOf(str);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                if (c0577rd.f1433o != 1) {
                    throw new C0657uc("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c0577rd.m1624w(true));
                }
            }
            return dValueOf;
        } catch (NumberFormatException e) {
            throw new C0649tv("Cannot parse " + str + "; at path " + c0577rd.m1624w(true), e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0700vs
    /* JADX INFO: renamed from: a */
    public final Number mo1279a(C0577rd c0577rd) throws IOException {
        String strM1605ai = c0577rd.m1605ai();
        if (strM1605ai.indexOf(46) >= 0) {
            return m1345b(strM1605ai, c0577rd);
        }
        try {
            return Long.valueOf(Long.parseLong(strM1605ai));
        } catch (NumberFormatException unused) {
            return m1345b(strM1605ai, c0577rd);
        }
    }
}
