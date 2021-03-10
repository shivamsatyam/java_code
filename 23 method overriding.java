

class Main{
	public static void main(String[] args) {
		A v = new A();
		v.method1();

		B a = new B();
		a.method1();	
	}
}






class A{
	int a;

	public A(){

	}

	public void method1(){
		System.out.println("This is the method of class A");
	}
}





class B extends A{

	@Override
	public void method1(){
		System.out.println("This is the method of class B");
	}


}


























