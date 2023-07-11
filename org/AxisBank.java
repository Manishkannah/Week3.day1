package week3.org;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposite fromn axis");
	}
	public static void main(String[] args) {
		AxisBank axb = new AxisBank();
		axb.deposit();
		axb.fixed();
		
		BankInfo bi = new BankInfo();
		bi.deposit();
		
		
	}
	
	
	

}
