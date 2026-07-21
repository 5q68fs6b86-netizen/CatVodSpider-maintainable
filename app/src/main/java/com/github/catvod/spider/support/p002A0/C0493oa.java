package com.github.catvod.spider.support.p002A0;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.oa */
/* JADX INFO: loaded from: classes.dex */
public final class C0493oa {

    /* JADX INFO: renamed from: a */
    public static final aba f1298a = aba.f467a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0252fc f1299b = EnumC0252fc.f815b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0700vs f1300c = EnumC0700vs.f1605c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0700vs f1301d = EnumC0700vs.f1606d;

    /* JADX INFO: renamed from: e */
    public final ThreadLocal f1302e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f1303f;

    /* JADX INFO: renamed from: g */
    public final C0742xg f1304g;

    /* JADX INFO: renamed from: h */
    public final C0130ap f1305h;

    /* JADX INFO: renamed from: i */
    public final List f1306i;

    /* JADX INFO: renamed from: j */
    public final C0434lw f1307j;

    /* JADX INFO: renamed from: k */
    public final EnumC0252fc f1308k;

    /* JADX INFO: renamed from: l */
    public final Map f1309l;

    /* JADX INFO: renamed from: m */
    public final boolean f1310m;

    /* JADX INFO: renamed from: n */
    public final aba f1311n;

    /* JADX INFO: renamed from: o */
    public final boolean f1312o;

    /* JADX INFO: renamed from: p */
    public final int f1313p;

    /* JADX INFO: renamed from: q */
    public final int f1314q;

    /* JADX INFO: renamed from: r */
    public final List f1315r;

    /* JADX INFO: renamed from: s */
    public final List f1316s;

    /* JADX INFO: renamed from: t */
    public final EnumC0700vs f1317t;

    /* JADX INFO: renamed from: u */
    public final EnumC0700vs f1318u;

    /* JADX INFO: renamed from: v */
    public final List f1319v;

    /* JADX INFO: renamed from: w */
    public final int f1320w;

    public C0493oa() {
        this(C0434lw.f1204b, f1299b, Collections.emptyMap(), true, f1298a, true, 1, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f1300c, f1301d, Collections.emptyList());
    }

    public C0493oa(C0434lw c0434lw, EnumC0252fc enumC0252fc, Map map, boolean z, aba abaVar, boolean z2, int i, int i2, int i3, List list, List list2, List list3, EnumC0700vs enumC0700vs, EnumC0700vs enumC0700vs2, List list4) {
        this.f1302e = new ThreadLocal();
        this.f1303f = new ConcurrentHashMap();
        this.f1307j = c0434lw;
        this.f1308k = enumC0252fc;
        this.f1309l = map;
        C0742xg c0742xg = new C0742xg(map, z2, list4);
        this.f1304g = c0742xg;
        this.f1310m = z;
        this.f1311n = abaVar;
        this.f1312o = z2;
        this.f1320w = i;
        this.f1313p = i2;
        this.f1314q = i3;
        this.f1315r = list;
        this.f1316s = list2;
        this.f1317t = enumC0700vs;
        this.f1318u = enumC0700vs2;
        this.f1319v = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ado.f617aa);
        arrayList.add(enumC0700vs == EnumC0700vs.f1605c ? C0506on.f1345a : new C0188ct(1, enumC0700vs));
        arrayList.add(c0434lw);
        arrayList.addAll(list3);
        arrayList.add(ado.f633p);
        arrayList.add(ado.f624g);
        arrayList.add(ado.f621d);
        arrayList.add(ado.f622e);
        arrayList.add(ado.f623f);
        AbstractC0406kv c0427lp = i == 1 ? ado.f628k : new C0427lp();
        arrayList.add(new C0354ix(Long.TYPE, Long.class, c0427lp));
        arrayList.add(new C0354ix(Double.TYPE, Double.class, new C0167bz(0)));
        arrayList.add(new C0354ix(Float.TYPE, Float.class, new C0167bz(1)));
        arrayList.add(enumC0700vs2 == EnumC0700vs.f1606d ? C0595rv.f1453a : new C0188ct(0, new C0595rv(3, enumC0700vs2)));
        arrayList.add(ado.f625h);
        arrayList.add(ado.f626i);
        arrayList.add(new C0730wv(AtomicLong.class, new C0595rv(2, new C0595rv(0, c0427lp)), 0));
        arrayList.add(new C0730wv(AtomicLongArray.class, new C0595rv(2, new C0595rv(1, c0427lp)), 0));
        arrayList.add(ado.f627j);
        arrayList.add(ado.f629l);
        arrayList.add(ado.f634q);
        arrayList.add(ado.f635r);
        arrayList.add(new C0730wv(BigDecimal.class, ado.f630m, 0));
        arrayList.add(new C0730wv(BigInteger.class, ado.f631n, 0));
        arrayList.add(new C0730wv(C0484ns.class, ado.f632o, 0));
        arrayList.add(ado.f636s);
        arrayList.add(ado.f637t);
        arrayList.add(ado.f639v);
        arrayList.add(ado.f640w);
        arrayList.add(ado.f642y);
        arrayList.add(ado.f638u);
        arrayList.add(ado.f619b);
        arrayList.add(ach.f553a);
        arrayList.add(ado.f641x);
        if (AbstractC0308he.f886a) {
            arrayList.add(AbstractC0308he.f890e);
            arrayList.add(AbstractC0308he.f889d);
            arrayList.add(AbstractC0308he.f891f);
        }
        arrayList.add(C0547qa.f1389a);
        arrayList.add(ado.f616a);
        arrayList.add(new C0622sv(c0742xg, 0));
        arrayList.add(new C0622sv(c0742xg, 1));
        C0130ap c0130ap = new C0130ap(c0742xg);
        this.f1305h = c0130ap;
        arrayList.add(c0130ap);
        arrayList.add(ado.f618ab);
        arrayList.add(new C0294gr(c0742xg, enumC0252fc, c0434lw, c0130ap, list4));
        this.f1306i = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: x */
    public static void m1470x(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: aa */
    public final AbstractC0406kv m1471aa(C0259fj c0259fj) {
        boolean z;
        Objects.requireNonNull(c0259fj, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f1303f;
        AbstractC0406kv abstractC0406kv = (AbstractC0406kv) concurrentHashMap.get(c0259fj);
        if (abstractC0406kv != null) {
            return abstractC0406kv;
        }
        ThreadLocal threadLocal = this.f1302e;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC0406kv abstractC0406kv2 = (AbstractC0406kv) map.get(c0259fj);
            if (abstractC0406kv2 != null) {
                return abstractC0406kv2;
            }
            z = false;
        }
        try {
            C0450ml c0450ml = new C0450ml();
            map.put(c0259fj, c0450ml);
            Iterator it = this.f1306i.iterator();
            AbstractC0406kv abstractC0406kvMo934a = null;
            while (it.hasNext()) {
                abstractC0406kvMo934a = ((InterfaceC0698vq) it.next()).mo934a(this, c0259fj);
                if (abstractC0406kvMo934a != null) {
                    if (c0450ml.f1234a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c0450ml.f1234a = abstractC0406kvMo934a;
                    map.put(c0259fj, abstractC0406kvMo934a);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC0406kvMo934a != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC0406kvMo934a;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + c0259fj);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX INFO: renamed from: ab */
    public final AbstractC0406kv m1472ab(InterfaceC0698vq interfaceC0698vq, C0259fj c0259fj) {
        Objects.requireNonNull(interfaceC0698vq, "skipPast must not be null");
        Objects.requireNonNull(c0259fj, "type must not be null");
        C0130ap c0130ap = this.f1305h;
        c0130ap.getClass();
        if (interfaceC0698vq == C0130ap.f666b) {
            interfaceC0698vq = c0130ap;
        } else {
            ConcurrentHashMap concurrentHashMap = c0130ap.f669e;
            Class cls = c0259fj.f827a;
            InterfaceC0698vq interfaceC0698vq2 = (InterfaceC0698vq) concurrentHashMap.get(cls);
            if (interfaceC0698vq2 == null) {
                InterfaceC0388kd interfaceC0388kd = (InterfaceC0388kd) cls.getAnnotation(InterfaceC0388kd.class);
                if (interfaceC0388kd != null) {
                    Class clsValue = interfaceC0388kd.value();
                    if (InterfaceC0698vq.class.isAssignableFrom(clsValue)) {
                        InterfaceC0698vq interfaceC0698vq3 = (InterfaceC0698vq) c0130ap.f668d.m1870e(new C0259fj(clsValue)).mo1338m();
                        InterfaceC0698vq interfaceC0698vq4 = (InterfaceC0698vq) concurrentHashMap.putIfAbsent(cls, interfaceC0698vq3);
                        if (interfaceC0698vq4 != null) {
                            interfaceC0698vq3 = interfaceC0698vq4;
                        }
                        if (interfaceC0698vq3 == interfaceC0698vq) {
                            interfaceC0698vq = c0130ap;
                        }
                    }
                }
            } else if (interfaceC0698vq2 == interfaceC0698vq) {
                interfaceC0698vq = c0130ap;
            }
        }
        boolean z = false;
        for (InterfaceC0698vq interfaceC0698vq5 : this.f1306i) {
            if (z) {
                AbstractC0406kv abstractC0406kvMo934a = interfaceC0698vq5.mo934a(this, c0259fj);
                if (abstractC0406kvMo934a != null) {
                    return abstractC0406kvMo934a;
                }
            } else if (interfaceC0698vq5 == interfaceC0698vq) {
                z = true;
            }
        }
        if (!z) {
            return m1471aa(c0259fj);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c0259fj);
    }

    /* JADX INFO: renamed from: ac */
    public final aag m1473ac(Writer writer) {
        aag aagVar = new aag(writer);
        aagVar.m894y(this.f1311n);
        aagVar.f442l = this.f1310m;
        aagVar.m895z(2);
        aagVar.f444n = false;
        return aagVar;
    }

    /* JADX INFO: renamed from: ad */
    public final String m1474ad(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                m1475ae(m1473ac(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new C0765yc(e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            m1476af(obj, cls, m1473ac(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new C0765yc(e2);
        }
    }

    /* JADX INFO: renamed from: ae */
    public final void m1475ae(aag aagVar) {
        aas aasVar = aas.f454f;
        int i = aagVar.f441k;
        boolean z = aagVar.f442l;
        boolean z2 = aagVar.f444n;
        aagVar.f442l = this.f1310m;
        aagVar.f444n = false;
        if (i == 2) {
            aagVar.f441k = 1;
        }
        try {
            try {
                ado.f643z.getClass();
                C0685vd.m1746d(aagVar, aasVar);
                aagVar.m895z(i);
                aagVar.f442l = z;
                aagVar.f444n = z2;
            } catch (IOException e) {
                throw new C0765yc(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            aagVar.m895z(i);
            aagVar.f442l = z;
            aagVar.f444n = z2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: af */
    public final void m1476af(Object obj, Class cls, aag aagVar) {
        AbstractC0406kv abstractC0406kvM1471aa = m1471aa(new C0259fj(cls));
        int i = aagVar.f441k;
        if (i == 2) {
            aagVar.f441k = 1;
        }
        boolean z = aagVar.f442l;
        boolean z2 = aagVar.f444n;
        aagVar.f442l = this.f1310m;
        aagVar.f444n = false;
        try {
            try {
                abstractC0406kvM1471aa.mo901c(aagVar, obj);
                aagVar.m895z(i);
                aagVar.f442l = z;
                aagVar.f444n = z2;
            } catch (IOException e) {
                throw new C0765yc(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            aagVar.m895z(i);
            aagVar.f442l = z;
            aagVar.f444n = z2;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f1306i + ",instanceCreators:" + this.f1304g + "}";
    }

    /* JADX INFO: renamed from: y */
    public final Object m1477y(String str, C0259fj c0259fj) {
        Object objMo900b = null;
        if (str == null) {
            return null;
        }
        C0577rd c0577rd = new C0577rd(new StringReader(str));
        c0577rd.m1610an(2);
        int i = c0577rd.f1433o;
        boolean z = true;
        if (i == 2) {
            c0577rd.f1433o = 1;
        }
        try {
            try {
                try {
                    c0577rd.m1607ak();
                    z = false;
                    objMo900b = m1471aa(c0259fj).mo900b(c0577rd);
                } catch (EOFException e) {
                    if (!z) {
                        throw new C0765yc(e);
                    }
                } catch (IllegalStateException e2) {
                    throw new C0765yc(e2);
                }
                c0577rd.m1610an(i);
                if (objMo900b != null) {
                    try {
                        if (c0577rd.m1607ak() != 10) {
                            throw new C0765yc("JSON document was not fully consumed.");
                        }
                    } catch (C0657uc e3) {
                        throw new C0765yc(e3);
                    } catch (IOException e4) {
                        throw new C0765yc(e4);
                    }
                }
                return objMo900b;
            } catch (IOException e5) {
                throw new C0765yc(e5);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e6.getMessage(), e6);
            }
        } catch (Throwable th) {
            c0577rd.m1610an(i);
            throw th;
        }
    }

    /* JADX INFO: renamed from: z */
    public final Object m1478z(String str, Class cls) {
        Object objM1477y = m1477y(str, new C0259fj(cls));
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(objM1477y);
    }
}
