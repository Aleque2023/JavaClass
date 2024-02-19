//Alejandro Quezada
//2/18/2024
//Module 9 Programming Assignment - Lambdas

import java.util.function.*;
import java.math.*;

public class AQ_Module9_lambda {
    public static void main(String[] args) {

        System.out.println("Using the supplier interface:");
        Supplier<Double> num = () -> Math.random();
        System.out.println(num.get());




        System.out.println("\nUsing the Consumer interface:");
        Consumer<String> example = txt -> System.out.println(txt);
        example.accept("This is consumer");




        System.out.println("\nUsing the BiConsumer Interface:");
        BiConsumer<Integer, Integer> same = (a, b) -> {
            if (a == b) {
                System.out.println("The numbers are the same!");
            }
            else {
                System.out.println("Not the same numbers");
            }
        };

        same.accept(2,4);




        System.out.println("\nUsing Predicate:");
        Predicate<String> test = c -> (c.length() > 3);
        System.out.println(test.test("A string"));




        System.out.println("\nUsing Function:");
    }
}