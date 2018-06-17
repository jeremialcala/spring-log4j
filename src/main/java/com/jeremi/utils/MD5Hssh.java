package com.jeremi.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Hssh {

    private String message;
    public String hash;

    public MD5Hssh(String message) throws NoSuchAlgorithmException {
        String hash ="";
        byte[] bytesOfMessage = message.getBytes();
        MessageDigest md = MessageDigest.getInstance("MD5");
        this.message = message;
        this.hash = asHex(md.digest(bytesOfMessage));
    }

    private static String asHex(byte[] hash) {
        StringBuffer buf = new StringBuffer(hash.length * 2);
        int i;
        for (i = 0; i < hash.length; i++) {
            if (((int) hash[i] & 0xff) < 0x10) {
                buf.append("0");
            }
            buf.append(Long.toString((int) hash[i] & 0xff, 16));
        }
        return buf.toString().toLowerCase();
    }

}
