package com.github.catvod.spider.support.p012C0.p038n0;

import com.github.catvod.spider.support.p012C0.p0.c;
import com.github.catvod.spider.support.p012C0.p0.d;
import com.github.catvod.spider.support.p012C0.p0.f;
import com.github.catvod.spider.support.p012C0.p020W.C1013a;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p038n0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1261c {

    /* JADX INFO: renamed from: a */
    static volatile int f2962a;

    /* JADX INFO: renamed from: b */
    static final d f2963b = new d();

    /* JADX INFO: renamed from: c */
    static final C1013a f2964c = new C1013a();

    /* JADX INFO: renamed from: d */
    static boolean f2965d;

    /* JADX INFO: renamed from: e */
    private static final String[] f2966e;

    /* JADX INFO: renamed from: f */
    private static String f2967f;

    static {
        String property = null;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException e) {
        }
        f2965d = property == null ? false : property.equalsIgnoreCase("true");
        f2966e = new String[]{"1.6", "1.7"};
        f2967f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    private C1261c() {
    }

    /* JADX INFO: renamed from: a */
    private static final void m3135a() {
        Set<URL> setM3136b = null;
        try {
            try {
                if (!m3140f()) {
                    setM3136b = m3136b();
                    m3143i(setM3136b);
                }
                StaticLoggerBinder.getSingleton();
                f2962a = 3;
                m3142h(setM3136b);
            } catch (Exception e) {
                f2962a = 2;
                f.c("Failed to instantiate SLF4J LoggerFactory", e);
                throw new IllegalStateException("Unexpected initialization failure", e);
            } catch (NoClassDefFoundError e2) {
                String message = e2.getMessage();
                boolean z = false;
                if (message != null && (message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    z = true;
                }
                if (!z) {
                    f2962a = 2;
                    f.c("Failed to instantiate SLF4J LoggerFactory", e2);
                    throw e2;
                }
                f2962a = 4;
                f.b("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                f.b("Defaulting to no-operation (NOP) logger implementation");
                f.b("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e3) {
                String message2 = e3.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f2962a = 2;
                    f.b("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    f.b("Your binding is version 1.5.5 or earlier.");
                    f.b("Upgrade your binding to version 1.6.x.");
                }
                throw e3;
            }
            m3141g();
        } catch (Throwable th) {
            m3141g();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    static Set<URL> m3136b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C1261c.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f2967f) : classLoader.getResources(f2967f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            f.c("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.github.catvod.spider.support.p012C0.p038n0.a, org.slf4j.ILoggerFactory] */
    /* JADX INFO: renamed from: c */
    public static InterfaceC1259a m3137c() {
        if (f2962a == 0) {
            synchronized (C1261c.class) {
                try {
                    if (f2962a == 0) {
                        f2962a = 1;
                        m3135a();
                        if (f2962a == 3) {
                            m3144j();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = f2962a;
        if (i == 1) {
            return f2963b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f2964c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC1260b m3138d(Class<?> cls) {
        Class clsA;
        InterfaceC1260b interfaceC1260bMo2551a = m3137c().mo2551a(cls.getName());
        if (f2965d && (clsA = f.a()) != null && (!clsA.isAssignableFrom(cls))) {
            f.b(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", interfaceC1260bMo2551a.m3134b(), clsA.getName()));
            f.b("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC1260bMo2551a;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC1260b m3139e(String str) {
        return m3137c().mo2551a(str);
    }

    /* JADX INFO: renamed from: f */
    private static boolean m3140f() {
        String property = null;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException e) {
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    /* JADX INFO: renamed from: g */
    private static void m3141g() {
        d dVar = f2963b;
        synchronized (dVar) {
            dVar.e();
            for (c cVar : (ArrayList) dVar.d()) {
                cVar.g(m3139e(cVar.b()));
            }
        }
        LinkedBlockingQueue linkedBlockingQueueC = f2963b.c();
        int size = linkedBlockingQueueC.size();
        ArrayList<com.github.catvod.spider.support.p012C0.o0.c> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            int i2 = i;
            for (com.github.catvod.spider.support.p012C0.o0.c cVar2 : arrayList) {
                if (cVar2 != null) {
                    c cVarA = cVar2.a();
                    String strB = cVarA.b();
                    if (cVarA.e()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!cVarA.d()) {
                        if (cVarA.c()) {
                            cVarA.f(cVar2);
                        } else {
                            f.b(strB);
                        }
                    }
                }
                if (i2 == 0) {
                    if (cVar2.a().c()) {
                        f.b("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        f.b("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        f.b("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!cVar2.a().d()) {
                        f.b("The following set of substitute loggers may have been accessed");
                        f.b("during the initialization phase. Logging calls during this");
                        f.b("phase were not honored. However, subsequent logging calls to these");
                        f.b("loggers will work as normally expected.");
                        f.b("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2++;
            }
            arrayList.clear();
            i = i2;
        }
        f2963b.b();
    }

    /* JADX INFO: renamed from: h */
    private static void m3142h(Set<URL> set) {
        if (set != null) {
            if (set.size() > 1) {
                StringBuilder sbM2774b = C1064d.m2774b("Actual binding is of type [");
                sbM2774b.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                sbM2774b.append("]");
                f.b(sbM2774b.toString());
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m3143i(Set<URL> set) {
        if (set.size() > 1) {
            f.b("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                f.b("Found binding in [" + it.next() + "]");
            }
            f.b("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* JADX INFO: renamed from: j */
    private static final void m3144j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f2966e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            f.b("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f2966e).toString());
            f.b("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError e) {
        } catch (Throwable th) {
            f.c("Unexpected problem occured during version sanity check", th);
        }
    }
}
