public class Main{
	public static void main(String[] args) {
		System.out.println("");
		
		MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
		Thread gun1 = new Thread(bullet1);
		
		MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
		Thread gun2 = new Thread(bullet2);

		gun1.start();
		gun2.start();


	}
}
 





class MyThreadRunnable1 implements Runnable{
	@Override
	public void run(){
		while(true){
			System.out.println("I am a thread");
		}
	}
}





class MyThreadRunnable2 implements Runnable{
	@Override
	public void run(){
		while(true){
			System.out.println("Threat");
		}
	}
}

