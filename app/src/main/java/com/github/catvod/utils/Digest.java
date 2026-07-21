package com.github.catvod.utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/** 对应 jar C2256I.m6109a */
public final class Digest {
    private Digest() {}

    public static String md5(String s) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(s.getBytes(StandardCharsets.UTF_8))).toString(16));
            while (sb.length() < 32) sb.insert(0, "0");
            return sb.toString().toLowerCase();
        } catch (Exception e) {
            return "";
        }
    }
}
