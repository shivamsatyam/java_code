import java.util.Scanner;



class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = s.nextInt();

		switch (age) {
			case 18:
				System.out.println("You have to wait for one year");
				break;
			case 1:
				System.out.println("I dont know");
				break;
			default:
				System.out.println("This is the default");	
		}

		

	}
}