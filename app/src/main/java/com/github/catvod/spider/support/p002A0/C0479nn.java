package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.nn */
/* JADX INFO: loaded from: classes.dex */
public final class C0479nn extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public static final C0783yu f1288a = new C0783yu();

    /* JADX INFO: renamed from: d */
    public final SimpleDateFormat f1289d;

    private C0479nn() {
        this.f1289d = new SimpleDateFormat("hh:mm:ss a");
    }

    public /* synthetic */ C0479nn(int i) {
        this();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        Time time;
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        String strM1605ai = c0577rd.m1605ai();
        synchronized (this) {
            TimeZone timeZone = this.f1289d.getTimeZone();
            try {
                try {
                    time = new Time(this.f1289d.parse(strM1605ai).getTime());
                    this.f1289d.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new C0765yc("Failed parsing '" + strM1605ai + "' as SQL Time; at path " + c0577rd.m1624w(true), e);
                }
            } catch (Throwable th) {
                this.f1289d.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            aagVar.m892w();
            return;
        }
        synchronized (this) {
            str = this.f1289d.format((Date) time);
        }
        aagVar.m881ae(str);
    }
}
