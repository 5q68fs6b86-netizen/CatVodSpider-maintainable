package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.mo */
/* JADX INFO: loaded from: classes.dex */
public final class C0453mo extends AbstractC0457ms {

    /* JADX INFO: renamed from: c */
    public final int f1238c;

    /* JADX INFO: renamed from: d */
    public final Locale f1239d;

    /* JADX INFO: renamed from: e */
    public final HashMap f1240e;

    public C0453mo(int i, Calendar calendar, Locale locale) {
        this.f1238c = i;
        this.f1239d = AbstractC0134at.m1018a(locale);
        StringBuilder sb = new StringBuilder();
        sb.append("((?iu)");
        HashMap map = new HashMap();
        Locale localeM1018a = AbstractC0134at.m1018a(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, localeM1018a);
        TreeSet treeSet = new TreeSet(abe.f477b);
        for (Object __en : displayNames.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            String lowerCase = entry.getKey().toLowerCase(localeM1018a);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            abe.m914z(sb, (String) it.next());
            sb.append('|');
        }
        this.f1240e = map;
        sb.setLength(sb.length() - 1);
        sb.append(")");
        this.f1253g = Pattern.compile(sb.toString());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0457ms
    /* JADX INFO: renamed from: f */
    public final void mo1215f(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.f1239d);
        HashMap map = this.f1240e;
        Integer num = (Integer) map.get(lowerCase);
        if (num == null) {
            num = (Integer) map.get(lowerCase + '.');
        }
        calendar.set(this.f1238c, num.intValue());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0457ms
    public final String toString() {
        return "CaseInsensitiveTextStrategy [field=" + this.f1238c + ", locale=" + this.f1239d + ", lKeyValues=" + this.f1240e + ", pattern=" + this.f1253g + "]";
    }
}
