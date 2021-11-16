package assignments;

import assignments.Interfaces.Animal;

public abstract class Dog implements Animal {

    @Override
    public void bark() {
        System.out.println("I love barking!");
    }

    @Override
    public void nameDisplay(String name) {
        System.out.println("My name is " +name);
    }

    @Override
    public void myFood() {

    }
}
