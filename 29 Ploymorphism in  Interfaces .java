class Main{
	public static void main(String[] args) {
		System.out.println("");
		
		Phone a = new Phone();
		a.takeScreenShot();
		a.other();

		Camera b = new Phone();
		b.greet();
		// b.other(); // This is invalid
	}



}





interface Camera{
	void takeScreenShot();

	default void greet(){
		System.out.println("This is an camera");
	}
}


class Phone implements Camera{
	Phone(){}

	public void takeScreenShot(){
		System.out.println("Taking the screenshot");
	}

	public void other(){
		System.out.println("This is an other menthod");
	}

}













