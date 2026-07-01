/*
 *  Custom Delimiter (Comma) 
 */
import java.util.StringTokenizer;
public class CustomDelimiter {

	public static void main(String[] args) {
		StringTokenizer tokenizer = new StringTokenizer("Apple,Banana,Cherry", ","); 
		while (tokenizer.hasMoreTokens()) { 
		System.out.println(tokenizer.nextToken());

	}
	}
}

