package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		String companyName ="google";
		char[] ch = companyName.toCharArray();
		
		Set<Character> unique = new HashSet<Character>();
		for(int i=0; i<ch.length;i++)
		{
			unique.add(ch[i]);			
		}
		System.out.println(unique);
		
	}

}
