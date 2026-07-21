package com.github.catvod.spider.support.p003AB.p009o;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p003AB.p005b.C0854u;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0842i;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
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

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0893C {

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f2101b;

    /* JADX INFO: renamed from: c */
    private final ExecutorService f2102c;

    /* JADX INFO: renamed from: d */
    private final String f2103d;

    /* JADX INFO: renamed from: f */
    private final int f2105f;

    /* JADX INFO: renamed from: g */
    private final int f2106g;

    /* JADX INFO: renamed from: h */
    private final int f2107h;

    /* JADX INFO: renamed from: m */
    private boolean f2112m;

    /* JADX INFO: renamed from: i */
    private long f2108i = -1;

    /* JADX INFO: renamed from: j */
    private long f2109j = -1;

    /* JADX INFO: renamed from: k */
    private long f2110k = -1;

    /* JADX INFO: renamed from: l */
    private long f2111l = -1;

    /* JADX INFO: renamed from: e */
    private final ReentrantLock f2104e = new ReentrantLock();

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<C0892B> f2100a = new LinkedBlockingQueue();

    public C0893C(String str, Map<String, String> map, int i, int i2) {
        this.f2103d = str;
        this.f2101b = map;
        this.f2106g = i;
        this.f2102c = Executors.newFixedThreadPool(i);
        this.f2107h = i2;
        this.f2105f = (int) Math.ceil(73400320 / i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m2145a(C0893C c0893c, PipedOutputStream pipedOutputStream) {
        c0893c.getClass();
        while (true) {
            try {
                try {
                    byte[] bArrM2148e = c0893c.m2148e();
                    if (bArrM2148e == null || bArrM2148e.length == 0) {
                        break;
                        break;
                    }
                    pipedOutputStream.write(bArrM2148e);
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            } finally {
                try {
                    c0893c.f2112m = false;
                    pipedOutputStream.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        try {
            c0893c.f2112m = false;
        } catch (Exception e3) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x003d A[LOOP:1: B:19:0x003d->B:23:0x0055, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[Catch: Exception -> 0x00f9, TryCatch #0 {Exception -> 0x00f9, blocks: (B:26:0x005d, B:27:0x006c, B:29:0x0072, B:31:0x0084, B:32:0x00ab, B:33:0x00bb, B:37:0x00cf, B:39:0x00d5, B:40:0x00e2, B:41:0x00f8), top: B:45:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0084 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static void m2146b(C0893C c0893c, int i) {
        C0892B c0892b;
        long j;
        while (c0893c.f2112m && !Thread.interrupted()) {
            c0893c.f2104e.lock();
            long j2 = c0893c.f2111l;
            long j3 = ((long) i) + j2;
            c0893c.f2111l = j3;
            long j4 = c0893c.f2109j;
            if (j2 <= j4) {
                j = j3 - 1;
                if (j <= j4) {
                    j4 = j;
                }
                c0892b = new C0892B(j2, j4);
                c0893c.f2100a.add(c0892b);
            } else {
                c0892b = null;
            }
            c0893c.f2104e.unlock();
            if (c0892b == null) {
                return;
            }
            while (c0893c.f2112m && c0892b.f2097a - c0893c.f2110k >= ((long) c0893c.f2107h) * ((long) c0893c.f2105f)) {
                SystemClock.sleep(1000L);
            }
            while (c0893c.f2112m) {
                try {
                    HashMap map = new HashMap();
                    for (Map.Entry<String, String> entry : c0893c.f2101b.entrySet()) {
                        if (entry.getKey().equalsIgnoreCase("Range")) {
                            map.put("Range", String.format(Locale.getDefault(), "bytes=%d-%d", Long.valueOf(c0892b.f2097a), Long.valueOf(c0892b.f2098b)));
                        } else {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Response responseM2125e = C0869c.m2125e(c0893c.m2147d(), map);
                    int iCode = responseM2125e.code();
                    if (iCode >= 200 || iCode >= 300) {
                        throw new Exception("response code: " + iCode);
                    }
                    if (responseM2125e.body() == null) {
                        break;
                    }
                    c0892b.m2144d(responseM2125e.body().bytes());
                    break;
                    while (c0893c.f2112m) {
                        c0893c.f2104e.lock();
                        long j5 = c0893c.f2111l;
                        long j6 = ((long) i) + j5;
                        c0893c.f2111l = j6;
                        long j7 = c0893c.f2109j;
                        if (j5 <= j7) {
                            j = j6 - 1;
                            if (j <= j7) {
                                j7 = j;
                            }
                            c0892b = new C0892B(j5, j7);
                            c0893c.f2100a.add(c0892b);
                        } else {
                            c0892b = null;
                        }
                        c0893c.f2104e.unlock();
                        if (c0892b == null) {
                            return;
                        }
                        while (c0893c.f2112m) {
                            SystemClock.sleep(1000L);
                        }
                        while (c0893c.f2112m) {
                            HashMap map2 = new HashMap();
                            while (r2.hasNext()) {
                                if (entry.getKey().equalsIgnoreCase("Range")) {
                                    map2.put("Range", String.format(Locale.getDefault(), "bytes=%d-%d", Long.valueOf(c0892b.f2097a), Long.valueOf(c0892b.f2098b)));
                                } else {
                                    map2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            Response responseM2125e2 = C0869c.m2125e(c0893c.m2147d(), map2);
                            int iCode2 = responseM2125e2.code();
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
    private String m2147d() {
        boolean zContains = this.f2103d.contains("/proxy?");
        String str = this.f2103d;
        return zContains ? C0869c.m2132l(str, null) : str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.support.p003AB.p009o.B>, java.util.concurrent.LinkedBlockingQueue] */
    /* JADX INFO: renamed from: e */
    private byte[] m2148e() throws Exception {
        if (this.f2110k > this.f2109j) {
            this.f2112m = false;
            return null;
        }
        C0892B c0892b = (C0892B) this.f2100a.poll(10L, TimeUnit.SECONDS);
        if (c0892b == null) {
            this.f2112m = false;
            throw new Exception("read timeout");
        }
        while (this.f2112m) {
            byte[] bArrM2143c = c0892b.m2143c();
            if (bArrM2143c != null) {
                this.f2110k += (long) bArrM2143c.length;
                return bArrM2143c;
            }
            SystemClock.sleep(100L);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2149c() {
        this.f2112m = false;
        this.f2102c.shutdownNow();
    }

    /* JADX INFO: renamed from: f */
    public final Object[] m2150f() throws Exception {
        int i;
        if (!this.f2101b.containsKey("Range")) {
            this.f2101b.put("Range", "bytes=0-");
        }
        Matcher matcher = Pattern.compile("bytes=(\\d+)-(\\d+)?").matcher(this.f2101b.get("Range"));
        if (!matcher.find()) {
            throw new Exception("invalid Range: " + this.f2101b.get("Range"));
        }
        this.f2108i = Long.parseLong(matcher.group(1));
        if (matcher.group(2) != null) {
            this.f2109j = Long.parseLong(matcher.group(2));
        }
        long j = this.f2108i;
        this.f2111l = j;
        this.f2110k = j;
        Response responseM2125e = C0869c.m2125e(m2147d(), this.f2101b);
        if (responseM2125e.body() != null) {
            responseM2125e.body().close();
        }
        int iCode = responseM2125e.code();
        if (iCode < 200 || iCode >= 300) {
            throw new Exception("response code: " + iCode);
        }
        SpiderDebug.log("video-start: : responseCode" + iCode);
        SpiderDebug.log("video-start: headers: " + responseM2125e.headers());
        String str = responseM2125e.headers().get("Content-Length");
        if (str == null) {
            throw new Exception("missing response header: Content-Length");
        }
        Long.parseLong(str);
        if (this.f2109j <= 0) {
            String str2 = responseM2125e.headers().get("Content-Range");
            if (str2 == null) {
                throw new Exception("missing response header: Content-Range");
            }
            Matcher matcher2 = Pattern.compile(".*/(\\d+)").matcher(str2);
            if (!matcher2.find()) {
                throw new Exception(C0854u.m2059b(new byte[]{-92, -60, 65, -113, 77, -99, -79, 18, -83, -23, 88, -128, 85, -111, -69, 70, -32, -8, 86, -128, 70, -111, -75, 8, -19}, new byte[]{-51, -86, 55, -18, 33, -12, -43, 50}, new StringBuilder(), str2));
            }
            this.f2109j = Long.parseLong(matcher2.group(1)) - 1;
        }
        final int i2 = this.f2107h;
        int i3 = this.f2106g;
        long j2 = this.f2108i;
        if (j2 == 0 || this.f2109j - j2 <= 1048576) {
            i = 66560;
            i3 = 3;
        } else {
            i = i2;
        }
        long j3 = (((this.f2109j - j2) + 1) / ((long) i3)) + 1;
        if (i > j3) {
            i2 = (int) j3;
        }
        this.f2112m = true;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f2102c.execute(new Runnable(this, i2) { // from class: com.github.catvod.spider.support.p003AB.p009o.A

                /* JADX INFO: renamed from: a */
                public final C0893C f2095a;

                /* JADX INFO: renamed from: b */
                public final int f2096b;

                {
                    this.f2095a = this;
                    this.f2096b = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0893C.m2146b(this.f2095a, this.f2096b);
                }
            });
        }
        PipedInputStream pipedInputStream = new PipedInputStream();
        Init.execute(new RunnableC0842i(this, new PipedOutputStream(pipedInputStream), 3));
        return new Object[]{206, "application/oct-stream", pipedInputStream, this.f2101b};
    }
}
