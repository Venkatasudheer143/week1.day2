package week1.day2;

public class MyMobile {

	public float amps=12.4f;
	public String brand_Name = "Samsung";
	
	public void makeCalls() {
		System.out.println("Make calls");
	}
	public void sendMsgs() {
		System.out.println("Send SMS");

	}
	private void paybill() {
		System.out.println("Pay Bills");

	}
	public static void main(String[] args) {
		
		MyMobile samsung = new MyMobile();
		
		System.out.println("Amps: "+samsung.amps);
		System.out.println("Brand Name: "+samsung.brand_Name);
		
		samsung.makeCalls();
		samsung.sendMsgs();
		samsung.paybill();
		

	}

}
