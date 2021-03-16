package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        String result = null;
        if (value != null) {
            for (String str : strings) {
                if (value.equals(str)) {
                    result = value;
                    break;
                }
            };
        }
        return Optional.ofNullable(result);
    }
}
