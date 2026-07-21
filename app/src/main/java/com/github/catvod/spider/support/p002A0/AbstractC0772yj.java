package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.yj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0772yj {

    /* JADX INFO: renamed from: a */
    public static final boolean f1835a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r0.equals("on") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r0.equals("") != false) goto L22;
     */
    static {
        String property;
        boolean z;
        int i = abp.f534a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            int iHashCode = property.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 3551) {
                    z = (iHashCode == 109935 && property.equals("off")) ? false : true;
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.scheduler' has unrecognized value '" + property + '\'').toString());
            }
        }
        f1835a = z;
    }
}
