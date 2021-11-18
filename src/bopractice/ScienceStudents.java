package bopractice;

public class ScienceStudents extends Student {
    public int physics;
    public int chemistry;
    public int maths;

    ScienceStudents(String name, int physics, int chemistry, int maths) {
        super.name=name;
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
    }

    void displayMarks() {
        System.out.println(name + " has scored " + physics + " in Physics, "  + chemistry + " in chemistry and " + maths + " in Maths.");
    }

}
