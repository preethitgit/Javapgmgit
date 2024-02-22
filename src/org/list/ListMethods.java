package org.list;

import java.util.ArrayList;

public class ListMethods {
	public static void main(String[] args) {
		//List methods
			 ArrayList<Integer> li = new ArrayList<Integer>();
			
			 li.add(50);//index0
			 li.add(20);//1
			 li.add(10);//2
			 li.add(30);//3
			 li.add(null);//4
			 System.out.println(li);
			 Integer getindexvalue = li.get(2);
			 System.out.println(getindexvalue);
			 int indexOf = li.indexOf(10);
			 System.out.println(indexOf);
			 int lastIndexOf = li.lastIndexOf(10);
			 System.out.println(lastIndexOf);
			 boolean empty = li.isEmpty();
			 System.out.println(empty);
			 li.add(0, 40);
			 System.out.println(li);
			 li.set(1, 5);
			 System.out.println(li);
			 int size = li.size();
			 System.out.println(size);
			 li.remove(3);
			 System.out.println(li);
			 boolean contains = li.contains(null);
			 System.out.println(contains);	 
	}		 
}
