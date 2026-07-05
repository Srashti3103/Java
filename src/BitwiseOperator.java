
public class BitwiseOperator {

	public static void main(String[] args) {
		int d=5;//binary :0101
		int e =3;//Binary :0011
		System.out.println(d & e);//Bitwise AND : 1 (0001)
		/*
		 * Bitwise 
		 * & ---    
		 * 1 1 = 1
		 * 1 0 = 0
		 * 0 1 = 0 
		 * 0 0 = 0
		 * 
		 * 
		 *  4  --->  100
		 *  5  --->  101
		 *  ------------  &
		 *           100 ---> 4
		 *            
		 */
		System.out.println(d | e);//Bitwise OR : 7 (0111)
		/* 
		 * Bitwise 
		 * | ----
		 * 1 1 = 1
		 * 1 0 = 1 
		 * 0 1 = 1 
		 * 0 0 = 0
		 * 
		 * 
		 *  4 ---> 100
		 *  5 ---> 101
		 *  ----------|
		 *         101 --> 5
		 */
		System.out.println(d ^ e);//Bitwise XOR : 6 (0110)
		/*
		 * * ---
		 * 1 1 = 0
		 * 1 0 = 1  
		 * 0 1 = 1  
		 * 0 0 = 0
		 * 
		 * 
		 *  4 ---> 100
		 *  5 ---> 101
		 *  ----------|
		 *         002 --> 1
		 */
		System.out.println(~d);//Bitwise NOT : -6 (In two's complement)
		/*
		 * Bits compliment 
		 *  ~ ---
		 *  -(a+1)
		 */
		//System.out.println(d << 1);//Left Shift : 10 (1010)
		/*
		 * 00000101 ----> 00010100
		 */
		System.out.println(d >> 1);//Right Shift  : 2 (0010)
		/*
		 * 
		 */
		System.out.println(d >>> 1);//Unsigned Right Shift : 2 (0010)
	}

}
