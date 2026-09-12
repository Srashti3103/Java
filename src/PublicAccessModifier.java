//Public Access Modifier
//A Public class , method, or variable can be accessed from anywhere.


//Public class
class AnimalPAM {
	//Public Variable 
	public String name;
	
	//Public method 
	public void eat () {
		System.out.println(name + "is eating.");
	}
}


public class PublicAccessModifier {

	public static void main(String[] args) {
		  AnimalPAM myAnimal = new AnimalPAM(); 
	        myAnimal.name = "Dog"; // Accessing public variable 
	        myAnimal.eat(); // Accessing public method
	}

}
