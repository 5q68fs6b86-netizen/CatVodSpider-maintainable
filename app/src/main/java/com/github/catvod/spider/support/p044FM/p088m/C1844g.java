package com.github.catvod.spider.support.p044FM.p088m;

import android.annotation.SuppressLint;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.m.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1844g extends SSLSocketFactory {

    /* JADX INFO: renamed from: d */
    @SuppressLint({"TrustAllX509TrustManager", "CustomX509TrustManager"})
    public static final X509TrustManager f4237d = new C1843f();

    /* JADX INFO: renamed from: a */
    private SSLSocketFactory f4238a;

    /* JADX INFO: renamed from: b */
    private String[] f4239b;

    /* JADX INFO: renamed from: c */
    private String[] f4240c;

    public C1844g() {
        try {
            LinkedList linkedList = new LinkedList();
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            for (String str : sSLSocket.getSupportedProtocols()) {
                if (!str.toUpperCase().contains("SSL")) {
                    linkedList.add(str);
                }
            }
            this.f4240c = (String[]) linkedList.toArray(new String[0]);
            List listAsList = Arrays.asList("TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", C1711a.m3992b(new byte[]{22, -7, -63, 93, 57, -101, 23, 86, 7, -22, -41, 65, 56, -117, 18, 65, 21, -4, -58, 74, 35, -103, 22, 77, 29, -124, -96, 58, 35, -101, 17, 93, 29, -26, -38, 67, 78, -19, 101}, new byte[]{66, -75, -110, 2, 124, -40, 83, 30}), "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
            List listAsList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
            HashSet hashSet = new HashSet(listAsList);
            hashSet.retainAll(listAsList2);
            hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
            this.f4239b = (String[]) hashSet.toArray(new String[0]);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{f4237d}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            this.f4238a = socketFactory;
            HttpsURLConnection.setDefaultSSLSocketFactory(socketFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4484a(SSLSocket sSLSocket) {
        String[] strArr = this.f4240c;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.f4239b;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f4238a.createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            m4484a((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f4238a.createSocket(str, i, inetAddress, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            m4484a((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f4238a.createSocket(inetAddress, i);
        if (socketCreateSocket instanceof SSLSocket) {
            m4484a((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f4238a.createSocket(inetAddress, i, inetAddress2, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            m4484a((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f4238a.createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            m4484a((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f4239b;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f4239b;
    }
}
