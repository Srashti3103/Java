public class Identifier {
// A name in java program is called  identifier .
//It may be  class name , method name , variable name  and 
//label name .
	
/* Rule to define java identifiers
 * 1. the only allowed characters in java identifiers are a to z , A to Z, 
 * ,0 to  9, _(underscore), $
 * 2. if we are using any other character we will get compile time error 
 * 3. identifiers are not allowed to start with digit 
 * 4. java identifier are case sensitive up course java language itself
 * treated as case sensitive language 
 * 5. there is no length limit for java identifiers but it is not
 *  recommended to take more than 15 length
 *  6. We can't use reserved words as identifiers 
 *  7. All predefined java class names and interface names we use a identifiers
 */
	public static void main(String[] args) {
		int total =10;
		int Total=100;
		int TOTAL=1000;
		System.out.println(total);//10
		System.out.println(Total);//100
		System.out.println(TOTAL);//1000
		//String a1="abc";
//		int String = 10;
//		int Int =10;
//		boolean c=true;
	}

}
