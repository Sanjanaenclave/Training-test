package JavaAssg;

interface m {
	void imp() ;
	
}



public class Oop1 implements m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oop1 o=new Oop1();
		o.imp();

	}

	@Override
	public void imp() {
		// TODO Auto-generated method stub
		System.out.println("Interface Succesfully Implemented");
		
	}

}
