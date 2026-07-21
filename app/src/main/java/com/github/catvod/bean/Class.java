package com.github.catvod.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Class {

    @SerializedName("type_id")
    private String typeId;
    @SerializedName("type_name")
    private String typeName;
    @SerializedName("type_flag")
    private String typeFlag;

    public Class() {
    }

    public Class(String typeId) {
        this(typeId, typeId, null);
    }

    public Class(String typeId, String typeName) {
        this(typeId, typeName, null);
    }

    public Class(String typeId, String typeName, String typeFlag) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeFlag = typeFlag;
    }

    public static List<Class> arrayFrom(String str) {
        Type listType = TypeToken.getParameterized(List.class, Class.class).getType();
        return new Gson().fromJson(str, listType);
    }

    public String getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getTypeFlag() {
        return typeFlag;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setTypeFlag(String typeFlag) {
        this.typeFlag = typeFlag;
    }

    /** decompile alias used by some spiders */
    public static String m5790a() {
        return "";
    }

    public static String m5790a(String typeId, String typeName) {
        return typeName == null ? "" : typeName;
    }

    public static Class objectFrom(String typeId, String typeName) {
        return new Class(typeId, typeName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Class)) return false;
        Class it = (Class) obj;
        String a = getTypeId();
        String b = it.getTypeId();
        return a == null ? b == null : a.equals(b);
    }
}
