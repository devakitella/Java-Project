package Interview;

public class GooglePayPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Google Pay.");
    }
}