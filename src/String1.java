
public class String1 {

	public static void main(String[] args) {
		String s = "Hello";

		System.out.println(s.toUpperCase());// HELLO
		System.out.println(s);// Hello

		System.out.println(s.toLowerCase());// hello
		System.out.println(s);// Hello

		System.out.println(s.hashCode());// 69609650

		String t1 = "Hello";
		String t2 = "Hello";

		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

		int x = 7;
		int y = 7;
		int z = x;// pass by value

		String k = s;
		System.out.println(k.hashCode());

		k = "HELLO";// old k --->delete, new k born--->address new
		System.out.println(k.hashCode());

		String k1 = "HELLO";
		System.out.println(s.startsWith("H"));// true
		System.out.println(s.startsWith("h"));// false
		System.out.println(s.startsWith("He"));// true

		System.out.println(s.endsWith("H"));// false
		System.out.println(s.endsWith("o"));// true
		System.out.println(s.endsWith("O"));// false
		System.out.println(s.endsWith("lo"));// true

		String s1 = "   Hello    ";
		System.out.println(s == s1);// false
		System.out.println(s.equals(s1));// false
		System.out.println(s1.length());
		System.out.println(s.length());
		System.out.println(s1.trim().length());
		System.out.println(s.indexOf("e"));// Hello
		System.out.println(s.indexOf("z"));// Hello ------> -1 (if NOT FOUND)
		System.out.println(s.indexOf("l"));// Hello
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.charAt(2));// l
		String s2 = "HELLO";
		System.out.println(s.equals(s2));// false
		System.out.println(s.equalsIgnoreCase(s2));// true
		String enr = "0201CS011011";
		System.out.println("College code :" + enr.substring(0, 4));// 0201
		System.out.println("Roll No :" + enr.substring(6));// 0201

		String s3 = "What is java";
		String words[] = s3.split(" ");
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		System.out.println(s.compareTo("Hello"));

		System.out.println("Ab".compareToIgnoreCase("aB"));// 0

		System.out.println("ab" + "cd");// abcd

		System.out.println("ab".concat("cd"));// abcd

		System.out.println(s.replace('e', 'a'));// Hallo
		System.out.println(s);

		s = s.replace('e', 'a');// change Hallo

		String z1 = "   ";
		System.out.println(z1.isBlank());// true
		System.out.println(z1.isEmpty());// false

		System.out.println("ab".repeat(5));	
	}
}
