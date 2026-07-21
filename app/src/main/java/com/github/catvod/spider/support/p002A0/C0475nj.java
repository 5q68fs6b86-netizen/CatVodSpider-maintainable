package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.nj */
/* JADX INFO: loaded from: classes.dex */
public final class C0475nj extends EnumC0700vs {
    public C0475nj() {
        super("BIG_DECIMAL", 3);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0700vs
    /* JADX INFO: renamed from: a */
    public final Number mo1279a(C0577rd c0577rd) throws IOException {
        String strM1605ai = c0577rd.m1605ai();
        try {
            return AbstractC0611sk.m1687d(strM1605ai);
        } catch (NumberFormatException e) {
            throw new C0649tv("Cannot parse " + strM1605ai + "; at path " + c0577rd.m1624w(true), e);
        }
    }
}
