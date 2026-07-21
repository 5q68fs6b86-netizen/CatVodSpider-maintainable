package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 龙眼/daoran AppLY。请求体与 md5 头来自 jar 反编译。
 */
public class AppLY extends Spider {

    private static final String API = "https://fly.daoran.tv/API_ROP";
    private static final String PIC = "https://ottphoto.daoran.tv/HD/";
    private static final String MD5 = "SkvyrWqK9QHTdCT12Rhxunjx+WwMTe9y4KwgeASFDhbYabRSPskR0Q==";

    private String postJson(String url, Map<String, Object> body) {
        try {
            Map<String, String> h = new HashMap<>();
            h.put("Content-Type", "application/json;charset=utf-8");
            h.put("User-Agent", "okhttp/3.9.1");
            h.put("md5", MD5);
            return OkHttp.post(url, new JSONObject(body).toString(), h).getBody();
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        try {
            Map<String, Object> body = new HashMap<>();
            body.put("leastNum", "0");
            body.put("memberId", "yszyz");
            body.put("project", "lyhxcx");
            body.put("userId", "yszyz");
            JSONArray sects = new JSONObject(postJson(API + "/page/setinf/get", body)).optJSONArray("sects");
            if (sects != null) {
                for (int i = 0; i < sects.length(); i++) {
                    JSONObject o = sects.optJSONObject(i);
                    classes.add(new Class(o.optString("code"), o.optString("name")));
                }
            }
        } catch (Exception ignored) {
        }
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        Map<String, Object> body = new HashMap<>();
        body.put("cur", pg);
        body.put("free", "0");
        body.put("item", "o5");
        body.put("pageSize", "20");
        List<String> sect = new ArrayList<>();
        sect.add(tid);
        body.put("sect", sect);
        JSONArray arr = new JSONObject(postJson(API + "/search/album/list", body)).optJSONObject("pb").optJSONArray("dataList");
        List<Vod> list = new ArrayList<>();
        if (arr != null) {
            for (int i = 0; i < arr.length(); i++) {
                JSONObject o = arr.optJSONObject(i);
                list.add(new Vod(o.optString("code"), o.optString("name"), PIC + o.optString("img"), o.optString("publishTime")));
            }
        }
        return Result.get().vod(list).page(Integer.parseInt(pg), 0, 0, 0).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Map<String, Object> body = new HashMap<>();
        body.put("albumCode", ids.get(0));
        body.put("cur", "1");
        body.put("project", "lyhxcx");
        body.put("pageSize", "2147483647");
        body.put("selectFlag", "0");
        body.put("userId", "yszyz");
        JSONObject root = new JSONObject(postJson(API + "/album/res/list", body));
        JSONObject album = root.optJSONObject("album");
        JSONArray eps = root.optJSONObject("pb").optJSONArray("dataList");
        List<String> plays = new ArrayList<>();
        if (eps != null) {
            for (int i = 0; i < eps.length(); i++) {
                JSONObject e = eps.optJSONObject(i);
                plays.add(e.optString("name") + "$" + e.optString("code"));
            }
        }
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodName(album.optString("name"));
        vod.setVodPic(PIC + album.optString("img"));
        vod.setTypeName(album.optString("sect"));
        vod.setVodContent(album.optString("des"));
        vod.setVodActor(album.optString("artistName"));
        vod.setVodDirector(album.optString("vod_director"));
        vod.setVodYear(album.optString("publishTime"));
        vod.setVodPlayFrom("在线播放");
        vod.setVodPlayUrl(TextUtils.join("#", plays));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        Map<String, Object> body = new HashMap<>();
        body.put("item", "y9");
        body.put("nodeCode", "001000");
        body.put("project", "lyhxcx");
        body.put("px", "2");
        body.put("resCode", id);
        body.put("userId", "92315ec6e58a45ba7f47fd143b3d7956");
        String play = new JSONObject(postJson(API + "/play/get/playurl", body)).optJSONObject("playres").optString("playurl");
        return Result.get().url(play).string();
    }
}
