package qa.tasks.lesson2.additionalTasks;

import qa.tasks.quadratic_equation.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiValue {
    public static void main(String args[]) throws IOException {
        Double t;// точность
        Double p; //значение пи
        Double n; // число членов ряда
        Double chr; // значение члена ряда

        chr = 1.0D;
        n = 1.0D;
        p = 0.0D;
        System.out.print("Задайте точность вычисления ПИ -> ");
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        t = Double.parseDouble(scanner.readLine());
        System.out.println(t);
        while (t < Math.abs(chr)) {
            p += chr;

            //chr = (float) (Math.pow(-1, (1 + n))) * (1 / (2 * n - 1));
            chr = ((Math.pow(-1,  n)) * (1 / ((2 * n) + 1)));
            n++;
        }
        p = p * 4;

        System.out.printf("Значение числа ПИ с точностью %1.6f равно %1.6f\n", t, p);

        System.out.println("Количество членов ряда " + n);
        System.out.printf(" %3.6f\n ", chr);
        System.out.println("Math.PI" + Math.PI);


    }
}
//        xi = x-Math.sin(x)/Math.cos(x);
