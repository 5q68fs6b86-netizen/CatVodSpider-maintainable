package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ct */
/* JADX INFO: loaded from: classes.dex */
public final class C0188ct implements InterfaceC0698vq {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f716c;

    public /* synthetic */ C0188ct(int i, Object obj) {
        this.f715b = i;
        this.f716c = obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0698vq
    /* JADX INFO: renamed from: a */
    public final AbstractC0406kv mo934a(C0493oa c0493oa, C0259fj c0259fj) {
        switch (this.f715b) {
            case 0:
                if (c0259fj.f827a == Number.class) {
                    return (C0595rv) this.f716c;
                }
                return null;
            case 1:
                if (c0259fj.f827a == Object.class) {
                    return new C0506on(c0493oa, (EnumC0700vs) this.f716c);
                }
                return null;
            default:
                Class cls = c0259fj.f827a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C0295gs) this.f716c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f715b) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + Marker.ANY_NON_NULL_MARKER + GregorianCalendar.class.getName() + ",adapter=" + ((C0295gs) this.f716c) + "]";
            default:
                return super.toString();
        }
    }
}
