//datatype[] arrayName;//Prefered way 
//dataType arrayName[];//Valid but less common
//Array is created using the new keyword  ------> arrayName = new dataType[size];
//you can intialize an array at the time of declaration 
//---->>>>>>>>>>>>>>dataType[] arrayName = {value1,value2,value3,....};
public class Array {

	public static void main(String[] args) {
		int a[];
		a = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] =50;
		
		System.out.println("First element : "+a[0]);
		System.out.println("Third element : "+a[2]);
	
		int[] b = { 10, 20, 30, 50, 60 };
		System.out.println(a.length);//size 4
		System.out.println(b.length);//5
		System.out.println(a);//{address or hashcode } 
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("*************");
		b[0]=100;//update ----> index ---> 0---> 100
		for(int val:b) {//0 to < length ---->value
			System.out.println(val);
		}
		System.out.println("*************");
		for(int i=b.length-1;i>=0;i--) {
			System.out.println(b[i]);
		}
		System.out.println("*************");
		a= new int [5];//new  array form at new adddress of name a and old a is deleted from the memory 
		//entirely new array ----> old del  ---> int  default val -> 0
		for(int val:a) {//iterate using enhanced for leeop (for each) 	
			System.out.println(val);
		}
		System.out.println("*************");
		int c[]=b;//new arr ---> c <---b ---> pass by reference 
		for(int val:c) {
			System.out.println(val);
		}
		System.out.println("*************");
		c[0]=1000;
		for(int val:c) {
			System.out.println(val);
		}
		System.out.println(b[0]);
		System.out.println("*************");
		
		String names[]= {"amit","akarsh","arya"};
		String n[]=new String[3];
		n[0]="abc";
		n[1]="xyz";
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		for(String x:n) {
			System.out.println(x);
		}
		System.out.println("*************");
		String s = "What is java";
		String t[] = s.split(" ");
		System.out.println("No. of words: "+t.length);
		System.out.println("First word : "+t[0]);
		System.out.println("Last Word :" +t[t.length - 1]);
		
		char data[]="What".toCharArray();
		for(char c1:data) {
			System.out.println(c1);
		}
}
}
