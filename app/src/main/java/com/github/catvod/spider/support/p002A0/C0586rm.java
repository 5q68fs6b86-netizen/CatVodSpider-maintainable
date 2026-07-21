package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.rm */
/* JADX INFO: loaded from: classes.dex */
public final class C0586rm extends C0706vy {
    @Override
    public final C0706vy clone() {
        return (C0586rm) super.clone();
    }

    @Override
    public final String mo924s() {
        return "#cdata";
    }

    @Override
    public final void mo925u(StringBuilder sb, int i, C0674ut c0674ut) throws IOException {
        sb.append("<![CDATA[").append(m1732f());
    }

    @Override
    public final void mo926v(StringBuilder sb, int i, C0674ut c0674ut) {
        sb.append("]]>");
    }
}
