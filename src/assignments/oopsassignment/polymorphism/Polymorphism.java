package assignments.oopsassignment.polymorphism;

import java.math.BigDecimal;

public class Polymorphism {
    //declaring the static variables
    static double number1;
    static double number2;
    static double number3;

    //example of method overloading (same method name but arguments different) - compile time polymorphism
    static void largestOfGivenNumbers(double number1, double number2) {
        if (number1 > number2) {
            System.out.println("The largest number is : " + new BigDecimal(number1).toPlainString());
        } else {
            System.out.println("The largest number is : " + new BigDecimal(number2).toPlainString());
        }
    }

    //example of method overloading (same method name but arguments different) - compile time polymorphism
    static void largestOfGivenNumbers(double number1, double number2, double number3) {
        if ( number1> number2 &&  number1> number3) {
            System.out.println("The largest number is : " + new BigDecimal(number1).toPlainString());
        } else if (number2 >number1  && number2 > number3) {
            System.out.println("The largest number is : " + new BigDecimal(number2).toPlainString());
        } else {
            System.out.println("The largest number is : " + new BigDecimal(number3).toPlainString());
        }
    }

    //example of method overriding (same method name and arguments but child class behaviour will be different) - runtime polymorphism
    void operatorOverloading(String input1, String input2) {
        Double sum =  Double.parseDouble(input1) + Double.parseDouble(input2);
        System.out.println("The sum is : " + new BigDecimal(sum).toPlainString());
    }
}
