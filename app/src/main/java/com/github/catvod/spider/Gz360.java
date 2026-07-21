package com.github.catvod.spider;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Gz360;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.support.p126k.C2242f;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Gz360 extends Spider {

    /* JADX INFO: renamed from: i */
    private static final String[] f173i = {"https://apinew.uozvr.com", "https://api.w32z7vtd.com", "https://api.6a7nnf7.com", "https://api.umygrx3.com", "https://api.rmedphk.com"};

    /* JADX INFO: renamed from: j */
    private static final SecureRandom f174j = new SecureRandom();

    /* JADX INFO: renamed from: k */
    private static final Map<String, String> f175k = new HashMap();

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f176l = 0;

    /* JADX INFO: renamed from: a */
    private String f177a;

    /* JADX INFO: renamed from: b */
    private SharedPreferences f178b;

    /* JADX INFO: renamed from: c */
    private String f179c = "";

    /* JADX INFO: renamed from: d */
    private String f180d = "";

    /* JADX INFO: renamed from: e */
    private String f181e = "";

    /* JADX INFO: renamed from: f */
    private String f182f = "";

    /* JADX INFO: renamed from: g */
    private boolean f183g;

    /* JADX INFO: renamed from: h */
    private boolean f184h;

    /* JADX INFO: renamed from: a */
    static int m518a(Gz360 gz360, String str) {
        gz360.getClass();
        if (str == null) {
            return 0;
        }
        String upperCase = str.toUpperCase();
        if (upperCase.contains("4K") || upperCase.contains("2160")) {
            return 2160;
        }
        if (upperCase.contains("1080")) {
            return 1080;
        }
        if (upperCase.contains("720")) {
            return 720;
        }
        if (upperCase.contains("480")) {
            return 480;
        }
        if (upperCase.contains("360")) {
            return 360;
        }
        try {
            return Integer.parseInt(upperCase.replaceAll("[^0-9]", ""));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01cb A[LOOP:1: B:26:0x01c5->B:28:0x01cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:32:0x0200  */
    /* JADX WARN: Code duplicated, block: B:35:0x0207  */
    /* JADX WARN: Code duplicated, block: B:48:0x02b4 A[LOOP:2: B:47:0x02b2->B:48:0x02b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0313  */
    /* JADX INFO: renamed from: b */
    private JsonObject m519b(String str, Map<String, ?> map, int i) throws Exception {
        String str2;
        String str3;
        String upperCase;
        Request.Builder builderPost;
        Response responseExecute;
        String strString;
        JsonObject asJsonObject;
        String strM523g;
        int length;
        byte[] bArr;
        int i2;
        boolean zStartsWith = str.startsWith("/App/Authentication/");
        if (!zStartsWith) {
            m522f();
        }
        HashMap map2 = new HashMap();
        map2.putAll(map);
        if (map2.containsKey("token")) {
            map2.put("token", this.f179c);
        }
        if (map2.containsKey("token_id")) {
            map2.put("token_id", this.f180d);
        }
        byte[] bytes = new Gson().toJson(map2).getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = "OITxa5OqAYjhswxx".getBytes();
        byte[] bytes3 = "rCMNwZASNBKZ8mXV".getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bytes3));
        String upperCase2 = m521d(cipher.doFinal(bytes)).toUpperCase();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDUM5+/y8sPsWkd1/RQS64X259EUwxFXFE5HlA65MqrxnPs0JqoSRojSDy5QhwvROlaD6TwRQHKMY2OAZ6SnQeUJsChTEFIR9qUkwrs3/MVUMxjsv6JS6Oe/juclyJGTgVmDhB55EafXsD0SQYVj/QXXsxR6ewR5E2kL52yAAD4yQIDAQAB", 2)));
        Cipher cipher2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher2.init(1, publicKeyGeneratePublic);
        String strEncodeToString = Base64.encodeToString(cipher2.doFinal("{\"iv\":\"rCMNwZASNBKZ8mXV\",\"key\":\"OITxa5OqAYjhswxx\"}".getBytes(StandardCharsets.UTF_8)), 2);
        StringBuilder sbM5396a = C2137a.m5396a("token_id=,token=");
        sbM5396a.append(this.f179c);
        sbM5396a.append(",phone_type=1,request_key=");
        sbM5396a.append(upperCase2);
        sbM5396a.append(",app_id=1,time=");
        sbM5396a.append(strValueOf);
        sbM5396a.append(",keys=");
        sbM5396a.append(strEncodeToString);
        sbM5396a.append("*&zvdvdvddbfikkkumtmdwqppp?|4Y!s!2br");
        try {
            str2 = "AES";
            try {
                str3 = "RSA/ECB/PKCS1Padding";
                try {
                    StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(sbM5396a.toString().getBytes(StandardCharsets.UTF_8))).toString(16));
                    while (sb.length() < 32) {
                        sb.insert(0, "0");
                    }
                    upperCase = sb.toString().toUpperCase();
                } catch (Exception unused) {
                    upperCase = "";
                }
            } catch (Exception unused2) {
                str3 = "RSA/ECB/PKCS1Padding";
                upperCase = "";
                FormBody.Builder builder = new FormBody.Builder();
                builder.add("token", this.f179c);
                builder.add("token_id", "");
                builder.add("phone_type", "1");
                builder.add("time", strValueOf);
                builder.add("phone_model", "xiaomi-25031");
                builder.add("keys", strEncodeToString);
                builder.add("request_key", upperCase2);
                builder.add("signature", upperCase);
                builder.add("app_id", "1");
                builder.add("ad_version", "1");
                builderPost = new Request.Builder().url(this.f177a + str).post(builder.build());
                HashMap mapM5658c = C2174h.m5658c("User-Agent", "Lavf/57.83.100", "code", "GZ0369");
                mapM5658c.put("deviceId", this.f181e);
                mapM5658c.put("lang", "zh_cn");
                mapM5658c.put("Cache-Control", "no-cache");
                mapM5658c.put("Content-Type", "application/x-www-form-urlencoded");
                mapM5658c.put("Version", "2604028");
                mapM5658c.put("PackageName", "com.ae06aebdbb.y286327f5a.ofe849883320260517");
                mapM5658c.put("Ver", "3.0.3.2");
                mapM5658c.put("api-ver", "3.0.3.2");
                for (Map.Entry entry : mapM5658c.entrySet()) {
                    builderPost.addHeader((String) entry.getKey(), (String) entry.getValue());
                }
                responseExecute = C2238b.m6060a().newCall(builderPost.build()).execute();
                if (responseExecute.body() != null) {
                    strString = responseExecute.body().string();
                } else {
                    strString = "";
                }
                if (!strString.isEmpty()) {
                    throw new Exception("空响应");
                }
                asJsonObject = JsonParser.parseString(strString).getAsJsonObject();
                if (!asJsonObject.has("code")) {
                }
                JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("data");
                strM523g = m523g(asJsonObject2, "response_key");
                String strM523g2 = m523g(asJsonObject2, "keys");
                PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode("-----BEGIN RSA PRIVATE KEY-----\nMIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGAe6hKrWLi1zQmjTT1ozbE4QdFeJGNxubxld6GrFGximxfMsMB6BpJhpcTouAqywAFppiKetUBBbXwYsYU1wNr648XVmPmCMCy4rY8vdliFnbMUj086DU6Z+/oXBdWU3/b1G0DN3E9wULRSwcKZT3wj/cCI1vsCm3gj2R5SqkA9Y0CAwEAAQKBgAJH+4CxV0/zBVcLiBCHvSANm0l7HetybTh/j2p0Y1sTXro4ALwAaCTUeqdBjWiLSo9lNwDHFyq8zX90+gNxa7c5EqcWV9FmlVXr8VhfBzcZo1nXeNdXFT7tQ2yah/odtdcx+vRMSGJd1t/5k5bDd9wAvYdIDblMAg+wiKKZ5KcdAkEA1cCakEN4NexkF5tHPRrR6XOY/XHfkqXxEhMqmNbB9U34saTJnLWIHC8IXys6Qmzz30TtzCjuOqKRRy+FMM4TdwJBAJQZFPjsGC+RqcG5UvVMiMPhnwe/bXEehShK86yJK/g/UiKrO87h3aEu5gcJqBygTq3BBBoH2md3pr/W+hUMWBsCQQChfhTIrdDinKi6lRxrdBnn0Ohjg2cwuqK5zzU9p/N+S9x7Ck8wUI53DKm8jUJE8WAG7WLj/oCOWEh+ic6NIwTdAkEAj0X8nhx6AXsgCYRql1klbqtVmL8+95KZK7PnLWG/IfjQUy3pPGoSaZ7fdquG8bq8oyf5+dzjE/oTXcByS+6XRQJAP/5ciy1bL3NhUhsaOVy55MHXnPjdcTX0FaLi+ybXZIfIQ2P4rb19mVq1feMbCXhz+L1rG8oat5lYKfpe8k83ZA==\n-----END RSA PRIVATE KEY-----".replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "").replace("-----BEGIN RSA PRIVATE KEY-----", "").replace("-----END RSA PRIVATE KEY-----", "").replaceAll("\\s", ""), 2)));
                Cipher cipher3 = Cipher.getInstance(str3);
                cipher3.init(2, privateKeyGeneratePrivate);
                JsonObject asJsonObject3 = JsonParser.parseString(new String(cipher3.doFinal(Base64.decode(strM523g2, 2)), StandardCharsets.UTF_8)).getAsJsonObject();
                length = strM523g.length();
                bArr = new byte[length / 2];
                for (i2 = 0; i2 < length; i2 += 2) {
                    bArr[i2 / 2] = (byte) (Character.digit(strM523g.charAt(i2 + 1), 16) + (Character.digit(strM523g.charAt(i2), 16) << 4));
                }
                byte[] bytes4 = m523g(asJsonObject3, "key").getBytes(StandardCharsets.UTF_8);
                byte[] bytes5 = m523g(asJsonObject3, "iv").getBytes(StandardCharsets.UTF_8);
                SecretKeySpec secretKeySpec2 = new SecretKeySpec(bytes4, str2);
                Cipher cipher4 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher4.init(2, secretKeySpec2, new IvParameterSpec(bytes5));
                return JsonParser.parseString(new String(cipher4.doFinal(bArr), StandardCharsets.UTF_8)).getAsJsonObject();
            }
        } catch (Exception unused3) {
            str2 = "AES";
        }
        FormBody.Builder builder2 = new FormBody.Builder();
        builder2.add("token", this.f179c);
        builder2.add("token_id", "");
        builder2.add("phone_type", "1");
        builder2.add("time", strValueOf);
        builder2.add("phone_model", "xiaomi-25031");
        builder2.add("keys", strEncodeToString);
        builder2.add("request_key", upperCase2);
        builder2.add("signature", upperCase);
        builder2.add("app_id", "1");
        builder2.add("ad_version", "1");
        builderPost = new Request.Builder().url(this.f177a + str).post(builder2.build());
        HashMap mapM5658c2 = C2174h.m5658c("User-Agent", "Lavf/57.83.100", "code", "GZ0369");
        mapM5658c2.put("deviceId", this.f181e);
        mapM5658c2.put("lang", "zh_cn");
        mapM5658c2.put("Cache-Control", "no-cache");
        mapM5658c2.put("Content-Type", "application/x-www-form-urlencoded");
        mapM5658c2.put("Version", "2604028");
        mapM5658c2.put("PackageName", "com.ae06aebdbb.y286327f5a.ofe849883320260517");
        mapM5658c2.put("Ver", "3.0.3.2");
        mapM5658c2.put("api-ver", "3.0.3.2");
        while (r7.hasNext()) {
            builderPost.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        responseExecute = C2238b.m6060a().newCall(builderPost.build()).execute();
        if (responseExecute.body() != null) {
            strString = responseExecute.body().string();
        } else {
            strString = "";
        }
        if (!strString.isEmpty()) {
            throw new Exception("空响应");
        }
        asJsonObject = JsonParser.parseString(strString).getAsJsonObject();
        if (!asJsonObject.has("code") && asJsonObject.get("code").getAsInt() != 200) {
            if (i < 1 && !zStartsWith) {
                this.f184h = false;
                m522f();
                return m519b(str, map, i + 1);
            }
            throw new Exception("请求失败: " + asJsonObject);
        }
        JsonObject asJsonObject4 = asJsonObject.getAsJsonObject("data");
        strM523g = m523g(asJsonObject4, "response_key");
        String strM523g3 = m523g(asJsonObject4, "keys");
        PrivateKey privateKeyGeneratePrivate2 = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode("-----BEGIN RSA PRIVATE KEY-----\nMIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGAe6hKrWLi1zQmjTT1ozbE4QdFeJGNxubxld6GrFGximxfMsMB6BpJhpcTouAqywAFppiKetUBBbXwYsYU1wNr648XVmPmCMCy4rY8vdliFnbMUj086DU6Z+/oXBdWU3/b1G0DN3E9wULRSwcKZT3wj/cCI1vsCm3gj2R5SqkA9Y0CAwEAAQKBgAJH+4CxV0/zBVcLiBCHvSANm0l7HetybTh/j2p0Y1sTXro4ALwAaCTUeqdBjWiLSo9lNwDHFyq8zX90+gNxa7c5EqcWV9FmlVXr8VhfBzcZo1nXeNdXFT7tQ2yah/odtdcx+vRMSGJd1t/5k5bDd9wAvYdIDblMAg+wiKKZ5KcdAkEA1cCakEN4NexkF5tHPRrR6XOY/XHfkqXxEhMqmNbB9U34saTJnLWIHC8IXys6Qmzz30TtzCjuOqKRRy+FMM4TdwJBAJQZFPjsGC+RqcG5UvVMiMPhnwe/bXEehShK86yJK/g/UiKrO87h3aEu5gcJqBygTq3BBBoH2md3pr/W+hUMWBsCQQChfhTIrdDinKi6lRxrdBnn0Ohjg2cwuqK5zzU9p/N+S9x7Ck8wUI53DKm8jUJE8WAG7WLj/oCOWEh+ic6NIwTdAkEAj0X8nhx6AXsgCYRql1klbqtVmL8+95KZK7PnLWG/IfjQUy3pPGoSaZ7fdquG8bq8oyf5+dzjE/oTXcByS+6XRQJAP/5ciy1bL3NhUhsaOVy55MHXnPjdcTX0FaLi+ybXZIfIQ2P4rb19mVq1feMbCXhz+L1rG8oat5lYKfpe8k83ZA==\n-----END RSA PRIVATE KEY-----".replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "").replace("-----BEGIN RSA PRIVATE KEY-----", "").replace("-----END RSA PRIVATE KEY-----", "").replaceAll("\\s", ""), 2)));
        Cipher cipher5 = Cipher.getInstance(str3);
        cipher5.init(2, privateKeyGeneratePrivate2);
        JsonObject asJsonObject5 = JsonParser.parseString(new String(cipher5.doFinal(Base64.decode(strM523g3, 2)), StandardCharsets.UTF_8)).getAsJsonObject();
        length = strM523g.length();
        bArr = new byte[length / 2];
        while (i2 < length) {
            bArr[i2 / 2] = (byte) (Character.digit(strM523g.charAt(i2 + 1), 16) + (Character.digit(strM523g.charAt(i2), 16) << 4));
        }
        byte[] bytes6 = m523g(asJsonObject5, "key").getBytes(StandardCharsets.UTF_8);
        byte[] bytes7 = m523g(asJsonObject5, "iv").getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec3 = new SecretKeySpec(bytes6, str2);
        Cipher cipher6 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher6.init(2, secretKeySpec3, new IvParameterSpec(bytes7));
        return JsonParser.parseString(new String(cipher6.doFinal(bArr), StandardCharsets.UTF_8)).getAsJsonObject();
    }

    /* JADX INFO: renamed from: c */
    private void m520c(JsonObject jsonObject) throws Exception {
        String strM523g = m523g(jsonObject, "token");
        if (TextUtils.isEmpty(strM523g)) {
            throw new Exception("Token 获取失败: " + jsonObject);
        }
        this.f179c = strM523g;
        String strM523g2 = m523g(jsonObject, "app_user_id");
        if (!TextUtils.isEmpty(strM523g2)) {
            this.f180d = strM523g2;
        }
        m525i();
    }

    /* JADX INFO: renamed from: d */
    private String m521d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    private synchronized void m522f() {
        if (!this.f184h || TextUtils.isEmpty(this.f179c)) {
            if (TextUtils.isEmpty(this.f179c)) {
                if (this.f183g) {
                    m526j();
                } else {
                    m527k();
                }
            }
            try {
                m520c(m519b("/App/Authentication/Authenticator/refresh", new HashMap(), 0));
            } catch (Exception e) {
                if (!this.f183g) {
                    throw e;
                }
                m526j();
            }
            this.f184h = true;
        }
    }

    /* JADX INFO: renamed from: g */
    private String m523g(JsonObject jsonObject, String str) {
        return (jsonObject == null || !jsonObject.has(str) || jsonObject.get(str).isJsonNull()) ? "" : jsonObject.get(str).getAsString();
    }

    /* JADX INFO: renamed from: h */
    private List<Vod> m524h(JsonObject jsonObject) {
        String strM523g;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        if (!jsonObject.has("list")) {
            return arrayList;
        }
        Iterator it = jsonObject.getAsJsonArray("list").iterator();
        while (it.hasNext()) {
            JsonObject asJsonObject = ((JsonElement) it.next()).getAsJsonObject();
            Vod c2194e = new Vod();
            c2194e.m5848j(m523g(asJsonObject, "vod_id"));
            c2194e.m5849k(m523g(asJsonObject, "vod_name"));
            c2194e.m5850l(m523g(asJsonObject, "vod_pic") + "@User-Agent=Dalvik/2.1.0");
            c2194e.m5853o(m523g(asJsonObject, "vod_scroe"));
            if (asJsonObject.has("vod_continu")) {
                String strM523g2 = m523g(asJsonObject, "vod_continu");
                String strM523g3 = m523g(asJsonObject, "d_total");
                if ("0".equals(strM523g3) || "0".equals(strM523g2)) {
                    strM523g = m523g(asJsonObject, "vod_year");
                } else {
                    if (strM523g2.equals(strM523g3)) {
                        sb = new StringBuilder();
                        sb.append("全");
                        sb.append(strM523g3);
                    } else {
                        sb = new StringBuilder();
                        sb.append("更新至");
                        sb.append(strM523g2);
                    }
                    sb.append("集");
                    strM523g = sb.toString();
                }
                c2194e.m5853o(strM523g);
            }
            arrayList.add(c2194e);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private void m525i() {
        this.f178b.edit().putString("token", this.f179c).putString("token_id", this.f180d).putString("device_id", this.f181e).putString("device_key", this.f182f).putBoolean("registered", this.f183g).apply();
    }

    /* JADX INFO: renamed from: j */
    private void m526j() throws Exception {
        HashMap map = new HashMap();
        map.put("new_key", this.f182f);
        map.put("old_key", "aLFBMWpxBrIDAD1Si/KVvm41");
        m520c(m519b("/App/Authentication/Device/signIn", map, 0));
    }

    /* JADX INFO: renamed from: k */
    private void m527k() throws Exception {
        HashMap map = new HashMap();
        map.put("new_key", this.f182f);
        map.put("old_key", "aLFBMWpxBrIDAD1Si/KVvm41");
        map.put("phone_type", 1);
        map.put("code", "");
        m520c(m519b("/App/Authentication/Device/signUp", map, 0));
        this.f183g = true;
        m525i();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        Object obj;
        HashMap mapM5658c = C2174h.m5658c("tid", str, "page", str2);
        mapM5658c.put("pageSize", "30");
        String str3 = "0";
        mapM5658c.put("area", map.containsKey("area") ? map.get("area") : "0");
        mapM5658c.put("year", map.containsKey("year") ? map.get("year") : "0");
        mapM5658c.put("sort", map.containsKey("sort") ? map.get("sort") : "d_id");
        if (!map.containsKey("sub")) {
            ?? r6 = f175k;
            if (r6.containsKey(str)) {
                obj = r6.get(str);
            }
            mapM5658c.put("sub", str3);
            return Result.string(m524h(m519b("/App/IndexList/indexList", mapM5658c, 0)));
        }
        obj = map.get("sub");
        str3 = (String) obj;
        mapM5658c.put("sub", str3);
        return Result.string(m524h(m519b("/App/IndexList/indexList", mapM5658c, 0)));
    }

    public String detailContent(List<String> list) throws Exception {
        m522f();
        String str = list.get(0);
        HashMap map = new HashMap();
        map.put("token_id", this.f180d);
        map.put("vod_id", str);
        map.put("mobile_time", String.valueOf(System.currentTimeMillis() / 1000));
        map.put("token", this.f179c);
        HashMap map2 = new HashMap();
        map2.put("vurl_cloud_id", "2");
        map2.put("vod_d_id", str);
        JsonObject jsonObjectM519b = m519b("/App/IndexPlay/playInfo", map, 0);
        JsonObject jsonObjectM519b2 = m519b("/App/Resource/Vurl/show", map2, 0);
        JsonObject asJsonObject = jsonObjectM519b.getAsJsonObject("vodInfo");
        Vod c2194e = new Vod();
        c2194e.m5848j(str);
        c2194e.m5849k(m523g(asJsonObject, "vod_name"));
        c2194e.m5850l(m523g(asJsonObject, "vod_pic") + "@User-Agent=Dalvik/2.1.0");
        c2194e.m5855q(m523g(asJsonObject, "vod_year"));
        c2194e.m5845g(m523g(asJsonObject, "vod_area"));
        c2194e.m5843f(m523g(asJsonObject, "vod_actor"));
        c2194e.m5847i(m523g(asJsonObject, "vod_director"));
        c2194e.m5846h(m523g(asJsonObject, "vod_use_content").replace("\u3000", "\n").trim());
        HashMap map3 = new HashMap();
        ArrayList<String> arrayList = new ArrayList();
        if (jsonObjectM519b2.has("list") && jsonObjectM519b2.get("list").isJsonArray()) {
            JsonArray asJsonArray = jsonObjectM519b2.getAsJsonArray("list");
            for (int i = 0; i < asJsonArray.size(); i++) {
                JsonObject asJsonObject2 = asJsonArray.get(i).getAsJsonObject().getAsJsonObject("play");
                String strM523g = asJsonArray.size() == 1 ? m523g(asJsonObject, "vod_name") : String.valueOf(i + 1);
                for (Map.Entry entry : asJsonObject2.entrySet()) {
                    String str2 = (String) entry.getKey();
                    JsonObject asJsonObject3 = ((JsonElement) entry.getValue()).getAsJsonObject();
                    if (asJsonObject3.has("param") && !asJsonObject3.get("param").isJsonNull()) {
                        String strM523g2 = m523g(asJsonObject3, "param");
                        if (!strM523g2.isEmpty()) {
                            if (!map3.containsKey(str2)) {
                                map3.put(str2, new ArrayList());
                                arrayList.add(str2);
                            }
                            ((List) map3.get(str2)).add(strM523g + "$" + strM523g2 + "||" + str2);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator<String>() { // from class: com.github.catvod.spider.Gz360.1
            @Override // java.util.Comparator
            public int compare(String str3, String str4) {
                return Gz360.m518a(Gz360.this, str4) - Gz360.m518a(Gz360.this, str3);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str3 : arrayList) {
            arrayList2.add(str3);
            arrayList3.add(TextUtils.join("#", (Iterable) map3.get(str3)));
        }
        String strJoin = TextUtils.join("$$$", arrayList3);
        c2194e.m5851m(TextUtils.join("$$$", arrayList2));
        c2194e.m5852n(strJoin);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(c2194e);
        return Result.string(arrayList4);
    }

    public String homeContent(boolean z) throws JSONException {
        JSONArray jSONArray = new JSONArray("[{\"type_id\":\"1\",\"type_name\":\"电影\"},{\"type_id\":\"2\",\"type_name\":\"国产剧\"},{\"type_id\":\"3\",\"type_name\":\"动漫\"},{\"type_id\":\"4\",\"type_name\":\"综艺\"},{\"type_id\":\"64\",\"type_name\":\"短剧\"}]");
        JSONObject jSONObject = new JSONObject("{\"1\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"地区\",\"v\":\"0\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"欧美\",\"v\":\"俄罗斯,加拿大,德国,意大利,法国,欧美,美国,英国,西班牙\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"其他\",\"v\":\"其他,印度,新加坡,马来西亚\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"年份\",\"v\":\"0\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"10-15年\",\"v\":\"2015,2014,2013,2012,2011,2010\"},{\"n\":\"00年代\",\"v\":\"2000,2001,2002,2003,2004,2005,2006,2007,2008,2009\"},{\"n\":\"90年代\",\"v\":\"1990,1991,1992,1993,1994,1995,1996,1997,1998,1999\"},{\"n\":\"80年代\",\"v\":\"1980,1981,1982,1983,1984,1985,1986,1987,1988,1989\"},{\"n\":\"更早\",\"v\":\"2\"}]},{\"key\":\"sub\",\"name\":\"类型\",\"value\":[{\"n\":\"动作片\",\"v\":\"5\"},{\"n\":\"悬疑片\",\"v\":\"29\"},{\"n\":\"喜剧片\",\"v\":\"6\"},{\"n\":\"爱情片\",\"v\":\"7\"},{\"n\":\"科幻片\",\"v\":\"8\"},{\"n\":\"恐怖片\",\"v\":\"9\"},{\"n\":\"剧情片\",\"v\":\"10\"},{\"n\":\"战争片\",\"v\":\"11\"},{\"n\":\"动画片\",\"v\":\"36\"},{\"n\":\"纪录片\",\"v\":\"20\"},{\"n\":\"灾难片\",\"v\":\"38\"},{\"n\":\"犯罪片\",\"v\":\"61\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"综合\",\"v\":\"d_id\"},{\"n\":\"最新\",\"v\":\"d_addtime\"},{\"n\":\"最热\",\"v\":\"d_score\"},{\"n\":\"高分\",\"v\":\"d_score\"}]}],\"2\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"地区\",\"v\":\"0\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"欧美\",\"v\":\"俄罗斯,加拿大,德国,意大利,法国,欧美,美国,英国,西班牙\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"其他\",\"v\":\"其他,印度,新加坡,马来西亚\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"年份\",\"v\":\"0\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"10-15年\",\"v\":\"2015,2014,2013,2012,2011,2010\"},{\"n\":\"00年代\",\"v\":\"2000,2001,2002,2003,2004,2005,2006,2007,2008,2009\"},{\"n\":\"90年代\",\"v\":\"1990,1991,1992,1993,1994,1995,1996,1997,1998,1999\"},{\"n\":\"80年代\",\"v\":\"1980,1981,1982,1983,1984,1985,1986,1987,1988,1989\"},{\"n\":\"更早\",\"v\":\"2\"}]},{\"key\":\"sub\",\"name\":\"类型\",\"value\":[{\"n\":\"国产剧\",\"v\":\"12\"},{\"n\":\"香港剧\",\"v\":\"13\"},{\"n\":\"台湾剧\",\"v\":\"14\"},{\"n\":\"欧美剧\",\"v\":\"15\"},{\"n\":\"日本剧\",\"v\":\"16\"},{\"n\":\"韩国剧\",\"v\":\"17\"},{\"n\":\"海外剧\",\"v\":\"18\"},{\"n\":\"泰国剧\",\"v\":\"19\"},{\"n\":\"新加坡\",\"v\":\"69\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"综合\",\"v\":\"d_id\"},{\"n\":\"最新\",\"v\":\"d_addtime\"},{\"n\":\"最热\",\"v\":\"d_score\"},{\"n\":\"高分\",\"v\":\"d_score\"}]}],\"3\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"地区\",\"v\":\"0\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"欧美\",\"v\":\"俄罗斯,加拿大,德国,意大利,法国,欧美,美国,英国,西班牙\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"其他\",\"v\":\"其他,印度,新加坡,马来西亚\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"年份\",\"v\":\"0\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"10-15年\",\"v\":\"2015,2014,2013,2012,2011,2010\"},{\"n\":\"00年代\",\"v\":\"2000,2001,2002,2003,2004,2005,2006,2007,2008,2009\"},{\"n\":\"90年代\",\"v\":\"1990,1991,1992,1993,1994,1995,1996,1997,1998,1999\"},{\"n\":\"80年代\",\"v\":\"1980,1981,1982,1983,1984,1985,1986,1987,1988,1989\"},{\"n\":\"更早\",\"v\":\"2\"}]},{\"key\":\"sub\",\"name\":\"类型\",\"value\":[{\"n\":\"中国动漫\",\"v\":\"30\"},{\"n\":\"日本动漫\",\"v\":\"31\"},{\"n\":\" 欧美动漫\",\"v\":\"33\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"综合\",\"v\":\"d_id\"},{\"n\":\"最新\",\"v\":\"d_addtime\"},{\"n\":\"最热\",\"v\":\"d_score\"},{\"n\":\"高分\",\"v\":\"d_score\"}]}],\"4\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"地区\",\"v\":\"0\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"欧美\",\"v\":\"俄罗斯,加拿大,德国,意大利,法国,欧美,美国,英国,西班牙\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"其他\",\"v\":\"其他,印度,新加坡,马来西亚\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"年份\",\"v\":\"0\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"10-15年\",\"v\":\"2015,2014,2013,2012,2011,2010\"},{\"n\":\"00年代\",\"v\":\"2000,2001,2002,2003,2004,2005,2006,2007,2008,2009\"},{\"n\":\"90年代\",\"v\":\"1990,1991,1992,1993,1994,1995,1996,1997,1998,1999\"},{\"n\":\"80年代\",\"v\":\"1980,1981,1982,1983,1984,1985,1986,1987,1988,1989\"},{\"n\":\"更早\",\"v\":\"2\"}]},{\"key\":\"sub\",\"name\":\"类型\",\"value\":[{\"n\":\"大陆综艺\",\"v\":\"22\"},{\"n\":\"港台综艺\",\"v\":\"23\"},{\"n\":\"日韩综艺\",\"v\":\"24\"},{\"n\":\"欧美综艺\",\"v\":\"25\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"综合\",\"v\":\"d_id\"},{\"n\":\"最新\",\"v\":\"d_addtime\"},{\"n\":\"最热\",\"v\":\"d_score\"},{\"n\":\"高分\",\"v\":\"d_score\"}]}],\"64\":[{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"综合\",\"v\":\"d_id\"},{\"n\":\"最新\",\"v\":\"d_addtime\"},{\"n\":\"最热\",\"v\":\"d_score\"},{\"n\":\"高分\",\"v\":\"d_score\"}]}]}");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("class", jSONArray);
        jSONObject2.put("filters", jSONObject);
        jSONObject2.put("list", new JSONArray());
        return jSONObject2.toString();
    }

    public String homeVideoContent() throws Exception {
        HashMap map = new HashMap();
        map.put("pid", "1");
        JsonObject jsonObjectM519b = m519b("/App/IndexList/index", map, 0);
        JsonArray asJsonArray = jsonObjectM519b.has("list") ? jsonObjectM519b.getAsJsonArray("list") : null;
        ArrayList arrayList = new ArrayList();
        if (asJsonArray != null) {
            if (asJsonArray.size() > 1) {
                for (int i = 1; i < asJsonArray.size(); i++) {
                    arrayList.addAll(m524h(asJsonArray.get(i).getAsJsonObject()));
                }
            }
        }
        return Result.string(arrayList);
    }

    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public void init(Context context, String str) {
        String str2;
        Init.init(context);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(3L, timeUnit).readTimeout(3L, timeUnit).writeTimeout(3L, timeUnit).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.support.A.b0
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str3, SSLSession sSLSession) {
                int i = Gz360.f176l;
                return true;
            }
        }).sslSocketFactory(new C2242f(), C2242f.f5598d).build();
        String[] strArr = f173i;
        int i = 0;
        while (true) {
            if (i >= 5) {
                str2 = f173i[0];
                break;
            }
            str2 = strArr[i];
            try {
                Response responseExecute = okHttpClientBuild.newCall(new Request.Builder().url(str2).head().headers(Headers.of(map)).build()).execute();
                int iCode = responseExecute.code();
                responseExecute.close();
                if (iCode >= 200 && iCode < 300) {
                    break;
                } else {
                    i++;
                }
            } catch (Exception unused) {
            }
        }
        this.f177a = str2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("guazi_auth", 0);
        this.f178b = sharedPreferences;
        this.f179c = sharedPreferences.getString("token", "");
        this.f180d = this.f178b.getString("token_id", "");
        this.f181e = this.f178b.getString("device_id", "");
        this.f182f = this.f178b.getString("device_key", "");
        this.f183g = this.f178b.getBoolean("registered", !TextUtils.isEmpty(this.f179c));
        this.f184h = false;
        if (TextUtils.isEmpty(this.f181e) || TextUtils.isEmpty(this.f182f)) {
            SecureRandom secureRandom = f174j;
            this.f181e = String.valueOf(((long) secureRandom.nextInt(10000)) + 864150060000000L);
            byte[] bArr = new byte[20];
            secureRandom.nextBytes(bArr);
            this.f182f = m521d(bArr).toUpperCase();
            this.f179c = "";
            this.f180d = "";
            this.f183g = false;
            m525i();
        }
        try {
            m522f();
        } catch (Exception unused2) {
        }
        ?? r8 = f175k;
        r8.put("1", "5");
        r8.put("2", "12");
        r8.put("3", "30");
        r8.put("4", "22");
        r8.put("64", "");
    }

    public String playerContent(String str, String str2, List<String> list) throws Exception {
        String[] strArrSplit = str2.split("\\|\\|");
        String[] strArrSplit2 = strArrSplit[0].split("&");
        if (strArrSplit.length > 1) {
            str = strArrSplit[1];
        }
        HashMap map = new HashMap();
        for (String str3 : strArrSplit2) {
            String[] strArrSplit3 = str3.split("=");
            if (strArrSplit3.length == 2) {
                map.put(strArrSplit3[0].equals("vod_d_id") ? "vod_id" : strArrSplit3[0], strArrSplit3[1]);
            }
        }
        map.put("resolution", str);
        JsonObject jsonObjectM519b = m519b("/App/Resource/VurlDetail/showOne", map, 0);
        String asString = jsonObjectM519b.has("url") ? jsonObjectM519b.get("url").getAsString() : "";
        HashMap mapM5658c = C2174h.m5658c("User-Agent", "Lavf/57.83.100", "Referer", "http://WJiZxLXA2.com/");
        C2192c c2192c = new C2192c();
        c2192c.m5827u(asString);
        c2192c.m5811e((Map<String, String>) mapM5658c);
        return C2137a.addDanmaku(c2192c.toString());
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return Result.string(m524h(m519b("/App/Index/findMoreVod", C2174h.m5658c("keywords", str, "order_val", "1"), 0)));
    }
}
