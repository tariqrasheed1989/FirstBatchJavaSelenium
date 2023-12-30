package javaCollection;

import java.util.TreeMap;

public class Day9TreeMap 
{
	public static void main(String[] args) 
	{
		TreeMap tm=new TreeMap();
		tm.put(1, "Sunday");
		tm.put(3, "Monday");
		tm.put(6, "Tuesday");
		tm.put(2, "Wednesday");
		tm.put(4, "Thursday");
		tm.put(5, "Friday");
		tm.put(7, "Saturday");
		
		System.out.println(tm);
		
//		tm.put("a", "Sunday");
//		tm.put("c", "Monday");
//		tm.put("d", "Tuesday");
//		tm.put("g", "Wednesday");
//		tm.put("b", "Thursday");
//		tm.put("e", "Friday");
//		tm.put("k", "Saturday");
		
//		System.out.println(tm);
		
		System.out.println(tm.ceilingEntry(8));
		System.out.println(tm.ceilingKey(8));
		System.out.println(tm.firstKey());
		System.out.println(tm.firstEntry());
		System.out.println(tm.floorKey(10));
		System.out.println(tm.floorEntry(10));
		System.out.println(tm.headMap(9));
		System.out.println(tm.higherKey(2));
		System.out.println(tm.higherEntry(3));
	//	tm.pollFirstEntry();
		System.out.println(tm);
	//	tm.pollLastEntry();
		System.out.println(tm);
		
		System.out.println(tm.subMap(2, 5));
		
	}
}
