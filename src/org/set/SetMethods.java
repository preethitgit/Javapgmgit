package org.set;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
public static void main(String[] args) {
	Set<Integer> s =new HashSet<Integer>();
	
	s.add(10);
	s.add(25);
	s.add(42);
	s.add(22);
	s.add(16);
	s.add(32);
	
	System.out.println(s);
	System.out.println(s.size());
	s.remove(22);
	s.contains(32);
	
	for (Integer v : s) {
		
		System.out.println(v);
	}
	
}
}
