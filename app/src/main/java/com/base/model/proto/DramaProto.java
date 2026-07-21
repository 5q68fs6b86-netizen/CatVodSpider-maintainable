package com.base.model.proto;
public final class DramaProto {
  private DramaProto(){}
  public static class DramaBean extends ProtoBase {
    public static DramaBean parseFrom(byte[] b){ return new DramaBean(); }
    public static DramaBean parseFrom(java.io.InputStream in){ return new DramaBean(); }
    public static Builder newBuilder(){ return new Builder(); }
    public static class Builder extends ProtoBase.Builder {
      public DramaBean build(){ return new DramaBean(); }
      public DramaBean buildPartial(){ return new DramaBean(); }
    }
  }
  public static class DramaBeanPage extends ProtoBase {
    public static DramaBeanPage parseFrom(byte[] b){ return new DramaBeanPage(); }
    public static DramaBeanPage parseFrom(java.io.InputStream in){ return new DramaBeanPage(); }
    public static Builder newBuilder(){ return new Builder(); }
    public static class Builder extends ProtoBase.Builder {
      public DramaBeanPage build(){ return new DramaBeanPage(); }
      public DramaBeanPage buildPartial(){ return new DramaBeanPage(); }
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
