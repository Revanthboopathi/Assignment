
package week2.day2;

public class Mobile {
	
	public void chargePort() {
		System.out.println("chargePort");
	}
	public void fingerPrint() {
		System.out.println("fingerPrint");
		
	}
	public void headJack() {
		System.out.println("headJack");
	}
	public void volumeButton() {
		System.out.println("volumeButton");
	}
	public void frontCam() {
		System.out.println("frontCam");
	}
	public void powerButton() {
		System.out.println("powerButton");
	}
	public void speaker() {
		System.out.println("speaker");
	}
	public void ejector() {
		System.out.println("ejector");
	}
	public void simSlot() {
		System.out.println("simSlot");
	}
	
	public static void main(String[] args) {
		
		Mobile spec= new Mobile ();
		spec.chargePort();
		spec.ejector();
		spec.fingerPrint();
		spec.frontCam();
		spec.headJack();
		spec.powerButton();
		spec.simSlot();
		spec.speaker();
		spec.volumeButton();
	}
	

	

	}
	


