package com.github.catvod.spider.support.p044FM.p080e0;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.e0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1800b {

    /* JADX INFO: renamed from: d */
    static final Class f4054d;

    /* JADX INFO: renamed from: a */
    protected Vector f4055a;

    /* JADX INFO: renamed from: b */
    protected String f4056b;

    /* JADX INFO: renamed from: c */
    protected Hashtable f4057c = new Hashtable();

    static {
        new C1800b();
        f4054d = C1800b.class;
    }

    protected C1800b() {
    }

    /* JADX INFO: renamed from: a */
    public static C1800b m4336a() throws C1799a {
        Class<?> cls;
        Object objNewInstance;
        boolean z;
        try {
            InputStream resourceAsStream = f4054d.getResourceAsStream("/META-INF/services/org.xmlpull.v1.XmlPullParserFactory");
            if (resourceAsStream == null) {
                throw new C1799a("resource not found: /META-INF/services/org.xmlpull.v1.XmlPullParserFactory make sure that parser implementing XmlPull API is available");
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
            C1800b c1800b = null;
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
                    if (!(objNewInstance instanceof C1800b)) {
                        z2 = z;
                    } else if (c1800b == null) {
                        c1800b = (C1800b) objNewInstance;
                    }
                    if (!z2) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("incompatible class: ");
                        stringBuffer3.append(strSubstring);
                        throw new C1799a(stringBuffer3.toString());
                    }
                }
                i2 = iIndexOf + 1;
            }
            if (c1800b == null) {
                c1800b = new C1800b();
            }
            c1800b.f4055a = vector;
            c1800b.f4056b = string2;
            return c1800b;
        } catch (Exception e) {
            throw new C1799a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final XmlPullParser m4337b() throws C1799a {
        Vector vector = this.f4055a;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Factory initialization was incomplete - has not tried ");
            stringBuffer.append(this.f4056b);
            throw new C1799a(stringBuffer.toString());
        }
        if (vector.size() == 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("No valid parser classes found in ");
            stringBuffer2.append(this.f4056b);
            throw new C1799a(stringBuffer2.toString());
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        for (int i = 0; i < this.f4055a.size(); i++) {
            Class cls = (Class) this.f4055a.elementAt(i);
            try {
                XmlPullParser xmlPullParser = (XmlPullParser) cls.newInstance();
                Enumeration enumerationKeys = this.f4057c.keys();
                while (enumerationKeys.hasMoreElements()) {
                    String str = (String) enumerationKeys.nextElement();
                    Boolean bool = (Boolean) this.f4057c.get(str);
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
        throw new C1799a(stringBuffer5.toString());
    }

    /* JADX INFO: renamed from: c */
    public final void m4338c() {
        this.f4057c.put("http://xmlpull.org/v1/doc/features.html#process-namespaces", new Boolean(true));
    }
}
