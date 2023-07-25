package designPattens;

public class StrategyPattern {

    interface PaymentStrategy {
        void pay(int amount);
    }

    static class CreditCardPayment implements PaymentStrategy {
        @Override
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using Credit Card.");
        }
    }

    static class PayPalPayment implements PaymentStrategy {
        @Override
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using PayPal.");
        }
    }

    static class ShoppingCart {
        private PaymentStrategy paymentStrategy;

        public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void checkout(int amount) {
            paymentStrategy.pay(amount);
        }
    }


        public static void main(String[] args) {
            int totalAmount = 100;

            ShoppingCart cart = new ShoppingCart();

            cart.setPaymentStrategy(new CreditCardPayment());
            cart.checkout(totalAmount);

            cart.setPaymentStrategy(new PayPalPayment());
            cart.checkout(totalAmount);
        }
    }


