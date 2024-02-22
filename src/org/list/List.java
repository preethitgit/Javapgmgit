package org.list;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class List {
public static void main(String[] args) {
// Adding set values to list
	 ArrayList<Integer> li = new ArrayList<Integer>();
	 Set<Integer> s=new TreeSet<Integer>();
	 
	 li.add(50);
	 li.add(20);
	 li.add(10);
	 li.add(30);
	 li.add(40);
	 s.add(1);
	 s.add(3);
	 
	 
	 System.out.println(li);
	 System.out.println(s);
	
	 li.addAll(s);
	 
	 System.out.println(li);
	 System.out.println(s);
}
}
