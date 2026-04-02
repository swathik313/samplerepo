package collection;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoop {

	public static void main(String[] args) {

		
		int arr[]= {1,2,3,4,5};
		
		
		//normal for loop
		
	
		
		//for(data_type variable_name : array/collection name)

		for(int a : arr) {
			
			System.out.println(a);
		}
		
		Set <String> s= new HashSet <String>();
		s.add("apple");
		s.add("orange");
		s.add("grapes");
		
		for(String s1 :s) {
			
			System.out.println(s1);
		}
		
	}

}
