package com.base.model.proto;

import java.util.*;

public class ProtoBase {
    public static ProtoBase parseFrom(byte[] b) { return new ProtoBase(); }
    public static ProtoBase parseFrom(java.io.InputStream in) { return new ProtoBase(); }
    public byte[] toByteArray() { return new byte[0]; }
    public String getValue() { return ""; }
    public String getUrl() { return ""; }
    public String getMsg() { return ""; }
    public String getName() { return ""; }
    public String getTitle() { return ""; }
    public String getCover() { return ""; }
    public String getId() { return ""; }
    public String getToken() { return ""; }
    public String getKey() { return ""; }
    public String getPublicKey() { return ""; }
    public String getPlayUrl() { return ""; }
    public String getVideoUrl() { return ""; }
    public String getContent() { return ""; }
    public String getDesc() { return ""; }
    public String getDescription() { return ""; }
    public int getCode() { return 0; }
    public int getCount() { return 0; }
    public int getTotal() { return 0; }
    public int getPage() { return 0; }
    public long getLongId() { return 0L; }
    public boolean hasData() { return false; }
    public boolean getSuccess() { return true; }
    public ProtoBase getData() { return this; }
    public ProtoBase getResult() { return this; }
    public List getListList() { return Collections.emptyList(); }
    public List getItemsList() { return Collections.emptyList(); }
    public List getRecordsList() { return Collections.emptyList(); }
    public List getDramaListList() { return Collections.emptyList(); }
    public List getVideoListList() { return Collections.emptyList(); }
    public int getListCount() { return 0; }
    public ProtoBase getList(int i) { return this; }
    public Builder newBuilderForType() { return new Builder(); }
    public static Builder newBuilder() { return new Builder(); }
    public Builder toBuilder() { return new Builder(); }
    public static class Builder {
        public Builder mergeFrom(byte[] b) { return this; }
        public Builder mergeFrom(ProtoBase m) { return this; }
        public Builder setValue(String v) { return this; }
        public Builder setUrl(String v) { return this; }
        public Builder setData(ProtoBase v) { return this; }
        public ProtoBase build() { return new ProtoBase(); }
        public ProtoBase buildPartial() { return new ProtoBase(); }
    }
}
