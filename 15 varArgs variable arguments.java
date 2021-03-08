import java.util.Scanner;

class Main{


	int varArgs(int ...arr){
		// passed as int [] arr

		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum=sum+ arr[i];
		}

		return sum;
	}


	static void parametarizedVarArgs(int a,int ...arr){
		System.out.printf("the value of a is %d \n",a);

		for(int i=0;i<arr.length;i++){
			System.out.printf("%d ",arr[i]);	

		}	
		System.out.printf(" \n");	


	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Main m = new Main();

		int result = m.varArgs(423,4,234,23,4,324,3,24,23,4,234,23,4,23,42,34,23,423,4);
		System.out.printf("the result is %d\n",result);	

		parametarizedVarArgs(4);	
		parametarizedVarArgs(4,454,654,654,654,6);	


	}
}