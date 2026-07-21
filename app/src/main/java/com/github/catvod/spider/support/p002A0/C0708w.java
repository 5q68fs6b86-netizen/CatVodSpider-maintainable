package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0708w extends AbstractC0719wk {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0719wk, com.github.catvod.spider.support.p002A0.AbstractC0680uz
    /* JADX INFO: renamed from: b */
    public final AbstractC0719wk mo904a() {
        super.mo904a();
        this.f1732f = null;
        return this;
    }

    public final String toString() {
        String str = this.f1731e ? "/>" : ">";
        C0554qh c0554qh = this.f1732f;
        if (!(c0554qh != null) || c0554qh.f1405a <= 0) {
            StringBuilder sb = new StringBuilder("<");
            String str2 = this.f1729c;
            sb.append(str2 != null ? str2 : "[unset]");
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<");
        String str3 = this.f1729c;
        sb2.append(str3 != null ? str3 : "[unset]");
        sb2.append(" ");
        sb2.append(this.f1732f.toString());
        sb2.append(str);
        return sb2.toString();
    }
}
