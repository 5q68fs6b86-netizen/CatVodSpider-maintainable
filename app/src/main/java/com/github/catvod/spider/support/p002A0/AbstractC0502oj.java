package com.github.catvod.spider.support.p002A0;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.oj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0502oj {
    /* JADX INFO: renamed from: a */
    public static C0235em m1487a(String str) {
        AbstractC0680uz abstractC0680uz;
        C0801zl c0801zl = new C0801zl();
        StringReader stringReader = new StringReader(str);
        C0736xa c0736xa = new C0736xa(c0801zl);
        C0235em c0235em = new C0235em("http://www.w3.org/1999/xhtml", "");
        c0801zl.f1894n = c0235em;
        c0235em.f784al = c0736xa;
        c0801zl.f1891k = c0736xa;
        c0801zl.f1898r = C0707vz.f1648a;
        C0606sf c0606sf = new C0606sf(stringReader);
        c0801zl.f1892l = c0606sf;
        ((C0408kx) c0736xa.f1779d).getClass();
        c0606sf.f1484l = null;
        c0801zl.f1893m = new C0316hm(c0801zl);
        c0801zl.f1895o = new ArrayList(32);
        c0801zl.f1899s = new HashMap();
        C0708w c0708w = new C0708w(2, c0801zl);
        c0801zl.f1900t = c0708w;
        c0801zl.f1897q = c0708w;
        c0801zl.f1896p = "";
        c0801zl.f1902v = EnumC0416le.f1128c;
        c0801zl.f1903w = null;
        c0801zl.f1904x = false;
        c0801zl.f1905y = null;
        c0801zl.f1906z = null;
        c0801zl.f1884aa = new ArrayList();
        c0801zl.f1885ab = new ArrayList();
        c0801zl.f1886ac = new ArrayList();
        c0801zl.f1887ad = new C0667um(3, c0801zl);
        c0801zl.f1888ae = true;
        c0801zl.f1889af = false;
        while (true) {
            if (c0801zl.f1897q.f1590g == 6) {
                ArrayList arrayList = c0801zl.f1895o;
                if (arrayList == null) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c0801zl.f1895o = null;
                } else {
                    c0801zl.m1942bm();
                }
            } else {
                C0316hm c0316hm = c0801zl.f1893m;
                while (!c0316hm.f905g) {
                    c0316hm.f903e.mo870a(c0316hm, c0316hm.f901c);
                }
                StringBuilder sb = c0316hm.f907i;
                int length = sb.length();
                C0343im c0343im = c0316hm.f912n;
                if (length != 0) {
                    String string = sb.toString();
                    sb.delete(0, sb.length());
                    c0343im.f1013b = string;
                    c0316hm.f906h = null;
                    abstractC0680uz = c0343im;
                } else {
                    String str2 = c0316hm.f906h;
                    if (str2 != null) {
                        c0343im.f1013b = str2;
                        c0316hm.f906h = null;
                        abstractC0680uz = c0343im;
                    } else {
                        c0316hm.f905g = false;
                        abstractC0680uz = c0316hm.f904f;
                    }
                }
                c0801zl.f1897q = abstractC0680uz;
                c0801zl.m1945bp(abstractC0680uz);
                abstractC0680uz.mo904a();
            }
        }
        C0606sf c0606sf2 = c0801zl.f1892l;
        if (c0606sf2 != null) {
            c0606sf2.m1678s();
            c0801zl.f1892l = null;
            c0801zl.f1893m = null;
            c0801zl.f1895o = null;
            c0801zl.f1899s = null;
        }
        return c0801zl.f1894n;
    }
}
