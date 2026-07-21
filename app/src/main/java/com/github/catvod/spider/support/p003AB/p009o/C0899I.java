package com.github.catvod.spider.support.p003AB.p009o;

import android.graphics.Bitmap;
import com.github.catvod.spider.support.p003AB.K.m;
import com.github.catvod.spider.support.p003AB.M.g;
import com.github.catvod.spider.support.p003AB.V.e;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0899I {

    /* JADX INFO: renamed from: a */
    static volatile C0915Z f2117a = new C0915Z();

    /* JADX INFO: renamed from: a */
    public static g m2171a(m mVar) {
        g gVar = new g();
        while (true) {
            mVar = mVar.g0();
            if (mVar == null) {
                break;
            }
            gVar.add(mVar);
        }
        if (gVar.size() > 0) {
            return gVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m2172b(String str, int i) {
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            enumMap.put(EncodeHintType.MARGIN, 2);
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, i, i, enumMap);
            int width = bitMatrixEncode.getWidth();
            int height = bitMatrixEncode.getHeight();
            int[] iArr = new int[width * height];
            for (int i2 = 0; i2 < height; i2++) {
                for (int i3 = 0; i3 < width; i3++) {
                    iArr[(i2 * width) + i3] = bitMatrixEncode.get(i3, i2) ? -16777216 : -1;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m2173c(m mVar, e eVar) {
        int i = 1;
        for (m mVar2 : mVar.k0().V()) {
            if (mVar.t0().equals(mVar2.t0()) && eVar.a().contains(mVar2)) {
                if (mVar == mVar2) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static String m2174d(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static g m2175e(m mVar) {
        g gVar = new g();
        while (true) {
            mVar = mVar.n0();
            if (mVar == null) {
                break;
            }
            gVar.add(mVar);
        }
        if (gVar.size() > 0) {
            return gVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m2176f(m mVar, int i) {
        mVar.R("EL_SAME_TAG_INDEX", String.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public static void m2177g(m mVar, int i) {
        mVar.R("EL_SAME_TAG_ALL_NUM", String.valueOf(i));
    }
}
