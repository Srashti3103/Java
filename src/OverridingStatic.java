
public class OverridingStatic {
	static int i;
	//int i;
	
	public OverridingStatic(){
		i++;
		System.out.println(i);
	}
	public static void abc() {
		//Static method can access only static content 
		System.out.println("abc");
		i=10;
		//j=10;
	}
	int j;
	void x() {
		// non static  method can access both static and non static var
		i= 10;
		j=10;
	}
	
	public static void main(String[] args) {
		//i=10;
		//abc();
		OverridingStatic obj1 = new OverridingStatic();
		OverridingStatic obj2 = new OverridingStatic();
		OverridingStatic obj3 = new OverridingStatic();
		
	}

}
