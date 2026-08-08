
public class Datatype1 {

	public static void main(String[] args) {
		/*
		 * 
		 * 8 primitive data types
		 * char, byte , short , int , long , float , double , boolean 
		 */
//		byte b1 = 12.50;-----XXXXX
//		byte b1 = "abc";-----XXXXXX
//		byte b1 = 140;----XXXXX
//		byte b1= true;----XXXXXXX
		
		
		byte b1 = 12;
		/*
		 * size : 1byte (8bits)
		 * Max value : +127
		 * Min value : -128
		 * Range : -128 to 127 
		 */
		System.out.println(b1);
		
		short s1 = 130;
		int i1 = 1000;
		//20 --> int 
		double d1 = 10.50;
		// 20 , 50 ---> double 
		float f1 = 10.50f;//F
		long l1 = 1000l;//L
		boolean i =true ;
		// char ---> ascii(0 to 255) or unicode (0 to 65535)
		//A --> 65 a--> 97 0-->48
		 char c1 = 'a';
		 System.out.println(c1);//a
		 
		 char c2 = 98 ;// int --> ascii --->char 
		 System.out.println(c2);
		 
		 int k='c'; // char ---> ascii --> int 
		 System.out.println(k);//99
		 char c3= 300;
		 System.out.println(c3);
		 char c4='\u00EE';
		 System.out.println(c4);
		
	}

}
