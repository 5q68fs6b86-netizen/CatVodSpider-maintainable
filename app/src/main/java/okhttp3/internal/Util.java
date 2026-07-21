package okhttp3.internal;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public final class Util {
    private Util() {}
    public static byte[] toUtf8(byte[] bytes) {
        if (bytes == null) return new byte[0];
        return new String(bytes, StandardCharsets.UTF_8).getBytes(StandardCharsets.UTF_8);
    }
    public static String toUtf8(String s) { return s == null ? null : s; }
    public static List immutableList(Object... items) {
        return Collections.emptyList();
    }
    public static void checkOffsetAndCount(long arrayLength, long offset, long count) {}
    public static ThreadFactory threadFactory(final String name, final boolean daemon) {
        return new ThreadFactory() {
            @Override public Thread newThread(Runnable r) {
                Thread t = new Thread(r, name);
                t.setDaemon(daemon);
                return t;
            }
        };
    }
}
