
public class UnaryOperators {

	public static void main(String[] args) {
		/*
		 * operrator on a single operand 
		 * operator : +,-,++,--,!
		 */
		int f=10;
		System.out.println(+f);//Unary plus:10
		System.out.println(-f);//Unary minus :-10
		f++;//post increment f because 11
		System.out.println(f);//11
		--f;//pre decrement : f becomes 10
		System.out.println(f);//10
		boolean flag = true;
		System.out.println(!flag);//logical NOT : false 
		int a=10;
		a++;
		System.out.println(a);
		a=10;
		++a;
		System.out.println(a);
		a=10;
		System.out.println(a++);
		System.out.println(a);
		a=10;
		System.out.println(++a);
		System.out.println(a);
		a=10;
		System.out.println(a++ + a++);//10+11=21
		System.out.println(a);
		a=10;
		System.out.println(++a + ++a);
		System.out.println(a);
		a=10;
		System.out.println(++a + a++);
		System.out.println(a);
		int i=3,j=4;
		if(i++>j && j++>i) {
			i=10;j=20;
		}
		System.out.println(i);
		System.out.println(j);
		
		
		
		a=10;
		a--;
		System.out.println(a);
		a=10;
		--a;
		System.out.println(a);
		a=10;
		System.out.println(a--);
		System.out.println(a);
		a=10;
		System.out.println(--a);
		System.out.println(a);
		a=10;
		System.out.println(a-- + a--);
		System.out.println(a);
		a=10;
		System.out.println(--a + --a);
		System.out.println(a);
		a=10;
		System.out.println(--a + a--);
		System.out.println(a);
	}

}
