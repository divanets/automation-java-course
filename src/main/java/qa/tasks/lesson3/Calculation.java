package qa.tasks.lesson3;

public class Calculation {

    private double currentMemory;

    public double getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(double currentMemory) {
        this.currentMemory = currentMemory;
    }

    public static double addition(double nOne, double nTwo) {
        return (nOne + nTwo);
    }

    public static double subtraction(double nOne, double nTwo) {
        return (nOne - nTwo);
    }

    public static double division(double nOne, double nTwo) {
        return (nOne / nTwo);
    }

    public static double multiplication(double nOne, double nTwo) {
        return (nOne * nTwo);
    }

    public double memoAdd(double memoNewValue) {
        setCurrentMemory(getCurrentMemory() + memoNewValue);
        return currentMemory;
    }

    public double memoSubtract(double memoNewValue) {
        setCurrentMemory(getCurrentMemory() - memoNewValue);
        return currentMemory;
    }

    public double memoReset() {
        setCurrentMemory(0);
        return currentMemory;
    }


}
