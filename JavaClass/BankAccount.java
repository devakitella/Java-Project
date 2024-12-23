package JavaClass;

class BankAccount {
    private int balance = 5000;

    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println("Attempting to withdraw: " + amount);
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            wait(); // Wait until balance is sufficient
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }


    public synchronized void deposit(int amount) {
        System.out.println("Depositing: " + amount);
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
        //notify(); // Notify one single thread that is waiting
        notifyAll(); // Notify all waiting threads
    }
}