package assignments.oopsassignment.abstraction;


public class HDFCBank extends Bank{

    public static void main(String[] args) {
        HDFCBank hdfcBank = new HDFCBank();
        hdfcBank.bankName = "HDFC Bank";
        hdfcBank.ifscCode = "a1b2c3";
        hdfcBank.displayBankDetails();
        hdfcBank.denominationListInTheBank();
    }

    @Override
    void displayBankDetails() {
        System.out.println("Welcome to HDFC Bank!");
        System.out.println("The IFSC Code as : " +ifscCode);
    }

    @Override
    void denominationListInTheBank() {
        System.out.println("The available denomination in the bank is : \nValue\tCount\n100\t\t20\n500\t\t25\n2000\t50");
    }
}
