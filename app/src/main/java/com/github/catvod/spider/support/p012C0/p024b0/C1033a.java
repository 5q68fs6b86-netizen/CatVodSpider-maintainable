package com.github.catvod.spider.support.p012C0.p024b0;

import java.util.Stack;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.b0.a */
/* JADX INFO: loaded from: classes.dex */
final class C1033a extends ThreadLocal<Stack<StringBuilder>> {
    C1033a() {
    }

    @Override // java.lang.ThreadLocal
    protected final Stack<StringBuilder> initialValue() {
        return new Stack<>();
    }
}
