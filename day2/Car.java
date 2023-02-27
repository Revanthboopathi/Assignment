package week2.day2;

public class Car {
	
	public void hub() {
		System.out.println("hub");
	}
	public void wheel() {
		System.out.println("wheel");
	}
	public void door() {
		System.out.println("door");
	}
	public void handle() {
		System.out.println("handle");
	}
	public void seat() {
		System.out.println("seat");
	}
	public void steeringWheel() {
		System.out.println("steeringWheel");
	}
	public void clutch() {
		System.out.println("clutch");
	}
	public void brake() {
		System.out.println("brake");
	}
	public void accelarator() {
		System.out.println("accelarator");
	}
	
	public static void main(String[] args) {
		
		Car accessories=new Car();
		accessories.hub();
		accessories.wheel();
		accessories.door();
		accessories.handle();
		accessories.seat();
		accessories.steeringWheel();
		accessories.clutch();
		accessories.brake();
		accessories.accelarator();
	}

}
