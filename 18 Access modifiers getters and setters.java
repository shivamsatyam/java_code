

class Employee{
	int id;
	String name;

	public void setData(int a,String names){
		id = a;
		name = names;
	}


	public void getData(){
		System.out.printf("the id is %d and the name is %s",id,name);	
		
	}
}



class Main{
	public static void main(String[] args) {
		System.out.println("dfd");
		Employee shivam = new Employee();
		shivam.setData(4,"Shivam");
		shivam.getData();
	}
}








