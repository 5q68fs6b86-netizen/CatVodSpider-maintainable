package com.github.catvod.spider;
import com.github.catvod.spider.support.p117b.C2186v;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p117b.C2174h;
import com.github.catvod.spider.support.p116a.C2137a;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p117b.C2185u;
import com.github.catvod.spider.support.p117b.C2188x;
import com.github.catvod.bean.Class;
import com.github.catvod.spider.support.p118c.C2191b;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Hxq extends Spider {

    /* JADX INFO: renamed from: d */
    public static final String[][] f186d;

    /* JADX INFO: renamed from: e */
    public static final SecretKeySpec f187e;

    /* JADX INFO: renamed from: f */
    public static final IvParameterSpec f188f;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f6130short = {1913, 1912, 1898, 1793, 1812, -32040, 22348, 1613, 1601, 1623, 1155, 1155, -29535, 22837, 2125, 2124, 2116, 2124, 2092, 3224, 3225, -28236, 25961, 1309, 27332, 27846, 2754, 1600, 1647, 1653, 1646, 1614, 1662, 1655, 1606, 1618, 1652, 1639, 1640, 1653, 1647, 1650, 1575, 1930, 1934, 1944, 2169, 2121, 2112, 2135, 2136, 2114, 2137, 2051, 2049, 2051, 2055, 2049, 2049, 2049, 2049, 2064, 797, 769, 796, 794, 26245, 23448, 1933, 1937, 1941, 1926, 22766, 18535, 3295, 3291, 3277, 3249, 3293, 3292, 3293, 3249, 3278, 3285, 3293, 3277, 3243, 3278, 3327, 3322, 3322, 3319, 3312, 3321, 926, 927, 909, 998, 1011, 2039, 2026, 1989, 2015, 1988, 2020, 2004, 2013, 2033, 1932, 21772, 23658, 24221, -30071, 1942, 1932, 2715, 2713, 2703, 2691, 2704, 2691, 2709, 2717, 2719, 2712, 2705, 1266, 1203, 1257, 977, 1022, 996, 1023, 950, 991, 1007, 998, 977, 1022, 996, 1023, 933, 935, 933, 929, 983, 2210, 2214, 2218, 2220, 2222, 937, 949, 936, 944, 959, 2010, 2013, 1987, 3093, 3082, 3094, 3089, 3072, 3095, 1882, 1869, 1869, 1872, 1869, 2944, 2973, 2994, 2984, 2995, 2963, 2979, 2986, 2950, 3067, 2955, 2963, 2955, -24894, -32716, 3041, 3067, 2765, 2767, 2777, 2773, 2758, 2773, 2755, 2763, 2761, 2766, 2759, 1596, 1592, 1582, 1618, 1598, 1599, 1598, 1618, 1581, 1590, 1598, 1582, 1608, 1581, 1564, 1561, 1561, 1556, 1555, 1562, 3125, 3124, 3110, 3149, 3160, 1917, 1888, 1871, 1877, 1870, 1902, 1886, 1879, 1915, 1798, -28987, 23776, 24087, -30205, 1820, 1798, 467, 462, 481, 507, 480, 448, 496, 505, 469, 424, -30613, 26136, 21829, 24348, 22713, -29523, 434, 424, 3310, 3297, 3309, 3301, 819, 804, 809, 816, 800, 406, 410, 411, 400, 391, 440, 400, 408, 410, 1074, 1075, 1058, 1079, 1087, 1082, 1051, 1075, 1083, 1081, 2705, 2698, 2701, 2704, 2710, 2698, 2691, 2700, 2694, 2544, 2538, 2535, 1231, 1216, 1228, 1220, 1592, 28750, -27678, 1284, 2307, 2159, 2152, 2166, 2132, 2133, 2119, 2092, 2105, 776, 808, 776, 808, 776, 808, 2675, 2680, 2657, 272, 257, 262, 2281, 414, 399, 399, 403, 406, 412, 414, 395, 406, 400, 401, 464, 391, 466, 402, 399, 410, 408, 394, 397, 403, 2692, 2786, 2815, 2803, 2698, 2815, 2698, 2786, 2793, 2787, 2795, 2798, 2804, 2803, 2733, 1555, 1653, 1640, 1636, 1565, 1640, 1565, 1638, 1653, 1634, 1635, 1657, 1663, 1662, 1546, 1539, 1594, 2068, 2109, 2139, 2118, 2122, 2099, 2118, 2099, 2131, 2139, 2138, 2135, 2143, 2099, 2125, 2139, 2127, 2123, 2139, 2128, 2141, 2139, 2084, 2094, 2068, 2800, 2710, 2699, 2695, 2814, 2699, 2814, 2693, 2710, 2689, 2688, 2714, 2716, 2717, 2793, 2784, 2777, 2800, 2710, 2699, 2695, 2814, 2699, 2814, 2695, 2706, 2689, 2708, 2710, 2695, 2711, 2694, 2689, 2706, 2695, 2714, 2716, 2717, 2793, 1129, 2387, 2357, 2344, 2340, 2397, 2344, 2397, 2356, 2361, 2339, 2355, 2367, 2366, 2340, 2361, 2366, 2341, 2361, 2340, 2345, 2426, 2920, 2830, 2835, 2847, 2822, 2936, 2846, 2881, 2920, 2830, 2835, 2847, 2918, 2835, 2918, 2845, 2830, 2841, 2840, 2818, 2820, 2821, 2929, 2936, 2881, 2920, 2830, 2835, 2847, 2918, 2835, 2918, 2843, 2823, 2826, 2834, 2823, 2818, 2840, 2847, 2918, 2847, 2834, 2843, 2830, 2929, 2845, 2820, 2831, 2881, 2173, 2145, 2145, 2149, 1247, 1209, 1188, 1192, 1205, 1202, 1210, 1222, 1791, 1761, 1761, 1761, 1789, 1755, 2912, 2881, 2830, 2904, 2895, 2882, 2887, 2890, 2830, 2915, 2942, 2842, 2830, 2939, 2940, 2914, 2909, 3317, 3283, 3269, 3282, 3213, 3297, 3271, 3269, 3278, 3284, 908, 924, 923, 982, 960, 970, 974, 968, 1045, 1139, 1134, 1122, 1147, 1029, 1123, 1084, 1045, 1139, 1134, 1122, 1051, 1134, 1051, 1120, 1139, 1124, 1125, 1151, 1145, 1144, 1036, 1029, 1084, 2878, 2859, 2859, 1821, 2296, 2206, 2179, 2191, 2294, 2179, 2294, 2184, 2191, 2185, 2206, 2202, 2198, 2294, 2194, 2197, 2205, 1105, 2787, 2765, 2688, 2787, 2769, 924, 1018, 999, 1003, 1010, 908, 1002, 608, 518, 539, 535, 622, 539, 622, 533, 518, 529, 528, 522, 524, 525, 811, 845, 848, 860, 805, 848, 805, 860, 841, 858, 847, 845, 860, 844, 861, 858, 841, 860, 833, 839, 838, 2486, 2512, 2509, 2497, 2488, 2509, 2488, 2520, 2512, 2513, 2524, 2516, 2488, 2502, 2512, 2500, 2496, 2512, 2523, 2518, 2512, 1140, 1042, 1039, 1027, 1146, 1039, 1146, 1042, 1049, 1043, 1051, 1054, 1028, 1027, 2186, 2284, 2289, 2301, 2180, 2289, 2180, 2274, 2284, 2288, 2195, 2536, 2543, 2548, 2432, 1615, 1577, 1588, 1592, 1601, 1588, 1601, 1569, 1581, 1596, 1622, 1305, 1407, 1378, 1390, 1303, 1378, 1303, 1390, 1403, 1384, 1405, 1407, 1390, 1406, 1391, 1384, 1403, 1390, 1395, 1397, 1396, 1280, 2573, 2592, 2592, 2668, 2593, 2687, 2617, 2676, 2668, 2623, 2601, 2603, 2593, 2601, 2594, 2616, 2623, 2668, 2602, 2605, 2597, 2592, 2601, 2600, 2668, 2616, 2595, 2668, 2592, 2595, 2605, 2600, 2200, 2236, 2214, 2214, 2236, 2235, 2226, 2293, 2208, 2215, 2233, 991, 990, 972, 935, 946, 589, 604, 577, 589, 534, 585, 597, 600, 592, 599, 634, 614, 614, 610, 2263, 3152, 1373, 2091, 2092, 2103, 2115, 2140, 1568, 1593, 1588, 300, 316, 310, 315, 616, 618, 1368, 1359, 1871, 1714, 1714, 1709, 1481, 1415, 1430, 1423, 1481, 1429, 1411, 1428, 1423, 1411, 1429, 1481, 1428, 1429, 1418, 1424, 1456, 1490, 1585, 1579, 1573, 1580, 3004, 3003, 2981, 2448, 2461, 2457, 2460, 2461, 2442, 2443, 1410, 1415, 1426, 1415, 1534, 1529, 1929, 2516, 2515, 2526, 2519, 2498, 3145, 3160, 3166, 3164, 1005, 999, 1002, 1088, 1116, 1089, 1095, 2230, 2218, 2222, 2237, 2161, 2111, 2094, 2103, 2161, 2093, 2107, 2092, 2103, 2107, 2093, 2156, 2161, 2111, 2092, 2092, 2111, 2096, 2105, 2107, 2161, 2109, 2111, 2090, 2107, 2674, 2660, 2675, 2664, 2660, 2674, 2637, 2664, 2674, 2677, 817, 819, 814, 825, 2845, 2823, 2825, 2816, 528, 535, 521, 3093, 3096, 3100, 3097, 3096, 3087, 3086, 1475, 1492, 1474, 1490, 1502, 1493, 1492, 2216, 2229, 2202, 2176, 2203, 2235, 2187, 2178, 2222, 2259, 2226, 2211, 2234, -31504, 32219, 20930, -31274, 2249, 2259, 1094, 1116, 1105, 2083, 2157, 2172, 2149, 2083, 2175, 2153, 2174, 2149, 2153, 2175, 2083, 2152, 2153, 2168, 2157, 2149, 2144, 2033, 2023, 2032, 2027, 2023, 2033, 1017, 997, 1000, 1008, 
    960, 1021, 1004, 996, 1018, 1566, 1543, 1546, 856, 847, 857, 841, 837, 846, 847, 414, 410, 398, 387, 390, 411, 406, 629, 616, 583, 605, 582, 614, 598, 607, 627, 526, 24972, 28517, 30485, -28922, 23327, -28917, 532, 526, -27151, 1576, 1589, 1576, 1584, 1593, 30963, 935, 945, 934, 957, 949, 952, 922, 955, 3159, 1535, 2950, 2950, 2950, 2272, 2287, 2275, 2283, 829, 831, 810, 827, 825, 817, 812, 807, -28008, 22294, 29382, -29120, 32535, 21843, -27030, 22398, 1223, 1244, 1243, 1222, 1216, 1244, 1237, 1242, 1232, 2222, 2228, 2177, 2222, 2217, 2222, 2228, 2223, 2210, 2211, 1388, 1376, 1402, 1377, 1403, -28414, 22188, 27794, 28630, -29803, 1053, 1162, 1053, 1216, 1233, 1222, 1236, 1562, 1644, 18559, 26960, 1567, -1698, 1662, 1561, 1560, 1591, 1646, 1645, 2441, 2444, 2459, 2453, 2448, 2442, 2449, 2477, 2448, 2452, 2460, 2670, 2665, 2675, 2677, 2664, 1347, 1360, 1295, 1345, 2066, 2165, 2160, 2064, 2163, 2053, 2064, 1142, 1086, 1074, 1059, 1056, 1131, 3115, 2711, 2777, 2772, 2781, 2781, 2776, 2753, 2698, 11101, 1480, 1423, 1411, 1438, 1493, 3163, 2151, 2093, 2101, 2170, 756, 530, 595, 576, 527, 821, 374, 374, 374, 2543, 2550, 2555, 2326, 2305, 2306, 2305, 2326, 1340, 1394, 1379, 1402, 1340, 1376, 1398, 1377, 1402, 1398, 1376, 1313, 1340, 1398, 1379, 1402, 1376, 1404, 1399, 1398, 1340, 1399, 1398, 1383, 1394, 1402, 1407, 422, 442, 439, 431, 415, 418, 435, 443, 734, 706, 728, 735, 718, 712, 734, 1089, 1105, 1115, 1110, 2223, 2226, 2205, 2183, 2204, 2236, 2188, 2181, 2217, 2260, -29885, 23330, 2183, 2199, 2205, 2192, 20933, -31279, 2254, 2260, 1553, 1542, 1552, 1536, 1548, 1543, 1542, 893, 880, 884, 881, 880, 871, 870, 1296, 1303, 1289, 3326, 3310, 3304, 3299, 3304, 2430, 2424, 2411, 2409, 2415, 2371, 2414, 1827, 1830, 1821, 1841, 1831, 1840, 1835, 1831, 1841, 1821, 1842, 1838, 1827, 1851, 1713, 1791, 1774, 1783, 1713, 1789, 1791, 1772, 1774, 1713, 1772, 1787, 1769, 1791, 1772, 1786, 1713, 1768, 1708, 890, 889, 881, 895, 888, 1749, 1746, 1699, 1702, 1715, 1702, 2514, 2507, 2502, 2262, 2265, 2243, 2264, 2264, 2248, 2241, 2182, 855, 858, 849, 844, 516, 531, 513, 535, 516, 530, 546, 537, 541, 531, 536, 575, 536, 528, 537, 276, 271, 267, 261, 270, 3140, 3161, 3153, 3144, 3155, 3140, 3189, 3144, 3148, 3140, 2953, 2964, 2972, 2949, 2974, 2953, 2975, 669, 640, 687, 693, 686, 654, 702, 695, 667, 742, -32399, 20752, 692, 675, 689, 679, 692, 674, 658, 681, 685, 675, 680, 23543, -28701, 764, 742, 1395, 1396, 1401, 1392, 1381, 2659, 1662, 1647, 1641, 1643, 726, 664, 649, 656, 726, 650, 668, 651, 656, 668, 650, 715, 726, 664, 651, 651, 664, 663, 670, 668, 726, 666, 664, 653, 668, 433, 429, 432, 438, 433, 668, 640, 644, 663, 662, 2419, 2406, 2427, 2401, 2404, 2407, 534, 537, 533, 541, 23109, -25659, 2360, 2362, 2351, 2366, 2344, 1789, 1770, 1767, 1790, 1774, 1987, 2015, 19681, 30657, 2980, 2298, 2284, 2299, 2272, 2284, 2298, 2245, 2272, 2298, 2301, 1650, 2356, 2363, 2337, 2362, 2362, 2346, 2339, 2403, 611, 612, 632, 639, 2398, 2371, 2412, 2422, 2413, 2381, 2429, 2420, 2392, 2341, 23320, 20686, 23059, 20532, -31712, 2367, 2341, 2401, 2404, 2417, 2404, 3015, 3008, 1525, 1530, 1504, 1531, 1531, 1515, 1506, 1447, 920, 911, 921, 927, 902, 926, 2792, 2739, 2744, 2794, 918, 907, 932, 958, 933, 901, 949, 956, 912, 1005, 957, 933, 957, 995, 23794, -30490, 1529, 1507, 2333, 2333, 2333, 2367, 2335, 2367, 2335, 2367, 2335, 1639, 1638, 561, 564, 545, 564, 2868, 2851, 2869, 2853, 2857, 2850, 2851, 1573, 1568, 1589, 1568, 1586, 2327, 2334, 2307, 2332, 2320, 2309, 1316, 1333, 1330, 1313, 1332, 1321, 1327, 1326, 1629, 1618, 1608, 1619, 1619, 1603, 1610, 1550, 1042, 1029, 1043, 1045, 1036, 1044, 1048, 1028, 1033, 1041, 1085, 1050, 1028, 2399, 2370, 2413, 2423, 2412, 2380, 2428, 2421, 2393, 2340, 2386, 2352, 28073, 27706, 20533, -31711, 2366, 2340, 2338, 2308, 2322, 2309, 2394, 2358, 2320, 2322, 2329, 2307, 730, 714, 717, 640, 662, 668, 664, 670, 1799, 1798, 1812, 1919, 1898, 2292, 1668, 1759, 1748, 1670, 1747, 1731, 1738, 1693, 1742, 1737, 1751, 1670, 3090, 3154, 3161, 3136, 3081, 3120, 3186, 3171, 3172, 3115, 2255, 2270, 2251, 2263, 3176, 3193, 3178, 3193, 3189, 3179, 2039, 2027, 2022, 2031, 2042, 768, 783, 789, 782, 782, 798, 791, 852, 2172, 2162, 2158, 2144, 2168, 2149, 2163, 1383, 1386, 1379, 1398, 443, 1884, 1869, 1867, 1865, 1381, 2815, 2800, 2794, 2801, 2801, 2785, 2792, 2731, 2056, 2063, 2065, 1804, 2457, 2519, 2502, 2527, 2457, 2501, 2515, 2519, 2500, 2517, 2526, 2457, 2501, 2434, 1390, 1339, 1338, 1325, 1326, 1325, 1338, 1397, 1339, 1325, 1321, 1338, 1323, 1312, 1390, 1340, 1329, 1336, 1325, 1397, 1400, 1390, 1336, 1321, 1327, 1325, 1397, 1401, 1390, 1315, 1397, 3294, 3295, 3277, 3238, 3251, 2461, 2448, 2452, 2449, 2448, 2439, 2438, 1758, 1737, 1759, 1743, 1731, 1736, 1737, 913, 916, 897, 916, 833, 838, 2504, 2526, 2505, 2514, 2526, 2504, 2551, 2514, 2504, 2511};

    /* JADX INFO: renamed from: a */
    public String f189a = "";

    /* JADX INFO: renamed from: b */
    public final HashMap f190b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f191c = new HashMap();

    class V4Result {

        /* JADX INFO: renamed from: a */
        public int f192a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f193b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final ArrayList f194c = new ArrayList();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.Hxq$a */
    public class C0037a {

        /* JADX INFO: renamed from: a */
        public static int f195a = -403;

        /* JADX INFO: renamed from: b */
        public static String m550b(String str) {
            String string = "";
            int i = 0;
            String str2 = "";
            while (i < 15) {
                string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
                String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
                i++;
                str2 = string2;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
            for (int i2 = 0; i2 < str.length(); i2 += 2) {
                byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            String str3 = "a";
            while (str3.length() > 0) {
                str3 = "";
                if ("".length() == 0) {
                    str3 = "a";
                }
            }
            int length = str3.length();
            int length2 = str2.length();
            for (int i3 = 0; i3 < length; i3++) {
                byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
            }
            for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
            }
            return new String(byteArray);
        }

        /* JADX INFO: renamed from: c */
        public static int m551c(Object obj) {
            return obj.hashCode();
        }

        /* JADX INFO: renamed from: d */
        public static int m552d() {
            return (-576) ^ C0040d.f198a;
        }

        /* JADX INFO: renamed from: e */
        public static String m553e(short[] sArr, int i, int i2, int i3) {
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = (char) (sArr[i + i4] ^ i3);
            }
            return new String(cArr);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.Hxq$b */
    public class C0038b {

        /* JADX INFO: renamed from: a */
        public static int f196a = -917;

        /* JADX INFO: renamed from: b */
        public static int m554b(Object obj) {
            return obj.hashCode();
        }

        /* JADX INFO: renamed from: c */
        public static int m555c() {
            return (-463) ^ f196a;
        }

        /* JADX INFO: renamed from: d */
        public static String m556d(String str) {
            String string = "";
            int i = 0;
            String str2 = "";
            while (i < 15) {
                string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
                String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
                i++;
                str2 = string2;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
            while (str.length() > 0) {
                byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            int length2 = str2.length();
            for (int i2 = 0; i2 < length; i2++) {
                byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
            }
            return new String(byteArray);
        }

        /* JADX INFO: renamed from: e */
        public static String m557e(short[] sArr, int i, int i2, int i3) {
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = (char) (sArr[i + i4] ^ i3);
            }
            return new String(cArr);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.Hxq$c */
    public class C0039c {

        /* JADX INFO: renamed from: a */
        public static int f197a = 643;

        /* JADX INFO: renamed from: b */
        public static int m558b() {
            return (-376) ^ C0041e.f199a;
        }

        /* JADX INFO: renamed from: c */
        public static String m559c(short[] sArr, int i, int i2, int i3) {
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = (char) (sArr[i + i4] ^ i3);
            }
            return new String(cArr);
        }

        /* JADX INFO: renamed from: d */
        public static String m560d(String str) {
            String string = "";
            int i = 0;
            String str2 = "";
            while (i < 15) {
                string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
                String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
                i++;
                str2 = string2;
            }
            while (string.length() > 0) {
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
            for (int i2 = 0; i2 < str.length(); i2 += 2) {
                byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            int length2 = str2.length();
            for (int i3 = 0; i3 < length; i3++) {
                byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
            }
            return new String(byteArray);
        }

        /* JADX INFO: renamed from: e */
        public static int m561e(Object obj) {
            return obj.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.Hxq$d */
    public class C0040d {

        /* JADX INFO: renamed from: a */
        public static int f198a = 315;

        /* JADX INFO: renamed from: b */
        public static String m562b(short[] sArr, int i, int i2, int i3) {
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = (char) (sArr[i + i4] ^ i3);
            }
            return new String(cArr);
        }

        /* JADX INFO: renamed from: c */
        public static int m563c(Object obj) {
            return obj.hashCode();
        }

        /* JADX INFO: renamed from: d */
        public static String m564d(String str) {
            String string = "";
            int i = 0;
            String str2 = "";
            while (i < 15) {
                string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
                String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
                i++;
                str2 = string2;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
            while (str.length() > 0) {
                byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            int length2 = str2.length();
            for (int i2 = 0; i2 < length; i2++) {
                byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
            }
            return new String(byteArray);
        }

        /* JADX INFO: renamed from: e */
        public static int m565e() {
            return (-957) ^ C0038b.f196a;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.Hxq$e */
    public class C0041e {

        /* JADX INFO: renamed from: a */
        public static int f199a = 283;

        /* JADX INFO: renamed from: b */
        public static int m566b(Object obj) {
            return obj.hashCode();
        }

        /* JADX INFO: renamed from: c */
        public static String m567c(short[] sArr, int i, int i2, int i3) {
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = (char) (sArr[i + i4] ^ i3);
            }
            return new String(cArr);
        }

        /* JADX INFO: renamed from: d */
        public static int m568d() {
            return (-389) ^ C0037a.f195a;
        }

        /* JADX INFO: renamed from: e */
        public static String m569e(String str) {
            String string = "";
            int i = 0;
            String str2 = "";
            while (i < 15) {
                string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
                String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
                i++;
                str2 = string2;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
            for (int i2 = 0; i2 < str.length(); i2 += 2) {
                byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            int length2 = str2.length();
            while (length > 0) {
                byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
            }
            for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
            }
            return new String(byteArray);
        }
    }

    static {
        SecretKeySpec secretKeySpec;
        String strM562b = C0040d.m562b(f6130short, 0, 5, 1836);
        f186d = new String[][]{new String[]{C0038b.m557e(f6130short, 5, 5, 1541), C0040d.m562b(f6130short, 10, 2, 1202)}, new String[]{C0039c.m559c(f6130short, 12, 7, 2172), C0041e.m567c(f6130short, 19, 2, 3241)}, new String[]{C0040d.m562b(f6130short, 21, 2, 2924), C0040d.m562b(f6130short, 23, 1, 1327)}, new String[]{C0038b.m557e(f6130short, 24, 2, 707), C0040d.m562b(f6130short, 26, 1, 2803)}};
        IvParameterSpec ivParameterSpec = null;
        try {
            secretKeySpec = new SecretKeySpec(C0040d.m562b(f6130short, 27, 16, 1542).getBytes(strM562b), C0041e.m567c(f6130short, 43, 3, 1995));
            try {
                ivParameterSpec = new IvParameterSpec(C0041e.m567c(f6130short, 46, 16, 2097).getBytes(strM562b));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            secretKeySpec = null;
        }
        f187e = secretKeySpec;
        f188f = ivParameterSpec;
    }

    /* JADX INFO: renamed from: a */
    public static void m530a(LinkedHashMap linkedHashMap, String str, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList3.add(new C2191b(C0039c.m559c(f6130short, 62, 4, 878), C0041e.m567c(f6130short, 66, 2, 1303), arrayList));
        }
        if (!arrayList2.isEmpty()) {
            arrayList3.add(new C2191b(C0041e.m567c(f6130short, 68, 4, 2036), C0040d.m562b(f6130short, 72, 2, 1690), arrayList2));
        }
        linkedHashMap.put(str, arrayList3);
    }

    /* JADX INFO: renamed from: g */
    public static HashMap m531g(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next, ""));
        }
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static String m532h(JSONObject jSONObject) {
        String strEncodeToString;
        JSONObject jSONObject2 = new JSONObject();
        String string = jSONObject.toString();
        try {
            Cipher cipher = Cipher.getInstance(C0041e.m567c(f6130short, 74, 20, 3230));
            cipher.init(1, f187e, f188f);
            strEncodeToString = Base64.encodeToString(cipher.doFinal(string.getBytes(C0040d.m562b(f6130short, 94, 5, 971))), 2);
        } catch (Exception e) {
            C0082a.m847r(e, new StringBuilder(C0039c.m559c(f6130short, 99, 16, 1964)));
            strEncodeToString = null;
        }
        return jSONObject2.put(C0038b.m557e(f6130short, 115, 11, 2806), strEncodeToString).toString();
    }

    /* JADX INFO: renamed from: i */
    public static JSONObject m533i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0041e.m567c(f6130short, 126, 3, 1156), C0041e.m567c(f6130short, 129, 17, 919));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: j */
    public static String m534j(JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(C0040d.m562b(f6130short, 146, 5, 2251));
        boolean z = objOpt instanceof JSONObject;
        String strM562b = C0040d.m562b(f6130short, 151, 5, 989);
        if (z) {
            JSONObject jSONObject2 = (JSONObject) objOpt;
            String strOptString = jSONObject2.optString(C0040d.m562b(f6130short, 156, 3, 1967), "");
            return strOptString.isEmpty() ? jSONObject2.optString(strM562b, "") : strOptString;
        }
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        String strOptString2 = jSONObject.optString(C0039c.m559c(f6130short, 159, 6, 3173), "");
        return strOptString2.isEmpty() ? jSONObject.optString(strM562b, "") : strOptString2;
    }

    /* JADX INFO: renamed from: k */
    public static JSONObject m535k(String str) {
        String str2;
        String strM559c = C0039c.m559c(f6130short, 165, 5, 1855);
        String strM557e = C0038b.m557e(f6130short, 170, 17, 3035);
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strOptString = new JSONObject(str).optString(C0040d.m562b(f6130short, 187, 11, 2720), "");
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            try {
                Cipher cipher = Cipher.getInstance(C0038b.m557e(f6130short, 198, 20, 1661));
                cipher.init(2, f187e, f188f);
                str2 = new String(cipher.doFinal(Base64.decode(strOptString, 0)), C0039c.m559c(f6130short, 218, 5, 3168));
            } catch (Exception e) {
                C0082a.m847r(e, new StringBuilder(C0038b.m557e(f6130short, 223, 16, 1830)));
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has(strM559c)) {
                return jSONObject;
            }
            SpiderDebug.log(strM557e + jSONObject.optString(strM559c));
            return null;
        } catch (Exception e2) {
            C0082a.m847r(e2, new StringBuilder(C0041e.m567c(f6130short, 239, 18, 392)));
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList m536l(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new C2191b.a(jSONObject.optString(C0040d.m562b(f6130short, 257, 4, 3200)), jSONObject.optString(C0038b.m557e(f6130short, 261, 5, 837))));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static Vod m537m(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(C0041e.m567c(f6130short, 266, 9, 501), "");
        if (strOptString.isEmpty()) {
            strOptString = jSONObject.optString(C0039c.m559c(f6130short, 275, 10, 1110), "");
        }
        if (strOptString.isEmpty()) {
            strOptString = jSONObject.optString(C0039c.m559c(f6130short, 285, 9, 2786), "");
        }
        return new Vod(String.valueOf(jSONObject.opt(C0041e.m567c(f6130short, 294, 3, 2435))), jSONObject.optString(C0039c.m559c(f6130short, 297, 4, 1185), ""), m534j(jSONObject), strOptString);
    }

    /* JADX INFO: renamed from: n */
    public static ArrayList m538n(JSONArray jSONArray, int i) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int iMin = i > 0 ? Math.min(jSONArray.length(), i) : jSONArray.length();
        for (int i2 = 0; i2 < iMin; i2++) {
            try {
                arrayList.add(m537m(jSONArray.getJSONObject(i2)));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String processEpisodeList(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split(C0040d.m562b(f6130short, 301, 1, 1563));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (!TextUtils.isEmpty(strTrim)) {
                sb.append(C0039c.m559c(f6130short, 302, 1, 2914) + (i + 1) + C0039c.m559c(f6130short, 303, 2, 1316) + strTrim);
                if (i + 1 < strArrSplit.length) {
                    sb.append(C0038b.m557e(f6130short, 305, 1, 2336));
                }
            }
        }
        return sb.toString();
    }

    @Override
    public Object[] proxy(Map<String, String> map) {
        int i;
        String[] strArr;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3;
        String str6;
        String strM540s;
        int i4;
        String str7 = map.get(C0038b.m557e(f6130short, 306, 3, 2074));
        if (str7 == null || str7.isEmpty()) {
            return m539r(400, C0040d.m562b(f6130short, 778, 11, 2261));
        }
        byte[] bArrDecode = Base64.decode(str7, 11);
        String strM559c = C0039c.m559c(f6130short, 309, 5, 2049);
        String[] strArrSplit = new String(bArrDecode, strM559c).split(C0038b.m557e(f6130short, 314, 6, 852));
        try {
            i = Integer.parseInt(map.get(C0041e.m567c(f6130short, 320, 3, 2581)));
        } catch (Exception unused) {
            i = 2;
        }
        int length = strArrSplit.length;
        int[] iArr = new int[length];
        String str8 = map.get(C0040d.m562b(f6130short, 323, 3, 372));
        if (str8 != null && !str8.isEmpty()) {
            String[] strArrSplit2 = str8.split(C0041e.m567c(f6130short, 326, 1, 2245));
            for (int i5 = 0; i5 < Math.min(strArrSplit2.length, length); i5++) {
                try {
                    iArr[i5] = Integer.parseInt(strArrSplit2[i5].trim());
                } catch (Exception unused2) {
                }
            }
        }
        String strM562b = C0040d.m562b(f6130short, 327, 21, 511);
        String strM559c2 = C0039c.m559c(f6130short, 348, 15, 2727);
        String strM567c = C0041e.m567c(f6130short, 363, 17, 1584);
        String strM557e = C0038b.m557e(f6130short, 380, 25, 2078);
        String strM559c3 = C0039c.m559c(f6130short, 405, 39, 2771);
        String strM567c2 = C0041e.m567c(f6130short, 444, 1, 1123);
        String strM557e2 = C0038b.m557e(f6130short, 445, 21, 2416);
        if (i == 1) {
            StringBuilder sb = new StringBuilder(C0038b.m557e(f6130short, 466, 50, 2891));
            int i6 = 0;
            int i7 = 10;
            int i8 = 0;
            boolean z = true;
            while (i6 < strArrSplit.length) {
                String strTrim = strArrSplit[i6].trim();
                if (!strTrim.isEmpty() && strTrim.startsWith(C0040d.m562b(f6130short, 516, 4, 2069))) {
                    if (i6 >= length || (i4 = iArr[i6]) <= 0) {
                        i4 = 600;
                    }
                    if (i4 > i7) {
                        i7 = i4;
                    }
                    if (!z) {
                        sb.append(strM557e2);
                    }
                    i8++;
                    sb.append(C0040d.m562b(f6130short, 520, 8, 1276));
                    sb.append(i4);
                    sb.append(C0038b.m557e(f6130short, 528, 6, 1745));
                    sb.append(strTrim);
                    sb.append(strM567c2);
                    z = false;
                }
                i6++;
                length = length;
            }
            if (i8 == 0) {
                return m539r(502, C0040d.m562b(f6130short, 534, 17, 2862));
            }
            return new Object[]{200, strM562b, new ByteArrayInputStream(C2139c.m5408a(sb.toString().replace(strM567c, strM559c3 + i7 + strM557e), strM559c2).getBytes(strM559c))};
        }
        HashMap mapM5756b = C2186v.m5756b(C0038b.m557e(f6130short, 551, 10, 3232), C0040d.m562b(f6130short, 561, 8, 1016));
        StringBuilder sb2 = new StringBuilder(C0040d.m562b(f6130short, 569, 25, 1078));
        int length2 = strArrSplit.length;
        int i9 = 0;
        int i10 = 10;
        boolean z2 = true;
        while (i9 < length2) {
            String strTrim2 = strArrSplit[i9].trim();
            if (strTrim2.isEmpty()) {
                str = strM562b;
                strArr = strArrSplit;
                i2 = length2;
                str2 = strM559c;
                i3 = i10;
                str3 = strM559c2;
                str4 = strM567c;
                str5 = strM557e;
            } else {
                strArr = strArrSplit;
                URL url = new URL(strTrim2);
                i2 = length2;
                StringBuilder sb3 = new StringBuilder();
                str = strM562b;
                sb3.append(url.getProtocol());
                String strM557e3 = C0038b.m557e(f6130short, 594, 3, 2820);
                sb3.append(strM557e3);
                str2 = strM559c;
                sb3.append(url.getHost());
                String string = sb3.toString();
                str3 = strM559c2;
                String query = url.getQuery() != null ? url.getQuery() : "";
                str4 = strM567c;
                String path = url.getPath();
                str5 = strM557e;
                String strM557e4 = C0038b.m557e(f6130short, 597, 1, 1842);
                i3 = i10;
                String strSubstring = path.contains(strM557e4) ? url.getPath().substring(0, url.getPath().lastIndexOf(47)) : "";
                String strM6073l = OkHttp.string(strTrim2, mapM5756b);
                if (strM6073l != null && !strM6073l.isEmpty()) {
                    boolean zContains = strM6073l.contains(C0040d.m562b(f6130short, 598, 17, 2267));
                    String strM559c4 = C0039c.m559c(f6130short, 615, 1, 1138);
                    str6 = strM559c3;
                    String strM557e5 = C0038b.m557e(f6130short, 616, 5, 2751);
                    if (zContains) {
                        String[] strArrSplit3 = strM6073l.split(strM557e5);
                        int length3 = strArrSplit3.length;
                        i9 = i9;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length3) {
                                strM540s = null;
                                break;
                            }
                            String[] strArr2 = strArrSplit3;
                            String strTrim3 = strArrSplit3[i11].trim();
                            if (!strTrim3.isEmpty() && !strTrim3.startsWith(strM559c4)) {
                                strM540s = m540s(strTrim3, string, strSubstring, "");
                                break;
                            }
                            i11++;
                            strArrSplit3 = strArr2;
                        }
                        if (strM540s == null || (strM6073l = OkHttp.string(strM540s, mapM5756b)) == null || strM6073l.isEmpty()) {
                            i10 = i3;
                        } else {
                            URL url2 = new URL(strM540s);
                            String str9 = url2.getProtocol() + strM557e3 + url2.getHost();
                            String strSubstring2 = url2.getPath().contains(strM557e4) ? url2.getPath().substring(0, url2.getPath().lastIndexOf(47)) : "";
                            string = str9;
                            strSubstring = strSubstring2;
                        }
                    } else {
                        i9 = i9;
                    }
                    if (!z2) {
                        sb2.append(strM557e2);
                    }
                    int i12 = i3;
                    for (String str10 : strM6073l.split(strM557e5)) {
                        String strTrim4 = str10.trim();
                        if (!strTrim4.startsWith(C0041e.m567c(f6130short, 621, 7, 959)) && !strTrim4.startsWith(C0041e.m567c(f6130short, 628, 14, 579)) && !strTrim4.startsWith(C0041e.m567c(f6130short, 642, 21, 776)) && !strTrim4.startsWith(C0040d.m562b(f6130short, 663, 21, 2453)) && !strTrim4.startsWith(C0041e.m567c(f6130short, 684, 14, 1111))) {
                            boolean zStartsWith = strTrim4.startsWith(C0039c.m559c(f6130short, 698, 11, 2217));
                            String strM559c5 = C0039c.m559c(f6130short, 709, 4, 2493);
                            if (zStartsWith && strTrim4.contains(strM559c5)) {
                                sb2.append(m541t(strTrim4, string, strSubstring, query));
                                sb2.append(strM567c2);
                            } else if (strTrim4.startsWith(C0038b.m557e(f6130short, 713, 11, 1644)) && strTrim4.contains(strM559c5)) {
                                sb2.append(m541t(strTrim4, string, strSubstring, query));
                                sb2.append(strM567c2);
                            } else if (strTrim4.isEmpty() || strTrim4.startsWith(strM559c4)) {
                                sb2.append(str10);
                                sb2.append(strM567c2);
                            } else {
                                sb2.append(m540s(strTrim4, string, strSubstring, query));
                                sb2.append(strM567c2);
                            }
                        } else if (strTrim4.startsWith(C0038b.m557e(f6130short, 724, 22, 1338))) {
                            try {
                                int i13 = Integer.parseInt(strTrim4.substring(21).trim());
                                if (i13 > i12) {
                                    i12 = i13;
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    }
                    i10 = i12;
                    z2 = false;
                }
                i9++;
                strArrSplit = strArr;
                length2 = i2;
                strM562b = str;
                strM559c = str2;
                strM559c2 = str3;
                strM567c = str4;
                strM557e = str5;
                strM559c3 = str6;
            }
            str6 = strM559c3;
            i10 = i3;
            i9++;
            strArrSplit = strArr;
            length2 = i2;
            strM562b = str;
            strM559c = str2;
            strM559c2 = str3;
            strM567c = str4;
            strM557e = str5;
            strM559c3 = str6;
        }
        String str11 = strM562b;
        String str12 = strM559c;
        int i14 = i10;
        String str13 = strM559c2;
        String str14 = strM567c;
        String str15 = strM557e;
        String str16 = strM559c3;
        if (z2) {
            return m539r(502, C0040d.m562b(f6130short, 746, 32, 2636));
        }
        return new Object[]{200, str11, new ByteArrayInputStream(C2139c.m5408a(sb2.toString().replace(str14, str16 + i14 + str15), str13).getBytes(str12))};
    }

    /* JADX INFO: renamed from: r */
    public static Object[] m539r(int i, String str) {
        return new Object[]{Integer.valueOf(i), C0040d.m562b(f6130short, 794, 10, 569), new ByteArrayInputStream(str.getBytes(C0041e.m567c(f6130short, 789, 5, 906)))};
    }

    /* JADX INFO: renamed from: s */
    public static String m540s(String str, String str2, String str3, String str4) {
        String strM5408a = str;
        if (!strM5408a.startsWith(C0039c.m559c(f6130short, 804, 4, 530))) {
            String strM559c = C0039c.m559c(f6130short, 808, 1, 2296);
            if (strM5408a.startsWith(strM559c)) {
                strM5408a = C2139c.m5408a(str2, strM5408a);
            } else {
                strM5408a = str2 + str3 + strM559c + strM5408a;
            }
        }
        if (str4.isEmpty()) {
            return strM5408a;
        }
        StringBuilder sbM5396a = C2137a.m5396a(strM5408a);
        String strM559c2 = C0039c.m559c(f6130short, 809, 1, 3183);
        if (strM5408a.contains(strM559c2)) {
            strM559c2 = C0038b.m557e(f6130short, 810, 1, 1403);
        }
        return C2174h.m5657b(sbM5396a, strM559c2, str4);
    }

    /* JADX INFO: renamed from: t */
    public static String m541t(String str, String str2, String str3, String str4) {
        int i;
        int iIndexOf;
        int iIndexOf2 = str.indexOf(C0040d.m562b(f6130short, 811, 5, 2174));
        if (iIndexOf2 < 0 || (iIndexOf = str.indexOf(34, (i = iIndexOf2 + 5))) < 0) {
            return str;
        }
        return str.substring(0, i) + m540s(str.substring(i, iIndexOf), str2, str3, str4) + str.substring(iIndexOf);
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m542b(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0041e.m567c(f6130short, 816, 3, 1616), str);
            jSONObject.put(C0038b.m557e(f6130short, 819, 4, 351), str2);
            jSONObject.put(C0040d.m562b(f6130short, 823, 2, 539), str3);
            jSONObject.put(C0039c.m559c(f6130short, 825, 2, 1322), C0041e.m567c(f6130short, 827, 1, 1918));
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put(C0041e.m567c(f6130short, 828, 3, 1734), str4);
            }
            JSONObject jSONObjectM549q = m549q(jSONObject, C0038b.m557e(f6130short, 831, 18, 1510), C0038b.m557e(f6130short, 849, 4, 1602));
            if (jSONObjectM549q == null) {
                return null;
            }
            String strM6073l = OkHttp.string(jSONObjectM549q.getString(C0039c.m559c(f6130short, 853, 3, 3017)), m531g(jSONObjectM549q.getJSONObject(C0041e.m567c(f6130short, 856, 7, 2552))));
            if (TextUtils.isEmpty(strM6073l)) {
                return null;
            }
            return new JSONObject(strM6073l);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m543c(String str, JSONObject jSONObject) {
        JSONObject jSONObjectM544d = m544d(str, jSONObject);
        if (jSONObjectM544d == null) {
            return null;
        }
        String strOptString = jSONObjectM544d.optString(C0038b.m557e(f6130short, 863, 4, 1510), "");
        if (strOptString.length() > 20) {
            return m547o(strOptString, String.valueOf(jSONObjectM544d.opt(C0040d.m562b(f6130short, 867, 2, 1418))));
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        String str3;
        int i;
        String str4 = str;
        String strM567c = C0041e.m567c(f6130short, 869, 1, 2006);
        if (str4.contains(strM567c)) {
            String[] strArrSplit = str4.split(strM567c, 2);
            String str5 = strArrSplit[0];
            str3 = strArrSplit[1];
            str4 = str5;
        } else {
            str3 = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0038b.m557e(f6130short, 870, 5, 2471), str4);
        jSONObject.put(C0040d.m562b(f6130short, 875, 4, 3129), str2);
        if (!str3.isEmpty()) {
            jSONObject.put(C0041e.m567c(f6130short, 879, 3, 910), str3);
        }
        if (map != null) {
            String strM562b = C0040d.m562b(f6130short, 882, 4, 1075);
            if (map.containsKey(strM562b)) {
                jSONObject.put(strM562b, map.get(strM562b));
            }
            String strM562b2 = C0040d.m562b(f6130short, 886, 4, 2255);
            if (map.containsKey(strM562b2)) {
                jSONObject.put(strM562b2, map.get(strM562b2));
            }
        }
        JSONObject jSONObjectM543c = m543c(C0039c.m559c(f6130short, 890, 25, 2142), jSONObject);
        if (jSONObjectM543c == null) {
            return C0082a.m814b();
        }
        ArrayList arrayListM538n = m538n(jSONObjectM543c.optJSONArray(C0038b.m557e(f6130short, 915, 10, 2561)), 0);
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused) {
            i = 1;
        }
        int i2 = jSONObjectM543c.optInt(C0040d.m562b(f6130short, 925, 4, 860), 0) > 0 ? i + 1 : i;
        return C2192c.m5796m(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(Math.max(arrayListM538n.size(), 1)), Integer.valueOf(Math.max(arrayListM538n.size(), 1) * i2), arrayListM538n);
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m544d(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectM549q = m549q(jSONObject, str, C0040d.m562b(f6130short, 929, 4, 2926));
            if (jSONObjectM549q == null) {
                return null;
            }
            String strM6073l = OkHttp.string(jSONObjectM549q.getString(C0040d.m562b(f6130short, 933, 3, 613)), m531g(jSONObjectM549q.getJSONObject(C0040d.m562b(f6130short, 936, 7, 3197))));
            if (TextUtils.isEmpty(strM6073l)) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject(strM6073l);
            if (jSONObject2.optInt(C0038b.m557e(f6130short, 943, 7, 1457), -1) == 0) {
                return jSONObject2;
            }
            return null;
        } catch (Exception e) {
            C0082a.m847r(e, new StringBuilder(C0038b.m557e(f6130short, 950, 19, 2291)));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:101:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:105:0x0400  */
    /* JADX WARN: Code duplicated, block: B:108:0x0433  */
    /* JADX WARN: Code duplicated, block: B:111:0x045d  */
    /* JADX WARN: Code duplicated, block: B:116:0x047c  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a6 A[EDGE_INSN: B:126:0x02a6->B:80:0x02a6 BREAK  A[LOOP:1: B:53:0x017d->B:79:0x0286], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x010f A[PHI: r2 r11 r13
      0x010f: PHI (r2v6 org.json.JSONObject) = (r2v5 org.json.JSONObject), (r2v5 org.json.JSONObject), (r2v5 org.json.JSONObject), (r2v11 org.json.JSONObject) binds: [B:28:0x00ee, B:29:0x00f0, B:31:0x00fa, B:35:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r11v14 int) = (r11v13 int), (r11v13 int), (r11v13 int), (r11v18 int) binds: [B:28:0x00ee, B:29:0x00f0, B:31:0x00fa, B:35:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v2 java.lang.String), (r13v4 java.lang.String), (r13v4 java.lang.String) binds: [B:28:0x00ee, B:29:0x00f0, B:31:0x00fa, B:35:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x0112 A[Catch: Exception -> 0x010d, TryCatch #1 {Exception -> 0x010d, blocks: (B:43:0x0138, B:27:0x00e8, B:30:0x00f2, B:32:0x00fc, B:35:0x0106, B:40:0x0112, B:42:0x0135, B:46:0x0143, B:48:0x014b), top: B:123:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0190  */
    /* JADX WARN: Code duplicated, block: B:57:0x0199  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0213  */
    /* JADX WARN: Code duplicated, block: B:69:0x021d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0220  */
    /* JADX WARN: Code duplicated, block: B:73:0x0227  */
    /* JADX WARN: Code duplicated, block: B:78:0x027f  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:84:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x030f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0312  */
    /* JADX WARN: Code duplicated, block: B:91:0x0324  */
    /* JADX WARN: Code duplicated, block: B:94:0x037e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0385  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a6  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01d7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x0385, please report this as an issue */
    public String detailContent(List<String> list) throws JSONException {
        String str;
        String strM545e;
        String[][] strArr;
        String[][] strArr2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int length;
        int i;
        String strM557e;
        Vod c2194e;
        int iOptInt;
        String strM557e2;
        String strOptString;
        boolean zOptBoolean;
        int iOptInt2;
        String strOptString2;
        long jOptLong;
        String strOptString3;
        int iIndexOf;
        String strM824c;
        String strConcat;
        String[] strArr3;
        StringBuilder sb;
        JSONArray jSONArray;
        String str2;
        String str3;
        int i2;
        JSONObject jSONObject;
        String strOptString4;
        String strOptString5;
        String str4;
        String str5 = list.get(0);
        JSONObject jSONObjectM544d = m544d(C0041e.m567c(f6130short, 972, 18, 2060), new JSONObject().put(C0040d.m562b(f6130short, 969, 3, 1077), str5));
        if (jSONObjectM544d == null) {
            return Result.string(new Vod());
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectM544d.optJSONObject(C0041e.m567c(f6130short, 990, 6, 1922));
        JSONArray jSONArrayOptJSONArray = jSONObjectM544d.optJSONArray(C0041e.m567c(f6130short, 996, 9, 905));
        String strM557e3 = C0038b.m557e(f6130short, 1005, 3, 1646);
        String strTrim = "";
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            str = "";
            strM545e = str;
        } else {
            String strOptString6 = jSONArrayOptJSONArray.getJSONObject(0).optString(strM557e3, "");
            if (strOptString6.isEmpty()) {
                str = strOptString6;
                strM545e = "";
            } else {
                strM545e = m545e(strOptString6);
                str = strOptString6;
            }
        }
        String strM562b = C0040d.m562b(f6130short, 1008, 7, 810);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String[][] strArr4 = f186d;
        char c = 1;
        if (!zIsEmpty && !TextUtils.isEmpty(strM545e)) {
            try {
                ArrayList arrayList3 = new ArrayList();
                String strM546f = null;
                int i3 = 0;
                while (i3 < 4) {
                    String[] strArr5 = strArr4[i3];
                    JSONObject jSONObjectM542b = m542b(str, strM545e, strArr5[c], strM546f);
                    if (jSONObjectM542b == null) {
                        strArr = strArr4;
                    } else {
                        strArr = strArr4;
                        int iOptInt3 = jSONObjectM542b.optInt(strM562b, -1);
                        if (iOptInt3 == 10401 && strM546f == null) {
                            strM546f = m546f(str);
                            if (!TextUtils.isEmpty(strM546f)) {
                                jSONObjectM542b = m542b(str, strM545e, strArr5[1], strM546f);
                                if (jSONObjectM542b != null) {
                                    iOptInt3 = jSONObjectM542b.optInt(strM562b, -1);
                                    if (iOptInt3 != 0) {
                                        arrayList3.add(strArr5);
                                    }
                                }
                            } else if (iOptInt3 != 0) {
                                arrayList3.add(strArr5);
                            }
                        } else if (iOptInt3 != 0 && String.valueOf(jSONObjectM542b.optInt(C0041e.m567c(f6130short, 1015, 7, 495), -1)).equals(strArr5[1])) {
                            arrayList3.add(strArr5);
                        }
                    }
                    try {
                        i3++;
                        strArr4 = strArr;
                        c = 1;
                    } catch (Exception e) {
                        e = e;
                        C0082a.m847r(e, new StringBuilder(C0038b.m557e(f6130short, 1022, 18, 558)));
                        strArr2 = strArr;
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        length = strArr2.length;
                        i = 0;
                        while (true) {
                            strM557e = C0038b.m557e(f6130short, 1040, 1, 823);
                            if (i >= length) {
                                break;
                            }
                            strArr3 = strArr2[i];
                            sb = new StringBuilder();
                            if (jSONArrayOptJSONArray != null) {
                                str3 = strM545e;
                                i2 = 0;
                                while (i2 < jSONArrayOptJSONArray.length()) {
                                    jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                                    JSONArray jSONArray2 = jSONArrayOptJSONArray;
                                    strOptString4 = jSONObject.optString(strM557e3, "");
                                    if (strOptString4.isEmpty()) {
                                        length = length;
                                        strArr2 = strArr2;
                                    } else {
                                        strOptString5 = jSONObject.optString(C0039c.m559c(f6130short, 1041, 5, 1628), "");
                                        if (strOptString5.isEmpty()) {
                                            strOptString5 = C0040d.m562b(f6130short, 1046, 1, 991) + jSONObject.optInt(C0039c.m559c(f6130short, 1047, 8, 980), i2 + 1) + strM557e;
                                        }
                                        if (strOptString4.equals(str)) {
                                            str4 = str3;
                                        } else {
                                            str4 = "";
                                        }
                                        if (sb.length() > 0) {
                                            sb.append(C0038b.m557e(f6130short, 1055, 1, 3188));
                                        }
                                        String strM562b2 = C0040d.m562b(f6130short, 1056, 1, 1499);
                                        String strM562b3 = C0040d.m562b(f6130short, 1057, 3, 3066);
                                        C2188x.m5787a(sb, strOptString5, strM562b2, str5, strM562b3);
                                        C2188x.m5787a(sb, strOptString4, strM562b3, str4, strM562b3);
                                        sb.append(strArr3[1]);
                                    }
                                    i2++;
                                    jSONArrayOptJSONArray = jSONArray2;
                                    strM557e3 = strM557e3;
                                    length = length;
                                    strArr2 = strArr2;
                                }
                                jSONArray = jSONArrayOptJSONArray;
                                str2 = strM557e3;
                            } else {
                                jSONArray = jSONArrayOptJSONArray;
                                str2 = strM557e3;
                                str3 = strM545e;
                            }
                            int i4 = length;
                            String[][] strArr6 = strArr2;
                            arrayList.add(strArr3[0]);
                            arrayList2.add(processEpisodeList(sb.toString()));
                            i++;
                            strM545e = str3;
                            jSONArrayOptJSONArray = jSONArray;
                            strM557e3 = str2;
                            length = i4;
                            strArr2 = strArr6;
                        }
                        c2194e = new Vod();
                        if (jSONObjectOptJSONObject != null) {
                            c2194e.m5848j(str5);
                            c2194e.m5849k(jSONObjectOptJSONObject.optString(C0040d.m562b(f6130short, 1060, 4, 2190), ""));
                            c2194e.m5850l(m534j(jSONObjectOptJSONObject));
                            iOptInt = jSONObjectOptJSONObject.optInt(C0040d.m562b(f6130short, 1064, 8, 862), 0);
                            if (iOptInt == 1) {
                                strM557e2 = C0038b.m557e(f6130short, 1072, 2, 1393);
                            } else if (iOptInt == 2) {
                                strM557e2 = C0040d.m562b(f6130short, 1074, 2, 3130);
                            } else if (iOptInt == 3) {
                                strM557e2 = C0038b.m557e(f6130short, 1076, 2, 2594);
                            } else {
                                strM557e2 = "";
                            }
                            c2194e.m5842e(strM557e2);
                            c2194e.m5845g(C0040d.m562b(f6130short, 1078, 2, 387));
                            strOptString = jSONObjectOptJSONObject.optString(C0039c.m559c(f6130short, 1080, 9, 1204), "");
                            zOptBoolean = jSONObjectOptJSONObject.optBoolean(C0039c.m559c(f6130short, 1089, 10, 2247), false);
                            iOptInt2 = jSONObjectOptJSONObject.optInt(C0039c.m559c(f6130short, 1099, 5, 1295), 0);
                            if (iOptInt2 > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                if (zOptBoolean) {
                                    strM824c = iOptInt2 + C0041e.m567c(f6130short, 1104, 2, 1988);
                                } else {
                                    strM824c = C0082a.m824c(iOptInt2, C0039c.m559c(f6130short, 1106, 3, 2662), strM557e);
                                }
                                sb2.append(strM824c);
                                if (strOptString.isEmpty()) {
                                    strConcat = "";
                                } else {
                                    strConcat = C0039c.m559c(f6130short, 1109, 3, 1085).concat(strOptString);
                                }
                                sb2.append(strConcat);
                                strOptString = sb2.toString();
                            }
                            c2194e.m5853o(strOptString);
                            strOptString2 = jSONObjectOptJSONObject.optString(C0040d.m562b(f6130short, 1112, 4, 1187), "");
                            if (!strOptString2.isEmpty()) {
                                c2194e.m5843f(strOptString2.replaceAll(C0038b.m557e(f6130short, 1116, 12, 1604), ""));
                            }
                            jOptLong = jSONObjectOptJSONObject.optLong(C0038b.m557e(f6130short, 1128, 11, 2553), 0L);
                            if (jOptLong > 0) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(jOptLong);
                                c2194e.m5855q(String.valueOf(calendar.get(1)));
                            }
                            strOptString3 = jSONObjectOptJSONObject.optString(C0039c.m559c(f6130short, 1139, 5, 2567), "");
                            if (strOptString3 != null) {
                                iIndexOf = strOptString3.indexOf(C0040d.m562b(f6130short, 1144, 4, 1407));
                                if (iIndexOf > 0) {
                                    strOptString3 = strOptString3.substring(0, iIndexOf);
                                }
                                strTrim = strOptString3.replaceAll(C0041e.m567c(f6130short, 1148, 7, 2094), "").replace(C0040d.m562b(f6130short, 1155, 6, 1104), C0038b.m557e(f6130short, 1161, 1, 3083)).replace(C0038b.m557e(f6130short, 1162, 8, 2737), C0039c.m559c(f6130short, 1170, 1, 2939)).replace(C0041e.m567c(f6130short, 1171, 5, 1518), C0041e.m567c(f6130short, 1176, 1, 3197)).replace(C0039c.m559c(f6130short, 1177, 4, 2113), C0040d.m562b(f6130short, 1181, 1, 712)).replace(C0040d.m562b(f6130short, 1182, 4, 564), C0041e.m567c(f6130short, 1186, 1, 779)).trim();
                            }
                            c2194e.m5846h(strTrim);
                        }
                        String strM557e4 = C0038b.m557e(f6130short, 1187, 3, 338);
                        c2194e.m5851m(TextUtils.join(strM557e4, arrayList));
                        c2194e.m5852n(TextUtils.join(strM557e4, arrayList2));
                        return Result.string(c2194e);
                    }
                }
                strArr = strArr4;
                if (!arrayList3.isEmpty()) {
                    strArr2 = (String[][]) arrayList3.toArray(new String[0][]);
                }
                while (true) {
                    strM557e = C0038b.m557e(f6130short, 1040, 1, 823);
                    if (i >= length) {
                        break;
                        break;
                    }
                    strArr3 = strArr2[i];
                    sb = new StringBuilder();
                    if (jSONArrayOptJSONArray != null) {
                        str3 = strM545e;
                        i2 = 0;
                        while (i2 < jSONArrayOptJSONArray.length()) {
                            jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                            JSONArray jSONArray3 = jSONArrayOptJSONArray;
                            strOptString4 = jSONObject.optString(strM557e3, "");
                            if (strOptString4.isEmpty()) {
                                length = length;
                                strArr2 = strArr2;
                            } else {
                                strOptString5 = jSONObject.optString(C0039c.m559c(f6130short, 1041, 5, 1628), "");
                                if (strOptString5.isEmpty()) {
                                    strOptString5 = C0040d.m562b(f6130short, 1046, 1, 991) + jSONObject.optInt(C0039c.m559c(f6130short, 1047, 8, 980), i2 + 1) + strM557e;
                                }
                                if (strOptString4.equals(str)) {
                                    str4 = str3;
                                } else {
                                    str4 = "";
                                }
                                if (sb.length() > 0) {
                                    sb.append(C0038b.m557e(f6130short, 1055, 1, 3188));
                                }
                                String strM562b4 = C0040d.m562b(f6130short, 1056, 1, 1499);
                                String strM562b5 = C0040d.m562b(f6130short, 1057, 3, 3066);
                                C2188x.m5787a(sb, strOptString5, strM562b4, str5, strM562b5);
                                C2188x.m5787a(sb, strOptString4, strM562b5, str4, strM562b5);
                                sb.append(strArr3[1]);
                            }
                            i2++;
                            jSONArrayOptJSONArray = jSONArray3;
                            strM557e3 = strM557e3;
                            length = length;
                            strArr2 = strArr2;
                        }
                        jSONArray = jSONArrayOptJSONArray;
                        str2 = strM557e3;
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                        str2 = strM557e3;
                        str3 = strM545e;
                    }
                    int i5 = length;
                    String[][] strArr7 = strArr2;
                    arrayList.add(strArr3[0]);
                    arrayList2.add(processEpisodeList(sb.toString()));
                    i++;
                    strM545e = str3;
                    jSONArrayOptJSONArray = jSONArray;
                    strM557e3 = str2;
                    length = i5;
                    strArr2 = strArr7;
                }
            } catch (Exception e2) {
                e = e2;
                strArr = strArr4;
            }
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            length = strArr2.length;
            i = 0;
            c2194e = new Vod();
            if (jSONObjectOptJSONObject != null) {
                c2194e.m5848j(str5);
                c2194e.m5849k(jSONObjectOptJSONObject.optString(C0040d.m562b(f6130short, 1060, 4, 2190), ""));
                c2194e.m5850l(m534j(jSONObjectOptJSONObject));
                iOptInt = jSONObjectOptJSONObject.optInt(C0040d.m562b(f6130short, 1064, 8, 862), 0);
                if (iOptInt == 1) {
                    strM557e2 = C0038b.m557e(f6130short, 1072, 2, 1393);
                } else if (iOptInt == 2) {
                    strM557e2 = C0040d.m562b(f6130short, 1074, 2, 3130);
                } else if (iOptInt == 3) {
                    strM557e2 = C0038b.m557e(f6130short, 1076, 2, 2594);
                } else {
                    strM557e2 = "";
                }
                c2194e.m5842e(strM557e2);
                c2194e.m5845g(C0040d.m562b(f6130short, 1078, 2, 387));
                strOptString = jSONObjectOptJSONObject.optString(C0039c.m559c(f6130short, 1080, 9, 1204), "");
                zOptBoolean = jSONObjectOptJSONObject.optBoolean(C0039c.m559c(f6130short, 1089, 10, 2247), false);
                iOptInt2 = jSONObjectOptJSONObject.optInt(C0039c.m559c(f6130short, 1099, 5, 1295), 0);
                if (iOptInt2 > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    if (zOptBoolean) {
                        strM824c = iOptInt2 + C0041e.m567c(f6130short, 1104, 2, 1988);
                    } else {
                        strM824c = C0082a.m824c(iOptInt2, C0039c.m559c(f6130short, 1106, 3, 2662), strM557e);
                    }
                    sb3.append(strM824c);
                    if (strOptString.isEmpty()) {
                        strConcat = "";
                    } else {
                        strConcat = C0039c.m559c(f6130short, 1109, 3, 1085).concat(strOptString);
                    }
                    sb3.append(strConcat);
                    strOptString = sb3.toString();
                }
                c2194e.m5853o(strOptString);
                strOptString2 = jSONObjectOptJSONObject.optString(C0040d.m562b(f6130short, 1112, 4, 1187), "");
                if (!strOptString2.isEmpty()) {
                    c2194e.m5843f(strOptString2.replaceAll(C0038b.m557e(f6130short, 1116, 12, 1604), ""));
                }
                jOptLong = jSONObjectOptJSONObject.optLong(C0038b.m557e(f6130short, 1128, 11, 2553), 0L);
                if (jOptLong > 0) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(jOptLong);
                    c2194e.m5855q(String.valueOf(calendar2.get(1)));
                }
                strOptString3 = jSONObjectOptJSONObject.optString(C0039c.m559c(f6130short, 1139, 5, 2567), "");
                if (strOptString3 != null && !strOptString3.isEmpty()) {
                    iIndexOf = strOptString3.indexOf(C0040d.m562b(f6130short, 1144, 4, 1407));
                    if (iIndexOf > 0) {
                        strOptString3 = strOptString3.substring(0, iIndexOf);
                    }
                    strTrim = strOptString3.replaceAll(C0041e.m567c(f6130short, 1148, 7, 2094), "").replace(C0040d.m562b(f6130short, 1155, 6, 1104), C0038b.m557e(f6130short, 1161, 1, 3083)).replace(C0038b.m557e(f6130short, 1162, 8, 2737), C0039c.m559c(f6130short, 1170, 1, 2939)).replace(C0041e.m567c(f6130short, 1171, 5, 1518), C0041e.m567c(f6130short, 1176, 1, 3197)).replace(C0039c.m559c(f6130short, 1177, 4, 2113), C0040d.m562b(f6130short, 1181, 1, 712)).replace(C0040d.m562b(f6130short, 1182, 4, 564), C0041e.m567c(f6130short, 1186, 1, 779)).trim();
                }
                c2194e.m5846h(strTrim);
            }
            String strM557e5 = C0038b.m557e(f6130short, 1187, 3, 338);
            c2194e.m5851m(TextUtils.join(strM557e5, arrayList));
            c2194e.m5852n(TextUtils.join(strM557e5, arrayList2));
            return Result.string(c2194e);
        }
        strArr = strArr4;
        strArr2 = strArr;
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        length = strArr2.length;
        i = 0;
        while (true) {
            strM557e = C0038b.m557e(f6130short, 1040, 1, 823);
            if (i >= length) {
                break;
                break;
            }
            strArr3 = strArr2[i];
            sb = new StringBuilder();
            if (jSONArrayOptJSONArray != null) {
                str3 = strM545e;
                i2 = 0;
                while (i2 < jSONArrayOptJSONArray.length()) {
                    jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                    JSONArray jSONArray4 = jSONArrayOptJSONArray;
                    strOptString4 = jSONObject.optString(strM557e3, "");
                    if (strOptString4.isEmpty()) {
                        length = length;
                        strArr2 = strArr2;
                    } else {
                        strOptString5 = jSONObject.optString(C0039c.m559c(f6130short, 1041, 5, 1628), "");
                        if (strOptString5.isEmpty()) {
                            strOptString5 = C0040d.m562b(f6130short, 1046, 1, 991) + jSONObject.optInt(C0039c.m559c(f6130short, 1047, 8, 980), i2 + 1) + strM557e;
                        }
                        if (strOptString4.equals(str)) {
                            str4 = str3;
                        } else {
                            str4 = "";
                        }
                        if (sb.length() > 0) {
                            sb.append(C0038b.m557e(f6130short, 1055, 1, 3188));
                        }
                        String strM562b6 = C0040d.m562b(f6130short, 1056, 1, 1499);
                        String strM562b7 = C0040d.m562b(f6130short, 1057, 3, 3066);
                        C2188x.m5787a(sb, strOptString5, strM562b6, str5, strM562b7);
                        C2188x.m5787a(sb, strOptString4, strM562b7, str4, strM562b7);
                        sb.append(strArr3[1]);
                    }
                    i2++;
                    jSONArrayOptJSONArray = jSONArray4;
                    strM557e3 = strM557e3;
                    length = length;
                    strArr2 = strArr2;
                }
                jSONArray = jSONArrayOptJSONArray;
                str2 = strM557e3;
            } else {
                jSONArray = jSONArrayOptJSONArray;
                str2 = strM557e3;
                str3 = strM545e;
            }
            int i6 = length;
            String[][] strArr8 = strArr2;
            arrayList.add(strArr3[0]);
            arrayList2.add(processEpisodeList(sb.toString()));
            i++;
            strM545e = str3;
            jSONArrayOptJSONArray = jSONArray;
            strM557e3 = str2;
            length = i6;
            strArr2 = strArr8;
        }
        c2194e = new Vod();
        if (jSONObjectOptJSONObject != null) {
            c2194e.m5848j(str5);
            c2194e.m5849k(jSONObjectOptJSONObject.optString(C0040d.m562b(f6130short, 1060, 4, 2190), ""));
            c2194e.m5850l(m534j(jSONObjectOptJSONObject));
            iOptInt = jSONObjectOptJSONObject.optInt(C0040d.m562b(f6130short, 1064, 8, 862), 0);
            if (iOptInt == 1) {
                strM557e2 = C0038b.m557e(f6130short, 1072, 2, 1393);
            } else if (iOptInt == 2) {
                strM557e2 = C0040d.m562b(f6130short, 1074, 2, 3130);
            } else if (iOptInt == 3) {
                strM557e2 = C0038b.m557e(f6130short, 1076, 2, 2594);
            } else {
                strM557e2 = "";
            }
            c2194e.m5842e(strM557e2);
            c2194e.m5845g(C0040d.m562b(f6130short, 1078, 2, 387));
            strOptString = jSONObjectOptJSONObject.optString(C0039c.m559c(f6130short, 1080, 9, 1204), "");
            zOptBoolean = jSONObjectOptJSONObject.optBoolean(C0039c.m559c(f6130short, 1089, 10, 2247), false);
            iOptInt2 = jSONObjectOptJSONObject.optInt(C0039c.m559c(f6130short, 1099, 5, 1295), 0);
            if (iOptInt2 > 0) {
                StringBuilder sb4 = new StringBuilder();
                if (zOptBoolean) {
                    strM824c = iOptInt2 + C0041e.m567c(f6130short, 1104, 2, 1988);
                } else {
                    strM824c = C0082a.m824c(iOptInt2, C0039c.m559c(f6130short, 1106, 3, 2662), strM557e);
                }
                sb4.append(strM824c);
                if (strOptString.isEmpty()) {
                    strConcat = "";
                } else {
                    strConcat = C0039c.m559c(f6130short, 1109, 3, 1085).concat(strOptString);
                }
                sb4.append(strConcat);
                strOptString = sb4.toString();
            }
            c2194e.m5853o(strOptString);
            strOptString2 = jSONObjectOptJSONObject.optString(C0040d.m562b(f6130short, 1112, 4, 1187), "");
            if (!strOptString2.isEmpty()) {
                c2194e.m5843f(strOptString2.replaceAll(C0038b.m557e(f6130short, 1116, 12, 1604), ""));
            }
            jOptLong = jSONObjectOptJSONObject.optLong(C0038b.m557e(f6130short, 1128, 11, 2553), 0L);
            if (jOptLong > 0) {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(jOptLong);
                c2194e.m5855q(String.valueOf(calendar3.get(1)));
            }
            strOptString3 = jSONObjectOptJSONObject.optString(C0039c.m559c(f6130short, 1139, 5, 2567), "");
            if (strOptString3 != null) {
                iIndexOf = strOptString3.indexOf(C0040d.m562b(f6130short, 1144, 4, 1407));
                if (iIndexOf > 0) {
                    strOptString3 = strOptString3.substring(0, iIndexOf);
                }
                strTrim = strOptString3.replaceAll(C0041e.m567c(f6130short, 1148, 7, 2094), "").replace(C0040d.m562b(f6130short, 1155, 6, 1104), C0038b.m557e(f6130short, 1161, 1, 3083)).replace(C0038b.m557e(f6130short, 1162, 8, 2737), C0039c.m559c(f6130short, 1170, 1, 2939)).replace(C0041e.m567c(f6130short, 1171, 5, 1518), C0041e.m567c(f6130short, 1176, 1, 3197)).replace(C0039c.m559c(f6130short, 1177, 4, 2113), C0040d.m562b(f6130short, 1181, 1, 712)).replace(C0040d.m562b(f6130short, 1182, 4, 564), C0041e.m567c(f6130short, 1186, 1, 779)).trim();
            }
            c2194e.m5846h(strTrim);
        }
        String strM557e6 = C0038b.m557e(f6130short, 1187, 3, 338);
        c2194e.m5851m(TextUtils.join(strM557e6, arrayList));
        c2194e.m5852n(TextUtils.join(strM557e6, arrayList2));
        return Result.string(c2194e);
    }

    /* JADX INFO: renamed from: e */
    public final String m545e(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0038b.m557e(f6130short, 1190, 3, 2463), str);
            jSONObject.put(C0040d.m562b(f6130short, 1193, 5, 2404), "");
            JSONObject jSONObjectM543c = m543c(C0040d.m562b(f6130short, 1198, 27, 1299), jSONObject);
            if (jSONObjectM543c == null || (jSONObjectOptJSONObject = jSONObjectM543c.optJSONObject(C0041e.m567c(f6130short, 1225, 8, 470))) == null) {
                return "";
            }
            Object objOpt = jSONObjectOptJSONObject.opt(C0040d.m562b(f6130short, 1233, 7, 685));
            if (objOpt instanceof JSONArray) {
                jSONArray = (JSONArray) objOpt;
            } else if (objOpt instanceof String) {
                try {
                    jSONArray = new JSONArray((String) objOpt);
                } catch (Exception unused) {
                    jSONArray = null;
                }
            } else {
                jSONArray = null;
            }
            return (jSONArray == null || jSONArray.length() <= 0) ? "" : jSONArray.getJSONObject(0).optString(C0038b.m557e(f6130short, 1240, 4, 1074), "");
        } catch (Exception e) {
            C0082a.m847r(e, new StringBuilder(C0041e.m567c(f6130short, 1244, 20, 2292)));
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m546f(String str) {
        String strOptString;
        JSONObject jSONObjectM547o;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectM547o2;
        String strM562b = C0040d.m562b(f6130short, 1264, 7, 1635);
        String strM567c = C0041e.m567c(f6130short, 1271, 7, 789);
        String strM567c2 = C0041e.m567c(f6130short, 1278, 3, 1381);
        String strM562b2 = C0040d.m562b(f6130short, 1281, 5, 3213);
        String strM567c3 = C0041e.m567c(f6130short, 1286, 7, 2314);
        HashMap map = this.f190b;
        String str2 = (String) map.get(str);
        HashMap map2 = this.f191c;
        Long l = (Long) map2.get(str);
        if (!TextUtils.isEmpty(str2) && l != null && System.currentTimeMillis() < l.longValue()) {
            return str2;
        }
        try {
            Object objM559c = C0039c.m559c(f6130short, 1293, 14, 1858);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(strM562b2, objM559c);
            JSONObject jSONObjectM549q = m549q(jSONObject, C0041e.m567c(f6130short, 1307, 19, 1694), C0038b.m557e(f6130short, 1326, 5, 790));
            if (jSONObjectM549q == null) {
                return "";
            }
            String strM6073l = OkHttp.string(jSONObjectM549q.getString(strM567c2), m531g(jSONObjectM549q.getJSONObject(strM567c)));
            if (TextUtils.isEmpty(strM6073l)) {
                return "";
            }
            JSONObject jSONObject2 = new JSONObject(strM6073l);
            if (jSONObject2.optInt(strM562b, -1) != 0) {
                return "";
            }
            String strOptString2 = jSONObject2.optString(strM567c3, "");
            boolean zIsEmpty = TextUtils.isEmpty(strOptString2);
            String strM562b3 = C0040d.m562b(f6130short, 1331, 2, 1697);
            String strM559c = C0039c.m559c(f6130short, 1333, 4, 1735);
            if (zIsEmpty && jSONObject2.has(strM559c) && (jSONObjectM547o2 = m547o(jSONObject2.optString(strM559c, ""), String.valueOf(jSONObject2.opt(strM562b3)))) != null) {
                strOptString2 = jSONObjectM547o2.optString(strM567c3, "");
            }
            if (TextUtils.isEmpty(strOptString2)) {
                return "";
            }
            JSONObject jSONObjectM533i = m533i();
            jSONObjectM533i.put(strM567c3, strOptString2);
            jSONObjectM533i.put(strM562b2, objM559c);
            jSONObjectM533i.put(C0040d.m562b(f6130short, 1337, 3, 2466), str);
            JSONObject jSONObjectM548p = m548p(C0038b.m557e(f6130short, 1340, 8, 2224), jSONObjectM533i);
            if (jSONObjectM548p == null) {
                return "";
            }
            String strM6076a = C2238b.m6066f(jSONObjectM548p.getString(strM567c2), jSONObjectM548p.getString(C0038b.m557e(f6130short, 1348, 4, 821)), m531g(jSONObjectM548p.getJSONObject(strM567c))).m6076a();
            if (TextUtils.isEmpty(strM6076a)) {
                return "";
            }
            JSONObject jSONObject3 = new JSONObject(strM6076a);
            if (jSONObject3.optInt(strM562b, -1) != 0) {
                return "";
            }
            int iOptInt = 21600;
            if (!jSONObject3.has(strM559c) || !(jSONObject3.opt(strM559c) instanceof String) || (jSONObjectM547o = m547o(jSONObject3.optString(strM559c, ""), String.valueOf(jSONObject3.opt(strM562b3)))) == null || (jSONObjectOptJSONObject = jSONObjectM547o.optJSONObject(C0039c.m559c(f6130short, 1352, 15, 630))) == null) {
                strOptString = "";
            } else {
                strOptString = jSONObjectOptJSONObject.optString(C0038b.m557e(f6130short, 1367, 5, 352), "");
                iOptInt = jSONObjectOptJSONObject.optInt(C0040d.m562b(f6130short, 1372, 10, 3105), jSONObjectOptJSONObject.optInt(C0041e.m567c(f6130short, 1382, 7, 3052), 21600));
            }
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            map.put(str, strOptString);
            map2.put(str, Long.valueOf(((((long) iOptInt) * 1000) + System.currentTimeMillis()) - 60000));
            return strOptString;
        } catch (Exception e) {
            C0082a.m847r(e, new StringBuilder(C0041e.m567c(f6130short, 1389, 27, 710)));
            return "";
        }
    }

    public String homeContent(boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strM562b = C0040d.m562b(f6130short, 1416, 5, 1280);
        String strM562b2 = C0040d.m562b(f6130short, 1421, 1, 2642);
        jSONObject.put(strM562b, strM562b2);
        jSONObject.put(C0038b.m557e(f6130short, 1422, 4, 1550), strM562b2);
        JSONObject jSONObjectM543c = m543c(C0038b.m557e(f6130short, 1426, 25, 761), jSONObject);
        if (jSONObjectM543c == null) {
            return C0082a.m814b();
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayListM536l = m536l(jSONObjectM543c.optJSONArray(C0040d.m562b(f6130short, 1451, 5, 450)));
        ArrayList arrayListM536l2 = m536l(jSONObjectM543c.optJSONArray(C0040d.m562b(f6130short, 1456, 5, 741)));
        JSONArray jSONArrayOptJSONArray = jSONObjectM543c.optJSONArray(C0038b.m557e(f6130short, 1461, 6, 2324));
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                String strValueOf = String.valueOf(jSONObject2.opt(strM562b));
                StringBuilder sb = new StringBuilder();
                String strM557e = C0038b.m557e(f6130short, 1467, 4, 632);
                sb.append(jSONObject2.optString(strM557e, ""));
                String strM557e2 = C0038b.m557e(f6130short, 1471, 2, 2861);
                sb.append(strM557e2);
                String str = strM562b;
                arrayList.add(new Class(strValueOf, sb.toString(), null));
                if (z) {
                    m530a(linkedHashMap, strValueOf, arrayListM536l, arrayListM536l2);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(C0038b.m557e(f6130short, 1473, 5, 2395));
                if (jSONArrayOptJSONArray2 != null) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < jSONArrayOptJSONArray2.length() && i3 < 5) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i2);
                        String strOptString = jSONObject3.optString(strM557e, "");
                        JSONArray jSONArray = jSONArrayOptJSONArray;
                        String strValueOf2 = String.valueOf(jSONObject3.opt(C0038b.m557e(f6130short, 1478, 5, 1675)));
                        if (!C0039c.m559c(f6130short, 1483, 2, 2030).equals(strValueOf2) && !strM557e2.equals(strOptString) && !C0039c.m559c(f6130short, 1485, 2, 967).equals(strOptString)) {
                            String strM5754a = C2185u.m5754a(strValueOf, C0039c.m559c(f6130short, 1487, 1, 3067), strValueOf2);
                            C0082a.m848s(strM5754a, strOptString, null, arrayList);
                            if (z) {
                                m530a(linkedHashMap, strM5754a, arrayListM536l, arrayListM536l2);
                            }
                            i3++;
                        }
                        i2++;
                        jSONArrayOptJSONArray = jSONArray;
                    }
                }
                i++;
                strM562b = str;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
            }
        }
        return C2192c.m5801q(arrayList, (List) m538n(jSONObjectM543c.optJSONArray(C0039c.m559c(f6130short, 1488, 10, 2185)), 20), linkedHashMap);
    }

    public void init(Context context, String str) {
        String str2 = str;
        super.init(context, str2);
        if (!TextUtils.isEmpty(str2)) {
            String strM840j = C0082a.m840j(str2);
            if (!TextUtils.isEmpty(strM840j)) {
                str2 = strM840j;
            }
            this.f189a = str2;
            if (str2.endsWith(C0040d.m562b(f6130short, 1498, 1, 1629))) {
                String str3 = this.f189a;
                this.f189a = str3.substring(0, str3.length() - 1);
            }
        }
        try {
            JSONObject jSONObjectM548p = m548p(C0041e.m567c(f6130short, 1499, 8, 2386), m533i());
            if (jSONObjectM548p != null) {
                jSONObjectM548p.optString(C0038b.m557e(f6130short, 1507, 4, 523), "");
            }
        } catch (Exception e) {
            C0082a.m847r(e, new StringBuilder(C0040d.m562b(f6130short, 1511, 17, 2309)));
        }
    }

    /* JADX INFO: renamed from: o */
    public final JSONObject m547o(String str, String str2) {
        JSONObject jSONObjectM533i = m533i();
        try {
            jSONObjectM533i.put(C0040d.m562b(f6130short, 1528, 4, 2309), str);
            jSONObjectM533i.put(C0040d.m562b(f6130short, 1532, 2, 2995), str2);
        } catch (Exception unused) {
        }
        JSONObject jSONObjectM548p = m548p(C0038b.m557e(f6130short, 1534, 8, 1427), jSONObjectM533i);
        if (jSONObjectM548p != null) {
            return jSONObjectM548p.optJSONObject(C0039c.m559c(f6130short, 1542, 6, 1002));
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final JSONObject m548p(String str, JSONObject jSONObject) {
        try {
            return m535k(C2238b.m6066f(this.f189a + C0040d.m562b(f6130short, 1548, 4, 2775) + str, m532h(jSONObject), null).m6076a());
        } catch (Exception e) {
            C0082a.m847r(e, C0082a.m833e(C0039c.m559c(f6130short, 1552, 14, 973), str, C0040d.m562b(f6130short, 1566, 4, 1475)));
            return null;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        JSONArray jSONArrayOptJSONArray;
        if (!TextUtils.isEmpty(str2)) {
            String strM567c = C0041e.m567c(f6130short, 1570, 3, 2401);
            if (str2.contains(strM567c)) {
                String[] strArrSplit = str2.split(C0041e.m567c(f6130short, 1573, 6, 2403), -1);
                String str3 = strArrSplit.length > 1 ? strArrSplit[1] : "";
                String strM545e = strArrSplit.length > 2 ? strArrSplit[2] : "";
                String strM567c2 = strArrSplit.length > 3 ? strArrSplit[3] : C0041e.m567c(f6130short, 1579, 2, 1622);
                if (TextUtils.isEmpty(str3)) {
                    return new C2192c().toString();
                }
                if (TextUtils.isEmpty(strM545e)) {
                    strM545e = m545e(str3);
                }
                if (!TextUtils.isEmpty(strM545e)) {
                    String strM557e = C0038b.m557e(f6130short, 1581, 4, 597);
                    int i = 0;
                    V4Result v4Result = null;
                    try {
                        JSONObject jSONObjectM542b = m542b(str3, strM545e, strM567c2, null);
                        String strM557e2 = C0038b.m557e(f6130short, 1585, 7, 2886);
                        if (jSONObjectM542b != null && jSONObjectM542b.optInt(strM557e2, -1) == 10401) {
                            String strM546f = m546f(str3);
                            if (!TextUtils.isEmpty(strM546f)) {
                                jSONObjectM542b = m542b(str3, strM545e, strM567c2, strM546f);
                            }
                        }
                        if (jSONObjectM542b != null && jSONObjectM542b.optInt(strM557e2, -1) == 0 && (jSONArrayOptJSONArray = jSONObjectM542b.optJSONArray(C0039c.m559c(f6130short, 1592, 5, 1601))) != null && jSONArrayOptJSONArray.length() != 0) {
                            V4Result v4Result2 = new V4Result();
                            v4Result2.f192a = jSONObjectM542b.optInt(C0039c.m559c(f6130short, 1597, 6, 2417), 2);
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                                int iOptInt = jSONObject.optInt(C0041e.m567c(f6130short, 1603, 8, 1344), 0);
                                String strOptString = jSONObject.optString(strM557e, "");
                                if (!TextUtils.isEmpty(strOptString)) {
                                    JSONObject jSONObjectM533i = m533i();
                                    try {
                                        jSONObjectM533i.put(strM557e, strOptString);
                                    } catch (Exception unused) {
                                    }
                                    JSONObject jSONObjectM548p = m548p(C0038b.m557e(f6130short, 1611, 8, 1595), jSONObjectM533i);
                                    JSONObject jSONObjectOptJSONObject = jSONObjectM548p != null ? jSONObjectM548p.optJSONObject(C0039c.m559c(f6130short, 1619, 6, 1120)) : null;
                                    if (jSONObjectOptJSONObject != null) {
                                        String strOptString2 = jSONObjectOptJSONObject.optString(C0040d.m562b(f6130short, 1625, 7, 1128), "");
                                        if (!strOptString2.isEmpty()) {
                                            v4Result2.f193b.add(strOptString2);
                                            v4Result2.f194c.add(Integer.valueOf(iOptInt));
                                        }
                                    }
                                }
                            }
                            if (!v4Result2.f193b.isEmpty()) {
                                v4Result = v4Result2;
                            }
                        }
                    } catch (Exception e) {
                        C0082a.m847r(e, new StringBuilder(C0039c.m559c(f6130short, 1632, 18, 2308)));
                    }
                    if (v4Result != null) {
                        ArrayList arrayList = v4Result.f193b;
                        if (!arrayList.isEmpty()) {
                            HashMap mapM5756b = C2186v.m5756b(C0040d.m562b(f6130short, 1650, 10, 2423), C0041e.m567c(f6130short, 1660, 8, 686));
                            if (v4Result.f192a == 1 && arrayList.size() == 1) {
                                C2192c c2192c = new C2192c();
                                c2192c.m5830w((String) arrayList.get(0));
                                c2192c.m5812e((Map) mapM5756b);
                                return C2137a.addDanmaku(c2192c.toString());
                            }
                            String strEncodeToString = Base64.encodeToString(TextUtils.join(strM567c, arrayList).getBytes(C0041e.m567c(f6130short, 1668, 5, 1874)), 11);
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                ArrayList arrayList2 = v4Result.f194c;
                                if (i >= arrayList2.size()) {
                                    String str4 = Proxy.getUrl() + C0041e.m567c(f6130short, 1674, 12, 1723) + strEncodeToString + C0038b.m557e(f6130short, 1686, 5, 3124) + v4Result.f192a + C0041e.m567c(f6130short, 1691, 5, 3094) + ((Object) sb);
                                    C2192c c2192c2 = new C2192c();
                                    c2192c2.m5830w(str4);
                                    c2192c2.m5812e((Map) mapM5756b);
                                    return C2137a.addDanmaku(c2192c2.toString());
                                }
                                if (i > 0) {
                                    sb.append(C0039c.m559c(f6130short, 1673, 1, 2264));
                                }
                                sb.append(arrayList2.get(i));
                                i++;
                            }
                        }
                    }
                }
                return new C2192c().toString();
            }
        }
        return new C2192c().toString();
    }

    /* JADX INFO: renamed from: q */
    public final JSONObject m549q(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObjectM533i = m533i();
        try {
            jSONObjectM533i.put(C0038b.m557e(f6130short, 1696, 4, 2239), str);
            jSONObjectM533i.put(C0041e.m567c(f6130short, 1700, 6, 3096), jSONObject);
            jSONObjectM533i.put(C0040d.m562b(f6130short, 1706, 5, 1951), str2);
        } catch (Exception unused) {
        }
        return m548p(C0039c.m559c(f6130short, 1711, 8, 870), jSONObjectM533i);
    }

    public String searchContent(String str, boolean z) throws JSONException {
        JSONObject jSONObjectM533i = m533i();
        jSONObjectM533i.put(C0039c.m559c(f6130short, 1719, 7, 2071), str);
        jSONObjectM533i.put(C0038b.m557e(f6130short, 1726, 4, 1299), C0038b.m557e(f6130short, 1730, 1, 395));
        jSONObjectM533i.put(C0038b.m557e(f6130short, 1731, 4, 1836), C0040d.m562b(f6130short, 1735, 1, 1364));
        JSONObject jSONObjectM548p = m548p(C0041e.m567c(f6130short, 1736, 8, 2713), jSONObjectM533i);
        if (jSONObjectM548p == null) {
            return C0082a.m814b();
        }
        JSONObject jSONObjectM547o = null;
        try {
            String string = jSONObjectM548p.getString(C0039c.m559c(f6130short, 1744, 3, 2173));
            StringBuilder sb = new StringBuilder();
            int iIndexOf = string.indexOf(C0040d.m562b(f6130short, 1747, 1, 1843));
            sb.append(string.substring(0, iIndexOf));
            sb.append(C0039c.m559c(f6130short, 1748, 14, 2486));
            sb.append(string.substring(iIndexOf));
            sb.append(C0040d.m562b(f6130short, 1762, 31, 1352));
            sb.append(URLEncoder.encode(str, C0038b.m557e(f6130short, 1793, 5, 3211)));
            String strM6073l = OkHttp.string(sb.toString(), m531g(jSONObjectM548p.getJSONObject(C0039c.m559c(f6130short, 1798, 7, 2549))));
            if (!TextUtils.isEmpty(strM6073l)) {
                JSONObject jSONObject = new JSONObject(strM6073l);
                if (jSONObject.optInt(C0039c.m559c(f6130short, 1805, 7, 1708), -1) == 0) {
                    String strOptString = jSONObject.optString(C0041e.m567c(f6130short, 1812, 4, 1013), "");
                    if (strOptString.length() > 20) {
                        jSONObjectM547o = m547o(strOptString, String.valueOf(jSONObject.opt(C0040d.m562b(f6130short, 1816, 2, 821))));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return jSONObjectM547o == null ? C0082a.m814b() : Result.string(m538n(jSONObjectM547o.optJSONArray(C0039c.m559c(f6130short, 1818, 10, 2491)), 0));
    }
}
