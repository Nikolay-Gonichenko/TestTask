package com.example.lanittesttask.util;

public class PhoneUtil {
    public static String convertPhone(String phone) {
        return phone.replaceAll("[^0-9]", "");
    }
}
