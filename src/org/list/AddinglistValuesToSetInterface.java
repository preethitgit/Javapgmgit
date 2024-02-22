package org.list;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class AddinglistValuesToSetInterface {
	public static void main(String[] args) {
		// Adding List values to set
			 ArrayList<Integer> li = new ArrayList<Integer>();
			 Set<Integer> s=new TreeSet<Integer>();
			 
			 li.add(50);
			 li.add(20);
			 li.add(10);
			 li.add(30);
			 li.add(40);
			 
			 
			 s.add(5);
			 s.add(15);
			 
			 
			 System.out.println(li);
			 System.out.println(s);
			
			 s.addAll(li);
			 
			 System.out.println(li);
			 System.out.println(s);
		}
}
