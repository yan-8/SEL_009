package com.automationpractice.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimestampUtility {
    public static String generateTimestamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String value = simpleDateFormat.format(timestamp);
        return value;
    }
}