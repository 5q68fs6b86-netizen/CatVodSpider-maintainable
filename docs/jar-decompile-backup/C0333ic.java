package com.github.catvod.spider.support.p002A0;

import com.github.catvod.crawler.SpiderDebug;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ic */
/* JADX INFO: loaded from: classes.dex */
public final class C0333ic {

    /* JADX INFO: renamed from: a */
    public String f932a;

    /* JADX INFO: renamed from: aa */
    public Pattern f933aa;

    /* JADX INFO: renamed from: ab */
    public String f934ab;

    /* JADX INFO: renamed from: ac */
    public String f935ac;

    /* JADX INFO: renamed from: ad */
    public String f936ad;

    /* JADX INFO: renamed from: ae */
    public String f937ae;

    /* JADX INFO: renamed from: af */
    public Pattern f938af;

    /* JADX INFO: renamed from: ag */
    public String f939ag;

    /* JADX INFO: renamed from: ah */
    public Pattern f940ah;

    /* JADX INFO: renamed from: ai */
    public String f941ai;

    /* JADX INFO: renamed from: aj */
    public Pattern f942aj;

    /* JADX INFO: renamed from: ak */
    public String f943ak;

    /* JADX INFO: renamed from: al */
    public Pattern f944al;

    /* JADX INFO: renamed from: am */
    public String f945am;

    /* JADX INFO: renamed from: an */
    public Pattern f946an;

    /* JADX INFO: renamed from: ao */
    public String f947ao;

    /* JADX INFO: renamed from: ap */
    public Pattern f948ap;

    /* JADX INFO: renamed from: aq */
    public String f949aq;

    /* JADX INFO: renamed from: ar */
    public Pattern f950ar;

    /* JADX INFO: renamed from: as */
    public String f951as;

    /* JADX INFO: renamed from: at */
    public Pattern f952at;

    /* JADX INFO: renamed from: au */
    public String f953au;

    /* JADX INFO: renamed from: av */
    public Pattern f954av;

    /* JADX INFO: renamed from: aw */
    public String f955aw;

    /* JADX INFO: renamed from: ax */
    public String f956ax;

    /* JADX INFO: renamed from: ay */
    public Pattern f957ay;

    /* JADX INFO: renamed from: az */
    public String f958az;

    /* JADX INFO: renamed from: b */
    public String f959b;

    /* JADX INFO: renamed from: ba */
    public String f960ba;

    /* JADX INFO: renamed from: bb */
    public String f961bb;

    /* JADX INFO: renamed from: bc */
    public Pattern f962bc;

    /* JADX INFO: renamed from: bd */
    public String f963bd;

    /* JADX INFO: renamed from: be */
    public Pattern f964be;

    /* JADX INFO: renamed from: bf */
    public boolean f965bf;

    /* JADX INFO: renamed from: bg */
    public String f966bg;

    /* JADX INFO: renamed from: bh */
    public String f967bh;

    /* JADX INFO: renamed from: bi */
    public String f968bi;

    /* JADX INFO: renamed from: bj */
    public String f969bj;

    /* JADX INFO: renamed from: bk */
    public String f970bk;

    /* JADX INFO: renamed from: bl */
    public Pattern f971bl;

    /* JADX INFO: renamed from: bm */
    public String f972bm;

    /* JADX INFO: renamed from: bn */
    public Pattern f973bn;

    /* JADX INFO: renamed from: bo */
    public String f974bo;

    /* JADX INFO: renamed from: bp */
    public Pattern f975bp;

    /* JADX INFO: renamed from: bq */
    public String f976bq;

    /* JADX INFO: renamed from: br */
    public Pattern f977br;

    /* JADX INFO: renamed from: bs */
    public boolean f978bs;

    /* JADX INFO: renamed from: bt */
    public String f979bt;

    /* JADX INFO: renamed from: bu */
    public String f980bu;

    /* JADX INFO: renamed from: c */
    public String f981c;

    /* JADX INFO: renamed from: d */
    public String f982d;

    /* JADX INFO: renamed from: e */
    public Pattern f983e;

    /* JADX INFO: renamed from: f */
    public String f984f;

    /* JADX INFO: renamed from: g */
    public Pattern f985g;

    /* JADX INFO: renamed from: h */
    public LinkedHashMap f986h;

    /* JADX INFO: renamed from: i */
    public JSONObject f987i;

    /* JADX INFO: renamed from: j */
    public String f988j;

    /* JADX INFO: renamed from: k */
    public String f989k;

    /* JADX INFO: renamed from: l */
    public Pattern f990l;

    /* JADX INFO: renamed from: m */
    public String f991m;

    /* JADX INFO: renamed from: n */
    public Pattern f992n;

    /* JADX INFO: renamed from: o */
    public String f993o;

    /* JADX INFO: renamed from: p */
    public Pattern f994p;

    /* JADX INFO: renamed from: q */
    public String f995q;

    /* JADX INFO: renamed from: r */
    public Pattern f996r;

    /* JADX INFO: renamed from: s */
    public String f997s;

    /* JADX INFO: renamed from: t */
    public String f998t;

    /* JADX INFO: renamed from: u */
    public String f999u;

    /* JADX INFO: renamed from: v */
    public String f1000v;

    /* JADX INFO: renamed from: w */
    public Pattern f1001w;

    /* JADX INFO: renamed from: x */
    public String f1002x;

    /* JADX INFO: renamed from: y */
    public Pattern f1003y;

    /* JADX INFO: renamed from: z */
    public String f1004z;

    /* JADX INFO: renamed from: bv */
    public static String m1299bv(String str, Pattern pattern) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return str;
    }

    /* JADX INFO: renamed from: bw */
    public static C0333ic m1300bw(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0333ic c0333ic = new C0333ic();
            c0333ic.f986h = new LinkedHashMap();
            c0333ic.f932a = jSONObject.optString("ua");
            c0333ic.f959b = jSONObject.optString("homeUrl").trim();
            c0333ic.f981c = jSONObject.optString("cateNode").trim();
            c0333ic.f982d = jSONObject.optString("cateName").trim();
            c0333ic.f983e = m1301bx("cateNameR", jSONObject);
            c0333ic.f984f = jSONObject.optString("cateId").trim();
            c0333ic.f985g = m1301bx("cateIdR", jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cateManual");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c0333ic.f986h.put(next.trim(), jSONObjectOptJSONObject.getString(next).trim());
                }
            }
            c0333ic.f987i = jSONObject.optJSONObject("filter");
            c0333ic.f988j = jSONObject.optString("homeVodNode").trim();
            c0333ic.f989k = jSONObject.optString("homeVodName").trim();
            c0333ic.f990l = m1301bx("homeVodNameR", jSONObject);
            c0333ic.f991m = jSONObject.optString("homeVodId").trim();
            c0333ic.f992n = m1301bx("homeVodIdR", jSONObject);
            c0333ic.f993o = jSONObject.optString("homeVodImg").trim();
            c0333ic.f994p = m1301bx("homeVodImgR", jSONObject);
            c0333ic.f995q = jSONObject.optString("homeVodMark").trim();
            c0333ic.f996r = m1301bx("homeVodMarkR", jSONObject);
            c0333ic.f997s = jSONObject.optString("cateUrl").trim();
            c0333ic.f998t = jSONObject.optString("cateUrl2").trim();
            c0333ic.f999u = jSONObject.optString("cateVodNode").trim();
            c0333ic.f1000v = jSONObject.optString("cateVodName").trim();
            c0333ic.f1001w = m1301bx("cateVodNameR", jSONObject);
            c0333ic.f1002x = jSONObject.optString("cateVodId").trim();
            c0333ic.f1003y = m1301bx("cateVodIdR", jSONObject);
            c0333ic.f1004z = jSONObject.optString("cateVodImg").trim();
            c0333ic.f933aa = m1301bx("cateVodImgR", jSONObject);
            c0333ic.f934ab = jSONObject.optString("cateVodMark").trim();
            m1301bx("cateVodMarkR", jSONObject);
            c0333ic.f935ac = jSONObject.optString("dtUrl");
            c0333ic.f936ad = jSONObject.optString("dtNode");
            c0333ic.f937ae = jSONObject.optString("dtName");
            c0333ic.f938af = m1301bx("dtNameR", jSONObject);
            c0333ic.f939ag = jSONObject.optString("dtImg");
            c0333ic.f940ah = m1301bx("dtImgR", jSONObject);
            c0333ic.f941ai = jSONObject.optString("dtCate");
            c0333ic.f942aj = m1301bx("dtCateR", jSONObject);
            c0333ic.f943ak = jSONObject.optString("dtYear");
            c0333ic.f944al = m1301bx("dtYearR", jSONObject);
            c0333ic.f945am = jSONObject.optString("dtArea");
            c0333ic.f946an = m1301bx("dtAreaR", jSONObject);
            c0333ic.f947ao = jSONObject.optString("dtMark");
            c0333ic.f948ap = m1301bx("dtMarkR", jSONObject);
            c0333ic.f949aq = jSONObject.optString("dtActor");
            c0333ic.f950ar = m1301bx("dtActorR", jSONObject);
            c0333ic.f951as = jSONObject.optString("dtDirector");
            c0333ic.f952at = m1301bx("dtDirectorR", jSONObject);
            c0333ic.f953au = jSONObject.optString("dtDesc");
            c0333ic.f954av = m1301bx("dtDescR", jSONObject);
            c0333ic.f955aw = jSONObject.optString("dtFromNode");
            c0333ic.f956ax = jSONObject.optString("dtFromName");
            c0333ic.f957ay = m1301bx("dtFromNameR", jSONObject);
            c0333ic.f958az = jSONObject.optString("dtUrlNode");
            c0333ic.f960ba = jSONObject.optString("dtUrlSubNode");
            c0333ic.f961bb = jSONObject.optString("dtUrlId");
            c0333ic.f962bc = m1301bx("dtUrlIdR", jSONObject);
            c0333ic.f963bd = jSONObject.optString("dtUrlName");
            c0333ic.f964be = m1301bx("dtUrlNameR", jSONObject);
            c0333ic.f965bf = jSONObject.optBoolean("dtEpiRevers", false);
            c0333ic.f966bg = jSONObject.optString("playUrl");
            c0333ic.f967bh = jSONObject.optString("playUa");
            c0333ic.f968bi = jSONObject.optString("searchUrl");
            c0333ic.f969bj = jSONObject.optString("scVodNode").trim();
            c0333ic.f970bk = jSONObject.optString("scVodName").trim();
            c0333ic.f971bl = m1301bx("scVodNameR", jSONObject);
            c0333ic.f972bm = jSONObject.optString("scVodId").trim();
            c0333ic.f973bn = m1301bx("scVodIdR", jSONObject);
            c0333ic.f974bo = jSONObject.optString("scVodImg").trim();
            c0333ic.f975bp = m1301bx("scVodImgR", jSONObject);
            c0333ic.f976bq = jSONObject.optString("scVodMark").trim();
            c0333ic.f977br = m1301bx("scVodMarkR", jSONObject);
            c0333ic.f978bs = jSONObject.optBoolean("ManualSniff", false);
            c0333ic.f979bt = jSONObject.optString("sniffWord");
            c0333ic.f980bu = jSONObject.optString("filterWord");
            return c0333ic;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: bx */
    public static Pattern m1301bx(String str, JSONObject jSONObject) {
        String strTrim = jSONObject.optString(str).trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            return Pattern.compile(strTrim);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }
}
