package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.q */
/* JADX INFO: loaded from: classes.dex */
final class C1363q {

    /* JADX INFO: renamed from: a */
    private final Calendar f3128a;

    /* JADX INFO: renamed from: b */
    private int f3129b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1366t f3130c;

    C1363q(C1366t c1366t, Calendar calendar) {
        this.f3130c = c1366t;
        this.f3128a = calendar;
    }

    /* JADX INFO: renamed from: a */
    final C1362p m3342a() {
        if (this.f3129b >= this.f3130c.f3154a.length()) {
            return null;
        }
        char cCharAt = this.f3130c.f3154a.charAt(this.f3129b);
        if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
            int i = this.f3129b;
            do {
                int i2 = this.f3129b + 1;
                this.f3129b = i2;
                if (i2 >= this.f3130c.f3154a.length()) {
                    break;
                }
            } while (this.f3130c.f3154a.charAt(this.f3129b) == cCharAt);
            int i3 = this.f3129b - i;
            return new C1362p(C1366t.m3344b(this.f3130c, cCharAt, i3, this.f3128a), i3);
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (this.f3129b < this.f3130c.f3154a.length()) {
            char cCharAt2 = this.f3130c.f3154a.charAt(this.f3129b);
            if (!z) {
                if ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z')) {
                    break;
                }
            }
            if (cCharAt2 == '\'') {
                int i4 = this.f3129b + 1;
                this.f3129b = i4;
                if (i4 == this.f3130c.f3154a.length() || this.f3130c.f3154a.charAt(this.f3129b) != '\'') {
                    z = !z;
                }
            }
            this.f3129b++;
            sb.append(cCharAt2);
        }
        if (z) {
            throw new IllegalArgumentException("Unterminated quote");
        }
        String string = sb.toString();
        return new C1362p(new C1357k(string), string.length());
    }
}
