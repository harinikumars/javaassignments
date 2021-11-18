package bopractice;

import java.util.Scanner;

public class PrintDayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if (number >= 1 && number <= 30) {
            if ( number % 7 == 1) {
                System.out.println("It's Monday folks!");
            } else if ( number % 7 == 2) {
                System.out.println("It's Tuesday folks!");
            } else if (number % 7 == 3) {
                System.out.println("It's Wednesday folks!");
            } else if (number % 7 == 4) {
                System.out.println("It's Thursday folks!");
            } else if ( number % 7 == 5) {
                System.out.println("It's Friday folks!");
            } else if (number % 7 == 6) {
                System.out.println("It's Saturday folks!");
            } else {
                System.out.println("It's Sunday folks!");
            }
        } else {
            System.out.println("Please enter a number between 1 and 30");
        }
    }
}
