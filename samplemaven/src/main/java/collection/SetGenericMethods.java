package collection;

import java.util.HashSet;
import java.util.Set;

public class SetGenericMethods {

	public static void main(String[] args) {

		Set <String> s = new HashSet <String>();
		
		//add
		s.add("red");
		s.add("rose");
		
		Set <String> s1 = new HashSet <String>();

		s1.add("green");
		s1.add("blue");
		
		s.addAll(s1); //add all the elements of s1 to s
		
		//contains
		
		System.out.println(s1.contains("blue"));
		
	 //containsall -used to chk whther all the elements of one set is contained in another set
		
		System.out.println(s1.containsAll(s));
		
		
		//isEmpty
		
		System.out.println(s.isEmpty());
		
		//remove
		
		s.remove("red");
		
		//remove all wil remove all elements from one set
		
		s.removeAll(s1);
		
		//size 
		
		System.out.println(s1.size());
		
		//clear
		
				
				
				
		
	}

}
