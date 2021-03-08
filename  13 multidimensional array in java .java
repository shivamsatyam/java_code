import java.util.Scanner;


class Main{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		

		System.out.println("Enter the value of no of row");
		int row = s.nextInt();
		System.out.println("Enter the value of no of column");
		int column = s.nextInt();

	int [][] marks =  new int [row][column];

		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.printf("Enter the value of %d row and %d column",i,j);
				marks[i][j] = s.nextInt();
			}
		}



		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.printf("%d ",marks[i][j]);
			}
			System.out.println("");
		}



	}
}


















































