
public class UsingStringInSwitch {

	public static void main(String[] args) {
		String command = "start";
		switch (command) {
		case "start":
			System.out.println("System starting...");
			break;
		case "stop":
			System.out.println("System stopping...");
			break;
		default:
			System.out.println("Unknown command");
		}

	}

}
