package javaCollection;

import java.util.Arrays;
import java.util.TreeSet;

public class Day9Programe 
{
//	arr = {1,3,5,2,6,8,5,0}
	
	public static void main(String[] args) 
	{	
		int [] arr={1,3,5,2,6,8,5,0};
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			ts.add(arr[i]);
		}
		
	//	System.out.println(ts);
		
		Integer arr2[]=new Integer[ts.size()];
		int i=0;
		for(Integer dd:ts)
		{
			arr2[i]=dd;
			i++;
		}
		//System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		
	}
}
