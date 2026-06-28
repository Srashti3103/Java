
public class Arthoperator {

	public static void main(String[] args) {
		/*   a % b = a-(a/b)*b*/
		//   *, / , %  ----> same [left-->right]
		//   + , - ----> same [left-->right]
		System.out.println(5/2);//2
		System.out.println(5%2);//1
		System.out.println(0/3);//0
		System.out.println(0%3);//0
		System.out.println(3/5);//0
		System.out.println(3%5);//3
		//System.out.println(3**5); ---->>> Wrong statement ** is not allowed 
		// Error ------>>>>> ** , ^
		//Error  --->>> remainder of two float number  and saved in int variable 
		float a =5,b=2;
		//int c=a%b;// error  remainder of two float variable  is not be found in init variable 
		System.out.println(a%b);// remainder --->> float --->>>
	}

}
