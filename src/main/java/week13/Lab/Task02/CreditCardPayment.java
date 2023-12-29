package week13.Lab.Task02;

class CreditCardPayment implements Payment{
    public void processPayment() {
        System.out.println("Credit card payment successfully processed");
    }
}

class CreditCardPaymentFactory implements PaymentFactory{
    public static Payment createPayment() {
        return new CreditCardPayment();
    }
}