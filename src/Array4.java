import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//int arr[]= {25,77,54,81,48,34};
		int count = 0;
		
		for(int val:arr) {
			int root = ((int)Math.sqrt(val));
			//System.out.println((int)Math.sqrt(val));
			if(root*root==val) {
				count++;
			}
		}
		System.out.println(count);

	}

}
