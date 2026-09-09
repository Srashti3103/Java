
public class ProgramToReverseOrderOfWords {

	public static void main(String[] args) {
		String s1 = "Learning java is very easy";
		  String[] words = s1.split(" ");
		  String s2="";
		  for (int i=words.length-1;i>=0;i--)
		  {
		   System.out.println(words[i]);
		   s2 = s2.concat(words[i]+" ");
		  }

		  System.out.println("*******");
		  System.out.println(s2.trim());
	}

}
