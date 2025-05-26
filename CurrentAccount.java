class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(int bankAccountNumber, String accountHolderName, double balance, String accountType,double overdraftLimit) {
        super(accountHolderName, balance, accountType, 5.0);
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(String name, double initialDeposit, double overdraftLimit) {
        super(name,initialDeposit, String.valueOf(overdraftLimit), 5.0);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount, double sum) {
        if (amount > 0 && (getBalance() - amount >= -overdraftLimit)) {
            setBalance(getBalance() - amount); // Decrease the balance
            System.out.println("Successful withdrawal. Your new balance is: " + getBalance());
        } else {
            System.out.println("Not enough funds. Withdrawal denied.");
        }
    }

}



