//1. Default Delimiter (Whitespace)
import java.util.StringTokenizer;
public class DefaultDelimiter {

	public static void main(String[] args) {
		StringTokenizer tokenizer = new StringTokenizer("Hello WOrld Java");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}

	}

}
