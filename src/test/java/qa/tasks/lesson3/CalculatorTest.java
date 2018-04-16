package qa.tasks.lesson3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void addCheck() {
        double nOne = 35.5;
        double nTwo = 4;
        Assert.assertEquals(Calculation.addition(nOne, nTwo), 39.5);
    }

    @Test
    public void subCheck() {
        double nOne = -10;
        double nTwo = 4;
        Assert.assertEquals((int) Calculation.subtraction(nOne, nTwo), -14);
    }

    @Test
    public void divCheck() {
        double nOne = 55;
        double nTwo = 5.0;
        Assert.assertEquals(Calculation.division(nOne, nTwo), 11.0);
    }

    @Test
    public void multCheck() {
        double nOne = -5;
        double nTwo = -3;
        Assert.assertEquals((int) Calculation.multiplication(nOne, nTwo), 15);
    }

    @Test
    public void memoAddCheck() {
        double res = 5.0;
        Calculation memo = new Calculation();
        Assert.assertEquals(memo.memoAdd(res), 5.0);
    }

    @Test
    public void memoSubCheck() {
        double res = 10.0;
        Calculation memo = new Calculation();
        Assert.assertEquals(memo.memoSubtract(res), -10.0);
    }

    @Test
    public void memoResetCheck() {
        Calculation memo = new Calculation();
        memo.setCurrentMemory(100);
        Assert.assertEquals((int)memo.memoReset(), 0);
    }
}
