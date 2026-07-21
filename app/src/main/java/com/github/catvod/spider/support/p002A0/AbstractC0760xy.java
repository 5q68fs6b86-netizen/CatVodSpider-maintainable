package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.xy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0760xy {
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c A[PHI: r18
      0x006c: PHI (r18v2 long) = (r18v1 long), (r18v3 long) binds: [B:27:0x005e, B:31:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077 A[LOOP:0: B:22:0x004f->B:36:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code duplicated, block: B:57:0x001d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x001d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x001d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x001d A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final long m1881g(String str, long j, long j2, long j3) {
        String property;
        boolean z;
        long j4;
        long j5;
        Long lValueOf;
        Long l;
        int iDigit;
        long j6;
        long j7;
        long j8;
        int i = abp.f534a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        AbstractC0462mx.m1441a(10);
        int length = property.length();
        if (length != 0) {
            int i2 = 0;
            char cCharAt = property.charAt(0);
            long j9 = -9223372036854775807L;
            if (AbstractC0399ko.m1352g(cCharAt, 48) < 0) {
                if (length != 1) {
                    if (cCharAt != '-') {
                        if (cCharAt == '+') {
                            i2 = 1;
                            z = false;
                            j4 = 0;
                            j5 = -256204778801521550L;
                            while (true) {
                                if (i2 >= length) {
                                    if (z) {
                                        lValueOf = Long.valueOf(j4);
                                    } else {
                                        lValueOf = Long.valueOf(-j4);
                                    }
                                    l = lValueOf;
                                    break;
                                }
                                iDigit = Character.digit((int) property.charAt(i2), 10);
                                if (iDigit >= 0) {
                                    if (j4 >= j5) {
                                        j6 = j4 * ((long) 10);
                                        j7 = iDigit;
                                        if (j6 < j9 + j7) {
                                            j4 = j6 - j7;
                                            i2++;
                                        }
                                    } else if (j5 == -256204778801521550L) {
                                        j5 = j9 / ((long) 10);
                                        if (j4 >= j5) {
                                            j6 = j4 * ((long) 10);
                                            j7 = iDigit;
                                            if (j6 < j9 + j7) {
                                                j4 = j6 - j7;
                                                i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        j9 = Long.MIN_VALUE;
                        i2 = 1;
                        z = true;
                        j4 = 0;
                        j5 = -256204778801521550L;
                        while (true) {
                            if (i2 >= length) {
                                if (z) {
                                    lValueOf = Long.valueOf(j4);
                                } else {
                                    lValueOf = Long.valueOf(-j4);
                                }
                                l = lValueOf;
                                break;
                            }
                            iDigit = Character.digit((int) property.charAt(i2), 10);
                            if (iDigit >= 0) {
                                if (j4 >= j5) {
                                    j6 = j4 * ((long) 10);
                                    j7 = iDigit;
                                    if (j6 < j9 + j7) {
                                        j4 = j6 - j7;
                                        i2++;
                                    }
                                } else if (j5 == -256204778801521550L) {
                                    j5 = j9 / ((long) 10);
                                    if (j4 >= j5) {
                                        j6 = j4 * ((long) 10);
                                        j7 = iDigit;
                                        if (j6 < j9 + j7) {
                                            j4 = j6 - j7;
                                            i2++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                z = false;
                j4 = 0;
                j5 = -256204778801521550L;
                while (true) {
                    if (i2 >= length) {
                        if (z) {
                            lValueOf = Long.valueOf(j4);
                        } else {
                            lValueOf = Long.valueOf(-j4);
                        }
                        l = lValueOf;
                        break;
                    }
                    iDigit = Character.digit((int) property.charAt(i2), 10);
                    if (iDigit >= 0) {
                        if (j4 >= j5) {
                            j6 = j4 * ((long) 10);
                            j7 = iDigit;
                            if (j6 < j9 + j7) {
                                j4 = j6 - j7;
                                i2++;
                            }
                        } else if (j5 == -256204778801521550L) {
                            j5 = j9 / ((long) 10);
                            if (j4 >= j5) {
                                j6 = j4 * ((long) 10);
                                j7 = iDigit;
                                if (j6 < j9 + j7) {
                                    j4 = j6 - j7;
                                    i2++;
                                }
                            }
                        }
                    }
                }
            }
            l = null;
            break;
        } else {
            l = null;
            break;
        }
        if (l == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = l.longValue();
        if (j2 <= jLongValue) {
            j8 = j3;
            if (j8 >= jLongValue) {
                return jLongValue;
            }
        } else {
            j8 = j3;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j8 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: h */
    public static int m1882h(String str, int i, int i2) {
        return (int) m1881g(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1329e(Object obj, Object obj2);

    /* JADX INFO: renamed from: f */
    public abstract int mo1330f(Object obj);
}
