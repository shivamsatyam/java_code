import java.util.Scanner;


class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number where you want to break");
		int a = s.nextInt();
		System.out.println("Enter the number where you want to continue");
		int b  = s.nextInt();
		

		for (int i=0;i<100;i++) {
			if(i==a){
				System.out.println("The break statement run");
				break;
			}else if (i==b){
				System.out.println("The continue statement run");
				continue;
			}else{
				System.out.println(i);
			}
		}

	}
}