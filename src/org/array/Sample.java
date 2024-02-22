package org.array;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		//To Find 2nd largest value by sorting array
		int a[]= {10,30,5,7,15};
		Arrays.sort(a);//ascending order 5,7,10,15,30
		System.out.println(a[a.length-2]);
		////To Find 2nd largest value by sorting array using for loop
	//	int temp;
		//for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if (a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//					
//				}
//				
//			}
//		}
//		System.out.println(a[a.length-2]);
	}
}
