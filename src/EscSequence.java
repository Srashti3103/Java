
public class EscSequence {

	public static void main(String[] args) {
		char x ='a';//ascii 0-255
		char y ='\u00ae';//unicode 0-65535
		System.out.println("x");
		System.out.println(x);
		System.out.println(y);
		System.out.print("a");
		System.out.print("b");
		System.out.print("c\n");
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		
	    System.out.println("hello \n java");
	    System.out.println("hello \t java");
	    System.out.println("hello \"java\"");
	    System.out.println("hello 'java' ");
	    /*
	     * System.out.println("\ 'h\'");
	     */
	    /* 
	     * Esc sequences
	     * 
	     * \\u -->unicode
	     * 
	     * \n -->new line
	     * 
	     * \t--->tab
	     * 
	     * \" ---->"
	     * 
	     * \' ---->'
	     *  
	     */
	}

}
