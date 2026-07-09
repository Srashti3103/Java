
public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i>=20 && i<=30) {
				continue;//skip number from 20 to 30
			}
			System.out.println(i+"\t");
		}

	}

}
