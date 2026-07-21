package com.github.catvod.spider.support.p128m;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.m.H */
/* JADX INFO: loaded from: classes.dex */
public final class C2254H {

    /* JADX INFO: renamed from: a */
    private static File f5629a;

    /* JADX INFO: renamed from: b */
    private static File f5630b;

    /* JADX INFO: renamed from: c */
    private static JSONObject f5631c;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.m.H$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ Context val$context;

        AnonymousClass1(Context context) {
            this.val$context = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException unused) {
            }
            try {
                Context context = this.val$context;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                launchIntentForPackage.addFlags(268468224);
                context.startActivity(launchIntentForPackage);
                Thread.sleep(200L);
                Process.killProcess(Process.myPid());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.m.H$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ Context val$context;

        AnonymousClass2(Context context) {
            this.val$context = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(this.val$context, "正在下载GO，下载完成后应用会自动重启。", 1).show();
        }
    }

    public static void backupsConfig() {
        C2268k.m6168c(C2268k.m6169c("./config.json"), new JSONObject("{\"version\":\"31.0\",\"update\":\"关闭\",\"danmuColor\":\"默认\",\"aliQuality\":\"阿里原画\",\"quarkQuality\":\"夸克原画\",\"ucQuality\":\"UC无限\",\"baiduQuality\":\"百度原画\",\"123Quality\":\"123无限\",\"panBlock\":\"\",\"proxyMode\":\"Go多线程\",\"pansouUrl\":\"https://so.252035.xyz\",\"panOrder\":\"百度,夸克,UC,迅雷,光鸭,天翼,123,阿里,移动\",\"homePage\":\"猜你喜欢,热门电影,热播剧集,热门动漫,热播综艺,电影筛选,电视筛选,电影榜单,电视剧榜单\",\"aliThread\":\"64\",\"quarkThread\":\"16\",\"ucThread\":\"自动\",\"baiduThread\":\"10\",\"xunleiThread\":\"10\"}").toString());
        SpiderDebug.log("Config files updated successfully");
        new Handler(Looper.getMainLooper()).post(new HH$1(Init.context()));
    }

    public static void toggleUpdateCheck() {
        String str;
        File fileM6169c = C2268k.m6169c("config.json");
        JsonObject jsonObject = new JsonObject();
        if (fileM6169c.exists()) {
            jsonObject = new JsonParser().parse(C2268k.m6164a(fileM6169c)).getAsJsonObject();
        }
        if ("true".equals(jsonObject.has("update") ? jsonObject.get("update").getAsString() : "true")) {
            str = "检查更新已关闭";
            jsonObject.addProperty("update", "false");
        } else {
            str = "检查更新已开启";
            jsonObject.addProperty("update", "true");
        }
        C2268k.m6168c(fileM6169c, jsonObject.toString());
        C2256I.m6113i(str);
        SpiderDebug.log("配置已更新: " + jsonObject.toString());
    }
}
