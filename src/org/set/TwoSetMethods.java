package org.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TwoSetMethods {
	public static void main(String[] args) {
		Set<Integer> s =new HashSet<Integer>();
		Set<Integer> s1 =new TreeSet<Integer>();
		
		s.add(10);
		s.add(25);
		s.add(42);
		s.add(22);
		s.add(16);
		s.add(32);
		
		System.out.println(s);
		
		s1.add(5);
		s1.add(25);
		s1.add(15);
		s1.add(12);
		s1.add(20);
		s1.add(46);
		s1.add(82);
		System.out.println(s1);
		
		boolean same = s.equals(s1);
		System.out.println(same);//checks whether 2 sets have equal values
		boolean q = s.retainAll(s1);//displays similar values of 2 sets
		System.out.println(q);
		
		
		
		
	}
}
