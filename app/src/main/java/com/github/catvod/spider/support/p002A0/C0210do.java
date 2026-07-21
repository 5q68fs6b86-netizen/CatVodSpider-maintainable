package com.github.catvod.spider.support.p002A0;

import android.text.TextUtils;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.do */
/* JADX INFO: loaded from: classes.dex */
public final class C0210do {

    /* JADX INFO: renamed from: a */
    public final String f742a;

    /* JADX INFO: renamed from: b */
    public String f743b = null;

    /* JADX INFO: renamed from: c */
    public final AbstractC0743xh f744c;

    /* JADX INFO: renamed from: d */
    public final Request f745d;

    /* JADX INFO: renamed from: e */
    public final Request.Builder f746e;

    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea A[LOOP:3: B:46:0x00e4->B:48:0x00ea, LOOP_END] */
    public C0210do(String str, String str2, String str3, HashMap map, HashMap map2, AbstractC0743xh abstractC0743xh) {
        RequestBody requestBodyBuild;
        this.f742a = str2;
        this.f744c = abstractC0743xh;
        Request.Builder builder = new Request.Builder();
        this.f746e = builder;
        if (str.equals("GET")) {
            if (map != null) {
                this.f742a += "?";
                for (String str4 : map.keySet()) {
                    this.f742a += str4 + "=" + ((String) map.get(str4)) + "&";
                }
                String str5 = this.f742a;
                this.f742a = str5.substring(0, str5.length() - 1);
            }
        } else if (str.equals("POST")) {
            if (TextUtils.isEmpty(str3)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                if (map2 != null) {
                    Iterator it = map2.keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str6 = (String) it.next();
                            if (str6.equalsIgnoreCase("Content-Type") && map != null) {
                                for (String str7 : map.keySet()) {
                                    try {
                                        builder2.addEncoded(str7, URLEncoder.encode((String) map.get(str7), ((String) map2.get(str6)).contains("charset=") ? ((String) map2.get(str6)).split("charset=")[1] : "utf-8"));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                                requestBodyBuild = builder2.build();
                            }
                        } else {
                            if (map != null) {
                                for (String str8 : map.keySet()) {
                                    builder2.add(str8, (String) map.get(str8));
                                }
                            }
                            requestBodyBuild = builder2.build();
                        }
                    }
                } else {
                    if (map != null) {
                        while (r6.hasNext()) {
                            builder2.add(str8, (String) map.get(str8));
                        }
                    }
                    requestBodyBuild = builder2.build();
                }
            } else {
                MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
                if (map2 != null) {
                    for (String str9 : map2.keySet()) {
                        if (str9.equalsIgnoreCase("Content-Type")) {
                            mediaType = MediaType.parse(((String) map2.get(str9)).isEmpty() ? "application/json; charset=utf-8" : (String) map2.get(str9));
                        }
                    }
                }
                requestBodyBuild = RequestBody.create(mediaType, str3);
            }
            builder.post(requestBodyBuild);
        }
        this.f746e.url(this.f742a);
        String str10 = this.f743b;
        if (str10 != null) {
            this.f746e.tag(str10);
        }
        if (map2 != null) {
            for (String str11 : map2.keySet()) {
                this.f746e.addHeader(str11, (String) map2.get(str11));
            }
        }
        this.f745d = this.f746e.build();
    }

    /* JADX INFO: renamed from: f */
    public final void m1138f(OkHttpClient okHttpClient) {
        AbstractC0743xh abstractC0743xh = this.f744c;
        Call callNewCall = okHttpClient.newCall(this.f745d);
        try {
            Response responseExecute = callNewCall.execute();
            if (abstractC0743xh != null) {
                Object objOnParseResponse = abstractC0743xh.onParseResponse(callNewCall, responseExecute);
                abstractC0743xh.f1803d = objOnParseResponse;
                abstractC0743xh.onResponse(objOnParseResponse);
            }
        } catch (IOException e) {
            if (abstractC0743xh != null) {
                abstractC0743xh.onError(callNewCall, e);
            }
        }
    }
}
