package PercentageCalculation;

public class StudentA extends Marks {
    private float sub1, sub2, sub3;

    public StudentA(float s1, float s2, float s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    double getPercentage() {
        return (sub1 + sub2 + sub3) / 300.0 * 100;
    }

    @Override
    double getpercentage() {
        return 0;
    }
}