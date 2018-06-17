package com.jeremi.utils;

import java.security.NoSuchAlgorithmException;
import java.util.Date;

public interface tools {

    public static String getSessionId(){
        try {
            Date now = new Date();
            String timestamp = String.valueOf(now.toInstant().toEpochMilli());
            return new MD5Hssh(timestamp).hash;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "ERROR!";
        }
    }
}
