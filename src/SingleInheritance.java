/*
 * Syntax of inheritance in java
 * 
 * class Superclass{
 *     //Attributes and methods
 *}
 *
 *class Subclass extends Superclass{
 *     //Additional attributes and methods
 *     }
 *     
 */
class SI_C{
	int k;
	void z() {}
}
class SI_B extends SI_C{
	int i;
	int j;
	void y() {}
	//int k;
	
}
public class SingleInheritance extends SI_B {
	int i;
	void x() {}
	void test() {
		this.i=10;//current class 
		super.i=20;//SI_B
		this.x();
		super.j=20;//SI_B
		super.y();//SI_B
		super.k=10;//SI_C
		super.z();//SI_C
		
	}

	public static void main(String[] args) {
		

	}

}
