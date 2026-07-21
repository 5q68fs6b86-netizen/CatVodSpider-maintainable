package com.base.model.proto;
public final class RSAPublicProto {
  private RSAPublicProto(){}
  public static class RSAPublic extends ProtoBase {
    public static RSAPublic parseFrom(byte[] b){ return new RSAPublic(); }
    public static RSAPublic parseFrom(java.io.InputStream in){ return new RSAPublic(); }
    public static Builder newBuilder(){ return new Builder(); }
    public static class Builder extends ProtoBase.Builder {
      public RSAPublic build(){ return new RSAPublic(); }
      public RSAPublic buildPartial(){ return new RSAPublic(); }
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
