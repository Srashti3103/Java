/*
 * Aggregation 
 * A university has Students. The Student can exist  independently of the university
 * 
 */
import java.util.ArrayList;
import java.util.List;




//Student class 
class Student1{
	private String name;

	Student1(String name) {
		this.name = name;
	}

	void study() {
		System.out.println(name + "is studying.");
	}
}

//University class (has -a relationship with Student1 )
class University {
	private List<Student1> students;// University has students

	University() {
		students = new ArrayList<>();
	}

	void addStudent1(Student1 student) {
		students.add(student);
	}

	void conductClasses() {
		for (Student1 student : students) {
			student.study(); // Use the Student objects
		}
	}
}

public class AggregationHasARelationship {

	public static void main(String[] args) {
		Student1 student1 = new Student1("John");
		Student1 student2 = new Student1("Alice");

		University myUniversity = new University();
		myUniversity.addStudent1(student1);
		myUniversity.addStudent1(student2);

		myUniversity.conductClasses(); // Output: John is studying. Alice is studying.

	}

}
