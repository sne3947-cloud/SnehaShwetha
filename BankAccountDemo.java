import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    long accountNumber;
    String accountType;
    double accountBalance;

    BankAccount(String accountHolderName, long accountNumber, String accountType, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
            return;
        }

        accountBalance += amount;
        System.out.println("Amount Deposited Successfully");
        System.out.println("Current Balance: " + accountBalance);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
            return;
        }

        if (amount > accountBalance) {
            System.out.println("Insufficient Balance");
        } else {
            accountBalance -= amount;
            System.out.println("Amount Withdrawn Successfully");
            System.out.println("Current Balance: " + accountBalance);
        }
    }

    void balanceEnquiry() {
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Type        : " + accountType);
        System.out.println("Account Balance     : " + accountBalance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNo, type, balance);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Enquiry");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.balanceEnquiry();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
