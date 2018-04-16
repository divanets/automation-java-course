package qa.tasks.lesson3;

import qa.tasks.lesson3.Calculation;

public class Calculator {

    public static void main(String[] args) {

        double currentMemory = 0;
        double nOne = 8;
        double nTwo = 8;

        Calculation memo = new Calculation();
        System.out.println("Current Memory = " + memo.getCurrentMemory());
        System.out.println(nOne + " + " + nTwo + " = " + Calculation.addition(nOne, nTwo));
        System.out.println("M+ = " + memo.memoAdd(Calculation.addition(nOne, nTwo)));

        System.out.println(nOne + " / " + nTwo + " = " + Calculation.division(nOne, nTwo));
        System.out.println("\nCurrent Memory = " + memo.getCurrentMemory());
        System.out.println("M+ = " + memo.memoAdd(Calculation.division(nOne, nTwo)));

        System.out.println(nOne + " - " + nTwo + " = " + Calculation.subtraction(nOne, nTwo));
        System.out.println("M- = " + memo.memoSubtract(Calculation.subtraction(nOne, nTwo)));

        System.out.println(nOne + " / " + nTwo + " = " + Calculation.division(nOne, nTwo));
        System.out.println("M- = " + memo.memoSubtract(Calculation.division(nOne, nTwo)));

        System.out.println(nOne + " * " + nTwo + " = " + Calculation.multiplication(nOne, nTwo));
        System.out.println("Current Memory = " + memo.getCurrentMemory());
        System.out.println("MC = " + memo.memoReset());
        System.out.println("Current Memory = " + memo.getCurrentMemory());


    }
}
