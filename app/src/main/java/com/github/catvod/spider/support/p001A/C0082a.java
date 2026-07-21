package com.github.catvod.spider.support.p001A;
import com.github.catvod.bean.Vod;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p112R.InterfaceC2124a;
import com.github.catvod.spider.support.p112R.InterfaceC2125b;
import com.github.catvod.spider.support.p114T.C2131b;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p118c.C2190a;
import com.github.catvod.spider.support.p118c.C2192c;
import com.github.catvod.spider.support.p118c.Vod;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p139y.C2419b;
import com.github.catvod.spider.support.p139y.C2423f;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.protobuf.DescriptorProtos;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Headers;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p001A.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0082a implements InterfaceC2124a {
    /* JADX INFO: renamed from: a */
    public static int m800a(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    /* JADX INFO: renamed from: a */
    public static String m801a(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr;
        int i = 0;
        if (str == null || str.length() % 2 != 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[str.length() / 2];
            while (i < str.length()) {
                int i2 = i + 2;
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
                i = i2;
            }
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = str3.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArr), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: a */
    public static String m802a(String str, ArrayList arrayList) {
        return C2192c.m5805s(arrayList, new JSONObject(str));
    }

    /* JADX INFO: renamed from: a */
    public static String m803a(String str, Map<String, String> map) {
        Map multimap = C2238b.m6060a().newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute().headers().toMultimap();
        if (multimap == null || !multimap.containsKey("Set-Cookie")) {
            return null;
        }
        String string = "";
        for (int i = 0; i < ((List) multimap.get("Set-Cookie")).size(); i++) {
            StringBuilder sbM5396a = C2137a.m5396a(string);
            sbM5396a.append(((String) ((List) multimap.get("Set-Cookie")).get(i)).replaceAll("secure", ""));
            string = sbM5396a.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    public static String m804a(String str, Object[] objArr, StringBuilder sb) {
        sb.append(String.format(str, objArr));
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m805a(JSONObject jSONObject, String str, StringBuilder sb, String str2, String str3) {
        sb.append(jSONObject.getString(str));
        sb.append(str2);
        sb.append(jSONObject.getString(str3));
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m806a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ad */
    public static String m807ad(int i) {
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(cArr[random.nextInt(36)]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: af */
    public static String m808af(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: an */
    public static String m809an(String str, String str2, String str3) {
        try {
            str = str.replace("\\", "");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(str3.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: ao */
    public static String m810ao(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt((int) Math.floor(Math.random() * ((double) 62))));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: at */
    public static String m811at(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 2), StandardCharsets.UTF_8);
        } catch (IllegalArgumentException | Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static com.github.catvod.bean.Vod m812b(String str) {
        Vod c2194e = new Vod();
        c2194e.m5848j(str);
        return c2194e;
    }

    /* JADX INFO: renamed from: b */
    public static Object m813b(int i) {
        return DescriptorProtos.getDescriptor().getMessageTypes().get(i);
    }

    /* JADX INFO: renamed from: b */
    public static String m814b() {
        return C2192c.m5798n(new ArrayList());
    }

    /* JADX INFO: renamed from: b */
    public static String m815b(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m816b(String str, String str2) {
        try {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(bytes), 0);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m817b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable cause = th; cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
            arrayList.add(cause);
        }
        Throwable th2 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th2 != null) {
            th = th2;
        }
        int i = C2419b.f5974e;
        String strM6433a = C2419b.m6433a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(strM6433a);
        sb.append(": ");
        int i2 = C2423f.f5981a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m818b() {
        new ArrayList();
        return new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m819b(String str, String str2, String str3) {
        return new JSONObject(str).getJSONObject(str2).getJSONArray(str3);
    }

    /* JADX INFO: renamed from: b */
    public static void m820b(Runnable runnable) {
        new Thread(runnable).start();
    }

    /* JADX INFO: renamed from: b */
    public static void m821b(LinkedHashMap linkedHashMap, String str, Vod c2194e, String str2) {
        c2194e.m5851m(TextUtils.join(str, linkedHashMap.keySet()));
        c2194e.m5852n(TextUtils.join(str2, linkedHashMap.values()));
    }

    /* JADX INFO: renamed from: bo */
    public static String m822bo(String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Charset charset = StandardCharsets.UTF_8;
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(charset), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(charset));
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return Base64.encodeToString(cipher.doFinal(str.getBytes(charset)), 2);
    }

    /* JADX INFO: renamed from: c */
    public static JsonObject m823c(String str) {
        JsonElement string;
        try {
            try {
                string = JsonParser.parseString(str);
            } catch (Throwable unused) {
                string = new JsonParser().parse(str);
            }
            JsonObject asJsonObject = string.getAsJsonObject();
            return asJsonObject == null ? new JsonObject() : asJsonObject;
        } catch (Throwable unused2) {
            return new JsonObject();
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m824c(int i, String str, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: c */
    public static String m825c(String str, int i) {
        return str + i;
    }

    /* JADX INFO: renamed from: c */
    public static String m826c(String str, String str2) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode("MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGAe6hKrWLi1zQmjTT1ozbE4QdFeJGNxubxld6GrFGximxfMsMB6BpJhpcTouAqywAFppiKetUBBbXwYsYU1wNr648XVmPmCMCy4rY8vdliFnbMUj086DU6Z+/oXBdWU3/b1G0DN3E9wULRSwcKZT3wj/cCI1vsCm3gj2R5SqkA9Y0CAwEAAQKBgAJH+4CxV0/zBVcLiBCHvSANm0l7HetybTh/j2p0Y1sTXro4ALwAaCTUeqdBjWiLSo9lNwDHFyq8zX90+gNxa7c5EqcWV9FmlVXr8VhfBzcZo1nXeNdXFT7tQ2yah/odtdcx+vRMSGJd1t/5k5bDd9wAvYdIDblMAg+wiKKZ5KcdAkEA1cCakEN4NexkF5tHPRrR6XOY/XHfkqXxEhMqmNbB9U34saTJnLWIHC8IXys6Qmzz30TtzCjuOqKRRy+FMM4TdwJBAJQZFPjsGC+RqcG5UvVMiMPhnwe/bXEehShK86yJK/g/UiKrO87h3aEu5gcJqBygTq3BBBoH2md3pr/W+hUMWBsCQQChfhTIrdDinKi6lRxrdBnn0Ohjg2cwuqK5zzU9p/N+S9x7Ck8wUI53DKm8jUJE8WAG7WLj/oCOWEh+ic6NIwTdAkEAj0X8nhx6AXsgCYRql1klbqtVmL8+95KZK7PnLWG/IfjQUy3pPGoSaZ7fdquG8bq8oyf5+dzjE/oTXcByS+6XRQJAP/5ciy1bL3NhUhsaOVy55MHXnPjdcTX0FaLi+ybXZIfIQ2P4rb19mVq1feMbCXhz+L1rG8oat5lYKfpe8k83ZA==", 2)));
        Cipher cipher = Cipher.getInstance(str2);
        cipher.init(2, privateKeyGeneratePrivate);
        return new String(cipher.doFinal(Base64.decode(str, 2)), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m827c(String str, String str2) {
        return new JSONObject(str).getJSONArray(str2);
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m828c(String str, String str2) {
        return new JSONObject(str).getJSONObject(str2);
    }

    /* JADX INFO: renamed from: d */
    public static String m829d(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: d */
    public static String m830d(ArrayList arrayList, int i, int i2, int i3, int i4) {
        C2192c c2192c = new C2192c();
        c2192c.m5829w(arrayList);
        c2192c.m5817i(i, i2, i3, i4);
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m831d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new String(bArr);
    }

    /* JADX INFO: renamed from: e */
    public static String m832e(String str, String str2) {
        return new JSONObject(str).getString(str2);
    }

    /* JADX INFO: renamed from: e */
    public static StringBuilder m833e(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: f */
    public static StringBuilder m834f(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: f */
    public static StringBuilder m835f(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        StringBuilder sb2 = new StringBuilder(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    /* JADX INFO: renamed from: g */
    public static String m836g(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: h */
    public static String m837h(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m838h(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str2 = "AES/" + str + "/PKCS5Padding";
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance(str2);
        if (str2.toUpperCase().contains("/ECB/")) {
            cipher.init(1, secretKeySpec);
        } else {
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
        }
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: i */
    public static String m839i(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m840j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{}";
        }
        String strTrim = str.trim();
        if (!strTrim.startsWith("{") && !strTrim.startsWith("http")) {
            try {
                byte[] bArrDecode = Base64.decode(strTrim, 2);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, new SecretKeySpec("CatVodAppGet2024".getBytes("UTF-8"), "AES"), new IvParameterSpec("SpiderExtConfig!".getBytes("UTF-8")));
                return new String(cipher.doFinal(bArrDecode), "UTF-8");
            } catch (Exception unused) {
            }
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: j */
    public static String m841j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m842j(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        return m846q(bArr, bArr2, bArr3, "AES", "AES/" + str + "/PKCS5Padding");
    }

    /* JADX INFO: renamed from: k */
    public static String m843k(Object obj) {
        return new Gson().toJson(obj);
    }

    /* JADX INFO: renamed from: m */
    public static String m844m(String str, String str2, String str3) {
        byte[] bArrDecode = Base64.decode(str, 2);
        Charset charset = StandardCharsets.UTF_8;
        return new String(m842j(bArrDecode, str2.getBytes(charset), str3.getBytes(charset), "CBC"), charset);
    }

    /* JADX INFO: renamed from: p */
    public static void m845p(LinkedHashMap linkedHashMap, String str, Vod c2194e, String str2) {
        c2194e.m5851m(TextUtils.join(str, linkedHashMap.keySet()));
        c2194e.m5852n(TextUtils.join(str2, linkedHashMap.values()));
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m846q(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
        Cipher cipher = Cipher.getInstance(str2);
        if (str2.toUpperCase().contains("/ECB/")) {
            cipher.init(2, secretKeySpec);
        } else {
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
        }
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: r */
    public static void m847r(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        SpiderDebug.log(sb.toString());
    }

    /* JADX INFO: renamed from: s */
    public static void m848s(String str, String str2, String str3, ArrayList arrayList) {
        arrayList.add(new C2190a(str, str2, str3));
    }

    /* JADX INFO: renamed from: z */
    public static C2192c m849z(String str) {
        C2192c c2192c = new C2192c();
        c2192c.m5830w(str);
        return c2192c;
    }

    @Override // com.github.catvod.spider.support.p112R.InterfaceC2124a
    /* JADX INFO: renamed from: a */
    public InterfaceC2125b mo850a(String str) {
        return C2131b.f4989a;
    }
}
