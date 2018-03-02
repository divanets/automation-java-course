package qa.tasks.quadratic_equation;


import static qa.tasks.quadratic_equation.TestsForMath.Tests;

public class Maths {

    public static void Calculate(double a, double b, double c) {
        double x1, x2;

        Tests(a, b, c);

        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;

            System.out.println("X1= " + x1);
            System.out.println("X2= " + x2);
        }


}
