package qa.tasks.lesson2.additionalTasks;

public class SumOfNums {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Сумму всех чисел от 1 до 100 = " + sum);
        System.out.println("Среднее этих чисел = " + (double)sum/100);
    }
}
