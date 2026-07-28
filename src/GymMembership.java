
public class GymMembership {

	public static void main(String[] args) {
		int months=4;
		 if (months < 0) {
	            System.out.println("Invalid input");
	        } else if (months == 0) {
	            System.out.println(0);
	        } else if (months == 1) {
	            System.out.println(2000);
	        } else if (months == 2 || months == 3) {
	            System.out.println(5000);
	        } else if (months >= 4 && months <= 6) {
	            System.out.println(9000);
	        } else if (months == 9) {
	            System.out.println(12000);
	        } else if (months == 12) {
	            System.out.println(15000);
	        } else {
	            System.out.println("Error");
	        }
	}

}
