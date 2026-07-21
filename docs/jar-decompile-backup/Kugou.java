package com.github.catvod.spider;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Kugou extends Spider {
    /* JADX INFO: renamed from: a */
    private String m585a(String str) {
        return C1840c.m4479n(str, null);
    }

    public static String addLrc(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("lrc", Proxy.getUrl() + "?do=kugou&site=lrc");
            return jSONObject.toString();
        } catch (Exception e) {
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    private Map<String, String> m586b() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        return map;
    }

    public static Object[] proxy(Map<String, String> map) {
        int iInflate;
        Object[] objArr = {200, "text/plain; charset=utf-8", new ByteArrayInputStream("".getBytes()), new HashMap()};
        try {
            if (!"lrc".equals(map.get("site"))) {
                objArr[0] = 404;
                return objArr;
            }
            String strM6177b = 
            if (TextUtils.isEmpty(strM6177b)) {
                objArr[0] = 404;
                return objArr;
            }
            JSONArray jSONArray = null;
            JSONObject jSONObject = new JSONObject(C1840c.m4479n("http://krcs.kugou.com/search?ver=1&man=yes&client=mobi&keyword=&duration=&hash=" + strM6177b, null));
            if (jSONObject.optInt("status") != 200) {
                objArr[0] = 404;
                return objArr;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("candidates");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() > 0) {
                jSONArray = jSONArrayOptJSONArray;
            }
            if (jSONArray == null) {
                objArr[0] = 404;
                return objArr;
            }
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject == null) {
                objArr[0] = 404;
                return objArr;
            }
            String strOptString = jSONObjectOptJSONObject.optString("id");
            String strOptString2 = jSONObjectOptJSONObject.optString("accesskey");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                objArr[0] = 404;
                return objArr;
            }
            String strOptString3 = new JSONObject(C1840c.m4479n("http://lyrics.kugou.com/download?ver=1&client=pc&id=" + strOptString + "&accesskey=" + strOptString2 + "&fmt=krc&charset=utf8", null)).optString("content");
            if (TextUtils.isEmpty(strOptString3)) {
                objArr[0] = 404;
                return objArr;
            }
            byte[] bArrDecode = Base64.decode(strOptString3, 2);
            if (bArrDecode.length <= 4) {
                objArr[0] = 404;
                return objArr;
            }
            int[] iArr = {64, 71, 97, 119, 94, 50, 116, 71, 81, 54, 49, 45, 206, 210, 110, 105};
            int length = bArrDecode.length - 4;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) (bArrDecode[i + 4] ^ iArr[i % 16]);
            }
            Inflater inflater = new Inflater();
            inflater.setInput(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (!inflater.finished() && (iInflate = inflater.inflate(bArr2)) != 0) {
                byteArrayOutputStream.write(bArr2, 0, iInflate);
            }
            inflater.end();
            objArr[2] = new ByteArrayInputStream(new String(byteArrayOutputStream.toByteArray(), "UTF-8").getBytes());
            return objArr;
        } catch (Exception e) {
            objArr[1] = "text/plain";
            objArr[2] = new ByteArrayInputStream(new byte[0]);
            objArr[0] = 404;
            return objArr;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        return !"1".equals(str2) ? "" : getKuGouRank(str);
    }

    public String detailContent(List<String> list) {
        String str = list.get(0);
        if (str.startsWith("kugou")) {
            return getKuGouMusicList(str.split("_")[1]);
        }
        return str.startsWith("aiting") ? getAiTingMusicList(str.split("_")[1]) : "";
    }

    public String getAiTingMusicList(String str) {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(C1840c.m4479n("https://catbox.n13.club/yy.php?ac=videolist&ids=" + str, null)).optJSONArray("list").optJSONObject(0);
            Vod c1768j = new Vod();
            c1768j.m4221g(str);
            c1768j.m4222h(jSONObjectOptJSONObject.optString("vod_name"));
            c1768j.m4226l("爱音乐爱生活");
            c1768j.m4219e("爱音乐爱生活");
            c1768j.m4224j("爱音乐爱生活");
            c1768j.m4225k(jSONObjectOptJSONObject.optString("vod_play_url").replace("$http", "$aiting-http"));
            return Result.string(c1768j);
        } catch (Exception e) {
            return "";
        }
    }

    public String getAiTingMusicPlayUrl(String str) {
        C1765g c1765g = Result.get()();
        c1765g.m4207x(str);
        c1765g.m4203l();
        return c1765g.toString();
    }

    public String getAiTingRank() {
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(C1840c.m4479n("https://catbox.n13.club/yy.php?ac=videolist&t=djwuqu&pg=1", null)).optJSONArray("list");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                Vod c1768j = new Vod();
                c1768j.m4221g("aiting_" + jSONObjectOptJSONObject.optString("vod_id"));
                c1768j.m4222h(jSONObjectOptJSONObject.optString("vod_name"));
                c1768j.m4223i(jSONObjectOptJSONObject.optString("vod_pic"));
                arrayList.add(c1768j);
            }
            return Result.string(arrayList);
        } catch (Exception e) {
            return "";
        }
    }

    public String getKuGouMusicList(String str) {
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(m585a("http://mobilecdnbj.kugou.com/api/v3/rank/song?version=9108&ranktype=0&plat=0&pagesize=200&area_code=1&page=1&volid=35050&rankid=" + str + "&with_res_tag=0")).optJSONObject("data").optJSONArray("info");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("filename");
                String strOptString2 = jSONObjectOptJSONObject.optString("album_id");
                String strOptString3 = jSONObjectOptJSONObject.optString("album_audio_id");
                String strOptString4 = jSONObjectOptJSONObject.optString("sqhash");
                if (TextUtils.isEmpty(strOptString4)) {
                    strOptString4 = jSONObjectOptJSONObject.optString("hash");
                }
                arrayList.add(strOptString + "$kugou-mp3_" + strOptString4 + "_" + strOptString2 + "_" + strOptString3);
                String strOptString5 = jSONObjectOptJSONObject.optString("mvhash");
                if (!TextUtils.isEmpty(strOptString5)) {
                    arrayList2.add(strOptString + "$kugou-mv_" + strOptString5);
                }
            }
            Vod c1768j = new Vod();
            c1768j.m4221g(str);
            c1768j.m4222h("酷狗音乐");
            c1768j.m4226l("爱音乐爱生活");
            c1768j.m4219e("爱音乐爱生活");
            c1768j.m4224j("MP3$$$MV");
            c1768j.m4225k(TextUtils.join("#", arrayList) + "$$$" + TextUtils.join("#", arrayList2));
            return Result.string(c1768j);
        } catch (Exception e) {
            return "";
        }
    }

    public String getKuGouRank(String str) {
        Vod c1768j;
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(m585a("http://mobilecdnbj.kugou.com/api/v3/rank/list?version=9108&plat=0&showtype=2&parentid=0&apiver=6&area_code=1&withsong=0&with_res_tag=0")).optJSONObject("data").optJSONArray("info");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if ("hot".equals(str)) {
                    if ("1".equals(jSONObjectOptJSONObject.optString("classify")) || "2".equals(jSONObjectOptJSONObject.optString("classify"))) {
                        c1768j = new Vod();
                        c1768j.m4221g("kugou_" + jSONObjectOptJSONObject.optString("rankid"));
                        c1768j.m4222h(jSONObjectOptJSONObject.optString("rankname"));
                        c1768j.m4223i(jSONObjectOptJSONObject.optString("imgurl").replace("{size}", "400"));
                        arrayList.add(c1768j);
                    }
                } else if ("special".equals(str)) {
                    if ("3".equals(jSONObjectOptJSONObject.optString("classify")) || "5".equals(jSONObjectOptJSONObject.optString("classify"))) {
                        c1768j = new Vod();
                        c1768j.m4221g("kugou_" + jSONObjectOptJSONObject.optString("rankid"));
                        c1768j.m4222h(jSONObjectOptJSONObject.optString("rankname"));
                        c1768j.m4223i(jSONObjectOptJSONObject.optString("imgurl").replace("{size}", "400"));
                        arrayList.add(c1768j);
                    }
                } else if ("global".equals(str) && ("4".equals(jSONObjectOptJSONObject.optString("classify")) || "2".equals(jSONObjectOptJSONObject.optString("classify")))) {
                    Vod c1768j2 = new Vod();
                    c1768j2.m4221g("kugou_" + jSONObjectOptJSONObject.optString("rankid"));
                    c1768j2.m4222h(jSONObjectOptJSONObject.optString("rankname"));
                    c1768j2.m4223i(jSONObjectOptJSONObject.optString("imgurl").replace("{size}", "400"));
                    arrayList.add(c1768j2);
                }
            }
            return Result.string(arrayList);
        } catch (Exception e) {
            return "";
        }
    }

    public String getKugouMusicPlayUrl(String str) {
        String strOptString;
        String strMo3511c;
        if (!str.startsWith("mp3")) {
            String str2 = str.split("_")[1];
            
            JSONObject jSONObjectOptJSONObject = new JSONObject(C1840c.m4479n("https://m.kugou.com/app/i/mv.php?cmd=100&hash=" + str2 + "&ismp3=1&ext=mp4", null)).optJSONObject("mvdata");
            if (jSONObjectOptJSONObject.has("sq")) {
                C1765g c1765g = Result.get()();
                c1765g.m4207x(jSONObjectOptJSONObject.optJSONObject("sq").optString("downurl"));
                c1765g.m4203l();
                c1765g.m4198f(m586b());
                return c1765g.toString();
            }
            if (!jSONObjectOptJSONObject.has("le")) {
                return "";
            }
            C1765g c1765g2 = Result.get()();
            c1765g2.m4207x(jSONObjectOptJSONObject.optJSONObject("le").optString("downurl"));
            c1765g2.m4203l();
            c1765g2.m4198f(m586b());
            return c1765g2.toString();
        }
        String str3 = str.split("_")[1];
        
        JSONObject jSONObject = new JSONObject(C1840c.m4479n("https://m.kugou.com/app/i/getSongInfo.php?cmd=playInfo&hash=" + str3, null));
        if (jSONObject.optString("error").contains("要付费")) {
            String strOptString2 = jSONObject.optString("songName");
            String strOptString3 = jSONObject.optString("author_name");
            Iterator<C1393m> it = C1286l.m3222g(C1840c.m4479n("https://www.sq0527.cn/search?ac=" + URLEncoder.encode(strOptString2), null)).m3478o0("ul.mul > li > a").iterator();
            while (true) {
                if (!it.hasNext()) {
                    strMo3511c = "";
                    break;
                }
                C1393m next = it.next();
                String strM3484v0 = next.m3484v0();
                if (strM3484v0.contains(strOptString2) && strM3484v0.contains(strOptString3)) {
                    strMo3511c = next.mo3511c("href");
                    break;
                }
            }
            if (TextUtils.isEmpty(strMo3511c)) {
                strOptString = "";
            } else {
                strOptString = C1286l.m3222g(C1840c.m4479n("https://www.sq0527.cn" + strMo3511c, null)).m3478o0("#btn-download-mp3").m3784a("href");
            }
        } else {
            strOptString = !TextUtils.isEmpty(jSONObject.optString("url")) ? jSONObject.optString("url") : jSONObject.optJSONArray("backup_url").optString(0);
        }
        C1765g c1765g3 = Result.get()();
        c1765g3.m4207x(strOptString);
        c1765g3.m4203l();
        return addLrc(c1765g3.toString());
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject("{\"热门榜\":\"hot\",\"特色榜\":\"special\",\"全球榜\":\"global\"}");
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(new Class(jSONObject.optString(next), next));
        }
        return Result.string(arrayList, new ArrayList());
    }

    public String playerContent(String str, String str2, List<String> list) {
        if (str2.startsWith("kugou")) {
            return getKugouMusicPlayUrl(str2.split("-")[1]);
        }
        return str2.startsWith("aiting") ? getAiTingMusicPlayUrl(str2.split("-")[1]) : "";
    }
}
