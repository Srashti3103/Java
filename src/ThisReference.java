
public class ThisReference {
	 public ThisReference()
	 {
	  //this(5);
	  System.out.println("No args constructor");
	 }
	 
	 public ThisReference(int i)
	 {
		 this("abc");
	  System.out.println(i);
	 }
	 public ThisReference(String s) {
		 this();
		 System.out.println(s);	 }
	 int i;
	 void x()
	 {
	  int a=5;
	  x2(a);//call
	  //print(a)
	 }
	 ThisReference x1()// return ThisReference object
	 {
	  //ThisReference obj = new ThisReference();
	  //return obj;
	  
	  return this;
	 }
	 String y1()
	 { 
	  return "abc";
	 }
	 
	 void x2(int a)
	 {
	  a=a*a;
	  x3("abc");
	 }
	 void x3(String s)
	 {
	  x4(this);
	 }
	 void x4(ThisReference obj)
	 {
	  this.i=10;
	  i=20;
	  this.x();
	  x();
	 }
	 void x5()
	 {
	  int i=10;
	  i=20;
	  this.i=50;
	 }
	 /*
	  * 4 types functions
	  * 
	  * void x(){}
	  * 
	  * int x(){}---> return one value
	  * float x(){} ---8
	  * 
	  * int[] x(){}--->int array
	  * 
	  * 
	  * int[][] x(){}--->int [][]2d array return
	  * 
	  * x(int i)----> x(5)
	  * 
	  * x(float i)--->x(4.4f)
	  * 
	  * x(int i[])--->a[]--->  x(a)
	  * 
	  * String x()--->return String object
	  * 
	  * x(String i)  --->x("a")
	  * 
	  * 
	  * this reference
	  * 
	  */

	public static void main(String[] args) {
		{
			ThisReference obj = new ThisReference();
			 }

	}

}
