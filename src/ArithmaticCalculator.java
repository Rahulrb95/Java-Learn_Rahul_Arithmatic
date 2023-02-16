import java.util.Scanner;

public class ArithmaticCalculator {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any two positive integer numbers:");

        // Reading data using readLine
        int p = in.nextInt();
        int q = in.nextInt();

        System.out.println("\nSUM         " + p + " + " + q + " = " + Sum(p, q));
        System.out.println("DIFFERENCE  " + p + " - " + q + " = " + Sub(p, q));
        System.out.println("PRODUCT     " + p + " * " + q + " = " + Mul(p, q));
        System.out.println("QUOTIENT    " + p + " / " + q + " = " + Div(p, q));
        System.out.println("MODULUS     " + p + " % " + q + " = " + Mod(p, q));
    }

    // To make sum of two numbers
    public static int Sum(int x, int y) {
        return x + y;
    }

    // To make subtraction of two numbers
    public static int Sub(int x, int y) {
        return x - y;
    }

    // To make multilication of two numbers
    public static int Mul(int x, int y) {
        return x * y;
    }

    // To make division of two numbers
    public static float Div(int x, int y) {
        return x / y;
    }

    // To make modulus of two numbers
    public static int Mod(int x, int y) {
        return x % y;
    }
}
