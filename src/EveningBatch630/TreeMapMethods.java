package EveningBatch630;

import java.util.TreeMap;

public class TreeMapMethods 
{
	public static void main(String[] args) 
	{
		TreeMap<String, Integer> OtherCricketers=new TreeMap<String,Integer>();
		OtherCricketers.put("Warner", 88);
		OtherCricketers.put("Dviliors", 45);
		OtherCricketers.put("Stayn", 01);
		
	
		TreeMap<String, Integer> Cricketer=new TreeMap<String, Integer>();
		Cricketer.put("Virat Kohli", 102);
		Cricketer.put("Rohit Sharma", 35);
		Cricketer.putAll(OtherCricketers);
		Cricketer.put("Hardik Pandya", 68);
		Cricketer.put("Dinesh Kartik", 56);
		Cricketer.put("K L Rahul", 120);
		
//		int run=Cricketer.get("K L Rahul");
//		
//		System.out.println(run);
		System.out.println(Cricketer);
//		Cricketer.remove("Virat Kohli");
//		System.out.println("After Virat removal: "+Cricketer);
//		Cricketer.remove("Warner", 88);
//		System.out.println(Cricketer);
		
//		Cricketer.replace("Rohit Sharma", 135);
//		System.out.println(Cricketer);
//		System.out.println(Cricketer.get("Rohit Sharma"));
		
//		Cricketer.replace("K L Rahul", 120, 20);
//		System.out.println("K L Rahul made :"+Cricketer.get("K L Rahul"));
		
//		Cricketer.replaceAll((key, oldvalue)->oldvalue-2);
//		System.out.println(Cricketer);
		
//		System.out.println(Cricketer.firstKey());
//		System.out.println(Cricketer.firstEntry());
//		System.out.println(Cricketer.lastKey());
//		System.out.println(Cricketer.lastEntry());
//		Cricketer.remove("Warner");
//		System.out.println(Cricketer.lastEntry());
		
		System.out.println(Cricketer.higherKey("Hardik Pandya"));
		System.out.println(Cricketer.higherEntry("Hardik Pandya"));
		System.out.println(Cricketer.lowerKey("Hardik Pandya"));
		System.out.println(Cricketer.ceilingKey("Rohit Sharmaa"));
		System.out.println(Cricketer.floorKey("Virat Kohli"));
		
		Cricketer.pollFirstEntry();
		System.out.println(Cricketer);
		Cricketer.pollLastEntry();
		System.out.println(Cricketer);
		
		System.out.println(Cricketer.containsKey("Virat Kohli"));
		System.out.println(Cricketer.containsValue(56));
		System.out.println(Cricketer.size());
		Cricketer.clear();
		System.out.println(Cricketer);
				
	}

}
