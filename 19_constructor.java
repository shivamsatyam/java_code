
class Main{
	public static void main(String[] args) {
		Employee shivam = new Employee(56,"Shivam");
		Employee satyam = new Employee(56,"Shivam",435345);
		
		shivam.getData();
		satyam.getData();

	}
}

class Employee{
	private int id;
	private String name;
	private int salary;

	public Employee(int a,String b){
		id = a;
		name = b;
	}

	public Employee(){

	}

	public Employee(int a,String b,int c){
		id = a;
		name = b;
		salary = c;
	}

	public void getData(){
		System.out.printf("The id is %d ans the name is %s\n",id,name);
	}
}
