package com.github.catvod.spider.support.p044FM.p049E;

import android.graphics.Bitmap;
import com.github.catvod.spider.support.p044FM.p047C.C1299b;
import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s;
import com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p049E.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1317a {
    /* JADX INFO: renamed from: a */
    public static String m3300a(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m3301b(String str, int i) {
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            enumMap.put(EncodeHintType.MARGIN, 2);
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, i, i, enumMap);
            int width = bitMatrixEncode.getWidth();
            int height = bitMatrixEncode.getHeight();
            int[] iArr = new int[width * height];
            for (int i2 = 0; i2 < height; i2++) {
                int i3 = i2 * width;
                for (int i4 = 0; i4 < width; i4++) {
                    iArr[i3 + i4] = bitMatrixEncode.get(i4, i2) ? -16777216 : -1;
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
    public static String m3302c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable cause = th; cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
            arrayList.add(cause);
        }
        Throwable th2 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th2 != null) {
            th = th2;
        }
        int i = C1299b.f3021e;
        String strM3242a = C1299b.m3242a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(strM3242a);
        sb.append(": ");
        int i2 = C1305h.f3028a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static void m3303d(InterfaceC1533O interfaceC1533O, AbstractC1399s abstractC1399s) {
        C1377c.m3360g(abstractC1399s);
        AbstractC1399s abstractC1399sM3518f = abstractC1399s;
        int i = 0;
        while (abstractC1399sM3518f != null) {
            AbstractC1399s abstractC1399sM3526z = abstractC1399sM3518f.m3526z();
            int iMo3411g = abstractC1399sM3526z != null ? abstractC1399sM3526z.mo3411g() : 0;
            AbstractC1399s abstractC1399sM3523r = abstractC1399sM3518f.m3523r();
            interfaceC1533O.mo3438b(abstractC1399sM3518f, i);
            if (abstractC1399sM3526z != null && !abstractC1399sM3518f.m3521p()) {
                if (iMo3411g == abstractC1399sM3526z.mo3411g()) {
                    abstractC1399sM3518f = abstractC1399sM3526z.m3518f(abstractC1399sM3518f.m3516G());
                } else if (abstractC1399sM3523r == null) {
                    i--;
                    abstractC1399sM3518f = abstractC1399sM3526z;
                } else {
                    abstractC1399sM3518f = abstractC1399sM3523r;
                }
            }
            if (abstractC1399sM3518f.mo3411g() > 0) {
                abstractC1399sM3518f = abstractC1399sM3518f.m3518f(0);
                i++;
            } else {
                while (abstractC1399sM3518f.m3523r() == null && i > 0) {
                    interfaceC1533O.mo3437a(abstractC1399sM3518f, i);
                    abstractC1399sM3518f = abstractC1399sM3518f.m3526z();
                    i--;
                }
                interfaceC1533O.mo3437a(abstractC1399sM3518f, i);
                if (abstractC1399sM3518f == abstractC1399s) {
                    return;
                } else {
                    abstractC1399sM3518f = abstractC1399sM3518f.m3523r();
                }
            }
        }
    }
}
