package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTwoSum {
public static void main(String[] args) {
	int[] nums = {2,4,6,7,11,15};
	int target = 8;
	
	Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
	for(int i=0;i<nums.length;i++)
	{
		map.put(nums[i], null);
	}
}
}
