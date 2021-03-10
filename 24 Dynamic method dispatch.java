
class Main{
	public static void main(String[] args) {
		Phone s = new SmartPhone();

		// SmartPhone a = new Phone(); // this is not valuid because the reference is type of Derived class

		s.greet();
		s.name(); // This is valid because the derived class overrride the base class name() method
		// s.other(); //This is not valid

	}
}


class Phone{
	public void greet(){
		System.out.println("This is a phone greet method");
	}

	public void name(){
		System.out.println("This is phone name method");
	}
 
}


class SmartPhone extends Phone{
	public void other(){
		System.out.println("This is a smartphone other method");
	}

	public void option(){
		System.out.println("This is smartphone optino method");
	}

	@Override
	public void name(){
		System.out.println("This is smartphone name method");
	}
 
}



