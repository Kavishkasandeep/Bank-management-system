import java.util.Scanner;

public class main {

    private static double sum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("_Bank Management System_");
            System.out.println("1. Create Saving Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.println("Enter Your Answer: ");

            int answer = scanner.nextInt();
            switch (answer){
                case 1:
                    System.out.println("Enter Your Name: ");
                    String name1 = scanner.next();
                    System.out.println("Enter Intirial Deposit: ");
                    double deposit1 = scanner.nextDouble();
                    System.out.println("Enter Interest Rate: ");
                    double interest1 = scanner.nextDouble();
                    Bank.createSavingAccount(name1,deposit1,interest1);
                    break;

                case 2:
                    System.out.println("Enter Your Name: ");
                    String name2 = scanner.next();
                    System.out.println("Enter Intirial Deposit: ");
                    double deposit2 = scanner.nextDouble();
                    System.out.println("Enter Overdraft Limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    Bank.createCurrentAccount(name2,deposit2,overdraftLimit);
                    break;

                case 3:
                    System.out.println("Enter Account Number: ");
                    int accNumDiposit = scanner.nextInt();
                    BankAccount accountDeposit = Bank.getAccountByBankAccountNumber(accNumDiposit);
                    if (accountDeposit !=null){
                        System.out.println("Enter Deposit Amount: ");
                        double depositAmount = scanner.nextDouble();
                        accountDeposit.deposit(depositAmount);
                    }else {
                        System.out.println("Amount not found..");
                    }
                    break;

                case 4:
                    System.out.println("Enter Account Number: ");
                    int accNumWithdraw = scanner.nextInt();
                    BankAccount accountWithdraw = Bank.getAccountByBankAccountNumber(accNumWithdraw);
                    if (accountWithdraw != null){
                        System.out.println("Enter withdraw Amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        accountWithdraw.withdraw(withdrawAmount,sum);
                    }else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    int accNumBalance = scanner.nextInt();
                    BankAccount accountBalance = Bank.getAccountByBankAccountNumber(accNumBalance);
                    if(accountBalance != null){
                        accountBalance.checkBalance();
                    }else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    Bank.showAllAccounts();
                    break;

                case 7:
                    System.out.println("Thank You..Good Byee..!!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Answer.Please Try Again.");
            }
        }

    }
}