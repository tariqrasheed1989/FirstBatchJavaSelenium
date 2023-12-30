package EveningBatch630;

import java.util.ArrayList;
import java.util.Vector;

public class vector 
{
	public static void main(String[] args) 
	{
		ArrayList li=new ArrayList();
		li.add("India");
		li.add("China");
		
		
		Vector<String> vector=new Vector<String>(12);
		vector.addElement("Punjab");
		vector.add("Maharashtra");
		vector.add(1,"Goa");
		vector.addAll(li);
		vector.add("Chennai");
		vector.add("Kashmir");
		vector.add("Delhi");
		vector.add("Haryana");
		vector.add("UP");
		vector.add("MP");
//		vector.clear();
		vector.removeAll(li);
		vector.removeElement("UP");
		vector.removeElementAt(3);
//		vector.setElementAt("Kerala", 1);
		
		System.out.println(vector);
		System.out.println("Capacity: "+vector.capacity());
		System.out.println(vector.lastElement());
		System.out.println(vector.firstElement());
		System.out.println(vector.contains("Goa"));
		
		
	}

}
