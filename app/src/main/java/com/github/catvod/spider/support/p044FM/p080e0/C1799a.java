package com.github.catvod.spider.support.p044FM.p080e0;

import java.io.PrintStream;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.e0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1799a extends Exception {

    /* JADX INFO: renamed from: a */
    protected Throwable f4053a;

    public C1799a(String str) {
        super(str);
    }

    public C1799a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        stringBuffer.append("");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("caused by: ");
        stringBuffer2.append(th);
        stringBuffer.append(stringBuffer2.toString());
        super(stringBuffer.toString());
        this.f4053a = th;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        if (this.f4053a == null) {
            super.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getMessage());
            stringBuffer.append("; nested exception is:");
            printStream.println(stringBuffer.toString());
            this.f4053a.printStackTrace();
        }
    }
}
