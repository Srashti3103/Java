
public class Palindrome2 {

	public static void main(String[] args) {
		String s = "nitin";// laedi

		char data[] = s.toCharArray();// 5

		char data1[] = new char[data.length];// 5

		for (int i = 0; i < data.length; i++) {
			// System.out.println(data[i]);
			data1[i] = data[data.length - 1 - i];
		}

		// 0 --->l

		String s1 = new String(data1);

		System.out.println(s1);

		if (s.equals(s1)) {
			System.out.println("plaindrome");
		} else {
			System.out.println("not a plaindrome");
		}

	}

}
