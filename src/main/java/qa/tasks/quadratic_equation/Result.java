package qa.tasks.quadratic_equation;

public class Result {
    private double x1;
    private double x2;
    private double disRes;
    private String errMessage;

    public double getDisRes() {
        return disRes;
    }

    public void setDisRes(double disRes) {
        this.disRes = disRes;
    }




    public Result() {

    }


    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
