
// Returning Delimiters 
import java.util.StringTokenizer;

public class ReturnDelimiters {

	public static void main(String[] args) {
		StringTokenizer tokenizer = new StringTokenizer("Java:Python:C++", ":", true);
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}

}
