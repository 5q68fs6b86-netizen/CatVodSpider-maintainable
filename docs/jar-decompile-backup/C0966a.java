package com.github.catvod.spider.support.p012C0.p013N;

import android.graphics.Bitmap;
import android.util.Base64;
import com.github.catvod.spider.support.p012C0.A0.a;
import com.github.catvod.spider.support.p012C0.s.b;
import com.github.catvod.spider.support.p012C0.p026c0.C1049h;
import com.github.catvod.spider.support.p012C0.p028d0.C1076E;
import com.github.catvod.spider.support.p012C0.p035j.C1247o;
import com.github.catvod.spider.support.p012C0.p036k.C1254g;
import com.github.catvod.spider.support.p012C0.p039r.EnumC1262b;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p013N.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0966a {
    /* JADX INFO: renamed from: a */
    public static void m2367a(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m2368b(int i, int i2) {
        int i3 = (i2 * 4) ^ i;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m2369c(String str) {
        try {
            EnumMap enumMap = new EnumMap(EnumC1262b.class);
            enumMap.put(EnumC1262b.CHARACTER_SET, "UTF-8");
            enumMap.put(EnumC1262b.MARGIN, 2);
            b bVarA = new a().a(str, com.github.catvod.spider.support.p012C0.p039r.a.l, C1247o.m3111a(240), C1247o.m3111a(240), enumMap);
            int iC = bVarA.c();
            int iB = bVarA.b();
            int[] iArr = new int[iC * iB];
            for (int i = 0; i < iB; i++) {
                for (int i2 = 0; i2 < iC; i2++) {
                    iArr[(i * iC) + i2] = bVarA.a(i2, i) ? -16777216 : -1;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iB, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, iC, 0, 0, iC, iB);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2370e(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2371f(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m2372g(LinkedHashMap linkedHashMap) {
        JSONArray jSONArray = new JSONArray();
        for (String str : linkedHashMap.keySet()) {
            JSONArray jSONArray2 = new JSONArray();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) linkedHashMap.get(str);
            if (!linkedHashMap2.isEmpty()) {
                for (String str2 : linkedHashMap2.keySet()) {
                    ArrayList arrayList = (ArrayList) linkedHashMap2.get(str2);
                    if (!arrayList.isEmpty()) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (int i = 0; i < arrayList.size(); i++) {
                            jSONArray3.put(arrayList.get(i));
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("name", str2);
                            jSONObject.put("urls", jSONArray3);
                        } catch (JSONException e) {
                        }
                        jSONArray2.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("group", str);
                    jSONObject2.put("channels", jSONArray2);
                } catch (JSONException e2) {
                }
                jSONArray.put(jSONObject2);
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: h */
    public static Object[] m2373h(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean zContains = str.contains(".bmp");
            String strM3126g = C1254g.m3126g(str, null);
            if (zContains) {
                m2378m(linkedHashMap, new String(Base64.decode(strM3126g.split("\\*\\*")[1], 0)));
            } else {
                m2378m(linkedHashMap, strM3126g);
            }
            return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream(m2372g(linkedHashMap).getBytes("UTF-8"))};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2374i(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m2375j(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2376k(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    /* JADX INFO: renamed from: l */
    public static C1049h m2377l(String str) {
        return C1076E.m2808c(str);
    }

    /* JADX INFO: renamed from: m */
    public static void m2378m(LinkedHashMap linkedHashMap, String str) {
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            String line = bufferedReader.readLine();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            String line2 = line;
            while (line2 != null) {
                if (line2.trim().isEmpty()) {
                    linkedHashMap2 = linkedHashMap4;
                } else {
                    String[] strArrSplit = line2.split(",");
                    if (strArrSplit.length < 2) {
                        linkedHashMap2 = linkedHashMap4;
                    } else if (line2.contains("#genre#")) {
                        String strTrim = strArrSplit[0].trim();
                        if (linkedHashMap.containsKey(strTrim)) {
                            linkedHashMap2 = (LinkedHashMap) linkedHashMap.get(strTrim);
                        } else {
                            linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap.put(strTrim, linkedHashMap2);
                        }
                    } else {
                        String strTrim2 = strArrSplit[0].trim();
                        for (String str2 : strArrSplit[1].trim().split("#")) {
                            String strTrim3 = str2.trim();
                            if (!strTrim3.isEmpty() && (strTrim3.startsWith("http") || strTrim3.startsWith("rtsp") || strTrim3.startsWith("rtmp"))) {
                                if (linkedHashMap4.containsKey(strTrim2)) {
                                    arrayList = (ArrayList) linkedHashMap4.get(strTrim2);
                                } else {
                                    arrayList = new ArrayList();
                                    linkedHashMap4.put(strTrim2, arrayList);
                                }
                                if (!arrayList.contains(strTrim3)) {
                                    arrayList.add(strTrim3);
                                }
                            }
                        }
                        linkedHashMap2 = linkedHashMap4;
                    }
                }
                line2 = bufferedReader.readLine();
                linkedHashMap4 = linkedHashMap2;
            }
            bufferedReader.close();
            if (linkedHashMap3.isEmpty()) {
                return;
            }
            linkedHashMap.put("未分组", linkedHashMap3);
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m2379o(int i, int i2) {
        int i3 = (-862048943) * i2;
        int i4 = (((i3 << 15) | (i3 >>> 17)) * 461845907) ^ i;
        return (((i4 << 13) | (i4 >>> 19)) * 5) - 430675100;
    }

    /* JADX INFO: renamed from: p */
    public static int m2380p(int i, Object obj) {
        return m2379o(i, obj != null ? obj.hashCode() : 0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m2381d() {
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public Object m2382n() {
        throw null;
    }
}
