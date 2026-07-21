package np.protect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: np.protect.⁣⁣⁣⁣⁣⁠⁣⁣⁣⁣⁤⁤⁠⁤⁣⁠⁤⁤, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2656 {

    /* JADX INFO: renamed from: ⁣⁤⁠⁠⁠⁤⁠⁤⁠⁣⁤⁤⁣⁤⁤⁤, reason: not valid java name and contains not printable characters */
    public static boolean f6173 = true;

    /* JADX INFO: renamed from: ⁠⁠⁠⁣⁣⁠⁣⁤⁤⁣⁤⁤⁤, reason: not valid java name and contains not printable characters */
    public static String m6887() {
        int iM6896 = C2657.m6896();
        int i = 1596876;
        while (true) {
            i ^= 1596893;
            switch (i) {
                case 17:
                    if (iM6896 < 0) {
                        i = 1596969;
                    }
                    break;
                case 54:
                    break;
                case 983:
                    int i2 = 1597000;
                    while (true) {
                        i2 ^= 1597017;
                        switch (i2) {
                            case 17:
                                i2 = 1597031;
                                break;
                            case 62:
                                return null;
                        }
                    }
                    break;
                case 1012:
                    return "ۨ۬ۗ";
                default:
                    continue;
            }
            i = 1596938;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ⁠⁠⁠⁣⁣⁤⁣⁤⁣⁠⁣⁤⁤, reason: not valid java name and contains not printable characters */
    public static String m6888(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        int i4 = 0;
        while (true) {
            int i5 = 1597124;
            while (true) {
                i5 ^= 1597141;
                switch (i5) {
                    case 17:
                        i5 = i4 < i2 ? 1597868 : 1597837;
                        break;
                    case 16216:
                        break;
                    case 16249:
                        break;
                    case 16315:
                        break;
                    default:
                        break;
                }
                return new String(cArr);
            }
            short s = sArr[((i + 8) + i4) - 8];
            cArr[i4] = (char) ((s & (i3 ^ (-1))) | ((s ^ (-1)) & i3));
            i4 = 0 - ((0 - i4) - 1);
            int i6 = 1597899;
            while (true) {
                i6 ^= 1597916;
                switch (i6) {
                    case 23:
                        i6 = 1597930;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ⁣⁠⁠⁤⁠⁣⁤⁠⁤⁠, reason: not valid java name and contains not printable characters */
    public static Object m6889(Object obj, Object obj2, Object obj3, Object obj4) {
        int iM6895 = m6895();
        int i = 1598023;
        while (true) {
            i ^= 1598040;
            switch (i) {
                case 31:
                    if (iM6895 >= 0) {
                        i = 1598767;
                    }
                    break;
                case 62:
                    break;
                case 221:
                    int i2 = 1598798;
                    while (true) {
                        i2 ^= 1598815;
                        switch (i2) {
                            case 17:
                                i2 = 1598829;
                                break;
                            case 50:
                                return null;
                        }
                    }
                    break;
                case 1911:
                    return C2648.m6852((Class) obj, (String) obj2, (String) obj3, (String[]) obj4);
                default:
                    continue;
            }
            i = 1598085;
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁠⁤⁣⁠⁤⁣⁠⁠⁠⁣⁣⁣, reason: not valid java name and contains not printable characters */
    public static String m6890(Object obj) {
        int iM6912 = C2659.m6912();
        int i = 1598922;
        while (true) {
            i ^= 1598939;
            switch (i) {
                case 17:
                    if (iM6912 <= 0) {
                        i = 1599015;
                    }
                    break;
                case 50:
                    break;
                case 979:
                    int i2 = 1599046;
                    while (true) {
                        i2 ^= 1599063;
                        switch (i2) {
                            case 17:
                                i2 = 1599728;
                                break;
                            case 3751:
                                return null;
                        }
                    }
                    break;
                case 1020:
                    return ((Field) obj).getName();
                default:
                    continue;
            }
            i = 1598984;
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁤⁤⁣⁠⁣⁣⁤⁤⁣⁠, reason: not valid java name and contains not printable characters */
    public static Throwable m6891(Object obj) {
        int iM6912 = C2659.m6912();
        int i = 1599821;
        while (true) {
            i ^= 1599838;
            switch (i) {
                case 19:
                    if (iM6912 < 0) {
                        i = 1599914;
                    }
                    break;
                case 50:
                    break;
                case 213:
                    int i2 = 1599945;
                    while (true) {
                        i2 ^= 1599962;
                        switch (i2) {
                            case 19:
                                i2 = 1599976;
                                break;
                            case 50:
                                return null;
                        }
                    }
                    break;
                case 244:
                    return ((InvocationTargetException) obj).getTargetException();
                default:
                    continue;
            }
            i = 1599883;
        }
    }

    /* JADX INFO: renamed from: ⁤⁠⁤⁤⁣⁤⁤⁣⁤⁤⁤⁣⁤⁠⁠⁤, reason: not valid java name and contains not printable characters */
    public static String m6892() {
        int iM6912 = C2659.m6912();
        int i = 1600720;
        while (true) {
            i ^= 1600737;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iM6912 <= 0) {
                        i = 1600813;
                    }
                    break;
                case 460:
                    return "ۡ۫ۘ";
                case 495:
                    int i2 = 1600844;
                    while (true) {
                        i2 ^= 1600861;
                        switch (i2) {
                            case 17:
                                i2 = 1600875;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1600782;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁣⁠⁠⁣, reason: not valid java name and contains not printable characters */
    public static Class m6893(Object obj) {
        int iM6883 = C2648.m6883();
        int i = 1600968;
        while (true) {
            i ^= 1600985;
            switch (i) {
                case 17:
                    if (iM6883 < 0) {
                        i = 1601712;
                    }
                    break;
                case 7496:
                    int i2 = 1601743;
                    while (true) {
                        i2 ^= 1601760;
                        switch (i2) {
                            case 14:
                                return null;
                            case 47:
                                i2 = 1601774;
                                break;
                        }
                    }
                    break;
                case 7529:
                    return ((Field) obj).getDeclaringClass();
                case 7595:
                    break;
                default:
                    continue;
            }
            i = 1601681;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁠⁤⁣⁠⁤⁤⁣⁤⁣⁠⁣⁤⁣, reason: not valid java name and contains not printable characters */
    public static String m6894() {
        int iM6883 = C2648.m6883();
        int i = 1601867;
        while (true) {
            i ^= 1601884;
            switch (i) {
                case 23:
                    if (iM6883 <= 0) {
                        i = 1602611;
                    }
                    break;
                case 54:
                    break;
                case 213:
                    int i2 = 1602642;
                    while (true) {
                        i2 ^= 1602659;
                        switch (i2) {
                            case 18:
                                return null;
                            case 49:
                                i2 = 1602673;
                                break;
                        }
                    }
                    break;
                case 1391:
                    return "ۖۧۨ";
                default:
                    continue;
            }
            i = 1601929;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁤⁠⁤⁠, reason: not valid java name and contains not printable characters */
    public static int m6895() {
        int i = 0;
        String str = "ۙۥ۬";
        int i2 = 0;
        int i3 = 0;
        int iM6876 = 0;
        while (true) {
            switch (C2648.m6876((Object) str)) {
                case 1741103:
                    i3 = -1737911;
                    str = "ۧ۟ۨ";
                    break;
                case 1741120:
                    iM6876 = C2648.m6876((Object) "ۖۜۦ");
                    str = "ۜ۠ۡ";
                    break;
                case 1743837:
                    i3 = iM6876 ^ (-1);
                    str = "ۜ۫ۥ";
                    break;
                case 1744182:
                    i2 = i3 & 1737910;
                    str = "ۙۥۛ";
                    break;
                case 1749359:
                    i3 = i | i2;
                    str = "ۢ۬ۚ";
                    break;
                case 1749968:
                    return i3;
                default:
                    i = i3 & iM6876;
                    str = "ۢۘۥ";
                    break;
            }
        }
    }
}
