package com.github.catvod.spider;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/**
 * 本地文件浏览。逻辑来自单线路 spider.jar 反编译 LocalFile。
 */
public class LocalFile extends Spider {

    private static final String FOLDER_PIC = "https://cc-im-kefu-cos.7moor-fs2.com/im/2768a390-5474-11ea-afc9-7b323e3e16c0/e8213224-8902-4b2f-8042-ef5809445c8e/2024-06-07/2024-06-07_18:01:26/1717754486746/11664624/folder.png";
    private static final String VIDEO_PIC = "https://cc-im-kefu-cos.7moor-fs2.com/im/2768a390-5474-11ea-afc9-7b323e3e16c0/e8213224-8902-4b2f-8042-ef5809445c8e/2024-06-07/2024-06-07_18:02:18/1717754538432/24531685/video.png";
    private static final String[] MEDIA_HINTS = {".avi", ".wmv", ".rm", ".3gp", ".mov", ".mp", ".m4", ".vob", ".ts", ".webm", ".dat", ".m3u", ".mkv", ".flv", ".aac", ".wma", ".flac", ".ape"};

    public static boolean checkstring(String name) {
        String lower = name.toLowerCase(Locale.ROOT);
        for (String ext : MEDIA_HINTS) {
            if (lower.contains(ext)) return true;
        }
        return false;
    }

    @Override
    public void init(Context context) throws Exception {
        super.init(context);
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        classes.add(new Class(Environment.getExternalStorageDirectory().getAbsolutePath(), "本地文件", "1"));
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            File[] files = new File(tid).listFiles();
            if (files == null) return Result.string(new ArrayList<>());
            Arrays.sort(files, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));
            List<Vod> list = new ArrayList<>();
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd aHH:mm:ss", Locale.CHINA);
            for (File file : files) {
                String name = file.getName();
                if (name.indexOf('.') == 0) continue;
                if (!file.isDirectory() && !checkstring(name)) continue;
                Vod vod = new Vod(file.getAbsolutePath(), name, file.isDirectory() ? FOLDER_PIC : VIDEO_PIC);
                vod.setVodTag(file.isDirectory() ? "folder" : "file");
                Calendar cal = Calendar.getInstance();
                cal.setTimeInMillis(file.lastModified());
                vod.setVodRemarks(fmt.format(cal.getTime()));
                list.add(vod);
            }
            return Result.get().vod(list).page(1, 1, list.size(), list.size()).string();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String path = ids.get(0);
            String parent = new File(path).getParent();
            File[] files = new File(parent).listFiles();
            if (files == null) return "";
            Arrays.sort(files, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));
            List<String> plays = new ArrayList<>();
            for (File file : files) {
                String name = file.getName();
                if (name.indexOf('.') == 0) continue;
                if (file.isFile() && checkstring(name)) {
                    plays.add(name + "$" + file.getAbsolutePath());
                }
            }
            Vod vod = new Vod();
            vod.setVodId(path);
            vod.setVodName(parent);
            vod.setVodPic("");
            vod.setTypeName("");
            vod.setVodPlayFrom("本地");
            vod.setVodPlayUrl(TextUtils.join("#", plays));
            return Result.string(vod);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return Result.get().url(id).string();
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return "";
    }
}
