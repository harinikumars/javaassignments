package assignments.oopsassignment.Interfaces;

public class AxisBank implements BankInterface {

    public static void main(String[] args) {
        AxisBank axisBank = new AxisBank();
        axisBank.displayBankDetails("AxisBank","AXB145");
        axisBank.displayDenominationAvailable();
    }
    @Override
    public void displayBankDetails(String bankName, String ifscCode) {
        System.out.println("The bank name is " +bankName+ " with the IFSC Code as : " +ifscCode+"\n");
    }

    @Override
    public void displayDenominationAvailable() {
        System.out.println("In AxisBank, we have these denominations : \nValue\tCount\n500\t\t35\n2000\t50");
    }
}
