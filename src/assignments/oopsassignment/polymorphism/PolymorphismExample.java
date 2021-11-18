package assignments.oopsassignment.polymorphism;

public class PolymorphismExample extends Polymorphism{
    public static void main(String[] args) {

        String input1 = "Hi!";
        String input2 = "There.";
        number1=2;
        number2=3;
        number3=4;
        largestOfGivenNumbers(number1, number2);
        largestOfGivenNumbers(number1, number2, number3);
        Polymorphism objOfChild = new PolymorphismExample();
        Polymorphism objOfParent = new Polymorphism();
        objOfChild.operatorOverloading(input1,input2);
        objOfParent.operatorOverloading("3","4");
    }
        void operatorOverloading(String input1, String input2){
            System.out.println("Concatenating strings : " +(input1+input2));
        }
    }
