package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p137w.C2406h;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2325r extends C2330w {

    /* JADX INFO: renamed from: f */
    private final int f5777f;

    public C2325r(AbstractC2324q abstractC2324q, InterfaceC2311d interfaceC2311d, int i) {
        super(abstractC2324q, interfaceC2311d, null);
        this.f5777f = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        String str;
        int i = this.f5777f;
        if (i < 0 || i >= ((InterfaceC2311d) m6295b()).size()) {
            string = "";
        } else {
            InterfaceC2311d interfaceC2311d = (InterfaceC2311d) m6295b();
            int i2 = this.f5777f;
            String strMo6241d = interfaceC2311d.mo6241d(C2406h.m6411b(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : strMo6241d.toCharArray()) {
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
        return String.format(Locale.getDefault(), "%s('%s')", C2325r.class.getSimpleName(), string);
    }
}
