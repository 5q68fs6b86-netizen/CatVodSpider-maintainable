package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.te */
/* JADX INFO: loaded from: classes.dex */
public final class C0632te extends AbstractC0814zy implements InterfaceC0304ha {

    /* JADX INFO: renamed from: a */
    public static final C0632te f1526a = new C0632te(2, 0);

    /* JADX INFO: renamed from: b */
    public static final C0632te f1527b = new C0632te(2, 1);

    /* JADX INFO: renamed from: c */
    public static final C0632te f1528c = new C0632te(2, 2);

    /* JADX INFO: renamed from: d */
    public static final C0632te f1529d = new C0632te(2, 3);

    /* JADX INFO: renamed from: e */
    public static final C0632te f1530e = new C0632te(2, 4);

    /* JADX INFO: renamed from: f */
    public static final C0632te f1531f = new C0632te(2, 5);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1532g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0632te(int i, int i2) {
        super(i);
        this.f1532g = i2;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0304ha
    public final Object invoke(Object obj, Object obj2) {
        C0633tf c0633tf;
        switch (this.f1532g) {
            case 0:
                String str = (String) obj;
                InterfaceC0750xo interfaceC0750xo = (InterfaceC0750xo) obj2;
                AbstractC0399ko.m1351f("acc", str);
                AbstractC0399ko.m1351f("element", interfaceC0750xo);
                if (str.length() == 0) {
                    return interfaceC0750xo.toString();
                }
                return str + ", " + interfaceC0750xo;
            case 1:
                InterfaceC0769yg interfaceC0769yg = (InterfaceC0769yg) obj;
                InterfaceC0750xo interfaceC0750xo2 = (InterfaceC0750xo) obj2;
                AbstractC0399ko.m1351f("acc", interfaceC0769yg);
                AbstractC0399ko.m1351f("element", interfaceC0750xo2);
                InterfaceC0769yg interfaceC0769ygMinusKey = interfaceC0769yg.minusKey(interfaceC0750xo2.getKey());
                C0233ek c0233ek = C0233ek.f781a;
                if (interfaceC0769ygMinusKey == c0233ek) {
                    return interfaceC0750xo2;
                }
                C0372jo c0372jo = C0372jo.f1071c;
                InterfaceC0749xn interfaceC0749xn = (InterfaceC0749xn) interfaceC0769ygMinusKey.get(c0372jo);
                if (interfaceC0749xn == null) {
                    c0633tf = new C0633tf(interfaceC0769ygMinusKey, interfaceC0750xo2);
                } else {
                    InterfaceC0769yg interfaceC0769ygMinusKey2 = interfaceC0769ygMinusKey.minusKey(c0372jo);
                    if (interfaceC0769ygMinusKey2 == c0233ek) {
                        return new C0633tf(interfaceC0750xo2, interfaceC0749xn);
                    }
                    c0633tf = new C0633tf(new C0633tf(interfaceC0769ygMinusKey2, interfaceC0750xo2), interfaceC0749xn);
                }
                return c0633tf;
            case 2:
                InterfaceC0750xo interfaceC0750xo3 = (InterfaceC0750xo) obj2;
                if (!(interfaceC0750xo3 instanceof InterfaceC0280gd)) {
                    return obj;
                }
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC0750xo3 : Integer.valueOf(iIntValue + 1);
            case 3:
                InterfaceC0280gd interfaceC0280gd = (InterfaceC0280gd) obj;
                InterfaceC0750xo interfaceC0750xo4 = (InterfaceC0750xo) obj2;
                if (interfaceC0280gd != null) {
                    return interfaceC0280gd;
                }
                if (!(interfaceC0750xo4 instanceof InterfaceC0280gd)) {
                    interfaceC0750xo4 = null;
                }
                return (InterfaceC0280gd) interfaceC0750xo4;
            case 4:
                return (C0161bt) obj;
            default:
                return (C0161bt) obj;
        }
    }
}
