package com.github.catvod.spider.support.p043F;

import android.text.TextUtils;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p101G.AbstractC2041m;
import com.github.catvod.spider.support.p103I.InterfaceC2062e;
import com.github.catvod.spider.support.p117b.C2144B;
import com.github.catvod.spider.support.p117b.C2156X;
import com.github.catvod.spider.support.p117b.C2175i;
import com.github.catvod.spider.support.p117b.C2176j;
import com.github.catvod.spider.support.p117b.C2187w;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2268k;
import com.google.gson.JsonParser;
import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.F.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1273a {
    /* JADX INFO: renamed from: a */
    public static String m3158a() {
        String strSubstring = String.format("%012d", Long.valueOf(System.currentTimeMillis())).substring(0, 12);
        int i = 0;
        for (int i2 = 0; i2 < 12; i2++) {
            char cCharAt = strSubstring.charAt(i2);
            if (!Character.isDigit(cCharAt)) {
                throw new IllegalArgumentException("时间戳必须全部为数字");
            }
            int numericValue = Character.getNumericValue(cCharAt);
            i = (i2 % 2 == 0 ? numericValue * 1 : numericValue * 3) + i;
        }
        int i3 = i % 11;
        if (i3 == 10) {
            i3 = (i + 1) % 11;
        }
        return strSubstring + i3;
    }

    /* JADX INFO: renamed from: a */
    public static String m3159a(String str, String str2, String str3, String str4) {
        String asString;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        try {
            asString = new JSONObject(strM6164a).optString("proxyMode");
        } catch (Exception e) {
            asString = new JsonParser().parse(strM6164a).getAsJsonObject().get("proxyMode").getAsString();
        }
        String[] strArrM3162c = m3162c(str, str2, str3, str4);
        if (!"Java多线程".equals(asString)) {
            if (is1314GoProxyActive()) {
                return String.format(Locale.getDefault(), "%s?url=%s&thread=%d", "http://127.0.0.1:1314", URLEncoder.encode(strArrM3162c[0]), Integer.valueOf(strArrM3162c[1]));
            }
            C2256I.m6113i("GO代理未启用，请去【配置中心】下载或切换模式");
        }
        return String.format(Proxy.getUrl() + "?do=pan&site=%s&shareId=%s&fileId=%s&fileToken=%s", str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: b */
    public static int m3160b(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: renamed from: b */
    public static String m3161b(String str, String str2, String str3, String str4) {
        String asString;
        String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
        try {
            asString = new JSONObject(strM6164a).optString("proxyMode");
        } catch (Exception e) {
            asString = new JsonParser().parse(strM6164a).getAsJsonObject().get("proxyMode").getAsString();
        }
        String[] strArrM3164d = m3164d(str, str2, str3, str4);
        if (!"Java多线程".equals(asString)) {
            if (is1314GoProxyActive()) {
                return String.format(Locale.getDefault(), "%s?url=%s&thread=%d", "http://127.0.0.1:1314", URLEncoder.encode(strArrM3164d[0]), Integer.valueOf(strArrM3164d[1]));
            }
            C2256I.m6113i("GO代理未启用，请去【配置中心】下载或切换模式");
        }
        return String.format(Proxy.getUrl() + "?do=pan&type=2&site=%s&shareId=%s&fileId=%s&fileToken=%s", str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: c */
    public static String[] m3162c(String str, String str2, String str3, String str4) {
        String[] strArr = new String[3];
        if ("ali".equals(str)) {
            strArr[0] = processAliyunDriveUrl(C2175i.m5662d().m5670h(str2, str3));
            String str5 = "8";
            String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
            if (!TextUtils.isEmpty(strM6164a)) {
                try {
                    String strOptString = new JSONObject(strM6164a).optString("aliThread");
                    if (!TextUtils.isEmpty(strOptString)) {
                        str5 = strOptString;
                    }
                } catch (Exception unused) {
                }
            }
            strArr[1] = str5;
            strArr[2] = "64";
        } else if ("quark".equals(str)) {
            strArr[0] = C2187w.m5760e().m5770h(str2, str3, str4);
            String str6 = "16";
            String strM6164a2 = C2268k.m6164a(C2268k.m6169c("/config.json"));
            if (!TextUtils.isEmpty(strM6164a2)) {
                try {
                    String strOptString2 = new JSONObject(strM6164a2).optString("quarkThread");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        str6 = strOptString2;
                    }
                } catch (Exception unused2) {
                }
            }
            strArr[1] = str6;
            strArr[2] = getQuarkSizeValue();
        } else if ("uc".equals(str)) {
            strArr[0] = C2144B.m5419c().m5434f(str2, str3, str4);
            String uCThreadValue = "16";
            String strM6164a3 = C2268k.m6164a(C2268k.m6169c("/config.json"));
            if (!TextUtils.isEmpty(strM6164a3)) {
                try {
                    String strOptString3 = new JSONObject(strM6164a3).optString("ucThread");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        uCThreadValue = strOptString3;
                    }
                } catch (Exception unused3) {
                }
            }
            if ("自动".equals(uCThreadValue)) {
                uCThreadValue = getUCThreadValue();
            }
            strArr[1] = uCThreadValue;
            strArr[2] = getUCSizeValue();
        } else if ("baidu".equals(str)) {
            strArr[0] = C2176j.m5689f().m5704l(str3);
            String str7 = "16";
            String strM6164a4 = C2268k.m6164a(C2268k.m6169c("/config.json"));
            if (!TextUtils.isEmpty(strM6164a4)) {
                try {
                    String strOptString4 = new JSONObject(strM6164a4).optString("baiduThread");
                    if (!TextUtils.isEmpty(strOptString4)) {
                        str7 = strOptString4;
                    }
                } catch (Exception unused4) {
                }
            }
            strArr[1] = str7;
            strArr[2] = "512";
        } else if ("xunlei".equals(str)) {
            strArr[0] = C2156X.m5559m().m5577q(str2, str3, str4);
            String str8 = "10";
            String strM6164a5 = C2268k.m6164a(C2268k.m6169c("/config.json"));
            if (!TextUtils.isEmpty(strM6164a5)) {
                try {
                    String strOptString5 = new JSONObject(strM6164a5).optString("xunleiThread");
                    if (!TextUtils.isEmpty(strOptString5)) {
                        str8 = strOptString5;
                    }
                } catch (Exception unused5) {
                }
            }
            strArr[1] = str8;
            strArr[2] = "512";
        }
        return strArr;
    }

    /* JADX INFO: renamed from: d */
    public static String m3163d(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String[] m3164d(String str, String str2, String str3, String str4) {
        String[] strArr = new String[3];
        if ("ali".equals(str)) {
            strArr[0] = processAliyunDriveUrl(C2175i.m5662d().m5670h(str2, str3));
            String str5 = "8";
            String strM6164a = C2268k.m6164a(C2268k.m6169c("/config.json"));
            if (!TextUtils.isEmpty(strM6164a)) {
                try {
                    String strOptString = new JSONObject(strM6164a).optString("aliThread");
                    if (!TextUtils.isEmpty(strOptString)) {
                        str5 = strOptString;
                    }
                } catch (Exception unused) {
                }
            }
            strArr[1] = str5;
            strArr[2] = "64";
        } else if ("quark".equals(str)) {
            strArr[0] = C2187w.m5760e().m5771hh(str2, str3, str4);
            String str6 = "16";
            String strM6164a2 = C2268k.m6164a(C2268k.m6169c("/config.json"));
            if (!TextUtils.isEmpty(strM6164a2)) {
                try {
                    String strOptString2 = new JSONObject(strM6164a2).optString("quarkThread");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        str6 = strOptString2;
                    }
                } catch (Exception unused2) {
                }
            }
            strArr[1] = str6;
            strArr[2] = getQuarkSizeValue();
        } else if ("uc".equals(str)) {
            strArr[0] = C2144B.m5419c().m5435ff(str2, str3, str4);
            String uCThreadValue = "16";
            String strM6164a3 = C2268k.m6164a(C2268k.m6169c("/config.json"));
            if (!TextUtils.isEmpty(strM6164a3)) {
                try {
                    String strOptString3 = new JSONObject(strM6164a3).optString("ucThread");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        uCThreadValue = strOptString3;
                    }
                } catch (Exception unused3) {
                }
            }
            if ("自动".equals(uCThreadValue)) {
                uCThreadValue = getUCThreadValue();
            }
            strArr[1] = uCThreadValue;
            strArr[2] = getUCSizeValue();
        } else if ("baidu".equals(str)) {
            strArr[0] = C2176j.m5689f().m5705ll(str3);
            String str7 = "16";
            String strM6164a4 = C2268k.m6164a(C2268k.m6169c("/config.json"));
            if (!TextUtils.isEmpty(strM6164a4)) {
                try {
                    String strOptString4 = new JSONObject(strM6164a4).optString("baiduThread");
                    if (!TextUtils.isEmpty(strOptString4)) {
                        str7 = strOptString4;
                    }
                } catch (Exception unused4) {
                }
            }
            strArr[1] = str7;
            strArr[2] = "512";
        } else if ("xunlei".equals(str)) {
            strArr[0] = C2156X.m5559m().m5577q(str2, str3, str4);
            String str8 = "10";
            String strM6164a5 = C2268k.m6164a(C2268k.m6169c("/config.json"));
            if (!TextUtils.isEmpty(strM6164a5)) {
                try {
                    String strOptString5 = new JSONObject(strM6164a5).optString("xunleiThread");
                    if (!TextUtils.isEmpty(strOptString5)) {
                        str8 = strOptString5;
                    }
                } catch (Exception unused5) {
                }
            }
            strArr[1] = str8;
            strArr[2] = "512";
        }
        return strArr;
    }

    /* JADX INFO: renamed from: e */
    public static String m3165e(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: f */
    public static String m3166f(String str) {
        return m3165e(str).trim();
    }

    /* JADX INFO: renamed from: g */
    public static void m3167g(InterfaceC2062e interfaceC2062e, AbstractC2041m abstractC2041m) {
        C1271c.m3157g(abstractC2041m);
        AbstractC2041m abstractC2041mM4937g = abstractC2041m;
        int i = 0;
        while (abstractC2041mM4937g != null) {
            AbstractC2041m abstractC2041mM4931A = abstractC2041mM4937g.m4931A();
            int iMo4835h = abstractC2041mM4931A != null ? abstractC2041mM4931A.mo4835h() : 0;
            AbstractC2041m abstractC2041mM4942s = abstractC2041mM4937g.m4942s();
            interfaceC2062e.mo4859b(abstractC2041mM4937g, i);
            if (abstractC2041mM4931A != null && !abstractC2041mM4937g.m4940q()) {
                if (iMo4835h == abstractC2041mM4931A.mo4835h()) {
                    abstractC2041mM4937g = abstractC2041mM4931A.m4937g(abstractC2041mM4937g.m4935H());
                } else if (abstractC2041mM4942s == null) {
                    i--;
                    abstractC2041mM4937g = abstractC2041mM4931A;
                } else {
                    abstractC2041mM4937g = abstractC2041mM4942s;
                }
            }
            if (abstractC2041mM4937g.mo4835h() > 0) {
                abstractC2041mM4937g = abstractC2041mM4937g.m4937g(0);
                i++;
            } else {
                while (abstractC2041mM4937g.m4942s() == null && i > 0) {
                    interfaceC2062e.mo4858a(abstractC2041mM4937g, i);
                    abstractC2041mM4937g = abstractC2041mM4937g.m4931A();
                    i--;
                }
                interfaceC2062e.mo4858a(abstractC2041mM4937g, i);
                if (abstractC2041mM4937g == abstractC2041m) {
                    return;
                } else {
                    abstractC2041mM4937g = abstractC2041mM4937g.m4942s();
                }
            }
        }
    }

    public static String getQuarkSizeValue() {
        String strM6164a;
        try {
            File fileM6166b = C2268k.m6166b("/quark_cookie.txt");
            if (fileM6166b == null || !fileM6166b.exists() || fileM6166b.length() <= 0 || (strM6164a = C2268k.m6164a(fileM6166b)) == null) {
                return "256";
            }
            String strTrim = strM6164a.trim();
            return (strTrim.length() != 0 && "SUPER_VIP".equals(new JSONObject(strTrim).optString("member_type"))) ? "512" : "256";
        } catch (Exception unused) {
            return "256";
        }
    }

    public static String getUCSizeValue() {
        String strM6164a;
        try {
            File fileM6166b = C2268k.m6166b("/uc_cookie.txt");
            if (fileM6166b == null || !fileM6166b.exists() || fileM6166b.length() <= 0 || (strM6164a = C2268k.m6164a(fileM6166b)) == null) {
                return "64";
            }
            String strTrim = strM6164a.trim();
            return (strTrim.length() != 0 && "SUPER_VIP".equals(new JSONObject(strTrim).optString("member_type"))) ? "512" : "64";
        } catch (Exception unused) {
            return "64";
        }
    }

    public static String getUCThreadValue() {
        String strM6164a;
        try {
            File fileM6166b = C2268k.m6166b("/uc_cookie.txt");
            if (fileM6166b == null || !fileM6166b.exists() || fileM6166b.length() <= 0 || (strM6164a = C2268k.m6164a(fileM6166b)) == null) {
                return "16";
            }
            String strTrim = strM6164a.trim();
            if (strTrim.length() == 0) {
                return "16";
            }
            String strOptString = new JSONObject(strTrim).optString("member_type");
            return ("NORMAL".equals(strOptString) || "VIP".equals(strOptString)) ? "128" : "16";
        } catch (Exception unused) {
            return "16";
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m3168h(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    /* JADX INFO: renamed from: i */
    public static int m3169i(int i, Object obj) {
        return m3168h(i, obj != null ? obj.hashCode() : 0);
    }

    public static boolean is1314GoProxyActive() {
        String strM6073l = C2238b.m6073l("http://127.0.0.1:1314/api/ping", new HashMap());
        return strM6073l != null && strM6073l.equals("ok");
    }

    public static String processAliyunDriveUrl(String str) {
        return (str == null || str.isEmpty() || !str.contains("dl1-v6.aliyundrive.cloud")) ? str : str.replace("dl1-v6.aliyundrive.cloud", "cn-beijing-data.aliyundrive.net");
    }
}
