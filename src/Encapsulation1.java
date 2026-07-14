/*
 * o Encapsulation is the process of bundling data (attributes) and methods 
(behaviors) that operate on the data into a single unit (class). 
o It also involves restricting direct access to some of an object's components, 
which is achieved using access modifiers (private, public, protected). 
 */

class BankAccount {
	private double balance; // Private attribute

	public void deposit(double amount) { // Public method
		if (amount > 0) {
			balance += amount;
		}
	}

	public double getBalance() { // Public method
		return balance;
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
