package EveningBatch630;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionsClass 
{
	public static void main(String[] args) 
	{
		ArrayList li=new ArrayList();
		li.add(5);
		li.add(23);
		li.add(12);
		li.add(88);
		li.add(54);
		li.add(99);
		
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		Collections.shuffle(li);
		System.out.println(li);
		System.out.println(Collections.max(li));
		System.out.println(Collections.min(li));
		
		HashSet hs=new HashSet();
		hs.add("Mouse");
		hs.add("Keyboard");
		hs.add("Pen Drive");
		hs.add("Monitor");
		hs.add("Hard disk");
		
		ArrayList li2=new ArrayList(hs);
		Collections.sort(li2);
		System.out.println(li2);
		Collections.reverse(li2);
		System.out.println(li2);
		
	}

}
