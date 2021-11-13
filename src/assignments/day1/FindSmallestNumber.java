package assignments.day1;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {

        //take the array size input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        //declare, instantiate the array
        int[] arr = new int[size];

        //initialise the array with values from the user
        for (int j = 0; j < size; j++) {
            System.out.println("Enter the number:");
            arr[j] = sc.nextInt();
        }

        //print the array
        System.out.println(Arrays.toString(arr));

        //print the smallest number in the array
        System.out.printf("Smallest number in the array is: " + smallestNumberInTheArray(arr));
    }

    public static int smallestNumberInTheArray(int arr[]) {
        //initialise a temp variable
        int number = 0;

        //handling the 0 size condition
        if (arr.length == 0){
            return number;
        }
        //handling the array size as 1 condition
        else if (arr.length == 1) {
            return arr[0];
        }
        //finding the smallest number for array size above 1
        else {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] < number) {
                    number = arr[i];
                }
            }
            return number;
        }
    }
}

