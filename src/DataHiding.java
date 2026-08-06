class Address {
	String city;
	String state;
	String pincode;

	Address(String c, String s, String p) {
		this.city = c;
		this.state = s;
		this.pincode = p;
	}
}

public class DataHiding {
	
	int id;
	String name;
	Address a1;// has a relationship ---->>> in a class make an object entity relation of
				// another class is called "has-a" relationship

	public DataHiding(int i, String n, Address a) {
		this.id = i;
		this.name = n;
		this.a1 = a;
	}
	
	public void getDetails() {
		System.out.println("Id :"+this.id+"Name :"+this.name+"City :"+this.a1.city+"State :"+this.a1.state+"pin :"+this.a1.pincode );
	}

	public static void main(String[] args) {
		Address x1 = new Address("jbp","mp","482001");
		Address x2 = new Address("bhopa;","mp","452001");
		
		DataHiding  e1 = new DataHiding(1,"ss",x1);
		DataHiding  e2 = new DataHiding (2,"aa", x1);
		DataHiding  e3 = new DataHiding (3,"ssa",x1);
		DataHiding  e4 = new DataHiding (2,"ss",x2);
		e1.getDetails();
		e2.getDetails();
		e3.getDetails();
		

	}

}
