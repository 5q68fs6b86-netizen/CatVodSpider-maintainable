package com.base.model.proto;

import java.util.Collections;
import java.util.List;
import java.util.Map;

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
    public String getIntro() { return ""; }
    public String getRemark() { return ""; }
    public String getArea() { return ""; }
    public String getYear() { return ""; }
    public String getActor() { return ""; }
    public String getTag() { return ""; }
    public String getSource() { return ""; }
    public String getSourceCn() { return ""; }
    public String getPath() { return ""; }
    public String getThumbnailPath() { return ""; }
    public String getStr2() { return ""; }
    public String getStr3() { return ""; }
    public String getStr4() { return ""; }
    public String getStr5() { return ""; }
    public int getCode() { return 0; }
    public int getCount() { return 0; }
    public int getTotal() { return 0; }
    public int getPage() { return 0; }
    public int getHeadersCount() { return 0; }
    public long getLongId() { return 0L; }
    public boolean hasData() { return false; }
    public boolean hasNext() { return false; }
    public boolean getSuccess() { return true; }
    public ProtoBase getData() { return this; }
    public ProtoBase getResult() { return this; }
    public ProtoBase getCoverImage() { return this; }
    public List getListList() { return Collections.emptyList(); }
    public List getItemsList() { return Collections.emptyList(); }
    public List getRecordsList() { return Collections.emptyList(); }
    public List getDramaListList() { return Collections.emptyList(); }
    public List getDramaBeanList() { return Collections.emptyList(); }
    public List getVideoListList() { return Collections.emptyList(); }
    public List getVideosList() { return Collections.emptyList(); }
    public int getListCount() { return 0; }
    public ProtoBase getList(int i) { return this; }
    public Map getHeadersMap() { return Collections.emptyMap(); }
    public Object getOrDefault(Object k, Object v) { return v; }
    public static Builder newBuilder() { return new Builder(); }
    public Builder toBuilder() { return new Builder(); }
    public static class Builder {
        public Builder mergeFrom(byte[] b) { return this; }
        public Builder mergeFrom(ProtoBase m) { return this; }
        public Builder setValue(String v) { return this; }
        public Builder setUrl(String v) { return this; }
        public Builder setData(ProtoBase v) { return this; }
        public Builder setKey(String v) { return this; }
        public Builder setContent(String v) { return this; }
        public ProtoBase build() { return new ProtoBase(); }
        public ProtoBase buildPartial() { return new ProtoBase(); }
    }
}
