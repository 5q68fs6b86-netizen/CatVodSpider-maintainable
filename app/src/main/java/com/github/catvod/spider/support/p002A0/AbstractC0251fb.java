package com.github.catvod.spider.support.p002A0;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rxhttp.wrapper.entity.UpFile;
import rxhttp.wrapper.param.IFile;
import rxhttp.wrapper.param.Param;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0251fb {
    /* JADX INFO: renamed from: a */
    public static Param m1205a(IFile iFile, String str, File file) {
        return iFile.addFile(new UpFile(str, file));
    }

    /* JADX INFO: renamed from: b */
    public static Param m1206b(IFile iFile, String str, File file) {
        return iFile.addFile(new UpFile(str, file));
    }

    /* JADX INFO: renamed from: c */
    public static Param m1207c(IFile iFile, String str, File file, String str2) {
        return iFile.addFile(new UpFile(str, file, str2));
    }

    /* JADX INFO: renamed from: d */
    public static Param m1208d(IFile iFile, String str, String str2) {
        return iFile.addFile(new UpFile(str, str2));
    }

    /* JADX INFO: renamed from: e */
    public static Param m1209e(IFile iFile, String str, List list) {
        for (Object obj : list) {
            if (obj instanceof String) {
                iFile.addFile(new UpFile(str, obj.toString()));
            } else {
                if (!(obj instanceof File)) {
                    throw new IllegalArgumentException("Incoming data type exception, it must be String or File");
                }
                iFile.addFile(new UpFile(str, (File) obj));
            }
        }
        return (Param) iFile;
    }

    /* JADX INFO: renamed from: f */
    public static Param m1210f(IFile iFile, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iFile.addFile((UpFile) it.next());
        }
        return (Param) iFile;
    }

    /* JADX INFO: renamed from: g */
    public static Param m1211g(IFile iFile, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                iFile.addFile(new UpFile(str, value.toString()));
            } else {
                if (!(value instanceof File)) {
                    throw new IllegalArgumentException("Incoming data type exception, it must be String or File");
                }
                iFile.addFile(new UpFile(str, (File) value));
            }
        }
        return (Param) iFile;
    }
}
