//Private Access Modifier 
//A private method or variable can be accessed only within the same class 

class Animal6{
	//Private variable 
	private String name ;
	
	//Public method to access private variable 
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name+"is eating.");
	}
}
public class PrivateAccessModifier {
	public static void main(String[] args) {
		Animal6 myAnimal6 = new Animal6();
		myAnimal6.setName("Dog");//Accessing private variable indirectly
		myAnimal6.eat();//Output: Dog is eating.
	}
}
