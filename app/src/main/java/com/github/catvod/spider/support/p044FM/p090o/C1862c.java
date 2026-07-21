package com.github.catvod.spider.support.p044FM.p090o;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p073b.C1747r;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.c */
/* JADX INFO: loaded from: classes.dex */
final class C1862c implements InterfaceC1861b {

    /* JADX INFO: renamed from: a */
    private final String f4278a;

    /* JADX INFO: renamed from: b */
    private final HashMap<String, File> f4279b = new HashMap<>();

    C1862c(String str) {
        this.f4278a = str;
    }

    @Override // com.github.catvod.spider.support.p044FM.p090o.InterfaceC1861b
    /* JADX INFO: renamed from: a */
    public final Uri mo4504a(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry<String, File> entry = null;
            for (Map.Entry<String, File> entry2 : this.f4279b.entrySet()) {
                String path = entry2.getValue().getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(C1747r.m4094b(new byte[]{-109, -80, 71, 51, -88, -41, -79, -84, -70, -15, 72, 54, -93, -41, -79, -69, -70, -65, 72, 54, -86, -58, -29, -67, -79, -15, 92, 48, -94, -57, -79, -84, -67, -80, 90, 127, -82, -36, -1, -84, -76, -72, 64, 44, -19}, new byte[]{-43, -47, 46, 95, -51, -77, -111, -40}, new StringBuilder(), canonicalPath));
            }
            String path2 = entry.getValue().getPath();
            boolean zEndsWith = path2.endsWith("/");
            int length = path2.length();
            if (!zEndsWith) {
                length++;
            }
            return new Uri.Builder().scheme("content").authority(this.f4278a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m4505b(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        try {
            this.f4279b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }
}
