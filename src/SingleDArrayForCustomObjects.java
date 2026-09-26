//ARRAY OF  CUSTOM OBJECTS 
//Define a custom class
class Student{
	String name ;
	int age ;
	
	//Constructor
	Student(String name, int age){
		this.name = name ;
		this.age = age;
		
	}
	
	//Method tp display Student details
	void display () {
		System.out.println("Name:"+name+",Age:"+age);
	}
}
public class SingleDArrayForCustomObjects {

	public static void main(String[] args) {
		//Declare and intialize an array of student objects
		Student [] students  = new Student[3];
		students[0]=new Student("Alice",20);
		students[1]=new Student("Bob",22);
		students[2]=new Student("Charlie",21);
		
		
		//Access elements using index
		System.out.println("First student :");
		students[0].display();//output : Name : Alice , age : 20
		
		
		// Update an element 
		students[1]=new Student("Robert",23);
		System.out.println("Updated second student:");
		students[1].display();//ouput: Name : Robert , Age : 23
		
		//Length of the  array 
		System.out.println("Array length:"+students.length);//ou[ut:3
		
		
		//Iterate through the array using a for loop 
		System.out.println("Array elements:");
		for(int i=0;i<students.length;i++) {
			students[i].display();
		}
		
		//Iterate usimg enhanced for loop (for each)
		System.out.println("Array elements using for-each:");
		for(Student student:students) {
			student.display();
		}
	}

}
