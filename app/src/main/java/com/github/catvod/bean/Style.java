package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

public class Style {
    @SerializedName("type")
    private String type;
    @SerializedName("ratio")
    private Float ratio;

    public Style() {}
    public Style(String type, Float ratio) { this.type = type; this.ratio = ratio; }
    public static Style rect() { return new Style("rect", 0.75f); }
    public static Style list() { return new Style("list", null); }
    public static Style oval() { return new Style("oval", 1.0f); }
}
