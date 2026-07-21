package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.support.p012C0.p023b.C1030n;
import com.github.catvod.spider.support.p012C0.p025c.C1038d;
import com.github.catvod.spider.support.p012C0.p025c.C1039e;
import com.github.catvod.spider.support.p012C0.p025c.C1041g;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;
import com.github.catvod.spider.support.p012C0.p032h.C1234b;
import com.github.catvod.spider.support.p012C0.p035j.C1245m;
import com.github.catvod.spider.support.p012C0.p035j.C1247o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class XBPQPlay extends Spider {
    /* JADX INFO: renamed from: a */
    private List<C1039e> m725a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.startsWith("file://")) {
            File file = new File(str.replace("file://", ""));
            if (file.getParentFile() != null) {
                File[] fileArrListFiles = file.getParentFile().listFiles();
                fileArrListFiles.getClass();
                for (File file2 : fileArrListFiles) {
                    String strM3112b = C1247o.m3112b(file2.getName());
                    if (C1247o.m3114d(strM3112b)) {
                        C1039e c1039e = new C1039e();
                        c1039e.m2616c(C1247o.m3115e(file2.getName()));
                        C1039e c1039eM2614a = c1039e.m2614a(strM3112b);
                        StringBuilder sbM2774b = C1064d.m2774b("file://");
                        sbM2774b.append(file2.getAbsolutePath());
                        c1039eM2614a.m2617d(sbM2774b.toString());
                        arrayList.add(c1039eM2614a);
                    }
                }
            }
        }
        if (str.startsWith("http://")) {
            try {
                List listAsList = Arrays.asList("mp4", "mkv");
                List<String> listAsList2 = Arrays.asList("srt", "ass");
                if (listAsList.contains(C1247o.m3112b(str))) {
                    for (String str2 : listAsList2) {
                        String strConcat = C1247o.m3115e(str).concat(".").concat(str2);
                        if (C1234b.m3045a(strConcat).code() == 200) {
                            String lastPathSegment = Uri.parse(strConcat).getLastPathSegment();
                            C1039e c1039e2 = new C1039e();
                            c1039e2.m2616c(lastPathSegment);
                            C1039e c1039eM2614a2 = c1039e2.m2614a(str2);
                            c1039eM2614a2.m2617d(strConcat);
                            arrayList.add(c1039eM2614a2);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private C1041g m726b(String str) {
        List listAsList;
        C1041g c1041g = new C1041g();
        c1041g.m2623f(str);
        c1041g.m2624g(str);
        c1041g.m2618a("XBPQ");
        c1041g.m2625h("https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
        if (C1245m.m3108d(str)) {
            listAsList = Arrays.asList("解析", "嗅探", "直链");
        } else {
            listAsList = (C1245m.m3107c(str) || str.startsWith("magnet")) ? Arrays.asList("直连", "嗅探", "解析") : Arrays.asList("嗅探", "解析", "直连");
        }
        c1041g.m2626i(TextUtils.join("$$$", listAsList));
        c1041g.m2627j(TextUtils.join("$$$", Arrays.asList(C1030n.m2553a("播放$", str), C1030n.m2553a("播放$", str), C1030n.m2553a("播放$", str))));
        return c1041g;
    }

    public String detailContent(List<String> list) {
        try {
            String strTrim = list.get(0).trim();
            if (strTrim.contains("magnet")) {
                strTrim = strTrim.replaceAll("[\\S\\s]*(magnet:\\?xt=urn:btih:[0-9a-fA-F]{40})[\\S\\s]*", "$1");
            }
            return C1038d.m2604e(m726b(strTrim));
        } catch (Exception e) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String playerContent(String str, String str2, List<String> list) {
        try {
            if (str2.contains("youtube.com")) {
                C1038d c1038d = new C1038d();
                c1038d.m2612i(Youtube.fetch(str2));
                return addDanmaku(c1038d.toString());
            }
            if (str.equals("直连")) {
                C1038d c1038d2 = new C1038d();
                c1038d2.m2612i(str2);
                c1038d2.m2611h(m725a(str2));
                return addDanmaku(c1038d2.toString());
            }
            if (str.equals("嗅探")) {
                C1038d c1038d3 = new C1038d();
                c1038d3.m2610d();
                c1038d3.m2612i(str2);
                return addDanmaku(c1038d3.toString());
            }
            if (!str.equals("解析")) {
                return addDanmaku(new C1038d().toString());
            }
            C1038d c1038d4 = new C1038d();
            c1038d4.m2610d();
            c1038d4.m2608b();
            c1038d4.m2612i(str2);
            return addDanmaku(c1038d4.toString());
        } catch (Exception e) {
            return addDanmaku("");
        }
    }
}
