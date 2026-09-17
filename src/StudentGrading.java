
public class StudentGrading {

	public static void main(String[] args) {
		int marks = 45;
		if(marks<0 || marks>100) {
			System.out.println("Invalid input");
		}
		if(marks>=0 && marks<=40) {
			System.out.println("U");
		}else if(marks>=41 && marks<=50) {
			System.out.println("D");
		}else if(marks>=51 && marks<=60) {
			System.out.println("C");
		}else if(marks>=61 && marks<=70) {
			System.out.println("B");
		}else if(marks>=71 && marks<=80) {
			System.out.println("B+");
		}else if(marks>=81 && marks<=90) {
			System.out.println("A");
		}else{
			System.out.println("S");
		}

	}

}
