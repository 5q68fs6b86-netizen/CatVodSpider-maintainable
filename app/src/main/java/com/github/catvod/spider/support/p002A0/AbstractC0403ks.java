package com.github.catvod.spider.support.p002A0;

import com.whl.quickjs.wrapper.JSArray;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ks */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0403ks {
    /* JADX INFO: renamed from: a */
    public static JSArray m1359a(QuickJSContext quickJSContext, List list) {
        JSArray jSArrayCreateNewJSArray = quickJSContext.createNewJSArray();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                jSArrayCreateNewJSArray.set(list.get(i), i);
            }
        }
        return jSArrayCreateNewJSArray;
    }
}
