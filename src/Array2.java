
public class Array2 {

	public static void main(String[] args) {
		String s1 = "MynameisAnthony";// MynameisAnthony
		char vowels[] = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
		char data[] = s1.toCharArray();
		for (char c1 : data) {
			boolean chk = false;
			for (char c2 : vowels) {
				if (c1 == c2) {
					chk = true;
					break;
				}
			}
			if (chk == false) {
				System.out.print(c1);
			}
		}
	}

}
