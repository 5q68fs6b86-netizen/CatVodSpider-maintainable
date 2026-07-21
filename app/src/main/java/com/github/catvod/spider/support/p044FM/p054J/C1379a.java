package com.github.catvod.spider.support.p044FM.p054J;

import java.util.Stack;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.J.a */
/* JADX INFO: loaded from: classes.dex */
final class C1379a extends ThreadLocal<Stack<StringBuilder>> {
    C1379a() {
    }

    @Override // java.lang.ThreadLocal
    protected final Stack<StringBuilder> initialValue() {
        return new Stack<>();
    }
}
