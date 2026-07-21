package com.base.model.proto;
public final class ParsePlayUrlProto {
  private ParsePlayUrlProto(){}
  public static class ParsePlayUrlBean extends ProtoBase {
    public static ParsePlayUrlBean parseFrom(byte[] b){ return new ParsePlayUrlBean(); }
    public static ParsePlayUrlBean parseFrom(java.io.InputStream in){ return new ParsePlayUrlBean(); }
    public static Builder newBuilder(){ return new Builder(); }
    public static class Builder extends ProtoBase.Builder {
      public ParsePlayUrlBean build(){ return new ParsePlayUrlBean(); }
      public ParsePlayUrlBean buildPartial(){ return new ParsePlayUrlBean(); }
    }
  }
  public static class Data extends ProtoBase {
    public static Data parseFrom(byte[] b){ return new Data(); }
    public static Data parseFrom(java.io.InputStream in){ return new Data(); }
    public static Builder newBuilder(){ return new Builder(); }
    public static class Builder extends ProtoBase.Builder {
      public Data build(){ return new Data(); }
      public Data buildPartial(){ return new Data(); }
    }
  }
  public static class Builder extends ProtoBase {
    public static Builder parseFrom(byte[] b){ return new Builder(); }
    public static Builder parseFrom(java.io.InputStream in){ return new Builder(); }
    public static Builder newBuilder(){ return new Builder(); }
    public static class Builder extends ProtoBase.Builder {
      public Builder build(){ return new Builder(); }
      public Builder buildPartial(){ return new Builder(); }
    }
  }
}
