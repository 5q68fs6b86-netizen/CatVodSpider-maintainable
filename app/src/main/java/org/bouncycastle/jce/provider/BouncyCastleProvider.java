package org.bouncycastle.jce.provider;
import java.security.Provider;
public class BouncyCastleProvider extends Provider {
    public static final String PROVIDER_NAME = "BC";
    public BouncyCastleProvider() { super(PROVIDER_NAME, 1.0, "BC stub"); }
}
