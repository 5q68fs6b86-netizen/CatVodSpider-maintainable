package com.github.catvod.spider.support.p003AB.p009o;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.support.p003AB.p005b.C0854u;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.s */
/* JADX INFO: loaded from: classes.dex */
final class C0938s implements InterfaceC0937r {

    /* JADX INFO: renamed from: a */
    private final String f2219a;

    /* JADX INFO: renamed from: b */
    private final HashMap<String, File> f2220b = new HashMap<>();

    C0938s(String str) {
        this.f2219a = str;
    }

    @Override // com.github.catvod.spider.support.p003AB.p009o.InterfaceC0937r
    /* JADX INFO: renamed from: a */
    public final Uri mo2272a(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry<String, File> entry = null;
            for (Map.Entry<String, File> entry2 : this.f2220b.entrySet()) {
                String path = entry2.getValue().getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(C0854u.m2059b(new byte[]{-51, 74, -82, -45, -82, 48, 15, -14, -28, 11, -95, -42, -91, 48, 15, -27, -28, 69, -95, -42, -84, 33, 93, -29, -17, 11, -75, -48, -92, 32, 15, -14, -29, 74, -77, -97, -88, 59, 65, -14, -22, 66, -87, -52, -21}, new byte[]{-117, 43, -57, -65, -53, 84, 47, -122}, new StringBuilder(), canonicalPath));
            }
            String path2 = entry.getValue().getPath();
            boolean zEndsWith = path2.endsWith("/");
            int length = path2.length();
            if (!zEndsWith) {
                length++;
            }
            return new Uri.Builder().scheme("content").authority(this.f2219a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m2273b(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        try {
            this.f2220b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }
}
