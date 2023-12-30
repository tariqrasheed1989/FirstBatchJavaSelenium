package javaCollection;

import java.util.Arrays;
import java.util.TreeSet;

public class Day7TreeSet 
{
	public static void main(String[] args) 
	{
		//{7,3,5,9,1,2,7}
		int []arr={7,3,5,9,1,2,7};
		
		TreeSet<Integer>treeSet=new TreeSet();
		for(int num:arr)
		{
			treeSet.add(num);
		}
		System.out.println(treeSet);
		Integer[] sortedArr=treeSet.toArray(new Integer[0]);
		System.out.println(Arrays.toString(sortedArr));
	}
}
