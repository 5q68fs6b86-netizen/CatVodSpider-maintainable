package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p102H.C2051g;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class XiongdiPan extends Pan {

    /* JADX INFO: renamed from: a */
    public static final byte[] f358a = "1234567812345678".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: b */
    public String f359b = "";

    public static String encryptForCookie(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr = f358a;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDoFinal) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        String str = "https://www.xiongdipan.com" + list.get(0).replace("s/", "cv/");
        String str2 = "https://www.xiongdipan.com" + list.get(0);
        HashMap mapM5756b = C2186v.m5756b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        mapM5756b.put("Cookie", this.f359b);
        mapM5756b.put("referer", str2);
        Matcher matcher = Pattern.compile("https://pan\\.baidu\\.com/s/[\\w\\-]+(?:\\?pwd=[\\w\\-]+)?").matcher(C2238b.m6062b(str, mapM5756b));
        return super.detailContent(Collections.singletonList(matcher.find() ? matcher.group() : null));
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, String str2) {
        StringBuilder sb = new StringBuilder("ck_ml_sea_=");
        HashMap mapM5756b = C2186v.m5756b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        mapM5756b.put("Cookie", this.f359b);
        Matcher matcher = Pattern.compile("start_load\\(\"([a-f0-9]+)\"\\)").matcher(OkHttp.string("https://www.xiongdipan.com", mapM5756b));
        sb.append(encryptForCookie((!matcher.find() || matcher.group(1) == null) ? null : matcher.group(1)));
        this.f359b = sb.toString();
        String strM836g = C0082a.m836g("https://www.xiongdipan.com/search?page=", str2, "&k=", str, "&s=2&t=-1");
        HashMap mapM5756b2 = C2186v.m5756b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        mapM5756b2.put("Cookie", this.f359b);
        C2060c c2060cM4896n0 = C2051g.m5074d(OkHttp.string(strM836g, mapM5756b2)).m4896n0("van-row");
        ArrayList arrayList = new ArrayList();
        for (C2037i c2037i : c2060cM4896n0) {
            Vod c2194e = new Vod();
            if (!c2037i.m4896n0("div[style*=medium]").isEmpty()) {
                C2060c c2060cM4896n1 = c2037i.m4896n0("div[style*=medium]");
                c2194e.m5849k((c2060cM4896n1.isEmpty() ? null : c2060cM4896n1.get(0)).m4902t0());
                c2194e.m5848j(c2037i.m4896n0("a").m5179a("href"));
                if (c2037i.m4896n0("a").m5179a("href").contains("/s/")) {
                    c2194e.m5850l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/dyXZ/1200X800/baidu.jpg/webp");
                    arrayList.add(c2194e);
                }
            }
        }
        return Result.string(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
