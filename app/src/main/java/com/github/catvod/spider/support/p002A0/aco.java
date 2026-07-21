package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public class aco extends AbstractC0521pb implements acm {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ai */
    public static Object m950ai(aco acoVar, AbstractC0748xm abstractC0748xm) throws Throwable {
        acn acnVar;
        Object objM1873j;
        if (abstractC0748xm instanceof acn) {
            acnVar = (acn) abstractC0748xm;
            int i = acnVar.f567b;
            if ((i & Integer.MIN_VALUE) != 0) {
                acnVar.f567b = i - Integer.MIN_VALUE;
            } else {
                acnVar = new acn(acoVar, abstractC0748xm);
            }
        } else {
            acnVar = new acn(acoVar, abstractC0748xm);
        }
        Object obj = acnVar.f566a;
        EnumC0781ys enumC0781ys = EnumC0781ys.f1859a;
        int i2 = acnVar.f567b;
        if (i2 == 0) {
            act.m954c(obj);
            acnVar.f567b = 1;
            while (true) {
                Object objM1049v = acoVar.m1049v();
                if (!(objM1049v instanceof InterfaceC0681v)) {
                    if (!(objM1049v instanceof C0647tt)) {
                        objM1873j = AbstractC0745xj.m1873j(objM1049v);
                        break;
                    }
                    throw ((C0647tt) objM1049v).f1565c;
                }
                if (acoVar.m1033ag(objM1049v) >= 0) {
                    C0470ne c0470ne = new C0470ne(AbstractC0313hj.m1276a(acnVar), acoVar);
                    c0470ne.m1657u(new adq(0, acoVar.m1052y(false, true, new adr(acoVar, c0470ne, 1))));
                    objM1873j = c0470ne.m1656t();
                    break;
                }
            }
            obj = objM1873j;
            if (obj == enumC0781ys) {
                return enumC0781ys;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            act.m954c(obj);
        }
        return obj;
    }
}
