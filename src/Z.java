
public class Z extends test.X{
	public void test() {
		super.i=20;
		//super.j=20;
		super.k1=10;
		super.a1();
		super.a4();
		
		test.X obj = new test.X();
		obj.i=20;
		//obj.j=30;
		//obj.k1=20;
		obj.a1();
	}
}
