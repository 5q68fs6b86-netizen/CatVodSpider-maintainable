package np.protect;

import com.google.protobuf.DescriptorProtos;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: np.protect.ۤۨۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2648 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f6171short = {2606, 2258, 2270, 3144, 3155, 3146, 3146, 2915, 527};

    /* JADX INFO: renamed from: ⁠⁣⁤⁣⁤⁠⁠⁠⁣⁠⁠⁣, reason: not valid java name and contains not printable characters */
    public static boolean f6172 = true;

    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Class m6850(String str) {
        try {
            return m6882(str);
        } catch (Error e) {
            int i = 1740;
            while (true) {
                i ^= 1757;
                switch (i) {
                    case 17:
                        i = 1771;
                        break;
                    case 54:
                        return null;
                }
            }
        } catch (Exception e2) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        return null;
                    case 49:
                        i2 = 1647;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x008a A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0060. Please report as an issue. */
    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6851(Class cls, String str, String str2) {
        Field field;
        int i;
        try {
            try {
                Object objM6906 = C2658.m6906(str, str2, C2659.m6913(cls));
                int i2 = 1864;
                while (true) {
                    i2 ^= 1881;
                    switch (i2) {
                        case 17:
                            i2 = objM6906 == null ? 48736 : 48705;
                            break;
                        case 47384:
                            break;
                        case 47417:
                            objM6906 = C2658.m6906(str, str2, C2660.m6920(cls));
                            break;
                        case 47483:
                            break;
                        default:
                            break;
                    }
                }
                int i3 = 48767;
                while (true) {
                    i3 ^= 48784;
                    switch (i3) {
                        case 14:
                            break;
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            break;
                        case 76:
                            Class clsM6925 = C2660.m6925(cls);
                            int i4 = 48891;
                            while (true) {
                                i4 ^= 48908;
                                switch (i4) {
                                    case 22:
                                        break;
                                    case 53:
                                        break;
                                    case 503:
                                        i4 = clsM6925 != null ? 49635 : 48953;
                                        break;
                                    case 32495:
                                        objM6906 = C2660.m6929(C2660.m6925(cls), str, str2);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            i3 = objM6906 == null ? 48860 : 48829;
                            break;
                        default:
                            break;
                    }
                }
                int i5 = 49666;
                while (true) {
                    i5 ^= 49683;
                    switch (i5) {
                        case 17:
                            i5 = objM6906 != null ? 49759 : 49728;
                            break;
                        case 50:
                            break;
                        case 76:
                            field = (Field) objM6906;
                            break;
                        case 83:
                            field = null;
                            break;
                        default:
                            break;
                    }
                    return field;
                }
            } catch (Error e) {
                field = null;
                i = 49914;
                while (true) {
                    i ^= 49931;
                    switch (i) {
                        case 497:
                            i = 50596;
                            break;
                        case 1711:
                            return field;
                    }
                }
            } catch (Exception e2) {
                int i6 = 50689;
                while (true) {
                    i6 ^= 50706;
                    switch (i6) {
                        case 19:
                            i6 = 50720;
                            continue;
                        case 50:
                            field = null;
                            break;
                        default:
                            continue;
                    }
                }
            }
            C2660.m6927(field, true);
        } catch (Error e3) {
            i = 49914;
            while (true) {
                i ^= 49931;
                switch (i) {
                    case 497:
                        i = 50596;
                        break;
                    case 1711:
                        break;
                }
            }
        } catch (Exception e4) {
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                        break;
                    case 241:
                        i7 = 49821;
                        break;
                }
            }
        }
        return field;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x00ca A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x007d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x0096. Please report as an issue. */
    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6852(Class cls, String str, String str2, String... strArr) {
        Method method;
        int i;
        int i2;
        int i3;
        Method methodM6902 = null;
        int i4 = 50813;
        while (true) {
            i4 ^= 50830;
            switch (i4) {
                case 18:
                    break;
                case 53:
                    int i5 = 0;
                    while (true) {
                        try {
                            try {
                                int length = strArr.length;
                                int i6 = 51588;
                                while (true) {
                                    i6 ^= 51605;
                                    switch (i6) {
                                        case 17:
                                            i6 = i5 < length ? 51681 : 51650;
                                            break;
                                        case 54:
                                            break;
                                        case 87:
                                            methodM6902 = C2658.m6902(C2658.m6900(cls), C2658.m6898(cls), str, str2, strArr);
                                            break;
                                        case 116:
                                            String str3 = strArr[i5];
                                            int i7 = 51712;
                                            while (true) {
                                                i7 ^= 51729;
                                                switch (i7) {
                                                    case 14:
                                                        break;
                                                    case 17:
                                                        i7 = str3 == null ? 51805 : 51774;
                                                        break;
                                                    case 47:
                                                        break;
                                                    case 76:
                                                        int i8 = 51836;
                                                        while (true) {
                                                            i8 ^= 51853;
                                                            switch (i8) {
                                                                case 241:
                                                                    i8 = 52518;
                                                                    break;
                                                                case 1963:
                                                                    return null;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            i5 = 1 - (0 - i5);
                                            int i9 = 52611;
                                            while (true) {
                                                i9 ^= 52628;
                                                switch (i9) {
                                                    case 23:
                                                        i9 = 52642;
                                                        break;
                                                    case 54:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            } catch (Exception e) {
                                try {
                                    methodM6902 = C2658.m6902(C2658.m6900(cls), C2658.m6901(cls), str, str2, strArr);
                                    int i10 = 54533;
                                    while (true) {
                                        i10 ^= 54550;
                                        switch (i10) {
                                            case 19:
                                                i10 = 54564;
                                                continue;
                                            case 50:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                } catch (Exception e2) {
                                    int i11 = 55556;
                                    while (true) {
                                        i11 ^= 55573;
                                        switch (i11) {
                                            case 17:
                                                i11 = 55587;
                                                continue;
                                            case 54:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                }
                            }
                        } catch (Error e3) {
                            method = null;
                            i = 54657;
                            while (true) {
                                i ^= 54674;
                                switch (i) {
                                    case 19:
                                        i = 54688;
                                        continue;
                                        continue;
                                        continue;
                                    case 50:
                                        break;
                                    default:
                                        continue;
                                        continue;
                                        continue;
                                }
                                i2 = 53758;
                                while (true) {
                                    i2 ^= 53775;
                                    switch (i2) {
                                        case 1009:
                                            i2 = 54440;
                                            break;
                                        case 1703:
                                            return method;
                                    }
                                }
                            }
                        }
                    }
                    int i12 = 52735;
                    while (true) {
                        i12 ^= 52752;
                        switch (i12) {
                            case 14:
                                break;
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                method = methodM6902;
                                break;
                            case 1007:
                                i12 = methodM6902 == null ? 53479 : 52797;
                                break;
                            case 7927:
                                try {
                                    Class clsM6925 = C2660.m6925(cls);
                                    int i13 = 53510;
                                    while (true) {
                                        i13 ^= 53527;
                                        switch (i13) {
                                            case 17:
                                                i13 = clsM6925 != null ? 53603 : 53572;
                                                break;
                                            case 50:
                                                break;
                                            case 83:
                                                method = methodM6902;
                                                break;
                                            case 116:
                                                method = (Method) C2656.m6889(C2660.m6925(cls), str, str2, strArr);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } catch (Error e4) {
                                    method = methodM6902;
                                    i = 54657;
                                    while (true) {
                                        i ^= 54674;
                                        switch (i) {
                                            case 19:
                                                i = 54688;
                                                continue;
                                                continue;
                                                continue;
                                            case 50:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                        i2 = 53758;
                                        while (true) {
                                            i2 ^= 53775;
                                            switch (i2) {
                                                case 1009:
                                                    i2 = 54440;
                                                    break;
                                                case 1703:
                                                    return method;
                                            }
                                        }
                                    }
                                } catch (Exception e5) {
                                    method = methodM6902;
                                    i3 = 55432;
                                    while (true) {
                                        i3 ^= 55449;
                                        switch (i3) {
                                            case 17:
                                                i3 = 55463;
                                                continue;
                                                continue;
                                            case 62:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                        }
                                        i2 = 53758;
                                        while (true) {
                                            i2 ^= 53775;
                                            switch (i2) {
                                                case 1009:
                                                    i2 = 54440;
                                                    break;
                                                case 1703:
                                                    return method;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                        i2 = 53758;
                        while (true) {
                            i2 ^= 53775;
                            switch (i2) {
                                case 1009:
                                    i2 = 54440;
                                    break;
                                case 1703:
                                    return method;
                            }
                        }
                    }
                    int i14 = 53634;
                    while (true) {
                        i14 ^= 53651;
                        switch (i14) {
                            case 17:
                                i14 = method != null ? 53727 : 53696;
                                break;
                            case 50:
                                break;
                            case 76:
                                try {
                                    C2660.m6921(method, true);
                                    break;
                                } catch (Error e6) {
                                    i = 54657;
                                    while (true) {
                                        i ^= 54674;
                                        switch (i) {
                                            case 19:
                                                i = 54688;
                                                continue;
                                                continue;
                                                continue;
                                            case 50:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                        }
                                    }
                                } catch (Exception e7) {
                                    i3 = 55432;
                                    while (true) {
                                        i3 ^= 55449;
                                        switch (i3) {
                                            case 17:
                                                i3 = 55463;
                                                continue;
                                                continue;
                                            case 62:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                        }
                                    }
                                }
                                break;
                            case 83:
                                break;
                            default:
                                break;
                        }
                    }
                    i2 = 53758;
                    while (true) {
                        i2 ^= 53775;
                        switch (i2) {
                            case 1009:
                                i2 = 54440;
                                break;
                            case 1703:
                                return method;
                        }
                    }
                    break;
                case 243:
                    if (cls == null) {
                        i4 = 51557;
                    }
                    break;
                case 4075:
                    return null;
                default:
                    continue;
            }
            i4 = 50875;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6853(Object obj) {
        try {
            boolean z = obj instanceof String;
            int i = 55680;
            while (true) {
                i ^= 55697;
                switch (i) {
                    case 17:
                        i = z ? 56424 : 56393;
                        break;
                    case 1467:
                        break;
                    case 1496:
                        Field field = (Field) obj;
                        obj = C2660.m6926(field, C2656.m6893(field));
                        int i2 = 56455;
                        while (true) {
                            i2 ^= 56472;
                            switch (i2) {
                                case 31:
                                    i2 = 56486;
                                    break;
                                case 62:
                                    break;
                            }
                        }
                        break;
                    case 1529:
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            obj = null;
            int i3 = 56579;
            while (true) {
                i3 ^= 56596;
                switch (i3) {
                    case 23:
                        i3 = 56610;
                        break;
                    case 54:
                        break;
                }
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6854(Object obj, Object obj2) {
        try {
            return C2660.m6926((Field) obj, obj2);
        } catch (Exception e) {
            int i = 1507503;
            while (true) {
                i ^= 1507520;
                switch (i) {
                    case 14:
                        return null;
                    case 111:
                        i = 1507534;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0012 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6855(Object obj, Object obj2, Object[] objArr) throws Throwable {
        int i;
        try {
            return C2658.m6899((Method) obj, obj2, objArr);
        } catch (IllegalAccessException e) {
            int i2 = 1507751;
            while (true) {
                i2 ^= 1507768;
                switch (i2) {
                    case 31:
                        i2 = 1508433;
                        continue;
                    case 1513:
                        break;
                    default:
                        continue;
                }
                i = 1507627;
                while (true) {
                    i ^= 1507644;
                    switch (i) {
                        case 23:
                            i = 1507658;
                            break;
                        case 118:
                            return null;
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            i = 1507627;
            while (true) {
                i ^= 1507644;
                switch (i) {
                    case 23:
                        i = 1507658;
                        break;
                    case 118:
                        return null;
                }
            }
        } catch (InvocationTargetException e3) {
            throw C2656.m6891(e3);
        }
    }

    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6856(String str, String str2, String str3) {
        Object objM6929 = null;
        String str4 = "۫ۚۚ";
        Class clsM6919 = null;
        while (true) {
            switch (m6876((Object) str4)) {
                case 1740169:
                    return objM6929;
                case 1754645:
                    objM6929 = C2660.m6929(clsM6919, str2, str3);
                    str4 = "ۘۦۗ";
                    break;
                default:
                    clsM6919 = C2660.m6919(str);
                    str4 = "ۧۨۖ";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6857(String str, String str2, String str3, String... strArr) {
        Object objM6889 = null;
        String str4 = "ۖۢ۬";
        Class clsM6919 = null;
        while (true) {
            switch (m6876((Object) str4)) {
                case 1738144:
                    clsM6919 = C2660.m6919(str);
                    str4 = "۠۠ۨ";
                    break;
                case 1747688:
                    objM6889 = C2656.m6889(clsM6919, str2, str3, strArr);
                    str4 = "ۚۡۢ";
                    break;
                default:
                    return objM6889;
            }
        }
    }

    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6858(String str, String str2, Field[] fieldArr) {
        int i = 0;
        while (true) {
            int length = fieldArr.length;
            int i2 = 1508526;
            while (true) {
                i2 ^= 1508543;
                switch (i2) {
                    case 17:
                        i2 = i < length ? 1508619 : 1508588;
                        break;
                    case 83:
                        int i3 = 1509673;
                        while (true) {
                            i3 ^= 1509690;
                            switch (i3) {
                                case 19:
                                    i3 = 1510355;
                                    break;
                                case 745:
                                    return null;
                            }
                        }
                        break;
                    case 114:
                        break;
                    case 436:
                        break;
                    default:
                        break;
                }
            }
            Field field = fieldArr[i];
            boolean zM6915 = C2659.m6915(C2656.m6890(field), str);
            int i4 = 1508650;
            while (true) {
                i4 ^= 1508667;
                switch (i4) {
                    case 17:
                        i4 = zM6915 ? 1509394 : 1508712;
                        break;
                    case 83:
                        break;
                    case 114:
                        break;
                    case 3369:
                        boolean zM6916 = C2659.m6915(C2658.m6900(C2658.m6908(field)), str2);
                        int i5 = 1509425;
                        while (true) {
                            i5 ^= 1509442;
                            switch (i5) {
                                case 18:
                                    break;
                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    break;
                                case 115:
                                    i5 = zM6916 ? 1509518 : 1509487;
                                    break;
                                case 204:
                                    return field;
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            i = 0 - ((0 - i) - 1);
            int i6 = 1509549;
            while (true) {
                i6 ^= 1509566;
                switch (i6) {
                    case 19:
                        i6 = 1509580;
                        break;
                    case 114:
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0042 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6859(List list, int i) {
        Object objM6926;
        int i2;
        try {
            boolean z = C2658.m6910(list, i) instanceof String;
            int i3 = 1510448;
            while (true) {
                i3 ^= 1510465;
                switch (i3) {
                    case 14:
                        break;
                    case 47:
                        Field field = (Field) C2658.m6910(list, i);
                        objM6926 = C2660.m6926(field, C2656.m6893(field));
                        int i4 = 1510572;
                        while (true) {
                            i4 ^= 1510589;
                            switch (i4) {
                                case 17:
                                    i4 = 1510603;
                                    continue;
                                case 118:
                                    break;
                                default:
                                    continue;
                            }
                            objM6926 = null;
                            i2 = 1511347;
                            while (true) {
                                i2 ^= 1511364;
                                switch (i2) {
                                    case 22:
                                        return objM6926;
                                    case 119:
                                        i2 = 1511378;
                                        break;
                                }
                            }
                        }
                        break;
                    case 113:
                        if (z) {
                            i3 = 1510541;
                        }
                        break;
                    case 204:
                        objM6926 = C2658.m6910(list, i);
                        break;
                    default:
                        continue;
                }
                i3 = 1510510;
            }
        } catch (Exception e) {
            objM6926 = null;
            i2 = 1511347;
            while (true) {
                i2 ^= 1511364;
                switch (i2) {
                    case 22:
                        break;
                    case 119:
                        i2 = 1511378;
                        break;
                }
            }
        }
        return objM6926;
    }

    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6860(List list, int i, Object obj) {
        try {
            return C2660.m6926((Field) C2658.m6910(list, i), obj);
        } catch (Exception e) {
            int i2 = 1511471;
            while (true) {
                i2 ^= 1511488;
                switch (i2) {
                    case 14:
                        return null;
                    case 111:
                        i2 = 1511502;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x000a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x001e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0016 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Object m6861(List list, int i, Object obj, Object[] objArr) throws Throwable {
        int i2;
        try {
            return C2658.m6899((Method) C2658.m6910(list, i), obj, objArr);
        } catch (IllegalAccessException e) {
            int i3 = 1512370;
            while (true) {
                i3 ^= 1512387;
                switch (i3) {
                    case 18:
                        break;
                    case 113:
                        i3 = 1512401;
                        continue;
                    default:
                        continue;
                }
                i2 = 1511595;
                while (true) {
                    i2 ^= 1511612;
                    switch (i2) {
                        case 23:
                            i2 = 1512277;
                            break;
                        case 1001:
                            return null;
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            i2 = 1511595;
            while (true) {
                i2 ^= 1511612;
                switch (i2) {
                    case 23:
                        i2 = 1512277;
                        break;
                    case 1001:
                        return null;
                }
            }
        } catch (InvocationTargetException e3) {
            throw C2656.m6891(e3);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0068. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0137. Please report as an issue. */
    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    private static String m6862(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        short[] sArrM6886 = m6886();
        int iM6868 = m6868(m6885());
        int iM6869 = m6868(m6865());
        int iM68610 = m6868(C2658.m6903());
        m6874(sb, m6881(sArrM6886, ((iM6869 ^ (-1)) & 1738246) | ((-1738247) & iM6869), ((iM68610 ^ (-1)) & 1746899) | ((-1746900) & iM68610), ((iM6868 ^ (-1)) & 1755983) | ((-1755984) & iM6868)));
        int i = 1512494;
        while (true) {
            i ^= 1512511;
            switch (i) {
                case 17:
                    if (strArr != null) {
                        i = 1513238;
                    }
                    break;
                case 83:
                    break;
                case 114:
                    break;
                case 809:
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        int length = strArr.length;
                        int i4 = 1513269;
                        while (true) {
                            i4 ^= 1513286;
                            switch (i4) {
                                case 18:
                                    break;
                                case 53:
                                    break;
                                case 115:
                                    i4 = i3 < length ? 1513362 : 1513331;
                                    break;
                                case 212:
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }
                        int i5 = 1513393;
                        while (true) {
                            i5 ^= 1513410;
                            switch (i5) {
                                case 18:
                                    break;
                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    break;
                                case 115:
                                    i5 = i3 > 0 ? 1513486 : 1513455;
                                    break;
                                case 4044:
                                    short[] sArrM6887 = m6886();
                                    int iM68611 = m6868(C2660.m6922());
                                    int iM68612 = m6868(C2659.m6916());
                                    int iM68613 = m6868(m6884());
                                    m6874(sb, m6881(sArrM6887, ((iM68612 ^ (-1)) & 1749977) | ((-1749978) & iM68612), ((iM68613 ^ (-1)) & 1740208) | ((-1740209) & iM68613), ((iM68611 ^ (-1)) & 1751506) | ((-1751507) & iM68611)));
                                    break;
                                default:
                                    break;
                            }
                        }
                        String strM6880 = strArr[i3];
                        int i6 = 1513517;
                        while (true) {
                            i6 ^= 1513534;
                            switch (i6) {
                                case 19:
                                    i6 = strM6880 == null ? 1514261 : 1514230;
                                    break;
                                case 712:
                                    break;
                                case 745:
                                    break;
                                case 811:
                                    short[] sArrM6888 = m6886();
                                    int iM68614 = m6868(C2656.m6892());
                                    int iM68615 = m6868(C2658.m6904());
                                    int iM68616 = m6868(C2656.m6887());
                                    strM6880 = m6880(sArrM6888, ((iM68615 ^ (-1)) & 1757974) | ((-1757975) & iM68615), ((iM68616 ^ (-1)) & 1755735) | ((-1755736) & iM68616), ((iM68614 ^ (-1)) & 1745864) | ((-1745865) & iM68614));
                                    break;
                                default:
                                    break;
                            }
                        }
                        m6874(sb, strM6880);
                        i2 = 0 - ((0 - i3) - 1);
                        int i7 = 1514292;
                        while (true) {
                            i7 ^= 1514309;
                            switch (i7) {
                                case 22:
                                    break;
                                case 113:
                                    i7 = 1514323;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1512556;
        }
        short[] sArrM6889 = m6886();
        int iM68617 = m6868(C2660.m6923());
        int iM68618 = m6868(C2656.m6894());
        int iM68619 = m6868(C2658.m6909());
        m6874(sb, m6867(sArrM6889, ((iM68618 ^ (-1)) & 1738288) | ((-1738289) & iM68618), ((iM68619 ^ (-1)) & 1749662) | ((-1749663) & iM68619), ((iM68617 ^ (-1)) & 1745570) | ((-1745571) & iM68617)));
        return C2659.m6917(sb);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00fa A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0102 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    public static Method m6863(String str, Method[] methodArr, String str2, String str3, String[] strArr) throws NoSuchMethodException {
        int i;
        Method method;
        int i2 = 0;
        while (true) {
            int length = methodArr.length;
            int i3 = 1514416;
            while (true) {
                i3 ^= 1514433;
                switch (i3) {
                    case 14:
                        break;
                    case 47:
                        method = null;
                        break;
                    case 113:
                        i3 = i2 < length ? 1515160 : 1514478;
                        break;
                    case 1369:
                        Method method2 = methodArr[i2];
                        boolean zM6915 = C2659.m6915(C2659.m6911(method2), str2);
                        int i4 = 1515191;
                        while (true) {
                            i4 ^= 1515208;
                            switch (i4) {
                                case 30:
                                    break;
                                case 61:
                                    i2 = 1 - (0 - i2);
                                    i = 1516338;
                                    while (true) {
                                        i ^= 1516355;
                                        switch (i) {
                                            case 18:
                                                break;
                                            case 113:
                                                i = 1516369;
                                                break;
                                        }
                                    }
                                    break;
                                case 127:
                                    i4 = zM6915 ? 1515284 : 1515253;
                                    break;
                                case 476:
                                    boolean zM6875 = m6875(strArr, m6872(method2));
                                    int i5 = 1515315;
                                    while (true) {
                                        i5 ^= 1515332;
                                        switch (i5) {
                                            case 22:
                                                break;
                                            case 53:
                                                i2 = 1 - (0 - i2);
                                                i = 1516338;
                                                while (true) {
                                                    i ^= 1516355;
                                                    switch (i) {
                                                        case 18:
                                                            break;
                                                        case 113:
                                                            i = 1516369;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 119:
                                                i5 = zM6875 ? 1515408 : 1515377;
                                                break;
                                            case 212:
                                                boolean zM6916 = C2659.m6915(C2658.m6900(C2659.m6918(method2)), str3);
                                                int i6 = 1515439;
                                                while (true) {
                                                    i6 ^= 1515456;
                                                    switch (i6) {
                                                        case 111:
                                                            i6 = zM6916 ? 1516183 : 1516152;
                                                            break;
                                                        case 15703:
                                                            method = method2;
                                                            break;
                                                        case 15769:
                                                            break;
                                                        case 15800:
                                                            i2 = 1 - (0 - i2);
                                                            i = 1516338;
                                                            while (true) {
                                                                i ^= 1516355;
                                                                switch (i) {
                                                                    case 18:
                                                                        break;
                                                                    case 113:
                                                                        i = 1516369;
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        int i7 = 1516214;
        while (true) {
            i7 ^= 1516231;
            switch (i7) {
                case 18:
                    break;
                case 51:
                    return method;
                case 113:
                    if (method == null) {
                        i7 = 1516307;
                    }
                    break;
                case 468:
                    StringBuilder sbM6874 = m6874(new StringBuilder(), str);
                    short[] sArrM6886 = m6886();
                    int iM6868 = m6868(m6873());
                    int iM6869 = m6868(m6869());
                    int iM68610 = m6868(C2660.m6924());
                    throw new NoSuchMethodException(C2659.m6917(m6874(m6874(m6874(m6874(sbM6874, m6871(sArrM6886, ((iM6869 ^ (-1)) & 1752453) | ((-1752454) & iM6869), ((iM68610 ^ (-1)) & 1749002) | ((-1749003) & iM68610), ((iM6868 ^ (-1)) & 1753190) | ((-1753191) & iM6868))), str2), m6870(strArr)), str3)));
                default:
                    continue;
            }
            i7 = 1516276;
        }
    }

    /* JADX INFO: renamed from: ۨۨۥۣ, reason: not valid java name and contains not printable characters */
    private static boolean m6864(Object[] objArr, Class[] clsArr) {
        boolean z = false;
        int i = 1537294;
        while (true) {
            i ^= 1537311;
            switch (i) {
                case 17:
                    if (objArr == null) {
                        i = 1537387;
                    }
                    break;
                case 50:
                    break;
                case 83:
                    int i2 = 1538317;
                    while (true) {
                        i2 ^= 1538334;
                        switch (i2) {
                            case 19:
                                if (clsArr == null) {
                                    i2 = 1538410;
                                }
                                break;
                            case 50:
                                break;
                            case 85:
                                int length = objArr.length;
                                int length2 = clsArr.length;
                                int i3 = 1539464;
                                while (true) {
                                    i3 ^= 1539481;
                                    switch (i3) {
                                        case 17:
                                            if (length == length2) {
                                                i3 = 1540208;
                                            }
                                            break;
                                        case 64939:
                                            break;
                                        case 64968:
                                            return false;
                                        case 65001:
                                            int i4 = 0;
                                            while (true) {
                                                int length3 = objArr.length;
                                                int i5 = 1540239;
                                                while (true) {
                                                    i5 ^= 1540256;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 47:
                                                            i5 = i4 >= length3 ? 1540301 : 1540332;
                                                            break;
                                                        case 76:
                                                            break;
                                                        case 109:
                                                            int i6 = 1541262;
                                                            while (true) {
                                                                i6 ^= 1541279;
                                                                switch (i6) {
                                                                    case 17:
                                                                        i6 = 1541293;
                                                                        break;
                                                                    case 50:
                                                                        return true;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                boolean zM6879 = m6879(objArr[i4], C2658.m6900(clsArr[i4]));
                                                int i7 = 1540363;
                                                while (true) {
                                                    i7 ^= 1540380;
                                                    switch (i7) {
                                                        case 23:
                                                            i7 = !zM6879 ? 1540425 : 1541107;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 85:
                                                            return false;
                                                        case 751:
                                                            break;
                                                    }
                                                }
                                                i4 = 0 - ((0 - i4) - 1);
                                                int i8 = 1541138;
                                                while (true) {
                                                    i8 ^= 1541155;
                                                    switch (i8) {
                                                        case 18:
                                                            break;
                                                        case 49:
                                                            i8 = 1541169;
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i3 = 1540177;
                                }
                                break;
                            case 116:
                                int length4 = objArr.length;
                                int i9 = 1538441;
                                while (true) {
                                    i9 ^= 1538458;
                                    switch (i9) {
                                        case 19:
                                            i9 = length4 == 0 ? 1539185 : 1538503;
                                            break;
                                        case 50:
                                            break;
                                        case 93:
                                            int i10 = 1539340;
                                            while (true) {
                                                i10 ^= 1539357;
                                                switch (i10) {
                                                    case 17:
                                                        i10 = 1539371;
                                                        continue;
                                                    case 54:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 1515:
                                            z = true;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i11 = 1539216;
                                while (true) {
                                    i11 ^= 1539233;
                                    switch (i11) {
                                        case 14:
                                            return z;
                                        case 49:
                                            i11 = 1539247;
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 = 1538379;
                    }
                    break;
                case 116:
                    int i12 = 1537418;
                    while (true) {
                        i12 ^= 1537435;
                        switch (i12) {
                            case 17:
                                if (clsArr != null) {
                                    i12 = 1537511;
                                }
                                break;
                            case 50:
                                break;
                            case 83:
                                break;
                            case 124:
                                int length5 = clsArr.length;
                                int i13 = 1537542;
                                while (true) {
                                    i13 ^= 1537559;
                                    switch (i13) {
                                        case 17:
                                            if (length5 == 0) {
                                                i13 = 1538286;
                                            }
                                            break;
                                        case 3751:
                                            break;
                                        case 3800:
                                            return false;
                                        case 3833:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 1538255;
                                }
                                break;
                            default:
                                continue;
                        }
                        i12 = 1537480;
                    }
                    return true;
                default:
                    continue;
            }
            i = 1537356;
        }
    }

    /* JADX INFO: renamed from: ⁠⁠⁣⁣⁠⁠⁤⁠⁠, reason: not valid java name and contains not printable characters */
    public static String m6865() {
        int iM6896 = C2657.m6896();
        int i = 1541386;
        while (true) {
            i ^= 1541403;
            switch (i) {
                case 17:
                    if (iM6896 <= 0) {
                        i = 1542130;
                    }
                    break;
                case 687:
                    break;
                case 712:
                    int i2 = 1542161;
                    while (true) {
                        i2 ^= 1542178;
                        switch (i2) {
                            case 18:
                                return null;
                            case 51:
                                i2 = 1542192;
                                break;
                        }
                    }
                    break;
                case 745:
                    return "ۖۦۖ";
                default:
                    continue;
            }
            i = 1542099;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ⁠⁣⁤⁣⁤⁠⁣⁣⁣⁣⁤⁤⁣⁤⁤⁣⁤⁤⁤, reason: not valid java name and contains not printable characters */
    public static String m6866(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        int i4 = 0;
        while (true) {
            int i5 = 1542285;
            while (true) {
                i5 ^= 1542302;
                switch (i5) {
                    case 19:
                        i5 = i4 < i2 ? 1543029 : 1542347;
                        break;
                    case 50:
                        break;
                    case 85:
                        break;
                    case 1003:
                        break;
                    default:
                        break;
                }
                return new String(cArr);
            }
            short s = sArr[i - (0 - i4)];
            cArr[i4] = (char) ((s & (i3 ^ (-1))) | ((s ^ (-1)) & i3));
            i4 = 0 - ((0 - i4) - 1);
            int i6 = 1543060;
            while (true) {
                i6 ^= 1543077;
                switch (i6) {
                    case 22:
                        break;
                    case 49:
                        i6 = 1543091;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁠⁣⁤⁣⁤⁠⁣⁤⁣⁠⁣⁤⁠, reason: not valid java name and contains not printable characters */
    public static String m6867(Object obj, int i, int i2, int i3) {
        int iM6896 = C2657.m6896();
        int i4 = 1543184;
        while (true) {
            i4 ^= 1543201;
            switch (i4) {
                case 14:
                    break;
                case 49:
                    if (iM6896 <= 0) {
                        i4 = 1543277;
                    }
                    break;
                case 76:
                    return C2658.m6907((short[]) obj, i, i2, i3);
                case 111:
                    int i5 = 1543308;
                    while (true) {
                        i5 ^= 1543325;
                        switch (i5) {
                            case 17:
                                i5 = 1543990;
                                break;
                            case 939:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i4 = 1543246;
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁣⁣⁣⁣⁣⁠⁠⁠⁠⁣⁣⁠, reason: not valid java name and contains not printable characters */
    public static int m6868(Object obj) {
        int iM6883 = m6883();
        int i = 1544083;
        while (true) {
            i ^= 1544100;
            switch (i) {
                case 22:
                    break;
                case 55:
                    if (iM6883 < 0) {
                        i = 1544176;
                    }
                    break;
                case 84:
                    return m6876(obj);
                case 117:
                    int i2 = 1544207;
                    while (true) {
                        i2 ^= 1544224;
                        switch (i2) {
                            case 14:
                                return 0;
                            case 47:
                                i2 = 1544238;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1544145;
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁣⁣⁣⁣⁣⁠⁤⁠⁤⁣, reason: not valid java name and contains not printable characters */
    public static String m6869() {
        int iM6905 = C2658.m6905();
        int i = 1544982;
        while (true) {
            i ^= 1544999;
            switch (i) {
                case 18:
                    break;
                case 49:
                    if (iM6905 < 0) {
                        i = 1545075;
                    }
                    break;
                case 84:
                    return "ۥ۟ۧ";
                case 115:
                    int i2 = 1545106;
                    while (true) {
                        i2 ^= 1545123;
                        switch (i2) {
                            case 18:
                                return null;
                            case 49:
                                i2 = 1545137;
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1545044;
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁣⁣⁤⁤⁣⁠⁠⁣⁣⁠⁠⁣, reason: not valid java name and contains not printable characters */
    public static String m6870(Object obj) {
        int iM6905 = C2658.m6905();
        int i = 1545230;
        while (true) {
            i ^= 1545247;
            switch (i) {
                case 17:
                    if (iM6905 < 0) {
                        i = 1545974;
                    }
                    break;
                case 679:
                    break;
                case 712:
                    int i2 = 1546005;
                    while (true) {
                        i2 ^= 1546022;
                        switch (i2) {
                            case 18:
                                return null;
                            case 51:
                                i2 = 1546036;
                                break;
                        }
                    }
                    break;
                case 745:
                    return m6862((String[]) obj);
                default:
                    continue;
            }
            i = 1545943;
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁣⁤⁠⁠⁠⁠⁠⁠⁣⁣⁠, reason: not valid java name and contains not printable characters */
    public static String m6871(Object obj, int i, int i2, int i3) {
        int iM6895 = C2656.m6895();
        int i4 = 1546129;
        while (true) {
            i4 ^= 1546146;
            switch (i4) {
                case 18:
                    break;
                case 51:
                    if (iM6895 > 0) {
                        i4 = 1567054;
                    }
                    break;
                case 109:
                    int i5 = 1567085;
                    while (true) {
                        i5 ^= 1567102;
                        switch (i5) {
                            case 19:
                                i5 = 1567116;
                                break;
                            case 242:
                                return null;
                        }
                    }
                    break;
                case 32492:
                    return C2660.m6928((short[]) obj, i, i2, i3);
                default:
                    continue;
            }
            i4 = 1546191;
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁤⁤⁣⁠⁣⁤⁣⁠⁣⁤⁣, reason: not valid java name and contains not printable characters */
    public static Class[] m6872(Object obj) {
        int iM6883 = m6883();
        int i = 1567209;
        while (true) {
            i ^= 1567226;
            switch (i) {
                case 19:
                    if (iM6883 < 0) {
                        i = 1567302;
                    }
                    break;
                case 956:
                    return ((Method) obj).getParameterTypes();
                case 989:
                    int i2 = 1567333;
                    while (true) {
                        i2 ^= 1567350;
                        switch (i2) {
                            case 19:
                                i2 = 1568015;
                                break;
                            case 1913:
                                return null;
                        }
                    }
                    break;
                case 1010:
                    break;
                default:
                    continue;
            }
            i = 1567271;
        }
    }

    /* JADX INFO: renamed from: ⁣⁤⁠⁠⁠⁣⁤⁣⁠⁣⁤⁠⁠⁤⁣⁠⁤⁤, reason: not valid java name and contains not printable characters */
    public static String m6873() {
        int iM6883 = m6883();
        int i = 1568108;
        while (true) {
            i ^= 1568125;
            switch (i) {
                case 17:
                    if (iM6883 < 0) {
                        i = 1568201;
                    }
                    break;
                case 180:
                    return "ۦۧۨ";
                case 215:
                    int i2 = 1568232;
                    while (true) {
                        i2 ^= 1568249;
                        switch (i2) {
                            case 17:
                                i2 = 1568263;
                                break;
                            case 1022:
                                return null;
                        }
                    }
                    break;
                case 246:
                    break;
                default:
                    continue;
            }
            i = 1568170;
        }
    }

    /* JADX INFO: renamed from: ⁣⁤⁣⁠⁣⁤⁤⁣⁤⁠⁠⁤, reason: not valid java name and contains not printable characters */
    public static StringBuilder m6874(Object obj, Object obj2) {
        int iM6905 = C2658.m6905();
        int i = 1569007;
        while (true) {
            i ^= 1569024;
            switch (i) {
                case 14:
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int i2 = 1569131;
                    while (true) {
                        i2 ^= 1569148;
                        switch (i2) {
                            case 23:
                                i2 = 1569162;
                                break;
                            case 246:
                                return null;
                        }
                    }
                    break;
                case 76:
                    return ((StringBuilder) obj).append((String) obj2);
                case 495:
                    if (iM6905 <= 0) {
                        i = 1569100;
                    }
                    break;
                default:
                    continue;
            }
            i = 1569069;
        }
    }

    /* JADX INFO: renamed from: ⁤⁠⁤⁣⁣⁠⁠⁤⁠⁠, reason: not valid java name and contains not printable characters */
    public static boolean m6875(Object obj, Object obj2) {
        int iM6883 = m6883();
        int i = 1569255;
        while (true) {
            i ^= 1569272;
            switch (i) {
                case 31:
                    if (iM6883 < 0) {
                        i = 1569999;
                    }
                    break;
                case 1335:
                    return m6864((Object[]) obj, (Class[]) obj2);
                case 1352:
                    int i2 = 1570030;
                    while (true) {
                        i2 ^= 1570047;
                        switch (i2) {
                            case 17:
                                i2 = 1570061;
                                break;
                            case 498:
                                return false;
                        }
                    }
                    break;
                case 1385:
                    break;
                default:
                    continue;
            }
            i = 1569968;
        }
    }

    /* JADX INFO: renamed from: ⁤⁠⁤⁤⁠⁣⁤⁣⁤⁠⁣⁤⁣⁠⁣⁤⁠, reason: not valid java name and contains not printable characters */
    public static int m6876(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ⁤⁠⁤⁤⁠⁣⁤⁣⁤⁠⁣⁤⁣⁠⁣⁤⁠, reason: not valid java name and contains not printable characters */
    public static Class<?> m6877(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ⁤⁠⁤⁤⁠⁣⁤⁣⁤⁠⁣⁤⁣⁠⁣⁤⁠, reason: not valid java name and contains not printable characters */
    public static String m6878(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        int i4 = 0;
        while (true) {
            int i5 = 1570154;
            while (true) {
                i5 ^= 1570171;
                switch (i5) {
                    case 17:
                        i5 = i4 < i2 ? 1570898 : 1570216;
                        break;
                    case 211:
                        break;
                    case 242:
                        break;
                    case 3369:
                        break;
                    default:
                        break;
                }
                return new String(cArr);
            }
            short s = sArr[0 - ((0 - i) - i4)];
            cArr[i4] = (char) ((s & (i3 ^ (-1))) | ((s ^ (-1)) & i3));
            i4 = 0 - ((0 - i4) - 1);
            int i6 = 1570929;
            while (true) {
                i6 ^= 1570946;
                switch (i6) {
                    case 18:
                        break;
                    case 243:
                        i6 = 1570960;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁣⁣⁤⁤⁣⁠⁠⁤⁣⁠⁤⁤, reason: not valid java name and contains not printable characters */
    public static boolean m6879(Object obj, Object obj2) {
        int iM6905 = C2658.m6905();
        int i = 1571053;
        while (true) {
            i ^= 1571070;
            switch (i) {
                case 19:
                    if (iM6905 <= 0) {
                        i = 1571146;
                    }
                    break;
                case 436:
                    return obj.equals(obj2);
                case 469:
                    int i2 = 1571177;
                    while (true) {
                        i2 ^= 1571194;
                        switch (i2) {
                            case 19:
                                i2 = 1571859;
                                break;
                            case 1385:
                                return false;
                        }
                    }
                    break;
                case 498:
                    break;
                default:
                    continue;
            }
            i = 1571115;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁣⁤⁠⁠⁠⁣⁣⁣⁣⁤⁤, reason: not valid java name and contains not printable characters */
    public static String m6880(Object obj, int i, int i2, int i3) {
        int iM6883 = m6883();
        int i4 = 1571952;
        while (true) {
            i4 ^= 1571969;
            switch (i4) {
                case 14:
                    break;
                case 47:
                    int i5 = 1572076;
                    while (true) {
                        i5 ^= 1572093;
                        switch (i5) {
                            case 17:
                                i5 = 1572107;
                                break;
                            case 502:
                                return null;
                        }
                    }
                    break;
                case 76:
                    return m6866((short[]) obj, i, i2, i3);
                case 241:
                    if (iM6883 <= 0) {
                        i4 = 1572045;
                    }
                    break;
                default:
                    continue;
            }
            i4 = 1572014;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁣⁤⁠⁠⁣⁠⁤⁣⁠⁤⁣, reason: not valid java name and contains not printable characters */
    public static String m6881(Object obj, int i, int i2, int i3) {
        int iM6895 = C2656.m6895();
        int i4 = 1572851;
        while (true) {
            i4 ^= 1572868;
            switch (i4) {
                case 22:
                    break;
                case 53:
                    int i5 = 1572975;
                    while (true) {
                        i5 ^= 1572992;
                        switch (i5) {
                            case 14:
                                return null;
                            case 239:
                                i5 = 1573006;
                                break;
                        }
                    }
                    break;
                case 84:
                    return C2659.m6914((short[]) obj, i, i2, i3);
                case 1048567:
                    if (iM6895 > 0) {
                        i4 = 1572944;
                    }
                    break;
                default:
                    continue;
            }
            i4 = 1572913;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁤⁠⁤⁣⁣⁣⁣⁣⁤⁤, reason: not valid java name and contains not printable characters */
    public static Class m6882(Object obj) {
        int iM6896 = C2657.m6896();
        int i = 1573099;
        while (true) {
            i ^= 1573116;
            switch (i) {
                case 23:
                    if (iM6896 <= 0) {
                        i = 1573843;
                    }
                    break;
                case 815:
                    return m6877((String) obj);
                case 840:
                    int i2 = 1573874;
                    while (true) {
                        i2 ^= 1573891;
                        switch (i2) {
                            case 18:
                                return null;
                            case 2033:
                                i2 = 1573905;
                                break;
                        }
                    }
                    break;
                case 873:
                    break;
                default:
                    continue;
            }
            i = 1573812;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁤⁠⁤⁤⁣⁤⁠⁠⁠, reason: not valid java name and contains not printable characters */
    public static int m6883() {
        int i = 0;
        String str = "ۖ۠ۧ";
        int i2 = 0;
        int i3 = 0;
        int iM6876 = 0;
        while (true) {
            switch (m6876((Object) str)) {
                case 1739224:
                    i3 = i | i2;
                    str = "ۚۤۡ";
                    break;
                case 1741884:
                    i2 = i3 & (-1743725);
                    str = "ۦۤۥ";
                    break;
                case 1742039:
                    return i3;
                case 1749759:
                    i3 = iM6876 ^ (-1);
                    str = "ۚ۟ۡ";
                    break;
                case 1752642:
                    i = i3 & iM6876;
                    str = "ۗۦۧ";
                    break;
                case 1753575:
                    i3 = 1743724;
                    str = "ۥۥۢ";
                    break;
                default:
                    iM6876 = m6876((Object) "ۜۚۤ");
                    str = "ۢۥۢ";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁤⁤⁠⁤⁠⁠⁣⁤⁣⁤⁠, reason: not valid java name and contains not printable characters */
    public static String m6884() {
        int iM6896 = C2657.m6896();
        int i = 1573998;
        while (true) {
            i ^= 1574015;
            switch (i) {
                case 17:
                    if (iM6896 < 0) {
                        i = 1574742;
                    }
                    break;
                case 211:
                    int i2 = 1574773;
                    while (true) {
                        i2 ^= 1574790;
                        switch (i2) {
                            case 18:
                                return null;
                            case 243:
                                i2 = 1574804;
                                break;
                        }
                    }
                    break;
                case 242:
                    break;
                case 809:
                    return "ۘۧۡ";
                default:
                    continue;
            }
            i = 1574060;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁤⁤⁠⁤⁣⁠⁠⁠⁣⁣⁣, reason: not valid java name and contains not printable characters */
    public static String m6885() {
        int iM6905 = C2658.m6905();
        int i = 1574897;
        while (true) {
            i ^= 1574914;
            switch (i) {
                case 18:
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int i2 = 1575021;
                    while (true) {
                        i2 ^= 1575038;
                        switch (i2) {
                            case 19:
                                i2 = 1575703;
                                break;
                            case 873:
                                return null;
                        }
                    }
                    break;
                case 76:
                    return "ۦ۟ۢ";
                case 4083:
                    if (iM6905 < 0) {
                        i = 1574990;
                    }
                    break;
                default:
                    continue;
            }
            i = 1574959;
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁤⁤⁠⁤⁣⁤⁤⁠⁤⁤, reason: not valid java name and contains not printable characters */
    public static short[] m6886() {
        int iM6905 = C2658.m6905();
        int i = 1575796;
        while (true) {
            i ^= 1575813;
            switch (i) {
                case 22:
                    break;
                case 55:
                    int i2 = 1575920;
                    while (true) {
                        i2 ^= 1575937;
                        switch (i2) {
                            case 14:
                                return null;
                            case 2033:
                                i2 = 1575951;
                                break;
                        }
                    }
                    break;
                case 84:
                    return f6171short;
                case 241:
                    if (iM6905 < 0) {
                        i = 1575889;
                    }
                    break;
                default:
                    continue;
            }
            i = 1575858;
        }
    }
}
