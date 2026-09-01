
public class Overloading {
	
	public void m1(int i) {
		System.out.println(i);
	}
	public void m1(float i) {
		System.out.println(i);
	}
	public void m1(float i, int j) {
		System.out.println(i+" "+j);
	}
	public void m1(int j, float i) {
		System.out.println(i+" "+j);   
	}
	public static void main(String[] args) {
		Overloading  obj = new Overloading ();
		obj.m1(10.5f);
		obj.m1(10);
		obj.m1(5,5.5f);
		obj.m1(5.5f,4);
	}

}
