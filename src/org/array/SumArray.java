package org.array;

public class SumArray {
public static void main(String[] args) {
	int a= 2457;
	String num = Integer.toString(a);
	
	char[] ch = num.toCharArray();
	int sum;
	for(int i =0; i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			sum= Integer.parseInt(String.valueOf(ch[i]))+Integer.parseInt(String.valueOf(ch[j]));
			
			
			if(sum==9) {
				System.out.println(Integer.parseInt(String.valueOf(ch[i]))+" "+Integer.parseInt(String.valueOf(ch[j])));
			}
		
		}
	}
}
}
