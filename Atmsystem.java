import java.util.Scanner;

public class Atmsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your initial account balance: ");
        double initialbalance = scanner.nextDouble();
        Bankaccount userAccount = new Bankaccount(initialbalance);

        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please select an option (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                }
                case 2 -> {
                    System.out.println("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                }
                case 3 -> System.out.println("Current balance:" + userAccount.checkbalance());
                case 4 -> {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

