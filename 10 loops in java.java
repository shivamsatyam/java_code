import java.util.Scanner;


class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the value ");
		int num = s.nextInt();

		int a = 1;
		// while (a<num){
		//  	System.out.printf("%d ",a);
		//  	a++;
		//  }

		// do{
		// 	System.out.printf("%d ",a);
		// 	a++;
		// } while(a<num);


		for (int i=1;i<num;i++) {
			System.out.printf("%d ",i);
		}


	}
}