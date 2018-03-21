package qa.tasks.lesson2.additionalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenNumbers {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter any integer number 0-999:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);

        if (nNum % 2 != 0) {
            System.out.println("Odd number");
        }
        else
            System.out.println("Even number");
    }
}
