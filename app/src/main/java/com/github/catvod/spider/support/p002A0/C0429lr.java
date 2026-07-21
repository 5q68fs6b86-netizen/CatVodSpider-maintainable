package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.lr */
/* JADX INFO: loaded from: classes.dex */
public final class C0429lr implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final C0429lr f1169a = new C0429lr(0);

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1170b;

    /* JADX INFO: renamed from: e */
    public boolean f1173e;

    /* JADX INFO: renamed from: j */
    public boolean f1178j;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1187s;

    /* JADX INFO: renamed from: c */
    public boolean f1171c = true;

    /* JADX INFO: renamed from: d */
    public boolean f1172d = true;

    /* JADX INFO: renamed from: f */
    public boolean f1174f = true;

    /* JADX INFO: renamed from: g */
    public String f1175g = "[";

    /* JADX INFO: renamed from: h */
    public String f1176h = "]";

    /* JADX INFO: renamed from: i */
    public String f1177i = "=";

    /* JADX INFO: renamed from: k */
    public String f1179k = ",";

    /* JADX INFO: renamed from: l */
    public String f1180l = "{";

    /* JADX INFO: renamed from: m */
    public String f1181m = "}";

    /* JADX INFO: renamed from: n */
    public String f1182n = "<null>";

    /* JADX INFO: renamed from: o */
    public String f1183o = "<size=";

    /* JADX INFO: renamed from: p */
    public String f1184p = ">";

    /* JADX INFO: renamed from: q */
    public String f1185q = "<";

    /* JADX INFO: renamed from: r */
    public String f1186r = ">";

    static {
        C0429lr c0429lr = new C0429lr(2);
        c0429lr.f1175g = "[";
        String str = System.lineSeparator() + "  ";
        if (str == null) {
            str = "";
        }
        c0429lr.f1179k = str;
        c0429lr.f1178j = true;
        String str2 = System.lineSeparator() + "]";
        if (str2 == null) {
            str2 = "";
        }
        c0429lr.f1176h = str2;
        new C0429lr(4).f1171c = false;
        C0429lr c0429lr2 = new C0429lr(5);
        c0429lr2.f1173e = true;
        c0429lr2.f1174f = false;
        C0429lr c0429lr3 = new C0429lr(6);
        c0429lr3.f1172d = false;
        c0429lr3.f1174f = false;
        c0429lr3.f1171c = false;
        c0429lr3.f1175g = "";
        c0429lr3.f1176h = "";
        C0429lr c0429lr4 = new C0429lr(3);
        c0429lr4.f1172d = false;
        c0429lr4.f1174f = false;
        C0429lr c0429lr5 = new C0429lr(1);
        c0429lr5.f1172d = false;
        c0429lr5.f1174f = false;
        c0429lr5.f1175g = "{";
        c0429lr5.f1176h = "}";
        c0429lr5.f1180l = "[";
        c0429lr5.f1181m = "]";
        c0429lr5.f1179k = ",";
        c0429lr5.f1177i = ":";
        c0429lr5.f1182n = "null";
        c0429lr5.f1185q = "\"<";
        c0429lr5.f1186r = ">\"";
        c0429lr5.f1183o = "\"<size=";
        c0429lr5.f1184p = ">\"";
        f1170b = new ThreadLocal();
    }

    public C0429lr(int i) {
        this.f1187s = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m1407t(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocal = f1170b;
            if (((Map) threadLocal.get()) == null) {
                threadLocal.set(new WeakHashMap());
            }
            ((Map) threadLocal.get()).put(obj, null);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m1408u(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocal = f1170b;
            Map map = (Map) threadLocal.get();
            if (map != null) {
                map.remove(obj);
                if (map.isEmpty()) {
                    threadLocal.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: aa */
    public final void m1409aa(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        Map map = (Map) f1170b.get();
        int i = 0;
        if (map != null && map.containsKey(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            Objects.requireNonNull(obj, new C0306hc("object", new Object[0]));
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
            stringBuffer.append(name);
            stringBuffer.append('@');
            stringBuffer.append(hexString);
            return;
        }
        m1407t(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    m1412w(stringBuffer, str, (Collection) obj);
                } else {
                    m1410ab(stringBuffer, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z) {
                    m1413x(stringBuffer, (Map) obj);
                } else {
                    m1410ab(stringBuffer, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z) {
                    long[] jArr = (long[]) obj;
                    stringBuffer.append(this.f1180l);
                    while (i < jArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(jArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f1181m);
                } else {
                    m1410ab(stringBuffer, ((long[]) obj).length);
                }
            } else if (obj instanceof int[]) {
                if (z) {
                    int[] iArr = (int[]) obj;
                    stringBuffer.append(this.f1180l);
                    while (i < iArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(iArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f1181m);
                } else {
                    m1410ab(stringBuffer, ((int[]) obj).length);
                }
            } else if (obj instanceof short[]) {
                if (z) {
                    short[] sArr = (short[]) obj;
                    stringBuffer.append(this.f1180l);
                    while (i < sArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) sArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f1181m);
                } else {
                    m1410ab(stringBuffer, ((short[]) obj).length);
                }
            } else if (obj instanceof byte[]) {
                if (z) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer.append(this.f1180l);
                    while (i < bArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) bArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f1181m);
                } else {
                    m1410ab(stringBuffer, ((byte[]) obj).length);
                }
            } else if (obj instanceof char[]) {
                if (z) {
                    char[] cArr = (char[]) obj;
                    stringBuffer.append(this.f1180l);
                    while (i < cArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        char c = cArr[i];
                        switch (this.f1187s) {
                            case 1:
                                String strValueOf = String.valueOf(c);
                                stringBuffer.append('\"');
                                stringBuffer.append(AbstractC0195d.m1092b(strValueOf));
                                stringBuffer.append('\"');
                                break;
                            default:
                                stringBuffer.append(c);
                                break;
                        }
                        i++;
                    }
                    stringBuffer.append(this.f1181m);
                } else {
                    m1410ab(stringBuffer, ((char[]) obj).length);
                }
            } else if (obj instanceof double[]) {
                if (z) {
                    double[] dArr = (double[]) obj;
                    stringBuffer.append(this.f1180l);
                    while (i < dArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(dArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f1181m);
                } else {
                    m1410ab(stringBuffer, ((double[]) obj).length);
                }
            } else if (obj instanceof float[]) {
                if (z) {
                    float[] fArr = (float[]) obj;
                    stringBuffer.append(this.f1180l);
                    while (i < fArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(fArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f1181m);
                } else {
                    m1410ab(stringBuffer, ((float[]) obj).length);
                }
            } else if (obj instanceof boolean[]) {
                if (z) {
                    boolean[] zArr = (boolean[]) obj;
                    stringBuffer.append(this.f1180l);
                    while (i < zArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(zArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.f1181m);
                } else {
                    m1410ab(stringBuffer, ((boolean[]) obj).length);
                }
            } else if (obj.getClass().isArray()) {
                if (z) {
                    Object[] objArr = (Object[]) obj;
                    stringBuffer.append(this.f1180l);
                    while (i < objArr.length) {
                        Object obj2 = objArr[i];
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        if (obj2 == null) {
                            stringBuffer.append(this.f1182n);
                        } else {
                            m1409aa(stringBuffer, str, obj2, true);
                        }
                        i++;
                    }
                    stringBuffer.append(this.f1181m);
                } else {
                    m1410ab(stringBuffer, ((Object[]) obj).length);
                }
            } else if (z) {
                m1411v(stringBuffer, str, obj);
            } else {
                stringBuffer.append(this.f1185q);
                stringBuffer.append(AbstractC0616sp.m1690c(obj.getClass()));
                stringBuffer.append(this.f1186r);
            }
        } finally {
            m1408u(obj);
        }
    }

    /* JADX INFO: renamed from: ab */
    public final void m1410ab(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.f1183o);
        stringBuffer.append(i);
        stringBuffer.append(this.f1184p);
    }

    /* JADX INFO: renamed from: v */
    public void m1411v(StringBuffer stringBuffer, String str, Object obj) {
        switch (this.f1187s) {
            case 1:
                if (obj == null) {
                    stringBuffer.append(this.f1182n);
                } else if ((obj instanceof String) || (obj instanceof Character)) {
                    String string = obj.toString();
                    stringBuffer.append('\"');
                    stringBuffer.append(AbstractC0195d.m1092b(string));
                    stringBuffer.append('\"');
                } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
                    stringBuffer.append(obj);
                } else {
                    String string2 = obj.toString();
                    if ((string2.startsWith(this.f1175g) && string2.endsWith(this.f1176h)) || (string2.startsWith(this.f1180l) && string2.endsWith(this.f1181m))) {
                        stringBuffer.append(obj);
                    } else {
                        m1411v(stringBuffer, str, string2);
                    }
                }
                break;
            default:
                stringBuffer.append(obj);
                break;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m1412w(StringBuffer stringBuffer, String str, Collection collection) {
        switch (this.f1187s) {
            case 1:
                if (collection == null || collection.isEmpty()) {
                    stringBuffer.append(collection);
                } else {
                    stringBuffer.append(this.f1180l);
                    int i = 0;
                    for (Object obj : collection) {
                        int i2 = i + 1;
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        if (obj == null) {
                            stringBuffer.append(this.f1182n);
                        } else {
                            m1409aa(stringBuffer, str, obj, true);
                        }
                        i = i2;
                    }
                    stringBuffer.append(this.f1181m);
                }
                break;
            default:
                stringBuffer.append(collection);
                break;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m1413x(StringBuffer stringBuffer, Map map) {
        switch (this.f1187s) {
            case 1:
                if (map == null || map.isEmpty()) {
                    stringBuffer.append(map);
                } else {
                    stringBuffer.append(this.f1175g);
                    boolean z = true;
                    for (Object __en_entry : map.entrySet()) { Map.Entry entry = (Map.Entry) __en_entry;
                        String string = Objects.toString(entry.getKey(), null);
                        if (string != null) {
                            if (z) {
                                z = false;
                            } else {
                                stringBuffer.append(this.f1179k);
                            }
                            m1414y(stringBuffer, string);
                            Object value = entry.getValue();
                            if (value == null) {
                                stringBuffer.append(this.f1182n);
                            } else {
                                m1409aa(stringBuffer, string, value, true);
                            }
                        }
                    }
                    stringBuffer.append(this.f1176h);
                }
                break;
            default:
                stringBuffer.append(map);
                break;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m1414y(StringBuffer stringBuffer, String str) {
        switch (this.f1187s) {
            case 1:
                m1415z(stringBuffer, "\"" + AbstractC0195d.m1092b(str) + "\"");
                break;
            default:
                m1415z(stringBuffer, str);
                break;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m1415z(StringBuffer stringBuffer, String str) {
        if (!this.f1171c || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f1177i);
    }
}
