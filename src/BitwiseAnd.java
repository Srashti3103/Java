
public class BitwiseAnd {

	public static void main(String[] args) {
		int a=3;
		a++;//a=a=1
		/*
		 * increment operator  
		 */
		System.out.println(a);
		int i=3; int j=4;
		//if(i++>j & j++>i)//Bitwises & check both condition 
		if(i++>j && j++>i)//logical && doesnat check second condition if first condition is false 
		{
			i=10;
			j=20;
		}
		System.out.println(i);
		System.out.println(j);

	}

}
