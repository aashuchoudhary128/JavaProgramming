abstract class Payment {
    public abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class UPIPayment extends Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI.");
    }
}

class NetBankingPayment extends Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Net Banking.");
    }
}

public class Assignment12 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();

        double amount = 50.0;

        p1.pay(amount);
        p2.pay(amount);
        p3.pay(amount);
    }
}