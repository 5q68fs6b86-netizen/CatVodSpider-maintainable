package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网盘统一入口（干净骨架）。
 * <p>
 * 搜索类站点（Baiku/KuLe/GuiGui/MiSou 等）继承本类，只实现 search。
 * detail/player 在完整版 jar 中对接阿里/夸克/UC/天翼/123/百度/迅雷等客户端；
 * 本干净版先提供：识别分享链接 → 输出可继续解析的播放项，避免空壳。
 * 完整云盘协议后续按 jar 对照逐盘移植，不在此臆造协议。
 */
public class Pan extends Spider {

    public static final Pattern ALI = Pattern.compile("(www\\.aliyundrive\\.com|www\\.alipan\\.com)/s/([^/]+)(/folder/([^/]+))?");
    public static final Pattern QUARK = Pattern.compile("pan\\.quark\\.cn/s/([^/?#]+)(?:#/list/share)?(?:\\?pwd=([^&]+))?(?:[#&].*)?$");
    public static final Pattern UC = Pattern.compile("drive\\.uc\\.cn/s/([0-9a-fA-F]{8,20})(?:\\?pwd=([^&]+))?(?:\\?public=1)?(?:[#&].*)?$");
    public static final Pattern CLOUD189 = Pattern.compile("cloud\\.189\\.(?:cn|com)/(?:[^/?#]+/)?(?:share\\.html#/)?t/([A-Za-z0-9]+)(?:\\?pwd=([A-Za-z0-9]+)|[（(]访问码：([A-Za-z0-9]+)[）)])?");
    public static final Pattern PAN123 = Pattern.compile("(?:www\\.)?123(?:[a-zA-Z0-9]{3}|pan)\\.(?:com|cn)/(?:s|123pan)/([^/?#]+)(?:\\?pwd=([^&#]+))?(?:[&#].*)?$");
    public static final Pattern BAIDU = Pattern.compile("pan\\.baidu\\.com/(?:s/1([^?]+)\\?pwd=([^&]+)$|share/init\\?surl=([^&]+)(?:&pwd=([^&]+))?)");
    public static final Pattern XUNLEI = Pattern.compile("pan\\.xunlei\\.com/s/([^?#/]+)(?:\\?pwd=([^&#]+))?");

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    protected static String detectFlag(String url) {
        if (TextUtils.isEmpty(url)) return "";
        if (ALI.matcher(url).find()) return "阿里";
        if (QUARK.matcher(url).find()) return "夸克";
        if (UC.matcher(url).find()) return "UC";
        if (CLOUD189.matcher(url).find()) return "天翼";
        if (PAN123.matcher(url).find()) return "123";
        if (BAIDU.matcher(url).find()) return "百度";
        if (XUNLEI.matcher(url).find()) return "迅雷";
        return "直链";
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = ids.get(0);
        String flag = detectFlag(url);
        Vod vod = new Vod();
        vod.setVodId(url);
        vod.setVodName(url);
        vod.setVodPic("");
        // 干净阶段：把分享链原样交给播放端（嗅探/解析/直连），完整网盘文件列表待逐盘移植
        if ("直链".equals(flag)) {
            vod.setVodPlayFrom(TextUtils.join("$$$", Arrays.asList("直连", "嗅探", "解析")));
            vod.setVodPlayUrl(TextUtils.join("$$$", Arrays.asList(url, url, url)));
        } else {
            vod.setVodPlayFrom(flag);
            vod.setVodPlayUrl("打开分享$" + url);
            vod.setVodRemarks(flag + "分享（完整列目录待移植）");
        }
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        if ("直连".equals(flag)) return Result.get().url(id).string();
        if ("嗅探".equals(flag)) return Result.get().parse().url(id).string();
        if ("解析".equals(flag)) return Result.get().parse().jx().url(id).string();
        // 网盘 flag：暂回传分享 URL，由宿主或后续盘客户端处理
        SpiderDebug.log("Pan.playerContent pending full client: " + flag + " " + id);
        return Result.get().url(id).string();
    }

    @Override
    public Object[] proxy(Map<String, String> params) throws Exception {
        return null;
    }

    // decompile aliases used by PanWebShare etc.
    public static final java.util.regex.Pattern f229a = ALI;
    public static final java.util.regex.Pattern f230b = QUARK;
    public static final java.util.regex.Pattern f231c = UC;
    public static final java.util.regex.Pattern f232d = CLOUD189;
    public static final java.util.regex.Pattern f233e = PAN123;
    public static final java.util.regex.Pattern f234f = BAIDU;
    public static final java.util.regex.Pattern f235g = XUNLEI;

    public static String detailContentVodPlayFrom(java.util.List<?> list) {
        if (list == null || list.isEmpty()) return "";
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        for (int i = 0; i < list.size(); i++) names.add(String.valueOf(list.get(i)));
        return android.text.TextUtils.join("$$$", names);
    }
    public static String detailContentVodPlayUrl(java.util.List<?> list) {
        if (list == null || list.isEmpty()) return "";
        java.util.ArrayList<String> urls = new java.util.ArrayList<>();
        for (int i = 0; i < list.size(); i++) urls.add(String.valueOf(list.get(i)));
        return android.text.TextUtils.join("$$$", urls);
    }
}
