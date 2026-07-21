package com.github.catvod.spider.support.p002A0;

import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.jr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0375jr {

    /* JADX INFO: renamed from: a */
    public static final HashMap f1083a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f1084b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final HashMap f1085c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static final Logger f1086d = LoggerFactory.getLogger((Class<?>) AbstractC0375jr.class);

    static {
        int i = 17;
        int i2 = 14;
        Class[] clsArr = {AbstractC0535pp.class, AbstractC0536pq.class, AbstractC0552qf.class, AbstractC0611sk.class, acs.class, act.class, AbstractC0584rk.class, AbstractC0411l.class, AbstractC0760xy.class, AbstractC0149bh.class, AbstractC0650tw.class, AbstractC0513ou.class, AbstractC0151bj.class, AbstractC0592rs.class};
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (clsArr[i3].newInstance() != null) {
                    throw new ClassCastException();
                }
                throw null;
            } catch (Exception e) {
                f1086d.info(abx.m927a(e), (Throwable) e);
                i3++;
                i = 17;
                i2 = 14;
            }
        }
        Class[] clsArr2 = new Class[i];
        clsArr2[0] = AbstractC0702vu.class;
        clsArr2[1] = AbstractC0745xj.class;
        clsArr2[2] = AbstractC0791zb.class;
        clsArr2[3] = AbstractC0807zr.class;
        clsArr2[4] = AbstractC0422lk.class;
        clsArr2[5] = AbstractC0462mx.class;
        clsArr2[6] = AbstractC0497oe.class;
        clsArr2[7] = AbstractC0500oh.class;
        clsArr2[8] = AbstractC0314hk.class;
        clsArr2[9] = abx.class;
        clsArr2[10] = AbstractC0180cl.class;
        clsArr2[11] = AbstractC0313hj.class;
        clsArr2[12] = AbstractC0156bo.class;
        clsArr2[13] = AbstractC0196da.class;
        clsArr2[i2] = AbstractC0695vn.class;
        clsArr2[15] = AbstractC0403ks.class;
        clsArr2[16] = AbstractC0510or.class;
        for (int i4 = 0; i4 < i; i4++) {
            try {
                if (clsArr2[i4].newInstance() != null) {
                    throw new ClassCastException();
                }
                throw null;
            } catch (Exception e2) {
                f1086d.info(abx.m927a(e2), (Throwable) e2);
            }
        }
        Class[] clsArr3 = {AbstractC0534po.class, AbstractC0122ah.class, aai.class, abd.class, AbstractC0624sx.class, AbstractC0502oj.class};
        for (int i5 = 0; i5 < 6; i5++) {
            try {
                if (clsArr3[i5].newInstance() != null) {
                    throw new ClassCastException();
                }
                throw null;
            } catch (Exception e3) {
                f1086d.info(abx.m927a(e3), (Throwable) e3);
            }
        }
    }
}
