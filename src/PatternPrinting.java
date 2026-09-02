
public class PatternPrinting {

	public static void main(String[] args) {
//
//		int n=3,k=1,m=65;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println(" ");
//		}
//		

//-------------------------------------------------------------------		

//		int n = 3, k = 1, m = 65;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print(i + " ");
//
//			}
//
//			System.out.println(" ");
//		}
//		

//		int n = 3, k = 1, m = 65;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print(n + " ");
//
//			}
//
//			System.out.println(" ");
//		}
//		
//		 
//------------------------------------------------------------------		

//		int n = 3, k = 1, m = 65;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//
////				System.out.print(k+" ");
////				k++;
//
//			}
//
//			System.out.println(" ");
//		}

//---------------------------------------------------------------------		

//		int n = 3, k = 1, m = 65;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print(m + " ");
//				m++;
//
//			}
//
//			System.out.println(" ");
//		}

//-------------------------------------------------------------------		

//		int n = 3, k = 1, m = 65;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print((char) m + " ");
//				m++;
//
//			}
//
//			System.out.println(" ");
//		}

//-----------------------------------------------------------------------	

//		int n = 3, k = 1, m = 65;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print((char) m + " ");
//
//			}
//			m++;
//			System.out.println(" ");
//		}

//--------------------------------------------------------------------------
		
//		int n = 3, k = 1, m = 65;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print((i + j + 1) % 2 + " ");
//
//			}
//
//			System.out.println(" ");
//		}
		 
//------------------------------------------------------------------------------------
		
//		
//		int n=3;
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((i+j+1)%2+" ");
//			}
//			System.out.println();//blank line
//		}
//	
		
//------------------------------------------------------------------------------------
		
//		
//		int n=3;
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();//blank line
//		}
//		
		
//---------------------------------------------------------------------------------------------
//		int n=3;
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*	"+" ");
//			}
//			System.out.println();//blank line
//		}
//-----------------------------------------------------------------------------------	
		
		
		
//		int n=3,k=1,m=65;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println(" ");
//		}
		
		
//-----------------------------------------------------------------------------------
//		
//		int n = 3; // number of rows
//		for (int i = 1; i <= n; i++) {
//			// Print spaces first (now using variable 'k')
//			for (int k = 1; k <= n - i; k++) {
//				System.out.print(" ");
//			}
//			// Then print stars (now using variable 'j')
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println(); // Move to the next line
		
//------------------------------------------------------------------------------------------
		
//		int n = 3; // number of rows
//		for (int i = 0; i < n; i++) {
//			// Print leading spaces (now using variable 'k')
//			for (int k = 0; k < i; k++) {
//				System.out.print(" "); // 2 spaces for better alignment
//			}
//			// Print stars (now using variable 'j')
//			for (int j = 0; j < n - i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println(); // Move to next line
//		}
//----------------------------------------------------------------------------------------
//		int n = 3; // number of rows
//		for (int i = 1; i <= n; i++) {
//			// Print leading spaces (now using variable 'k')
//			for (int k = 1; k <= n - i; k++) {
//				System.out.print(" ");
//			}
//			// Print stars (now using variable 'j')
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println(); // Move to the next line
//		}
		
//------------------------------------------------------------------------------------------------
		
//		int n = 3; // number of rows
//		for (int i = 0; i < n; i++) {
//			// Print leading spaces (now using variable 'k')
//			for (int k = 0; k < i; k++) {
//				System.out.print(" ");
//			}
//			// Print stars (now using variable 'j')
//			for (int j = 0; j < n - i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println(); // Move to the next line
//		}
		
		
//------------------------------------------------------------------------------------------------------------
//		int n = 3; // number of rows
//		for (int i = 1; i <= n; i++) {
//			// Print leading spaces (now using variable 'k')
//			for (int k = 1; k <= n - i; k++) {
//				System.out.print(" ");
//			}
//			// Print stars (now using variable 'j')
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println(); // Move to the next line
//		}

//-------------------------------------------------------------------------------------------------------------------------
//
//		int n = 4; // number of rows
//		for (int i = 0; i < n; i++) {
//			// Print leading spaces (now using variable 'k')
//			for (int k = 0; k < i; k++) {
//				System.out.print(" ");
//			}
//			// Print stars (2*(n-i)-1 stars for each row)
//			for (int j = 0; j < (2 * (n - i) - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println(); // Move to the next line
//		}
		
//------------------------------------------------------------------------------------------------------------
		
//		int n = 4; // number of rows for the top half
//		// Top half of the diamond (pyramid)
//		for (int i = 1; i <= n; i++) {
//			// Print leading spaces
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//			// Print stars
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println(); // Move to the next line
//		}
//		// Bottom half of the diamond (inverted pyramid)
//		for (int i = n - 1; i >= 1; i--) {
//			// Print leading spaces
//			for (int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//			// Print stars
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println(); // Move to the next line
//		}
		
		
//----------------------------------------------------------------------------------------------------------
//
//		int n = 4; // number of rows for the upper part (this can control the pattern size)
//		// Upper part (inverted pyramid)
//		for (int i = 0; i < n; i++) {
//			// Print leading spaces
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			// Print stars
//			for (int j = 0; j < (2 * (n - i) - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println(); // Move to the next line
//		}
//		// Lower part (pyramid)
//		for (int i = 1; i < n; i++) {
//			// Print leading spaces
//			for (int j = 0; j < n - i - 1; j++) {
//				System.out.print(" ");
//			}
//			// Print stars
//			for (int j = 0; j < (2 * i + 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println(); // Move to the next line
//		}

	}

}
