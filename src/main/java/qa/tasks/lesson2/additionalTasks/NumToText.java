package qa.tasks.lesson2.additionalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumToText {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter any integer number 1-9:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);
        if (nNum > 0 && nNum < 10) {
            if (nNum == 1) {
                System.out.println("ONE");
            } else if (nNum == 2) {
                System.out.println("TWO");
            } else if (nNum == 3) {
                System.out.println("THREE");
            } else if (nNum == 4) {
                System.out.println("FOUR");
            } else if (nNum == 5) {
                System.out.println("FIVE");
            } else if (nNum == 6) {
                System.out.println("SIX");
            } else if (nNum == 7) {
                System.out.println("SEVEN");
            } else if (nNum == 8) {
                System.out.println("EIGHT");
            } else if (nNum == 9) {
                System.out.println("NINE");
            }

        } else System.out.println("Your number is out of range 1-9.");
    }
}
