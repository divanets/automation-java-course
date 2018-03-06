package qa.tasks.quadratic_equation;


public class Maths {

    public Result calculate(double a, double b, double c) {
        double x1, x2;
        double res;

        Result result = new Result();

        if (a == 0) {
            result.setErrMessage("Коэффициент при первом слагаемом уравнения не может быть равным нулю измените его и попробуйте снова.");
        } else {
            res = b * b - 4 * a * c;
            System.out.println("Дискриминант квадратного уравнения (b*b - 4*a*c) = " + res);
            if (res < 0) {
                result.setErrMessage("Дискриминант меньше нуля. Нет действительных решений!");
            } else if (res == 0) {
                result.setErrMessage("Так как дискриминант равен нулю то, квадратное уравнение имеет один действительный корень: 0");
            } else
                result.setErrMessage("Так как дискриминант больше нуля то, квадратное уравнение имеет два действительных корня:");

            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

            result.setX1(x1);
            result.setX2(x2);
            result.setDisRes(res);
        }
        return result;

    }
}
