package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.pq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0536pq {

    /* JADX INFO: renamed from: a */
    public static final Object[] f1373a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static Stream m1526b(C0226ed c0226ed, Class cls) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new aau(c0226ed, cls), 273), false);
    }

    /* JADX INFO: renamed from: c */
    public static final Object[] m1527c(Collection collection) {
        int size = collection.size();
        Object[] objArr = f1373a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                AbstractC0399ko.m1350e("copyOf(...)", objArrCopyOf);
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                AbstractC0399ko.m1350e("copyOf(...)", objArrCopyOf2);
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object[] m1528d(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            AbstractC0399ko.m1349d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objNewInstance);
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                AbstractC0399ko.m1350e("copyOf(...)", objArrCopyOf);
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                AbstractC0399ko.m1350e("copyOf(...)", objArrCopyOf2);
                return objArrCopyOf2;
            }
            i = i2;
        }
    }
}
