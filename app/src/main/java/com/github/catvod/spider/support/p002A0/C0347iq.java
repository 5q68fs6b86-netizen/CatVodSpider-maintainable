package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.iq */
/* JADX INFO: loaded from: classes.dex */
public final class C0347iq implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Class f1022a;

    public C0347iq(Class cls) {
        this.f1022a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Field[] declaredFields = this.f1022a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
