
public class CheckIfArrayIsRotationOfAnother {
	static boolean isRotation(int[] a, int[] b) {
		
	if(a.length != b.length)
	return false;
	
	int n = a.length;
	int start = -1;
	for(int i = 0;i<n;i++) {
		if(a[i]==b[0]) {
			start = i;
			break;
		}
	}
	if(start == -1)
		return false;
	
	for(int i=0;i<n;i++) {
		if(a[(start+i)%n]!=b[i]) {
			return false;
		}
	}
	return true;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {3,4,5,1,2};
		if(isRotation(a,b))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
