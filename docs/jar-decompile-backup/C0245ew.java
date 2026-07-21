package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ew */
/* JADX INFO: loaded from: classes.dex */
public final class C0245ew extends AbstractC0250fa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0245ew(int i, String str, String str2, boolean z) {
        super(str, str2, z);
        this.f799a = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public final int mo1019b() {
        switch (this.f799a) {
            case 0:
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        switch (this.f799a) {
            case 0:
                String str = (String) this.f813f;
                if (c0226ed2.m1229av(str)) {
                    if (((String) this.f814g).equalsIgnoreCase(c0226ed2.mo1228au(str).trim())) {
                        return true;
                    }
                }
                return false;
            case 1:
                String str2 = (String) this.f813f;
                return c0226ed2.m1229av(str2) && AbstractC0552qf.m1581c(c0226ed2.mo1228au(str2)).contains((String) this.f814g);
            case 2:
                String str3 = (String) this.f813f;
                return c0226ed2.m1229av(str3) && AbstractC0552qf.m1581c(c0226ed2.mo1228au(str3)).endsWith((String) this.f814g);
            case 3:
                return !((String) this.f814g).equalsIgnoreCase(c0226ed2.mo1228au((String) this.f813f));
            default:
                String str4 = (String) this.f813f;
                return c0226ed2.m1229av(str4) && AbstractC0552qf.m1581c(c0226ed2.mo1228au(str4)).startsWith((String) this.f814g);
        }
    }

    public final String toString() {
        switch (this.f799a) {
            case 0:
                return "[" + ((String) this.f813f) + "=" + ((String) this.f814g) + "]";
            case 1:
                return "[" + ((String) this.f813f) + "*=" + ((String) this.f814g) + "]";
            case 2:
                return "[" + ((String) this.f813f) + "$=" + ((String) this.f814g) + "]";
            case 3:
                return "[" + ((String) this.f813f) + "!=" + ((String) this.f814g) + "]";
            default:
                return "[" + ((String) this.f813f) + "^=" + ((String) this.f814g) + "]";
        }
    }
}
