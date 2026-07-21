package com.github.catvod.spider.support.p103I;

import com.github.catvod.spider.support.p043F.C1274b;
import com.github.catvod.spider.support.p101G.C2037i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.I.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2059b extends AbstractC2061d {

    /* JADX INFO: renamed from: b */
    int f4909b = 0;

    /* JADX INFO: renamed from: a */
    final ArrayList<AbstractC2061d> f4908a = new ArrayList<>();

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.b$a */
    public static final class a extends AbstractC2059b {
        a(Collection<AbstractC2061d> collection) {
            this.f4908a.addAll(collection);
            m5177b();
        }

        a(AbstractC2061d... abstractC2061dArr) {
            this(Arrays.asList(abstractC2061dArr));
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            for (int i = this.f4909b - 1; i >= 0; i--) {
                if (!this.f4908a.get(i).mo5178a(c2037i, c2037i2)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return C1274b.m3175f(this.f4908a, "");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.b$b */
    public static final class b extends AbstractC2059b {
        b() {
        }

        b(AbstractC2061d... abstractC2061dArr) {
            List listAsList = Arrays.asList(abstractC2061dArr);
            if (this.f4909b > 1) {
                this.f4908a.add(new a(listAsList));
            } else {
                this.f4908a.addAll(listAsList);
            }
            m5177b();
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            for (int i = 0; i < this.f4909b; i++) {
                if (this.f4908a.get(i).mo5178a(c2037i, c2037i2)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return C1274b.m3175f(this.f4908a, ", ");
        }
    }

    AbstractC2059b() {
    }

    /* JADX INFO: renamed from: b */
    final void m5177b() {
        this.f4909b = this.f4908a.size();
    }
}
