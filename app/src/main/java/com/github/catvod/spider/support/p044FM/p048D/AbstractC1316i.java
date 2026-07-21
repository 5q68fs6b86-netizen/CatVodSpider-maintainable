package com.github.catvod.spider.support.p044FM.p048D;

import com.github.catvod.spider.support.p044FM.p047C.C1299b;
import com.github.catvod.spider.support.p044FM.p047C.C1301d;
import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.D.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1316i implements Serializable {

    /* JADX INFO: renamed from: q */
    public static final AbstractC1316i f3035q = new C1309b();

    /* JADX INFO: renamed from: r */
    private static final ThreadLocal<WeakHashMap<Object, Object>> f3036r;

    /* JADX INFO: renamed from: c */
    private boolean f3039c;

    /* JADX INFO: renamed from: h */
    private boolean f3044h;

    /* JADX INFO: renamed from: a */
    private boolean f3037a = true;

    /* JADX INFO: renamed from: b */
    private boolean f3038b = true;

    /* JADX INFO: renamed from: d */
    private boolean f3040d = true;

    /* JADX INFO: renamed from: e */
    private String f3041e = "[";

    /* JADX INFO: renamed from: f */
    private String f3042f = "]";

    /* JADX INFO: renamed from: g */
    private String f3043g = "=";

    /* JADX INFO: renamed from: i */
    private String f3045i = ",";

    /* JADX INFO: renamed from: j */
    private String f3046j = "{";

    /* JADX INFO: renamed from: k */
    private String f3047k = "}";

    /* JADX INFO: renamed from: l */
    private String f3048l = "<null>";

    /* JADX INFO: renamed from: m */
    private String f3049m = "<size=";

    /* JADX INFO: renamed from: n */
    private String f3050n = ">";

    /* JADX INFO: renamed from: o */
    private String f3051o = "<";

    /* JADX INFO: renamed from: p */
    private String f3052p = ">";

    static {
        new C1311d();
        new C1313f();
        new C1314g();
        new C1315h();
        new C1312e();
        new C1310c();
        f3036r = new ThreadLocal<>();
    }

    protected AbstractC1316i() {
    }

    /* JADX INFO: renamed from: L */
    static void m3267L(Object obj) {
        Map<Object, Object> mapM3268t;
        if (obj == null || (mapM3268t = m3268t()) == null) {
            return;
        }
        mapM3268t.remove(obj);
        if (mapM3268t.isEmpty()) {
            f3036r.remove();
        }
    }

    /* JADX INFO: renamed from: t */
    static Map<Object, Object> m3268t() {
        return f3036r.get();
    }

    /* JADX INFO: renamed from: u */
    static void m3269u(Object obj) {
        if (obj != null) {
            if (m3268t() == null) {
                f3036r.set(new WeakHashMap<>());
            }
            m3268t().put(obj, null);
        }
    }

    /* JADX INFO: renamed from: A */
    protected final void m3270A(String str) {
        if (str == null) {
            str = "";
        }
        this.f3045i = str;
    }

    /* JADX INFO: renamed from: B */
    protected final void m3271B() {
        this.f3044h = true;
    }

    /* JADX INFO: renamed from: C */
    protected final void m3272C() {
        this.f3048l = "null";
    }

    /* JADX INFO: renamed from: D */
    protected final void m3273D() {
        this.f3050n = ">\"";
    }

    /* JADX INFO: renamed from: E */
    protected final void m3274E() {
        this.f3049m = "\"<size=";
    }

    /* JADX INFO: renamed from: F */
    protected final void m3275F() {
        this.f3052p = ">\"";
    }

    /* JADX INFO: renamed from: G */
    protected final void m3276G() {
        this.f3051o = "\"<";
    }

    /* JADX INFO: renamed from: H */
    protected final void m3277H() {
        this.f3038b = false;
    }

    /* JADX INFO: renamed from: I */
    protected final void m3278I() {
        this.f3037a = false;
    }

    /* JADX INFO: renamed from: J */
    protected final void m3279J() {
        this.f3040d = false;
    }

    /* JADX INFO: renamed from: K */
    protected final void m3280K() {
        this.f3039c = true;
    }

    /* JADX INFO: renamed from: a */
    public void mo3261a(StringBuffer stringBuffer, Object obj) {
        mo3266j(stringBuffer, "value");
        if (obj == null) {
            stringBuffer.append(this.f3048l);
        } else {
            m3285k(stringBuffer, "value", obj, true);
        }
        stringBuffer.append(this.f3045i);
    }

    /* JADX INFO: renamed from: b */
    public final void m3281b(StringBuffer stringBuffer, String str, boolean z) {
        mo3266j(stringBuffer, str);
        stringBuffer.append(z);
        stringBuffer.append(this.f3045i);
    }

    /* JADX INFO: renamed from: c */
    protected void mo3262c(StringBuffer stringBuffer, char c) {
        stringBuffer.append(c);
    }

    /* JADX INFO: renamed from: d */
    protected final void m3282d(StringBuffer stringBuffer, String str, int i, Object obj) {
        if (i > 0) {
            stringBuffer.append(",");
        }
        if (obj == null) {
            stringBuffer.append(this.f3048l);
        } else {
            m3285k(stringBuffer, str, obj, true);
        }
    }

    /* JADX INFO: renamed from: e */
    protected void mo3263e(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    /* JADX INFO: renamed from: f */
    protected void mo3264f(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    /* JADX INFO: renamed from: g */
    protected void mo3265g(StringBuffer stringBuffer, Map map) {
        stringBuffer.append(map);
    }

    /* JADX INFO: renamed from: h */
    public final void m3283h(StringBuffer stringBuffer, Object obj) {
        if (C1305h.m3247a(stringBuffer, this.f3045i)) {
            stringBuffer.setLength(stringBuffer.length() - this.f3045i.length());
        }
        stringBuffer.append(this.f3042f);
        m3267L(obj);
    }

    /* JADX INFO: renamed from: i */
    protected final void m3284i(StringBuffer stringBuffer) {
        stringBuffer.append(this.f3045i);
    }

    /* JADX INFO: renamed from: j */
    protected void mo3266j(StringBuffer stringBuffer, String str) {
        if (!this.f3037a || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f3043g);
    }

    /* JADX INFO: renamed from: k */
    protected final void m3285k(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        int size;
        Map<Object, Object> mapM3268t = m3268t();
        int i = 0;
        if ((mapM3268t != null && mapM3268t.containsKey(obj)) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            C1301d.m3244a(stringBuffer, obj);
            return;
        }
        m3269u(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    mo3264f(stringBuffer, str, (Collection) obj);
                } else {
                    size = ((Collection) obj).size();
                    m3288n(stringBuffer, size);
                }
            } else if (obj instanceof Map) {
                if (z) {
                    mo3265g(stringBuffer, (Map) obj);
                } else {
                    size = ((Map) obj).size();
                    m3288n(stringBuffer, size);
                }
            } else if (obj instanceof long[]) {
                if (z) {
                    long[] jArr = (long[]) obj;
                    stringBuffer.append(this.f3046j);
                    while (i < jArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(jArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f3047k);
                } else {
                    m3288n(stringBuffer, ((long[]) obj).length);
                }
            } else if (obj instanceof int[]) {
                if (z) {
                    int[] iArr = (int[]) obj;
                    stringBuffer.append(this.f3046j);
                    while (i < iArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(iArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f3047k);
                } else {
                    m3288n(stringBuffer, ((int[]) obj).length);
                }
            } else if (obj instanceof short[]) {
                if (z) {
                    short[] sArr = (short[]) obj;
                    stringBuffer.append(this.f3046j);
                    while (i < sArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) sArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f3047k);
                } else {
                    m3288n(stringBuffer, ((short[]) obj).length);
                }
            } else if (obj instanceof byte[]) {
                if (z) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer.append(this.f3046j);
                    while (i < bArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) bArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f3047k);
                } else {
                    m3288n(stringBuffer, ((byte[]) obj).length);
                }
            } else if (obj instanceof char[]) {
                if (z) {
                    char[] cArr = (char[]) obj;
                    stringBuffer.append(this.f3046j);
                    while (i < cArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        mo3262c(stringBuffer, cArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f3047k);
                } else {
                    m3288n(stringBuffer, ((char[]) obj).length);
                }
            } else if (obj instanceof double[]) {
                if (z) {
                    double[] dArr = (double[]) obj;
                    stringBuffer.append(this.f3046j);
                    while (i < dArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(dArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f3047k);
                } else {
                    m3288n(stringBuffer, ((double[]) obj).length);
                }
            } else if (obj instanceof float[]) {
                if (z) {
                    float[] fArr = (float[]) obj;
                    stringBuffer.append(this.f3046j);
                    while (i < fArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(fArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f3047k);
                } else {
                    m3288n(stringBuffer, ((float[]) obj).length);
                }
            } else if (obj instanceof boolean[]) {
                if (z) {
                    boolean[] zArr = (boolean[]) obj;
                    stringBuffer.append(this.f3046j);
                    while (i < zArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(zArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f3047k);
                } else {
                    m3288n(stringBuffer, ((boolean[]) obj).length);
                }
            } else if (obj.getClass().isArray()) {
                if (z) {
                    Object[] objArr = (Object[]) obj;
                    stringBuffer.append(this.f3046j);
                    while (i < objArr.length) {
                        Object obj2 = objArr[i];
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        if (obj2 == null) {
                            stringBuffer.append(this.f3048l);
                        } else {
                            m3285k(stringBuffer, str, obj2, true);
                        }
                        i++;
                    }
                    stringBuffer.append(this.f3047k);
                } else {
                    m3288n(stringBuffer, ((Object[]) obj).length);
                }
            } else if (z) {
                mo3263e(stringBuffer, str, obj);
            } else {
                stringBuffer.append(this.f3051o);
                stringBuffer.append(C1299b.m3242a(obj.getClass()));
                stringBuffer.append(this.f3052p);
            }
        } finally {
            m3267L(obj);
        }
    }

    /* JADX INFO: renamed from: l */
    protected final void m3286l(StringBuffer stringBuffer) {
        stringBuffer.append(this.f3048l);
    }

    /* JADX INFO: renamed from: m */
    public final void m3287m(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            if (this.f3038b) {
                m3269u(obj);
                boolean z = this.f3039c;
                Class<?> cls = obj.getClass();
                stringBuffer.append(z ? C1299b.m3242a(cls) : cls.getName());
            }
            if (this.f3040d) {
                m3269u(obj);
                stringBuffer.append('@');
                stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            }
            stringBuffer.append(this.f3041e);
            if (this.f3044h) {
                stringBuffer.append(this.f3045i);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    protected final void m3288n(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.f3049m);
        stringBuffer.append(i);
        stringBuffer.append(this.f3050n);
    }

    /* JADX INFO: renamed from: o */
    protected final String m3289o() {
        return this.f3047k;
    }

    /* JADX INFO: renamed from: p */
    protected final String m3290p() {
        return this.f3046j;
    }

    /* JADX INFO: renamed from: q */
    protected final String m3291q() {
        return this.f3042f;
    }

    /* JADX INFO: renamed from: r */
    protected final String m3292r() {
        return this.f3041e;
    }

    /* JADX INFO: renamed from: s */
    protected final String m3293s() {
        return this.f3048l;
    }

    /* JADX INFO: renamed from: v */
    protected final void m3294v() {
        this.f3047k = "]";
    }

    /* JADX INFO: renamed from: w */
    protected final void m3295w() {
        this.f3046j = "[";
    }

    /* JADX INFO: renamed from: x */
    protected final void m3296x(String str) {
        if (str == null) {
            str = "";
        }
        this.f3042f = str;
    }

    /* JADX INFO: renamed from: y */
    protected final void m3297y(String str) {
        this.f3041e = str;
    }

    /* JADX INFO: renamed from: z */
    protected final void m3298z() {
        this.f3043g = ":";
    }
}
