

public class Main{
	public static void main(String[] args) {
		System.out.println("");
	
		C1 a = new C1();
		a.method();

	}
}

//Modifer class   package subclass world

// PUBLIC        Y   Y     Y  Y  
// PROTECTED     Y   Y     Y  N
// DEFAULT       Y   Y     N  N
// PRIVATE       Y   N     N  N



class C1{
	public int x = 4;
	protected int y = 435;                             
	default int z = 45345;
	private int a = 56;

	public void method(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}


}
