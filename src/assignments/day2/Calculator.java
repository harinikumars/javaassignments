package assignments.day2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operationOptions = {"1 : Addition", "2 : Subtraction", "3 : Multiplication", "4 : Division"};
        System.out.println("Enter the operation you want to perform from the list:" + Arrays.toString(operationOptions));
        int userResponse = scanner.nextInt();
        if (userResponse == 1) {
            System.out.println("The sum for the numbers provided is: " + addition());
        } else if (userResponse == 2) {
            System.out.println("The difference for the numbers provided is: " + subtraction());
        } else if (userResponse == 3) {
            double product = multiplication();
            System.out.println("The product for the numbers provided is: " + new BigDecimal(product).toPlainString());
        } else if (userResponse == 4) {
            division();
        } else {
            System.out.println("Please enter a valid option.");
        }
    }

    static double addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add:");
        int number = scanner.nextInt();
        double[] addArray = new double[number];
        int j = 0;
        double sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the number: ");
            addArray[i] = scanner.nextDouble();
        }
        while (j < addArray.length) {
            sum += addArray[j];
            j++;
        }
        return sum;
    }

    static double multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to multiply:");
        int number = scanner.nextInt();
        double[] multArray = new double[number];
        double product = 1;
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the number: ");
            multArray[i] = scanner.nextDouble();
        }
        for (int j = 0; j < multArray.length; j++) {
            product *= multArray[j];
        }
        return product;
    }

    static double subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to subtract:");
        int number = scanner.nextInt();
        double[] subArray = new double[number];
        double difference = 0;
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the number: ");
            subArray[i] = scanner.nextDouble();
        }
        for (int j = 0; j < subArray.length; j++) {
            difference -= subArray[j];
        }
        return difference;
    }

    static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.println("Enter the divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Sorry! The Division cannot be performed.");
        } else {
            System.out.println("The quotient for the dividend " + new BigDecimal(dividend).toPlainString() + " and the divisor " + new BigDecimal(divisor).toPlainString() + " is " + new BigDecimal(dividend / divisor).toPlainString());
            System.out.println("The remainder for the dividend " + new BigDecimal(dividend).toPlainString() + " and the divisor " + new BigDecimal(divisor).toPlainString() + " is " + new BigDecimal(dividend % divisor).toPlainString());
        }
    }
}
