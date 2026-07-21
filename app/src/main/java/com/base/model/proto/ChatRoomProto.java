package com.base.model.proto;

public final class ChatRoomProto {
    private ChatRoomProto() {}

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

    public static class ChatRoomAdd extends ProtoBase {
        public static ChatRoomAdd parseFrom(byte[] b) { return new ChatRoomAdd(); }
        public static ChatRoomAdd parseFrom(java.io.InputStream in) { return new ChatRoomAdd(); }
        public static ChatRoomAdd getDefaultInstance() { return new ChatRoomAdd(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public ChatRoomAdd build() { return new ChatRoomAdd(); }
            public ChatRoomAdd buildPartial() { return new ChatRoomAdd(); }
        }
    }

    public static class ChatRoomBean extends ProtoBase {
        public static ChatRoomBean parseFrom(byte[] b) { return new ChatRoomBean(); }
        public static ChatRoomBean parseFrom(java.io.InputStream in) { return new ChatRoomBean(); }
        public static ChatRoomBean getDefaultInstance() { return new ChatRoomBean(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public ChatRoomBean build() { return new ChatRoomBean(); }
            public ChatRoomBean buildPartial() { return new ChatRoomBean(); }
        }
    }

    public static class ChatRoomVO extends ProtoBase {
        public static ChatRoomVO parseFrom(byte[] b) { return new ChatRoomVO(); }
        public static ChatRoomVO parseFrom(java.io.InputStream in) { return new ChatRoomVO(); }
        public static ChatRoomVO getDefaultInstance() { return new ChatRoomVO(); }
        public static Builder newBuilder() { return new Builder(); }
        public static class Builder extends ProtoBase.Builder {
            public ChatRoomVO build() { return new ChatRoomVO(); }
            public ChatRoomVO buildPartial() { return new ChatRoomVO(); }
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
