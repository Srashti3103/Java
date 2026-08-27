class c1 {
	c1() {
		System.out.println("c1");
	}
}




//class b1 extends c1{
//	b1(int i) {
//		System.out.println("b1");
//	}
//}





//class b1 extends c1{
//	b1() {
//		System.out.println("b1");
//	}
//}





//class b1 extends c1 {
//	b1() {
//		System.out.println("b1");
//	}
//
//	b1(int i) {
//		System.out.println(i);
//	}
//
//}


class b1 extends c1{
	b1(){//super();
		System.out.println("b1");
		
	}
	b1(int i){
		this();
		System.out.println(i);
	}
}



public class MultilevelInheritance extends b1 {
	public MultilevelInheritance() {
		// super()---->>>> default if no constructor is call then super ka default
		// constructor call hoga
		super(5);
		System.out.println("MultilevelInheritance");
	}

	public static void main(String[] args) {
		MultilevelInheritance obj = new MultilevelInheritance();
	}

}
