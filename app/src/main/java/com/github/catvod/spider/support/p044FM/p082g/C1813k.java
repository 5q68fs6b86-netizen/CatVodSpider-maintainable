package com.github.catvod.spider.support.p044FM.p082g;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p073b.C1747r;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.google.gson.annotations.SerializedName;
import java.net.URLEncoder;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p082g.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1813k {

    /* JADX INFO: renamed from: a */
    private final int[] f4138a = {46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};

    /* JADX INFO: renamed from: b */
    @SerializedName("img_url")
    private String f4139b;

    /* JADX INFO: renamed from: c */
    @SerializedName("sub_url")
    private String f4140c;

    /* JADX INFO: renamed from: a */
    public final String m4401a(LinkedHashMap<String, Object> linkedHashMap) {
        String strM4399b = C1812j.m4399b(Uri.parse(TextUtils.isEmpty(this.f4139b) ? "" : this.f4139b).getLastPathSegment().split("\\.")[0], Uri.parse(TextUtils.isEmpty(this.f4140c) ? "" : this.f4140c).getLastPathSegment().split("\\.")[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(strM4399b.charAt(this.f4138a[i]));
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        linkedHashMap.put("wts", Long.valueOf(System.currentTimeMillis() / 1000));
        for (String str : linkedHashMap.keySet()) {
            sb2.append(str);
            sb2.append("=");
            sb2.append(URLEncoder.encode(linkedHashMap.get(str).toString()));
            sb2.append("&");
        }
        String strM4578q = C1885z.m4578q(sb2.toString());
        return C1747r.m4094b(new byte[]{10, 36, -106, -82, -43, -48, -108}, new byte[]{44, 83, -55, -36, -68, -76, -87, -3}, C1434P.m3589b(strM4578q), C1885z.m4560a(strM4578q + string));
    }
}
