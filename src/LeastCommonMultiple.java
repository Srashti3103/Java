
public class LeastCommonMultiple {

	public static void main(String[] args) {
		int n1=15;
		int n2=20;
		int max= n1>n2?n1:n2;
		System.out.println("Enter two positive number:"+n1+","+n2);
		while(true) {
			if(max%n1==0 && max%n2==0) {
				System.out.println("The LCM of = "+n1+" and "+n2+" is "+max+".");
				break;
			}
			max++; 
		}

	}

}
