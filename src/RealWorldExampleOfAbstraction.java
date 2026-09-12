///*
// * Real-World Example of Abstraction
// * Consider a banking system: 
// * A customer only needs to know how to deposit or withdraw money.
// * The implementation details (like database operations, security checks) are hidden. 
// */
// Abstract class representing a bank 
abstract class Bank {
	abstract void deposit(double amount);

	abstract void withdraw(double amount);
}

// Concrete class for a specific bank 
class SBI extends Bank {
	private double balance = 5000;

	@Override
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount + ". New Balance: " + balance);
	}

	void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount + ". Remaining Balance: " + balance);
		} else {
			System.out.println("Insufficient balance!");
		}
	}
}

public class RealWorldExampleOfAbstraction {
	public static void main(String[] args) {
		Bank myBank = new SBI();
		myBank.deposit(2000);
		myBank.withdraw(3000);
	}
}