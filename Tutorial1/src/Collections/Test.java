package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding 
		numbers.add(10);
		numbers.add(50);
		numbers.add(100);
		//System.out.println(numbers.get(0));
		
		//Retrieving 
		for(Integer num :numbers)
		{
			System.out.println(num);
		}
		
		System.out.println(numbers.size());
		boolean value =numbers.isEmpty();
		System.out.println(value);
		//numbers.remove(1);
	
		
		
	}

}
