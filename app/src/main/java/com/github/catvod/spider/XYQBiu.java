package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0405ku;
import com.github.catvod.spider.support.p002A0.AbstractC0502oj;
import com.github.catvod.spider.support.p002A0.AbstractC0716wh;
import com.github.catvod.spider.support.p002A0.AbstractC0763ya;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class XYQBiu extends Spider {

    /* JADX INFO: renamed from: a */
    public static final String[] f336a = {"ajax/verify_check", "ajax.php?ac=code_check", "/verify/index.html", "?scheckAC=check"};

    /* JADX INFO: renamed from: b */
    public final String f337b = "";

    /* JADX INFO: renamed from: c */
    public final String f338c = "";

    /* JADX INFO: renamed from: d */
    public String f339d = "";

    /* JADX INFO: renamed from: e */
    public String f340e = "";

    /* JADX INFO: renamed from: f */
    public final JSONObject f341f = new JSONObject();

    /* JADX INFO: renamed from: g */
    public final String f342g = "[\\W|\\S|.]*?MacPlayerConfig.player_list[\\W|\\S|.]*?=([\\W|\\S|.]*?),MacPlayerConfig.downer_list";

    /* JADX INFO: renamed from: h */
    public String f343h = null;

    /* JADX INFO: renamed from: i */
    public JSONObject f344i = null;

    /* JADX INFO: renamed from: j */
    public String f345j = null;

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQBiu$1 */
    class C00651 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQBiu$2 */
    class C00662 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQBiu$3 */
    class C00673 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.XYQBiu$4 */
    class C00684 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    public static boolean checkstring(String str) {
        String[] strArr = {"m3u8.pw/Cache", "from=https://banyung.pw", "getm3u8?url=http"};
        for (int i = 0; i < 3; i++) {
            if (str.contains(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkveriry(String str) {
        String[] strArr = f336a;
        for (int i = 0; i < 4; i++) {
            if (str.contains(strArr[i]) && !str.contains("myui-vodbox-content")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static String m727k(String str) {
        Matcher matcher = Pattern.compile("(\\\\u(\\w{4}))").matcher(str);
        while (matcher.find()) {
            str = str.replace(matcher.group(1), ((char) Integer.parseInt(matcher.group(2), 16)) + "");
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01b8 A[Catch: Exception -> 0x022e, TRY_LEAVE, TryCatch #1 {Exception -> 0x022e, blocks: (B:103:0x01b2, B:105:0x01b8), top: B:237:0x01b2 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0227  */
    /* JADX WARN: Code duplicated, block: B:142:0x023e A[Catch: Exception -> 0x02b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x02b0, blocks: (B:140:0x0238, B:142:0x023e), top: B:235:0x0238 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c0 A[Catch: Exception -> 0x0329, TRY_LEAVE, TryCatch #2 {Exception -> 0x0329, blocks: (B:176:0x02ba, B:178:0x02c0), top: B:239:0x02ba }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0326  */
    /* JADX WARN: Code duplicated, block: B:235:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x02ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5 A[Catch: Exception -> 0x00a6, TRY_LEAVE, TryCatch #11 {Exception -> 0x00a6, blocks: (B:28:0x008f, B:30:0x0092, B:32:0x009a, B:47:0x00df, B:49:0x00e5, B:51:0x00ed, B:54:0x00f4, B:57:0x00fe, B:59:0x0104, B:61:0x010f, B:63:0x0117, B:64:0x0123, B:40:0x00c5), top: B:257:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123 A[Catch: Exception -> 0x00a6, TRY_LEAVE, TryCatch #11 {Exception -> 0x00a6, blocks: (B:28:0x008f, B:30:0x0092, B:32:0x009a, B:47:0x00df, B:49:0x00e5, B:51:0x00ed, B:54:0x00f4, B:57:0x00fe, B:59:0x0104, B:61:0x010f, B:63:0x0117, B:64:0x0123, B:40:0x00c5), top: B:257:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a0  */
    /* JADX INFO: renamed from: l */
    public static JSONObject m728l(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28 = str7;
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            String[] strArrSplit = str.split("&");
            ArrayList arrayList = new ArrayList();
            for (String str29 : strArrSplit) {
                arrayList.add(str29.replaceAll("＆＆", "&"));
            }
            String str30 = str6;
            String str31 = str8;
            String str32 = str10;
            String str33 = str12;
            String str34 = str14;
            JSONObject jSONObject2 = jSONObject;
            int i = 0;
            JSONArray jSONArray2 = jSONArray;
            String str35 = str4;
            while (i < arrayList.size()) {
                try {
                    arrayList = arrayList;
                    str34 = str34;
                    str16 = str33;
                    if (str3.isEmpty()) {
                        str18 = str31;
                        str17 = str32;
                        if (!str5.isEmpty()) {
                            if (str30.equals(Marker.ANY_MARKER)) {
                                str30 = str5;
                            }
                            if (str30.contains("||")) {
                                jSONArray2.put(m730n("class", "类型", str5, str30));
                            } else {
                                jSONArray2.put(m730n("class", "类型", str5, str30));
                            }
                        }
                        if (str7.isEmpty()) {
                            str7 = str7;
                            str31 = str18;
                            if (str9.isEmpty()) {
                                str15 = str17;
                                str22 = "\\|\\|";
                                str20 = str35;
                                if (!str11.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else if (str16.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                }
                                if (!str13.isEmpty()) {
                                    if (str34.isEmpty()) {
                                    }
                                }
                                jSONObject2 = jSONObject2;
                                jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                str15 = str25;
                                str35 = str20;
                                jSONArray2 = new JSONArray();
                            } else if (str17.isEmpty()) {
                                str15 = str17;
                                str22 = "\\|\\|";
                                str20 = str35;
                                if (!str11.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else if (str16.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                }
                                if (!str13.isEmpty()) {
                                    if (str34.isEmpty()) {
                                    }
                                }
                                jSONObject2 = jSONObject2;
                                jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                str15 = str25;
                                str35 = str20;
                                jSONArray2 = new JSONArray();
                            } else {
                                str15 = str17;
                                str22 = "\\|\\|";
                                str20 = str35;
                                if (!str11.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else if (str16.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                }
                                if (!str13.isEmpty()) {
                                    if (str34.isEmpty()) {
                                    }
                                }
                                jSONObject2 = jSONObject2;
                                jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                str15 = str25;
                                str35 = str20;
                                jSONArray2 = new JSONArray();
                            }
                        } else {
                            if (str18.isEmpty()) {
                                str7 = str7;
                                str31 = str18;
                            } else {
                                str7 = str7;
                                str31 = str18;
                            }
                            if (str9.isEmpty()) {
                                str15 = str17;
                                str22 = "\\|\\|";
                                str20 = str35;
                                if (!str11.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else if (str16.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                }
                                if (!str13.isEmpty()) {
                                    if (str34.isEmpty()) {
                                    }
                                }
                                jSONObject2 = jSONObject2;
                                jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                str15 = str25;
                                str35 = str20;
                                jSONArray2 = new JSONArray();
                            } else if (str17.isEmpty()) {
                                str15 = str17;
                                str22 = "\\|\\|";
                                str20 = str35;
                                if (!str11.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else if (str16.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                }
                                if (!str13.isEmpty()) {
                                    if (str34.isEmpty()) {
                                    }
                                }
                                jSONObject2 = jSONObject2;
                                jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                str15 = str25;
                                str35 = str20;
                                jSONArray2 = new JSONArray();
                            } else {
                                str15 = str17;
                                str22 = "\\|\\|";
                                str20 = str35;
                                if (!str11.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else if (str16.isEmpty()) {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                } else {
                                    str16 = str16;
                                    str23 = str22;
                                    str25 = str15;
                                }
                                if (!str13.isEmpty()) {
                                    if (str34.isEmpty()) {
                                    }
                                }
                                jSONObject2 = jSONObject2;
                                jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                str15 = str25;
                                str35 = str20;
                                jSONArray2 = new JSONArray();
                            }
                        }
                    } else {
                        try {
                            if (str35.isEmpty() || !str2.contains("{cateId}")) {
                                str18 = str31;
                                str17 = str32;
                            } else {
                                if (str35.equals(Marker.ANY_MARKER)) {
                                    str35 = str3;
                                }
                                str17 = str32;
                                if (str35.contains("||")) {
                                    try {
                                        if (str3.contains("||")) {
                                            String[] strArrSplit2 = str3.split("\\|\\|");
                                            String[] strArrSplit3 = str35.split("\\|\\|");
                                            str18 = str31;
                                            try {
                                                if (i < strArrSplit3.length && !strArrSplit3[i].equals("空")) {
                                                    jSONArray2.put(m730n("cateId", "分类", strArrSplit2[i], strArrSplit3[i]));
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                arrayList = arrayList;
                                                str34 = str34;
                                                str16 = str16;
                                                str7 = str7;
                                                str15 = str17;
                                                str31 = str18;
                                                jSONObject2 = jSONObject2;
                                                SpiderDebug.log(e);
                                                i++;
                                                str28 = str7;
                                                jSONObject2 = jSONObject2;
                                                str32 = str15;
                                                str33 = str16;
                                            }
                                        } else {
                                            str18 = str31;
                                            jSONArray2.put(m730n("cateId", "分类", str3, str35));
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        str7 = str7;
                                        str15 = str17;
                                        jSONObject2 = jSONObject2;
                                        SpiderDebug.log(e);
                                        i++;
                                        str28 = str7;
                                        jSONObject2 = jSONObject2;
                                        str32 = str15;
                                        str33 = str16;
                                    }
                                } else {
                                    str18 = str31;
                                    jSONArray2.put(m730n("cateId", "分类", str3, str35));
                                }
                            }
                            try {
                                if (!str5.isEmpty() && !str30.isEmpty() && str2.contains("{class}")) {
                                    if (str30.equals(Marker.ANY_MARKER)) {
                                        str30 = str5;
                                    }
                                    if (str30.contains("||") || !str5.contains("||")) {
                                        jSONArray2.put(m730n("class", "类型", str5, str30));
                                    } else {
                                        String[] strArrSplit4 = str5.split("\\|\\|");
                                        String[] strArrSplit5 = str30.split("\\|\\|");
                                        if (i < strArrSplit5.length && !strArrSplit5[i].equals("空")) {
                                            jSONArray2.put(m730n("class", "类型", strArrSplit4[i], strArrSplit5[i]));
                                        }
                                    }
                                }
                                if (str7.isEmpty()) {
                                    try {
                                        if (str18.isEmpty() || !str2.contains("{area}")) {
                                            str7 = str7;
                                            str31 = str18;
                                        } else {
                                            str19 = str18;
                                            try {
                                                str31 = str19.equals(Marker.ANY_MARKER) ? str7 : str19;
                                                try {
                                                    if (str31.contains("||")) {
                                                        str7 = str7;
                                                        try {
                                                            if (str7.contains("||")) {
                                                                String[] strArrSplit6 = str7.split("\\|\\|");
                                                                String[] strArrSplit7 = str31.split("\\|\\|");
                                                                if (i < strArrSplit7.length && !strArrSplit7[i].equals("空")) {
                                                                    jSONArray2.put(m730n("area", "地区", strArrSplit6[i], strArrSplit7[i]));
                                                                }
                                                            }
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            str15 = str17;
                                                            jSONObject2 = jSONObject2;
                                                            SpiderDebug.log(e);
                                                            i++;
                                                            str28 = str7;
                                                            jSONObject2 = jSONObject2;
                                                            str32 = str15;
                                                            str33 = str16;
                                                        }
                                                    } else {
                                                        str7 = str7;
                                                    }
                                                    jSONArray2.put(m730n("area", "地区", str7, str31));
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    str7 = str7;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                arrayList = arrayList;
                                                str34 = str34;
                                                str16 = str16;
                                                str15 = str17;
                                                str31 = str19;
                                                jSONObject2 = jSONObject2;
                                                SpiderDebug.log(e);
                                                i++;
                                                str28 = str7;
                                                jSONObject2 = jSONObject2;
                                                str32 = str15;
                                                str33 = str16;
                                            }
                                        }
                                        try {
                                            if (str9.isEmpty()) {
                                                try {
                                                    if (str17.isEmpty() || !str2.contains("{year}")) {
                                                        str15 = str17;
                                                        str22 = "\\|\\|";
                                                        str20 = str35;
                                                    } else {
                                                        str15 = str17;
                                                        try {
                                                            if (str15.equals(Marker.ANY_MARKER)) {
                                                                str15 = str9;
                                                            }
                                                            if (str15.contains("||")) {
                                                                str21 = str9;
                                                                try {
                                                                    if (str21.contains("||")) {
                                                                        String[] strArrSplit8 = str21.split("\\|\\|");
                                                                        str20 = str35;
                                                                        try {
                                                                            String[] strArrSplit9 = str15.split("\\|\\|");
                                                                            str22 = "\\|\\|";
                                                                            if (i < strArrSplit9.length && !strArrSplit9[i].equals("空")) {
                                                                                jSONArray2.put(m730n("year", "年份", strArrSplit8[i], strArrSplit9[i]));
                                                                            }
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            str16 = str16;
                                                                            str35 = str20;
                                                                            jSONObject2 = jSONObject2;
                                                                            SpiderDebug.log(e);
                                                                            i++;
                                                                            str28 = str7;
                                                                            jSONObject2 = jSONObject2;
                                                                            str32 = str15;
                                                                            str33 = str16;
                                                                        }
                                                                    }
                                                                } catch (Exception e7) {
                                                                    e = e7;
                                                                    arrayList = arrayList;
                                                                    str34 = str34;
                                                                    str16 = str16;
                                                                    jSONObject2 = jSONObject2;
                                                                    SpiderDebug.log(e);
                                                                    i++;
                                                                    str28 = str7;
                                                                    jSONObject2 = jSONObject2;
                                                                    str32 = str15;
                                                                    str33 = str16;
                                                                }
                                                            } else {
                                                                str21 = str9;
                                                            }
                                                            str22 = "\\|\\|";
                                                            str20 = str35;
                                                            jSONArray2.put(m730n("year", "年份", str21, str15));
                                                        } catch (Exception e8) {
                                                            e = e8;
                                                        }
                                                    }
                                                    try {
                                                        if (!str11.isEmpty()) {
                                                            try {
                                                                if (str16.isEmpty() || !str2.contains("{lang}")) {
                                                                    str16 = str16;
                                                                    str23 = str22;
                                                                    str25 = str15;
                                                                } else {
                                                                    str16 = str16;
                                                                    try {
                                                                        if (str16.equals(Marker.ANY_MARKER)) {
                                                                            str16 = str11;
                                                                        }
                                                                        if (str16.contains("||")) {
                                                                            str23 = str22;
                                                                            str24 = str11;
                                                                            try {
                                                                                if (str24.contains("||")) {
                                                                                    String[] strArrSplit10 = str24.split(str23);
                                                                                    str25 = str15;
                                                                                    try {
                                                                                        String[] strArrSplit11 = str16.split(str23);
                                                                                        if (i < strArrSplit11.length && !strArrSplit11[i].equals("空")) {
                                                                                            jSONArray2.put(m730n("lang", "语言", strArrSplit10[i], strArrSplit11[i]));
                                                                                        }
                                                                                    } catch (Exception e9) {
                                                                                        e = e9;
                                                                                        str15 = str25;
                                                                                        str35 = str20;
                                                                                        jSONObject2 = jSONObject2;
                                                                                        SpiderDebug.log(e);
                                                                                        i++;
                                                                                        str28 = str7;
                                                                                        jSONObject2 = jSONObject2;
                                                                                        str32 = str15;
                                                                                        str33 = str16;
                                                                                    }
                                                                                }
                                                                            } catch (Exception e10) {
                                                                                e = e10;
                                                                                str35 = str20;
                                                                                jSONObject2 = jSONObject2;
                                                                                SpiderDebug.log(e);
                                                                                i++;
                                                                                str28 = str7;
                                                                                jSONObject2 = jSONObject2;
                                                                                str32 = str15;
                                                                                str33 = str16;
                                                                            }
                                                                        } else {
                                                                            str23 = str22;
                                                                            str24 = str11;
                                                                        }
                                                                        str25 = str15;
                                                                        jSONArray2.put(m730n("lang", "语言", str24, str16));
                                                                    } catch (Exception e11) {
                                                                        e = e11;
                                                                    }
                                                                }
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                str16 = str16;
                                                            }
                                                        } else {
                                                            str16 = str16;
                                                            str23 = str22;
                                                            str25 = str15;
                                                        }
                                                        try {
                                                            if (!str13.isEmpty()) {
                                                                try {
                                                                    if (str34.isEmpty() && str2.contains("{by}")) {
                                                                        str26 = str34;
                                                                        try {
                                                                            str34 = str26.equals(Marker.ANY_MARKER) ? str13 : str26;
                                                                            try {
                                                                                if (str34.contains("||")) {
                                                                                    str27 = str13;
                                                                                    try {
                                                                                        if (str27.contains("||")) {
                                                                                            String[] strArrSplit12 = str27.split(str23);
                                                                                            String[] strArrSplit13 = str34.split(str23);
                                                                                            if (i < strArrSplit13.length && !strArrSplit13[i].equals("空")) {
                                                                                                jSONArray2.put(m730n("by", "排序", strArrSplit12[i], strArrSplit13[i]));
                                                                                            }
                                                                                        }
                                                                                    } catch (Exception e13) {
                                                                                        e = e13;
                                                                                        arrayList = arrayList;
                                                                                        str15 = str25;
                                                                                        str35 = str20;
                                                                                        jSONObject2 = jSONObject2;
                                                                                        SpiderDebug.log(e);
                                                                                        i++;
                                                                                        str28 = str7;
                                                                                        jSONObject2 = jSONObject2;
                                                                                        str32 = str15;
                                                                                        str33 = str16;
                                                                                    }
                                                                                } else {
                                                                                    str27 = str13;
                                                                                }
                                                                                jSONArray2.put(m730n("by", "排序", str27, str34));
                                                                            } catch (Exception e14) {
                                                                                e = e14;
                                                                            }
                                                                        } catch (Exception e15) {
                                                                            e = e15;
                                                                            arrayList = arrayList;
                                                                            str15 = str25;
                                                                            str35 = str20;
                                                                            str34 = str26;
                                                                            jSONObject2 = jSONObject2;
                                                                            SpiderDebug.log(e);
                                                                            i++;
                                                                            str28 = str7;
                                                                            jSONObject2 = jSONObject2;
                                                                            str32 = str15;
                                                                            str33 = str16;
                                                                        }
                                                                    }
                                                                } catch (Exception e16) {
                                                                    e = e16;
                                                                    str26 = str34;
                                                                }
                                                            }
                                                            try {
                                                                jSONObject2 = jSONObject2;
                                                                try {
                                                                    jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                                                    str15 = str25;
                                                                    str35 = str20;
                                                                    jSONArray2 = new JSONArray();
                                                                } catch (Exception e17) {
                                                                    e = e17;
                                                                    str15 = str25;
                                                                    str35 = str20;
                                                                    SpiderDebug.log(e);
                                                                }
                                                            } catch (Exception e18) {
                                                                e = e18;
                                                                jSONObject2 = jSONObject2;
                                                            }
                                                        } catch (Exception e19) {
                                                            e = e19;
                                                            str15 = str25;
                                                            str35 = str20;
                                                            str34 = str34;
                                                            SpiderDebug.log(e);
                                                            i++;
                                                            str28 = str7;
                                                            jSONObject2 = jSONObject2;
                                                            str32 = str15;
                                                            str33 = str16;
                                                        }
                                                    } catch (Exception e20) {
                                                        e = e20;
                                                        str16 = str16;
                                                    }
                                                } catch (Exception e21) {
                                                    e = e21;
                                                    str15 = str17;
                                                }
                                            } else {
                                                str15 = str17;
                                                str22 = "\\|\\|";
                                                str20 = str35;
                                                if (!str11.isEmpty()) {
                                                    str16 = str16;
                                                    str23 = str22;
                                                    str25 = str15;
                                                } else if (str16.isEmpty()) {
                                                    str16 = str16;
                                                    str23 = str22;
                                                    str25 = str15;
                                                } else {
                                                    str16 = str16;
                                                    str23 = str22;
                                                    str25 = str15;
                                                }
                                                if (!str13.isEmpty()) {
                                                    str34 = str34.isEmpty() ? str34 : str34;
                                                }
                                                jSONObject2 = jSONObject2;
                                                jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                                str15 = str25;
                                                str35 = str20;
                                                jSONArray2 = new JSONArray();
                                            }
                                        } catch (Exception e22) {
                                            e = e22;
                                            str16 = str16;
                                            str15 = str17;
                                            str20 = str35;
                                        }
                                    } catch (Exception e23) {
                                        e = e23;
                                        str19 = str18;
                                    }
                                } else {
                                    str7 = str7;
                                    str31 = str18;
                                    if (str9.isEmpty()) {
                                        str15 = str17;
                                        str22 = "\\|\\|";
                                        str20 = str35;
                                        if (!str11.isEmpty()) {
                                            str16 = str16;
                                            str23 = str22;
                                            str25 = str15;
                                        } else if (str16.isEmpty()) {
                                            str16 = str16;
                                            str23 = str22;
                                            str25 = str15;
                                        } else {
                                            str16 = str16;
                                            str23 = str22;
                                            str25 = str15;
                                        }
                                        if (!str13.isEmpty()) {
                                            if (str34.isEmpty()) {
                                            }
                                        }
                                        jSONObject2 = jSONObject2;
                                        jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                        str15 = str25;
                                        str35 = str20;
                                        jSONArray2 = new JSONArray();
                                    } else if (str17.isEmpty()) {
                                        str15 = str17;
                                        str22 = "\\|\\|";
                                        str20 = str35;
                                        if (!str11.isEmpty()) {
                                            str16 = str16;
                                            str23 = str22;
                                            str25 = str15;
                                        } else if (str16.isEmpty()) {
                                            str16 = str16;
                                            str23 = str22;
                                            str25 = str15;
                                        } else {
                                            str16 = str16;
                                            str23 = str22;
                                            str25 = str15;
                                        }
                                        if (!str13.isEmpty()) {
                                            if (str34.isEmpty()) {
                                            }
                                        }
                                        jSONObject2 = jSONObject2;
                                        jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                        str15 = str25;
                                        str35 = str20;
                                        jSONArray2 = new JSONArray();
                                    } else {
                                        str15 = str17;
                                        str22 = "\\|\\|";
                                        str20 = str35;
                                        if (!str11.isEmpty()) {
                                            str16 = str16;
                                            str23 = str22;
                                            str25 = str15;
                                        } else if (str16.isEmpty()) {
                                            str16 = str16;
                                            str23 = str22;
                                            str25 = str15;
                                        } else {
                                            str16 = str16;
                                            str23 = str22;
                                            str25 = str15;
                                        }
                                        if (!str13.isEmpty()) {
                                            if (str34.isEmpty()) {
                                            }
                                        }
                                        jSONObject2 = jSONObject2;
                                        jSONObject2.put((String) arrayList.get(i), jSONArray2);
                                        str15 = str25;
                                        str35 = str20;
                                        jSONArray2 = new JSONArray();
                                    }
                                }
                            } catch (Exception e24) {
                                e = e24;
                                arrayList = arrayList;
                                str34 = str34;
                                str16 = str16;
                                str7 = str7;
                                str15 = str17;
                                jSONObject2 = jSONObject2;
                                str35 = str35;
                                str31 = str18;
                            }
                        } catch (Exception e25) {
                            e = e25;
                            str17 = str32;
                        }
                    }
                } catch (Exception e26) {
                    e = e26;
                    str15 = str32;
                    str16 = str33;
                    jSONObject2 = jSONObject2;
                    str7 = str28;
                }
                i++;
                str28 = str7;
                jSONObject2 = jSONObject2;
                str32 = str15;
                str33 = str16;
            }
            return jSONObject2;
        } catch (Exception e27) {
            SpiderDebug.log(e27);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m729m() {
        int i = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
        int i2 = i - 20;
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        String str = "";
        while (i2 >= i) {
            if (i2 == i) {
                str = str + String.valueOf(i2);
            } else {
                str = str + String.valueOf(i2) + "&";
            }
            i2--;
        }
        return str;
    }

    /* JADX INFO: renamed from: n */
    public static JSONObject m730n(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (!str.equals("by") && !str4.equals("空") && !str3.contains("全部")) {
                jSONObject.put("n", "全部");
                jSONObject.put("v", "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
            } else if (str.equals("by") && !str4.equals("空") && !str3.contains("默认")) {
                jSONObject.put("n", "默认");
                jSONObject.put("v", "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
            }
            if (str4.contains("&") && !str4.equals("空")) {
                String[] strArrSplit = str3.split("&");
                String[] strArrSplit2 = str4.split("&");
                for (int i = 0; i < strArrSplit.length; i++) {
                    jSONObject.put("n", strArrSplit[i]);
                    jSONObject.put("v", strArrSplit2[i].replaceAll("＆＆", "&"));
                    jSONArray.put(jSONObject);
                    jSONObject = new JSONObject();
                }
            } else if (!str4.equals("空")) {
                jSONObject.put("n", str3);
                jSONObject.put("v", str4);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", str);
            jSONObject2.put("name", str2);
            jSONObject2.put("value", jSONArray);
            return jSONObject2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static String string2Hex(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length() - 1; i++) {
            String strValueOf = String.valueOf((int) str.charAt(i));
            if (str2.equals("djs")) {
                sb.append(strValueOf);
            } else {
                sb.append(Integer.parseInt(strValueOf) + 1);
            }
        }
        return sb.toString();
    }

    public static String vertype(String str) {
        String[] strArr = f336a;
        for (int i = 0; i < 4; i++) {
            String str2 = strArr[i];
            if (str.contains(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0250 A[LOOP:0: B:105:0x002a->B:100:0x0250, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x013f A[Catch: Exception -> 0x00ff, TryCatch #1 {Exception -> 0x00ff, blocks: (B:44:0x010b, B:46:0x013f, B:47:0x0166, B:36:0x00e9, B:38:0x00fa, B:43:0x0108, B:42:0x0104), top: B:103:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0166 A[Catch: Exception -> 0x00ff, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ff, blocks: (B:44:0x010b, B:46:0x013f, B:47:0x0166, B:36:0x00e9, B:38:0x00fa, B:43:0x0108, B:42:0x0104), top: B:103:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x016c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0195 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:101:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01c0 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:101:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ca A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:101:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d2 A[Catch: Exception -> 0x018f, TRY_LEAVE, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:101:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ec A[Catch: Exception -> 0x018f, TRY_ENTER, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:101:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ff A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:101:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0204 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:101:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:80:0x020c A[Catch: Exception -> 0x018f, TRY_LEAVE, TryCatch #0 {Exception -> 0x018f, blocks: (B:58:0x01ba, B:60:0x01c0, B:63:0x01ca, B:65:0x01d2, B:74:0x01ec, B:76:0x01ff, B:78:0x0204, B:80:0x020c, B:52:0x0181, B:57:0x0195), top: B:101:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:84:0x021b A[Catch: Exception -> 0x01e8, TryCatch #3 {Exception -> 0x01e8, blocks: (B:67:0x01d9, B:69:0x01e1, B:82:0x0213, B:84:0x021b, B:86:0x0224, B:88:0x022c, B:89:0x0233, B:91:0x023b), top: B:107:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0224 A[Catch: Exception -> 0x01e8, TryCatch #3 {Exception -> 0x01e8, blocks: (B:67:0x01d9, B:69:0x01e1, B:82:0x0213, B:84:0x021b, B:86:0x0224, B:88:0x022c, B:89:0x0233, B:91:0x023b), top: B:107:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x022c A[Catch: Exception -> 0x01e8, TryCatch #3 {Exception -> 0x01e8, blocks: (B:67:0x01d9, B:69:0x01e1, B:82:0x0213, B:84:0x021b, B:86:0x0224, B:88:0x022c, B:89:0x0233, B:91:0x023b), top: B:107:0x01d9 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0242  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x013f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0195, please report this as an issue */
    /* JADX INFO: renamed from: aa */
    public final String m731aa(LinkedHashMap linkedHashMap, String str, String str2, String str3) {
        int i;
        String str4;
        String str5;
        String strM734o;
        String strM736q;
        String strM737r;
        String str6;
        String strM737r2;
        String strM737r3;
        HashMap mapM740u = str2.equals("show") ? m740u(str) : m743x(str);
        String str7 = "X-Requested-With";
        mapM740u.put("X-Requested-With", "XMLHttpRequest");
        String str8 = "";
        String str9 = "";
        int i2 = 0;
        while (true) {
            try {
                C00651 c00651 = new C00651();
                try {
                    try {
                        if (str3.contains("/verify")) {
                            OkHttpClient okHttpClientM1884f = AbstractC0771yi.m1884f();
                            StringBuilder sb = new StringBuilder();
                            str4 = str9;
                            try {
                                sb.append(AbstractC0716wh.m1787g(str, "/index.php/verify/index.html"));
                                sb.append("?");
                                i = i2;
                                try {
                                    sb.append(Math.random());
                                    AbstractC0771yi.m1885g(okHttpClientM1884f, sb.toString(), str2.equals("show") ? m740u(str) : m743x(str), c00651);
                                } catch (Exception e) {
                                    e = e;
                                    str5 = str8;
                                    SpiderDebug.log(e);
                                    i2 = i + 1;
                                    if (i2 >= 4) {
                                        return str4;
                                    }
                                    str8 = str5;
                                    str9 = str4;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i = i2;
                            }
                        } else {
                            i = i2;
                            str4 = str9;
                            if (str3.contains("scheckAC")) {
                                AbstractC0771yi.m1885g(AbstractC0771yi.m1884f(), AbstractC0716wh.m1787g(str, "/include/vdimgck.php") + "?get=" + new Date(), str2.equals("show") ? m740u(str) : m743x(str), c00651);
                            } else {
                                OkHttpClient okHttpClientM1884f2 = AbstractC0771yi.m1884f();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(AbstractC0716wh.m1787g(str, "/inc/common/code.php?a=" + str2 + "&s="));
                                sb2.append(Math.random());
                                AbstractC0771yi.m1885g(okHttpClientM1884f2, sb2.toString(), str2.equals("show") ? m740u(str) : m743x(str), c00651);
                            }
                            String strEncodeToString = Base64.encodeToString(((Response) c00651.getResult()).body().bytes(), 2);
                            HashMap map = new HashMap();
                            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
                            map.put("Content-Type", "text/plain; charset=utf-8");
                            strM734o = m734o(this.f345j, strEncodeToString, this.f340e, map);
                            if (str3.contains("/verify")) {
                                strM736q = m737r(AbstractC0716wh.m1787g(str, "/index.php/ajax/verify_check?type=" + str2 + "&verify=" + strM734o), null, this.f340e, mapM740u);
                                str7 = str7;
                                str5 = str8;
                            } else if (str3.contains("scheckAC")) {
                                str7 = str7;
                                try {
                                    mapM740u.remove(str7);
                                    HashMap map2 = new HashMap();
                                    map2.put("validate", strM734o);
                                    str5 = str8;
                                    map2.put("searchword", str5);
                                    strM736q = m737r(AbstractC0716wh.m1787g(str, "/search.php?scheckAC=check&page=&searchtype=&order=&tid=&area=&year=&letter=&yuyan=&state=&money=&ver=&jq="), map2, this.f340e, mapM740u);
                                } catch (Exception e3) {
                                    e = e3;
                                    str5 = str8;
                                    SpiderDebug.log(e);
                                    i2 = i + 1;
                                    if (i2 >= 4) {
                                        return str4;
                                    }
                                    str8 = str5;
                                    str9 = str4;
                                }
                            } else {
                                str7 = str7;
                                str5 = str8;
                                strM736q = m736q(AbstractC0716wh.m1787g(str, "/inc/ajax.php?ac=code_check&type=" + str2 + "&code=" + strM734o), this.f340e, mapM740u);
                            }
                            if (str3.contains("scheckAC")) {
                                if (strM736q.contains("验证码不正确")) {
                                    str6 = str4;
                                } else {
                                    if (linkedHashMap == null) {
                                        strM737r3 = m736q(str, this.f340e, mapM740u);
                                    } else {
                                        strM737r3 = m737r(str, linkedHashMap, this.f340e, mapM740u);
                                    }
                                    str6 = strM737r3;
                                    try {
                                        if (!str6.contains("输入正确的验证码") && !checkveriry(str6)) {
                                            return str6;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        str4 = str6;
                                        SpiderDebug.log(e);
                                    }
                                }
                            } else if (new JSONObject(strM736q).getString("msg").equals("ok")) {
                                mapM740u.remove(str7);
                                if (linkedHashMap == null) {
                                    strM737r = m736q(str, this.f340e, mapM740u);
                                } else {
                                    strM737r = m737r(str, linkedHashMap, this.f340e, mapM740u);
                                }
                                str6 = strM737r;
                                if (str6.contains("不要频繁操作，搜索时间间隔为")) {
                                    TimeUnit.SECONDS.sleep(6L);
                                    if (linkedHashMap == null) {
                                        strM737r2 = m736q(str, this.f340e, mapM740u);
                                    } else {
                                        strM737r2 = m737r(str, linkedHashMap, this.f340e, mapM740u);
                                    }
                                    str6 = strM737r2;
                                }
                                if (!str6.contains("输入验证码") && !checkveriry(str6)) {
                                    return str6;
                                }
                            } else {
                                str6 = str4;
                            }
                            str4 = str6;
                            i2 = i + 1;
                            if (i2 >= 4) {
                                return str4;
                            }
                            str8 = str5;
                            str9 = str4;
                        }
                        if (str3.contains("scheckAC")) {
                            if (strM736q.contains("验证码不正确")) {
                                if (linkedHashMap == null) {
                                    strM737r3 = m736q(str, this.f340e, mapM740u);
                                } else {
                                    strM737r3 = m737r(str, linkedHashMap, this.f340e, mapM740u);
                                }
                                str6 = strM737r3;
                                if (!str6.contains("输入正确的验证码")) {
                                    return str6;
                                }
                            } else {
                                str6 = str4;
                            }
                        } else if (new JSONObject(strM736q).getString("msg").equals("ok")) {
                            mapM740u.remove(str7);
                            if (linkedHashMap == null) {
                                strM737r = m736q(str, this.f340e, mapM740u);
                            } else {
                                strM737r = m737r(str, linkedHashMap, this.f340e, mapM740u);
                            }
                            str6 = strM737r;
                            if (str6.contains("不要频繁操作，搜索时间间隔为")) {
                                TimeUnit.SECONDS.sleep(6L);
                                if (linkedHashMap == null) {
                                    strM737r2 = m736q(str, this.f340e, mapM740u);
                                } else {
                                    strM737r2 = m737r(str, linkedHashMap, this.f340e, mapM740u);
                                }
                                str6 = strM737r2;
                            }
                            if (!str6.contains("输入验证码")) {
                                return str6;
                            }
                        } else {
                            str6 = str4;
                        }
                        str4 = str6;
                    } catch (Exception e5) {
                        e = e5;
                    }
                    String strEncodeToString2 = Base64.encodeToString(((Response) c00651.getResult()).body().bytes(), 2);
                    HashMap map3 = new HashMap();
                    map3.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
                    map3.put("Content-Type", "text/plain; charset=utf-8");
                    strM734o = m734o(this.f345j, strEncodeToString2, this.f340e, map3);
                    if (str3.contains("/verify")) {
                        strM736q = m737r(AbstractC0716wh.m1787g(str, "/index.php/ajax/verify_check?type=" + str2 + "&verify=" + strM734o), null, this.f340e, mapM740u);
                        str7 = str7;
                        str5 = str8;
                    } else if (str3.contains("scheckAC")) {
                        str7 = str7;
                        mapM740u.remove(str7);
                        HashMap map4 = new HashMap();
                        map4.put("validate", strM734o);
                        str5 = str8;
                        map4.put("searchword", str5);
                        strM736q = m737r(AbstractC0716wh.m1787g(str, "/search.php?scheckAC=check&page=&searchtype=&order=&tid=&area=&year=&letter=&yuyan=&state=&money=&ver=&jq="), map4, this.f340e, mapM740u);
                    } else {
                        str7 = str7;
                        str5 = str8;
                        strM736q = m736q(AbstractC0716wh.m1787g(str, "/inc/ajax.php?ac=code_check&type=" + str2 + "&code=" + strM734o), this.f340e, mapM740u);
                    }
                } catch (Exception e6) {
                    e = e6;
                    str7 = str7;
                }
            } catch (Exception e7) {
                e = e7;
                i = i2;
                str4 = str9;
            }
            i2 = i + 1;
            if (i2 >= 4) {
                return str4;
            }
            str8 = str5;
            str9 = str4;
        }
    }

    /* JADX INFO: renamed from: ab */
    public final String m732ab(String str) {
        return str.replaceAll("\\&nbsp;", " ").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "").replaceAll("\\s{2,}", "");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ac */
    public final java.lang.String m733ac(java.lang.String r33, java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 1984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQBiu.m733ac(java.lang.String, java.lang.String):java.lang.String");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONObject jSONObjectM735p = m735p(str, str2, z, map);
        return jSONObjectM735p != null ? jSONObjectM735p.toString() : "";
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:103:0x03bd A[Catch: Exception -> 0x03d2, TryCatch #9 {Exception -> 0x03d2, blocks: (B:101:0x03b3, B:103:0x03bd, B:106:0x03d4, B:107:0x03d9), top: B:214:0x03b3 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:118:0x03fe A[Catch: Exception -> 0x0093, LOOP:10: B:116:0x03f8->B:118:0x03fe, LOOP_END, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x041d A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x042d A[Catch: Exception -> 0x0093, TRY_ENTER, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0486  */
    /* JADX WARN: Code duplicated, block: B:144:0x0497 A[Catch: Exception -> 0x0093, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:152:0x04ca A[Catch: Exception -> 0x0093, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x04d8 A[Catch: Exception -> 0x0093, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0507 A[Catch: Exception -> 0x0093, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0594  */
    /* JADX WARN: Code duplicated, block: B:191:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:196:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0544 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x05a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0528 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x04f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b8 A[Catch: all -> 0x0262, TryCatch #1 {all -> 0x0262, blocks: (B:59:0x0223, B:61:0x0248, B:63:0x025c, B:72:0x0287, B:76:0x02d6, B:75:0x02b8, B:67:0x0266, B:69:0x026e, B:71:0x0282, B:79:0x02f8, B:81:0x030a, B:82:0x030d), top: B:198:0x0223 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0336 A[Catch: Exception -> 0x0093, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0342 A[Catch: Exception -> 0x0093, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x034e A[Catch: Exception -> 0x0093, TryCatch #8 {Exception -> 0x0093, blocks: (B:3:0x0024, B:7:0x006f, B:192:0x05ca, B:10:0x0096, B:12:0x009e, B:14:0x00cb, B:16:0x00d3, B:18:0x00db, B:37:0x017a, B:39:0x018a, B:41:0x01a3, B:42:0x01be, B:84:0x0324, B:86:0x032c, B:88:0x0336, B:90:0x0342, B:92:0x034e, B:94:0x036b, B:95:0x037a, B:111:0x03e2, B:112:0x03e5, B:119:0x0415, B:122:0x041d, B:125:0x042d, B:127:0x0433, B:128:0x0450, B:131:0x0456, B:133:0x045c, B:135:0x046c, B:137:0x0473, B:138:0x0479, B:139:0x047e, B:142:0x048d, B:144:0x0497, B:146:0x049d, B:147:0x04c0, B:150:0x04c4, B:152:0x04ca, B:154:0x04d8, B:155:0x04f0, B:156:0x04f3, B:157:0x04f6, B:158:0x04fd, B:160:0x0507, B:163:0x050e, B:165:0x0514, B:166:0x0528, B:167:0x0534, B:185:0x059a, B:190:0x05c6, B:182:0x0590, B:116:0x03f8, B:118:0x03fe, B:19:0x00f2, B:21:0x0101, B:22:0x0126, B:23:0x0133, B:24:0x0141, B:27:0x0157, B:29:0x015f, B:30:0x0163, B:32:0x016b, B:36:0x0176, B:187:0x05a4), top: B:212:0x0024, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0368  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x03bd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x02b8, please report this as an issue */
    public String detailContent(List<String> list) {
        ArrayList arrayList;
        String strM744y;
        String str;
        String str2;
        String str3;
        ArrayList arrayList2;
        String str4;
        int i;
        String str5;
        String[] strArr;
        int i2;
        String str6;
        String str7;
        String str8;
        String str9;
        String strReplaceAll;
        String str10;
        String str11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i3;
        int i4;
        String str12;
        String str13;
        ArrayList arrayListM1797q;
        int i5;
        ArrayList arrayList5;
        String strM732ab;
        int i6;
        String str14;
        String str15 = "tab_arr_pre";
        String str16 = "epi_title";
        try {
            m738s();
            this.f340e = m742w("Coding_format", "UTF-8");
            String[] strArrSplit = list.get(0).split("\\$\\$\\$");
            String str17 = strArrSplit[2];
            String str18 = strArrSplit[1];
            String str19 = strArrSplit[0];
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            if (m742w("force_play", "").equals("1")) {
                arrayList7.add(strArrSplit[0]);
                arrayList6.add(strArrSplit[0] + "$" + strArrSplit[2]);
                str10 = "";
                strReplaceAll = str10;
                arrayList2 = arrayList7;
            } else {
                if (str17.contains(";post")) {
                    String strTrim = str17.split("\\?")[0].replaceAll("？？", "?").trim();
                    String strTrim2 = str17.split("\\?")[1].split(";")[0].replaceAll("？？", "?").trim();
                    if (strTrim2.isEmpty()) {
                        arrayList = arrayList7;
                        strM744y = m737r(strTrim, null, this.f340e, m740u(strTrim));
                    } else if (strTrim2.startsWith("{") && strTrim2.endsWith("}")) {
                        strM744y = m734o(strTrim, new JSONObject(strTrim2).toString(), this.f340e, m740u(strTrim));
                        arrayList = arrayList7;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String[] strArrSplit2 = strTrim2.split("&");
                        int length = strArrSplit2.length;
                        int i7 = 0;
                        while (i7 < length) {
                            String str20 = strArrSplit2[i7];
                            String[] strArr2 = strArrSplit2;
                            int iIndexOf = str20.indexOf("=");
                            linkedHashMap.put(str20.substring(0, iIndexOf), str20.substring(iIndexOf + 1));
                            i7++;
                            strArrSplit2 = strArr2;
                            length = length;
                            arrayList7 = arrayList7;
                        }
                        arrayList = arrayList7;
                        strM744y = m737r(strTrim, linkedHashMap, this.f340e, m740u(strTrim));
                    }
                } else {
                    arrayList = arrayList7;
                    String strM736q = m736q(str17, this.f340e, m740u(str17));
                    if (strM736q.contains("检测中") && strM736q.contains("btwaf")) {
                        strM736q = m745z(str17, strM736q, "show");
                    }
                    strM744y = (strM736q.contains("/huadong_") || strM736q.contains("/renji_")) ? m744y(str17, strM736q, "show") : strM736q;
                }
                String strM727k = m727k(strM744y);
                String str21 = m742w("list_YN_twice", "").equals("1") ? (String) AbstractC0716wh.m1797q(strM727k, m742w("list_twice_pre", ""), m742w("list_twice_suf", "")).get(0) : strM727k;
                String strM742w = m742w("list_arr_pre", "");
                String strM742w2 = m742w("list_arr_suf", "");
                boolean zEquals = m742w("epi_YN_twice", "").equals("1");
                ArrayList arrayListM1797q2 = AbstractC0716wh.m1797q(str21, strM742w, strM742w2);
                int i8 = 0;
                while (true) {
                    str = "&&";
                    if (i8 >= arrayListM1797q2.size()) {
                        break;
                    }
                    try {
                        String str22 = (String) arrayListM1797q2.get(i8);
                        if (zEquals) {
                            str22 = (String) AbstractC0716wh.m1797q(str22, m742w("epi_twice_pre", ""), m742w("epi_twice_suf", "")).get(0);
                        }
                        ArrayList arrayListM1797q3 = AbstractC0716wh.m1797q(str22, m742w("epi_arr_pre", ""), m742w("epi_arr_suf", ""));
                        ArrayList arrayList8 = new ArrayList();
                        boolean z = zEquals;
                        int i9 = 0;
                        while (i9 < arrayListM1797q3.size()) {
                            str2 = strM727k;
                            try {
                                str3 = str15;
                                try {
                                    String strM732ab2 = m732ab((String) AbstractC0716wh.m1797q((String) arrayListM1797q3.get(i9), m742w(str16, "").split("&&")[0], m742w(str16, "").split("&&")[1]).get(0));
                                    if (strM732ab2.startsWith("ed2k:")) {
                                        Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(strM732ab2));
                                        if (matcher.find()) {
                                            strM732ab2 = matcher.group(1);
                                        }
                                    } else {
                                        if (strM732ab2.startsWith("magnet:")) {
                                            Matcher matcher2 = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(strM732ab2));
                                            if (matcher2.find()) {
                                                strM732ab2 = matcher2.group(2);
                                            }
                                        }
                                        String str23 = str16;
                                        str14 = (String) AbstractC0716wh.m1797q((String) arrayListM1797q3.get(i9), m742w("epi_url", "").split("&&")[0], m742w("epi_url", "").split("&&")[1]).get(0);
                                        if (AbstractC0716wh.m1792l(str14)) {
                                            str14 = m742w("epiurl_prefix", "") + str14 + m742w("epiurl_suffix", "");
                                        }
                                        arrayList8.add(strM732ab2 + "$" + str14);
                                        i9++;
                                        strM727k = str2;
                                        str15 = str3;
                                        str16 = str23;
                                    }
                                    String str24 = str16;
                                    str14 = (String) AbstractC0716wh.m1797q((String) arrayListM1797q3.get(i9), m742w("epi_url", "").split("&&")[0], m742w("epi_url", "").split("&&")[1]).get(0);
                                    if (AbstractC0716wh.m1792l(str14)) {
                                        str14 = m742w("epiurl_prefix", "") + str14 + m742w("epiurl_suffix", "");
                                    }
                                    arrayList8.add(strM732ab2 + "$" + str14);
                                    i9++;
                                    strM727k = str2;
                                    str15 = str3;
                                    str16 = str24;
                                } catch (Throwable th) {
                                    th = th;
                                    th.printStackTrace();
                                    if (m742w("tab_title", "").isEmpty()) {
                                        arrayList2 = arrayList;
                                        str4 = str2;
                                        i = 0;
                                        while (i < arrayList6.size()) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("列表");
                                            i++;
                                            sb.append(i);
                                            arrayList2.add(sb.toString());
                                        }
                                    } else {
                                        str12 = str3;
                                        if (m742w(str12, "").isEmpty()) {
                                            arrayList2 = arrayList;
                                            str4 = str2;
                                            i = 0;
                                            while (i < arrayList6.size()) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("列表");
                                                i++;
                                                sb2.append(i);
                                                arrayList2.add(sb2.toString());
                                            }
                                        } else {
                                            if (m742w("tab_YN_twice", "").equals("1")) {
                                                str4 = str2;
                                                str13 = (String) AbstractC0716wh.m1797q(str4, m742w("tab_twice_pre", ""), m742w("tab_twice_suf", "")).get(0);
                                            } else {
                                                str4 = str2;
                                                str13 = str4;
                                            }
                                            arrayListM1797q = AbstractC0716wh.m1797q(str13, m742w(str12, ""), m742w("tab_arr_suf", ""));
                                            i5 = 0;
                                            while (i5 < arrayList6.size()) {
                                                try {
                                                    String strM1793m = AbstractC0716wh.m1793m(m742w("tab_title", ""));
                                                    strM732ab = m732ab((String) AbstractC0716wh.m1797q((String) arrayListM1797q.get(i5), strM1793m.split("&&")[0], strM1793m.split("&&")[1]).get(0));
                                                    i6 = 0;
                                                    while (i6 < arrayList.size()) {
                                                        arrayList5 = arrayList;
                                                        try {
                                                            if (strM732ab.equals(arrayList5.get(i6))) {
                                                                strM732ab = strM732ab + "" + (i5 + 1);
                                                            }
                                                            i6++;
                                                            arrayList = arrayList5;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            SpiderDebug.log(e);
                                                            i5++;
                                                            arrayList = arrayList5;
                                                        }
                                                    }
                                                    arrayList5 = arrayList;
                                                    arrayList5.add(strM732ab);
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    arrayList5 = arrayList;
                                                }
                                                i5++;
                                                arrayList = arrayList5;
                                            }
                                            arrayList2 = arrayList;
                                        }
                                    }
                                    str5 = "[不包含:";
                                    strArr = new String[]{str5, "[排序:", "[替换:"};
                                    i2 = 0;
                                    while (i2 < 3) {
                                        String str25 = strArr[i2];
                                        if (!m742w("tab_title", "").contains(str5)) {
                                            str11 = str4;
                                        } else {
                                            str11 = str4;
                                        }
                                        String str26 = str;
                                        if (m742w("tab_title", "").contains("[排序:")) {
                                            arrayList3 = new ArrayList();
                                            arrayList4 = new ArrayList();
                                            for (String str27 : m742w("tab_title", "").split("\\[排序:")[1].split("\\]")[0].split(",")) {
                                                for (i4 = 0; i4 < arrayList6.size(); i4++) {
                                                    if (((String) arrayList2.get(i4)).contains(str27)) {
                                                        arrayList4.add((String) arrayList2.get(i4));
                                                        arrayList3.add((String) arrayList6.get(i4));
                                                        arrayList2.remove(i4);
                                                        arrayList6.remove(i4);
                                                    }
                                                }
                                            }
                                            arrayList6.addAll(0, arrayList3);
                                            arrayList2.addAll(0, arrayList4);
                                        }
                                        if (!m742w("tab_title", "").contains("[替换:")) {
                                        }
                                        i2++;
                                        strArr = strArr;
                                        str = str26;
                                        str5 = str5;
                                        str4 = str11;
                                    }
                                    str6 = str4;
                                    str7 = str;
                                    if (!m742w("proj_actor", "").isEmpty()) {
                                        try {
                                            str8 = str7;
                                            try {
                                                str9 = str6;
                                                try {
                                                    strReplaceAll = ((String) AbstractC0716wh.m1797q(str9, m742w("proj_actor", "").split(str8)[0], m742w("proj_actor", "").split(str8)[1]).get(0)).replaceAll("\\&nbsp;", " ").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("\\s{2,}", "");
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    SpiderDebug.log(e);
                                                    strReplaceAll = "";
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                str9 = str6;
                                                SpiderDebug.log(e);
                                                strReplaceAll = "";
                                                if (m742w("proj_plot", "").isEmpty()) {
                                                    str10 = "";
                                                } else {
                                                    try {
                                                        str10 = (String) AbstractC0716wh.m1797q(str9, m742w("proj_plot", "").split(str8)[0], m742w("proj_plot", "").split(str8)[1]).get(0);
                                                    } catch (Exception e5) {
                                                        SpiderDebug.log(e5);
                                                        str10 = "";
                                                    }
                                                }
                                                JSONObject jSONObject = new JSONObject();
                                                jSONObject.put("vod_id", list.get(0));
                                                jSONObject.put("vod_name", str19);
                                                jSONObject.put("vod_pic", str18);
                                                jSONObject.put("type_name", "");
                                                jSONObject.put("vod_year", "");
                                                jSONObject.put("vod_area", "");
                                                jSONObject.put("vod_remarks", "");
                                                jSONObject.put("vod_actor", strReplaceAll);
                                                jSONObject.put("vod_director", "");
                                                jSONObject.put("vod_content", str10);
                                                String strJoin = TextUtils.join("$$$", arrayList2);
                                                String strJoin2 = TextUtils.join("$$$", arrayList6);
                                                jSONObject.put("vod_play_from", strJoin);
                                                jSONObject.put("vod_play_url", strJoin2);
                                                JSONObject jSONObject2 = new JSONObject();
                                                JSONArray jSONArray = new JSONArray();
                                                jSONArray.put(jSONObject);
                                                jSONObject2.put("list", jSONArray);
                                                return jSONObject2.toString();
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            str8 = str7;
                                        }
                                        if (m742w("proj_plot", "").isEmpty()) {
                                            str10 = (String) AbstractC0716wh.m1797q(str9, m742w("proj_plot", "").split(str8)[0], m742w("proj_plot", "").split(str8)[1]).get(0);
                                        } else {
                                            str10 = "";
                                        }
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("vod_id", list.get(0));
                                        jSONObject3.put("vod_name", str19);
                                        jSONObject3.put("vod_pic", str18);
                                        jSONObject3.put("type_name", "");
                                        jSONObject3.put("vod_year", "");
                                        jSONObject3.put("vod_area", "");
                                        jSONObject3.put("vod_remarks", "");
                                        jSONObject3.put("vod_actor", strReplaceAll);
                                        jSONObject3.put("vod_director", "");
                                        jSONObject3.put("vod_content", str10);
                                        String strJoin3 = TextUtils.join("$$$", arrayList2);
                                        String strJoin4 = TextUtils.join("$$$", arrayList6);
                                        jSONObject3.put("vod_play_from", strJoin3);
                                        jSONObject3.put("vod_play_url", strJoin4);
                                        JSONObject jSONObject4 = new JSONObject();
                                        JSONArray jSONArray2 = new JSONArray();
                                        jSONArray2.put(jSONObject3);
                                        jSONObject4.put("list", jSONArray2);
                                        return jSONObject4.toString();
                                    }
                                    str8 = str7;
                                    str9 = str6;
                                    strReplaceAll = "";
                                    if (m742w("proj_plot", "").isEmpty()) {
                                        str10 = (String) AbstractC0716wh.m1797q(str9, m742w("proj_plot", "").split(str8)[0], m742w("proj_plot", "").split(str8)[1]).get(0);
                                    } else {
                                        str10 = "";
                                    }
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("vod_id", list.get(0));
                                    jSONObject5.put("vod_name", str19);
                                    jSONObject5.put("vod_pic", str18);
                                    jSONObject5.put("type_name", "");
                                    jSONObject5.put("vod_year", "");
                                    jSONObject5.put("vod_area", "");
                                    jSONObject5.put("vod_remarks", "");
                                    jSONObject5.put("vod_actor", strReplaceAll);
                                    jSONObject5.put("vod_director", "");
                                    jSONObject5.put("vod_content", str10);
                                    String strJoin5 = TextUtils.join("$$$", arrayList2);
                                    String strJoin6 = TextUtils.join("$$$", arrayList6);
                                    jSONObject5.put("vod_play_from", strJoin5);
                                    jSONObject5.put("vod_play_url", strJoin6);
                                    JSONObject jSONObject6 = new JSONObject();
                                    JSONArray jSONArray3 = new JSONArray();
                                    jSONArray3.put(jSONObject5);
                                    jSONObject6.put("list", jSONArray3);
                                    return jSONObject6.toString();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                str3 = str15;
                                th.printStackTrace();
                                if (m742w("tab_title", "").isEmpty()) {
                                    str12 = str3;
                                    if (m742w(str12, "").isEmpty()) {
                                        if (m742w("tab_YN_twice", "").equals("1")) {
                                            str4 = str2;
                                            str13 = (String) AbstractC0716wh.m1797q(str4, m742w("tab_twice_pre", ""), m742w("tab_twice_suf", "")).get(0);
                                        } else {
                                            str4 = str2;
                                            str13 = str4;
                                        }
                                        arrayListM1797q = AbstractC0716wh.m1797q(str13, m742w(str12, ""), m742w("tab_arr_suf", ""));
                                        i5 = 0;
                                        while (i5 < arrayList6.size()) {
                                            String strM1793m2 = AbstractC0716wh.m1793m(m742w("tab_title", ""));
                                            strM732ab = m732ab((String) AbstractC0716wh.m1797q((String) arrayListM1797q.get(i5), strM1793m2.split("&&")[0], strM1793m2.split("&&")[1]).get(0));
                                            i6 = 0;
                                            while (i6 < arrayList.size()) {
                                                arrayList5 = arrayList;
                                                if (strM732ab.equals(arrayList5.get(i6))) {
                                                    strM732ab = strM732ab + "" + (i5 + 1);
                                                }
                                                i6++;
                                                arrayList = arrayList5;
                                            }
                                            arrayList5 = arrayList;
                                            arrayList5.add(strM732ab);
                                            i5++;
                                            arrayList = arrayList5;
                                        }
                                        arrayList2 = arrayList;
                                    } else {
                                        arrayList2 = arrayList;
                                        str4 = str2;
                                        i = 0;
                                        while (i < arrayList6.size()) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("列表");
                                            i++;
                                            sb3.append(i);
                                            arrayList2.add(sb3.toString());
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList;
                                    str4 = str2;
                                    i = 0;
                                    while (i < arrayList6.size()) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("列表");
                                        i++;
                                        sb4.append(i);
                                        arrayList2.add(sb4.toString());
                                    }
                                }
                                str5 = "[不包含:";
                                strArr = new String[]{str5, "[排序:", "[替换:"};
                                i2 = 0;
                                while (i2 < 3) {
                                    String str28 = strArr[i2];
                                    if (!m742w("tab_title", "").contains(str5)) {
                                        str11 = str4;
                                    } else {
                                        str11 = str4;
                                    }
                                    String str29 = str;
                                    if (m742w("tab_title", "").contains("[排序:")) {
                                        arrayList3 = new ArrayList();
                                        arrayList4 = new ArrayList();
                                        while (i3 < r6.length) {
                                            while (i4 < arrayList6.size()) {
                                                if (((String) arrayList2.get(i4)).contains(str27)) {
                                                    arrayList4.add((String) arrayList2.get(i4));
                                                    arrayList3.add((String) arrayList6.get(i4));
                                                    arrayList2.remove(i4);
                                                    arrayList6.remove(i4);
                                                }
                                            }
                                        }
                                        arrayList6.addAll(0, arrayList3);
                                        arrayList2.addAll(0, arrayList4);
                                    }
                                    if (!m742w("tab_title", "").contains("[替换:")) {
                                    }
                                    i2++;
                                    strArr = strArr;
                                    str = str29;
                                    str5 = str5;
                                    str4 = str11;
                                }
                                str6 = str4;
                                str7 = str;
                                if (!m742w("proj_actor", "").isEmpty()) {
                                    str8 = str7;
                                    str9 = str6;
                                    strReplaceAll = ((String) AbstractC0716wh.m1797q(str9, m742w("proj_actor", "").split(str8)[0], m742w("proj_actor", "").split(str8)[1]).get(0)).replaceAll("\\&nbsp;", " ").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("\\s{2,}", "");
                                    if (m742w("proj_plot", "").isEmpty()) {
                                        str10 = (String) AbstractC0716wh.m1797q(str9, m742w("proj_plot", "").split(str8)[0], m742w("proj_plot", "").split(str8)[1]).get(0);
                                    } else {
                                        str10 = "";
                                    }
                                    JSONObject jSONObject7 = new JSONObject();
                                    jSONObject7.put("vod_id", list.get(0));
                                    jSONObject7.put("vod_name", str19);
                                    jSONObject7.put("vod_pic", str18);
                                    jSONObject7.put("type_name", "");
                                    jSONObject7.put("vod_year", "");
                                    jSONObject7.put("vod_area", "");
                                    jSONObject7.put("vod_remarks", "");
                                    jSONObject7.put("vod_actor", strReplaceAll);
                                    jSONObject7.put("vod_director", "");
                                    jSONObject7.put("vod_content", str10);
                                    String strJoin7 = TextUtils.join("$$$", arrayList2);
                                    String strJoin8 = TextUtils.join("$$$", arrayList6);
                                    jSONObject7.put("vod_play_from", strJoin7);
                                    jSONObject7.put("vod_play_url", strJoin8);
                                    JSONObject jSONObject8 = new JSONObject();
                                    JSONArray jSONArray4 = new JSONArray();
                                    jSONArray4.put(jSONObject7);
                                    jSONObject8.put("list", jSONArray4);
                                    return jSONObject8.toString();
                                }
                                str8 = str7;
                                str9 = str6;
                                strReplaceAll = "";
                                if (m742w("proj_plot", "").isEmpty()) {
                                    str10 = (String) AbstractC0716wh.m1797q(str9, m742w("proj_plot", "").split(str8)[0], m742w("proj_plot", "").split(str8)[1]).get(0);
                                } else {
                                    str10 = "";
                                }
                                JSONObject jSONObject9 = new JSONObject();
                                jSONObject9.put("vod_id", list.get(0));
                                jSONObject9.put("vod_name", str19);
                                jSONObject9.put("vod_pic", str18);
                                jSONObject9.put("type_name", "");
                                jSONObject9.put("vod_year", "");
                                jSONObject9.put("vod_area", "");
                                jSONObject9.put("vod_remarks", "");
                                jSONObject9.put("vod_actor", strReplaceAll);
                                jSONObject9.put("vod_director", "");
                                jSONObject9.put("vod_content", str10);
                                String strJoin9 = TextUtils.join("$$$", arrayList2);
                                String strJoin10 = TextUtils.join("$$$", arrayList6);
                                jSONObject9.put("vod_play_from", strJoin9);
                                jSONObject9.put("vod_play_url", strJoin10);
                                JSONObject jSONObject10 = new JSONObject();
                                JSONArray jSONArray5 = new JSONArray();
                                jSONArray5.put(jSONObject9);
                                jSONObject10.put("list", jSONArray5);
                                return jSONObject10.toString();
                            }
                        }
                        String str30 = strM727k;
                        String str31 = str15;
                        String str32 = str16;
                        if (m742w("epi_reverse", "").equals("1")) {
                            Collections.reverse(arrayList8);
                        }
                        arrayList6.add(TextUtils.join("#", arrayList8));
                        i8++;
                        arrayListM1797q2 = arrayListM1797q2;
                        zEquals = z;
                        strM727k = str30;
                        str15 = str31;
                        str16 = str32;
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = strM727k;
                    }
                    if (m742w("tab_title", "").isEmpty()) {
                        str12 = str3;
                        if (m742w(str12, "").isEmpty()) {
                            if (m742w("tab_YN_twice", "").equals("1")) {
                                str4 = str2;
                                str13 = (String) AbstractC0716wh.m1797q(str4, m742w("tab_twice_pre", ""), m742w("tab_twice_suf", "")).get(0);
                            } else {
                                str4 = str2;
                                str13 = str4;
                            }
                            arrayListM1797q = AbstractC0716wh.m1797q(str13, m742w(str12, ""), m742w("tab_arr_suf", ""));
                            i5 = 0;
                            while (i5 < arrayList6.size()) {
                                String strM1793m3 = AbstractC0716wh.m1793m(m742w("tab_title", ""));
                                strM732ab = m732ab((String) AbstractC0716wh.m1797q((String) arrayListM1797q.get(i5), strM1793m3.split("&&")[0], strM1793m3.split("&&")[1]).get(0));
                                i6 = 0;
                                while (i6 < arrayList.size()) {
                                    arrayList5 = arrayList;
                                    if (strM732ab.equals(arrayList5.get(i6))) {
                                        strM732ab = strM732ab + "" + (i5 + 1);
                                    }
                                    i6++;
                                    arrayList = arrayList5;
                                }
                                arrayList5 = arrayList;
                                arrayList5.add(strM732ab);
                                i5++;
                                arrayList = arrayList5;
                            }
                            arrayList2 = arrayList;
                        } else {
                            arrayList2 = arrayList;
                            str4 = str2;
                            i = 0;
                            while (i < arrayList6.size()) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("列表");
                                i++;
                                sb5.append(i);
                                arrayList2.add(sb5.toString());
                            }
                        }
                    } else {
                        arrayList2 = arrayList;
                        str4 = str2;
                        i = 0;
                        while (i < arrayList6.size()) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("列表");
                            i++;
                            sb6.append(i);
                            arrayList2.add(sb6.toString());
                        }
                    }
                    str5 = "[不包含:";
                    strArr = new String[]{str5, "[排序:", "[替换:"};
                    i2 = 0;
                    while (i2 < 3) {
                        String str210 = strArr[i2];
                        if (!m742w("tab_title", "").contains(str5) && str210.contains(str5)) {
                            String[] strArrSplit3 = m742w("tab_title", "").split("\\[不包含:")[1].split("\\]")[0].split(",");
                            int i10 = 0;
                            while (true) {
                                str11 = str4;
                                if (i10 >= strArrSplit3.length) {
                                    break;
                                }
                                int i11 = 0;
                                while (i11 < arrayList6.size()) {
                                    String str33 = str;
                                    if (((String) arrayList2.get(i11)).contains(strArrSplit3[i10]) && arrayList6.size() > 1) {
                                        arrayList2.remove(i11);
                                        arrayList6.remove(i11);
                                    }
                                    i11++;
                                    str = str33;
                                }
                                i10++;
                                str4 = str11;
                            }
                        } else {
                            str11 = str4;
                        }
                        String str211 = str;
                        if (m742w("tab_title", "").contains("[排序:") && str210.contains("[排序:")) {
                            arrayList3 = new ArrayList();
                            arrayList4 = new ArrayList();
                            while (i3 < r6.length) {
                                while (i4 < arrayList6.size()) {
                                    if (((String) arrayList2.get(i4)).contains(str27)) {
                                        arrayList4.add((String) arrayList2.get(i4));
                                        arrayList3.add((String) arrayList6.get(i4));
                                        arrayList2.remove(i4);
                                        arrayList6.remove(i4);
                                    }
                                }
                            }
                            arrayList6.addAll(0, arrayList3);
                            arrayList2.addAll(0, arrayList4);
                        }
                        if (!m742w("tab_title", "").contains("[替换:") && str210.contains("[替换:")) {
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                arrayList2.set(i12, AbstractC0716wh.m1794n((String) arrayList2.get(i12), m742w("tab_title", "")));
                            }
                        }
                        i2++;
                        strArr = strArr;
                        str = str211;
                        str5 = str5;
                        str4 = str11;
                    }
                    str6 = str4;
                    str7 = str;
                    if (!m742w("proj_actor", "").isEmpty()) {
                        str8 = str7;
                        str9 = str6;
                        strReplaceAll = ((String) AbstractC0716wh.m1797q(str9, m742w("proj_actor", "").split(str8)[0], m742w("proj_actor", "").split(str8)[1]).get(0)).replaceAll("\\&nbsp;", " ").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("\\s{2,}", "");
                        if (m742w("proj_plot", "").isEmpty()) {
                            str10 = (String) AbstractC0716wh.m1797q(str9, m742w("proj_plot", "").split(str8)[0], m742w("proj_plot", "").split(str8)[1]).get(0);
                        } else {
                            str10 = "";
                        }
                    } else {
                        str8 = str7;
                        str9 = str6;
                    }
                    strReplaceAll = "";
                    if (m742w("proj_plot", "").isEmpty()) {
                        str10 = (String) AbstractC0716wh.m1797q(str9, m742w("proj_plot", "").split(str8)[0], m742w("proj_plot", "").split(str8)[1]).get(0);
                    } else {
                        str10 = "";
                    }
                }
                str2 = strM727k;
                str3 = str15;
                if (m742w("tab_title", "").isEmpty()) {
                    str12 = str3;
                    if (m742w(str12, "").isEmpty()) {
                        if (m742w("tab_YN_twice", "").equals("1")) {
                            str4 = str2;
                            str13 = (String) AbstractC0716wh.m1797q(str4, m742w("tab_twice_pre", ""), m742w("tab_twice_suf", "")).get(0);
                        } else {
                            str4 = str2;
                            str13 = str4;
                        }
                        arrayListM1797q = AbstractC0716wh.m1797q(str13, m742w(str12, ""), m742w("tab_arr_suf", ""));
                        i5 = 0;
                        while (i5 < arrayList6.size()) {
                            String strM1793m4 = AbstractC0716wh.m1793m(m742w("tab_title", ""));
                            strM732ab = m732ab((String) AbstractC0716wh.m1797q((String) arrayListM1797q.get(i5), strM1793m4.split("&&")[0], strM1793m4.split("&&")[1]).get(0));
                            i6 = 0;
                            while (i6 < arrayList.size()) {
                                arrayList5 = arrayList;
                                if (strM732ab.equals(arrayList5.get(i6))) {
                                    strM732ab = strM732ab + "" + (i5 + 1);
                                }
                                i6++;
                                arrayList = arrayList5;
                            }
                            arrayList5 = arrayList;
                            arrayList5.add(strM732ab);
                            i5++;
                            arrayList = arrayList5;
                        }
                        arrayList2 = arrayList;
                    } else {
                        arrayList2 = arrayList;
                        str4 = str2;
                        i = 0;
                        while (i < arrayList6.size()) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("列表");
                            i++;
                            sb7.append(i);
                            arrayList2.add(sb7.toString());
                        }
                    }
                } else {
                    arrayList2 = arrayList;
                    str4 = str2;
                    i = 0;
                    while (i < arrayList6.size()) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("列表");
                        i++;
                        sb8.append(i);
                        arrayList2.add(sb8.toString());
                    }
                }
                str5 = "[不包含:";
                strArr = new String[]{str5, "[排序:", "[替换:"};
                i2 = 0;
                while (i2 < 3) {
                    String str212 = strArr[i2];
                    if (!m742w("tab_title", "").contains(str5)) {
                        str11 = str4;
                    } else {
                        str11 = str4;
                    }
                    String str213 = str;
                    if (m742w("tab_title", "").contains("[排序:")) {
                        arrayList3 = new ArrayList();
                        arrayList4 = new ArrayList();
                        while (i3 < r6.length) {
                            while (i4 < arrayList6.size()) {
                                if (((String) arrayList2.get(i4)).contains(str27)) {
                                    arrayList4.add((String) arrayList2.get(i4));
                                    arrayList3.add((String) arrayList6.get(i4));
                                    arrayList2.remove(i4);
                                    arrayList6.remove(i4);
                                }
                            }
                        }
                        arrayList6.addAll(0, arrayList3);
                        arrayList2.addAll(0, arrayList4);
                    }
                    if (!m742w("tab_title", "").contains("[替换:")) {
                    }
                    i2++;
                    strArr = strArr;
                    str = str213;
                    str5 = str5;
                    str4 = str11;
                }
                str6 = str4;
                str7 = str;
                if (!m742w("proj_actor", "").isEmpty()) {
                    str8 = str7;
                    str9 = str6;
                    strReplaceAll = ((String) AbstractC0716wh.m1797q(str9, m742w("proj_actor", "").split(str8)[0], m742w("proj_actor", "").split(str8)[1]).get(0)).replaceAll("\\&nbsp;", " ").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("\\s{2,}", "");
                    if (m742w("proj_plot", "").isEmpty()) {
                        str10 = (String) AbstractC0716wh.m1797q(str9, m742w("proj_plot", "").split(str8)[0], m742w("proj_plot", "").split(str8)[1]).get(0);
                    } else {
                        str10 = "";
                    }
                } else {
                    str8 = str7;
                    str9 = str6;
                }
                strReplaceAll = "";
                if (m742w("proj_plot", "").isEmpty()) {
                    str10 = (String) AbstractC0716wh.m1797q(str9, m742w("proj_plot", "").split(str8)[0], m742w("proj_plot", "").split(str8)[1]).get(0);
                } else {
                    str10 = "";
                }
            }
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("vod_id", list.get(0));
            jSONObject11.put("vod_name", str19);
            jSONObject11.put("vod_pic", str18);
            jSONObject11.put("type_name", "");
            jSONObject11.put("vod_year", "");
            jSONObject11.put("vod_area", "");
            jSONObject11.put("vod_remarks", "");
            jSONObject11.put("vod_actor", strReplaceAll);
            jSONObject11.put("vod_director", "");
            jSONObject11.put("vod_content", str10);
            String strJoin11 = TextUtils.join("$$$", arrayList2);
            String strJoin12 = TextUtils.join("$$$", arrayList6);
            jSONObject11.put("vod_play_from", strJoin11);
            jSONObject11.put("vod_play_url", strJoin12);
            JSONObject jSONObject12 = new JSONObject();
            JSONArray jSONArray6 = new JSONArray();
            jSONArray6.put(jSONObject11);
            jSONObject12.put("list", jSONArray6);
            return jSONObject12.toString();
        } catch (Exception e7) {
            SpiderDebug.log(e7);
            return "";
        }
    }

    public String homeContent(boolean z) {
        Object jSONObject;
        try {
            m738s();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strM742w = m742w("class_value", "");
            String strM742w2 = m742w("class_url", "");
            String strM742w3 = m742w("fclass_name", "");
            String strM742w4 = m742w("fclass_value", "");
            String strM742w5 = m742w("fcatelog_name", "");
            String strM742w6 = m742w("fcatelog_value", "");
            String strM742w7 = m742w("farea_name", "");
            String strM742w8 = m742w("farea_value", "");
            String strM742w9 = m742w("fyear_name", m729m());
            String strM742w10 = m742w("fyear_value", Marker.ANY_MARKER);
            String strM742w11 = m742w("flang_name", "");
            String strM742w12 = m742w("flang_value", "");
            String strM742w13 = m742w("fsort_name", "时间&人气&评分");
            String strM742w14 = m742w("fsort_value", "time&hits&score");
            String[] strArrSplit = m742w("class_name", "").split("&");
            String[] strArrSplit2 = strM742w.split("&");
            int i = 0;
            while (i < strArrSplit.length) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type_id", strArrSplit2[i].replaceAll("＆＆", "&"));
                jSONObject3.put("type_name", strArrSplit[i]);
                jSONArray.put(jSONObject3);
                i++;
                strM742w7 = strM742w7;
                strM742w6 = strM742w6;
                strM742w5 = strM742w5;
            }
            String str = strM742w5;
            String str2 = strM742w6;
            String str3 = strM742w7;
            jSONObject2.put("class", jSONArray);
            try {
                String strM742w15 = m742w("filterdata", "");
                InetAddress.getLocalHost();
                if (strM742w15.startsWith("clan://") || strM742w15.startsWith("http") || strM742w15.startsWith("./")) {
                    jSONObject = null;
                    String strTrim = AbstractC0771yi.m1889k(strM742w15, null).trim();
                    if (strTrim.startsWith("{") && strTrim.endsWith("}")) {
                        jSONObject = new JSONObject(strTrim);
                    }
                } else {
                    jSONObject = strM742w15.equalsIgnoreCase("EXT") ? m728l(strM742w, strM742w2, strM742w3, strM742w4, str, str2, str3, strM742w8, strM742w9, strM742w10, strM742w11, strM742w12, strM742w13, strM742w14) : this.f344i.optJSONObject("filterdata");
                }
                if (z && jSONObject != null) {
                    jSONObject2.put("filters", jSONObject);
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String homeVideoContent() {
        JSONArray jSONArrayOptJSONArray;
        try {
            m738s();
            if (m742w("homeContent", "").equals("1")) {
                JSONArray jSONArray = new JSONArray();
                for (String str : m742w("class_value", "").split("&")) {
                    JSONObject jSONObjectM735p = m735p(str.replaceAll("＆＆", "&"), "1", false, new HashMap());
                    if (jSONObjectM735p != null && (jSONArrayOptJSONArray = jSONObjectM735p.optJSONArray("list")) != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length() && i < 5; i++) {
                            jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i));
                        }
                    }
                    if (jSONArray.length() >= 20) {
                        break;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("list", jSONArray);
                return jSONObject.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.f343h = str;
    }

    public boolean isVideoFormat(String str) {
        m738s();
        String[] strArrSplit = m742w("VideoFormat", ".m3u8#.mp4#.flv#video/tos#.mp3#.m4a").toLowerCase().split("#");
        String[] strArrSplit2 = m742w("VideoFilter", "=http#.html").toLowerCase().split("#");
        String lowerCase = str.toLowerCase();
        if ((lowerCase.contains("=http") || lowerCase.contains(".html")) && !checkstring(lowerCase)) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (lowerCase.contains(str2)) {
                for (String str3 : strArrSplit2) {
                    if (lowerCase.contains(str3) && !checkstring(lowerCase)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean manualVideoCheck() {
        m738s();
        return m742w("ManualSniffer", "").equals("1");
    }

    /* JADX INFO: renamed from: o */
    public final String m734o(String str, String str2, String str3, HashMap map) {
        try {
            SpiderDebug.log(str);
            C00684 c00684 = new C00684();
            AbstractC0771yi.m1888j(AbstractC0771yi.m1884f(), str, str2, map, c00684);
            return new String(((Response) c00684.getResult()).body().bytes(), str3).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:127:0x0421 A[Catch: Exception -> 0x044d, TRY_LEAVE, TryCatch #3 {Exception -> 0x044d, blocks: (B:125:0x041b, B:127:0x0421, B:133:0x0432), top: B:244:0x041b }] */
    /* JADX WARN: Code duplicated, block: B:132:0x042e A[Catch: Exception -> 0x044f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x044f, blocks: (B:124:0x0417, B:132:0x042e), top: B:240:0x0417 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0459  */
    /* JADX WARN: Code duplicated, block: B:220:0x0624  */
    /* JADX WARN: Code duplicated, block: B:233:0x06a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:235:0x06a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:240:0x0417 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0443 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x05ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public final JSONObject m735p(String str, String str2, boolean z, HashMap map) {
        String str3;
        String strM736q;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String str4;
        String strM739t;
        String strM1787g;
        String str5;
        String str6;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        String str7;
        String str8;
        int i;
        String str9;
        JSONObject jSONObject;
        String str10;
        String strM739t2;
        String strM1787g2;
        String strTrim;
        HashMap map2 = map;
        String str11 = "cat_subtitle";
        String str12 = "cat_url";
        String str13 = "cat_pic";
        String str14 = "cat_title";
        String str15 = "&&";
        try {
            m738s();
            String str16 = "catjsonpic";
            this.f340e = m742w("Coding_format", "UTF-8");
            String strValueOf = String.valueOf(Integer.parseInt(m742w("firstpage", "1")));
            String strValueOf2 = strValueOf.equals("0") ? String.valueOf(Integer.parseInt(str2) - 1) : String.valueOf((Integer.parseInt(str2) - 1) + Integer.parseInt(m742w("firstpage", "1")));
            String strM742w = m742w("class_url", "");
            String str17 = strM742w.contains("{catePg}") ? "0" : "1";
            if (strM742w.contains("firstPage=")) {
                str3 = "\\?";
                strM742w = (strValueOf2.equals("0") && strValueOf.equals("0")) ? strM742w.split("\\[firstPage=")[1].split("\\]")[0] : (strValueOf2.equals("1") && strValueOf.equals("1")) ? strM742w.split("\\[firstPage=")[1].split("\\]")[0] : strM742w.split("\\[firstPage=")[0];
            } else {
                str3 = "\\?";
            }
            if (z && map2 != null && map.size() > 0) {
                for (String str18 : map.keySet()) {
                    String str19 = (String) map2.get(str18);
                    if (str19.length() > 0) {
                        strM742w = strM742w.replace("{" + str18 + "}", URLEncoder.encode(str19));
                    }
                    map2 = map;
                }
            }
            String strReplaceAll = strM742w.replaceAll("\\{cateId\\}", str);
            if (!strReplaceAll.contains("{catePg}") && !m742w("class_url", "").contains("{catePg}")) {
                if (strValueOf2.equals("0") && Integer.parseInt(strValueOf2) >= Integer.parseInt(str17)) {
                    return null;
                }
                if (!strValueOf2.equals("0") && Integer.parseInt(strValueOf2) > Integer.parseInt(str17)) {
                    return null;
                }
            }
            String strReplaceAll2 = strReplaceAll.replaceAll("\\{catePg\\}", strValueOf2);
            Matcher matcher = Pattern.compile("\\{(.*?)\\}").matcher(strReplaceAll2);
            while (matcher.find()) {
                strReplaceAll2 = strReplaceAll2.replace(matcher.group(0), "").replace("/" + matcher.group(0).replace("{", "").replace("}", "") + "/", "");
            }
            String strReplaceAll3 = strReplaceAll2.replaceAll("时间戳", String.valueOf(System.currentTimeMillis() / 1000)).replaceAll("时间标", String.valueOf(System.currentTimeMillis()));
            if (strReplaceAll3.contains("md5(")) {
                String str20 = (String) AbstractC0716wh.m1797q(strReplaceAll3, "md5(", ")").get(0);
                strReplaceAll3 = strReplaceAll3.replace("md5(" + str20 + ")", AbstractC0405ku.m1360d(str20, AbstractC0405ku.f1107c));
            }
            String strReplaceAll4 = strReplaceAll3.replaceAll("｛", "{").replaceAll("｝", "}");
            if (strReplaceAll4.contains(";post")) {
                String str21 = str3;
                String strTrim2 = strReplaceAll4.split(str21)[0].replaceAll("？？", "?").trim();
                String strTrim3 = strReplaceAll4.split(str21)[1].split(";")[0].replaceAll("？？", "?").trim();
                if (strTrim3.isEmpty()) {
                    strM736q = m737r(strTrim2, null, this.f340e, m740u(strTrim2));
                } else if (strTrim3.startsWith("{") && strTrim3.endsWith("}")) {
                    strM736q = m734o(strTrim2, new JSONObject(strTrim3).toString(), this.f340e, m740u(strTrim2));
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String[] strArrSplit = strTrim3.split("&");
                    int length = strArrSplit.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str22 = strArrSplit[i2];
                        int iIndexOf = str22.indexOf("=");
                        linkedHashMap.put(str22.substring(0, iIndexOf), str22.substring(iIndexOf + 1));
                        i2++;
                        strArrSplit = strArrSplit;
                    }
                    strM736q = m737r(strTrim2, linkedHashMap, this.f340e, m740u(strTrim2));
                    if (strM736q.contains("输入验证码") && checkveriry(strM736q)) {
                        strM736q = m731aa(linkedHashMap, strTrim2, "show", vertype(strM736q));
                    }
                }
            } else {
                strM736q = m736q(strReplaceAll4, this.f340e, m740u(strReplaceAll4));
                if (strM736q.contains("检测中") && strM736q.contains("btwaf")) {
                    strM736q = m745z(strReplaceAll4, strM736q, "show");
                }
                if (strM736q.contains("/huadong_") || strM736q.contains("/renji_")) {
                    strM736q = m744y(strReplaceAll4, strM736q, "show");
                }
                if (strM736q.contains("输入验证码") && checkveriry(strM736q)) {
                    strM736q = m731aa(null, strReplaceAll4, "show", vertype(strM736q));
                }
            }
            String strM727k = m727k(strM736q);
            boolean zEquals = m742w("cat_mode", "").equals("0");
            boolean zEquals2 = m742w("PicNeedProxy", "").equals("1");
            boolean zEquals3 = m742w("cat_YN_twice", "").equals("1");
            JSONArray jSONArray5 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            String str23 = "http";
            String str24 = "cat_suffix";
            String str25 = "cat_prefix";
            String str26 = strValueOf2;
            JSONArray jSONArray6 = jSONArray5;
            String str27 = "vod_remarks";
            if (zEquals) {
                if (zEquals3) {
                    strM727k = (String) AbstractC0716wh.m1797q(strM727k, m742w("cat_twice_pre", ""), m742w("cat_twice_suf", "")).get(0);
                }
                JSONObject jSONObject3 = new JSONObject(strM727k);
                String[] strArrSplit2 = m742w("catjsonlist", "data").split("\\.");
                if (strArrSplit2.length == 1) {
                    jSONArray4 = jSONObject3.getJSONArray(strArrSplit2[0]);
                } else if (strArrSplit2.length == 2) {
                    jSONArray4 = jSONObject3.getJSONObject(strArrSplit2[0]).getJSONArray(strArrSplit2[1]);
                } else if (strArrSplit2.length == 3) {
                    jSONArray4 = jSONObject3.getJSONObject(strArrSplit2[0]).getJSONObject(strArrSplit2[1]).getJSONArray(strArrSplit2[2]);
                } else {
                    if (strArrSplit2.length == 4) {
                        jSONArray4 = jSONObject3.getJSONObject(strArrSplit2[0]).getJSONObject(strArrSplit2[1]).getJSONObject(strArrSplit2[2]).getJSONArray(strArrSplit2[3]);
                    } else {
                        jSONArray3 = null;
                    }
                    str7 = "";
                    str8 = str7;
                    i = 0;
                    while (i < jSONArray3.length()) {
                        str9 = str7;
                        try {
                            jSONObject = jSONArray3.getJSONObject(i);
                            JSONArray jSONArray7 = jSONArray3;
                            String strTrim4 = jSONObject.optString(m742w("catjsonname", "")).trim();
                            String strTrim5 = jSONObject.optString(m742w("catjsonid", "")).trim();
                            String str28 = str8;
                            StringBuilder sb = new StringBuilder();
                            int i3 = i;
                            sb.append(m742w("cat_prefix", ""));
                            sb.append(strTrim5);
                            sb.append(m742w(str24, ""));
                            String string = sb.toString();
                            str10 = str16;
                            if (m742w(str10, "").isEmpty()) {
                                str16 = str10;
                                strM739t2 = str9;
                            } else {
                                try {
                                    try {
                                        if (m742w(str10, "").startsWith("http")) {
                                            strM1787g2 = m742w(str10, "");
                                            str16 = str10;
                                        } else {
                                            str16 = str10;
                                            try {
                                                strM1787g2 = AbstractC0716wh.m1787g(strReplaceAll4, jSONObject.optString(m742w(str10, "")).trim());
                                            } catch (Exception e) {
                                                e = e;
                                                strM739t2 = str9;
                                                SpiderDebug.log(e);
                                                strTrim = jSONObject.optString(m742w("catjsonstitle", "")).trim();
                                                JSONObject jSONObject4 = new JSONObject();
                                                String str29 = str24;
                                                jSONObject4.put("vod_id", strTrim4 + "$$$" + strM739t2 + "$$$" + string);
                                                jSONObject4.put("vod_name", strTrim4);
                                                jSONObject4.put("vod_pic", strM739t2);
                                                String str30 = str27;
                                                jSONObject4.put(str30, strTrim);
                                                jSONArray = jSONArray6;
                                                jSONArray.put(jSONObject4);
                                                i = i3 + 1;
                                                str27 = str30;
                                                str7 = strM739t2;
                                                jSONArray6 = jSONArray;
                                                jSONArray3 = jSONArray7;
                                                str24 = str29;
                                                str8 = strTrim;
                                            }
                                        }
                                        strM739t2 = strM1787g2;
                                        if (zEquals2) {
                                            try {
                                                strM739t2 = m739t(strM739t2, strReplaceAll4);
                                            } catch (Exception e2) {
                                                e = e2;
                                                SpiderDebug.log(e);
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        str16 = str10;
                                        strM739t2 = str9;
                                        SpiderDebug.log(e);
                                        strTrim = jSONObject.optString(m742w("catjsonstitle", "")).trim();
                                        JSONObject jSONObject5 = new JSONObject();
                                        String str210 = str24;
                                        jSONObject5.put("vod_id", strTrim4 + "$$$" + strM739t2 + "$$$" + string);
                                        jSONObject5.put("vod_name", strTrim4);
                                        jSONObject5.put("vod_pic", strM739t2);
                                        String str31 = str27;
                                        jSONObject5.put(str31, strTrim);
                                        jSONArray = jSONArray6;
                                        jSONArray.put(jSONObject5);
                                        i = i3 + 1;
                                        str27 = str31;
                                        str7 = strM739t2;
                                        jSONArray6 = jSONArray;
                                        jSONArray3 = jSONArray7;
                                        str24 = str210;
                                        str8 = strTrim;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                }
                            }
                            try {
                                strTrim = jSONObject.optString(m742w("catjsonstitle", "")).trim();
                            } catch (Exception e5) {
                                SpiderDebug.log(e5);
                                strTrim = str28;
                            }
                            JSONObject jSONObject6 = new JSONObject();
                            String str211 = str24;
                            jSONObject6.put("vod_id", strTrim4 + "$$$" + strM739t2 + "$$$" + string);
                            jSONObject6.put("vod_name", strTrim4);
                            jSONObject6.put("vod_pic", strM739t2);
                            String str32 = str27;
                            jSONObject6.put(str32, strTrim);
                            jSONArray = jSONArray6;
                            try {
                                jSONArray.put(jSONObject6);
                                i = i3 + 1;
                                str27 = str32;
                                str7 = strM739t2;
                                jSONArray6 = jSONArray;
                                jSONArray3 = jSONArray7;
                                str24 = str211;
                                str8 = strTrim;
                            } catch (Exception e6) {
                                e = e6;
                                SpiderDebug.log(e);
                                jSONArray2 = jSONArray;
                                jSONObject2.put("page", str26);
                                jSONObject2.put("pagecount", Integer.MAX_VALUE);
                                jSONObject2.put("limit", jSONArray2.length());
                                jSONObject2.put("total", Integer.MAX_VALUE);
                                jSONObject2.put("list", jSONArray2);
                                if (jSONArray2.length() < 1) {
                                    return null;
                                }
                                return jSONObject2;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            jSONArray = jSONArray6;
                            SpiderDebug.log(e);
                            jSONArray2 = jSONArray;
                            jSONObject2.put("page", str26);
                            jSONObject2.put("pagecount", Integer.MAX_VALUE);
                            jSONObject2.put("limit", jSONArray2.length());
                            jSONObject2.put("total", Integer.MAX_VALUE);
                            jSONObject2.put("list", jSONArray2);
                            if (jSONArray2.length() < 1) {
                                return null;
                            }
                            return jSONObject2;
                        }
                    }
                    jSONArray = jSONArray6;
                }
                jSONArray3 = jSONArray4;
                str7 = "";
                str8 = str7;
                i = 0;
                while (i < jSONArray3.length()) {
                    str9 = str7;
                    jSONObject = jSONArray3.getJSONObject(i);
                    JSONArray jSONArray8 = jSONArray3;
                    String strTrim6 = jSONObject.optString(m742w("catjsonname", "")).trim();
                    String strTrim7 = jSONObject.optString(m742w("catjsonid", "")).trim();
                    String str212 = str8;
                    StringBuilder sb2 = new StringBuilder();
                    int i4 = i;
                    sb2.append(m742w("cat_prefix", ""));
                    sb2.append(strTrim7);
                    sb2.append(m742w(str24, ""));
                    String string2 = sb2.toString();
                    str10 = str16;
                    if (m742w(str10, "").isEmpty()) {
                        if (m742w(str10, "").startsWith("http")) {
                            strM1787g2 = m742w(str10, "");
                            str16 = str10;
                        } else {
                            str16 = str10;
                            strM1787g2 = AbstractC0716wh.m1787g(strReplaceAll4, jSONObject.optString(m742w(str10, "")).trim());
                        }
                        strM739t2 = strM1787g2;
                        if (zEquals2) {
                            strM739t2 = m739t(strM739t2, strReplaceAll4);
                        }
                    } else {
                        str16 = str10;
                        strM739t2 = str9;
                    }
                    strTrim = jSONObject.optString(m742w("catjsonstitle", "")).trim();
                    JSONObject jSONObject7 = new JSONObject();
                    String str213 = str24;
                    jSONObject7.put("vod_id", strTrim6 + "$$$" + strM739t2 + "$$$" + string2);
                    jSONObject7.put("vod_name", strTrim6);
                    jSONObject7.put("vod_pic", strM739t2);
                    String str33 = str27;
                    jSONObject7.put(str33, strTrim);
                    jSONArray = jSONArray6;
                    jSONArray.put(jSONObject7);
                    i = i4 + 1;
                    str27 = str33;
                    str7 = strM739t2;
                    jSONArray6 = jSONArray;
                    jSONArray3 = jSONArray8;
                    str24 = str213;
                    str8 = strTrim;
                }
                jSONArray = jSONArray6;
            } else {
                String str34 = "cat_suffix";
                jSONArray = jSONArray6;
                if (zEquals3) {
                    strM727k = (String) AbstractC0716wh.m1797q(strM727k, m742w("cat_twice_pre", ""), m742w("cat_twice_suf", "")).get(0);
                }
                ArrayList arrayListM1797q = AbstractC0716wh.m1797q(strM727k, m742w("cat_arr_pre", ""), m742w("cat_arr_suf", ""));
                String str35 = "";
                String strM732ab = str35;
                int i5 = 0;
                while (i5 < arrayListM1797q.size()) {
                    try {
                        ArrayList arrayList = arrayListM1797q;
                        String str36 = (String) arrayListM1797q.get(i5);
                        String str37 = str35;
                        String str38 = str14;
                        int i6 = i5;
                        String str39 = str15;
                        JSONArray jSONArray9 = jSONArray;
                        try {
                            String strM732ab2 = m732ab((String) AbstractC0716wh.m1797q(str36, m742w(str38, "").split(str39)[0], m742w(str38, "").split(str39)[1]).get(0));
                            String str40 = str13;
                            if (m742w(str40, "").isEmpty()) {
                                str4 = str23;
                                strM739t = str37;
                            } else {
                                try {
                                    try {
                                        if (m742w(str40, "").startsWith(str23)) {
                                            strM1787g = m742w(str40, "");
                                            str4 = str23;
                                        } else {
                                            str4 = str23;
                                            try {
                                                strM1787g = AbstractC0716wh.m1787g(strReplaceAll4, (String) AbstractC0716wh.m1797q(str36, m742w(str40, "").split(str39)[0], m742w(str40, "").split(str39)[1]).get(0));
                                            } catch (Exception e8) {
                                                e = e8;
                                                strM739t = str37;
                                                SpiderDebug.log(e);
                                                boolean z2 = zEquals2;
                                                String str41 = str12;
                                                String str42 = strReplaceAll4;
                                                String str43 = (String) AbstractC0716wh.m1797q(str36, m741v(str41).split(str39)[0], m741v(str41).split(str39)[1]).get(0);
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(m742w(str25, ""));
                                                sb3.append(str43);
                                                String str44 = str34;
                                                sb3.append(m742w(str44, ""));
                                                String string3 = sb3.toString();
                                                str34 = str44;
                                                str5 = str11;
                                                if (m741v(str5).isEmpty()) {
                                                    str6 = str25;
                                                } else {
                                                    try {
                                                        str6 = str25;
                                                        try {
                                                            try {
                                                                strM732ab = m732ab((String) AbstractC0716wh.m1797q(str36, m741v(str5).split(str39)[0], m741v(str5).split(str39)[1]).get(0));
                                                            } catch (Exception e9) {
                                                                e = e9;
                                                                SpiderDebug.log(e);
                                                            }
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        str6 = str25;
                                                    }
                                                }
                                                String str45 = strM732ab;
                                                JSONObject jSONObject8 = new JSONObject();
                                                jSONObject8.put("vod_id", strM732ab2 + "$$$" + strM739t + "$$$" + string3);
                                                jSONObject8.put("vod_name", strM732ab2);
                                                jSONObject8.put("vod_pic", strM739t);
                                                jSONObject8.put(str27, str45);
                                                jSONArray2 = jSONArray9;
                                                jSONArray2.put(jSONObject8);
                                                int i7 = i6 + 1;
                                                strM732ab = str45;
                                                jSONArray = jSONArray2;
                                                str15 = str39;
                                                str25 = str6;
                                                str14 = str38;
                                                arrayListM1797q = arrayList;
                                                str11 = str5;
                                                i5 = i7;
                                                strReplaceAll4 = str42;
                                                str12 = str41;
                                                zEquals2 = z2;
                                                String str46 = str4;
                                                str13 = str40;
                                                str35 = strM739t;
                                                str23 = str46;
                                            }
                                        }
                                        strM739t = strM1787g;
                                        if (zEquals2) {
                                            try {
                                                strM739t = m739t(strM739t, strReplaceAll4);
                                            } catch (Exception e12) {
                                                e = e12;
                                                SpiderDebug.log(e);
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        str4 = str23;
                                        strM739t = str37;
                                        SpiderDebug.log(e);
                                        boolean z3 = zEquals2;
                                        String str47 = str12;
                                        String str48 = strReplaceAll4;
                                        String str49 = (String) AbstractC0716wh.m1797q(str36, m741v(str47).split(str39)[0], m741v(str47).split(str39)[1]).get(0);
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(m742w(str25, ""));
                                        sb4.append(str49);
                                        String str410 = str34;
                                        sb4.append(m742w(str410, ""));
                                        String string4 = sb4.toString();
                                        str34 = str410;
                                        str5 = str11;
                                        if (m741v(str5).isEmpty()) {
                                            str6 = str25;
                                            strM732ab = m732ab((String) AbstractC0716wh.m1797q(str36, m741v(str5).split(str39)[0], m741v(str5).split(str39)[1]).get(0));
                                        } else {
                                            str6 = str25;
                                        }
                                        String str411 = strM732ab;
                                        JSONObject jSONObject9 = new JSONObject();
                                        jSONObject9.put("vod_id", strM732ab2 + "$$$" + strM739t + "$$$" + string4);
                                        jSONObject9.put("vod_name", strM732ab2);
                                        jSONObject9.put("vod_pic", strM739t);
                                        jSONObject9.put(str27, str411);
                                        jSONArray2 = jSONArray9;
                                        jSONArray2.put(jSONObject9);
                                        int i8 = i6 + 1;
                                        strM732ab = str411;
                                        jSONArray = jSONArray2;
                                        str15 = str39;
                                        str25 = str6;
                                        str14 = str38;
                                        arrayListM1797q = arrayList;
                                        str11 = str5;
                                        i5 = i8;
                                        strReplaceAll4 = str48;
                                        str12 = str47;
                                        zEquals2 = z3;
                                        String str412 = str4;
                                        str13 = str40;
                                        str35 = strM739t;
                                        str23 = str412;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                }
                            }
                            boolean z4 = zEquals2;
                            String str413 = str12;
                            String str414 = strReplaceAll4;
                            String str415 = (String) AbstractC0716wh.m1797q(str36, m741v(str413).split(str39)[0], m741v(str413).split(str39)[1]).get(0);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(m742w(str25, ""));
                            sb5.append(str415);
                            String str416 = str34;
                            sb5.append(m742w(str416, ""));
                            String string5 = sb5.toString();
                            str34 = str416;
                            str5 = str11;
                            if (m741v(str5).isEmpty()) {
                                str6 = str25;
                                strM732ab = m732ab((String) AbstractC0716wh.m1797q(str36, m741v(str5).split(str39)[0], m741v(str5).split(str39)[1]).get(0));
                            } else {
                                str6 = str25;
                            }
                            String str417 = strM732ab;
                            JSONObject jSONObject10 = new JSONObject();
                            jSONObject10.put("vod_id", strM732ab2 + "$$$" + strM739t + "$$$" + string5);
                            jSONObject10.put("vod_name", strM732ab2);
                            jSONObject10.put("vod_pic", strM739t);
                            jSONObject10.put(str27, str417);
                            jSONArray2 = jSONArray9;
                            try {
                                jSONArray2.put(jSONObject10);
                                int i9 = i6 + 1;
                                strM732ab = str417;
                                jSONArray = jSONArray2;
                                str15 = str39;
                                str25 = str6;
                                str14 = str38;
                                arrayListM1797q = arrayList;
                                str11 = str5;
                                i5 = i9;
                                strReplaceAll4 = str414;
                                str12 = str413;
                                zEquals2 = z4;
                                String str418 = str4;
                                str13 = str40;
                                str35 = strM739t;
                                str23 = str418;
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                jSONObject2.put("page", str26);
                                jSONObject2.put("pagecount", Integer.MAX_VALUE);
                                jSONObject2.put("limit", jSONArray2.length());
                                jSONObject2.put("total", Integer.MAX_VALUE);
                                jSONObject2.put("list", jSONArray2);
                                if (jSONArray2.length() < 1) {
                                    return null;
                                }
                                return jSONObject2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            jSONArray2 = jSONArray9;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jSONArray2 = jSONArray;
                    }
                }
            }
            jSONArray2 = jSONArray;
            jSONObject2.put("page", str26);
            jSONObject2.put("pagecount", Integer.MAX_VALUE);
            jSONObject2.put("limit", jSONArray2.length());
            jSONObject2.put("total", Integer.MAX_VALUE);
            jSONObject2.put("list", jSONArray2);
            if (jSONArray2.length() < 1) {
                return null;
            }
            return jSONObject2;
        } catch (Exception e15) {
            SpiderDebug.log(e15);
            return null;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25861. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public java.lang.String playerContent(java.lang.String r35, java.lang.String r36, java.util.List<java.lang.String> r37) {
        /*
            Method dump skipped, instruction units count: 2586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XYQBiu.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    /* JADX INFO: renamed from: q */
    public final String m736q(String str, String str2, HashMap map) {
        try {
            SpiderDebug.log(str);
            C00662 c00662 = new C00662();
            if (str.startsWith("clan://")) {
                return AbstractC0771yi.m1889k(str.replace("clan://", Proxy.localProxyUrl().replace("/proxy", "/file/")), null);
            }
            AbstractC0771yi.m1885g(AbstractC0771yi.m1884f(), str, map, c00662);
            return new String(((Response) c00662.getResult()).body().bytes(), str2).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final String m737r(String str, HashMap map, String str2, HashMap map2) {
        try {
            SpiderDebug.log(str);
            C00673 c00673 = new C00673();
            AbstractC0771yi.m1887i(AbstractC0771yi.m1884f(), str, map, map2, c00673);
            return new String(((Response) c00673.getResult()).body().bytes(), str2).replaceAll("\r|\n", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m738s() {
        String str;
        if (this.f344i != null || (str = this.f343h) == null) {
            return;
        }
        try {
            if (str.startsWith("http")) {
                this.f344i = new JSONObject(AbstractC0771yi.m1889k(this.f343h, null));
            } else {
                this.f344i = new JSONObject(this.f343h);
            }
            this.f345j = m742w("OCR_API", "https://api.nn.ci/ocr/b64/text");
        } catch (JSONException unused) {
        }
    }

    public String searchContent(String str, boolean z) {
        return m733ac(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return m733ac(str, str2);
    }

    /* JADX INFO: renamed from: t */
    public final String m739t(String str, String str2) {
        JSONObject jSONObject = this.f341f;
        try {
            jSONObject.put("referer", str2);
            return str + "@Headers=" + jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: u */
    public final HashMap m740u(String str) throws JSONException {
        HashMap map;
        HashMap map2;
        String str2;
        String str3;
        HashMap map3 = new HashMap();
        String strTrim = m742w("UserAgent", "").trim();
        boolean zContains = strTrim.contains("$");
        JSONObject jSONObject = this.f341f;
        String str4 = "苹果电脑";
        String str5 = "MAC_UA";
        String string = this.f337b;
        if (zContains) {
            String[] strArrSplit = strTrim.split("#");
            HashMap map4 = map3;
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                String[] strArrSplit2 = strArrSplit[i].split("\\$");
                String str6 = strArrSplit2[0];
                String string2 = strArrSplit2[1];
                if (string2.equals("PC_UA") || string2.equals("电脑")) {
                    string2 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
                } else if (string2.equals("MOBILE_UA") || string2.equals("手机")) {
                    string2 = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
                } else if (string2.equals("IOS_UA") || string2.equals("苹果手机")) {
                    string2 = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
                } else if (string2.equals(str5) || string2.equals(str4)) {
                    string2 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
                }
                if (this.f339d.isEmpty() || !str6.equalsIgnoreCase("cookie")) {
                    str5 = str5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string2);
                    if (this.f339d.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = ";" + this.f339d;
                    }
                    sb.append(str2);
                    if (string.isEmpty()) {
                        str3 = "";
                    } else {
                        str3 = ";" + string;
                    }
                    sb.append(str3);
                    string2 = sb.toString();
                }
                if (str6.equalsIgnoreCase("user-agent")) {
                    jSONObject.put("user-agent", string2);
                }
                if (str6.equalsIgnoreCase("referer") || string2.equalsIgnoreCase("WebView")) {
                    map2 = map4;
                    if (!string2.equalsIgnoreCase("WebView")) {
                        map2.put(str6, string2);
                    }
                } else {
                    map2 = map4;
                    map2.put(str6, string2);
                }
                i++;
                map4 = map2;
                strArrSplit = strArr;
                str4 = str4;
                str5 = str5;
            }
            map = map4;
            if (!this.f339d.isEmpty() && this.f339d.length() > 1 && !strTrim.contains("Cookie$") && !strTrim.contains("cookie$")) {
                if (this.f339d.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f339d);
                    if (!string.isEmpty()) {
                        string = ";" + string;
                    }
                    sb2.append(string);
                    string = sb2.toString();
                }
                map.put("Cookie", string);
            }
        } else {
            map = map3;
            if (strTrim.isEmpty()) {
                strTrim = "okhttp/3.12.11";
            } else if (strTrim.equals("PC_UA") || strTrim.equals("电脑")) {
                strTrim = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
            } else if (strTrim.equals("MOBILE_UA") || strTrim.equals("手机")) {
                strTrim = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
            } else if (strTrim.equals("IOS_UA") || strTrim.equals("苹果手机")) {
                strTrim = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
            } else if (strTrim.equals("MAC_UA") || strTrim.equals("苹果电脑")) {
                strTrim = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
            }
            if (!this.f339d.isEmpty() && this.f339d.length() > 1) {
                if (this.f339d.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f339d);
                    if (!string.isEmpty()) {
                        string = ";" + string;
                    }
                    sb3.append(string);
                    string = sb3.toString();
                }
                map.put("Cookie", string);
            }
            map.put("User-Agent", strTrim);
            jSONObject.put("user-agent", strTrim);
        }
        return map;
    }

    /* JADX INFO: renamed from: v */
    public final String m741v(String str) {
        return m742w(str, "");
    }

    /* JADX INFO: renamed from: w */
    public final String m742w(String str, String str2) {
        String strOptString = this.f344i.optString(str);
        return (strOptString.isEmpty() || strOptString.equals("空") || strOptString.equals("&&")) ? str2 : strOptString;
    }

    /* JADX INFO: renamed from: x */
    public final HashMap m743x(String str) throws JSONException {
        HashMap map;
        HashMap map2;
        String str2;
        HashMap map3 = new HashMap();
        String strTrim = m742w("SUserAgent", "").trim();
        boolean zContains = strTrim.contains("$");
        JSONObject jSONObject = this.f341f;
        String strConcat = this.f338c;
        String str3 = "苹果电脑";
        String str4 = "MAC_UA";
        HashMap map4 = map3;
        if (zContains) {
            String[] strArrSplit = strTrim.split("#");
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                String[] strArrSplit2 = strArrSplit[i].split("\\$");
                String str5 = strArrSplit2[0];
                String string = strArrSplit2[1];
                if (string.equals("PC_UA") || string.equals("电脑")) {
                    string = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
                } else if (string.equals("MOBILE_UA") || string.equals("手机")) {
                    string = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
                } else if (string.equals("IOS_UA") || string.equals("苹果手机")) {
                    string = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
                } else if (string.equals(str4) || string.equals(str3)) {
                    string = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
                }
                if (this.f339d.isEmpty() || !str5.equalsIgnoreCase("cookie")) {
                    str4 = str4;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    if (this.f339d.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = ";" + this.f339d;
                    }
                    sb.append(str2);
                    sb.append(!strConcat.isEmpty() ? ";".concat(strConcat) : "");
                    string = sb.toString();
                }
                if (str5.equalsIgnoreCase("user-agent")) {
                    jSONObject.put("user-agent", string);
                }
                if (str5.equalsIgnoreCase("referer") || string.equalsIgnoreCase("WebView")) {
                    map2 = map4;
                    if (!string.equalsIgnoreCase("WebView")) {
                        map2.put(str5, string);
                    }
                } else {
                    map2 = map4;
                    map2.put(str5, string);
                }
                i++;
                strArrSplit = strArr;
                map4 = map2;
                str3 = str3;
                str4 = str4;
            }
            map = map4;
            if (!this.f339d.isEmpty() && this.f339d.length() > 1 && !strTrim.contains("Cookie$") && !strTrim.contains("cookie$")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(!this.f339d.isEmpty() ? strConcat : this.f339d);
                if (!strConcat.isEmpty()) {
                    strConcat = ";".concat(strConcat);
                }
                sb2.append(strConcat);
                map.put("Cookie", sb2.toString());
            }
        } else {
            map = map4;
            if (strTrim.isEmpty()) {
                return m740u(str);
            }
            if (strTrim.equals("PC_UA") || strTrim.equals("电脑")) {
                strTrim = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";
            } else if (strTrim.equals("MOBILE_UA") || strTrim.equals("手机")) {
                strTrim = "Mozilla/5.0 (Linux; Android 13; Xiaomi 13 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Mobile Safari/537.36";
            } else if (strTrim.equals("IOS_UA") || strTrim.equals("苹果手机")) {
                strTrim = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1";
            } else if (strTrim.equals("MAC_UA") || strTrim.equals("苹果电脑")) {
                strTrim = "Mozilla/5.0 (Macintosh; Intel Mac OS X 20_40; rv:100.0) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/15.0.0 Safari/1500";
            }
            if (!this.f339d.isEmpty() && this.f339d.length() > 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(!this.f339d.isEmpty() ? strConcat : this.f339d);
                if (!strConcat.isEmpty()) {
                    strConcat = ";".concat(strConcat);
                }
                sb3.append(strConcat);
                map.put("Cookie", sb3.toString());
            }
            map.put("User-Agent", strTrim);
            jSONObject.put("user-agent", strTrim);
        }
        return map;
    }

    /* JADX INFO: renamed from: y */
    public final String m744y(String str, String str2, String str3) {
        HashMap mapM740u = str3.equals("show") ? m740u(str) : m743x(str);
        for (int i = 0; i < 3; i++) {
            if (str2.contains("/huadong_") || str2.contains("/renji_")) {
                String strM736q = m736q(AbstractC0716wh.m1787g(str, AbstractC0502oj.m1487a(str2).m1166ah("body").m1644e("script").m1640a("src")), this.f340e, mapM740u);
                String str4 = (String) AbstractC0716wh.m1797q(strM736q, "key=\"", "\"").get(0);
                String str5 = (String) AbstractC0716wh.m1797q(strM736q, "value=\"", "\"").get(0);
                String str6 = (String) AbstractC0716wh.m1797q(strM736q, "c.get(\"/a20be899", "\"").get(0);
                StringBuilder sb = new StringBuilder("/a20be899");
                sb.append(str6);
                sb.append(str4);
                sb.append("&value=");
                sb.append(AbstractC0405ku.m1360d(string2Hex(str5, str2.contains("/renji_") ? "djs" : "hd"), AbstractC0405ku.f1107c));
                String strM1787g = AbstractC0716wh.m1787g(str, sb.toString());
                HashMap map = new HashMap();
                AbstractC0771yi.m1890l(strM1787g, mapM740u, map);
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()).equalsIgnoreCase("set-cookie")) {
                        this.f339d = TextUtils.join(";", (Iterable) entry.getValue());
                        break;
                    }
                }
                str2 = m736q(str, this.f340e, mapM740u);
                if (!str2.contains("验证</title>")) {
                    return str2.replaceAll("\r|\n", "");
                }
            }
            if (!str2.contains("验证</title>")) {
                return str2.replaceAll("\r|\n", "");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final String m745z(String str, String str2, String str3) {
        StringBuilder sb;
        String str4;
        HashMap mapM740u = str3.equals("show") ? m740u(str) : m743x(str);
        for (int i = 0; i < 3; i++) {
            if (str2.contains("检测中") && str2.contains("btwaf")) {
                String str5 = (String) AbstractC0716wh.m1797q(str2, "btwaf=", "\"").get(0);
                if (str.contains("?")) {
                    sb = new StringBuilder();
                    sb.append(str);
                    str4 = "&btwaf=";
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    str4 = "?btwaf=";
                }
                sb.append(str4);
                sb.append(str5);
                String string = sb.toString();
                HashMap map = new HashMap();
                String strM1890l = AbstractC0771yi.m1890l(string, mapM740u, map);
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()).equalsIgnoreCase("set-cookie")) {
                        this.f339d = TextUtils.join(";", (Iterable) entry.getValue());
                        break;
                    }
                }
                if (!strM1890l.contains("<title>检测中</title>")) {
                    return strM1890l.replaceAll("\r|\n", "");
                }
                str2 = m736q(str, this.f340e, mapM740u);
            }
            if (!str2.contains("<title>检测中</title>")) {
                return str2.replaceAll("\r|\n", "");
            }
        }
        return null;
    }
}
