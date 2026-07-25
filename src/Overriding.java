class Bike {
	int speed = 60;

	int s() {
		return speed;
	}

	public void speedLimit() {
		System.out.println("Running with 60 km.");
	}
}

class Honda extends Bike {
	int speed = 90;

	int s() {
		return speed;
	}

	public void speedLimit() {
		System.out.println("Running with 90 km.");
	}
}

class Yamaha extends Bike {
	int speed = 120;

	int s() {
		return speed;
	}

	public void speedLimit() {
		System.out.println("Running with 120 km.");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Bike b1 = new Honda();
		b1.speedLimit();
		System.out.println(b1.speed);// 60
		System.out.println(b1.s());// 90

		Bike b2 = new Yamaha();
		b2.speedLimit();
		System.out.println(b2.speed);// 60
		System.out.println(b2.s());// 120

	}

}
