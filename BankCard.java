 
/* BankCard, initial details of Clients required by both DebitCard class and CrreditCard clasS
Parent class of DebitCard class and CreditCard Class */
public class BankCard
{
    /*Creating the Instance variable given in question 
    with encapsulation */
    private int cardId;
    private int balanceAmount;
    private String clientName;
    private String issuerBank;
    private String bankAccount;

    /* Creating a Parameterized Constructors of BankCard class
    with Four parameters */
    public BankCard(int cardId, String issuerBank, String bankAccount, int balanceAmount)
    {
        //Assigning the value of instance variable with constructors parameters values
        this.cardId = cardId;
        //Clien Name assigned to an empty String as suggested in th question
        this.clientName = "";
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.balanceAmount = balanceAmount;
    }
    //making all attributes accessor getter method
    public int getCardId()
    {
        return this.cardId;
    }

    public int getBalanceAmount()   
    {
        return this.balanceAmount;
    }

    public String getClientName()
    {
        return this.clientName;
    }

    public String getIssuerBank()
    {
        return this.issuerBank;
    }

    public String getBankAccount()
    {
        return this.bankAccount;
    }

    //Creating setter Method for clientname to set the name of client
    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }

    /* Creating setter method for balanceAmount to set the balanced amount
    also to set the updated balanced amount after withdrawal from DebitCard class */
    public void setBalanceAmount(int balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
    //Creating Display method for giving Bankdetails of user
    public void display()
    {
        /* using if-else loop so that when there is no client name registered
        the bankdetails of user cannot be accessed */
        if (this.clientName.equals("")) {
            System.out.println("Please, Register The Client Name!");
        }
        else {
            System.out.println("Card ID: "+this.cardId);
            System.out.println("Client Name: "+this.clientName);
            System.out.println("Bank Account No: "+this.bankAccount);
            System.out.println("Bank issued: "+this.issuerBank);
            System.out.println("BalanceAmount: "+this.balanceAmount);
        }
    }
}