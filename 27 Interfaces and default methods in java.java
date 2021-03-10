package com.company;

class Main{
	public static void main(String[] args) {
		MySmartPhone ms = new MySmartPhone();
		String [] n = ms.getNetworks();

		for (String element : n) {
			System.out.printf("%s ",element);
		}
		System.out.println();

		ms.DefaultMethod();


	}
}




interface Camera{
	void takeSnap();
	void recoredVideo();

	private void greet(){System.out.println("Good Morning");}

	default void DefaultMethod(){
		System.out.println("this is an default method");
		greet();
	}
}


interface Wifi{
	String [] getNetworks();

	void connectToNetwork(String network);
}



class MyCellPhone{

	void classNumber(int phoneNumber){
		System.out.println("Calling " + phoneNumber);
	}

	void pickCall(){
		System.out.println("picking the call");
	}
}



class MySmartPhone extends MyCellPhone implements Wifi,Camera{
	public void takeSnap(){
		System.out.println("Taking snap");
	}

	public void recoredVideo(){
		System.out.println("Recording video");
	}

	public String [] getNetworks(){
		System.out.println("Setting the network");
		String[] networkList  ={"Shivam","satyam"};
		return networkList;
	}


	public void connectToNetwork (String s){
		System.out.println("connecting to the network " + s);
	}

	@Override
	public void DefaultMethod(){
		System.out.println("This is an default method of MySmartPhone class");
	}
}
