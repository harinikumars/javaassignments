package bopractice;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int d = 10;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by 0");
        }
        System.out.println(d);
    }
}
