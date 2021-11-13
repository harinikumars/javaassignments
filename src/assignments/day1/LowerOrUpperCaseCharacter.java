package assignments.day1;

import java.util.Scanner;

public class LowerOrUpperCaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char character = sc.next().charAt(0);
        System.out.println("You have entered : " + character);
        isUpperOrLower(character);
    }

    static void isUpperOrLower(char character){
        if(character >='A' && character <= 'Z'){
            System.out.println("The character entered is Upper Case.");
        }
        else if(character >='a' && character <= 'z'){
            System.out.println("The character entered is Lower Case.");
        }
        else {
            System.out.println("The entered value is not a character.");
        }
    }
}
