// (int... x) --->>> Variable argument method 
public class VariableArgumentMethod {
	public static void  methodOne(int... x) {
		System.out.println("Var - Arg Method");
	}

	public static void main(String[] args) {
		methodOne();
		methodOne(10);
		methodOne(10,20,30);
	}

}
