
public class MergingTwoString {

	public static void main(String[] args) {
		String s1 = "ravi";
		String[] arr1 = s1.split("");
		String s2 = "reja";
		String[] arr2 = s2.split("");
		String output = "";
		
		//System.out.print(arr1.length);
		int i=0,j=0;
		while(i<s1.length() || j<s2.length()) {
			if(i<s1.length()) {
				output = output + arr1[i];
				i=i+1;
			}
			if(j<s2.length()) {
				output = output + arr2[j];
				j=j+1;
			}
		}
		System.out.println(output);
		
	}

}
 