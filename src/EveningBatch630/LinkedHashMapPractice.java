package EveningBatch630;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String, Integer> evenNumber=new LinkedHashMap<String, Integer>();
		evenNumber.put("Two", 2);
		evenNumber.put("Four", 4);
		evenNumber.put("Six", 6);
//		System.out.println(evenNumber);
		
		LinkedHashMap<String, Integer> oddNumber=new LinkedHashMap<String, Integer>();
		oddNumber.put("One", 1);
		oddNumber.putAll(evenNumber);
		oddNumber.put("Three", 3);
		oddNumber.put("Five", 5);
		oddNumber.putIfAbsent("Two", 2);
		System.out.println(oddNumber.getOrDefault("Five", 51));
		System.out.println(oddNumber.containsKey("Threee"));
		System.out.println(oddNumber.containsValue(5));
		System.out.println(oddNumber.size());
		
		System.out.println(oddNumber);
		oddNumber.clear();
		
		if(oddNumber.isEmpty())
		{
			System.out.println("Do nothing");
		}
		else
		{
			oddNumber.clear();
			System.out.println("Khali kar dia");
		}
		
	}

}
