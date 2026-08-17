/*
 * Default constructor in super class 
 * if the super class has a default constructor , the subclass can implicitly call it .
 * 
 */

//Superclass 
class Animal2 {
	Animal2() {
		System.out.println("Animal constructor called.");
	}
}

//Subclass 
class Dog2 extends Animal2{
	Dog2(){
		System.out.println("Dog constructor called .");
	}
}

public class DefaultConstructorSuperClass {

	public static void main(String[] args) {
		Dog2 myDog2 = new Dog2();

	}

}
