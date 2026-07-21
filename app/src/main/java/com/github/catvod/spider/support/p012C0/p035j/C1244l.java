package com.github.catvod.spider.support.p012C0.p035j;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p029e0.C1211g;
import com.github.catvod.spider.support.p012C0.p033h0.C1240d;
import com.github.catvod.spider.support.p012C0.p040x.C1265f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.j.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1244l {
    /* JADX INFO: renamed from: a */
    public static final Object m3098a(Throwable th) {
        return new C1265f(th);
    }

    /* JADX INFO: renamed from: b */
    public static C1211g m3099b(C1053l c1053l) {
        C1211g c1211g = new C1211g();
        while (true) {
            c1053l = c1053l.m2703b0();
            if (c1053l == null) {
                break;
            }
            c1211g.add(c1053l);
        }
        if (c1211g.size() > 0) {
            return c1211g;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m3100c(C1053l c1053l, C1240d c1240d) {
        Iterator<C1053l> it = c1053l.m2709f0().m2695R().iterator();
        int i = 1;
        while (it.hasNext()) {
            C1053l next = it.next();
            if (c1053l.m2719n0().equals(next.m2719n0()) && c1240d.m3062a().contains(next)) {
                if (c1053l == next) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static C1211g m3101d(C1053l c1053l) {
        C1211g c1211g = new C1211g();
        while (true) {
            c1053l = c1053l.m2711i0();
            if (c1053l == null) {
                break;
            }
            c1211g.add(c1053l);
        }
        if (c1211g.size() > 0) {
            return c1211g;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m3102e(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
            }
            bufferedReader.close();
            String string = sb.toString();
            int i = C1247o.f2943a;
            return (string == null || string.length() <= 1) ? string : string.substring(0, string.length() - 1);
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3103f(C1053l c1053l, int i) {
        c1053l.mo2746b("EL_SAME_TAG_INDEX_KEY", String.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public static void m3104g(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            try {
                Runtime.getRuntime().exec("chmod 777 " + file).waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
