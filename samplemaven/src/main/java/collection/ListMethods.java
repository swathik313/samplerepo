package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {

		List <String> s= new ArrayList <String> (); //generic list using list interface
		
		//add method is used to add elemens in to a List
		
		s.add("Orange");
		s.add("Apple");
		s.add("Grape");
		s.add("Orange");
		s.add("Pineapple");
		
		System.out.println(s);
		
		//get method is used to get a particular element using index
		
		System.out.println(s.get(4));
		
		//set method is used to set a new value
		
		s.set(2, "Apple");
		System.out.println(s);
		
		//indexof is used to find the first occurrence of an element
		
		System.out.println(s.indexOf("Orange"));
		
		//lastindexof is used to find the last occurance of an element
		
		System.out.println(s.lastIndexOf("Orange"));
		
		System.out.println(s.indexOf("Pineapple"));
		
		System.out.println(s.lastIndexOf("Pineapple"));
		
		//remove method is used to remove an element at the specified index,we can remove the elements either by index or value
		
		s.remove(2);
		
		System.out.println(s);
		
		s.remove("Orange");
		System.out.println(s);
		
		
		//contains method is used to check whether a given element is present or not in the list , result will be boolean
		
		
		System.out.println(s.contains("Grapes"));
		
		//isempty method is used to check whether the list is empty or not
		
		System.out.println(s.isEmpty());
		
		//size method is used to find the size of the list
		
		System.out.println(s.size());
		
		

		
		
	}

}
