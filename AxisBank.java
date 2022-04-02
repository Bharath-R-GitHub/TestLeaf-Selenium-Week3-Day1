package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit method in the AxisBank Class has been Executed");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
	}
}
