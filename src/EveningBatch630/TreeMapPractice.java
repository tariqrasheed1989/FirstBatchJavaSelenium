package EveningBatch630;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPractice 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String>map=new TreeMap<Integer, String>();
		map.put(1, "Cat");
		map.put(4, "Dog");
		map.put(2, "Elephant");
		map.put(3, "Fish");
		map.put(5, "Fox");
		map.put(8, null);
		map.put(7, "Parrot");
		System.out.println(map);
		map.putIfAbsent(7, "Parrots");
		System.out.println(map);
		
		Set<Entry<Integer, String>> m=map.entrySet();
		for(Entry<Integer, String> x:m)
		{
			//System.out.println(x);
			System.out.println(x.getValue()+", "+x.getKey());
		}
	}

}

