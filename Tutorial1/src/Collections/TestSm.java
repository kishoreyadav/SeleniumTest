package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.jetty.http.PathMap.MappedEntry;

public class TestSm {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		LinkedHashMap<Integer,String> linkedmap = new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> treemap = new TreeMap<Integer,String>();
		System.out.println("***********************HashMap*****************************");
		testMap(hashmap);
		System.out.println("***********************linkedmap***************************");
		testMap(linkedmap);
		System.out.println("***********************treemap*****************************");
		testMap(treemap);
		
	}
	
	public static void testMap(Map<Integer,String> map)
	{
		map.put(9,"Ki");
		map.put(4,"Kis");
		map.put(8,"Kish");
		map.put(1,"Kisho");
		map.put(0,"Kishor");
		map.put(15,"Kishore");
		map.put(16,"Yadav");
		
		for(Integer key: map.keySet() )
		{
			String value = map.get(key);
			
			System.out.println(key + " : " + value);
		}
	}
	
	

}
