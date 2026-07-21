package com.github.catvod.spider;

import com.github.catvod.net.OkHttp;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/** 网盘搜索公共常量（来自 jar）。 */
final class PanSearchSupport {

    static final String PIC_BAIDU = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/dyXZ/1200X800/baidu.jpg/webp";
    static final String PIC_QUARK = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp";
    static final String PIC_UC = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/kbEn/1200X800/uc.jpg/webp";
    static final String PIC_ALI = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/8Yr6/1200X800/aliyun.jpg/webp";
    static final String PIC_XUNLEI = "https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260623/4oPO/1200X800/xunlei.jpg/webp";
    static final String PIC_TIANYI = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/n1b9/1200X800/189.jpg/webp";
    static final String PIC_123 = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/N1l5/1200X800/123.jpg/webp";
    static final String PIC_MOBILE = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/D9nT/1200X800/139.jpg/webp";

    private PanSearchSupport() {}

    static Map<String, String> chrome() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        return h;
    }

    static String encode(String q) {
        return URLEncoder.encode(q, StandardCharsets.UTF_8);
    }

    static String get(String url) {
        return OkHttp.string(url, chrome());
    }

    static String picForUrl(String url) {
        if (url == null) return PIC_QUARK;
        if (url.contains("pan.quark.cn")) return PIC_QUARK;
        if (url.contains("drive.uc.cn")) return PIC_UC;
        if (url.contains("pan.baidu.com")) return PIC_BAIDU;
        if (url.contains("aliyundrive.com") || url.contains("alipan.com")) return PIC_ALI;
        if (url.contains("cloud.189")) return PIC_TIANYI;
        if (url.contains("123")) return PIC_123;
        if (url.contains("xunlei")) return PIC_XUNLEI;
        return PIC_QUARK;
    }

    static String typeName(String type) {
        switch (type) {
            case "aliyun": return "阿里";
            case "quark": return "夸克";
            case "uc": return "UC";
            case "baidu": return "百度";
            case "xunlei": return "迅雷";
            case "tianyi": return "天翼";
            case "123": return "123";
            case "mobile": return "移动";
            default: return type;
        }
    }

    static String typePic(String type) {
        switch (type) {
            case "aliyun": return PIC_ALI;
            case "quark": return PIC_QUARK;
            case "uc": return PIC_UC;
            case "baidu": return PIC_BAIDU;
            case "xunlei": return PIC_XUNLEI;
            case "tianyi": return PIC_TIANYI;
            case "123": return PIC_123;
            case "mobile": return PIC_MOBILE;
            default: return "";
        }
    }

    static String cleanTitle(String title) {
        if (title == null) return "";
        int a = title.indexOf('《');
        if (a < 0) return title;
        int b = title.indexOf('》', a);
        if (b > a) return title.substring(a + 1, b);
        if (a + 1 < title.length()) return title.substring(a + 1);
        return title;
    }
}
