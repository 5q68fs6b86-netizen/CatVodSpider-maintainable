package com.github.catvod.spider.support.p002A0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.jo */
/* JADX INFO: loaded from: classes.dex */
public final class C0372jo implements InterfaceC0751xp, InterfaceC0394kj, InterfaceC0393ki, InterfaceC0656ub, CookieJar, aar, aah, InterfaceC0144bc {

    /* JADX INFO: renamed from: a */
    public static final C0372jo f1069a = new C0372jo(0);

    /* JADX INFO: renamed from: b */
    public static final C0372jo f1070b = new C0372jo(1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C0372jo f1071c = new C0372jo(2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ C0372jo f1072d = new C0372jo(3);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ C0372jo f1073e = new C0372jo(4);

    /* JADX INFO: renamed from: f */
    public static final C0372jo f1074f = new C0372jo(5);

    /* JADX INFO: renamed from: g */
    public static final C0372jo f1075g = new C0372jo(6);

    /* JADX INFO: renamed from: h */
    public static final C0372jo f1076h = new C0372jo(7);

    /* JADX INFO: renamed from: i */
    public static final C0372jo f1077i = new C0372jo(8);

    /* JADX INFO: renamed from: j */
    public static volatile C0372jo f1078j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f1079k;

    public /* synthetic */ C0372jo(int i) {
        this.f1079k = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0393ki
    /* JADX INFO: renamed from: l */
    public int mo1337l(char[] cArr, int i) {
        switch (this.f1079k) {
            case 9:
                return cArr[i];
            default:
                return (cArr[i + 1] << 16) | cArr[i];
        }
    }

    public List loadForRequest(HttpUrl httpUrl) {
        List list = (List) AbstractC0771yi.f1833c.get(httpUrl.host());
        return list != null ? list : new ArrayList();
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0656ub
    /* JADX INFO: renamed from: m */
    public Object mo1338m() {
        switch (this.f1079k) {
            case 11:
                return new TreeSet();
            case 12:
                return new LinkedHashSet();
            case 13:
                return new ArrayDeque();
            case 14:
                return new ArrayList();
            case 15:
                return new ConcurrentSkipListMap();
            case 16:
                return new ConcurrentHashMap();
            case 17:
                return new TreeMap();
            case 18:
                return new LinkedHashMap();
            default:
                return new C0463my(true);
        }
    }

    /* JADX INFO: renamed from: n */
    public C0642to m1339n(aam aamVar, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        C0642to c0642to = new C0642to();
        c0642to.f1546c = -1;
        c0642to.f1550g = -1;
        c0642to.f1548e = aamVar;
        c0642to.f1544a = i;
        c0642to.f1547d = i2;
        c0642to.f1551h = i3;
        c0642to.f1552i = i4;
        Object obj = aamVar.f447a;
        if (obj != null) {
            c0642to.f1545b = ((C0270fu) ((abh) ((InterfaceC0358ja) obj)).f1571r).f840c;
            c0642to.f1546c = ((C0270fu) ((abh) ((InterfaceC0358ja) obj)).f1571r).f841d;
        }
        c0642to.f1545b = i5;
        c0642to.f1546c = i6;
        if (str != null) {
            c0642to.f1549f = str;
        }
        return c0642to;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0394kj
    /* JADX INFO: renamed from: o */
    public int mo1340o() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0394kj
    /* JADX INFO: renamed from: p */
    public void mo1341p() {
    }

    public void saveFromResponse(HttpUrl httpUrl, List list) {
        AbstractC0771yi.f1833c.put(httpUrl.host(), list);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0393ki
    public int size() {
        switch (this.f1079k) {
            case 9:
                return 1;
            default:
                return 2;
        }
    }

    public String toString() {
        switch (this.f1079k) {
            case 8:
                return "kotlin.Unit";
            default:
                return super.toString();
        }
    }
}
