
public class OmitBreakCondition {

	@SuppressWarnings("fallthrough")
	public static void main(String[] args) {
		int x=1;
		switch(x) {
		case 1:
			System.out.println("Case 1");
		case 2:
			System.out.println("Case 2");
		default:
			System.out.println("Default");
		}
	}

}
