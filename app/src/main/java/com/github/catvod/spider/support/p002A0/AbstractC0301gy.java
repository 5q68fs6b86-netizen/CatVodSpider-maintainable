package com.github.catvod.spider.support.p002A0;

import java.util.Map;
import rxhttp.wrapper.param.IParam;
import rxhttp.wrapper.param.Param;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.gy */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0301gy {
    /* JADX INFO: renamed from: a */
    public static Param m1263a(IParam iParam, Map map) {
        for (Object __en : map.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            iParam.add((String) entry.getKey(), entry.getValue());
        }
        return (Param) iParam;
    }

    /* JADX INFO: renamed from: b */
    public static Param m1264b(IParam iParam, Map map) {
        for (Object __en : map.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            iParam.addEncodedQuery((String) entry.getKey(), entry.getValue());
        }
        return (Param) iParam;
    }

    /* JADX INFO: renamed from: c */
    public static Param m1265c(IParam iParam, Map map) {
        for (Object __en : map.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            iParam.addQuery((String) entry.getKey(), entry.getValue());
        }
        return (Param) iParam;
    }

    /* JADX INFO: renamed from: d */
    public static Param m1266d(IParam iParam, Map map) {
        for (Object __en : map.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            iParam.setEncodedQuery((String) entry.getKey(), entry.getValue());
        }
        return (Param) iParam;
    }

    /* JADX INFO: renamed from: e */
    public static Param m1267e(IParam iParam, Map map) {
        for (Object __en : map.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            iParam.setQuery((String) entry.getKey(), entry.getValue());
        }
        return (Param) iParam;
    }

    /* JADX INFO: renamed from: f */
    public static Param m1268f(IParam iParam, String str, Object obj) {
        iParam.removeAllQuery(str);
        return iParam.addEncodedQuery(str, obj);
    }

    /* JADX INFO: renamed from: g */
    public static Param m1269g(IParam iParam, String str, Object obj) {
        iParam.removeAllQuery(str);
        return iParam.addQuery(str, obj);
    }

    /* JADX INFO: renamed from: h */
    public static Param m1270h(IParam iParam, Object obj) {
        return iParam.tag(Object.class, obj);
    }
}
