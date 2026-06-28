//creating package 
package account;

public class Balance {
	String name ;
	double balance;
	public Balance(String n, double b ) {
		this.name = n;
		this.balance = b;
		
	}
	public void show() {
		System.out.println("Name :"+this.name +"balance :"+this.balance+"Rs.");
		
	}
}
