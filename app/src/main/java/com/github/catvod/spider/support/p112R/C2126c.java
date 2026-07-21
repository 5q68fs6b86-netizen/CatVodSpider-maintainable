package com.github.catvod.spider.support.p112R;

import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p113S.C2129c;
import com.github.catvod.spider.support.p114T.C2132c;
import com.github.catvod.spider.support.p114T.C2133d;
import com.github.catvod.spider.support.p114T.C2134e;
import com.github.catvod.spider.support.p116a.C2137a;
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

/* JADX INFO: renamed from: com.github.catvod.spider.support.R.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2126c {

    /* JADX INFO: renamed from: a */
    static volatile int f4979a;

    /* JADX INFO: renamed from: b */
    static final C2133d f4980b = new C2133d();

    /* JADX INFO: renamed from: c */
    static final C0082a f4981c = new C0082a();

    /* JADX INFO: renamed from: d */
    static boolean f4982d;

    /* JADX INFO: renamed from: e */
    private static final String[] f4983e;

    /* JADX INFO: renamed from: f */
    private static String f4984f;

    static {
        String property = null;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
        }
        f4982d = property == null ? false : property.equalsIgnoreCase("true");
        f4983e = new String[]{"1.6", "1.7"};
        f4984f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    private C2126c() {
    }

    /* JADX INFO: renamed from: a */
    private static final void m5367a() {
        Set<URL> setM5368b = null;
        try {
            try {
                if (!m5372f()) {
                    setM5368b = m5368b();
                    m5375i(setM5368b);
                }
                StaticLoggerBinder.getSingleton();
                f4979a = 3;
                m5374h(setM5368b);
            } catch (Exception e) {
                f4979a = 2;
                C2134e.m5389c("Failed to instantiate SLF4J LoggerFactory", e);
                throw new IllegalStateException("Unexpected initialization failure", e);
            } catch (NoClassDefFoundError e2) {
                String message = e2.getMessage();
                boolean z = false;
                if (message != null && (message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    z = true;
                }
                if (!z) {
                    f4979a = 2;
                    C2134e.m5389c("Failed to instantiate SLF4J LoggerFactory", e2);
                    throw e2;
                }
                f4979a = 4;
                C2134e.m5388b("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C2134e.m5388b("Defaulting to no-operation (NOP) logger implementation");
                C2134e.m5388b("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e3) {
                String message2 = e3.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f4979a = 2;
                    C2134e.m5388b("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    C2134e.m5388b("Your binding is version 1.5.5 or earlier.");
                    C2134e.m5388b("Upgrade your binding to version 1.6.x.");
                }
                throw e3;
            }
            m5373g();
        } catch (Throwable th) {
            m5373g();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    static Set<URL> m5368b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C2126c.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f4984f) : classLoader.getResources(f4984f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            C2134e.m5389c("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.github.catvod.spider.support.R.a, org.slf4j.ILoggerFactory] */
    /* JADX INFO: renamed from: c */
    public static InterfaceC2124a m5369c() {
        if (f4979a == 0) {
            synchronized (C2126c.class) {
                if (f4979a == 0) {
                    f4979a = 1;
                    m5367a();
                    if (f4979a == 3) {
                        m5376j();
                    }
                }
            }
        }
        int i = f4979a;
        if (i == 1) {
            return f4980b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f4981c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC2125b m5370d(Class<?> cls) {
        Class<?> clsM5387a;
        InterfaceC2125b interfaceC2125bMo850a = m5369c().mo850a(cls.getName());
        if (f4982d && (clsM5387a = C2134e.m5387a()) != null && (!clsM5387a.isAssignableFrom(cls))) {
            C2134e.m5388b(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", interfaceC2125bMo850a.getName(), clsM5387a.getName()));
            C2134e.m5388b("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC2125bMo850a;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC2125b m5371e(String str) {
        return m5369c().mo850a(str);
    }

    /* JADX INFO: renamed from: f */
    private static boolean m5372f() {
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
    private static void m5373g() {
        C2133d c2133d = f4980b;
        synchronized (c2133d) {
            c2133d.m5386e();
            for (C2132c c2132c : (ArrayList) c2133d.m5385d()) {
                c2132c.m5382f(m5371e(c2132c.getName()));
            }
        }
        LinkedBlockingQueue<C2129c> linkedBlockingQueueM5384c = f4980b.m5384c();
        int size = linkedBlockingQueueM5384c.size();
        ArrayList<C2129c> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueM5384c.drainTo(arrayList, 128) != 0) {
            for (C2129c c2129c : arrayList) {
                if (c2129c != null) {
                    C2132c c2132cM5377a = c2129c.m5377a();
                    String name = c2132cM5377a.getName();
                    if (c2132cM5377a.m5380d()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!c2132cM5377a.m5379c()) {
                        if (c2132cM5377a.m5378b()) {
                            c2132cM5377a.m5381e(c2129c);
                        } else {
                            C2134e.m5388b(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c2129c.m5377a().m5378b()) {
                        C2134e.m5388b("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        C2134e.m5388b("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        C2134e.m5388b("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!c2129c.m5377a().m5379c()) {
                        C2134e.m5388b("The following set of substitute loggers may have been accessed");
                        C2134e.m5388b("during the initialization phase. Logging calls during this");
                        C2134e.m5388b("phase were not honored. However, subsequent logging calls to these");
                        C2134e.m5388b("loggers will work as normally expected.");
                        C2134e.m5388b("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        f4980b.m5383b();
    }

    /* JADX INFO: renamed from: h */
    private static void m5374h(Set<URL> set) {
        if (set != null) {
            if (set.size() > 1) {
                StringBuilder sbM5396a = C2137a.m5396a("Actual binding is of type [");
                sbM5396a.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                sbM5396a.append("]");
                C2134e.m5388b(sbM5396a.toString());
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m5375i(Set<URL> set) {
        if (set.size() > 1) {
            C2134e.m5388b("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                C2134e.m5388b("Found binding in [" + it.next() + "]");
            }
            C2134e.m5388b("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* JADX INFO: renamed from: j */
    private static final void m5376j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f4983e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C2134e.m5388b("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f4983e).toString());
            C2134e.m5388b("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C2134e.m5389c("Unexpected problem occured during version sanity check", th);
        }
    }
}
