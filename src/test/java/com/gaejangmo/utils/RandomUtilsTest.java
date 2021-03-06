package com.gaejangmo.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilsTest {

    @Test
    void 랜덤_숫자_범위지정_int() {
        List<Integer> randomLongsInRange = RandomUtils.getRandomIntsInRange(1, 30, 5);

        assertThat(randomLongsInRange.size()).isEqualTo(5);
        randomLongsInRange.forEach((e) -> assertThat(e).isBetween(1, 30));
    }

    @Test
    void 랜덤_숫자_범위지정_long() {
        List<Long> randomLongsInRange = RandomUtils.getRandomLongsInRange(1, 30, 5);

        assertThat(randomLongsInRange.size()).isEqualTo(5);
        randomLongsInRange.forEach((e) -> assertThat(e).isBetween(1L, 30L));
    }
}