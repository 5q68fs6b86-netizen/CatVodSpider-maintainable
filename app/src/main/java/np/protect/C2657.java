package np.protect;

/* JADX INFO: renamed from: np.protect.⁣⁣⁣⁣⁣⁠⁣⁤⁠⁠⁠⁣⁣⁣⁣⁣⁤, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2657 {

    /* JADX INFO: renamed from: ⁣⁤⁠⁠⁠⁤⁠⁤⁠⁠⁣⁣, reason: not valid java name and contains not printable characters */
    public static boolean f6174 = true;

    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁠⁠⁠⁣⁣⁠, reason: not valid java name and contains not printable characters */
    public static int m6896() {
        int i = 0;
        String str = "۬ۛۤ";
        int i2 = 0;
        int i3 = 0;
        int iM6876 = 0;
        while (true) {
            switch (C2648.m6876((Object) str)) {
                case 1738407:
                    i3 = iM6876 ^ (-1);
                    str = "ۜۚۖ";
                    break;
                case 1743640:
                    i2 = i3 & (-1742092);
                    str = "ۧۨۨ";
                    break;
                case 1744167:
                    return i3;
                case 1751547:
                    i = i3 & iM6876;
                    str = "۬ۗۚ";
                    break;
                case 1754663:
                    i3 = 1742091;
                    str = "ۤۡۘ";
                    break;
                case 1759061:
                    iM6876 = C2648.m6876((Object) "ۚۨۙ");
                    str = "ۖ۫ۜ";
                    break;
                default:
                    i3 = i | i2;
                    str = "ۜ۫ۖ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁣⁤⁣⁠⁣⁤⁠⁠⁠⁠⁣⁣⁣, reason: not valid java name and contains not printable characters */
    public static String m6897(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        int i4 = 0;
        while (true) {
            int i5 = 1602766;
            while (true) {
                i5 ^= 1602783;
                switch (i5) {
                    case 17:
                        i5 = i4 < i2 ? 1602859 : 1602828;
                        break;
                    case 50:
                        break;
                    case 467:
                        break;
                    case 500:
                        break;
                    default:
                        break;
                }
                return new String(cArr);
            }
            short s = sArr[i - (0 - i4)];
            cArr[i4] = (char) ((s & (i3 ^ (-1))) | ((s ^ (-1)) & i3));
            i4 = (i4 - 10) + 1 + 10;
            int i6 = 1602890;
            while (true) {
                i6 ^= 1602907;
                switch (i6) {
                    case 17:
                        i6 = 1603572;
                        break;
                    case 687:
                        break;
                }
            }
        }
    }
}
