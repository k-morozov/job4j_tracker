package ru.job4j.lambda;

import java.util.function.Function;
import java.math.*;

public class MRFunction {
    public static Function<Double, Double> apply() {
         return  Math::sqrt;
    }
}