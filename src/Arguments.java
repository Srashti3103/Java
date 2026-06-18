
public class Arguments {

	public static void main(String[] args) {
		/*
		 * core java ---> 3 methods ---> user input
		 * c,c++ --> input --> &a ---> address of a 
		 * 
		 * main(string[] args)
		 * 
		 * String --->class ----> "any data "---> store
		 * 
		 * []----> array ---> n input
		 * [] ----> index ---> 0
		 */
		System.out.println("100");//100
		System.out.println("abc");//abc
		System.out.println("100"+"200");//concat---->100200
		System.out.println(100+200);//300//addition
		System.out.println("100"+200);//100200
		System.out.println("100"+200+50);//10020050
		System.out.println("100"+(200+50));//100250
		System.out.println(100+200+"50");//30050
		System.out.println(args[0]);//10
		System.out.println(args[1]);//20
		System.out.println(args[0]+args[1]);//1020
}

}
