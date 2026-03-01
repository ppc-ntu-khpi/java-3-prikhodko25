package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] milit_numbs = new int[100000];
        for(int i = 0; i < milit_numbs.length; i++){
            milit_numbs[i] = i;
        }
        
        System.out.println("Кількість підрозділів, що містять числа = " + Exercise.Calculate(milit_numbs));
    }
}
