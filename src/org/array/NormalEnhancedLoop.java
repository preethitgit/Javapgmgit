package org.array;

public class NormalEnhancedLoop {
	public static void main(String[] args) {
		//syntax for array
		
		int a[] = new int[5];
		
		
		a[0]=10;
		a[2]=30;
		a[1]=20;
		a[3]=40;
		System.out.println(a[2]);
		System.out.println(a.length);
		
		//Normal For Loop
		System.out.println("Normal for loop");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		//Enhanced for loop
		System.out.println("Enhanced for loop");
		for (int i : a) {
			System.out.println(i);
		}
		
	}
}