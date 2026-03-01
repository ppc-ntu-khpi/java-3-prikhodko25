package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

            String expr = "1 + 33 - 4 * 7";
            float value = Exercise.Calculate(expr);
        
            System.out.println("Результат виразу \"" + expr + "\" = " + value);
    }
}
