package javaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Day8_Map 
{
	public static void main(String[] args) 
	{
	
		HashMap<Integer, String>map=new HashMap();
		map.put(101, "Abc");//entry
		map.put(102, "def");
		map.put(103, "String");
		map.put(104, "jkl");
		
		
		System.out.println(map.get(103));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
		//retrieve one by one method 1
//		for(Entry<Integer, String> entry:map.entrySet())
//		{//101->Abc
//			System.out.println(entry.getKey()+"->"+entry.getValue());
//		}
		
//for keys
		for(Integer mm:map.keySet())
		{
			System.out.println(mm);
		}
//for values
		for(String ss:map.values())
		{
			System.out.println(ss);
		}
//require data format 101=>abc
		for(Integer nn:map.keySet())
		{
			System.out.println(nn+"=>"+map.get(nn));
		}
		
//		
//		System.out.println(map.size());
//		System.out.println(map);
////		map.clear();
////		System.out.println(map);
////		System.out.println(map.containsKey(109));
////		System.out.println(map.containsValue("Abc"));
////		System.out.println(map.get(103));
//		
//		Map map2=new HashMap();
//		map2.put(1, "A");
//		map2.put(2, "d");
//		map2.put(3, "g");
//		map2.put(107, "j");
//		
//		map.putAll(map2);
//		System.out.println(map);
//		System.out.println(map.size());
//		map.replace(101, null);
//		System.out.println(map);
//	
//		
//		map.put(104, "Deepak");
//		System.out.println(map);
	}
}
