/*
 * Super keywords in inheritance 
 * The super keyword is used  to refer to the superclass (parent class ) from the subclass (child class )
 * It can be used to :
 * 1. call the superclass constructor
 * 2. Access superclass methods or attributes 
 *  
 */

class Animal1{
	String name;
	Animal1(String name ){
		this.name = name ;
		
	}
	void display () {
		System.out.println("Name :"+ name);
	}
}

class Dog1 extends Animal1 {
	String breed;
	Dog1(String name , String breed){
		super(name);//Call the superclass constructor 
		this.breed = breed;
	}
	void display() {
		super.display();//Call the super class method 
		System.out.println("Breed:"+breed);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Dog1 myDog1 = new Dog1("Buddy","Golden Retriever");
		myDog1.display();
	}

}
