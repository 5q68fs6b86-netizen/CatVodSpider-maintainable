package com.github.catvod.spider.support.p140z;

import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p139y.C2419b;
import com.github.catvod.spider.support.p139y.C2421d;
import com.github.catvod.spider.support.p139y.C2422e;
import com.github.catvod.spider.support.p139y.C2423f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.z.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2427b implements Serializable {

    /* JADX INFO: renamed from: q */
    public static final AbstractC2427b f5988q = new a();

    /* JADX INFO: renamed from: r */
    private static final ThreadLocal<WeakHashMap<Object, Object>> f5989r;

    /* JADX INFO: renamed from: c */
    private boolean f5992c;

    /* JADX INFO: renamed from: h */
    private boolean f5997h;

    /* JADX INFO: renamed from: a */
    private boolean f5990a = true;

    /* JADX INFO: renamed from: b */
    private boolean f5991b = true;

    /* JADX INFO: renamed from: d */
    private boolean f5993d = true;

    /* JADX INFO: renamed from: e */
    private String f5994e = "[";

    /* JADX INFO: renamed from: f */
    private String f5995f = "]";

    /* JADX INFO: renamed from: g */
    private String f5996g = "=";

    /* JADX INFO: renamed from: i */
    private String f5998i = ",";

    /* JADX INFO: renamed from: j */
    private String f5999j = "{";

    /* JADX INFO: renamed from: k */
    private String f6000k = "}";

    /* JADX INFO: renamed from: l */
    private String f6001l = "<null>";

    /* JADX INFO: renamed from: m */
    private String f6002m = "<size=";

    /* JADX INFO: renamed from: n */
    private String f6003n = ">";

    /* JADX INFO: renamed from: o */
    private String f6004o = "<";

    /* JADX INFO: renamed from: p */
    private String f6005p = ">";

    /* JADX INFO: renamed from: com.github.catvod.spider.support.z.b$a */
    private static final class a extends AbstractC2427b {
        a() {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.z.b$b */
    private static final class b extends AbstractC2427b {
        b() {
            m6462H();
            m6464J();
            m6488y("{");
            m6487x("}");
            m6486w();
            m6485v();
            m6455A(",");
            m6489z();
            m6457C();
            m6461G();
            m6460F();
            m6459E();
            m6458D();
        }

        @Override // com.github.catvod.spider.support.p140z.AbstractC2427b
        /* JADX INFO: renamed from: a */
        public final void mo6466a(StringBuffer stringBuffer, Object obj) {
            super.mo6466a(stringBuffer, obj);
        }

        @Override // com.github.catvod.spider.support.p140z.AbstractC2427b
        /* JADX INFO: renamed from: c */
        protected final void mo6468c(StringBuffer stringBuffer, char c) {
            String strValueOf = String.valueOf(c);
            stringBuffer.append('\"');
            stringBuffer.append(C2422e.m6436a(strValueOf));
            stringBuffer.append('\"');
        }

        @Override // com.github.catvod.spider.support.p140z.AbstractC2427b
        /* JADX INFO: renamed from: e */
        protected final void mo6470e(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                m6477l(stringBuffer);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Character)) {
                String string = obj.toString();
                stringBuffer.append('\"');
                stringBuffer.append(C2422e.m6436a(string));
                stringBuffer.append('\"');
                return;
            }
            if ((obj instanceof Number) || (obj instanceof Boolean)) {
                stringBuffer.append(obj);
                return;
            }
            String string2 = obj.toString();
            boolean z = false;
            if (!(string2.startsWith(m6483r()) && string2.endsWith(m6482q()))) {
                if (string2.startsWith(m6481p()) && string2.endsWith(m6480o())) {
                    z = true;
                }
                if (!z) {
                    mo6470e(stringBuffer, str, string2);
                    return;
                }
            }
            stringBuffer.append(obj);
        }

        @Override // com.github.catvod.spider.support.p140z.AbstractC2427b
        /* JADX INFO: renamed from: f */
        protected final void mo6471f(StringBuffer stringBuffer, String str, Collection<?> collection) {
            if (collection == null || collection.isEmpty()) {
                stringBuffer.append(collection);
                return;
            }
            stringBuffer.append(m6481p());
            int i = 0;
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                m6469d(stringBuffer, str, i, it.next());
                i++;
            }
            stringBuffer.append(m6480o());
        }

        @Override // com.github.catvod.spider.support.p140z.AbstractC2427b
        /* JADX INFO: renamed from: g */
        protected final void mo6472g(StringBuffer stringBuffer, Map map) {
            if (map == null || map.isEmpty()) {
                stringBuffer.append(map);
                return;
            }
            stringBuffer.append(m6483r());
            boolean z = true;
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                String string = key != null ? key.toString() : null;
                if (string != null) {
                    if (z) {
                        z = false;
                    } else {
                        m6474i(stringBuffer);
                    }
                    mo6475j(stringBuffer, string);
                    Object value = entry.getValue();
                    if (value == null) {
                        m6477l(stringBuffer);
                    } else {
                        m6476k(stringBuffer, string, value, true);
                    }
                }
            }
            stringBuffer.append(m6482q());
        }

        @Override // com.github.catvod.spider.support.p140z.AbstractC2427b
        /* JADX INFO: renamed from: j */
        protected final void mo6475j(StringBuffer stringBuffer, String str) {
            StringBuilder sbM5396a = C2137a.m5396a("\"");
            sbM5396a.append(C2422e.m6436a(str));
            sbM5396a.append("\"");
            super.mo6475j(stringBuffer, sbM5396a.toString());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.z.b$c */
    private static final class c extends AbstractC2427b {
        c() {
            m6488y("[");
            m6455A(System.lineSeparator() + "  ");
            m6456B();
            m6487x(System.lineSeparator() + "]");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.z.b$d */
    private static final class d extends AbstractC2427b {
        d() {
            m6462H();
            m6464J();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.z.b$e */
    private static final class e extends AbstractC2427b {
        e() {
            m6463I();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.z.b$f */
    private static final class f extends AbstractC2427b {
        f() {
            m6465K();
            m6464J();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.z.b$g */
    private static final class g extends AbstractC2427b {
        g() {
            m6462H();
            m6464J();
            m6463I();
            m6488y("");
            m6487x("");
        }
    }

    static {
        new c();
        new e();
        new f();
        new g();
        new d();
        new b();
        f5989r = new ThreadLocal<>();
    }

    protected AbstractC2427b() {
    }

    /* JADX INFO: renamed from: L */
    static void m6452L(Object obj) {
        Map<Object, Object> mapM6453t;
        if (obj == null || (mapM6453t = m6453t()) == null) {
            return;
        }
        mapM6453t.remove(obj);
        if (mapM6453t.isEmpty()) {
            f5989r.remove();
        }
    }

    /* JADX INFO: renamed from: t */
    static Map<Object, Object> m6453t() {
        return f5989r.get();
    }

    /* JADX INFO: renamed from: u */
    static void m6454u(Object obj) {
        if (obj != null) {
            if (m6453t() == null) {
                f5989r.set(new WeakHashMap<>());
            }
            m6453t().put(obj, null);
        }
    }

    /* JADX INFO: renamed from: A */
    protected final void m6455A(String str) {
        if (str == null) {
            str = "";
        }
        this.f5998i = str;
    }

    /* JADX INFO: renamed from: B */
    protected final void m6456B() {
        this.f5997h = true;
    }

    /* JADX INFO: renamed from: C */
    protected final void m6457C() {
        this.f6001l = "null";
    }

    /* JADX INFO: renamed from: D */
    protected final void m6458D() {
        this.f6003n = ">\"";
    }

    /* JADX INFO: renamed from: E */
    protected final void m6459E() {
        this.f6002m = "\"<size=";
    }

    /* JADX INFO: renamed from: F */
    protected final void m6460F() {
        this.f6005p = ">\"";
    }

    /* JADX INFO: renamed from: G */
    protected final void m6461G() {
        this.f6004o = "\"<";
    }

    /* JADX INFO: renamed from: H */
    protected final void m6462H() {
        this.f5991b = false;
    }

    /* JADX INFO: renamed from: I */
    protected final void m6463I() {
        this.f5990a = false;
    }

    /* JADX INFO: renamed from: J */
    protected final void m6464J() {
        this.f5993d = false;
    }

    /* JADX INFO: renamed from: K */
    protected final void m6465K() {
        this.f5992c = true;
    }

    /* JADX INFO: renamed from: a */
    public void mo6466a(StringBuffer stringBuffer, Object obj) {
        mo6475j(stringBuffer, "value");
        if (obj == null) {
            stringBuffer.append(this.f6001l);
        } else {
            m6476k(stringBuffer, "value", obj, true);
        }
        stringBuffer.append(this.f5998i);
    }

    /* JADX INFO: renamed from: b */
    public final void m6467b(StringBuffer stringBuffer, String str, boolean z) {
        mo6475j(stringBuffer, str);
        stringBuffer.append(z);
        stringBuffer.append(this.f5998i);
    }

    /* JADX INFO: renamed from: c */
    protected void mo6468c(StringBuffer stringBuffer, char c2) {
        stringBuffer.append(c2);
    }

    /* JADX INFO: renamed from: d */
    protected final void m6469d(StringBuffer stringBuffer, String str, int i, Object obj) {
        if (i > 0) {
            stringBuffer.append(",");
        }
        if (obj == null) {
            stringBuffer.append(this.f6001l);
        } else {
            m6476k(stringBuffer, str, obj, true);
        }
    }

    /* JADX INFO: renamed from: e */
    protected void mo6470e(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    /* JADX INFO: renamed from: f */
    protected void mo6471f(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    /* JADX INFO: renamed from: g */
    protected void mo6472g(StringBuffer stringBuffer, Map map) {
        stringBuffer.append(map);
    }

    /* JADX INFO: renamed from: h */
    public final void m6473h(StringBuffer stringBuffer, Object obj) {
        if (C2423f.m6437a(stringBuffer, this.f5998i)) {
            stringBuffer.setLength(stringBuffer.length() - this.f5998i.length());
        }
        stringBuffer.append(this.f5995f);
        m6452L(obj);
    }

    /* JADX INFO: renamed from: i */
    protected final void m6474i(StringBuffer stringBuffer) {
        stringBuffer.append(this.f5998i);
    }

    /* JADX INFO: renamed from: j */
    protected void mo6475j(StringBuffer stringBuffer, String str) {
        if (!this.f5990a || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f5996g);
    }

    /* JADX INFO: renamed from: k */
    protected final void m6476k(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        int size;
        Map<Object, Object> mapM6453t = m6453t();
        int i = 0;
        if ((mapM6453t != null && mapM6453t.containsKey(obj)) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            C2421d.m6435a(stringBuffer, obj);
            return;
        }
        m6454u(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    mo6471f(stringBuffer, str, (Collection) obj);
                } else {
                    size = ((Collection) obj).size();
                    m6479n(stringBuffer, size);
                }
            } else if (obj instanceof Map) {
                if (z) {
                    mo6472g(stringBuffer, (Map) obj);
                } else {
                    size = ((Map) obj).size();
                    m6479n(stringBuffer, size);
                }
            } else if (obj instanceof long[]) {
                if (z) {
                    long[] jArr = (long[]) obj;
                    stringBuffer.append(this.f5999j);
                    while (i < jArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(jArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f6000k);
                } else {
                    m6479n(stringBuffer, ((long[]) obj).length);
                }
            } else if (obj instanceof int[]) {
                if (z) {
                    int[] iArr = (int[]) obj;
                    stringBuffer.append(this.f5999j);
                    while (i < iArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(iArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f6000k);
                } else {
                    m6479n(stringBuffer, ((int[]) obj).length);
                }
            } else if (obj instanceof short[]) {
                if (z) {
                    short[] sArr = (short[]) obj;
                    stringBuffer.append(this.f5999j);
                    while (i < sArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) sArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f6000k);
                } else {
                    m6479n(stringBuffer, ((short[]) obj).length);
                }
            } else if (obj instanceof byte[]) {
                if (z) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer.append(this.f5999j);
                    while (i < bArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) bArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f6000k);
                } else {
                    m6479n(stringBuffer, ((byte[]) obj).length);
                }
            } else if (obj instanceof char[]) {
                if (z) {
                    char[] cArr = (char[]) obj;
                    stringBuffer.append(this.f5999j);
                    while (i < cArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        mo6468c(stringBuffer, cArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f6000k);
                } else {
                    m6479n(stringBuffer, ((char[]) obj).length);
                }
            } else if (obj instanceof double[]) {
                if (z) {
                    double[] dArr = (double[]) obj;
                    stringBuffer.append(this.f5999j);
                    while (i < dArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(dArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f6000k);
                } else {
                    m6479n(stringBuffer, ((double[]) obj).length);
                }
            } else if (obj instanceof float[]) {
                if (z) {
                    float[] fArr = (float[]) obj;
                    stringBuffer.append(this.f5999j);
                    while (i < fArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(fArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f6000k);
                } else {
                    m6479n(stringBuffer, ((float[]) obj).length);
                }
            } else if (obj instanceof boolean[]) {
                if (z) {
                    boolean[] zArr = (boolean[]) obj;
                    stringBuffer.append(this.f5999j);
                    while (i < zArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(zArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f6000k);
                } else {
                    m6479n(stringBuffer, ((boolean[]) obj).length);
                }
            } else if (obj.getClass().isArray()) {
                if (z) {
                    Object[] objArr = (Object[]) obj;
                    stringBuffer.append(this.f5999j);
                    while (i < objArr.length) {
                        Object obj2 = objArr[i];
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        if (obj2 == null) {
                            stringBuffer.append(this.f6001l);
                        } else {
                            m6476k(stringBuffer, str, obj2, true);
                        }
                        i++;
                    }
                    stringBuffer.append(this.f6000k);
                } else {
                    m6479n(stringBuffer, ((Object[]) obj).length);
                }
            } else if (z) {
                mo6470e(stringBuffer, str, obj);
            } else {
                stringBuffer.append(this.f6004o);
                stringBuffer.append(C2419b.m6433a(obj.getClass()));
                stringBuffer.append(this.f6005p);
            }
        } finally {
            m6452L(obj);
        }
    }

    /* JADX INFO: renamed from: l */
    protected final void m6477l(StringBuffer stringBuffer) {
        stringBuffer.append(this.f6001l);
    }

    /* JADX INFO: renamed from: m */
    public final void m6478m(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            if (this.f5991b) {
                m6454u(obj);
                boolean z = this.f5992c;
                Class<?> cls = obj.getClass();
                stringBuffer.append(z ? C2419b.m6433a(cls) : cls.getName());
            }
            if (this.f5993d) {
                m6454u(obj);
                stringBuffer.append('@');
                stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            }
            stringBuffer.append(this.f5994e);
            if (this.f5997h) {
                stringBuffer.append(this.f5998i);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    protected final void m6479n(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.f6002m);
        stringBuffer.append(i);
        stringBuffer.append(this.f6003n);
    }

    /* JADX INFO: renamed from: o */
    protected final String m6480o() {
        return this.f6000k;
    }

    /* JADX INFO: renamed from: p */
    protected final String m6481p() {
        return this.f5999j;
    }

    /* JADX INFO: renamed from: q */
    protected final String m6482q() {
        return this.f5995f;
    }

    /* JADX INFO: renamed from: r */
    protected final String m6483r() {
        return this.f5994e;
    }

    /* JADX INFO: renamed from: s */
    protected final String m6484s() {
        return this.f6001l;
    }

    /* JADX INFO: renamed from: v */
    protected final void m6485v() {
        this.f6000k = "]";
    }

    /* JADX INFO: renamed from: w */
    protected final void m6486w() {
        this.f5999j = "[";
    }

    /* JADX INFO: renamed from: x */
    protected final void m6487x(String str) {
        if (str == null) {
            str = "";
        }
        this.f5995f = str;
    }

    /* JADX INFO: renamed from: y */
    protected final void m6488y(String str) {
        this.f5994e = str;
    }

    /* JADX INFO: renamed from: z */
    protected final void m6489z() {
        this.f5996g = ":";
    }
}
