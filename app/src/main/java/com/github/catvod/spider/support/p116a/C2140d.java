package com.github.catvod.spider.support.p116a;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p116a.d */
/* JADX INFO: loaded from: classes.dex */
final class C2140d implements FileFilter {
    C2140d() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
