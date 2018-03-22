package qa.tasks.lesson2.additionalTasks;

public class SumOfTheSeries {
    public static void main(String[] args) {
        double sum = 1;
        int n = 50000;

        for (int i = 2; i <= n; i++) {
            sum += (double)1/i;
        }
        System.out.println("Sum of the series = " + sum);
    }
}
