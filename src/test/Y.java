package test;

public class Y extends X {
	public void test() {
		super.i=20;
		super.j=30;
		//super.k=30;
		super.k1=40;
		super.a1();
		super.a2();
		super.a4();
		X obj = new X();
		obj.i=10;
		obj.j=20;
		//obj.k=20;
		obj.k1=30;
		obj.a1();
		obj.a2();
		obj.a4();
	}
}
//extends 
//object
