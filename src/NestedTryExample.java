
public class NestedTryExample {
	public static void main(String[] args) {
		try {
			try {
				int a = 5 / 0;
				
			}catch (ArithmeticException e) {
				System.out.println("Inner Catch :"+e);
			}
		}catch(Exception e) {
			System.out.println("Outer Catch:"+e);
		}
	}
}
