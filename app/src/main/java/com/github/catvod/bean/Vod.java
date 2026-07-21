package com.github.catvod.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Vod {

    @SerializedName("type_name")
    private String typeName;
    @SerializedName("vod_id")
    private String vodId;
    @SerializedName("vod_name")
    private String vodName;
    @SerializedName("vod_pic")
    private String vodPic;
    @SerializedName("vod_remarks")
    private String vodRemarks;
    @SerializedName("vod_year")
    private String vodYear;
    @SerializedName("vod_area")
    private String vodArea;
    @SerializedName("vod_actor")
    private String vodActor;
    @SerializedName("vod_director")
    private String vodDirector;
    @SerializedName("vod_content")
    private String vodContent;
    @SerializedName("vod_play_from")
    private String vodPlayFrom;
    @SerializedName("vod_play_url")
    private String vodPlayUrl;
    @SerializedName("vod_tag")
    private String vodTag;
    @SerializedName("action")
    private String action;
    @SerializedName("style")
    private Style style;

    public static Vod objectFrom(String str) {
        Vod item = new Gson().fromJson(str, Vod.class);
        return item == null ? new Vod() : item;
    }

    public static Vod action(String action) {
        Vod vod = new Vod();
        vod.action = action;
        return vod;
    }

    public Vod() {
    }

    public Vod(String vodId, String vodName, String vodPic) {
        setVodId(vodId);
        setVodName(vodName);
        setVodPic(vodPic);
    }

    public Vod(String vodId, String vodName, String vodPic, String vodRemarks) {
        setVodId(vodId);
        setVodName(vodName);
        setVodPic(vodPic);
        setVodRemarks(vodRemarks);
    }

    public Vod(String vodId, String vodName, String vodPic, String vodRemarks, String action) {
        setVodId(vodId);
        setVodName(vodName);
        setVodPic(vodPic);
        setVodRemarks(vodRemarks);
        setAction(action);
    }

    public Vod(String vodId, String vodName, String vodPic, String vodRemarks, Style style) {
        setVodId(vodId);
        setVodName(vodName);
        setVodPic(vodPic);
        setVodRemarks(vodRemarks);
        setStyle(style);
    }

    public Vod(String vodId, String vodName, String vodPic, String vodRemarks, Style style, String action) {
        setVodId(vodId);
        setVodName(vodName);
        setVodPic(vodPic);
        setVodRemarks(vodRemarks);
        setStyle(style);
        setAction(action);
    }

    public Vod(String vodId, String vodName, String vodPic, String vodRemarks, boolean folder) {
        setVodId(vodId);
        setVodName(vodName);
        setVodPic(vodPic);
        setVodRemarks(vodRemarks);
        setVodTag(folder ? "folder" : "file");
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setVodId(String vodId) {
        this.vodId = vodId;
    }

    public void setVodName(String vodName) {
        this.vodName = vodName;
    }

    public void setVodPic(String vodPic) {
        this.vodPic = vodPic;
    }

    public void setVodRemarks(String vodRemarks) {
        this.vodRemarks = vodRemarks;
    }

    public void setVodYear(String vodYear) {
        this.vodYear = vodYear;
    }

    public void setVodArea(String vodArea) {
        this.vodArea = vodArea;
    }

    public void setVodActor(String vodActor) {
        this.vodActor = vodActor;
    }

    public void setVodDirector(String vodDirector) {
        this.vodDirector = vodDirector;
    }

    public void setVodContent(String vodContent) {
        this.vodContent = vodContent;
    }

    public String getVodContent() {
        return vodContent;
    }

    public void setVodPlayFrom(String vodPlayFrom) {
        this.vodPlayFrom = vodPlayFrom;
    }

    public void setVodPlayUrl(String vodPlayUrl) {
        this.vodPlayUrl = vodPlayUrl;
    }

    public String getVodPlayUrl() {
        return vodPlayUrl;
    }

    public void setVodTag(String vodTag) {
        this.vodTag = vodTag;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public static class Style {

        @SerializedName("type")
        private String type;
        @SerializedName("ratio")
        private Float ratio;

        public static Style rect() {
            return rect(0.75f);
        }

        public static Style rect(float ratio) {
            return new Style("rect", ratio);
        }

        public static Style oval() {
            return new Style("oval", 1.0f);
        }

        public static Style full() {
            return new Style("full");
        }

        public static Style list() {
            return new Style("list");
        }

        public Style(String type) {
            this.type = type;
        }

        public Style(String type, Float ratio) {
            this.type = type;
            this.ratio = ratio;
        }
    }

    /** decompile alias of Style */
    public static class a extends Style {
        public a() { super(); }
        public a(String type, Float ratio) { super(type, ratio); }
        public static a m5857a() { return new a("rect", 0.75f); }
        public static a m5858b(float f) { return new a("rect", f); }
    }



    public String m5838a() {
        return this.vodId;
    }
    public String m5839b() {
        return this.vodName;
    }
    public String m5840c() {
        return this.vodPlayUrl;
    }
    public void m5841d(Style aVar) {
        this.style = aVar;
    }
    public void m5842e(String str) {
        this.typeName = str;
    }
    public void m5843f(String str) {
        this.vodActor = str;
    }
    public String m5844g() {
        return this.vodPlayUrl;
    }
    public void m5845g(String str) {
        this.vodArea = str;
    }
    public void m5846h(String str) {
        this.vodContent = str;
    }
    public void m5847i(String str) {
        this.vodDirector = str;
    }
    public void m5848j(String str) {
        this.vodId = str;
    }
    public void m5849k(String str) {
        this.vodName = str;
    }
    public void m5850l(String str) {
        this.vodPic = str;
    }
    public void m5851m(String str) {
        this.vodPlayFrom = str;
    }
    public void m5852n(String str) {
        this.vodPlayUrl = str;
    }
    public void m5853o(String str) {
        this.vodRemarks = str;
    }
    public void m5854p(String str) {
        this.vodTag = str;
    }
    public void m5855q(String str) {
        this.vodYear = str;
    }
    public void m5856r(String str) {
        this.action = str;
    }

    public String m4215a() {
        return this.vodPlayUrl;
    }
    public void m4216b(String str) {
        this.typeName = str;
    }
    public void m4217c(String str) {
        this.vodActor = str;
    }
    public void m4218d(String str) {
        this.vodArea = str;
    }
    public void m4219e(String str) {
        this.vodContent = str;
    }
    public void m4220f(String str) {
        this.vodDirector = str;
    }
    public void m4221g(String str) {
        this.vodId = str;
    }
    public void m4222h(String str) {
        this.vodName = str;
    }
    public void m4223i(String str) {
        this.vodPic = str;
    }
    public void m4224j(String str) {
        this.vodPlayFrom = str;
    }
    public void m4225k(String str) {
        this.vodPlayUrl = str;
    }
    public void m4226l(String str) {
        this.vodRemarks = str;
    }
    public void m4227m(String str) {
        this.vodTag = str;
    }
    public void m4228n(String str) {
        this.vodYear = str;
    }
}
