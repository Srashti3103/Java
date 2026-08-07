/*Multilevel inheritance 
 * A subclass inherits from a superclass , which in turn inherits from another superclass
 * 
 * Animal class and Dog class which is extends by Animal class is in Single inheritance program 
 * 
 * 
 */

//Subclass  of Dog 
class Puppy extends Dog{
	void weep() {
		System.out.println("Puppy is weeping .");
	}
}
public class MultilevelInheritance1 {

	public static void main(String[] args) {
		
		Puppy myPuppy = new Puppy();
		myPuppy.eat();//Inherited from Animal 
		myPuppy.bark();//Inherited from Dog
		myPuppy.weep();//Inherited from Puppy
	}

}
