package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.slf4j.LoggerFactory;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.xa */
/* JADX INFO: loaded from: classes.dex */
public final class C0736xa implements InterfaceC0656ub, InterfaceC0253fd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1778a;

    /* JADX INFO: renamed from: d */
    public Object f1779d;

    public C0736xa(int i) {
        this.f1778a = i;
        switch (i) {
            case 7:
                this.f1779d = new HashMap();
                break;
        }
    }

    public /* synthetic */ C0736xa(int i, Object obj) {
        this.f1778a = i;
        this.f1779d = obj;
    }

    public C0736xa(C0801zl c0801zl) {
        this.f1778a = 6;
        this.f1779d = new C0408kx(0);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0253fd
    /* JADX INFO: renamed from: b */
    public void mo908b(AbstractC0272fw abstractC0272fw, int i) {
        if (abstractC0272fw instanceof C0226ed) {
            C0226ed c0226ed = (C0226ed) abstractC0272fw;
            AbstractC0272fw abstractC0272fwM1231ax = abstractC0272fw.m1231ax();
            if (c0226ed.f771g.f592e) {
                if ((abstractC0272fwM1231ax instanceof C0706vy) || ((abstractC0272fwM1231ax instanceof C0226ed) && !((C0226ed) abstractC0272fwM1231ax).f771g.f593f)) {
                    StringBuilder sb = (StringBuilder) this.f1779d;
                    if (C0706vy.m1753h(sb)) {
                        return;
                    }
                    sb.append(' ');
                }
            }
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0253fd
    /* JADX INFO: renamed from: c */
    public void mo909c(AbstractC0272fw abstractC0272fw, int i) {
        boolean z = abstractC0272fw instanceof C0706vy;
        StringBuilder sb = (StringBuilder) this.f1779d;
        if (z) {
            C0706vy c0706vy = (C0706vy) abstractC0272fw;
            String strM1732f = c0706vy.m1732f();
            if (C0226ed.m1158k(c0706vy.f846ap) || (c0706vy instanceof C0586rm)) {
                sb.append(strM1732f);
                return;
            } else {
                AbstractC0727ws.m1844f(sb, strM1732f, C0706vy.m1753h(sb));
                return;
            }
        }
        if (abstractC0272fw instanceof C0226ed) {
            C0226ed c0226ed = (C0226ed) abstractC0272fw;
            if (sb.length() > 0) {
                if ((c0226ed.f771g.f592e || c0226ed.m1230aw("br")) && !C0706vy.m1753h(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m1857e(AbstractC0428lq abstractC0428lq, AbstractC0753xr abstractC0753xr, C0339ii c0339ii, HashSet hashSet, BitSet bitSet) {
        C0339ii c0339ii2;
        abw abwVar;
        AbstractC0428lq abstractC0428lq2 = abstractC0428lq;
        AbstractC0753xr abstractC0753xr2 = abstractC0753xr;
        if (hashSet.add(new C0368jk(abstractC0428lq2, 0, abstractC0753xr2))) {
            if (abstractC0428lq2 == null) {
                if (abstractC0753xr2 == null) {
                    c0339ii.m1302c(-2);
                    return;
                } else if (abstractC0753xr.mo1142c()) {
                    c0339ii.m1302c(-1);
                    return;
                }
            }
            boolean z = abstractC0428lq2 instanceof C0328hy;
            C0367jj c0367jj = (C0367jj) this.f1779d;
            if (z) {
                if (abstractC0753xr2 == null) {
                    c0339ii.m1302c(-2);
                    return;
                }
                if (abstractC0753xr.mo1142c()) {
                    c0339ii.m1302c(-1);
                    return;
                }
                if (abstractC0753xr2 != AbstractC0753xr.f1815h) {
                    boolean z2 = bitSet.get(abstractC0428lq2.f1165f);
                    try {
                        bitSet.clear(abstractC0428lq2.f1165f);
                        for (int i = 0; i < abstractC0753xr.mo1143d(); i++) {
                            m1857e((AbstractC0428lq) c0367jj.f1037a.get(abstractC0753xr2.mo1141b(i)), abstractC0753xr2.mo1140a(i), c0339ii, hashSet, bitSet);
                        }
                        if (z2) {
                            bitSet.set(abstractC0428lq2.f1165f);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (z2) {
                            bitSet.set(abstractC0428lq2.f1165f);
                        }
                        throw th;
                    }
                }
            }
            int size = abstractC0428lq2.f1167h.size();
            int i2 = 0;
            while (i2 < size) {
                AbstractC0488nw abstractC0488nwM1406k = abstractC0428lq2.m1406k(i2);
                if (abstractC0488nwM1406k.getClass() == abw.class) {
                    abw abwVar2 = (abw) abstractC0488nwM1406k;
                    if (bitSet.get(abwVar2.f1292g.f1165f)) {
                        continue;
                    } else {
                        C0277ga c0277gaM1242g = C0277ga.m1242g(abstractC0753xr2, abwVar2.f541f.f1164e);
                        try {
                            bitSet.set(((abw) abstractC0488nwM1406k).f1292g.f1165f);
                            abwVar = abwVar2;
                            try {
                                m1857e(abstractC0488nwM1406k.f1292g, c0277gaM1242g, c0339ii, hashSet, bitSet);
                                bitSet.clear(abwVar.f1292g.f1165f);
                            } catch (Throwable th2) {
                                th = th2;
                                bitSet.clear(abwVar.f1292g.f1165f);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            abwVar = abwVar2;
                        }
                    }
                } else if (abstractC0488nwM1406k instanceof AbstractC0530pk) {
                    m1857e(abstractC0488nwM1406k.f1292g, abstractC0753xr, c0339ii, hashSet, bitSet);
                } else if (abstractC0488nwM1406k.mo873e()) {
                    m1857e(abstractC0488nwM1406k.f1292g, abstractC0753xr, c0339ii, hashSet, bitSet);
                } else if (abstractC0488nwM1406k.getClass() == C0355iy.class) {
                    int i3 = c0367jj.f1042f;
                    C0339ii c0339ii3 = new C0339ii(new int[0]);
                    c0339ii3.m1303d(1, i3);
                    c0339ii.m1304e(c0339ii3);
                } else {
                    C0339ii c0339iiMo1088c = abstractC0488nwM1406k.mo1088c();
                    if (c0339iiMo1088c != null) {
                        if (abstractC0488nwM1406k instanceof C0378ju) {
                            int i4 = c0367jj.f1042f;
                            C0339ii c0339ii4 = new C0339ii(new int[0]);
                            c0339ii4.m1303d(1, i4);
                            if (c0339ii4.m1306g()) {
                                c0339iiMo1088c = null;
                            } else {
                                if (c0339iiMo1088c.m1306g()) {
                                    c0339ii2 = new C0339ii(c0339ii4);
                                } else if (!c0339ii4.m1306g()) {
                                    c0339ii2 = new C0339ii(c0339ii4);
                                    if (!c0339iiMo1088c.m1306g()) {
                                        int i5 = 0;
                                        int i6 = 0;
                                        while (i5 < c0339ii2.f1008a.size()) {
                                            ArrayList arrayList = c0339iiMo1088c.f1008a;
                                            if (i6 >= arrayList.size()) {
                                                break;
                                            }
                                            C0145bd c0145bd = (C0145bd) c0339ii2.f1008a.get(i5);
                                            C0145bd c0145bd2 = (C0145bd) arrayList.get(i6);
                                            int i7 = c0145bd2.f685c;
                                            int i8 = c0145bd.f684b;
                                            if (i7 < i8) {
                                                i6++;
                                            } else {
                                                int i9 = c0145bd2.f684b;
                                                int i10 = c0145bd.f685c;
                                                if (i9 > i10) {
                                                    i5++;
                                                } else {
                                                    C0145bd c0145bd3 = i9 > i8 ? new C0145bd(i8, i9 - 1) : null;
                                                    C0145bd c0145bd4 = i7 < i10 ? new C0145bd(i7 + 1, i10) : null;
                                                    if (c0145bd3 != null) {
                                                        if (c0145bd4 != null) {
                                                            c0339ii2.f1008a.set(i5, c0145bd3);
                                                            i5++;
                                                            c0339ii2.f1008a.add(i5, c0145bd4);
                                                            i6++;
                                                        } else {
                                                            c0339ii2.f1008a.set(i5, c0145bd3);
                                                            i5++;
                                                        }
                                                    } else if (c0145bd4 != null) {
                                                        c0339ii2.f1008a.set(i5, c0145bd4);
                                                        i6++;
                                                    } else {
                                                        c0339ii2.f1008a.remove(i5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c0339ii2 = new C0339ii(new int[0]);
                                }
                                c0339iiMo1088c = c0339ii2;
                            }
                        }
                        c0339ii.m1304e(c0339iiMo1088c);
                    }
                }
                i2++;
                abstractC0428lq2 = abstractC0428lq;
                abstractC0753xr2 = abstractC0753xr;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public Object m1858f(AbstractC0753xr abstractC0753xr, AbstractC0753xr abstractC0753xr2) {
        Map map = (Map) ((LinkedHashMap) this.f1779d).get(abstractC0753xr);
        if (map == null) {
            return null;
        }
        return map.get(abstractC0753xr2);
    }

    /* JADX INFO: renamed from: g */
    public void m1859g(AbstractC0753xr abstractC0753xr, AbstractC0753xr abstractC0753xr2, AbstractC0753xr abstractC0753xr3) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1779d;
        Map linkedHashMap2 = (Map) linkedHashMap.get(abstractC0753xr);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(abstractC0753xr, linkedHashMap2);
        } else {
            linkedHashMap2.get(abstractC0753xr2);
        }
        linkedHashMap2.put(abstractC0753xr2, abstractC0753xr3);
    }

    /* JADX INFO: renamed from: h */
    public LinkedList m1860h(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            C0792zc c0792zc = new C0792zc(aai.m896a(str));
            c0792zc.f1571r = new C0270fu(c0792zc, C0792zc.f1868e, C0792zc.f1864a, C0792zc.f1865b);
            C0643tp c0643tp = new C0643tp();
            c0643tp.f1554b = new ArrayList(100);
            c0643tp.f1555c = -1;
            c0643tp.f1553a = c0792zc;
            C0720wl c0720wl = new C0720wl(c0643tp);
            c0720wl.f1571r = new C0504ol(c0720wl, C0720wl.f1744y, C0720wl.f1740u, C0720wl.f1741v);
            c0720wl.f735a = new ads();
            C0177ci c0177ciM1822ak = c0720wl.m1822ak();
            C0589rp c0589rp = (C0589rp) this.f1779d;
            C0676uv c0676uv = new C0676uv();
            c0676uv.f1587a = LoggerFactory.getLogger((Class<?>) C0676uv.class);
            Stack stack = new Stack();
            c0676uv.f1588b = stack;
            C0580rg c0580rg = new C0580rg(c0589rp);
            c0676uv.f1589c = c0580rg;
            C0580rg c0580rg2 = new C0580rg(c0589rp);
            c0580rg2.f1440c = c0580rg;
            stack.push(c0580rg2);
            C0133as c0133as = (C0133as) c0177ciM1822ak.mo874b(c0676uv);
            if (c0133as == null) {
                linkedList.add(C0191cw.m1089b(""));
                return linkedList;
            }
            Serializable serializable = c0133as.f673a;
            if (serializable instanceof C0589rp) {
                Iterator<E> it = ((C0589rp) serializable).iterator();
                while (it.hasNext()) {
                    linkedList.add(C0191cw.m1089b((C0226ed) it.next()));
                }
                return linkedList;
            }
            if (serializable instanceof List) {
                Iterator it2 = ((List) serializable).iterator();
                while (it2.hasNext()) {
                    linkedList.add(C0191cw.m1089b((String) it2.next()));
                }
                return linkedList;
            }
            if (serializable instanceof String) {
                linkedList.add(C0191cw.m1089b(c0133as.m1015i()));
                return linkedList;
            }
            if (serializable instanceof Number) {
                Class<?> cls = serializable == null ? Object.class : serializable.getClass();
                if (cls.isAssignableFrom(Long.class) || cls.isAssignableFrom(Integer.class)) {
                    linkedList.add(C0191cw.m1089b(c0133as.m1014h()));
                } else {
                    linkedList.add(C0191cw.m1089b(c0133as.m1013g()));
                }
                return linkedList;
            }
            if (serializable instanceof Boolean) {
                linkedList.add(C0191cw.m1089b(c0133as.m1011e()));
                return linkedList;
            }
            if (serializable instanceof Date) {
                linkedList.add(C0191cw.m1089b(c0133as.m1012f()));
                return linkedList;
            }
            linkedList.add(C0191cw.m1089b(c0133as.m1015i()));
            return linkedList;
        } catch (Exception e) {
            throw new C0649tv("Please check the syntax of your xpath expr or commit a " + abx.m927a(e), e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0656ub
    /* JADX INFO: renamed from: m */
    public Object mo1338m() {
        switch (this.f1778a) {
            case 0:
                Class cls = (Class) this.f1779d;
                try {
                    return AbstractC0782yt.f1860d.mo922c(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
                }
            default:
                Constructor constructor = (Constructor) this.f1779d;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    acs acsVar = AbstractC0173ce.f703a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC0173ce.m1067c(constructor) + "' with no args", e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC0173ce.m1067c(constructor) + "' with no args", e4.getCause());
                }
        }
    }
}
