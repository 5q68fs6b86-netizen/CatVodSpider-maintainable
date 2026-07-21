package com.github.catvod.spider.support.p012C0.p017S;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p017S.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1000c<Key1, Key2, Value> {

    /* JADX INFO: renamed from: a */
    Map<Key1, Map<Key2, Value>> f2463a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final Value m2516a(Key1 key1, Key2 key2) {
        Map map = (Map) this.f2463a.get(key1);
        if (map == null) {
            return null;
        }
        return (Value) map.get(key2);
    }

    /* JADX INFO: renamed from: b */
    public final Value m2517b(Key1 key1, Key2 key2, Value value) {
        Value value2;
        Map<Key2, Value> linkedHashMap = (Map) this.f2463a.get(key1);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            this.f2463a.put(key1, linkedHashMap);
            value2 = null;
        } else {
            value2 = linkedHashMap.get(key2);
        }
        linkedHashMap.put(key2, value);
        return value2;
    }
}
