
//DebitCard class usually for withdrawing money
public class DebitCard extends BankCard {
    /*
     * Creating the Instance variable given in question
     * with encapsulation
     */
    private int pinNumber, withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;

    /*
     * Creating a parameterized constructor of DebitCard class
     * with 6 parameters
     */
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName,
            int pinNumber) {
        // calling superclass constructors with 4 parameters
        super(cardId, issuerBank, bankAccount, balanceAmount);
        // calling a method from super class to set the clientname
        super.setClientName(clientName);
        // Assigning the value of WithdrawalAmount to 0
        this.withdrawalAmount = 0;
        // assigning the value of instance varaiable dateOfWithdrawal to an empty string
        this.dateOfWithdrawal = "";
        // assigning the value of instance varaiable pinNumber with the localvariable
        // pinNumber
        this.pinNumber = pinNumber;
        // Assining the value of instance variable hasWithdrawn to false
        this.hasWithdrawn = false;
    }

    // creating all attributes accessor/setter method
    public int getPinNumber() {
        return this.pinNumber;
    }

    public int getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public String getDateOfWithdrawal() {
        return this.dateOfWithdrawal;
    }

    public boolean getHasWithdrawn() {
        return this.hasWithdrawn;
    }

    // setter or mutator method for attribute: withdrawalAmount
    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    // creating withdraw method for withdrawing amount with 3 parameters passed
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber) {
        // initialising balanceAmount to the value of superclass getBalanceAmount()
        int balanceAmount = super.getBalanceAmount();
        // checking the pinNumber
        if (pinNumber == this.pinNumber) {
            /*
             * if valid pin number is entered
             * balanced amount will be checked with withdrawal amount
             */
            if (balanceAmount >= withdrawalAmount) {
                /*
                 * if balanceamount is higher or equal to withdrawn amount
                 * the amount will be withdrawn--
                 */
                this.hasWithdrawn = true;
                balanceAmount -= withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
                // balanceAmount will be updated in superclass
                super.setBalanceAmount(balanceAmount);
                setWithdrawalAmount(withdrawalAmount);
                System.out.println("\n");
                System.out.println(
                        withdrawalAmount + " amount has been Withdrawn Successfully and the Remaining Balance is "
                                + balanceAmount + "\n");
            } else {
                /*
                 * if the balance amount is less than withdrawn amount
                 * some message will be printed
                 */
                System.out.println("Insufficient Balance Amount!\n");
            }
        } else {
            // if the pin number is not valid,some message is Display
            System.out.println("Please,Enter a valid Pin Number!\n");
        }
    }

    // Creating the display method to display the debit card details along with some
    // bankcard details
    public void display() {
        super.display();
        // checking to see user has withdrawn amount or not
        if (hasWithdrawn == true) {
            /*
             * if the user has withdrawn the amount, then
             * parentclass details along with all debit card details will be displayed
             */
            System.out.println("Pin Number: " + this.pinNumber);
            System.out.println("Withdrawal Amount: " + this.withdrawalAmount);
            System.out.println("Date Of Withdrawn: " + this.dateOfWithdrawal);
        } else {
            System.out.println("Remaining Balance Amount: " + super.getBalanceAmount());
        }
    }
}