package com.github.catvod.spider.support.p044FM.p090o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p058N.C1572b;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.github.catvod.spider.support.p044FM.p073b.C1750u;
import com.github.catvod.spider.support.p044FM.p075c.C1768j;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p131p.C2292a;
import java.io.File;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1885z {

    /* JADX INFO: renamed from: a */
    public static final Pattern f4347a;

    /* JADX INFO: renamed from: b */
    public static final List<String> f4348b;

    /* JADX INFO: renamed from: c */
    public static final List<String> f4349c;

    static {
        C1711a.m3992b(new byte[]{110, 77, 121, 60, 121, -19, -82, -98, 22, 12, 51, 117, 61, -42, -90, -33, 71, 77, 116, 38, 53, -49, -101, -111, 18, 18, 45, 101, 46, -95, -104, -40, 77, 20, 55, 110, 53, -7, -7, -123, 10, 2, 66, 37, 101, -19, -86, -26, 70, 64, 72, 60, 97, -82, -6, -126, 20, 12, 48, 99, 53, -87, -124, -7, 119, 111, 79, 121, 53, -19, -90, -38, 70, 2, 68, 48, 118, -22, -96, -104, 3, 97, 107, 39, 122, -20, -86, -98, 18, 19, 52, 123, 37, -81, -1, -97, 19, 2, 80, 52, 115, -32, -67, -40, 12, 23, 48, 98, 59, -78, -7}, new byte[]{35, 34, 3, 85, 21, -127, -49, -79});
        C1711a.m3992b(new byte[]{-92, 69, -116, -117, 14, 103, -66, 84, -68, 12, -107, -113, 81, 99, -93, 90, -79, 84, -99, -112, 79, 32, -78, 81, -92, 77, -104, -44, 89, 98, -90, 21, -79, 80, -124, -109, 72, 108, -85, 77, -71, 79, -102, -48, 89, 98, -90, 2, -95, 29, -60, -47, 24, 35, -93, 84, -79, 71, -111, -48, 64, 121, -93, 95, -4, 73, -103, -98, 70, 106, -27, 78, -75, 66, -124, -45, 72, 98, -85, 94, -75, 15, -107, -113, 79, 104, -26, 19, -1, 10, -49, -114, 28, 63, -28, 1, -4, 65, -124, -113, 77, 102, -87, 88, -92, 73, -101, -111, 14, 124, -93, 94, -66, 69, -112, -46, 68, 119, -87, 81, -79, 78, -109, -102, 26, 121, -9, 91, -29, 27, -123, -62, 17, 33, -3}, new byte[]{-48, 32, -12, -1, 33, 15, -54, 57});
        f4347a = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)|http((?!http).)*?video/tos*");
        f4348b = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");
        f4349c = Arrays.asList("srt", "ass", "ssa", "vtt");
    }

    /* JADX INFO: renamed from: a */
    public static String m4560a(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m4561b(String str) {
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
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4562b(String str) {
        File file = new File(Init.context().getFilesDir(), str);
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1768j m4563c() {
        C1768j c1768j = new C1768j();
        c1768j.m4221g("10086");
        c1768j.m4219e("fileId");
        c1768j.m4223i("fileId");
        c1768j.m4222h("已失效");
        c1768j.m4225k("分享已失效或其他原因不可用$https://baidu.com$$$分享已失效或其他原因不可用$https://baidu.com");
        c1768j.m4224j("未获取到资源");
        c1768j.m4216b("未知");
        return c1768j;
    }

    /* JADX INFO: renamed from: c */
    public static String m4564c(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), "TVBox");
        if (!file.exists()) {
            file.mkdirs();
        }
        return C2292a.m6196k(new File(file, str));
    }

    /* JADX INFO: renamed from: d */
    public static String m4565d(String str) {
        return str.contains(".") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: e */
    public static String m4566e(Context context) {
        int ipAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress != 0) {
            return String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                String displayName = networkInterfaceNextElement.getDisplayName();
                if (displayName.equals("eth0") || displayName.equals("wlan0")) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                            return inetAddressNextElement.getHostAddress();
                        }
                    }
                }
            }
            return "0.0.0.0";
        } catch (SocketException e) {
            e.printStackTrace();
            return "0.0.0.0";
        }
    }

    /* JADX INFO: renamed from: f */
    public static JSONObject m4567f(String str, Map<String, String> map) {
        return new JSONObject(C1305h.m3257k(C1840c.m4479n(String.format("%s/static/js/playerconfig.js?t=%s", str, new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime())), map), "MacPlayerConfig.player_list=", ",MacPlayerConfig"));
    }

    /* JADX INFO: renamed from: g */
    public static String m4568g(double d) {
        if (d <= 0.0d) {
            return "";
        }
        if (d > 1.099511627776E12d) {
            return String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.099511627776E12d), "TB");
        }
        if (d > 1.073741824E9d) {
            return String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.073741824E9d), "GB");
        }
        return d > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1024.0d), "KB");
    }

    /* JADX INFO: renamed from: h */
    public static long m4569h() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList<String> m4570i() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("video/mp4");
        arrayList.add("video/x-msvideo");
        arrayList.add("video/x-matroska");
        arrayList.add("video/quicktime");
        arrayList.add("video/x-ms-wmv");
        arrayList.add("video/x-flv");
        arrayList.add("video/webm");
        arrayList.add("video/mpeg");
        arrayList.add("video/3gpp");
        arrayList.add("video/ogg");
        arrayList.add("video/MP2T");
        arrayList.add("application/vnd.rn-realmedia");
        arrayList.add("application/x-matroska");
        arrayList.add("video/mp4v-es");
        arrayList.add("video/H264");
        arrayList.add("video/H265");
        arrayList.add("video/VP8");
        arrayList.add("video/VP9");
        arrayList.add("video/divx");
        arrayList.add("video/xvid");
        arrayList.add("video/AV1");
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m4571j(String str) {
        Iterator it = Arrays.asList("973973.xyz", ".fit:").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m4572k(String str) {
        return str.contains("@") && str.contains(".");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m4573l(String str) {
        return f4349c.contains(str);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m4574m(String str) {
        if (str.contains("url=http") || str.contains(".js") || str.contains(".css") || str.contains(".html")) {
            return false;
        }
        return f4347a.matcher(str).find();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m4575n(String str) {
        Iterator it = Arrays.asList("iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static String m4576o(String str) {
        return C1860a.m4497i(new File(new File("/storage/emulated/0/TVBox"), str));
    }

    /* JADX INFO: renamed from: p */
    public static String m4577p(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }

    /* JADX INFO: renamed from: q */
    public static String m4578q(String str) {
        return (str == null || str.length() <= 1) ? str : str.substring(0, str.length() - 1);
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m4579r(byte[] bArr) {
        try {
            C1572b c1572b = new C1572b();
            c1572b.m3795c(bArr, bArr.length);
            c1572b.m3793a();
            return new String(bArr, c1572b.m3794b()).getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return bArr;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m4580s(String str, String str2) {
        C1860a.m4503m(new File(Init.context().getFilesDir(), str), str2);
    }

    /* JADX INFO: renamed from: t */
    public static void m4581t(String str, String str2) {
        if (str2.isEmpty()) {
            return;
        }
        C1860a.m4503m(C1860a.m4502l(str), str2);
    }

    /* JADX INFO: renamed from: u */
    public static JSONObject m4582u(String str) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            if (str.startsWith("http")) {
                jSONObject = new JSONObject(C1840c.m4479n(str, null));
            }
            if (str.startsWith("file")) {
                jSONObject = new JSONObject(C1860a.m4501k(str));
            }
            if (str.startsWith("{")) {
                jSONObject = new JSONObject(str);
            }
            if (jSONObject.has("threadinfo")) {
                C1860a.m4503m(C1860a.m4502l("/.thread"), jSONObject.getString("threadinfo"));
            }
            if (jSONObject.has("token")) {
                String string = jSONObject.getString("token");
                if (string.contains("http")) {
                    string = C1840c.m4479n(string, null);
                }
                C1750u.m4125p().m4133L(string);
            }
            if (jSONObject.has("quarkCookie")) {
                String string2 = jSONObject.getString("quarkCookie");
                if (!TextUtils.isEmpty(string2)) {
                    if (string2.contains("http")) {
                        string2 = C1840c.m4479n(string2, null);
                    }
                    m4580s(".quark", string2);
                }
            }
            if (jSONObject.has("ucCookie")) {
                String string3 = jSONObject.getString("ucCookie");
                if (!TextUtils.isEmpty(string3)) {
                    if (string3.contains("http")) {
                        string3 = C1840c.m4479n(string3, null);
                    }
                    m4580s(".uc", string3);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            throw new Exception(e);
        }
    }
}
