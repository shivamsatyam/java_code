



class Main{
	public static void main(String[] args) {
		System.out.println("print");
		Derived d = new Derived(435,435);
		d.getdata();
	}
}







class Base{
	int a;
	int b;
	int c;

	public Base(){
		System.out.println("This is a base class contructor");

	}

	public Base(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println("This is a base  class argument parser contructor");
	}


	public Base(int num){
		this.c = num;
	}
}



class Derived extends Base{
	int c;int d;

	public Derived(){
		System.out.println("This is a derived class default constructor");
	}

	public Derived(int b,int c){
		super(b,c);
		System.out.println("This is a derived class contructor");

	}

	public void getdata(){
		System.out.printf("the value is %d and %d ",a,b);
	}
}













































