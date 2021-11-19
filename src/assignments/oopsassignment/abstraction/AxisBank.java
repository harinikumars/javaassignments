package assignments.oopsassignment.abstraction;

public class AxisBank extends Bank{

    public static void main(String[] args) {
        AxisBank axisBank = new AxisBank();
        name = "Axis Bank";
        ifscCode = "a1b23243";
        axisBank.displayBankDetails();
        axisBank.denominationListInTheBank();
    }

    @Override
    void displayBankDetails() {
        System.out.println("The bank name is " +name+ " with the IFSC Code as : " +ifscCode);
    }

    @Override
    void denominationListInTheBank() {
        System.out.println("In AxisBank, we have these denominations : \nValue\tCount\n500\t\t35\n2000\t50");
    }
}
