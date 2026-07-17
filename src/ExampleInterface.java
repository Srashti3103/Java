/*
 * access interface name{
 * return-type  method-name1(argument list );// you may use abstract keyword also 
 * .....................
 * return-type method-nameN(argument list);
 * type final-varname1 = value;
 * type final-varname2 = value;........
 * type final-varnameN = value;}
 * 
 */
//interface 
 interface AnimalIn {
	 void makeSound();//Abstract method (implicitly public and abstract )
}
 //Class implements interface 
 class DogIn implements AnimalIn{
	@Override 
 public void makeSound() {
	 System.out.println("Dog barks.....");
 }
 }
 //Another implementing class 
 class CatIn implements AnimalIn{
	 @Override
	 public void makeSound() {
		 System.out.println("Cat meows....");
	 }
 }
 
 //Main class
 public class  ExampleInterface{
	 public static void main(String[] args) {
		 AnimalIn myDogIn = new DogIn();
		 myDogIn.makeSound();//Output : Dog barks...
		 AnimalIn myCatIn = new CatIn();
		 myCatIn.makeSound();//Output : Cat meows....
		 
	 }
 }
