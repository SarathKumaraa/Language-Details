package org.bank;

public class BankInfo extends AxisBank {
	
	public void saving() {
		System.out.println("Savings account");
	}
	
		
		public void fixed() {
			System.out.println("Fixed");
			
		}
		
		public static void main(String[] args) {
			
			BankInfo sa= new BankInfo();
			
			sa.fixed();
			sa.saving();
			sa.Deposit();
			
			
			
	
		
		
		
		
	}

}
