package assignments.oopsassignment.Interfaces;

public class HDFCBank implements BankInterface {

    public static void main(String[] args) {
        String name = "HDFC Bank";
        String ifsc = "HD567";

        HDFCBank hdfcBank = new HDFCBank();
        hdfcBank.displayBankDetails(name,ifsc);
        hdfcBank.displayDenominationAvailable();

    }
    @Override
    public void displayBankDetails(String bankName, String ifscCode) {
        System.out.println("Welcome to " +bankName+" !");
        System.out.println("The IFSC Code as : " +ifscCode+"\n");
    }

    @Override
    public void displayDenominationAvailable() {
        System.out.println("The available denomination in the bank is : \nValue\tCount\n100\t\t20\n500\t\t25\n2000\t50");
    }
}
