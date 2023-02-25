package week1.day2;

public class twowheeler{
	
	String bikeName="Jawa42";
	Short noOfIndicators=04;
	int noOfLockset=04;
	long engineNumber=8220585268l;
	double price=300000.00;
	boolean isInjector=true;
	
	public static void main(String[] args) {
		
		twowheeler Jawa42 =new twowheeler();
		
		System.out.println(Jawa42.bikeName);
		System.out.println("noOfIndicators"+Jawa42.noOfIndicators);
		System.out.println("noOfLockset"+Jawa42.noOfLockset);
		System.out.println("engineNumber"+Jawa42.engineNumber);
		System.out.println("price"+Jawa42.price);
		System.out.println("Injector"+Jawa42.isInjector);
	}
	
	
}

