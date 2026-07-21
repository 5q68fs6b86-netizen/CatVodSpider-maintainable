package com.github.catvod.spider.support.p115U;

import java.io.PrintStream;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p115U.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2135a extends Exception {

    /* JADX INFO: renamed from: a */
    protected Throwable f5002a;

    public C2135a(String str) {
        super(str);
    }

    public C2135a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        stringBuffer.append("");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("caused by: ");
        stringBuffer2.append(th);
        stringBuffer.append(stringBuffer2.toString());
        super(stringBuffer.toString());
        this.f5002a = th;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        if (this.f5002a == null) {
            super.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getMessage());
            stringBuffer.append("; nested exception is:");
            printStream.println(stringBuffer.toString());
            this.f5002a.printStackTrace();
        }
    }
}
