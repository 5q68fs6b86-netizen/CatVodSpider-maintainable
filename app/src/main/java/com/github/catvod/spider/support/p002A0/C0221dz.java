package com.github.catvod.spider.support.p002A0;

import com.github.catvod.spider.LocalFile;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.dz */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0221dz implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f762a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f762a) {
            case 0:
                return ((String) obj2).length() - ((String) obj).length();
            case 1:
                int i = LocalFile.f217a;
                return ((File) obj).getName().compareTo(((File) obj2).getName());
            default:
                int i2 = LocalFile.f217a;
                return ((File) obj).getName().compareTo(((File) obj2).getName());
        }
    }
}
