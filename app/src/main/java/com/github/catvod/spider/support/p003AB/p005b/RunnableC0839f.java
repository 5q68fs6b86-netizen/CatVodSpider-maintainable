package com.github.catvod.spider.support.p003AB.p005b;

import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import com.github.catvod.spider.support.p003AB.p009o.C0924e;
import com.github.catvod.spider.support.p003AB.p009o.C0936q;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p005b.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0839f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1979a;

    /* JADX INFO: renamed from: b */
    public final Object f1980b;

    public /* synthetic */ RunnableC0839f(Object obj, int i) {
        this.f1979a = i;
        this.f1980b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1979a;
        if (i == 0) {
            C0857x.m2072b((C0857x) this.f1980b);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                ((C0833Q) this.f1980b).m2035s();
                return;
            }
            Object obj = this.f1980b;
            if (i != 3) {
                Toast.makeText(((C0936q) obj).f2206a, "详情加载失败", 0).show();
                return;
            } else {
                C0924e.m2243c((C0924e) obj);
                return;
            }
        }
        C0826J c0826j = (C0826J) this.f1980b;
        int i2 = C0826J.f1941k;
        c0826j.getClass();
        try {
            String strOptString = new JSONObject(C0869c.m2132l("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2", null)).optJSONObject("data").optJSONObject("members").optString("token");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", "https://su.quark.cn/4_eMHBJ?token=" + strOptString + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
            jSONObject.put("token", strOptString);
            Init.run(new RunnableC0823G(c0826j, jSONObject, 0));
        } catch (Exception unused) {
        }
    }
}
