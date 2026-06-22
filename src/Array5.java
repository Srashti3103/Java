import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int arr1[]= new int[n];
		for(int i=0;i<arr.length;i++) {
			int sum =0;
			for(int j=i+1;j<arr.length;j++) {
				sum=sum+arr[j];
			}
			arr1[i]= sum;
			
		}
		for(int val:arr1) {
			System.out.println(val+" ");
		}

	}

}
