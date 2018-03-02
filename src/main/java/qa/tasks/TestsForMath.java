package qa.tasks;


public class TestsForMath {

    public static void Tests(double a, double b, double c) {
        double res;
        if (a == 0) {
            System.out.println("Коэффициент при первом слагаемом уравнения не может быть равным нулю измените его и попробуйте снова.");
        } else {
            res = b * b - 4 * a * c;
            System.out.println("дискриминант квадратного уравнения (b*b - 4*a*c)=" + res);
            if (res < 0) {
                System.out.println("Дискриминант меньше нуля. Нет действительных решений!");
            } else if (res == 0) {
                System.out.println("Так как дискриминант равен нулю то, квадратное уравнение имеет один действительный корень: 0");
            }
            else
                System.out.println("Так как дискриминант больше нуля то, квадратное уравнение имеет два действительных корня:");

        }
    }




}
