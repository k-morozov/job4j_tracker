package ru.job4j.stream;

import java.util.List;
import java.util.Optional;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        Optional<Integer> rst = list.stream().reduce((sum, x) -> sum * x);
        return rst.orElseThrow();
    }
}
