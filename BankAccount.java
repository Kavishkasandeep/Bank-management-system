public class BankAccount{

    private int bankAccountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private double interestRate;
    private static int nextAccountNumber = 1;



    public BankAccount(String accountHolderName, double balance, String accountType, double v) {
        this.bankAccountNumber = nextAccountNumber++;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.interestRate = interestRate;
    }


    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public static int getNextAccountNumber() {
        return nextAccountNumber;
    }

    public static void setNextAccountNumber(int nextAccountNumber) {
        BankAccount.nextAccountNumber = nextAccountNumber;
    }


    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println("Successful Deposit. Your new balance is: " +balance);
        }else {
            System.out.println("Invalid deposit amount.Please try again.");
        }
    }

    public void withdraw(double amount, double sum){
        if(amount < sum) {
            balance -= amount;
            System.out.println("Successfull Withdrawal..your new balance is " + balance);
        }else
        System.out.println("Invalid withdrawal amount. Please try again.");
    }


    public void checkBalance(){
        System.out.println("Current Balance "+balance);
    }

public void applyInterest(){
        if(interestRate > 0) {
            double interest = balance * (interestRate / 100);
            balance+=interest;
            System.out.println("Interest Rate is "+interestRate +"your new balance is "+balance);
        }else {
            System.out.println("Invalid interest rate. Please try again.");
        }

    }

}
