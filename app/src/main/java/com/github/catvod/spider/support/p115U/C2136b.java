package com.github.catvod.spider.support.p115U;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.github.catvod.spider.support.U.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2136b {

    /* JADX INFO: renamed from: d */
    static final Class f5003d;

    /* JADX INFO: renamed from: a */
    protected Vector f5004a;

    /* JADX INFO: renamed from: b */
    protected String f5005b;

    /* JADX INFO: renamed from: c */
    protected Hashtable f5006c = new Hashtable();

    static {
        new C2136b();
        f5003d = C2136b.class;
    }

    protected C2136b() {
    }

    /* JADX INFO: renamed from: a */
    public static C2136b m5390a() throws C2135a {
        Class<?> cls;
        Object objNewInstance;
        boolean z;
        try {
            InputStream resourceAsStream = f5003d.getResourceAsStream("/META-INF/services/org.xmlpull.v1.XmlPullParserFactory");
            if (resourceAsStream == null) {
                throw new C2135a("resource not found: /META-INF/services/org.xmlpull.v1.XmlPullParserFactory make sure that parser implementing XmlPull API is available");
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int i = resourceAsStream.read();
                if (i < 0) {
                    break;
                }
                if (i > 32) {
                    stringBuffer.append((char) i);
                }
            }
            resourceAsStream.close();
            String string = stringBuffer.toString();
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("resource /META-INF/services/org.xmlpull.v1.XmlPullParserFactory that contained '");
            stringBuffer2.append(string);
            stringBuffer2.append("'");
            String string2 = stringBuffer2.toString();
            Vector vector = new Vector();
            new Vector();
            C2136b c2136b = null;
            int i2 = 0;
            while (i2 < string.length()) {
                int iIndexOf = string.indexOf(44, i2);
                if (iIndexOf == -1) {
                    iIndexOf = string.length();
                }
                String strSubstring = string.substring(i2, iIndexOf);
                try {
                    cls = Class.forName(strSubstring);
                    try {
                        objNewInstance = cls.newInstance();
                    } catch (Exception unused) {
                        objNewInstance = null;
                    }
                } catch (Exception unused2) {
                    cls = null;
                }
                if (cls != null) {
                    boolean z2 = true;
                    if (objNewInstance instanceof XmlPullParser) {
                        vector.addElement(cls);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(objNewInstance instanceof C2136b)) {
                        z2 = z;
                    } else if (c2136b == null) {
                        c2136b = (C2136b) objNewInstance;
                    }
                    if (!z2) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("incompatible class: ");
                        stringBuffer3.append(strSubstring);
                        throw new C2135a(stringBuffer3.toString());
                    }
                }
                i2 = iIndexOf + 1;
            }
            if (c2136b == null) {
                c2136b = new C2136b();
            }
            c2136b.f5004a = vector;
            c2136b.f5005b = string2;
            return c2136b;
        } catch (Exception e) {
            throw new C2135a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final XmlPullParser m5391b() throws C2135a {
        Vector vector = this.f5004a;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Factory initialization was incomplete - has not tried ");
            stringBuffer.append(this.f5005b);
            throw new C2135a(stringBuffer.toString());
        }
        if (vector.size() == 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("No valid parser classes found in ");
            stringBuffer2.append(this.f5005b);
            throw new C2135a(stringBuffer2.toString());
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        for (int i = 0; i < this.f5004a.size(); i++) {
            Class cls = (Class) this.f5004a.elementAt(i);
            try {
                XmlPullParser xmlPullParser = (XmlPullParser) cls.newInstance();
                Enumeration enumerationKeys = this.f5006c.keys();
                while (enumerationKeys.hasMoreElements()) {
                    String str = (String) enumerationKeys.nextElement();
                    Boolean bool = (Boolean) this.f5006c.get(str);
                    if (bool != null && bool.booleanValue()) {
                        xmlPullParser.setFeature(str, true);
                    }
                }
                return xmlPullParser;
            } catch (Exception e) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(cls.getName());
                stringBuffer4.append(": ");
                stringBuffer4.append(e.toString());
                stringBuffer4.append("; ");
                stringBuffer3.append(stringBuffer4.toString());
            }
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("could not create parser: ");
        stringBuffer5.append((Object) stringBuffer3);
        throw new C2135a(stringBuffer5.toString());
    }

    /* JADX INFO: renamed from: c */
    public final void m5392c() {
        this.f5006c.put("http://xmlpull.org/v1/doc/features.html#process-namespaces", new Boolean(true));
    }
}
