package com.github.catvod.spider.support.p044FM.p047C;

import com.github.catvod.spider.support.p044FM.p050F.AbstractC1319b;
import com.github.catvod.spider.support.p044FM.p050F.C1318a;
import com.github.catvod.spider.support.p044FM.p050F.C1321d;
import com.github.catvod.spider.support.p044FM.p050F.C1322e;
import com.github.catvod.spider.support.p044FM.p050F.C1323f;
import com.github.catvod.spider.support.p044FM.p050F.C1324g;
import com.github.catvod.spider.support.p044FM.p050F.C1326i;
import com.github.catvod.spider.support.p044FM.p050F.C1327j;
import com.github.catvod.spider.support.p044FM.p050F.C1328k;
import com.github.catvod.spider.support.p044FM.p050F.C1329l;
import com.github.catvod.spider.support.p044FM.p050F.EnumC1325h;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.C.g */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1304g {

    /* JADX INFO: renamed from: a */
    public static final C1318a f3026a;

    /* JADX INFO: renamed from: b */
    public static final C1318a f3027b;

    static {
        C1323f c1323f = new C1323f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        AbstractC1319b[] abstractC1319bArr = {new C1323f(C1321d.m3313i())};
        AbstractC1319b[] abstractC1319bArr2 = new AbstractC1319b[2];
        abstractC1319bArr2[0] = c1323f;
        System.arraycopy(abstractC1319bArr, 0, abstractC1319bArr2, 1, 1);
        C1318a c1318a = new C1318a(abstractC1319bArr2);
        AbstractC1319b[] abstractC1319bArr3 = {new C1322e()};
        AbstractC1319b[] abstractC1319bArr4 = new AbstractC1319b[2];
        abstractC1319bArr4[0] = c1318a;
        System.arraycopy(abstractC1319bArr3, 0, abstractC1319bArr4, 1, 1);
        new C1318a(abstractC1319bArr4);
        new C1318a(new C1323f(new String[]{"'", "\\'"}, new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new C1323f(C1321d.m3313i()), new C1322e());
        f3026a = new C1318a(new C1323f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new C1323f(C1321d.m3313i()), new C1322e());
        new C1318a(new C1323f(C1321d.m3307c()), new C1323f(C1321d.m3305a()));
        new C1318a(new C1323f(C1321d.m3307c()), new C1323f(C1321d.m3305a()), new C1323f(new String[]{"\u0000", ""}, new String[]{"\u0001", ""}, new String[]{"\u0002", ""}, new String[]{"\u0003", ""}, new String[]{"\u0004", ""}, new String[]{"\u0005", ""}, new String[]{"\u0006", ""}, new String[]{"\u0007", ""}, new String[]{"\b", ""}, new String[]{"\u000b", ""}, new String[]{"\f", ""}, new String[]{"\u000e", ""}, new String[]{"\u000f", ""}, new String[]{"\u0010", ""}, new String[]{"\u0011", ""}, new String[]{"\u0012", ""}, new String[]{"\u0013", ""}, new String[]{"\u0014", ""}, new String[]{"\u0015", ""}, new String[]{"\u0016", ""}, new String[]{"\u0017", ""}, new String[]{"\u0018", ""}, new String[]{"\u0019", ""}, new String[]{"\u001a", ""}, new String[]{"\u001b", ""}, new String[]{"\u001c", ""}, new String[]{"\u001d", ""}, new String[]{"\u001e", ""}, new String[]{"\u001f", ""}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), C1324g.m3316c(127, 132), C1324g.m3316c(134, 159), new C1329l());
        new C1318a(new C1323f(C1321d.m3307c()), new C1323f(C1321d.m3305a()), new C1323f(new String[]{"\u0000", ""}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), C1324g.m3316c(1, 8), C1324g.m3316c(14, 31), C1324g.m3316c(127, 132), C1324g.m3316c(134, 159), new C1329l());
        new C1318a(new C1323f(C1321d.m3307c()), new C1323f(C1321d.m3311g()));
        new C1318a(new C1323f(C1321d.m3307c()), new C1323f(C1321d.m3311g()), new C1323f(C1321d.m3309e()));
        f3027b = new C1318a(new C1327j(), new C1328k(), new C1323f(C1321d.m3314j()), new C1323f(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""}));
        new C1318a(new C1323f(C1321d.m3308d()), new C1323f(C1321d.m3312h()), new C1326i(new EnumC1325h[0]));
        new C1318a(new C1323f(C1321d.m3308d()), new C1323f(C1321d.m3312h()), new C1323f(C1321d.m3310f()), new C1326i(new EnumC1325h[0]));
        new C1318a(new C1323f(C1321d.m3308d()), new C1323f(C1321d.m3306b()), new C1326i(new EnumC1325h[0]));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public static final String m3246a(String str) {
        C1318a c1318a = f3026a;
        c1318a.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iMo3245a = c1318a.mo3245a(str, iCharCount, stringWriter);
                if (iMo3245a == 0) {
                    char cCharAt = str.charAt(iCharCount);
                    stringWriter.write(cCharAt);
                    iCharCount++;
                    if (Character.isHighSurrogate(cCharAt) && iCharCount < length) {
                        char cCharAt2 = str.charAt(iCharCount);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            stringWriter.write(cCharAt2);
                            iCharCount++;
                        }
                    }
                } else {
                    for (int i = 0; i < iMo3245a; i++) {
                        iCharCount += Character.charCount(Character.codePointAt(str, iCharCount));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
