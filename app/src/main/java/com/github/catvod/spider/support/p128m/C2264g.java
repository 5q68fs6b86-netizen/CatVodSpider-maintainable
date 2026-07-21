package com.github.catvod.spider.support.p128m;

import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p139y.C2423f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.m.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2264g {

    /* JADX INFO: renamed from: a */
    private static final Pattern f5657a = Pattern.compile("src = '(.*?)'");

    /* JADX INFO: renamed from: b */
    private static final Pattern f5658b = Pattern.compile("mac_show\\[\"([^\"]+)\"\\]");

    /* JADX INFO: renamed from: a */
    private static String m6159a(String str) {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 9; PCLM10 Build/PQ3B.190801.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Mobile Safari/537.36");
        map.put("Referer", "https://m.wwgz.cn");
        return C2238b.m6073l(str, map);
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, List<String>> m6160b() {
        HashMap map = new HashMap();
        try {
            Matcher matcher = f5658b.matcher(m6159a("https://m.wwgz.cn/js/playerconfig.js"));
            while (matcher.find()) {
                ArrayList arrayList = new ArrayList();
                String strGroup = matcher.group(1);
                String strM6448l = C2423f.m6448l(m6159a("https://m.wwgz.cn/player/" + strGroup + ".js"), "src=\"", "'");
                if (!TextUtils.isEmpty(strM6448l)) {
                    SpiderDebug.log(strGroup + "->" + strM6448l);
                    String strM6159a = m6159a(strM6448l);
                    if (strM6159a.contains("<title>")) {
                        Matcher matcher2 = f5657a.matcher(strM6159a);
                        while (matcher2.find()) {
                            String strGroup2 = matcher2.group(1);
                            if (strGroup2.startsWith("http") && !arrayList.contains(strGroup2)) {
                                arrayList.add(strGroup2.replace("'", ""));
                            }
                        }
                        if (strM6159a.contains("var url=''")) {
                            arrayList.add(strM6448l);
                        }
                        map.put(strGroup, arrayList);
                    }
                }
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return map;
        }
    }
}
