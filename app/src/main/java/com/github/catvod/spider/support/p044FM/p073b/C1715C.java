package com.github.catvod.spider.support.p044FM.p073b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.github.catvod.spider.support.p044FM.p075c.C1765g;
import com.github.catvod.spider.support.p044FM.p075c.C1768j;
import com.github.catvod.spider.support.p044FM.p084i.C1818b;
import com.github.catvod.spider.support.p044FM.p084i.C1819c;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p090o.C1869j;
import com.github.catvod.spider.support.p044FM.p090o.C1872m;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1715C {

    /* JADX INFO: renamed from: d */
    private static final String f3757d = "https://login.123pan.com/api/user/sign_in";

    /* JADX INFO: renamed from: e */
    private static final String f3758e = "https://www.123pan.com";

    /* JADX INFO: renamed from: f */
    private static final String f3759f = "UserInfo";

    /* JADX INFO: renamed from: a */
    private String f3760a;

    /* JADX INFO: renamed from: b */
    private AlertDialog f3761b;

    /* JADX INFO: renamed from: c */
    private boolean f3762c = false;

    C1715C() {
        Init.checkPermission();
        SpiderDebug.log("Pan123 Init");
    }

    /* JADX INFO: renamed from: a */
    public static void m3997a(C1715C c1715c, String[] strArr) {
        c1715c.getClass();
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String str4 = strArr[3];
        String str5 = strArr[5];
        try {
            int iM4009m = c1715c.m4009m();
            c1715c.m4004h(iM4009m);
            JsonArray jsonArray = new JsonArray();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("file_id", str2);
            jsonObject.addProperty("size", str5);
            jsonObject.addProperty("etag", str4);
            jsonObject.addProperty("type", 0);
            jsonObject.addProperty("parent_file_id", Integer.valueOf(iM4009m));
            jsonObject.addProperty("file_name", str3);
            jsonObject.addProperty("drive_id", 0);
            jsonArray.add(jsonObject);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("file_list", jsonArray);
            jsonObject2.addProperty("share_key", str);
            jsonObject2.addProperty("current_level", 1);
            jsonObject2.addProperty("event", "transfer");
            jsonObject2.addProperty("fileNum", 1);
            jsonObject2.addProperty("operatePlace", 1);
            C1840c.m4472g("https://www.123pan.com/b/api/file/copy/async", jsonObject2.toString(), c1715c.m4008l());
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{-104, 13, -123, -115, 97, -37, -121, -105, -104, 66, -112, -122, 82}, new byte[]{-5, 98, -11, -12, 32, -88, -2, -7}, new StringBuilder(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3999c(C1715C c1715c, EditText editText, EditText editText2) {
        c1715c.getClass();
        String string = editText.getText().toString();
        String string2 = editText2.getText().toString();
        c1715c.m4005i();
        Init.execute(new RunnableC1713A(c1715c, string, string2, 0));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4000d(C1715C c1715c, String str, String str2) {
        c1715c.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("username", str);
            jSONObject.put("password", str2);
            C1885z.m4580s(f3759f, jSONObject.toString());
            if (c1715c.m4011q(true)) {
                return;
            }
            c1715c.m4013o();
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{-67, -7, 51, 28, -120, -100, -83, -94, -92, -14, 67, 22, -119, -121, -29, -21}, new byte[]{-46, -105, 99, 115, -5, -11, -39, -53}, new StringBuilder(), e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4001e(C1715C c1715c) {
        c1715c.getClass();
        while (c1715c.f3762c) {
            try {
                String strM4576o = C1885z.m4576o(f3759f);
                SpiderDebug.log("userInfo: " + strM4576o);
                if (!TextUtils.isEmpty(strM4576o)) {
                    C1869j.m4522b("登录成功, 请退出重新进来");
                    c1715c.m4011q(false);
                    c1715c.f3761b.dismiss();
                    return;
                }
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                SpiderDebug.log("");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static long m4003g(String str) {
        String strReplace = str.replace("+08:00", "+0800");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            return simpleDateFormat.parse(strReplace).getTime();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m4004h(int i) {
        char c = 16;
        try {
            long jM4569h = C1885z.m4569h();
            JsonArray jsonArray = new JsonArray();
            Gson gson = new Gson();
            while (true) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[59];
                bArr[0] = 104;
                bArr[1] = 56;
                bArr[2] = -125;
                bArr[3] = -13;
                bArr[4] = -116;
                bArr[5] = -100;
                bArr[6] = -5;
                bArr[7] = 84;
                bArr[8] = 119;
                bArr[9] = 59;
                bArr[10] = -128;
                bArr[11] = -83;
                bArr[12] = -50;
                bArr[13] = -108;
                bArr[14] = -25;
                bArr[15] = 11;
                bArr[c] = 97;
                bArr[17] = 34;
                bArr[18] = -39;
                bArr[19] = -32;
                bArr[20] = -112;
                bArr[21] = -53;
                bArr[22] = -5;
                bArr[23] = 25;
                bArr[24] = 47;
                bArr[25] = 45;
                bArr[26] = -121;
                bArr[27] = -22;
                bArr[28] = -48;
                bArr[29] = -64;
                bArr[30] = -67;
                bArr[31] = 23;
                bArr[32] = 101;
                bArr[33] = 99;
                bArr[34] = -101;
                bArr[35] = -22;
                bArr[36] = -116;
                bArr[37] = -46;
                bArr[38] = -5;
                bArr[39] = 21;
                bArr[40] = 101;
                bArr[41] = 59;
                bArr[42] = -56;
                bArr[43] = -25;
                bArr[44] = -115;
                bArr[45] = -49;
                bArr[46] = -94;
                bArr[47] = 30;
                bArr[48] = 73;
                bArr[49] = 40;
                bArr[50] = -54;
                bArr[51] = -77;
                bArr[52] = -39;
                bArr[53] = -54;
                bArr[54] = -67;
                bArr[55] = 22;
                bArr[56] = 105;
                bArr[57] = 56;
                bArr[58] = -54;
                sb.append(C1711a.m3992b(bArr, new byte[]{0, 76, -9, -125, -1, -90, -44, 123}));
                sb.append(100);
                sb.append("&next=0&orderBy=update_time&orderDirection=desc&parentFileId=");
                sb.append(i);
                sb.append("&trashed=false&SearchData=&Page=");
                sb.append(1);
                sb.append("&event=homeListFile&operateType=1&inDirectSpace=false");
                C1819c c1819cM4422b = C1819c.m4422b(C1840c.m4479n(sb.toString(), m4008l()));
                for (C1818b c1818b : c1819cM4422b.m4423a().m4409a()) {
                    if (m4003g(c1818b.m4413b()) < jM4569h) {
                        jsonArray.add(gson.toJsonTree(c1818b).getAsJsonObject());
                    }
                }
                if (c1819cM4422b.m4423a().m4410b() < 100) {
                    break;
                } else {
                    c = 16;
                }
            }
            if (jsonArray.size() == 0) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("driveId", 0);
            jsonObject.addProperty("operation", Boolean.TRUE);
            jsonObject.addProperty("event", "intoRecycle");
            jsonObject.addProperty("operatePlace", 1);
            jsonObject.add("fileTrashInfoList", jsonArray);
            SpiderDebug.log("deleteItems res: " + C1840c.m4472g("https://www.123pan.com/b/api/file/trash", jsonObject.toString(), m4008l()).toString());
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{-107, 55, -25, -99, 101, 55, -3, -69, -108, 63, -1, -40, 116, 32, -58, -11}, new byte[]{-15, 82, -116, -8, 17, 82, -76, -49}, new StringBuilder(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m4005i() {
        try {
            this.f3762c = false;
            AlertDialog alertDialog = this.f3761b;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static C1715C m4006j() {
        return C1714B.f3756a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    private String m4007k(String str, String str2, String str3, String str4, String str5) {
        String strOptString;
        int i = 0;
        while (true) {
            if (i < 2) {
                int i2 = i + 1;
                try {
                    JsonObject jsonObject = new JsonObject();
                    try {
                        jsonObject.addProperty("fileId", str);
                        try {
                            jsonObject.addProperty("fileName", str2);
                            try {
                                jsonObject.addProperty("etag", str3);
                                try {
                                    jsonObject.addProperty("s3keyFlag", str4);
                                    try {
                                        jsonObject.addProperty("size", str5);
                                        jsonObject.addProperty("driveId", 0);
                                        JSONObject jSONObject = new JSONObject(C1840c.m4472g("https://www.123pan.com/b/api/file/download_info", jsonObject.toString(), m4008l()).m4481a());
                                        int iOptInt = jSONObject.optInt("code");
                                        if (iOptInt == 0) {
                                            strOptString = jSONObject.optJSONObject("data").optString("DownloadUrl");
                                            break;
                                        }
                                        if (iOptInt == 401) {
                                            try {
                                                m4011q(true);
                                                SpiderDebug.log("Attempt " + i2 + ": Unauthorized, re-logging in.");
                                            } catch (Exception e) {
                                                e = e;
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("Error on attempt ");
                                                sb.append(i2);
                                                C1751v.m4143c(new byte[]{-24, 46}, new byte[]{-46, 14, 106, -108, 46, 95, -16, 94}, sb, e);
                                                if (i2 < 2) {
                                                    try {
                                                        Thread.sleep(1000L);
                                                    } catch (InterruptedException unused) {
                                                        Thread.currentThread().interrupt();
                                                    }
                                                }
                                            }
                                            i = i2;
                                        } else {
                                            SpiderDebug.log("Attempt " + i2 + ": " + jSONObject.optString("message"));
                                        }
                                        e = e;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Error on attempt ");
                                        sb2.append(i2);
                                        C1751v.m4143c(new byte[]{-24, 46}, new byte[]{-46, 14, 106, -108, 46, 95, -16, 94}, sb2, e);
                                        if (i2 < 2) {
                                            Thread.sleep(1000L);
                                        }
                                        i = i2;
                                    } catch (Exception e2) { Exception /*e=e2*/
                                    }
                                } catch (Exception e3) { Exception /*e=e3*/
                                }
                            } catch (Exception e4) { Exception /*e=e4*/
                            }
                        } catch (Exception e5) { Exception /*e=e5*/
                        }
                    } catch (Exception e6) { Exception /*e=e6*/
                    }
                } catch (Exception e7) { Exception /*e=e7*/
                }
            }
            strOptString = "";
            break;
        }
        if (strOptString.isEmpty()) {
            SpiderDebug.log("Failed to retrieve download URL after 2 attempts.");
            return "";
        }
        try {
            String strSubstring = null;
            for (String str6 : new URL(strOptString).getQuery().split("&")) {
                if (str6.startsWith("params=")) {
                    strSubstring = str6.substring("params=".length());
                    break;
                }
            }
            Response responseExecute = C1840c.m4466a().newCall(new Request.Builder().url(new String(Base64.decode(strSubstring, 0), StandardCharsets.UTF_8)).addHeader("Referer", "https://www.123pan.com/").build()).execute();
            if (responseExecute.isSuccessful()) {
                return new JSONObject(responseExecute.body().string()).optJSONObject("data").optString("redirect_url");
            }
            if (responseExecute.code() == 302) {
                return responseExecute.header("Location");
            }
            SpiderDebug.log("Request failed with response code: " + responseExecute.code());
            return strOptString;
        } catch (Exception unused2) {
            return strOptString;
        }
    }

    /* JADX INFO: renamed from: l */
    private Map<String, String> m4008l() {
        HashMap map = new HashMap();
        map.put("origin", f3758e);
        map.put("referer", "https://www.123pan.com/");
        map.put("user-agent", "Dart/2.19(dart:io)-alist");
        map.put("platform", "android");
        map.put("app-version", "3");
        if (!TextUtils.isEmpty(this.f3760a)) {
            map.put("Authorization", "Bearer " + this.f3760a);
        }
        return map;
    }

    /* JADX INFO: renamed from: m */
    private int m4009m() {
        for (int i = 0; i <= 2; i++) {
            try {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("driveId", 0);
                jsonObject.addProperty("fileName", "tangsantvtmp");
                jsonObject.addProperty("parentFileId", 0);
                jsonObject.addProperty("size", 0);
                jsonObject.addProperty("type", 1);
                jsonObject.addProperty("duplicate", 0);
                jsonObject.addProperty("NotReuse", Boolean.FALSE);
                jsonObject.addProperty("event", "newCreateFolder");
                jsonObject.addProperty("operateType", 1);
                JSONObject jSONObject = new JSONObject(C1840c.m4472g("https://www.123pan.com/b/api/file/upload_request", jsonObject.toString(), m4008l()).m4481a());
                if (jSONObject.optInt("code") != 401) {
                    return jSONObject.optJSONObject("data").optJSONObject("Info").optInt("FileId");
                }
                try {
                    m4011q(true);
                } catch (Exception e) {
                    e = e;
                }
                e = e;
            } catch (Exception e2) { Exception /*e=e2*/
            }
            C1751v.m4143c(new byte[]{51, -96, 107, -27, -10, -16, -123, 99, 61, -73, 89, -34, -11, -6, -107, 110, 48, -27, 122, -59, -21, -91, -47}, new byte[]{84, -59, 31, -73, -103, -97, -15, 39}, new StringBuilder(), e);
            return 0;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    private void m4010p(String str, C1818b c1818b, List<C1818b> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://www.123pan.com/b/api/share/get?limit=");
            sb.append(100);
            sb.append("&Page=");
            sb.append(i);
            sb.append("&next=0&orderBy=file_name&orderDirection=asc&parentFileId=");
            sb.append(c1818b.m4415d());
            C1748s.m4098b(new byte[]{-76, 8, -113, -33, -126, -95, -22, -65, -21, 70}, new byte[]{-110, 123, -25, -66, -16, -60, -95, -38}, sb, str);
            C1819c c1819c = (C1819c) new Gson().fromJson(C1840c.m4479n(C1434P.m3588a(new byte[]{21, -124, 76, -37, -105, 42, -42, -105, 87}, new byte[]{51, -41, 36, -70, -27, 79, -122, -32}, sb), m4008l()), C1819c.class);
            for (C1818b c1818b2 : c1819c.m4423a().m4409a()) {
                if (c1818b2.m4412a() == 0) {
                    arrayList.add(c1818b2);
                } else if (c1818b2.m4412a() == 2) {
                    if (!TextUtils.isEmpty(c1818b.m4416e())) {
                        c1818b2.m4421j(c1818b.m4416e());
                    }
                    arrayList2.add(c1818b2);
                }
            }
            list.addAll(arrayList2);
            arrayList2 = new ArrayList();
            try {
                if (c1819c.m4423a().m4409a().isEmpty()) {
                    break;
                }
                String strM4411c = c1819c.m4423a().m4411c();
                boolean z = false;
                if (strM4411c == "-1" || (strM4411c != null && strM4411c.equals("-1"))) {
                    z = true;
                }
                if (z) {
                    break;
                } else {
                    i++;
                }
            } catch (Exception unused) {
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m4010p(str, (C1818b) it.next(), list);
        }
    }

    /* JADX INFO: renamed from: q */
    private boolean m4011q(boolean z) {
        try {
            String str = f3759f;
            String strM4576o = C1885z.m4576o(str);
            if (TextUtils.isEmpty(strM4576o)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(strM4576o);
            String strOptString = jSONObject.optString("username");
            String strOptString2 = jSONObject.optString("password");
            String strOptString3 = jSONObject.optString("access_token");
            this.f3760a = strOptString3;
            if (!TextUtils.isEmpty(strOptString3) && !z) {
                return true;
            }
            JsonObject jsonObject = new JsonObject();
            if (C1885z.m4572k(strOptString)) {
                jsonObject.addProperty("mail", strOptString);
                jsonObject.addProperty("password", strOptString2);
                jsonObject.addProperty("type", 2);
            } else {
                jsonObject.addProperty("passport", strOptString);
                jsonObject.addProperty("password", strOptString2);
                jsonObject.addProperty("remember", Boolean.TRUE);
            }
            Map<String, String> mapM4008l = m4008l();
            ((HashMap) mapM4008l).put("platform", "web");
            JSONObject jSONObject2 = new JSONObject(C1840c.m4472g(f3757d, jsonObject.toString(), mapM4008l).m4481a());
            if (jSONObject2.optInt("code") != 200) {
                C1885z.m4562b(str);
                C1869j.m4522b(jSONObject2.optString("message"));
                throw new Exception(jSONObject2.optString("message"));
            }
            this.f3760a = jSONObject2.optJSONObject("data").optString("token");
            jSONObject.put("access_token", this.f3760a);
            C1885z.m4580s(str, jSONObject.toString());
            return true;
        } catch (Exception e) {
            C1751v.m4143c(new byte[]{-41, 111, -66, 26, 4, 16, -98, -81, -101}, new byte[]{-69, 0, -39, 115, 106, 48, -5, -107}, new StringBuilder(), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C1768j m4012n(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        m4010p(str, new C1818b(), arrayList);
        if (arrayList.size() < 1) {
            return C1885z.m4563c();
        }
        List listSingletonList = Collections.singletonList("123云盘原画");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strM3588a = "";
            if (!it.hasNext()) {
                break;
            }
            C1818b c1818b = (C1818b) it.next();
            if (!TextUtils.isEmpty(c1818b.m4417f())) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(c1818b.m4417f().trim());
                strM3588a = C1434P.m3588a(new byte[]{-123}, new byte[]{-40, 48, 102, -86, -85, 68, -42, -35}, sb);
            }
            StringBuilder sbM3589b = C1434P.m3589b(strM3588a);
            sbM3589b.append(c1818b.m4416e());
            sbM3589b.append(c1818b.m4420i());
            C1748s.m4098b(new byte[]{-19}, new byte[]{-55, -88, 106, -74, -102, 99, -111, 122}, sbM3589b, str);
            sbM3589b.append(Marker.ANY_NON_NULL_MARKER);
            sbM3589b.append(c1818b.m4415d());
            sbM3589b.append(Marker.ANY_NON_NULL_MARKER);
            sbM3589b.append(c1818b.m4416e());
            sbM3589b.append(Marker.ANY_NON_NULL_MARKER);
            sbM3589b.append(c1818b.m4414c());
            sbM3589b.append(Marker.ANY_NON_NULL_MARKER);
            sbM3589b.append(c1818b.m4418g());
            sbM3589b.append(Marker.ANY_NON_NULL_MARKER);
            sbM3589b.append(c1818b.m4419h());
            String string = sbM3589b.toString();
            if (!TextUtils.isEmpty(str2) && !str2.contains("http")) {
                StringBuilder sbM3589b2 = C1434P.m3589b(string);
                C1748s.m4098b(new byte[]{-37}, new byte[]{-16, -26, 15, -74, -64, -10, -79, -9}, sbM3589b2, str2);
                sbM3589b2.append(Marker.ANY_NON_NULL_MARKER);
                sbM3589b2.append(c1818b.m4416e());
                string = sbM3589b2.toString();
            }
            arrayList2.add(string);
        }
        for (int i = 0; i < listSingletonList.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C1768j c1768j = new C1768j();
        c1768j.m4221g(str);
        c1768j.m4219e(str);
        c1768j.m4223i("");
        c1768j.m4222h("123");
        c1768j.m4225k(TextUtils.join("$$$", arrayList3));
        c1768j.m4224j(TextUtils.join("$$$", listSingletonList));
        c1768j.m4216b("123云盘");
        return c1768j;
    }

    /* JADX INFO: renamed from: o */
    public final void m4013o() {
        boolean zIsEmpty;
        int i = 1;
        try {
            SystemClock.sleep(400L);
            Init.run(new RunnableC1730a(this, i));
            Init.run(new RunnableC1733d(this, i));
            while (true) {
                if (!zIsEmpty) {
                    break;
                } else {
                    SystemClock.sleep(400L);
                }
            }
        } catch (Exception e) {
            Init.run(new RunnableC1730a(this, i));
            SpiderDebug.log("handleUserInfo: " + e);
            while (true) {
                if (!zIsEmpty) {
                    break;
                } else {
                    SystemClock.sleep(400L);
                }
            }
        } finally {
            while (TextUtils.isEmpty(this.f3760a)) {
                SystemClock.sleep(400L);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final String m4014r(String[] strArr) {
        if (TextUtils.isEmpty(this.f3760a) && !m4011q(false)) {
            m4013o();
        }
        new Thread(new RunnableC1734e(this, strArr, 1)).start();
        String strM4007k = m4007k(strArr[1], strArr[2], strArr[3], strArr[4], strArr[5]);
        StringBuilder sb = new StringBuilder();
        sb.append(Proxy.getUrl());
        sb.append("?do=appdanmu&vodName=");
        sb.append(strArr[3]);
        sb.append("&vodIndex=");
        sb.append(strArr[4]);
        String strM3588a = C1434P.m3588a(new byte[]{6, -10, 12, -30, -17, 100, 114, 67}, new byte[]{32, -128, 99, -122, -70, 22, 30, 126}, sb);
        C1765g c1765g = new C1765g();
        c1765g.m4207x(strM4007k);
        c1765g.m4195a(strM3588a);
        c1765g.m4201j();
        c1765g.m4198f(m4008l());
        return c1765g.toString();
    }

    /* JADX INFO: renamed from: s */
    public final void m4015s() {
        try {
            LinearLayout linearLayout = new LinearLayout(Init.getActivity());
            final int i = 0;
            linearLayout.setOrientation(0);
            linearLayout.setPadding(16, 16, 16, 16);
            linearLayout.setBackgroundColor(-1);
            ImageView imageView = new ImageView(Init.getActivity());
            int iM4531a = C1872m.m4531a(120);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iM4531a, iM4531a));
            int i2 = 1;
            imageView.setContentDescription("二维码");
            try {
                imageView.setImageBitmap(C1317a.m3301b(String.format(C1711a.m3992b(new byte[]{-18, -3, 125, 87, 74, -88, -119, 7, -11, -77, 48, 30, 71, -65, -119, 82, -12, -26, 113, 94, 79, -29, -55, 31, -10, -4, 122, 79, 25, -23, -64, 77}, new byte[]{-122, -119, 9, 39, 112, -121, -90, 34}), C1885z.m4566e(Init.context())), iM4531a));
            } catch (Exception e) {
                e.printStackTrace();
            }
            LinearLayout linearLayout2 = new LinearLayout(Init.getActivity());
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(16, 0, 0, 0);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            final EditText editText = new EditText(Init.getActivity());
            editText.setHint("请输入账号");
            editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            final EditText editText2 = new EditText(Init.getActivity());
            editText2.setHint("请输入密码");
            editText2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.addView(editText);
            linearLayout2.addView(editText2);
            linearLayout.addView(imageView);
            linearLayout.addView(linearLayout2);
            this.f3761b = new AlertDialog.Builder(Init.getActivity()).setTitle("请输入123云盘的密码或者扫描下面的二维码进行填写").setView(linearLayout).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p073b.y
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (i) {
                        case 0:
                            ((C1715C) this).f3762c = false;
                            break;
                        default:
                            C1729Q.m4070i((C1729Q) this);
                            break;
                    }
                }
            }).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.support.p044FM.p073b.z
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C1715C.m3999c(this.f3863a, editText, editText2);
                }
            }).show();
            this.f3762c = true;
            new Thread(new RunnableC1745p(this, i2)).start();
        } catch (Exception e2) {
            m4005i();
            e2.printStackTrace();
            SpiderDebug.log("showInput2 ex: " + e2.getMessage());
        }
    }
}
