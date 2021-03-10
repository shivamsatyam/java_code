import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Employee shivam = new Employee();
		shivam.setdata(4,"Shivam",45);
		shivam.getdata();
	}
}

class Employee{
	int id;
	String name;
	int salary;

	public void getdata(){
		System.out.printf("the id is %d the name is %s and the salary is %d\n",id,name,salary);
	}

	public void setdata(int a,String b,int c){
		id = a;
		name = b;
		salary = c;
	}
}

