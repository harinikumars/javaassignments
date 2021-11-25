package assignments.oopsassignment.abstraction;


public abstract class Bank {

    //declare non-static variables and abstract methods for implementation

    String bankName;
    String ifscCode;

    abstract void displayBankDetails();
    abstract void denominationListInTheBank();

}
