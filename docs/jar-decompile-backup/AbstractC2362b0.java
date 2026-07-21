package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p134t.AbstractC2331x;
import com.github.catvod.spider.support.p134t.C2332y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2362b0 {

    /* JADX INFO: renamed from: a */
    public static final e f5851a = new e();

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.b0$a */
    public static class a extends c {

        /* JADX INFO: renamed from: b */
        public final AbstractC2362b0[] f5852b;

        public a(AbstractC2362b0 abstractC2362b0, AbstractC2362b0 abstractC2362b1) {
            HashSet hashSet = new HashSet();
            if (abstractC2362b0 instanceof a) {
                hashSet.addAll(Arrays.asList(((a) abstractC2362b0).f5852b));
            } else {
                hashSet.add(abstractC2362b0);
            }
            if (abstractC2362b1 instanceof a) {
                hashSet.addAll(Arrays.asList(((a) abstractC2362b1).f5852b));
            } else {
                hashSet.add(abstractC2362b1);
            }
            List listM6353a = AbstractC2362b0.m6353a(hashSet);
            if (!listM6353a.isEmpty()) {
                hashSet.add((d) Collections.min(listM6353a));
            }
            this.f5852b = (AbstractC2362b0[]) hashSet.toArray(new AbstractC2362b0[hashSet.size()]);
        }

        @Override // com.github.catvod.spider.support.p135u.AbstractC2362b0
        /* JADX INFO: renamed from: c */
        public final boolean mo6356c(AbstractC2331x<?, ?> abstractC2331x, C2332y c2332y) {
            for (AbstractC2362b0 abstractC2362b0 : this.f5852b) {
                if (!abstractC2362b0.mo6356c(abstractC2331x, c2332y)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.github.catvod.spider.support.p135u.AbstractC2362b0
        /* JADX INFO: renamed from: d */
        public final AbstractC2362b0 mo6357d(AbstractC2331x<?, ?> abstractC2331x, C2332y c2332y) {
            ArrayList arrayList = new ArrayList();
            AbstractC2362b0[] abstractC2362b0Arr = this.f5852b;
            int length = abstractC2362b0Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    if (i2 == 0) {
                        return this;
                    }
                    if (arrayList.isEmpty()) {
                        return AbstractC2362b0.f5851a;
                    }
                    AbstractC2362b0 abstractC2362b0M6354b = (AbstractC2362b0) arrayList.get(0);
                    for (int i3 = 1; i3 < arrayList.size(); i3++) {
                        abstractC2362b0M6354b = AbstractC2362b0.m6354b(abstractC2362b0M6354b, (AbstractC2362b0) arrayList.get(i3));
                    }
                    return abstractC2362b0M6354b;
                }
                AbstractC2362b0 abstractC2362b0 = abstractC2362b0Arr[i];
                AbstractC2362b0 abstractC2362b0Mo6357d = abstractC2362b0.mo6357d(abstractC2331x, c2332y);
                i2 |= abstractC2362b0Mo6357d == abstractC2362b0 ? 0 : 1;
                if (abstractC2362b0Mo6357d == null) {
                    return null;
                }
                if (abstractC2362b0Mo6357d != AbstractC2362b0.f5851a) {
                    arrayList.add(abstractC2362b0Mo6357d);
                }
                i++;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return Arrays.equals(this.f5852b, ((a) obj).f5852b);
            }
            return false;
        }

        public final int hashCode() {
            AbstractC2362b0[] abstractC2362b0Arr = this.f5852b;
            int iHashCode = a.class.hashCode();
            for (AbstractC2362b0 abstractC2362b0 : abstractC2362b0Arr) {
                iHashCode = C1273a.m3169i(iHashCode, abstractC2362b0);
            }
            return C1273a.m3160b(iHashCode, abstractC2362b0Arr.length);
        }

        public final String toString() {
            return C1273a.m3163d(Arrays.asList(this.f5852b).iterator(), "&&");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.b0$b */
    public static class b extends c {

        /* JADX INFO: renamed from: b */
        public final AbstractC2362b0[] f5853b;

        public b(AbstractC2362b0 abstractC2362b0, AbstractC2362b0 abstractC2362b1) {
            HashSet hashSet = new HashSet();
            if (abstractC2362b0 instanceof b) {
                hashSet.addAll(Arrays.asList(((b) abstractC2362b0).f5853b));
            } else {
                hashSet.add(abstractC2362b0);
            }
            if (abstractC2362b1 instanceof b) {
                hashSet.addAll(Arrays.asList(((b) abstractC2362b1).f5853b));
            } else {
                hashSet.add(abstractC2362b1);
            }
            List listM6353a = AbstractC2362b0.m6353a(hashSet);
            if (!listM6353a.isEmpty()) {
                hashSet.add((d) Collections.max(listM6353a));
            }
            this.f5853b = (AbstractC2362b0[]) hashSet.toArray(new AbstractC2362b0[hashSet.size()]);
        }

        @Override // com.github.catvod.spider.support.p135u.AbstractC2362b0
        /* JADX INFO: renamed from: c */
        public final boolean mo6356c(AbstractC2331x<?, ?> abstractC2331x, C2332y c2332y) {
            for (AbstractC2362b0 abstractC2362b0 : this.f5853b) {
                if (abstractC2362b0.mo6356c(abstractC2331x, c2332y)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.github.catvod.spider.support.p135u.AbstractC2362b0
        /* JADX INFO: renamed from: d */
        public final AbstractC2362b0 mo6357d(AbstractC2331x<?, ?> abstractC2331x, C2332y c2332y) {
            ArrayList arrayList = new ArrayList();
            AbstractC2362b0[] abstractC2362b0Arr = this.f5853b;
            int length = abstractC2362b0Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    if (i2 == 0) {
                        return this;
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    AbstractC2362b0 abstractC2362b0M6355e = (AbstractC2362b0) arrayList.get(0);
                    for (int i3 = 1; i3 < arrayList.size(); i3++) {
                        abstractC2362b0M6355e = AbstractC2362b0.m6355e(abstractC2362b0M6355e, (AbstractC2362b0) arrayList.get(i3));
                    }
                    return abstractC2362b0M6355e;
                }
                AbstractC2362b0 abstractC2362b0 = abstractC2362b0Arr[i];
                AbstractC2362b0 abstractC2362b0Mo6357d = abstractC2362b0.mo6357d(abstractC2331x, c2332y);
                i2 |= abstractC2362b0Mo6357d == abstractC2362b0 ? 0 : 1;
                e eVar = AbstractC2362b0.f5851a;
                if (abstractC2362b0Mo6357d == eVar) {
                    return eVar;
                }
                if (abstractC2362b0Mo6357d != null) {
                    arrayList.add(abstractC2362b0Mo6357d);
                }
                i++;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return Arrays.equals(this.f5853b, ((b) obj).f5853b);
            }
            return false;
        }

        public final int hashCode() {
            AbstractC2362b0[] abstractC2362b0Arr = this.f5853b;
            int iHashCode = b.class.hashCode();
            for (AbstractC2362b0 abstractC2362b0 : abstractC2362b0Arr) {
                iHashCode = C1273a.m3169i(iHashCode, abstractC2362b0);
            }
            return C1273a.m3160b(iHashCode, abstractC2362b0Arr.length);
        }

        public final String toString() {
            return C1273a.m3163d(Arrays.asList(this.f5853b).iterator(), "||");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.b0$c */
    public static abstract class c extends AbstractC2362b0 {
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.b0$d */
    public static class d extends AbstractC2362b0 implements Comparable<d> {

        /* JADX INFO: renamed from: b */
        public final int f5854b;

        protected d() {
            this.f5854b = 0;
        }

        public d(int i) {
            this.f5854b = i;
        }

        @Override // com.github.catvod.spider.support.p135u.AbstractC2362b0
        /* JADX INFO: renamed from: c */
        public final boolean mo6356c(AbstractC2331x<?, ?> abstractC2331x, C2332y c2332y) {
            return abstractC2331x.mo6276g(this.f5854b);
        }

        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            return this.f5854b - dVar.f5854b;
        }

        @Override // com.github.catvod.spider.support.p135u.AbstractC2362b0
        /* JADX INFO: renamed from: d */
        public final AbstractC2362b0 mo6357d(AbstractC2331x<?, ?> abstractC2331x, C2332y c2332y) {
            if (abstractC2331x.mo6276g(this.f5854b)) {
                return AbstractC2362b0.f5851a;
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this == obj || this.f5854b == ((d) obj).f5854b;
            }
            return false;
        }

        public final int hashCode() {
            return 31 + this.f5854b;
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("{");
            sbM5396a.append(this.f5854b);
            sbM5396a.append(">=prec}?");
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.b0$e */
    public static class e extends AbstractC2362b0 {

        /* JADX INFO: renamed from: b */
        public final int f5855b;

        /* JADX INFO: renamed from: c */
        public final int f5856c;

        /* JADX INFO: renamed from: d */
        public final boolean f5857d;

        protected e() {
            this.f5855b = -1;
            this.f5856c = -1;
            this.f5857d = false;
        }

        public e(int i, int i2, boolean z) {
            this.f5855b = i;
            this.f5856c = i2;
            this.f5857d = z;
        }

        @Override // com.github.catvod.spider.support.p135u.AbstractC2362b0
        /* JADX INFO: renamed from: c */
        public final boolean mo6356c(AbstractC2331x<?, ?> abstractC2331x, C2332y c2332y) {
            abstractC2331x.getClass();
            return true;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            e eVar = (e) obj;
            return this.f5855b == eVar.f5855b && this.f5856c == eVar.f5856c && this.f5857d == eVar.f5857d;
        }

        public final int hashCode() {
            return C1273a.m3160b(C1273a.m3168h(C1273a.m3168h(C1273a.m3168h(0, this.f5855b), this.f5856c), this.f5857d ? 1 : 0), 3);
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("{");
            sbM5396a.append(this.f5855b);
            sbM5396a.append(":");
            sbM5396a.append(this.f5856c);
            sbM5396a.append("}?");
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    static List m6353a(Collection collection) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC2362b0 abstractC2362b0 = (AbstractC2362b0) it.next();
            if (abstractC2362b0 instanceof d) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((d) abstractC2362b0);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2362b0 m6354b(AbstractC2362b0 abstractC2362b0, AbstractC2362b0 abstractC2362b1) {
        e eVar;
        if (abstractC2362b0 == null || abstractC2362b0 == (eVar = f5851a)) {
            return abstractC2362b1;
        }
        if (abstractC2362b1 == null || abstractC2362b1 == eVar) {
            return abstractC2362b0;
        }
        a aVar = new a(abstractC2362b0, abstractC2362b1);
        AbstractC2362b0[] abstractC2362b0Arr = aVar.f5852b;
        return abstractC2362b0Arr.length == 1 ? abstractC2362b0Arr[0] : aVar;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC2362b0 m6355e(AbstractC2362b0 abstractC2362b0, AbstractC2362b0 abstractC2362b1) {
        AbstractC2362b0 abstractC2362b2;
        if (abstractC2362b0 == null) {
            return abstractC2362b1;
        }
        if (abstractC2362b1 == null) {
            return abstractC2362b0;
        }
        e eVar = f5851a;
        if (abstractC2362b0 != eVar && abstractC2362b1 != eVar) {
            b bVar = new b(abstractC2362b0, abstractC2362b1);
            AbstractC2362b0[] abstractC2362b0Arr = bVar.f5853b;
            abstractC2362b2 = bVar;
            if (abstractC2362b0Arr.length == 1) {
                return abstractC2362b0Arr[0];
            }
        }
        abstractC2362b2 = eVar;
        abstractC2362b2 = eVar;
        return abstractC2362b2;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo6356c(AbstractC2331x<?, ?> abstractC2331x, C2332y c2332y);

    /* JADX INFO: renamed from: d */
    public AbstractC2362b0 mo6357d(AbstractC2331x<?, ?> abstractC2331x, C2332y c2332y) {
        return this;
    }
}
