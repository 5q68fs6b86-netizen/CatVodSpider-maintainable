package com.github.catvod.spider.support.p001A;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A.l */
/* JADX INFO: loaded from: classes.dex */
public class C0099l {
    /* JADX WARN: Code duplicated, block: B:16:0x0096  */
    public static String format(String str, String str2) {
        String str3;
        if (str == null || TextUtils.isEmpty(str)) {
            return "";
        }
        String strReplace = processDot(str).replace("#", "").replace(Marker.ANY_NON_NULL_MARKER, "");
        Matcher matcher = Pattern.compile("第\\s*(\\d+)\\s*(?:集|话)").matcher(strReplace);
        if (matcher.find()) {
            str3 = String.format("[%04d]", Integer.valueOf(Integer.parseInt(matcher.group(1)))) + strReplace;
        } else {
            int iLastIndexOf = strReplace.lastIndexOf(".");
            if (iLastIndexOf > 0) {
                String strSubstring = strReplace.substring(0, iLastIndexOf);
                if (Pattern.compile("^\\d+$").matcher(strSubstring).matches()) {
                    str3 = String.format("[%04d]", Integer.valueOf(Integer.parseInt(strSubstring))) + strReplace;
                } else {
                    str3 = strReplace;
                }
            } else {
                str3 = strReplace;
            }
        }
        return (str2 == null || TextUtils.isEmpty(str2)) ? str3 : str3 + str2;
    }

    private static String processDot(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return str;
        }
        return str.substring(0, iLastIndexOf).replaceAll("\\.", "·") + "." + str.substring(iLastIndexOf + 1);
    }
}
