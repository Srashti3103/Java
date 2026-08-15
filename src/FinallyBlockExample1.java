/*
 * try{
 * risky code}
 * catch(x e){
 * handling code}
 * finaly{
 * cleanuup cpde}
 */
public class FinallyBlockExample1 {
	public static void main(String[] args) {
		try {
			System.out.println("try block executed");
		}catch(ArithmeticException e) {
			System.out.println("Catch block executed");
		}finally {
			System.out.println("Finally block executed");
		}
	}
}
