package com.github.catvod.spider.support.p044FM.p045A;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.A.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1278d<Key1, Key2, Value> {

    /* JADX INFO: renamed from: a */
    Map<Key1, Map<Key2, Value>> f2998a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final Value m3193a(Key1 key1, Key2 key2) {
        Map map = (Map) this.f2998a.get(key1);
        if (map == null) {
            return null;
        }
        return (Value) map.get(key2);
    }

    /* JADX INFO: renamed from: b */
    public final Value m3194b(Key1 key1, Key2 key2, Value value) {
        Value value2;
        Map<Key2, Value> linkedHashMap = (Map) this.f2998a.get(key1);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            this.f2998a.put(key1, linkedHashMap);
            value2 = null;
        } else {
            value2 = linkedHashMap.get(key2);
        }
        linkedHashMap.put(key2, value);
        return value2;
    }
}
