package app;

import java.util.function.Function;
import java.util.function.Supplier;

import static app.RandomNumberGenerator.generateRandomNumber;

public class Main {
    public static void main(String[] args) {

        MathOperator mathOperator = new MathOperator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        System.out.println(mathOperator.operate(5, 2));


        int randomNum = generateRandomNumber(0, 10);
        System.out.println("randomnum:" + randomNum);

        Supplier<Integer> supplier = () -> generateRandomNumber(0, 100);
        System.out.println("Supplier generated number: " + supplier.get());

        StringManipulator stringManipulator = str -> str.toUpperCase();

        Function<String, Integer> function = s -> StringListProcessor.countUppercase(s);
        System.out.println(function.apply("aPPly"));

        System.out.println(mathOperator.operate(5, 3));
        System.out.println(stringManipulator.manipulate("manipulate"));

    }
}