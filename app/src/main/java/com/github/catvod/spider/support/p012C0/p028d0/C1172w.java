package com.github.catvod.spider.support.p012C0.p028d0;

import com.base.model.proto.DramaDetailProto;
import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r;
import com.github.catvod.spider.support.p012C0.p026c0.C1042a;
import com.github.catvod.spider.support.p012C0.p026c0.C1044c;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p026c0.C1056o;
import com.github.catvod.spider.support.p012C0.p037l.C1257a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.w */
/* JADX INFO: loaded from: classes.dex */
static final class C1172w extends EnumC1068A {
    C1172w() {
        super("InBody", 6, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:217:0x046f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:439:0x0933  */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0b89, code lost:
    
        if (com.github.catvod.spider.support.p012C0.p024b0.C1034b.m2596b(r5, com.github.catvod.spider.support.p012C0.p028d0.C1178z.f2852q) != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015a, code lost:
    
        if (r18.m2990d("body") != false) goto L88;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 int, still in use, count: 1, list:
      (r4v1 int) from 0x0469: SWITCH (r4v1 int)
     case -1644953643: goto B:311:0x05d8
     case -1377687758: goto B:308:0x05cd
     case -1191214428: goto B:305:0x05c2
     case -1010136971: goto B:302:0x05b7
     case -1003243718: goto B:299:0x05ac
     case -906021636: goto B:296:0x05a1
     case -80773204: goto B:293:0x0596
     case 97: goto B:290:0x058b
     case 3200: goto B:287:0x057f
     case 3216: goto B:284:0x0573
     case 3338: goto B:281:0x0567
     case 3453: goto B:278:0x055b
     case 3646: goto B:275:0x054f
     case 3650: goto B:272:0x0543
     case 111267: goto B:269:0x0537
     case 114276: goto B:266:0x052b
     case 118811: goto B:263:0x051f
     case 3029410: goto B:260:0x0513
     case 3148996: goto B:257:0x0507
     case 3213227: goto B:254:0x04fb
     case 3344136: goto B:251:0x04ef
     case 3386833: goto B:248:0x04e4
     case 3536714: goto B:245:0x04d9
     case 100313435: goto B:242:0x04ce
     case 100358090: goto B:239:0x04c3
     case 110115790: goto B:236:0x04b8
     case 181975684: goto B:233:0x04ad
     case 1973234167: goto B:230:0x04a2
     case 2091304424: goto B:227:0x0497
     case 2115613112: goto B:224:0x048c
     default: goto B:216:0x046c A[RegionRef:SW:215]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.github.catvod.spider.support.C0.d0.b, com.github.catvod.spider.support.C0.d0.i1] */
    /* JADX WARN: Type inference failed for: r2v111 */
    /* JADX WARN: Type inference failed for: r2v112, types: [com.github.catvod.spider.support.C0.c0.l] */
    /* JADX WARN: Type inference failed for: r2v129, types: [com.github.catvod.spider.support.C0.c0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v138 */
    /* JADX WARN: Type inference failed for: r2v152 */
    /* JADX WARN: Type inference failed for: r2v153 */
    /* JADX WARN: Type inference failed for: r3v207 */
    /* JADX WARN: Type inference failed for: r3v208, types: [com.github.catvod.spider.support.C0.c0.l] */
    /* JADX WARN: Type inference failed for: r3v218 */
    /* JADX WARN: Type inference failed for: r3v221, types: [com.github.catvod.spider.support.C0.c0.l] */
    /* JADX WARN: Type inference failed for: r3v241 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.github.catvod.spider.support.C0.c0.l, com.github.catvod.spider.support.C0.c0.r] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r6v20, types: [com.github.catvod.spider.support.C0.c0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        byte b;
        EnumC1068A enumC1068A;
        C1053l c1053lM2972r;
        C1053l c1053l;
        Object M2958g;
        Object r7;
        int iM2946W;
        int iM3131a = C1257a.m3131a(abstractC1096O.f2694a);
        if (iM3131a == 0) {
            c1122b.m2968n(this);
            return false;
        }
        byte b2 = 5;
        if (iM3131a == 1) {
            C1176y c1176y = EnumC1068A.f2636k;
            C1092M c1092m = (C1092M) abstractC1096O;
            String str = c1092m.f2686c;
            str.getClass();
            switch (str.hashCode()) {
                case -1644953643:
                    if (str.equals("frameset")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case -1377687758:
                    if (str.equals("button")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                case -1191214428:
                    if (str.equals("iframe")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -1010136971:
                    if (str.equals("option")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case -1003243718:
                    if (str.equals("textarea")) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    break;
                case -80773204:
                    if (str.equals("optgroup")) {
                        b = 6;
                    } else {
                        b = -1;
                    }
                    break;
                case 97:
                    if (str.equals("a")) {
                        b = 7;
                    } else {
                        b = -1;
                    }
                    break;
                case 3200:
                    if (str.equals("dd")) {
                        b = 8;
                    } else {
                        b = -1;
                    }
                    break;
                case 3216:
                    if (str.equals("dt")) {
                        b = 9;
                    } else {
                        b = -1;
                    }
                    break;
                case 3338:
                    if (str.equals("hr")) {
                        b = 16;
                    } else {
                        b = -1;
                    }
                    break;
                case 3453:
                    if (str.equals("li")) {
                        b = 17;
                    } else {
                        b = -1;
                    }
                    break;
                case 3646:
                    if (str.equals("rp")) {
                        b = 18;
                    } else {
                        b = -1;
                    }
                    break;
                case 3650:
                    if (str.equals("rt")) {
                        b = 19;
                    } else {
                        b = -1;
                    }
                    break;
                case 111267:
                    if (str.equals("pre")) {
                        b = 20;
                    } else {
                        b = -1;
                    }
                    break;
                case 114276:
                    if (str.equals("svg")) {
                        b = 21;
                    } else {
                        b = -1;
                    }
                    break;
                case 118811:
                    if (str.equals("xmp")) {
                        b = 22;
                    } else {
                        b = -1;
                    }
                    break;
                case 3029410:
                    if (str.equals("body")) {
                        b = 23;
                    } else {
                        b = -1;
                    }
                    break;
                case 3148996:
                    if (str.equals("form")) {
                        b = 24;
                    } else {
                        b = -1;
                    }
                    break;
                case 3213227:
                    if (str.equals("html")) {
                        b = 25;
                    } else {
                        b = -1;
                    }
                    break;
                case 3344136:
                    if (str.equals("math")) {
                        b = 26;
                    } else {
                        b = -1;
                    }
                    break;
                case 3386833:
                    if (str.equals("nobr")) {
                        b = 27;
                    } else {
                        b = -1;
                    }
                    break;
                case 3536714:
                    if (str.equals("span")) {
                        b = 28;
                    } else {
                        b = -1;
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        b = 29;
                    } else {
                        b = -1;
                    }
                    break;
                case 100358090:
                    if (str.equals("input")) {
                        b = 30;
                    } else {
                        b = -1;
                    }
                    break;
                case 110115790:
                    if (str.equals("table")) {
                        b = 31;
                    } else {
                        b = -1;
                    }
                    break;
                case 181975684:
                    if (str.equals("listing")) {
                        b = 32;
                    } else {
                        b = -1;
                    }
                    break;
                case 1973234167:
                    if (str.equals("plaintext")) {
                        b = 33;
                    } else {
                        b = -1;
                    }
                    break;
                case 2091304424:
                    if (str.equals("isindex")) {
                        b = 34;
                    } else {
                        b = -1;
                    }
                    break;
                case 2115613112:
                    if (str.equals("noembed")) {
                        b = 35;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    switch (str) {
                        case "h1":
                            b = 10;
                            break;
                        case "h2":
                            b = 11;
                            break;
                        case "h3":
                            b = 12;
                            break;
                        case "h4":
                            b = 13;
                            break;
                        case "h5":
                            b = 14;
                            break;
                        case "h6":
                            b = 15;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    c1122b.m2968n(this);
                    ArrayList<C1053l> arrayList = c1122b.f2818e;
                    if (arrayList.size() != 1 && ((arrayList.size() <= 2 || arrayList.get(1).m2706d0().equals("body")) && c1122b.m2970p())) {
                        C1053l c1053l2 = arrayList.get(1);
                        if (c1053l2.m2709f0() != null) {
                            c1053l2.m2750C();
                        }
                        while (arrayList.size() > 1) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                        c1122b.m2929D(c1092m);
                        enumC1068A = EnumC1068A.f2646u;
                        c1122b.m2964j0(enumC1068A);
                        return true;
                    }
                    return false;
                case 1:
                    if (c1122b.m2977w("button")) {
                        c1122b.m2968n(this);
                        c1122b.m2990d("button");
                        c1122b.mo2953c(c1092m);
                    } else {
                        c1122b.m2950a0();
                        c1122b.m2929D(c1092m);
                        c1122b.m2969o(false);
                    }
                    return true;
                case 2:
                    c1122b.m2969o(false);
                    EnumC1068A.m2798b(c1092m, c1122b);
                    return true;
                case 3:
                case 6:
                    if (c1122b.m2989a().m2706d0().equals("option")) {
                        c1122b.m2990d("option");
                    }
                    c1122b.m2950a0();
                    c1122b.m2929D(c1092m);
                    return true;
                case 4:
                    c1122b.m2929D(c1092m);
                    if (!c1092m.f2692i) {
                        c1122b.f2816c.m2887u(EnumC1142h1.f2775e);
                        c1122b.m2939P();
                        c1122b.m2969o(false);
                        enumC1068A = EnumC1068A.f2635j;
                        c1122b.m2964j0(enumC1068A);
                    }
                    return true;
                case 5:
                    c1122b.m2950a0();
                    c1122b.m2929D(c1092m);
                    c1122b.m2969o(false);
                    EnumC1068A enumC1068AM2963i0 = c1122b.m2963i0();
                    enumC1068A = (enumC1068AM2963i0.equals(c1176y) || enumC1068AM2963i0.equals(EnumC1068A.f2638m) || enumC1068AM2963i0.equals(EnumC1068A.f2640o) || enumC1068AM2963i0.equals(EnumC1068A.f2641p) || enumC1068AM2963i0.equals(EnumC1068A.f2642q)) ? EnumC1068A.f2644s : EnumC1068A.f2643r;
                    c1122b.m2964j0(enumC1068A);
                    return true;
                case 7:
                    if (c1122b.m2972r("a") != null) {
                        c1122b.m2968n(this);
                        c1122b.m2990d("a");
                        C1053l c1053lM2974t = c1122b.m2974t("a");
                        if (c1053lM2974t != null) {
                            c1122b.m2952b0(c1053lM2974t);
                            c1122b.m2954c0(c1053lM2974t);
                        }
                    }
                    c1122b.m2950a0();
                    c1122b.m2948Y(c1122b.m2929D(c1092m));
                    return true;
                case 8:
                case 9:
                    c1122b.m2969o(false);
                    ArrayList<C1053l> arrayList2 = c1122b.f2818e;
                    for (int size = arrayList2.size() - 1; size > 0; size--) {
                        C1053l c1053l3 = arrayList2.get(size);
                        if (C1034b.m2596b(c1053l3.m2706d0(), C1178z.f2846k)) {
                            c1122b.m2990d(c1053l3.m2706d0());
                        } else if (!c1122b.m2938O(c1053l3) || C1034b.m2596b(c1053l3.m2706d0(), C1178z.f2845j)) {
                        }
                        if (c1122b.m2977w("p")) {
                            c1122b.m2990d("p");
                        }
                        c1122b.m2929D(c1092m);
                        return true;
                    }
                    if (c1122b.m2977w("p")) {
                        c1122b.m2990d("p");
                    }
                    c1122b.m2929D(c1092m);
                    return true;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    if (c1122b.m2977w("p")) {
                        c1122b.m2990d("p");
                    }
                    if (C1034b.m2596b(c1122b.m2989a().m2706d0(), C1178z.f2844i)) {
                        c1122b.m2968n(this);
                        c1122b.m2944U();
                    }
                    c1122b.m2929D(c1092m);
                    return true;
                case 16:
                    if (c1122b.m2977w("p")) {
                        c1122b.m2990d("p");
                    }
                    c1122b.m2932G(c1092m);
                    c1122b.m2969o(false);
                    return true;
                case 17:
                    c1122b.m2969o(false);
                    ArrayList<C1053l> arrayList3 = c1122b.f2818e;
                    for (int size2 = arrayList3.size() - 1; size2 > 0; size2--) {
                        C1053l c1053l4 = arrayList3.get(size2);
                        if (c1053l4.m2706d0().equals("li")) {
                            c1122b.m2990d("li");
                        } else if (!c1122b.m2938O(c1053l4) || C1034b.m2596b(c1053l4.m2706d0(), C1178z.f2845j)) {
                        }
                        if (c1122b.m2977w("p")) {
                            c1122b.m2990d("p");
                        }
                        c1122b.m2929D(c1092m);
                        return true;
                    }
                    if (c1122b.m2977w("p")) {
                        c1122b.m2990d("p");
                    }
                    c1122b.m2929D(c1092m);
                    return true;
                case 18:
                case 19:
                    if (c1122b.m2978x("ruby", null)) {
                        if (!c1122b.m2989a().m2706d0().equals("ruby")) {
                            c1122b.m2968n(this);
                            for (int size3 = c1122b.f2818e.size() - 1; size3 >= 0 && !c1122b.f2818e.get(size3).m2706d0().equals("ruby"); size3--) {
                                c1122b.f2818e.remove(size3);
                            }
                        }
                        c1122b.m2929D(c1092m);
                    }
                    return true;
                case 20:
                case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                    if (c1122b.m2977w("p")) {
                        c1122b.m2990d("p");
                    }
                    c1122b.m2929D(c1092m);
                    c1122b.f2815b.m2919w("\n");
                    c1122b.m2969o(false);
                    return true;
                case 21:
                case 26:
                case 28:
                    c1122b.m2950a0();
                    c1122b.m2929D(c1092m);
                    return true;
                case 22:
                    if (c1122b.m2977w("p")) {
                        c1122b.m2990d("p");
                    }
                    c1122b.m2950a0();
                    c1122b.m2969o(false);
                    EnumC1068A.m2798b(c1092m, c1122b);
                    return true;
                case 23:
                    c1122b.m2968n(this);
                    ArrayList<C1053l> arrayList4 = c1122b.f2818e;
                    if (arrayList4.size() != 1 && (arrayList4.size() <= 2 || arrayList4.get(1).m2706d0().equals("body"))) {
                        c1122b.m2969o(false);
                        C1053l c1053l5 = arrayList4.get(1);
                        if (c1092m.m2839r()) {
                            for (C1042a c1042a : c1092m.f2693j) {
                                if (!c1053l5.m2757o(c1042a.m2631a())) {
                                    c1053l5.mo2705d().m2652s(c1042a);
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                case 24:
                    if (c1122b.m2973s() == null) {
                        if (c1122b.m2977w("p")) {
                            c1122b.m2990d("p");
                        }
                        c1122b.m2933H(c1092m, true);
                        return true;
                    }
                    c1122b.m2968n(this);
                    return false;
                case 25:
                    c1122b.m2968n(this);
                    C1053l c1053l6 = c1122b.f2818e.get(0);
                    if (c1092m.m2839r()) {
                        for (C1042a c1042a2 : c1092m.f2693j) {
                            if (!c1053l6.m2757o(c1042a2.m2631a())) {
                                c1053l6.mo2705d().m2652s(c1042a2);
                            }
                        }
                    }
                    return true;
                case 27:
                    c1122b.m2950a0();
                    if (c1122b.m2978x("nobr", null)) {
                        c1122b.m2968n(this);
                        c1122b.m2990d("nobr");
                        c1122b.m2950a0();
                    }
                    c1122b.m2948Y(c1122b.m2929D(c1092m));
                    return true;
                case 29:
                    if (c1122b.m2974t("svg") == null) {
                        c1092m.m2840s("img");
                        return c1122b.mo2953c(c1092m);
                    }
                    c1122b.m2929D(c1092m);
                    return true;
                case 30:
                    c1122b.m2950a0();
                    if (!c1122b.m2932G(c1092m).mo2747c("type").equalsIgnoreCase("hidden")) {
                        c1122b.m2969o(false);
                    }
                    return true;
                case 31:
                    if (c1122b.f2817d.m2678w0() != 2 && c1122b.m2977w("p")) {
                        c1122b.m2990d("p");
                    }
                    c1122b.m2929D(c1092m);
                    c1122b.m2969o(false);
                    enumC1068A = c1176y;
                    c1122b.m2964j0(enumC1068A);
                    return true;
                case 33:
                    if (c1122b.m2977w("p")) {
                        c1122b.m2990d("p");
                    }
                    c1122b.m2929D(c1092m);
                    c1122b.f2816c.m2887u(EnumC1142h1.f2783i);
                    return true;
                case 34:
                    c1122b.m2968n(this);
                    if (c1122b.m2973s() == null) {
                        c1122b.m2992f("form");
                        C1044c c1044c = c1092m.f2693j;
                        if (c1044c != null && c1044c.m2647l("action")) {
                            c1122b.m2973s().mo2746b("action", c1092m.f2693j.m2645j("action"));
                        }
                        c1122b.m2992f("hr");
                        c1122b.m2992f("label");
                        C1044c c1044c2 = c1092m.f2693j;
                        String strM2645j = c1044c2 != null && c1044c2.m2647l("prompt") ? c1092m.f2693j.m2645j("prompt") : "This is a searchable index. Enter search keywords: ";
                        C1082H c1082h = new C1082H();
                        c1082h.m2824i(strM2645j);
                        c1122b.mo2953c(c1082h);
                        C1044c c1044c3 = new C1044c();
                        if (c1092m.m2839r()) {
                            for (C1042a c1042a3 : c1092m.f2693j) {
                                if (!C1034b.m2596b(c1042a3.m2631a(), C1178z.f2851p)) {
                                    c1044c3.m2652s(c1042a3);
                                }
                            }
                        }
                        c1044c3.m2653t("name", "isindex");
                        c1122b.m2991e(c1044c3);
                        c1122b.m2990d("label");
                        c1122b.m2992f("hr");
                        c1122b.m2990d("form");
                        return true;
                    }
                    return false;
                case 35:
                    EnumC1068A.m2798b(c1092m, c1122b);
                    return true;
                default:
                    if (!C1034b.m2596b(str, C1178z.f2849n)) {
                        if (!C1034b.m2596b(str, C1178z.f2843h)) {
                            if (C1034b.m2596b(str, C1178z.f2842g)) {
                                return c1122b.m2947X(abstractC1096O, EnumC1068A.f2631f);
                            }
                            if (C1034b.m2596b(str, C1178z.f2847l)) {
                                c1122b.m2950a0();
                                c1122b.m2948Y(c1122b.m2929D(c1092m));
                            } else if (C1034b.m2596b(str, C1178z.f2848m)) {
                                c1122b.m2950a0();
                                c1122b.m2929D(c1092m);
                                c1122b.m2935J();
                            } else if (C1034b.m2596b(str, C1178z.f2850o)) {
                                c1122b.m2932G(c1092m);
                            }
                            break;
                        } else {
                            if (c1122b.m2977w("p")) {
                                c1122b.m2990d("p");
                            }
                            c1122b.m2929D(c1092m);
                        }
                        return true;
                    }
                    c1122b.m2950a0();
                    c1122b.m2932G(c1092m);
                    c1122b.m2969o(false);
                    return true;
            }
        }
        if (iM3131a != 2) {
            if (iM3131a == 3) {
                c1122b.m2931F((C1084I) abstractC1096O);
            } else if (iM3131a == 4) {
                C1082H c1082h2 = (C1082H) abstractC1096O;
                if (c1082h2.m2825j().equals(EnumC1068A.f2651z)) {
                    c1122b.m2968n(this);
                    return false;
                }
                if (c1122b.m2970p() && EnumC1068A.m2797a(c1082h2)) {
                    c1122b.m2950a0();
                    c1122b.m2930E(c1082h2);
                } else {
                    c1122b.m2950a0();
                    c1122b.m2930E(c1082h2);
                    c1122b.m2969o(false);
                }
            }
            return true;
        }
        C1090L c1090l = (C1090L) abstractC1096O;
        String str2 = c1090l.f2686c;
        str2.getClass();
        int iHashCode = str2.hashCode();
        switch (iHashCode) {
            case 112:
                if (str2.equals("p")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                break;
            case 3152:
                if (str2.equals("br")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                break;
            case 3200:
                if (str2.equals("dd")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
                break;
            case 3216:
                if (str2.equals("dt")) {
                    b2 = 3;
                } else {
                    b2 = -1;
                }
                break;
            case 3453:
                if (str2.equals("li")) {
                    b2 = 10;
                } else {
                    b2 = -1;
                }
                break;
            case 3029410:
                if (str2.equals("body")) {
                    b2 = 11;
                } else {
                    b2 = -1;
                }
                break;
            case 3148996:
                if (str2.equals("form")) {
                    b2 = 12;
                } else {
                    b2 = -1;
                }
                break;
            case 3213227:
                if (str2.equals("html")) {
                    b2 = 13;
                } else {
                    b2 = -1;
                }
                break;
            case 3536714:
                if (str2.equals("span")) {
                    b2 = 14;
                } else {
                    b2 = -1;
                }
                break;
            case 1869063452:
                if (str2.equals("sarcasm")) {
                    b2 = 15;
                } else {
                    b2 = -1;
                }
                break;
            default:
                switch (iHashCode) {
                    case 3273:
                        if (str2.equals("h1")) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3274:
                        if (!str2.equals("h2")) {
                            b2 = -1;
                        }
                        break;
                    case 3275:
                        if (str2.equals("h3")) {
                            b2 = 6;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3276:
                        if (str2.equals("h4")) {
                            b2 = 7;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3277:
                        if (str2.equals("h5")) {
                            b2 = 8;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3278:
                        if (str2.equals("h6")) {
                            b2 = 9;
                        } else {
                            b2 = -1;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                break;
        }
        switch (b2) {
            case 0:
                if (!c1122b.m2977w(str2)) {
                    c1122b.m2968n(this);
                    c1122b.m2992f(str2);
                    return c1122b.mo2953c(c1090l);
                }
                c1122b.m2971q(str2);
                if (!c1122b.m2989a().m2706d0().equals(str2)) {
                    c1122b.m2968n(this);
                }
                c1122b.m2945V(str2);
                return true;
            case 1:
                c1122b.m2968n(this);
                c1122b.m2992f("br");
                return false;
            case 2:
            case 3:
                if (c1122b.m2978x(str2, null)) {
                    c1122b.m2971q(str2);
                    if (!c1122b.m2989a().m2706d0().equals(str2)) {
                        c1122b.m2968n(this);
                    }
                    c1122b.m2945V(str2);
                    return true;
                }
                c1122b.m2968n(this);
                return false;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                String[] strArr = C1178z.f2844i;
                if (c1122b.m2979y(strArr)) {
                    c1122b.m2971q(str2);
                    if (!c1122b.m2989a().m2706d0().equals(str2)) {
                        c1122b.m2968n(this);
                    }
                    for (int size4 = c1122b.f2818e.size() - 1; size4 >= 0; size4--) {
                        C1053l c1053l7 = c1122b.f2818e.get(size4);
                        c1122b.f2818e.remove(size4);
                        if (C1034b.m2596b(c1053l7.m2706d0(), strArr)) {
                            return true;
                        }
                    }
                    return true;
                }
                c1122b.m2968n(this);
                return false;
            case 10:
                if (c1122b.m2978x(str2, C1122b.f2728w)) {
                    c1122b.m2971q(str2);
                    if (!c1122b.m2989a().m2706d0().equals(str2)) {
                        c1122b.m2968n(this);
                    }
                    c1122b.m2945V(str2);
                    return true;
                }
                c1122b.m2968n(this);
                return false;
            case 11:
                if (c1122b.m2978x("body", null)) {
                    c1122b.m2964j0(EnumC1068A.f2645t);
                    return true;
                }
                c1122b.m2968n(this);
                return false;
            case 12:
                C1056o c1056oM2973s = c1122b.m2973s();
                c1122b.m2957f0();
                if (c1056oM2973s != null && c1122b.m2978x(str2, null)) {
                    if (!c1122b.m2989a().m2706d0().equals(str2)) {
                        c1122b.m2968n(this);
                    }
                    c1122b.m2954c0(c1056oM2973s);
                    return true;
                }
                c1122b.m2968n(this);
                return false;
            case 13:
                break;
            default:
                if (!C1034b.m2596b(str2, C1178z.f2854s)) {
                    if (C1034b.m2596b(str2, C1178z.f2853r)) {
                        if (c1122b.m2978x(str2, null)) {
                            if (!c1122b.m2989a().m2706d0().equals(str2)) {
                                c1122b.m2968n(this);
                            }
                            c1122b.m2945V(str2);
                        }
                    } else if (C1034b.m2596b(str2, C1178z.f2848m)) {
                        if (!c1122b.m2978x("name", null)) {
                            if (c1122b.m2978x(str2, null)) {
                                if (!c1122b.m2989a().m2706d0().equals(str2)) {
                                    c1122b.m2968n(this);
                                }
                                c1122b.m2945V(str2);
                                c1122b.m2962i();
                            }
                        }
                    }
                    c1122b.m2968n(this);
                    return false;
                }
                String str3 = c1090l.f2686c;
                ArrayList<C1053l> arrayList5 = c1122b.f2818e;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < 8) {
                        c1053lM2972r = c1122b.m2972r(str3);
                        if (c1053lM2972r == null) {
                            return m2994e(abstractC1096O, c1122b);
                        }
                        if (!c1122b.m2942S(c1053lM2972r)) {
                            c1122b.m2968n(this);
                        } else {
                            if (!c1122b.m2978x(c1053lM2972r.m2706d0(), null)) {
                                c1122b.m2968n(this);
                                return false;
                            }
                            if (c1122b.m2989a() != c1053lM2972r) {
                                c1122b.m2968n(this);
                            }
                            int size5 = arrayList5.size();
                            boolean z = false;
                            C1053l c1053l8 = 0;
                            int i3 = -1;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size5 || i4 >= 64) {
                                    c1053l = null;
                                } else {
                                    C1053l c1053l9 = arrayList5.get(i4);
                                    if (c1053l9 == c1053lM2972r) {
                                        c1053l8 = arrayList5.get(i4 - 1);
                                        iM2946W = c1122b.m2946W(c1053l9);
                                        z = true;
                                    } else if (z && c1122b.m2938O(c1053l9)) {
                                        c1053l = c1053l9;
                                    } else {
                                        iM2946W = i3;
                                    }
                                    i4++;
                                    i3 = iM2946W;
                                    c1053l8 = c1053l8;
                                }
                            }
                            if (c1053l == null) {
                                c1122b.m2945V(c1053lM2972r.m2706d0());
                            } else {
                                int i5 = 0;
                                Object r5 = c1053l;
                                Object r2 = c1053l;
                                while (true) {
                                    int i6 = i5;
                                    if (i6 < 3) {
                                        if (c1122b.m2942S(r2)) {
                                            M2958g = r2;
                                            M2958g = c1122b.m2958g(r2);
                                        }
                                        M2958g = r2;
                                        if (!c1122b.m2937N(M2958g)) {
                                            c1122b.m2954c0(M2958g);
                                            r7 = M2958g;
                                        } else if (M2958g != c1053lM2972r) {
                                            Object c1053l10 = new C1053l(C1078F.m2811l(M2958g.mo2658t(), C1074D.f2656d), c1122b.f2819f, null);
                                            c1122b.m2955d0(M2958g, c1053l10);
                                            ArrayList<C1053l> arrayList6 = c1122b.f2818e;
                                            int iLastIndexOf = arrayList6.lastIndexOf(M2958g);
                                            C0966a.m2371f(iLastIndexOf != -1);
                                            arrayList6.set(iLastIndexOf, (C1053l) c1053l10);
                                            int iM2946W2 = r5 == c1053l ? c1122b.m2946W(c1053l10) + 1 : i3;
                                            if (r5.m2709f0() != null) {
                                                r5.m2750C();
                                            }
                                            c1053l10.m2690L(r5);
                                            r5 = c1053l10;
                                            r7 = c1053l10;
                                            i3 = iM2946W2;
                                        }
                                        i5 = i6 + 1;
                                        r2 = r7;
                                        r5 = r5;
                                    }
                                }
                                if (c1053l8 != 0) {
                                    if (C1034b.m2596b(c1053l8.m2706d0(), C1178z.f2855t)) {
                                        if (r5.m2709f0() != null) {
                                            r5.m2750C();
                                        }
                                        c1122b.m2934I(r5);
                                    } else {
                                        if (r5.m2709f0() != null) {
                                            r5.m2750C();
                                        }
                                        c1053l8.m2690L(r5);
                                    }
                                }
                                C1053l c1053l11 = new C1053l(c1053lM2972r.m2717m0(), c1122b.f2819f, null);
                                c1053l11.mo2705d().m2641e(c1053lM2972r.mo2705d());
                                for (AbstractC1059r abstractC1059r : (AbstractC1059r[]) c1053l.m2756i().toArray(new AbstractC1059r[0])) {
                                    c1053l11.m2690L(abstractC1059r);
                                }
                                c1053l.m2690L(c1053l11);
                                c1122b.m2952b0(c1053lM2972r);
                                c1122b.m2949Z(c1053l11, i3);
                                c1122b.m2954c0(c1053lM2972r);
                                int iLastIndexOf2 = c1122b.f2818e.lastIndexOf(c1053l);
                                C0966a.m2371f(iLastIndexOf2 != -1);
                                c1122b.f2818e.add(iLastIndexOf2 + 1, c1053l11);
                                i = i2 + 1;
                            }
                        }
                    }
                }
                c1122b.m2952b0(c1053lM2972r);
                return true;
            case 14:
            case 15:
                return m2994e(abstractC1096O, c1122b);
        }
    }

    /* JADX INFO: renamed from: e */
    final boolean m2994e(AbstractC1096O abstractC1096O, C1122b c1122b) {
        abstractC1096O.getClass();
        String str = ((C1090L) abstractC1096O).f2686c;
        ArrayList<C1053l> arrayList = c1122b.f2818e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1053l c1053l = arrayList.get(size);
            if (c1053l.m2706d0().equals(str)) {
                c1122b.m2971q(str);
                if (!str.equals(c1122b.m2989a().m2706d0())) {
                    c1122b.m2968n(this);
                }
                c1122b.m2945V(str);
                break;
            }
            if (c1122b.m2938O(c1053l)) {
                c1122b.m2968n(this);
                return false;
            }
        }
        return true;
    }
}
