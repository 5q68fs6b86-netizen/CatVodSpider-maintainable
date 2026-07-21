package com.github.catvod.spider.support.p002A0;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0411l {
    /* JADX INFO: renamed from: a */
    public static String m1365a(String str, String str2, String str3) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(str3.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1366b(StringBuilder sb, Object obj, InterfaceC0569qw interfaceC0569qw) {
        if (interfaceC0569qw != null) {
            sb.append((CharSequence) interfaceC0569qw.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }
}
