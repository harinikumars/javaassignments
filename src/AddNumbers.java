import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        /*Initializing the number 1*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        float number1 = sc.nextFloat();
        /*Initializing the number 2*/
        System.out.println("Enter the 2 number");
        float number2 = sc.nextFloat();
        /*Adding the numbers*/
        float sum = number1 + number2;
        /*Printing the variable*/
        System.out.println(sum);
        /*Printing the variable with a message*/
        System.out.println("The sum of the numbers is :" + sum);
        /*Printing the variable directly on the print statement*/
        System.out.println(number1 + number2);
        /*Printing the variable directly on the print statement with a message*/
        System.out.println("The sum of the numbers is :" + (number1 + number2));
    }
}
