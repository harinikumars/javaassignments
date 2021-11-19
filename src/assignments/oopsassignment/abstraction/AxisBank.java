package assignments.oopsassignment.abstraction;

import javax.imageio.plugins.tiff.TIFFTagSet;

public class AxisBank extends Bank{

    public static void main(String[] args) {
        AxisBank axisBank = new AxisBank();
        axisBank.bankName="Axis Bank";
        axisBank.ifscCode="axb67";
        axisBank.displayBankDetails();
        axisBank.denominationListInTheBank();
    }

    @Override
    void displayBankDetails() {
        System.out.println("The bank name is " +bankName+ " with the IFSC Code as : " +ifscCode);
    }

    @Override
    void denominationListInTheBank() {
        System.out.println("In AxisBank, we have these denominations : \nValue\tCount\n500\t\t35\n2000\t50");
    }
}
