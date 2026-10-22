
public class SimpleCalculatorSwitchCasae {

	public static void main(String[] args) {
		int num1=20,num2=5;
		char operator = '+';
		switch(operator) {
		case '+':System.out.println(num1+num2);break;
		case '-':System.out.println(num1-num2);break;
		case '*':System.out.println(num1*num2);break;
		case '/':if(num2!=0) 
			System.out.println(num1/num2);
		else
			System.out.println("Cannot divided by zero");
		break;
		default:System.out.println("Invalid operator");
			
		}

	}

}
