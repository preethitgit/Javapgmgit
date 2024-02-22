package org.stringtypes;

public class ImmutableMutable {
public static void main(String[] args) {
	
	//Immutable String
	
	String s1="Preethi";
	String s2="Thillaivelu";
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	
	 s1 = s1.concat(s2);//concat joins two strings
	 System.out.println(s1);
	 
	 System.out.println(System.identityHashCode(s1));
	 
	//Mutable String
	 StringBuffer s3=new StringBuffer("Preethi");
	 StringBuffer s4=new StringBuffer("Thillaivelu");
	 
	 System.out.println(System.identityHashCode(s3));
	 System.out.println(System.identityHashCode(s4));
	 
	  s3 = s3.append(s4);//append joins two strings
	  System.out.println(s3);
	  
	  System.out.println(System.identityHashCode(s3));
}

	
	
}
