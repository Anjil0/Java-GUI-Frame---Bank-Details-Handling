 
//CreditCard class, for cancelling creditcard, giving creditlimit
public class CreditCard extends BankCard 
{
    /* Creating the Instance variable Which are given in question 
    with encapsulation */
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    /* Creating a Parameterized Constructors of CreditCard class
    with eight parameters */
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount,int balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        //calling superclass constructors with 4 parameters
        super(cardId, issuerBank, bankAccount, balanceAmount);
        //calling a method from super class to set the clientname
        super.setClientName(clientName);
        //Assigning the value of instance variable with constructors parameters values
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;  
        //Assigning the value of instancevariable isGranted to false
        this.isGranted = false;
    }
    
    //creating Accessor / setter method of each Attributes
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }

    public double getCreditLimit()
    {
        return this.creditLimit;
    }

    public double getInterestRate()
    {
        return this.interestRate;
    }

    public String getExpirationDate()
    {
        return this.expirationDate;
    }

    public int getGracePeriod()
    {
        return this.gracePeriod;
    }

    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    
    //setter or mutator method To set the credit limit and gracePeriod with 2 parameters
    public void setCreditLimit(double creditLimit, int gracePeriod)
    {
        //initialising balanceAmount to the value of superclass getter method getBalanceAmount()
        int balanceAmount = super.getBalanceAmount();
        if(creditLimit <= 2.5*balanceAmount) {
            /* if the creditlimit is less than or equal to 2.5 times of balance amount
            the creditlimit will be granted */
            this.isGranted = true;
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            System.out.println("\n");
            System.out.println("Successfully Granted CreditLimit");
        }
        else {
            /* if the credit limit is higher than 2.5 times of balance amount 
            failed msg will be printed */
            System.out.println("\n");
            System.out.println("Failed to Grant CreditLimit");
        }
    }
    
    //creating a method to cancel the creditcard
    public void cancelCreditCard()
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
        System.out.println("\n");
        System.out.println("Successfully cancelled Credit Card");
    }
    
    //creating display method to display the details of creditcard
    public void display()
    {
        super.display();
        System.out.println("InterestRate: "+this.interestRate);
        System.out.println("Expiration Date: "+this.expirationDate);
        //checking if creditlimit has been granted or not
        if(this.isGranted == true) {
            /* if the creditlimit has been granted, then
            all creditcard details will be displayed */
            System.out.println("CVC Nuumber: "+this.cvcNumber);
            System.out.println("Credit Limit: "+this.creditLimit);
            System.out.println("Grace Period: "+this.gracePeriod);
        }
    }
}
