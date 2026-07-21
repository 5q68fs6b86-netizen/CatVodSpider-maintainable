package com.github.catvod.spider.support.p128m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2267j {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.j$a */
    static class a {

        /* JADX INFO: renamed from: a */
        final String f5664a;

        /* JADX INFO: renamed from: b */
        final boolean f5665b;

        /* JADX INFO: renamed from: c */
        final long f5666c;

        a(String str, boolean z, long j) {
            this.f5664a = str;
            this.f5665b = z;
            this.f5666c = j;
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<a> m6161a(List<String> list, final OkHttpClient okHttpClient) throws InterruptedException {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.min(list.size(), 5));
        final List<a> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        for (final String str : list) {
            executorServiceNewFixedThreadPool.execute(new Runnable() { // from class: com.github.catvod.spider.support.p128m.h
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    OkHttpClient okHttpClient2 = okHttpClient;
                    List list2 = listSynchronizedList;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    Request requestBuild = new Request.Builder().url(str2).get().build();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        try {
                            Response responseExecute = okHttpClient2.newCall(requestBuild).execute();
                            try {
                                ResponseBody responseBodyBody = responseExecute.body();
                                if (responseBodyBody != null) {
                                    responseBodyBody.close();
                                }
                                boolean zIsSuccessful = responseExecute.isSuccessful();
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                if (responseExecute.code() == 200) {
                                    list2.add(new C2267j.a(str2, zIsSuccessful, jCurrentTimeMillis2));
                                }
                                responseExecute.close();
                            } catch (Throwable th) {
                                if (responseExecute != null) {
                                    try {
                                        responseExecute.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            countDownLatch2.countDown();
                            throw th2;
                        }
                    } catch (Exception unused2) {
                        list2.add(new C2267j.a(str2, false, Long.MAX_VALUE));
                    }
                    countDownLatch2.countDown();
                }
            });
        }
        executorServiceNewFixedThreadPool.shutdown();
        countDownLatch.await(10L, TimeUnit.SECONDS);
        return listSynchronizedList;
    }

    /* JADX INFO: renamed from: b */
    private static String m6162b(List<a> list) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            if (aVar.f5665b) {
                arrayList.add(aVar);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.github.catvod.spider.support.p128m.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return (((C2267j.a) obj).f5666c > ((C2267j.a) obj2).f5666c ? 1 : (((C2267j.a) obj).f5666c == ((C2267j.a) obj2).f5666c ? 0 : -1));
            }
        });
        return arrayList.isEmpty() ? "" : ((a) arrayList.get(0)).f5664a;
    }

    /* JADX INFO: renamed from: c */
    public static String m6163c(JSONArray jSONArray) {
        try {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient okHttpClientBuild = builder.connectTimeout(10L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(15L, timeUnit).build();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return m6162b(m6161a(arrayList, okHttpClientBuild));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
