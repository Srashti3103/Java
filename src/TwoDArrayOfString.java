//2D array of string 
public class TwoDArrayOfString {

	public static void main(String[] args) {
		//Declare and intialize a 2D array of strings
		String[][] names = {
				{"Sameer","Bob","Riya"},
				{"Amit","Eve","Shaily"},
				{"Richa","Henry","Nidhi"}
		};
		//Access elements
		System.out.println("Element at [0][1]:"+names[0][1]);//Output : Bob
		
		//Iterate through the 2D array using nested loops
		System.out.println("2D Array elements:");
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.println(names[i][j]+" ");
			}
			System.out.println();//Move to the next line after each row
		}
	}

}
