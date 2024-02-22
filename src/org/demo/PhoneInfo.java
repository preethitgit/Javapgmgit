package org.demo;

public class PhoneInfo {
	private void phoneName() {
System.out.println("Phone Name - One Plus");
	}
	private void phoneCamera() {
	System.out.println("Phone Camera - 8MP");
	}
private void phoneStorage() {
System.out.println("Phone Storage - 256GB");
}
public static void main(String[] args) {
	PhoneInfo p = new PhoneInfo();
	p.phoneName();
	p.phoneCamera();
	p.phoneStorage();
}
}
