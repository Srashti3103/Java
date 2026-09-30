//
////Alternative Approaches 
////Using split() Method (Recommended) 
//public class UsingSplit {
//
//	public static void main(String[] args) {
//		String str = "Hello,World,Java"; 
//		String[] tokens = str.split(","); 
//		for (String token : tokens) { 
//		System.out.println(token);
//		}
//
//	}
//
//}





//Using Scanner Class
import java.util.Scanner;

public class UsingSplit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("Java Python C++");
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		scanner.close();
	}
}


//The StringTokenizer class is useful for breaking strings into smaller tokens but is 
//considered a legacy class. For modern Java applications, it is recommended to use 
//String.split() or Scanner for better performance and flexibility.