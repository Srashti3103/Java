//This example finds the second largest element in an array
public class SecondLargestElement {

	public static void main(String[] args) {
		int[] numbers = {10,20,5,15,30,25};
		int first = Integer.MIN_VALUE;
		int second =Integer.MIN_VALUE;
		for(int num: numbers) {
			if(num>first) {
				second = first;//update second largest 
				first = num;//update largest
			}else if(num>second && num!=first) {
				second=num;//Update second largest
			}
		}
		
		System.out.println("Second largest element : "+second);//output : 25
		
	}

}
