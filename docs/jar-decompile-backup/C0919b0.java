package com.github.catvod.spider.support.p003AB.p009o;

import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0919b0 {

    /* JADX INFO: renamed from: a */
    private static final OkHttpClient f2160a;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f2160a = builder.connectTimeout(3L, timeUnit).readTimeout(5L, timeUnit).callTimeout(10L, timeUnit).build();
    }

    /* JADX INFO: renamed from: b */
    public static String m2217b(List<String> list) {
        String str = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.min(list.size(), 4));
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorServiceNewFixedThreadPool);
        CopyOnWriteArrayList<Future> copyOnWriteArrayList = new CopyOnWriteArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.add(executorCompletionService.submit(new CallableC0917a0(it.next())));
        }
        for (int i = 0; i < list.size(); i++) {
            try {
                try {
                    try {
                        try {
                            String str2 = (String) executorCompletionService.take().get();
                            if (str2 != null) {
                                str = str2;
                                break;
                            }
                        } catch (InterruptedException unused) {
                            executorServiceNewFixedThreadPool.shutdownNow();
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th) {
                        for (Future future : copyOnWriteArrayList) {
                            if (!future.isDone()) {
                                future.cancel(true);
                            }
                        }
                        executorServiceNewFixedThreadPool.shutdown();
                        try {
                            if (!executorServiceNewFixedThreadPool.awaitTermination(5L, TimeUnit.SECONDS)) {
                                executorServiceNewFixedThreadPool.shutdownNow();
                            }
                        } catch (InterruptedException unused2) {
                            executorServiceNewFixedThreadPool.shutdownNow();
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.e("UrlChecker", "线程被中断", e);
                    for (Future future2 : copyOnWriteArrayList) {
                        if (!future2.isDone()) {
                            future2.cancel(true);
                        }
                    }
                    executorServiceNewFixedThreadPool.shutdown();
                    if (!executorServiceNewFixedThreadPool.awaitTermination(5L, TimeUnit.SECONDS)) {
                    }
                }
            } catch (ExecutionException e2) {
                Log.e("UrlChecker", "任务执行异常", e2);
                for (Future future3 : copyOnWriteArrayList) {
                    if (!future3.isDone()) {
                        future3.cancel(true);
                    }
                }
                executorServiceNewFixedThreadPool.shutdown();
                if (!executorServiceNewFixedThreadPool.awaitTermination(5L, TimeUnit.SECONDS)) {
                }
            }
        }
        for (Future future4 : copyOnWriteArrayList) {
            if (!future4.isDone()) {
                future4.cancel(true);
            }
        }
        executorServiceNewFixedThreadPool.shutdown();
        if (!executorServiceNewFixedThreadPool.awaitTermination(5L, TimeUnit.SECONDS)) {
            executorServiceNewFixedThreadPool.shutdownNow();
        }
        return str;
    }
}
