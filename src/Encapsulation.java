class Emp{
	private String name ;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String n) {
		if(n.length()>3) {
			this.name ="Invalid name";
			
		}else {
		this.name=n;
		}
	}
	public void setEmail(String e) {
		if(e.indexOf("@")==-1) {
			this.email = " Invalid email";
		}else {
		this.email=e;
		}
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setName("Srashti");
		e1.setEmail("jnjdbjanj");
		System.out.println("Name :"+e1.getName()+"  Email :"+e1.getEmail());
		
		
		
		Emp e2 = new Emp();
		e2.setName("Srashti");
		e2.setEmail("jn@jdbjanj");
		System.out.println("Name :"+e2.getName()+"  Email :"+e2.getEmail());
		
		
		
		Emp e3 = new Emp();
		e3.setName("Raj");
		e3.setEmail("jnjdbjanj");
		System.out.println("Name :"+e3.getName()+"  Email :"+e3.getEmail());
	}
	

}
