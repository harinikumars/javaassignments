package assignments.day2;

import java.util.Scanner;

public class AscendingOrderOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        ascendingOrderOfNumbers(userInput);
    }

    static void ascendingOrderOfNumbers(int number) {
        int length = String.valueOf(number).length();

        if (number == 0) {
            System.out.println("Please enter a valid number:");
        } else if (number != 0 && length == 1) {
            System.out.println("It's only 1 digit. Please enter a string or a number of more than 1 character.");
        } else {
            int initialNumber = 0;
            for (int i = 0; i <= 9; i++) {
                int inputNumber = number;
                while (inputNumber > 0) {
                    int modulusResult = inputNumber % 10;
                    if (modulusResult == i) {
                        initialNumber *= 10;
                        initialNumber+=modulusResult;
                    }
                    inputNumber /= 10;
                }
            }
            System.out.println(initialNumber);
        }
    }
}
