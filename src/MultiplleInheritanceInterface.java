interface A{
	void methodA();
}
interface B{
	void methodB();
}
class C implements A, B{
	public void methodA() {
		System.out.println("Method A implementation");
	}
	public void methodB() {
		System.out.println("Method B implementation");
	}
}
public class MultiplleInheritanceInterface {

	public static void main(String[] args) {
		C obj = new C();
		obj.methodA();
		obj.methodB();

	}

}
