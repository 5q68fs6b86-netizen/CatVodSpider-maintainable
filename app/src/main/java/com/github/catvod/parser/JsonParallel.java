package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0405ku;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JsonParallel {
    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, final String str) {
        JSONObject jSONObject;
        Throwable th;
        try {
            if (linkedHashMap.size() > 0) {
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
                ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorServiceNewFixedThreadPool);
                ArrayList arrayList = new ArrayList();
                for (final String str2 : linkedHashMap.keySet()) {
                    final String str3 = linkedHashMap.get(str2);
                    arrayList.add(executorCompletionService.submit(new Callable<JSONObject>() { // from class: com.github.catvod.parser.JsonParallel.1
                        @Override // java.util.concurrent.Callable
                        public JSONObject call() {
                            String str4 = str;
                            try {
                                HashMap<String, String> reqHeader = JsonBasic.getReqHeader(str3);
                                String str5 = reqHeader.get("url");
                                reqHeader.remove("url");
                                SpiderDebug.log(str5 + str4);
                                JSONObject jSONObjectM1363g = AbstractC0405ku.m1363g(str4, AbstractC0771yi.m1891m(AbstractC0771yi.m1884f(), str5 + str4, "p_json_parse", reqHeader, null));
                                jSONObjectM1363g.put("jxFrom", str2);
                                SpiderDebug.log(jSONObjectM1363g.toString());
                                return jSONObjectM1363g;
                            } catch (Throwable th2) {
                                SpiderDebug.log(th2);
                                return null;
                            }
                        }
                    }));
                }
                JSONObject jSONObject2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    try {
                        jSONObject = (JSONObject) executorCompletionService.take().get();
                        if (jSONObject != null) {
                            try {
                                AbstractC0771yi.m1883e();
                                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                    try {
                                        ((Future) arrayList.get(i2)).cancel(true);
                                    } catch (Throwable th2) {
                                        SpiderDebug.log(th2);
                                    }
                                }
                                arrayList.clear();
                                jSONObject2 = jSONObject;
                                break;
                            } catch (Throwable th3) {
                                th = th3;
                                SpiderDebug.log(th);
                                jSONObject2 = jSONObject;
                            }
                        }
                    } catch (Throwable th4) {
                        jSONObject = jSONObject2;
                        th = th4;
                    }
                    jSONObject2 = jSONObject;
                }
                try {
                    executorServiceNewFixedThreadPool.shutdownNow();
                } catch (Throwable th5) {
                    SpiderDebug.log(th5);
                }
                if (jSONObject2 != null) {
                    return jSONObject2;
                }
            }
        } catch (Throwable th6) {
            SpiderDebug.log(th6);
        }
        return new JSONObject();
    }
}
