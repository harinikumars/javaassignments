import java.util.Arrays;
import java.util.Scanner;

public class SumOfIntegersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        insertDataIntoArray(size,arr);
        sumOfNumbersInArray(arr);
    }

    static void insertDataIntoArray(int size, int arr[]) {

        for (int j = 0; j < size; j++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            arr[j] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    static void sumOfNumbersInArray(int arr[]) {
        int sumOfNumbersInArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfNumbersInArray += arr[i];
        }
        System.out.println(sumOfNumbersInArray);
        }

    }
