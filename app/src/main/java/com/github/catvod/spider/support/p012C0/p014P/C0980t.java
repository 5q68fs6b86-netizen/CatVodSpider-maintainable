package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.p012C0.p017S.C1002i;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p014P.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0980t extends C0985z {

    /* JADX INFO: renamed from: h */
    private final int f2379h;

    public C0980t(AbstractC0979s abstractC0979s, InterfaceC0972d interfaceC0972d, int i) {
        super(abstractC0979s, interfaceC0972d, null);
        this.f2379h = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        String str;
        int i = this.f2379h;
        if (i < 0 || i >= ((InterfaceC0972d) m2459b()).size()) {
            string = "";
        } else {
            InterfaceC0972d interfaceC0972d = (InterfaceC0972d) m2459b();
            int i2 = this.f2379h;
            String strM2404h = interfaceC0972d.m2404h(C1002i.m2518b(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : strM2404h.toCharArray()) {
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
        return String.format(Locale.getDefault(), "%s('%s')", C0980t.class.getSimpleName(), string);
    }
}
