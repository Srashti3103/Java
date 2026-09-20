
public class StringBuffer {

	public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.hashCode());
		s = "abc";// new reference
		System.out.println(s.hashCode());

		StringBuffer s1 = new StringBuffer("abc");
		System.out.println(s1.hashCode());
		s1.append(" Hello ");
		System.out.println(s1.hashCode());
		System.out.println(s1);

	}

	private void append(String string) {
		// TODO Auto-generated method stub
		
	}

}
