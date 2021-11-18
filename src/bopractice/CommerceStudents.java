package bopractice;

public class CommerceStudents extends Student{
    public int accounts;
    public int economics;
    public int businessStudies;

    CommerceStudents(String name, int accounts, int economics, int businessStudies){
        super.name = name;
        this.accounts = accounts;
        this.economics = economics;
        this.businessStudies = businessStudies;
    }

    void printMarks(){
        System.out.println(name + " has scored " +accounts+ " in Accounts, " +economics+ " in Economics and " +businessStudies+ " in Business Studies.");
    }
}
