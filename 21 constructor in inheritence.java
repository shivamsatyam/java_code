

class Main{
	public static void main(String[] args) {
		Derived d = new Derived();

	}
}







class Base{
	public Base(){
		System.out.println("I am a default constructor");
	}

	public Base(int a){
		System.out.println("I am a overloaded constructor constructor " + a);

	}
}


class Derived extends Base{
	public Derived(){
		super(5);
		System.out.println("I am a derived class constructor");

	}
}




































