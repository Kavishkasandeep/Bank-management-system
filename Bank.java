import java.util.ArrayList;

class Bank {
    private static ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public static void createSavingAccount(String name, double initialDeposit, double interestRate) {
        BankAccount account = new SavingAccount(name, initialDeposit, interestRate);
        bankAccounts.add(account);
        System.out.println("Successful Saving Account Created with Account Number: " + account.getBankAccountNumber());
    }

    public static void createCurrentAccount(String name, double initialDeposit, double overdraftLimit) {
        BankAccount account = new CurrentAccount(name, initialDeposit, overdraftLimit);
        bankAccounts.add(account);
        System.out.println("Successful Current Account Created with Account Number: " + account.getBankAccountNumber());
    }

    public static BankAccount getAccountByBankAccountNumber(int bankAccountNumber) {
        for (BankAccount account : bankAccounts) {
            if (account.getBankAccountNumber() == bankAccountNumber) {
                return account;
            }
        }
        return null;
    }



    public static void showAllAccounts() {
        for (BankAccount account : bankAccounts) {
            System.out.println("Account Number: "+account.getBankAccountNumber());
            System.out.println("Account Holder: "+account.getAccountHolderName());
            System.out.println("Account Balance: "+account.getBalance());
        }
    }


}
