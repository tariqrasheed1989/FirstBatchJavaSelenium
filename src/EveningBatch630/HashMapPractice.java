package EveningBatch630;

import java.util.*;
import java.util.Map.Entry;

public class HashMapPractice 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Sumit");
		hm.put(2, "Anil");
		hm.put(3, "Anil Kumar");
		hm.put(4, "Anil Sharma");
		hm.put(5, "Sumit");
		hm.put(null,null);
		
//		System.out.println(hm);
//		System.out.println(hm.get(4));
	
		HashMap<String, Integer> newHm=new HashMap<String, Integer>();
		newHm.put("One", 1);
		newHm.put("two", 2);
		newHm.put("Three", 3);
		newHm.put("Four", 4);
		
		System.out.println(newHm);
//		System.out.println(newHm.get("One"));	
//		System.out.println(newHm.get("two"));
		
//		newHm.remove("Three");
//		hm.remove(3);
		System.out.println("Value Removed: "+hm.remove(3));
		System.out.println(hm);
//		System.out.println(newHm);
//		System.out.println(hm);
		
//		newHm.remove("Four", 4);
//		System.out.println(newHm);
		
		HashMap<String, Integer> color=new HashMap<String, Integer>();
		color.put("Red", 1);
		color.put("Green", 2);
		color.put("yellow", 3);
		color.put("Pink", 4);
		color.put("Blue", 5);
		color.put("Orange", 1);
		color.put("Orange", 4);
		color.put("Pink", 4);
		
		System.out.println(color);
		
//		Set<String>colorKeys =color.keySet();		
//		System.out.println(colorKeys);
//		for(String c:colorKeys)
//		{
//			System.out.println(c);
//		}
//		
//		System.out.println(color.values());
//		
//		Collection<Integer> li=color.values();
//		for(Integer x:li)
//		{
//			System.out.println(x);
//		}
//		
//		Set<Entry<String,Integer>> entry=color.entrySet();
//		
//		for(Entry s:entry)
//		{
//			System.out.println(s);
//		}
		
		
//		Set<Integer>number=hm.keySet();
//		System.out.println(number);
		
		
//		for(Entry<String, Integer> e:color.entrySet())//Red=1, Pink=4
//		{
//			String key=e.getKey();
//			int value=e.getValue();
//			System.out.println("Key :"+key+", Value :"+value);
//			
//		}
		for(String s:color.keySet())
		{
			System.out.println("Keys :"+s+", Value: "+color.get(s));
		}

		//-------------Constructor--------------
		
		//HashMap Default capacity is 16 elements, entries 8
		
//		HashMap<String, String>Capitals=new HashMap(20);
		
		HashMap<String, String>Caps=new HashMap<String, String>();
		Caps.put("1", "One");
		Caps.put("2", "two");
		Caps.put("3", "three");
		
		
		HashMap<String, String>Capitals=new HashMap<String, String>(10,0.5f);
		
	}

}
