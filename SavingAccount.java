class SavingAccount extends BankAccount {

    private double interestRate;
    
    public SavingAccount(String accountHolderName, double initialDeposit, double interestRate) {
        super(accountHolderName, initialDeposit,"saving account", 5.0);
        this.interestRate = interestRate;
    }

    public void applyIntrest(){
        double interest = getBalance()*(interestRate/100);
        deposit(interest);
        System.out.println("Interest Updated.your new balance is: "+ getBalance());
    }

}
