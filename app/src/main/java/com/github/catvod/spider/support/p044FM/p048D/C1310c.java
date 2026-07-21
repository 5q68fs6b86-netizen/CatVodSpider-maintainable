package com.github.catvod.spider.support.p044FM.p048D;

import com.github.catvod.spider.support.p044FM.p047C.C1304g;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.D.c */
/* JADX INFO: loaded from: classes.dex */
final class C1310c extends AbstractC1316i {
    C1310c() {
        m3277H();
        m3279J();
        m3297y("{");
        m3296x("}");
        m3295w();
        m3294v();
        m3270A(",");
        m3298z();
        m3272C();
        m3276G();
        m3275F();
        m3274E();
        m3273D();
    }

    @Override // com.github.catvod.spider.support.p044FM.p048D.AbstractC1316i
    /* JADX INFO: renamed from: a */
    public final void mo3261a(StringBuffer stringBuffer, Object obj) {
        super.mo3261a(stringBuffer, obj);
    }

    @Override // com.github.catvod.spider.support.p044FM.p048D.AbstractC1316i
    /* JADX INFO: renamed from: c */
    protected final void mo3262c(StringBuffer stringBuffer, char c) {
        String strValueOf = String.valueOf(c);
        stringBuffer.append('\"');
        stringBuffer.append(C1304g.m3246a(strValueOf));
        stringBuffer.append('\"');
    }

    @Override // com.github.catvod.spider.support.p044FM.p048D.AbstractC1316i
    /* JADX INFO: renamed from: e */
    protected final void mo3263e(StringBuffer stringBuffer, String str, Object obj) {
        if (obj == null) {
            m3286l(stringBuffer);
            return;
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            String string = obj.toString();
            stringBuffer.append('\"');
            stringBuffer.append(C1304g.m3246a(string));
            stringBuffer.append('\"');
            return;
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            stringBuffer.append(obj);
            return;
        }
        String string2 = obj.toString();
        boolean z = false;
        if (!(string2.startsWith(m3292r()) && string2.endsWith(m3291q()))) {
            if (string2.startsWith(m3290p()) && string2.endsWith(m3289o())) {
                z = true;
            }
            if (!z) {
                mo3263e(stringBuffer, str, string2);
                return;
            }
        }
        stringBuffer.append(obj);
    }

    @Override // com.github.catvod.spider.support.p044FM.p048D.AbstractC1316i
    /* JADX INFO: renamed from: f */
    protected final void mo3264f(StringBuffer stringBuffer, String str, Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            stringBuffer.append(collection);
            return;
        }
        stringBuffer.append(m3290p());
        int i = 0;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            m3282d(stringBuffer, str, i, it.next());
            i++;
        }
        stringBuffer.append(m3289o());
    }

    @Override // com.github.catvod.spider.support.p044FM.p048D.AbstractC1316i
    /* JADX INFO: renamed from: g */
    protected final void mo3265g(StringBuffer stringBuffer, Map map) {
        if (map == null || map.isEmpty()) {
            stringBuffer.append(map);
            return;
        }
        stringBuffer.append(m3292r());
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String string = key != null ? key.toString() : null;
            if (string != null) {
                if (z) {
                    z = false;
                } else {
                    m3284i(stringBuffer);
                }
                mo3266j(stringBuffer, string);
                Object value = entry.getValue();
                if (value == null) {
                    m3286l(stringBuffer);
                } else {
                    m3285k(stringBuffer, string, value, true);
                }
            }
        }
        stringBuffer.append(m3291q());
    }

    @Override // com.github.catvod.spider.support.p044FM.p048D.AbstractC1316i
    /* JADX INFO: renamed from: j */
    protected final void mo3266j(StringBuffer stringBuffer, String str) {
        StringBuilder sbM3589b = C1434P.m3589b("\"");
        sbM3589b.append(C1304g.m3246a(str));
        sbM3589b.append("\"");
        super.mo3266j(stringBuffer, sbM3589b.toString());
    }
}
