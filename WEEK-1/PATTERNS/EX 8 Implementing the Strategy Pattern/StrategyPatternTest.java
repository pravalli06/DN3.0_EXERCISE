
public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe", "123", "12/24");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(150.00);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password123");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(200.00);
    }
}