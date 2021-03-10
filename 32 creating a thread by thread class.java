// Concurrency and paralleism




public class Main{
	public static void main(String[] args) {
		System.out.println("");
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();

		t1.start();
		t2.start();
	}
}






class MyThread1 extends Thread{
	@Override

	public void run(){
		while(true){
			System.out.println("My thread is runnying");	
			// System.out.println("Happy");	

		}
	}



}






class MyThread2 extends Thread{
	@Override

	public void run(){
		while(true){
			// System.out.println("My thread 2 is runnying");	
			System.out.println("2 Happy");	

		}
	}


	
}





























