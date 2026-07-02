//Write a program to print characters at odd position and even position for the given String ?
public class CharactersAtOddAndEvenPosition {

	public static void main(String[] args) {
		String s1 = "My name is Srashti Patel";
		String[] arr = s1.split(" ");
		int i = 0;
		//System.out.println(arr.length);
		System.out.println("Characters at even position:");
		while(i<arr.length) {
			System.out.println(i + "=" + arr[i]);
			i=i+2;
		}
		System.out.println("Characters at Odd position:");
		i=1;
		while(i<arr.length) {
			System.out.println(i+"="+arr[i]);
			i=i+2;
		}
	}

}
