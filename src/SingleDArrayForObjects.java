//Declaration and intialization 
/*
 * array of object store reference to  objects (not the objects themselves).
 * Syntax : ClassName[] arrayName = new ClassName[size];
 * or
 * ClassName[] arrayName = {object1,object2,object3,.....};
 */
class SingleDArrayForObjects {

	public static void main(String[] args) {
		//Declare and intialize an array of string objects
		String[] names = new String[3]; //Array of size 3
		names[0]="Alice";
		names[1]="Bob";
		names[2]="Charlie";
		
		
		//Access elements using index
		System.out.println("First name: "+names[0]);//output: Alice
		System.out.println("Second nsme : "+names[1]);//output:Bob
		
		
		//update an element 
		names[1]="Robert";
		System.out.println("Updated second name :"+names[1]);//Output:Robert
		
		
		//Length of the array 
		System.out.println("Array Length:"+names.length);//output :3
		
		//Iterate through the array using a for loop
		System.out.println("Array elements:");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//Iterate using enhanced fir loop (for each)
		System.out.println("Array elements using for each:");
		for (String name : names) {
			System.out.println(name);
		}
	}

}
