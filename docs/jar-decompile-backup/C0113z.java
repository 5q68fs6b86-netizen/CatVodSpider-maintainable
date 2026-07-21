package com.github.catvod.spider.support.p001A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p001A.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0113z {

    /* JADX INFO: renamed from: a */
    public String f411a;

    /* JADX INFO: renamed from: b */
    public String f412b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p001A.z$1, reason: invalid class name */
    public final class AnonymousClass1 {

        /* JADX INFO: renamed from: d */
        public Object f413d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public Object f414e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f415f;

        public AnonymousClass1(int i) {
            this.f415f = i;
        }

        /* JADX INFO: renamed from: s */
        public AnonymousClass2 m867s() {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            ArrayList arrayList = (ArrayList) this.f413d;
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) "$$$");
                }
            }
            anonymousClass2.f417b = sb.toString();
            ArrayList arrayList2 = (ArrayList) this.f414e;
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) "$$$");
                }
            }
            anonymousClass2.f416a = sb2.toString();
            return anonymousClass2;
        }

        /* JADX INFO: renamed from: u */
        public void m868u(String str, List list) {
            ((ArrayList) this.f413d).add(str);
            ArrayList arrayList = (ArrayList) this.f414e;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0113z c0113z = (C0113z) it.next();
                arrayList2.add(c0113z.f412b.replace("m3u8", "") + '$' + c0113z.f411a);
            }
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        sb.append((CharSequence) "#");
                    }
                }
            }
            arrayList.add(sb.toString());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p001A.z$2, reason: invalid class name */
    public final class AnonymousClass2 {

        /* JADX INFO: renamed from: a */
        public String f416a;

        /* JADX INFO: renamed from: b */
        public String f417b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f418c = 1;
    }
}
