package com.base.model.proto;

public final class DramaDetailProto {
    private DramaDetailProto() {}

    public static class Builder extends ProtoBase {
        public static Builder parseFrom(byte[] b) { return new Builder(); }
        public static Builder parseFrom(java.io.InputStream in) { return new Builder(); }
        public static Builder getDefaultInstance() { return new Builder(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public Builder build() { return new Builder(); }
            public Builder buildPartial() { return new Builder(); }
        }
    }

    public static class Data extends ProtoBase {
        public static Data parseFrom(byte[] b) { return new Data(); }
        public static Data parseFrom(java.io.InputStream in) { return new Data(); }
        public static Data getDefaultInstance() { return new Data(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public Data build() { return new Data(); }
            public Data buildPartial() { return new Data(); }
        }
    }

    public static class DramaDetailBean extends ProtoBase {
        public static DramaDetailBean parseFrom(byte[] b) { return new DramaDetailBean(); }
        public static DramaDetailBean parseFrom(java.io.InputStream in) { return new DramaDetailBean(); }
        public static DramaDetailBean getDefaultInstance() { return new DramaDetailBean(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public DramaDetailBean build() { return new DramaDetailBean(); }
            public DramaDetailBean buildPartial() { return new DramaDetailBean(); }
        }
    }

    public static class DramaDetailBeanPage extends ProtoBase {
        public static DramaDetailBeanPage parseFrom(byte[] b) { return new DramaDetailBeanPage(); }
        public static DramaDetailBeanPage parseFrom(java.io.InputStream in) { return new DramaDetailBeanPage(); }
        public static DramaDetailBeanPage getDefaultInstance() { return new DramaDetailBeanPage(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public DramaDetailBeanPage build() { return new DramaDetailBeanPage(); }
            public DramaDetailBeanPage buildPartial() { return new DramaDetailBeanPage(); }
        }
    }

    public static class Item extends ProtoBase {
        public static Item parseFrom(byte[] b) { return new Item(); }
        public static Item parseFrom(java.io.InputStream in) { return new Item(); }
        public static Item getDefaultInstance() { return new Item(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public Item build() { return new Item(); }
            public Item buildPartial() { return new Item(); }
        }
    }

    public static class Result extends ProtoBase {
        public static Result parseFrom(byte[] b) { return new Result(); }
        public static Result parseFrom(java.io.InputStream in) { return new Result(); }
        public static Result getDefaultInstance() { return new Result(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public Result build() { return new Result(); }
            public Result buildPartial() { return new Result(); }
        }
    }
}
