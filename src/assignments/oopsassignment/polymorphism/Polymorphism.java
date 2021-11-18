package assignments.oopsassignment.polymorphism;

public class Polymorphism {

    static double number1;
    static double number2;
    static double number3;

    static void largestOfGivenNumbers(double number1, double number2) {
        if (number1 > number2) {
            System.out.println("The largest number is : " + number1);
        } else {
            System.out.println("The largest number is : " + number2);
        }
    }

    static void largestOfGivenNumbers(double number1, double number2, double number3) {
        if ( number1> number2 &&  number1> number3) {
            System.out.println("The largest number is : " + number1);
        } else if (number2 >number1  && number2 > number3) {
            System.out.println("The largest number is : " + number2);
        } else {
            System.out.println("The largest number is : " + number3);
        }
    }

    void operatorOverloading(String input1, String input2) {
        Double sum =  Double.parseDouble(input1) + Double.parseDouble(input2);
        System.out.println("The sum is : " + sum);
    }
}
