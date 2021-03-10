class Main{

	public static void main(String[] args) {
		Rectangle r  = new Rectangle(45,345);
		r.area();

		// Shape s = new Shape(); // this is invalid

		// Figure f = new Figure(); // this is invalid
	}
}

//concrete



abstract class Shape{
	int length;
	int breadth;

	public Shape(){}

	public Shape(int a,int b){
		this.length = a;
		this.breadth = b;
	}

	abstract void area();
}






class Rectangle extends Shape{
	public Rectangle(){};

	public Rectangle(int a,int b){
		super(a,b);
	}

	@Override

	public void area(){
		System.out.printf("the area of figure is %d\n",length*breadth);
	}
}



abstract class Figure extends Shape{
	public void name(){
		System.out.println("the abstract is created from abstracted class");
	}
}