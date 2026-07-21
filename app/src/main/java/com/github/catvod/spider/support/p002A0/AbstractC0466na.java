package com.github.catvod.spider.support.p002A0;

import java.io.File;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import rxhttp.wrapper.entity.FileRequestBody;
import rxhttp.wrapper.entity.UpFile;
import rxhttp.wrapper.param.IPart;
import rxhttp.wrapper.param.Param;
import rxhttp.wrapper.utils.BuildUtil;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.na */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0466na {
    /* JADX INFO: renamed from: a */
    public static Param m1449a(IPart iPart, UpFile upFile) {
        File file = upFile.getFile();
        if (!file.exists()) {
            throw new IllegalArgumentException("File '" + file.getAbsolutePath() + "' does not exist");
        }
        if (file.isFile()) {
            return iPart.addPart(MultipartBody.Part.createFormData(upFile.getKey(), upFile.getFilename(), new FileRequestBody(upFile.getFile(), upFile.getSkipSize(), BuildUtil.getMediaType(upFile.getFilename()))));
        }
        throw new IllegalArgumentException("File '" + file.getAbsolutePath() + "' is not a file");
    }

    /* JADX INFO: renamed from: b */
    public static Param m1450b(IPart iPart, String str, String str2, RequestBody requestBody) {
        return iPart.addPart(MultipartBody.Part.createFormData(str, str2, requestBody));
    }

    /* JADX INFO: renamed from: c */
    public static Param m1451c(IPart iPart, Headers headers, RequestBody requestBody) {
        return iPart.addPart(MultipartBody.Part.create(headers, requestBody));
    }

    /* JADX INFO: renamed from: d */
    public static Param m1452d(IPart iPart, MediaType mediaType, byte[] bArr) {
        return iPart.addPart(RequestBody.create(mediaType, bArr));
    }

    /* JADX INFO: renamed from: e */
    public static Param m1453e(IPart iPart, MediaType mediaType, byte[] bArr, int i, int i2) {
        return iPart.addPart(RequestBody.create(mediaType, bArr, i, i2));
    }

    /* JADX INFO: renamed from: f */
    public static Param m1454f(IPart iPart, RequestBody requestBody) {
        return iPart.addPart(MultipartBody.Part.create(requestBody));
    }
}
