public class Bankaccount {
    private double balance;

    public Bankaccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
           this.balance += amount;
            System.out.println("Account Balance After Deposit: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
            System.out.printf("Account Balance After Withdrawal: " + this.balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double checkbalance() {
        return this.balance;
    }
}

