package org.stringtypes;

public class StringTypes {
public static void main(String[] args) {
	//Literal String
	String s1 ="java";
	String s2="java";
	
	System.out.println("Literal String");
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	
	//Non-Literal String
	String s3=new String("Selenium");
	String s4=new String("Selenium");
	System.out.println("Non-Literal String");
	System.out.println(System.identityHashCode(s3));
	System.out.println(System.identityHashCode(s4));
	
	
}
}
