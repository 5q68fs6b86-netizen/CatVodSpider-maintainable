package com.github.catvod.spider.support.p121f;

import android.text.TextUtils;
import com.github.catvod.spider.support.p102H.C2051g;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2177k;
import com.github.catvod.spider.support.p118c.C2194e;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p121f.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2216e {

    /* JADX INFO: renamed from: a */
    @SerializedName("code")
    private Integer f5487a;

    /* JADX INFO: renamed from: b */
    @SerializedName("message")
    private String f5488b;

    /* JADX INFO: renamed from: c */
    @SerializedName("data")
    private C2213b f5489c;

    /* JADX INFO: renamed from: d */
    @SerializedName("result")
    private C2213b f5490d;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p121f.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        @SerializedName("bvid")
        private String f5491a;

        /* JADX INFO: renamed from: b */
        @SerializedName("title")
        private String f5492b;

        /* JADX INFO: renamed from: c */
        @SerializedName("pic")
        private String f5493c;

        /* JADX INFO: renamed from: d */
        @SerializedName("duration")
        private String f5494d;

        /* JADX INFO: renamed from: e */
        @SerializedName("length")
        private String f5495e;

        /* JADX INFO: renamed from: f */
        @SerializedName("rcmd_reason")
        private c f5496f;

        /* JADX INFO: renamed from: g */
        @SerializedName("stat")
        private d f5497g;

        /* JADX INFO: renamed from: com.github.catvod.spider.support.p121f.e$a$a, reason: collision with other inner class name */
        class C2616a extends TypeToken<List<a>> {
            C2616a() {
            }
        }

        /* JADX INFO: renamed from: com.github.catvod.spider.support.p121f.e$a$b */
        class b extends TypeToken<List<a>> {
            b() {
            }
        }

        /* JADX INFO: renamed from: com.github.catvod.spider.support.p121f.e$a$c */
        public static class c {

            /* JADX INFO: renamed from: a */
            @SerializedName("content")
            private String f5498a;

            /* JADX INFO: renamed from: a */
            public final String m5989a() {
                return TextUtils.isEmpty(this.f5498a) ? "" : this.f5498a;
            }
        }

        /* JADX INFO: renamed from: com.github.catvod.spider.support.p121f.e$a$d */
        public static class d {

            /* JADX INFO: renamed from: a */
            @SerializedName("view")
            private String f5499a;

            /* JADX INFO: renamed from: b */
            @SerializedName("favorite")
            private String f5500b;

            /* JADX INFO: renamed from: c */
            @SerializedName("danmaku")
            private String f5501c;

            /* JADX INFO: renamed from: a */
            public final String m5990a() {
                return TextUtils.isEmpty(this.f5501c) ? "" : this.f5501c;
            }

            /* JADX INFO: renamed from: b */
            public final String m5991b() {
                return TextUtils.isEmpty(this.f5500b) ? "" : this.f5500b;
            }

            /* JADX INFO: renamed from: c */
            public final String m5992c() {
                return TextUtils.isEmpty(this.f5499a) ? "" : this.f5499a;
            }
        }

        /* JADX INFO: renamed from: a */
        public static List<a> m5984a(JsonElement jsonElement) {
            return (List) new Gson().fromJson(jsonElement, new C2616a().getType());
        }

        /* JADX INFO: renamed from: b */
        public static List<a> m5985b(String str) {
            return (List) new Gson().fromJson(str, new b().getType());
        }

        /* JADX INFO: renamed from: c */
        public final String m5986c() {
            return TextUtils.isEmpty(this.f5493c) ? "" : this.f5493c;
        }

        /* JADX INFO: renamed from: d */
        public final d m5987d() {
            d dVar = this.f5497g;
            return dVar == null ? new d() : dVar;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x0142  */
        /* JADX WARN: Code duplicated, block: B:50:0x0154  */
        /* JADX INFO: renamed from: e */
        public final C2194e m5988e() {
            StringBuilder sbM5396a;
            StringBuilder sb;
            String str;
            String str2;
            String string;
            StringBuilder sbM5396a2;
            String strM5986c;
            C2194e c2194e = new C2194e();
            String string2 = "";
            c2194e.m5848j(TextUtils.isEmpty(this.f5491a) ? "" : this.f5491a);
            c2194e.m5849k(C2051g.m5074d(TextUtils.isEmpty(this.f5492b) ? "" : this.f5492b).m4902t0());
            c cVar = this.f5496f;
            if (cVar == null) {
                cVar = new c();
            }
            String strM5989a = cVar.m5989a();
            if (TextUtils.isEmpty(strM5989a)) {
                String strM5992c = m5987d().m5992c();
                if (TextUtils.isEmpty(strM5992c)) {
                    String strM5991b = m5987d().m5991b();
                    if (TextUtils.isEmpty(strM5992c)) {
                        strM5991b = m5987d().m5990a();
                        if (TextUtils.isEmpty(strM5992c)) {
                            sbM5396a = C2137a.m5396a("时长:");
                            if (!TextUtils.isEmpty(this.f5494d)) {
                                if (this.f5494d.contains(":")) {
                                    sb = new StringBuilder();
                                    sb.append(this.f5494d.split(":")[0]);
                                } else {
                                    if (Integer.parseInt(this.f5494d) < 60) {
                                        sb = new StringBuilder();
                                        sb.append(this.f5494d);
                                        str = "秒";
                                    } else {
                                        sb = new StringBuilder();
                                        sb.append(Integer.parseInt(this.f5494d) / 60);
                                    }
                                    sb.append(str);
                                    string2 = sb.toString();
                                }
                                str = "分钟";
                                sb.append(str);
                                string2 = sb.toString();
                            } else if (!TextUtils.isEmpty(this.f5495e)) {
                                string2 = this.f5495e;
                            }
                            sbM5396a.append(string2);
                        } else {
                            sbM5396a = new StringBuilder();
                            str2 = "弹幕:";
                        }
                        string = sbM5396a.toString();
                    } else {
                        sbM5396a = new StringBuilder();
                        str2 = "收藏:";
                    }
                    sbM5396a.append(str2);
                    sbM5396a.append(strM5991b);
                    string = sbM5396a.toString();
                } else {
                    sbM5396a2 = C2137a.m5396a("播放:");
                    double d2 = Integer.parseInt(strM5992c);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    double dRound = Math.round((d2 / 10000.0d) * 10.0d);
                    Double.isNaN(dRound);
                    Double.isNaN(dRound);
                    Double.isNaN(dRound);
                    sbM5396a2.append(dRound / 10.0d);
                    strM5989a = "万";
                }
                c2194e.m5853o(string);
                if (m5986c().startsWith("//")) {
                    StringBuilder sbM5396a3 = C2137a.m5396a("https:");
                    sbM5396a3.append(m5986c());
                    strM5986c = sbM5396a3.toString();
                } else {
                    strM5986c = m5986c();
                }
                c2194e.m5850l(strM5986c);
                return c2194e;
            }
            sbM5396a2 = C2137a.m5396a("热度:");
            sbM5396a2.append(strM5989a);
            string = sbM5396a2.toString();
            c2194e.m5853o(string);
            if (m5986c().startsWith("//")) {
                StringBuilder sbM5396a4 = C2137a.m5396a("https:");
                sbM5396a4.append(m5986c());
                strM5986c = sbM5396a4.toString();
            } else {
                strM5986c = m5986c();
            }
            c2194e.m5850l(strM5986c);
            return c2194e;
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("Result{bvid='");
            C2177k.m5717c(sbM5396a, this.f5491a, '\'', ", title='");
            C2177k.m5717c(sbM5396a, this.f5492b, '\'', ", pic='");
            C2177k.m5717c(sbM5396a, this.f5493c, '\'', ", duration='");
            C2177k.m5717c(sbM5396a, this.f5494d, '\'', ", length='");
            C2177k.m5717c(sbM5396a, this.f5495e, '\'', ", rcmd=");
            sbM5396a.append(this.f5496f);
            sbM5396a.append(", stat=");
            sbM5396a.append(this.f5497g);
            sbM5396a.append('}');
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2216e m5981b(String str) {
        return (C2216e) new Gson().fromJson(str, C2216e.class);
    }

    /* JADX INFO: renamed from: a */
    public final C2213b m5982a() {
        C2213b c2213b = this.f5489c;
        return c2213b == null ? new C2213b() : c2213b;
    }

    /* JADX INFO: renamed from: b */
    public final C2213b m5983b() {
        C2213b c2213b = this.f5490d;
        return c2213b == null ? new C2213b() : c2213b;
    }
}
