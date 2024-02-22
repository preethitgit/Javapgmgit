package org.singleinheritance;

public class Computer extends Desktop {
private void computerModel() {
	System.out.println("Computer Model is abcd");
}
public static void main(String[] args) {
	Computer c = new Computer();
	c.computerModel();
	c.desktopSize();
}

}
