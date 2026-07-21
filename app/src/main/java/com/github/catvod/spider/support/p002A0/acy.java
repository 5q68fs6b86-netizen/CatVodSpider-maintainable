package com.github.catvod.spider.support.p002A0;

import rxhttp.wrapper.param.BodyParam;
import rxhttp.wrapper.param.FormParam;
import rxhttp.wrapper.param.JsonArrayParam;
import rxhttp.wrapper.param.JsonParam;
import rxhttp.wrapper.param.Method;
import rxhttp.wrapper.param.NoBodyParam;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class acy {
    /* JADX INFO: renamed from: a */
    public static BodyParam m968a(String str) {
        return new BodyParam(str, Method.DELETE);
    }

    /* JADX INFO: renamed from: b */
    public static FormParam m969b(String str) {
        return new FormParam(str, Method.DELETE);
    }

    /* JADX INFO: renamed from: c */
    public static JsonParam m970c(String str) {
        return new JsonParam(str, Method.DELETE);
    }

    /* JADX INFO: renamed from: d */
    public static JsonArrayParam m971d(String str) {
        return new JsonArrayParam(str, Method.DELETE);
    }

    /* JADX INFO: renamed from: e */
    public static NoBodyParam m972e(String str) {
        return new NoBodyParam(str, Method.GET);
    }

    /* JADX INFO: renamed from: f */
    public static NoBodyParam m973f(String str) {
        return new NoBodyParam(str, Method.HEAD);
    }

    /* JADX INFO: renamed from: g */
    public static BodyParam m974g(String str) {
        return new BodyParam(str, Method.PATCH);
    }

    /* JADX INFO: renamed from: h */
    public static FormParam m975h(String str) {
        return new FormParam(str, Method.PATCH);
    }

    /* JADX INFO: renamed from: i */
    public static JsonParam m976i(String str) {
        return new JsonParam(str, Method.PATCH);
    }

    /* JADX INFO: renamed from: j */
    public static JsonArrayParam m977j(String str) {
        return new JsonArrayParam(str, Method.PATCH);
    }

    /* JADX INFO: renamed from: k */
    public static BodyParam m978k(String str) {
        return new BodyParam(str, Method.POST);
    }

    /* JADX INFO: renamed from: l */
    public static FormParam m979l(String str) {
        return new FormParam(str, Method.POST);
    }

    /* JADX INFO: renamed from: m */
    public static JsonParam m980m(String str) {
        return new JsonParam(str, Method.POST);
    }

    /* JADX INFO: renamed from: n */
    public static JsonArrayParam m981n(String str) {
        return new JsonArrayParam(str, Method.POST);
    }

    /* JADX INFO: renamed from: o */
    public static BodyParam m982o(String str) {
        return new BodyParam(str, Method.PUT);
    }

    /* JADX INFO: renamed from: p */
    public static FormParam m983p(String str) {
        return new FormParam(str, Method.PUT);
    }

    /* JADX INFO: renamed from: q */
    public static JsonParam m984q(String str) {
        return new JsonParam(str, Method.PUT);
    }

    /* JADX INFO: renamed from: r */
    public static JsonArrayParam m985r(String str) {
        return new JsonArrayParam(str, Method.PUT);
    }
}
