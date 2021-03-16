package ru.job4j.lambda;

import java.util.function.Function;
import java.math.*;

public class FunctionFormula {

    public static double calculate(double x) {
         return calculate(num -> x * x + 2 * x + 1, x);
    }

    private static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}
