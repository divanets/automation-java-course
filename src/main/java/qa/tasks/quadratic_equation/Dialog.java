package qa.tasks.quadratic_equation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static qa.tasks.quadratic_equation.Maths.*;
public class Dialog {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter value for a");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Please Enter value for b");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Please Enter value for c");
        int c = Integer.parseInt(reader.readLine());

        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

        // Call Calculate from class Maths
        Calculate(a, b, c);


    }
}
