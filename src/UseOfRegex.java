import java.util.regex.*;
import java.util.*;

public class UseOfRegex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Enrollment No: ");
		String enroll = sc.nextLine();
		
		Pattern p = Pattern.compile("[0-9]{4}[a-z]{2}[0-9]{6}");
		/*
		 * [0-9]{10} ----->> \\d{3}
		 * 
		 * [a-z]{3]
		 * 
		 * [a-zA-Z]{3}
		 * 
		 * \\w{3}
		 * 
		 * [0-9]{4}[a-z]{2}[0-9]{6}    ----->>>>> Enrollment No.
		 */
		Matcher m = p.matcher(enroll);
		if(m.matches()) {
			System.out.println("Vallid Mobile No");
		}else {
			System.out.println("Invalid Mobile No");
		}
	}
}
