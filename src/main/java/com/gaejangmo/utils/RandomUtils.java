package com.gaejangmo.utils;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class RandomUtils {
    /**
     * 범위를 주고 그 안에서 해당하는 갯수만큼 랜덤한 숫자를 반환한다.
     * @param from inclusive
     * @param to inclusive
     * @param count 해당 갯수
     * @return 랜덤 int 리스트
     */
    public static List<Integer> getRandomIntsInRange(int from, int to, int count) {
        return ThreadLocalRandom.current()
                .ints(from, to + 1)
                .distinct()
                .limit(count)
                .boxed()
                .collect(Collectors.toList());
    }

    /**
     * 범위를 주고 그 안에서 해당하는 갯수만큼 랜덤한 숫자를 반환한다.
     * @param from inclusive
     * @param to inclusive
     * @param count 해당 개수
     * @return 랜덤 long 리스트
     */
    public static List<Long> getRandomLongsInRange(long from, long to, long count) {
        return ThreadLocalRandom.current()
                .longs(from, to + 1)
                .distinct()
                .limit(count)
                .boxed()
                .collect(Collectors.toList());
    }
}
