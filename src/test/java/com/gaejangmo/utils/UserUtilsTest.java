package com.gaejangmo.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserUtilsTest {
    @Test
    void shouldGetValidNameLength() {
        assertTrue(UserUtils.isValidNameLength("hello"));
    }
}