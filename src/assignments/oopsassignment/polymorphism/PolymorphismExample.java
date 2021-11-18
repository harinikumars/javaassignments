package assignments.oopsassignment.polymorphism;

//inheriting the parent class
public class PolymorphismExample extends Polymorphism {
    public static void main(String[] args) {

        //initialising variables
        String input1 = "Hi!";
        String input2 = "There.";
        number1=789;
        number2=356789;
        number3=43676845;

        //checking method overloading (compile time polymorphism) - to find largest of 2 numbers
        largestOfGivenNumbers(number1, number2);

        //checking method overloading (compile time polymorphism) - to find largest of 3 numbers
        largestOfGivenNumbers(number1, number2, number3);

        //creating objects of parent class and child class to check method overriding
        Polymorphism objOfChild = new PolymorphismExample();
        Polymorphism objOfParent = new Polymorphism();

        //method overriding example - operator overloading for String input concatenation
        objOfChild.operatorOverloading(input1,input2);

        //method overriding example - operator overloading for double input concatenation
        objOfParent.operatorOverloading("390878.567","421321");
    }

    //child class overriding the parent class method for operator overloading which is an example of method overriding of runtime polymorphism
        void operatorOverloading(String input1, String input2){
            System.out.println("Concatenating strings : " +(input1+input2));
        }
    }
