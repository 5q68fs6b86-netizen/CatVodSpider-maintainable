package com.github.catvod.spider.support.p003AB.p007m;

/* JADX INFO: loaded from: classes.dex */
public class K$1 implements Comparable<K$1> {

    /* JADX INFO: renamed from: a */
    public String f2035a;

    /* JADX INFO: renamed from: b */
    public String f2036b;

    /* JADX INFO: renamed from: c */
    public String f2037c;

    /* JADX INFO: renamed from: d */
    public String f2038d;

    public K$1(String str, String str2, String str3, String str4) {
        this.f2035a = str;
        this.f2036b = str2;
        this.f2037c = str3;
        this.f2038d = str4;
    }

    @Override // java.lang.Comparable
    public int compareTo(K$1 k$1) {
        if (this.f2035a.equals(this.f2038d)) {
            return -1;
        }
        return k$1.f2035a.equals(this.f2038d) ? 1 : 0;
    }
}
