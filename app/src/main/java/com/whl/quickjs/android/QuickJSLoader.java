package com.whl.quickjs.android;

public class QuickJSLoader {
    public interface Console {
        void log(String msg);
        void error(String msg);
        void info(String msg);
        void warn(String msg);
    }

    public static Object a(Console console, Object[] args) {
        return null;
    }

    public static void init() {}
}
