package com.github.catvod.spider;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p117b.C2185u;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PianKu8 extends Spider {

    /* JADX INFO: renamed from: b */
    private static final OkHttpClient f254b = new OkHttpClient();

    /* JADX INFO: renamed from: a */
    private String f255a = "http://qkys.qukanwh.com/api/v1/app";

    public static class Page {

        /* JADX INFO: renamed from: a */
        public int f256a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<Vod> f257b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public int f258c = 1;
    }

    /* JADX INFO: renamed from: b */
    public static HashMap<String, String> m629b() {
        HashMap<String, String> mapM5658c = C2174h.m5658c("Content-Type", "application/json;charset=UTF-8", "Cache-Control", "no-cache");
        mapM5658c.put("deviceId", "a4cf0ce7f9eee42f");
        mapM5658c.put("client", "app");
        mapM5658c.put("deviceType", "Android");
        mapM5658c.put("User-Agent", "okhttp/4.12.0");
        return mapM5658c;
    }

    /* JADX INFO: renamed from: c */
    public static List<Class> m630c() {
        return Arrays.asList(new Class("M16", "电影"), new Class("M15", "电视剧"), new Class("M17", "动漫"), new Class("M18", "综艺"), new Class("M14", "短剧"), new Class("M416", "纪录片"), new Class("M399", "少儿"));
    }

    /* JADX INFO: renamed from: e */
    public static String m631e(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        String strOptString = jSONObject == null ? "" : jSONObject.optString(str);
        return (!TextUtils.isEmpty(strOptString) || jSONObject2 == null) ? strOptString : jSONObject2.optString(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m632f(JSONObject jSONObject, Page page) {
        if (jSONObject == null) {
            return;
        }
        page.f256a = jSONObject.optInt("total");
        page.f258c = Math.max(1, jSONObject.optInt("pages", 1));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("records");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("id");
                String strOptString2 = jSONObjectOptJSONObject.optString("typeId");
                String strOptString3 = jSONObjectOptJSONObject.optString("name");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                    page.f257b.add(new Vod(C2185u.m5754a(strOptString, "|", strOptString2), strOptString3, jSONObjectOptJSONObject.optString("cover"), jSONObjectOptJSONObject.optString("remarks")));
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m633h(String str) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCoYt0BP77U+DM08BiI/QbSRIfxijXo85BTPqIM1Ow8BNwhLETzRIZ+dEwdWDbydG/PspgBAfRpGaYVdJYtvaC2JnoO8+Ik6qMWojfEJxSFLa0Pb0A892tun4gsxoEMjcreZ+YGyaBxAfqX0BSMfdrOgIYaZQjYrw9TRLlUT31QoQIDAQAB", 2)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyGeneratePublic);
            return Base64.encodeToString(cipher.doFinal(str.getBytes("UTF-8")), 2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    private static String m634h(String str, HashMap<String, String> map) {
        try {
            Request.Builder builder = new Request.Builder().url(str).get();
            if (map != null) {
                for (String str2 : map.keySet()) {
                    builder.addHeader(str2, map.get(str2));
                }
            }
            Response responseExecute = f254b.newCall(builder.build()).execute();
            return responseExecute.body() != null ? responseExecute.body().string() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    private static String m635j(String str, String str2, HashMap<String, String> map) {
        try {
            Request.Builder builderPost = new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), str2));
            if (map != null) {
                for (String str3 : map.keySet()) {
                    builderPost.addHeader(str3, map.get(str3));
                }
            }
            Response responseExecute = f254b.newCall(builderPost.build()).execute();
            return responseExecute.body() != null ? responseExecute.body().string() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public String m636a(String str, String str2) {
        try {
            return new JSONObject(m634h(this.f255a + "/play/analysisMovieUrl?playerUrl=" + URLEncoder.encode(str, "UTF-8") + "&playerId=" + URLEncoder.encode(str2, "UTF-8"), m629b())).optString("data");
        } catch (Exception unused) {
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused) {
            i = 1;
        }
        Page pageM637d = m637d(i, str);
        C2192c c2192c = new C2192c();
        c2192c.m5829w(pageM637d.f257b);
        c2192c.m5817i(i, Math.max(i, pageM637d.f258c), 40, pageM637d.f256a);
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: d */
    public Page m637d(int i, String str) {
        Page page = new Page();
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("classify", "");
            jSONObject2.put("region", "");
            jSONObject2.put("sreecnTypeEnum", "NEWEST");
            jSONObject2.put("typeId", str);
            jSONObject2.put("year", "");
            jSONObject.put("condition", jSONObject2);
            jSONObject.put("pageNum", i);
            jSONObject.put("pageSize", 40);
            m632f(m638g("/screen/screenMovie", m629b(), jSONObject).optJSONObject("data"), page);
        } catch (Throwable th) {
            StringBuilder sbM5396a = C2137a.m5396a("[ShanZha] list failed: ");
            sbM5396a.append(th.getMessage());
            SpiderDebug.log(sbM5396a.toString());
        }
        return page;
    }

    public String detailContent(List<String> list) {
        int i;
        JSONArray jSONArray;
        String str;
        String str2;
        String str3;
        JSONArray jSONArray2;
        String str4 = "$$$";
        String str5 = "id";
        String str6 = "";
        if (list == null || list.isEmpty()) {
            return "";
        }
        try {
            String[] strArrSplit = list.get(0).split("\\|", -1);
            String str7 = "M16";
            if (strArrSplit.length >= 2) {
                i = Integer.parseInt(strArrSplit[0]);
                str7 = strArrSplit[1];
            } else {
                i = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", i);
            jSONObject.put("typeId", str7);
            JSONObject jSONObjectOptJSONObject = m638g("/play/movieDesc", m629b(), jSONObject).optJSONObject("data");
            JSONObject jSONObjectM639i = m639i(i, str7, "", "", "");
            Vod c2194e = new Vod();
            c2194e.m5848j(i + "|" + str7);
            c2194e.m5849k(m631e(jSONObjectOptJSONObject, jSONObjectM639i, "name"));
            c2194e.m5850l(m631e(jSONObjectOptJSONObject, null, "cover"));
            c2194e.m5842e(m631e(jSONObjectOptJSONObject, null, "classify"));
            c2194e.m5855q(m631e(jSONObjectOptJSONObject, null, "year"));
            c2194e.m5845g(m631e(jSONObjectOptJSONObject, null, "area"));
            c2194e.m5847i(m631e(jSONObjectOptJSONObject, null, "director"));
            c2194e.m5843f(m631e(jSONObjectOptJSONObject, null, "star"));
            c2194e.m5853o(jSONObjectM639i != null ? jSONObjectM639i.optString("totalEpisode") : "");
            c2194e.m5846h(m631e(jSONObjectOptJSONObject, null, "introduce"));
            JSONArray jSONArrayOptJSONArray = jSONObjectM639i != null ? jSONObjectM639i.optJSONArray("moviePlayerList") : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObjectM639i != null ? jSONObjectM639i.optJSONArray("episodeList") : null;
            if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                jSONArrayOptJSONArray2 = new JSONArray();
                if (jSONObjectM639i != null && jSONObjectM639i.optJSONObject("currentEpisode") != null) {
                    jSONArrayOptJSONArray2.put(jSONObjectM639i.optJSONObject("currentEpisode"));
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int i2 = 0;
                while (i2 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString = jSONObjectOptJSONObject2.optString(str5);
                        String strOptString2 = jSONObjectOptJSONObject2.optString("moviePlayerName");
                        jSONArray = jSONArrayOptJSONArray;
                        CharSequence charSequence = " ";
                        String strTrim = strOptString2 == null ? str6 : strOptString2.replace(" ", str6).trim();
                        if (TextUtils.isEmpty(strTrim)) {
                            strTrim = jSONObjectOptJSONObject2.optString("code", "P" + strOptString);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        int i3 = 0;
                        while (i3 < jSONArrayOptJSONArray2.length()) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3);
                            if (jSONObjectOptJSONObject3 != null) {
                                String strOptString3 = jSONObjectOptJSONObject3.optString(str5);
                                String strValueOf = String.valueOf(i3);
                                String strOptString4 = jSONObjectOptJSONObject3.optString("episode");
                                String strTrim2 = strOptString4 == null ? str6 : strOptString4.replace(charSequence, str6).trim();
                                if (TextUtils.isEmpty(strTrim2)) {
                                    strTrim2 = "第" + jSONObjectOptJSONObject3.optString("episodeNum", String.valueOf(i3 + 1)) + "集";
                                }
                                arrayList3.add(strTrim2 + "$" + i + "|" + str7 + "|" + strOptString3 + "|" + strValueOf + "|" + strOptString);
                            } else {
                                charSequence = charSequence;
                                str6 = str6;
                            }
                            i3++;
                            jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                            str5 = str5;
                            str4 = str4;
                            charSequence = charSequence;
                            str6 = str6;
                        }
                        str = str4;
                        str2 = str5;
                        str3 = str6;
                        jSONArray2 = jSONArrayOptJSONArray2;
                        if (!arrayList3.isEmpty()) {
                            arrayList.add(strTrim);
                            arrayList2.add(TextUtils.join("#", arrayList3));
                        }
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                        str = str4;
                        str2 = str5;
                        str3 = str6;
                        c2194e = c2194e;
                        jSONArray2 = jSONArrayOptJSONArray2;
                    }
                    i2++;
                    jSONArrayOptJSONArray = jSONArray;
                    c2194e = c2194e;
                    jSONArrayOptJSONArray2 = jSONArray2;
                    str5 = str2;
                    str4 = str;
                    str6 = str3;
                }
            }
            Vod c2194e2 = c2194e;
            String str8 = str4;
            c2194e2.m5851m(TextUtils.join(str8, arrayList));
            c2194e2.m5852n(TextUtils.join(str8, arrayList2));
            return C2192c.m5804s(c2194e2);
        } catch (Throwable th) {
            StringBuilder sbM5396a = C2137a.m5396a("[ShanZha] detail failed: ");
            sbM5396a.append(th.getMessage());
            SpiderDebug.log(sbM5396a.toString());
            return C2192c.m5791c("山楂影视详情加载失败");
        }
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m638g(String str, HashMap<String, String> map, JSONObject jSONObject) {
        try {
            return new JSONObject(m635j(this.f255a + str, jSONObject == null ? "" : jSONObject.toString(), map));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public String homeContent(boolean z) {
        return Result.string(m630c(), m637d(1, "M16").f257b);
    }

    public String homeVideoContent() {
        return categoryContent("M16", "1", false, new HashMap<>());
    }

    /* JADX INFO: renamed from: i */
    public JSONObject m639i(int i, String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str5 = str2 == null ? "" : str2;
            jSONObject.put("episodeId", str5);
            String str6 = str3 == null ? "" : str3;
            jSONObject.put("episodeIndex", str6);
            jSONObject.put("id", i);
            String str7 = str4 == null ? "" : str4;
            jSONObject.put("playerId", str7);
            jSONObject.put("source", 0);
            jSONObject.put("typeId", str);
            jSONObject.put("userId", "");
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", m633h(jSONObject.toString()));
            StringBuilder sb = new StringBuilder();
            sb.append("SaltLSFBTimestamp");
            sb.append(strValueOf);
            sb.append("Params");
            sb.append("episodeId" + str5 + "episodeIndex" + str6 + "id" + i + "playerId" + str7 + "source0typeId" + str + "userId");
            sb.append("ClientappDeviceIda4cf0ce7f9eee42f");
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(Base64.encodeToString(sb.toString().getBytes("UTF-8"), 2).getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            String upperCase = sb2.toString().toUpperCase();
            HashMap<String, String> mapM629b = m629b();
            mapM629b.put("snjm", "Xj008rVU5rm4ZzA6SfNE0T+eeUpsLAHsLgqjZ/RPg58PIe1i5pq5C4MiEkO7MKY9Al430dZgz/eHmkXGrXMCBOtuhU0f7UHzGIKomclJy8XeerBVq5XKxSSKpn/FIcH8nBqQ5b21x5272F9WTzvkt5IwwBpF0oRkpTsqWoEZDgM=");
            mapM629b.put("appsign", "ZZt/snsaqaZc1PhK2jLkIc0oZtMMiC37YwbOMPf8cLV5VfKIfaY/+svEaj7ZNiJbI+CLB1O0qzXwuJZDDAJTtf4TqBbi/ErXV/8CDBZXv8IaPHe6Tc+AS2NlwRTTANmoxCEXeOnOCqVTRBQCiBhcieBeoCH1Q/SWf+GEpPqa8uI=");
            mapM629b.put("timestamp", strValueOf);
            mapM629b.put("sign", upperCase);
            String strOptString = m638g("/play/movieDetails", mapM629b, jSONObject2).optString("data");
            if (TextUtils.isEmpty(strOptString)) {
                return new JSONObject();
            }
            PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode("MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCquQQ5r6+yJI8CDFkXRp8vUsdD45ov8EP12ooLs56ca2DQXaSNGS9910bAPVA9chkp0mKIvKqjAsHz5Tl9EeNPblarGEeJUIxpxZtiSqNTpvtiD/TjhpzuHYic7RAfQ/h7p/ypE8ymU42pYjsB5t26Mv6XgkLV+jzrSf73HlCuS0iMyLmt6zz3Mw9izM13EpB8iFLtfbbYymycKTx4RAmPQLwhNGex/AlUIYxXP4R2yyaa4W6mEtc6aME2QuzJFxPgP3HJ9NBx/LWVn4skxWjZ7zg+VRQRHnjyVaSLu3Z5gN5ITWCyE32qaHJa6WBahZj5jWhRyAG1bQ+xKJa8lBL5AgMBAAECggEAUwv9SjJ0PSwbhNuM2w23kcWquROWhYtTA91zGY4esehqB/IFgb2mpIh8Gje5OKqwIu/8jpd4SiOlRYdUF8sD0DfUYRZGdj2AkFNX6tBz8tVfo6wvbB6naA1lzzBij1L5JO3qsjS3cJFkb+kg2yP66AC2Z+0tpfk8eRhdtshAZwfcd1DEGt1uAvYL1eaUK9HRvpt9lPeGcHERDl2hBd4uyaF0K1O+zF9y59nYbTySWPxRZq3sFEE85xRMlstD7YZi7W2gKvMFRD4/FKmrZ3m7aKJRITtyKOyyPcYmepNv3Qv7kk59Pg38n2WWQ0Ra/bCH3E48YNCnQvZMpitkTfJhoQKBgQDbnROOYTP8OTJ6f/qhoGjxeO3x1VOaOp8l0x7b0SCfoqNGS0Cyiqj72BmJtPMPqSTjn6MmNzqbg1KOdhXyzNozs+i5ccW1M56j96mr5I/Z0FpE3oyIHNfDDBlf9M8YQqEF9oYxniYYft9oapO7cRQkHER6qpvnHTavwlv4m78CXwKBgQDHAjs2YlpKDdI1lcbZJCc7TwtH+Pd2bUki8YXafWNcPhITQHbOZjr310eK1QJC6GJncjkOqbX7yv3ivvTO35FZTQhuA1xEG1P00FG8bE0tHYPIwQHi9y0eA5cieMdo8E6XYria1mw/3fqSQEsfZyJlR32JQIoGAipM8iO1X2nZpwKBgDkMFIhnt5lNQk+P7wsNIDWZtDWdtJnboHuy29E+Abt2A/O+mI/IdRz2hau/1WO8DFkUnszOi+rZshhPlGP90rCbi1igtTrcrdjp/KkqNjPea5R4OwkgdOu1uOG0NheXNzzVTQaWjk7Opjn5dWa7eP/oV+GFb/oZHJuLYVizHGsBAoGADA7rjZEKDYCm4w5PPSr+oY5ZjaPdQrS+gLqHtMRyN82fBMGcMUdqfUfzEstzVqCEDeaS5HuOBlK3bXzKkppjUTjksN3NQmcxgBz7RuJ9DqXCLXDcb2cwuafYCYOt+YLOEEgwDVm+t2P44dG5e46hO+fICH/7nP+WlpD5buz4GfMCgYB57r3g/6hi9WUDnfc7ZAzWMqR0EhJVYKYy+KFEtdIPzhkkIHq5RASe88E9kzoGoZFdb3tIjvGZWcHerirrqWkMsuQtP/Qi0zjieid5tAPj+r4kbiCVTw0E0jnmPBzGInQi7lpeTTKnG1fbyS5lBS+WmHfIuzpECgCkxhaT+LJJkg==", 2)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, privateKeyGeneratePrivate);
            byte[] bArrDecode = Base64.decode(strOptString, 2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i2 = 0; i2 < bArrDecode.length; i2 += 256) {
                byteArrayOutputStream.write(cipher.doFinal(bArrDecode, i2, Math.min(256, bArrDecode.length - i2)));
            }
            return new JSONObject(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strTrim = str.trim();
        if (!strTrim.startsWith("http")) {
            strTrim = C2139c.m5408a("http://", strTrim);
        }
        if (strTrim.endsWith("/")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        this.f255a = C2139c.m5408a(strTrim, "/api/v1/app");
    }

    public boolean isVideoFormat(String str) {
        return str != null && (str.contains(".m3u8") || str.contains(".mp4") || str.contains(".flv"));
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        int i;
        try {
            String[] strArrSplit = str2.split("\\|", -1);
            if (strArrSplit.length < 5) {
                C2192c c2192c = new C2192c();
                c2192c.m5827u(str2);
                return c2192c.toString();
            }
            try {
                i = Integer.parseInt(strArrSplit[0]);
            } catch (Exception unused) {
                i = 0;
            }
            String str3 = strArrSplit[1];
            String str4 = strArrSplit[2];
            String str5 = strArrSplit[3];
            String str6 = strArrSplit[4];
            String strOptString = m639i(i, str3, str4, str5, str6).optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                C2192c c2192c2 = new C2192c();
                c2192c2.m5827u("");
                c2192c2.m5822k("山楂影视播放地址为空");
                return c2192c2.toString();
            }
            String strM636a = m636a(strOptString, str6);
            if (!TextUtils.isEmpty(strM636a)) {
                strOptString = strM636a;
            }
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
            C2192c c2192c3 = new C2192c();
            c2192c3.m5827u(strOptString);
            c2192c3.m5811e((Map<String, String>) map);
            return C2137a.addDanmaku(c2192c3.toString());
        } catch (Throwable th) {
            StringBuilder sbM5396a = C2137a.m5396a("[ShanZha] player failed: ");
            sbM5396a.append(th.getMessage());
            SpiderDebug.log(sbM5396a.toString());
            C2192c c2192c4 = new C2192c();
            c2192c4.m5827u("");
            c2192c4.m5822k("山楂影视播放解析失败");
            return c2192c4.toString();
        }
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        int i;
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused) {
            i = 1;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Class> it = m630c().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String strM5790a = it.next().m5790a();
            Page page = new Page();
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("typeId", strM5790a);
                jSONObject2.put("value", str == null ? "" : str);
                jSONObject.put("condition", jSONObject2);
                jSONObject.put("pageNum", i);
                jSONObject.put("pageSize", 10);
                m632f(m638g("/search/searchMovie", m629b(), jSONObject).optJSONObject("data"), page);
            } catch (Throwable th) {
                StringBuilder sbM5396a = C2137a.m5396a("[ShanZha] search failed: ");
                sbM5396a.append(th.getMessage());
                SpiderDebug.log(sbM5396a.toString());
            }
            arrayList.addAll(page.f257b);
            i2 += page.f256a;
        }
        C2192c c2192c = new C2192c();
        c2192c.m5829w(arrayList);
        c2192c.m5817i(i, (arrayList.size() < 40 ? 0 : 1) + i, 40, i2);
        return c2192c.toString();
    }
}
