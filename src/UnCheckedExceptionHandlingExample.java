import java.io.IOException;
public class UnCheckedExceptionHandlingExample {
	public static void main(String[] args) {
		ProcessBuilder obj = new ProcessBuilder("mspaint111111");
		try {
			obj.start();
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
