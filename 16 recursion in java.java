import java.util.Scanner;


class Main{

	static long factorial(int i){
		if(i==1 || i==0){
			return 1;
		}else{
			return i*factorial(i-1);
		}
	}
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);

		System.out.printf("Enter the value whose factorial you wants\n");
		int fac = s.nextInt();

		System.out.printf("the factorial of %d is %d \n",fac,factorial(fac));

	}
}