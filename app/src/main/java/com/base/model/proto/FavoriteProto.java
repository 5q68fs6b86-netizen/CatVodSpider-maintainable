package com.base.model.proto;

public final class FavoriteProto {
    private FavoriteProto() {}
    public static class Data {

        public static Data parseFrom(byte[] b) { return new Data(); }
        public static Data parseFrom(java.io.InputStream in) { return new Data(); }
        public static Data getDefaultInstance() { return new Data(); }
        public static DataMsgBuilder newBuilder() { return new DataMsgBuilder(); }
        public DataMsgBuilder toBuilder() { return new DataMsgBuilder(); }
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
        public Data getData() { return this; }
        public Data getResult() { return this; }
        public Data getCoverImage() { return this; }
        public java.util.List getListList() { return java.util.Collections.emptyList(); }
        public java.util.List getItemsList() { return java.util.Collections.emptyList(); }
        public java.util.List getRecordsList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaListList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaBeanList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideoListList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideosList() { return java.util.Collections.emptyList(); }
        public int getListCount() { return 0; }
        public Data getList(int i) { return this; }
        public java.util.Map getHeadersMap() { return java.util.Collections.emptyMap(); }
        public Object getOrDefault(Object k, Object v) { return v; }
        public static final class DataMsgBuilder {
            public DataMsgBuilder mergeFrom(byte[] b) { return this; }
            public DataMsgBuilder setValue(String v) { return this; }
            public DataMsgBuilder setUrl(String v) { return this; }
            public DataMsgBuilder setKey(String v) { return this; }
            public DataMsgBuilder setContent(String v) { return this; }
            public Data build() { return new Data(); }
            public Data buildPartial() { return new Data(); }
        }

    }
    public static class FavoriteBean {

        public static FavoriteBean parseFrom(byte[] b) { return new FavoriteBean(); }
        public static FavoriteBean parseFrom(java.io.InputStream in) { return new FavoriteBean(); }
        public static FavoriteBean getDefaultInstance() { return new FavoriteBean(); }
        public static FavoriteBeanMsgBuilder newBuilder() { return new FavoriteBeanMsgBuilder(); }
        public FavoriteBeanMsgBuilder toBuilder() { return new FavoriteBeanMsgBuilder(); }
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
        public FavoriteBean getData() { return this; }
        public FavoriteBean getResult() { return this; }
        public FavoriteBean getCoverImage() { return this; }
        public java.util.List getListList() { return java.util.Collections.emptyList(); }
        public java.util.List getItemsList() { return java.util.Collections.emptyList(); }
        public java.util.List getRecordsList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaListList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaBeanList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideoListList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideosList() { return java.util.Collections.emptyList(); }
        public int getListCount() { return 0; }
        public FavoriteBean getList(int i) { return this; }
        public java.util.Map getHeadersMap() { return java.util.Collections.emptyMap(); }
        public Object getOrDefault(Object k, Object v) { return v; }
        public static final class FavoriteBeanMsgBuilder {
            public FavoriteBeanMsgBuilder mergeFrom(byte[] b) { return this; }
            public FavoriteBeanMsgBuilder setValue(String v) { return this; }
            public FavoriteBeanMsgBuilder setUrl(String v) { return this; }
            public FavoriteBeanMsgBuilder setKey(String v) { return this; }
            public FavoriteBeanMsgBuilder setContent(String v) { return this; }
            public FavoriteBean build() { return new FavoriteBean(); }
            public FavoriteBean buildPartial() { return new FavoriteBean(); }
        }

    }
    public static class FavoriteBeanPage {

        public static FavoriteBeanPage parseFrom(byte[] b) { return new FavoriteBeanPage(); }
        public static FavoriteBeanPage parseFrom(java.io.InputStream in) { return new FavoriteBeanPage(); }
        public static FavoriteBeanPage getDefaultInstance() { return new FavoriteBeanPage(); }
        public static FavoriteBeanPageMsgBuilder newBuilder() { return new FavoriteBeanPageMsgBuilder(); }
        public FavoriteBeanPageMsgBuilder toBuilder() { return new FavoriteBeanPageMsgBuilder(); }
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
        public FavoriteBeanPage getData() { return this; }
        public FavoriteBeanPage getResult() { return this; }
        public FavoriteBeanPage getCoverImage() { return this; }
        public java.util.List getListList() { return java.util.Collections.emptyList(); }
        public java.util.List getItemsList() { return java.util.Collections.emptyList(); }
        public java.util.List getRecordsList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaListList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaBeanList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideoListList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideosList() { return java.util.Collections.emptyList(); }
        public int getListCount() { return 0; }
        public FavoriteBeanPage getList(int i) { return this; }
        public java.util.Map getHeadersMap() { return java.util.Collections.emptyMap(); }
        public Object getOrDefault(Object k, Object v) { return v; }
        public static final class FavoriteBeanPageMsgBuilder {
            public FavoriteBeanPageMsgBuilder mergeFrom(byte[] b) { return this; }
            public FavoriteBeanPageMsgBuilder setValue(String v) { return this; }
            public FavoriteBeanPageMsgBuilder setUrl(String v) { return this; }
            public FavoriteBeanPageMsgBuilder setKey(String v) { return this; }
            public FavoriteBeanPageMsgBuilder setContent(String v) { return this; }
            public FavoriteBeanPage build() { return new FavoriteBeanPage(); }
            public FavoriteBeanPage buildPartial() { return new FavoriteBeanPage(); }
        }

    }
    public static class Item {

        public static Item parseFrom(byte[] b) { return new Item(); }
        public static Item parseFrom(java.io.InputStream in) { return new Item(); }
        public static Item getDefaultInstance() { return new Item(); }
        public static ItemMsgBuilder newBuilder() { return new ItemMsgBuilder(); }
        public ItemMsgBuilder toBuilder() { return new ItemMsgBuilder(); }
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
        public Item getData() { return this; }
        public Item getResult() { return this; }
        public Item getCoverImage() { return this; }
        public java.util.List getListList() { return java.util.Collections.emptyList(); }
        public java.util.List getItemsList() { return java.util.Collections.emptyList(); }
        public java.util.List getRecordsList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaListList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaBeanList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideoListList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideosList() { return java.util.Collections.emptyList(); }
        public int getListCount() { return 0; }
        public Item getList(int i) { return this; }
        public java.util.Map getHeadersMap() { return java.util.Collections.emptyMap(); }
        public Object getOrDefault(Object k, Object v) { return v; }
        public static final class ItemMsgBuilder {
            public ItemMsgBuilder mergeFrom(byte[] b) { return this; }
            public ItemMsgBuilder setValue(String v) { return this; }
            public ItemMsgBuilder setUrl(String v) { return this; }
            public ItemMsgBuilder setKey(String v) { return this; }
            public ItemMsgBuilder setContent(String v) { return this; }
            public Item build() { return new Item(); }
            public Item buildPartial() { return new Item(); }
        }

    }
    public static class Result {

        public static Result parseFrom(byte[] b) { return new Result(); }
        public static Result parseFrom(java.io.InputStream in) { return new Result(); }
        public static Result getDefaultInstance() { return new Result(); }
        public static ResultMsgBuilder newBuilder() { return new ResultMsgBuilder(); }
        public ResultMsgBuilder toBuilder() { return new ResultMsgBuilder(); }
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
        public Result getData() { return this; }
        public Result getResult() { return this; }
        public Result getCoverImage() { return this; }
        public java.util.List getListList() { return java.util.Collections.emptyList(); }
        public java.util.List getItemsList() { return java.util.Collections.emptyList(); }
        public java.util.List getRecordsList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaListList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaBeanList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideoListList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideosList() { return java.util.Collections.emptyList(); }
        public int getListCount() { return 0; }
        public Result getList(int i) { return this; }
        public java.util.Map getHeadersMap() { return java.util.Collections.emptyMap(); }
        public Object getOrDefault(Object k, Object v) { return v; }
        public static final class ResultMsgBuilder {
            public ResultMsgBuilder mergeFrom(byte[] b) { return this; }
            public ResultMsgBuilder setValue(String v) { return this; }
            public ResultMsgBuilder setUrl(String v) { return this; }
            public ResultMsgBuilder setKey(String v) { return this; }
            public ResultMsgBuilder setContent(String v) { return this; }
            public Result build() { return new Result(); }
            public Result buildPartial() { return new Result(); }
        }

    }
}
