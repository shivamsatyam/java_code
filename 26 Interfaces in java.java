

class Main{
	public static void main(String[] args) {
		Avon a = new Avon(45435);
		a.getSpeed();

		a.applyBrake(4000);
		a.getSpeed();
		a.test();

		// a.v = 5; // invalid
	}
}




// in java interfaces  is a group of related methods with empty bodies



interface Bicycle{
	final int v = 45;
	void applyBrake(int decrement);
	void speedUp(int increment);
}

interface Test{
	void test();
}

class Extendor{
	public Extendor(){}
}

class Avon implements Bicycle,Test{
	int speed;
	public Avon(int a){
		this.speed = speed;
	}

	public void applyBrake(int a){
		speed = speed - a;
	}
	
	public void speedUp(int a){
		speed = speed + a;
	}

	public void getSpeed(){
		System.out.printf("the speed is %d\n",speed);
	}

	public void test(){
		System.out.println("This is an test method");
	}

}




































