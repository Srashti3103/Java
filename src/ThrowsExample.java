import java.io.IOException;
public class ThrowsExample {
static void abc() throws IOException{
	System.out.println("abc");
}
static void x() throws IOException{
	abc();
}
static void y() {
	try { 
		x();
	}
	catch(IOException e) {
		
	}
}
public static void main(String[] args) throws IOException{
	ProcessBuilder obj = new ProcessBuilder ("mspaint11");
	obj.start();
}
}
