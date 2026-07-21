package com.base.model.proto;
public final class RSARequestProto {
  private RSARequestProto(){}
  public static class RSARequest extends ProtoBase {
    public static RSARequest parseFrom(byte[] b){ return new RSARequest(); }
    public static RSARequest parseFrom(java.io.InputStream in){ return new RSARequest(); }
    public static Builder newBuilder(){ return new Builder(); }
    public static class Builder extends ProtoBase.Builder {
      public RSARequest build(){ return new RSARequest(); }
      public RSARequest buildPartial(){ return new RSARequest(); }
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
