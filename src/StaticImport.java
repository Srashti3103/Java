import java.util.regex.*;
import java.util.*;
public class StaticImport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Name");
		String s = sc.nextLine();
		
		System.out.println(age);
		System.out.println(s);

	}

}
