
public class VowelOrConsonant {

	public static void main(String[] args) {
		char ch='E';
		switch(Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+"is a vowel");
			break;
		default:
			System.out.println(ch+"is a consonant");
		}

	}

}
