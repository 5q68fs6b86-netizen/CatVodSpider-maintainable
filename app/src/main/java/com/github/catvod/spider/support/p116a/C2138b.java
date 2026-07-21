package com.github.catvod.spider.support.p116a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p116a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2138b {

    /* JADX INFO: renamed from: a */
    private static final Set<File> f5008a = new HashSet();

    /* JADX INFO: renamed from: b */
    private static final boolean f5009b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p116a.b$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC2613a f5010a;

        /* JADX INFO: renamed from: com.github.catvod.spider.support.p116a.b$a$a, reason: collision with other inner class name */
        private interface InterfaceC2613a {
            /* JADX INFO: renamed from: a */
            Object mo5407a(File file, DexFile dexFile);
        }

        /* JADX INFO: renamed from: com.github.catvod.spider.support.p116a.b$a$b */
        private static class b implements InterfaceC2613a {

            /* JADX INFO: renamed from: a */
            private final Constructor<?> f5011a;

            b(Class<?> cls) throws NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.f5011a = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.github.catvod.spider.support.p116a.C2138b.a.InterfaceC2613a
            /* JADX INFO: renamed from: a */
            public final Object mo5407a(File file, DexFile dexFile) {
                return this.f5011a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        /* JADX INFO: renamed from: com.github.catvod.spider.support.p116a.b$a$c */
        private static class c implements InterfaceC2613a {

            /* JADX INFO: renamed from: a */
            private final Constructor<?> f5012a;

            c(Class<?> cls) throws NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.f5012a = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.github.catvod.spider.support.p116a.C2138b.a.InterfaceC2613a
            /* JADX INFO: renamed from: a */
            public final Object mo5407a(File file, DexFile dexFile) {
                return this.f5012a.newInstance(file, file, dexFile);
            }
        }

        /* JADX INFO: renamed from: com.github.catvod.spider.support.p116a.b$a$d */
        private static class d implements InterfaceC2613a {

            /* JADX INFO: renamed from: a */
            private final Constructor<?> f5013a;

            d(Class<?> cls) throws NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.f5013a = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.github.catvod.spider.support.p116a.C2138b.a.InterfaceC2613a
            /* JADX INFO: renamed from: a */
            public final Object mo5407a(File file, DexFile dexFile) {
                return this.f5013a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        private a() throws ClassNotFoundException {
            InterfaceC2613a dVar;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    dVar = new b(cls);
                } catch (NoSuchMethodException unused) {
                    dVar = new c(cls);
                }
            } catch (NoSuchMethodException unused2) {
                dVar = new d(cls);
            }
            this.f5010a = dVar;
        }

        /* JADX INFO: renamed from: a */
        static void m5406a(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException {
            Object obj = C2138b.m5402e(classLoader, "pathList").get(classLoader);
            a aVar = new a();
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = list.get(i);
                InterfaceC2613a interfaceC2613a = aVar.f5010a;
                String path = file.getPath();
                File parentFile = file.getParentFile();
                String name = file.getName();
                objArr[i] = interfaceC2613a.mo5407a(file, DexFile.loadDex(path, new File(parentFile, name.substring(0, name.length() - 4) + ".dex").getPath(), 0));
            }
            try {
                C2138b.m5399b(obj, "dexElements", objArr);
            } catch (NoSuchFieldException e) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
                C2138b.m5399b(obj, "pathElements", objArr);
            }
        }
    }

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
            if (matcher.matches()) {
                try {
                    int i = Integer.parseInt(matcher.group(1));
                    int i2 = Integer.parseInt(matcher.group(2));
                    if (i > 2 || (i == 2 && i2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(property);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        f5009b = z;
    }

    /* JADX INFO: renamed from: b */
    static void m5399b(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException {
        Field fieldM5402e = m5402e(obj, str);
        Object[] objArr2 = (Object[]) fieldM5402e.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldM5402e.set(obj, objArr3);
    }

    /* JADX INFO: renamed from: c */
    private static void m5400c(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sbM5396a = C2137a.m5396a("Clearing old secondary dex dir (");
            sbM5396a.append(file.getPath());
            sbM5396a.append(").");
            Log.i("MultiDex", sbM5396a.toString());
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                StringBuilder sbM5396a2 = C2137a.m5396a("Failed to list secondary dex dir content (");
                sbM5396a2.append(file.getPath());
                sbM5396a2.append(").");
                Log.w("MultiDex", sbM5396a2.toString());
                return;
            }
            for (File file2 : fileArrListFiles) {
                StringBuilder sbM5396a3 = C2137a.m5396a("Trying to delete old file ");
                sbM5396a3.append(file2.getPath());
                sbM5396a3.append(" of size ");
                sbM5396a3.append(file2.length());
                Log.i("MultiDex", sbM5396a3.toString());
                if (file2.delete()) {
                    StringBuilder sbM5396a4 = C2137a.m5396a("Deleted old file ");
                    sbM5396a4.append(file2.getPath());
                    Log.i("MultiDex", sbM5396a4.toString());
                } else {
                    StringBuilder sbM5396a5 = C2137a.m5396a("Failed to delete old file ");
                    sbM5396a5.append(file2.getPath());
                    Log.w("MultiDex", sbM5396a5.toString());
                }
            }
            if (file.delete()) {
                StringBuilder sbM5396a6 = C2137a.m5396a("Deleted old secondary dex dir ");
                sbM5396a6.append(file.getPath());
                Log.i("MultiDex", sbM5396a6.toString());
            } else {
                StringBuilder sbM5396a7 = C2137a.m5396a("Failed to delete secondary dex dir ");
                sbM5396a7.append(file.getPath());
                Log.w("MultiDex", sbM5396a7.toString());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m5401d(Context context, File file, File file2) {
        Set<File> set = f5008a;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            int i = Build.VERSION.SDK_INT;
            if (i > 20) {
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + i + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
            }
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader == null) {
                    Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                    return;
                }
                try {
                    m5400c(context);
                } catch (Throwable th) {
                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                }
                File file3 = new File(file2, "code_cache");
                try {
                    m5405h(file3);
                } catch (IOException unused) {
                    file3 = new File(context.getFilesDir(), "code_cache");
                    m5405h(file3);
                }
                File file4 = new File(file3, "secondary-dexes");
                m5405h(file4);
                C2141e c2141e = new C2141e(file, file4);
                IOException e = null;
                try {
                    try {
                        m5404g(classLoader, file4, c2141e.m5416e(context, false));
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e2);
                        m5404g(classLoader, file4, c2141e.m5416e(context, true));
                    }
                    try {
                        c2141e.close();
                    } catch (IOException e3) {
                        e = e3;
                    }
                    if (e != null) {
                        throw e;
                    }
                } catch (Throwable th2) {
                    try {
                        c2141e.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            } catch (RuntimeException e4) {
                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static Field m5402e(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: renamed from: f */
    public static void m5403f(Context context) {
        ApplicationInfo applicationInfo;
        String str;
        Log.i("MultiDex", "Installing application");
        if (f5009b) {
            str = "VM has multidex support, MultiDex support library is disabled.";
        } else {
            try {
                try {
                    applicationInfo = context.getApplicationInfo();
                } catch (RuntimeException e) {
                    Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
                    applicationInfo = null;
                }
                if (applicationInfo == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                } else {
                    m5401d(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                    str = "install done";
                }
            } catch (Exception e2) {
                Log.e("MultiDex", "MultiDex installation failure", e2);
                StringBuilder sbM5396a = C2137a.m5396a("MultiDex installation failed (");
                sbM5396a.append(e2.getMessage());
                sbM5396a.append(").");
                throw new RuntimeException(sbM5396a.toString());
            }
        }
        Log.i("MultiDex", str);
    }

    /* JADX INFO: renamed from: g */
    private static void m5404g(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException {
        Method declaredMethod;
        IOException[] iOExceptionArr;
        if (list.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            a.m5406a(classLoader, list);
            return;
        }
        Object obj = m5402e(classLoader, "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        Class<?> superclass = obj.getClass();
        while (true) {
            if (superclass == null) {
                throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
            }
            try {
                declaredMethod = superclass.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchMethodException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        m5399b(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
            }
            Field fieldM5402e = m5402e(obj, "dexElementsSuppressedExceptions");
            IOException[] iOExceptionArr2 = (IOException[]) fieldM5402e.get(obj);
            if (iOExceptionArr2 == null) {
                iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
            } else {
                IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                arrayList.toArray(iOExceptionArr3);
                System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                iOExceptionArr = iOExceptionArr3;
            }
            fieldM5402e.set(obj, iOExceptionArr);
            IOException iOException = new IOException("I/O exception during makeDexElement");
            iOException.initCause((Throwable) arrayList.get(0));
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m5405h(File file) throws IOException {
        String string;
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            StringBuilder sbM5396a = C2137a.m5396a("Failed to create dir ");
            sbM5396a.append(file.getPath());
            sbM5396a.append(". Parent file is null.");
            string = sbM5396a.toString();
        } else {
            StringBuilder sbM5396a2 = C2137a.m5396a("Failed to create dir ");
            sbM5396a2.append(file.getPath());
            sbM5396a2.append(". parent file is a dir ");
            sbM5396a2.append(parentFile.isDirectory());
            sbM5396a2.append(", a file ");
            sbM5396a2.append(parentFile.isFile());
            sbM5396a2.append(", exists ");
            sbM5396a2.append(parentFile.exists());
            sbM5396a2.append(", readable ");
            sbM5396a2.append(parentFile.canRead());
            sbM5396a2.append(", writable ");
            sbM5396a2.append(parentFile.canWrite());
            string = sbM5396a2.toString();
        }
        Log.e("MultiDex", string);
        StringBuilder sbM5396a3 = C2137a.m5396a("Failed to create directory ");
        sbM5396a3.append(file.getPath());
        throw new IOException(sbM5396a3.toString());
    }
}
