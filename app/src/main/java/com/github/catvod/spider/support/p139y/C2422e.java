package com.github.catvod.spider.support.p139y;

import com.github.catvod.spider.support.p010B.AbstractC0948b;
import com.github.catvod.spider.support.p010B.C0947a;
import com.github.catvod.spider.support.p010B.C0950d;
import com.github.catvod.spider.support.p010B.C0951e;
import com.github.catvod.spider.support.p010B.C0952f;
import com.github.catvod.spider.support.p010B.C0953g;
import com.github.catvod.spider.support.p010B.C0954h;
import com.github.catvod.spider.support.p010B.C0955i;
import com.github.catvod.spider.support.p010B.C0956j;
import com.github.catvod.spider.support.p010B.C0957k;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.github.catvod.spider.support.y.e */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C2422e {

    /* JADX INFO: renamed from: a */
    public static final C0947a f5975a;

    /* JADX INFO: renamed from: b */
    public static final C0947a f5976b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.y.e$a */
    static class a extends AbstractC0948b {

        /* JADX INFO: renamed from: b */
        private static final String f5977b = String.valueOf('\"');

        /* JADX INFO: renamed from: c */
        private static final char[] f5978c = {',', '\"', '\r', '\n'};

        @Override // com.github.catvod.spider.support.p010B.AbstractC0948b
        /* JADX INFO: renamed from: a */
        public final int mo2317a(CharSequence charSequence, int i, Writer writer) throws IOException {
            boolean z;
            if (i != 0) {
                throw new IllegalStateException("CsvEscaper should never reach the [1] index");
            }
            String string = charSequence.toString();
            char[] cArr = f5978c;
            int i2 = C2423f.f5981a;
            if (string == null || cArr == null) {
                z = true;
            } else {
                int length = string.length();
                int i3 = length - 1;
                int length2 = cArr.length;
                int i4 = length2 - 1;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        char cCharAt = string.charAt(i5);
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length2) {
                                i5++;
                            } else if (cArr[i6] != cCharAt || (Character.isHighSurrogate(cCharAt) && i6 != i4 && (i5 >= i3 || cArr[i6 + 1] != string.charAt(i5 + 1)))) {
                                i6++;
                            } else {
                                z = false;
                            }
                        }
                    } else {
                        z = true;
                    }
                }
            }
            if (z) {
                writer.write(charSequence.toString());
            } else {
                writer.write(34);
                String string2 = charSequence.toString();
                String str = f5977b;
                writer.write(C2423f.m6444h(string2, str, str + str));
                writer.write(34);
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.y.e$b */
    static class b extends AbstractC0948b {

        /* JADX INFO: renamed from: b */
        private static final String f5979b = String.valueOf('\"');

        /* JADX INFO: renamed from: c */
        private static final char[] f5980c = {',', '\"', '\r', '\n'};

        /* JADX WARN: Code duplicated, block: B:34:0x0073  */
        /* JADX WARN: Code duplicated, block: B:37:0x008c  */
        @Override // com.github.catvod.spider.support.p010B.AbstractC0948b
        /* JADX INFO: renamed from: a */
        public final int mo2317a(CharSequence charSequence, int i, Writer writer) throws IOException {
            String string;
            if (i != 0) {
                throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
            }
            if (charSequence.charAt(0) == '\"') {
                boolean z = true;
                if (charSequence.charAt(charSequence.length() - 1) != '\"') {
                    string = charSequence.toString();
                } else {
                    String string2 = charSequence.subSequence(1, charSequence.length() - 1).toString();
                    char[] cArr = f5980c;
                    if (C2423f.m6439c(string2)) {
                        z = false;
                        break;
                    }
                    if ((cArr == null ? 0 : Array.getLength(cArr)) == 0) {
                        z = false;
                        break;
                    }
                    int length = string2.length();
                    int length2 = cArr.length;
                    int i2 = length - 1;
                    int i3 = length2 - 1;
                    int i4 = 0;
                    loop0: while (true) {
                        if (i4 >= length) {
                            z = false;
                            break;
                        }
                        char cCharAt = string2.charAt(i4);
                        for (int i5 = 0; i5 < length2; i5++) {
                            if (cArr[i5] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i5 == i3 || (i4 < i2 && cArr[i5 + 1] == string2.charAt(i4 + 1)))) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    if (z) {
                        StringBuilder sb = new StringBuilder();
                        String str = f5979b;
                        sb.append(str);
                        sb.append(str);
                        string = C2423f.m6444h(string2, sb.toString(), str);
                    } else {
                        string = charSequence.toString();
                    }
                }
            } else {
                string = charSequence.toString();
            }
            writer.write(string);
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    static {
        C0952f c0952f = new C0952f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        AbstractC0948b[] abstractC0948bArr = {new C0952f(C0950d.m2327i())};
        AbstractC0948b[] abstractC0948bArr2 = new AbstractC0948b[2];
        abstractC0948bArr2[0] = c0952f;
        System.arraycopy(abstractC0948bArr, 0, abstractC0948bArr2, 1, 1);
        C0947a c0947a = new C0947a(abstractC0948bArr2);
        AbstractC0948b[] abstractC0948bArr3 = {new C0951e()};
        AbstractC0948b[] abstractC0948bArr4 = new AbstractC0948b[2];
        abstractC0948bArr4[0] = c0947a;
        System.arraycopy(abstractC0948bArr3, 0, abstractC0948bArr4, 1, 1);
        new C0947a(abstractC0948bArr4);
        new C0947a(new C0952f(new String[]{"'", "\\'"}, new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new C0952f(C0950d.m2327i()), new C0951e());
        f5975a = new C0947a(new C0952f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new C0952f(C0950d.m2327i()), new C0951e());
        new C0947a(new C0952f(C0950d.m2321c()), new C0952f(C0950d.m2319a()));
        new C0947a(new C0952f(C0950d.m2321c()), new C0952f(C0950d.m2319a()), new C0952f(new String[]{"\u0000", ""}, new String[]{"\u0001", ""}, new String[]{"\u0002", ""}, new String[]{"\u0003", ""}, new String[]{"\u0004", ""}, new String[]{"\u0005", ""}, new String[]{"\u0006", ""}, new String[]{"\u0007", ""}, new String[]{"\b", ""}, new String[]{"\u000b", ""}, new String[]{"\f", ""}, new String[]{"\u000e", ""}, new String[]{"\u000f", ""}, new String[]{"\u0010", ""}, new String[]{"\u0011", ""}, new String[]{"\u0012", ""}, new String[]{"\u0013", ""}, new String[]{"\u0014", ""}, new String[]{"\u0015", ""}, new String[]{"\u0016", ""}, new String[]{"\u0017", ""}, new String[]{"\u0018", ""}, new String[]{"\u0019", ""}, new String[]{"\u001a", ""}, new String[]{"\u001b", ""}, new String[]{"\u001c", ""}, new String[]{"\u001d", ""}, new String[]{"\u001e", ""}, new String[]{"\u001f", ""}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), C0953g.m2330c(127, 132), C0953g.m2330c(134, 159), new C0957k());
        new C0947a(new C0952f(C0950d.m2321c()), new C0952f(C0950d.m2319a()), new C0952f(new String[]{"\u0000", ""}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), C0953g.m2330c(1, 8), C0953g.m2330c(14, 31), C0953g.m2330c(127, 132), C0953g.m2330c(134, 159), new C0957k());
        new C0947a(new C0952f(C0950d.m2321c()), new C0952f(C0950d.m2325g()));
        new C0947a(new C0952f(C0950d.m2321c()), new C0952f(C0950d.m2325g()), new C0952f(C0950d.m2323e()));
        f5976b = new C0947a(new C0955i(), new C0956j(), new C0952f(C0950d.m2328j()), new C0952f(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""}));
        new C0947a(new C0952f(C0950d.m2322d()), new C0952f(C0950d.m2326h()), new C0954h(new C0954h.a[0]));
        new C0947a(new C0952f(C0950d.m2322d()), new C0952f(C0950d.m2326h()), new C0952f(C0950d.m2324f()), new C0954h(new C0954h.a[0]));
        new C0947a(new C0952f(C0950d.m2322d()), new C0952f(C0950d.m2320b()), new C0954h(new C0954h.a[0]));
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
    public static final String m6436a(String str) {
        C0947a c0947a = f5975a;
        c0947a.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iMo2317a = c0947a.mo2317a(str, iCharCount, stringWriter);
                if (iMo2317a == 0) {
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
                    for (int i = 0; i < iMo2317a; i++) {
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
