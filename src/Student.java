public class Student {
    //declaring the properties or state or class variables
    public String name;
    public long rollNumber;
    public int marks;

    //creating a no arg constructor
    public Student() {
        this.rollNumber = 2;
        this.name = "Curie";
        this.marks = 35;
    }

    //creating an arg constructor which is an example of constructor overloading
    public Student(long rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    //creating an arg constructor which is an example of constructor overloading
    public Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    //creating the behaviour or method or function to check the student has passed or failed
    void checkIfStudentPassedOrFailed(int marks, String name) {
        if (marks >= 35) {
            System.out.println(name + " is Passed.");
        } else {
            System.out.println(name + " is Failed.");
        }
    }

    //creating the behaviour or method or function to display the student details
    void studentDetailsDisplay(long rollNumber, String name) {
        System.out.println(name + "'s roll number is: " + rollNumber);
    }
}
