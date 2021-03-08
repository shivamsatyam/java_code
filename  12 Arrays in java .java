import java.util.Scanner;



class Main{
	public static void main(String[] args) {
		System.out.println("Enter the value of the array");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] marks = new int [size];



		for (int i=0; i<size; i++) {
			System.out.printf("Enter the value of %d element",i+1);
			marks[i] = s.nextInt();		
		}

		for (int i=0; i<size; i++) {
			System.out.printf("%d ",marks[i]);
				
		}

		System.out.println("\nDisplaying the other way\n");

		for (int element : marks) {
				System.out.printf("%d ",element);
		}

	}
}