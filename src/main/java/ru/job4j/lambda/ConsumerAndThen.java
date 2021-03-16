package ru.job4j.lambda;

import java.util.concurrent.CompletionService;
import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = (str) -> System.out.print(str);
        Consumer<String> ln = (String str) -> System.out.println();
        return print.andThen(ln);
    }

}
