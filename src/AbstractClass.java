abstract class A1{
	int i;
	abstract String getData();
	public void print() {
		System.out.println(getData());
	}
}

class A1Impl1 extends A1{
	String getData() {
		return "c1";
	}
}

class A1Impl2 extends A1{
	String getData() {
		return "c2";
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		A1 b1 = new A1Impl1();
		b1.print();
		A1 b2 = new A1Impl2();
		b2.print();
		

	}

}
