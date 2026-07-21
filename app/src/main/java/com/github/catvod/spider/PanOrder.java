package com.github.catvod.spider;

import android.util.Log;

import com.github.catvod.utils.Path;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 网盘链接排序。来自 jar 反编译 PanOrder。
 */
class PanOrder implements Comparator<Object> {

    private final Map<String, Integer> orderMap;
    private final Pattern[] patterns;

    public PanOrder(String[] order) {
        orderMap = new HashMap<>();
        for (int i = 0; i < order.length; i++) orderMap.put(order[i], i);
        patterns = new Pattern[]{
                Pattern.compile("pan\\.baidu\\.com"),
                Pattern.compile("pan\\.quark\\.cn"),
                Pattern.compile("drive\\.uc\\.cn"),
                Pattern.compile("pan\\.xunlei\\.com"),
                Pattern.compile("www\\.guangyapan\\.com/s/"),
                Pattern.compile("cloud\\.189\\.cn"),
                Pattern.compile("www\\.123\\w{3}\\.com"),
                Pattern.compile("(www\\.aliyundrive\\.com|www\\.alipan\\.com)"),
                Pattern.compile("caiyun\\.139\\.com")
        };
    }

    private static String[] defaults() {
        return new String[]{"百度", "夸克", "UC", "迅雷", "光鸭", "天翼", "123", "阿里", "移动"};
    }

    private static String[] fromConfig() {
        try {
            File cfg = Path.tv("config.json");
            String text = Path.read(cfg);
            if (text == null || text.isEmpty()) return defaults();
            JsonObject o = new Gson().fromJson(text, JsonObject.class);
            if (o == null || !o.has("panOrder")) return defaults();
            String s = o.get("panOrder").getAsString();
            if (s == null || s.isEmpty()) return defaults();
            return s.split(",");
        } catch (Exception e) {
            Log.e("PanOrder", "Error reading config: " + e.getMessage());
            return defaults();
        }
    }

    private String typeOf(String url) {
        for (int i = 0; i < patterns.length; i++) {
            if (patterns[i].matcher(url).find()) {
                switch (i) {
                    case 0: return "百度";
                    case 1: return "夸克";
                    case 2: return "UC";
                    case 3: return "迅雷";
                    case 4: return "光鸭";
                    case 5: return "天翼";
                    case 6: return "123";
                    case 7: return "阿里";
                    case 8: return "移动";
                    default: break;
                }
            }
        }
        return "other";
    }

    public static void sort(List list) {
        Collections.sort(list, new PanOrder(fromConfig()));
    }

    @Override
    public int compare(Object a, Object b) {
        String s1 = a == null ? "" : (a instanceof String ? (String) a : a.toString());
        String s2 = b == null ? "" : (b instanceof String ? (String) b : b.toString());
        int i1 = orderMap.getOrDefault(typeOf(s1), Integer.MAX_VALUE);
        int i2 = orderMap.getOrDefault(typeOf(s2), Integer.MAX_VALUE);
        return Integer.compare(i1, i2);
    }
}
