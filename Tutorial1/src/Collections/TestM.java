package Collections;

import java.util.HashMap;
import java.util.Map;

public class TestM {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(5,"5");
		map.put(6,"six");
		map.put(7,"7");
		map.put(8,"8");
		map.put(9,"9");
		map.put(6,"Hello");
		map.put(100,"Hello");
		
		String text = map.get(6);
		System.out.println(text);
		
		for(Map.Entry<Integer, String>entry : map.entrySet())
		{
			int key=entry.getKey();	
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
}
	