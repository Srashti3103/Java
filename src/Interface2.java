class Circle1 implements Area{
	public float compute (float a, float b) {
		return pi*a*a;
	}
}
class Rectangle implements Area{
	public float compute(float a, float b) {
		return a*b;
	}
}
public class Interface2 {
	public static void main(String[] args) {
		Circle1 c1 = new Circle1();
		Rectangle r1 = new Rectangle();
		System.out.println(r1.compute(10,20));
		System.out.println(c1.compute(10, 0));
	}
}
