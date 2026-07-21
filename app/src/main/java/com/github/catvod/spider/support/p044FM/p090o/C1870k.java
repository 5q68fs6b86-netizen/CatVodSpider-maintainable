package com.github.catvod.spider.support.p044FM.p090o;

import android.util.Base64;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1870k {

    /* JADX INFO: renamed from: a */
    private static final String f4309a = "https://api.nn.ci/ocr/b64/text";

    /* JADX INFO: renamed from: a */
    public static String m4523a(String str, Map<String, String> map) {
        String str2 = "";
        for (int i = 0; str2.equals("") && i < 3; i++) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                map.put("Cookie", httpURLConnection.getHeaderFields().get("Set-Cookie").get(0));
                InputStream inputStream = httpURLConnection.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
                inputStream.close();
                ResponseBody responseBodyBody = C1840c.m4476k(f4309a, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0)).body();
                if (responseBodyBody != null) {
                    String strString = responseBodyBody.string();
                    if (strString.length() == 4) {
                        str2 = strString;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }
}
