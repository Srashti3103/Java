
public class StringInsideALoop {

	@SuppressWarnings("fallthrough")
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			switch (i) {
			case 1:
				System.out.println("i = 1");
			case 2:
				System.out.println("i = 2");
				break;
			case 3:
				System.out.println("i = 3");
			}
		}

	}

}
