package com.github.catvod.spider.support.p003AB.p009o;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.a0 */
/* JADX INFO: loaded from: classes.dex */
final class CallableC0917a0 implements Callable<String> {

    /* JADX INFO: renamed from: a */
    private final String f2158a;

    CallableC0917a0(String str) {
        this.f2158a = str;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        StringBuilder sb;
        if (Thread.currentThread().isInterrupted()) {
            sb = new StringBuilder("任务执行前被中断: ");
        } else {
            try {
                Response responseExecute = C0919b0.f2160a.newCall(new Request.Builder().url(this.f2158a).head().build()).execute();
                try {
                    if (responseExecute.isSuccessful() && responseExecute.code() == 200) {
                        Log.d("UrlChecker", "URL 可用: " + this.f2158a);
                        String str = this.f2158a;
                        responseExecute.close();
                        return str;
                    }
                    Log.d("UrlChecker", "URL 不可用: " + this.f2158a + ", 状态码: " + responseExecute.code());
                    responseExecute.close();
                    return null;
                } catch (Throwable th) {
                    if (responseExecute != null) {
                        try {
                            responseExecute.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (Thread.currentThread().isInterrupted()) {
                    sb = new StringBuilder("任务执行期间被中断: ");
                    sb.append(this.f2158a);
                    Log.d("UrlChecker", sb.toString());
                } else {
                    Log.e("UrlChecker", "连接到 URL 失败: " + this.f2158a, e);
                }
            }
        }
        sb.append(this.f2158a);
        Log.d("UrlChecker", sb.toString());
        return null;
    }
}
