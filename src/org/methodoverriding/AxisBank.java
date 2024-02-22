package org.methodoverriding;

public class AxisBank extends BankInfo{
	//override displays only the axisbank deposit method by removing super keyword
@Override
public void deposit() {
	System.out.println("deposit - 8%");
	//super keyword displays both classes which has same method names
	super.deposit();
}
public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.deposit();
}
}
