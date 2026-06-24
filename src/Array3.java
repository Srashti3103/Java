
public class Array3 {

	public static void main(String[] args) {
		Employee e[] = new Employee[5];//Array
		e[0] = new Employee("a", "aa@aa.com");
		e[1] = new Employee("b", "bb@bb.com");
		e[2] = new Employee("c", "cc@cc.com");
		e[3] = new Employee("d", "dd@dd.com");
		e[4] = new Employee("e", "ee@ee.com");
		e[0].getDisplay();//0 index data
		e[1].getDisplay();//1 index data
		for(int i=0;i<e.length;i++) {
			e[i].getDisplay();
		}
		
	}

}
