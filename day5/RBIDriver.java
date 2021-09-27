package day5;

public class RBIDriver {
	public static void main(String[] args) {
		RBI b =new SBI();
		System.out.println("Rate of Interest is:"+b.rateOfInterest());
		
		RBI b1 = new HDFC();
		System.out.println("Rate of Interest is :"+b1.rateOfInterest());
	}

}
