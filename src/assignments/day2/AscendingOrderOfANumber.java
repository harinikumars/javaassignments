package assignments.day2;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrderOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        ascendingOrderOfNumbers(userInput);
        orderAscending(userInput);
    }

    static void ascendingOrderOfNumbers(int number) {
        int length = String.valueOf(number).length();

        if (number == 0) {
            System.out.println("Please enter a valid number:");
        } else if (number != 0 && length == 1) {
            System.out.println("It's only 1 digit. Please enter a string or a number of more than 1 character.");
        } else {
            int initialNumber = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= 9; i++) {
                int inputNumber = number;
                while (inputNumber > 0) {
                    int modulusResult = inputNumber % 10;
                    if (modulusResult == i) {
                        initialNumber *= 10;
                        initialNumber += modulusResult;
                        sb.append(modulusResult);
                    }
                    inputNumber /= 10;
                }
            }
            System.out.println(sb);
        }
    }

    static void orderAscending(int number) {
        int length = String.valueOf(number).length();
        int userInputNumber = number;
        int[] numberArray = new int[length];
        for (int i = 0; i < length; i++) {
            numberArray[i] = userInputNumber%10;
            userInputNumber=userInputNumber/10;
        }
        int init = 0;
        for (int j = 0; j < numberArray.length; j++) {
            for (int k = j + 1; k < numberArray.length; k++) {
                if (numberArray[k] < numberArray[j]) {
                    init = numberArray[j];
                    numberArray[j] = numberArray[k];
                    numberArray[k]=init;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int a: numberArray){
            sb.append(a);
        }
        System.out.println(sb);
    }
}
