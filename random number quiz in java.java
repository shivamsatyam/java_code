import java.util.Scanner;
import java.util.Random;


class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("there are only ten attemps\n");
		
			Random rand = new Random();
			// int random_number = rand.nextInt(11); // for printing the random number
			// System.out.printf("%d \n",random_number);
		for(int i=0;i<10;i++){

			int number = s.nextInt();

			if(number==random_number){
				System.out.printf("You wan in %d attemps\n",i+1);
				break;
			}else if(number>random_number){
				System.out.printf("The guess no is too big\n");
			}else if(number<random_number){
				System.out.printf("the guess no is too small\n");
			}

			else{
				System.out.printf("Invalid character\n");
				break;
			}

		}

	}
}






































