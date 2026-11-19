
public class ThrowExample2 {
	public static void main(String[] args) {
		int  i ;
		//i =1;
		i=100;//Exception
		try {
			if(i>10) {
				throw new ArithmeticException();
			}else {
				System.out.println("Valid value");
			}
		}catch(ArithmeticException e) {
			System.out.println("Exception :"+e);
		}
	}
	class ValueException extends RuntimeException{
		public String toString() {
			return "value cannot to greater than 10";
		}
	}
}
