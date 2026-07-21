package com.github.catvod.spider.support.p132q;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Properties;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p132q.b */
/* JADX INFO: loaded from: classes.dex */
final class C2294b {

    /* JADX INFO: renamed from: a */
    private static boolean f5723a;

    /* JADX INFO: renamed from: b */
    static /* synthetic */ Class f5724b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p132q.b$a */
    private static abstract class a {
        private a() {
        }

        /* JADX INFO: renamed from: a */
        abstract ClassLoader m6205a();
    }

    static {
        try {
            f5723a = System.getProperty("xml.stream.debug") != null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ Class m6201a() {
        return C2294b.class;
    }

    /* JADX INFO: renamed from: b */
    private static void m6202b(String str) {
        if (f5723a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("STREAM: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c A[PHI: r2
      0x004c: PHI (r2v2 java.lang.Class<com.github.catvod.spider.support.p132q.b>) = (r2v0 java.lang.Class<com.github.catvod.spider.support.p132q.b>), (r2v3 java.lang.Class<com.github.catvod.spider.support.p132q.b>) binds: [B:15:0x0044, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    static Object m6203c() {
        Class<C2294b> cls;
        ClassLoader classLoader;
        Class<C2294b> cls2 = C2294b.class;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Class<C2294b> cls3 = f5724b;
            if (cls3 == null) {
                m6201a();
                f5724b = cls2;
                cls3 = cls2;
            }
            stringBuffer.append(cls3.getName());
            stringBuffer.append("$ClassLoaderFinderConcrete");
            classLoader = ((a) Class.forName(stringBuffer.toString()).newInstance()).m6205a();
        } catch (ClassNotFoundException unused) {
            cls = f5724b;
            if (cls == null) {
                m6201a();
                f5724b = cls2;
            } else {
                cls2 = cls;
            }
            classLoader = cls2.getClassLoader();
        } catch (Exception e) {
            throw new C2293a(e.toString(), e);
        } catch (LinkageError unused2) {
            cls = f5724b;
            if (cls == null) {
                m6201a();
                f5724b = cls2;
            } else {
                cls2 = cls;
            }
            classLoader = cls2.getClassLoader();
        }
        try {
            String property = System.getProperty("javax.xml.stream.XMLInputFactory");
            if (property != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("found system property");
                stringBuffer2.append(property);
                m6202b(stringBuffer2.toString());
                return m6204d(property, classLoader);
            }
        } catch (SecurityException unused3) {
        }
        try {
            String property2 = System.getProperty("java.home");
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(property2);
            String str = File.separator;
            stringBuffer3.append(str);
            stringBuffer3.append("lib");
            stringBuffer3.append(str);
            stringBuffer3.append("jaxp.properties");
            File file = new File(stringBuffer3.toString());
            if (file.exists()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream(file));
                String property3 = properties.getProperty("javax.xml.stream.XMLInputFactory");
                if (property3 != null && property3.length() > 0) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("found java.home property ");
                    stringBuffer4.append(property3);
                    m6202b(stringBuffer4.toString());
                    return m6204d(property3, classLoader);
                }
            }
        } catch (Exception e2) {
            if (f5723a) {
                e2.printStackTrace();
            }
        }
        try {
            InputStream systemResourceAsStream = classLoader == null ? ClassLoader.getSystemResourceAsStream("META-INF/services/javax.xml.stream.XMLInputFactory") : classLoader.getResourceAsStream("META-INF/services/javax.xml.stream.XMLInputFactory");
            if (systemResourceAsStream != null) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("found ");
                stringBuffer5.append("META-INF/services/javax.xml.stream.XMLInputFactory");
                m6202b(stringBuffer5.toString());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(systemResourceAsStream, "UTF-8"));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                if (line != null && !"".equals(line)) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("loaded from services: ");
                    stringBuffer6.append(line);
                    m6202b(stringBuffer6.toString());
                    return m6204d(line, classLoader);
                }
            }
        } catch (Exception e3) {
            if (f5723a) {
                e3.printStackTrace();
            }
        }
        m6202b("loaded from fallback value: com.bea.xml.stream.MXParserFactory");
        return m6204d("com.bea.xml.stream.MXParserFactory", classLoader);
    }

    /* JADX INFO: renamed from: d */
    private static Object m6204d(String str, ClassLoader classLoader) {
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Provider ");
            stringBuffer.append(str);
            stringBuffer.append(" not found");
            throw new C2293a(stringBuffer.toString(), e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Provider ");
            stringBuffer2.append(str);
            stringBuffer2.append(" could not be instantiated: ");
            stringBuffer2.append(e2);
            throw new C2293a(stringBuffer2.toString(), e2);
        }
    }
}
