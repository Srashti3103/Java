
public class GroupMultipleCasesTogether {

	public static void main(String[] args) {
		int score = 90;
		switch (score) {
		case 100:
		case 90:
		case 80:
			System.out.println("Top Grade");
			break;
		case 70:
		case 60:
			System.out.println("Average Grade");
			break;
		default:
			System.out.println("Below Average");
		}

	}

}
