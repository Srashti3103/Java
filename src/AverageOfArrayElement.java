//Calculating the average of array elements
public class AverageOfArrayElement {

	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50};
		int sum =0;
		for(int num: numbers) {
			sum+=num;//Add each element to the sum
		}
		
		double average = (double)sum/numbers.length;//Calculate average
		System.out.println("Average:"+average);//Output: 30.0
		
	}

}
