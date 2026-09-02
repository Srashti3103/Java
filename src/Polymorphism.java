/*
 *Real-World Example of Polymorphism
 *Consider a payment system where different payment methods (credit card, PayPal, etc.)
 *have the same method name but different implementations. 
 *
 */
//Parent class 
class Payment { 
    void pay(double amount) { 
        System.out.println("Payment of $" + amount + " processed."); 
    } 
} 
 
// Child class - Credit Card Payment 
class CreditCardPayment extends Payment { 
    @Override 
    void pay(double amount) { 
        System.out.println("Credit Card Payment of $" + amount + " processed."); 
    }
} 
//Child class - PayPal Payment 
class PayPalPayment extends Payment { 
@Override 
void pay(double amount) { 
System.out.println("PayPal Payment of $" + amount + " processed."); 
} 
} 
    
public class Polymorphism {

	public static void main(String[] args) {
		Payment payment;
		payment = new CreditCardPayment(); 
		payment.pay(100.50); // Output: Credit Card Payment of $100.5 processed.
		payment = new PayPalPayment(); 
		payment.pay(200.75); // Output: PayPal Payment of $200.75 processed.
	}

}
