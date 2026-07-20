
public class FinallyBlockExample3 {
	public static void main(String[] args) {
		try {
			System.out.println("try block executed");
			System.out.println(10/0);
		}catch(NullPointerException e) {
			System.out.println("Catch block executed");
		}finally {
			System.out.println("Finally block executed");
		}
	}
}
