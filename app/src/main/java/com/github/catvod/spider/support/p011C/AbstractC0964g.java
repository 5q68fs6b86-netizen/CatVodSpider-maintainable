package com.github.catvod.spider.support.p011C;

import com.github.catvod.spider.support.p139y.C2420c;
import com.github.catvod.spider.support.p139y.C2425h;
import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C.g */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0964g<F extends Format> {

    /* JADX INFO: renamed from: a */
    private final ConcurrentMap<a, F> f2344a = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.g$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final Object[] f2345a;

        /* JADX INFO: renamed from: b */
        private final int f2346b;

        a(Object... objArr) {
            this.f2345a = objArr;
            this.f2346b = Arrays.hashCode(objArr) + 31;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                return Arrays.deepEquals(this.f2345a, ((a) obj).f2345a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f2346b;
        }
    }

    static {
        new ConcurrentHashMap(7);
    }

    AbstractC0964g() {
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: a */
    public final Format m2366a(String str, Locale locale) {
        C2425h.m6449a(str, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale localeM6434a = C2420c.m6434a(locale);
        a aVar = new a(str, timeZone, localeM6434a);
        F f = this.f2344a.get(aVar);
        if (f != null) {
            return f;
        }
        C0959b c0959b = new C0959b(str, timeZone, localeM6434a);
        F fPutIfAbsent = this.f2344a.putIfAbsent(aVar, c0959b);
        return fPutIfAbsent != null ? fPutIfAbsent : c0959b;
    }
}
