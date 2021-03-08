import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		boolean a = (6==6);
		System.out.println(a);

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the value of age");
		int age = s.nextInt();

		if(age>18){
			System.out.println("you are elegible to vote");
		}else if(age==18){
		System.out.println("You have to wait for one year");
		}else{
			System.out.println("You have no coting right");
		}



		


	}
}