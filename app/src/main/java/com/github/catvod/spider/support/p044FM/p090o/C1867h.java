package com.github.catvod.spider.support.p044FM.p090o;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p073b.C1747r;
import com.github.catvod.spider.support.p044FM.p073b.C1748s;
import com.github.catvod.spider.support.p044FM.p073b.RunnableC1736g;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1867h {

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f4294b;

    /* JADX INFO: renamed from: c */
    private final ExecutorService f4295c;

    /* JADX INFO: renamed from: d */
    private final String f4296d;

    /* JADX INFO: renamed from: f */
    private final int f4298f;

    /* JADX INFO: renamed from: g */
    private final int f4299g;

    /* JADX INFO: renamed from: h */
    private final int f4300h;

    /* JADX INFO: renamed from: m */
    private boolean f4305m;

    /* JADX INFO: renamed from: i */
    private long f4301i = -1;

    /* JADX INFO: renamed from: j */
    private long f4302j = -1;

    /* JADX INFO: renamed from: k */
    private long f4303k = -1;

    /* JADX INFO: renamed from: l */
    private long f4304l = -1;

    /* JADX INFO: renamed from: e */
    private final ReentrantLock f4297e = new ReentrantLock();

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<C1866g> f4293a = new LinkedBlockingQueue();

    public C1867h(String str, Map<String, String> map, int i, int i2) {
        this.f4296d = str;
        this.f4294b = map;
        this.f4299g = i;
        this.f4295c = Executors.newFixedThreadPool(i);
        this.f4300h = i2;
        this.f4298f = (int) Math.ceil(73400320 / i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m4515a(C1867h c1867h, PipedOutputStream pipedOutputStream) {
        c1867h.getClass();
        while (true) {
            try {
                try {
                    try {
                        byte[] bArrM4518e = c1867h.m4518e();
                        if (bArrM4518e == null || bArrM4518e.length == 0) {
                            break;
                            break;
                        }
                        pipedOutputStream.write(bArrM4518e);
                    } catch (Exception e) {
                        e.printStackTrace();
                        c1867h.f4305m = false;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } catch (Throwable th) {
                try {
                    c1867h.f4305m = false;
                    pipedOutputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                throw th;
            }
        }
        c1867h.f4305m = false;
        pipedOutputStream.close();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[LOOP:1: B:18:0x0040->B:22:0x0059, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[Catch: Exception -> 0x0102, TryCatch #0 {Exception -> 0x0102, blocks: (B:25:0x0061, B:26:0x0070, B:28:0x0078, B:30:0x008e, B:32:0x00bd, B:31:0x00b1, B:33:0x00c4, B:37:0x00d8, B:39:0x00de, B:40:0x00eb, B:41:0x0101), top: B:45:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008e A[Catch: Exception -> 0x0102, TryCatch #0 {Exception -> 0x0102, blocks: (B:25:0x0061, B:26:0x0070, B:28:0x0078, B:30:0x008e, B:32:0x00bd, B:31:0x00b1, B:33:0x00c4, B:37:0x00d8, B:39:0x00de, B:40:0x00eb, B:41:0x0101), top: B:45:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[Catch: Exception -> 0x0102, TryCatch #0 {Exception -> 0x0102, blocks: (B:25:0x0061, B:26:0x0070, B:28:0x0078, B:30:0x008e, B:32:0x00bd, B:31:0x00b1, B:33:0x00c4, B:37:0x00d8, B:39:0x00de, B:40:0x00eb, B:41:0x0101), top: B:45:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x010d A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static void m4516b(C1867h c1867h, int i) {
        String key;
        String value;
        long j;
        while (c1867h.f4305m && !Thread.interrupted()) {
            C1866g c1866g = null;
            c1867h.f4297e.lock();
            long j2 = c1867h.f4304l;
            long j3 = ((long) i) + j2;
            c1867h.f4304l = j3;
            long j4 = c1867h.f4302j;
            if (j2 <= j4) {
                j = j3 - 1;
                if (j <= j4) {
                    j4 = j;
                }
                c1866g = new C1866g(j2, j4);
                c1867h.f4293a.add(c1866g);
            }
            C1866g c1866g2 = c1866g;
            c1867h.f4297e.unlock();
            if (c1866g2 == null) {
                return;
            }
            while (c1867h.f4305m && c1866g2.f4290a - c1867h.f4303k >= ((long) c1867h.f4300h) * ((long) c1867h.f4298f)) {
                SystemClock.sleep(1000L);
            }
            while (c1867h.f4305m) {
                try {
                    HashMap map = new HashMap();
                    for (Map.Entry<String, String> entry : c1867h.f4294b.entrySet()) {
                        if (entry.getKey().equalsIgnoreCase("Range")) {
                            key = "Range";
                            value = String.format(Locale.getDefault(), "bytes=%d-%d", Long.valueOf(c1866g2.f4290a), Long.valueOf(c1866g2.f4291b));
                        } else {
                            key = entry.getKey();
                            value = entry.getValue();
                        }
                        map.put(key, value);
                    }
                    Response responseM4470e = C1840c.m4470e(c1867h.m4517d(), map);
                    int iCode = responseM4470e.code();
                    if (iCode >= 200 || iCode >= 300) {
                        throw new Exception("response code: " + iCode);
                    }
                    if (responseM4470e.body() == null) {
                        break;
                    }
                    c1866g2.m4514d(responseM4470e.body().bytes());
                    break;
                    while (c1867h.f4305m) {
                        C1866g c1866g3 = null;
                        c1867h.f4297e.lock();
                        long j5 = c1867h.f4304l;
                        long j6 = ((long) i) + j5;
                        c1867h.f4304l = j6;
                        long j7 = c1867h.f4302j;
                        if (j5 <= j7) {
                            j = j6 - 1;
                            if (j <= j7) {
                                j7 = j;
                            }
                            c1866g3 = new C1866g(j5, j7);
                            c1867h.f4293a.add(c1866g3);
                        }
                        C1866g c1866g4 = c1866g3;
                        c1867h.f4297e.unlock();
                        if (c1866g4 == null) {
                            return;
                        }
                        while (c1867h.f4305m) {
                            SystemClock.sleep(1000L);
                        }
                        while (c1867h.f4305m) {
                            HashMap map2 = new HashMap();
                            while (r7.hasNext()) {
                                if (entry.getKey().equalsIgnoreCase("Range")) {
                                    key = "Range";
                                    value = String.format(Locale.getDefault(), "bytes=%d-%d", Long.valueOf(c1866g4.f4290a), Long.valueOf(c1866g4.f4291b));
                                } else {
                                    key = entry.getKey();
                                    value = entry.getValue();
                                }
                                map2.put(key, value);
                            }
                            Response responseM4470e2 = C1840c.m4470e(c1867h.m4517d(), map2);
                            int iCode2 = responseM4470e2.code();
                            if (iCode2 >= 200) {
                            }
                            throw new Exception("response code: " + iCode2);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    SystemClock.sleep(1000L);
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private String m4517d() {
        return this.f4296d.contains("/proxy?") ? C1840c.m4479n(this.f4296d, null) : this.f4296d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.support.FM.o.g>, java.util.concurrent.LinkedBlockingQueue] */
    /* JADX INFO: renamed from: e */
    private byte[] m4518e() throws Exception {
        if (this.f4303k > this.f4302j) {
            this.f4305m = false;
            return null;
        }
        C1866g c1866g = (C1866g) this.f4293a.poll(10L, TimeUnit.SECONDS);
        if (c1866g == null) {
            this.f4305m = false;
            throw new Exception("read timeout");
        }
        while (this.f4305m) {
            byte[] bArrM4513c = c1866g.m4513c();
            if (bArrM4513c != null) {
                this.f4303k += (long) bArrM4513c.length;
                return bArrM4513c;
            }
            SystemClock.sleep(100L);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4519c() {
        this.f4305m = false;
        this.f4295c.shutdownNow();
    }

    /* JADX INFO: renamed from: f */
    public final Object[] m4520f() throws Exception {
        int i;
        if (!this.f4294b.containsKey("Range")) {
            this.f4294b.put("Range", "bytes=0-");
        }
        Matcher matcher = Pattern.compile("bytes=(\\d+)-(\\d+)?").matcher(this.f4294b.get("Range"));
        if (!matcher.find()) {
            throw new Exception("invalid Range: " + this.f4294b.get("Range"));
        }
        this.f4301i = Long.parseLong(matcher.group(1));
        if (matcher.group(2) != null) {
            this.f4302j = Long.parseLong(matcher.group(2));
        }
        long j = this.f4301i;
        this.f4304l = j;
        this.f4303k = j;
        Response responseM4470e = C1840c.m4470e(m4517d(), this.f4294b);
        if (responseM4470e.body() != null) {
            responseM4470e.body().close();
        }
        int iCode = responseM4470e.code();
        if (iCode < 200 || iCode >= 300) {
            throw new Exception("response code: " + iCode);
        }
        SpiderDebug.log("video-start: : responseCode" + iCode);
        SpiderDebug.log("video-start: headers: " + responseM4470e.headers());
        String str = responseM4470e.headers().get("Content-Length");
        if (str == null) {
            throw new Exception("missing response header: Content-Length");
        }
        Long.parseLong(str);
        if (this.f4302j <= 0) {
            String str2 = responseM4470e.headers().get("Content-Range");
            if (str2 == null) {
                throw new Exception("missing response header: Content-Range");
            }
            Matcher matcherM4097a = C1748s.m4097a(new byte[]{96, 61, 58, -15, 11, -120, 110, 66}, new byte[]{78, 23, 21, -39, 87, -20, 69, 107}, str2);
            if (!matcherM4097a.find()) {
                throw new Exception(C1747r.m4094b(new byte[]{-106, -21, -34, -21, 2, 10, -15, -50, -97, -58, -57, -28, 26, 6, -5, -102, -46, -41, -55, -28, 9, 6, -11, -44, -33}, new byte[]{-1, -123, -88, -118, 110, 99, -107, -18}, new StringBuilder(), str2));
            }
            this.f4302j = Long.parseLong(matcherM4097a.group(1)) - 1;
        }
        final int i2 = this.f4300h;
        int i3 = this.f4299g;
        long j2 = this.f4301i;
        if (j2 == 0 || this.f4302j - j2 <= 1048576) {
            i3 = 3;
            i = 66560;
        } else {
            i = i2;
        }
        long j3 = (((this.f4302j - j2) + 1) / ((long) i3)) + 1;
        if (i > j3) {
            i2 = (int) j3;
        }
        this.f4305m = true;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f4295c.execute(new Runnable() { // from class: com.github.catvod.spider.support.FM.o.f
                @Override // java.lang.Runnable
                public final void run() {
                    C1867h.m4516b(this.f4288a, i2);
                }
            });
        }
        PipedInputStream pipedInputStream = new PipedInputStream();
        Init.execute(new RunnableC1736g(this, new PipedOutputStream(pipedInputStream), 1));
        return new Object[]{206, "application/oct-stream", pipedInputStream, this.f4294b};
    }
}
