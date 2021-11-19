package assignments.oopsassignment.abstraction;

public class StateBank extends Bank{

    public static void main(String[] args) {
        StateBank stateBank = new StateBank();
        stateBank.bankName = "State Bank";
        stateBank.ifscCode = "sb86hsk7";
        stateBank.displayBankDetails();
        stateBank.denominationListInTheBank();
    }

    @Override
    void displayBankDetails() {
        System.out.println( bankName+ "'s IFSC Code is : " +ifscCode);
    }

    @Override
    void denominationListInTheBank() {
        System.out.println("At SBI, there are : \nValue\tCount\n50\t\t35\n100\t\t50\n500\t\t35\n2000\t50");
    }
}
