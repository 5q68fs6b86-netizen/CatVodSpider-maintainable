package com.github.catvod.spider.support.p117b;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p118c.C2192c;
import com.github.catvod.spider.support.p118c.C2194e;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2269l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.P */
/* JADX INFO: loaded from: classes.dex */
public class C2155P {
    private static String vodname;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.P$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        static volatile C2155P f5116a = new C2155P();
    }

    C2155P() {
    }

    /* JADX INFO: renamed from: a */
    public static C2155P m5549a() {
        return a.f5116a;
    }

    public static String addDanmaku(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("danmaku", Proxy.getUrl() + "?do=danmu&site=wangpan");
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: f */
    private static Map<String, String> m5550f() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        map.put("Content-Type", "application/json;charset=UTF-8");
        map.put("Referer", "https://yun.139.com/");
        map.put("x-deviceinfo", "||3|12.27.0|chrome|131.0.0.0|1||windows 10|546X902|zh-CN|||");
        map.put("hcy-cool-flag", "1");
        map.put("authorization", "");
        return map;
    }

    public static List<String[]> fetchJsonData(String str, String str2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        m5553j(str, str2, "", 0, "", arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private static String m5551g(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrDoFinal;
        SecretKeySpec secretKeySpec = new SecretKeySpec("PVGDwmcvfs1uV3d1".getBytes(StandardCharsets.UTF_8), "AES");
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (obj instanceof String) {
            bArrDoFinal = cipher.doFinal(((String) obj).getBytes(StandardCharsets.UTF_8));
        } else {
            if (!(obj instanceof Object)) {
                throw new IllegalArgumentException("Unsupported data type");
            }
            bArrDoFinal = cipher.doFinal(new String(Base64.encode(obj.toString().getBytes(StandardCharsets.UTF_8), 0)).getBytes(StandardCharsets.UTF_8));
        }
        byte[] bArr2 = new byte[bArrDoFinal.length + 16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        System.arraycopy(bArrDoFinal, 0, bArr2, 16, bArrDoFinal.length);
        return Base64.encodeToString(bArr2, 0);
    }

    /* JADX INFO: renamed from: i */
    private static Map<String, String> m5552i() {
        return C2174h.m5658c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36  115Browser/26.0.7.2", "Referer", "https://yun.139.com/");
    }

    /* JADX INFO: renamed from: j */
    private static void m5553j(String str, String str2, String str3, int i, String str4, List<String[]> list) throws JSONException {
        String str5;
        StringBuilder sbM5713a = C2177k.m5713a("{\"getOutLinkInfoReq\":{\"account\":\"\",\"linkID\":\"", str2);
        if (i == 0) {
            sbM5713a.append("\",\"passwd\":\"\",\"caSrt\":1,\"coSrt\":1,\"srtDr\":0,\"bNum\":1,\"pCaID\":\"root\",\"eNum\":200}}");
        } else {
            sbM5713a.append("\",\"passwd\":\"\",\"caSrt\":1,\"coSrt\":1,\"srtDr\":0,\"bNum\":1,\"pCaID\":\"");
            sbM5713a.append(str4);
            sbM5713a.append("\",\"eNum\":200}}");
        }
        String strM6076a = C2238b.m6066f(str, m5551g(sbM5713a.toString()).replaceAll("[\\r\\n]", ""), m5550f()).m6076a();
        if (strM6076a == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(m5554k(strM6076a, "PVGDwmcvfs1uV3d1"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2.has("coLst") && !jSONObject2.isNull("coLst")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("coLst");
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                String string = jSONObject3.getString("path");
                String string2 = jSONObject3.getString("coName");
                String string3 = jSONObject3.getString("coID");
                long j = jSONObject3.getLong("coSize");
                if (C2256I.m6114i(string2)) {
                    String strM5656a = C2174h.m5656a(str2, Marker.ANY_NON_NULL_MARKER, string, Marker.ANY_NON_NULL_MARKER, string3);
                    if (j >= 1073741824) {
                        double d = 1073741824L;
                        double d2 = j;
                        Double.isNaN(d2);
                        Double.isNaN(d);
                        str5 = String.format("%.2f GB", Double.valueOf(d2 / d));
                    } else {
                        double d3 = 1048576L;
                        double d4 = j;
                        Double.isNaN(d4);
                        Double.isNaN(d3);
                        str5 = String.format("%.2f MB", Double.valueOf(d4 / d3));
                    }
                    StringBuilder sbM5396a = C2137a.m5396a("");
                    if (!str3.isEmpty()) {
                        sbM5396a.append("[");
                        sbM5396a.append(str3);
                        sbM5396a.append("]");
                    }
                    sbM5396a.append(string2);
                    sbM5396a.append("[");
                    sbM5396a.append(str5);
                    sbM5396a.append("]");
                    list.add(new String[]{strM5656a, sbM5396a.toString()});
                }
                i2 = i3 + 1;
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
        if (!jSONObject4.has("caLst") || jSONObject4.isNull("caLst")) {
            return;
        }
        JSONArray jSONArray2 = jSONObject4.getJSONArray("caLst");
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= jSONArray2.length()) {
                return;
            }
            JSONObject jSONObject5 = jSONArray2.getJSONObject(i5);
            m5553j(str, str2, jSONObject5.getString("caName"), 1, jSONObject5.getString("path"), list);
            i4 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: k */
    private static String m5554k(String str, String str2) throws Exception {
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length - 16;
        byte[] bArr = new byte[16];
        System.arraycopy(bArrDecode, 0, bArr, 0, 16);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, 16, bArr2, 0, length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(charset), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArr2), charset);
    }

    private static JSONObject makeApiRequest(String str, String str2) throws Exception {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = new JSONObject(C2238b.m6066f(str, str2, m5552i()).m6076a());
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("contentInfo")) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("contentName");
            int iLastIndexOf = strOptString.lastIndexOf(".");
            if (iLastIndexOf > -1) {
                strOptString = strOptString.substring(0, iLastIndexOf);
            }
            C2269l.m6176a("danmuvodindex", strOptString);
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX INFO: renamed from: a */
    public C2194e m5555a(String str, String str2) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObject = new JSONObject(m5554k(C2238b.m6066f("https://share-kd-njs.yun.139.com/yun-share/richlifeApp/devapp/IOutLink/getOutLinkInfoV6", m5551g(C2185u.m5754a("{\"getOutLinkInfoReq\":{\"account\":\"\",\"linkID\":\"", str, "\",\"passwd\":\"\",\"caSrt\":0,\"coSrt\":0,\"srtDr\":1,\"bNum\":1,\"pCaID\":\"root\",\"eNum\":200}}")).replaceAll("[\\r\\n]", ""), m5550f()).m6076a(), "PVGDwmcvfs1uV3d1"));
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject3 != null) {
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("caLst");
            if (jSONArrayOptJSONArray2 == null || (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(0)) == null) {
                jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("coLst");
                if (jSONArrayOptJSONArray != null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                    vodname = "移动云盘视频";
                } else {
                    String strOptString = jSONObjectOptJSONObject.optString("coName");
                    if (strOptString.isEmpty()) {
                        vodname = "移动云盘视频";
                    } else {
                        int iLastIndexOf = strOptString.lastIndexOf(46);
                        String strSubstring = iLastIndexOf != -1 ? strOptString.substring(0, iLastIndexOf) : strOptString.substring(0, iLastIndexOf);
                        if (strSubstring.isEmpty()) {
                            vodname = "移动云盘视频";
                        } else {
                            vodname = strSubstring;
                        }
                    }
                }
            } else {
                String strOptString2 = jSONObjectOptJSONObject2.optString("caName");
                if (strOptString2.isEmpty()) {
                    jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("coLst");
                    if (jSONArrayOptJSONArray != null) {
                        vodname = "移动云盘视频";
                    } else {
                        vodname = "移动云盘视频";
                    }
                } else {
                    vodname = strOptString2;
                }
            }
        }
        if (jSONObject.optInt("resultCode") != 0) {
            C2194e c2194e = new C2194e();
            C2256I.m6113i("来晚啦，该分享已失效！");
            return c2194e;
        }
        List<String[]> listFetchJsonData = fetchJsonData("https://share-kd-njs.yun.139.com/yun-share/richlifeApp/devapp/IOutLink/getOutLinkInfoV6", str);
        C2194e c2194e2 = new C2194e();
        if (listFetchJsonData.isEmpty()) {
            C2256I.m6113i("来晚啦，该分享已失效！");
            return c2194e2;
        }
        ArrayList arrayList = new ArrayList();
        for (String[] strArr : listFetchJsonData) {
            arrayList.add(strArr[1] + "$" + strArr[0]);
        }
        c2194e2.m5852n(TextUtils.join("#", arrayList));
        c2194e2.m5851m("移动普画");
        c2194e2.m5849k(vodname);
        return c2194e2;
    }

    /* JADX INFO: renamed from: q */
    public String m5556q(String[] strArr) throws JSONException {
        if (strArr == null || strArr.length < 3) {
            return "";
        }
        String str = strArr[0];
        String str2 = strArr[1];
        C2192c c2192cM5827u = new C2192c().m5827u(makeApiRequest("https://share-kd-njs.yun.139.com/yun-share/richlifeApp/devapp/IOutLink/getContentInfoFromOutLink", "{\"getContentInfoFromOutLinkReq\":{\"contentId\":\"" + strArr[2] + "\",\"linkID\":\"" + str + "\",\"account\":\"\"},\"commonAccountInfo\":{\"account\":\"\",\"accountType\":1}}").getJSONObject("data").getJSONObject("contentInfo").getString("presentURL"));
        c2192cM5827u.m5811e(m5552i());
        return addDanmaku(c2192cM5827u.toString());
    }
}
