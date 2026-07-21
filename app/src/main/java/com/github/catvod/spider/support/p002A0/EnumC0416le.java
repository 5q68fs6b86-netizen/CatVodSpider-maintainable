package com.github.catvod.spider.support.p002A0;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.le */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC0416le {

    /* JADX INFO: renamed from: c */
    public static final C0274fy f1128c = new C0274fy();

    /* JADX INFO: renamed from: d */
    public static final C0481np f1129d = new C0481np();

    /* JADX INFO: renamed from: e */
    public static final C0567qu f1130e = new C0567qu();

    /* JADX INFO: renamed from: f */
    public static final C0284gh f1131f = new C0284gh();

    /* JADX INFO: renamed from: g */
    public static final C0810zu f1132g = new C0810zu();

    /* JADX INFO: renamed from: h */
    public static final C0340ij f1133h = new C0340ij();

    /* JADX INFO: renamed from: i */
    public static final C0155bn f1134i = new C0155bn();

    /* JADX INFO: renamed from: j */
    public static final C0263fn f1135j = new C0263fn();

    /* JADX INFO: renamed from: k */
    public static final C0461mw f1136k = new C0461mw();

    /* JADX INFO: renamed from: l */
    public static final C0561qo f1137l = new C0561qo();

    /* JADX INFO: renamed from: m */
    public static final C0286gj f1138m = new C0286gj();

    /* JADX INFO: renamed from: n */
    public static final C0564qr f1139n = new C0564qr();

    /* JADX INFO: renamed from: o */
    public static final C0206dk f1140o = new C0206dk();

    /* JADX INFO: renamed from: p */
    public static final C0799zj f1141p = new C0799zj();

    /* JADX INFO: renamed from: q */
    public static final C0722wn f1142q = new C0722wn();

    /* JADX INFO: renamed from: r */
    public static final C0800zk f1143r = new C0800zk();

    /* JADX INFO: renamed from: s */
    public static final C0759xx f1144s = new C0759xx();

    /* JADX INFO: renamed from: t */
    public static final C0185cq f1145t = new C0185cq();

    /* JADX INFO: renamed from: u */
    public static final C0701vt f1146u = new C0701vt();

    /* JADX INFO: renamed from: v */
    public static final C0445mg f1147v = new C0445mg();

    /* JADX INFO: renamed from: w */
    public static final C0496od f1148w = new C0496od();

    /* JADX INFO: renamed from: x */
    public static final C0187cs f1149x = new C0187cs();

    /* JADX INFO: renamed from: y */
    public static final C0326hw f1150y = new C0326hw();

    /* JADX INFO: renamed from: z */
    public static final C0205dj f1151z = new C0205dj();

    /* JADX INFO: renamed from: aa */
    public static final String f1127aa = String.valueOf((char) 0);

    /* JADX INFO: renamed from: ab */
    public static boolean m1371ab(AbstractC0680uz abstractC0680uz) {
        if (abstractC0680uz.m1739i()) {
            return AbstractC0727ws.m1848j(((C0343im) abstractC0680uz).f1013b);
        }
        return false;
    }

    /* JADX INFO: renamed from: ac */
    public static void m1372ac(C0708w c0708w, C0801zl c0801zl) {
        c0801zl.f1893m.m1291al(EnumC0709wa.f1702g);
        c0801zl.f1903w = c0801zl.f1902v;
        c0801zl.f1902v = f1135j;
        c0801zl.m1935bf(c0708w);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ad */
    public static void m1373ad(C0708w c0708w, C0226ed c0226ed) {
        Map map;
        Object obj;
        C0554qh c0554qh = c0708w.f1732f;
        if (c0554qh != null) {
            c0554qh.getClass();
            C0553qg c0553qg = new C0553qg(c0554qh);
            while (c0553qg.hasNext()) {
                C0551qe c0551qe = (C0551qe) c0553qg.next();
                C0554qh c0554qhMo1170l = c0226ed.mo1170l();
                String str = c0551qe.f1397d;
                if (!c0554qhMo1170l.m1590j(str)) {
                    C0554qh c0554qh2 = c0551qe.f1399f;
                    if (c0554qh2 != null && c0554qh2.m1590j(str)) {
                        if (c0554qh2.m1590j("/jsoup.userdata")) {
                            int iM1592l = c0554qh2.m1592l("/jsoup.userdata");
                            if (iM1592l == -1) {
                                HashMap map2 = new HashMap();
                                c0554qh2.m1585e("/jsoup.userdata", map2);
                                map = map2;
                            } else {
                                map = (Map) c0554qh2.f1407c[iM1592l];
                            }
                            obj = map.get("jsoup.attrs");
                        } else {
                            obj = null;
                        }
                        Map map3 = (Map) obj;
                        if (map3 == null || ((C0200de) map3.get(str)) == null) {
                            int i = C0200de.f726a;
                        }
                    } else {
                        int i2 = C0200de.f726a;
                    }
                    String str2 = c0551qe.f1398e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c0554qhMo1170l.m1594n(c0551qe.f1397d, str2);
                    c0551qe.f1399f = c0554qhMo1170l;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl);
}
