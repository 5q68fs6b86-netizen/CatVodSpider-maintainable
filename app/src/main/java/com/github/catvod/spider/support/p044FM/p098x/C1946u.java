package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1284j;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1946u extends C1915A {

    /* JADX INFO: renamed from: f */
    private final int f4448f;

    public C1946u(AbstractC1945t abstractC1945t, InterfaceC1929d interfaceC1929d, int i) {
        super(abstractC1945t, interfaceC1929d, null);
        this.f4448f = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        String str;
        int i = this.f4448f;
        if (i < 0 || i >= ((InterfaceC1929d) m4628b()).size()) {
            string = "";
        } else {
            InterfaceC1929d interfaceC1929d = (InterfaceC1929d) m4628b();
            int i2 = this.f4448f;
            String strMo4667e = interfaceC1929d.mo4667e(C1284j.m3201b(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : strMo4667e.toCharArray()) {
                if (c == '\t') {
                    str = "\\t";
                } else if (c == '\n') {
                    str = "\\n";
                } else {
                    if (c == '\r') {
                        str = "\\r";
                    } else {
                        sb.append(c);
                    }
                }
                sb.append(str);
            }
            string = sb.toString();
        }
        return String.format(Locale.getDefault(), "%s('%s')", C1946u.class.getSimpleName(), string);
    }
}
