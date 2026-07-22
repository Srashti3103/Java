package test;
/*
 * default constructor --> made by jvm or java
 * public class X {
 * public X(){
 * }
 * }class X{
 * X(){}  -----> default 
 * }
 * 
 * 
 * 
 * class ----> public,default
 * variable and object ----> private protected public default
 * 
 * 
 * 
 * Developer
 * public class X{
 * public X(){
 * }
 * }
 * 
 * 
 * public class X {
 * X(){}----->default
 * }
 * 
 * public class X{
 * protected X(){
 * }
 * }
 * 
 */

public class X {
	// Singleton class ---> class is public but the constructor is private

	public X() {

	}

	public int i;
	int j;// Default ---> folder Scope
	protected int k1;
	private int k;// Within the class

	public void a1() {
	}

	void a2() {
	}

	private void a3() {
	}

	protected void a4() {
	}

	public void test() {
		this.i = 10;
		this.j = 10;
		this.k = 10;
		this.k1 = 20;
	}
}
