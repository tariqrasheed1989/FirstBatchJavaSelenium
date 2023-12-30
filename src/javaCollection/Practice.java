package javaCollection;

import java.util.Arrays;
import java.util.HashSet;

public class Practice 
{
	public static void main(String[] args) 
	{
		HashSet<Integer>al=new HashSet();
		al.add(1);
		al.add(5);
		al.add(7);
		al.add(2);
		al.add(18);
		al.add(15);
		al.add(17);
		al.add(21);
		al.add(18);
		
//		Integer arr[]=al.toArray(new Integer[0]);
//		
//		System.out.println(Arrays.toString(arr));
		int arr[] = new int[al.size()];
		int i=0;
		for(int hs:al)
		{
			arr[i]=hs;
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
