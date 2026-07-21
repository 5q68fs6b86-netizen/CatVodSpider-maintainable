package fi.iki.elonen;

import java.io.InputStream;
import java.util.Map;

public class NanoHTTPD {
    public enum Method { GET, POST, PUT, DELETE, HEAD, OPTIONS }
    public static class Response {
        public enum Status {
            OK(200, "OK"),
            PARTIAL_CONTENT(206, "Partial Content"),
            NOT_FOUND(404, "Not Found"),
            INTERNAL_ERROR(500, "Internal Error");
            private final int requestStatus;
            private final String description;
            Status(int rs, String d) { requestStatus = rs; description = d; }
            public int getRequestStatus() { return requestStatus; }
            public String getDescription() { return description; }
        }
        private Status status;
        private String mimeType;
        private InputStream data;
        private long totalBytes;
        public Response(Status status, String mimeType, InputStream data, long totalBytes) {
            this.status = status; this.mimeType = mimeType; this.data = data; this.totalBytes = totalBytes;
        }
        public void addHeader(String name, String value) {}
        public Status getStatus() { return status; }
        public String getMimeType() { return mimeType; }
        public InputStream getData() { return data; }
    }
    public static Response newFixedLengthResponse(Response.Status status, String mimeType, InputStream data, long totalBytes) {
        return new Response(status, mimeType, data, totalBytes);
    }
    public static Response newFixedLengthResponse(Response.Status status, String mimeType, String txt) {
        return new Response(status, mimeType, null, 0);
    }
    public interface IHTTPSession {
        Map<String, String> getParms();
        Map<String, String> getHeaders();
        Method getMethod();
        String getUri();
    }
}
