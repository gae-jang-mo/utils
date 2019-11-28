package com.gaejangmo.utils;

public class UserUtils {
    private static final int MAX_NAME_LENGTH = 10;

    private UserUtils() {
    }

    public static boolean isValidNameLength(String name) {
        return name.length() < MAX_NAME_LENGTH;
    }
}
