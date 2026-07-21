package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zk */
/* JADX INFO: loaded from: classes.dex */
public final enum C0800zk extends EnumC0416le {
    public C0800zk() {
        super("InSelect", 15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        byte b = 3;
        int iM1764h = AbstractC0710wb.m1764h(abstractC0680uz.f1590g);
        if (iM1764h == 0) {
            c0801zl.m1922as(this);
            return false;
        }
        C0284gh c0284gh = EnumC0416le.f1131f;
        if (iM1764h == 1) {
            C0708w c0708w = (C0708w) abstractC0680uz;
            String str = c0708w.f1730d;
            if (str.equals("html")) {
                return EnumC0416le.f1134i.mo1058a(c0708w, c0801zl);
            }
            if (str.equals("option")) {
                if (c0801zl.m1920aq("option")) {
                    c0801zl.m1946bq("option");
                }
                c0801zl.m1935bf(c0708w);
            } else {
                if (!str.equals("optgroup")) {
                    if (str.equals("select")) {
                        c0801zl.m1922as(this);
                        return c0801zl.m1946bq("select");
                    }
                    if (AbstractC0727ws.m1847i(str, AbstractC0702vu.f1614ag)) {
                        c0801zl.m1922as(this);
                        if (!c0801zl.m1929az("select")) {
                            return false;
                        }
                        c0801zl.m1946bq("select");
                        return c0801zl.m1945bp(c0708w);
                    }
                    if (str.equals("script") || str.equals("template")) {
                        return c0284gh.mo1058a(abstractC0680uz, c0801zl);
                    }
                    c0801zl.m1922as(this);
                    return false;
                }
                if (c0801zl.m1920aq("option")) {
                    c0801zl.m1946bq("option");
                }
                if (c0801zl.m1920aq("optgroup")) {
                    c0801zl.m1946bq("optgroup");
                }
                c0801zl.m1935bf(c0708w);
            }
        } else if (iM1764h == 2) {
            String str2 = ((C0667um) abstractC0680uz).f1730d;
            str2.getClass();
            switch (str2.hashCode()) {
                case -1321546630:
                    if (!str2.equals("template")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1010136971:
                    if (!str2.equals("option")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -906021636:
                    if (!str2.equals("select")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -80773204:
                    if (!str2.equals("optgroup")) {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    return c0284gh.mo1058a(abstractC0680uz, c0801zl);
                case 1:
                    if (!c0801zl.m1920aq("option")) {
                        c0801zl.m1922as(this);
                    } else {
                        c0801zl.m1942bm();
                    }
                    break;
                case 2:
                    if (!c0801zl.m1929az(str2)) {
                        c0801zl.m1922as(this);
                        return false;
                    }
                    c0801zl.m1943bn(str2);
                    c0801zl.m1953bx();
                    break;
                    break;
                case 3:
                    if (c0801zl.m1920aq("option") && c0801zl.m1912ai(c0801zl.m1919ap()) != null && c0801zl.m1912ai(c0801zl.m1919ap()).m1230aw("optgroup")) {
                        c0801zl.m1946bq("option");
                    }
                    if (!c0801zl.m1920aq("optgroup")) {
                        c0801zl.m1922as(this);
                    } else {
                        c0801zl.m1942bm();
                    }
                    break;
                default:
                    c0801zl.m1922as(this);
                    return false;
            }
        } else if (iM1764h == 3) {
            c0801zl.m1934be((C0300gx) abstractC0680uz);
        } else if (iM1764h == 4) {
            C0343im c0343im = (C0343im) abstractC0680uz;
            if (c0343im.f1013b.equals(EnumC0416le.f1127aa)) {
                c0801zl.m1922as(this);
                return false;
            }
            c0801zl.m1932bc(c0343im);
        } else {
            if (iM1764h != 5) {
                c0801zl.m1922as(this);
                return false;
            }
            if (!c0801zl.m1920aq("html")) {
                c0801zl.m1922as(this);
            }
        }
        return true;
    }
}
