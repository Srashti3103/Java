/*
 * If return statement present try , catch and finally blocks then finally block return statement will be considered 
 */
public class ReturnInTryCatch {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	public static int m1() {
		
		try {
			System.out.println(10/0);
			return 777;
		}catch(ArithmeticException e) {
			return 888;
		}finally {
			return 999;
		}
	}
}
