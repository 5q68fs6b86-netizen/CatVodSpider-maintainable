package com.github.catvod.spider;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p117b.C2174h;
import com.github.catvod.spider.support.p116a.C2137a;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.bean.Class;
import com.github.catvod.spider.support.p118c.C2191b;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.zip.Inflater;
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
public class App99 extends Spider {

    /* JADX INFO: renamed from: a */
    private String f52a = "";

    /* JADX INFO: renamed from: b */
    private String f53b = "";

    /* JADX INFO: renamed from: c */
    private String f54c = "";

    /* JADX INFO: renamed from: d */
    private String f55d = "";

    /* JADX INFO: renamed from: e */
    private String f56e = "";

    /* JADX INFO: renamed from: f */
    private String f57f = "";

    /* JADX INFO: renamed from: g */
    private HashMap f58g = new HashMap();

    public App99() {
        new HashMap();
    }

    /* JADX INFO: renamed from: a */
    private List<C2191b.a> m397a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new C2191b.a(strOptString, strOptString));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private List<Vod> m398b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Vod c2194e = new Vod();
            c2194e.m5848j(jSONObject.optString("id"));
            c2194e.m5849k(jSONObject.optString("name"));
            c2194e.m5850l(jSONObject.optString("pic"));
            c2194e.m5853o(jSONObject.optString("remarks"));
            c2194e.m5855q(jSONObject.optString("year"));
            c2194e.m5846h(jSONObject.optString("blurb"));
            c2194e.m5842e(jSONObject.optString("class"));
            c2194e.m5845g(jSONObject.optString("area"));
            c2194e.m5843f(jSONObject.optString("actor"));
            c2194e.m5847i(jSONObject.optString("director"));
            arrayList.add(c2194e);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private String m399c(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f54c;
        }
        byte[] bArrDecode = Base64.getDecoder().decode(str);
        byte[] bArr = new byte[16];
        int length = bArrDecode.length - 16;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr, 0, 16);
        System.arraycopy(bArrDecode, 16, bArr2, 0, length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.replace("-", "").getBytes("UTF-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr));
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        try {
            Inflater inflater = new Inflater();
            inflater.setInput(bArrDoFinal);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArrDoFinal.length);
            byte[] bArr3 = new byte[1024];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr3, 0, inflater.inflate(bArr3));
            }
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString("UTF-8");
        } catch (Exception unused) {
            return new String(bArrDoFinal, "UTF-8");
        }
    }

    /* JADX INFO: renamed from: d */
    private String m400d(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String str2 = TextUtils.isEmpty("") ? this.f54c : "";
        byte[] bytes = str.getBytes("UTF-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.replace("-", "").getBytes("UTF-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec);
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        byte[] iv = cipher.getIV();
        byte[] bArr = new byte[iv.length + bArrDoFinal.length];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(bArrDoFinal, 0, bArr, iv.length, bArrDoFinal.length);
        return Base64.getEncoder().encodeToString(bArr);
    }

    /* JADX INFO: renamed from: e */
    private String m401e() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return Base64.getEncoder().encodeToString(bArr);
    }

    /* JADX INFO: renamed from: f */
    private Map<String, String> m402f() {
        HashMap map = new HashMap();
        map.put("User-Agent", this.f55d);
        map.put("Accept", "application/json");
        map.put("Content-Type", "application/json");
        map.put("client_type", "android");
        return map;
    }

    /* JADX INFO: renamed from: g */
    private Map<String, String> m403g(String str, String str2, String str3) {
        String string;
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(String.format("%s:%s:%s:%s:%s", str3, str2, str, this.f53b, this.f56e).getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            string = sb.toString();
        } catch (Exception unused) {
            string = "";
        }
        Map<String, String> mapM402f = m402f();
        HashMap map = (HashMap) mapM402f;
        map.put("uuid", this.f54c);
        map.put("timestamp", str2);
        map.put("sign", string);
        map.put("nonce", str);
        map.put("appkey", this.f56e);
        map.put("version", this.f57f);
        map.put("api_version", "v1");
        return mapM402f;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String strM401e = m401e();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        if (map != null && map.containsKey("class")) {
            map.get("class");
        }
        if (map != null && map.containsKey("area")) {
            map.get("area");
        }
        if (map != null && map.containsKey("lang")) {
            map.get("lang");
        }
        if (map != null && map.containsKey("year")) {
            map.get("year");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("kw", "");
        jSONObject.put("page", str2);
        jSONObject.put("limit", 21);
        jSONObject.put("pid", str);
        jSONObject.put("orderBy", "time");
        jSONObject.put("isCategory", 1);
        jSONObject.put("token", this.f53b);
        jSONObject.put("timestamp", strValueOf);
        jSONObject.put("nonce", strM401e);
        String strM400d = m400d(jSONObject.toString());
        String strM6076a = C2238b.m6066f(C2174h.m5657b(new StringBuilder(), this.f52a, "/vod/search"), strM400d, m403g(strM401e, strValueOf, strM400d)).m6076a();
        if (!TextUtils.isEmpty(strM6076a)) {
            JSONObject jSONObject2 = new JSONObject(m399c(strM6076a, this.f54c));
            if (jSONObject2.has("data")) {
                List<Vod> listM398b = m398b(jSONObject2.getJSONArray("data"));
                int iOptInt = jSONObject2.optInt("page_count", 1);
                C2192c c2192c = new C2192c();
                c2192c.m5817i(Integer.parseInt(str2), iOptInt, 0, 0);
                c2192c.m5829w(listM398b);
                return c2192c.toString();
            }
        }
        return C2192c.r(new ArrayList());
    }

    public String detailContent(List<String> list) {
        String str = "\\D+";
        String str2 = "1";
        Vod c2194e = new Vod();
        try {
            HashMap map = new HashMap();
            if (this.f58g.containsKey("player")) {
                JSONObject jSONObject = (JSONObject) this.f58g.get("player");
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(itKeys.next());
                    map.put(jSONObject2.optString("code").trim(), jSONObject2.optString("name").trim());
                }
            }
            String strM401e = m401e();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", list.get(0));
            jSONObject3.put("eps", "1");
            jSONObject3.put("v", "2.0.0");
            jSONObject3.put("pl", 1);
            jSONObject3.put("token", this.f53b);
            jSONObject3.put("timestamp", strValueOf);
            jSONObject3.put("nonce", strM401e);
            String strM400d = m400d(jSONObject3.toString());
            JSONObject jSONObject4 = new JSONObject(m399c(C2238b.m6066f(this.f52a + "/vod/detail", strM400d, m403g(strM401e, strValueOf, strM400d)).m6076a(), this.f54c));
            if (jSONObject4.has("data")) {
                JSONObject jSONObject5 = jSONObject4.getJSONObject("data");
                c2194e.m5848j(jSONObject5.optString("id"));
                c2194e.m5849k(jSONObject5.optString("name"));
                c2194e.m5850l(jSONObject5.optString("pic"));
                c2194e.m5853o(jSONObject5.optString("remarks"));
                c2194e.m5855q(jSONObject5.optString("year"));
                c2194e.m5845g(jSONObject5.optString("area"));
                c2194e.m5843f(jSONObject5.optString("actor"));
                c2194e.m5847i(jSONObject5.optString("director"));
                c2194e.m5846h(jSONObject5.optString("content"));
                c2194e.m5842e(jSONObject5.optString("class"));
                String strOptString = jSONObject5.optString("name");
                String[] strArrSplit = jSONObject5.optString("play_from").split("\\$\\$\\$");
                String[] strArrSplit2 = jSONObject5.optString("play_url").split("\\$\\$\\$");
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (String str3 : strArrSplit) {
                    String str4 = (String) map.get(str3);
                    if (str4 != null) {
                        sb.append(str4);
                    } else {
                        sb.append(str3);
                    }
                    sb.append("$$$");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 3, sb.length());
                }
                int i = 0;
                while (i < strArrSplit2.length) {
                    String str5 = i < strArrSplit.length ? strArrSplit[i] : "";
                    String[] strArrSplit3 = strArrSplit2[i].split("#");
                    StringBuilder sb3 = new StringBuilder();
                    String[] strArr = strArrSplit2;
                    String str6 = str2;
                    int i2 = 0;
                    while (i2 < strArrSplit3.length) {
                        String[] strArr2 = strArrSplit;
                        String[] strArrSplit4 = strArrSplit3[i2].split("\\$");
                        String[] strArr3 = strArrSplit3;
                        String str7 = strArrSplit4[0];
                        String str8 = str;
                        String str9 = str7 + "$" + strArrSplit4[1] + "@" + str5 + "@" + strOptString + "@" + (str7.replaceAll(str, "").isEmpty() ? str6 : str7.replaceAll(str, ""));
                        if (sb3.length() > 0) {
                            sb3.append("#");
                        }
                        sb3.append(str9);
                        i2++;
                        strArrSplit3 = strArr3;
                        strArrSplit = strArr2;
                        str = str8;
                    }
                    String str10 = str;
                    String[] strArr4 = strArrSplit;
                    if (sb2.length() > 0 && sb3.length() > 0) {
                        sb2.append("$$$");
                    }
                    sb2.append((CharSequence) sb3);
                    i++;
                    strArrSplit2 = strArr;
                    str2 = str6;
                    strArrSplit = strArr4;
                    str = str10;
                }
                c2194e.m5851m(sb.toString());
                c2194e.m5852n(sb2.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String strM5795m = Result.string(c2194e);
        C2137a.parseJsonAndSave(strM5795m);
        return strM5795m;
    }

    public String homeContent(boolean z) {
        String str = "class";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        try {
            if (this.f58g.containsKey("categories")) {
                JSONArray jSONArray = (JSONArray) this.f58g.get("categories");
                int i = 0;
                while (i < jSONArray.length()) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String strOptString = jSONObject.optString("id");
                    arrayList.add(new Class(strOptString, jSONObject.optString("name")));
                    ArrayList arrayList2 = new ArrayList();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("type_extend");
                    if (jSONObjectOptJSONObject != null) {
                        arrayList2.add(new C2191b(str, "类型", m397a(jSONObjectOptJSONObject.optJSONArray(str))));
                        arrayList2.add(new C2191b("area", "地区", m397a(jSONObjectOptJSONObject.optJSONArray("areas"))));
                        arrayList2.add(new C2191b("lang", "语言", m397a(jSONObjectOptJSONObject.optJSONArray("lang"))));
                        arrayList2.add(new C2191b("year", "年份", m397a(jSONObjectOptJSONObject.optJSONArray("years"))));
                    }
                    linkedHashMap.put(strOptString, arrayList2);
                    i++;
                    str = str;
                }
            }
            String strM401e = m401e();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("kw", "");
            jSONObject2.put("page", "1");
            jSONObject2.put("limit", 21);
            jSONObject2.put("pid", "1");
            jSONObject2.put("orderBy", "time");
            jSONObject2.put("isCategory", 1);
            jSONObject2.put("token", "");
            jSONObject2.put("timestamp", strValueOf);
            jSONObject2.put("nonce", strM401e);
            String strM400d = m400d(jSONObject2.toString());
            JSONObject jSONObject3 = new JSONObject(m399c(C2238b.m6066f(this.f52a + "/vod/search", strM400d, m403g(strM401e, strValueOf, strM400d)).m6076a(), this.f54c));
            if (jSONObject3.has("data")) {
                return C2192c.m5802q((List<Class>) arrayList, m398b(jSONObject3.getJSONArray("data")), (LinkedHashMap<String, List<C2191b>>) linkedHashMap);
            }
        } catch (Exception unused) {
        }
        return Result.string(arrayList, new ArrayList());
    }

    public void init(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("host");
            this.f56e = jSONObject.optString("appkey");
            String strOptString2 = jSONObject.optString("name");
            String strOptString3 = jSONObject.optString("buildSignature");
            String strOptString4 = jSONObject.optString("buildNumber");
            String strOptString5 = jSONObject.optString("versionName");
            String strOptString6 = jSONObject.optString("package");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(this.f56e) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3) || TextUtils.isEmpty(strOptString4) || TextUtils.isEmpty(strOptString5) || TextUtils.isEmpty(strOptString6)) {
                return;
            }
            this.f52a = strOptString;
            this.f54c = jSONObject.optString("uuid", UUID.randomUUID().toString());
            this.f55d = jSONObject.optString("ua", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.6299.95 Safari/537.36");
            this.f57f = jSONObject.optString("version", strOptString5);
            String strOptString7 = jSONObject.optString("LoginPath", "/app/userInfo");
            String strM401e = m401e();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("v", strOptString5);
            jSONObject2.put("n", strOptString2);
            jSONObject2.put("s", strOptString3);
            jSONObject2.put("pl", "1");
            jSONObject2.put("apiVersion", "v2");
            jSONObject2.put("token", "");
            jSONObject2.put("timestamp", strValueOf);
            jSONObject2.put("nonce", strM401e);
            String strM400d = m400d(jSONObject2.toString());
            String strM6076a = C2238b.m6066f(this.f52a + "/app/systemInit", strM400d, m403g(strM401e, strValueOf, strM400d)).m6076a();
            if (!TextUtils.isEmpty(strM6076a)) {
                String strM399c = m399c(strM6076a, this.f54c);
                if (!TextUtils.isEmpty(strM399c)) {
                    JSONObject jSONObject3 = new JSONObject(strM399c);
                    if (jSONObject3.has("player")) {
                        this.f58g.put("player", jSONObject3.getJSONObject("player"));
                    }
                    if (jSONObject3.has("parser_api")) {
                        this.f58g.put("parses", jSONObject3.getJSONArray("parser_api"));
                    }
                    if (jSONObject3.has("categorys")) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("categorys");
                        if (jSONObject4.has("data")) {
                            this.f58g.put("categories", jSONObject4.getJSONArray("data"));
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(this.f53b)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String string = UUID.randomUUID().toString();
                String strM401e2 = m401e();
                String strValueOf2 = String.valueOf(System.currentTimeMillis());
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("os", "android");
                jSONObject5.put("name", "xiaomi");
                jSONObject5.put("version", "15");
                jSONObject5.put("sdkInt", 32);
                jSONObject5.put("device", "xiaomi");
                jSONObject5.put("brand", "xiaomi");
                jSONObject5.put("manufacturer", "xiaomi");
                jSONObject5.put("product", "b0q");
                jSONObject5.put("hardware", "xiaomi");
                jSONObject5.put("isPhysicalDevice", true);
                jSONObject5.put("androidId", "V417IR");
                jSONObject5.put("bootloader", "unknown");
                jSONObject5.put("display", "V417IR release-keys");
                jSONObject5.put("host", "a11-gz01-test");
                jSONObject5.put("tags", "release-keys");
                jSONObject5.put("type", "user");
                jSONObject5.put("finger", "xiaomi/b0q/b0q:15/V619IR/613:user/release-keys");
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("version", strOptString5);
                jSONObject6.put("name", strOptString2);
                jSONObject6.put("package", strOptString6);
                jSONObject6.put("buildNumber", strOptString4);
                jSONObject6.put("buildSignature", strOptString3);
                jSONObject6.put("install", jCurrentTimeMillis);
                jSONObject6.put("update", jCurrentTimeMillis);
                jSONObject5.put("app", jSONObject6);
                jSONObject5.put("did", string);
                jSONObject5.put("apiVersion", "v2");
                jSONObject5.put("channel", "");
                jSONObject5.put("token", "");
                jSONObject5.put("timestamp", strValueOf2);
                jSONObject5.put("nonce", strM401e2);
                String strM400d2 = m400d(jSONObject5.toString());
                String strM6076a2 = C2238b.m6066f(this.f52a + strOptString7, strM400d2, m403g(strM401e2, strValueOf2, strM400d2)).m6076a();
                if (TextUtils.isEmpty(strM6076a2)) {
                    return;
                }
                String strM399c2 = m399c(strM6076a2, this.f54c);
                if (TextUtils.isEmpty(strM399c2)) {
                    return;
                }
                JSONObject jSONObject7 = new JSONObject(strM399c2);
                if (jSONObject7.has("userInfo")) {
                    JSONObject jSONObject8 = jSONObject7.getJSONObject("userInfo");
                    if (jSONObject8.has("user_token")) {
                        this.f53b = jSONObject8.optString("user_token");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x012e A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00ae, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public String playerContent(String str, String str2, List<String> list) throws JSONException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String strM6076a;
        String strOptString;
        boolean z;
        try {
            String[] strArrSplit = str2.split("@");
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String str5 = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArrSplit[2].trim() + "&vodIndex=" + strArrSplit[3].trim() + "&vodUrl=";
            JSONObject jSONObject = ((JSONObject) this.f58g.get("player")).getJSONObject(str4);
            if (jSONObject.optInt("type") != 0) {
                if (this.f58g.containsKey("parses")) {
                    JSONArray jSONArray = (JSONArray) this.f58g.get("parses");
                    String strOptString2 = jSONObject.optString("parseUrl", "");
                    String[] strArrSplit2 = TextUtils.isEmpty(strOptString2) ? new String[0] : strOptString2.split(",");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strValueOf = String.valueOf(jSONObject2.optInt("id"));
                        if (strArrSplit2.length > 0) {
                            int length = strArrSplit2.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = false;
                                    break;
                                }
                                if (strValueOf.equals(strArrSplit2[i2])) {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            if (z) {
                                int i3 = jSONObject2.getInt("id");
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("id", i3);
                                jSONObject3.put("url", str3);
                                jSONObject3.put("token", this.f53b);
                                String strM401e = m401e();
                                String strValueOf2 = String.valueOf(System.currentTimeMillis());
                                jSONObject3.put("timestamp", strValueOf2);
                                jSONObject3.put("nonce", strM401e);
                                String strM400d = m400d(jSONObject3.toString());
                                strM6076a = C2238b.m6066f(this.f52a + "/app/vodParser", strM400d, m403g(strM401e, strValueOf2, strM400d)).m6076a();
                                if (TextUtils.isEmpty(strM6076a)) {
                                    continue;
                                } else {
                                    strOptString = new JSONObject(m399c(strM6076a, this.f54c)).optString("data");
                                    if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("http")) {
                                        str3 = strOptString;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            int i4 = jSONObject2.getInt("id");
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("id", i4);
                            jSONObject4.put("url", str3);
                            jSONObject4.put("token", this.f53b);
                            String strM401e2 = m401e();
                            String strValueOf3 = String.valueOf(System.currentTimeMillis());
                            jSONObject4.put("timestamp", strValueOf3);
                            jSONObject4.put("nonce", strM401e2);
                            String strM400d2 = m400d(jSONObject4.toString());
                            strM6076a = C2238b.m6066f(this.f52a + "/app/vodParser", strM400d2, m403g(strM401e2, strValueOf3, strM400d2)).m6076a();
                            if (TextUtils.isEmpty(strM6076a)) {
                                strOptString = new JSONObject(m399c(strM6076a, this.f54c)).optString("data");
                                if (!TextUtils.isEmpty(strOptString)) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    str3 = "";
                } else {
                    str3 = "";
                }
            }
            C2192c c2192c = new C2192c();
            c2192c.m5827u(str3);
            c2192c.m5806a(str5);
            return c2192c.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return C2192c.m5797n("播放链接解析失败,请更换其他源播放");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0085  */
    public String searchContent(String str, boolean z) throws JSONException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        List<Vod> arrayList;
        String strM401e = m401e();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("kw", str);
        jSONObject.put("page", 1);
        jSONObject.put("limit", 21);
        jSONObject.put("orderBy", "vod_hits_month");
        jSONObject.put("sort", "desc");
        jSONObject.put("token", this.f53b);
        jSONObject.put("timestamp", strValueOf);
        jSONObject.put("nonce", strM401e);
        String strM400d = m400d(jSONObject.toString());
        String strM6076a = C2238b.m6066f(C2174h.m5657b(new StringBuilder(), this.f52a, "/vod/search"), strM400d, m403g(strM401e, strValueOf, strM400d)).m6076a();
        if (TextUtils.isEmpty(strM6076a)) {
            arrayList = new ArrayList<>();
        } else {
            JSONObject jSONObject2 = new JSONObject(m399c(strM6076a, this.f54c));
            if (jSONObject2.has("data")) {
                arrayList = m398b(jSONObject2.getJSONArray("data"));
            } else {
                arrayList = new ArrayList<>();
            }
        }
        return Result.string(arrayList);
    }
}
