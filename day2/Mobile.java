package week1.day2;

public class Mobile {
	String BrandName="sony xperia";
	Short Weight=170;
	int noofcameras=03;
	long buildno=8220585268l;
	float price=23000.00f;
	boolean acceptation5g=true;
	
	public static void main(String[] args) {
		
		Mobile sonyXperia=new Mobile();
		
		System.out.println(sonyXperia.BrandName);
		System.out.println("Weight"+sonyXperia.Weight);
		System.out.println("noofcameras"+sonyXperia.noofcameras);
		System.out.println("buildno"+sonyXperia.buildno);
		System.out.println("price"+sonyXperia.price);
		System.out.println("acceptation5g"+sonyXperia.acceptation5g);
	}
	
	
}