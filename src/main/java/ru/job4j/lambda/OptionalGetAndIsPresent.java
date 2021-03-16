package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        Optional<Integer> rst = indexOf(data, el);
        return rst.orElse(-1);
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> index = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (el == data[i]) {
                index = Optional.of(i);
                break;
            }
        }
        return index;
    }
}
