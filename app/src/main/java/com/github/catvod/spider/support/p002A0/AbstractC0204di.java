package com.github.catvod.spider.support.p002A0;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.di */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0204di {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f733a = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: b */
    public static boolean m1124b(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0205  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e6  */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x0205, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x01e6, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public static Date m1125c(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i;
        int i2;
        int iM1126d;
        int iM1126d2;
        int length;
        char cCharAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iM1126d3 = m1126d(str, index, i3);
            if (m1124b(str, i3, '-')) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iM1126d4 = m1126d(str, i3, i4);
            if (m1124b(str, i4, '-')) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iM1126d5 = m1126d(str, i4, i5);
            boolean zM1124b = m1124b(str, i5, 'T');
            if (!zM1124b && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM1126d3, iM1126d4 - 1, iM1126d5);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zM1124b) {
                int i6 = i4 + 5;
                int iM1126d6 = m1126d(str, i4 + 3, i6);
                if (m1124b(str, i6, ':')) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                int iM1126d7 = m1126d(str, i6, i7);
                if (m1124b(str, i7, ':')) {
                    i7 = i6 + 3;
                }
                if (str.length() <= i7 || (cCharAt = str.charAt(i7)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i2 = iM1126d7;
                    iM1126d = 0;
                    iM1126d2 = 0;
                    i5 = i7;
                    i = iM1126d6;
                } else {
                    int i8 = i7 + 2;
                    iM1126d2 = m1126d(str, i7, i8);
                    if (iM1126d2 > 59 && iM1126d2 < 63) {
                        iM1126d2 = 59;
                    }
                    if (m1124b(str, i8, '.')) {
                        int i9 = i7 + 3;
                        int i10 = i7 + 4;
                        while (true) {
                            if (i10 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt2 = str.charAt(i10);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                                i10++;
                            }
                            length2 = i10;
                            break;
                        }
                        int iMin = Math.min(length2, i7 + 6);
                        iM1126d = m1126d(str, i9, iMin);
                        int i11 = iMin - i9;
                        if (i11 == 1) {
                            iM1126d *= 100;
                        } else if (i11 == 2) {
                            iM1126d *= 10;
                        }
                        i = iM1126d6;
                        i5 = length2;
                        i2 = iM1126d7;
                    } else {
                        i = iM1126d6;
                        i5 = i8;
                        i2 = iM1126d7;
                        iM1126d = 0;
                    }
                }
            } else {
                i = 0;
                i2 = 0;
                iM1126d = 0;
                iM1126d2 = 0;
            }
            if (str.length() <= i5) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt3 = str.charAt(i5);
            TimeZone timeZone = f733a;
            if (cCharAt3 == 'Z') {
                length = i5 + 1;
            } else {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                }
                String strSubstring = str.substring(i5);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i5 + strSubstring.length();
                if (!strSubstring.equals("+0000") && !strSubstring.equals("+00:00")) {
                    String str3 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str3);
                    String id = timeZone.getID();
                    if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iM1126d3);
            gregorianCalendar2.set(2, iM1126d4 - 1);
            gregorianCalendar2.set(5, iM1126d5);
            gregorianCalendar2.set(11, i);
            gregorianCalendar2.set(12, i2);
            gregorianCalendar2.set(13, iM1126d2);
            gregorianCalendar2.set(14, iM1126d);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e) {
            e = e;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m1126d(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
