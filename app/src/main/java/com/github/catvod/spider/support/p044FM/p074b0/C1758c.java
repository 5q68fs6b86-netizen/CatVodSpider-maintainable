package com.github.catvod.spider.support.p044FM.p074b0;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.github.catvod.spider.support.p044FM.p076c0.C1771c;
import com.github.catvod.spider.support.p044FM.p078d0.C1789c;
import com.github.catvod.spider.support.p044FM.p078d0.C1790d;
import com.github.catvod.spider.support.p044FM.p078d0.C1792f;
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

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1758c {

    /* JADX INFO: renamed from: a */
    static volatile int f3866a;

    /* JADX INFO: renamed from: b */
    static final C1790d f3867b = new C1790d();

    /* JADX INFO: renamed from: c */
    static final C1711a f3868c = new C1711a();

    /* JADX INFO: renamed from: d */
    static boolean f3869d;

    /* JADX INFO: renamed from: e */
    private static final String[] f3870e;

    /* JADX INFO: renamed from: f */
    private static String f3871f;

    static {
        String property = null;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
        }
        f3869d = property == null ? false : property.equalsIgnoreCase("true");
        f3870e = new String[]{"1.6", "1.7"};
        f3871f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    private C1758c() {
    }

    /* JADX INFO: renamed from: a */
    private static final void m4164a() {
        Set<URL> setM4165b = null;
        try {
            try {
                if (!m4169f()) {
                    setM4165b = m4165b();
                    m4172i(setM4165b);
                }
                StaticLoggerBinder.getSingleton();
                f3866a = 3;
                m4171h(setM4165b);
            } catch (Exception e) {
                f3866a = 2;
                C1792f.m4297c("Failed to instantiate SLF4J LoggerFactory", e);
                throw new IllegalStateException("Unexpected initialization failure", e);
            } catch (NoClassDefFoundError e2) {
                String message = e2.getMessage();
                boolean z = false;
                if (message != null && (message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    z = true;
                }
                if (!z) {
                    f3866a = 2;
                    C1792f.m4297c("Failed to instantiate SLF4J LoggerFactory", e2);
                    throw e2;
                }
                f3866a = 4;
                C1792f.m4296b("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C1792f.m4296b("Defaulting to no-operation (NOP) logger implementation");
                C1792f.m4296b("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e3) {
                String message2 = e3.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f3866a = 2;
                    C1792f.m4296b("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    C1792f.m4296b("Your binding is version 1.5.5 or earlier.");
                    C1792f.m4296b("Upgrade your binding to version 1.6.x.");
                }
                throw e3;
            }
            m4170g();
        } catch (Throwable th) {
            m4170g();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    static Set<URL> m4165b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C1758c.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f3871f) : classLoader.getResources(f3871f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            C1792f.m4297c("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.github.catvod.spider.support.FM.b0.a, org.slf4j.ILoggerFactory] */
    /* JADX INFO: renamed from: c */
    public static InterfaceC1756a m4166c() {
        if (f3866a == 0) {
            synchronized (C1758c.class) {
                if (f3866a == 0) {
                    f3866a = 1;
                    m4164a();
                    if (f3866a == 3) {
                        m4173j();
                    }
                }
            }
        }
        int i = f3866a;
        if (i == 1) {
            return f3867b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f3868c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC1757b m4167d(Class<?> cls) {
        Class<?> clsM4295a;
        InterfaceC1757b interfaceC1757bMo3993a = m4166c().mo3993a(cls.getName());
        if (f3869d && (clsM4295a = C1792f.m4295a()) != null && (!clsM4295a.isAssignableFrom(cls))) {
            C1792f.m4296b(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", interfaceC1757bMo3993a.getName(), clsM4295a.getName()));
            C1792f.m4296b("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC1757bMo3993a;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC1757b m4168e(String str) {
        return m4166c().mo3993a(str);
    }

    /* JADX INFO: renamed from: f */
    private static boolean m4169f() {
        String property = null;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    /* JADX INFO: renamed from: g */
    private static void m4170g() {
        C1790d c1790d = f3867b;
        synchronized (c1790d) {
            c1790d.m4294e();
            for (C1789c c1789c : (ArrayList) c1790d.m4293d()) {
                c1789c.m4290f(m4168e(c1789c.getName()));
            }
        }
        LinkedBlockingQueue<C1771c> linkedBlockingQueueM4292c = f3867b.m4292c();
        int size = linkedBlockingQueueM4292c.size();
        ArrayList<C1771c> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueM4292c.drainTo(arrayList, 128) != 0) {
            for (C1771c c1771c : arrayList) {
                if (c1771c != null) {
                    C1789c c1789cM4229a = c1771c.m4229a();
                    String name = c1789cM4229a.getName();
                    if (c1789cM4229a.m4288d()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!c1789cM4229a.m4287c()) {
                        if (c1789cM4229a.m4286b()) {
                            c1789cM4229a.m4289e(c1771c);
                        } else {
                            C1792f.m4296b(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c1771c.m4229a().m4286b()) {
                        C1792f.m4296b("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        C1792f.m4296b("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        C1792f.m4296b("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!c1771c.m4229a().m4287c()) {
                        C1792f.m4296b("The following set of substitute loggers may have been accessed");
                        C1792f.m4296b("during the initialization phase. Logging calls during this");
                        C1792f.m4296b("phase were not honored. However, subsequent logging calls to these");
                        C1792f.m4296b("loggers will work as normally expected.");
                        C1792f.m4296b("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        f3867b.m4291b();
    }

    /* JADX INFO: renamed from: h */
    private static void m4171h(Set<URL> set) {
        if (set != null) {
            if (set.size() > 1) {
                StringBuilder sbM3589b = C1434P.m3589b("Actual binding is of type [");
                sbM3589b.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                sbM3589b.append("]");
                C1792f.m4296b(sbM3589b.toString());
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m4172i(Set<URL> set) {
        if (set.size() > 1) {
            C1792f.m4296b("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                C1792f.m4296b("Found binding in [" + it.next() + "]");
            }
            C1792f.m4296b("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* JADX INFO: renamed from: j */
    private static final void m4173j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f3870e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C1792f.m4296b("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f3870e).toString());
            C1792f.m4296b("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C1792f.m4297c("Unexpected problem occured during version sanity check", th);
        }
    }
}
