interface MyInterface1{
 void x();
}

interface MyInterface2{
 void y();
}


interface MyInterface3{
 void z();
}

class Test2Impl implements MyInterface1,MyInterface2,MyInterface3
{
 public void x() {}
 public void y() {}
 public void z() {}
 
}
interface MyInterface4 extends MyInterface1,MyInterface2,MyInterface3{
 
}
class Test3 implements MyInterface4{
 public void x() {}
 public void y() {}
 public void z() {}
}

abstract class Test4 implements MyInterface4{
 
}

class Test5 extends Test4{
	public void x() {}
	 public void y() {}
	 public void z() {}
}

class Test6 {
 
 
 
 
 public void abc() {
  
 MyInterface1 objInterface1=new MyInterface1() {
  
  @Override
  public void x() {
   // TODO Auto-generated method stub
   
  }
 }; 
  
 }
 
}


public class Test1 {
 

 public static void main(String[] args) {
  // TODO Auto-generated method stub

 }

}