package PercentageCalculation;

public class StudentB extends Marks{
    private float sub1, sub2, sub3, sub4;

    public StudentB(float s1, float s2, float s3, float s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
}
    double getPercentage() {
        return (sub1 + sub2 + sub3 +sub4)/400.0 * 100;
    }

    @Override
    double getpercentage() {
        return 0;
    }
}
