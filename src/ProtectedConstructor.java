
/*
 * A protected constructor can be accessed: 
 Within the same class. 
 Within the same package. 
 By subclasses (even in different packages). 
o It is used to allow subclassing while restricting direct object creation. 
 */
import account.Animal;
//public class DogProCon extends Animal {
class DogProCon extends Animal { 
public DogProCon() { 
super(); // Accessing protected constructor 
System.out.println("Dog constructor called."); 
} 
}
public class ProtectedConstructor  {
	public static void main(String[] args) {
		// Animal myAnimal = new Animal(); // Error: Constructor is protected 
		DogProCon myDog = new DogProCon(); // Accessible via subclass 
	}
}
