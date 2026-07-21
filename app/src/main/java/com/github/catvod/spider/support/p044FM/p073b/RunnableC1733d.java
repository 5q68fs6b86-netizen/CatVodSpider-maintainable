package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1733d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3813b;

    public /* synthetic */ RunnableC1733d(Object obj, int i) {
        this.f3812a = i;
        this.f3813b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3812a) {
            case 0:
                C1750u.m4111b((C1750u) this.f3813b);
                break;
            case 1:
                ((C1715C) this.f3813b).m4015s();
                break;
            case 2:
                C1722J c1722j = (C1722J) this.f3813b;
                int i = C1722J.f3777j;
                c1722j.getClass();
                try {
                    String strOptString = new JSONObject(C1840c.m4479n("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2", null)).optJSONObject("data").optJSONObject(C1711a.m3992b(new byte[]{-10, 14, -122, 3, 113, -32, 55}, new byte[]{-101, 107, -21, 97, 20, -110, 68, -103})).optString("token");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", "https://su.quark.cn/4_eMHBJ?token=" + strOptString + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
                    jSONObject.put("token", strOptString);
                    Init.run(new RunnableC1737h(c1722j, jSONObject, 1));
                } catch (Exception unused) {
                    return;
                }
                break;
            case 3:
                ((C1729Q) this.f3813b).m4075p();
                break;
            default:
                ((MainActivity) this.f3813b).m();
                break;
        }
    }
}
