package ru.job4j.lambda;

import java.util.function.Predicate;

public class PredicateCheckEvenAndPositive {

    public static boolean check(int num) {
        Predicate<Integer> func = number -> number % 2 == 0 && number > 0;
        return check(func, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
