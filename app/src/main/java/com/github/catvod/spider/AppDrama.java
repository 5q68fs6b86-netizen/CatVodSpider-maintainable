package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.base.model.proto.ApiResultProto;
import com.base.model.proto.DramaDetailProto;
import com.base.model.proto.DramaProto;
import com.base.model.proto.DramaVideoProto;
import com.base.model.proto.ParsePlayUrlProto;
import com.base.model.proto.RSAPublicProto;
import com.base.model.proto.RSARequestProto;
import com.base.model.proto.SecureRequestProto;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p001A.C0108u;
import com.github.catvod.bean.Class;
import com.github.catvod.spider.support.p118c.C2191b;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppDrama extends Spider {

    /* JADX INFO: renamed from: a */
    public String f59a;

    /* JADX INFO: renamed from: b */
    public String f60b;

    /* JADX INFO: renamed from: c */
    public String f61c;

    /* JADX INFO: renamed from: d */
    public String f62d;

    /* JADX INFO: renamed from: e */
    public String f63e;

    /* JADX INFO: renamed from: e */
    public JSONObject f64e = new JSONObject();

    /* JADX INFO: renamed from: f */
    public String f65f;

    /* JADX INFO: renamed from: f */
    public final String[] f66f;

    /* JADX INFO: renamed from: g */
    public String f67g;

    /* JADX INFO: renamed from: a */
    public static String m404a(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"));
        return new String(cipher.doFinal(Base64.decode(str, 0)), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: b */
    public static String m405b(String str, String str2, String str3, String str4) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/" + str3 + "/PKCS7Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        if ("CBC".equals(str3)) {
            cipher.init(1, secretKeySpec, new IvParameterSpec(str4.getBytes()));
        } else {
            cipher.init(1, secretKeySpec);
        }
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
        if (!"CBC".equals(str3)) {
            return Base64.encodeToString(bArrDoFinal, 2);
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDoFinal) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m406f(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i - 1; i2++) {
            sb.append("1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(random.nextInt("1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".length())));
        }
        sb.append("=");
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m407h(byte[] bArr) {
        DramaProto.DramaBeanPage from = DramaProto.DramaBeanPage.parseFrom(ApiResultProto.ApiResult.parseFrom(bArr).getData());
        ArrayList arrayList = new ArrayList();
        for (DramaProto.DramaBean dramaBean : from.getDramaBeanList()) {
            arrayList.add(new Vod(String.valueOf(dramaBean.getId()), dramaBean.getName(), dramaBean.getCoverImage().getThumbnailPath(), dramaBean.getRemark()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static String m408i(String str, String str2) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKeyGeneratePublic);
        return Base64.encodeToString(cipher.doFinal(str.getBytes()), 2);
    }

    /* JADX INFO: renamed from: c */
    public final HashMap m409c() throws JSONException, BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str = this.f62d.isEmpty() ? this.f60b : this.f62d;
        JSONObject jSONObjectM410d = m410d();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM406f = m406f(16);
        String strM408i = m408i(jCurrentTimeMillis + strM406f + jSONObjectM410d.optString("vApp", "3019"), str);
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append(strM406f);
        String strM405b = m405b(sb.toString(), this.f66f[1], "ECB", null);
        jSONObjectM410d.put("sig", strM408i);
        jSONObjectM410d.put("random_str", strM406f);
        jSONObjectM410d.put("timestamp", jCurrentTimeMillis);
        jSONObjectM410d.put("sig2", strM405b.substring(0, 8));
        jSONObjectM410d.put("sig3", strM405b.substring(8));
        String string = jSONObjectM410d.toString();
        String str2 = this.f61c;
        String strM405b2 = m405b(string, str2, "CBC", str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paramsData", strM405b2);
        HashMap map = new HashMap();
        map.put("User-Agent", "okhttp/3.12.1");
        map.put("Accept", "application/x-protobuf");
        map.put("Content-Type", "application/x-protobuf");
        map.put("publicParams", jSONObject.toString());
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        HashMap map2 = new HashMap();
        map2.put("pagesize", "21");
        map2.put("typeId1", str);
        map2.put("page", str2);
        map2.put("vodOrderBy", map.getOrDefault("extend_sort", "最新"));
        map2.put("vodArea", map.getOrDefault("area", ""));
        map2.put("vodLang", map.getOrDefault("lang", ""));
        map2.put("vodClass", map.getOrDefault("class", ""));
        map2.put("vodYear", map.getOrDefault("year", ""));
        C0108u c0108uM6061b = C2238b.m6061b(this.f59a + "/api/proto/v5/drama/category", m412g(map2), m409c());
        C2192c c2192c = Result.get()();
        c2192c.m5833z(m407h(c0108uM6061b.f397a));
        c2192c.m5809b(Integer.parseInt(str2));
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m410d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String upperCase = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        jSONObject.put("country", "CN");
        jSONObject.put("vName", this.f64e.optString("version"));
        jSONObject.put("cpuId", "MT6893Z%2FCZA");
        jSONObject.put("young", 0);
        jSONObject.put("facturer", Build.MANUFACTURER);
        jSONObject.put("pkg", this.f63e);
        jSONObject.put("uuid", upperCase);
        jSONObject.put("resolution", "1080x2272");
        jSONObject.put("mac", "02%3A00%3A00%3A00%3A00%3A00");
        jSONObject.put("abid", "397");
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("plat", "android");
        jSONObject.put("udid", upperCase);
        jSONObject.put("dpi", "440");
        jSONObject.put("net", "1");
        jSONObject.put("lang", "zh");
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put("density", "2.75");
        jSONObject.put("appName", this.f65f);
        jSONObject.put("cpu", "arm64-v8a");
        jSONObject.put("chid", "10000");
        jSONObject.put("carrier", "%E8%81%94%E9%80%9A");
        jSONObject.put("_vOsCode", Build.VERSION.SDK_INT);
        jSONObject.put("vOs", Build.VERSION.RELEASE);
        jSONObject.put("v", 1);
        jSONObject.put("tenantId", "");
        jSONObject.put("vApp", this.f64e.optString("version").replace(".", ""));
        jSONObject.put("device", 0);
        jSONObject.put("androidID", Settings.Secure.getString(Init.context().getContentResolver(), "android_id"));
        return jSONObject;
    }

    public String detailContent(List<String> list) throws BadPaddingException, JSONException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        map.put("id", list.get(0));
        DramaDetailProto.DramaDetailBean from = DramaDetailProto.DramaDetailBean.parseFrom(ApiResultProto.ApiResult.parseFrom(C2238b.m6061b(this.f59a + "/api/proto/v5/drama/getDetail", m412g(map), m409c()).f397a).getData());
        Vod c2194e = new Vod();
        c2194e.m5843f(from.getActor());
        c2194e.m5847i("");
        c2194e.m5854p(from.getTag());
        c2194e.m5845g(from.getArea());
        c2194e.m5855q(String.valueOf(from.getYear()));
        c2194e.m5853o(from.getRemark());
        c2194e.m5846h(from.getIntro());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DramaVideoProto.DramaVideoBean dramaVideoBean : from.getVideosList()) {
            String sourceCn = dramaVideoBean.getSourceCn();
            if (sourceCn.isEmpty()) {
                sourceCn = "橘汁";
            }
            if (!linkedHashMap.containsKey(sourceCn)) {
                linkedHashMap.put(sourceCn, new ArrayList());
            }
            String path = dramaVideoBean.getPath();
            if (!path.matches("(?i).*\\.(mp4|m3u8|flv|mkv|avi|ts|mov|mpd|m4a|wmv)(\\?.*)?$")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vodPlayFrom", dramaVideoBean.getSource());
                jSONObject.put("playUrl", path);
                path = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            }
            ((List) linkedHashMap.get(sourceCn)).add(dramaVideoBean.getTitle() + "$" + path);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add((String) entry.getKey());
            arrayList2.add(TextUtils.join("#", (Iterable) entry.getValue()));
        }
        c2194e.m5851m(TextUtils.join("$$$", arrayList));
        c2194e.m5852n(TextUtils.join("$$$", arrayList2));
        String strM5795m = Result.string(c2194e);
        C2137a.parseJsonAndSave(strM5795m);
        return strM5795m;
    }

    /* JADX INFO: renamed from: e */
    public final HashMap m411e() throws BadPaddingException, JSONException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String string = m410d().toString();
        String str = this.f61c;
        String strM405b = m405b(string, str, "CBC", str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paramsData", strM405b);
        HashMap map = new HashMap();
        map.put("User-Agent", "okhttp/3.12.1");
        map.put("Accept", "application/json");
        map.put("Content-Type", "application/json; charset=utf-8");
        map.put("publicParams", jSONObject.toString());
        return map;
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m412g(HashMap map) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM406f = m406f(8);
        String strM406f2 = m406f(20);
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            String str2 = (String) map.get(str);
            if (str2 != null && !str2.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(str);
                sb.append("=");
                sb.append(str2);
            }
        }
        String str3 = strM406f + m405b(sb.toString() + jCurrentTimeMillis, this.f66f[0], "ECB", null);
        return SecureRequestProto.SecureRequest.newBuilder().setAesEncrypt1(str3.substring(0, 20)).setAesEncrypt2(str3.substring(20)).setAesFakestr(strM406f2).setTimestamp(jCurrentTimeMillis).setRandomStr(strM406f).build().toByteArray();
    }

    public String homeContent(boolean z) throws JSONException {
        int i = 1;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f59a);
        char c = 0;
        int i2 = 8;
        sb.append("/api/v3/drama/getCategory?orderBy=type_id");
        JSONArray jSONArrayOptJSONArray = new JSONObject(OkHttp.string(sb.toString(), m411e())).optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            List<String> listAsList = Arrays.asList("class", "lang", "area", "year", "extend_sort");
            int i3 = 0;
            while (i3 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i3);
                if (!jSONObject.optString("name").equals("公告")) {
                    String strOptString = jSONObject.optString("id");
                    arrayList.add(new Class(strOptString, jSONObject.optString("name")));
                    String strOptString2 = jSONObject.optString("converUrl");
                    if (!strOptString2.isEmpty()) {
                        JSONObject jSONObject2 = new JSONObject(strOptString2);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : listAsList) {
                            if (jSONObject2.has(str)) {
                                String strOptString3 = jSONObject2.optString(str);
                                if (!strOptString3.isEmpty()) {
                                    ArrayList arrayList3 = new ArrayList();
                                    byte[] bArr = new byte[i];
                                    bArr[c] = 124;
                                    byte[] bArr2 = new byte[i2];
                                    // fill-array-data instruction
                                    bArr2[0] = 80;
                                    bArr2[1] = -111;
                                    bArr2[2] = 7;
                                    bArr2[3] = 107;
                                    bArr2[4] = -50;
                                    bArr2[5] = -78;
                                    bArr2[6] = 5;
                                    bArr2[7] = -123;
                                    String[] strArrSplit = strOptString3.split(C0082a.m806a(bArr, bArr2));
                                    for (String str2 : strArrSplit) {
                                        arrayList3.add(new C2191b.a(str2, str2));
                                    }
                                    arrayList2.add(new C2191b(str, str, arrayList3));
                                }
                            }
                            i = 1;
                            c = 0;
                            i2 = 8;
                        }
                        if (!arrayList2.isEmpty()) {
                            linkedHashMap.put(strOptString, arrayList2);
                        }
                        i = 1;
                    }
                }
                i3 += i;
                c = 0;
                i2 = 8;
            }
        }
        return C2192c.m5799o(arrayList, linkedHashMap);
    }

    public String homeVideoContent() throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        int i = 1;
        String strOptString = new JSONObject(OkHttp.string(this.f59a + "/api/ex/v3/security/tag/list", m411e())).optString("data");
        if (strOptString.isEmpty()) {
            return Result.string(new ArrayList());
        }
        int i2 = 0;
        if (!this.f67g.equals("0")) {
            String[] strArr = this.f66f;
            i2 = 0;
            strOptString = m404a(m404a(strOptString, strArr[0]), strArr[1]);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(strOptString);
        int i3 = i2;
        while (i3 < jSONArray.length()) {
            JSONArray jSONArrayOptJSONArray = jSONArray.getJSONObject(i3).optJSONArray("sections");
            if (jSONArrayOptJSONArray != null) {
                int i4 = i2;
                while (i4 < jSONArrayOptJSONArray.length()) {
                    JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.getJSONObject(i4).optJSONArray("vodList");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i5 = i2; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i5);
                            arrayList.add(new Vod(jSONObject.optString("id"), jSONObject.optString("name"), jSONObject.optJSONObject("coverImage").optString("path"), jSONObject.optString("remark")));
                            i = 1;
                        }
                    }
                    i4 += i;
                    i2 = 0;
                }
            }
            i3 += i;
            i2 = 0;
        }
        return Result.string(arrayList);
    }

    public void init(Context context, String str) throws JSONException, BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        super.init(context, str);
        JSONObject jSONObject = new JSONObject(str);
        this.f64e = jSONObject;
        this.f59a = jSONObject.optString("host");
        this.f60b = jSONObject.optString("publicKey");
        this.f61c = "ed5fdsgucxumegqa";
        this.f62d = "";
        this.f63e = jSONObject.optString("pkg");
        this.f65f = jSONObject.optString("appName");
        this.f67g = jSONObject.optString("decrypt");
        this.f66f = new String[]{jSONObject.optString("dataKey"), jSONObject.optString("dataIv")};
        try {
            String strOptString = jSONObject.optString("site");
            if (!strOptString.isEmpty()) {
                String strOptString2 = new JSONObject(OkHttp.string(strOptString, null)).optString("domain");
                if (!strOptString2.isEmpty()) {
                    this.f59a = strOptString2;
                }
            }
        } catch (Exception unused) {
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM406f = m406f(16);
        RSARequestProto.RSARequest rSARequestBuild = RSARequestProto.RSARequest.newBuilder().setTimestamp(jCurrentTimeMillis).setRandomStr(strM406f).setSign(m408i(jCurrentTimeMillis + strM406f, this.f60b)).setFake1(m406f(16)).setFake2(m406f(16)).build();
        HashMap mapM409c = m409c();
        mapM409c.putAll(m409c());
        RSAPublicProto.RSAPublic from = RSAPublicProto.RSAPublic.parseFrom(ApiResultProto.ApiResult.parseFrom(C2238b.m6061b(this.f59a + "/api/v5/find/app/zone", rSARequestBuild.toByteArray(), mapM409c).f397a).getData());
        this.f62d = from.getStr2() + from.getStr3() + from.getStr4() + from.getStr5();
    }

    public String playerContent(String str, String str2, List<String> list) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (str2.matches("(?i).*\\.(mp4|m3u8|flv|mkv|avi|ts|mov|mpd|m4a|wmv)(\\?.*)?$")) {
            C2192c c2192c = Result.get()();
            c2192c.m5830w(str2);
            return C2137a.addDanmaku(c2192c.toString());
        }
        JSONObject jSONObject = new JSONObject(new String(Base64.decode(str2, 0)));
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        ParsePlayUrlProto.ParsePlayUrlBean from = ParsePlayUrlProto.ParsePlayUrlBean.parseFrom(ApiResultProto.ApiResult.parseFrom(C2238b.m6061b(this.f59a + "/api/proto/v5/videoUsableUrl", m412g(map), m409c()).f397a).getData());
        HashMap map2 = new HashMap();
        if (from.getHeadersCount() > 0) {
            map2.putAll(from.getHeadersMap());
        }
        C2192c c2192c2 = Result.get()();
        c2192c2.m5830w(from.getPlayUrl());
        c2192c2.m5812e((Map) map2);
        return C2137a.addDanmaku(c2192c2.toString());
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        map.put("searchKeys", str);
        map.put("page", str2);
        map.put("pagesize", "21");
        return Result.string(m407h(C2238b.m6061b(this.f59a + "/api/proto/v5/drama/search", m412g(map), m409c()).f397a));
    }
}
