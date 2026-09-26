
public class TrafficLightSimulator {

	public static void main(String[] args) {
		String color="red";
		if(color.equalsIgnoreCase("red")) {
			System.out.println("STOP");
		}else if(color.equalsIgnoreCase("yellow")) {
			System.out.println("READY");
		}else if(color.equalsIgnoreCase("green")) {
			System.out.println("GO");
		}else {
			System.out.println("Invalid color");
		}
	}

}
