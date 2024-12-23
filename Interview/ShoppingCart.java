package Interview;

public class ShoppingCart {
    private int totalAmount = 0;
    private PaymentStrategy paymentStrategy;

    public void addItem(int price) {
        totalAmount += price;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method.");
        } else {
            paymentStrategy.pay(totalAmount);
        }
    }
}
