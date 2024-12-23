package JavaClass;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread withdrawThread = new Thread(() -> {
            try {
                account.withdraw(7000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread depositThread = new Thread(() -> {
            account.deposit(3000);
        });
        withdrawThread.start();
        depositThread.start();
    }
}