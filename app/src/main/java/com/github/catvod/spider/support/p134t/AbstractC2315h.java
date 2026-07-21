package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p137w.C2406h;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.github.catvod.spider.support.t.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2315h implements InterfaceC2311d {

    /* JADX INFO: renamed from: a */
    protected final int f5744a;

    /* JADX INFO: renamed from: b */
    protected int f5745b = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.github.catvod.spider.support.t.h$a */
    static final class a extends AbstractC2315h {

        /* JADX INFO: renamed from: c */
        private final char[] f5746c;

        a(int i, int i2, char[] cArr) {
            super(i2);
            this.f5746c = cArr;
        }

        @Override // com.github.catvod.spider.support.p134t.InterfaceC2311d
        /* JADX INFO: renamed from: d */
        public final String mo6241d(C2406h c2406h) {
            int iMin = Math.min(c2406h.f5962a, this.f5744a);
            return new String(this.f5746c, iMin, Math.min((c2406h.f5963b - c2406h.f5962a) + 1, this.f5744a - iMin));
        }

        @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
        /* JADX INFO: renamed from: g */
        public final int mo6233g(int i) {
            char c;
            int iSignum = Integer.signum(1);
            if (iSignum == -1) {
                int i2 = this.f5745b + 1;
                if (i2 < 0) {
                    return -1;
                }
                c = this.f5746c[i2];
            } else {
                if (iSignum == 0) {
                    return 0;
                }
                if (iSignum != 1) {
                    throw new UnsupportedOperationException("Not reached");
                }
                int i3 = (this.f5745b + 1) - 1;
                if (i3 >= this.f5744a) {
                    return -1;
                }
                c = this.f5746c[i3];
            }
            return c & 65535;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.github.catvod.spider.support.t.h$b */
    static final class b extends AbstractC2315h {

        /* JADX INFO: renamed from: c */
        private final int[] f5747c;

        b(int i, int i2, int[] iArr) {
            super(i2);
            this.f5747c = iArr;
        }

        @Override // com.github.catvod.spider.support.p134t.InterfaceC2311d
        /* JADX INFO: renamed from: d */
        public final String mo6241d(C2406h c2406h) {
            int iMin = Math.min(c2406h.f5962a, this.f5744a);
            return new String(this.f5747c, iMin, Math.min((c2406h.f5963b - c2406h.f5962a) + 1, this.f5744a - iMin));
        }

        @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
        /* JADX INFO: renamed from: g */
        public final int mo6233g(int i) {
            int iSignum = Integer.signum(1);
            if (iSignum == -1) {
                int i2 = this.f5745b + 1;
                if (i2 < 0) {
                    return -1;
                }
                return this.f5747c[i2];
            }
            if (iSignum == 0) {
                return 0;
            }
            if (iSignum != 1) {
                throw new UnsupportedOperationException("Not reached");
            }
            int i3 = (this.f5745b + 1) - 1;
            if (i3 >= this.f5744a) {
                return -1;
            }
            return this.f5747c[i3];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.github.catvod.spider.support.t.h$c */
    static final class c extends AbstractC2315h {

        /* JADX INFO: renamed from: c */
        private final byte[] f5748c;

        c(int i, int i2, byte[] bArr) {
            super(i2);
            this.f5748c = bArr;
        }

        @Override // com.github.catvod.spider.support.p134t.InterfaceC2311d
        /* JADX INFO: renamed from: d */
        public final String mo6241d(C2406h c2406h) {
            int iMin = Math.min(c2406h.f5962a, this.f5744a);
            return new String(this.f5748c, iMin, Math.min((c2406h.f5963b - c2406h.f5962a) + 1, this.f5744a - iMin), StandardCharsets.ISO_8859_1);
        }

        @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
        /* JADX INFO: renamed from: g */
        public final int mo6233g(int i) {
            byte b;
            int iSignum = Integer.signum(1);
            if (iSignum == -1) {
                int i2 = this.f5745b + 1;
                if (i2 < 0) {
                    return -1;
                }
                b = this.f5748c[i2];
            } else {
                if (iSignum == 0) {
                    return 0;
                }
                if (iSignum != 1) {
                    throw new UnsupportedOperationException("Not reached");
                }
                int i3 = (this.f5745b + 1) - 1;
                if (i3 >= this.f5744a) {
                    return -1;
                }
                b = this.f5748c[i3];
            }
            return b & 255;
        }
    }

    AbstractC2315h(int i) {
        this.f5744a = i;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    /* JADX INFO: renamed from: c */
    public final int mo6231c() {
        return -1;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    /* JADX INFO: renamed from: e */
    public final void mo6232e(int i) {
        this.f5745b = i;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    /* JADX INFO: renamed from: h */
    public final int mo6234h() {
        return this.f5745b;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    /* JADX INFO: renamed from: i */
    public final void mo6235i() {
        int i = this.f5744a;
        int i2 = this.f5745b;
        if (i - i2 == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        this.f5745b = i2 + 1;
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    public final void release() {
    }

    @Override // com.github.catvod.spider.support.p134t.InterfaceC2323p
    public final int size() {
        return this.f5744a;
    }

    public final String toString() {
        return mo6241d(C2406h.m6411b(0, this.f5744a - 1));
    }
}
