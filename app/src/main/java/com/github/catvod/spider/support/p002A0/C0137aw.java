package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C0137aw extends AbstractC0250fa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f676a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0137aw(AbstractC0213dr abstractC0213dr, int i) {
        super(abstractC0213dr);
        this.f676a = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public final int mo1019b() {
        switch (this.f676a) {
            case 0:
                return ((AbstractC0213dr) this.f813f).mo1019b() + 2;
            case 1:
                return ((AbstractC0213dr) this.f813f).mo1019b() + 2;
            default:
                return ((AbstractC0213dr) this.f813f).mo1019b() * 2;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        switch (this.f676a) {
            case 0:
                return ((AbstractC0213dr) this.f813f).mo1020c(c0226ed, c0226ed2);
            case 1:
                return !m1204h(c0226ed, c0226ed2);
            default:
                if (c0226ed == c0226ed2) {
                    return false;
                }
                AbstractC0272fw abstractC0272fw = c0226ed2.f846ap;
                while (true) {
                    C0226ed c0226ed3 = (C0226ed) abstractC0272fw;
                    if (c0226ed3 == null) {
                        return false;
                    }
                    if (m1204h(c0226ed, c0226ed3)) {
                        return true;
                    }
                    if (c0226ed3 == c0226ed) {
                        return false;
                    }
                    abstractC0272fw = c0226ed3.f846ap;
                }
                break;
        }
    }

    public final String toString() {
        Object obj = this.f813f;
        switch (this.f676a) {
            case 0:
                return String.format(":is(%s)", (AbstractC0213dr) obj);
            case 1:
                return String.format(":not(%s)", (AbstractC0213dr) obj);
            default:
                return String.format("%s ", (AbstractC0213dr) obj);
        }
    }
}
