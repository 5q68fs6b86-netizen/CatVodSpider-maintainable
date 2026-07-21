package com.github.catvod.spider.support.p002A0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.bl */
/* JADX INFO: loaded from: classes.dex */
public final class C0153bl {

    /* JADX INFO: renamed from: a */
    public final Pattern f687a = Pattern.compile("url\\((.*?)\\)", 40);

    /* JADX INFO: renamed from: b */
    public final Pattern f688b = Pattern.compile(":eq|:lt|:gt|:first|:last|:not|:even|:odd|:has|:contains|:matches|:empty|^body$|^#");

    /* JADX INFO: renamed from: c */
    public final Pattern f689c = Pattern.compile("(url|src|href|-original|-src|-play|-url|style)$|^(data-|url-|src-)", 10);

    /* JADX INFO: renamed from: d */
    public final Pattern f690d = Pattern.compile("^(ftp|magnet|thunder|ws):", 10);

    /* JADX INFO: renamed from: e */
    public final C0598ry f691e = new C0598ry();

    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9 A[LOOP:1: B:40:0x00f3->B:42:0x00f9, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static C0589rp m1055f(C0235em c0235em, String str, C0589rp c0589rp) {
        String str2;
        int i;
        C0589rp c0589rpM1644e;
        Iterator<E> it;
        int size;
        ArrayList arrayList = null;
        if (str.contains(":eq")) {
            str2 = str.split(":")[0];
            String str3 = str.split(":")[1];
            if (str2.contains("--")) {
                String[] strArrSplit = str2.split("--");
                ArrayList arrayList2 = new ArrayList(Arrays.asList(strArrSplit));
                arrayList2.remove(0);
                str2 = strArrSplit[0];
                arrayList = arrayList2;
            } else if (str3.contains("--")) {
                String[] strArrSplit2 = str3.split("--");
                arrayList = new ArrayList(Arrays.asList(strArrSplit2));
                arrayList.remove(0);
                str3 = strArrSplit2[0];
            }
            try {
                i = Integer.parseInt(str3.replace("eq(", "").replace(")", ""));
            } catch (Exception unused) {
                i = 0;
            }
            if (c0589rp.isEmpty()) {
                c0589rpM1644e = c0235em.m1166ah(str2);
            } else {
                c0589rpM1644e = c0589rp.m1644e(str2);
            }
            if (str.contains(":eq")) {
                if (i < 0) {
                    size = c0589rpM1644e.size() + i;
                    if (c0589rpM1644e.size() > size) {
                        c0589rpM1644e = new C0589rp((C0226ed) c0589rpM1644e.get(size));
                    } else {
                        c0589rpM1644e = new C0589rp();
                    }
                } else if (c0589rpM1644e.size() > i) {
                    c0589rpM1644e = new C0589rp((C0226ed) c0589rpM1644e.get(i));
                } else {
                    c0589rpM1644e = new C0589rp();
                }
            }
            if (arrayList != null && !c0589rpM1644e.isEmpty()) {
                c0589rpM1644e = c0589rpM1644e.clone();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    it = c0589rpM1644e.m1644e((String) arrayList.get(i2)).iterator();
                    while (it.hasNext()) {
                        ((C0226ed) it.next()).m1234ba();
                    }
                }
            }
            return c0589rpM1644e;
        }
        if (str.contains("--")) {
            String[] strArrSplit3 = str.split("--");
            arrayList = new ArrayList(Arrays.asList(strArrSplit3));
            arrayList.remove(0);
            str2 = strArrSplit3[0];
        } else {
            str2 = str;
        }
        i = 0;
        if (c0589rp.isEmpty()) {
            c0589rpM1644e = c0235em.m1166ah(str2);
        } else {
            c0589rpM1644e = c0589rp.m1644e(str2);
        }
        if (str.contains(":eq")) {
            if (i < 0) {
                size = c0589rpM1644e.size() + i;
                if (c0589rpM1644e.size() > size) {
                    c0589rpM1644e = new C0589rp((C0226ed) c0589rpM1644e.get(size));
                } else {
                    c0589rpM1644e = new C0589rp();
                }
            } else if (c0589rpM1644e.size() > i) {
                c0589rpM1644e = new C0589rp((C0226ed) c0589rpM1644e.get(i));
            } else {
                c0589rpM1644e = new C0589rp();
            }
        }
        if (arrayList != null) {
            c0589rpM1644e = c0589rpM1644e.clone();
            while (i2 < arrayList.size()) {
                it = c0589rpM1644e.m1644e((String) arrayList.get(i2)).iterator();
                while (it.hasNext()) {
                    ((C0226ed) it.next()).m1234ba();
                }
            }
        }
        return c0589rpM1644e;
    }

    /* JADX INFO: renamed from: g */
    public final String m1056g(String str, String str2, String str3) {
        String str4;
        String strM994b;
        String strJoin = str2;
        C0598ry c0598ry = this.f691e;
        if (!str.equals(c0598ry.f1458a)) {
            c0598ry.f1458a = str;
            c0598ry.f1460c = AbstractC0502oj.m1487a(str);
        }
        C0235em c0235em = c0598ry.f1460c;
        if ("body&&Text".equals(strJoin) || "Text".equals(strJoin)) {
            return c0235em.m1169ak();
        }
        if ("body&&Html".equals(strJoin) || "Html".equals(strJoin)) {
            return c0235em.m1163ae();
        }
        String str5 = "";
        if (strJoin.contains("&&")) {
            String[] strArrSplit = strJoin.split("&&");
            str4 = strArrSplit[strArrSplit.length - 1];
            ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit));
            arrayList.remove(strArrSplit.length - 1);
            strJoin = TextUtils.join("&&", arrayList);
        } else {
            str4 = "";
        }
        String[] strArrSplit2 = m1057h(strJoin, true).split(" ");
        C0589rp c0589rp = new C0589rp();
        for (String str6 : strArrSplit2) {
            c0589rp = m1055f(c0235em, str6, c0589rp);
            if (c0589rp.isEmpty()) {
                return "";
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return c0589rp.m1643d();
        }
        if ("Text".equals(str4)) {
            return c0589rp.m1645f();
        }
        if ("Html".equals(str4)) {
            return c0589rp.m1642c();
        }
        for (String str7 : str4.split("[||]")) {
            String strM1640a = c0589rp.m1640a(str7);
            if (str7.toLowerCase().contains("style") && strM1640a.contains("url(")) {
                Matcher matcher = this.f687a.matcher(strM1640a);
                if (matcher.find()) {
                    strM1640a = matcher.group(1);
                }
                strM1640a = strM1640a.replaceAll("^['|\"](.*)['|\"]$", "$1");
            }
            if (strM1640a.isEmpty() || str3.isEmpty() || !this.f689c.matcher(str7).find() || this.f690d.matcher(strM1640a).find()) {
                str5 = strM1640a;
            } else {
                if (strM1640a.contains("http")) {
                    strM994b = strM1640a.substring(strM1640a.indexOf("http"));
                } else {
                    StringBuilder sb = new StringBuilder();
                    int[] iArrM993a = AbstractC0122ah.m993a(strM1640a);
                    if (iArrM993a[0] != -1) {
                        sb.append(strM1640a);
                        AbstractC0122ah.m994b(sb, iArrM993a[1], iArrM993a[2]);
                        strM994b = sb.toString();
                    } else {
                        int[] iArrM993a2 = AbstractC0122ah.m993a(str3);
                        if (iArrM993a[3] == 0) {
                            sb.append((CharSequence) str3, 0, iArrM993a2[3]);
                            sb.append(strM1640a);
                            strM994b = sb.toString();
                        } else if (iArrM993a[2] == 0) {
                            sb.append((CharSequence) str3, 0, iArrM993a2[2]);
                            sb.append(strM1640a);
                            strM994b = sb.toString();
                        } else {
                            int i = iArrM993a[1];
                            if (i != 0) {
                                int i2 = iArrM993a2[0] + 1;
                                sb.append((CharSequence) str3, 0, i2);
                                sb.append(strM1640a);
                                strM994b = AbstractC0122ah.m994b(sb, iArrM993a[1] + i2, i2 + iArrM993a[2]);
                            } else if (strM1640a.charAt(i) == '/') {
                                sb.append((CharSequence) str3, 0, iArrM993a2[1]);
                                sb.append(strM1640a);
                                int i3 = iArrM993a2[1];
                                strM994b = AbstractC0122ah.m994b(sb, i3, iArrM993a[2] + i3);
                            } else {
                                int i4 = iArrM993a2[0] + 2;
                                int i5 = iArrM993a2[1];
                                if (i4 >= i5 || i5 != iArrM993a2[2]) {
                                    int iLastIndexOf = str3.lastIndexOf(47, iArrM993a2[2] - 1);
                                    int i6 = iLastIndexOf == -1 ? iArrM993a2[1] : iLastIndexOf + 1;
                                    sb.append((CharSequence) str3, 0, i6);
                                    sb.append(strM1640a);
                                    strM994b = AbstractC0122ah.m994b(sb, iArrM993a2[1], i6 + iArrM993a[2]);
                                } else {
                                    sb.append((CharSequence) str3, 0, i5);
                                    sb.append('/');
                                    sb.append(strM1640a);
                                    int i7 = iArrM993a2[1];
                                    strM994b = AbstractC0122ah.m994b(sb, i7, iArrM993a[2] + i7 + 1);
                                }
                            }
                        }
                    }
                }
                str5 = strM994b;
            }
            if (!str5.isEmpty()) {
                return str5;
            }
        }
        return str5;
    }

    /* JADX INFO: renamed from: h */
    public final String m1057h(String str, boolean z) {
        boolean zContains = str.contains("&&");
        Pattern pattern = this.f688b;
        if (!zContains) {
            String[] strArrSplit = str.split(" ");
            return (pattern.matcher(strArrSplit[strArrSplit.length + (-1)]).find() || !z) ? str : str.concat(":eq(0)");
        }
        String[] strArrSplit2 = str.split("&&");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArrSplit2.length; i++) {
            String[] strArrSplit3 = strArrSplit2[i].split(" ");
            if (pattern.matcher(strArrSplit3[strArrSplit3.length - 1]).find()) {
                arrayList.add(strArrSplit2[i]);
            } else if (z || i < strArrSplit2.length - 1) {
                arrayList.add(strArrSplit2[i] + ":eq(0)");
            } else {
                arrayList.add(strArrSplit2[i]);
            }
        }
        return TextUtils.join(" ", arrayList);
    }
}
