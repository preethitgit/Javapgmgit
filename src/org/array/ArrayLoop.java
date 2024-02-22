package org.array;

public class ArrayLoop {
public static void main(String[] args) {	
	int sum=0;
	int num1[]= {1,2,3,4,5,6,7};
	int average = 0;
	//normal for loop
	System.out.println("Normal for loop");
	for (int i = 0; i < num1.length; i++) {
		sum = sum + num1[i];
		 average = sum/7;
	}
	
	System.out.println("sum of array" +sum);	
	System.out.println("average of array" +average);
}
}
