package bopractice;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int startNumber = sc.nextInt();
        System.out.println("Enter the end number:");
        int endNumber = sc.nextInt();
        sumOfNumbers(startNumber, endNumber);
        sumEvenNumbers(startNumber, endNumber);
    }

    static void sumOfNumbers(int startNumber, int endNumber) {
        int result = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            result += i;
        }
        System.out.println("Sum of the numbers between " +startNumber+ " and "+endNumber+ " is: " + result);
    }

    static void sumEvenNumbers(int startNumber, int endNumber) {
        int evenNumberResult = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 == 0) {
                evenNumberResult += i;
            }
        }
        System.out.println("Sum of the even numbers between "+startNumber+ " and "+endNumber+ " is: " +evenNumberResult);
    }
}
