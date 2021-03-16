package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        Optional<Integer> rst = max(data);
        rst.ifPresent(integer -> System.out.println("Max: " + integer));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        }

        int max = Arrays.stream(data).max().getAsInt();
        return Optional.of(max);
    }
}