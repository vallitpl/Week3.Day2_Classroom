package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
public static void main(String[] args) {
	//Print only single occurance numbers -> 3,5
	int[] nums = {1,2,1,3,2,5};
	
	Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
	for(int i=0;i<nums.length;i++)
	{
		if(map.containsKey(nums[i]))
		{
			map.put(nums[i], map.get(nums[i])+1);
		}
		else
		{
			map.put(nums[i], 1);
		}
	}
	System.out.println(map);
	for(Entry<Integer,Integer> entry :map.entrySet())
	{
		if(entry.getValue()==1)
		{
			System.out.println(entry.getKey());
		}
	}
}
}
