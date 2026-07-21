package com.github.catvod.p000js;

import com.github.catvod.spider.support.p002A0.AbstractC0403ks;
import com.github.catvod.spider.support.p002A0.AbstractC0502oj;
import com.github.catvod.spider.support.p002A0.C0153bl;
import com.github.catvod.spider.support.p002A0.C0226ed;
import com.github.catvod.spider.support.p002A0.C0235em;
import com.github.catvod.spider.support.p002A0.C0503ok;
import com.github.catvod.spider.support.p002A0.C0589rp;
import com.github.catvod.spider.support.p002A0.C0598ry;
import com.whl.quickjs.wrapper.JSArray;
import com.whl.quickjs.wrapper.JSMethod;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Function {
    private final QuickJSContext ctx;
    private final C0153bl parser = new C0153bl();

    public Function(QuickJSContext quickJSContext) {
        this.ctx = quickJSContext;
        setProperty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$setProperty$0(Method method, Object[] objArr) {
        try {
            return method.invoke(this, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    private void setProperty() {
        for (Method method : getClass().getMethods()) {
            if (method.isAnnotationPresent(JSMethod.class)) {
                this.ctx.getGlobalObject().setProperty(method.getName(), new C0503ok(this, method));
            }
        }
    }

    @JSMethod
    /* JADX INFO: renamed from: pd */
    public String m382pd(String str, String str2, String str3) {
        return this.parser.m1056g(str, str2, str3);
    }

    @JSMethod
    public JSArray pdfa(String str, String str2) {
        ArrayList arrayList;
        QuickJSContext quickJSContext = this.ctx;
        C0153bl c0153bl = this.parser;
        C0598ry c0598ry = c0153bl.f691e;
        if (!str.equals(c0598ry.f1459b)) {
            c0598ry.f1459b = str;
            c0598ry.f1461d = AbstractC0502oj.m1487a(str);
        }
        C0235em c0235em = c0598ry.f1461d;
        String[] strArrSplit = c0153bl.m1057h(str2, false).split(" ");
        C0589rp c0589rp = new C0589rp();
        for (String str3 : strArrSplit) {
            c0589rp = C0153bl.m1055f(c0235em, str3, c0589rp);
            if (c0589rp.isEmpty()) {
                arrayList = new ArrayList();
                return AbstractC0403ks.m1359a(quickJSContext, arrayList);
            }
        }
        arrayList = new ArrayList();
        Iterator<E> it = c0589rp.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0226ed) it.next()).mo1192an());
        }
        return AbstractC0403ks.m1359a(quickJSContext, arrayList);
    }

    @JSMethod
    public String pdfh(String str, String str2) {
        return this.parser.m1056g(str, str2, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    @JSMethod
    public JSArray pdfl(String str, String str2, String str3, String str4, String str5) {
        ?? arrayList;
        QuickJSContext quickJSContext = this.ctx;
        C0153bl c0153bl = this.parser;
        String[] strArrSplit = c0153bl.m1057h(str2, false).split(" ");
        C0589rp c0589rp = new C0589rp();
        for (String str6 : strArrSplit) {
            C0598ry c0598ry = c0153bl.f691e;
            if (!str.equals(c0598ry.f1459b)) {
                c0598ry.f1459b = str;
                c0598ry.f1461d = AbstractC0502oj.m1487a(str);
            }
            c0589rp = C0153bl.m1055f(c0598ry.f1461d, str6, c0589rp);
            if (c0589rp.isEmpty()) {
                arrayList = Collections.emptyList();
                return AbstractC0403ks.m1359a(quickJSContext, arrayList);
            }
        }
        arrayList = new ArrayList();
        Iterator it = c0589rp.iterator();
        while (it.hasNext()) {
            String strMo1192an = ((C0226ed) it.next()).mo1192an();
            arrayList.add(c0153bl.m1056g(strMo1192an, str3, "").trim() + '$' + c0153bl.m1056g(strMo1192an, str4, str5));
        }
        return AbstractC0403ks.m1359a(quickJSContext, arrayList);
    }
}
