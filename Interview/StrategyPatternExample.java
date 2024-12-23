package Interview;

public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(50);
        cart.addItem(30);

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout();

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout();

        cart.setPaymentStrategy(new GooglePayPayment());
        cart.checkout();
    }
}