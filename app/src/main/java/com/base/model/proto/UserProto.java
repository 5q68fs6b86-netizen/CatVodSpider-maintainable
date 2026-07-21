package com.base.model.proto;

public final class UserProto {
    private UserProto() {}
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
    public static class UserBean {

        public static UserBean parseFrom(byte[] b) { return new UserBean(); }
        public static UserBean parseFrom(java.io.InputStream in) { return new UserBean(); }
        public static UserBean getDefaultInstance() { return new UserBean(); }
        public static UserBeanMsgBuilder newBuilder() { return new UserBeanMsgBuilder(); }
        public UserBeanMsgBuilder toBuilder() { return new UserBeanMsgBuilder(); }
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
        public UserBean getData() { return this; }
        public UserBean getResult() { return this; }
        public UserBean getCoverImage() { return this; }
        public java.util.List getListList() { return java.util.Collections.emptyList(); }
        public java.util.List getItemsList() { return java.util.Collections.emptyList(); }
        public java.util.List getRecordsList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaListList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaBeanList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideoListList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideosList() { return java.util.Collections.emptyList(); }
        public int getListCount() { return 0; }
        public UserBean getList(int i) { return this; }
        public java.util.Map getHeadersMap() { return java.util.Collections.emptyMap(); }
        public Object getOrDefault(Object k, Object v) { return v; }
        public static final class UserBeanMsgBuilder {
            public UserBeanMsgBuilder mergeFrom(byte[] b) { return this; }
            public UserBeanMsgBuilder setValue(String v) { return this; }
            public UserBeanMsgBuilder setUrl(String v) { return this; }
            public UserBeanMsgBuilder setKey(String v) { return this; }
            public UserBeanMsgBuilder setContent(String v) { return this; }
            public UserBean build() { return new UserBean(); }
            public UserBean buildPartial() { return new UserBean(); }
        }

    }
    public static class UserList {

        public static UserList parseFrom(byte[] b) { return new UserList(); }
        public static UserList parseFrom(java.io.InputStream in) { return new UserList(); }
        public static UserList getDefaultInstance() { return new UserList(); }
        public static UserListMsgBuilder newBuilder() { return new UserListMsgBuilder(); }
        public UserListMsgBuilder toBuilder() { return new UserListMsgBuilder(); }
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
        public UserList getData() { return this; }
        public UserList getResult() { return this; }
        public UserList getCoverImage() { return this; }
        public java.util.List getListList() { return java.util.Collections.emptyList(); }
        public java.util.List getItemsList() { return java.util.Collections.emptyList(); }
        public java.util.List getRecordsList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaListList() { return java.util.Collections.emptyList(); }
        public java.util.List getDramaBeanList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideoListList() { return java.util.Collections.emptyList(); }
        public java.util.List getVideosList() { return java.util.Collections.emptyList(); }
        public int getListCount() { return 0; }
        public UserList getList(int i) { return this; }
        public java.util.Map getHeadersMap() { return java.util.Collections.emptyMap(); }
        public Object getOrDefault(Object k, Object v) { return v; }
        public static final class UserListMsgBuilder {
            public UserListMsgBuilder mergeFrom(byte[] b) { return this; }
            public UserListMsgBuilder setValue(String v) { return this; }
            public UserListMsgBuilder setUrl(String v) { return this; }
            public UserListMsgBuilder setKey(String v) { return this; }
            public UserListMsgBuilder setContent(String v) { return this; }
            public UserList build() { return new UserList(); }
            public UserList buildPartial() { return new UserList(); }
        }

    }
}
