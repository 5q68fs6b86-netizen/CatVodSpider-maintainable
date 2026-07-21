package com.github.catvod.spider.support.p117b;

import com.github.catvod.spider.support.p128m.C2256I;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.Xd */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2160Xd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JSONObject f5171b;

    public /* synthetic */ RunnableC2160Xd(JSONObject jSONObject, int i) {
        this.f5170a = i;
        this.f5171b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject = this.f5171b;
        switch (this.f5170a) {
            case 0:
                try {
                    C2256I.m6113i(jSONObject.getString("error_description"));
                } catch (JSONException unused) {
                    return;
                }
                break;
            case 1:
                try {
                    C2256I.m6113i(jSONObject.getString("share_status_text"));
                } catch (JSONException unused2) {
                    return;
                }
                break;
            default:
                try {
                    C2256I.m6113i(jSONObject.getString("message"));
                } catch (JSONException unused3) {
                    return;
                }
                break;
        }
    }
}
