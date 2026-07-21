package com.github.catvod.spider.support.p128m;

import android.os.SystemClock;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p117b.RunnableC2170d;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p128m.C2263f;
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

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2263f {

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f5642b;

    /* JADX INFO: renamed from: c */
    private final ExecutorService f5643c;

    /* JADX INFO: renamed from: d */
    private final String f5644d;

    /* JADX INFO: renamed from: f */
    private final int f5646f;

    /* JADX INFO: renamed from: g */
    private final int f5647g;

    /* JADX INFO: renamed from: h */
    private int f5648h;

    /* JADX INFO: renamed from: m */
    private boolean f5653m;

    /* JADX INFO: renamed from: i */
    private long f5649i = -1;

    /* JADX INFO: renamed from: j */
    private long f5650j = -1;

    /* JADX INFO: renamed from: k */
    private long f5651k = -1;

    /* JADX INFO: renamed from: l */
    private long f5652l = -1;

    /* JADX INFO: renamed from: e */
    private final ReentrantLock f5645e = new ReentrantLock();

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<a> f5641a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.f$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private final long f5654a;

        /* JADX INFO: renamed from: b */
        private final long f5655b;

        /* JADX INFO: renamed from: c */
        private byte[] f5656c;

        public a(long j, long j2) {
            this.f5654a = j;
            this.f5655b = j2;
        }

        /* JADX INFO: renamed from: c */
        public final byte[] m6157c() {
            return this.f5656c;
        }

        /* JADX INFO: renamed from: d */
        public final void m6158d(byte[] bArr) {
            this.f5656c = bArr;
        }
    }

    public C2263f(String str, Map<String, String> map, int i, int i2) {
        this.f5644d = str;
        this.f5642b = map;
        this.f5647g = i;
        this.f5643c = Executors.newFixedThreadPool(i);
        this.f5648h = i2;
        this.f5646f = (int) Math.ceil(73400320 / i2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f A[LOOP:1: B:18:0x003f->B:22:0x0058, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:28:0x0075 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:25:0x0060, B:26:0x006f, B:28:0x0075, B:30:0x0087, B:31:0x00ad, B:32:0x00bd, B:36:0x00d1, B:38:0x00d7, B:39:0x00e4, B:40:0x00fa), top: B:44:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0087 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m6150a(C2263f c2263f) {
        long j;
        while (c2263f.f5653m && !Thread.interrupted()) {
            a aVar = null;
            c2263f.f5645e.lock();
            long j2 = c2263f.f5652l;
            long j3 = ((long) c2263f.f5648h) + j2;
            c2263f.f5652l = j3;
            long j4 = c2263f.f5650j;
            if (j2 <= j4) {
                j = j3 - 1;
                if (j <= j4) {
                    j4 = j;
                }
                aVar = new a(j2, j4);
                c2263f.f5641a.add(aVar);
            }
            c2263f.f5645e.unlock();
            if (aVar == null) {
                return;
            }
            while (c2263f.f5653m && aVar.f5654a - c2263f.f5651k >= ((long) c2263f.f5648h) * ((long) c2263f.f5646f)) {
                SystemClock.sleep(1000L);
            }
            while (c2263f.f5653m) {
                try {
                    HashMap map = new HashMap();
                    for (Map.Entry<String, String> entry : c2263f.f5642b.entrySet()) {
                        if (entry.getKey().equalsIgnoreCase("Range")) {
                            map.put("Range", String.format(Locale.getDefault(), "bytes=%d-%d", Long.valueOf(aVar.f5654a), Long.valueOf(aVar.f5655b)));
                        } else {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Response responseM6064d = C2238b.m6064d(c2263f.m6152c(), map);
                    int iCode = responseM6064d.code();
                    if (iCode >= 200 || iCode >= 300) {
                        throw new Exception("response code: " + iCode);
                    }
                    if (responseM6064d.body() == null) {
                        break;
                    }
                    aVar.m6158d(responseM6064d.body().bytes());
                    break;
                    while (c2263f.f5653m) {
                        a aVar2 = null;
                        c2263f.f5645e.lock();
                        long j5 = c2263f.f5652l;
                        long j6 = ((long) c2263f.f5648h) + j5;
                        c2263f.f5652l = j6;
                        long j7 = c2263f.f5650j;
                        if (j5 <= j7) {
                            j = j6 - 1;
                            if (j <= j7) {
                                j7 = j;
                            }
                            aVar2 = new a(j5, j7);
                            c2263f.f5641a.add(aVar2);
                        }
                        c2263f.f5645e.unlock();
                        if (aVar2 == null) {
                            return;
                        }
                        while (c2263f.f5653m) {
                            SystemClock.sleep(1000L);
                        }
                        while (c2263f.f5653m) {
                            HashMap map2 = new HashMap();
                            while (r6.hasNext()) {
                                if (entry.getKey().equalsIgnoreCase("Range")) {
                                    map2.put("Range", String.format(Locale.getDefault(), "bytes=%d-%d", Long.valueOf(aVar2.f5654a), Long.valueOf(aVar2.f5655b)));
                                } else {
                                    map2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            Response responseM6064d2 = C2238b.m6064d(c2263f.m6152c(), map2);
                            int iCode2 = responseM6064d2.code();
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

    /* JADX INFO: renamed from: b */
    public static void m6151b(C2263f c2263f, PipedOutputStream pipedOutputStream) {
        c2263f.getClass();
        while (true) {
            try {
                try {
                    try {
                        byte[] bArrM6153d = c2263f.m6153d();
                        if (bArrM6153d == null || bArrM6153d.length == 0) {
                            break;
                            break;
                        }
                        pipedOutputStream.write(bArrM6153d);
                    } catch (Exception e) {
                        e.printStackTrace();
                        c2263f.f5653m = false;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } catch (Throwable th) {
                try {
                    c2263f.f5653m = false;
                    pipedOutputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                throw th;
            }
        }
        c2263f.f5653m = false;
        pipedOutputStream.close();
    }

    /* JADX INFO: renamed from: c */
    private String m6152c() {
        return this.f5644d.contains("/proxy?") ? C2238b.m6073l(this.f5644d, null) : this.f5644d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.support.p128m.f$a>, java.util.concurrent.LinkedBlockingQueue] */
    /* JADX INFO: renamed from: d */
    private byte[] m6153d() throws Exception {
        if (this.f5651k > this.f5650j) {
            this.f5653m = false;
            return null;
        }
        a aVar = (a) this.f5641a.poll(10L, TimeUnit.SECONDS);
        if (aVar == null) {
            this.f5653m = false;
            throw new Exception("read timeout");
        }
        while (this.f5653m) {
            byte[] bArrM6157c = aVar.m6157c();
            if (bArrM6157c != null) {
                this.f5651k += (long) bArrM6157c.length;
                return bArrM6157c;
            }
            SystemClock.sleep(100L);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final Object[] m6154e() throws Exception {
        int i;
        if (this.f5642b.containsKey("Range")) {
            i = 206;
        } else {
            this.f5642b.put("Range", "bytes=0-");
            i = 200;
        }
        Matcher matcher = Pattern.compile("bytes=(\\d+)-(\\d+)?").matcher(this.f5642b.get("Range"));
        if (!matcher.find()) {
            StringBuilder sbM5396a = C2137a.m5396a("invalid Range: ");
            sbM5396a.append(this.f5642b.get("Range"));
            throw new Exception(sbM5396a.toString());
        }
        final int i2 = 1;
        this.f5649i = Long.parseLong(matcher.group(1));
        if (matcher.group(2) != null) {
            this.f5650j = Long.parseLong(matcher.group(2));
        }
        long j = this.f5649i;
        this.f5652l = j;
        this.f5651k = j;
        Response responseM6064d = C2238b.m6064d(m6152c(), this.f5642b);
        if (responseM6064d.body() != null) {
            responseM6064d.body().close();
        }
        int iCode = responseM6064d.code();
        if (iCode < 200 || iCode >= 300) {
            throw new Exception("response code: " + iCode);
        }
        String str = responseM6064d.headers().get("Content-Length");
        if (str == null) {
            throw new Exception("missing response header: Content-Length");
        }
        Long.parseLong(str);
        if (this.f5650j <= 0) {
            String str2 = responseM6064d.headers().get("Content-Range");
            if (str2 == null) {
                throw new Exception("missing response header: Content-Range");
            }
            Matcher matcher2 = Pattern.compile(".*/(\\d+)").matcher(str2);
            if (!matcher2.find()) {
                throw new Exception(C2139c.m5408a("invalid `Content-Range`: ", str2));
            }
            this.f5650j = Long.parseLong(matcher2.group(1)) - 1;
        }
        long j2 = (((this.f5650j - this.f5649i) + 1) / ((long) this.f5647g)) + 1;
        if (this.f5648h > j2) {
            this.f5648h = (int) j2;
        }
        this.f5653m = true;
        for (int i3 = 0; i3 < this.f5647g; i3++) {
            this.f5643c.execute(new RunnableC2170d(this, 2));
        }
        PipedInputStream pipedInputStream = new PipedInputStream();
        final PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
        Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.p117b.o
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        ((C2187w) this).m5759d((String) pipedOutputStream, true);
                        break;
                    default:
                        C2263f.m6151b((C2263f) this, (PipedOutputStream) pipedOutputStream);
                        break;
                }
            }
        });
        return new Object[]{Integer.valueOf(i), "application/oct-stream", pipedInputStream, this.f5642b};
    }
}
