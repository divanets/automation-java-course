package qa.tasks.quadratic_equation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        // Call calculate from class Maths

        Maths math = new Maths();
        Result calculate = math.calculate(a, b, c);

        calculate.getX1();
        calculate.getX2();
        String errRes = calculate.getErrMessage();
        System.out.println(errRes);
        System.out.println("X1 = " + calculate.getX1());
        System.out.println("X2 = " + calculate.getX2());

    }
}
