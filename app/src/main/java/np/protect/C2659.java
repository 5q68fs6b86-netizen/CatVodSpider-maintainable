package np.protect;

import com.google.protobuf.DescriptorProtos;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: np.protect.⁤⁠⁤⁤⁣⁤⁠⁠⁠⁠⁣⁣⁠⁠⁣, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2659 {

    /* JADX INFO: renamed from: ⁤⁠⁤⁠⁠⁠⁣, reason: not valid java name and contains not printable characters */
    public static boolean f6176;

    /* JADX INFO: renamed from: ⁠⁣⁤⁣⁤⁠⁤⁠⁤⁤⁣⁣⁣⁣⁣⁠, reason: not valid java name and contains not printable characters */
    public static String m6911(Object obj) {
        int iM6883 = C2648.m6883();
        int i = 1632681;
        while (true) {
            i ^= 1632698;
            switch (i) {
                case 19:
                    if (iM6883 < 0) {
                        i = 1633425;
                    }
                    break;
                case 1323:
                    return ((Method) obj).getName();
                case 1480:
                    int i2 = 1633456;
                    while (true) {
                        i2 ^= 1633473;
                        switch (i2) {
                            case 14:
                                return null;
                            case 113:
                                i2 = 1633487;
                                break;
                        }
                    }
                    break;
                case 1513:
                    break;
                default:
                    continue;
            }
            i = 1633394;
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁠⁠⁣⁣⁤⁣⁠⁣⁤⁤, reason: not valid java name and contains not printable characters */
    public static int m6912() {
        int i = 0;
        String str = "ۖۥ۠";
        int i2 = 0;
        int i3 = 0;
        int iM6876 = 0;
        while (true) {
            switch (C2648.m6876((Object) str)) {
                case 1738225:
                    iM6876 = C2648.m6876((Object) "ۙ۠۫");
                    str = "۬ۗ۠";
                    break;
                case 1741705:
                    return i3;
                case 1742157:
                    i2 = i3 & (-1740929);
                    str = "ۦ۠۠";
                    break;
                case 1747841:
                    i = i3 & iM6876;
                    str = "ۥۜۦ";
                    break;
                case 1752367:
                    i3 = i | i2;
                    str = "ۚۙۨ";
                    break;
                case 1753446:
                    i3 = 1740928;
                    str = "۠ۥۦ";
                    break;
                default:
                    i3 = iM6876 ^ (-1);
                    str = "ۚۨۛ";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁠⁣⁤⁣⁤⁠⁣⁣⁣⁣⁣⁠, reason: not valid java name and contains not printable characters */
    public static Field[] m6913(Object obj) {
        int iM6905 = C2658.m6905();
        int i = 1633580;
        while (true) {
            i ^= 1633597;
            switch (i) {
                case 17:
                    if (iM6905 <= 0) {
                        i = 1634324;
                    }
                    break;
                case 87:
                    int i2 = 1634355;
                    while (true) {
                        i2 ^= 1634372;
                        switch (i2) {
                            case 22:
                                return null;
                            case 119:
                                i2 = 1634386;
                                break;
                        }
                    }
                    break;
                case 118:
                    break;
                case 7465:
                    return ((Class) obj).getDeclaredFields();
                default:
                    continue;
            }
            i = 1633642;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁤⁤⁠⁤⁠⁠⁣⁤⁣⁤⁣, reason: not valid java name and contains not printable characters */
    public static String m6914(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        int i4 = 0;
        while (true) {
            int i5 = 1634479;
            while (true) {
                i5 ^= 1634496;
                switch (i5) {
                    case 14:
                        break;
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        break;
                    case 111:
                        i5 = i4 < i2 ? 1634572 : 1634541;
                        break;
                    case 460:
                        break;
                    default:
                        break;
                }
                return new String(cArr);
            }
            short s = sArr[i4 - (0 - i)];
            cArr[i4] = (char) ((s & (i3 ^ (-1))) | ((s ^ (-1)) & i3));
            i4 = 1 - (0 - i4);
            int i6 = 1634603;
            while (true) {
                i6 ^= 1634620;
                switch (i6) {
                    case 23:
                        i6 = 1635285;
                        break;
                    case 745:
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ⁣⁤⁠⁠⁠⁣⁣⁤⁤⁣⁠⁣⁣⁣⁣⁤⁤, reason: not valid java name and contains not printable characters */
    public static boolean m6915(Object obj, Object obj2) {
        int iM6895 = C2656.m6895();
        int i = 1635378;
        while (true) {
            i ^= 1635395;
            switch (i) {
                case 18:
                    break;
                case 51:
                    int i2 = 1635502;
                    while (true) {
                        i2 ^= 1635519;
                        switch (i2) {
                            case 17:
                                i2 = 1635533;
                                break;
                            case 114:
                                return false;
                        }
                    }
                    break;
                case 113:
                    if (iM6895 > 0) {
                        i = 1635471;
                    }
                    break;
                case 204:
                    return ((String) obj).equals(obj2);
                default:
                    continue;
            }
            i = 1635440;
        }
    }

    /* JADX INFO: renamed from: ⁤⁠⁤⁠⁠⁠⁠⁣⁣⁤, reason: not valid java name and contains not printable characters */
    public static String m6916() {
        int iM6905 = C2658.m6905();
        int i = 1656458;
        while (true) {
            i ^= 1656475;
            switch (i) {
                case 17:
                    if (iM6905 <= 0) {
                        i = 1656551;
                    }
                    break;
                case 50:
                    break;
                case 83:
                    int i2 = 1656582;
                    while (true) {
                        i2 ^= 1656599;
                        switch (i2) {
                            case 17:
                                i2 = 1656613;
                                break;
                            case 50:
                                return null;
                        }
                    }
                    break;
                case 124:
                    return "ۢ۬ۢ";
                default:
                    continue;
            }
            i = 1656520;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁠⁣⁣⁣⁣⁣⁣⁣⁠, reason: not valid java name and contains not printable characters */
    public static String m6917(Object obj) {
        int iM6895 = C2656.m6895();
        int i = 1656706;
        while (true) {
            i ^= 1656723;
            switch (i) {
                case 17:
                    if (iM6895 > 0) {
                        i = 1657450;
                    }
                    break;
                case 3519:
                    break;
                case 3544:
                    int i2 = 1657481;
                    while (true) {
                        i2 ^= 1657498;
                        switch (i2) {
                            case 19:
                                i2 = 1657512;
                                break;
                            case 50:
                                return null;
                        }
                    }
                    break;
                case 3577:
                    return ((StringBuilder) obj).toString();
                default:
                    continue;
            }
            i = 1657419;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁣⁣⁣⁣⁣⁤⁤⁠⁤⁠, reason: not valid java name and contains not printable characters */
    public static Class m6918(Object obj) {
        int iM6895 = C2656.m6895();
        int i = 1657605;
        while (true) {
            i ^= 1657622;
            switch (i) {
                case 19:
                    if (iM6895 > 0) {
                        i = 1658349;
                    }
                    break;
                case 50:
                    break;
                case 85:
                    int i2 = 1658380;
                    while (true) {
                        i2 ^= 1658397;
                        switch (i2) {
                            case 17:
                                i2 = 1658411;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                case 1787:
                    return ((Method) obj).getReturnType();
                default:
                    continue;
            }
            i = 1657667;
        }
    }
}
