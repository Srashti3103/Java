//Restricts object creation to within the class 
class Logger{
	private static Logger instance;
	private Logger() {
		System.out.println("Logger constructor called.");
	}
	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}
}
public class PrivateInConstructor {
	public static void main(String[] args) {
		//Logger logger = new Logger();//Error : Constructor  is private
		Logger logger = Logger.getInstance();//Access vis public  method
	}
}
