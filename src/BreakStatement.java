import java.util.Scanner;
public class BreakStatement {

	public static void main(String[] args) {
				int n, t = 1;
				Scanner sc = new Scanner(System.in);
				System.out.print("ENTER NO: ");
				n=sc.nextInt(); 
				for (int i = 2; i <= n - 1; i++) {
					t = n % i;
					if (t == 0) {
						break;
					} // imp for --> end
				}
				if (n == 1) {
					System.out.println("1 is neither prime nor composite.");
				} else if (t != 0) {
					System.out.println(n + " is a prime number.");
				} else {
					System.out.println(n + " is not a prime number.");
				}
			}
		}

