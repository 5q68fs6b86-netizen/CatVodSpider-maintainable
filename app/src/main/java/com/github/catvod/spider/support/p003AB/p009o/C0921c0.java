package com.github.catvod.spider.support.p003AB.p009o;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.AB.C.h;
import com.github.catvod.spider.support.AB.N.b;
import com.github.catvod.spider.support.AB.c.j;
import com.github.catvod.spider.support.p003AB.p005b.C0857x;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import java.io.File;
import java.io.FileInputStream;
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

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0921c0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f2162a = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)|http((?!http).)*?video/tos*");

    /* JADX INFO: renamed from: b */
    public static final List<String> f2163b = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");

    /* JADX INFO: renamed from: c */
    public static final List<String> f2164c = Arrays.asList("srt", "ass", "ssa", "vtt");

    /* JADX INFO: renamed from: a */
    public static String m2218a(String str) {
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
    public static String m2219b(String str) {
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

    /* JADX INFO: renamed from: c */
    public static String m2220c(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                StringBuilder sb = new StringBuilder();
                for (byte b : messageDigest.digest()) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                String string = sb.toString();
                fileInputStream.close();
                return string;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2221d(String str) {
        File file = new File(Init.context().getFilesDir(), str);
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static j m2222e() {
        j jVar = new j();
        jVar.g("10086");
        jVar.e("fileId");
        jVar.i("fileId");
        jVar.h("已失效");
        jVar.k("分享已失效或其他原因不可用$https://baidu.com$$$分享已失效或其他原因不可用$https://baidu.com");
        jVar.j("未获取到资源");
        jVar.b("123云盘");
        return jVar;
    }

    /* JADX INFO: renamed from: f */
    public static String m2223f(String str) {
        return str.contains(".") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    /* JADX INFO: renamed from: g */
    public static String m2224g(Context context) {
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

    /* JADX INFO: renamed from: h */
    public static JSONObject m2225h(String str, Map<String, String> map) {
        return new JSONObject(h.k(C0869c.m2132l(String.format("%s/static/js/playerconfig.js?t=%s", str, new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime())), map), "MacPlayerConfig.player_list=", ",MacPlayerConfig"));
    }

    /* JADX INFO: renamed from: i */
    public static String m2226i(String str) {
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
    public static String m2227j(double d) {
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

    /* JADX INFO: renamed from: k */
    public static long m2228k() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList<String> m2229l() {
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

    /* JADX INFO: renamed from: m */
    public static boolean m2230m(String str) {
        Iterator it = Arrays.asList("973973.xyz", ".fit:").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2231n(String str) {
        return f2164c.contains(str);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m2232o(String str) {
        if (str.contains("url=http") || str.contains(".js") || str.contains(".css") || str.contains(".html")) {
            return false;
        }
        return f2162a.matcher(str).find();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m2233p(String str) {
        Iterator it = Arrays.asList("iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static String m2234q(String str) {
        return C0896F.m2155c(new File(Init.context().getFilesDir(), str));
    }

    /* JADX INFO: renamed from: r */
    public static String m2235r(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }

    /* JADX INFO: renamed from: s */
    public static String m2236s(String str) {
        return (str == null || str.length() <= 1) ? str : str.substring(0, str.length() - 1);
    }

    /* JADX INFO: renamed from: t */
    public static byte[] m2237t(byte[] bArr) {
        try {
            b bVar = new b();
            bVar.c(bArr, bArr.length);
            bVar.a();
            return new String(bArr, bVar.b()).getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return bArr;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m2238u(String str, String str2) {
        C0896F.m2159g(new File(Init.context().getFilesDir(), str), str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m2239v(String str, String str2) {
        if (str2.isEmpty()) {
            return;
        }
        C0896F.m2159g(C0896F.m2158f(str), str2);
    }

    /* JADX INFO: renamed from: w */
    public static JSONObject m2240w(String str) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            if (str.startsWith("http")) {
                jSONObject = new JSONObject(C0869c.m2131k(str));
            }
            if (str.startsWith("file")) {
                jSONObject = new JSONObject(C0896F.m2157e(str));
            }
            if (str.startsWith("{")) {
                jSONObject = new JSONObject(str);
            }
            if (jSONObject.has("threadinfo")) {
                C0896F.m2159g(C0896F.m2158f("/.thread"), jSONObject.getString("threadinfo"));
            }
            if (jSONObject.has("token")) {
                String string = jSONObject.getString("token");
                if (string.contains("http")) {
                    string = C0869c.m2131k(string);
                }
                C0857x.m2086p().m2094L(string);
            }
            if (jSONObject.has("quarkCookie")) {
                String string2 = jSONObject.getString("quarkCookie");
                if (!TextUtils.isEmpty(string2)) {
                    if (string2.contains("http")) {
                        string2 = C0869c.m2131k(string2);
                    }
                    m2238u(".quark", string2);
                }
            }
            if (jSONObject.has("ucCookie")) {
                String string3 = jSONObject.getString("ucCookie");
                if (!TextUtils.isEmpty(string3)) {
                    if (string3.contains("http")) {
                        string3 = C0869c.m2131k(string3);
                    }
                    m2238u(".uc", string3);
                }
            }
            if (jSONObject.has("bauiduCookie")) {
                String string4 = jSONObject.getString("bauiduCookie");
                if (!TextUtils.isEmpty(string4)) {
                    if (string4.contains("http")) {
                        string4 = C0869c.m2131k(string4);
                    }
                    m2238u(".baidu", string4);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            throw new Exception(e);
        }
    }
}
