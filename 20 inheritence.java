
import java.util.Scanner;


class Main{
	public static void main(String[] args) {
		Base a = new Base();
		a.setX(343);
		a.getX();

		Derived b = new Derived();
		b.setY(45);
		b.getY();
	}
}

class Base{
	int x;

	public void setX(int x){
		this.x = x;
	}
	public void getX(){
		System.out.printf("The value of x is %d ",x);
	}
}


class Derived extends Base{
	int y;

	public void setY(int y){
		this.y = y;
	}
	public void getY(){
		System.out.printf("The value of y is %d ",y);
	}	
}

