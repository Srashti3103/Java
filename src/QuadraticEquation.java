
public class QuadraticEquation {

	public static void main(String[] args) {
		double a=1;
		double b=-3;
		double c=2;
		//Calculate the discriminant
		double discriminant = b*b-4*a*c;
		//Determine the nature of the roots and solve 
		if(discriminant<0) {
			System.out.println("Roots are imaginary");
		}else if(discriminant>0){
			double root1 = (-b+ Math.sqrt(discriminant))/(2*a);
			double root2 = (-b- Math.sqrt(discriminant))/(2*a);
			System.out.println("x="+root1);
			System.out.println("x="+root2);
		}else {
			double root = -b/(2*a);
			System.out.println("One real and equal root:"+ root);
		}

	}

}
