package bopractice;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = sc.nextInt();
        System.out.println("Enter the third number:");
        int thirdNumber = sc.nextInt();
        int sumTwoNumbers = sumOfNumbers(firstNumber, secondNumber);
        int sumThreeNumbers = sumOfNumbers(firstNumber, secondNumber, thirdNumber);
        System.out.println("Sum of the first 2 numbers is: " +sumTwoNumbers);
        System.out.println("Sum of the first 3 numbers is: " +sumThreeNumbers);
    }
    static int sumOfNumbers(int number1, int number2){
        int sumOfTwoNumbers= number1+number2;
        return sumOfTwoNumbers;
    }
    static int sumOfNumbers(int number1, int number2, int number3){
        int sumOfThreeNumbers= number1+number2+number3;
        return sumOfThreeNumbers;
    }
}
