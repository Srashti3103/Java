/*
 * What is "Has-a" Relationship?
 * The "has-a" relationship  represents  composition or aggregation in java .
 * This relationship is used to model  part-whole or ownership relationship between object 
 */

/*
 * Key Points About "Has-A" Relationship: 
1. Composition: 
o A strong "has-a" relationship where the contained object cannot exist 
independently of the container. 
o Example: A Car has an Engine. If the Car is destroyed, the Engine is also 
destroyed. 
2. Aggregation: 
o A weak "has-a" relationship where the contained object can exist 
independently of the container. 
o Example: A University has Students. If the University is destroyed, 
the Students still exist. 
3. Code Reusability: 
o The "has-a" relationship promotes code reusability by allowing you to use 
existing classes as components of new classes. 
4. Flexibility: 
o It provides more flexibility than inheritance because you can change the 
components of a class without affecting its structure.
 */

//Composition {Has a Relationship}

//A car has an engine . the engine cannot exist without  the car 


//Engine class 
class Engine{
	void start() {
		System.out.println("Engine Started");
	}
}

//Car class (has - a relationship with engine )
class Car{
	private Engine engine;//Car has an Engine 
	Car(){
		engine = new Engine();//Composition : Engine is created with Car
	}
	
	void startCar() {
		engine.start();//Use the Engine object
		System.out.println("Car is moving.");
	}
}
public class CompositionHasARelationship {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.startCar();//Output: Engine started  car is moving 

	}

}
