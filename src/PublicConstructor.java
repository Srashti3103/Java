/*
 * public Constructor:
 *  A public constructor can be accessed from anywhere.
 *   Objects can be created from any class or package.
 */
//public class AnimalPC{
 class AnimalPC{
	public AnimalPC() {
		System.out.println("Any Constructor called .");
	}
}
public class PublicConstructor {
	public static void main(String[] args) {
		AnimalPC myAnimal =  new AnimalPC();//Accessing from anywhere
	}
}
