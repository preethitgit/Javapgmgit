package org.abstractclass;

public class Ktm implements Bike {

	@Override
	public void cost() {
	System.out.println("Cost is 75000000");	
		
	}

	@Override
	public void speed() {
		System.out.println("speed is 120km");
		
	}
public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
}
}
