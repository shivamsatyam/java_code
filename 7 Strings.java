import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		System.out.println("the is a \t \' quote \'");
		Scanner s = new Scanner(System.in);
  		
		System.out.printf("Enter the value of the string\n");
		
		//String a = s.next(); //This will take the string before white space
		
		String a = s.nextLine();
		
		System.out.println(a);
		
		//Function of string in java

		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.trim());
		System.out.println(a.substring(0,9));
		String replace = a.replace('a','b');

}}		

