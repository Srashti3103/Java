class Parent {
	public void property() {
		System.out.println("cash-land+gold");
	}
	public void marry() {
		System.out.println("surabhi");
	}
}
class Child extends Parent{
	public void marry() {
		System.out.println("Trisha/nayanatara/anushka");
	}
}
public class UpCastingOrOverloading {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.marry();//Surabhi(parent method)
		Child c = new Child();
		c.marry();//Trisha/nayanatara/anushka(child method)
		Parent p1 = new Child();
		p1.marry();//Trisha/nayanatara/anushka(child method)
		
		
	}

}
