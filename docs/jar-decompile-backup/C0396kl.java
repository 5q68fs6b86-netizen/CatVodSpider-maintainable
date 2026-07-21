package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.kl */
/* JADX INFO: loaded from: classes.dex */
public final class C0396kl extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public static final C0296gt f1098a = new C0296gt();

    /* JADX INFO: renamed from: d */
    public final SimpleDateFormat f1099d;

    private C0396kl() {
        this.f1099d = new SimpleDateFormat("MMM d, yyyy");
    }

    public /* synthetic */ C0396kl(int i) {
        this();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        Date date;
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        String strM1605ai = c0577rd.m1605ai();
        synchronized (this) {
            TimeZone timeZone = this.f1099d.getTimeZone();
            try {
                try {
                    date = new Date(this.f1099d.parse(strM1605ai).getTime());
                    this.f1099d.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new C0765yc("Failed parsing '" + strM1605ai + "' as SQL Date; at path " + c0577rd.m1624w(true), e);
                }
            } catch (Throwable th) {
                this.f1099d.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            aagVar.m892w();
            return;
        }
        synchronized (this) {
            str = this.f1099d.format((java.util.Date) date);
        }
        aagVar.m881ae(str);
    }
}
