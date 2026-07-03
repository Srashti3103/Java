
public class ArrayLength {

	public static void main(String[] args) {
		String [][]a = new String[6][3];
		a[0][0]="abc";a[0][1]="abc";a[0][2]="abcd";
		System.out.println(a.length);//6
		System.out.println(a[0].length);
		System.out.println(a[0][0].length());

	}

}
