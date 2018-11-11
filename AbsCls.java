package JavaAssg;

abstract class demo{
	
	abstract void m1();
	public void m2() {
		System.out.println("non abstract method");
	}
	
}
class demo1 extends demo{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("abstract method implementation in child class");
		
	}
	
}

public class AbsCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo1 d=new demo1();
		d.m1();

	}

}
