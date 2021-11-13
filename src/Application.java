public class Application {
    public static void main(String[] args) {
        //creating the student object using the arg constructor
        Student student1 = new Student(3, "Rekha", 56);
        student1.checkIfStudentPassedOrFailed(student1.marks, student1.name);
        //creating the student object using the arg constructor
        Student student2 = new Student(4, "Deepa", 26);
        student2.checkIfStudentPassedOrFailed(student2.marks, student2.name);
        //creating the student object using the no arg constructor
        Student student3 = new Student();
        student3.checkIfStudentPassedOrFailed(student3.marks, student3.name);
        //creating the student object using the parametrised constructor and display the student details
        Student student4 = new Student(1, "Vibha");
        student4.studentDetailsDisplay(student4.rollNumber,student4.name);
    }
}
