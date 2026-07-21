package com.github.catvod.spider.support.p002A0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class aag implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    public static final Pattern f431a = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: b */
    public static final String[] f432b = new String[128];

    /* JADX INFO: renamed from: c */
    public static final String[] f433c;

    /* JADX INFO: renamed from: d */
    public final Writer f434d;

    /* JADX INFO: renamed from: e */
    public int[] f435e;

    /* JADX INFO: renamed from: f */
    public int f436f;

    /* JADX INFO: renamed from: g */
    public aba f437g;

    /* JADX INFO: renamed from: h */
    public String f438h;

    /* JADX INFO: renamed from: i */
    public String f439i;

    /* JADX INFO: renamed from: j */
    public boolean f440j;

    /* JADX INFO: renamed from: k */
    public int f441k;

    /* JADX INFO: renamed from: l */
    public boolean f442l;

    /* JADX INFO: renamed from: m */
    public String f443m;

    /* JADX INFO: renamed from: n */
    public boolean f444n;

    static {
        for (int i = 0; i <= 31; i++) {
            f432b[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f432b;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f433c = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public aag(Writer writer) {
        int[] iArr = new int[32];
        this.f435e = iArr;
        this.f436f = 0;
        if (iArr.length == 0) {
            this.f435e = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f435e;
        int i = this.f436f;
        this.f436f = i + 1;
        iArr2[i] = 6;
        this.f441k = 2;
        this.f444n = true;
        Objects.requireNonNull(writer, "out == null");
        this.f434d = writer;
        m894y(aba.f467a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX INFO: renamed from: aa */
    public final void m877aa(String str) throws IOException {
        String str2;
        String[] strArr = this.f442l ? f433c : f432b;
        Writer writer = this.f434d;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    /* JADX INFO: renamed from: ab */
    public void m878ab(double d) throws IOException {
        m883ag();
        if (this.f441k == 1 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m884o();
            this.f434d.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    /* JADX INFO: renamed from: ac */
    public void m879ac(long j) throws IOException {
        m883ag();
        m884o();
        this.f434d.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: ad */
    public void m880ad(Number number) throws IOException {
        if (number == null) {
            m892w();
            return;
        }
        m883ag();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f431a.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (this.f441k != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        m884o();
        this.f434d.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: ae */
    public void m881ae(String str) throws IOException {
        if (str == null) {
            m892w();
            return;
        }
        m883ag();
        m884o();
        m877aa(str);
    }

    /* JADX INFO: renamed from: af */
    public void m882af(boolean z) throws IOException {
        m883ag();
        m884o();
        this.f434d.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: ag */
    public final void m883ag() throws IOException {
        if (this.f443m != null) {
            int iM893x = m893x();
            if (iM893x == 5) {
                this.f434d.write(this.f439i);
            } else if (iM893x != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m891v();
            this.f435e[this.f436f - 1] = 4;
            m877aa(this.f443m);
            this.f443m = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f434d.close();
        int i = this.f436f;
        if (i > 1 || (i == 1 && this.f435e[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f436f = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f436f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f434d.flush();
    }

    /* JADX INFO: renamed from: o */
    public final void m884o() throws IOException {
        int iM893x = m893x();
        if (iM893x == 1) {
            this.f435e[this.f436f - 1] = 2;
            m891v();
            return;
        }
        Writer writer = this.f434d;
        if (iM893x == 2) {
            writer.append((CharSequence) this.f439i);
            m891v();
        } else {
            if (iM893x == 4) {
                writer.append((CharSequence) this.f438h);
                this.f435e[this.f436f - 1] = 5;
                return;
            }
            if (iM893x != 6) {
                if (iM893x != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f441k != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f435e[this.f436f - 1] = 7;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m885p() throws IOException {
        m883ag();
        m884o();
        int i = this.f436f;
        int[] iArr = this.f435e;
        if (i == iArr.length) {
            this.f435e = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f435e;
        int i2 = this.f436f;
        this.f436f = i2 + 1;
        iArr2[i2] = 1;
        this.f434d.write(91);
    }

    /* JADX INFO: renamed from: q */
    public void m886q() throws IOException {
        m883ag();
        m884o();
        int i = this.f436f;
        int[] iArr = this.f435e;
        if (i == iArr.length) {
            this.f435e = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f435e;
        int i2 = this.f436f;
        this.f436f = i2 + 1;
        iArr2[i2] = 3;
        this.f434d.write(123);
    }

    /* JADX INFO: renamed from: r */
    public final void m887r(char c, int i, int i2) throws IOException {
        int iM893x = m893x();
        if (iM893x != i2 && iM893x != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f443m != null) {
            throw new IllegalStateException("Dangling name: " + this.f443m);
        }
        this.f436f--;
        if (iM893x == i2) {
            m891v();
        }
        this.f434d.write(c);
    }

    /* JADX INFO: renamed from: s */
    public void m888s() throws IOException {
        m887r(']', 1, 2);
    }

    /* JADX INFO: renamed from: t */
    public void m889t() throws IOException {
        m887r('}', 3, 5);
    }

    /* JADX INFO: renamed from: u */
    public void m890u(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f443m != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM893x = m893x();
        if (iM893x != 3 && iM893x != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f443m = str;
    }

    /* JADX INFO: renamed from: v */
    public final void m891v() throws IOException {
        if (this.f440j) {
            return;
        }
        String str = this.f437g.f468b;
        Writer writer = this.f434d;
        writer.write(str);
        int i = this.f436f;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f437g.f469c);
        }
    }

    /* JADX INFO: renamed from: w */
    public aag m892w() throws IOException {
        if (this.f443m != null) {
            if (!this.f444n) {
                this.f443m = null;
                return this;
            }
            m883ag();
        }
        m884o();
        this.f434d.write("null");
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final int m893x() {
        int i = this.f436f;
        if (i != 0) {
            return this.f435e[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: y */
    public final void m894y(aba abaVar) {
        Objects.requireNonNull(abaVar);
        this.f437g = abaVar;
        this.f439i = ",";
        if (abaVar.f470d) {
            this.f438h = ": ";
            if (abaVar.f468b.isEmpty()) {
                this.f439i = ", ";
            }
        } else {
            this.f438h = ":";
        }
        this.f440j = this.f437g.f468b.isEmpty() && this.f437g.f469c.isEmpty();
    }

    /* JADX INFO: renamed from: z */
    public final void m895z(int i) {
        if (i == 0) {
            throw null;
        }
        this.f441k = i;
    }
