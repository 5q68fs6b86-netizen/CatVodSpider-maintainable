package com.github.catvod.spider.support.p117b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p118c.C2192c;
import com.github.catvod.spider.support.p118c.C2194e;
import com.github.catvod.spider.support.p120e.C2210a;
import com.github.catvod.spider.support.p120e.C2211b;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p126k.C2240d;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2268k;
import com.github.catvod.spider.support.p128m.C2269l;
import com.github.catvod.spider.support.p139y.C2423f;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2176j {
    private static Map<String, String> bdclndMap;
    private static String cookie;

    /* JADX INFO: renamed from: d */
    private static Bitmap f5208d;

    /* JADX INFO: renamed from: e */
    private static String f5209e;
    private static Map<String, List<Long>> shareFsIdMap;
    private static Map<String, String> ukMap;

    /* JADX INFO: renamed from: aa */
    private static final String[] f5207aa = {"V2238A", "V2148A", "V2024A", "V1938A", "V1831A", "V1829A", "V1809A", "V1732A", "V2056A", "V2072A", "V2085A", "V2196A", "V2166BA", "V2217A", "V2243A", "SM-G9980", "SM-G9750", "SM-N9860", "SM-G7810", "SM-G9910", "SM-F7110", "SM-S9080", "SM-F9260", "SM-M2250", "SM-A5360", "SM-A3260", "SM-A715F", "SM-T735C", "SM-T505C", "SM-X700", "SM-X800", "M2102K1AC", "M2007J3SC", "M2012K11AC", "M2104K10AC", "M2103K19C", "2201122C", "2203121C", "2207122MC", "2210132C", "22127RK46C", "2107119DC", "2112123AC", "22041216C", "22081212C", "23013RK75C", "PDKM00", "PEXM00", "PCLM50", "PDSM00", "PEMM00", "PFDM00", "PGFM10", "PHJ110", "PJA110", "PJT110", "PKD110", "CPH2381", "CPH2451", "CPH2411", "CPH2521", "CPH2201", "VCE-AL00", "OXF-AN10", "LIO-AL00", "ELS-AN00", "JAD-AL50", "NOH-AN00", "NOH-AL10", "LIO-AL00", "TAS-AL00", "EVR-AL00", "MAR-AL00", "ANA-AN00", "JNY-AL10", "CDY-AN90", "DVC-AN20", "RMX2202", "RMX3366", "RMX3370", "RMX3310", "RMX3350", "RMX3461", "RMX3560", "RMX3708", "RMX2111", "RMX3125", "LE2120", "LE2110", "LE2100", "LE2117", "LE2125", "NE2210", "NE2215", "NE2217", "GM1910", "GM1900", "22041216UC", "22071212AC", "22101316C", "22101316U", "22127RK46C", "2304FPN6DC", "23049RAD8C", "23078RKD5C", "21091116AC", "21091116UC", "LSA-AN00", "TNA-AN00", "HJC-AN90", "FNE-AN00", "ANY-AN00", "TEL-AN00", "TEL-AN10", "TNY-AL00", "TNY-AN00", "LGE-AN00", "NX669J", "NX709S", "2109119BC", "22101316G", "XT2153-1", "XT2175-2", "A2633", "A2487", "KG5", "KG5K"};

    /* JADX INFO: renamed from: z */
    private static final Random f5210z = new Random();

    /* JADX INFO: renamed from: a */
    private String f5211a = "";

    /* JADX INFO: renamed from: b */
    private String f5212b = "";
    private String randsk = "";

    /* JADX INFO: renamed from: uk */
    private String f5215uk = "";
    private String shareIdLong = "";
    private String randomFsId = "";

    /* JADX INFO: renamed from: to */
    private String f5214to = "";

    /* JADX INFO: renamed from: c */
    private HashMap f5213c = new HashMap();

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.j$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static volatile C2176j f5216a = new C2176j();
    }

    /* JADX INFO: renamed from: a */
    private String m5686a(String str, boolean z) {
        m5687b(true);
        boolean z2 = false;
        String key = "";
        String str2 = key;
        String str3 = str2;
        Map<String, List<Long>> map = shareFsIdMap;
        if (map != null) {
            loop0: for (Map.Entry<String, List<Long>> entry : map.entrySet()) {
                List<Long> value = entry.getValue();
                if (value != null) {
                    Iterator<Long> it = value.iterator();
                    while (it.hasNext()) {
                        if (it.next().toString().equals(str)) {
                            key = entry.getKey();
                            str2 = bdclndMap.get(key);
                            str3 = ukMap.get(key);
                            z2 = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://pan.baidu.com/share/transfer?shareid=");
        if (!z2) {
            key = (String) this.f5213c.get("shareid");
        }
        sb.append(key);
        sb.append("&from=");
        sb.append(!z2 ? (String) this.f5213c.get("uk") : str3);
        sb.append("&sekey=");
        sb.append(!z2 ? (String) this.f5213c.get("sekey") : str2);
        sb.append("&ondup=newcopy&async=1&channel=chunlei&web=1&app_id=250528");
        String string = sb.toString();
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        map2.put("fsidlist", arrayList.toString());
        map2.put("path", m5702k());
        JSONObject jSONObject = new JSONObject(C2238b.m6067g(string, map2, m5690g()).m6076a());
        if (jSONObject.optInt("errno") != 0) {
            return "";
        }
        String strOptString = jSONObject.optJSONObject("extra").optJSONArray("list").optJSONObject(0).optString("to");
        return (TextUtils.isEmpty(strOptString) && z) ? m5686a(str, false) : strOptString;
    }

    /* JADX INFO: renamed from: b */
    private boolean m5687b(boolean z) {
        try {
            String strM6164a = C2268k.m6164a(C2268k.m6166b("/baidu_fsid.txt"));
            if (TextUtils.isEmpty(strM6164a)) {
                return true;
            }
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(strM6164a);
            map.put("filelist", new JSONArray((Collection) arrayList).toString());
            if (TextUtils.isEmpty(new JSONObject(C2238b.m6067g("https://pan.baidu.com/api/filemanager?async=2&onnest=fail&opera=delete&bdstoken=", map, m5690g()).m6076a()).optString("taskid")) && z) {
                return m5687b(false);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m5688c(String str, String str2, String str3, String str4, List<C2210a> list) {
        try {
            String str5 = "https://pan.baidu.com/share/list?is_from_web=true&sekey=" + str + "&uk=" + str2 + "&shareid=" + str3 + "&order=name&desc=1&showempty=0&view_mode=1&web=1&page=1&num=100&dir=" + URLEncoder.encode(str4) + "&t=0.6675001943649936&channel=chunlei&web=1&app_id=250528&bdstoken=";
            Map<String, String> mapM5690g = m5690g();
            ((HashMap) mapM5690g).put("Cookie", "BDCLND=" + str);
            String strM6073l = C2238b.m6073l(str5, mapM5690g);
            parseAndStoreShareInfo(strM6073l, str);
            C2211b c2211bM5938e = C2211b.m5938e(strM6073l);
            if (c2211bM5938e.m5939a() == 0) {
                List<C2210a> listM5940b = c2211bM5938e.m5940b();
                ArrayList arrayList = new ArrayList();
                for (C2210a c2210a : listM5940b) {
                    if (c2210a.m5937f()) {
                        SpiderDebug.log(c2210a.toString());
                        list.add(c2210a);
                    } else if (c2210a.m5931b() == 1) {
                        arrayList.add(c2210a);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m5688c(str, str2, str3, ((C2210a) it.next()).m5932c(), list);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String extractLastPart(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        int length = strArrSplit.length;
        if (3 >= 3) {
            return strArrSplit[strArrSplit.length - 1];
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C2176j m5689f() {
        return a.f5216a;
    }

    /* JADX INFO: renamed from: g */
    private Map<String, String> m5690g() {
        HashMap mapM5658c = C2174h.m5658c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36 Edg/134.0.0.0", "Accept", "application/json;charset=UTF-8");
        mapM5658c.put("Cookie", m5701j());
        mapM5658c.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        mapM5658c.put("Referer", "https://pan.baidu.com");
        return mapM5658c;
    }

    private String getVideoUrl(String str) {
        String strEncode;
        JSONObject jSONObjectOptJSONObject;
        String key = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        Map<String, List<Long>> map = shareFsIdMap;
        if (map == null) {
            return "";
        }
        loop0: for (Map.Entry<String, List<Long>> entry : map.entrySet()) {
            List<Long> value = entry.getValue();
            if (value != null) {
                Iterator<Long> it = value.iterator();
                while (it.hasNext()) {
                    if (it.next().toString().equals(str)) {
                        key = entry.getKey();
                        str2 = bdclndMap.get(key);
                        str3 = ukMap.get(key);
                        z = true;
                        break loop0;
                    }
                }
            }
        }
        if (!z) {
            return "";
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        Matcher matcher = Pattern.compile("BDUSS=([^;]+)").matcher(m5701j());
        matcher.find();
        String strGroup = matcher.group(1);
        String strM5703l = m5703l();
        String strM839i = C0082a.m839i(C0082a.m839i(strGroup) + strM5703l + "ebrcUYiuxaZv2XGu7KIYKxUrqfnOfpDF" + strValueOf + "73CED981D0F186D12BC18CAE1684FFD5|VSRCQTF6W11.30.2ae5821440fab5e1a61a025f014bd8972");
        try {
            strEncode = URLEncoder.encode("73CED981D0F186D12BC18CAE1684FFD5|VSRCQTF6W", "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            strEncode = "73CED981D0F186D12BC18CAE1684FFD5|VSRCQTF6W";
        }
        String str4 = "https://pan.baidu.com/share/list?shareid=" + key + "&uk=" + str3 + "&fid=" + str + "&sekey=" + str2 + "&origin=dlna&devuid=" + strEncode + "&clienttype=1&channel=android_12_zhao_bd-netdisk_1024266h&version=11.30.2&time=" + strValueOf + "&rand=" + strM839i;
        Map<String, String> mapM5712x = m5712x();
        JSONObject jSONObject = new JSONObject(C2238b.m6073l(str4, mapM5712x));
        SpiderDebug.log(jSONObject.toString());
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
        if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            return "";
        }
        String strM6062b = C2238b.m6062b(jSONObjectOptJSONObject.optString("dlink"), mapM5712x);
        C2269l.m6176a("danmuvodindex", jSONObjectOptJSONObject.optString("server_filename"));
        return strM6062b;
    }

    /* JADX INFO: renamed from: h */
    private Map<String, String> m5691h() {
        HashMap map = new HashMap();
        map.put("Referer", "https://pan.baidu.com");
        map.put("Cookie", m5701j());
        map.put("User-Agent", "netdisk;12.11.9;V2238A;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
        return map;
    }

    /* JADX INFO: renamed from: i */
    private Map<String, String> m5692i() {
        HashMap map = new HashMap();
        map.put("Referer", "https://pan.baidu.com");
        map.put("Cookie", m5701j());
        map.put("User-Agent", "netdisk;P2SP;2.2.91.136;android-android;");
        return map;
    }

    /* JADX INFO: renamed from: m */
    private String m5693m(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(str.split("/+")));
                    boolean z = !arrayList.isEmpty() && ((String) arrayList.get(0)).isEmpty();
                    if (arrayList.isEmpty()) {
                        return "";
                    }
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        arrayList.remove(size);
                    }
                    if (z && arrayList.size() == 1 && ((String) arrayList.get(0)).isEmpty()) {
                        return "/";
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb.append((CharSequence) "/");
                        }
                    }
                    String string = sb.toString();
                    return (z && string.isEmpty()) ? "/" : string;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m5694o() {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            map.put("Referer", "https://pan.baidu.com/");
            JSONObject jSONObject = new JSONObject(C2238b.m6073l("https://passport.baidu.com/v2/api/getqrcode?lp=pc&qrloginfrom=pc", map));
            SpiderDebug.log(jSONObject.toString());
            String str = "https://" + jSONObject.optString("imgurl") + "&logPage=traceId%3Apc_loginv5_1742970205%2ClogPage%3Aloginv5";
            SpiderDebug.log(str);
            f5209e = jSONObject.optString("sign");
            byte[] bArrBytes = C2238b.m6063c(str).body().bytes();
            f5208d = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length);
            return !TextUtils.isEmpty(f5209e);
        } catch (Exception unused) {
            return false;
        }
    }

    private static void parseAndStoreShareInfo(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("share_id");
        String strOptString2 = jSONObject.optString("uk");
        if (bdclndMap == null) {
            bdclndMap = new HashMap();
        }
        if (ukMap == null) {
            ukMap = new HashMap();
        }
        Map<String, String> map = bdclndMap;
        String str3 = map.get(strOptString);
        if (str3 == null || !str3.equals(str2)) {
            map.put(strOptString, str2);
        }
        Map<String, String> map2 = ukMap;
        String str4 = map2.get(strOptString);
        if (str4 == null || !str4.equals(strOptString2)) {
            map2.put(strOptString, strOptString2);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    storeShareFsId(strOptString, Long.valueOf(jSONObjectOptJSONObject.optLong("fs_id")));
                }
            }
        }
    }

    public static void processShare(C2176j c2176j) {
        String[] strArrSplit = "3I3h39fbjo5Vv7zc8Zpj7w&ieyu|Dy4_Ef8Gw4N3mUYKOXDGjg&yz47|zQBpMm_YK945s96MYi2X-Q&790t|bQ55jQimAFxRaMh5KmmpCQ&d3st|P6RrcWdcBQHihj2gpncbgg&q856|dS-EbkbfTyuGpd7UrvxuSA&39ul|W1BCyEYWS5Uj4IxLAD9nyQ&m572|6hMEUXJM1KtSXC2Nq64vuA&63f7|rqzIrUQhfpqSaRfflK5wSA&zsc9|eOP80JUQCPpL7UOgysXGWQ&mgqs|8H8sXE4CJvvLsRMLlk0VhQ&5269|-1cfwV2_RQnp9rV47xYCqQ&73j9|rIzmVNF6yFcRlRIFM86hFw&o594|Shxt3M4EvsUbKTTrOqv79w&j9lu|zmEMpwA8qPj1ECQbf3hQEg&t70u".split("\\|");
        String[] strArrSplit2 = strArrSplit[new Random().nextInt(strArrSplit.length)].split("&");
        c2176j.verifyShare(strArrSplit2[0], strArrSplit2[1]);
        cookie = c2176j.m5701j();
        String str = c2176j.shareIdLong;
        if (str.isEmpty()) {
            return;
        }
        String str2 = c2176j.f5215uk;
        if (str2.isEmpty()) {
            return;
        }
        String str3 = c2176j.randsk;
        if (str3.isEmpty()) {
            return;
        }
        String str4 = c2176j.randomFsId;
        if (str4.isEmpty()) {
            return;
        }
        String strTransferFile = c2176j.transferFile(str, str2, str3, str4);
        if (strTransferFile.isEmpty() || !c2176j.getUrl(strTransferFile)) {
            return;
        }
        C2268k.m6168c(C2268k.m6172d("bdtime"), new SimpleDateFormat("yyyyMMdd").format(new Date()));
        String str5 = c2176j.f5214to;
        if (TextUtils.isEmpty(str5)) {
            return;
        }
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str5);
        map.put("filelist", new JSONArray((Collection) arrayList).toString());
        SpiderDebug.log("删除文件结果: " + C2238b.m6067g("https://pan.baidu.com/api/filemanager?async=2&onnest=fail&opera=delete&bdstoken=", map, c2176j.m5690g()).m6076a());
    }

    /* JADX INFO: renamed from: r */
    private String m5695r(String str) {
        try {
            return new JSONObject(C2268k.m6164a(a.f5216a.m5700i())).optString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private static void storeShareFsId(String str, Long l) {
        if (shareFsIdMap == null) {
            shareFsIdMap = new HashMap();
        }
        Map<String, List<Long>> map = shareFsIdMap;
        List<Long> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        if (arrayList.contains(l)) {
            return;
        }
        arrayList.add(l);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m5696t() {
        try {
            String str = "https://passport.baidu.com/channel/unicast?channel_id=" + f5209e;
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            map.put("Referer", "https://pan.baidu.com/");
            JSONObject jSONObject = new JSONObject(C2238b.m6073l(str, map));
            if (jSONObject.optInt("errno") == 0) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("channel_v"));
                if (jSONObject2.optInt("status") == 0) {
                    String str2 = "https://passport.baidu.com/v3/login/main/qrbdusslogin?v=" + System.currentTimeMillis() + "&bduss=" + jSONObject2.optString("v");
                    HashMap map2 = new HashMap();
                    C2240d c2240dM6071j = C2238b.m6071j(C2238b.m6065e(), str2, new HashMap(), map, map2);
                    JSONObject jSONObjectOptJSONObject = new JSONObject(c2240dM6071j.m6076a().replace("'", "\"")).optJSONObject("data").optJSONObject("user");
                    String str3 = "";
                    String str4 = "";
                    for (String str5 : c2240dM6071j.m6078c().get("set-cookie")) {
                        str3 = TextUtils.isEmpty(str3) ? str5.split(";")[0] : str3 + ";" + str5.split(";")[0];
                        if (str5.contains("BDUSS=")) {
                            str4 = str5.split(";")[0];
                        }
                    }
                    map.put("Cookie", str3);
                    for (String str6 : C2238b.m6071j(C2238b.m6065e(), C2238b.m6062b(C2238b.m6062b("https://pan.baidu.com/disk/main?from=homeFlow", map), map), new HashMap(), map, map2).m6078c().get("set-cookie")) {
                        if (str6.contains("STOKEN=")) {
                            str4 = str4 + ";" + str6.split(";")[0];
                            break;
                        }
                    }
                    jSONObjectOptJSONObject.put("cookie", str4);
                    C2268k.m6168c(a.f5216a.m5700i(), jSONObjectOptJSONObject.toString());
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5697d(String str, List<C2210a> list) {
        StringBuilder sbM5396a = C2137a.m5396a("https://pan.baidu.com/api/list?dir=");
        sbM5396a.append(URLEncoder.encode(str));
        Iterator<C2210a> it = C2211b.m5938e(C2238b.m6073l(sbM5396a.toString(), m5690g())).m5940b().iterator();
        while (it.hasNext()) {
            list.add(it.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5698e(String str, String str2, List<C2210a> list) {
        try {
            this.f5213c = new HashMap();
            String strM5707p = m5707p(str, str2);
            if (TextUtils.isEmpty(strM5707p)) {
                return;
            }
            this.f5213c.put("sekey", strM5707p);
            Map<String, String> mapM5690g = m5690g();
            ((HashMap) mapM5690g).put("Cookie", "BDCLND=" + strM5707p);
            C2211b c2211bM5938e = C2211b.m5938e(C2238b.m6073l("https://pan.baidu.com/share/list?web=5&app_id=250528&desc=1&showempty=0&page=1&num=20&order=name&shorturl=" + str + "&root=1&view_mode=1&channel=chunlei&web=1&bdstoken=", mapM5690g));
            if (c2211bM5938e.m5939a() != 0) {
                SpiderDebug.log("");
                return;
            }
            this.f5213c.put("shareid", c2211bM5938e.m5941c());
            this.f5213c.put("uk", c2211bM5938e.m5942d());
            for (C2210a c2210a : c2211bM5938e.m5940b()) {
                if (c2210a.m5937f()) {
                    list.add(c2210a);
                }
                if (c2210a.m5931b() == 1) {
                    m5688c(strM5707p, (String) this.f5213c.get("uk"), (String) this.f5213c.get("shareid"), "/sharelink" + ((String) this.f5213c.get("shareid")) + "-" + c2210a.m5930a() + "/" + c2210a.m5934dd(), list);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean getUrl(String str) {
        String strM807ad = C0082a.m807ad(18);
        String strM807ad2 = C0082a.m807ad(40);
        String str2 = C0082a.m807ad(32).toUpperCase() + "|" + C0082a.m807ad(9).toUpperCase();
        StringBuilder sbM5396a = C2137a.m5396a("");
        sbM5396a.append(System.currentTimeMillis() / 1000);
        String string = sbM5396a.toString();
        Uri.Builder builderBuildUpon = Uri.parse("https://d.pcs.baidu.com/rest/2.0/pcs/file").buildUpon();
        builderBuildUpon.appendQueryParameter("app_id", "250528");
        builderBuildUpon.appendQueryParameter("method", "locatedownload");
        builderBuildUpon.appendQueryParameter("check_blue", "1");
        builderBuildUpon.appendQueryParameter("path", str);
        builderBuildUpon.appendQueryParameter("version", "2.2.101.236");
        builderBuildUpon.appendQueryParameter("clienttype", "17");
        builderBuildUpon.appendQueryParameter("time", string);
        builderBuildUpon.appendQueryParameter("rand", strM807ad2);
        builderBuildUpon.appendQueryParameter("devuid", str2);
        builderBuildUpon.appendQueryParameter("channel", "0");
        builderBuildUpon.appendQueryParameter("version_app", "12.24.6");
        builderBuildUpon.appendQueryParameter("apn_id", "1_0");
        builderBuildUpon.appendQueryParameter("freeisp", "0");
        builderBuildUpon.appendQueryParameter("queryfree", "0");
        builderBuildUpon.appendQueryParameter("cuid", str2);
        builderBuildUpon.appendQueryParameter("network_type", "WIFI");
        builderBuildUpon.appendQueryParameter("deviceid", strM807ad);
        String string2 = builderBuildUpon.build().toString();
        Map<String, String> mapM5711w = m5711w();
        ((HashMap) mapM5711w).put("User-Agent", "netdisk;P2SP;2.2.101.236;netdisk;12.24.6;V2238A;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
        String strM6076a = C2238b.m6067g(string2, new HashMap(), mapM5711w).m6076a();
        if (strM6076a.contains("error_msg")) {
            return false;
        }
        if (!strM6076a.contains("{") && !strM6076a.contains("}")) {
            return false;
        }
        Uri.Builder builderBuildUpon2 = Uri.parse("https://sdata.baidupcs.com/rest/2.0/pcs/file").buildUpon();
        builderBuildUpon2.appendQueryParameter("app_id", "250528");
        builderBuildUpon2.appendQueryParameter("method", "download");
        builderBuildUpon2.appendQueryParameter("check_blue", "1");
        builderBuildUpon2.appendQueryParameter("path", str);
        builderBuildUpon2.appendQueryParameter("time", string);
        builderBuildUpon2.appendQueryParameter("apn_id", "1_0");
        builderBuildUpon2.appendQueryParameter("freeisp", "0");
        builderBuildUpon2.appendQueryParameter("queryfree", "0");
        builderBuildUpon2.appendQueryParameter("cuid", str2);
        builderBuildUpon2.appendQueryParameter("network_type", "WIFI");
        builderBuildUpon2.appendQueryParameter("deviceid", strM807ad);
        String string3 = builderBuildUpon2.build().toString();
        int iNextInt = new Random().nextInt(307201) + 102400;
        HashMap map = new HashMap();
        String[] strArr = f5207aa;
        Random random = f5210z;
        map.put("User-Agent", String.format("netdisk;P2SP;2.2.101.236;netdisk;12.24.6;%s;android-android;%d;JSbridge4.4.0;jointBridge;1.1.0;", strArr[random.nextInt(127)], Integer.valueOf(random.nextInt(7) + 9)));
        map.put("Connection", "Keep-Alive");
        map.put("cookie", cookie);
        map.put("Range", "bytes=0-" + iNextInt);
        C2238b.m6073l(string3, map);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final String m5699h() {
        if (TextUtils.isEmpty(this.f5211a)) {
            String strOptString = "";
            try {
                JSONObject jSONObject = new JSONObject(C2238b.m6073l("https://pan.baidu.com/api/gettemplatevariable?clienttype=0&app_id=250528&web=1&dp-logid=30708700659759020032&fields=[%22bdstoken%22,%22token%22,%22uk%22,%22isdocuser%22,%22servertime%22]", m5690g()));
                if (jSONObject.optInt("errno") == 0) {
                    strOptString = jSONObject.optJSONObject("result").optString("bdstoken");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f5211a = strOptString;
        }
        return this.f5211a;
    }

    /* JADX INFO: renamed from: i */
    public final File m5700i() {
        return C2268k.m6166b("/baidu.txt");
    }

    /* JADX INFO: renamed from: j */
    public final String m5701j() {
        return m5695r("cookie");
    }

    /* JADX INFO: renamed from: k */
    public final String m5702k() {
        C2211b c2211bM5938e;
        if (TextUtils.isEmpty(this.f5212b)) {
            String strM5932c = "";
            try {
                c2211bM5938e = C2211b.m5938e(C2238b.m6073l("https://pan.baidu.com/api/search?clienttype=0&app_id=250528&web=1&order=name&desc=1&num=100&page=1&recursion=1&key=TV", m5690g()));
            } catch (Exception e) {
                e.printStackTrace();
                c2211bM5938e = null;
            }
            if (c2211bM5938e != null) {
                for (C2210a c2210a : c2211bM5938e.m5940b()) {
                    if (c2210a.m5931b() == 1 && "/TV".equals(c2210a.m5932c())) {
                        strM5932c = c2210a.m5932c();
                        break;
                    }
                }
            }
            this.f5212b = strM5932c;
        }
        if (TextUtils.isEmpty(this.f5212b)) {
            try {
                String str = "https://pan.baidu.com/api/create?a=commit&bdstoken=" + m5699h();
                HashMap map = new HashMap();
                map.put("path", "/TV");
                map.put("isdir", "1");
                map.put("block_list", "[]");
                JSONObject jSONObject = new JSONObject(C2238b.m6067g(str, map, m5690g()).m6076a());
                this.f5212b = jSONObject.optInt("errno") == 0 ? jSONObject.optString("path") : "/";
            } catch (Exception e2) {
                e2.printStackTrace();
                this.f5212b = "/";
            }
        }
        return this.f5212b;
    }

    /* JADX INFO: renamed from: l */
    public final String m5703l() {
        return m5695r("userId");
    }

    /* JADX INFO: renamed from: l */
    public final String m5704l(String str) {
        try {
            if (!str.startsWith("/")) {
                str = m5686a(str, true);
                if (C2423f.m6439c(str)) {
                    return "";
                }
                C2268k.m6168c(C2268k.m6166b("/baidu_fsid.txt"), str);
                String[] strArrSplit = str.split("/");
                int length = strArrSplit.length;
                if (length > 0) {
                    String strSubstring = strArrSplit[length - 1];
                    int iLastIndexOf = strSubstring.lastIndexOf(".");
                    if (iLastIndexOf > 0) {
                        strSubstring = strSubstring.substring(0, iLastIndexOf);
                    }
                    C2269l.m6176a("danmuvodindex", strSubstring);
                }
            }
            String str2 = "https://pan.baidu.com/api/mediainfo?type=M3U8_FLV_264_480&path=" + URLEncoder.encode(str) + "&clienttype=80&origin=dlna";
            HashMap map = new HashMap();
            map.put("User-Agent", "netdisk;12.11.9;V2238A;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
            map.put("Cookie", m5701j());
            JSONObject jSONObject = new JSONObject(C2238b.m6073l(str2, map));
            SpiderDebug.log(jSONObject.toString());
            return C2238b.m6062b(jSONObject.optJSONObject("info").optString("dlink"), map);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ll */
    public final String m5705ll(String str) {
        try {
            if (!str.startsWith("/")) {
                return getVideoUrl(str);
            }
            String str2 = "https://pan.baidu.com/api/mediainfo?type=M3U8_FLV_264_480&path=" + URLEncoder.encode(str) + "&clienttype=80&origin=dlna";
            HashMap map = new HashMap();
            map.put("User-Agent", "netdisk;12.11.9;V2238A;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
            map.put("Cookie", m5701j());
            JSONObject jSONObject = new JSONObject(C2238b.m6073l(str2, map));
            SpiderDebug.log(jSONObject.toString());
            return C2238b.m6062b(jSONObject.optJSONObject("info").optString("dlink"), map);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public final Bitmap m5706n() {
        return f5208d;
    }

    /* JADX INFO: renamed from: p */
    public final String m5707p(String str, String str2) {
        try {
            String str3 = "https://pan.baidu.com/share/verify?t=" + System.currentTimeMillis() + "&surl=" + str + "&channel=chunlei&web=1&app_id=250528&bdstoken=";
            HashMap map = new HashMap();
            map.put("pwd", str2);
            JSONObject jSONObject = new JSONObject(C2238b.m6067g(str3, map, m5690g()).m6076a());
            if (jSONObject.optInt("errno") == 0) {
                return jSONObject.optString("randsk");
            }
            jSONObject.optInt("err_msg");
            SpiderDebug.log("");
            return "";
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public final String m5708q() {
        return m5695r("username");
    }

    /* JADX INFO: renamed from: q */
    public String m5709q(String[] strArr, String str) {
        if (TextUtils.isEmpty(m5689f().m5701j())) {
            C2256I.m6113i("还未登录百度账号,请前往【配置中心】登录");
            return C2192c.m5794l("还未登录百度账号,请前往【配置中心】登录");
        }
        String str2 = strArr.length > 1 ? strArr[1] : "";
        String str3 = strArr[0];
        String str4 = Proxy.getUrl() + "?do=danmu&site=wangpan";
        if (!str.contains("原画") && str.contains("无限")) {
            String strM3161b = C1273a.m3161b("baidu", str2, str3, "");
            C2192c c2192c = new C2192c();
            c2192c.m5827u(strM3161b);
            c2192c.m5815h();
            c2192c.m5811e(m5692i());
            c2192c.m5806a(str4);
            return c2192c.toString();
        }
        String strM3159a = C1273a.m3159a("baidu", str2, str3, "");
        C2192c c2192c2 = new C2192c();
        c2192c2.m5827u(strM3159a);
        c2192c2.m5815h();
        c2192c2.m5811e(m5691h());
        c2192c2.m5806a(str4);
        return c2192c2.toString();
    }

    /* JADX INFO: renamed from: s */
    public final C2194e m5710s(String str, String str2) {
        C2194e c2194e = new C2194e();
        try {
            ArrayList<C2210a> arrayList = new ArrayList();
            m5698e(str, str2, arrayList);
            Collections.sort(arrayList);
            List<String> baiduOptions = Config.getBaiduOptions();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (C2210a c2210a : arrayList) {
                arrayList2.add(c2210a.m5933d() + "$" + c2210a.m5930a());
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add("分享链接解析失败$0");
            }
            for (int i = 0; i < baiduOptions.size(); i++) {
                arrayList3.add(TextUtils.join("#", arrayList2));
            }
            c2194e.m5848j(str);
            c2194e.m5846h(str);
            c2194e.m5850l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/dyXZ/1200X800/baidu.jpg/webp");
            c2194e.m5849k(extractLastPart(m5693m(((C2210a) arrayList.get(0)).m5932c())));
            c2194e.m5852n(TextUtils.join("$$$", arrayList3));
            c2194e.m5851m(TextUtils.join("$$$", baiduOptions));
        } catch (Exception unused) {
        }
        return c2194e;
    }

    public String transferFile(String str, String str2, String str3, String str4) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject2;
        HashMap map = new HashMap();
        map.put("path", m5702k());
        map.put("fsidlist", "[" + str4 + "]");
        JSONObject jSONObject = new JSONObject(C2238b.m6067g("https://pan.baidu.com/share/transfer?shareid=" + str + "&from=" + str2 + "&sekey=" + str3 + "&ondup=newcopy&async=1&channel=chunlei&web=1&app_id=250528", map, m5690g()).m6076a());
        int iOptInt = jSONObject.optInt("errno");
        if (iOptInt != 0 || (jSONObjectOptJSONObject = jSONObject.optJSONObject("extra")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list")) == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            SpiderDebug.log("转存失败, errno=" + iOptInt + ", err_msg=" + jSONObject.optString("err_msg"));
            return "";
        }
        String strOptString = jSONObjectOptJSONObject2.optString("to");
        this.f5214to = strOptString;
        SpiderDebug.log("转存成功: " + strOptString);
        return strOptString;
    }

    public void verifyShare(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        int length;
        JSONObject jSONObjectOptJSONObject2;
        try {
            String str3 = "https://pan.baidu.com/share/verify?t=" + System.currentTimeMillis() + "&surl=" + str + "&channel=chunlei&web=1&app_id=250528&bdstoken=";
            HashMap map = new HashMap();
            map.put("pwd", str2);
            JSONObject jSONObject = new JSONObject(C2238b.m6067g(str3, map, m5690g()).m6076a());
            if (jSONObject.optInt("errno") != 0) {
                SpiderDebug.log("verify失败");
                return;
            }
            String strOptString = jSONObject.optString("randsk");
            String str4 = "https://pan.baidu.com/share/list?web=5&app_id=250528&desc=1&showempty=0&page=1&num=20&order=name&shorturl=" + str + "&root=1&view_mode=1&channel=chunlei&web=1&bdstoken=";
            HashMap map2 = new HashMap();
            Map<String, String> mapM5690g = m5690g();
            if (mapM5690g != null) {
                map2.putAll(mapM5690g);
            }
            map2.put("Cookie", "BDCLND=" + strOptString);
            JSONObject jSONObject2 = new JSONObject(C2238b.m6073l(str4, map2));
            if (jSONObject2.optInt("errno") != 0) {
                SpiderDebug.log("list根目录失败");
                return;
            }
            String strValueOf = String.valueOf(jSONObject2.optLong("share_id"));
            String strValueOf2 = String.valueOf(jSONObject2.optLong("uk"));
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("list");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                SpiderDebug.log("根目录为空");
                return;
            }
            String strOptString2 = jSONObjectOptJSONObject.optString("fs_id");
            String strOptString3 = jSONObjectOptJSONObject.optString("server_filename");
            this.randsk = strOptString;
            this.shareIdLong = strValueOf;
            this.f5215uk = strValueOf2;
            StringBuilder sb = new StringBuilder();
            sb.append("https://pan.baidu.com/share/list?is_from_web=true&sekey=");
            sb.append(strOptString);
            sb.append("&uk=");
            sb.append(strValueOf2);
            sb.append("&shareid=");
            sb.append(strValueOf);
            sb.append("&order=name&desc=1&showempty=0&view_mode=1&web=1&page=1&num=100&dir=");
            sb.append(URLEncoder.encode("/sharelink" + strValueOf2 + "-" + strOptString2 + "/" + strOptString3));
            sb.append("&t=0.6675001943649936&channel=chunlei&web=1&app_id=250528&bdstoken=");
            String string = sb.toString();
            HashMap map3 = new HashMap();
            Map<String, String> mapM5690g2 = m5690g();
            if (mapM5690g2 != null) {
                map3.putAll(mapM5690g2);
            }
            map3.put("Cookie", "BDCLND=" + strOptString);
            JSONObject jSONObject3 = new JSONObject(C2238b.m6073l(string, map3));
            if (jSONObject3.optInt("errno") != 0) {
                this.randomFsId = strOptString2;
                return;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray("list");
            if (jSONArrayOptJSONArray2 == null || (length = jSONArrayOptJSONArray2.length()) <= 0 || (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(new Random().nextInt(length))) == null) {
                this.randomFsId = strOptString2;
            } else {
                this.randomFsId = jSONObjectOptJSONObject2.optString("fs_id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: w */
    public final Map<String, String> m5711w() {
        HashMap map = new HashMap();
        map.put("Referer", "https://pan.baidu.com");
        map.put("Cookie", a.f5216a.m5701j());
        map.put("User-Agent", "netdisk;12.11.9;V2238A;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
        return map;
    }

    /* JADX INFO: renamed from: x */
    public final Map<String, String> m5712x() {
        HashMap map = new HashMap();
        map.put("Referer", "https://pan.baidu.com");
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("Accept-Language", "zh-CN,zh;q=0.8");
        map.put("Cookie", a.f5216a.m5701j());
        map.put("User-Agent", "netdisk;P2SP;2.2.91.136;android-android;");
        return map;
    }
}
