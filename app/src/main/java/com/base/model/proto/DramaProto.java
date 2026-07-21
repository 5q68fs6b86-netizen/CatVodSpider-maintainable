package com.base.model.proto;

public final class DramaProto {
    private DramaProto() {}

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

    public static class DramaBean extends ProtoBase {
        public static DramaBean parseFrom(byte[] b) { return new DramaBean(); }
        public static DramaBean parseFrom(java.io.InputStream in) { return new DramaBean(); }
        public static DramaBean getDefaultInstance() { return new DramaBean(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public DramaBean build() { return new DramaBean(); }
            public DramaBean buildPartial() { return new DramaBean(); }
        }
    }

    public static class DramaBeanPage extends ProtoBase {
        public static DramaBeanPage parseFrom(byte[] b) { return new DramaBeanPage(); }
        public static DramaBeanPage parseFrom(java.io.InputStream in) { return new DramaBeanPage(); }
        public static DramaBeanPage getDefaultInstance() { return new DramaBeanPage(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public DramaBeanPage build() { return new DramaBeanPage(); }
            public DramaBeanPage buildPartial() { return new DramaBeanPage(); }
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
