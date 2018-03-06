package qa.tasks.quadratic_equation;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsForMath {

    @Test

    public void testForMaths (){
        Maths maths = new Maths();
        Result result = maths.calculate(0, 4, 2);
        String errText = result.getErrMessage();
        System.out.println("Test #1: " + errText);
        Assert.assertTrue(errText.contains("не может быть равным нулю"));

        System.out.println("================================");
        Result result1 = maths.calculate(1, 0, 0);
        String errText1 = result1.getErrMessage();
        System.out.println("Test #2: " + errText1);
        double resX3 = result1.getX1();
        Assert.assertEquals(resX3, 0.0);
        Assert.assertTrue(errText1.contains("дискриминант равен нулю"));

        System.out.println("================================");
        Result result2 = maths.calculate(2, 8, 2);
        String errText2 = result2.getErrMessage();
        System.out.println("Test #3: " + errText2);
        double resX5 = result2.getX1();
        Assert.assertNotNull(resX5);
        double resX6 = result2.getX2();
        Assert.assertNotNull(resX6);
        System.out.println("X1 = " + resX5);
        System.out.println("X2 = " + resX6);
        Assert.assertTrue(errText2.contains("дискриминант больше нуля"));

        System.out.println("================================");
        Result result3 = maths.calculate(-1, 2, -2);
        Assert.assertTrue(result3.getDisRes()<0);
        String errText3 = result3.getErrMessage();
        System.out.println("Test #4: " + errText3);


    }


}
