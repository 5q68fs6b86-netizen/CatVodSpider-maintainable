package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0117ac extends AbstractC0814zy implements InterfaceC0304ha {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f546a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f547b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0117ac(int i, Object obj) {
        super(2);
        this.f546a = i;
        this.f547b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa A[LOOP:0: B:26:0x0076->B:37:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3 A[SYNTHETIC] */
    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0304ha
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        Object next;
        C0344in c0344in;
        Object next2;
        String str;
        String str2;
        switch (this.f546a) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Number) obj2).intValue();
                AbstractC0399ko.m1351f("$this$$receiver", charSequence);
                int iM1101i = AbstractC0198dc.m1101i(charSequence, (char[]) this.f547b, iIntValue, false);
                if (iM1101i < 0) {
                    return null;
                }
                return new C0344in(Integer.valueOf(iM1101i), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                AbstractC0399ko.m1351f("$this$$receiver", charSequence2);
                List list = (List) this.f547b;
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str3 = (String) list.get(0);
                    int iM1100h = AbstractC0198dc.m1100h(charSequence2, str3, iIntValue2, 4);
                    if (iM1100h < 0) {
                        c0344in = null;
                    } else {
                        c0344in = new C0344in(Integer.valueOf(iM1100h), str3);
                    }
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    add addVar = new add(iIntValue2, charSequence2.length(), 1);
                    boolean z = charSequence2 instanceof String;
                    int i3 = addVar.f430c;
                    int i4 = addVar.f429b;
                    if (z) {
                        if ((i3 <= 0 || iIntValue2 > i4) && (i3 >= 0 || i4 > iIntValue2)) {
                            c0344in = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str2 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str = (String) next2;
                                    if (str != null) {
                                        c0344in = new C0344in(Integer.valueOf(iIntValue2), str);
                                    } else if (iIntValue2 != i4) {
                                        iIntValue2 += i3;
                                    } else {
                                        c0344in = null;
                                    }
                                } while (!AbstractC0714wf.m1774ad(str2, 0, (String) charSequence2, iIntValue2, str2.length(), false));
                                str = (String) next2;
                                if (str != null) {
                                    c0344in = new C0344in(Integer.valueOf(iIntValue2), str);
                                } else if (iIntValue2 != i4) {
                                    iIntValue2 += i3;
                                } else {
                                    c0344in = null;
                                }
                            }
                        }
                    } else if ((i3 <= 0 || iIntValue2 > i4) && (i3 >= 0 || i4 > iIntValue2)) {
                        c0344in = null;
                    } else {
                        int i5 = iIntValue2;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    i = i4;
                                    i2 = i3;
                                    if (!AbstractC0198dc.m1105m(str4, 0, charSequence2, i5, str4.length(), false)) {
                                        i3 = i2;
                                        i4 = i;
                                    }
                                } else {
                                    i = i4;
                                    i2 = i3;
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                c0344in = new C0344in(Integer.valueOf(i5), str5);
                            } else if (i5 != i) {
                                i5 += i2;
                                i3 = i2;
                                i4 = i;
                            } else {
                                c0344in = null;
                            }
                        }
                    }
                }
                if (c0344in == null) {
                    return null;
                }
                return new C0344in(c0344in.f1014a, Integer.valueOf(((String) c0344in.f1015b).length()));
        }
    }
}
