
public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
		int length = 3;
		int temp = num ;
		double  sum = 0;
		 while(temp!=0) {
			 int digit= temp % 10;;
			 sum = sum + (Math.pow(digit , length));
			 temp = temp / 10;
		 }
		 if(sum == num) {
		 System.out.println(num + " is an Armstring number.");
	}else {
		System.out.println(num + " is not an Armstrong number.");
	}
		 
	}

}
