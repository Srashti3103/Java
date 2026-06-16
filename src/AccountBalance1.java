import account.Balance;
public class AccountBalance1 {
	public static void main(String[] args) {
		Balance current[] = new Balance[3];
		current[0] = new Balance("tom",12.12);
		current[1] = new Balance("mary",22.12);
		current[2] = new Balance("Jack",32.12);
		for(int i=0;i<3;i++) {
			current[i].show();
		}
	}
}
