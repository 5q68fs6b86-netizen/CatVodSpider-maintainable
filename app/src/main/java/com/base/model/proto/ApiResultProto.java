package com.base.model.proto;
public final class ApiResultProto {
  private ApiResultProto(){}
  public static class ApiResult extends ProtoBase {
    public static ApiResult parseFrom(byte[] b){ return new ApiResult(); }
    public static ApiResult parseFrom(java.io.InputStream in){ return new ApiResult(); }
    public static Builder newBuilder(){ return new Builder(); }
    public static class Builder extends ProtoBase.Builder {
      public ApiResult build(){ return new ApiResult(); }
      public ApiResult buildPartial(){ return new ApiResult(); }
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
  public static class Result extends ProtoBase {
    public static Result parseFrom(byte[] b){ return new Result(); }
    public static Result parseFrom(java.io.InputStream in){ return new Result(); }
    public static Builder newBuilder(){ return new Builder(); }
    public static class Builder extends ProtoBase.Builder {
      public Result build(){ return new Result(); }
      public Result buildPartial(){ return new Result(); }
    }
  }
}
