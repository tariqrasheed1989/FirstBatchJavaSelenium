package EveningBatch630;

import java.util.ArrayList;

public class CollectionMethods 
{
	
	CollectionMethods()
	{
		System.out.println("Hi I am constructor");
	}
	CollectionMethods(String name)
	{
		System.out.println("Hi "+name+"! I am constructor");
	}
	
	CollectionMethods(String name, int num)
	{
		System.out.println("Hi "+name+"! I am constructor");
	}
	public static void main(String[] args) 
	{
		//CollectionMethods ob=new CollectionMethods("Sunil",4);	
		ArrayList li=new ArrayList();
		li.add(3);
		li.add(2);
		li.add(1);
		
		ArrayList<Object> al=new ArrayList();//1,2,3,4,5,6,7,8,9,0=10 Garbage collector
		//1,2,3,4,5,6,7,8,9,0,11,23 =20
		
		al.add(12);//0
		al.add(5);
		al.add(7);
		al.add(null);
		al.add(7);
		al.add(null);
		al.addAll(li);
		al.add("India");
		al.add('%');
		al.add(5.7f);
		System.out.println(al);
//		System.out.println(al.get(4));
//		al.remove(3);
//		System.out.println(al);
//		al.remove("India");
//		System.out.println(al);
//		System.out.println(al.get(4));
//		al.removeAll(li);
//		System.out.println(al);
		System.out.println(al.contains("India"));
//		al.clear();
//		System.out.println(al);
		System.out.println("Index: "+al.indexOf("India"));
		System.out.println("Size: "+al.size());
		//for(int i=0;i<al.size();i++)
		al.set(2, "China");
		System.out.println(al);
		al.add(2, "Up");
		System.out.println(al);
		
	
		
		
	}

}
