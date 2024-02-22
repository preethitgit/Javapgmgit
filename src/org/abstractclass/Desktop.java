package org.abstractclass;

public class Desktop implements Software {
private void desktopModel() {
	System.out.println("abcd");
}
@Override
public void hardwareResources() {
System.out.println("hardware");
	
}
@Override
public void softwareResources() {
	System.out.println("software");
	
}
public static void main(String[] args) {

	Desktop d= new Desktop();
	d.desktopModel();
	d.hardwareResources();
	d.softwareResources();
}
}
