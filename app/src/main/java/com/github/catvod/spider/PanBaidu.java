package com.github.catvod.spider;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.support.p117b.C2176j;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p120e.C2210a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PanBaidu extends Pan {

    /* JADX INFO: renamed from: g */
    private C2176j f239g;

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        C2192c c2192c = new C2192c();
        ArrayList arrayList = new ArrayList();
        C2176j c2176j = this.f239g;
        ArrayList<C2210a> arrayList2 = new ArrayList();
        c2176j.m5697d(str, arrayList2);
        for (C2210a c2210a : arrayList2) {
            Vod c2194e = new Vod();
            String strM5934dd = c2210a.m5934dd();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (!str.endsWith("/")) {
                sb.append("/");
            }
            sb.append(strM5934dd);
            c2194e.m5848j(sb.toString());
            if (c2210a.m5931b() == 1) {
                c2194e.m5849k(strM5934dd);
            } else {
                c2194e.m5849k(strM5934dd + c2210a.m5936f());
            }
            c2194e.m5850l(c2210a.m5931b() == 1 ? "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_f.png" : "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_v.png");
            c2194e.m5854p(c2210a.m5935e());
            arrayList.add(c2194e);
        }
        arrayList.size();
        c2192c.m5817i(1, 1, Integer.MAX_VALUE, Integer.MAX_VALUE);
        c2192c.m5829w(arrayList);
        return c2192c.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        String str = list.get(0);
        int iLastIndexOf = str.lastIndexOf("/");
        String strSubstring = iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
        int iLastIndexOf2 = strSubstring.lastIndexOf("/");
        String strSubstring2 = iLastIndexOf2 >= 0 ? strSubstring.substring(iLastIndexOf2 + 1) : strSubstring;
        C2176j c2176j = this.f239g;
        ArrayList<C2210a> arrayList = new ArrayList();
        c2176j.m5697d(strSubstring, arrayList);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (C2210a c2210a : arrayList) {
            if (c2210a.m5931b() != 1) {
                if (z) {
                    sb.append("#");
                } else {
                    z = true;
                }
                String strM5934dd = c2210a.m5934dd();
                sb.append(strM5934dd);
                sb.append("$");
                sb.append(strSubstring);
                sb.append("/");
                sb.append(strM5934dd);
            }
        }
        String string = sb.toString();
        List<String> myBaiduOptions = Config.getMyBaiduOptions();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < myBaiduOptions.size(); i++) {
            arrayList2.add(string);
        }
        String strJoin = TextUtils.join("$$$", arrayList2);
        String strJoin2 = TextUtils.join("$$$", myBaiduOptions);
        Vod c2194e = new Vod();
        c2194e.m5848j(strSubstring);
        c2194e.m5849k(strSubstring2);
        c2194e.m5850l("https://img1.baidu.com/it/u=3771019812,1738333604&fm=253&fmt=auto&app=120&f=JPEG?w=500&h=500");
        c2194e.m5851m(strJoin2);
        c2194e.m5852n(strJoin);
        c2194e.m5854p("folder");
        return C2137a.processVodData(Result.string(c2194e));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(this.f239g.m5701j())) {
                arrayList.add(new Class("0", "还未登录百度账号,请前往【配置中心】登录", "1"));
            } else {
                arrayList.add(new Class("/", "我的百度网盘", "1"));
            }
        } catch (Exception unused) {
        }
        return Result.string(arrayList, new ArrayList());
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            this.f239g = C2176j.m5689f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
