class Main{
	public static void main(String[] args) {
		A a = new A();
		a.main1();
		a.main2();
		a.main3();
	}
}



interface First{
	void main1();
	void main2();
	// void main1();
}


interface Second extends First{
	void main3();
}



class A implements First,Second{
	public A(){

	}

	public void main1(){
		System.out.println("This is the main 1 method");
	}
	public void main2(){
		System.out.println("This is the main 2 method");
	}
	public void main3(){
		System.out.println("This is the main 3 method");
	}

}