
public class VolatileVariable {
	private volatile boolean flag = false;//Volatile variable
	public void toggleFlag() {
		flag = !flag;
	}
	public boolean isFlag() {
		return flag;
	}
	public static void main(String[] args) {
		
	}

}
