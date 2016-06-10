package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestS {

	public static void main(String[] args) {

		// Set does not retain any order and duplicates are not allowed
		// Set<String> hashset = new HashSet<String>();

		// linked hashset maintains the order
		// Set<String> hashset = new LinkedHashSet<String>();

		// tree set arranges in natural order (strings : alpha , int :
		// ascending)
		Set<Integer> hashset = new TreeSet<Integer>();

		hashset.add(1000);
		hashset.add(0);
		hashset.add(5);
		hashset.add(8);
		hashset.add(8);
		hashset.add(9);
		hashset.add(10000);
		hashset.add(8888);
		// System.out.println("*************Hashset*************"+hashset);
		// System.out.println("*************LinkedHashset*************"+hashset);
		// System.out.println("*************TreeHashset*************"+hashset);

		for (Integer element : hashset) {
			System.out.println(element);
		}

		if (hashset.contains(1000)) {
			System.out.println("Contains 1000");
		}
		Set<Integer> hashset1 = new TreeSet<Integer>(hashset);
		hashset1.add(0);
		hashset1.add(8);
		hashset1.add(8);
		hashset1.add(9);
		hashset1.retainAll(hashset);
		System.out.println(hashset1);

	}

}
