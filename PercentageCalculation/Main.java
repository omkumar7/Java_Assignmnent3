package PercentageCalculation;

public class Main {

    public static void main(String[] args) {
        StudentA A = new StudentA(78, 87, 65);
        double a = A.getPercentage();

        StudentB B = new StudentB(47, 63, 90, 71);
        double b = B.getPercentage();

        System.out.println("Percentage of student A : " + a);
        System.out.println("Percentage of student B : " + b);
    }
}
