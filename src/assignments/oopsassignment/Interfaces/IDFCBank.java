package assignments.oopsassignment.Interfaces;

public class IDFCBank implements BankInterface {

    public static void main(String[] args) {
        String bankName = "IDFC";
        String ifscCode = "ID56";

        IDFCBank idfc = new IDFCBank();
        idfc.displayBankDetails(bankName,ifscCode);
        idfc.displayDenominationAvailable();
    }
    @Override
    public void displayBankDetails(String bankName, String ifscCode) {

            System.out.println( bankName+ "'s IFSC Code is : " +ifscCode+"\n");

    }

    @Override
    public void displayDenominationAvailable() {
        System.out.println("At SBI, there are : \nValue\tCount\n50\t\t35\n100\t\t50\n500\t\t35\n2000\t50");
    }
}
