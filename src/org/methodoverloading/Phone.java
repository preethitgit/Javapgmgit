package org.methodoverloading;

public class Phone {
private void phoneInfo() {
	System.out.println("PhoneInfo");
}
private void phoneInfo(int year) {
	System.out.println("Phone Year: " +year);
}
private void phoneInfo(String name) {
	System.out.println("Phone Name: " +name);
}
private void phoneInfo(float size,double d) {
	System.out.println("Phone Size: " +size);
	System.out.println("Phone Width: " +d);
}
private void phoneInfo(int storage,String OS) {
	System.out.println("Phone Storage: " + storage);
	System.out.println("Phone OS: " +OS);
}
public static void main(String[] args) {
	Phone p=new Phone();
	p.phoneInfo();
	p.phoneInfo(2023);
	p.phoneInfo("OnePlus");
	p.phoneInfo(54.64595f, 1.8485246546464);
	p.phoneInfo(12, "abcd");
}
}
