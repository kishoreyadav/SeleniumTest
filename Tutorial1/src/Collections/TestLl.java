package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLl {
	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		doTimings("ArrayList",arraylist);
		doTimings("LinkedList",linkedlist);
	}

	
	private static void doTimings(String type, List<Integer> list)
	{
		for(int i=0;i<1E5;i++)
		{
			list.add(i);
			//System.out.println(i);
		}
		long start = System.currentTimeMillis();
		
		/*
		//add items at end of the list AL is better
		for(int i=0;i<1E5;i++)
		{
			list.add(i);
		}
		*/
		
		//add items at the beginning of the list LL is better
		for(int i=0;i<1E5;i++)
		{
			list.add(5,i);
		}
		System.out.println("Size of the list is " + list.size());
		long end = System.currentTimeMillis();
		System.out.println("Time taken to add numbers " + (end-start) + "ms for " + type);
	}
}
