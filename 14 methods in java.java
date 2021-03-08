import java.util.Scanner;


class Main{
	
	static int add(int a,int b,int c){
		return a + b+c;
	}	

	static int add(int a,int b){
		return a + b;
	}	


	int subtract(int a,int b){
		return a - b;
	}
	
	static void changeArray(int [] arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = i;
		}
	}

	static void print(int [] arr){
		System.out.printf(" \n");	
		for(int i=0;i<arr.length;i++){
			System.out.printf("%d ",arr[i]);	

		}
		System.out.printf(" \n");	

	}

	public static void main(String[] args) {
		System.out.printf("%d\n",add(1,3,2));	
		System.out.printf("%d\n",add(1,2));	
		System.out.printf(" \n");	

		Main a = new Main();
		System.out.printf("the subtract method is %d",a.subtract(6,2));	


		int [] arr = {432,423,4,32,43,24,4,2,23,4,4,23,5,34};
		print(arr);
		changeArray(arr);
		print(arr);



	}
}


















